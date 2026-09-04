package com.example.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Timer
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

@Composable
fun PracticeSetupDialog(
    subject: String,
    onStartSession: (subject: String, questionCount: Int, timeLimitMinutes: Int) -> Unit,
    onDismiss: () -> Unit
) {
    val questionOptions = listOf(20, 40, 60, 80)
    val timeOptions = listOf(
        Pair(15, "15 min"),
        Pair(30, "30 min"),
        Pair(45, "45 min"),
        Pair(60, "1 hr"),
        Pair(0, "Untimed")
    )

    var selectedQuestionCount by remember { mutableStateOf(20) }
    var selectedTimeMinutes by remember { mutableStateOf(20) }

    val subjectIcon: ImageVector = remember(subject) {
        when {
            subject.contains("English", ignoreCase = true) -> Icons.Outlined.Translate
            subject.contains("Math", ignoreCase = true) -> Icons.Outlined.Calculate
            subject.contains("Physic", ignoreCase = true) -> Icons.Outlined.Bolt
            subject.contains("Chem", ignoreCase = true) -> Icons.Outlined.Science
            subject.contains("Bio", ignoreCase = true) -> Icons.Outlined.Eco
            subject.contains("Econ", ignoreCase = true) -> Icons.Outlined.TrendingUp
            subject.contains("Gov", ignoreCase = true) -> Icons.Outlined.AccountBalance
            subject.contains("Lit", ignoreCase = true) -> Icons.Outlined.AutoStories
            subject.contains("Comm", ignoreCase = true) -> Icons.Outlined.Storefront
            subject.contains("CRS", ignoreCase = true) || subject.contains("Relig", ignoreCase = true) -> Icons.Outlined.Bookmark
            subject.contains("Account", ignoreCase = true) -> Icons.Outlined.ReceiptLong
            else -> Icons.Outlined.School
        }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .wrapContentHeight()
                .clip(RoundedCornerShape(24.dp))
                .testTag("practice_setup_dialog"),
            color = AppBackground,
            shape = RoundedCornerShape(24.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                // Header Row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f)
                    ) {
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = SoftEmeraldBg,
                            modifier = Modifier.size(42.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = subjectIcon,
                                    contentDescription = null,
                                    tint = PrimaryGreen,
                                    modifier = Modifier.size(22.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Column {
                            Text(
                                text = subject,
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = "Practice Setup",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary
                            )
                        }
                    }

                    IconButton(
                        onClick = onDismiss,
                        modifier = Modifier.testTag("practice_setup_close_btn")
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close",
                            tint = TextSecondary
                        )
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                // Section 1: Number of Questions
                Text(
                    text = "Number of Questions",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    questionOptions.forEach { count ->
                        val isSelected = selectedQuestionCount == count
                        Surface(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .clickable { selectedQuestionCount = count }
                                .testTag("option_questions_$count"),
                            shape = RoundedCornerShape(12.dp),
                            color = if (isSelected) PrimaryGreen else SurfaceWhite,
                            border = BorderStroke(
                                1.dp,
                                if (isSelected) PrimaryGreen else BorderSubtle
                            )
                        ) {
                            Column(
                                modifier = Modifier.padding(vertical = 10.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "$count",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp,
                                    color = if (isSelected) Color.White else TextPrimary
                                )
                                Text(
                                    text = "Questions",
                                    fontSize = 10.sp,
                                    color = if (isSelected) Color.White.copy(alpha = 0.9f) else TextSecondary
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                // Section 2: Time Limit
                Text(
                    text = "Time Limit",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    timeOptions.forEach { (mins, label) ->
                        val isSelected = selectedTimeMinutes == mins
                        Surface(
                            modifier = Modifier
                                .weight(1f)
                                .clip(RoundedCornerShape(12.dp))
                                .clickable { selectedTimeMinutes = mins }
                                .testTag("option_time_${if (mins == 0) "untimed" else "${mins}m"}"),
                            shape = RoundedCornerShape(12.dp),
                            color = if (isSelected) PrimaryGreen else SurfaceWhite,
                            border = BorderStroke(
                                1.dp,
                                if (isSelected) PrimaryGreen else BorderSubtle
                            )
                        ) {
                            Column(
                                modifier = Modifier.padding(vertical = 10.dp, horizontal = 2.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = label,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 13.sp,
                                    color = if (isSelected) Color.White else TextPrimary
                                )
                                Text(
                                    text = if (mins == 0) "Free" else "Timer",
                                    fontSize = 10.sp,
                                    color = if (isSelected) Color.White.copy(alpha = 0.9f) else TextSecondary
                                )
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                // Session Summary Info Card
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    color = SurfaceWhite,
                    border = BorderStroke(1.dp, BorderSubtle)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 14.dp, vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = CircleShape,
                            color = SoftEmeraldBg,
                            modifier = Modifier.size(32.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = if (selectedTimeMinutes > 0) Icons.Default.Timer else Icons.Outlined.CheckCircle,
                                    contentDescription = null,
                                    tint = PrimaryGreen,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Column {
                            Text(
                                text = "$selectedQuestionCount $subject questions",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.SemiBold,
                                color = TextPrimary
                            )
                            Text(
                                text = if (selectedTimeMinutes > 0) "Timed CBT session • $selectedTimeMinutes minutes" else "Untimed practice mode",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Start Action Button
                Button(
                    onClick = {
                        onStartSession(subject, selectedQuestionCount, selectedTimeMinutes)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .testTag("start_practice_session_btn"),
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Start Session",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }
}
