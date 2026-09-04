package com.example

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.data.db.QuestionEntity
import com.example.data.remote.AppUpdateStatus
import com.example.ui.components.AcademicSettingsDialog
import com.example.ui.components.AppUpdatePromptDialog
import com.example.ui.components.PrepzaPlusUpgradeDialog
import com.example.ui.components.TrialMilestoneReminderDialog
import com.example.ui.screens.*
import com.example.ui.screens.learning.*
import com.example.ui.theme.*
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
    OFFLINE_PACKS,
    SUBJECT_DETAIL,
    TOPIC_DETAIL,
    LEARNING_PACK,
    QUICK_RECALL
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setupImmersiveMode()
        com.example.workers.TrialExpirationWorker.scheduleTrialChecks(this)
        com.example.workers.CbtOfflineSyncWorker.schedulePeriodicSync(this)
        com.example.workers.CbtOfflineSyncWorker.triggerImmediateSync(this)
        setContent {
            val viewModel: MainViewModel = viewModel()
            val themeMode by viewModel.appThemeMode.collectAsStateWithLifecycle()
            PrepzaTheme(themeMode = themeMode) {
                PrepzaApp(viewModel = viewModel)
            }
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            setupImmersiveMode()
        }
    }

    private fun setupImmersiveMode() {
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.navigationBars())
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

    val isOnline by viewModel.isOnline.collectAsStateWithLifecycle()
    val unsyncedCount by viewModel.unsyncedCount.collectAsStateWithLifecycle()
    val isSyncingCloud by viewModel.isSyncingCloud.collectAsStateWithLifecycle()
    val activeExamState by viewModel.activeExamState.collectAsStateWithLifecycle()

    val activeAccount by viewModel.activeAccount.collectAsStateWithLifecycle()
    val allAccounts by viewModel.allAccounts.collectAsStateWithLifecycle()
    val userProfile by viewModel.userProfile.collectAsStateWithLifecycle()
    val appThemeMode by viewModel.appThemeMode.collectAsStateWithLifecycle()
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
    val aiFixToastMessage by viewModel.aiFixToastMessage.collectAsStateWithLifecycle()

    val appUpdateStatus by viewModel.appUpdateStatus.collectAsStateWithLifecycle()
    val apkDownloadState by viewModel.apkDownloadState.collectAsStateWithLifecycle()
    val isContentSyncing by viewModel.isContentSyncing.collectAsStateWithLifecycle()
    val lastSyncResult by viewModel.lastSyncResult.collectAsStateWithLifecycle()
    val remoteAnnouncements by viewModel.remoteAnnouncements.collectAsStateWithLifecycle()
    val authUiState by viewModel.authUiState.collectAsStateWithLifecycle()

    val topicProgressList by viewModel.allTopicProgress.collectAsStateWithLifecycle()
    val activeUnfinishedTopic by viewModel.activeUnfinishedTopic.collectAsStateWithLifecycle()
    val selectedSubjectName by viewModel.selectedSubjectName.collectAsStateWithLifecycle()
    val selectedLearningPack by viewModel.selectedLearningPack.collectAsStateWithLifecycle()
    val currentLearningCardIndex by viewModel.currentLearningCardIndex.collectAsStateWithLifecycle()

    var activeScreen by remember { mutableStateOf(ActiveScreen.MAIN_TABS) }
    var currentTab by remember { mutableStateOf(MainTab.HOME) }
    var contextQuestionForAi by remember { mutableStateOf("") }
    var showSettingsDialog by remember { mutableStateOf(false) }
    var showUpgradeDialog by remember { mutableStateOf(false) }

    val activityContext = androidx.compose.ui.platform.LocalContext.current

    // Session persistence across app restarts
    LaunchedEffect(activeAccount, authUiState) {
        if (activeAccount != null && activeAccount?.isLoggedIn == true) {
            if (activeScreen == ActiveScreen.AUTH) {
                activeScreen = ActiveScreen.MAIN_TABS
            }
        } else if (authUiState is com.example.ui.viewmodel.AuthUiState.Success && activeScreen == ActiveScreen.AUTH) {
            activeScreen = ActiveScreen.MAIN_TABS
        }
    }

    val bookmarkedIds = remember(allBookmarks) { allBookmarks.map { it.questionId }.toSet() }

    // App Version Update Prompt (non-intrusive modal for optional or mandatory updates)
    if (appUpdateStatus is AppUpdateStatus.OptionalUpdateAvailable ||
        appUpdateStatus is AppUpdateStatus.MandatoryUpdateRequired) {
        AppUpdatePromptDialog(
            updateStatus = appUpdateStatus,
            downloadState = apkDownloadState,
            canInstallPackages = viewModel.canRequestPackageInstalls(),
            onStartUpdate = { config ->
                viewModel.downloadAndInstallApk(config)
            },
            onGrantInstallPermission = {
                viewModel.openUnknownAppSourcesSettings()
            },
            onDismissOptional = { versionCode ->
                viewModel.dismissOptionalUpdate(versionCode)
            }
        )
    }

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
            onOpenReferrals = {
                showUpgradeDialog = false
                activeScreen = ActiveScreen.FRIENDS
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
            isSyncingContent = isContentSyncing,
            lastSyncMessage = lastSyncResult?.message,
            currentThemeMode = appThemeMode,
            onThemeModeChange = { mode ->
                viewModel.setAppThemeMode(mode)
            },
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
            onOpenReferrals = {
                showSettingsDialog = false
                activeScreen = ActiveScreen.FRIENDS
            },
            onCheckAppUpdate = {
                viewModel.checkForAppVersionUpdate(force = true)
            },
            onSyncContent = {
                viewModel.syncRemoteContent(force = true)
            },
            onDismiss = { showSettingsDialog = false }
        )
    }

    Box(modifier = Modifier.fillMaxSize()) {
        when (activeScreen) {
            ActiveScreen.AUTH -> {
                AuthScreen(
                    authUiState = authUiState,
                    savedAccounts = allAccounts,
                    onLoginWithEmail = { email, password ->
                        viewModel.loginWithEmail(email, password) { success, _ ->
                            if (success) {
                                activeScreen = ActiveScreen.MAIN_TABS
                            }
                        }
                    },
                    onSignUpWithEmail = { name, email, password, referralCode ->
                        viewModel.signUpWithEmail(name, email, password, referralCode) { success, _ ->
                            if (success) {
                                activeScreen = ActiveScreen.ONBOARDING
                            }
                        }
                    },
                    onLoginWithGoogle = { name, email, referralCode ->
                        viewModel.loginWithGoogleCredentialManager(
                            context = activityContext,
                            fallbackName = name,
                            fallbackEmail = email,
                            referralCode = referralCode
                        ) { success, _ ->
                            if (success) {
                                activeScreen = ActiveScreen.MAIN_TABS
                            }
                        }
                    },
                    onLoginWithPhone = { phone, name, referralCode ->
                        viewModel.loginWithPhone(phone, name, referralCode) { success, _ ->
                            if (success) {
                                activeScreen = ActiveScreen.MAIN_TABS
                            }
                        }
                    },
                    onLoginAsGuest = {
                        viewModel.loginAsGuest { success, _ ->
                            if (success) {
                                activeScreen = ActiveScreen.MAIN_TABS
                            }
                        }
                    },
                    onSwitchToSavedAccount = { accountId ->
                        viewModel.switchAccount(accountId) { success ->
                            if (success) {
                                activeScreen = ActiveScreen.MAIN_TABS
                            }
                        }
                    },
                    onRequestPasswordReset = { email, onSent ->
                        viewModel.sendPasswordResetEmail(email, onSent)
                    },
                    onResetPasswordWithCode = { email, newPass, onDone ->
                        viewModel.resetPassword(email, newPass, onDone)
                    },
                    onClearError = {
                        viewModel.clearAuthError()
                    }
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
                onAnswerSelectedForQuestion = { qId, optionIndex -> viewModel.answerQuestion(qId, optionIndex) },
                onToggleFlag = { viewModel.toggleFlagCurrentQuestion() },
                onFlagAndFix = { question, reason, notes ->
                    viewModel.flagAndAutoFixQuestion(question, reason, notes)
                },
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

        ActiveScreen.SUBJECT_DETAIL -> {
            BackHandler {
                activeScreen = ActiveScreen.MAIN_TABS
            }
            SubjectDetailScreen(
                subjectName = selectedSubjectName,
                viewModel = viewModel,
                onBack = { activeScreen = ActiveScreen.MAIN_TABS },
                onOpenTopic = { pack ->
                    viewModel.startLearningPack(pack, 0)
                    activeScreen = ActiveScreen.LEARNING_PACK
                },
                onStartPractice = { subj ->
                    viewModel.startPracticeSession("Subject Practice: $subj", subj, null)
                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                }
            )
        }

        ActiveScreen.TOPIC_DETAIL -> {
            BackHandler {
                activeScreen = ActiveScreen.SUBJECT_DETAIL
            }
            val pack = selectedLearningPack ?: com.example.data.learning.CurriculumRegistry.getAllCurriculums().first().groups.first().topics.first()
            TopicDetailScreen(
                pack = pack,
                viewModel = viewModel,
                onBack = { activeScreen = ActiveScreen.SUBJECT_DETAIL },
                onStartLearning = { startIdx ->
                    viewModel.startLearningPack(pack, startIdx)
                    activeScreen = ActiveScreen.LEARNING_PACK
                },
                onStartQuickRecall = {
                    viewModel.startQuickRecall()
                    activeScreen = ActiveScreen.QUICK_RECALL
                },
                onStartPractice = { subj, topic ->
                    viewModel.startTopicPracticeSession(subj, topic)
                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                }
            )
        }

        ActiveScreen.LEARNING_PACK -> {
            val pack = selectedLearningPack ?: com.example.data.learning.CurriculumRegistry.getAllCurriculums().first().groups.first().topics.first()
            BackHandler {
                activeScreen = ActiveScreen.SUBJECT_DETAIL
            }
            LearningPackScreen(
                pack = pack,
                initialCardIndex = currentLearningCardIndex,
                viewModel = viewModel,
                onClose = { activeScreen = ActiveScreen.SUBJECT_DETAIL }
            )
        }

        ActiveScreen.QUICK_RECALL -> {
            val pack = selectedLearningPack ?: com.example.data.learning.CurriculumRegistry.getAllCurriculums().first().groups.first().topics.first()
            BackHandler {
                activeScreen = ActiveScreen.TOPIC_DETAIL
            }
            QuickRecallScreen(
                pack = pack,
                viewModel = viewModel,
                onClose = { activeScreen = ActiveScreen.TOPIC_DETAIL },
                onStartPractice = { subj, topic ->
                    viewModel.startTopicPracticeSession(subj, topic)
                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                }
            )
        }

        ActiveScreen.MAIN_TABS -> {
            val isDarkTheme = LocalThemeIsDark.current
            Scaffold(
                containerColor = if (isDarkTheme) RawAppBackgroundDark else RawAppBackgroundLight,
                bottomBar = {
                    NavigationBar(
                        containerColor = if (isDarkTheme) Color(0xFF0E1A16) else Color(0xFFE2EAE5),
                        tonalElevation = 6.dp
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
                                    selectedIconColor = if (isDarkTheme) Color(0xFF10B981) else Color(0xFF15803D),
                                    selectedTextColor = if (isDarkTheme) Color(0xFF10B981) else Color(0xFF15803D),
                                    indicatorColor = if (isDarkTheme) Color(0xFF064E3B) else Color(0xFFDCFCE7),
                                    unselectedIconColor = if (isDarkTheme) Color(0xFF94A3B8) else Color(0xFF64748B),
                                    unselectedTextColor = if (isDarkTheme) Color(0xFF94A3B8) else Color(0xFF64748B)
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
                                topicProgressList = topicProgressList,
                                activeUnfinishedTopic = activeUnfinishedTopic,
                                unmasteredMistakesCount = unmasteredMistakesCount,
                                isOnline = isOnline,
                                unsyncedCount = unsyncedCount,
                                isSyncingCloud = isSyncingCloud,
                                remoteAnnouncements = remoteAnnouncements,
                                activeExamState = activeExamState,
                                onResumeActiveExam = {
                                    viewModel.resumeActiveCbtExam()
                                    activeScreen = ActiveScreen.CBT_EXAM
                                },
                                onDiscardActiveExam = {
                                    viewModel.discardActiveExam()
                                },
                                onSyncNow = {
                                    viewModel.syncOfflineDataNow()
                                },
                                onOpenSubject = { subjectName ->
                                    viewModel.selectSubject(subjectName)
                                    activeScreen = ActiveScreen.SUBJECT_DETAIL
                                },
                                onOpenTopic = { pack ->
                                    viewModel.startLearningPack(pack, 0)
                                    activeScreen = ActiveScreen.TOPIC_DETAIL
                                },
                                onStartLearningPack = { pack, resumeIdx ->
                                    viewModel.startLearningPack(pack, resumeIdx)
                                    activeScreen = ActiveScreen.LEARNING_PACK
                                },
                                onNavigateToPractice = { mode, subject ->
                                    viewModel.startPracticeSession(mode, subject, null)
                                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                                },
                                onStartMiniCbt = { subject, count, timeMinutes ->
                                    viewModel.startMiniCbtExam(subject, count, timeMinutes)
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
                                activeExamState = activeExamState,
                                onResumeActiveExam = {
                                    viewModel.resumeActiveCbtExam()
                                    activeScreen = ActiveScreen.CBT_EXAM
                                },
                                onDiscardActiveExam = {
                                    viewModel.discardActiveExam()
                                },
                                onStartPractice = { mode, subject ->
                                    viewModel.startPracticeSession(mode, subject, null)
                                    activeScreen = ActiveScreen.QUESTION_PRACTICE
                                },
                                onStartMiniCbt = { subject, count, timeMinutes ->
                                    viewModel.startMiniCbtExam(subject, count, timeMinutes)
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
                                onProgressUpdated = { bookId, chIdx, percent ->
                                    viewModel.updateBookReadingProgress(bookId, percent, chIdx)
                                },
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

    // Floating AI Background Auto-Fix Notification Toast
    AnimatedVisibility(
        visible = aiFixToastMessage != null,
        modifier = Modifier
            .align(Alignment.TopCenter)
            .windowInsetsPadding(WindowInsets.statusBars)
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
            val msg = aiFixToastMessage
            if (msg != null) {
                LaunchedEffect(msg) {
                    kotlinx.coroutines.delay(4500L)
                    viewModel.clearAiFixToast()
                }

                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = Color(0xFF064E3B),
                    shadowElevation = 10.dp,
                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFF10B981)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.weight(1f),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.AutoAwesome,
                                contentDescription = null,
                                tint = Color(0xFF34D399),
                                modifier = Modifier.size(20.dp)
                            )
                            Text(
                                text = msg,
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.SemiBold,
                                color = Color.White,
                                fontSize = 12.sp
                            )
                        }
                        IconButton(
                            onClick = { viewModel.clearAiFixToast() },
                            modifier = Modifier.size(24.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Close,
                                contentDescription = "Dismiss",
                                tint = Color.White.copy(alpha = 0.7f),
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
