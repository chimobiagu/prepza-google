package com.example.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.outlined.Calculate
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
import com.example.ui.components.*
import com.example.ui.theme.*

@Composable
fun QuestionPracticeScreen(
    questions: List<QuestionEntity>,
    currentIndex: Int,
    userAnswers: Map<String, Int>,
    showExplanation: Boolean,
    bookmarkedIds: Set<String>,
    onAnswerSelected: (optionIndex: Int) -> Unit,
    onNextQuestion: () -> Unit,
    onPreviousQuestion: () -> Unit,
    onFinishSession: () -> Unit,
    onToggleBookmark: (questionId: String) -> Unit,
    onAskAiTutor: (contextQuestion: String) -> Unit
) {
    var showCalculator by remember { mutableStateOf(false) }

    if (questions.isEmpty()) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator(color = PrimaryGreen)
        }
        return
    }

    val question = questions[currentIndex.coerceIn(questions.indices)]
    val selectedOptionIndex = userAnswers[question.id]
    val isBookmarked = bookmarkedIds.contains(question.id)

    if (showCalculator) {
        ScientificCalculatorDialog(onDismiss = { showCalculator = false })
    }

    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(AppBackground)
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Close Button
                    Surface(
                        shape = CircleShape,
                        color = SurfaceWhite,
                        border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                        modifier = Modifier
                            .size(38.dp)
                            .clip(CircleShape)
                            .clickable(onClick = onFinishSession)
                            .testTag("exit_practice_btn")
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Close Practice",
                                tint = TextPrimary,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }

                    // Progress Number e.g. "5 / 40"
                    Text(
                        text = "${currentIndex + 1} / ${questions.size}",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )

                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        // Calculator Button
                        Surface(
                            shape = CircleShape,
                            color = SurfaceWhite,
                            border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                            modifier = Modifier
                                .size(38.dp)
                                .clip(CircleShape)
                                .clickable { showCalculator = true }
                                .testTag("practice_calculator_btn")
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Outlined.Calculate,
                                    contentDescription = "Calculator",
                                    tint = TextPrimary,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }

                        // Bookmark Button
                        Surface(
                            shape = CircleShape,
                            color = if (isBookmarked) SoftEmeraldBg else SurfaceWhite,
                            border = androidx.compose.foundation.BorderStroke(
                                1.dp,
                                if (isBookmarked) PrimaryGreenLight else BorderSubtle
                            ),
                            modifier = Modifier
                                .size(38.dp)
                                .clip(CircleShape)
                                .clickable { onToggleBookmark(question.id) }
                                .testTag("practice_bookmark_btn")
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = if (isBookmarked) Icons.Filled.Bookmark else Icons.Outlined.BookmarkBorder,
                                    contentDescription = "Bookmark",
                                    tint = if (isBookmarked) PrimaryGreen else TextPrimary,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))
                PrepzaProgressBar(
                    progress = (currentIndex + 1).toFloat() / questions.size.toFloat(),
                    color = PrimaryGreen,
                    trackColor = BorderSubtle,
                    modifier = Modifier.height(5.dp)
                )
            }
        },
        bottomBar = {
            Surface(
                color = SurfaceWhite,
                shadowElevation = 8.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Previous Pill
                    Surface(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(22.dp))
                            .clickable(enabled = currentIndex > 0) { onPreviousQuestion() },
                        shape = RoundedCornerShape(22.dp),
                        color = if (currentIndex > 0) BorderSubtle else BorderSubtle.copy(alpha = 0.5f)
                    ) {
                        Row(
                            modifier = Modifier.padding(vertical = 12.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp),
                                tint = if (currentIndex > 0) TextPrimary else TextMuted
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Previous",
                                fontWeight = FontWeight.Bold,
                                color = if (currentIndex > 0) TextPrimary else TextMuted
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(14.dp))

                    // Next / Finish Pill
                    Surface(
                        modifier = Modifier
                            .weight(1f)
                            .clip(RoundedCornerShape(22.dp))
                            .clickable {
                                if (currentIndex < questions.size - 1) onNextQuestion() else onFinishSession()
                            },
                        shape = RoundedCornerShape(22.dp),
                        color = DarkCardBg
                    ) {
                        Row(
                            modifier = Modifier.padding(vertical = 12.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = if (currentIndex < questions.size - 1) "Next" else "Finish",
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp),
                                tint = Color.White
                            )
                        }
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
                .padding(20.dp)
        ) {
            // Origin Badge
            val isAuthenticJamb = question.originType == "JAMB_ORIGINAL" || question.isVerifiedJamb
            Surface(
                color = if (isAuthenticJamb) SoftEmeraldBg else AppBackground,
                shape = RoundedCornerShape(8.dp),
                border = androidx.compose.foundation.BorderStroke(
                    1.dp,
                    if (isAuthenticJamb) PrimaryGreenLight.copy(alpha = 0.3f) else BorderSubtle
                )
            ) {
                val originText = if (question.year.isNotBlank()) {
                    "JAMB Past Question • ${question.year}"
                } else {
                    "UTME Standard Question"
                }
                Text(
                    text = originText,
                    style = MaterialTheme.typography.labelSmall,
                    color = PrimaryGreen,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Passage Text if present & Interactive "View Passage" Link
            val effectivePassage = getEffectivePassageForQuestion(question)
            if (!effectivePassage.isNullOrBlank()) {
                ComprehensionPassageLink(
                    passageText = effectivePassage,
                    topic = question.topic,
                    subject = question.subject,
                    year = question.year
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            // Question Text
            FormattedText(
                text = question.questionText,
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontSize = 20.sp,
                    lineHeight = 28.sp
                ),
                fontWeight = FontWeight.Bold,
                color = TextPrimary,
                isQuestionStem = true
            )

            // Question Image / Diagram Display if present
            QuestionImageViewer(
                question = question,
                modifier = Modifier.padding(top = 16.dp, bottom = 4.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Options List
            val options = listOf(
                "A" to question.optionA,
                "B" to question.optionB,
                "C" to question.optionC,
                "D" to question.optionD
            )

            options.forEachIndexed { optIdx, (letter, text) ->
                val isSelected = selectedOptionIndex == optIdx
                val isCorrect = optIdx == question.correctAnswerIndex
                val hasAnswered = selectedOptionIndex != null

                val backgroundColor = when {
                    hasAnswered && isCorrect -> CorrectGreenBg
                    hasAnswered && isSelected && !isCorrect -> IncorrectRedBg
                    isSelected -> PaleGreenBg
                    else -> SurfaceWhite
                }

                val borderColor = when {
                    hasAnswered && isCorrect -> CorrectGreen
                    hasAnswered && isSelected && !isCorrect -> IncorrectRed
                    isSelected -> PrimaryGreen
                    else -> BorderSubtle
                }

                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .clickable { onAnswerSelected(optIdx) }
                        .testTag("option_${letter.lowercase()}"),
                    shape = RoundedCornerShape(16.dp),
                    color = backgroundColor,
                    border = androidx.compose.foundation.BorderStroke(1.5.dp, borderColor)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = when {
                                hasAnswered && isCorrect -> CorrectGreen
                                hasAnswered && isSelected && !isCorrect -> IncorrectRed
                                isSelected -> PrimaryGreen
                                else -> AppBackground
                            },
                            modifier = Modifier.size(34.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Text(
                                    text = letter,
                                    style = MaterialTheme.typography.labelLarge,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isSelected || (hasAnswered && isCorrect) || (hasAnswered && isSelected && !isCorrect)) Color.White else TextPrimary
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(14.dp))

                        FormattedText(
                            text = text,
                            style = MaterialTheme.typography.bodyLarge,
                            color = TextPrimary,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.weight(1f)
                        )

                        if (hasAnswered && isCorrect) {
                            Icon(Icons.Default.CheckCircle, contentDescription = "Correct", tint = CorrectGreen, modifier = Modifier.size(22.dp))
                        } else if (hasAnswered && isSelected && !isCorrect) {
                            Icon(Icons.Default.Cancel, contentDescription = "Incorrect", tint = IncorrectRed, modifier = Modifier.size(22.dp))
                        }
                    }
                }
            }

            // Step-by-Step Explanation Card
            AnimatedVisibility(
                visible = showExplanation && selectedOptionIndex != null,
                enter = fadeIn() + expandVertically()
            ) {
                Column(modifier = Modifier.padding(top = 12.dp)) {
                    Surface(
                        color = SurfaceWhite,
                        shape = RoundedCornerShape(16.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(18.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Step-by-step explanation",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = TextPrimary
                                )

                                Surface(
                                    color = CorrectGreenBg,
                                    shape = RoundedCornerShape(8.dp)
                                ) {
                                    val correctLetter = when(question.correctAnswerIndex) {
                                        0 -> "A"
                                        1 -> "B"
                                        2 -> "C"
                                        else -> "D"
                                    }
                                    Text(
                                        text = "Answer: $correctLetter",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = CorrectGreen,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            FormattedText(
                                text = question.explanation,
                                style = MaterialTheme.typography.bodyMedium,
                                color = TextPrimary,
                                lineHeight = 22.sp
                            )

                            Spacer(modifier = Modifier.height(14.dp))

                            // Ask AI Tutor Button
                            Surface(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                                    .clickable {
                                        onAskAiTutor("Question: ${question.questionText}\nExplanation: ${question.explanation}")
                                    },
                                shape = RoundedCornerShape(12.dp),
                                color = PaleGreenBg,
                                border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreenLight.copy(alpha = 0.3f))
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(12.dp),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.AutoAwesome,
                                        contentDescription = null,
                                        tint = PrimaryGreen,
                                        modifier = Modifier.size(16.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = "Ask AI Tutor (Voice & Text)",
                                        style = MaterialTheme.typography.labelLarge,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryGreen
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Icon(
                                        imageVector = Icons.Default.Mic,
                                        contentDescription = null,
                                        tint = PrimaryGreenDark,
                                        modifier = Modifier.size(14.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}
