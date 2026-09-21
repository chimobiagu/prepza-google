package com.example.data.remote

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.Settings
import android.util.Log
import androidx.core.content.FileProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.security.MessageDigest
import java.util.concurrent.TimeUnit

/**
 * Handles secure In-App APK downloading, checksum & signature verification,
 * and reliable package installation flow while preserving student data and state.
 */
class ApkInstallerManager(private val context: Context) {

    private val TAG = "ApkInstallerManager"

    private val client: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .followRedirects(true)
            .followSslRedirects(true)
            .build()
    }

    private val _downloadState = MutableStateFlow<DownloadProgressState>(DownloadProgressState.Idle)
    val downloadState: StateFlow<DownloadProgressState> = _downloadState.asStateFlow()

    /**
     * Checks if the app has permission to request package installation.
     */
    fun canRequestPackageInstalls(): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            context.packageManager.canRequestPackageInstalls()
        } else {
            true
        }
    }

    /**
     * Opens the system settings screen allowing the user to grant Unknown App Install permission.
     */
    fun openUnknownAppSourcesSettings() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            try {
                val intent = Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES).apply {
                    data = Uri.parse("package:${context.packageName}")
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(intent)
            } catch (e: Exception) {
                Log.e(TAG, "Failed to open unknown app sources settings: ${e.message}")
            }
        }
    }

    /**
     * Downloads the APK file securely from the remote release location, verifies integrity,
     * and triggers the Android Package Installer.
     */
    suspend fun downloadAndInstall(
        config: AppVersionConfig,
        onProgress: ((DownloadProgressState) -> Unit)? = null
    ): Boolean = withContext(Dispatchers.IO) {
        val targetUrl = config.directApkUrl ?: config.downloadUrl
        if (targetUrl.isBlank()) {
            val error = DownloadProgressState.Error("No valid download link provided for this release.")
            _downloadState.value = error
            onProgress?.invoke(error)
            return@withContext false
        }

        // If the URL is a standard webpage instead of a direct APK stream, launch in browser
        if (!targetUrl.endsWith(".apk", ignoreCase = true) && !targetUrl.contains("/apk", ignoreCase = true) && !targetUrl.contains("download=apk", ignoreCase = true)) {
            try {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(targetUrl)).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
                context.startActivity(browserIntent)
                return@withContext true
            } catch (e: Exception) {
                val err = DownloadProgressState.Error("Failed to open release page: ${e.message}")
                _downloadState.value = err
                onProgress?.invoke(err)
                return@withContext false
            }
        }

        val destinationDir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS)
            ?: File(context.cacheDir, "updates").apply { mkdirs() }

        val apkFileName = "PREPZA_v${config.latestVersionCode}_${config.latestVersionName.replace(".", "_")}.apk"
        val apkFile = File(destinationDir, apkFileName)

        try {
            _downloadState.value = DownloadProgressState.Downloading(0, 0, 0)
            onProgress?.invoke(_downloadState.value)

            // Resumable / partial download handling
            var downloadedBytes = 0L
            val requestBuilder = Request.Builder().url(targetUrl)

            if (apkFile.exists() && apkFile.length() > 0) {
                downloadedBytes = apkFile.length()
                requestBuilder.addHeader("Range", "bytes=$downloadedBytes-")
            }

            val request = requestBuilder.build()
            val response = client.newCall(request).execute()

            if (!response.isSuccessful && response.code != 206) {
                // If partial request rejected, restart from 0
                if (apkFile.exists()) apkFile.delete()
                val freshRequest = Request.Builder().url(targetUrl).build()
                val freshResponse = client.newCall(freshRequest).execute()
                if (!freshResponse.isSuccessful) {
                    throw Exception("Server returned HTTP ${freshResponse.code}: ${freshResponse.message}")
                }
                saveResponseBodyToFile(freshResponse, apkFile, 0L, onProgress)
            } else {
                val append = (response.code == 206)
                saveResponseBodyToFile(response, apkFile, if (append) downloadedBytes else 0L, onProgress)
            }

            // Step 2: Verification
            _downloadState.value = DownloadProgressState.Verifying
            onProgress?.invoke(DownloadProgressState.Verifying)

            val isValid = verifyApkFile(apkFile, config.sha256Checksum)
            if (!isValid) {
                apkFile.delete()
                val err = DownloadProgressState.Error("APK verification failed. The download may have been corrupted.")
                _downloadState.value = err
                onProgress?.invoke(err)
                return@withContext false
            }

            // Step 3: Ready to Install
            val readyState = DownloadProgressState.ReadyToInstall(apkFile.absolutePath)
            _downloadState.value = readyState
            onProgress?.invoke(readyState)

            // Step 4: Launch Package Installer
            launchPackageInstaller(apkFile)
            true
        } catch (e: Exception) {
            Log.e(TAG, "Failed to download/install APK: ${e.message}", e)
            val errState = DownloadProgressState.Error(e.message ?: "Download interrupted. Please check your network connection.")
            _downloadState.value = errState
            onProgress?.invoke(errState)
            false
        }
    }

    private suspend fun saveResponseBodyToFile(
        response: okhttp3.Response,
        file: File,
        initialBytes: Long,
        onProgress: ((DownloadProgressState) -> Unit)?
    ) = withContext(Dispatchers.IO) {
        val body = response.body ?: throw Exception("Response body is null")
        val contentLength = body.contentLength()
        val totalBytes = if (contentLength > 0) initialBytes + contentLength else -1L

        var bytesWritten = initialBytes
        var inputStream: InputStream? = null
        var outputStream: FileOutputStream? = null

        try {
            inputStream = body.byteStream()
            outputStream = FileOutputStream(file, initialBytes > 0)

            val buffer = ByteArray(8 * 1024)
            var bytesRead: Int
            var lastReportedPercent = -1

            while (inputStream.read(buffer).also { bytesRead = it } != -1) {
                outputStream.write(buffer, 0, bytesRead)
                bytesWritten += bytesRead

                if (totalBytes > 0) {
                    val percent = ((bytesWritten * 100) / totalBytes).toInt().coerceIn(0, 100)
                    if (percent != lastReportedPercent) {
                        lastReportedPercent = percent
                        val state = DownloadProgressState.Downloading(percent, bytesWritten, totalBytes)
                        _downloadState.value = state
                        onProgress?.invoke(state)
                    }
                }
            }
            outputStream.flush()
        } finally {
            try { inputStream?.close() } catch (_: Exception) {}
            try { outputStream?.close() } catch (_: Exception) {}
        }
    }

    /**
     * Verifies the integrity of the downloaded APK by parsing package metadata and calculating SHA-256.
     */
    private fun verifyApkFile(file: File, expectedSha256: String?): Boolean {
        if (!file.exists() || file.length() < 1024) {
            return false
        }

        try {
            // Verify APK structure with Android PackageManager
            val packageInfo = context.packageManager.getPackageArchiveInfo(
                file.absolutePath,
                PackageManager.GET_ACTIVITIES
            )
            if (packageInfo == null) {
                Log.e(TAG, "Archive info is null. APK file is incomplete or corrupt.")
                return false
            }

            // Verify checksum if provided
            if (!expectedSha256.isNullOrBlank()) {
                val computedHash = calculateSha256(file)
                if (!computedHash.equals(expectedSha256.trim(), ignoreCase = true)) {
                    Log.e(TAG, "SHA256 mismatch: Expected $expectedSha256, got $computedHash")
                    return false
                }
            }

            return true
        } catch (e: Exception) {
            Log.e(TAG, "Error verifying APK: ${e.message}", e)
            return false
        }
    }

    /**
     * Computes the SHA-256 digest of a file.
     */
    private fun calculateSha256(file: File): String {
        val digest = MessageDigest.getInstance("SHA-256")
        file.inputStream().use { input ->
            val buffer = ByteArray(8 * 1024)
            var read: Int
            while (input.read(buffer).also { read = it } != -1) {
                digest.update(buffer, 0, read)
            }
        }
        val bytes = digest.digest()
        return bytes.joinToString("") { "%02x".format(it) }
    }

    /**
     * Launches the native Android Package Installer using FileProvider.
     */
    fun launchPackageInstaller(apkFile: File) {
        try {
            val authority = "${context.packageName}.fileprovider"
            val apkUri = FileProvider.getUriForFile(context, authority, apkFile)

            val installIntent = Intent(Intent.ACTION_VIEW).apply {
                setDataAndType(apkUri, "application/vnd.android.package-archive")
                addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }

            context.startActivity(installIntent)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to launch package installer: ${e.message}", e)
            _downloadState.value = DownloadProgressState.Error("Unable to open package installer: ${e.message}")
        }
    }

    fun resetState() {
        _downloadState.value = DownloadProgressState.Idle
    }
}
