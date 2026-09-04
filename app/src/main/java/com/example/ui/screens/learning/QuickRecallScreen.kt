package com.example.ui.screens.learning

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.learning.LearningPack
import com.example.data.learning.QuickRecallQuestion
import com.example.ui.viewmodel.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuickRecallScreen(
    pack: LearningPack,
    viewModel: MainViewModel,
    onClose: () -> Unit,
    onStartPractice: (String, String) -> Unit
) {
    val questions = pack.recallQuestions
    val total = questions.size

    var currentIndex by remember { mutableStateOf(0) }
    var selectedOption by remember { mutableStateOf<Int?>(null) }
    var isSubmitted by remember { mutableStateOf(false) }
    var score by remember { mutableStateOf(0) }
    var isFinished by remember { mutableStateOf(false) }

    val currentQuestion = if (questions.isNotEmpty()) {
        questions.getOrElse(currentIndex) { questions.first() }
    } else {
        QuickRecallQuestion(
            id = "default_q",
            question = "Have you reviewed all concepts in ${pack.topicName}?",
            options = listOf("Yes, ready to test", "Reviewing again", "Need practice", "Clear understanding"),
            correctIndex = 0,
            explanation = "Great job reviewing this topic! Continue to practice to solidify your mastery."
        )
    }

    fun handleOptionSelect(optionIdx: Int) {
        if (isSubmitted) return
        selectedOption = optionIdx
        isSubmitted = true
        if (optionIdx == currentQuestion.correctIndex) {
            score += 1
        }
        viewModel.answerQuickRecallQuestion(currentIndex, optionIdx)
    }

    fun handleNext() {
        if (currentIndex < total - 1) {
            currentIndex += 1
            selectedOption = null
            isSubmitted = false
        } else {
            isFinished = true
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "Quick Recall: ${pack.topicName}",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                        Text(
                            text = if (!isFinished) "Question ${currentIndex + 1} of ${total.coerceAtLeast(1)}" else "Recall Completed",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onClose) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { innerPadding ->
        if (isFinished) {
            QuickRecallSummaryView(
                pack = pack,
                score = score,
                total = total.coerceAtLeast(1),
                onRetry = {
                    currentIndex = 0
                    selectedOption = null
                    isSubmitted = false
                    score = 0
                    isFinished = false
                    viewModel.startQuickRecall()
                },
                onStartPractice = { onStartPractice(pack.subject, pack.topicName) },
                onClose = onClose
            )
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(horizontal = 20.dp, vertical = 14.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Progress Bar
                val progressRatio = if (total > 0) ((currentIndex + 1).toFloat() / total) else 1f
                LinearProgressIndicator(
                    progress = { progressRatio },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(CircleShape),
                    color = MaterialTheme.colorScheme.primary,
                    trackColor = MaterialTheme.colorScheme.surfaceVariant
                )

                // Question Card
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    color = MaterialTheme.colorScheme.surface,
                    tonalElevation = 2.dp
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.6f)
                        ) {
                            Text(
                                text = "CONCEPT CHECK",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                            )
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Text(
                            text = currentQuestion.question,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface,
                            lineHeight = 24.sp
                        )
                    }
                }

                // Options
                Text(
                    text = "SELECT THE BEST ANSWER",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    letterSpacing = 0.8.sp
                )

                currentQuestion.options.forEachIndexed { idx, optionText ->
                    val isSelected = selectedOption == idx
                    val isCorrect = idx == currentQuestion.correctIndex

                    val (containerColor, borderColor, textColor) = when {
                        !isSubmitted -> Triple(
                            MaterialTheme.colorScheme.surface,
                            MaterialTheme.colorScheme.outlineVariant,
                            MaterialTheme.colorScheme.onSurface
                        )
                        isCorrect -> Triple(
                            Color(0xFFECFDF5),
                            Color(0xFF10B981),
                            Color(0xFF065F46)
                        )
                        isSelected && !isCorrect -> Triple(
                            Color(0xFFFEF2F2),
                            Color(0xFFEF4444),
                            Color(0xFF991B1B)
                        )
                        else -> Triple(
                            MaterialTheme.colorScheme.surface.copy(alpha = 0.6f),
                            MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f),
                            MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    Surface(
                        onClick = { handleOptionSelect(idx) },
                        enabled = !isSubmitted,
                        shape = RoundedCornerShape(14.dp),
                        color = containerColor,
                        border = androidx.compose.foundation.BorderStroke(1.5.dp, borderColor),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            val optionLetter = ('A' + idx).toString()
                            Surface(
                                shape = CircleShape,
                                color = if (isSubmitted && isCorrect) Color(0xFF10B981) else if (isSubmitted && isSelected) Color(0xFFEF4444) else MaterialTheme.colorScheme.surfaceVariant,
                                modifier = Modifier.size(32.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Text(
                                        text = if (isSubmitted && isCorrect) "✓" else if (isSubmitted && isSelected) "✗" else optionLetter,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isSubmitted && (isCorrect || isSelected)) Color.White else MaterialTheme.colorScheme.onSurface
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.width(14.dp))

                            Text(
                                text = optionText,
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = if (isSelected || (isSubmitted && isCorrect)) FontWeight.Bold else FontWeight.Normal,
                                color = textColor,
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }

                // Explanation Box after submitting
                AnimatedVisibility(visible = isSubmitted) {
                    Surface(
                        shape = RoundedCornerShape(14.dp),
                        color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.Info,
                                    contentDescription = null,
                                    tint = MaterialTheme.colorScheme.secondary,
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = if (selectedOption == currentQuestion.correctIndex) "Correct!" else "Explanation",
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = MaterialTheme.colorScheme.secondary
                                )
                            }
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = currentQuestion.explanation,
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurface,
                                lineHeight = 18.sp
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                // Next Question Button
                if (isSubmitted) {
                    Button(
                        onClick = { handleNext() },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        shape = RoundedCornerShape(14.dp)
                    ) {
                        Text(
                            text = if (currentIndex == total - 1) "VIEW RESULTS" else "NEXT QUESTION",
                            fontWeight = FontWeight.Bold,
                            fontSize = 15.sp
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun QuickRecallSummaryView(
    pack: LearningPack,
    score: Int,
    total: Int,
    onRetry: () -> Unit,
    onStartPractice: () -> Unit,
    onClose: () -> Unit
) {
    val accuracy = if (total > 0) (score * 100 / total) else 0
    val isGood = accuracy >= 70

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Result Icon
        Surface(
            shape = CircleShape,
            color = if (isGood) Color(0xFF10B981).copy(alpha = 0.15f) else Color(0xFFF59E0B).copy(alpha = 0.15f),
            modifier = Modifier.size(90.dp)
        ) {
            Box(contentAlignment = Alignment.Center) {
                Icon(
                    imageVector = if (isGood) Icons.Default.CheckCircle else Icons.Default.Replay,
                    contentDescription = null,
                    tint = if (isGood) Color(0xFF10B981) else Color(0xFFF59E0B),
                    modifier = Modifier.size(48.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = if (isGood) "Excellent Recall!" else "Good Effort!",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSurface
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "You answered $score of $total concept checks correctly ($accuracy%).",
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Topic Mastery Updated Banner
        Surface(
            shape = RoundedCornerShape(16.dp),
            color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(18.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "TOPIC STATUS UPDATED",
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = if (isGood) "✓ ${pack.topicName} marked as Learned" else "! Review recommended before test",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        // Action 1: Practice UTME Questions
        Button(
            onClick = onStartPractice,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            shape = RoundedCornerShape(14.dp)
        ) {
            Icon(imageVector = Icons.Default.PlayArrow, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "PRACTICE UTME QUESTIONS",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Action 2: Retry Recall
        OutlinedButton(
            onClick = onRetry,
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(14.dp)
        ) {
            Icon(imageVector = Icons.Default.Replay, contentDescription = null, modifier = Modifier.size(18.dp))
            Spacer(modifier = Modifier.width(6.dp))
            Text("Retry Recall Checks", fontWeight = FontWeight.SemiBold)
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Action 3: Done / Close
        TextButton(
            onClick = onClose,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Return to Topic Overview", color = MaterialTheme.colorScheme.onSurfaceVariant)
        }
    }
}
