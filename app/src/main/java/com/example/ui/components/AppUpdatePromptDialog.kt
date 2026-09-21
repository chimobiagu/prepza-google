package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.SecurityUpdateGood
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.CheckCircleOutline
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.data.remote.AppUpdateStatus
import com.example.data.remote.AppVersionConfig
import com.example.data.remote.DownloadProgressState
import com.example.ui.theme.*

@Composable
fun AppUpdatePromptDialog(
    updateStatus: AppUpdateStatus,
    downloadState: DownloadProgressState = DownloadProgressState.Idle,
    canInstallPackages: Boolean = true,
    onStartUpdate: (AppVersionConfig) -> Unit,
    onGrantInstallPermission: () -> Unit = {},
    onDismissOptional: (versionCode: Int) -> Unit
) {
    val (config, isMandatory, currentVersion) = when (updateStatus) {
        is AppUpdateStatus.MandatoryUpdateRequired -> Triple(updateStatus.config, true, updateStatus.currentVersionName)
        is AppUpdateStatus.OptionalUpdateAvailable -> Triple(updateStatus.config, false, updateStatus.currentVersionName)
        else -> return
    }

    val isDownloading = downloadState is DownloadProgressState.Downloading || downloadState is DownloadProgressState.Verifying

    Dialog(
        onDismissRequest = {
            if (!isMandatory && !isDownloading) {
                onDismissOptional(config.latestVersionCode)
            }
        },
        properties = DialogProperties(
            dismissOnBackPress = !isMandatory && !isDownloading,
            dismissOnClickOutside = !isMandatory && !isDownloading,
            usePlatformDefaultWidth = false
        )
    ) {
        Surface(
            shape = RoundedCornerShape(20.dp),
            color = SurfaceWhite,
            shadowElevation = 8.dp,
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .wrapContentHeight()
                .padding(vertical = 16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
            ) {
                // Header Row with Icon and Badge
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        shape = CircleShape,
                        color = if (isMandatory) IncorrectRedBg else PaleGreenBg,
                        modifier = Modifier.size(48.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = if (isMandatory) Icons.Default.Warning else Icons.Default.SecurityUpdateGood,
                                contentDescription = null,
                                tint = if (isMandatory) IncorrectRed else PrimaryGreen,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }

                    // Version Tag Badge
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = if (isMandatory) IncorrectRedBg else Color(0xFFF3F4F6),
                        border = androidx.compose.foundation.BorderStroke(
                            1.dp,
                            if (isMandatory) IncorrectRed.copy(alpha = 0.4f) else BorderSubtle
                        )
                    ) {
                        Text(
                            text = if (isMandatory) "Required • v${config.latestVersionName}" else "v${config.latestVersionName} Available",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = if (isMandatory) IncorrectRed else TextPrimary,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Title
                Text(
                    text = "New version available",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = if (isMandatory) {
                        "Your current version (v$currentVersion) requires updating to continue preparing with verified 2026 JAMB questions."
                    } else {
                        "Update PREPZA to enjoy the latest 2026 question banks, speed optimizations, and enhanced offline CBT simulation."
                    },
                    style = MaterialTheme.typography.bodyMedium,
                    color = TextSecondary,
                    lineHeight = 20.sp
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Release Notes Card
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = AppBackground,
                    border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp)
                    ) {
                        Text(
                            text = "WHAT'S NEW IN THIS RELEASE",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = TextMuted,
                            letterSpacing = 0.5.sp
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        val noteLines = config.releaseNotes.split("\n").filter { it.isNotBlank() }
                        noteLines.forEach { line ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 3.dp),
                                verticalAlignment = Alignment.Top
                            ) {
                                Icon(
                                    imageVector = Icons.Outlined.CheckCircleOutline,
                                    contentDescription = null,
                                    tint = PrimaryGreen,
                                    modifier = Modifier
                                        .size(15.dp)
                                        .padding(top = 2.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = line.removePrefix("•").trim(),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = TextPrimary,
                                    lineHeight = 18.sp
                                )
                            }
                        }
                    }
                }

                // Download Progress or Status
                when (downloadState) {
                    is DownloadProgressState.Downloading -> {
                        Spacer(modifier = Modifier.height(16.dp))
                        Column(modifier = Modifier.fillMaxWidth()) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Downloading update...",
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.SemiBold,
                                    color = PrimaryGreen
                                )
                                Text(
                                    text = "${downloadState.progressPercent}%",
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryGreen
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            LinearProgressIndicator(
                                progress = { downloadState.progressPercent / 100f },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(8.dp)
                                    .clip(RoundedCornerShape(4.dp)),
                                color = PrimaryGreen,
                                trackColor = PaleGreenBg
                            )
                            if (downloadState.totalBytes > 0) {
                                Spacer(modifier = Modifier.height(4.dp))
                                val downloadedMb = "%.1f".format(downloadState.bytesDownloaded / (1024f * 1024f))
                                val totalMb = "%.1f".format(downloadState.totalBytes / (1024f * 1024f))
                                Text(
                                    text = "$downloadedMb MB / $totalMb MB",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = TextMuted
                                )
                            }
                        }
                    }
                    is DownloadProgressState.Verifying -> {
                        Spacer(modifier = Modifier.height(16.dp))
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(16.dp),
                                strokeWidth = 2.dp,
                                color = PrimaryGreen
                            )
                            Text(
                                text = "Verifying package integrity & SHA-256...",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary
                            )
                        }
                    }
                    is DownloadProgressState.Error -> {
                        Spacer(modifier = Modifier.height(14.dp))
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = IncorrectRedBg,
                            border = androidx.compose.foundation.BorderStroke(1.dp, IncorrectRed.copy(alpha = 0.3f)),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = downloadState.message,
                                style = MaterialTheme.typography.bodySmall,
                                color = IncorrectRed,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                    }
                    else -> {}
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Action Buttons
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    if (!canInstallPackages) {
                        Button(
                            onClick = onGrantInstallPermission,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                                .testTag("btn_grant_install_perm"),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFD97706),
                                contentColor = Color.White
                            )
                        ) {
                            Icon(Icons.Default.Settings, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Allow App Installs in Settings", fontWeight = FontWeight.Bold)
                        }
                    } else if (downloadState is DownloadProgressState.Error) {
                        Button(
                            onClick = { onStartUpdate(config) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                                .testTag("btn_retry_update"),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = PrimaryGreen,
                                contentColor = Color.White
                            )
                        ) {
                            Icon(Icons.Default.Refresh, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Retry Download", fontWeight = FontWeight.Bold)
                        }
                    } else if (!isDownloading) {
                        Button(
                            onClick = { onStartUpdate(config) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                                .testTag("btn_update_app_now"),
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = if (isMandatory) IncorrectRed else PrimaryGreen,
                                contentColor = Color.White
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Default.Download,
                                contentDescription = null,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Update PREPZA",
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp
                            )
                        }
                    }

                    if (!isMandatory && !isDownloading) {
                        TextButton(
                            onClick = { onDismissOptional(config.latestVersionCode) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(44.dp),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(
                                text = "Later",
                                fontWeight = FontWeight.SemiBold,
                                color = TextSecondary,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
        }
    }
}
