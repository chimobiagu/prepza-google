package com.example.data.notifications

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.example.data.db.PrepzaDatabase
import com.example.data.remote.AdminNotification
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

/**
 * Handles remote admin broadcasts, targeted push delivery, delivery deduplication,
 * and frequency control to ensure students never receive duplicate or spam notifications.
 */
class AdminNotificationManager(private val context: Context) {

    private val TAG = "AdminNotification"
    private val PREFS_NAME = "prepza_admin_notif_prefs"
    private val KEY_DELIVERED_IDS = "delivered_notification_ids_csv"

    private val prefs: SharedPreferences by lazy {
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    private val firestore: FirebaseFirestore? by lazy {
        try {
            if (FirebaseApp.getApps(context).isEmpty()) {
                FirebaseApp.initializeApp(context)
            }
            FirebaseFirestore.getInstance()
        } catch (e: Exception) {
            Log.w(TAG, "Firestore not initialized for admin notifications: ${e.message}")
            null
        }
    }

    private val db = PrepzaDatabase.getDatabase(context)
    private val userProfileDao = db.userProfileDao()
    private val scheduler = NotificationScheduler(context)

    /**
     * Checks Firestore for pending broadcast notifications and delivers them to the student.
     */
    suspend fun checkAndDeliverPendingNotifications(): Int = withContext(Dispatchers.IO) {
        val fs = firestore ?: return@withContext 0
        val profile = userProfileDao.getUserProfileOnce()
        val now = System.currentTimeMillis()
        var deliveredCount = 0

        val deliveredIds = getDeliveredIds().toMutableSet()

        try {
            val snapshot = fs.collection("admin_notifications")
                .whereGreaterThan("expiresAtTimestamp", now)
                .limit(20)
                .get()
                .await()

            for (doc in snapshot.documents) {
                val notifId = doc.id
                if (deliveredIds.contains(notifId)) {
                    continue
                }

                val title = doc.getString("title") ?: "PREPZA Update"
                val body = doc.getString("body") ?: ""
                val target = doc.getString("targetAudience") ?: "ALL"
                val priority = doc.getString("priority") ?: "HIGH"
                val actionRoute = doc.getString("actionRoute") ?: "home"
                val scheduledAt = doc.getLong("scheduledAtTimestamp") ?: 0L

                // If scheduled in the future, skip for now
                if (scheduledAt > now) {
                    continue
                }

                // Check audience targeting
                val isAudienceMatch = when (target) {
                    "PLUS_ONLY" -> profile?.isPlusSubscriber == true
                    "FREE_TRIAL" -> profile?.isPlusSubscriber != true && (profile?.isTrialExpired != true)
                    "EXPIRING_SOON" -> (profile?.daysRemainingInTrial ?: 30) <= 5
                    else -> true // "ALL"
                }

                if (!isAudienceMatch) {
                    deliveredIds.add(notifId)
                    continue
                }

                // Frequency check: ensure at least 2 hours between broadcasts
                if (!scheduler.isNotificationAllowed(minIntervalHours = 2)) {
                    break
                }

                val channel = if (priority.equals("HIGH", ignoreCase = true)) {
                    NotificationScheduler.CHANNEL_ANNOUNCEMENT
                } else {
                    NotificationScheduler.CHANNEL_PRACTICE
                }

                val numericId = notifId.hashCode().coerceAtLeast(1000)
                scheduler.postNotification(
                    id = numericId,
                    channelId = channel,
                    title = title,
                    body = body,
                    destination = actionRoute
                )

                deliveredIds.add(notifId)
                deliveredCount++
            }

            saveDeliveredIds(deliveredIds)
            deliveredCount
        } catch (e: Exception) {
            Log.e(TAG, "Error checking admin notifications: ${e.message}")
            deliveredCount
        }
    }

    /**
     * Broadcasts an admin notification to all or targeted PREPZA students via Firestore.
     */
    suspend fun broadcastNotification(
        title: String,
        body: String,
        targetAudience: String = "ALL",
        priority: String = "HIGH",
        actionRoute: String = "home",
        expiryDays: Int = 7
    ): Boolean = withContext(Dispatchers.IO) {
        val fs = firestore ?: return@withContext false
        val now = System.currentTimeMillis()
        val expiryTime = now + (expiryDays * 24 * 3600 * 1000L)
        val notifId = "notif_${now}_${(1000..9999).random()}"

        val notifData = hashMapOf(
            "id" to notifId,
            "title" to title,
            "body" to body,
            "targetAudience" to targetAudience,
            "priority" to priority,
            "actionRoute" to actionRoute,
            "scheduledAtTimestamp" to now,
            "expiresAtTimestamp" to expiryTime,
            "createdAt" to now
        )

        try {
            fs.collection("admin_notifications").document(notifId)
                .set(notifData, SetOptions.merge())
                .await()
            true
        } catch (e: Exception) {
            Log.e(TAG, "Failed to broadcast admin notification: ${e.message}")
            false
        }
    }

    private fun getDeliveredIds(): Set<String> {
        val raw = prefs.getString(KEY_DELIVERED_IDS, "") ?: ""
        return raw.split(",").filter { it.isNotBlank() }.toSet()
    }

    private fun saveDeliveredIds(ids: Set<String>) {
        // Keep at most 100 recent IDs to keep shared prefs clean
        val trimmed = ids.toList().takeLast(100).joinToString(",")
        prefs.edit().putString(KEY_DELIVERED_IDS, trimmed).apply()
    }
}
