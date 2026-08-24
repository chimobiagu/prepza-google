package com.example.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.db.QuestionEntity
import com.example.ui.components.PrepzaProgressBar
import com.example.ui.components.QuestionImageViewer
import com.example.ui.components.QuestionMediaDetector
import com.example.ui.theme.*
import com.example.ui.viewmodel.CbtResultSummary
import kotlin.math.roundToInt

@Composable
fun CbtResultsScreen(
    summary: CbtResultSummary,
    onRetakeMock: () -> Unit,
    onReturnHome: () -> Unit,
    onAskAiTutor: (question: QuestionEntity, userOption: Int?) -> Unit = { _, _ -> }
) {
    var isReviewingAnswers by remember { mutableStateOf(false) }

    if (isReviewingAnswers) {
        CbtDetailedAnswersReviewScreen(
            summary = summary,
            onBackToSummary = { isReviewingAnswers = false },
            onAskAiTutor = onAskAiTutor
        )
    } else {
        CbtMainSummaryScreen(
            summary = summary,
            onRetakeMock = onRetakeMock,
            onReturnHome = onReturnHome,
            onOpenReview = { isReviewingAnswers = true }
        )
    }
}

@Composable
private fun CbtMainSummaryScreen(
    summary: CbtResultSummary,
    onRetakeMock: () -> Unit,
    onReturnHome: () -> Unit,
    onOpenReview: () -> Unit
) {
    val isMini = summary.isMiniCbt
    val totalPossibleScore = if (isMini) summary.maxScore else {
        val calculated = summary.subjectScores.size * 100
        if (calculated > 0) calculated else 400
    }
    val maxScore = if (isMini) summary.maxScore else totalPossibleScore

    val timeMinutes = summary.totalTimeSeconds / 60
    val timeSeconds = summary.totalTimeSeconds % 60
    val formattedTime = String.format("%02dm %02ds", timeMinutes, timeSeconds)

    val totalCorrectCount = if (isMini) summary.totalScore else summary.subjectScores.values.sumOf { it.first }
    val totalQuestionsCount = if (isMini) summary.maxScore else summary.subjectScores.values.sumOf { it.second }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBackground)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(6.dp))

        Surface(
            shape = CircleShape,
            color = SoftEmeraldBg,
            modifier = Modifier.size(68.dp)
        ) {
            Box(contentAlignment = Alignment.Center) {
                Icon(
                    imageVector = if (isMini) Icons.Default.Quiz else Icons.Default.School,
                    contentDescription = null,
                    tint = PrimaryGreen,
                    modifier = Modifier.size(34.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = if (isMini) "Mini CBT Results" else "Full CBT Mock Results",
            style = MaterialTheme.typography.displayMedium.copy(
                fontSize = 24.sp,
                letterSpacing = (-0.5).sp
            ),
            fontWeight = FontWeight.Bold,
            color = TextPrimary
        )

        if (isMini && !summary.miniCbtSubject.isNullOrBlank()) {
            Surface(
                shape = RoundedCornerShape(8.dp),
                color = SoftEmeraldBg,
                modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
            ) {
                Text(
                    text = summary.miniCbtSubject,
                    style = MaterialTheme.typography.labelMedium,
                    color = PrimaryGreenDark,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 3.dp)
                )
            }
        }

        Text(
            text = summary.readinessEstimate,
            style = MaterialTheme.typography.bodyMedium,
            color = PrimaryGreen,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(horizontal = 8.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 1. Total Score Big Hero Card
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(18.dp)),
            color = DarkCardBg,
            shape = RoundedCornerShape(18.dp)
        ) {
            Column(
                modifier = Modifier.padding(22.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = if (isMini) "MINI CBT GRADE" else "TOTAL JAMB CBT SCORE",
                    style = MaterialTheme.typography.labelSmall,
                    color = TextMuted,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = "${summary.totalScore}",
                        fontSize = 50.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = " / $maxScore",
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = TextMuted,
                        modifier = Modifier.padding(bottom = 8.dp, start = 4.dp)
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "$totalCorrectCount of $totalQuestionsCount questions correct (${summary.accuracyPercent}% overall)",
                    style = MaterialTheme.typography.bodyMedium,
                    color = PaleGreenBg
                )

                Spacer(modifier = Modifier.height(14.dp))

                // Stats Chips Row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Result", style = MaterialTheme.typography.labelSmall, color = TextMuted)
                        Text(
                            text = "${summary.totalScore}/$maxScore",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 15.sp
                        )
                    }
                    Divider(
                        modifier = Modifier
                            .height(24.dp)
                            .width(1.dp),
                        color = Color.White.copy(alpha = 0.2f)
                    )
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Time Used", style = MaterialTheme.typography.labelSmall, color = TextMuted)
                        Text(formattedTime, fontWeight = FontWeight.Bold, color = Color.White, fontSize = 15.sp)
                    }
                    Divider(
                        modifier = Modifier
                            .height(24.dp)
                            .width(1.dp),
                        color = Color.White.copy(alpha = 0.2f)
                    )
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Accuracy", style = MaterialTheme.typography.labelSmall, color = TextMuted)
                        Text("${summary.accuracyPercent}%", fontWeight = FontWeight.Bold, color = CorrectGreen, fontSize = 15.sp)
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        // 2. Primary Actions (Retake CBT & Return Home)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            OutlinedButton(
                onClick = onRetakeMock,
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = TextPrimary
                ),
                border = androidx.compose.foundation.BorderStroke(1.5.dp, BorderSubtle),
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .testTag("cbt_results_retake_btn")
            ) {
                Icon(Icons.Default.Refresh, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text(if (isMini) "Retake CBT" else "Retake Mock", fontWeight = FontWeight.Bold)
            }

            Button(
                onClick = onReturnHome,
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen, contentColor = Color.White),
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .testTag("cbt_results_home_btn")
            ) {
                Icon(Icons.Default.Home, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text("Return Home", fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        // 3. Prominent "Review Answers" Hero Banner
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .clickable(onClick = onOpenReview)
                .testTag("cbt_review_answers_button"),
            color = SurfaceWhite,
            shape = RoundedCornerShape(16.dp),
            border = androidx.compose.foundation.BorderStroke(1.5.dp, PrimaryGreen.copy(alpha = 0.5f))
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                    Surface(
                        shape = CircleShape,
                        color = SoftEmeraldBg,
                        modifier = Modifier.size(44.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = Icons.Default.FactCheck,
                                contentDescription = null,
                                tint = PrimaryGreen,
                                modifier = Modifier.size(22.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(14.dp))
                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Review Answers",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Surface(
                                shape = RoundedCornerShape(6.dp),
                                color = SoftEmeraldBg
                            ) {
                                Text(
                                    text = "${summary.questions.size} Questions",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = PrimaryGreenDark,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Tap to view full question solutions, correct options & explanations",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }
                }

                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = null,
                    tint = PrimaryGreen,
                    modifier = Modifier.size(20.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        // 4. Subject Breakdown Cards (For Full CBT Mock)
        if (!isMini && summary.subjectScores.isNotEmpty()) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Subject Performance",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )
                Text(
                    text = "Score per Subject (out of 100)",
                    style = MaterialTheme.typography.labelSmall,
                    color = TextSecondary
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            summary.subjectScores.forEach { (subj, pair) ->
                val correct = pair.first
                val total = pair.second
                val subjectScore = if (total > 0) {
                    ((correct.toDouble() / total.toDouble()) * 100.0).roundToInt()
                } else 0

                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp),
                    shape = RoundedCornerShape(14.dp),
                    color = SurfaceWhite,
                    border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    text = subj,
                                    style = MaterialTheme.typography.titleSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = TextPrimary
                                )
                                Text(
                                    text = "$correct of $total correct",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = TextSecondary
                                )
                            }

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "$subjectScore",
                                    style = MaterialTheme.typography.titleLarge,
                                    fontWeight = FontWeight.Bold,
                                    color = if (subjectScore >= 60) PrimaryGreen else IncorrectRed
                                )
                                Text(
                                    text = " / 100",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = TextSecondary,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        PrepzaProgressBar(
                            progress = (subjectScore.toFloat() / 100f).coerceIn(0f, 1f),
                            color = if (subjectScore >= 60) PrimaryGreen else IncorrectRed
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
private fun CbtDetailedAnswersReviewScreen(
    summary: CbtResultSummary,
    onBackToSummary: () -> Unit,
    onAskAiTutor: (question: QuestionEntity, userOption: Int?) -> Unit
) {
    var selectedReviewFilter by remember { mutableStateOf("all") } // "all", "mistakes", "correct", "unanswered"
    var selectedSubjectFilter by remember { mutableStateOf<String?>("All") }
    var expandedQuestionIndex by remember { mutableStateOf<Int?>(null) }

    // Precompute questions with user status
    val questionsWithStatus = remember(summary) {
        summary.questions.mapIndexed { index, q ->
            val userAns = summary.userAnswers[q.id]
            val isCorrect = userAns != null && userAns == q.correctAnswerIndex
            val isUnanswered = userAns == null
            Triple(index, q, when {
                isCorrect -> "correct"
                isUnanswered -> "unanswered"
                else -> "incorrect"
            })
        }
    }

    val mistakeCount = remember(questionsWithStatus) {
        questionsWithStatus.count { it.third == "incorrect" }
    }
    val correctCount = remember(questionsWithStatus) {
        questionsWithStatus.count { it.third == "correct" }
    }
    val unansweredCount = remember(questionsWithStatus) {
        questionsWithStatus.count { it.third == "unanswered" }
    }

    val distinctSubjects = remember(summary.questions) {
        listOf("All") + summary.questions.map { it.subject }.distinct()
    }

    val filteredQuestions = remember(selectedReviewFilter, selectedSubjectFilter, questionsWithStatus) {
        questionsWithStatus.filter { item ->
            val matchesStatus = when (selectedReviewFilter) {
                "mistakes" -> item.third == "incorrect"
                "correct" -> item.third == "correct"
                "unanswered" -> item.third == "unanswered"
                else -> true
            }
            val matchesSubject = selectedSubjectFilter == "All" || item.second.subject == selectedSubjectFilter
            matchesStatus && matchesSubject
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBackground)
    ) {
        // Top App Bar
        Surface(
            color = SurfaceWhite,
            shadowElevation = 2.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = onBackToSummary,
                        modifier = Modifier
                            .size(38.dp)
                            .clip(CircleShape)
                            .background(AppBackground)
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back to Summary",
                            tint = TextPrimary,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Review CBT Answers",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        Text(
                            text = "All Attempted Questions & Solutions",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Status Filter Chips
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    item {
                        FilterReviewChip(
                            label = "All (${summary.questions.size})",
                            isSelected = selectedReviewFilter == "all",
                            onClick = { selectedReviewFilter = "all" },
                            activeColor = PaleGreenBg,
                            activeTextColor = PrimaryGreenDark
                        )
                    }
                    item {
                        FilterReviewChip(
                            label = "Mistakes ($mistakeCount)",
                            isSelected = selectedReviewFilter == "mistakes",
                            onClick = { selectedReviewFilter = "mistakes" },
                            activeColor = IncorrectRedBg,
                            activeTextColor = IncorrectRed
                        )
                    }
                    item {
                        FilterReviewChip(
                            label = "Correct ($correctCount)",
                            isSelected = selectedReviewFilter == "correct",
                            onClick = { selectedReviewFilter = "correct" },
                            activeColor = SoftEmeraldBg,
                            activeTextColor = PrimaryGreenDark
                        )
                    }
                    if (unansweredCount > 0) {
                        item {
                            FilterReviewChip(
                                label = "Skipped ($unansweredCount)",
                                approaches = selectedReviewFilter == "unanswered",
                                onClick = { selectedReviewFilter = "unanswered" },
                                activeColor = SoftAmberBg,
                                activeTextColor = AmberAccent
                            )
                        }
                    }
                }

                if (distinctSubjects.size > 2) {
                    Spacer(modifier = Modifier.height(8.dp))
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(distinctSubjects) { subj ->
                            val isSelected = selectedSubjectFilter == subj
                            Surface(
                                shape = RoundedCornerShape(14.dp),
                                color = if (isSelected) PrimaryGreen else AppBackground,
                                modifier = Modifier
                                    .clip(RoundedCornerShape(14.dp))
                                    .clickable { selectedSubjectFilter = subj }
                            ) {
                                Text(
                                    text = subj,
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                    color = if (isSelected) Color.White else TextSecondary,
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                                )
                            }
                        }
                    }
                }
            }
        }

        // Question List
        if (filteredQuestions.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Outlined.CheckCircle,
                        contentDescription = null,
                        tint = PrimaryGreen,
                        modifier = Modifier.size(48.dp)
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "No questions match this filter.",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Try switching filter categories above.",
                        style = MaterialTheme.typography.bodySmall,
                        color = TextSecondary
                    )
                }
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                contentPadding = PaddingValues(vertical = 14.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(filteredQuestions, key = { it.second.id }) { (origIndex, q, status) ->
                    val userAns = summary.userAnswers[q.id]
                    val isCorrect = status == "correct"
                    val isUnanswered = status == "unanswered"
                    val isExpanded = expandedQuestionIndex == origIndex

                    val options = listOf(q.optionA, q.optionB, q.optionC, q.optionD)

                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(14.dp))
                            .clickable {
                                expandedQuestionIndex = if (isExpanded) null else origIndex
                            }
                            .testTag("review_q_${origIndex + 1}"),
                        shape = RoundedCornerShape(14.dp),
                        color = SurfaceWhite,
                        border = androidx.compose.foundation.BorderStroke(
                            1.dp,
                            if (isCorrect) CorrectGreen.copy(alpha = 0.5f) else if (isUnanswered) AmberAccent.copy(alpha = 0.4f) else IncorrectRed.copy(alpha = 0.4f)
                        )
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            // Header Row
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                                    Surface(
                                        shape = CircleShape,
                                        color = if (isCorrect) SoftEmeraldBg else if (isUnanswered) SoftAmberBg else IncorrectRedBg,
                                        modifier = Modifier.size(28.dp)
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Text(
                                                text = "${origIndex + 1}",
                                                style = MaterialTheme.typography.labelMedium,
                                                fontWeight = FontWeight.Bold,
                                                color = if (isCorrect) PrimaryGreenDark else if (isUnanswered) AmberAccent else IncorrectRed
                                            )
                                        }
                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column {
                                        Text(
                                            text = "${q.subject} • ${q.topic}",
                                            style = MaterialTheme.typography.labelSmall,
                                            color = TextSecondary,
                                            fontWeight = FontWeight.Medium
                                        )
                                        Text(
                                            text = if (isCorrect) "Correct" else if (isUnanswered) "Skipped / Unanswered" else "Incorrect",
                                            style = MaterialTheme.typography.labelSmall,
                                            fontWeight = FontWeight.Bold,
                                            color = if (isCorrect) CorrectGreen else if (isUnanswered) AmberAccent else IncorrectRed
                                        )
                                    }
                                }

                                Icon(
                                    imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                                    contentDescription = null,
                                    tint = TextSecondary
                                )
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            // Passage if any
                            if (!q.passageText.isNullOrBlank()) {
                                Surface(
                                    shape = RoundedCornerShape(8.dp),
                                    color = AppBackground,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 8.dp)
                                ) {
                                    Text(
                                        text = q.passageText,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = TextSecondary,
                                        modifier = Modifier.padding(10.dp)
                                    )
                                }
                            }

                            // Question Text
                            Text(
                                text = QuestionMediaDetector.cleanQuestionDisplayText(q.questionText),
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.SemiBold,
                                color = TextPrimary
                            )

                            // Question Image / Diagram Display
                            QuestionImageViewer(
                                question = q,
                                modifier = Modifier.padding(top = 10.dp, bottom = 4.dp)
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            // Four Options rendering
                            options.forEachIndexed { optIndex, optionText ->
                                val isUserChoice = userAns == optIndex
                                val isCorrectChoice = q.correctAnswerIndex == optIndex

                                val optionBorderColor = when {
                                    isCorrectChoice -> CorrectGreen
                                    isUserChoice && !isCorrectChoice -> IncorrectRed
                                    else -> BorderSubtle
                                }

                                val optionBgColor = when {
                                    isCorrectChoice -> SoftEmeraldBg
                                    isUserChoice && !isCorrectChoice -> IncorrectRedBg
                                    else -> SurfaceWhite
                                }

                                Surface(
                                    shape = RoundedCornerShape(10.dp),
                                    color = optionBgColor,
                                    border = androidx.compose.foundation.BorderStroke(
                                        if (isCorrectChoice || isUserChoice) 1.5.dp else 1.dp,
                                        optionBorderColor
                                    ),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 6.dp)
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                                        verticalAlignment = Alignment.CenterVertically,
                                        horizontalArrangement = Arrangement.SpaceBetween
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                                            Text(
                                                text = "${('A' + optIndex)}) ",
                                                fontWeight = FontWeight.Bold,
                                                color = if (isCorrectChoice) PrimaryGreenDark else if (isUserChoice) IncorrectRed else TextPrimary,
                                                fontSize = 13.sp
                                            )
                                            Text(
                                                text = optionText,
                                                style = MaterialTheme.typography.bodySmall,
                                                color = TextPrimary
                                            )
                                        }

                                        if (isCorrectChoice) {
                                            Surface(
                                                shape = RoundedCornerShape(6.dp),
                                                color = PrimaryGreen
                                            ) {
                                                Text(
                                                    text = "Correct",
                                                    color = Color.White,
                                                    style = MaterialTheme.typography.labelSmall,
                                                    fontWeight = FontWeight.Bold,
                                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                                )
                                            }
                                        } else if (isUserChoice) {
                                            Surface(
                                                shape = RoundedCornerShape(6.dp),
                                                color = IncorrectRed
                                            ) {
                                                Text(
                                                    text = "Your Choice",
                                                    color = Color.White,
                                                    style = MaterialTheme.typography.labelSmall,
                                                    fontWeight = FontWeight.Bold,
                                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                                )
                                            }
                                        }
                                    }
                                }
                            }

                            // Explanation & AI Tutor Section
                            if (q.explanation.isNotBlank()) {
                                Spacer(modifier = Modifier.height(6.dp))
                                Surface(
                                    shape = RoundedCornerShape(8.dp),
                                    color = PaleGreenBg,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Column(modifier = Modifier.padding(10.dp)) {
                                        Text(
                                            text = "Official Solution & Explanation:",
                                            style = MaterialTheme.typography.labelSmall,
                                            fontWeight = FontWeight.Bold,
                                            color = PrimaryGreen
                                        )
                                        Spacer(modifier = Modifier.height(2.dp))
                                        Text(
                                            text = q.explanation,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = TextPrimary
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            Button(
                                onClick = {
                                    onAskAiTutor(q, userAns)
                                },
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = SoftEmeraldBg,
                                    contentColor = PrimaryGreenDark
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(36.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.AutoAwesome,
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp),
                                    tint = PrimaryGreen
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Ask AI Tutor to Explain Question ${origIndex + 1}",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun FilterReviewChip(
    label: String,
    isSelected: Boolean = false,
    approaches: Boolean = false,
    onClick: () -> Unit,
    activeColor: Color,
    activeTextColor: Color
) {
    val active = isSelected || approaches
    Surface(
        shape = RoundedCornerShape(20.dp),
        color = if (active) activeColor else SurfaceWhite,
        border = androidx.compose.foundation.BorderStroke(
            width = if (active) 1.5.dp else 1.dp,
            color = if (active) activeTextColor else BorderSubtle
        ),
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .clickable(onClick = onClick)
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            fontWeight = if (active) FontWeight.Bold else FontWeight.Medium,
            color = if (active) activeTextColor else TextPrimary,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
        )
    }
}
