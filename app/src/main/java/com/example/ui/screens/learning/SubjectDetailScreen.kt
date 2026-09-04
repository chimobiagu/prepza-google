package com.example.ui.screens.learning

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.learning.*
import com.example.ui.viewmodel.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubjectDetailScreen(
    subjectName: String,
    viewModel: MainViewModel,
    onBack: () -> Unit,
    onOpenTopic: (LearningPack) -> Unit,
    onStartPractice: ((String) -> Unit)? = null
) {
    val curriculum = remember(subjectName) {
        CurriculumRegistry.getCurriculum(subjectName) ?: SubjectCurriculum(
            subjectName = subjectName,
            category = "Sciences",
            iconName = "menu_book",
            groups = emptyList()
        )
    }

    val topicProgressList by viewModel.allTopicProgress.collectAsState()
    val progressMap = remember(topicProgressList, subjectName) {
        topicProgressList.filter { it.subject.equals(subjectName, ignoreCase = true) }
            .associateBy { it.topicName.lowercase() }
    }

    var searchQuery by remember { mutableStateOf("") }

    val totalTopics = curriculum.totalTopicsCount
    val learnedCount = curriculum.allTopics.count {
        val p = progressMap[it.topicName.lowercase()]
        p?.isLearningCompleted == true || p?.masteryState == "LEARNED" || p?.masteryState == "STRONG"
    }

    val filteredGroups = remember(curriculum, searchQuery) {
        if (searchQuery.isBlank()) {
            curriculum.groups
        } else {
            curriculum.groups.mapNotNull { group ->
                val matchingTopics = group.topics.filter {
                    it.topicName.contains(searchQuery, ignoreCase = true) ||
                            it.overview.contains(searchQuery, ignoreCase = true)
                }
                if (matchingTopics.isNotEmpty()) group.copy(topics = matchingTopics) else null
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = curriculum.subjectName,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1
                        )
                        Text(
                            text = "${curriculum.category} • $learnedCount of $totalTopics topics explored",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Subject Progress Overview Header Card
            item {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.5f),
                    tonalElevation = 2.dp
                ) {
                    Column(
                        modifier = Modifier.padding(18.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "Syllabus Mastery",
                                    style = MaterialTheme.typography.labelMedium,
                                    color = MaterialTheme.colorScheme.primary,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = if (learnedCount == 0) "Begin your learning journey" else "$learnedCount completed of $totalTopics topics",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.SemiBold,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            }
                            Surface(
                                shape = CircleShape,
                                color = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.size(44.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    val percent = if (totalTopics > 0) (learnedCount * 100 / totalTopics) else 0
                                    Text(
                                        text = "$percent%",
                                        style = MaterialTheme.typography.labelSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.onPrimary
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        val progressRatio = if (totalTopics > 0) (learnedCount.toFloat() / totalTopics) else 0f
                        LinearProgressIndicator(
                            progress = { progressRatio },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(8.dp)
                                .clip(CircleShape),
                            color = MaterialTheme.colorScheme.primary,
                            trackColor = MaterialTheme.colorScheme.surfaceVariant
                        )
                    }
                }
            }

            // Search Topic Bar
            item {
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    placeholder = { Text("Search topics in ${curriculum.subjectName}...", fontSize = 14.sp) },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    },
                    trailingIcon = {
                        if (searchQuery.isNotEmpty()) {
                            IconButton(onClick = { searchQuery = "" }) {
                                Icon(
                                    imageVector = Icons.Default.Clear,
                                    contentDescription = "Clear search"
                                )
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = MaterialTheme.colorScheme.surface,
                        unfocusedContainerColor = MaterialTheme.colorScheme.surface
                    )
                )
            }

            // Topic Groups & Topic Cards
            if (filteredGroups.isEmpty()) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 40.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "No topics found matching \"$searchQuery\"",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            } else {
                filteredGroups.forEach { group ->
                    item {
                        Column(modifier = Modifier.padding(top = 8.dp)) {
                            Text(
                                text = group.groupName.uppercase(),
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.primary,
                                fontWeight = FontWeight.Bold,
                                letterSpacing = 1.sp
                            )
                            if (group.description.isNotBlank()) {
                                Text(
                                    text = group.description,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }

                    items(group.topics) { pack ->
                        val progress = progressMap[pack.topicName.lowercase()]
                        val state = when {
                            progress?.masteryState == "STRONG" -> TopicMasteryState.STRONG
                            progress?.masteryState == "NEEDS_PRACTICE" -> TopicMasteryState.NEEDS_PRACTICE
                            progress?.isLearningCompleted == true || progress?.masteryState == "LEARNED" -> TopicMasteryState.LEARNED
                            progress != null && progress.currentCardIndex > 0 -> TopicMasteryState.IN_PROGRESS
                            else -> TopicMasteryState.NOT_STARTED
                        }

                        SubjectTopicCard(
                            pack = pack,
                            masteryState = state,
                            currentCardIndex = progress?.currentCardIndex ?: 0,
                            onClick = { onOpenTopic(pack) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SubjectTopicCard(
    pack: LearningPack,
    masteryState: TopicMasteryState,
    currentCardIndex: Int,
    onClick: () -> Unit
) {
    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 1.dp,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Status Icon Indicator
            Box(
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
                    .background(
                        when (masteryState) {
                            TopicMasteryState.STRONG -> Color(0xFF10B981).copy(alpha = 0.15f)
                            TopicMasteryState.LEARNED -> MaterialTheme.colorScheme.primary.copy(alpha = 0.15f)
                            TopicMasteryState.IN_PROGRESS -> Color(0xFFF59E0B).copy(alpha = 0.15f)
                            TopicMasteryState.NEEDS_PRACTICE -> Color(0xFFEF4444).copy(alpha = 0.15f)
                            TopicMasteryState.NOT_STARTED -> MaterialTheme.colorScheme.surfaceVariant
                        }
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = masteryState.iconSymbol,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = when (masteryState) {
                        TopicMasteryState.STRONG -> Color(0xFF10B981)
                        TopicMasteryState.LEARNED -> MaterialTheme.colorScheme.primary
                        TopicMasteryState.IN_PROGRESS -> Color(0xFFF59E0B)
                        TopicMasteryState.NEEDS_PRACTICE -> Color(0xFFEF4444)
                        TopicMasteryState.NOT_STARTED -> MaterialTheme.colorScheme.onSurfaceVariant
                    }
                )
            }

            Spacer(modifier = Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = pack.topicName,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = pack.overview,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "${pack.cards.size} cards • ~${pack.estimatedMinutes} min",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.primary
                    )
                    if (masteryState == TopicMasteryState.IN_PROGRESS && currentCardIndex > 0) {
                        Text(
                            text = " • At card ${currentCardIndex + 1}/${pack.cards.size}",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFFF59E0B),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            Icon(
                imageVector = Icons.Outlined.ChevronRight,
                contentDescription = "Open Topic",
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
