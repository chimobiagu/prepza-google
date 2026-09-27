package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Flag
import androidx.compose.material.icons.outlined.ReportProblem
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
import com.example.data.db.QuestionEntity
import com.example.ui.theme.*

val REPORT_REASONS = listOf(
    "Wrong answer key",
    "Question is incorrect",
    "Option is missing/wrong",
    "Question is unclear",
    "Explanation is incorrect",
    "Image/diagram is missing",
    "Duplicate question",
    "Other"
)

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlagQuestionDialog(
    question: QuestionEntity,
    onDismiss: () -> Unit,
    onConfirmFlagAndFix: (reason: String, notes: String) -> Unit,
    modifier: Modifier = Modifier
) {
    var selectedReason by remember { mutableStateOf(REPORT_REASONS[0]) }
    var userNotes by remember { mutableStateOf("") }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = modifier
                .fillMaxWidth(0.92f)
                .wrapContentHeight()
                .testTag("flag_question_dialog"),
            shape = RoundedCornerShape(24.dp),
            color = SurfaceWhite,
            shadowElevation = 16.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
            ) {
                // Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = WarningAmberBg,
                            modifier = Modifier.size(40.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Filled.Flag,
                                    contentDescription = null,
                                    tint = WarningAmber,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }

                        Column {
                            Text(
                                text = "Report / Flag Question",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = "${question.subject} • ${question.year.ifBlank { "Past UTME" }}",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary
                            )
                        }
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.size(32.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Close,
                            contentDescription = "Close",
                            tint = TextMuted,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Question Snippet Preview
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = AppBackground,
                    border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    FormattedText(
                        text = question.questionText,
                        style = MaterialTheme.typography.bodySmall,
                        color = TextSecondary,
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(12.dp),
                        isQuestionStem = true
                    )
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Reason Selection Title
                Text(
                    text = "Select Reason",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Reason Chips Flow
                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    REPORT_REASONS.forEach { reason ->
                        val isSelected = selectedReason == reason
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = if (isSelected) PrimaryGreen.copy(alpha = 0.12f) else AppBackground,
                            border = androidx.compose.foundation.BorderStroke(
                                1.dp,
                                if (isSelected) PrimaryGreen else BorderSubtle
                            ),
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .clickable { selectedReason = reason }
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                            ) {
                                if (isSelected) {
                                    Icon(
                                        imageVector = Icons.Filled.Check,
                                        contentDescription = null,
                                        tint = PrimaryGreen,
                                        modifier = Modifier.size(14.dp)
                                    )
                                    Spacer(modifier = Modifier.width(4.dp))
                                }
                                Text(
                                    text = reason,
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                    color = if (isSelected) PrimaryGreen else TextPrimary,
                                    fontSize = 11.5.sp
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // "Tell us what is wrong" optional input
                OutlinedTextField(
                    value = userNotes,
                    onValueChange = { userNotes = it },
                    label = { Text("Tell us what is wrong", fontSize = 12.sp) },
                    placeholder = { Text("Describe the issue (e.g. correct answer should be Option C because...)", fontSize = 12.sp) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 76.dp)
                        .testTag("flag_question_notes_input"),
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = PrimaryGreen,
                        unfocusedBorderColor = BorderSubtle,
                        focusedLabelColor = PrimaryGreen
                    ),
                    maxLines = 4
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Review Queue Notice Banner
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = SoftEmeraldBg,
                    border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreenLight.copy(alpha = 0.4f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.ReportProblem,
                            contentDescription = null,
                            tint = PrimaryGreen,
                            modifier = Modifier.size(18.dp)
                        )
                        Text(
                            text = "A snapshot of this question will be saved and submitted to the academic review queue for administrator verification.",
                            style = MaterialTheme.typography.labelSmall,
                            color = PrimaryGreenDark,
                            fontSize = 11.sp,
                            lineHeight = 15.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                // Action Buttons
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    OutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier
                            .weight(1f)
                            .height(44.dp),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = TextSecondary),
                        border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle)
                    ) {
                        Text("Cancel", fontWeight = FontWeight.SemiBold)
                    }

                    Button(
                        onClick = {
                            onConfirmFlagAndFix(selectedReason, userNotes.trim())
                            onDismiss()
                        },
                        modifier = Modifier
                            .weight(1.3f)
                            .height(44.dp)
                            .testTag("flag_and_fix_submit_btn"),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = PrimaryGreen,
                            contentColor = Color.White
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Flag,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Submit Report", fontWeight = FontWeight.Bold, fontSize = 13.sp)
                    }
                }
            }
        }
    }
}
