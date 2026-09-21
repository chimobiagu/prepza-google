package com.example.ui.screens.learning

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.learning.*
import com.example.ui.viewmodel.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearningPackScreen(
    pack: LearningPack,
    initialCardIndex: Int = 0,
    viewModel: MainViewModel,
    onClose: () -> Unit
) {
    val totalCards = pack.cards.size
    var currentIndex by remember(pack) {
        mutableIntStateOf(initialCardIndex.coerceIn(0, (totalCards - 1).coerceAtLeast(0)))
    }
    var isCompletedState by remember(pack) { mutableStateOf(false) }

    val fallbackCard = remember(pack) {
        LearningCard(
            id = "${pack.id}_placeholder",
            cardType = LearningCardType.DEFINITION,
            title = pack.topicName,
            content = pack.overview.ifBlank { "Syllabus topic ${pack.topicName} in ${pack.subject}." },
            subtitle = "${pack.subject} • Core Concepts",
            keyTakeaway = "Understand the fundamental definitions and rules of ${pack.topicName}."
        )
    }

    val currentCard = if (pack.cards.isNotEmpty() && currentIndex < totalCards) {
        pack.cards.getOrElse(currentIndex) { pack.cards.first() }
    } else {
        fallbackCard
    }

    var isBookmarked by remember { mutableStateOf(false) }

    fun goToNext() {
        if (currentIndex < totalCards - 1) {
            val next = currentIndex + 1
            currentIndex = next
            viewModel.setLearningCardIndex(next)
        } else {
            // Reached the end
            isCompletedState = true
            viewModel.setLearningCardIndex(totalCards - 1)
        }
    }

    fun goToPrev() {
        if (isCompletedState) {
            isCompletedState = false
            currentIndex = (totalCards - 1).coerceAtLeast(0)
        } else if (currentIndex > 0) {
            val prev = currentIndex - 1
            currentIndex = prev
            viewModel.setLearningCardIndex(prev)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = pack.topicName,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                        Text(
                            text = pack.subject,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onClose) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close Flashcards"
                        )
                    }
                },
                actions = {
                    if (!isCompletedState && pack.cards.isNotEmpty()) {
                        IconButton(
                            onClick = {
                                isBookmarked = !isBookmarked
                                viewModel.toggleLearningCardBookmark(pack.subject, pack.topicName, currentCard.id, isBookmarked)
                            }
                        ) {
                            Icon(
                                imageVector = if (isBookmarked) Icons.Filled.Bookmark else Icons.Outlined.BookmarkBorder,
                                contentDescription = "Bookmark card",
                                tint = if (isBookmarked) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        },
        bottomBar = {
            if (!isCompletedState) {
                Surface(
                    color = MaterialTheme.colorScheme.surface,
                    tonalElevation = 6.dp,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 20.dp, vertical = 14.dp)
                    ) {
                        // Linear Progress Bar
                        val progressRatio = if (totalCards > 0) ((currentIndex + 1).toFloat() / totalCards) else 0f
                        LinearProgressIndicator(
                            progress = { progressRatio },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(4.dp)
                                .clip(CircleShape),
                            color = MaterialTheme.colorScheme.primary,
                            trackColor = MaterialTheme.colorScheme.surfaceVariant
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            OutlinedButton(
                                onClick = { goToPrev() },
                                enabled = currentIndex > 0,
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier.weight(0.42f)
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                    contentDescription = "Previous",
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Previous", fontWeight = FontWeight.SemiBold)
                            }

                            Spacer(modifier = Modifier.width(14.dp))

                            Button(
                                onClick = { goToNext() },
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier.weight(0.58f)
                            ) {
                                Text(
                                    text = if (currentIndex == totalCards - 1) "Complete Topic ✓" else "Next",
                                    fontWeight = FontWeight.Bold
                                )
                                if (currentIndex < totalCards - 1) {
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                                        contentDescription = "Next",
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 20.dp, vertical = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            if (isCompletedState) {
                // Topic Complete Screen
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    shape = RoundedCornerShape(24.dp),
                    color = MaterialTheme.colorScheme.surface,
                    border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)),
                    tonalElevation = 4.dp
                ) {
                    Column(
                        modifier = Modifier
                            .padding(28.dp)
                            .fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = Color(0xFF10B981).copy(alpha = 0.15f),
                            modifier = Modifier.size(72.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.CheckCircle,
                                    contentDescription = null,
                                    tint = Color(0xFF10B981),
                                    modifier = Modifier.size(44.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = "Topic Complete",
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface,
                            textAlign = TextAlign.Center
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = "You've reached the end of ${pack.topicName}.\nAll $totalCards cards explored.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center,
                            lineHeight = 22.sp
                        )

                        Spacer(modifier = Modifier.height(28.dp))

                        Button(
                            onClick = onClose,
                            shape = RoundedCornerShape(14.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = null,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Back to Topics", fontWeight = FontWeight.Bold)
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        TextButton(
                            onClick = {
                                isCompletedState = false
                                currentIndex = 0
                                viewModel.setLearningCardIndex(0)
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Refresh,
                                contentDescription = null,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("Review Cards Again", color = MaterialTheme.colorScheme.primary)
                        }
                    }
                }
            } else {
                // Main Flashcard Screen with Card Position Header & Clean Card
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // Position Indicator (e.g. 1 / 18)
                    Text(
                        text = "${currentIndex + 1} / $totalCards",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        letterSpacing = 1.sp
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    // Primary Flashcard Container
                    val accentBorder = when (currentIndex % 4) {
                        0 -> Color(0xFF10B981) // Emerald
                        1 -> Color(0xFF8B5CF6) // Violet
                        2 -> Color(0xFF0284C7) // Sky Blue
                        else -> Color(0xFFF59E0B) // Amber
                    }

                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        shape = RoundedCornerShape(22.dp),
                        color = MaterialTheme.colorScheme.surface,
                        border = androidx.compose.foundation.BorderStroke(1.dp, accentBorder.copy(alpha = 0.35f)),
                        tonalElevation = 3.dp
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(24.dp)
                        ) {
                            // Badge Header
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                CardTypeBadge(cardType = currentCard.cardType)
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            // Card Title
                            Text(
                                text = currentCard.title,
                                style = MaterialTheme.typography.titleLarge,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.onSurface
                            )

                            if (!currentCard.subtitle.isNullOrBlank()) {
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = currentCard.subtitle!!,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Medium
                                )
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            // Core Content (Concise 2-4 sentences / explanation)
                            Text(
                                text = currentCard.content,
                                style = MaterialTheme.typography.bodyLarge,
                                color = MaterialTheme.colorScheme.onSurface,
                                lineHeight = 26.sp
                            )

                            // Diagram Viewer if present
                            if (currentCard.diagramId != null || currentCard.cardType == LearningCardType.DIAGRAM) {
                                val dId = currentCard.diagramId ?: "cell_organelles_overview"
                                Spacer(modifier = Modifier.height(16.dp))
                                LearningDiagramViewer(diagramId = dId)
                            }

                            // Formula Block if present
                            if (!currentCard.formula.isNullOrBlank()) {
                                Spacer(modifier = Modifier.height(16.dp))
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = Color(0xFF1E293B),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Column(modifier = Modifier.padding(16.dp)) {
                                        Text(
                                            text = currentCard.formula!!,
                                            fontFamily = FontFamily.Monospace,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 17.sp,
                                            color = Color(0xFF38BDF8),
                                            textAlign = TextAlign.Center,
                                            modifier = Modifier.fillMaxWidth()
                                        )
                                        if (currentCard.formulaVariables.isNotEmpty()) {
                                            Spacer(modifier = Modifier.height(10.dp))
                                            currentCard.formulaVariables.forEach { (sym, desc) ->
                                                Text(
                                                    text = "$sym = $desc",
                                                    style = MaterialTheme.typography.bodySmall,
                                                    color = Color(0xFFCBD5E1)
                                                )
                                            }
                                        }
                                    }
                                }
                            }

                            // Comparison Block if present
                            if (currentCard.comparisonPairs.isNotEmpty()) {
                                Spacer(modifier = Modifier.height(16.dp))
                                val leftHeader = currentCard.comparisonLeftTitle ?: "Category A"
                                val rightHeader = currentCard.comparisonRightTitle ?: "Category B"
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Column(
                                        modifier = Modifier.padding(14.dp),
                                        verticalArrangement = Arrangement.spacedBy(8.dp)
                                    ) {
                                        Row(modifier = Modifier.fillMaxWidth()) {
                                            Text(
                                                text = leftHeader,
                                                style = MaterialTheme.typography.labelMedium,
                                                fontWeight = FontWeight.Bold,
                                                color = MaterialTheme.colorScheme.primary,
                                                modifier = Modifier.weight(1f)
                                            )
                                            Text(
                                                text = rightHeader,
                                                style = MaterialTheme.typography.labelMedium,
                                                fontWeight = FontWeight.Bold,
                                                color = MaterialTheme.colorScheme.secondary,
                                                modifier = Modifier.weight(1f)
                                            )
                                        }
                                        HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant)
                                        currentCard.comparisonPairs.forEach { (left, right) ->
                                            Row(modifier = Modifier.fillMaxWidth()) {
                                                Text(
                                                    text = "• $left",
                                                    style = MaterialTheme.typography.bodySmall,
                                                    color = MaterialTheme.colorScheme.onSurface,
                                                    modifier = Modifier.weight(1f)
                                                )
                                                Text(
                                                    text = "• $right",
                                                    style = MaterialTheme.typography.bodySmall,
                                                    color = MaterialTheme.colorScheme.onSurface,
                                                    modifier = Modifier.weight(1f)
                                                )
                                            }
                                        }
                                    }
                                }
                            }

                            // Process Steps if present
                            if (currentCard.processSteps.isNotEmpty()) {
                                Spacer(modifier = Modifier.height(16.dp))
                                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                                    currentCard.processSteps.forEachIndexed { sIdx, (stepLabel, stepDesc) ->
                                        Surface(
                                            shape = RoundedCornerShape(10.dp),
                                            color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Row(
                                                modifier = Modifier.padding(10.dp),
                                                verticalAlignment = Alignment.CenterVertically
                                            ) {
                                                Surface(
                                                    shape = CircleShape,
                                                    color = MaterialTheme.colorScheme.primary,
                                                    modifier = Modifier.size(24.dp)
                                                ) {
                                                    Box(contentAlignment = Alignment.Center) {
                                                        Text(
                                                            text = "${sIdx + 1}",
                                                            color = Color.White,
                                                            fontSize = 12.sp,
                                                            fontWeight = FontWeight.Bold
                                                        )
                                                    }
                                                }
                                                Spacer(modifier = Modifier.width(10.dp))
                                                Column {
                                                    Text(text = stepLabel, style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold)
                                                    Text(text = stepDesc, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            // Bullet Points if present
                            if (currentCard.bulletPoints.isNotEmpty()) {
                                Spacer(modifier = Modifier.height(16.dp))
                                Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                                    currentCard.bulletPoints.forEach { point ->
                                        Row(modifier = Modifier.fillMaxWidth()) {
                                            Text(
                                                text = "•",
                                                style = MaterialTheme.typography.bodyMedium,
                                                fontWeight = FontWeight.Bold,
                                                color = MaterialTheme.colorScheme.primary
                                            )
                                            Spacer(modifier = Modifier.width(8.dp))
                                            Text(
                                                text = point,
                                                style = MaterialTheme.typography.bodyMedium,
                                                color = MaterialTheme.colorScheme.onSurface
                                            )
                                        }
                                    }
                                }
                            }

                            // Key Takeaway if present
                            if (!currentCard.keyTakeaway.isNullOrBlank()) {
                                Spacer(modifier = Modifier.height(16.dp))
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.35f),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Row(
                                        modifier = Modifier.padding(12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Lightbulb,
                                            contentDescription = null,
                                            tint = MaterialTheme.colorScheme.primary,
                                            modifier = Modifier.size(20.dp)
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Column {
                                            Text(
                                                text = "KEY TAKEAWAY",
                                                style = MaterialTheme.typography.labelSmall,
                                                fontWeight = FontWeight.Bold,
                                                color = MaterialTheme.colorScheme.primary
                                            )
                                            Text(
                                                text = currentCard.keyTakeaway!!,
                                                style = MaterialTheme.typography.bodySmall,
                                                fontWeight = FontWeight.Medium,
                                                color = MaterialTheme.colorScheme.onSurface
                                            )
                                        }
                                    }
                                }
                            }

                            // Exam Tip if present
                            if (!currentCard.examTip.isNullOrBlank()) {
                                Spacer(modifier = Modifier.height(12.dp))
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = Color(0xFFFEF3C7).copy(alpha = 0.25f),
                                    border = androidx.compose.foundation.BorderStroke(1.dp, Color(0xFFF59E0B).copy(alpha = 0.5f)),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Row(
                                        modifier = Modifier.padding(12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Bolt,
                                            contentDescription = null,
                                            tint = Color(0xFFF59E0B),
                                            modifier = Modifier.size(20.dp)
                                        )
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Column {
                                            Text(
                                                text = "EXAM TIP",
                                                style = MaterialTheme.typography.labelSmall,
                                                fontWeight = FontWeight.Bold,
                                                color = Color(0xFFF59E0B)
                                            )
                                            Text(
                                                text = currentCard.examTip!!,
                                                style = MaterialTheme.typography.bodySmall,
                                                color = MaterialTheme.colorScheme.onSurface
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}

@Composable
fun CardTypeBadge(cardType: LearningCardType) {
    val (label, bg, fg) = when (cardType) {
        LearningCardType.DEFINITION -> Triple("CORE DEFINITION", Color(0xFF10B981).copy(alpha = 0.15f), Color(0xFF059669))
        LearningCardType.DIAGRAM -> Triple("DIAGRAM", Color(0xFF3B82F6).copy(alpha = 0.15f), Color(0xFF2563EB))
        LearningCardType.FORMULA -> Triple("FORMULA", Color(0xFF8B5CF6).copy(alpha = 0.15f), Color(0xFF7C3AED))
        LearningCardType.COMPARISON -> Triple("COMPARISON", Color(0xFF06B6D4).copy(alpha = 0.15f), Color(0xFF0891B2))
        LearningCardType.WORKED_EXAMPLE -> Triple("WORKED EXAMPLE", Color(0xFF6366F1).copy(alpha = 0.15f), Color(0xFF4F46E5))
        LearningCardType.PROCESS -> Triple("PROCESS / STEPS", Color(0xFFF59E0B).copy(alpha = 0.15f), Color(0xFFD97706))
        LearningCardType.TABLE -> Triple("DATA TABLE", Color(0xFF0284C7).copy(alpha = 0.15f), Color(0xFF0369A1))
        LearningCardType.QUESTION_REVEAL -> Triple("CONCEPT CHECK", Color(0xFFEC4899).copy(alpha = 0.15f), Color(0xFFDB2777))
        LearningCardType.EXAMPLE -> Triple("EXAMPLE", Color(0xFF14B8A6).copy(alpha = 0.15f), Color(0xFF0D9488))
        LearningCardType.KEY_TAKEAWAYS -> Triple("QUICK RECAP", Color(0xFF10B981).copy(alpha = 0.15f), Color(0xFF059669))
        LearningCardType.EXAM_TIP -> Triple("EXAM TIP", Color(0xFFF59E0B).copy(alpha = 0.15f), Color(0xFFD97706))
        LearningCardType.RULES -> Triple("RULES & LAWS", Color(0xFF8B5CF6).copy(alpha = 0.15f), Color(0xFF7C3AED))
        LearningCardType.TEXT -> Triple("CORE CONCEPT", MaterialTheme.colorScheme.primaryContainer, MaterialTheme.colorScheme.primary)
    }

    Surface(
        shape = RoundedCornerShape(8.dp),
        color = bg
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall,
            fontWeight = FontWeight.Bold,
            color = fg,
            letterSpacing = 0.8.sp,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        )
    }
}
