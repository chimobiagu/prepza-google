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
    RESOLVED("Reviewed / Resolved"),
    ALL("All Submissions")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminReviewQueueScreen(
    flaggedList: List<FlaggedQuestionEntity>,
    pendingCount: Int,
    onAdminAction: (flagId: String, decision: String, adminNotes: String, editedQuestion: QuestionEntity?) -> Unit,
    onDeleteFlag: (flagId: String) -> Unit,
    onBack: () -> Unit
) {
    var selectedFilter by remember { mutableStateOf(ReviewFilter.PENDING) }
    var selectedSubject by remember { mutableStateOf("All Subjects") }
    var searchQuery by remember { mutableStateOf("") }
    var editingFlag by remember { mutableStateOf<FlaggedQuestionEntity?>(null) }
    var confirmDisableFlag by remember { mutableStateOf<FlaggedQuestionEntity?>(null) }
    var confirmDuplicateFlag by remember { mutableStateOf<FlaggedQuestionEntity?>(null) }
    var confirmApproveFlag by remember { mutableStateOf<FlaggedQuestionEntity?>(null) }

    val allSubjects = remember(flaggedList) {
        listOf("All Subjects") + flaggedList.map { it.subject }.distinct().sorted()
    }

    val filteredList = remember(flaggedList, selectedFilter, selectedSubject, searchQuery) {
        flaggedList.filter { item ->
            val matchesFilter = when (selectedFilter) {
                ReviewFilter.PENDING -> item.status == "PENDING"
                ReviewFilter.RESOLVED -> item.status == "RESOLVED" || item.status == "REVIEWED"
                ReviewFilter.ALL -> true
            }
            val matchesSubject = selectedSubject == "All Subjects" || item.subject.equals(selectedSubject, ignoreCase = true)
            val matchesQuery = searchQuery.isBlank() ||
                    item.questionText.contains(searchQuery, ignoreCase = true) ||
                    item.reason.contains(searchQuery, ignoreCase = true) ||
                    item.userNotes.contains(searchQuery, ignoreCase = true) ||
                    item.topic.contains(searchQuery, ignoreCase = true) ||
                    item.questionId.contains(searchQuery, ignoreCase = true)
            matchesFilter && matchesSubject && matchesQuery
        }
    }

    // Modal Editor Dialog for "CORRECT QUESTION"
    if (editingFlag != null) {
        AdminQuestionEditDialog(
            flag = editingFlag!!,
            onDismiss = { editingFlag = null },
            onSaveAndResolve = { flagId, adminNotes, editedQ ->
                onAdminAction(flagId, "CORRECT_QUESTION", adminNotes, editedQ)
                editingFlag = null
            }
        )
    }

    // Modal Confirm: APPROVE / NO CHANGE
    if (confirmApproveFlag != null) {
        val flag = confirmApproveFlag!!
        AlertDialog(
            onDismissRequest = { confirmApproveFlag = null },
            title = { Text("Approve / No Change", fontWeight = FontWeight.Bold) },
            text = {
                Text("Confirm that Question #${flag.questionId.take(8)} is authentic and accurate. The report will be marked as reviewed without altering the question bank.")
            },
            confirmButton = {
                Button(
                    onClick = {
                        onAdminAction(flag.id, "APPROVE_NO_CHANGE", "Verified authentic and accurate by administrator.", null)
                        confirmApproveFlag = null
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen)
                ) {
                    Text("Confirm Approve")
                }
            },
            dismissButton = {
                TextButton(onClick = { confirmApproveFlag = null }) {
                    Text("Cancel")
                }
            }
        )
    }

    // Modal Confirm: DISABLE QUESTION
    if (confirmDisableFlag != null) {
        val flag = confirmDisableFlag!!
        AlertDialog(
            onDismissRequest = { confirmDisableFlag = null },
            title = { Text("Disable Question?", fontWeight = FontWeight.Bold) },
            text = {
                Text("This will temporarily remove Question #${flag.questionId.take(8)} from future CBT mocks and practice selections. Historical exam records will remain intact.")
            },
            confirmButton = {
                Button(
                    onClick = {
                        onAdminAction(flag.id, "DISABLE_QUESTION", "Disabled by administrator due to defect or syllabus exclusion.", null)
                        confirmDisableFlag = null
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = IncorrectRed)
                ) {
                    Text("Disable Question")
                }
            },
            dismissButton = {
                TextButton(onClick = { confirmDisableFlag = null }) {
                    Text("Cancel")
                }
            }
        )
    }

    // Modal Confirm: MARK DUPLICATE
    if (confirmDuplicateFlag != null) {
        val flag = confirmDuplicateFlag!!
        AlertDialog(
            onDismissRequest = { confirmDuplicateFlag = null },
            title = { Text("Mark Question as Duplicate?", fontWeight = FontWeight.Bold) },
            text = {
                Text("Question #${flag.questionId.take(8)} will be marked as a duplicate and removed from future CBT and practice selection.")
            },
            confirmButton = {
                Button(
                    onClick = {
                        onAdminAction(flag.id, "DUPLICATE", "Marked as duplicate by administrator.", null)
                        confirmDuplicateFlag = null
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = WarningAmber)
                ) {
                    Text("Mark Duplicate")
                }
            },
            dismissButton = {
                TextButton(onClick = { confirmDuplicateFlag = null }) {
                    Text("Cancel")
                }
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
                            text = "Question Integrity & Canonical Sync",
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
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        ReviewFilter.values().forEach { filter ->
                            val isSelected = selectedFilter == filter
                            FilterChip(
                                selected = isSelected,
                                onClick = { selectedFilter = filter },
                                label = { Text(filter.label, fontSize = 12.sp) },
                                leadingIcon = if (isSelected) {
                                    { Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(14.dp)) }
                                } else null
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Search and Subject Filter
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = searchQuery,
                            onValueChange = { searchQuery = it },
                            placeholder = { Text("Search question, ID, or reason...", fontSize = 12.sp) },
                            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, modifier = Modifier.size(18.dp)) },
                            modifier = Modifier
                                .weight(1f)
                                .height(48.dp),
                            shape = RoundedCornerShape(10.dp),
                            singleLine = true
                        )

                        if (allSubjects.size > 1) {
                            var expandedSubjectMenu by remember { mutableStateOf(false) }
                            Box {
                                OutlinedButton(
                                    onClick = { expandedSubjectMenu = true },
                                    shape = RoundedCornerShape(10.dp),
                                    modifier = Modifier.height(48.dp)
                                ) {
                                    Text(selectedSubject.take(12), fontSize = 12.sp)
                                    Icon(Icons.Default.ArrowDropDown, contentDescription = null)
                                }
                                DropdownMenu(
                                    expanded = expandedSubjectMenu,
                                    onDismissRequest = { expandedSubjectMenu = false }
                                ) {
                                    allSubjects.forEach { subj ->
                                        DropdownMenuItem(
                                            text = { Text(subj, fontSize = 13.sp) },
                                            onClick = {
                                                selectedSubject = subj
                                                expandedSubjectMenu = false
                                            }
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // Submissions List
            if (filteredList.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.CheckCircleOutline,
                            contentDescription = null,
                            tint = PrimaryGreen,
                            modifier = Modifier.size(54.dp)
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "No questions in this review queue",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Reported questions from students will appear here for verification.",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
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
                        AdminReviewCard(
                            flag = item,
                            onApproveNoChange = { confirmApproveFlag = item },
                            onCorrectQuestion = { editingFlag = item },
                            onDisableQuestion = { confirmDisableFlag = item },
                            onMarkDuplicate = { confirmDuplicateFlag = item },
                            onDelete = { onDeleteFlag(item.id) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun AdminReviewCard(
    flag: FlaggedQuestionEntity,
    onApproveNoChange: () -> Unit,
    onCorrectQuestion: () -> Unit,
    onDisableQuestion: () -> Unit,
    onMarkDuplicate: () -> Unit,
    onDelete: () -> Unit
) {
    val dateStr = remember(flag.timestamp) {
        val sdf = SimpleDateFormat("MMM d, yyyy • h:mm a", Locale.getDefault())
        sdf.format(Date(flag.timestamp))
    }

    val statusColor = when (flag.status) {
        "PENDING" -> WarningAmber
        "REVIEWED" -> PrimaryGreen
        "RESOLVED" -> PrimaryGreenDark
        else -> TextMuted
    }

    val statusBg = when (flag.status) {
        "PENDING" -> WarningAmberBg
        else -> SoftEmeraldBg
    }

    Surface(
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(1.dp, BorderSubtle),
        shadowElevation = 2.dp,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Top Row: Subject & Source & Status Badge
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

                    Text(
                        text = "ID: ${flag.questionId.take(12)}",
                        style = MaterialTheme.typography.labelSmall,
                        color = TextMuted,
                        fontSize = 10.sp
                    )
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

            Spacer(modifier = Modifier.height(8.dp))

            // Source Label
            Text(
                text = "Source: ${flag.questionSource}",
                style = MaterialTheme.typography.labelSmall,
                color = TextSecondary,
                fontSize = 11.sp
            )

            Spacer(modifier = Modifier.height(10.dp))

            // User Complaint Banner
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
                            text = "Reported Issue: ${flag.reason}",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        if (flag.userNotes.isNotBlank()) {
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = "Student note: \"${flag.userNotes}\"",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary,
                                fontSize = 12.sp
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Question Stem Snapshot
            Text(
                text = "Question Stem (Snapshot):",
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
                maxLines = 4,
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
                                text = opt.take(24),
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                fontSize = 11.sp,
                                color = if (isCorrect) PrimaryGreenDark else MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }
                }
            }

            if (flag.explanation.isNotBlank()) {
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Explanation: ${flag.explanation}",
                    style = MaterialTheme.typography.bodySmall,
                    color = TextSecondary,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    fontSize = 11.sp
                )
            }

            // History / Admin Decision
            if (!flag.adminDecision.isNullOrBlank() || !flag.adminNotes.isNullOrBlank()) {
                Spacer(modifier = Modifier.height(8.dp))
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(
                            text = "Admin Decision: ${flag.adminDecision ?: flag.resolutionAction ?: "Reviewed"}",
                            style = MaterialTheme.typography.labelSmall,
                            color = PrimaryGreenDark,
                            fontWeight = FontWeight.Bold
                        )
                        if (!flag.adminNotes.isNullOrBlank()) {
                            Text(
                                text = "Admin Notes: ${flag.adminNotes}",
                                style = MaterialTheme.typography.bodySmall,
                                fontSize = 11.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Timestamp and 4 Admin Actions
            Column(modifier = Modifier.fillMaxWidth()) {
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

                    if (flag.status != "PENDING") {
                        IconButton(
                            onClick = onDelete,
                            modifier = Modifier.size(32.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.DeleteOutline,
                                contentDescription = "Delete Record",
                                tint = IncorrectRed,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))

                // The 4 Specific Admin Actions:
                // 1. APPROVE / NO CHANGE
                // 2. CORRECT QUESTION
                // 3. DISABLE QUESTION
                // 4. DUPLICATE
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    // Approve / No Change
                    OutlinedButton(
                        onClick = onApproveNoChange,
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 6.dp),
                        modifier = Modifier
                            .weight(1f)
                            .height(36.dp)
                    ) {
                        Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(13.dp))
                        Spacer(modifier = Modifier.width(3.dp))
                        Text("Approve", fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
                    }

                    // Correct Question
                    Button(
                        onClick = onCorrectQuestion,
                        colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 6.dp),
                        modifier = Modifier
                            .weight(1.1f)
                            .height(36.dp)
                    ) {
                        Icon(Icons.Default.Edit, contentDescription = null, modifier = Modifier.size(13.dp))
                        Spacer(modifier = Modifier.width(3.dp))
                        Text("Correct Q", fontSize = 11.sp, fontWeight = FontWeight.Bold)
                    }

                    // Disable Question
                    OutlinedButton(
                        onClick = onDisableQuestion,
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = IncorrectRed),
                        border = BorderStroke(1.dp, IncorrectRed.copy(alpha = 0.5f)),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 6.dp),
                        modifier = Modifier
                            .weight(1f)
                            .height(36.dp)
                    ) {
                        Icon(Icons.Default.Block, contentDescription = null, modifier = Modifier.size(13.dp))
                        Spacer(modifier = Modifier.width(3.dp))
                        Text("Disable", fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
                    }

                    // Duplicate
                    OutlinedButton(
                        onClick = onMarkDuplicate,
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = WarningAmber),
                        border = BorderStroke(1.dp, WarningAmber.copy(alpha = 0.5f)),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 6.dp),
                        modifier = Modifier
                            .weight(1f)
                            .height(36.dp)
                    ) {
                        Icon(Icons.Default.ContentCopy, contentDescription = null, modifier = Modifier.size(13.dp))
                        Spacer(modifier = Modifier.width(3.dp))
                        Text("Duplicate", fontSize = 11.sp, fontWeight = FontWeight.SemiBold)
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
    onSaveAndResolve: (flagId: String, adminNotes: String, editedQuestion: QuestionEntity) -> Unit
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
    var imageUrl by remember { mutableStateOf("") }
    var adminNotes by remember { mutableStateOf("Corrected following student report.") }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .fillMaxHeight(0.92f),
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
                            text = "Correct Canonical Question",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "${flag.subject} • Q#${flag.questionId.take(8)} • Report: ${flag.reason}",
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
                        label = { Text("Option A" + if (correctIndex == 0) " (Correct Key)" else "") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )
                    OutlinedTextField(
                        value = optionB,
                        onValueChange = { optionB = it },
                        label = { Text("Option B" + if (correctIndex == 1) " (Correct Key)" else "") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )
                    OutlinedTextField(
                        value = optionC,
                        onValueChange = { optionC = it },
                        label = { Text("Option C" + if (correctIndex == 2) " (Correct Key)" else "") },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp)
                    )
                    OutlinedTextField(
                        value = optionD,
                        onValueChange = { optionD = it },
                        label = { Text("Option D" + if (correctIndex == 3) " (Correct Key)" else "") },
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
                        maxLines = 6,
                        shape = RoundedCornerShape(10.dp)
                    )

                    // Image / Diagram Reference
                    OutlinedTextField(
                        value = imageUrl,
                        onValueChange = { imageUrl = it },
                        label = { Text("Image / Diagram URL or Vector Key (optional)") },
                        placeholder = { Text("e.g. physics/circuit_01.png or phy_circuit") },
                        modifier = Modifier.fillMaxWidth(),
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

                    // Admin Notes
                    OutlinedTextField(
                        value = adminNotes,
                        onValueChange = { adminNotes = it },
                        label = { Text("Admin Audit Notes & Justification") },
                        modifier = Modifier.fillMaxWidth(),
                        minLines = 2,
                        shape = RoundedCornerShape(10.dp)
                    )
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
                                originLabel = "Admin Verified • Canonical",
                                isVerifiedJamb = true,
                                imageUrl = imageUrl.trim().ifBlank { null }
                            )
                            onSaveAndResolve(flag.id, adminNotes.trim(), updatedEntity)
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                        modifier = Modifier.weight(1.5f),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Icon(Icons.Default.CloudUpload, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Save & Push Canonical", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    }
}
