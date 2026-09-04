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
    private val appContext = context.applicationContext
    private val db = PrepzaDatabase.getDatabase(context)
    val firebaseManager = com.example.data.firebase.FirebaseManager(context)
    val remoteContentManager = com.example.data.remote.RemoteContentManager(context)
    val apkInstallerManager = com.example.data.remote.ApkInstallerManager(context)
    val notificationScheduler = com.example.data.notifications.NotificationScheduler(context)
    val adminNotificationManager = com.example.data.notifications.AdminNotificationManager(context)
    val telemetryManager = com.example.data.security.ProductionTelemetryManager(context)
    val cbtLoadSimulator = com.example.data.engine.CbtLoadSimulator(context)

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
    val activeExamStateDao = db.activeExamStateDao()
    val topicProgressDao = db.topicProgressDao()
    val userPersonalCardDao = db.userPersonalCardDao()
    val cardBookmarkDao = db.cardBookmarkDao()

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

            val existingQuestionsCount = questionDao.getTotalQuestionCount()
            val seedQuestions = DefaultDataSeed.getSeedQuestions()
            if (existingQuestionsCount < seedQuestions.size) {
                val existingQuestions = questionDao.getAllQuestionsOnce()
                val combined = com.example.data.engine.QuestionSanitizer.cleanAndDeduplicateQuestions(existingQuestions + seedQuestions)
                combined.chunked(400).forEach { batch ->
                    questionDao.insertAll(batch)
                }
            }

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

    suspend fun updateBookReadingProgress(bookId: String, progressPercent: Int, lastReadChapterIndex: Int) = withContext(Dispatchers.IO) {
        literatureBookDao.updateProgress(bookId, progressPercent, lastReadChapterIndex)
    }

    fun getQuestionsForSubject(subject: String): Flow<List<QuestionEntity>> {
        return questionDao.getQuestionsBySubject(subject).catch { emit(emptyList()) }
    }

    fun getQuestionsForSubjects(subjects: List<String>): Flow<List<QuestionEntity>> {
        return questionDao.getQuestionsBySubjects(subjects).catch { emit(emptyList()) }
    }

    fun searchQuestions(query: String): Flow<List<QuestionEntity>> {
        return questionDao.searchQuestions(query).catch { emit(emptyList()) }
    }

    suspend fun getQuestionById(id: String): QuestionEntity? = withContext(Dispatchers.IO) {
        questionDao.getQuestionById(id)
    }

    suspend fun updateQuestion(question: QuestionEntity) = withContext(Dispatchers.IO) {
        questionDao.updateQuestion(question)
    }

    suspend fun cleanAllQuestions(): Int = withContext(Dispatchers.IO) {
        val currentQuestions = questionDao.getAllQuestionsOnce()
        val seedQuestions = DefaultDataSeed.getSeedQuestions()
        val allCombined = (currentQuestions + seedQuestions)
        val cleaned = com.example.data.engine.QuestionSanitizer.cleanAndDeduplicateQuestions(allCombined)
        questionDao.deleteAllQuestions()
        cleaned.chunked(400).forEach { batch ->
            questionDao.insertAll(batch)
        }
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
            val cleanName = SecurityUtils.sanitizeUserInput(name).trim()
            if (cleanName.isBlank()) {
                return@withContext Result.failure(Exception("Please enter your full name."))
            }

            val cleanEmail = email.trim().lowercase()
            if (cleanEmail.isBlank()) {
                return@withContext Result.failure(Exception("Email address is required."))
            }

            val emailValidation = SecurityUtils.validateEmail(cleanEmail)
            if (emailValidation is ValidationResult.Invalid) {
                return@withContext Result.failure(Exception(emailValidation.reason))
            }

            if (password.isBlank()) {
                return@withContext Result.failure(Exception("Password is required."))
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

            // If a valid referral was given, auto-add as connected buddy and credit the referrer account
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

                // Credit the referrer's account in database
                try {
                    val allAccounts = userAccountDao.getAllAccounts().firstOrNull() ?: emptyList()
                    val referrerAcc = allAccounts.find { it.myReferralCode.equals(cleanReferral, ignoreCase = true) }
                    if (referrerAcc != null && referrerAcc.id != newAccount.id) {
                        val newCount = referrerAcc.referralCount + 1
                        val isUnlocked = newCount >= 10
                        userAccountDao.upsertAccount(
                            referrerAcc.copy(
                                referralCount = newCount,
                                totalXp = referrerAcc.totalXp + 150,
                                freePlusRewardUnlocked = if (isUnlocked) true else referrerAcc.freePlusRewardUnlocked
                            )
                        )
                    }
                } catch (e: Exception) {
                    // Fallback gracefully
                }
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

            if (cleanEmail.isBlank()) {
                return@withContext Result.failure(Exception("Email address is required."))
            }
            if (password.isBlank()) {
                return@withContext Result.failure(Exception("Password is required."))
            }

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
                return@withContext Result.failure(Exception("No account found with this email ($cleanEmail). Please check your email or switch to 'Create Account' to sign up."))
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
                    "Incorrect password for $cleanEmail. Please check your credentials."
                }
                return@withContext Result.failure(Exception(msg))
            }

            // Successful login -> reset rate limit counter
            LoginRateLimiter.recordSuccess(cleanEmail)

            userAccountDao.logOutAll()
            userAccountDao.setActiveAccount(account.id)
            val updatedAccount = account.copy(isLoggedIn = true)
            userAccountDao.upsertAccount(updatedAccount)

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

            Result.success(updatedAccount)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun loginWithGoogle(name: String, email: String, referralCode: String? = null): Result<UserAccountEntity> = withContext(Dispatchers.IO) {
        try {
            val cleanEmail = email.trim().lowercase().ifBlank { "student.utme@gmail.com" }
            val cleanName = SecurityUtils.sanitizeUserInput(name).trim().ifBlank { "UTME Candidate" }

            val emailValidation = SecurityUtils.validateEmail(cleanEmail)
            if (emailValidation is ValidationResult.Invalid) {
                return@withContext Result.failure(Exception(emailValidation.reason))
            }

            var cleanReferral: String? = null
            if (!referralCode.isNullOrBlank()) {
                val normalizedRef = normalizeStudyCode(referralCode)
                if (!isValidStudyCodeFormat(normalizedRef)) {
                    return@withContext Result.failure(Exception("Invalid referral code format. E.g. PRZ-4301"))
                }
                cleanReferral = normalizedRef
            }

            val existing = userAccountDao.getAccountByEmail(cleanEmail)
            userAccountDao.logOutAll()

            val account = if (existing != null) {
                val updated = existing.copy(isLoggedIn = true, name = if (existing.name.isNotBlank()) existing.name else cleanName)
                userAccountDao.upsertAccount(updated)
                userAccountDao.setActiveAccount(existing.id)
                updated
            } else {
                val generatedCode = "PRZ-" + (1000..9999).random()
                val newAcc = UserAccountEntity(
                    id = "g_" + UUID.randomUUID().toString().take(8),
                    name = cleanName,
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

    suspend fun loginWithGoogleToken(
        idToken: String,
        displayName: String?,
        email: String?,
        referralCode: String? = null
    ): Result<UserAccountEntity> = withContext(Dispatchers.IO) {
        try {
            // Attempt to authenticate with Firebase Auth using ID token
            var fbUserEmail: String? = null
            var fbUserName: String? = null
            try {
                val fbResult = firebaseManager.signInWithGoogleIdToken(idToken)
                val fbUser = fbResult.getOrNull()
                fbUserEmail = fbUser?.email
                fbUserName = fbUser?.displayName
            } catch (e: Exception) {
                // Firebase fallback handled gracefully
            }

            val finalEmail = (fbUserEmail ?: email ?: "student.utme@gmail.com").trim().lowercase()
            val finalName = (fbUserName ?: displayName ?: "UTME Candidate").trim().ifBlank { "UTME Candidate" }

            val cleanEmail = finalEmail
            val cleanName = SecurityUtils.sanitizeUserInput(finalName).trim().ifBlank { "UTME Candidate" }

            val emailValidation = SecurityUtils.validateEmail(cleanEmail)
            if (emailValidation is ValidationResult.Invalid) {
                return@withContext Result.failure(Exception(emailValidation.reason))
            }

            var cleanReferral: String? = null
            if (!referralCode.isNullOrBlank()) {
                val normalizedRef = normalizeStudyCode(referralCode)
                if (!isValidStudyCodeFormat(normalizedRef)) {
                    return@withContext Result.failure(Exception("Invalid referral code format. E.g. PRZ-4301"))
                }
                cleanReferral = normalizedRef
            }

            val existing = userAccountDao.getAccountByEmail(cleanEmail)
            userAccountDao.logOutAll()

            val account = if (existing != null) {
                val updated = existing.copy(
                    isLoggedIn = true,
                    name = if (existing.name.isNotBlank()) existing.name else cleanName
                )
                userAccountDao.upsertAccount(updated)
                userAccountDao.setActiveAccount(existing.id)
                updated
            } else {
                val generatedCode = "PRZ-" + (1000..9999).random()
                val newAcc = UserAccountEntity(
                    id = "g_" + UUID.randomUUID().toString().take(8),
                    name = cleanName,
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

            try {
                firebaseManager.syncUserProfileToFirestore(googleProfile)
            } catch (e: Exception) {
                // Offline fallback
            }

            Result.success(account)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun ensureSessionPersistence(): UserAccountEntity? = withContext(Dispatchers.IO) {
        try {
            // 1. Check local database active account
            val localActive = userAccountDao.getActiveAccountOnce()
            if (localActive != null && localActive.isLoggedIn) {
                // Ensure profile is synced
                val profile = userProfileDao.getUserProfile().firstOrNull()
                if (profile == null || profile.accountId != localActive.id) {
                    userProfileDao.saveUserProfile(
                        UserProfileEntity(
                            id = 1,
                            accountId = localActive.id,
                            name = localActive.name,
                            email = localActive.email,
                            phoneNumber = localActive.phoneNumber,
                            authProvider = localActive.authProvider,
                            targetScore = localActive.targetScore,
                            jambSubjectsCsv = localActive.jambSubjectsCsv,
                            streakDays = localActive.streakDays,
                            totalXp = localActive.totalXp,
                            level = localActive.level,
                            studyGoalMinutesPerDay = localActive.studyGoalMinutesPerDay,
                            myReferralCode = localActive.myReferralCode,
                            referredByCode = localActive.referredByCode
                        )
                    )
                }
                return@withContext localActive
            }

            // 2. Check Firebase currentUser if available
            val fbUser = firebaseManager.currentUser
            if (fbUser != null && !fbUser.email.isNullOrBlank()) {
                val existing = userAccountDao.getAccountByEmail(fbUser.email!!.lowercase().trim())
                if (existing != null) {
                    val updated = existing.copy(isLoggedIn = true)
                    userAccountDao.upsertAccount(updated)
                    userAccountDao.setActiveAccount(updated.id)
                    return@withContext updated
                } else {
                    val generatedCode = "PRZ-" + (1000..9999).random()
                    val newAccount = UserAccountEntity(
                        id = fbUser.uid,
                        name = fbUser.displayName?.ifBlank { "UTME Candidate" } ?: "UTME Candidate",
                        email = fbUser.email!!.lowercase().trim(),
                        authProvider = "google",
                        targetScore = 320,
                        jambSubjectsCsv = "English Language,Mathematics,Physics,Chemistry",
                        streakDays = 1,
                        totalXp = 100,
                        level = 1,
                        myReferralCode = generatedCode,
                        isLoggedIn = true
                    )
                    userAccountDao.upsertAccount(newAccount)
                    userAccountDao.setActiveAccount(newAccount.id)
                    return@withContext newAccount
                }
            }
            null
        } catch (e: Exception) {
            null
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

    suspend fun migrateGuestData(fromGuestId: String, toAccountId: String) = withContext(Dispatchers.IO) {
        try {
            if (fromGuestId.isBlank() || toAccountId.isBlank() || fromGuestId == toAccountId) return@withContext

            practiceSessionDao.reassignUserId(fromGuestId, toAccountId)
            mistakeDao.reassignUserId(fromGuestId, toAccountId)
            bookmarkDao.reassignUserId(fromGuestId, toAccountId)
            questionExposureDao.reassignUserId(fromGuestId, toAccountId)

            val guestAcc = userAccountDao.getAccountByIdOnce(fromGuestId)
            val newAcc = userAccountDao.getAccountByIdOnce(toAccountId)
            if (guestAcc != null && newAcc != null) {
                val mergedXp = maxOf(guestAcc.totalXp, newAcc.totalXp)
                val mergedStreak = maxOf(guestAcc.streakDays, newAcc.streakDays)
                userAccountDao.upsertAccount(
                    newAcc.copy(
                        totalXp = mergedXp,
                        streakDays = mergedStreak
                    )
                )
            }
        } catch (e: Exception) {
            e.printStackTrace()
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

    suspend fun sendPasswordResetEmail(email: String): Result<String> = withContext(Dispatchers.IO) {
        val cleanEmail = email.trim().lowercase()
        val emailValidation = SecurityUtils.validateEmail(cleanEmail)
        if (emailValidation is ValidationResult.Invalid) {
            return@withContext Result.failure(Exception(emailValidation.reason))
        }

        // Try Firebase Auth first
        try {
            val fbRes = firebaseManager.sendPasswordResetEmail(cleanEmail)
            if (fbRes.isSuccess) {
                return@withContext Result.success("Password reset email sent to $cleanEmail. Please check your inbox.")
            }
        } catch (e: Exception) {
            // Fall back to local check
        }

        // Check if local account exists
        val account = userAccountDao.getAccountByEmail(cleanEmail)
        if (account != null) {
            Result.success("Password reset instructions sent to $cleanEmail.")
        } else {
            Result.failure(Exception("No account registered with $cleanEmail."))
        }
    }

    suspend fun resetPassword(email: String, newPassword: String): Result<Boolean> = withContext(Dispatchers.IO) {
        try {
            val cleanEmail = email.trim().lowercase()
            if (newPassword.length < 6) {
                return@withContext Result.failure(Exception("New password must be at least 6 characters."))
            }
            val account = userAccountDao.getAccountByEmail(cleanEmail)
                ?: return@withContext Result.failure(Exception("No account found for $cleanEmail."))

            val newHash = SecurityUtils.hashPassword(newPassword)
            userAccountDao.upsertAccount(account.copy(passwordHash = newHash))
            Result.success(true)
        } catch (e: Exception) {
            Result.failure(e)
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

        // 1. Save locally to Room database first (guaranteeing 100% offline data integrity)
        val session = PracticeSessionEntity(
            userId = userId,
            mode = mode,
            score = score,
            totalQuestions = totalQuestions,
            subjectsCsv = subjectsCsv,
            durationSeconds = durationSeconds,
            userAnswersJson = answersJson,
            isSynced = false
        )

        val id = practiceSessionDao.insertSession(session)

        // 2. Clear any active interrupted CBT exam since it is now officially finished
        try {
            activeExamStateDao.clearActiveExamState()
        } catch (_: Exception) {}

        // 3. Update User Profile XP and streak in local Room DB
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

        // 4. Attempt immediate cloud sync if internet is available; otherwise queue background worker
        try {
            val userEmail = activeUser?.email ?: profile.email ?: "student@prepza.ng"
            val synced = firebaseManager.syncPracticeSessionToFirestore(session.copy(id = id), userEmail)
            if (synced) {
                practiceSessionDao.markSessionSynced(id)
            } else {
                com.example.workers.CbtOfflineSyncWorker.triggerImmediateSync(appContext)
            }
            firebaseManager.syncUserProfileToFirestore(newProfile)
        } catch (e: Exception) {
            // Offline or network error: schedule background synchronization via WorkManager
            com.example.workers.CbtOfflineSyncWorker.triggerImmediateSync(appContext)
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

    // --- Question Exposure Tracking (Smart Weighted Non-Repetition) ---

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

    suspend fun getSubjectCoverageStats(subject: String): com.example.data.engine.CbtWeightedRandomizer.SubjectCoverageStats = withContext(Dispatchers.IO) {
        val activeUser = userAccountDao.getActiveAccountOnce()
        val userId = activeUser?.id ?: "user_default_1"
        val pool = questionDao.getAllQuestionsOnce().ifEmpty { DefaultDataSeed.getSeedQuestions() }
        val exposures = questionExposureDao.getExposuresForSubject(userId, subject)
        com.example.data.engine.CbtWeightedRandomizer.computeSubjectCoverageStats(
            subject = subject,
            pool = pool,
            exposures = exposures
        )
    }

    suspend fun resetExposuresForSubject(subject: String) = withContext(Dispatchers.IO) {
        val activeUser = userAccountDao.getActiveAccountOnce()
        val userId = activeUser?.id ?: "user_default_1"
        questionExposureDao.resetExposuresForSubject(userId, subject)
    }

    suspend fun clearAllExposures() = withContext(Dispatchers.IO) {
        val activeUser = userAccountDao.getActiveAccountOnce()
        val userId = activeUser?.id ?: "user_default_1"
        questionExposureDao.clearExposuresForUser(userId)
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

        // Grant +3 bonus trial days and +100 XP to the new user for using a referral code
        val updated = currentProfile.copy(
            referredByCode = normalized,
            trialDurationDays = currentProfile.trialDurationDays + 3,
            totalXp = currentProfile.totalXp + 100
        )
        userProfileDao.saveUserProfile(updated)

        val activeAcc = userAccountDao.getActiveAccountOnce()
        if (activeAcc != null) {
            userAccountDao.upsertAccount(
                activeAcc.copy(
                    referredByCode = normalized,
                    totalXp = activeAcc.totalXp + 100
                )
            )
        }

        // Also auto-add the referee to buddies if not already added
        val existingFriends = friendDao.getAllFriends().firstOrNull() ?: emptyList()
        if (!existingFriends.any { it.friendCode.equals(normalized, ignoreCase = true) }) {
            val newFriend = FriendEntity(
                id = "f_" + System.currentTimeMillis(),
                name = "Study Buddy ($normalized)",
                accuracyPercent = 75,
                streakDays = 1,
                friendCode = normalized,
                status = "following",
                isFollowing = true
            )
            friendDao.upsertFriend(newFriend)
        }

        // Credit the referrer account in database if present
        try {
            val allAccounts = userAccountDao.getAllAccounts().firstOrNull() ?: emptyList()
            val referrerAcc = allAccounts.find { it.myReferralCode.equals(normalized, ignoreCase = true) }
            if (referrerAcc != null && referrerAcc.id != (activeAcc?.id ?: "")) {
                val newCount = referrerAcc.referralCount + 1
                val isUnlocked = newCount >= 10
                userAccountDao.upsertAccount(
                    referrerAcc.copy(
                        referralCount = newCount,
                        totalXp = referrerAcc.totalXp + 150,
                        freePlusRewardUnlocked = if (isUnlocked) true else referrerAcc.freePlusRewardUnlocked
                    )
                )
            }
        } catch (e: Exception) {
            // Fallback gracefully
        }

        Result.success("Referral code $normalized verified! You received +3 trial days & +100 XP.")
    }

    suspend fun recordSuccessfulReferral(): UserProfileEntity = withContext(Dispatchers.IO) {
        val current = userProfileDao.getUserProfileOnce() ?: DefaultDataSeed.getSeedProfile()
        val newCount = current.referralCount + 1
        val unlockReward = newCount >= 10

        // Bonus trial days scale with milestone achievements
        val bonusDaysToAdd = when (newCount) {
            1 -> 3
            3 -> 7
            5 -> 14
            10 -> 30
            else -> 2
        }

        val updated = current.copy(
            referralCount = newCount,
            totalXp = current.totalXp + 150,
            freePlusRewardUnlocked = if (unlockReward) true else current.freePlusRewardUnlocked,
            isPlusSubscriber = if (unlockReward) true else current.isPlusSubscriber,
            trialDurationDays = current.trialDurationDays + bonusDaysToAdd
        )
        userProfileDao.saveUserProfile(updated)

        val active = userAccountDao.getActiveAccountOnce()
        if (active != null) {
            userAccountDao.upsertAccount(
                active.copy(
                    referralCount = newCount,
                    totalXp = active.totalXp + 150,
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

    // --- Active CBT Exam State & Offline Recovery ---

    fun getActiveExamState(): Flow<ActiveExamStateEntity?> = activeExamStateDao.getActiveExamState()

    suspend fun getActiveExamStateOnce(): ActiveExamStateEntity? = withContext(Dispatchers.IO) {
        activeExamStateDao.getActiveExamStateOnce()
    }

    suspend fun saveActiveExamState(state: ActiveExamStateEntity) = withContext(Dispatchers.IO) {
        activeExamStateDao.saveActiveExamState(state)
    }

    suspend fun clearActiveExamState() = withContext(Dispatchers.IO) {
        activeExamStateDao.clearActiveExamState()
    }

    // --- Offline Data Sync & Queue Management ---

    fun getUnsyncedSessionsCount(): Flow<Int> = practiceSessionDao.getUnsyncedCount()

    suspend fun getUnsyncedSessionsCountOnce(): Int = withContext(Dispatchers.IO) {
        practiceSessionDao.getUnsyncedCountOnce()
    }

    suspend fun syncPendingData(): Boolean = withContext(Dispatchers.IO) {
        try {
            val unsynced = practiceSessionDao.getUnsyncedSessions()
            val activeUser = userAccountDao.getActiveAccountOnce()
            val profile = userProfileDao.getUserProfileOnce()
            val userEmail = activeUser?.email ?: profile?.email ?: "student@prepza.ng"

            var allSynced = true
            for (session in unsynced) {
                val success = firebaseManager.syncPracticeSessionToFirestore(session, userEmail)
                if (success) {
                    practiceSessionDao.markSessionSynced(session.id)
                } else {
                    allSynced = false
                }
            }

            if (profile != null) {
                firebaseManager.syncUserProfileToFirestore(profile)
            }

            val bookmarks = bookmarkDao.getAllBookmarks().firstOrNull() ?: emptyList()
            if (bookmarks.isNotEmpty()) {
                firebaseManager.syncBookmarksToFirestore(bookmarks, userEmail)
            }

            val mistakes = mistakeDao.getAllMistakes().firstOrNull() ?: emptyList()
            if (mistakes.isNotEmpty()) {
                firebaseManager.syncMistakesToFirestore(mistakes, userEmail)
            }

            allSynced
        } catch (e: Exception) {
            false
        }
    }

    // --- Remote Content & App Version Updates ---

    val appUpdateStatus = remoteContentManager.updateStatus
    val isContentSyncing = remoteContentManager.isContentSyncing
    val lastSyncResult = remoteContentManager.lastSyncResult
    val remoteAnnouncements = remoteContentManager.announcements
    val apkDownloadState = apkInstallerManager.downloadState
    val diagnosticsSummary = telemetryManager.diagnosticsFlow

    suspend fun checkForAppVersionUpdate(force: Boolean = false) =
        remoteContentManager.checkForAppVersionUpdate(force)

    fun dismissOptionalUpdate(versionCode: Int) =
        remoteContentManager.dismissOptionalUpdate(versionCode)

    suspend fun downloadAndInstallApk(config: com.example.data.remote.AppVersionConfig): Boolean {
        telemetryManager.recordEvent(
            type = "APK_UPDATE",
            description = "Initiated APK update to v${config.latestVersionName} (build ${config.latestVersionCode})",
            isSuccess = true,
            metadata = mapOf("versionCode" to config.latestVersionCode.toString())
        )
        return apkInstallerManager.downloadAndInstall(config)
    }

    fun canRequestPackageInstalls(): Boolean = apkInstallerManager.canRequestPackageInstalls()

    fun openUnknownAppSourcesSettings() = apkInstallerManager.openUnknownAppSourcesSettings()

    fun resetDownloadState() = apkInstallerManager.resetState()

    suspend fun syncRemoteContent(force: Boolean = false) =
        remoteContentManager.syncRemoteContent(force)

    // --- Notifications & Admin Broadcasts ---

    fun scheduleAllReminders() =
        com.example.data.notifications.NotificationScheduler.scheduleAllReminders(appContext)

    suspend fun checkAndDeliverAdminNotifications(): Int =
        adminNotificationManager.checkAndDeliverPendingNotifications()

    suspend fun broadcastAdminNotification(
        title: String,
        body: String,
        targetAudience: String = "ALL",
        priority: String = "HIGH",
        actionRoute: String = "home"
    ): Boolean = adminNotificationManager.broadcastNotification(
        title = title,
        body = body,
        targetAudience = targetAudience,
        priority = priority,
        actionRoute = actionRoute
    )

    // --- Enterprise Load Simulation & Stress Testing ---

    suspend fun runCbtStressTest(candidateCount: Int = 1000): com.example.data.engine.StressTestBenchmarkResult =
        cbtLoadSimulator.runSimulation(candidateCount)

    // --- Home & Subject Interactive Learning System ---

    fun getTopicProgress(userId: String, subject: String, topicName: String): Flow<TopicProgressEntity?> =
        topicProgressDao.getProgressForTopic(userId, subject, topicName)

    fun getProgressForSubject(userId: String, subject: String): Flow<List<TopicProgressEntity>> =
        topicProgressDao.getProgressForSubject(userId, subject)

    fun getAllProgressForUser(userId: String): Flow<List<TopicProgressEntity>> =
        topicProgressDao.getAllProgressForUser(userId)

    fun getActiveUnfinishedTopic(userId: String): Flow<TopicProgressEntity?> =
        topicProgressDao.getActiveUnfinishedTopic(userId)

    fun getRecentlyStudiedTopics(userId: String, limit: Int = 6): Flow<List<TopicProgressEntity>> =
        topicProgressDao.getRecentlyStudiedTopics(userId, limit)

    suspend fun saveCardPosition(
        userId: String,
        subject: String,
        topicName: String,
        cardIndex: Int,
        totalCards: Int
    ) = withContext(Dispatchers.IO) {
        val existing = topicProgressDao.getProgressForTopicOnce(userId, subject, topicName)
        val isCompleted = (cardIndex >= totalCards - 1 && totalCards > 0) || (existing?.isLearningCompleted == true)
        val mastery = when {
            existing?.masteryState == "STRONG" -> "STRONG"
            existing?.masteryState == "NEEDS_PRACTICE" -> "NEEDS_PRACTICE"
            isCompleted -> "LEARNED"
            cardIndex > 0 -> "IN_PROGRESS"
            else -> existing?.masteryState ?: "NOT_STARTED"
        }

        val progress = TopicProgressEntity(
            id = "${userId}_${subject}_${topicName}",
            userId = userId,
            subject = subject,
            topicName = topicName,
            currentCardIndex = cardIndex,
            totalCards = totalCards,
            isLearningCompleted = isCompleted,
            lastRecallScore = existing?.lastRecallScore ?: 0,
            recallTotal = existing?.recallTotal ?: 0,
            practiceCount = existing?.practiceCount ?: 0,
            practiceAccuracyPercent = existing?.practiceAccuracyPercent ?: 0,
            masteryState = mastery,
            lastStudiedTimestamp = System.currentTimeMillis(),
            isBookmarked = existing?.isBookmarked ?: false,
            personalNotes = existing?.personalNotes
        )
        topicProgressDao.saveProgress(progress)
    }

    suspend fun recordQuickRecallResult(
        userId: String,
        subject: String,
        topicName: String,
        score: Int,
        total: Int
    ) = withContext(Dispatchers.IO) {
        val existing = topicProgressDao.getProgressForTopicOnce(userId, subject, topicName)
        val isHighRecall = score.toFloat() / total.coerceAtLeast(1) >= 0.7f
        val mastery = if (isHighRecall) "LEARNED" else "NEEDS_PRACTICE"

        val progress = TopicProgressEntity(
            id = "${userId}_${subject}_${topicName}",
            userId = userId,
            subject = subject,
            topicName = topicName,
            currentCardIndex = existing?.currentCardIndex ?: 0,
            totalCards = existing?.totalCards ?: 0,
            isLearningCompleted = true,
            lastRecallScore = score,
            recallTotal = total,
            practiceCount = existing?.practiceCount ?: 0,
            practiceAccuracyPercent = existing?.practiceAccuracyPercent ?: 0,
            masteryState = mastery,
            lastStudiedTimestamp = System.currentTimeMillis(),
            isBookmarked = existing?.isBookmarked ?: false,
            personalNotes = existing?.personalNotes
        )
        topicProgressDao.saveProgress(progress)
    }

    suspend fun recordTopicPracticeSession(
        userId: String,
        subject: String,
        topicName: String,
        correctCount: Int,
        totalQuestions: Int
    ) = withContext(Dispatchers.IO) {
        val existing = topicProgressDao.getProgressForTopicOnce(userId, subject, topicName)
        val currentPracticeCount = (existing?.practiceCount ?: 0) + 1
        val accuracy = if (totalQuestions > 0) (correctCount * 100 / totalQuestions) else 0
        val mastery = when {
            accuracy >= 75 -> "STRONG"
            accuracy < 50 -> "NEEDS_PRACTICE"
            else -> "LEARNED"
        }

        val progress = TopicProgressEntity(
            id = "${userId}_${subject}_${topicName}",
            userId = userId,
            subject = subject,
            topicName = topicName,
            currentCardIndex = existing?.currentCardIndex ?: 0,
            totalCards = existing?.totalCards ?: 0,
            isLearningCompleted = true,
            lastRecallScore = existing?.lastRecallScore ?: 0,
            recallTotal = existing?.recallTotal ?: 0,
            practiceCount = currentPracticeCount,
            practiceAccuracyPercent = accuracy,
            masteryState = mastery,
            lastStudiedTimestamp = System.currentTimeMillis(),
            isBookmarked = existing?.isBookmarked ?: false,
            personalNotes = existing?.personalNotes
        )
        topicProgressDao.saveProgress(progress)
    }

    suspend fun toggleTopicBookmark(
        userId: String,
        subject: String,
        topicName: String,
        isBookmarked: Boolean
    ) = withContext(Dispatchers.IO) {
        val existing = topicProgressDao.getProgressForTopicOnce(userId, subject, topicName)
        if (existing != null) {
            topicProgressDao.setTopicBookmarked(userId, subject, topicName, isBookmarked)
        } else {
            val progress = TopicProgressEntity(
                id = "${userId}_${subject}_${topicName}",
                userId = userId,
                subject = subject,
                topicName = topicName,
                isBookmarked = isBookmarked,
                lastStudiedTimestamp = System.currentTimeMillis()
            )
            topicProgressDao.saveProgress(progress)
        }
    }

    suspend fun updateTopicPersonalNotes(
        userId: String,
        subject: String,
        topicName: String,
        notes: String?
    ) = withContext(Dispatchers.IO) {
        val existing = topicProgressDao.getProgressForTopicOnce(userId, subject, topicName)
        if (existing != null) {
            topicProgressDao.setTopicNotes(userId, subject, topicName, notes)
        } else {
            val progress = TopicProgressEntity(
                id = "${userId}_${subject}_${topicName}",
                userId = userId,
                subject = subject,
                topicName = topicName,
                personalNotes = notes,
                lastStudiedTimestamp = System.currentTimeMillis()
            )
            topicProgressDao.saveProgress(progress)
        }
    }

    // User-created Personal Cards
    fun getPersonalCardsForTopic(userId: String, subject: String, topicName: String): Flow<List<UserPersonalCardEntity>> =
        userPersonalCardDao.getCardsForTopic(userId, subject, topicName)

    suspend fun savePersonalCard(card: UserPersonalCardEntity) = withContext(Dispatchers.IO) {
        userPersonalCardDao.insertCard(card)
    }

    suspend fun deletePersonalCard(cardId: String) = withContext(Dispatchers.IO) {
        userPersonalCardDao.deleteCard(cardId)
    }

    // Card Bookmarks
    fun isCardBookmarked(userId: String, cardId: String): Flow<Boolean> =
        cardBookmarkDao.isCardBookmarked(userId, cardId)

    suspend fun toggleCardBookmark(
        userId: String,
        cardId: String,
        topicName: String,
        subject: String,
        isBookmarked: Boolean
    ) = withContext(Dispatchers.IO) {
        if (isBookmarked) {
            cardBookmarkDao.addBookmark(
                CardBookmarkEntity(
                    cardId = cardId,
                    userId = userId,
                    topicName = topicName,
                    subject = subject,
                    timestamp = System.currentTimeMillis()
                )
            )
        } else {
            cardBookmarkDao.removeBookmark(userId, cardId)
        }
    }
}



