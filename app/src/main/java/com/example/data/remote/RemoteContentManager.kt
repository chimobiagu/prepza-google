package com.example.data.remote

import android.content.Context
import android.content.SharedPreferences
import android.content.pm.PackageInfo
import android.util.Log
import com.example.BuildConfig
import com.example.data.db.PrepzaDatabase
import com.example.data.db.QuestionEntity
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

/**
 * Manages both Remote Data/Content Updates and App Version Update detection.
 * Ensures offline reliability, seamless cloud sync, and non-intrusive update prompts.
 */
class RemoteContentManager(private val context: Context) {

    private val TAG = "RemoteContentManager"
    private val PREFS_NAME = "prepza_remote_config_prefs"
    private val KEY_LAST_CONTENT_SYNC = "last_remote_content_sync_ms"
    private val KEY_DISMISSED_UPDATE_VERSION = "dismissed_update_version_code"
    private val KEY_DISMISSED_UPDATE_TIME = "dismissed_update_timestamp_ms"
    private val KEY_LAST_VERSION_CHECK = "last_version_check_ms"

    private val prefs: SharedPreferences by lazy {
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    private val db = PrepzaDatabase.getDatabase(context)
    private val questionDao = db.questionDao()
    private val userProfileDao = db.userProfileDao()

    private val firestore: FirebaseFirestore? by lazy {
        try {
            if (FirebaseApp.getApps(context).isEmpty()) {
                FirebaseApp.initializeApp(context)
            }
            FirebaseFirestore.getInstance()
        } catch (e: Exception) {
            Log.w(TAG, "Firestore not initialized for remote content: ${e.message}")
            null
        }
    }

    private val _updateStatus = MutableStateFlow<AppUpdateStatus>(AppUpdateStatus.UpToDate)
    val updateStatus: StateFlow<AppUpdateStatus> = _updateStatus.asStateFlow()

    private val _isContentSyncing = MutableStateFlow(false)
    val isContentSyncing: StateFlow<Boolean> = _isContentSyncing.asStateFlow()

    private val _lastSyncResult = MutableStateFlow<RemoteContentSyncResult?>(null)
    val lastSyncResult: StateFlow<RemoteContentSyncResult?> = _lastSyncResult.asStateFlow()

    private val _announcements = MutableStateFlow<List<RemoteAnnouncement>>(emptyList())
    val announcements: StateFlow<List<RemoteAnnouncement>> = _announcements.asStateFlow()

    val currentVersionCode: Int
        get() = try {
            val pInfo: PackageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.P) {
                pInfo.longVersionCode.toInt()
            } else {
                @Suppress("DEPRECATION")
                pInfo.versionCode
            }
        } catch (_: Exception) {
            BuildConfig.VERSION_CODE
        }

    val currentVersionName: String
        get() = try {
            val pInfo: PackageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
            pInfo.versionName ?: BuildConfig.VERSION_NAME
        } catch (_: Exception) {
            BuildConfig.VERSION_NAME
        }

    /**
     * Checks if a new app version is available by querying remote version configuration.
     */
    suspend fun checkForAppVersionUpdate(force: Boolean = false): AppUpdateStatus = withContext(Dispatchers.IO) {
        val currentCode = currentVersionCode
        val currentName = currentVersionName

        // Cooldown check (skip if checked within last 1 hour unless forced)
        val lastCheck = prefs.getLong(KEY_LAST_VERSION_CHECK, 0L)
        val now = System.currentTimeMillis()
        if (!force && (now - lastCheck) < (3600 * 1000L) && _updateStatus.value !is AppUpdateStatus.Error) {
            return@withContext _updateStatus.value
        }

        prefs.edit().putLong(KEY_LAST_VERSION_CHECK, now).apply()

        try {
            val config = fetchRemoteVersionConfig()
            
            val status = when {
                // Mandatory update if installed version is below minimum supported version
                currentCode < config.minSupportedVersionCode || (config.isRequired && currentCode < config.latestVersionCode) -> {
                    AppUpdateStatus.MandatoryUpdateRequired(config, currentName)
                }
                // Optional update if newer version is available and not in dismissed cooldown
                currentCode < config.latestVersionCode -> {
                    if (shouldShowOptionalPrompt(config.latestVersionCode) || force) {
                        AppUpdateStatus.OptionalUpdateAvailable(config, currentName)
                    } else {
                        AppUpdateStatus.UpToDate
                    }
                }
                else -> {
                    AppUpdateStatus.UpToDate
                }
            }

            _updateStatus.value = status
            status
        } catch (e: Exception) {
            Log.e(TAG, "Failed to check for app version update: ${e.message}", e)
            val fallbackStatus = AppUpdateStatus.UpToDate
            _updateStatus.value = fallbackStatus
            fallbackStatus
        }
    }

    /**
     * Checks whether an optional update prompt should be shown to avoid annoying the user.
     */
    private fun shouldShowOptionalPrompt(latestVersionCode: Int): Boolean {
        val dismissedVersion = prefs.getInt(KEY_DISMISSED_UPDATE_VERSION, -1)
        val dismissedTime = prefs.getLong(KEY_DISMISSED_UPDATE_TIME, 0L)
        val now = System.currentTimeMillis()

        // If user dismissed this exact version within the last 24 hours, don't show prompt repeatedly
        if (dismissedVersion == latestVersionCode) {
            val hoursPassed = (now - dismissedTime) / (1000 * 3600)
            if (hoursPassed < 24) {
                return false
            }
        }
        return true
    }

    /**
     * Dismisses the optional update for 24 hours.
     */
    fun dismissOptionalUpdate(versionCode: Int) {
        prefs.edit()
            .putInt(KEY_DISMISSED_UPDATE_VERSION, versionCode)
            .putLong(KEY_DISMISSED_UPDATE_TIME, System.currentTimeMillis())
            .apply()
        _updateStatus.value = AppUpdateStatus.UpToDate
    }

    /**
     * Fetches central remote version configuration from Firestore or fallback endpoint.
     */
    private suspend fun fetchRemoteVersionConfig(): AppVersionConfig {
        val fs = firestore
        if (fs != null) {
            try {
                val doc = fs.collection("app_config").document("version_config").get().await()
                if (doc.exists()) {
                    val latestCode = doc.getLong("latestVersionCode")?.toInt() ?: 1
                    val latestName = doc.getString("latestVersionName") ?: "1.0"
                    val minCode = doc.getLong("minSupportedVersionCode")?.toInt() ?: 1
                    val isAvail = doc.getBoolean("isUpdateAvailable") ?: false
                    val updateType = doc.getString("updateType") ?: "optional"
                    val title = doc.getString("title") ?: "PREPZA Update Available"
                    val notes = doc.getString("releaseNotes") ?: "• Performance improvements and bug fixes"
                    val url = doc.getString("downloadUrl") ?: "https://ai.studio/build"
                    val apkSize = doc.getDouble("apkSizeMb")?.toFloat() ?: 24.5f
                    val publishedAt = doc.getString("publishedAt") ?: "2026"

                    return AppVersionConfig(
                        latestVersionCode = latestCode,
                        latestVersionName = latestName,
                        minSupportedVersionCode = minCode,
                        isUpdateAvailable = isAvail,
                        updateType = updateType,
                        title = title,
                        releaseNotes = notes,
                        downloadUrl = url,
                        apkSizeMb = apkSize,
                        publishedAt = publishedAt
                    )
                }
            } catch (e: Exception) {
                Log.w(TAG, "Error querying Firestore version config: ${e.message}")
            }
        }

        // Default / Fallback Version Config
        return AppVersionConfig(
            latestVersionCode = 1,
            latestVersionName = "1.0",
            minSupportedVersionCode = 1,
            isUpdateAvailable = false,
            updateType = "optional",
            title = "PREPZA JAMB CBT",
            releaseNotes = "• Initial release with comprehensive offline JAMB question bank\n• Full timed CBT exam simulation",
            downloadUrl = "https://ai.studio/build",
            publishedAt = "August 2026"
        )
    }

    /**
     * REMOTE DATA / CONTENT UPDATES:
     * Fetches new questions, passages, corrections, announcements, and academic settings
     * from the server and caches them into Room SQLite database.
     */
    suspend fun syncRemoteContent(force: Boolean = false): RemoteContentSyncResult = withContext(Dispatchers.IO) {
        if (_isContentSyncing.value) {
            return@withContext RemoteContentSyncResult(
                isSuccess = true,
                message = "Content sync already in progress"
            )
        }

        _isContentSyncing.value = true
        var newQuestionsCount = 0
        var correctionsCount = 0
        var announcementsCount = 0
        var examDateUpdated = false

        try {
            val fs = firestore
            if (fs != null) {
                // 1. Sync Remote Announcements
                try {
                    val announcementsSnapshot = fs.collection("announcements")
                        .orderBy("timestamp", com.google.firebase.firestore.Query.Direction.DESCENDING)
                        .limit(5)
                        .get()
                        .await()

                    val fetchedAnnouncements = announcementsSnapshot.documents.mapNotNull { doc ->
                        RemoteAnnouncement(
                            id = doc.id,
                            title = doc.getString("title") ?: "",
                            message = doc.getString("message") ?: "",
                            type = doc.getString("type") ?: "info",
                            actionUrl = doc.getString("actionUrl"),
                            actionText = doc.getString("actionText"),
                            timestamp = doc.getLong("timestamp") ?: System.currentTimeMillis(),
                            isDismissible = doc.getBoolean("isDismissible") ?: true
                        )
                    }
                    if (fetchedAnnouncements.isNotEmpty()) {
                        _announcements.value = fetchedAnnouncements
                        announcementsCount = fetchedAnnouncements.size
                    }
                } catch (e: Exception) {
                    Log.w(TAG, "Error syncing remote announcements: ${e.message}")
                }

                // 2. Sync Remote Academic Configuration
                try {
                    val academicDoc = fs.collection("app_config").document("academic_settings").get().await()
                    if (academicDoc.exists()) {
                        val remoteJambTimestamp = academicDoc.getLong("jambExamDateTimestamp")
                        if (remoteJambTimestamp != null && remoteJambTimestamp > 0) {
                            val currentProfile = userProfileDao.getUserProfileOnce()
                            if (currentProfile != null && currentProfile.jambExamDateTimestamp != remoteJambTimestamp) {
                                userProfileDao.updateJambExamDate(remoteJambTimestamp)
                                examDateUpdated = true
                            }
                        }
                    }
                } catch (e: Exception) {
                    Log.w(TAG, "Error syncing academic settings: ${e.message}")
                }

                // 3. Sync Remote Questions and Question Corrections
                try {
                    val lastSyncTime = prefs.getLong(KEY_LAST_CONTENT_SYNC, 0L)
                    val questionsQuery = if (lastSyncTime > 0 && !force) {
                        fs.collection("remote_questions")
                            .whereGreaterThan("updatedAt", lastSyncTime)
                            .limit(300)
                    } else {
                        fs.collection("remote_questions")
                            .limit(300)
                    }

                    val questionsSnapshot = questionsQuery.get().await()
                    val remoteQuestions = questionsSnapshot.documents.mapNotNull { doc ->
                        try {
                            QuestionEntity(
                                id = doc.id,
                                subject = doc.getString("subject") ?: "Use of English",
                                topic = doc.getString("topic") ?: "General",
                                year = doc.getString("year") ?: "2024",
                                questionText = doc.getString("questionText") ?: "",
                                optionA = doc.getString("optionA") ?: "",
                                optionB = doc.getString("optionB") ?: "",
                                optionC = doc.getString("optionC") ?: "",
                                optionD = doc.getString("optionD") ?: "",
                                correctAnswerIndex = doc.getLong("correctAnswerIndex")?.toInt() ?: 0,
                                explanation = doc.getString("explanation") ?: "",
                                passageText = doc.getString("passageText"),
                                difficulty = doc.getString("difficulty") ?: "Medium",
                                originType = doc.getString("originType") ?: "JAMB_ORIGINAL",
                                originLabel = doc.getString("originLabel") ?: "Original JAMB Question",
                                isVerifiedJamb = doc.getBoolean("isVerifiedJamb") ?: true,
                                imageUrl = doc.getString("imageUrl")
                            )
                        } catch (e: Exception) {
                            null
                        }
                    }

                    if (remoteQuestions.isNotEmpty()) {
                        questionDao.insertAll(remoteQuestions)
                        newQuestionsCount = remoteQuestions.size
                    }
                } catch (e: Exception) {
                    Log.w(TAG, "Error syncing remote questions: ${e.message}")
                }
            }

            prefs.edit().putLong(KEY_LAST_CONTENT_SYNC, System.currentTimeMillis()).apply()

            val result = RemoteContentSyncResult(
                isSuccess = true,
                newQuestionsCount = newQuestionsCount,
                updatedCorrectionsCount = correctionsCount,
                announcementsCount = announcementsCount,
                officialJambDateUpdated = examDateUpdated,
                message = if (newQuestionsCount > 0) "Successfully updated $newQuestionsCount questions from server" else "All syllabus & question banks are up to date"
            )
            _lastSyncResult.value = result
            _isContentSyncing.value = false
            result
        } catch (e: Exception) {
            Log.e(TAG, "Remote content sync error: ${e.message}", e)
            val result = RemoteContentSyncResult(
                isSuccess = false,
                message = "Could not reach update server. Local content is available offline."
            )
            _lastSyncResult.value = result
            _isContentSyncing.value = false
            result
        }
    }
}
