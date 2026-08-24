package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.data.db.MistakeEntity
import com.example.data.db.QuestionEntity
import com.example.ui.components.EmptyStateView
import com.example.ui.components.PrepzaCard
import com.example.ui.components.QuestionImageViewer
import com.example.ui.components.QuestionMediaDetector
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MistakeBankScreen(
    allMistakes: List<MistakeEntity>,
    allQuestions: List<QuestionEntity>,
    onStartMistakeDrill: (subjectFilter: String?) -> Unit,
    onPracticeSingleQuestion: (question: QuestionEntity) -> Unit,
    onMarkMastered: (questionId: String, isMastered: Boolean) -> Unit,
    onRemoveMistake: (questionId: String) -> Unit,
    onClearAllMistakes: () -> Unit,
    onBack: () -> Unit
) {
    var selectedTab by remember { mutableStateOf(0) } // 0 = Needs Revision, 1 = Mastered
    var selectedSubject by remember { mutableStateOf("All Subjects") }
    var showClearConfirmation by remember { mutableStateOf(false) }

    val unmasteredList = remember(allMistakes) { allMistakes.filter { !it.isMastered } }
    val masteredList = remember(allMistakes) { allMistakes.filter { it.isMastered } }

    val currentList = if (selectedTab == 0) unmasteredList else masteredList

    val subjectList = remember(allMistakes) {
        val list = mutableListOf("All Subjects")
        list.addAll(allMistakes.map { it.subject }.distinct().sorted())
        list
    }

    val filteredList = remember(currentList, selectedSubject) {
        if (selectedSubject == "All Subjects") {
            currentList
        } else {
            currentList.filter { it.subject.equals(selectedSubject, ignoreCase = true) }
        }
    }

    if (showClearConfirmation) {
        AlertDialog(
            onDismissRequest = { showClearConfirmation = false },
            title = { Text("Clear Mistake Bank?") },
            text = { Text("This will remove all recorded mistakes from your local Room database. This action cannot be undone.") },
            confirmButton = {
                Button(
                    onClick = {
                        onClearAllMistakes()
                        showClearConfirmation = false
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
                ) {
                    Text("Clear All")
                }
            },
            dismissButton = {
                TextButton(onClick = { showClearConfirmation = false }) {
                    Text("Cancel")
                }
            }
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Mistake Bank",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBack, modifier = Modifier.testTag("mistake_bank_back_btn")) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    if (allMistakes.isNotEmpty()) {
                        IconButton(onClick = { showClearConfirmation = true }) {
                            Icon(
                                imageVector = Icons.Default.DeleteOutline,
                                contentDescription = "Clear All Mistakes",
                                tint = TextSecondary
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = AppBackground)
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(AppBackground)
        ) {
            // Stats & Quick Drill Banner
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 6.dp),
                color = SurfaceWhite,
                shape = RoundedCornerShape(14.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            color = SoftRed.copy(alpha = 0.12f),
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier.size(34.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.Psychology,
                                    contentDescription = null,
                                    tint = SoftRed,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "${unmasteredList.size} to review",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = "${masteredList.size} mastered",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary
                            )
                        }
                    }

                    if (unmasteredList.isNotEmpty()) {
                        Button(
                            onClick = { onStartMistakeDrill(if (selectedSubject == "All Subjects") null else selectedSubject) },
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                            shape = RoundedCornerShape(10.dp),
                            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                            modifier = Modifier.testTag("start_mistake_drill_btn")
                        ) {
                            Icon(
                                imageVector = Icons.Default.PlayArrow,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Drill", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                        }
                    }
                }
            }

            // Tab Selection (Needs Revision vs Mastered)
            TabRow(
                selectedTabIndex = selectedTab,
                containerColor = AppBackground,
                contentColor = PrimaryGreen,
                modifier = Modifier.padding(horizontal = 20.dp)
            ) {
                Tab(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    text = {
                        Text(
                            text = "To Review (${unmasteredList.size})",
                            fontWeight = if (selectedTab == 0) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                )
                Tab(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    text = {
                        Text(
                            text = "Mastered (${masteredList.size})",
                            fontWeight = if (selectedTab == 1) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                )
            }

            // Subject Filter Chips
            if (subjectList.size > 1) {
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(subjectList) { subj ->
                        val isSelected = subj == selectedSubject
                        FilterChip(
                            selected = isSelected,
                            onClick = { selectedSubject = subj },
                            label = { Text(subj) },
                            colors = FilterChipDefaults.filterChipColors(
                                selectedContainerColor = PrimaryGreen,
                                selectedLabelColor = Color.White
                            )
                        )
                    }
                }
            } else {
                Spacer(modifier = Modifier.height(8.dp))
            }

            // List of Mistakes
            if (filteredList.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    contentAlignment = Alignment.Center
                ) {
                    if (selectedTab == 0) {
                        EmptyStateView(
                            icon = Icons.Default.CheckCircle,
                            title = "Mistake Bank Clean!",
                            description = "You have no unmastered mistakes in this category. As you practice past questions and CBT mocks, any missed questions are automatically saved here offline."
                        )
                    } else {
                        EmptyStateView(
                            icon = Icons.Default.EmojiEvents,
                            title = "No Mastered Questions Yet",
                            description = "When you re-attempt and answer questions correctly in mistake drills, they will appear here as mastered."
                        )
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(horizontal = 20.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    items(filteredList, key = { it.questionId }) { mistake ->
                        val question = allQuestions.find { it.id == mistake.questionId }
                        if (question != null) {
                            MistakeQuestionCard(
                                mistake = mistake,
                                question = question,
                                onPractice = { onPracticeSingleQuestion(question) },
                                onToggleMastered = { isMastered ->
                                    onMarkMastered(mistake.questionId, isMastered)
                                },
                                onRemove = { onRemoveMistake(mistake.questionId) }
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun MistakeQuestionCard(
    mistake: MistakeEntity,
    question: QuestionEntity,
    onPractice: () -> Unit,
    onToggleMastered: (Boolean) -> Unit,
    onRemove: () -> Unit
) {
    var isExpanded by remember { mutableStateOf(false) }

    PrepzaCard {
        Column(modifier = Modifier.fillMaxWidth()) {
            // Header Tags
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        color = PaleGreenBg,
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = question.subject,
                            style = MaterialTheme.typography.labelSmall,
                            color = PrimaryGreen,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                        )
                    }
                    Surface(
                        color = AppBackground,
                        shape = RoundedCornerShape(6.dp)
                    ) {
                        Text(
                            text = "JAMB ${question.year}",
                            style = MaterialTheme.typography.labelSmall,
                            color = TextSecondary,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 3.dp)
                        )
                    }
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Missed ${mistake.attemptCount}x",
                        style = MaterialTheme.typography.labelSmall,
                        color = SoftRed,
                        fontWeight = FontWeight.Bold
                    )
                    IconButton(onClick = onRemove, modifier = Modifier.size(32.dp)) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Remove from Mistake Bank",
                            tint = TextSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Topic badge
            Text(
                text = "Topic: ${question.topic}",
                style = MaterialTheme.typography.labelSmall,
                color = TextSecondary,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(6.dp))

            // Question Text
            Text(
                text = QuestionMediaDetector.cleanQuestionDisplayText(question.questionText),
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.SemiBold,
                color = TextPrimary
            )

            // Question Image / Diagram Display
            QuestionImageViewer(
                question = question,
                modifier = Modifier.padding(top = 10.dp, bottom = 4.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Options summary
            Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                question.options.forEachIndexed { idx, opt ->
                    val optLetter = ('A' + idx).toString()
                    val isCorrect = idx == question.correctAnswerIndex
                    val isWrongAnswer = idx == mistake.selectedWrongOptionIndex

                    val containerColor = when {
                        isCorrect -> PaleGreenBg
                        isWrongAnswer -> SoftRed.copy(alpha = 0.12f)
                        else -> AppBackground.copy(alpha = 0.5f)
                    }

                    val textColor = when {
                        isCorrect -> PrimaryGreen
                        isWrongAnswer -> SoftRed
                        else -> TextSecondary
                    }

                    Surface(
                        color = containerColor,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 10.dp, vertical = 8.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "$optLetter. $opt",
                                style = MaterialTheme.typography.bodySmall,
                                color = textColor,
                                fontWeight = if (isCorrect || isWrongAnswer) FontWeight.Bold else FontWeight.Normal,
                                modifier = Modifier.weight(1f)
                            )
                            if (isCorrect) {
                                Text(
                                    text = "Correct",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = PrimaryGreen,
                                    fontWeight = FontWeight.Bold
                                )
                            } else if (isWrongAnswer) {
                                Text(
                                    text = "Your Answer",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = SoftRed,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Collapsible Detailed Explanation
            if (isExpanded) {
                Surface(
                    color = PaleGreenBg.copy(alpha = 0.6f),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Lightbulb,
                                contentDescription = null,
                                tint = PrimaryGreen,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "JAMB Explanation & Key Rule",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryGreen
                            )
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = question.explanation,
                            style = MaterialTheme.typography.bodySmall,
                            color = TextPrimary
                        )

                        if (!mistake.userNotes.isNullOrBlank()) {
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = "Study Note: ${mistake.userNotes}",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary,
                                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
            }

            // Bottom Action Bar
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextButton(
                    onClick = { isExpanded = !isExpanded },
                    contentPadding = PaddingValues(horizontal = 8.dp)
                ) {
                    Icon(
                        imageVector = if (isExpanded) Icons.Default.ExpandLess else Icons.Default.ExpandMore,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp),
                        tint = PrimaryGreen
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = if (isExpanded) "Hide Explanation" else "Show Explanation",
                        color = PrimaryGreen,
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    if (!mistake.isMastered) {
                        OutlinedButton(
                            onClick = { onToggleMastered(true) },
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp)
                        ) {
                            Icon(imageVector = Icons.Default.Check, contentDescription = null, modifier = Modifier.size(14.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Mark Mastered", style = MaterialTheme.typography.labelSmall)
                        }
                    } else {
                        OutlinedButton(
                            onClick = { onToggleMastered(false) },
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 4.dp)
                        ) {
                            Text("Move to Revise", style = MaterialTheme.typography.labelSmall)
                        }
                    }

                    FilledTonalButton(
                        onClick = onPractice,
                        colors = ButtonDefaults.filledTonalButtonColors(containerColor = PrimaryGreen, contentColor = Color.White),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)
                    ) {
                        Icon(imageVector = Icons.Default.PlayArrow, contentDescription = null, modifier = Modifier.size(14.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Practice", style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
