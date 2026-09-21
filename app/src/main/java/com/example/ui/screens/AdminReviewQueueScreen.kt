package com.example.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.data.db.FlaggedQuestionEntity
import com.example.data.db.QuestionEntity
import com.example.ui.components.FormattedText
import com.example.ui.theme.*
import java.text.SimpleDateFormat
import java.util.*

enum class ReviewFilter(val label: String) {
    PENDING("Pending Review"),
    RESOLVED("Resolved & Auto-Fixed"),
    ALL("All Submissions")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminReviewQueueScreen(
    flaggedList: List<FlaggedQuestionEntity>,
    pendingCount: Int,
    onResolveFlag: (flagId: String, action: String, editedQuestion: QuestionEntity?) -> Unit,
    onRejectFlag: (flagId: String) -> Unit,
    onDeleteFlag: (flagId: String) -> Unit,
    onBack: () -> Unit
) {
    var selectedFilter by remember { mutableStateOf(ReviewFilter.PENDING) }
    var selectedSubject by remember { mutableStateOf("All Subjects") }
    var searchQuery by remember { mutableStateOf("") }
    var editingFlag by remember { mutableStateOf<FlaggedQuestionEntity?>(null) }

    val allSubjects = remember(flaggedList) {
        listOf("All Subjects") + flaggedList.map { it.subject }.distinct().sorted()
    }

    val filteredList = remember(flaggedList, selectedFilter, selectedSubject, searchQuery) {
        flaggedList.filter { item ->
            val matchesFilter = when (selectedFilter) {
                ReviewFilter.PENDING -> item.status == "PENDING"
                ReviewFilter.RESOLVED -> item.status == "RESOLVED"
                ReviewFilter.ALL -> true
            }
            val matchesSubject = selectedSubject == "All Subjects" || item.subject.equals(selectedSubject, ignoreCase = true)
            val matchesQuery = searchQuery.isBlank() ||
                    item.questionText.contains(searchQuery, ignoreCase = true) ||
                    item.reason.contains(searchQuery, ignoreCase = true) ||
                    item.userNotes.contains(searchQuery, ignoreCase = true) ||
                    item.topic.contains(searchQuery, ignoreCase = true)
            matchesFilter && matchesSubject && matchesQuery
        }
    }

    // Modal Editor Dialog
    if (editingFlag != null) {
        AdminQuestionEditDialog(
            flag = editingFlag!!,
            onDismiss = { editingFlag = null },
            onSaveAndResolve = { flagId, action, editedQ ->
                onResolveFlag(flagId, action, editedQ)
                editingFlag = null
            }
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "Admin Review Queue",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Question Integrity & Quality Verification",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack, modifier = Modifier.testTag("admin_review_back_btn")) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                },
                actions = {
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = if (pendingCount > 0) WarningAmber.copy(alpha = 0.15f) else PrimaryGreen.copy(alpha = 0.15f),
                        border = BorderStroke(1.dp, if (pendingCount > 0) WarningAmber.copy(alpha = 0.4f) else PrimaryGreen.copy(alpha = 0.4f)),
                        modifier = Modifier.padding(end = 12.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                        ) {
                            Icon(
                                imageVector = if (pendingCount > 0) Icons.Default.PendingActions else Icons.Default.Verified,
                                contentDescription = null,
                                tint = if (pendingCount > 0) WarningAmber else PrimaryGreen,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = if (pendingCount > 0) "$pendingCount Pending" else "All Clean",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = if (pendingCount > 0) WarningAmber else PrimaryGreen
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
        ) {
            // Filter Chips Row
            Surface(
                color = MaterialTheme.colorScheme.surface,
                shadowElevation = 1.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(vertical = 10.dp, horizontal = 16.dp)) {
                    // Search bar
                    OutlinedTextField(
                        value = searchQuery,
                        onValueChange = { searchQuery = it },
                        placeholder = { Text("Search flagged questions...", fontSize = 13.sp) },
                        leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, modifier = Modifier.size(18.dp)) },
                        trailingIcon = {
                            if (searchQuery.isNotBlank()) {
                                IconButton(onClick = { searchQuery = "" }) {
                                    Icon(Icons.Default.Clear, contentDescription = "Clear", modifier = Modifier.size(16.dp))
                                }
                            }
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .testTag("admin_search_input"),
                        shape = RoundedCornerShape(10.dp),
                        singleLine = true,
                        textStyle = MaterialTheme.typography.bodySmall
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    // Status Filters
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        ReviewFilter.values().forEach { filter ->
                            val isSelected = selectedFilter == filter
                            FilterChip(
                                selected = isSelected,
                                onClick = { selectedFilter = filter },
                                label = {
                                    Text(
                                        text = filter.label,
                                        fontSize = 12.sp,
                                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                                    )
                                },
                                leadingIcon = if (isSelected) {
                                    {
                                        Icon(
                                            imageVector = Icons.Default.Check,
                                            contentDescription = null,
                                            modifier = Modifier.size(14.dp)
                                        )
                                    }
                                } else null
                            )
                        }
                    }

                    // Subject Chips
                    if (allSubjects.size > 2) {
                        Spacer(modifier = Modifier.height(6.dp))
                        LazyRow(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                            items(allSubjects) { subj ->
                                val isSelected = selectedSubject == subj
                                SuggestionChip(
                                    onClick = { selectedSubject = subj },
                                    label = { Text(subj, fontSize = 11.sp, fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal) },
                                    colors = SuggestionChipDefaults.suggestionChipColors(
                                        containerColor = if (isSelected) PrimaryGreen.copy(alpha = 0.15f) else Color.Transparent
                                    ),
                                    border = BorderStroke(1.dp, if (isSelected) PrimaryGreen else MaterialTheme.colorScheme.outline.copy(alpha = 0.3f))
                                )
                            }
                        }
                    }
                }
            }

            // Results List
            if (filteredList.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Surface(
                            shape = CircleShape,
                            color = SoftEmeraldBg,
                            modifier = Modifier.size(64.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.VerifiedUser,
                                    contentDescription = null,
                                    tint = PrimaryGreen,
                                    modifier = Modifier.size(32.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = if (selectedFilter == ReviewFilter.PENDING) "Review Queue is Clean" else "No matching items",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(
                            text = "Every question in Prepza strictly complies with syllabus authenticity, diagram clarity, and answer key accuracy.",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                            modifier = Modifier.padding(horizontal = 24.dp)
                        )
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    items(filteredList, key = { it.id }) { item ->
                        FlaggedQuestionCard(
                            flag = item,
                            onEdit = { editingFlag = item },
                            onReject = { onRejectFlag(item.id) },
                            onDelete = { onDeleteFlag(item.id) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun FlaggedQuestionCard(
    flag: FlaggedQuestionEntity,
    onEdit: () -> Unit,
    onReject: () -> Unit,
    onDelete: () -> Unit
) {
    val dateStr = remember(flag.timestamp) {
        val sdf = SimpleDateFormat("MMM d, yyyy • h:mm a", Locale.getDefault())
        sdf.format(Date(flag.timestamp))
    }

    val statusColor = when (flag.status) {
        "RESOLVED" -> PrimaryGreen
        "REJECTED" -> TextMuted
        else -> WarningAmber
    }

    val statusBg = when (flag.status) {
        "RESOLVED" -> SoftEmeraldBg
        "REJECTED" -> AppBackground
        else -> WarningAmberBg
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .testTag("flagged_card_${flag.id}"),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Header Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = MaterialTheme.colorScheme.primaryContainer
                    ) {
                        Text(
                            text = flag.subject,
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                        )
                    }

                    if (flag.year.isNotBlank()) {
                        Surface(
                            shape = RoundedCornerShape(6.dp),
                            color = AppBackground,
                            border = BorderStroke(1.dp, BorderSubtle)
                        ) {
                            Text(
                                text = "JAMB ${flag.year}",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    }
                }

                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = statusBg,
                    border = BorderStroke(1.dp, statusColor.copy(alpha = 0.4f))
                ) {
                    Text(
                        text = flag.status,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = statusColor,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Reason Badge & Notes
            Surface(
                shape = RoundedCornerShape(8.dp),
                color = WarningAmberBg.copy(alpha = 0.5f),
                border = BorderStroke(1.dp, WarningAmber.copy(alpha = 0.3f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(10.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Icon(
                        imageVector = Icons.Default.Flag,
                        contentDescription = null,
                        tint = WarningAmber,
                        modifier = Modifier
                            .size(16.dp)
                            .padding(top = 2.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Column {
                        Text(
                            text = "Flag Reason: ${flag.reason}",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        if (flag.userNotes.isNotBlank()) {
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "Notes: \"${flag.userNotes}\"",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary,
                                fontSize = 12.sp
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Question Stem Snippet
            Text(
                text = "Question #${flag.questionId.take(8)}:",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            FormattedText(
                text = flag.questionText,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurface,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis,
                isQuestionStem = true
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Options summary
            val letters = listOf("A", "B", "C", "D")
            val opts = listOf(flag.optionA, flag.optionB, flag.optionC, flag.optionD)
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                opts.forEachIndexed { idx, opt ->
                    val isCorrect = idx == flag.correctAnswerIndex
                    Surface(
                        shape = RoundedCornerShape(6.dp),
                        color = if (isCorrect) SoftEmeraldBg else MaterialTheme.colorScheme.surfaceVariant,
                        border = if (isCorrect) BorderStroke(1.dp, PrimaryGreen) else null,
                        modifier = Modifier.weight(1f)
                    ) {
                        Column(modifier = Modifier.padding(6.dp)) {
                            Text(
                                text = letters[idx] + if (isCorrect) " (Key)" else "",
                                fontWeight = if (isCorrect) FontWeight.Bold else FontWeight.Medium,
                                fontSize = 10.sp,
                                color = if (isCorrect) PrimaryGreenDark else MaterialTheme.colorScheme.onSurfaceVariant
                            )
                            Text(
                                text = opt.take(20),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                fontSize = 11.sp,
                                color = if (isCorrect) PrimaryGreenDark else MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                }
            }

            if (flag.resolutionAction != null) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Resolution: ${flag.resolutionAction}",
                    style = MaterialTheme.typography.labelSmall,
                    color = PrimaryGreenDark,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Timestamp and Actions
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = dateStr,
                    style = MaterialTheme.typography.labelSmall,
                    color = TextMuted,
                    fontSize = 11.sp
                )

                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    if (flag.status == "PENDING") {
                        OutlinedButton(
                            onClick = onReject,
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 6.dp),
                            modifier = Modifier.height(34.dp)
                        ) {
                            Text("Reject Flag", fontSize = 12.sp)
                        }

                        Button(
                            onClick = onEdit,
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                            modifier = Modifier.height(34.dp)
                        ) {
                            Icon(Icons.Default.Edit, contentDescription = null, modifier = Modifier.size(14.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Review & Edit", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        }
                    } else {
                        IconButton(
                            onClick = onDelete,
                            modifier = Modifier.size(34.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.DeleteOutline,
                                contentDescription = "Delete Record",
                                tint = IncorrectRed,
                                modifier = Modifier.size(18.dp)
                            )
                        }

                        OutlinedButton(
                            onClick = onEdit,
                            shape = RoundedCornerShape(8.dp),
                            contentPadding = PaddingValues(horizontal = 10.dp, vertical = 6.dp),
                            modifier = Modifier.height(34.dp)
                        ) {
                            Text("Re-Edit", fontSize = 12.sp)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun AdminQuestionEditDialog(
    flag: FlaggedQuestionEntity,
    onDismiss: () -> Unit,
    onSaveAndResolve: (flagId: String, action: String, editedQuestion: QuestionEntity) -> Unit
) {
    var questionText by remember { mutableStateOf(flag.questionText) }
    var optionA by remember { mutableStateOf(flag.optionA) }
    var optionB by remember { mutableStateOf(flag.optionB) }
    var optionC by remember { mutableStateOf(flag.optionC) }
    var optionD by remember { mutableStateOf(flag.optionD) }
    var correctIndex by remember { mutableStateOf(flag.correctAnswerIndex) }
    var explanation by remember { mutableStateOf(flag.explanation) }
    var year by remember { mutableStateOf(flag.year) }
    var topic by remember { mutableStateOf(flag.topic) }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .fillMaxHeight(0.9f),
            shape = RoundedCornerShape(20.dp),
            color = MaterialTheme.colorScheme.surface
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                // Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Edit & Verify Question",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "${flag.subject} • Flag: ${flag.reason}",
                            style = MaterialTheme.typography.labelSmall,
                            color = PrimaryGreen
                        )
                    }
                    IconButton(onClick = onDismiss) {
                        Icon(Icons.Default.Close, contentDescription = "Close")
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    // Stem
                    Text("Question Stem", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                    OutlinedTextField(
                        value = questionText,
                        onValueChange = { questionText = it },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 3,
                        maxLines = 6,
                        shape = RoundedCornerShape(10.dp)
                    )

                    // Correct Answer Selector
                    Text("Correct Answer Key", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listOf("Option A" to 0, "Option B" to 1, "Option C" to 2, "Option D" to 3).forEach { (label, idx) ->
                            val isSelected = correctIndex == idx
                            FilterChip(
                                selected = isSelected,
                                onClick = { correctIndex = idx },
                                label = { Text(label, fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal) },
                                modifier = Modifier.weight(1f),
                                leadingIcon = if (isSelected) {
                                    { Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(14.dp)) }
                                } else null
                            )
                        }
                    }

                    // Options A-D
                    OutlinedTextField(
                        value = optionA,
                        onValueChange = { optionA = it },
                        label = { Text("Option A" + if (correctIndex == 0) " (Correct)" else "") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )
                    OutlinedTextField(
                        value = optionB,
                        onValueChange = { optionB = it },
                        label = { Text("Option B" + if (correctIndex == 1) " (Correct)" else "") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )
                    OutlinedTextField(
                        value = optionC,
                        onValueChange = { optionC = it },
                        label = { Text("Option C" + if (correctIndex == 2) " (Correct)" else "") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )
                    OutlinedTextField(
                        value = optionD,
                        onValueChange = { optionD = it },
                        label = { Text("Option D" + if (correctIndex == 3) " (Correct)" else "") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )

                    // Explanation
                    Text("Pedagogical Explanation", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                    OutlinedTextField(
                        value = explanation,
                        onValueChange = { explanation = it },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 3,
                        maxLines = 8,
                        shape = RoundedCornerShape(10.dp)
                    )

                    // Metadata
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        OutlinedTextField(
                            value = topic,
                            onValueChange = { topic = it },
                            label = { Text("Topic") },
                            modifier = Modifier.weight(1.5f),
                            shape = RoundedCornerShape(10.dp)
                        )
                        OutlinedTextField(
                            value = year,
                            onValueChange = { year = it },
                            label = { Text("Year (e.g. 2024)") },
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(10.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Footer Actions
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    OutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text("Cancel")
                    }

                    Button(
                        onClick = {
                            val updatedEntity = QuestionEntity(
                                id = flag.questionId,
                                subject = flag.subject,
                                topic = topic.trim(),
                                year = year.trim(),
                                questionText = questionText.trim(),
                                optionA = optionA.trim(),
                                optionB = optionB.trim(),
                                optionC = optionC.trim(),
                                optionD = optionD.trim(),
                                correctAnswerIndex = correctIndex,
                                explanation = explanation.trim(),
                                originType = "JAMB_ORIGINAL",
                                originLabel = "Admin Verified • JAMB Standards",
                                isVerifiedJamb = true
                            )
                            onSaveAndResolve(flag.id, "FIXED_IN_DB", updatedEntity)
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                        modifier = Modifier.weight(1.5f),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Save & Resolve Flag", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
