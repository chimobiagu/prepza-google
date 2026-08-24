package com.example.data.firebase

import android.content.Context
import android.util.Log
import com.example.data.db.BookmarkEntity
import com.example.data.db.MistakeEntity
import com.example.data.db.PracticeSessionEntity
import com.example.data.db.UserProfileEntity
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

class FirebaseManager(private val context: Context) {

    private val TAG = "PrepzaFirebase"

    private val auth: FirebaseAuth? by lazy {
        try {
            ensureFirebaseInitialized()
            FirebaseAuth.getInstance()
        } catch (e: Exception) {
            Log.w(TAG, "Firebase Auth not available in this environment: ${e.message}")
            null
        }
    }

    private val firestore: FirebaseFirestore? by lazy {
        try {
            ensureFirebaseInitialized()
            FirebaseFirestore.getInstance()
        } catch (e: Exception) {
            Log.w(TAG, "Firebase Firestore not available in this environment: ${e.message}")
            null
        }
    }

    private fun ensureFirebaseInitialized() {
        try {
            if (FirebaseApp.getApps(context).isEmpty()) {
                FirebaseApp.initializeApp(context)
            }
        } catch (e: Exception) {
            Log.w(TAG, "FirebaseApp initialization error: ${e.message}")
        }
    }

    val currentUser: FirebaseUser?
        get() = try {
            auth?.currentUser
        } catch (e: Exception) {
            null
        }

    val isAuthAvailable: Boolean
        get() = auth != null

    val isFirestoreAvailable: Boolean
        get() = firestore != null

    // --- Authentication ---

    suspend fun signInWithGoogleCredential(credential: AuthCredential): Result<FirebaseUser?> = withContext(Dispatchers.IO) {
        val fbAuth = auth ?: return@withContext Result.failure(Exception("Firebase Auth not initialized"))
        try {
            val authResult = fbAuth.signInWithCredential(credential).await()
            Result.success(authResult.user)
        } catch (e: Exception) {
            Log.e(TAG, "Google Sign-In failed: ${e.message}", e)
            Result.failure(e)
        }
    }

    suspend fun signInWithGoogleIdToken(idToken: String): Result<FirebaseUser?> = withContext(Dispatchers.IO) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)
        signInWithGoogleCredential(credential)
    }

    suspend fun signInWithEmail(email: String, pass: String): Result<FirebaseUser?> = withContext(Dispatchers.IO) {
        val fbAuth = auth ?: return@withContext Result.failure(Exception("Firebase Auth not initialized"))
        try {
            val result = fbAuth.signInWithEmailAndPassword(email, pass).await()
            Result.success(result.user)
        } catch (e: Exception) {
            Log.e(TAG, "Email Sign-In failed: ${e.message}", e)
            Result.failure(e)
        }
    }

    suspend fun signUpWithEmail(email: String, pass: String): Result<FirebaseUser?> = withContext(Dispatchers.IO) {
        val fbAuth = auth ?: return@withContext Result.failure(Exception("Firebase Auth not initialized"))
        try {
            val result = fbAuth.createUserWithEmailAndPassword(email, pass).await()
            Result.success(result.user)
        } catch (e: Exception) {
            Log.e(TAG, "Email Sign-Up failed: ${e.message}", e)
            Result.failure(e)
        }
    }

    fun signOut() {
        try {
            auth?.signOut()
        } catch (e: Exception) {
            Log.e(TAG, "Sign out error: ${e.message}")
        }
    }

    // --- Firestore Cloud Persistence & Sync ---

    suspend fun syncUserProfileToFirestore(profile: UserProfileEntity): Boolean = withContext(Dispatchers.IO) {
        val db = firestore ?: return@withContext false
        val uid = currentUser?.uid ?: profile.accountId.ifBlank { return@withContext false }

        val profileData = hashMapOf(
            "name" to profile.name,
            "email" to profile.email,
            "targetScore" to profile.targetScore,
            "jambSubjectsCsv" to profile.jambSubjectsCsv,
            "streakDays" to profile.streakDays,
            "totalXp" to profile.totalXp,
            "level" to profile.level,
            "targetInstitution" to profile.targetInstitution,
            "dreamCourse" to profile.dreamCourse,
            "studyGoalMinutesPerDay" to profile.studyGoalMinutesPerDay,
            "isPlusSubscriber" to profile.isPlusSubscriber,
            "myReferralCode" to profile.myReferralCode,
            "lastUpdatedTimestamp" to System.currentTimeMillis()
        )

        try {
            db.collection("users").document(uid)
                .set(profileData, SetOptions.merge())
                .await()
            true
        } catch (e: Exception) {
            Log.w(TAG, "Failed to sync user profile to Firestore: ${e.message}")
            false
        }
    }

    suspend fun syncPracticeSessionToFirestore(session: PracticeSessionEntity, userEmail: String): Boolean = withContext(Dispatchers.IO) {
        val db = firestore ?: return@withContext false
        val uid = currentUser?.uid ?: userEmail.replace("@", "_").replace(".", "_")

        val percentage = if (session.totalQuestions > 0) (session.score * 100) / session.totalQuestions else 0
        val sessionData = hashMapOf(
            "sessionId" to session.id,
            "subjectsCsv" to session.subjectsCsv,
            "mode" to session.mode,
            "score" to session.score,
            "totalQuestions" to session.totalQuestions,
            "percentage" to percentage,
            "durationSeconds" to session.durationSeconds,
            "timestamp" to session.timestamp,
            "userAnswersJson" to session.userAnswersJson,
            "syncedAt" to System.currentTimeMillis()
        )

        try {
            db.collection("users").document(uid)
                .collection("practice_sessions")
                .document(session.id.toString())
                .set(sessionData, SetOptions.merge())
                .await()
            true
        } catch (e: Exception) {
            Log.w(TAG, "Failed to sync session to Firestore: ${e.message}")
            false
        }
    }

    suspend fun syncBookmarksToFirestore(bookmarks: List<BookmarkEntity>, userEmail: String): Boolean = withContext(Dispatchers.IO) {
        val db = firestore ?: return@withContext false
        val uid = currentUser?.uid ?: userEmail.replace("@", "_").replace(".", "_")

        val bookmarksList = bookmarks.map {
            mapOf(
                "questionId" to it.questionId,
                "timestamp" to it.timestamp,
                "note" to (it.note ?: "")
            )
        }

        try {
            db.collection("users").document(uid)
                .collection("data")
                .document("bookmarks")
                .set(mapOf("bookmarks" to bookmarksList, "count" to bookmarks.size), SetOptions.merge())
                .await()
            true
        } catch (e: Exception) {
            Log.w(TAG, "Failed to sync bookmarks to Firestore: ${e.message}")
            false
        }
    }

    suspend fun syncMistakesToFirestore(mistakes: List<MistakeEntity>, userEmail: String): Boolean = withContext(Dispatchers.IO) {
        val db = firestore ?: return@withContext false
        val uid = currentUser?.uid ?: userEmail.replace("@", "_").replace(".", "_")

        val mistakesList = mistakes.take(100).map {
            mapOf(
                "questionId" to it.questionId,
                "subject" to it.subject,
                "topic" to it.topic,
                "selectedWrongOptionIndex" to it.selectedWrongOptionIndex,
                "attemptCount" to it.attemptCount,
                "isMastered" to it.isMastered,
                "timestamp" to it.timestamp,
                "userNotes" to (it.userNotes ?: "")
            )
        }

        try {
            db.collection("users").document(uid)
                .collection("data")
                .document("mistakes")
                .set(mapOf("mistakes" to mistakesList, "count" to mistakes.size), SetOptions.merge())
                .await()
            true
        } catch (e: Exception) {
            Log.w(TAG, "Failed to sync mistakes to Firestore: ${e.message}")
            false
        }
    }
}
