package com.example.workers

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import androidx.work.*
import com.example.MainActivity
import com.example.R
import com.example.data.db.PrepzaDatabase
import java.util.concurrent.TimeUnit

class TrialExpirationWorker(
    private val context: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(context, workerParams) {

    companion object {
        const val WORK_NAME_PERIODIC = "prepza_trial_expiration_periodic"
        const val WORK_NAME_ONE_TIME = "prepza_trial_expiration_immediate"
        const val CHANNEL_ID = "prepza_trial_alerts_channel"
        const val CHANNEL_NAME = "Prepza Trial & Subscription Alerts"

        /**
         * Enqueues periodic and immediate background checks for user account age and trial expiration.
         */
        fun scheduleTrialChecks(context: Context) {
            val constraints = Constraints.Builder()
                .setRequiresBatteryNotLow(false)
                .build()

            // Periodic check every 6 hours
            val periodicWork = PeriodicWorkRequestBuilder<TrialExpirationWorker>(6, TimeUnit.HOURS)
                .setConstraints(constraints)
                .build()

            WorkManager.getInstance(context).enqueueUniquePeriodicWork(
                WORK_NAME_PERIODIC,
                ExistingPeriodicWorkPolicy.KEEP,
                periodicWork
            )

            // Immediate check on app startup
            val immediateWork = OneTimeWorkRequestBuilder<TrialExpirationWorker>()
                .setConstraints(constraints)
                .build()

            WorkManager.getInstance(context).enqueueUniqueWork(
                WORK_NAME_ONE_TIME,
                ExistingWorkPolicy.REPLACE,
                immediateWork
            )
        }
    }

    override suspend fun doWork(): Result {
        try {
            val db = PrepzaDatabase.getDatabase(context)
            val profile = db.userProfileDao().getUserProfileOnce() ?: return Result.success()

            // If user has already purchased Prepza Plus lifetime, skip notifications
            if (profile.isPlusSubscriber) {
                return Result.success()
            }

            val daysRemaining = profile.daysRemainingInTrial
            val dismissedList = profile.dismissedReminderMilestonesCsv
                .split(",")
                .mapNotNull { it.trim().toIntOrNull() }
                .toMutableSet()

            // Milestones to check: 20, 10, 5, 2 days before expiration
            val targetMilestone = when {
                daysRemaining <= 2 && !dismissedList.contains(2) -> 2
                daysRemaining <= 5 && !dismissedList.contains(5) -> 5
                daysRemaining <= 10 && !dismissedList.contains(10) -> 10
                daysRemaining <= 20 && !dismissedList.contains(20) -> 20
                else -> null
            }

            if (targetMilestone != null) {
                sendMilestoneNotification(targetMilestone, daysRemaining)
                dismissedList.add(targetMilestone)
                val updatedCsv = dismissedList.joinToString(",")
                db.userProfileDao().saveUserProfile(
                    profile.copy(dismissedReminderMilestonesCsv = updatedCsv)
                )
            } else if (daysRemaining == 0 && !dismissedList.contains(0)) {
                sendExpirationNotification()
                dismissedList.add(0)
                val updatedCsv = dismissedList.joinToString(",")
                db.userProfileDao().saveUserProfile(
                    profile.copy(dismissedReminderMilestonesCsv = updatedCsv)
                )
            }

            return Result.success()
        } catch (e: Exception) {
            e.printStackTrace()
            return Result.retry()
        }
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "Notifies when 30-day trial milestones (20, 10, 5, 2 days) or expiration occur"
                enableVibration(true)
                enableLights(true)
            }
            val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as? NotificationManager
            notificationManager?.createNotificationChannel(channel)
        }
    }

    private fun sendMilestoneNotification(milestoneDays: Int, actualDaysLeft: Int) {
        createNotificationChannel()

        val (title, body) = when (milestoneDays) {
            20 -> Pair(
                "Prepza Trial: 20 Days Remaining!",
                "You have 20 days left in your 30-day free trial. Keep sharpening your UTME readiness!"
            )
            10 -> Pair(
                "Prepza Plus: 10 Days Left in Trial",
                "Only 10 days remaining in your free trial! Upgrade to Prepza Plus for ₦500 for lifetime access."
            )
            5 -> Pair(
                "Urgent: 5 Days Left in Free Trial",
                "Your 30-day trial will expire in 5 days. Secure lifetime access to all 180-question CBT mocks for ₦500."
            )
            2 -> Pair(
                "Final Notice: Only 2 Days Left!",
                "Your free trial expires in 2 days! Upgrade now to Prepza Plus for ₦500 to keep full CBT access."
            )
            else -> Pair(
                "Prepza Plus Trial Reminder",
                "You have $actualDaysLeft days remaining in your 30-day free trial. Upgrade today for ₦500."
            )
        }

        dispatchNotification(notificationId = 1000 + milestoneDays, title = title, body = body)
    }

    private fun sendExpirationNotification() {
        createNotificationChannel()
        dispatchNotification(
            notificationId = 1000,
            title = "Prepza Free Trial Expired",
            body = "Your 30-day free trial has elapsed. Upgrade to Prepza Plus for ₦500 to resume practice and CBT mocks."
        )
    }

    private fun dispatchNotification(notificationId: Int, title: String, body: String) {
        // Check POST_NOTIFICATIONS permission on Android 13+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(context, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                return
            }
        }

        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        }

        val pendingIntent = PendingIntent.getActivity(
            context,
            notificationId,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(NotificationCompat.BigTextStyle().bigText(body))
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .build()

        try {
            NotificationManagerCompat.from(context).notify(notificationId, notification)
        } catch (_: SecurityException) {
            // Permission not granted or restricted
        }
    }
}
