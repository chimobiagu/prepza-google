package com.example.data.remote

/**
 * Remote Version Configuration returned by the backend/Firestore/Cloud configuration.
 */
data class AppVersionConfig(
    val latestVersionCode: Int = 2,
    val latestVersionName: String = "1.1.0",
    val minSupportedVersionCode: Int = 1,
    val isUpdateAvailable: Boolean = false,
    val updateType: String = "optional", // "optional" or "required" / "mandatory"
    val title: String = "PREPZA Update Available",
    val releaseNotes: String = "• Updated 2026 JAMB CBT Question Bank & Syllabus\n• Enhanced offline exam simulation timing & navigation\n• Improved lexis & structure formatting with instant explanations\n• Enhanced cloud backup & referral reward sync",
    val downloadUrl: String = "https://ai.studio/build",
    val directApkUrl: String? = null,
    val sha256Checksum: String? = null,
    val apkSizeMb: Float = 24.5f,
    val publishedAt: String = "August 2026",
    val forceCheckIntervalHours: Int = 12
) {
    val isRequired: Boolean
        get() = updateType.equals("required", ignoreCase = true) ||
                updateType.equals("mandatory", ignoreCase = true)
}

/**
 * Download & Installation Progress State for In-App APK Updater.
 */
sealed class DownloadProgressState {
    object Idle : DownloadProgressState()
    data class Downloading(val progressPercent: Int, val bytesDownloaded: Long, val totalBytes: Long) : DownloadProgressState()
    object Verifying : DownloadProgressState()
    data class ReadyToInstall(val apkFilePath: String) : DownloadProgressState()
    data class Error(val message: String) : DownloadProgressState()
}

/**
 * App version check status relative to current installed build.
 */
sealed class AppUpdateStatus {
    object UpToDate : AppUpdateStatus()
    data class OptionalUpdateAvailable(val config: AppVersionConfig, val currentVersionName: String) : AppUpdateStatus()
    data class MandatoryUpdateRequired(val config: AppVersionConfig, val currentVersionName: String) : AppUpdateStatus()
    data class Error(val message: String) : AppUpdateStatus()
}

/**
 * Remote announcement broadcast from backend.
 */
data class RemoteAnnouncement(
    val id: String = "",
    val title: String = "",
    val message: String = "",
    val type: String = "info", // "info", "exam_alert", "update", "promo"
    val actionUrl: String? = null,
    val actionText: String? = null,
    val timestamp: Long = System.currentTimeMillis(),
    val isDismissible: Boolean = true
)

/**
 * Admin broadcast notification model for targeted push and in-app alerts.
 */
data class AdminNotification(
    val id: String = "",
    val title: String = "",
    val body: String = "",
    val targetAudience: String = "ALL", // "ALL", "PLUS_ONLY", "FREE_TRIAL", "EXPIRING_SOON"
    val scheduledAtTimestamp: Long = System.currentTimeMillis(),
    val expiresAtTimestamp: Long = System.currentTimeMillis() + (7 * 24 * 3600 * 1000L),
    val priority: String = "HIGH", // "HIGH", "DEFAULT", "LOW"
    val actionRoute: String = "home", // "home", "cbt", "practice", "upgrade", "update"
    val senderName: String = "PREPZA Academic Team",
    val isDelivered: Boolean = false
)

/**
 * Remote Content Sync Result detailing what was updated from the cloud.
 */
data class RemoteContentSyncResult(
    val isSuccess: Boolean,
    val newQuestionsCount: Int = 0,
    val updatedCorrectionsCount: Int = 0,
    val announcementsCount: Int = 0,
    val officialJambDateUpdated: Boolean = false,
    val message: String = "",
    val timestamp: Long = System.currentTimeMillis()
)

/**
 * Server-controlled academic exam configuration.
 */
data class RemoteAcademicConfig(
    val jambExamDateTimestamp: Long = 1745020800000L, // April 19, 2025/2026
    val currentExamCycle: String = "2026 UTME",
    val defaultTrialDays: Int = 30,
    val referralBonusDays: Int = 3,
    val freePlusReferralGoal: Int = 10,
    val supportEmail: String = "support@prepza.app",
    val officialPortalUrl: String = "https://ai.studio/build"
)
