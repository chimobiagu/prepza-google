package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Lock
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.ui.theme.*

data class SubjectSelectionItem(
    val name: String,
    val questionCount: Int,
    val isCompulsory: Boolean = false,
    val icon: ImageVector,
    val category: String
)

@Composable
fun CbtSubjectSelectionDialog(
    initialSubjects: List<String> = listOf("English Language", "Mathematics", "Physics", "Chemistry"),
    onStartExam: (selectedSubjects: List<String>) -> Unit,
    onDismiss: () -> Unit
) {
    val compulsorySubject = "English Language"

    val allAvailableElectives = remember {
        listOf(
            SubjectSelectionItem("Mathematics", 40, false, Icons.Outlined.Calculate, "Sciences"),
            SubjectSelectionItem("Physics", 40, false, Icons.Outlined.Bolt, "Sciences"),
            SubjectSelectionItem("Chemistry", 40, false, Icons.Outlined.Science, "Sciences"),
            SubjectSelectionItem("Biology", 40, false, Icons.Outlined.Eco, "Sciences"),
            SubjectSelectionItem("Economics", 40, false, Icons.Outlined.TrendingUp, "Commercial"),
            SubjectSelectionItem("Government", 40, false, Icons.Outlined.AccountBalance, "Arts"),
            SubjectSelectionItem("Literature in English", 40, false, Icons.Outlined.AutoStories, "Arts"),
            SubjectSelectionItem("Commerce", 40, false, Icons.Outlined.Storefront, "Commercial"),
            SubjectSelectionItem("CRS", 40, false, Icons.Outlined.Bookmark, "Arts"),
            SubjectSelectionItem("Principles of Accounts", 40, false, Icons.Outlined.ReceiptLong, "Commercial")
        )
    }

    // Selected electives state (maximum 3)
    val initialElectives = remember(initialSubjects) {
        val nonEnglish = initialSubjects.filter { !it.equals(compulsorySubject, ignoreCase = true) }
        if (nonEnglish.size >= 3) nonEnglish.take(3) else listOf("Mathematics", "Physics", "Chemistry")
    }

    var selectedElectives by remember { mutableStateOf(initialElectives.toSet()) }

    val totalSubjectsCount = 1 + selectedElectives.size // 1 compulsory + electives
    val isCompleteSelection = selectedElectives.size == 3

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .fillMaxHeight(0.92f)
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
                // Top Header with Close
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Choose 4 CBT Subjects",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "English is mandatory + choose 3 combination subjects",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.surfaceVariant)
                    ) {
                        Icon(Icons.Default.Close, contentDescription = "Close", tint = MaterialTheme.colorScheme.onSurfaceVariant, modifier = Modifier.size(18.dp))
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState())
                ) {
                    // 1. Mandatory English Section
                    Text(
                        text = "1. Compulsory Subject",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryGreen
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = SoftEmeraldBg,
                        border = androidx.compose.foundation.BorderStroke(1.5.dp, PrimaryGreen),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Surface(
                                    shape = CircleShape,
                                    color = PrimaryGreen,
                                    modifier = Modifier.size(38.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            imageVector = Icons.Default.Lock,
                                            contentDescription = "Locked",
                                            tint = Color.White,
                                            modifier = Modifier.size(18.dp)
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.width(12.dp))

                                Column {
                                    Text(
                                        text = compulsorySubject,
                                        style = MaterialTheme.typography.titleMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = TextPrimaryDark
                                    )
                                    Text(
                                        text = "Mandatory for all UTME candidates · Comprehension & Lexis",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = TextPrimaryDark.copy(alpha = 0.8f)
                                    )
                                }
                            }

                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = PrimaryGreen,
                                modifier = Modifier.padding(start = 4.dp)
                            ) {
                                Text(
                                    text = "Mandatory",
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // 2. Electives Selection Section
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "2. Select 3 Other Subjects",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )

                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = if (isCompleteSelection) SoftEmeraldBg else WarningAmberBg
                        ) {
                            Text(
                                text = "${selectedElectives.size} of 3 selected",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = if (isCompleteSelection) PrimaryGreen else WarningAmber,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    // Electives List
                    allAvailableElectives.forEach { subject ->
                        val isSelected = selectedElectives.contains(subject.name)
                        val canSelect = isSelected || selectedElectives.size < 3

                        Surface(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .clip(RoundedCornerShape(14.dp))
                                .clickable(enabled = canSelect || isSelected) {
                                    val newSet = selectedElectives.toMutableSet()
                                    if (isSelected) {
                                        newSet.remove(subject.name)
                                    } else {
                                        if (newSet.size < 3) {
                                            newSet.add(subject.name)
                                        }
                                    }
                                    selectedElectives = newSet
                                }
                                .testTag("subject_select_${subject.name.lowercase().replace(' ', '_')}"),
                            shape = RoundedCornerShape(14.dp),
                            color = if (isSelected) SurfaceWhite else SurfaceWhite.copy(alpha = 0.6f),
                            border = androidx.compose.foundation.BorderStroke(
                                width = if (isSelected) 1.5.dp else 1.dp,
                                color = if (isSelected) PrimaryGreen else BorderSubtle
                            )
                        ) {
                            Row(
                                modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(1f)) {
                                    Surface(
                                        shape = CircleShape,
                                        color = if (isSelected) SoftEmeraldBg else AppBackground,
                                        modifier = Modifier.size(34.dp)
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(
                                                imageVector = subject.icon,
                                                contentDescription = null,
                                                tint = if (isSelected) PrimaryGreen else TextSecondary,
                                                modifier = Modifier.size(18.dp)
                                            )
                                        }
                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column {
                                        Text(
                                            text = subject.name,
                                            style = MaterialTheme.typography.titleSmall,
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                            color = MaterialTheme.colorScheme.onSurface
                                        )
                                        Text(
                                            text = "${subject.category} · UTME Syllabus",
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                }

                                Surface(
                                    shape = CircleShape,
                                    color = if (isSelected) PrimaryGreen else Color.Transparent,
                                    border = if (!isSelected) androidx.compose.foundation.BorderStroke(1.5.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.4f)) else null,
                                    modifier = Modifier.size(24.dp)
                                ) {
                                    if (isSelected) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(
                                                imageVector = Icons.Default.Check,
                                                contentDescription = "Selected",
                                                tint = Color.White,
                                                modifier = Modifier.size(14.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Summary & Start Button
                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = DarkCardBg,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(14.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    text = "Full CBT Mock Exam",
                                    style = MaterialTheme.typography.titleSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    text = "Standard Official JAMB Format · 2 Hours",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = TextMuted
                                )
                            }

                            Surface(
                                shape = RoundedCornerShape(10.dp),
                                color = PrimaryGreenLight.copy(alpha = 0.2f)
                            ) {
                                Text(
                                    text = "Timed 2h",
                                    style = MaterialTheme.typography.labelMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryGreenLight,
                                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Button(
                            onClick = {
                                val full4List = mutableListOf(compulsorySubject)
                                full4List.addAll(selectedElectives)
                                onStartExam(full4List)
                            },
                            enabled = isCompleteSelection,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                                .testTag("confirm_start_cbt_exam_btn"),
                            shape = RoundedCornerShape(14.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = PrimaryGreen,
                                disabledContainerColor = Color.White.copy(alpha = 0.15f)
                            )
                        ) {
                            Text(
                                text = if (isCompleteSelection) "Start CBT Mock Exam (180 Qs)" else "Select ${3 - selectedElectives.size} more subject(s)",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = if (isCompleteSelection) Color.White else TextMuted
                            )
                        }
                    }
                }
            }
        }
    }
}
