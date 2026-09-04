package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.ui.theme.*

private data class SubjectEntry(
    val name: String,
    val icon: ImageVector,
    val category: String,
    val isCompulsory: Boolean = false
)

@Composable
fun CbtSubjectSelectionDialog(
    initialSubjects: List<String> = listOf("English Language", "Mathematics", "Physics", "Chemistry"),
    onStartExam: (selectedSubjects: List<String>) -> Unit,
    onDismiss: () -> Unit
) {
    val compulsorySubject = "English Language"

    val allSubjects = remember {
        listOf(
            SubjectEntry("English Language", Icons.Outlined.Translate, "Languages", isCompulsory = true),
            SubjectEntry("Mathematics", Icons.Outlined.Calculate, "Sciences"),
            SubjectEntry("Physics", Icons.Outlined.Bolt, "Sciences"),
            SubjectEntry("Chemistry", Icons.Outlined.Science, "Sciences"),
            SubjectEntry("Biology", Icons.Outlined.Eco, "Sciences"),
            SubjectEntry("Economics", Icons.Outlined.TrendingUp, "Commercial"),
            SubjectEntry("Government", Icons.Outlined.AccountBalance, "Arts"),
            SubjectEntry("Literature in English", Icons.Outlined.AutoStories, "Arts"),
            SubjectEntry("Commerce", Icons.Outlined.Storefront, "Commercial"),
            SubjectEntry("CRS", Icons.Outlined.Bookmark, "Arts"),
            SubjectEntry("Principles of Accounts", Icons.Outlined.ReceiptLong, "Commercial"),
            SubjectEntry("Geography", Icons.Outlined.Public, "Arts"),
            SubjectEntry("History", Icons.Outlined.HistoryEdu, "Arts"),
            SubjectEntry("Islamic Religious Studies (IRS)", Icons.Outlined.Mosque, "Arts")
        )
    }

    // Default 3 electives from initial subjects
    val initialElectives = remember(initialSubjects) {
        val nonEnglish = initialSubjects.filter { !it.equals(compulsorySubject, ignoreCase = true) }
        if (nonEnglish.size >= 3) nonEnglish.take(3) else listOf("Mathematics", "Physics", "Chemistry")
    }

    var selectedElectives by remember { mutableStateOf(initialElectives.toSet()) }
    val totalSelectedCount = 1 + selectedElectives.size
    val isComplete = selectedElectives.size == 3

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .fillMaxHeight(0.88f)
                .clip(RoundedCornerShape(24.dp))
                .testTag("cbt_subject_selection_dialog"),
            color = AppBackground,
            shape = RoundedCornerShape(24.dp)
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
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Select 4 CBT Subjects",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "English Language + 3 other subjects",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }

                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = if (isComplete) SoftEmeraldBg else SoftAmberBg,
                        modifier = Modifier.padding(end = 8.dp)
                    ) {
                        Text(
                            text = "$totalSelectedCount / 4",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = if (isComplete) PrimaryGreen else AmberAccent,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                        )
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(BorderSubtle)
                    ) {
                        Icon(
                            Icons.Default.Close,
                            contentDescription = "Close",
                            tint = TextPrimary,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Scrollable Subject List
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    allSubjects.forEach { subject ->
                        val isSelected = if (subject.isCompulsory) true else selectedElectives.contains(subject.name)
                        val canSelect = isSelected || selectedElectives.size < 3

                        Surface(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(14.dp))
                                .clickable {
                                    if (!subject.isCompulsory) {
                                        val newSet = selectedElectives.toMutableSet()
                                        if (isSelected) {
                                            newSet.remove(subject.name)
                                        } else if (canSelect) {
                                            newSet.add(subject.name)
                                        }
                                        selectedElectives = newSet
                                    }
                                }
                                .testTag("subject_select_${subject.name.lowercase().replace(' ', '_')}"),
                            shape = RoundedCornerShape(14.dp),
                            color = if (isSelected) SurfaceWhite else SurfaceWhite.copy(alpha = 0.7f),
                            border = androidx.compose.foundation.BorderStroke(
                                width = if (isSelected) 1.5.dp else 1.dp,
                                color = if (isSelected) PrimaryGreen else BorderSubtle
                            )
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Surface(
                                        shape = CircleShape,
                                        color = if (isSelected) SoftEmeraldBg else AppBackground,
                                        modifier = Modifier.size(38.dp)
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(
                                                imageVector = subject.icon,
                                                contentDescription = null,
                                                tint = if (isSelected) PrimaryGreen else TextSecondary,
                                                modifier = Modifier.size(20.dp)
                                            )
                                        }
                                    }

                                    Spacer(modifier = Modifier.width(12.dp))

                                    Column {
                                        Text(
                                            text = subject.name,
                                            style = MaterialTheme.typography.titleMedium,
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                            color = TextPrimary
                                        )
                                        Text(
                                            text = if (subject.isCompulsory) "Compulsory for all candidates" else subject.category,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = if (subject.isCompulsory) PrimaryGreen else TextSecondary
                                        )
                                    }
                                }

                                Surface(
                                    shape = CircleShape,
                                    color = if (isSelected) PrimaryGreen else Color.Transparent,
                                    border = if (!isSelected) androidx.compose.foundation.BorderStroke(1.5.dp, BorderSubtle) else null,
                                    modifier = Modifier.size(24.dp)
                                ) {
                                    if (isSelected) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(
                                                imageVector = Icons.Default.Check,
                                                contentDescription = "Selected",
                                                tint = Color.White,
                                                modifier = Modifier.size(15.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Bottom Start Button
                Button(
                    onClick = {
                        val full4List = mutableListOf(compulsorySubject)
                        full4List.addAll(selectedElectives)
                        onStartExam(full4List)
                    },
                    enabled = isComplete,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .testTag("confirm_start_cbt_exam_btn"),
                    shape = RoundedCornerShape(14.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = PrimaryGreen,
                        disabledContainerColor = BorderSubtle,
                        disabledContentColor = TextSecondary
                    )
                ) {
                    Text(
                        text = if (isComplete) "Start CBT (180 Questions)" else "Select ${3 - selectedElectives.size} more subject${if (3 - selectedElectives.size > 1) "s" else ""}",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = if (isComplete) Color.White else TextSecondary
                    )
                }
            }
        }
    }
}

