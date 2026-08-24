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

    // Database Initialization
    init {
        viewModelScope.launch {
            repository.initializeDatabaseIfEmpty()
        }
    }

    // StateFlows from Repository
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

    fun signUpWithEmail(
        name: String,
        email: String,
        password: String,
        referralCode: String? = null,
        onResult: (Boolean, String?) -> Unit
    ) {
        viewModelScope.launch {
            val res = repository.signUpWithEmail(name, email, password, referralCode)
            if (res.isSuccess) {
                onResult(true, null)
            } else {
                onResult(false, res.exceptionOrNull()?.message ?: "Sign up failed")
            }
        }
    }

    fun loginWithEmail(email: String, password: String, onResult: (Boolean, String?) -> Unit) {
        viewModelScope.launch {
            val res = repository.loginWithEmail(email, password)
            if (res.isSuccess) {
                onResult(true, null)
            } else {
                onResult(false, res.exceptionOrNull()?.message ?: "Login failed")
            }
        }
    }

    fun loginWithGoogle(
        name: String,
        email: String,
        referralCode: String? = null,
        onResult: (Boolean, String?) -> Unit
    ) {
        viewModelScope.launch {
            val res = repository.loginWithGoogle(name, email, referralCode)
            if (res.isSuccess) {
                onResult(true, null)
            } else {
                onResult(false, res.exceptionOrNull()?.message ?: "Google login failed")
            }
        }
    }

    fun loginWithPhone(
        phoneNumber: String,
        name: String,
        referralCode: String? = null,
        onResult: (Boolean, String?) -> Unit
    ) {
        viewModelScope.launch {
            val res = repository.loginWithPhone(phoneNumber, name, referralCode)
            if (res.isSuccess) {
                onResult(true, null)
            } else {
                onResult(false, res.exceptionOrNull()?.message ?: "Phone login failed")
            }
        }
    }

    fun loginAsGuest(onResult: (Boolean, String?) -> Unit) {
        viewModelScope.launch {
            val res = repository.loginAsGuest()
            if (res.isSuccess) {
                onResult(true, null)
            } else {
                onResult(false, res.exceptionOrNull()?.message ?: "Guest login failed")
            }
        }
    }

    fun logOut() {
        viewModelScope.launch {
            repository.logOut()
        }
    }

    fun switchAccount(accountId: String) {
        viewModelScope.launch {
            repository.switchAccount(accountId)
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

        val poolSource = allQuestions.value.ifEmpty { QuestionBankGenerator.getAllSeedQuestions() }
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

        val pool = if (topicFiltered.isNotEmpty()) topicFiltered else poolSource
        val questions = pool.shuffled()

        _practiceModeName.value = mode
        _activePracticeQuestions.value = if (mode == "Quick Practice") questions.take(10) else questions
        _activeQuestionIndex.value = 0
        _userAnswers.value = emptyMap()
        _showExplanation.value = false
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

    fun answerActiveQuestion(optionIndex: Int) {
        val questions = _activePracticeQuestions.value
        val index = _activeQuestionIndex.value
        if (index in questions.indices) {
            val q = questions[index]
            val currentMap = _userAnswers.value.toMutableMap()
            currentMap[q.id] = optionIndex
            _userAnswers.value = currentMap
            _showExplanation.value = true

            // Record in repository
            viewModelScope.launch {
                repository.recordQuestionAnswer(q, optionIndex)
            }
        }
    }

    fun nextQuestion() {
        if (_activeQuestionIndex.value < _activePracticeQuestions.value.size - 1) {
            _activeQuestionIndex.value += 1
            _showExplanation.value = _userAnswers.value.containsKey(_activePracticeQuestions.value[_activeQuestionIndex.value].id)
        }
    }

    fun previousQuestion() {
        if (_activeQuestionIndex.value > 0) {
            _activeQuestionIndex.value -= 1
            _showExplanation.value = _userAnswers.value.containsKey(_activePracticeQuestions.value[_activeQuestionIndex.value].id)
        }
    }

    fun selectQuestionIndex(index: Int) {
        if (index in _activePracticeQuestions.value.indices) {
            _activeQuestionIndex.value = index
            _showExplanation.value = _userAnswers.value.containsKey(_activePracticeQuestions.value[index].id)
        }
    }

    fun finishPracticeSession() {
        val questions = _activePracticeQuestions.value
        val answers = _userAnswers.value
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
            repository.savePracticeSession(
                mode = mode,
                score = correctCount,
                totalQuestions = questions.size,
                subjectsCsv = subjects,
                durationSeconds = 300,
                userAnswersMap = answers
            )
        }
    }

    private val _isMiniCbtSession = MutableStateFlow(false)
    val isMiniCbtSession: StateFlow<Boolean> = _isMiniCbtSession.asStateFlow()

    // Persistent CBT Exploration Memory (Guarantees zero-repetition across repeated mock attempts)
    private val _seenCbtQuestionIds = MutableStateFlow<Set<String>>(emptySet())
    private val _seenCbtQuestionTexts = MutableStateFlow<Set<String>>(emptySet())

    // Mini CBT Session: 20 Randomly Generated Questions for a specific subject
    fun startMiniCbtExam(subject: String) {
        val normSubject = QuestionBankGenerator.normalizeSubjectName(subject)
        _isMiniCbtSession.value = true
        _activePracticeQuestions.value = emptyList() // Trigger smooth loading indicator
        _practiceModeName.value = "Mini CBT: $normSubject"
        _selectedCbtSubject.value = normSubject

        viewModelScope.launch(Dispatchers.Default) {
            val userExposures = repository.getExposuresForUser()
            val pool = allQuestions.value.ifEmpty { repository.questionDao.getAllQuestionsOnce() }.ifEmpty { QuestionBankGenerator.getAllSeedQuestions() }
            
            val miniQuestions = com.example.data.engine.PrepzaCbtEngine.generateMiniCbtExam(
                subject = normSubject,
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
                _practiceModeName.value = "Mini CBT: $normSubject"
                _activePracticeQuestions.value = miniQuestions
                _activeQuestionIndex.value = 0
                _userAnswers.value = emptyMap()
                _cbtFlaggedQuestions.value = emptySet()
                _cbtTimerSeconds.value = 1200L // 20 minutes for 20 questions
                _cbtResult.value = null
                _selectedCbtSubject.value = normSubject

                startCbtTimer()
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
            }
        }
    }

    fun startCbtMockExamWithSubjects(selected4Subjects: List<String>) {
        startCbtMockExam(selected4Subjects)
    }

    private fun startCbtTimer() {
        timerJob?.cancel()
        timerJob = viewModelScope.launch {
            while (_cbtTimerSeconds.value > 0) {
                delay(1000L)
                _cbtTimerSeconds.value -= 1
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
            // Single Subject Mini CBT: Normal score out of 20 (e.g. 15/20 or 4/20), NOT over 400!
            val totalQuestions = if (questions.isNotEmpty()) questions.size else 20
            val accuracy = if (totalQuestions > 0) (totalCorrect * 100) / totalQuestions else 0
            val subjectName = _selectedCbtSubject.value.ifBlank { questions.firstOrNull()?.subject ?: "Subject Practice" }
            val timeUsed = 1200L - _cbtTimerSeconds.value.coerceAtLeast(0L)

            val readiness = when {
                totalCorrect >= 18 -> "Outstanding Mastery ($totalCorrect/$totalQuestions • ${accuracy}%) — Top 1% UTME Grade!"
                totalCorrect >= 14 -> "Strong Performance ($totalCorrect/$totalQuestions • ${accuracy}%) — On track for high score"
                totalCorrect >= 10 -> "Fair Performance ($totalCorrect/$totalQuestions • ${accuracy}%) — Solid foundation, review missed items"
                else -> "Needs Focused Revision ($totalCorrect/$totalQuestions • ${accuracy}%) — Use AI Tutor to master these topics"
            }

            val summary = CbtResultSummary(
                totalScore = totalCorrect, // e.g. 15
                targetScore = 20,
                maxScore = totalQuestions, // 20
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
}
