package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Calculate
import androidx.compose.material.icons.outlined.Flag
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.db.QuestionEntity
import com.example.data.db.UserProfileEntity
import com.example.ui.components.*
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CbtExamScreen(
    questions: List<QuestionEntity>,
    currentIndex: Int,
    userAnswers: Map<String, Int>,
    timerSeconds: Long,
    flaggedQuestions: Set<Int>,
    selectedSubject: String,
    profile: UserProfileEntity?,
    onSelectQuestion: (index: Int) -> Unit,
    onAnswerSelected: (optionIndex: Int) -> Unit,
    onToggleFlag: () -> Unit,
    onSubmitExam: () -> Unit,
    onExitExam: () -> Unit
) {
    var showPaletteSheet by remember { mutableStateOf(false) }
    var showCalculator by remember { mutableStateOf(false) }
    var showInstructionsDialog by remember { mutableStateOf(false) }
    var showSubmitConfirmation by remember { mutableStateOf(false) }
    var showExitConfirmation by remember { mutableStateOf(false) }

    // Intercept hardware and gesture back presses to prompt the End Exam confirmation
    BackHandler(enabled = true) {
        showExitConfirmation = true
    }

    if (questions.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                CircularProgressIndicator(color = PrimaryGreen)
                Spacer(modifier = Modifier.height(16.dp))
                Text("Initializing CBT Exam Simulation...", style = MaterialTheme.typography.bodyMedium)
            }
        }
        return
    }

    val currentQuestion = questions[currentIndex.coerceIn(questions.indices)]
    val selectedOptionIndex = userAnswers[currentQuestion.id]
    val isFlagged = flaggedQuestions.contains(currentIndex)

    val subjects = remember(questions) {
        questions.map { it.subject }.distinct()
    }

    val currentSubjectQuestions = remember(questions, currentQuestion.subject) {
        questions.filter { it.subject == currentQuestion.subject }
    }
    val currentSubjectFirstIndex = remember(questions, currentQuestion.subject) {
        questions.indexOfFirst { it.subject == currentQuestion.subject }
    }
    val indexInSubject = currentIndex - currentSubjectFirstIndex

    // Format timer hh:mm:ss
    val hours = timerSeconds / 3600
    val minutes = (timerSeconds % 3600) / 60
    val seconds = timerSeconds % 60
    val timerText = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    val candidateName = profile?.name ?: "Chinedu Okafor"
    val initial = candidateName.firstOrNull()?.toString()?.uppercase() ?: "C"

    // Calculator Dialog
    if (showCalculator) {
        ScientificCalculatorDialog(onDismiss = { showCalculator = false })
    }

    // Instructions Dialog
    if (showInstructionsDialog) {
        AlertDialog(
            onDismissRequest = { showInstructionsDialog = false },
            title = {
                Text("JAMB UTME Instructions", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            },
            text = {
                Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                    Text("• Duration: 2 Hours (120 Minutes) for 180 Questions.", fontWeight = FontWeight.SemiBold)
                    Text("• English Language has 60 Questions; the 3 electives have 40 Questions each.", style = MaterialTheme.typography.bodySmall)
                    Text("• You can navigate freely between subjects and questions at any time.", style = MaterialTheme.typography.bodySmall)
                    Text("• Use the Question Palette to view answered, flagged, and unanswered items.", style = MaterialTheme.typography.bodySmall)
                    Text("• Tap 'End' at any time if you wish to finish early and see your score.", style = MaterialTheme.typography.bodySmall)
                }
            },
            confirmButton = {
                Button(
                    onClick = { showInstructionsDialog = false },
                    colors = ButtonDefaults.buttonColors(containerColor = TextPrimary)
                ) {
                    Text("Return to Exam")
                }
            }
        )
    }

    // End / Exit Confirmation Dialog
    if (showExitConfirmation) {
        val answeredCount = userAnswers.size
        val unansweredCount = questions.size - answeredCount

        AlertDialog(
            onDismissRequest = { showExitConfirmation = false },
            title = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                        contentDescription = null,
                        tint = IncorrectRed,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "End CBT Mock Exam?",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                }
            },
            text = {
                Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                    Text(
                        text = "If you don't want to continue, choose whether to grade what you've answered so far or discard the mock.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = TextSecondary
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = AppBackground,
                        border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("Answered", style = MaterialTheme.typography.bodySmall, color = TextSecondary)
                                Text("$answeredCount / ${questions.size}", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodySmall, color = CorrectGreen)
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("Unanswered", style = MaterialTheme.typography.bodySmall, color = TextSecondary)
                                Text("$unansweredCount", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodySmall, color = if (unansweredCount > 0) IncorrectRed else CorrectGreen)
                            }
                            Spacer(modifier = Modifier.height(4.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("Time Left", style = MaterialTheme.typography.bodySmall, color = TextSecondary)
                                Text(timerText, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodySmall, color = TextPrimary)
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Option 1: Submit and see score
                    Button(
                        onClick = {
                            showExitConfirmation = false
                            onSubmitExam()
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("end_exam_submit_and_grade_btn")
                    ) {
                        Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Submit & View Results", fontWeight = FontWeight.Bold)
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Option 2: Discard and exit to home
                    OutlinedButton(
                        onClick = {
                            showExitConfirmation = false
                            onExitExam()
                        },
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = IncorrectRed),
                        border = androidx.compose.foundation.BorderStroke(1.dp, IncorrectRed.copy(alpha = 0.5f)),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("end_exam_discard_btn")
                    ) {
                        Text("Discard & Exit", fontWeight = FontWeight.SemiBold)
                    }
                }
            },
            confirmButton = {},
            dismissButton = {
                TextButton(
                    onClick = { showExitConfirmation = false },
                    modifier = Modifier.testTag("end_exam_cancel_btn")
                ) {
                    Text("Continue Exam", color = TextPrimary, fontWeight = FontWeight.Bold)
                }
            }
        )
    }

    // Question Palette Bottom Sheet
    if (showPaletteSheet) {
        val userAnswersIndexMap = remember(userAnswers, questions) {
            val map = mutableMapOf<Int, Int>()
            questions.forEachIndexed { idx, q ->
                val ans = userAnswers[q.id]
                if (ans != null) map[idx] = ans
            }
            map
        }

        QuestionPaletteBottomSheet(
            totalQuestions = questions.size,
            userAnswers = userAnswersIndexMap,
            flaggedQuestions = flaggedQuestions,
            currentIndex = currentIndex,
            onSelectQuestion = onSelectQuestion,
            onEndExamClick = { showExitConfirmation = true },
            onDismiss = { showPaletteSheet = false }
        )
    }

    // Final Submission Confirmation Dialog
    if (showSubmitConfirmation) {
        AlertDialog(
            onDismissRequest = { showSubmitConfirmation = false },
            title = {
                Text("Submit JAMB CBT Mock Exam", style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            },
            text = {
                Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                    Text("Candidate: $candidateName", fontWeight = FontWeight.Bold, color = TextPrimary)
                    Text("Reg No: JAMB/2026/89402X • Time Left: $timerText", style = MaterialTheme.typography.bodySmall, color = TextSecondary)
                    Spacer(modifier = Modifier.height(12.dp))

                    val answeredCount = userAnswers.size
                    val unansweredCount = questions.size - answeredCount

                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = AppBackground,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(12.dp)) {
                            Text("Subject Breakdown:", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                            Spacer(modifier = Modifier.height(6.dp))
                            subjects.forEach { subj ->
                                val countInSubj = questions.count { it.subject == subj }
                                val ansInSubj = questions.filter { it.subject == subj }.count { userAnswers.containsKey(it.id) }
                                Row(
                                    modifier = Modifier.fillMaxWidth().padding(vertical = 2.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Text(subj, style = MaterialTheme.typography.bodySmall)
                                    Text("$ansInSubj / $countInSubj answered", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodySmall)
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("• Total Questions: ${questions.size}", fontWeight = FontWeight.SemiBold)
                        Text("• Answered: $answeredCount", fontWeight = FontWeight.Bold, color = CorrectGreen)
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("• Unanswered: $unansweredCount", fontWeight = FontWeight.Bold, color = if (unansweredCount > 0) IncorrectRed else CorrectGreen)
                        Text("• Flagged: ${flaggedQuestions.size}", fontWeight = FontWeight.Bold, color = WarningAmber)
                    }

                    if (unansweredCount > 0) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "You still have $unansweredCount unanswered question(s). Are you sure you want to finish now?",
                            style = MaterialTheme.typography.labelSmall,
                            color = IncorrectRed
                        )
                    }
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        showSubmitConfirmation = false
                        onSubmitExam()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = TextPrimary),
                    modifier = Modifier.testTag("cbt_confirm_final_submit_btn")
                ) {
                    Text("Submit Exam Now", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { showSubmitConfirmation = false }) {
                    Text("Return & Continue", color = PrimaryGreen)
                }
            }
        )
    }

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(TextPrimary)
                    .windowInsetsPadding(WindowInsets.statusBars)
                    .padding(top = 10.dp, bottom = 8.dp, start = 14.dp, end = 14.dp)
            ) {
                // Top Row: Candidate info, Timer, Tools & End Exam Button
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Candidate mini profile badge
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.clickable { showExitConfirmation = true }
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = PrimaryGreen,
                            modifier = Modifier.size(32.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(
                                    text = initial,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 13.sp
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(6.dp))
                        Column {
                            Text(
                                text = candidateName,
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                text = "JAMB/2026/89402X",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextMuted,
                                fontSize = 10.sp
                            )
                        }
                    }

                    // High-Visibility Timer Pill
                    Surface(
                        color = when {
                            timerSeconds < 600 -> IncorrectRedBg
                            timerSeconds < 1800 -> WarningAmberBg
                            else -> PaleGreenBg
                        },
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Timer,
                                contentDescription = null,
                                tint = when {
                                    timerSeconds < 600 -> IncorrectRed
                                    timerSeconds < 1800 -> WarningAmber
                                    else -> PrimaryGreenDark
                                },
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = timerText,
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = when {
                                    timerSeconds < 600 -> IncorrectRed
                                    timerSeconds < 1800 -> WarningAmber
                                    else -> PrimaryGreenDark
                                }
                            )
                        }
                    }

                    // Quick Actions (Calculator, Palette, and End Exam Button)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = { showCalculator = true }, modifier = Modifier.size(32.dp)) {
                            Icon(
                                imageVector = Icons.Outlined.Calculate,
                                contentDescription = "Calculator",
                                tint = Color.White,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        IconButton(onClick = { showPaletteSheet = true }, modifier = Modifier.size(32.dp)) {
                            Icon(
                                imageVector = Icons.Outlined.GridView,
                                contentDescription = "Palette",
                                tint = Color.White,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(4.dp))
                        // Prominent "End Exam" Action Pill
                        Surface(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .clickable { showExitConfirmation = true }
                                .testTag("cbt_end_exam_topbar_btn"),
                            color = SoftRed.copy(alpha = 0.25f),
                            shape = RoundedCornerShape(10.dp),
                            border = androidx.compose.foundation.BorderStroke(1.dp, SoftRed.copy(alpha = 0.6f))
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 5.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                                    contentDescription = "End Exam",
                                    tint = Color.White,
                                    modifier = Modifier.size(14.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "End",
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(6.dp))

                // Subject Navigation Tabs
                ScrollableTabRow(
                    selectedTabIndex = subjects.indexOf(currentQuestion.subject).coerceAtLeast(0),
                    edgePadding = 0.dp,
                    containerColor = Color.Transparent,
                    divider = {}
                ) {
                    subjects.forEach { subj ->
                        val isSelected = subj == currentQuestion.subject
                        val count = questions.count { it.subject == subj }
                        val answeredInSubject = questions.filter { it.subject == subj }.count { userAnswers.containsKey(it.id) }

                        Tab(
                            selected = isSelected,
                            onClick = {
                                val firstIdx = questions.indexOfFirst { it.subject == subj }
                                if (firstIdx != -1) onSelectQuestion(firstIdx)
                            },
                            text = {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.padding(vertical = 4.dp)
                                ) {
                                    Text(
                                        text = "$subj ($answeredInSubject/$count)",
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                        color = if (isSelected) PaleGreenBg else TextMuted,
                                        fontSize = 12.sp
                                    )
                                    if (answeredInSubject == count && count > 0) {
                                        Spacer(modifier = Modifier.width(3.dp))
                                        Icon(
                                            imageVector = Icons.Default.Check,
                                            contentDescription = "Completed",
                                            tint = PrimaryGreenLight,
                                            modifier = Modifier.size(12.dp)
                                        )
                                    }
                                }
                            }
                        )
                    }
                }
            }
        },
        bottomBar = {
            Surface(
                color = MaterialTheme.colorScheme.surface,
                shadowElevation = 8.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .windowInsetsPadding(WindowInsets.navigationBars)
                        .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Previous Question Button
                    Button(
                        onClick = { if (currentIndex > 0) onSelectQuestion(currentIndex - 1) },
                        enabled = currentIndex > 0,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = BorderSubtle,
                            contentColor = TextPrimary,
                            disabledContainerColor = BorderSubtle.copy(alpha = 0.5f)
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Prev", fontWeight = FontWeight.Bold)
                    }

                    // Flag / Review Button
                    IconButton(
                        onClick = onToggleFlag,
                        modifier = Modifier.testTag("cbt_flag_question_btn")
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = if (isFlagged) WarningAmberBg else AppBackground,
                            modifier = Modifier.size(38.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = if (isFlagged) Icons.Filled.Flag else Icons.Outlined.Flag,
                                    contentDescription = "Flag for Review",
                                    tint = if (isFlagged) WarningAmber else TextSecondary,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }
                    }

                    // Palette Shortcut
                    Button(
                        onClick = { showPaletteSheet = true },
                        colors = ButtonDefaults.buttonColors(containerColor = AppBackground, contentColor = TextPrimary),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("${userAnswers.size}/${questions.size}", fontWeight = FontWeight.Bold, fontSize = 13.sp)
                    }

                    // Next / Submit Button
                    Button(
                        onClick = {
                            if (currentIndex < questions.size - 1) {
                                onSelectQuestion(currentIndex + 1)
                            } else {
                                showSubmitConfirmation = true
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (currentIndex == questions.size - 1) PrimaryGreen else TextPrimary,
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier.testTag("cbt_next_or_submit_btn")
                    ) {
                        Text(
                            text = if (currentIndex < questions.size - 1) "Next" else "Submit",
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(
                            imageVector = if (currentIndex < questions.size - 1) Icons.AutoMirrored.Filled.ArrowForward else Icons.Filled.Check,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(AppBackground)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 16.dp)
        ) {
            // Subject & Question indicator header
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "${currentQuestion.subject} • Question ${indexInSubject + 1} of ${currentSubjectQuestions.size}",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    Text(
                        text = "Overall Question ${currentIndex + 1} of ${questions.size} • Topic: ${currentQuestion.topic}",
                        style = MaterialTheme.typography.bodySmall,
                        color = TextSecondary
                    )
                }

                if (isFlagged) {
                    Surface(color = WarningAmberBg, shape = RoundedCornerShape(8.dp)) {
                        Text(
                            text = "Flagged",
                            style = MaterialTheme.typography.labelSmall,
                            color = WarningAmber,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Origin Badge
            val isAuthenticJamb = currentQuestion.originType == "JAMB_ORIGINAL" || currentQuestion.isVerifiedJamb
            val originDisplay = if (isAuthenticJamb) {
                currentQuestion.originLabel.ifBlank { "Official JAMB Past Question • ${currentQuestion.year}" }
            } else {
                "Prepza AI Generated • Syllabus Drill"
            }
            Surface(
                color = if (isAuthenticJamb) PaleGreenBg else AppBackground,
                shape = RoundedCornerShape(8.dp),
                border = androidx.compose.foundation.BorderStroke(
                    1.dp,
                    if (isAuthenticJamb) PrimaryGreenLight.copy(alpha = 0.5f) else BorderSubtle
                )
            ) {
                Text(
                    text = originDisplay,
                    style = MaterialTheme.typography.labelSmall,
                    color = if (isAuthenticJamb) PrimaryGreenDark else TextSecondary,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }

            // Comprehension Passage Display & Interactive "View Passage" Link
            val effectivePassage = getEffectivePassageForQuestion(currentQuestion)
            if (!effectivePassage.isNullOrBlank()) {
                Spacer(modifier = Modifier.height(14.dp))
                ComprehensionPassageLink(
                    passageText = effectivePassage,
                    topic = currentQuestion.topic,
                    subject = currentQuestion.subject,
                    year = currentQuestion.year
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Main Question Statement
            Surface(
                shape = RoundedCornerShape(16.dp),
                color = SurfaceWhite,
                border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = QuestionMediaDetector.cleanQuestionDisplayText(currentQuestion.questionText),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = TextPrimary,
                    lineHeight = 26.sp,
                    modifier = Modifier.padding(18.dp)
                )
            }

            // Question Image / Diagram Display if present
            QuestionImageViewer(
                question = currentQuestion,
                modifier = Modifier.padding(top = 14.dp, bottom = 2.dp)
            )

            Spacer(modifier = Modifier.height(18.dp))

            // 4 Options A, B, C, D
            val options = listOf(
                "A" to currentQuestion.optionA,
                "B" to currentQuestion.optionB,
                "C" to currentQuestion.optionC,
                "D" to currentQuestion.optionD
            )

            options.forEachIndexed { optIdx, (letter, text) ->
                val isSelected = selectedOptionIndex == optIdx

                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .clip(RoundedCornerShape(14.dp))
                        .clickable { onAnswerSelected(optIdx) }
                        .testTag("cbt_option_${letter.lowercase()}"),
                    shape = RoundedCornerShape(14.dp),
                    color = if (isSelected) PaleGreenBg else SurfaceWhite,
                    border = androidx.compose.foundation.BorderStroke(
                        width = if (isSelected) 2.dp else 1.dp,
                        color = if (isSelected) PrimaryGreen else BorderSubtle
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = if (isSelected) PrimaryGreen else BorderSubtle,
                            modifier = Modifier.size(32.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(
                                    text = letter,
                                    style = MaterialTheme.typography.labelLarge,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isSelected) Color.White else TextPrimary
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(14.dp))

                        Text(
                            text = text,
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                            color = TextPrimary,
                            modifier = Modifier.weight(1f),
                            lineHeight = 20.sp
                        )

                        if (isSelected) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = "Selected",
                                tint = PrimaryGreen,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
