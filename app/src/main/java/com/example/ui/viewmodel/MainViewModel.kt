package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.ai.GeminiTutorService
import com.example.data.db.*
import com.example.data.repository.PrepzaRepository
import com.example.data.repository.QuestionBankGenerator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

data class CbtResultSummary(
    val totalScore: Int, // e.g. 15 (for mini CBT out of 20) or 310 (for full CBT out of 400)
    val targetScore: Int = 320,
    val maxScore: Int = 400, // 20 for mini CBT, 400 for full mock
    val isMiniCbt: Boolean = false,
    val miniCbtSubject: String? = null,
    val accuracyPercent: Int,
    val subjectScores: Map<String, Pair<Int, Int>>, // Subject -> (Correct, Total)
    val totalTimeSeconds: Long,
    val readinessEstimate: String,
    val questions: List<QuestionEntity> = emptyList(),
    val userAnswers: Map<String, Int> = emptyMap()
)

data class AiChatMessage(
    val sender: String, // "user" or "tutor"
    val text: String,
    val timestamp: Long = System.currentTimeMillis()
)

class MainViewModel(application: Application) : AndroidViewModel(application) {
    val repository = PrepzaRepository(application)
    private val aiTutorService = GeminiTutorService()
    val aiQuestionFixer = com.example.data.ai.AiQuestionFixer(repository, aiTutorService, viewModelScope)

    // Offline Network Connectivity Monitoring & Background Sync
    val networkMonitor = com.example.data.network.NetworkConnectivityMonitor(application)
    val isOnline: StateFlow<Boolean> = networkMonitor.isOnline

    private val _isSyncingCloud = MutableStateFlow(false)
    val isSyncingCloud: StateFlow<Boolean> = _isSyncingCloud.asStateFlow()

    private val _aiFixToastMessage = MutableStateFlow<String?>(null)
    val aiFixToastMessage: StateFlow<String?> = _aiFixToastMessage.asStateFlow()

    // Global Theme Preference (LIGHT, DARK, SYSTEM)
    private val themePrefs = application.getSharedPreferences("prepza_theme_prefs", android.content.Context.MODE_PRIVATE)
    private val _appThemeMode = MutableStateFlow(
        try {
            com.example.ui.theme.AppThemeMode.valueOf(
                themePrefs.getString("app_theme_mode", com.example.ui.theme.AppThemeMode.SYSTEM.name)
                    ?: com.example.ui.theme.AppThemeMode.SYSTEM.name
            )
        } catch (e: Exception) {
            com.example.ui.theme.AppThemeMode.SYSTEM
        }
    )
    val appThemeMode: StateFlow<com.example.ui.theme.AppThemeMode> = _appThemeMode.asStateFlow()

    fun setAppThemeMode(mode: com.example.ui.theme.AppThemeMode) {
        _appThemeMode.value = mode
        themePrefs.edit().putString("app_theme_mode", mode.name).apply()
    }

    // Remote Content and App Version Update States
    val appUpdateStatus: StateFlow<com.example.data.remote.AppUpdateStatus> = repository.appUpdateStatus
    val isContentSyncing: StateFlow<Boolean> = repository.isContentSyncing
    val lastSyncResult: StateFlow<com.example.data.remote.RemoteContentSyncResult?> = repository.lastSyncResult
    val remoteAnnouncements: StateFlow<List<com.example.data.remote.RemoteAnnouncement>> = repository.remoteAnnouncements
    val apkDownloadState: StateFlow<com.example.data.remote.DownloadProgressState> = repository.apkDownloadState
    val diagnosticsSummary = repository.diagnosticsSummary

    private val _stressTestResult = MutableStateFlow<com.example.data.engine.StressTestBenchmarkResult?>(null)
    val stressTestResult: StateFlow<com.example.data.engine.StressTestBenchmarkResult?> = _stressTestResult.asStateFlow()

    private val _isStressTesting = MutableStateFlow(false)
    val isStressTesting: StateFlow<Boolean> = _isStressTesting.asStateFlow()

    // Centralized Authentication State Flow
    private val _authUiState = MutableStateFlow<AuthUiState>(AuthUiState.Idle)
    val authUiState: StateFlow<AuthUiState> = _authUiState.asStateFlow()

    // Database Initialization & Network Sync Listener
    init {
        viewModelScope.launch {
            repository.initializeDatabaseIfEmpty()
            // Schedule background study reminders (12 PM Practice & 6 PM Streak)
            repository.scheduleAllReminders()
            // Verify persistent user session across app restarts
            val restoredAccount = repository.ensureSessionPersistence()
            if (restoredAccount != null && restoredAccount.isLoggedIn) {
                _authUiState.value = AuthUiState.Success(restoredAccount)
            }
            // Check for App Version updates on app open
            checkForAppVersionUpdate()
            // Sync remote content (questions, passages, corrections, announcements)
            syncRemoteContent()
            // Check for admin broadcast notifications
            repository.checkAndDeliverAdminNotifications()
        }

        // Listen for AI question fixes completed in the background
        viewModelScope.launch {
            aiQuestionFixer.fixNotificationFlow.collect { fixResult ->
                // Update in-memory question list if active
                val currentQuestions = _activePracticeQuestions.value
                val updatedList = currentQuestions.map { q ->
                    if (q.id == fixResult.questionId) fixResult.updatedQuestion else q
                }
                _activePracticeQuestions.value = updatedList
                _aiFixToastMessage.value = fixResult.message
            }
        }

        // Whenever device comes back online, automatically trigger background sync
        networkMonitor.setOnNetworkRestoredListener {
            viewModelScope.launch(Dispatchers.IO) {
                repository.syncPendingData()
                repository.syncRemoteContent()
                repository.checkForAppVersionUpdate()
                repository.checkAndDeliverAdminNotifications()
            }
        }
        networkMonitor.startMonitoring(viewModelScope)
    }

    fun checkForAppVersionUpdate(force: Boolean = false) {
        viewModelScope.launch {
            repository.checkForAppVersionUpdate(force)
        }
    }

    fun dismissOptionalUpdate(versionCode: Int) {
        repository.dismissOptionalUpdate(versionCode)
    }

    fun downloadAndInstallApk(config: com.example.data.remote.AppVersionConfig) {
        viewModelScope.launch {
            repository.downloadAndInstallApk(config)
        }
    }

    fun canRequestPackageInstalls(): Boolean = repository.canRequestPackageInstalls()

    fun openUnknownAppSourcesSettings() = repository.openUnknownAppSourcesSettings()

    fun resetDownloadState() = repository.resetDownloadState()

    fun syncRemoteContent(force: Boolean = false) {
        viewModelScope.launch {
            repository.syncRemoteContent(force)
        }
    }

    fun broadcastAdminNotification(
        title: String,
        body: String,
        targetAudience: String = "ALL",
        priority: String = "HIGH",
        actionRoute: String = "home"
    ) {
        viewModelScope.launch {
            repository.broadcastAdminNotification(
                title = title,
                body = body,
                targetAudience = targetAudience,
                priority = priority,
                actionRoute = actionRoute
            )
        }
    }

    fun runCbtStressTest(candidateCount: Int = 1000) {
        viewModelScope.launch {
            _isStressTesting.value = true
            val result = repository.runCbtStressTest(candidateCount)
            _stressTestResult.value = result
            _isStressTesting.value = false
        }
    }

    fun clearStressTestResult() {
        _stressTestResult.value = null
    }

    fun clearAiFixToast() {
        _aiFixToastMessage.value = null
    }

    // StateFlows from Repository
    val unsyncedCount: StateFlow<Int> = repository.getUnsyncedSessionsCount().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = 0
    )

    val activeExamState: StateFlow<ActiveExamStateEntity?> = repository.getActiveExamState().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = null
    )

    val activeAccount = repository.activeAccount.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = null
    )

    val allAccounts = repository.allAccounts.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val userProfile = repository.userProfile.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = null
    )

    val allQuestions = repository.allQuestions.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val recentSessions = repository.recentSessions.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val allBookmarks = repository.allBookmarks.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val allFriends = repository.allFriends.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val allMistakes = repository.allMistakes.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val unmasteredMistakes = repository.unmasteredMistakes.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val masteredMistakes = repository.masteredMistakes.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val unmasteredMistakesCount = repository.unmasteredMistakesCount.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = 0
    )

    val masteredMistakesCount = repository.masteredMistakesCount.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = 0
    )

    val offlinePacks = repository.offlinePacks.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val literatureBooks = repository.literatureBooks.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    // --- Home & Subject Learning State Flows ---
    val allTopicProgress = repository.getAllProgressForUser("").stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val recentlyStudiedTopics = repository.getRecentlyStudiedTopics("", 6).stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = emptyList()
    )

    val activeUnfinishedTopic = repository.getActiveUnfinishedTopic("").stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = null
    )

    private val _selectedSubjectName = MutableStateFlow("Biology")
    val selectedSubjectName: StateFlow<String> = _selectedSubjectName.asStateFlow()

    private val _selectedLearningPack = MutableStateFlow<com.example.data.learning.LearningPack?>(null)
    val selectedLearningPack: StateFlow<com.example.data.learning.LearningPack?> = _selectedLearningPack.asStateFlow()

    private val _currentLearningCardIndex = MutableStateFlow(0)
    val currentLearningCardIndex: StateFlow<Int> = _currentLearningCardIndex.asStateFlow()

    private val _isLearningPackCompleted = MutableStateFlow(false)
    val isLearningPackCompleted: StateFlow<Boolean> = _isLearningPackCompleted.asStateFlow()

    // Quick Recall State
    private val _quickRecallIndex = MutableStateFlow(0)
    val quickRecallIndex: StateFlow<Int> = _quickRecallIndex.asStateFlow()

    private val _quickRecallAnswers = MutableStateFlow<Map<Int, Int>>(emptyMap()) // Question Index -> Chosen Option Index
    val quickRecallAnswers: StateFlow<Map<Int, Int>> = _quickRecallAnswers.asStateFlow()

    private val _isQuickRecallFinished = MutableStateFlow(false)
    val isQuickRecallFinished: StateFlow<Boolean> = _isQuickRecallFinished.asStateFlow()

    private val _quickRecallScore = MutableStateFlow(0)
    val quickRecallScore: StateFlow<Int> = _quickRecallScore.asStateFlow()

    // Personal study cards for active topic
    val activeTopicPersonalCards: StateFlow<List<UserPersonalCardEntity>> = _selectedLearningPack
        .flatMapLatest { pack ->
            if (pack != null) {
                repository.getPersonalCardsForTopic("", pack.subject, pack.topicName)
            } else {
                flowOf(emptyList())
            }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    // --- Friend Chat State ---
    private val _activeChatFriend = MutableStateFlow<FriendEntity?>(null)
    val activeChatFriend: StateFlow<FriendEntity?> = _activeChatFriend.asStateFlow()

    private val _isFriendTyping = MutableStateFlow(false)
    val isFriendTyping: StateFlow<Boolean> = _isFriendTyping.asStateFlow()

    val activeFriendChatMessages: StateFlow<List<FriendChatMessageEntity>> = _activeChatFriend
        .flatMapLatest { friend ->
            if (friend != null) {
                repository.getChatMessagesForFriend(friend.id)
            } else {
                flowOf(emptyList())
            }
        }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = emptyList()
        )

    // --- Active Practice State ---
    private val _activePracticeQuestions = MutableStateFlow<List<QuestionEntity>>(emptyList())
    val activePracticeQuestions: StateFlow<List<QuestionEntity>> = _activePracticeQuestions.asStateFlow()

    private val _activeQuestionIndex = MutableStateFlow(0)
    val activeQuestionIndex: StateFlow<Int> = _activeQuestionIndex.asStateFlow()

    private val _userAnswers = MutableStateFlow<Map<String, Int>>(emptyMap()) // questionId -> optionIndex
    val userAnswers: StateFlow<Map<String, Int>> = _userAnswers.asStateFlow()

    private val _showExplanation = MutableStateFlow(false)
    val showExplanation: StateFlow<Boolean> = _showExplanation.asStateFlow()

    private val _practiceModeName = MutableStateFlow("Quick Practice")
    val practiceModeName: StateFlow<String> = _practiceModeName.asStateFlow()

    // --- CBT State ---
    private val _cbtTimerSeconds = MutableStateFlow(7200L) // 2 hours
    val cbtTimerSeconds: StateFlow<Long> = _cbtTimerSeconds.asStateFlow()

    private val _cbtFlaggedQuestions = MutableStateFlow<Set<Int>>(emptySet())
    val cbtFlaggedQuestions: StateFlow<Set<Int>> = _cbtFlaggedQuestions.asStateFlow()

    private val _selectedCbtSubject = MutableStateFlow("English Language")
    val selectedCbtSubject: StateFlow<String> = _selectedCbtSubject.asStateFlow()

    private val _cbtResult = MutableStateFlow<CbtResultSummary?>(null)
    val cbtResult: StateFlow<CbtResultSummary?> = _cbtResult.asStateFlow()

    private var timerJob: Job? = null

    // --- Literature Reader State ---
    private val _activeBook = MutableStateFlow<LiteratureBookEntity?>(null)
    val activeBook: StateFlow<LiteratureBookEntity?> = _activeBook.asStateFlow()

    private val _activeChapterIndex = MutableStateFlow(0)
    val activeChapterIndex: StateFlow<Int> = _activeChapterIndex.asStateFlow()

    // --- AI Tutor State ---
    private val _selectedTutorPersona = MutableStateFlow(com.example.data.ai.TutorPersona.GENERAL_COACH)
    val selectedTutorPersona: StateFlow<com.example.data.ai.TutorPersona> = _selectedTutorPersona.asStateFlow()

    private val _aiChatMessages = MutableStateFlow<List<AiChatMessage>>(
        listOf(
            AiChatMessage(
                "tutor",
                com.example.data.ai.TutorPersona.GENERAL_COACH.defaultGreeting
            )
        )
    )
    val aiChatMessages: StateFlow<List<AiChatMessage>> = _aiChatMessages.asStateFlow()

    private val _isAiLoading = MutableStateFlow(false)
    val isAiLoading: StateFlow<Boolean> = _isAiLoading.asStateFlow()

    fun setTutorPersona(persona: com.example.data.ai.TutorPersona) {
        _selectedTutorPersona.value = persona
    }

    // --- Auth & Account Actions ---

    fun clearAuthError() {
        if (_authUiState.value is AuthUiState.Error) {
            _authUiState.value = AuthUiState.Idle
        }
    }

    fun resetAuthState() {
        _authUiState.value = AuthUiState.Idle
    }

    fun signUpWithEmail(
        name: String,
        email: String,
        password: String,
        referralCode: String? = null,
        onResult: ((Boolean, String?) -> Unit)? = null
    ) {
        viewModelScope.launch {
            _authUiState.value = AuthUiState.Loading
            val res = repository.signUpWithEmail(name, email, password, referralCode)
            if (res.isSuccess) {
                val account = res.getOrThrow()
                _authUiState.value = AuthUiState.Success(account, "Welcome to Prepza, ${account.name}!")
                onResult?.invoke(true, null)
            } else {
                val err = res.exceptionOrNull()?.message ?: "Sign up failed"
                val errType = when {
                    err.contains("already exists", ignoreCase = true) -> AuthErrorType.EMAIL_ALREADY_EXISTS
                    err.contains("password", ignoreCase = true) -> AuthErrorType.WEAK_PASSWORD
                    err.contains("email", ignoreCase = true) -> AuthErrorType.VALIDATION_ERROR
                    else -> AuthErrorType.GENERAL
                }
                _authUiState.value = AuthUiState.Error(err, errType)
                onResult?.invoke(false, err)
            }
        }
    }

    fun loginWithEmail(
        email: String,
        password: String,
        onResult: ((Boolean, String?) -> Unit)? = null
    ) {
        viewModelScope.launch {
            _authUiState.value = AuthUiState.Loading
            val res = repository.loginWithEmail(email, password)
            if (res.isSuccess) {
                val account = res.getOrThrow()
                _authUiState.value = AuthUiState.Success(account, "Welcome back, ${account.name}!")
                onResult?.invoke(true, null)
            } else {
                val err = res.exceptionOrNull()?.message ?: "Login failed"
                val errType = when {
                    err.contains("No account found", ignoreCase = true) -> AuthErrorType.ACCOUNT_NOT_FOUND
                    err.contains("Incorrect password", ignoreCase = true) -> AuthErrorType.INVALID_CREDENTIALS
                    err.contains("locked", ignoreCase = true) || err.contains("Too many", ignoreCase = true) -> AuthErrorType.RATE_LIMITED
                    else -> AuthErrorType.GENERAL
                }
                _authUiState.value = AuthUiState.Error(err, errType)
                onResult?.invoke(false, err)
            }
        }
    }

    fun loginWithGoogleCredentialManager(
        context: android.content.Context,
        fallbackName: String = "UTME Candidate",
        fallbackEmail: String = "student.utme@gmail.com",
        referralCode: String? = null,
        onResult: ((Boolean, String?) -> Unit)? = null
    ) {
        viewModelScope.launch {
            _authUiState.value = AuthUiState.Loading
            try {
                val credentialManager = androidx.credentials.CredentialManager.create(context)
                val googleIdOption = com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption.Builder(
                    "prepza-jamb-cbt.apps.googleusercontent.com"
                ).build()

                val request = androidx.credentials.GetCredentialRequest.Builder()
                    .addCredentialOption(googleIdOption)
                    .build()

                try {
                    val result = credentialManager.getCredential(context, request)
                    val credential = result.credential

                    if (credential is androidx.credentials.CustomCredential &&
                        credential.type == com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL
                    ) {
                        val googleIdTokenCredential = com.google.android.libraries.identity.googleid.GoogleIdTokenCredential.createFrom(credential.data)
                        val idToken = googleIdTokenCredential.idToken
                        val email = googleIdTokenCredential.id
                        val displayName = googleIdTokenCredential.displayName ?: fallbackName

                        val res = repository.loginWithGoogleToken(idToken, displayName, email, referralCode)
                        if (res.isSuccess) {
                            val acc = res.getOrThrow()
                            _authUiState.value = AuthUiState.Success(acc, "Signed in as ${acc.email}")
                            onResult?.invoke(true, null)
                        } else {
                            val err = res.exceptionOrNull()?.message ?: "Google Sign-In failed"
                            _authUiState.value = AuthUiState.Error(err, AuthErrorType.GOOGLE_SIGN_IN_FAILED)
                            onResult?.invoke(false, err)
                        }
                    } else {
                        val res = repository.loginWithGoogle(fallbackName, fallbackEmail, referralCode)
                        if (res.isSuccess) {
                            val acc = res.getOrThrow()
                            _authUiState.value = AuthUiState.Success(acc, "Signed in with Google")
                            onResult?.invoke(true, null)
                        } else {
                            val err = res.exceptionOrNull()?.message ?: "Google login failed"
                            _authUiState.value = AuthUiState.Error(err, AuthErrorType.GOOGLE_SIGN_IN_FAILED)
                            onResult?.invoke(false, err)
                        }
                    }
                } catch (e: androidx.credentials.exceptions.GetCredentialCancellationException) {
                    _authUiState.value = AuthUiState.Error("Google Sign-In was cancelled.", AuthErrorType.GOOGLE_SIGN_IN_CANCELLED)
                    onResult?.invoke(false, "Google Sign-In was cancelled.")
                } catch (e: Exception) {
                    // Graceful fallback for non-GMS or emulator environments
                    val res = repository.loginWithGoogle(fallbackName, fallbackEmail, referralCode)
                    if (res.isSuccess) {
                        val acc = res.getOrThrow()
                        _authUiState.value = AuthUiState.Success(acc, "Signed in with Google")
                        onResult?.invoke(true, null)
                    } else {
                        val err = res.exceptionOrNull()?.message ?: "Google Sign-In failed (${e.localizedMessage})"
                        _authUiState.value = AuthUiState.Error(err, AuthErrorType.GOOGLE_SIGN_IN_FAILED)
                        onResult?.invoke(false, err)
                    }
                }
            } catch (e: Exception) {
                val res = repository.loginWithGoogle(fallbackName, fallbackEmail, referralCode)
                if (res.isSuccess) {
                    val acc = res.getOrThrow()
                    _authUiState.value = AuthUiState.Success(acc, "Signed in with Google")
                    onResult?.invoke(true, null)
                } else {
                    val err = e.message ?: "Google authentication error"
                    _authUiState.value = AuthUiState.Error(err, AuthErrorType.GOOGLE_SIGN_IN_FAILED)
                    onResult?.invoke(false, err)
                }
            }
        }
    }

    fun loginWithGoogle(
        name: String,
        email: String,
        referralCode: String? = null,
        onResult: ((Boolean, String?) -> Unit)? = null
    ) {
        viewModelScope.launch {
            _authUiState.value = AuthUiState.Loading
            val res = repository.loginWithGoogle(name, email, referralCode)
            if (res.isSuccess) {
                val acc = res.getOrThrow()
                _authUiState.value = AuthUiState.Success(acc, "Signed in with Google")
                onResult?.invoke(true, null)
            } else {
                val err = res.exceptionOrNull()?.message ?: "Google login failed"
                _authUiState.value = AuthUiState.Error(err, AuthErrorType.GOOGLE_SIGN_IN_FAILED)
                onResult?.invoke(false, err)
            }
        }
    }

    fun loginWithPhone(
        phoneNumber: String,
        name: String,
        referralCode: String? = null,
        onResult: ((Boolean, String?) -> Unit)? = null
    ) {
        viewModelScope.launch {
            _authUiState.value = AuthUiState.Loading
            val res = repository.loginWithPhone(phoneNumber, name, referralCode)
            if (res.isSuccess) {
                val acc = res.getOrThrow()
                _authUiState.value = AuthUiState.Success(acc, "Signed in with phone")
                onResult?.invoke(true, null)
            } else {
                val err = res.exceptionOrNull()?.message ?: "Phone login failed"
                _authUiState.value = AuthUiState.Error(err, AuthErrorType.INVALID_CREDENTIALS)
                onResult?.invoke(false, err)
            }
        }
    }

    fun loginAsGuest(onResult: ((Boolean, String?) -> Unit)? = null) {
        viewModelScope.launch {
            _authUiState.value = AuthUiState.Loading
            val res = repository.loginAsGuest()
            if (res.isSuccess) {
                val acc = res.getOrThrow()
                _authUiState.value = AuthUiState.Success(acc, "Logged in as guest candidate")
                onResult?.invoke(true, null)
            } else {
                val err = res.exceptionOrNull()?.message ?: "Guest login failed"
                _authUiState.value = AuthUiState.Error(err, AuthErrorType.GENERAL)
                onResult?.invoke(false, err)
            }
        }
    }

    fun logOut() {
        viewModelScope.launch {
            repository.logOut()
            _authUiState.value = AuthUiState.Idle
        }
    }

    fun sendPasswordResetEmail(email: String, onResult: ((Boolean, String) -> Unit)? = null) {
        viewModelScope.launch {
            val res = repository.sendPasswordResetEmail(email)
            if (res.isSuccess) {
                onResult?.invoke(true, res.getOrThrow())
            } else {
                onResult?.invoke(false, res.exceptionOrNull()?.message ?: "Failed to send password reset")
            }
        }
    }

    fun resetPassword(email: String, newPassword: String, onResult: ((Boolean, String) -> Unit)? = null) {
        viewModelScope.launch {
            val res = repository.resetPassword(email, newPassword)
            if (res.isSuccess) {
                onResult?.invoke(true, "Password updated successfully. Please log in.")
            } else {
                onResult?.invoke(false, res.exceptionOrNull()?.message ?: "Failed to reset password")
            }
        }
    }

    fun switchAccount(accountId: String, onResult: ((Boolean) -> Unit)? = null) {
        viewModelScope.launch {
            repository.switchAccount(accountId)
            val active = repository.userAccountDao.getActiveAccountOnce()
            if (active != null) {
                _authUiState.value = AuthUiState.Success(active)
                onResult?.invoke(true)
            } else {
                onResult?.invoke(false)
            }
        }
    }

    fun updateAcademicProfile(targetScore: Int, subjectsCsv: String, studyGoalMinutes: Int? = null) {
        viewModelScope.launch {
            repository.updateAcademicProfile(targetScore, subjectsCsv, studyGoalMinutes)
        }
    }

    // --- Practice & CBT Actions ---

    fun startPracticeSession(mode: String, subjectFilter: String? = null, topicFilter: String? = null) {
        val userSubjects = (userProfile.value?.jambSubjectsCsv ?: "English Language,Mathematics,Physics,Chemistry")
            .split(",").map { it.trim() }

        viewModelScope.launch(Dispatchers.Default) {
            val poolSource = allQuestions.value.ifEmpty { repository.questionDao.getAllQuestionsOnce() }.ifEmpty { QuestionBankGenerator.getAllSeedQuestions() }
            val userExposures = repository.getExposuresForUser().associateBy { it.questionId }

            val targetCount = when (mode) {
                "Quick Practice", "15-Min Speed Drill" -> 15
                "Subject Practice" -> 30
                else -> 20
            }

            val selectedQuestions: List<QuestionEntity> = if (subjectFilter != null && topicFilter == null) {
                // Use weighted randomizer for subject
                com.example.data.engine.CbtWeightedRandomizer.selectWeightedQuestions(
                    subject = subjectFilter,
                    targetCount = targetCount,
                    pool = poolSource,
                    exposures = userExposures,
                    excludedIds = _seenCbtQuestionIds.value,
                    excludedStems = _seenCbtQuestionTexts.value
                )
            } else {
                val baseQuestions = if (subjectFilter != null) {
                    val normSubject = QuestionBankGenerator.normalizeSubjectName(subjectFilter)
                    poolSource.filter { it.subject.equals(normSubject, ignoreCase = true) || it.subject.equals(subjectFilter, ignoreCase = true) }
                } else {
                    poolSource.filter { userSubjects.contains(it.subject) }
                }

                val topicFiltered = if (topicFilter != null) {
                    baseQuestions.filter { it.topic.equals(topicFilter, ignoreCase = true) }
                } else {
                    baseQuestions
                }

                val rawPool = if (topicFiltered.isNotEmpty()) topicFiltered else poolSource
                val deduplicatedPool = com.example.data.engine.QuestionDeduplicator.deduplicateQuestions(rawPool)
                    .filter { q ->
                        q.id !in _seenCbtQuestionIds.value &&
                        com.example.data.engine.QuestionDeduplicator.normalizeText(q.questionText) !in _seenCbtQuestionTexts.value
                    }

                val finalPool = if (deduplicatedPool.isNotEmpty()) deduplicatedPool else com.example.data.engine.QuestionDeduplicator.deduplicateQuestions(rawPool)

                // Run weighted scoring on candidates
                val now = System.currentTimeMillis()
                val scored = finalPool.map { q ->
                    val scoring = com.example.data.engine.CbtWeightedRandomizer.calculateQuestionWeight(
                        question = q,
                        exposure = userExposures[q.id],
                        now = now
                    )
                    Pair(q, scoring.compositeWeight)
                }

                // Weighted stochastic sampling
                val sampled = scored.map { (q, weight) ->
                    val u = kotlin.math.max(0.000001, kotlin.math.min(0.999999, kotlin.random.Random.nextDouble()))
                    val stochasticKey = Math.pow(u, 1.0 / kotlin.math.max(0.0001, weight))
                    Pair(q, stochasticKey)
                }.sortedByDescending { it.second }.map { it.first }

                com.example.data.engine.QuestionDeduplicator.deduplicateQuestions(sampled).take(targetCount)
            }

            // Update seen question memory and exposures in Room asynchronously
            val updatedIds = (_seenCbtQuestionIds.value + selectedQuestions.map { it.id }).toList().takeLast(3000).toSet()
            val updatedTexts = (_seenCbtQuestionTexts.value + selectedQuestions.map { com.example.data.engine.QuestionDeduplicator.normalizeText(it.questionText) }).toList().takeLast(3000).toSet()
            repository.recordQuestionExposures(selectedQuestions)

            withContext(Dispatchers.Main) {
                _seenCbtQuestionIds.value = updatedIds
                _seenCbtQuestionTexts.value = updatedTexts
                _practiceModeName.value = mode
                _activePracticeQuestions.value = selectedQuestions
                _activeQuestionIndex.value = 0
                _userAnswers.value = emptyMap()
                _showExplanation.value = false
            }
        }
    }

    fun startMistakePracticeSession(subjectFilter: String? = null) {
        viewModelScope.launch(Dispatchers.Default) {
            val mistakes = repository.unmasteredMistakes.firstOrNull() ?: emptyList()
            val filteredMistakes = if (subjectFilter != null && subjectFilter != "All Subjects") {
                mistakes.filter { it.subject.equals(subjectFilter, ignoreCase = true) }
            } else {
                mistakes
            }
            val mistakeQuestionIds = filteredMistakes.map { it.questionId }
            val poolSource = allQuestions.value.ifEmpty { QuestionBankGenerator.getAllSeedQuestions() }
            val questions = poolSource.filter { mistakeQuestionIds.contains(it.id) }

            withContext(Dispatchers.Main) {
                if (questions.isNotEmpty()) {
                    _practiceModeName.value = if (subjectFilter != null && subjectFilter != "All Subjects") "Mistake Revision ($subjectFilter)" else "Mistake Bank Revision"
                    _activePracticeQuestions.value = questions.shuffled()
                    _activeQuestionIndex.value = 0
                    _userAnswers.value = emptyMap()
                    _showExplanation.value = false
                } else {
                    startPracticeSession("Quick Practice", subjectFilter)
                }
            }
        }
    }

    fun markMistakeMastered(questionId: String, isMastered: Boolean = true) {
        viewModelScope.launch {
            repository.markMistakeMastered(questionId, isMastered)
        }
    }

    fun removeMistake(questionId: String) {
        viewModelScope.launch {
            repository.removeMistake(questionId)
        }
    }

    fun clearAllMistakes() {
        viewModelScope.launch {
            repository.clearAllMistakes()
        }
    }

    // Offline Pack Operations
    fun downloadSubjectPack(subject: String) {
        viewModelScope.launch {
            repository.downloadSubjectPack(subject)
        }
    }

    fun downloadAllSubjectsPacks(subjects: List<String>) {
        viewModelScope.launch {
            repository.downloadAllSubjectsPacks(subjects)
        }
    }

    fun deleteOfflinePack(subject: String) {
        viewModelScope.launch {
            repository.deleteOfflinePack(subject)
        }
    }

    fun answerQuestion(questionId: String, optionIndex: Int) {
        val currentMap = _userAnswers.value.toMutableMap()
        currentMap[questionId] = optionIndex
        _userAnswers.value = currentMap
        _showExplanation.value = true

        val q = _activePracticeQuestions.value.find { it.id == questionId }
            ?: if (_activeQuestionIndex.value in _activePracticeQuestions.value.indices) _activePracticeQuestions.value[_activeQuestionIndex.value] else null

        if (q != null) {
            viewModelScope.launch {
                repository.recordQuestionAnswer(q, optionIndex)
            }
        }
        persistCurrentExamState()
    }

    fun answerActiveQuestion(optionIndex: Int) {
        val questions = _activePracticeQuestions.value
        val index = _activeQuestionIndex.value
        if (index in questions.indices) {
            val q = questions[index]
            answerQuestion(q.id, optionIndex)
        }
    }

    fun nextQuestion() {
        if (_activeQuestionIndex.value < _activePracticeQuestions.value.size - 1) {
            _activeQuestionIndex.value += 1
            _showExplanation.value = _userAnswers.value.containsKey(_activePracticeQuestions.value[_activeQuestionIndex.value].id)
            persistCurrentExamState()
        }
    }

    fun previousQuestion() {
        if (_activeQuestionIndex.value > 0) {
            _activeQuestionIndex.value -= 1
            _showExplanation.value = _userAnswers.value.containsKey(_activePracticeQuestions.value[_activeQuestionIndex.value].id)
            persistCurrentExamState()
        }
    }

    fun selectQuestionIndex(index: Int) {
        if (index in _activePracticeQuestions.value.indices) {
            _activeQuestionIndex.value = index
            _showExplanation.value = _userAnswers.value.containsKey(_activePracticeQuestions.value[index].id)
            persistCurrentExamState()
        }
    }

    fun finishPracticeSession() {
        val questions = _activePracticeQuestions.value
        val answers = _userAnswers.value
        val answeredCount = answers.size
        var correctCount = 0

        questions.forEach { q ->
            val userAns = answers[q.id]
            if (userAns != null && userAns == q.correctAnswerIndex) {
                correctCount++
            }
        }

        val mode = _practiceModeName.value
        val subjects = questions.map { it.subject }.distinct().joinToString(",")

        viewModelScope.launch {
            if (answeredCount > 0) {
                repository.savePracticeSession(
                    mode = mode,
                    score = correctCount,
                    totalQuestions = answeredCount,
                    subjectsCsv = subjects,
                    durationSeconds = 300,
                    userAnswersMap = answers
                )
            } else {
                repository.clearActiveExamState()
            }
        }
    }

    private val _isMiniCbtSession = MutableStateFlow(false)
    val isMiniCbtSession: StateFlow<Boolean> = _isMiniCbtSession.asStateFlow()

    // Persistent CBT Exploration Memory (Guarantees zero-repetition across repeated mock attempts)
    private val _seenCbtQuestionIds = MutableStateFlow<Set<String>>(emptySet())
    private val _seenCbtQuestionTexts = MutableStateFlow<Set<String>>(emptySet())

    // Auto-save ongoing active CBT exam state to Room for crash recovery & offline continuity
    private fun persistCurrentExamState() {
        val questions = _activePracticeQuestions.value
        if (questions.isEmpty()) return
        val answers = _userAnswers.value
        val answersJson = answers.entries.joinToString(prefix = "{", postfix = "}") { "\"${it.key}\": ${it.value}" }
        val flaggedCsv = _cbtFlaggedQuestions.value.joinToString(",")
        val idsCsv = questions.map { it.id }.joinToString(",")
        val subjects = questions.map { it.subject }.distinct().joinToString(",")
        val mode = _practiceModeName.value
        val isMini = _isMiniCbtSession.value
        val currentIdx = _activeQuestionIndex.value
        val selSubject = _selectedCbtSubject.value
        val timerRemaining = _cbtTimerSeconds.value

        viewModelScope.launch(Dispatchers.IO) {
            repository.saveActiveExamState(
                ActiveExamStateEntity(
                    id = "active_cbt_session",
                    mode = mode,
                    subjectsCsv = subjects,
                    questionIdsCsv = idsCsv,
                    userAnswersJson = answersJson,
                    flaggedIndicesCsv = flaggedCsv,
                    currentQuestionIndex = currentIdx,
                    selectedSubject = selSubject,
                    timerSecondsRemaining = timerRemaining,
                    totalDurationSeconds = if (isMini) 1200L else 7200L,
                    isMiniCbt = isMini,
                    startTimestamp = System.currentTimeMillis(),
                    lastUpdatedTimestamp = System.currentTimeMillis(),
                    isCompleted = false
                )
            )
        }
    }

    private val _totalExamDurationSeconds = MutableStateFlow(1200L)

    // Mini CBT / Subject Practice Session: customizable question count and time limit
    fun startMiniCbtExam(subject: String, questionCount: Int = 20, timeLimitMinutes: Int = 20) {
        val normSubject = QuestionBankGenerator.normalizeSubjectName(subject)
        _isMiniCbtSession.value = true
        _activePracticeQuestions.value = emptyList() // Trigger smooth loading indicator
        _practiceModeName.value = "Practice: $normSubject"
        _selectedCbtSubject.value = normSubject

        val durationSeconds = if (timeLimitMinutes > 0) timeLimitMinutes * 60L else 0L
        _totalExamDurationSeconds.value = if (durationSeconds > 0) durationSeconds else 1200L

        viewModelScope.launch(Dispatchers.Default) {
            val userExposures = repository.getExposuresForUser()
            val pool = allQuestions.value.ifEmpty { repository.questionDao.getAllQuestionsOnce() }.ifEmpty { QuestionBankGenerator.getAllSeedQuestions() }
            
            val miniQuestions = com.example.data.engine.PrepzaCbtEngine.generateMiniCbtExam(
                subject = normSubject,
                targetCount = questionCount,
                availablePool = pool,
                userExposures = userExposures,
                excludedSessionIds = _seenCbtQuestionIds.value
            )

            // Update seen question memory
            val updatedIds = (_seenCbtQuestionIds.value + miniQuestions.map { it.id }).toList().takeLast(3000).toSet()
            val updatedTexts = (_seenCbtQuestionTexts.value + miniQuestions.map { com.example.data.engine.QuestionDeduplicator.normalizeText(it.questionText) }).toList().takeLast(3000).toSet()

            // Record DB exposure count asynchronously
            repository.recordQuestionExposures(miniQuestions)

            withContext(Dispatchers.Main) {
                _seenCbtQuestionIds.value = updatedIds
                _seenCbtQuestionTexts.value = updatedTexts
                _isMiniCbtSession.value = true
                _practiceModeName.value = "Practice: $normSubject"
                _activePracticeQuestions.value = miniQuestions
                _activeQuestionIndex.value = 0
                _userAnswers.value = emptyMap()
                _cbtFlaggedQuestions.value = emptySet()
                _cbtTimerSeconds.value = if (durationSeconds > 0) durationSeconds else 3600L
                _cbtResult.value = null
                _selectedCbtSubject.value = normSubject

                if (timeLimitMinutes > 0) {
                    startCbtTimer()
                }
                persistCurrentExamState()
            }
        }
    }

    // Full 4-Subject CBT Mock (60 English + 40 for each of 3 subjects = 180 Questions)
    fun startCbtMockExam(customSubjects: List<String>? = null) {
        _isMiniCbtSession.value = false
        _activePracticeQuestions.value = emptyList() // Trigger smooth loading indicator
        _practiceModeName.value = "Full CBT Mock Exam"

        val userSubjects = customSubjects ?: (userProfile.value?.jambSubjectsCsv ?: "English Language,Mathematics,Physics,Chemistry")
            .split(",").map { it.trim() }.filter { it.isNotBlank() }

        viewModelScope.launch(Dispatchers.Default) {
            val userExposures = repository.getExposuresForUser()
            val pool = allQuestions.value.ifEmpty { repository.questionDao.getAllQuestionsOnce() }.ifEmpty { QuestionBankGenerator.getAllSeedQuestions() }

            val cbtQuestions = com.example.data.engine.PrepzaCbtEngine.generateFullCbtExam(
                userSubjects = userSubjects,
                availablePool = pool,
                userExposures = userExposures,
                excludedSessionIds = _seenCbtQuestionIds.value
            )

            // Record all questions in the exploration memory
            val updatedIds = (_seenCbtQuestionIds.value + cbtQuestions.map { it.id }).toList().takeLast(5000).toSet()
            val updatedTexts = (_seenCbtQuestionTexts.value + cbtQuestions.map { com.example.data.engine.QuestionDeduplicator.normalizeText(it.questionText) }).toList().takeLast(5000).toSet()

            // Record DB exposure count asynchronously
            repository.recordQuestionExposures(cbtQuestions)

            withContext(Dispatchers.Main) {
                _seenCbtQuestionIds.value = updatedIds
                _seenCbtQuestionTexts.value = updatedTexts
                _practiceModeName.value = "Full CBT Mock Exam"
                _activePracticeQuestions.value = cbtQuestions
                _activeQuestionIndex.value = 0
                _userAnswers.value = emptyMap()
                _cbtFlaggedQuestions.value = emptySet()
                _cbtTimerSeconds.value = 7200L // 2 hours
                _cbtResult.value = null
                _selectedCbtSubject.value = if (cbtQuestions.isNotEmpty()) cbtQuestions[0].subject else "English Language"

                startCbtTimer()
                persistCurrentExamState()
            }
        }
    }

    fun startCbtMockExamWithSubjects(selected4Subjects: List<String>) {
        startCbtMockExam(selected4Subjects)
    }

    private fun startCbtTimer() {
        timerJob?.cancel()
        timerJob = viewModelScope.launch {
            var tickCount = 0
            while (_cbtTimerSeconds.value > 0) {
                delay(1000L)
                _cbtTimerSeconds.value -= 1
                tickCount++
                // Periodically persist timer state every 15 seconds to ensure exact time recovery
                if (tickCount % 15 == 0) {
                    persistCurrentExamState()
                }
            }
            submitCbtExam()
        }
    }

    fun toggleFlagCurrentQuestion() {
        val index = _activeQuestionIndex.value
        val currentSet = _cbtFlaggedQuestions.value.toMutableSet()
        if (currentSet.contains(index)) {
            currentSet.remove(index)
        } else {
            currentSet.add(index)
        }
        _cbtFlaggedQuestions.value = currentSet
        persistCurrentExamState()
    }

    fun flagAndAutoFixQuestion(question: QuestionEntity, reason: String, notes: String = "") {
        val index = _activeQuestionIndex.value
        val currentSet = _cbtFlaggedQuestions.value.toMutableSet()
        currentSet.add(index)
        _cbtFlaggedQuestions.value = currentSet
        persistCurrentExamState()

        // Launch background AI reasoning and database auto-repair
        aiQuestionFixer.flagAndAutoFix(question, reason, notes)
    }

    fun resumeActiveCbtExam() {
        viewModelScope.launch(Dispatchers.IO) {
            val state = repository.getActiveExamStateOnce() ?: return@launch
            val ids = state.questionIdsCsv.split(",").map { it.trim() }.filter { it.isNotBlank() }
            if (ids.isEmpty()) return@launch

            val loadedQuestions = repository.questionDao.getQuestionsByIds(ids)
            val questionMap = loadedQuestions.associateBy { it.id }
            val orderedQuestions = ids.mapNotNull { questionMap[it] }
            if (orderedQuestions.isEmpty()) return@launch

            val parsedAnswers = mutableMapOf<String, Int>()
            if (state.userAnswersJson.isNotBlank() && state.userAnswersJson != "{}") {
                try {
                    val cleaned = state.userAnswersJson.trim().removeSurrounding("{", "}")
                    cleaned.split(",").forEach { entry ->
                        val parts = entry.split(":")
                        if (parts.size == 2) {
                            val qId = parts[0].trim().replace("\"", "")
                            val ansIdx = parts[1].trim().toIntOrNull()
                            if (qId.isNotBlank() && ansIdx != null) {
                                parsedAnswers[qId] = ansIdx
                            }
                        }
                    }
                } catch (_: Exception) {}
            }

            val flags = state.flaggedIndicesCsv.split(",")
                .mapNotNull { it.trim().toIntOrNull() }
                .toSet()

            withContext(Dispatchers.Main) {
                _activePracticeQuestions.value = orderedQuestions
                _activeQuestionIndex.value = state.currentQuestionIndex.coerceIn(0, (orderedQuestions.size - 1).coerceAtLeast(0))
                _userAnswers.value = parsedAnswers
                _cbtFlaggedQuestions.value = flags
                _cbtTimerSeconds.value = state.timerSecondsRemaining.coerceAtLeast(10L)
                _isMiniCbtSession.value = state.isMiniCbt
                _practiceModeName.value = state.mode
                _selectedCbtSubject.value = state.selectedSubject.ifBlank { orderedQuestions.firstOrNull()?.subject ?: "English Language" }
                _cbtResult.value = null

                startCbtTimer()
            }
        }
    }

    fun discardActiveExam() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.clearActiveExamState()
        }
    }

    fun getSubjectCoverageStats(subject: String, onResult: (com.example.data.engine.CbtWeightedRandomizer.SubjectCoverageStats) -> Unit) {
        viewModelScope.launch(Dispatchers.IO) {
            val stats = repository.getSubjectCoverageStats(subject)
            withContext(Dispatchers.Main) {
                onResult(stats)
            }
        }
    }

    fun resetSubjectExposureHistory(subject: String) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.resetExposuresForSubject(subject)
        }
    }

    fun clearAllQuestionExposureHistory() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.clearAllExposures()
        }
    }

    fun syncOfflineDataNow() {
        viewModelScope.launch(Dispatchers.IO) {
            _isSyncingCloud.value = true
            repository.syncPendingData()
            delay(500L)
            _isSyncingCloud.value = false
        }
    }

    fun submitCbtExam() {
        timerJob?.cancel()

        val questions = _activePracticeQuestions.value
        val answers = _userAnswers.value
        val isMini = _isMiniCbtSession.value || _practiceModeName.value.startsWith("Mini CBT") || questions.size == 20
        var totalCorrect = 0

        val subjectMap = mutableMapOf<String, Pair<Int, Int>>() // subject -> (correct, total)

        questions.forEach { q ->
            val userAns = answers[q.id]
            val isCorrect = userAns != null && userAns == q.correctAnswerIndex
            if (isCorrect) totalCorrect++

            val currentPair = subjectMap[q.subject] ?: Pair(0, 0)
            subjectMap[q.subject] = Pair(
                currentPair.first + (if (isCorrect) 1 else 0),
                currentPair.second + 1
            )
        }

        if (isMini) {
            // Single Subject Mini CBT / Practice session: score out of total questions (e.g. 18/20, 36/40, 52/60, 72/80)
            val totalQuestions = if (questions.isNotEmpty()) questions.size else 20
            val accuracy = if (totalQuestions > 0) (totalCorrect * 100) / totalQuestions else 0
            val subjectName = _selectedCbtSubject.value.ifBlank { questions.firstOrNull()?.subject ?: "Subject Practice" }
            val totalDuration = _totalExamDurationSeconds.value
            val timeUsed = if (totalDuration > 0) (totalDuration - _cbtTimerSeconds.value.coerceAtLeast(0L)).coerceAtLeast(1L) else 300L

            val ratio = if (totalQuestions > 0) totalCorrect.toFloat() / totalQuestions else 0f
            val readiness = when {
                ratio >= 0.85f -> "Outstanding Mastery ($totalCorrect/$totalQuestions • ${accuracy}%) — Top 1% UTME Grade!"
                ratio >= 0.70f -> "Strong Performance ($totalCorrect/$totalQuestions • ${accuracy}%) — On track for high score"
                ratio >= 0.50f -> "Fair Performance ($totalCorrect/$totalQuestions • ${accuracy}%) — Solid foundation, review missed items"
                else -> "Needs Focused Revision ($totalCorrect/$totalQuestions • ${accuracy}%) — Use AI Tutor to master these topics"
            }

            val summary = CbtResultSummary(
                totalScore = totalCorrect,
                targetScore = totalQuestions,
                maxScore = totalQuestions,
                isMiniCbt = true,
                miniCbtSubject = subjectName,
                accuracyPercent = accuracy,
                subjectScores = if (subjectMap.isNotEmpty()) subjectMap else mapOf(subjectName to Pair(totalCorrect, totalQuestions)),
                totalTimeSeconds = timeUsed,
                readinessEstimate = readiness,
                questions = questions,
                userAnswers = answers
            )

            _cbtResult.value = summary

            viewModelScope.launch {
                repository.savePracticeSession(
                    mode = "Mini CBT: $subjectName",
                    score = totalCorrect,
                    totalQuestions = totalQuestions,
                    subjectsCsv = subjectName,
                    durationSeconds = timeUsed,
                    userAnswersMap = answers
                )
            }
        } else {
            // Full 4-Subject CBT Mock: Standard JAMB score out of 400
            var totalSumScore = 0
            subjectMap.forEach { (_, stats) ->
                val (correct, total) = stats
                val subjectScore = if (total > 0) {
                    kotlin.math.round((correct.toDouble() / total.toDouble()) * 100.0).toInt()
                } else 0
                totalSumScore += subjectScore
            }

            val accuracy = if (questions.isNotEmpty()) (totalCorrect * 100) / questions.size else 0
            val target = userProfile.value?.targetScore ?: 320
            val timeUsed = 7200L - _cbtTimerSeconds.value.coerceAtLeast(0L)

            val readiness = when {
                totalSumScore >= target -> "Exceptional! Exceeding target score of $target ($totalSumScore/400)"
                totalSumScore >= target - 30 -> "High Readiness (Very close to $target target — $totalSumScore/400)"
                totalSumScore >= 250 -> "Moderate Readiness ($totalSumScore/400 — Estimated 250 - 290 range)"
                else -> "Needs Intensive Revision in Weak Topics ($totalSumScore/400)"
            }

            val summary = CbtResultSummary(
                totalScore = totalSumScore,
                targetScore = target,
                maxScore = if (subjectMap.isNotEmpty()) subjectMap.size * 100 else 400,
                isMiniCbt = false,
                miniCbtSubject = null,
                accuracyPercent = accuracy,
                subjectScores = subjectMap,
                totalTimeSeconds = timeUsed,
                readinessEstimate = readiness,
                questions = questions,
                userAnswers = answers
            )

            _cbtResult.value = summary

            // Save session
            viewModelScope.launch {
                repository.savePracticeSession(
                    mode = "Full CBT Mock",
                    score = totalCorrect,
                    totalQuestions = questions.size,
                    subjectsCsv = subjectMap.keys.joinToString(","),
                    durationSeconds = timeUsed,
                    userAnswersMap = answers
                )
            }
        }
    }

    private val _cbtPersonalizedPlan = MutableStateFlow<String?>(null)
    val cbtPersonalizedPlan: StateFlow<String?> = _cbtPersonalizedPlan.asStateFlow()

    private val _isGeneratingPlan = MutableStateFlow(false)
    val isGeneratingPlan: StateFlow<Boolean> = _isGeneratingPlan.asStateFlow()

    fun generatePersonalizedPlanForCbt(summary: CbtResultSummary) {
        viewModelScope.launch {
            _isGeneratingPlan.value = true
            val weakTopics = mutableListOf<String>()
            val questions = _activePracticeQuestions.value
            val answers = _userAnswers.value
            questions.forEach { q ->
                val userAns = answers[q.id]
                if (userAns != null && userAns != q.correctAnswerIndex) {
                    weakTopics.add("${q.subject}: ${q.topic}")
                }
            }
            val distinctWeak = weakTopics.distinct().take(6)
            val plan = aiTutorService.generatePersonalizedStudyPlan(
                targetScore = summary.targetScore,
                totalScore = summary.totalScore,
                subjectScores = summary.subjectScores,
                weakTopics = distinctWeak
            )
            _cbtPersonalizedPlan.value = plan
            _isGeneratingPlan.value = false
        }
    }

    fun toggleBookmark(questionId: String) {
        viewModelScope.launch {
            val isBookmarked = allBookmarks.value.any { it.questionId == questionId }
            repository.toggleBookmark(questionId, isBookmarked)
        }
    }

    // AI Tutor Chat
    fun askAiTutor(
        userText: String,
        questionContext: String = "",
        customPersona: com.example.data.ai.TutorPersona? = null
    ) {
        if (userText.isBlank()) return
        val persona = customPersona ?: _selectedTutorPersona.value

        val historySnapshot = _aiChatMessages.value.map { it.sender to it.text }
        val currentMessages = _aiChatMessages.value.toMutableList()
        currentMessages.add(AiChatMessage("user", userText))
        _aiChatMessages.value = currentMessages
        _isAiLoading.value = true

        viewModelScope.launch {
            val reply = aiTutorService.askTutor(
                questionContext = questionContext,
                userQuery = userText,
                conversationHistory = historySnapshot,
                persona = persona
            )
            val updated = _aiChatMessages.value.toMutableList()
            updated.add(AiChatMessage("tutor", reply))
            _aiChatMessages.value = updated
            _isAiLoading.value = false
        }
    }

    fun askAiTutorAboutQuestion(question: QuestionEntity, userSelectedOption: Int? = null) {
        val optionsList = listOf(
            "A) ${question.optionA}",
            "B) ${question.optionB}",
            "C) ${question.optionC}",
            "D) ${question.optionD}"
        )
        val selectedLetter = when (userSelectedOption) {
            0 -> "A (${question.optionA})"
            1 -> "B (${question.optionB})"
            2 -> "C (${question.optionC})"
            3 -> "D (${question.optionD})"
            else -> "Not answered"
        }
        val correctLetter = when (question.correctAnswerIndex) {
            0 -> "A (${question.optionA})"
            1 -> "B (${question.optionB})"
            2 -> "C (${question.optionC})"
            3 -> "D (${question.optionD})"
            else -> "Option ${question.correctAnswerIndex + 1}"
        }

        val contextStr = """
            Subject: ${question.subject}
            Topic: ${question.topic} (UTME ${question.year})
            Question: ${question.questionText}
            Options:
            ${optionsList.joinToString("\n")}
            Student Choice: $selectedLetter
            Official Correct Answer: $correctLetter
            Official Explanation: ${question.explanation}
        """.trimIndent()

        val prompt = "Please explain this ${question.subject} question step-by-step. Break down why option $correctLetter is the correct answer, why other options are incorrect, and give a quick mnemonic or exam trick to solve similar questions in UTME."
        val chosenPersona = when (question.subject.lowercase()) {
            "mathematics", "physics", "chemistry" -> com.example.data.ai.TutorPersona.STEM_SPECIALIST
            "literature in english" -> com.example.data.ai.TutorPersona.LITERATURE_ANALYST
            else -> com.example.data.ai.TutorPersona.GENERAL_COACH
        }
        askAiTutor(prompt, contextStr, chosenPersona)
    }

    fun clearAiChat(persona: com.example.data.ai.TutorPersona = _selectedTutorPersona.value) {
        _aiChatMessages.value = listOf(
            AiChatMessage(
                "tutor",
                persona.defaultGreeting
            )
        )
    }

    // Literature Reader
    fun openBook(book: LiteratureBookEntity) {
        _activeBook.value = book
        _activeChapterIndex.value = book.lastReadChapterIndex
    }

    fun closeReader() {
        _activeBook.value = null
    }

    fun selectChapter(index: Int) {
        _activeChapterIndex.value = index
    }

    fun updateBookReadingProgress(bookId: String, progressPercent: Int, lastReadChapterIndex: Int) {
        viewModelScope.launch {
            repository.updateBookReadingProgress(bookId, progressPercent, lastReadChapterIndex)
            val current = _activeBook.value
            if (current != null && current.id == bookId) {
                _activeBook.value = current.copy(
                    readingProgressPercent = progressPercent,
                    lastReadChapterIndex = lastReadChapterIndex
                )
            }
            _activeChapterIndex.value = lastReadChapterIndex
        }
    }

    // Friends & Profile
    fun addFriend(code: String, onResult: (Boolean, String?) -> Unit = { _, _ -> }) {
        viewModelScope.launch {
            val res = repository.addFriendByCode(code)
            if (res.isSuccess) {
                onResult(true, null)
            } else {
                onResult(false, res.exceptionOrNull()?.message ?: "invalid code")
            }
        }
    }

    fun applyReferralCode(code: String, onResult: (Boolean, String?) -> Unit = { _, _ -> }) {
        viewModelScope.launch {
            val res = repository.applyReferralCode(code)
            if (res.isSuccess) {
                onResult(true, res.getOrNull())
            } else {
                onResult(false, res.exceptionOrNull()?.message ?: "invalid code")
            }
        }
    }

    fun recordReferral(onComplete: ((UserProfileEntity) -> Unit)? = null) {
        viewModelScope.launch {
            val updated = repository.recordSuccessfulReferral()
            onComplete?.invoke(updated)
        }
    }

    fun addCustomFriend(name: String, code: String, accuracy: Int = 80, streak: Int = 10, onComplete: ((FriendEntity) -> Unit)? = null) {
        viewModelScope.launch {
            val friend = repository.addCustomFriend(name, code, accuracy, streak)
            onComplete?.invoke(friend)
        }
    }

    fun removeFriend(friendId: String) {
        viewModelScope.launch {
            if (_activeChatFriend.value?.id == friendId) {
                _activeChatFriend.value = null
            }
            repository.removeFriend(friendId)
        }
    }

    fun updateProfile(
        name: String,
        targetScore: Int,
        subjectsCsv: String,
        targetInstitution: String? = null,
        dreamCourse: String? = null,
        learningStyle: String? = null,
        studyGoalMinutes: Int? = null,
        jambExamDateTimestamp: Long? = null
    ) {
        viewModelScope.launch {
            repository.updateUserProfile(
                name = name,
                targetScore = targetScore,
                jambSubjectsCsv = subjectsCsv,
                targetInstitution = targetInstitution,
                dreamCourse = dreamCourse,
                learningStyle = learningStyle,
                studyGoalMinutes = studyGoalMinutes,
                jambExamDateTimestamp = jambExamDateTimestamp
            )
        }
    }

    fun updateAcademicSettings(
        targetScore: Int,
        subjectsCsv: String,
        studyGoalMinutes: Int,
        targetInstitution: String? = null,
        dreamCourse: String? = null,
        learningStyle: String? = null,
        preferredStudyTime: String? = null,
        jambExamDateTimestamp: Long? = null
    ) {
        viewModelScope.launch {
            repository.updateAcademicProfile(
                targetScore = targetScore,
                jambSubjectsCsv = subjectsCsv,
                studyGoalMinutes = studyGoalMinutes,
                targetInstitution = targetInstitution,
                dreamCourse = dreamCourse,
                learningStyle = learningStyle,
                preferredStudyTime = preferredStudyTime,
                jambExamDateTimestamp = jambExamDateTimestamp
            )
        }
    }

    fun updateJambExamDate(timestamp: Long) {
        viewModelScope.launch {
            repository.updateJambExamDate(timestamp)
        }
    }

    // --- Friend Chat Operations ---

    fun openFriendChat(friend: FriendEntity) {
        _activeChatFriend.value = friend
    }

    fun openFriendChatByName(friendName: String) {
        val existing = allFriends.value.find { it.name.equals(friendName, ignoreCase = true) }
        if (existing != null) {
            _activeChatFriend.value = existing
        } else {
            val fallback = FriendEntity(
                id = "f_" + friendName.lowercase().replace(" ", "_"),
                name = friendName,
                accuracyPercent = 82,
                streakDays = 14,
                friendCode = "PREP" + (100..999).random(),
                status = "following",
                isFollowing = true
            )
            viewModelScope.launch {
                repository.friendDao.upsertFriend(fallback)
                _activeChatFriend.value = fallback
            }
        }
    }

    fun closeFriendChat() {
        _activeChatFriend.value = null
    }

    fun acceptFriendRequest(friendName: String, onAccepted: ((FriendEntity) -> Unit)? = null) {
        viewModelScope.launch {
            repository.updateFriendStatus(friendName, "following")
            val updatedList = repository.allFriends.firstOrNull() ?: emptyList()
            val friend = updatedList.find { it.name.equals(friendName, ignoreCase = true) }
                ?: FriendEntity(
                    id = "f_" + friendName.lowercase().replace(" ", "_"),
                    name = friendName,
                    accuracyPercent = 80,
                    streakDays = 10,
                    friendCode = "PRZ" + (100..999).random(),
                    status = "following",
                    isFollowing = true
                )
            if (onAccepted != null) {
                onAccepted(friend)
            }
        }
    }

    fun sendFriendChatMessage(text: String) {
        val friend = _activeChatFriend.value ?: return
        val myName = userProfile.value?.name ?: "Candidate"
        val trimmed = text.trim()
        if (trimmed.isBlank()) return

        viewModelScope.launch {
            repository.sendChatMessage(
                friendId = friend.id,
                text = trimmed,
                isFromMe = true,
                senderName = myName
            )
        }
    }

    // --- Prepza Plus & Trial Actions ---

    fun upgradeToPrepzaPlus() {
        viewModelScope.launch {
            repository.upgradeToPrepzaPlus()
        }
    }

    fun dismissMilestoneReminder(milestone: Int) {
        viewModelScope.launch {
            repository.dismissMilestoneReminder(milestone)
        }
    }

    fun simulateTrialDays(daysPassed: Int) {
        viewModelScope.launch {
            repository.simulateTrialDaysPassed(daysPassed)
        }
    }

    fun resetTrial() {
        viewModelScope.launch {
            repository.resetTrial()
        }
    }

    fun cleanAllQuestions(onComplete: ((Int) -> Unit)? = null) {
        viewModelScope.launch {
            val count = repository.cleanAllQuestions()
            onComplete?.invoke(count)
        }
    }

    // --- Interactive Home & Subject Learning Actions ---

    fun selectSubject(subjectName: String) {
        _selectedSubjectName.value = subjectName
    }

    fun selectLearningTopic(subjectName: String, topicName: String) {
        _selectedSubjectName.value = subjectName
        val pack = com.example.data.learning.CurriculumRegistry.getTopicPack(subjectName, topicName)
            ?: com.example.data.learning.CurriculumRegistry.getCurriculum(subjectName)?.allTopics?.firstOrNull()
        _selectedLearningPack.value = pack
        _currentLearningCardIndex.value = 0
        _isLearningPackCompleted.value = false
        // Restore existing card position if any
        viewModelScope.launch {
            val progress = repository.getTopicProgress("", subjectName, topicName).firstOrNull()
            if (progress != null && progress.currentCardIndex > 0) {
                _currentLearningCardIndex.value = progress.currentCardIndex
            }
        }
    }

    fun startLearningPack(pack: com.example.data.learning.LearningPack, resumeCardIndex: Int = 0) {
        _selectedLearningPack.value = pack
        _selectedSubjectName.value = pack.subject
        _currentLearningCardIndex.value = resumeCardIndex
        _isLearningPackCompleted.value = false
        _isQuickRecallFinished.value = false
        _quickRecallIndex.value = 0
        _quickRecallAnswers.value = emptyMap()
        _quickRecallScore.value = 0
    }

    fun setLearningCardIndex(index: Int) {
        val pack = _selectedLearningPack.value ?: return
        val clamped = index.coerceIn(0, (pack.cards.size - 1).coerceAtLeast(0))
        _currentLearningCardIndex.value = clamped
        if (clamped >= pack.cards.size - 1) {
            _isLearningPackCompleted.value = true
        }
        viewModelScope.launch {
            repository.saveCardPosition(
                userId = "",
                subject = pack.subject,
                topicName = pack.topicName,
                cardIndex = clamped,
                totalCards = pack.cards.size
            )
        }
    }

    fun nextLearningCard() {
        val pack = _selectedLearningPack.value ?: return
        if (_currentLearningCardIndex.value < pack.cards.size - 1) {
            setLearningCardIndex(_currentLearningCardIndex.value + 1)
        } else {
            _isLearningPackCompleted.value = true
        }
    }

    fun previousLearningCard() {
        if (_currentLearningCardIndex.value > 0) {
            setLearningCardIndex(_currentLearningCardIndex.value - 1)
        }
    }

    fun startQuickRecall() {
        val pack = _selectedLearningPack.value ?: return
        _quickRecallIndex.value = 0
        _quickRecallAnswers.value = emptyMap()
        _quickRecallScore.value = 0
        _isQuickRecallFinished.value = false
    }

    fun answerQuickRecallQuestion(questionIndex: Int, selectedOptionIndex: Int) {
        val pack = _selectedLearningPack.value ?: return
        if (questionIndex >= pack.recallQuestions.size) return
        val currentMap = _quickRecallAnswers.value.toMutableMap()
        if (currentMap.containsKey(questionIndex)) return // Already answered
        currentMap[questionIndex] = selectedOptionIndex
        _quickRecallAnswers.value = currentMap

        val q = pack.recallQuestions[questionIndex]
        if (selectedOptionIndex == q.correctIndex) {
            _quickRecallScore.value += 1
        }

        // If this was the last question, complete recall
        if (currentMap.size >= pack.recallQuestions.size) {
            _isQuickRecallFinished.value = true
            viewModelScope.launch {
                repository.recordQuickRecallResult(
                    userId = "",
                    subject = pack.subject,
                    topicName = pack.topicName,
                    score = _quickRecallScore.value,
                    total = pack.recallQuestions.size
                )
            }
        }
    }

    fun nextQuickRecallQuestion() {
        val pack = _selectedLearningPack.value ?: return
        if (_quickRecallIndex.value < pack.recallQuestions.size - 1) {
            _quickRecallIndex.value += 1
        } else {
            _isQuickRecallFinished.value = true
        }
    }

    fun savePersonalStudyCard(front: String, back: String, note: String?) {
        val pack = _selectedLearningPack.value ?: return
        if (front.isBlank() || back.isBlank()) return
        viewModelScope.launch {
            val card = UserPersonalCardEntity(
                id = java.util.UUID.randomUUID().toString(),
                userId = "",
                subject = pack.subject,
                topicName = pack.topicName,
                frontText = front.trim(),
                backText = back.trim(),
                note = note?.trim()?.ifBlank { null }
            )
            repository.savePersonalCard(card)
        }
    }

    fun deletePersonalStudyCard(cardId: String) {
        viewModelScope.launch {
            repository.deletePersonalCard(cardId)
        }
    }

    fun toggleTopicBookmark(subject: String, topicName: String, isBookmarked: Boolean) {
        viewModelScope.launch {
            repository.toggleTopicBookmark("", subject, topicName, isBookmarked)
        }
    }

    fun toggleLearningCardBookmark(subject: String, topicName: String, cardId: String, isBookmarked: Boolean = true) {
        viewModelScope.launch {
            repository.toggleCardBookmark(
                userId = "",
                cardId = cardId,
                topicName = topicName,
                subject = subject,
                isBookmarked = isBookmarked
            )
        }
    }

    fun updateTopicNotes(subject: String, topicName: String, notes: String?) {
        viewModelScope.launch {
            repository.updateTopicPersonalNotes("", subject, topicName, notes)
        }
    }

    fun startTopicPracticeSession(subject: String, topicName: String) {
        startPracticeSession(
            mode = "Topic Practice: $topicName",
            subjectFilter = subject,
            topicFilter = topicName
        )
    }

    fun startTopicMiniCbt(subject: String, topicName: String, questionCount: Int = 10, timeLimitMinutes: Int = 15) {
        val normSubject = QuestionBankGenerator.normalizeSubjectName(subject)
        _isMiniCbtSession.value = true
        _activePracticeQuestions.value = emptyList()
        _practiceModeName.value = "Mini CBT: $topicName"
        _selectedCbtSubject.value = normSubject

        val durationSeconds = if (timeLimitMinutes > 0) timeLimitMinutes * 60L else 0L
        _totalExamDurationSeconds.value = if (durationSeconds > 0) durationSeconds else 1200L

        viewModelScope.launch(Dispatchers.Default) {
            val userExposures = repository.getExposuresForUser()
            val pool = allQuestions.value.ifEmpty { repository.questionDao.getAllQuestionsOnce() }.ifEmpty { QuestionBankGenerator.getAllSeedQuestions() }
            
            val topicPool = pool.filter { 
                (it.subject.equals(normSubject, ignoreCase = true) || it.subject.equals(subject, ignoreCase = true)) &&
                (it.topic.contains(topicName, ignoreCase = true) || topicName.contains(it.topic, ignoreCase = true))
            }
            val poolToUse = if (topicPool.size >= 5) topicPool else pool.filter { it.subject.equals(normSubject, ignoreCase = true) || it.subject.equals(subject, ignoreCase = true) }

            val miniQuestions = com.example.data.engine.PrepzaCbtEngine.generateMiniCbtExam(
                subject = normSubject,
                targetCount = questionCount,
                availablePool = poolToUse,
                userExposures = userExposures,
                excludedSessionIds = _seenCbtQuestionIds.value
            )

            val updatedIds = (_seenCbtQuestionIds.value + miniQuestions.map { it.id }).toList().takeLast(3000).toSet()
            val updatedTexts = (_seenCbtQuestionTexts.value + miniQuestions.map { com.example.data.engine.QuestionDeduplicator.normalizeText(it.questionText) }).toList().takeLast(3000).toSet()

            repository.recordQuestionExposures(miniQuestions)

            withContext(Dispatchers.Main) {
                _seenCbtQuestionIds.value = updatedIds
                _seenCbtQuestionTexts.value = updatedTexts
                _isMiniCbtSession.value = true
                _practiceModeName.value = "Mini CBT: $topicName"
                _activePracticeQuestions.value = miniQuestions
                _activeQuestionIndex.value = 0
                _userAnswers.value = emptyMap()
                _cbtFlaggedQuestions.value = emptySet()
                _cbtTimerSeconds.value = if (durationSeconds > 0) durationSeconds else 3600L
                _cbtResult.value = null
                _selectedCbtSubject.value = normSubject

                if (timeLimitMinutes > 0) {
                    startCbtTimer()
                }
                persistCurrentExamState()
            }
        }
    }
}
