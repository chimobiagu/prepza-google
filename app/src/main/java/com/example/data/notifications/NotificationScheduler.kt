package com.example.data.notifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.work.*
import com.example.MainActivity
import com.example.R
import com.example.data.db.PrepzaDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.Calendar
import java.util.concurrent.TimeUnit

/**
 * Handles notification channels, WorkManager background scheduling for 12:00 PM Practice and 6:00 PM Streak reminders,
 * academic countdown alerts, and intelligent preference adherence configured in Settings.
 */
class NotificationScheduler(private val context: Context) {

    companion object {
        const val TAG = "NotificationScheduler"
        const val PREFS_NAME = "prepza_notification_prefs"
        const val KEY_LAST_NOTIF_TIME = "last_notification_timestamp_ms"
        const val KEY_LAST_NOTIF_ID = "last_notification_id"
        const val KEY_NOTIF_ENABLED = "study_reminders_enabled"
        const val KEY_DAILY_PRACTICE_ENABLED = "daily_practice_enabled"
        const val KEY_DAILY_STREAK_ENABLED = "daily_streak_enabled"
        const val KEY_CBT_MOCK_ENABLED = "cbt_mock_enabled"

        // Channel IDs
        const val CHANNEL_PRACTICE = "prepza_study_reminders"
        const val CHANNEL_STREAK = "prepza_streaks"
        const val CHANNEL_CBT = "prepza_cbt_alerts"
        const val CHANNEL_ANNOUNCEMENT = "prepza_announcements"

        // Work Names
        const val WORK_DAILY_PRACTICE = "prepza_daily_practice_12pm"
        const val WORK_DAILY_STREAK = "prepza_daily_streak_6pm"
        const val WORK_ADMIN_SYNC = "prepza_admin_notif_sync"

        fun initChannels(context: Context) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

                val practiceChannel = NotificationChannel(
                    CHANNEL_PRACTICE,
                    "Study & Practice Reminders",
                    NotificationManager.IMPORTANCE_HIGH
                ).apply {
                    description = "Daily 15-minute quick practice drills and subject study tasks"
                    enableVibration(true)
                }

                val streakChannel = NotificationChannel(
                    CHANNEL_STREAK,
                    "Daily Streaks & Motivation",
                    NotificationManager.IMPORTANCE_HIGH
                ).apply {
                    description = "Streak protection alerts and daily momentum reminders"
                    enableVibration(true)
                }

                val cbtChannel = NotificationChannel(
                    CHANNEL_CBT,
                    "CBT Exam & Mock Alerts",
                    NotificationManager.IMPORTANCE_DEFAULT
                ).apply {
                    description = "National mock schedules, timer alerts, and score synchronization"
                }

                val announcementChannel = NotificationChannel(
                    CHANNEL_ANNOUNCEMENT,
                    "Announcements & JAMB Updates",
                    NotificationManager.IMPORTANCE_HIGH
                ).apply {
                    description = "Official JAMB syllabus updates, literature guides, and platform releases"
                }

                notificationManager.createNotificationChannels(
                    listOf(practiceChannel, streakChannel, cbtChannel, announcementChannel)
                )
            }
        }

        /**
         * Schedules all background reminders according to user preferences in SharedPreferences.
         */
        fun scheduleAllReminders(context: Context) {
            initChannels(context)
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            val practiceEnabled = prefs.getBoolean(KEY_DAILY_PRACTICE_ENABLED, true)
            val streakEnabled = prefs.getBoolean(KEY_DAILY_STREAK_ENABLED, true)
            val cbtMockEnabled = prefs.getBoolean(KEY_CBT_MOCK_ENABLED, true)

            val workManager = WorkManager.getInstance(context)

            // 1. Daily 12:00 PM Practice Reminder
            if (practiceEnabled) {
                scheduleDailyWork(context, 12, 0, WORK_DAILY_PRACTICE, DailyPracticeReminderWorker::class.java)
            } else {
                workManager.cancelUniqueWork(WORK_DAILY_PRACTICE)
            }

            // 2. Daily 6:00 PM Streak Protection Reminder
            if (streakEnabled) {
                scheduleDailyWork(context, 18, 0, WORK_DAILY_STREAK, DailyStreakReminderWorker::class.java)
            } else {
                workManager.cancelUniqueWork(WORK_DAILY_STREAK)
            }

            // 3. Admin & Announcement Periodic Sync
            if (cbtMockEnabled) {
                scheduleAdminNotificationSync(context)
            } else {
                workManager.cancelUniqueWork(WORK_ADMIN_SYNC)
            }
        }

        /**
         * Updates user notification preferences and refreshes WorkManager task states immediately.
         */
        fun updateNotificationPreferences(
            context: Context,
            dailyPracticeEnabled: Boolean,
            dailyStreakEnabled: Boolean,
            cbtMockEnabled: Boolean
        ) {
            val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            prefs.edit()
                .putBoolean(KEY_DAILY_PRACTICE_ENABLED, dailyPracticeEnabled)
                .putBoolean(KEY_DAILY_STREAK_ENABLED, dailyStreakEnabled)
                .putBoolean(KEY_CBT_MOCK_ENABLED, cbtMockEnabled)
                .apply()

            scheduleAllReminders(context)
        }

        private fun scheduleDailyWork(
            context: Context,
            targetHour: Int,
            targetMinute: Int,
            workName: String,
            workerClass: Class<out CoroutineWorker>
        ) {
            val now = Calendar.getInstance()
            val target = Calendar.getInstance().apply {
                set(Calendar.HOUR_OF_DAY, targetHour)
                set(Calendar.MINUTE, targetMinute)
                set(Calendar.SECOND, 0)
                set(Calendar.MILLISECOND, 0)
            }

            if (target.before(now)) {
                target.add(Calendar.DAY_OF_YEAR, 1)
            }

            val initialDelay = target.timeInMillis - now.timeInMillis

            val request = PeriodicWorkRequestBuilder<CoroutineWorker>(24, TimeUnit.HOURS)
                .setInitialDelay(initialDelay, TimeUnit.MILLISECONDS)
                .setConstraints(
                    Constraints.Builder()
                        .setRequiresBatteryNotLow(false)
                        .build()
                )
                .build()

            WorkManager.getInstance(context).enqueueUniquePeriodicWork(
                workName,
                ExistingPeriodicWorkPolicy.UPDATE,
                request as PeriodicWorkRequest
            )
        }

        fun scheduleAdminNotificationSync(context: Context) {
            val request = PeriodicWorkRequestBuilder<AdminNotificationSyncWorker>(30, TimeUnit.MINUTES)
                .setConstraints(
                    Constraints.Builder()
                        .setRequiredNetworkType(NetworkType.CONNECTED)
                        .build()
                )
                .build()

            WorkManager.getInstance(context).enqueueUniquePeriodicWork(
                WORK_ADMIN_SYNC,
                ExistingPeriodicWorkPolicy.KEEP,
                request
            )
        }
    }

    private val prefs: SharedPreferences by lazy {
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun isNotificationAllowed(minIntervalHours: Int = 3): Boolean {
        val lastTime = prefs.getLong(KEY_LAST_NOTIF_TIME, 0L)
        val now = System.currentTimeMillis()
        val hoursPassed = (now - lastTime) / (1000 * 3600)
        return hoursPassed >= minIntervalHours
    }

    fun recordNotificationSent(notificationId: Int) {
        prefs.edit()
            .putLong(KEY_LAST_NOTIF_TIME, System.currentTimeMillis())
            .putInt(KEY_LAST_NOTIF_ID, notificationId)
            .apply()
    }

    /**
     * Posts a styled PREPZA notification to the device status bar.
     */
    fun postNotification(
        id: Int,
        channelId: String,
        title: String,
        body: String,
        destination: String = "home"
    ) {
        try {
            val intent = Intent(context, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                putExtra("destination", destination)
            }

            val pendingIntent = PendingIntent.getActivity(
                context,
                id,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT or (if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) PendingIntent.FLAG_IMMUTABLE else 0)
            )

            val builder = NotificationCompat.Builder(context, channelId)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(body)
                .setStyle(NotificationCompat.BigTextStyle().bigText(body))
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)

            val manager = NotificationManagerCompat.from(context)
            if (manager.areNotificationsEnabled()) {
                manager.notify(id, builder.build())
                recordNotificationSent(id)
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to post notification: ${e.message}")
        }
    }
}

/**
 * Worker that fires at 12:00 PM to encourage a 15-minute quick practice,
 * respecting user preferences configured in Settings.
 */
class DailyPracticeReminderWorker(
    private val context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        try {
            val prefs = context.getSharedPreferences(NotificationScheduler.PREFS_NAME, Context.MODE_PRIVATE)
            val isEnabled = prefs.getBoolean(NotificationScheduler.KEY_DAILY_PRACTICE_ENABLED, true)
            if (!isEnabled) {
                return@withContext Result.success()
            }

            val scheduler = NotificationScheduler(context)
            val db = PrepzaDatabase.getDatabase(context)
            val profile = db.userProfileDao().getUserProfileOnce()

            val targetScore = profile?.targetScore ?: 320
            val dreamCourse = profile?.dreamCourse ?: "your dream course"
            val targetInstitution = profile?.targetInstitution ?: "your target university"

            val title = "12:00 PM • Quick Practice Drill 🎯"
            val body = "Got 15 minutes? Knock out a quick speed drill now. Keep your UTME speed sharp for $targetScore+ in $dreamCourse at $targetInstitution!"

            scheduler.postNotification(
                id = 12001,
                channelId = NotificationScheduler.CHANNEL_PRACTICE,
                title = title,
                body = body,
                destination = "practice"
            )
            Result.success()
        } catch (e: Exception) {
            Result.retry()
        }
    }
}

/**
 * Worker that fires at 6:00 PM to protect and extend the daily streak,
 * respecting user preferences configured in Settings.
 */
class DailyStreakReminderWorker(
    private val context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        try {
            val prefs = context.getSharedPreferences(NotificationScheduler.PREFS_NAME, Context.MODE_PRIVATE)
            val isEnabled = prefs.getBoolean(NotificationScheduler.KEY_DAILY_STREAK_ENABLED, true)
            if (!isEnabled) {
                return@withContext Result.success()
            }

            val scheduler = NotificationScheduler(context)
            val db = PrepzaDatabase.getDatabase(context)
            val profile = db.userProfileDao().getUserProfileOnce()

            val streak = profile?.streakDays ?: 1
            val title = "6:00 PM • Streak Protection Alert 🔥"
            val body = "Don't break the momentum! Your $streak-day study streak is waiting. Answer a few questions today to keep your streak alive."

            scheduler.postNotification(
                id = 18001,
                channelId = NotificationScheduler.CHANNEL_STREAK,
                title = title,
                body = body,
                destination = "home"
            )
            Result.success()
        } catch (e: Exception) {
            Result.retry()
        }
    }
}

/**
 * Worker that checks for Admin Push Broadcasts from Firestore periodically.
 */
class AdminNotificationSyncWorker(
    private val context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        try {
            val prefs = context.getSharedPreferences(NotificationScheduler.PREFS_NAME, Context.MODE_PRIVATE)
            val isEnabled = prefs.getBoolean(NotificationScheduler.KEY_CBT_MOCK_ENABLED, true)
            if (!isEnabled) {
                return@withContext Result.success()
            }

            val adminManager = AdminNotificationManager(context)
            adminManager.checkAndDeliverPendingNotifications()
            Result.success()
        } catch (e: Exception) {
            Result.retry()
        }
    }
}
