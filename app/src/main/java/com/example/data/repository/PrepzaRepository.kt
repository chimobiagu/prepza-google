package com.example.data.repository

import android.content.Context
import com.example.data.db.*
import com.example.data.security.LoginRateLimiter
import com.example.data.security.SecurityUtils
import com.example.data.security.ValidationResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.withContext
import java.util.UUID

class PrepzaRepository(context: Context) {
    private val db = PrepzaDatabase.getDatabase(context)
    val firebaseManager = com.example.data.firebase.FirebaseManager(context)

    val userAccountDao = db.userAccountDao()
    val questionDao = db.questionDao()
    val practiceSessionDao = db.practiceSessionDao()
    val mistakeDao = db.mistakeDao()
    val offlinePackDao = db.offlinePackDao()
    val bookmarkDao = db.bookmarkDao()
    val userProfileDao = db.userProfileDao()
    val friendDao = db.friendDao()
    val literatureBookDao = db.literatureBookDao()
    val studyTaskDao = db.studyTaskDao()
    val friendChatMessageDao = db.friendChatMessageDao()
    val questionExposureDao = db.questionExposureDao()

    suspend fun initializeDatabaseIfEmpty() = withContext(Dispatchers.IO) {
        try {
            val existingAccounts = userAccountDao.getAllAccounts().firstOrNull()
            if (existingAccounts.isNullOrEmpty()) {
                val seedAccount = DefaultDataSeed.getSeedAccount()
                userAccountDao.upsertAccount(seedAccount)
            }

            val existingProfile = userProfileDao.getUserProfile().firstOrNull()
            if (existingProfile == null) {
                userProfileDao.saveUserProfile(DefaultDataSeed.getSeedProfile())
            }

            val existingQuestions = questionDao.getAllQuestions().firstOrNull() ?: emptyList()
            val seedQuestions = DefaultDataSeed.getSeedQuestions()
            val combined = com.example.data.engine.QuestionSanitizer.cleanAndDeduplicateQuestions(existingQuestions + seedQuestions)
            questionDao.insertAll(combined)

            val existingPacks = offlinePackDao.getAllPacks().firstOrNull()
            if (existingPacks.isNullOrEmpty()) {
                offlinePackDao.insertAll(DefaultDataSeed.getSeedOfflinePacks())
            }

            val existingMistakes = mistakeDao.getAllMistakes().firstOrNull()
            if (existingMistakes.isNullOrEmpty()) {
                DefaultDataSeed.getSeedMistakes().forEach { mistakeDao.upsertMistake(it) }
            }

            // Clean up any old fake mock friends if present from previous builds
            val existingFriends = friendDao.getAllFriends().firstOrNull() ?: emptyList()
            val oldFakeIds = setOf("f1", "f2", "f3", "f4")
            existingFriends.filter { it.id in oldFakeIds }.forEach {
                friendDao.deleteFriend(it.id)
                friendChatMessageDao.deleteMessagesForFriend(it.id)
            }

            val existingBooks = literatureBookDao.getAllBooks().firstOrNull()
            if (existingBooks.isNullOrEmpty() || existingBooks.none { it.id == "book_she_walks_in_beauty" }) {
                literatureBookDao.insertAll(DefaultDataSeed.getSeedLiteratureBooks())
            }

            val existingTasks = studyTaskDao.getTasksForDate("2026-08-13").firstOrNull()
            if (existingTasks.isNullOrEmpty()) {
                studyTaskDao.insertAll(DefaultDataSeed.getSeedStudyTasks())
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    val activeAccount: Flow<UserAccountEntity?> = userAccountDao.getActiveAccount().catch { emit(null) }
    val allAccounts: Flow<List<UserAccountEntity>> = userAccountDao.getAllAccounts().catch { emit(emptyList()) }
    val userProfile: Flow<UserProfileEntity?> = userProfileDao.getUserProfile().catch { emit(null) }
    val allQuestions: Flow<List<QuestionEntity>> = questionDao.getAllQuestions().catch { emit(emptyList()) }
    val recentSessions: Flow<List<PracticeSessionEntity>> = practiceSessionDao.getRecentSessions(20).catch { emit(emptyList()) }
    val allMistakes: Flow<List<MistakeEntity>> = mistakeDao.getAllMistakes().catch { emit(emptyList()) }
    val unmasteredMistakes: Flow<List<MistakeEntity>> = mistakeDao.getUnmasteredMistakes().catch { emit(emptyList()) }
    val masteredMistakes: Flow<List<MistakeEntity>> = mistakeDao.getMasteredMistakes().catch { emit(emptyList()) }
    val unmasteredMistakesCount: Flow<Int> = mistakeDao.getUnmasteredCount().catch { emit(0) }
    val masteredMistakesCount: Flow<Int> = mistakeDao.getMasteredCount().catch { emit(0) }
    val offlinePacks: Flow<List<OfflinePackEntity>> = offlinePackDao.getAllPacks().catch { emit(emptyList()) }
    val allBookmarks: Flow<List<BookmarkEntity>> = bookmarkDao.getAllBookmarks().catch { emit(emptyList()) }
    val allFriends: Flow<List<FriendEntity>> = friendDao.getAllFriends().catch { emit(emptyList()) }
    val literatureBooks: Flow<List<LiteratureBookEntity>> = literatureBookDao.getAllBooks().catch { emit(emptyList()) }

    fun getQuestionsForSubject(subject: String): Flow<List<QuestionEntity>> {
        return questionDao.getQuestionsBySubject(subject).catch { emit(emptyList()) }
    }

    fun getQuestionsForSubjects(subjects: List<String>): Flow<List<QuestionEntity>> {
        return questionDao.getQuestionsBySubjects(subjects).catch { emit(emptyList()) }
    }

    fun searchQuestions(query: String): Flow<List<QuestionEntity>> {
        return questionDao.searchQuestions(query).catch { emit(emptyList()) }
    }

    suspend fun cleanAllQuestions(): Int = withContext(Dispatchers.IO) {
        val currentQuestions = questionDao.getAllQuestionsOnce()
        val seedQuestions = DefaultDataSeed.getSeedQuestions()
        val allCombined = (currentQuestions + seedQuestions)
        val cleaned = com.example.data.engine.QuestionSanitizer.cleanAndDeduplicateQuestions(allCombined)
        questionDao.deleteAllQuestions()
        questionDao.insertAll(cleaned)
        cleaned.size
    }

    // --- Study Code & Referral Validation Helpers ---

    fun normalizeStudyCode(raw: String): String {
        val clean = raw.trim().uppercase()
        return when {
            clean.startsWith("PRZ-") -> clean
            clean.startsWith("PRZ") && clean.length > 3 -> "PRZ-${clean.substring(3)}"
            clean.matches(Regex("^[0-9A-Z]{4,6}$")) -> "PRZ-$clean"
            else -> clean
        }
    }

    fun isValidStudyCodeFormat(code: String): Boolean {
        val normalized = normalizeStudyCode(code)
        return normalized.matches(Regex("^PRZ-[0-9A-Z]{3,8}$"))
    }

    // --- Authentication & Account Operations ---

    suspend fun signUpWithEmail(
        name: String,
        email: String,
        password: String,
        referralCode: String? = null,
        targetScore: Int = 320,
        subjectsCsv: String = "English Language,Mathematics,Physics,Chemistry"
    ): Result<UserAccountEntity> = withContext(Dispatchers.IO) {
        try {
            val cleanEmail = email.trim().lowercase()
            val cleanName = SecurityUtils.sanitizeUserInput(name).ifBlank { "UTME Candidate" }

            val emailValidation = SecurityUtils.validateEmail(cleanEmail)
            if (emailValidation is ValidationResult.Invalid) {
                return@withContext Result.failure(Exception(emailValidation.reason))
            }

            val passValidation = SecurityUtils.validatePassword(password)
            if (passValidation is ValidationResult.Invalid) {
                return@withContext Result.failure(Exception(passValidation.reason))
            }

            val existing = userAccountDao.getAccountByEmail(cleanEmail)
            if (existing != null) {
                return@withContext Result.failure(Exception("An account with this email already exists. Please log in instead."))
            }

            var cleanReferral: String? = null
            if (!referralCode.isNullOrBlank()) {
                val normalizedRef = normalizeStudyCode(referralCode)
                if (!isValidStudyCodeFormat(normalizedRef)) {
                    return@withContext Result.failure(Exception("Invalid referral code format. E.g. PRZ-4301"))
                }
                cleanReferral = normalizedRef
            }

            // Cryptographically hash the password with dynamic salt
            val hashedPassword = SecurityUtils.hashPassword(password)
            val generatedCode = "PRZ-" + (1000..9999).random()

            userAccountDao.logOutAll()
            val newAccount = UserAccountEntity(
                id = "usr_" + UUID.randomUUID().toString().take(8),
                name = cleanName,
                email = cleanEmail,
                authProvider = "email",
                passwordHash = hashedPassword,
                targetScore = targetScore.coerceIn(100, 400),
                jambSubjectsCsv = subjectsCsv,
                streakDays = 1,
                totalXp = 50,
                level = 1,
                lastActiveDateString = "2026-08-13",
                myReferralCode = generatedCode,
                referredByCode = cleanReferral,
                isLoggedIn = true
            )
            userAccountDao.upsertAccount(newAccount)

            // Sync user profile
            val profileEntity = UserProfileEntity(
                id = 1,
                accountId = newAccount.id,
                name = newAccount.name,
                email = newAccount.email,
                authProvider = "email",
                targetScore = newAccount.targetScore,
                jambSubjectsCsv = newAccount.jambSubjectsCsv,
                streakDays = newAccount.streakDays,
                totalXp = newAccount.totalXp,
                level = newAccount.level,
                studyGoalMinutesPerDay = newAccount.studyGoalMinutesPerDay,
                myReferralCode = generatedCode,
                referredByCode = cleanReferral
            )
            userProfileDao.saveUserProfile(profileEntity)

            // Background Firebase Auth & Firestore sync
            try {
                firebaseManager.signUpWithEmail(cleanEmail, password)
                firebaseManager.syncUserProfileToFirestore(profileEntity)
            } catch (e: Exception) {
                // Graceful fallback to offline
            }

            // If a valid referral was given, auto-add as connected buddy
            if (cleanReferral != null) {
                val friendEntity = FriendEntity(
                    id = "f_" + System.currentTimeMillis(),
                    name = "Study Buddy ($cleanReferral)",
                    accuracyPercent = 0,
                    streakDays = 1,
                    friendCode = cleanReferral,
                    status = "following",
                    isFollowing = true
                )
                friendDao.upsertFriend(friendEntity)
            }

            LoginRateLimiter.recordSuccess(cleanEmail)
            Result.success(newAccount)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun loginWithEmail(email: String, password: String): Result<UserAccountEntity> = withContext(Dispatchers.IO) {
        try {
            val cleanEmail = email.trim().lowercase()

            // Check rate limiting / brute-force lock
            val lockedSec = LoginRateLimiter.isRateLimited(cleanEmail)
            if (lockedSec > 0) {
                return@withContext Result.failure(Exception("Too many failed login attempts. Account temporarily protected. Please try again in $lockedSec seconds."))
            }

            val emailValidation = SecurityUtils.validateEmail(cleanEmail)
            if (emailValidation is ValidationResult.Invalid) {
                return@withContext Result.failure(Exception(emailValidation.reason))
            }

            val account = userAccountDao.getAccountByEmail(cleanEmail)
            if (account == null) {
                // If account does not exist, check password format and auto-register
                val passVal = SecurityUtils.validatePassword(password)
                if (passVal is ValidationResult.Invalid) {
                    return@withContext Result.failure(Exception(passVal.reason))
                }
                return@withContext signUpWithEmail(
                    name = cleanEmail.substringBefore("@").replace(".", " ").replaceFirstChar { it.uppercase() },
                    email = cleanEmail,
                    password = password
                )
            }

            // Verify password hash
            val isPasswordValid = if (account.passwordHash != null && account.passwordHash.contains(":")) {
                SecurityUtils.verifyPassword(password, account.passwordHash)
            } else {
                // Legacy plain check -> upgrade to salted hash
                val match = account.passwordHash == password || account.passwordHash.isNullOrBlank()
                if (match) {
                    userAccountDao.upsertAccount(account.copy(passwordHash = SecurityUtils.hashPassword(password)))
                }
                match
            }

            if (!isPasswordValid) {
                val lockoutSec = LoginRateLimiter.recordFailedAttempt(cleanEmail)
                val msg = if (lockoutSec > 0) {
                    "Too many failed login attempts. Temporarily locked for $lockoutSec seconds."
                } else {
                    "Invalid password for $cleanEmail. Please check your credentials."
                }
                return@withContext Result.failure(Exception(msg))
            }

            // Successful login -> reset rate limit counter
            LoginRateLimiter.recordSuccess(cleanEmail)

            userAccountDao.logOutAll()
            userAccountDao.setActiveAccount(account.id)
            val profileEntity = UserProfileEntity(
                id = 1,
                accountId = account.id,
                name = account.name,
                email = account.email,
                authProvider = account.authProvider,
                targetScore = account.targetScore,
                jambSubjectsCsv = account.jambSubjectsCsv,
                streakDays = account.streakDays,
                totalXp = account.totalXp,
                level = account.level,
                studyGoalMinutesPerDay = account.studyGoalMinutesPerDay
            )
            userProfileDao.saveUserProfile(profileEntity)

            // Firebase sync
            try {
                firebaseManager.signInWithEmail(cleanEmail, password)
                firebaseManager.syncUserProfileToFirestore(profileEntity)
            } catch (e: Exception) {
                // Graceful fallback
            }

            Result.success(account.copy(isLoggedIn = true))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun loginWithGoogle(name: String, email: String, referralCode: String? = null): Result<UserAccountEntity> = withContext(Dispatchers.IO) {
        try {
            val cleanEmail = email.trim().lowercase()
            val existing = userAccountDao.getAccountByEmail(cleanEmail)
            userAccountDao.logOutAll()

            var cleanReferral: String? = null
            if (!referralCode.isNullOrBlank()) {
                val normalizedRef = normalizeStudyCode(referralCode)
                if (isValidStudyCodeFormat(normalizedRef)) {
                    cleanReferral = normalizedRef
                }
            }

            val account = if (existing != null) {
                userAccountDao.setActiveAccount(existing.id)
                existing.copy(isLoggedIn = true)
            } else {
                val generatedCode = "PRZ-" + (1000..9999).random()
                val newAcc = UserAccountEntity(
                    id = "g_" + UUID.randomUUID().toString().take(8),
                    name = name.ifBlank { "UTME Aspirant" },
                    email = cleanEmail,
                    authProvider = "google",
                    targetScore = 320,
                    jambSubjectsCsv = "English Language,Mathematics,Physics,Chemistry",
                    streakDays = 1,
                    totalXp = 100,
                    level = 1,
                    myReferralCode = generatedCode,
                    referredByCode = cleanReferral,
                    isLoggedIn = true
                )
                userAccountDao.upsertAccount(newAcc)
                newAcc
            }

            val googleProfile = UserProfileEntity(
                id = 1,
                accountId = account.id,
                name = account.name,
                email = account.email,
                authProvider = "google",
                targetScore = account.targetScore,
                jambSubjectsCsv = account.jambSubjectsCsv,
                streakDays = account.streakDays,
                totalXp = account.totalXp,
                level = account.level,
                studyGoalMinutesPerDay = account.studyGoalMinutesPerDay,
                myReferralCode = account.myReferralCode,
                referredByCode = account.referredByCode
            )
            userProfileDao.saveUserProfile(googleProfile)

            // Sync to Firebase Firestore
            try {
                firebaseManager.syncUserProfileToFirestore(googleProfile)
            } catch (e: Exception) {
                // Graceful fallback
            }

            if (existing == null && cleanReferral != null) {
                friendDao.upsertFriend(
                    FriendEntity(
                        id = "f_" + System.currentTimeMillis(),
                        name = "Study Buddy ($cleanReferral)",
                        accuracyPercent = 0,
                        streakDays = 1,
                        friendCode = cleanReferral,
                        status = "following",
                        isFollowing = true
                    )
                )
            }

            Result.success(account)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun loginWithPhone(phoneNumber: String, name: String, referralCode: String? = null): Result<UserAccountEntity> = withContext(Dispatchers.IO) {
        try {
            val cleanPhone = phoneNumber.trim()
            val existing = userAccountDao.getAccountByPhone(cleanPhone)
            userAccountDao.logOutAll()

            var cleanReferral: String? = null
            if (!referralCode.isNullOrBlank()) {
                val normalizedRef = normalizeStudyCode(referralCode)
                if (isValidStudyCodeFormat(normalizedRef)) {
                    cleanReferral = normalizedRef
                }
            }

            val account = if (existing != null) {
                userAccountDao.setActiveAccount(existing.id)
                existing.copy(isLoggedIn = true)
            } else {
                val generatedCode = "PRZ-" + (1000..9999).random()
                val newAcc = UserAccountEntity(
                    id = "ph_" + UUID.randomUUID().toString().take(8),
                    name = name.ifBlank { "UTME Candidate" },
                    phoneNumber = cleanPhone,
                    authProvider = "phone",
                    targetScore = 320,
                    jambSubjectsCsv = "English Language,Mathematics,Physics,Chemistry",
                    streakDays = 1,
                    totalXp = 100,
                    level = 1,
                    myReferralCode = generatedCode,
                    referredByCode = cleanReferral,
                    isLoggedIn = true
                )
                userAccountDao.upsertAccount(newAcc)
                newAcc
            }

            userProfileDao.saveUserProfile(
                UserProfileEntity(
                    id = 1,
                    accountId = account.id,
                    name = account.name,
                    phoneNumber = account.phoneNumber,
                    authProvider = "phone",
                    targetScore = account.targetScore,
                    jambSubjectsCsv = account.jambSubjectsCsv,
                    streakDays = account.streakDays,
                    totalXp = account.totalXp,
                    level = account.level,
                    studyGoalMinutesPerDay = account.studyGoalMinutesPerDay,
                    myReferralCode = account.myReferralCode,
                    referredByCode = account.referredByCode
                )
            )

            if (existing == null && cleanReferral != null) {
                friendDao.upsertFriend(
                    FriendEntity(
                        id = "f_" + System.currentTimeMillis(),
                        name = "Study Buddy ($cleanReferral)",
                        accuracyPercent = 0,
                        streakDays = 1,
                        friendCode = cleanReferral,
                        status = "following",
                        isFollowing = true
                    )
                )
            }

            Result.success(account)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun loginAsGuest(): Result<UserAccountEntity> = withContext(Dispatchers.IO) {
        try {
            userAccountDao.logOutAll()
            val guest = UserAccountEntity(
                id = "guest_" + UUID.randomUUID().toString().take(6),
                name = "Candidate (Guest)",
                email = "guest.candidate@prepza.ng",
                authProvider = "guest",
                targetScore = 320,
                jambSubjectsCsv = "English Language,Mathematics,Physics,Chemistry",
                streakDays = 1,
                totalXp = 50,
                level = 1,
                isLoggedIn = true
            )
            userAccountDao.upsertAccount(guest)
            userProfileDao.saveUserProfile(
                UserProfileEntity(
                    id = 1,
                    accountId = guest.id,
                    name = guest.name,
                    email = guest.email,
                    authProvider = "guest",
                    targetScore = guest.targetScore,
                    jambSubjectsCsv = guest.jambSubjectsCsv,
                    streakDays = guest.streakDays,
                    totalXp = guest.totalXp,
                    level = guest.level,
                    studyGoalMinutesPerDay = 45
                )
            )
            Result.success(guest)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun logOut() = withContext(Dispatchers.IO) {
        userAccountDao.logOutAll()
        try {
            firebaseManager.signOut()
        } catch (e: Exception) {
            // Graceful fallback
        }
    }

    suspend fun switchAccount(accountId: String) = withContext(Dispatchers.IO) {
        userAccountDao.logOutAll()
        userAccountDao.setActiveAccount(accountId)
        val active = userAccountDao.getActiveAccountOnce()
        if (active != null) {
            userProfileDao.saveUserProfile(
                UserProfileEntity(
                    id = 1,
                    accountId = active.id,
                    name = active.name,
                    email = active.email,
                    phoneNumber = active.phoneNumber,
                    authProvider = active.authProvider,
                    targetScore = active.targetScore,
                    jambSubjectsCsv = active.jambSubjectsCsv,
                    streakDays = active.streakDays,
                    totalXp = active.totalXp,
                    level = active.level,
                    studyGoalMinutesPerDay = active.studyGoalMinutesPerDay
                )
            )
        }
    }

    suspend fun updateAcademicProfile(
        targetScore: Int,
        jambSubjectsCsv: String,
        studyGoalMinutes: Int? = null,
        targetInstitution: String? = null,
        dreamCourse: String? = null,
        learningStyle: String? = null,
        preferredStudyTime: String? = null,
        jambExamDateTimestamp: Long? = null
    ) = withContext(Dispatchers.IO) {
        val active = userAccountDao.getActiveAccountOnce() ?: DefaultDataSeed.getSeedAccount()
        val updated = active.copy(
            targetScore = targetScore,
            jambSubjectsCsv = jambSubjectsCsv,
            studyGoalMinutesPerDay = studyGoalMinutes ?: active.studyGoalMinutesPerDay,
            targetInstitution = targetInstitution ?: active.targetInstitution,
            dreamCourse = dreamCourse ?: active.dreamCourse,
            learningStyle = learningStyle ?: active.learningStyle,
            preferredStudyTime = preferredStudyTime ?: active.preferredStudyTime,
            jambExamDateTimestamp = jambExamDateTimestamp ?: active.jambExamDateTimestamp
        )
        userAccountDao.upsertAccount(updated)

        val currentProfile = userProfileDao.getUserProfileOnce() ?: DefaultDataSeed.getSeedProfile()
        val updatedProfile = currentProfile.copy(
            targetScore = targetScore,
            jambSubjectsCsv = jambSubjectsCsv,
            studyGoalMinutesPerDay = studyGoalMinutes ?: currentProfile.studyGoalMinutesPerDay,
            targetInstitution = targetInstitution ?: currentProfile.targetInstitution,
            dreamCourse = dreamCourse ?: currentProfile.dreamCourse,
            learningStyle = learningStyle ?: currentProfile.learningStyle,
            preferredStudyTime = preferredStudyTime ?: currentProfile.preferredStudyTime,
            jambExamDateTimestamp = jambExamDateTimestamp ?: currentProfile.jambExamDateTimestamp
        )
        userProfileDao.saveUserProfile(updatedProfile)

        // Sync to Firestore
        try {
            firebaseManager.syncUserProfileToFirestore(updatedProfile)
        } catch (e: Exception) {
            // Graceful fallback
        }
    }

    suspend fun savePracticeSession(
        mode: String,
        score: Int,
        totalQuestions: Int,
        subjectsCsv: String,
        durationSeconds: Long,
        userAnswersMap: Map<String, Int>
    ): Long = withContext(Dispatchers.IO) {
        val activeUser = userAccountDao.getActiveAccountOnce()
        val userId = activeUser?.id ?: "user_default_1"

        val answersJson = userAnswersMap.entries.joinToString(prefix = "{", postfix = "}") {
            "\"${it.key}\": ${it.value}"
        }

        val session = PracticeSessionEntity(
            userId = userId,
            mode = mode,
            score = score,
            totalQuestions = totalQuestions,
            subjectsCsv = subjectsCsv,
            durationSeconds = durationSeconds,
            userAnswersJson = answersJson
        )

        val id = practiceSessionDao.insertSession(session)

        // Update User Profile XP and streak
        val currentXp = activeUser?.totalXp ?: 1450
        val xpGained = score * 10 + 25
        val newXp = currentXp + xpGained
        val newLevel = (newXp / 500) + 1

        if (activeUser != null) {
            userAccountDao.upsertAccount(
                activeUser.copy(
                    totalXp = newXp,
                    level = newLevel
                )
            )
        }

        val profile = userProfileDao.getUserProfileOnce() ?: DefaultDataSeed.getSeedProfile()
        val newProfile = profile.copy(
            totalXp = newXp,
            level = newLevel
        )
        userProfileDao.saveUserProfile(newProfile)

        // Sync practice session & updated profile to Firestore
        try {
            firebaseManager.syncPracticeSessionToFirestore(session.copy(id = id), activeUser?.email ?: "student@prepza.ng")
            firebaseManager.syncUserProfileToFirestore(newProfile)
        } catch (e: Exception) {
            // Graceful fallback
        }

        id
    }

    suspend fun recordQuestionAnswer(
        question: QuestionEntity,
        selectedOptionIndex: Int
    ) = withContext(Dispatchers.IO) {
        val activeUser = userAccountDao.getActiveAccountOnce()
        val userId = activeUser?.id ?: ""
        val isCorrect = selectedOptionIndex == question.correctAnswerIndex

        if (!isCorrect) {
            val existing = mistakeDao.getAllMistakes().firstOrNull()?.find { it.questionId == question.id }
            val count = (existing?.attemptCount ?: 0) + 1
            mistakeDao.upsertMistake(
                MistakeEntity(
                    questionId = question.id,
                    userId = userId,
                    subject = question.subject,
                    topic = question.topic,
                    selectedWrongOptionIndex = selectedOptionIndex,
                    timestamp = System.currentTimeMillis(),
                    attemptCount = count,
                    isMastered = false,
                    userNotes = existing?.userNotes
                )
            )
        } else {
            // If already in mistakes and user gets it right, mark it mastered
            val existing = mistakeDao.getAllMistakes().firstOrNull()?.find { it.questionId == question.id }
            if (existing != null) {
                mistakeDao.markMastered(question.id, true)
            }
        }
    }

    suspend fun markMistakeMastered(questionId: String, isMastered: Boolean = true) = withContext(Dispatchers.IO) {
        mistakeDao.markMastered(questionId, isMastered)
    }

    suspend fun removeMistake(questionId: String) = withContext(Dispatchers.IO) {
        mistakeDao.deleteMistake(questionId)
    }

    suspend fun clearAllMistakes() = withContext(Dispatchers.IO) {
        mistakeDao.clearAllMistakes()
    }

    // --- Offline Pack Management ---

    suspend fun downloadSubjectPack(subject: String, onProgress: ((Int) -> Unit)? = null) = withContext(Dispatchers.IO) {
        offlinePackDao.updateDownloadStatus(subject, isDownloaded = false, progress = 10)
        onProgress?.invoke(10)
        kotlinx.coroutines.delay(200L)
        offlinePackDao.updateDownloadStatus(subject, isDownloaded = false, progress = 45)
        onProgress?.invoke(45)
        kotlinx.coroutines.delay(250L)
        offlinePackDao.updateDownloadStatus(subject, isDownloaded = false, progress = 80)
        onProgress?.invoke(80)
        kotlinx.coroutines.delay(150L)
        offlinePackDao.updateDownloadStatus(subject, isDownloaded = true, progress = 100)
        onProgress?.invoke(100)
    }

    suspend fun downloadAllSubjectsPacks(subjects: List<String>) = withContext(Dispatchers.IO) {
        subjects.forEach { subj ->
            offlinePackDao.updateDownloadStatus(subj, isDownloaded = true, progress = 100)
        }
    }

    suspend fun deleteOfflinePack(subject: String) = withContext(Dispatchers.IO) {
        offlinePackDao.updateDownloadStatus(subject, isDownloaded = false, progress = 0)
    }

    suspend fun toggleBookmark(questionId: String, currentIsBookmarked: Boolean) = withContext(Dispatchers.IO) {
        val activeUser = userAccountDao.getActiveAccountOnce()
        val userId = activeUser?.id ?: ""

        if (currentIsBookmarked) {
            bookmarkDao.removeBookmark(questionId)
        } else {
            bookmarkDao.addBookmark(
                BookmarkEntity(
                    questionId = questionId,
                    userId = userId,
                    timestamp = System.currentTimeMillis()
                )
            )
        }
    }

    // --- Question Exposure Tracking (Smart Non-Repetition) ---

    suspend fun recordQuestionExposures(questions: List<QuestionEntity>) = withContext(Dispatchers.IO) {
        val activeUser = userAccountDao.getActiveAccountOnce()
        val userId = activeUser?.id ?: "user_default_1"
        val existingExposures = questionExposureDao.getExposuresForUser(userId).associateBy { it.questionId }
        val now = System.currentTimeMillis()

        val updatedList = questions.map { q ->
            val existing = existingExposures[q.id]
            val newCount = (existing?.exposureCount ?: 0) + 1
            QuestionExposureEntity(
                questionId = q.id,
                userId = userId,
                subject = q.subject,
                exposureCount = newCount,
                lastExposedTimestamp = now
            )
        }
        questionExposureDao.recordExposures(updatedList)
    }

    suspend fun getExposuresForUser(): List<QuestionExposureEntity> = withContext(Dispatchers.IO) {
        val activeUser = userAccountDao.getActiveAccountOnce()
        val userId = activeUser?.id ?: "user_default_1"
        questionExposureDao.getExposuresForUser(userId)
    }

    suspend fun getExposedQuestionIds(): List<String> = withContext(Dispatchers.IO) {
        val activeUser = userAccountDao.getActiveAccountOnce()
        val userId = activeUser?.id ?: "user_default_1"
        questionExposureDao.getExposedQuestionIds(userId)
    }


    suspend fun updateUserProfile(
        name: String,
        targetScore: Int,
        jambSubjectsCsv: String,
        targetInstitution: String? = null,
        dreamCourse: String? = null,
        learningStyle: String? = null,
        studyGoalMinutes: Int? = null,
        jambExamDateTimestamp: Long? = null
    ) = withContext(Dispatchers.IO) {
        val active = userAccountDao.getActiveAccountOnce()
        if (active != null) {
            userAccountDao.upsertAccount(
                active.copy(
                    name = name,
                    targetScore = targetScore,
                    jambSubjectsCsv = jambSubjectsCsv,
                    targetInstitution = targetInstitution ?: active.targetInstitution,
                    dreamCourse = dreamCourse ?: active.dreamCourse,
                    learningStyle = learningStyle ?: active.learningStyle,
                    studyGoalMinutesPerDay = studyGoalMinutes ?: active.studyGoalMinutesPerDay,
                    jambExamDateTimestamp = jambExamDateTimestamp ?: active.jambExamDateTimestamp
                )
            )
        }

        val current = userProfileDao.getUserProfileOnce() ?: DefaultDataSeed.getSeedProfile()
        userProfileDao.saveUserProfile(
            current.copy(
                name = name,
                targetScore = targetScore,
                jambSubjectsCsv = jambSubjectsCsv,
                targetInstitution = targetInstitution ?: current.targetInstitution,
                dreamCourse = dreamCourse ?: current.dreamCourse,
                learningStyle = learningStyle ?: current.learningStyle,
                studyGoalMinutesPerDay = studyGoalMinutes ?: current.studyGoalMinutesPerDay,
                jambExamDateTimestamp = jambExamDateTimestamp ?: current.jambExamDateTimestamp
            )
        )
    }

    suspend fun updateJambExamDate(timestamp: Long) = withContext(Dispatchers.IO) {
        val active = userAccountDao.getActiveAccountOnce()
        if (active != null) {
            userAccountDao.upsertAccount(active.copy(jambExamDateTimestamp = timestamp))
        }
        val current = userProfileDao.getUserProfileOnce() ?: DefaultDataSeed.getSeedProfile()
        userProfileDao.saveUserProfile(current.copy(jambExamDateTimestamp = timestamp))
    }

    fun getChatMessagesForFriend(friendId: String): Flow<List<FriendChatMessageEntity>> {
        return friendChatMessageDao.getMessagesForFriend(friendId).catch { emit(emptyList()) }
    }

    val allChatMessages: Flow<List<FriendChatMessageEntity>> = friendChatMessageDao.getAllMessages().catch { emit(emptyList()) }

    suspend fun sendChatMessage(
        friendId: String,
        text: String,
        isFromMe: Boolean = true,
        senderName: String = "Chinedu Okafor"
    ): FriendChatMessageEntity = withContext(Dispatchers.IO) {
        val msg = FriendChatMessageEntity(
            id = "msg_${System.currentTimeMillis()}_${(100..999).random()}",
            friendId = friendId,
            senderName = senderName,
            text = text,
            timestamp = System.currentTimeMillis(),
            isFromMe = isFromMe,
            isRead = true
        )
        friendChatMessageDao.insertMessage(msg)
        msg
    }

    suspend fun updateFriendStatus(friendId: String, newStatus: String) = withContext(Dispatchers.IO) {
        val friends = friendDao.getAllFriends().firstOrNull() ?: emptyList()
        val target = friends.find { it.id == friendId || it.name.equals(friendId, ignoreCase = true) }
        if (target != null) {
            friendDao.upsertFriend(target.copy(status = newStatus, isFollowing = (newStatus == "following")))

            // When friend request is accepted, send initial greeting message from the friend to start conversation
            if (newStatus == "following") {
                val existingMsgs = friendChatMessageDao.getMessagesForFriend(target.id).firstOrNull()
                if (existingMsgs.isNullOrEmpty()) {
                    val welcomeMsg = FriendChatMessageEntity(
                        id = "msg_${System.currentTimeMillis()}",
                        friendId = target.id,
                        senderName = target.name,
                        text = "Hey! Thanks for connecting. Let's study and crush our JAMB UTME goals together! What subject are you practicing today?",
                        timestamp = System.currentTimeMillis(),
                        isFromMe = false
                    )
                    friendChatMessageDao.insertMessage(welcomeMsg)
                }
            }
        }
    }

    suspend fun addFriendByCode(code: String): Result<FriendEntity> = withContext(Dispatchers.IO) {
        val trimmed = code.trim()
        if (trimmed.isBlank()) {
            return@withContext Result.failure(Exception("Please enter a study code."))
        }

        val normalized = normalizeStudyCode(trimmed)
        if (!isValidStudyCodeFormat(normalized)) {
            return@withContext Result.failure(Exception("invalid code"))
        }

        val currentProfile = userProfileDao.getUserProfileOnce()
        val myCode = currentProfile?.myReferralCode?.uppercase() ?: ""
        if (normalized.equals(myCode, ignoreCase = true)) {
            return@withContext Result.failure(Exception("You cannot add your own study code."))
        }

        val existingFriends = friendDao.getAllFriends().firstOrNull() ?: emptyList()
        if (existingFriends.any { it.friendCode.equals(normalized, ignoreCase = true) }) {
            return@withContext Result.failure(Exception("This study buddy is already in your list."))
        }

        val newId = "f_" + System.currentTimeMillis()
        val friendName = "Study Buddy ($normalized)"
        val newFriend = FriendEntity(
            id = newId,
            name = friendName,
            accuracyPercent = 0,
            streakDays = 1,
            friendCode = normalized,
            status = "following",
            isFollowing = true
        )
        friendDao.upsertFriend(newFriend)
        Result.success(newFriend)
    }

    suspend fun applyReferralCode(rawCode: String): Result<String> = withContext(Dispatchers.IO) {
        val trimmed = rawCode.trim()
        if (trimmed.isBlank()) {
            return@withContext Result.failure(Exception("Please enter a referral code."))
        }
        val normalized = normalizeStudyCode(trimmed)
        if (!isValidStudyCodeFormat(normalized)) {
            return@withContext Result.failure(Exception("invalid code"))
        }

        val currentProfile = userProfileDao.getUserProfileOnce() ?: DefaultDataSeed.getSeedProfile()
        if (normalized.equals(currentProfile.myReferralCode, ignoreCase = true)) {
            return@withContext Result.failure(Exception("You cannot use your own referral code."))
        }

        if (!currentProfile.referredByCode.isNullOrBlank()) {
            return@withContext Result.failure(Exception("You have already used a referral code (${currentProfile.referredByCode})."))
        }

        val updated = currentProfile.copy(
            referredByCode = normalized
        )
        userProfileDao.saveUserProfile(updated)

        val activeAcc = userAccountDao.getActiveAccountOnce()
        if (activeAcc != null) {
            userAccountDao.upsertAccount(activeAcc.copy(referredByCode = normalized))
        }

        // Also auto-add the referee to buddies if not already added
        val existingFriends = friendDao.getAllFriends().firstOrNull() ?: emptyList()
        if (!existingFriends.any { it.friendCode.equals(normalized, ignoreCase = true) }) {
            val newFriend = FriendEntity(
                id = "f_" + System.currentTimeMillis(),
                name = "Study Buddy ($normalized)",
                accuracyPercent = 0,
                streakDays = 1,
                friendCode = normalized,
                status = "following",
                isFollowing = true
            )
            friendDao.upsertFriend(newFriend)
        }

        Result.success("Referral code $normalized linked successfully!")
    }

    suspend fun recordSuccessfulReferral(): UserProfileEntity = withContext(Dispatchers.IO) {
        val current = userProfileDao.getUserProfileOnce() ?: DefaultDataSeed.getSeedProfile()
        val newCount = current.referralCount + 1
        val unlockReward = newCount >= 10

        val updated = current.copy(
            referralCount = newCount,
            freePlusRewardUnlocked = if (unlockReward) true else current.freePlusRewardUnlocked,
            isPlusSubscriber = if (unlockReward) true else current.isPlusSubscriber,
            trialDurationDays = if (unlockReward && !current.freePlusRewardUnlocked) current.trialDurationDays + 30 else current.trialDurationDays
        )
        userProfileDao.saveUserProfile(updated)

        val active = userAccountDao.getActiveAccountOnce()
        if (active != null) {
            userAccountDao.upsertAccount(
                active.copy(
                    referralCount = newCount,
                    freePlusRewardUnlocked = if (unlockReward) true else active.freePlusRewardUnlocked
                )
            )
        }
        updated
    }

    suspend fun addCustomFriend(name: String, code: String, accuracy: Int = 0, streak: Int = 1): FriendEntity = withContext(Dispatchers.IO) {
        val newId = "f_" + System.currentTimeMillis()
        val friend = FriendEntity(
            id = newId,
            name = name.trim(),
            accuracyPercent = accuracy,
            streakDays = streak,
            friendCode = code.trim().uppercase().ifBlank { "PRZ-" + (1000..9999).random() },
            status = "following",
            isFollowing = true
        )
        friendDao.upsertFriend(friend)
        friend
    }

    suspend fun removeFriend(friendId: String) = withContext(Dispatchers.IO) {
        friendDao.deleteFriend(friendId)
        friendChatMessageDao.deleteMessagesForFriend(friendId)
    }

    // --- Prepza Plus & Trial Management ---

    suspend fun upgradeToPrepzaPlus(): Boolean = withContext(Dispatchers.IO) {
        val current = userProfileDao.getUserProfileOnce() ?: DefaultDataSeed.getSeedProfile()
        userProfileDao.saveUserProfile(
            current.copy(
                isPlusSubscriber = true
            )
        )
        true
    }

    suspend fun dismissMilestoneReminder(milestone: Int) = withContext(Dispatchers.IO) {
        val current = userProfileDao.getUserProfileOnce() ?: return@withContext
        val currentDismissed = current.dismissedReminderMilestonesCsv.split(",").filter { it.isNotBlank() }.toMutableSet()
        currentDismissed.add(milestone.toString())
        userProfileDao.saveUserProfile(
            current.copy(dismissedReminderMilestonesCsv = currentDismissed.joinToString(","))
        )
    }

    suspend fun simulateTrialDaysPassed(days: Int) = withContext(Dispatchers.IO) {
        val current = userProfileDao.getUserProfileOnce() ?: return@withContext
        userProfileDao.saveUserProfile(
            current.copy(
                simulatedDaysPassed = days,
                isPlusSubscriber = false
            )
        )
    }

    suspend fun resetTrial() = withContext(Dispatchers.IO) {
        val current = userProfileDao.getUserProfileOnce() ?: return@withContext
        userProfileDao.saveUserProfile(
            current.copy(
                isPlusSubscriber = false,
                trialStartDate = System.currentTimeMillis(),
                simulatedDaysPassed = 0,
                dismissedReminderMilestonesCsv = ""
            )
        )
    }
}
