package com.example.workers

import android.content.Context
import android.util.Log
import androidx.work.*
import com.example.data.db.PrepzaDatabase
import com.example.data.firebase.FirebaseManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.withContext
import java.util.concurrent.TimeUnit

/**
 * Background worker that safely synchronizes offline CBT practice sessions,
 * mistakes, bookmarks, and user profile XP/level stats to Cloud Firestore
 * once an internet connection is established.
 */
class CbtOfflineSyncWorker(
    private val context: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(context, workerParams) {

    companion object {
        const val TAG = "CbtOfflineSyncWorker"
        const val WORK_NAME_PERIODIC = "prepza_cbt_offline_sync_periodic"
        const val WORK_NAME_ONE_TIME = "prepza_cbt_offline_sync_immediate"

        /**
         * Schedules periodic background sync when connected to unmetered or metered internet.
         */
        fun schedulePeriodicSync(context: Context) {
            val constraints = Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build()

            val periodicWork = PeriodicWorkRequestBuilder<CbtOfflineSyncWorker>(15, TimeUnit.MINUTES)
                .setConstraints(constraints)
                .build()

            WorkManager.getInstance(context).enqueueUniquePeriodicWork(
                WORK_NAME_PERIODIC,
                ExistingPeriodicWorkPolicy.KEEP,
                periodicWork
            )
        }

        /**
         * Enqueues an immediate background sync attempt when a session is completed or network reconnects.
         */
        fun triggerImmediateSync(context: Context) {
            val constraints = Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build()

            val immediateWork = OneTimeWorkRequestBuilder<CbtOfflineSyncWorker>()
                .setConstraints(constraints)
                .build()

            WorkManager.getInstance(context).enqueueUniqueWork(
                WORK_NAME_ONE_TIME,
                ExistingWorkPolicy.REPLACE,
                immediateWork
            )
        }
    }

    override suspend fun doWork(): Result = withContext(Dispatchers.IO) {
        try {
            Log.d(TAG, "Starting background offline sync to Firestore...")
            val db = PrepzaDatabase.getDatabase(context)
            val firebaseManager = FirebaseManager(context)

            val unsyncedSessions = db.practiceSessionDao().getUnsyncedSessions()
            val activeUser = db.userAccountDao().getActiveAccountOnce()
            val profile = db.userProfileDao().getUserProfileOnce()
            val userEmail = activeUser?.email ?: profile?.email ?: "student@prepza.ng"

            Log.d(TAG, "Found ${unsyncedSessions.size} unsynced CBT sessions.")

            var allSyncedSuccessfully = true

            // 1. Sync pending CBT sessions to Firestore
            for (session in unsyncedSessions) {
                val success = firebaseManager.syncPracticeSessionToFirestore(session, userEmail)
                if (success) {
                    db.practiceSessionDao().markSessionSynced(session.id)
                    Log.d(TAG, "Successfully synced session #${session.id} (${session.mode}) to Firestore")
                } else {
                    allSyncedSuccessfully = false
                    Log.w(TAG, "Failed to sync session #${session.id} to Firestore")
                }
            }

            // 2. Sync user profile stats (XP, level, streak, targetScore)
            if (profile != null) {
                firebaseManager.syncUserProfileToFirestore(profile)
            }

            // 3. Sync active bookmarks
            val bookmarks = db.bookmarkDao().getAllBookmarks().firstOrNull() ?: emptyList()
            if (bookmarks.isNotEmpty()) {
                firebaseManager.syncBookmarksToFirestore(bookmarks, userEmail)
            }

            // 4. Sync active mistakes
            val mistakes = db.mistakeDao().getAllMistakes().firstOrNull() ?: emptyList()
            if (mistakes.isNotEmpty()) {
                firebaseManager.syncMistakesToFirestore(mistakes, userEmail)
            }

            if (allSyncedSuccessfully) {
                Log.d(TAG, "CBT Offline Sync completed successfully.")
                Result.success()
            } else {
                Log.d(TAG, "Some sessions failed to sync, will retry when network conditions improve.")
                Result.retry()
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error during CBT offline sync: ${e.message}", e)
            Result.retry()
        }
    }
}
