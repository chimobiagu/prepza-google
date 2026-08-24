package com.example

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.data.db.QuestionEntity
import com.example.ui.components.AcademicSettingsDialog
import com.example.ui.components.PrepzaPlusUpgradeDialog
import com.example.ui.components.TrialMilestoneReminderDialog
import com.example.ui.screens.*
import com.example.ui.theme.PrepzaTheme
import com.example.ui.theme.PrimaryGreen
import com.example.ui.theme.SurfaceWhite
import com.example.ui.theme.TextPrimary
import com.example.ui.theme.TextSecondary
import com.example.ui.viewmodel.MainViewModel
import kotlinx.coroutines.launch

enum class MainTab(val title: String, val selectedIcon: ImageVector, val unselectedIcon: ImageVector) {
    HOME("Home", Icons.Filled.Home, Icons.Outlined.Home),
    PRACTICE("Practice", Icons.Filled.PlayCircle, Icons.Outlined.PlayCircleOutline),
    PROGRESS("Progress", Icons.Filled.BarChart, Icons.Outlined.BarChart),
    LIBRARY("Library", Icons.Filled.MenuBook, Icons.Outlined.MenuBook)
}

enum class ActiveScreen {
    AUTH,
    ONBOARDING,
    MAIN_TABS,
    QUESTION_PRACTICE,
    CBT_EXAM,
    CBT_RESULTS,
    AI_TUTOR,
    BOOKMARKS,
    FRIENDS,
    FRIEND_CHAT,
    MISTAKE_BANK,
    OFFLINE_PACKS
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        com.example.workers.TrialExpirationWorker.scheduleTrialChecks(this)
        setContent {
            val viewModel: MainViewModel = viewModel()
            PrepzaTheme {
                PrepzaApp(viewModel = viewModel)
            }
        }
    }
}

@Composable
fun PrepzaApp(viewModel: MainViewModel = viewModel()) {
    val coroutineScope = rememberCoroutineScope()

    // Request POST_NOTIFICATIONS permission on Android 13+
    val notificationPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { _ -> }

    LaunchedEffect(Unit) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            notificationPermissionLauncher.launch(android.Manifest.permission.POST_NOTIFICATIONS)
        }
    }

    val activeAccount by viewModel.activeAccount.collectAsStateWithLifecycle()
    val allAccounts by viewModel.allAccounts.collectAsStateWithLifecycle()
    val userProfile by viewModel.userProfile.collectAsStateWithLifecycle()
    val allQuestions by viewModel.allQuestions.collectAsStateWithLifecycle()
    val allBookmarks by viewModel.allBookmarks.collectAsStateWithLifecycle()
    val allFriends by viewModel.allFriends.collectAsStateWithLifecycle()
    val allMistakes by viewModel.allMistakes.collectAsStateWithLifecycle()
    val unmasteredMistakesCount by viewModel.unmasteredMistakesCount.collectAsStateWithLifecycle()
    val offlinePacks by viewModel.offlinePacks.collectAsStateWithLifecycle()
    val literatureBooks by viewModel.literatureBooks.collectAsStateWithLifecycle()
    val recentSessions by viewModel.recentSessions.collectAsStateWithLifecycle()

    val activePracticeQuestions by viewModel.activePracticeQuestions.collectAsStateWithLifecycle()
    val activeQuestionIndex by viewModel.activeQuestionIndex.collectAsStateWithLifecycle()
    val userAnswers by viewModel.userAnswers.collectAsStateWithLifecycle()
    val showExplanation by viewModel.showExplanation.collectAsStateWithLifecycle()

    val cbtTimerSeconds by viewModel.cbtTimerSeconds.collectAsStateWithLifecycle()
    val cbtFlaggedQuestions by viewModel.cbtFlaggedQuestions.collectAsStateWithLifecycle()
    val selectedCbtSubject by viewModel.selectedCbtSubject.collectAsStateWithLifecycle()
    val cbtResult by viewModel.cbtResult.collectAsStateWithLifecycle()

    val activeBook by viewModel.activeBook.collectAsStateWithLifecycle()
    val activeChapterIndex by viewModel.activeChapterIndex.collectAsStateWithLifecycle()

    val activeChatFriend by viewModel.activeChatFriend.collectAsStateWithLifecycle()
    val activeFriendChatMessages by viewModel.activeFriendChatMessages.collectAsStateWithLifecycle()
    val isFriendTyping by viewModel.isFriendTyping.collectAsStateWithLifecycle()

    val aiChatMessages by viewModel.aiChatMessages.collectAsStateWithLifecycle()
    val isAiLoading by viewModel.isAiLoading.collectAsStateWithLifecycle()
    val selectedTutorPersona by viewModel.selectedTutorPersona.collectAsStateWithLifecycle()

    var activeScreen by remember { mutableStateOf(ActiveScreen.MAIN_TABS) }
    var currentTab by remember { mutableStateOf(MainTab.HOME) }
    var contextQuestionForAi by remember { mutableStateOf("") }
    var showSettingsDialog by remember { mutableStateOf(false) }
    var showUpgradeDialog by remember { mutableStateOf(false) }

    var authErrorMessage by remember { mutableStateOf<String?>(null) }
    var isAuthLoading by remember { mutableStateOf(false) }

    val bookmarkedIds = remember(allBookmarks) { allBookmarks.map { it.questionId }.toSet() }

    // Check for active milestone reminder (20, 10, 5, 2 days before 30-day trial expires)
    val activeMilestone = userProfile?.activeMilestoneReminder
    if (activeMilestone != null && userProfile?.isPlusSubscriber != true) {
        TrialMilestoneReminderDialog(
            milestoneDaysLeft = activeMilestone,
            onUpgradeClick = {
                viewModel.dismissMilestoneReminder(activeMilestone)
                showUpgradeDialog = true
            },
            onDismissReminder = {
                viewModel.dismissMilestoneReminder(activeMilestone)
            }
        )
    }

    // Prepza Plus Upgrade Dialog (shown on user click)
    if (showUpgradeDialog) {
        PrepzaPlusUpgradeDialog(
            daysRemaining = userProfile?.daysRemainingInTrial ?: 30,
            isMandatoryExpired = false,
            studentName = userProfile?.name ?: "",
            studentPhone = activeAccount?.phoneNumber ?: "",
            studentEmail = activeAccount?.email ?: (userProfile?.email ?: ""),
            onUpgradeSuccess = {
                viewModel.upgradeToPrepzaPlus()
                showUpgradeDialog = false
            },
            onSimulateDays = { days ->
                viewModel.simulateTrialDays(days)
            },
            onResetTrial = {
                viewModel.resetTrial()
            },
            onDismiss = {
                showUpgradeDialog = false
            }
        )
    }

    if (showSettingsDialog) {
        AcademicSettingsDialog(
            profile = userProfile,
            activeAccount = activeAccount,
            onSaveProfile = { targetScore, subjectsCsv, studyGoalMinutes, institution, dreamCourse, jambDate ->
                viewModel.updateAcademicSettings(
                    targetScore = targetScore,
                    subjectsCsv = subjectsCsv,
                    studyGoalMinutes = studyGoalMinutes,
                    targetInstitution = institution,
                    dreamCourse = dreamCourse,
                    jambExamDateTimestamp = jambDate
                )
            },
            onLogOut = {
                viewModel.logOut()
                showSettingsDialog = false
                activeScreen = ActiveScreen.AUTH
            },
            onUpgradeClick = {
                showSettingsDialog = false
                showUpgradeDialog = true
            },
            onOpenMistakeBank = {
                showSettingsDialog = false
                activeScreen = ActiveScreen.MISTAKE_BANK
            },
            onOpenOfflinePacks = {
                showSettingsDialog = false
                activeScreen = ActiveScreen.OFFLINE_PACKS
            },
            onDismiss = { showSettingsDialog = false }
        )
    }

    when (activeScreen) {
        ActiveScreen.AUTH -> {
            AuthScreen(
                onLoginWithEmail = { email, password ->
                    isAuthLoading = true
                    authErrorMessage = null
                    viewModel.loginWithEmail(email, password) { success, err ->
                        isAuthLoading = false
                        if (success) {
                            activeScreen = ActiveScreen.MAIN_TABS
                        } else {
                            authErrorMessage = err
                        }
                    }
                },
                onSignUpWithEmail = { name, email, password, referralCode ->
                    isAuthLoading = true
                    authErrorMessage = null
                    viewModel.signUpWithEmail(name, email, password, referralCode) { success, err ->
                        isAuthLoading = false
                        if (success) {
                            activeScreen = ActiveScreen.ONBOARDING
                        } else {
                            authErrorMessage = err
                        }
                    }
                },
                onLoginWithGoogle = { name, email, referralCode ->
                    isAuthLoading = true
                    authErrorMessage = null
                    viewModel.loginWithGoogle(name, email, referralCode) { success, err ->
                        isAuthLoading = false
                        if (success) {
                            activeScreen = ActiveScreen.ONBOARDING
                        } else {
                            authErrorMessage = err
                        }
                    }
                },
                onLoginWithPhone = { phone, name, referralCode ->
                    isAuthLoading = true
                    authErrorMessage = null
                    viewModel.loginWithPhone(phone, name, referralCode) { success, err ->
                        isAuthLoading = false
                        if (success) {
                            activeScreen = ActiveScreen.ONBOARDING
                        } else {
                            authErrorMessage = err
                        }
                    }
                },
                onLoginAsGuest = {
                    isAuthLoading = true
                    authErrorMessage = null
                    viewModel.loginAsGuest { success, err ->
                        isAuthLoading = false
                        if (success) {
                            activeScreen = ActiveScreen.MAIN_TABS
                        } else {
                            authErrorMessage = err
                        }
                    }
                },
                errorMessage = authErrorMessage,
                isLoading = isAuthLoading
            )
        }

        ActiveScreen.ONBOARDING -> {
            OnboardingScreen(
                currentName = userProfile?.name ?: "Chinedu Okafor",
                onCompleteOnboarding = { name, targetScore, subjectsCsv, institution, dreamCourse, jambDate ->
                    viewModel.updateAcademicSettings(
                        targetScore = targetScore,
                        subjectsCsv = subjectsCsv,
                        studyGoalMinutes = 45,
                        targetInstitution = institution,
                        dreamCourse = dreamCourse,
                        jambExamDateTimestamp = jambDate
                    )
                    viewModel.updateProfile(
                        name = name,
                        targetScore = targetScore,
                        subjectsCsv = subjectsCsv,
                        targetInstitution = institution,
                        dreamCourse = dreamCourse,
                        jambExamDateTimestamp = jambDate
                    )
                    activeScreen = ActiveScreen.MAIN_TABS
                }
            )
        }

        ActiveScreen.QUESTION_PRACTICE -> {
            BackHandler {
                viewModel.finishPracticeSession()
                activeScreen = ActiveScreen.MAIN_TABS
            }
            QuestionPracticeScreen(
                questions = activePracticeQuestions,
                currentIndex = activeQuestionIndex,
                userAnswers = userAnswers,
                showExplanation = showExplanation,
                bookmarkedIds = bookmarkedIds,
                onAnswerSelected = { optionIndex -> viewModel.answerActiveQuestion(optionIndex) },
                onNextQuestion = { viewModel.nextQuestion() },
                onPreviousQuestion = { viewModel.previousQuestion() },
                onFinishSession = {
                    viewModel.finishPracticeSession()
                    activeScreen = ActiveScreen.MAIN_TABS
                },
                onToggleBookmark = { qId ->
                    viewModel.toggleBookmark(qId)
                },
                onAskAiTutor = { contextText ->
                    contextQuestionForAi = contextText
                    viewModel.askAiTutor("Explain step by step how to solve this and why the answer is correct.", contextText)
                    activeScreen = ActiveScreen.AI_TUTOR
                }
            )
        }

        ActiveScreen.CBT_EXAM -> {
            CbtExamScreen(
                questions = activePracticeQuestions,
                currentIndex = activeQuestionIndex,
                userAnswers = userAnswers,
                timerSeconds = cbtTimerSeconds,
                flaggedQuestions = cbtFlaggedQuestions,
                selectedSubject = selectedCbtSubject,
                profile = userProfile,
                onSelectQuestion = { idx ->
                    viewModel.selectQuestionIndex(idx)
                },
                onAnswerSelected = { optionIndex -> viewModel.answerActiveQuestion(optionIndex) },
                onToggleFlag = { viewModel.toggleFlagCurrentQuestion() },
                onSubmitExam = {
                    viewModel.submitCbtExam()
                    activeScreen = ActiveScreen.CBT_RESULTS
                },
                onExitExam = {
                    activeScreen = ActiveScreen.MAIN_TABS
                }
            )
        }

        ActiveScreen.CBT_RESULTS -> {
            BackHandler {
                activeScreen = ActiveScreen.MAIN_TABS
                currentTab = MainTab.HOME
            }
            val result = cbtResult
            if (result != null) {
                CbtResultsScreen(
                    summary = result,
                    onRetakeMock = {
                        if (result.isMiniCbt) {
                            viewModel.startMiniCbtExam(result.miniCbtSubject ?: "Mathematics")
                        } else {
                            viewModel.startCbtMockExam()
                        }
                        activeScreen = ActiveScreen.CBT_EXAM
                    },
                    onReturnHome = {
                        activeScreen = ActiveScreen.MAIN_TABS
                        currentTab = MainTab.HOME
                    },
                    onAskAiTutor = { q, userOpt ->
                        viewModel.askAiTutorAboutQuestion(q, userOpt)
                        activeScreen = ActiveScreen.AI_TUTOR
                    }
                )
            } else {
                activeScreen = ActiveScreen.MAIN_TABS
            }
        }

        ActiveScreen.AI_TUTOR -> {
            BackHandler {
                activeScreen = ActiveScreen.MAIN_TABS
            }
            AiTutorScreen(
                messages = aiChatMessages,
                isLoading = isAiLoading,
                contextQuestion = contextQuestionForAi,
                selectedPersona = selectedTutorPersona,
                onSelectPersona = { persona ->
                    viewModel.setTutorPersona(persona)
                },
                onSendMessage = { text, persona ->
                    viewModel.askAiTutor(text, contextQuestionForAi, persona)
                },
                onClearChat = { persona ->
                    viewModel.clearAiChat(persona)
                },
                onBack = {
                    contextQuestionForAi = ""
                    activeScreen = ActiveScreen.MAIN_TABS
                }
            )
        }

        ActiveScreen.BOOKMARKS -> {
            BackHandler {
                activeScreen = ActiveScreen.MAIN_TABS
            }
            BookmarksScreen(
                bookmarks = allBookmarks,
                allQuestions = allQuestions,
                onRemoveBookmark = { qId ->
                    viewModel.toggleBookmark(qId)
                },
                onPracticeSavedQuestion = { question ->
                    viewModel.startPracticeSession("Bookmark Practice", question.subject, question.topic)
                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                },
                onBack = { activeScreen = ActiveScreen.MAIN_TABS }
            )
        }

        ActiveScreen.FRIENDS -> {
            BackHandler {
                activeScreen = ActiveScreen.MAIN_TABS
            }
            FriendsScreen(
                profile = userProfile,
                friends = allFriends,
                onAddFriend = { code, onResult -> viewModel.addFriend(code, onResult) },
                onAddCustomFriend = { name, code, acc, streak -> viewModel.addCustomFriend(name, code, acc, streak) },
                onRemoveFriend = { friendId -> viewModel.removeFriend(friendId) },
                onAcceptRequest = { fName ->
                    viewModel.acceptFriendRequest(fName)
                },
                onRejectRequest = { fName ->
                    coroutineScope.launch {
                        viewModel.repository.updateFriendStatus(fName, "declined")
                    }
                },
                onApplyReferralCode = { code, onResult ->
                    viewModel.applyReferralCode(code, onResult)
                },
                onSimulateReferral = {
                    viewModel.recordReferral()
                },
                onOpenChat = { friend ->
                    viewModel.openFriendChat(friend)
                    activeScreen = ActiveScreen.FRIEND_CHAT
                },
                onOpenChatByName = { friendName ->
                    viewModel.openFriendChatByName(friendName)
                    activeScreen = ActiveScreen.FRIEND_CHAT
                },
                onChallengeFriend = { friend ->
                    viewModel.startPracticeSession("Challenge vs ${friend.name}", "Biology", null)
                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                },
                onBack = { activeScreen = ActiveScreen.MAIN_TABS }
            )
        }

        ActiveScreen.FRIEND_CHAT -> {
            BackHandler {
                viewModel.closeFriendChat()
                activeScreen = ActiveScreen.FRIENDS
            }
            val currentChatFriend = activeChatFriend
            if (currentChatFriend != null) {
                FriendChatScreen(
                    friend = currentChatFriend,
                    messages = activeFriendChatMessages,
                    isFriendTyping = isFriendTyping,
                    onSendMessage = { text ->
                        viewModel.sendFriendChatMessage(text)
                    },
                    onStartChallenge = { subject ->
                        viewModel.startPracticeSession("Challenge vs ${currentChatFriend.name}", subject, null)
                        activeScreen = ActiveScreen.QUESTION_PRACTICE
                    },
                    onBack = {
                        viewModel.closeFriendChat()
                        activeScreen = ActiveScreen.FRIENDS
                    }
                )
            } else {
                activeScreen = ActiveScreen.FRIENDS
            }
        }

        ActiveScreen.MISTAKE_BANK -> {
            BackHandler {
                activeScreen = ActiveScreen.MAIN_TABS
            }
            MistakeBankScreen(
                allMistakes = allMistakes,
                allQuestions = allQuestions,
                onStartMistakeDrill = { subjectFilter ->
                    viewModel.startMistakePracticeSession(subjectFilter)
                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                },
                onPracticeSingleQuestion = { question ->
                    viewModel.startPracticeSession("Mistake Drill", question.subject, question.topic)
                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                },
                onMarkMastered = { qId, isMastered ->
                    viewModel.markMistakeMastered(qId, isMastered)
                },
                onRemoveMistake = { qId ->
                    viewModel.removeMistake(qId)
                },
                onClearAllMistakes = {
                    viewModel.clearAllMistakes()
                },
                onBack = {
                    activeScreen = ActiveScreen.MAIN_TABS
                }
            )
        }

        ActiveScreen.OFFLINE_PACKS -> {
            BackHandler {
                activeScreen = ActiveScreen.MAIN_TABS
            }
            OfflineDownloadsScreen(
                offlinePacks = offlinePacks,
                userSubjectsCsv = userProfile?.jambSubjectsCsv,
                onDownloadPack = { subj ->
                    viewModel.downloadSubjectPack(subj)
                },
                onDownloadAllSelectedSubjects = { list ->
                    viewModel.downloadAllSubjectsPacks(list)
                },
                onDeletePack = { subj ->
                    viewModel.deleteOfflinePack(subj)
                },
                onBack = {
                    activeScreen = ActiveScreen.MAIN_TABS
                }
            )
        }

        ActiveScreen.MAIN_TABS -> {
            Scaffold(
                containerColor = MaterialTheme.colorScheme.background,
                bottomBar = {
                    NavigationBar(
                        containerColor = MaterialTheme.colorScheme.surface,
                        tonalElevation = 8.dp
                    ) {
                        MainTab.values().forEach { tab ->
                            val isSelected = currentTab == tab
                            NavigationBarItem(
                                selected = isSelected,
                                onClick = { currentTab = tab },
                                icon = {
                                    Icon(
                                        imageVector = if (isSelected) tab.selectedIcon else tab.unselectedIcon,
                                        contentDescription = tab.title,
                                        modifier = Modifier.size(24.dp)
                                    )
                                },
                                label = {
                                    Text(
                                        text = tab.title,
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                                    )
                                },
                                colors = NavigationBarItemDefaults.colors(
                                    selectedIconColor = PrimaryGreen,
                                    selectedTextColor = PrimaryGreen,
                                    indicatorColor = PrimaryGreen.copy(alpha = 0.12f),
                                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                                    unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                                ),
                                modifier = Modifier.testTag("nav_tab_${tab.name.lowercase()}")
                            )
                        }
                    }
                }
            ) { innerPadding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                ) {
                    when (currentTab) {
                        MainTab.HOME -> {
                            HomeScreen(
                                profile = userProfile,
                                unmasteredMistakesCount = unmasteredMistakesCount,
                                onNavigateToPractice = { mode, subject ->
                                    viewModel.startPracticeSession(mode, subject, null)
                                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                                },
                                onStartMiniCbt = { subject ->
                                    viewModel.startMiniCbtExam(subject)
                                    activeScreen = ActiveScreen.CBT_EXAM
                                },
                                onNavigateToCbt = { chosenSubjects ->
                                    viewModel.startCbtMockExamWithSubjects(chosenSubjects)
                                    activeScreen = ActiveScreen.CBT_EXAM
                                },
                                onNavigateToLibrary = {
                                    currentTab = MainTab.LIBRARY
                                },
                                onNavigateToBookmarks = {
                                    activeScreen = ActiveScreen.BOOKMARKS
                                },
                                onNavigateToAiTutor = {
                                    contextQuestionForAi = ""
                                    activeScreen = ActiveScreen.AI_TUTOR
                                },
                                onNavigateToFriends = {
                                    activeScreen = ActiveScreen.FRIENDS
                                },
                                onNavigateToMistakes = {
                                    activeScreen = ActiveScreen.MISTAKE_BANK
                                },
                                onNavigateToOfflineManager = {
                                    activeScreen = ActiveScreen.OFFLINE_PACKS
                                },
                                onOpenSettings = {
                                    showSettingsDialog = true
                                },
                                onUpgradeClick = {
                                    showUpgradeDialog = true
                                }
                            )
                        }

                        MainTab.PRACTICE -> {
                            PracticeScreen(
                                userSubjectsCsv = userProfile?.jambSubjectsCsv,
                                onStartPractice = { mode, subject ->
                                    viewModel.startPracticeSession(mode, subject, null)
                                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                                },
                                onStartMiniCbt = { subject ->
                                    viewModel.startMiniCbtExam(subject)
                                    activeScreen = ActiveScreen.CBT_EXAM
                                },
                                onStartCbtMock = { chosenSubjects ->
                                    viewModel.startCbtMockExamWithSubjects(chosenSubjects)
                                    activeScreen = ActiveScreen.CBT_EXAM
                                },
                                onNavigateToAiTutor = {
                                    contextQuestionForAi = ""
                                    activeScreen = ActiveScreen.AI_TUTOR
                                }
                            )
                        }

                        MainTab.PROGRESS -> {
                            ProgressScreen(
                                profile = userProfile,
                                recentSessions = recentSessions,
                                onSelectSession = { session ->
                                    val firstSub = session.subjectsCsv.split(",").firstOrNull()?.trim()
                                    viewModel.startPracticeSession(session.mode, firstSub, null)
                                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                                },
                                onStartPracticeSubject = { subjectName ->
                                    viewModel.startPracticeSession("Subject Practice", subjectName, null)
                                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                                },
                                onNavigateToAiTutorWithPrompt = { prompt ->
                                    contextQuestionForAi = ""
                                    viewModel.askAiTutor(prompt)
                                    activeScreen = ActiveScreen.AI_TUTOR
                                }
                            )
                        }

                        MainTab.LIBRARY -> {
                            LibraryScreen(
                                books = literatureBooks,
                                activeBook = activeBook,
                                activeChapterIndex = activeChapterIndex,
                                onOpenBook = { book -> viewModel.openBook(book) },
                                onSelectChapter = { idx -> viewModel.selectChapter(idx) },
                                onCloseReader = { viewModel.closeReader() },
                                onAskAiTutor = { prompt ->
                                    contextQuestionForAi = ""
                                    viewModel.askAiTutor(prompt)
                                    activeScreen = ActiveScreen.AI_TUTOR
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}
