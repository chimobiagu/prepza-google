package com.example.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.outlined.Flag
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppHeaderBar(
    title: String,
    onBackClick: (() -> Unit)? = null,
    streakDays: Int? = null,
    totalXp: Int? = null,
    actions: @Composable RowScope.() -> Unit = {}
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground
            )
        },
        navigationIcon = {
            if (onBackClick != null) {
                IconButton(
                    onClick = onBackClick,
                    modifier = Modifier.testTag("nav_back_button")
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                }
            }
        },
        actions = {
            if (streakDays != null) {
                Surface(
                    color = WarningAmberBg,
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.padding(end = 6.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Whatshot,
                            contentDescription = "Streak",
                            tint = WarningAmber,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "$streakDays",
                            style = MaterialTheme.typography.labelLarge,
                            color = WarningAmber,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            if (totalXp != null) {
                Surface(
                    color = PaleGreenBg,
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier.padding(end = 8.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Bolt,
                            contentDescription = "XP",
                            tint = PrimaryGreen,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "${totalXp} XP",
                            style = MaterialTheme.typography.labelLarge,
                            color = PrimaryGreen,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            actions()
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background
        )
    )
}

@Composable
fun PrepzaCard(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    backgroundColor: Color = MaterialTheme.colorScheme.surface,
    borderColor: Color = MaterialTheme.colorScheme.outline,
    content: @Composable ColumnScope.() -> Unit
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .then(
                if (onClick != null) Modifier.clickable(onClick = onClick) else Modifier
            ),
        shape = RoundedCornerShape(16.dp),
        color = backgroundColor,
        border = androidx.compose.foundation.BorderStroke(1.dp, borderColor),
        shadowElevation = 0.5.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            content = content
        )
    }
}

@Composable
fun PrepzaButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    enabled: Boolean = true,
    isDark: Boolean = true
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 52.dp)
            .testTag("prepza_button_${text.lowercase().replace(" ", "_")}"),
        shape = RoundedCornerShape(14.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isDark) DarkCardBg else PrimaryGreen,
            contentColor = Color.White,
            disabledContainerColor = BorderSubtle,
            disabledContentColor = TextMuted
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            if (icon != null) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
            }
            Text(
                text = text,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun PrepzaProgressBar(
    progress: Float, // 0.0 to 1.0
    modifier: Modifier = Modifier,
    color: Color = PrimaryGreen,
    trackColor: Color = PaleGreenBg
) {
    val animatedProgress by animateFloatAsState(targetValue = progress.coerceIn(0f, 1f), label = "progress")
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(trackColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(animatedProgress)
                .clip(RoundedCornerShape(4.dp))
                .background(color)
        )
    }
}

@Composable
fun PrepzaChip(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.clickable(onClick = onClick),
        shape = RoundedCornerShape(20.dp),
        color = if (isSelected) PrimaryGreen else SurfaceWhite,
        border = androidx.compose.foundation.BorderStroke(
            1.dp,
            if (isSelected) PrimaryGreen else BorderSubtle
        )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
            color = if (isSelected) Color.White else TextPrimary,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
fun EmptyStateView(
    icon: ImageVector,
    title: String,
    description: String,
    actionText: String? = null,
    onActionClick: (() -> Unit)? = null
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Surface(
            shape = CircleShape,
            color = PaleGreenBg,
            modifier = Modifier.size(64.dp)
        ) {
            Box(contentAlignment = Alignment.Center) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = PrimaryGreen,
                    modifier = Modifier.size(32.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = description,
            style = MaterialTheme.typography.bodyMedium,
            color = TextSecondary,
            textAlign = TextAlign.Center
        )
        if (actionText != null && onActionClick != null) {
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = onActionClick,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen)
            ) {
                Text(text = actionText, fontWeight = FontWeight.Bold)
            }
        }
    }
}

// On-Screen JAMB Calculator Dialog
@Composable
fun ScientificCalculatorDialog(
    onDismiss: () -> Unit
) {
    var display by remember { mutableStateOf("0") }
    var expression by remember { mutableStateOf("") }

    fun appendInput(char: String) {
        if (display == "0" && char in "0123456789.") {
            display = char
        } else {
            display += char
        }
    }

    fun calculateResult() {
        try {
            val expr = display.replace("×", "*").replace("÷", "/")
            if (expr.contains("+")) {
                val parts = expr.split("+")
                val res = parts.sumOf { it.trim().toDoubleOrNull() ?: 0.0 }
                display = if (res % 1.0 == 0.0) res.toLong().toString() else res.toString()
            } else if (expr.contains("-") && !expr.startsWith("-")) {
                val parts = expr.split("-")
                val first = parts[0].toDoubleOrNull() ?: 0.0
                val second = parts.getOrNull(1)?.toDoubleOrNull() ?: 0.0
                val res = first - second
                display = if (res % 1.0 == 0.0) res.toLong().toString() else res.toString()
            } else if (expr.contains("*")) {
                val parts = expr.split("*")
                val res = (parts.getOrNull(0)?.toDoubleOrNull() ?: 1.0) * (parts.getOrNull(1)?.toDoubleOrNull() ?: 1.0)
                display = if (res % 1.0 == 0.0) res.toLong().toString() else res.toString()
            } else if (expr.contains("/")) {
                val parts = expr.split("/")
                val num = parts.getOrNull(0)?.toDoubleOrNull() ?: 0.0
                val den = parts.getOrNull(1)?.toDoubleOrNull() ?: 1.0
                val res = if (den != 0.0) num / den else 0.0
                display = if (res % 1.0 == 0.0) res.toLong().toString() else res.toString()
            }
        } catch (e: Exception) {
            display = "Error"
        }
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("Close", fontWeight = FontWeight.Bold, color = PrimaryGreen)
            }
        },
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(imageVector = Icons.Default.Calculate, contentDescription = null, tint = PrimaryGreen)
                Spacer(modifier = Modifier.width(8.dp))
                Text("JAMB CBT Calculator", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
            }
        },
        text = {
            Column(modifier = Modifier.fillMaxWidth()) {
                Surface(
                    color = MaterialTheme.colorScheme.surfaceVariant,
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                        contentAlignment = Alignment.CenterEnd
                    ) {
                        Text(
                            text = display,
                            style = MaterialTheme.typography.headlineMedium,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                val buttons = listOf(
                    listOf("C", "√", "%", "÷"),
                    listOf("7", "8", "9", "×"),
                    listOf("4", "5", "6", "-"),
                    listOf("1", "2", "3", "+"),
                    listOf("0", ".", "⌫", "=")
                )

                Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                    buttons.forEach { row ->
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(6.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            row.forEach { btn ->
                                Surface(
                                    modifier = Modifier
                                        .weight(1f)
                                        .height(44.dp)
                                        .clickable {
                                            when (btn) {
                                                "C" -> display = "0"
                                                "⌫" -> display = if (display.length > 1) display.dropLast(1) else "0"
                                                "=" -> calculateResult()
                                                "√" -> {
                                                    val v = display.toDoubleOrNull() ?: 0.0
                                                    display = Math.sqrt(v).toString()
                                                }
                                                "%" -> {
                                                    val v = display.toDoubleOrNull() ?: 0.0
                                                    display = (v / 100.0).toString()
                                                }
                                                else -> appendInput(btn)
                                            }
                                        },
                                    shape = RoundedCornerShape(8.dp),
                                    color = when (btn) {
                                        "=" -> PrimaryGreen
                                        "C", "⌫" -> IncorrectRedBg
                                        "÷", "×", "-", "+", "√", "%" -> PaleGreenBg
                                        else -> SurfaceWhite
                                    },
                                    border = androidx.compose.foundation.BorderStroke(0.5.dp, BorderSubtle)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Text(
                                            text = btn,
                                            style = MaterialTheme.typography.titleMedium,
                                            fontWeight = FontWeight.Bold,
                                            color = when (btn) {
                                                "=" -> Color.White
                                                "C", "⌫" -> IncorrectRed
                                                "÷", "×", "-", "+", "√", "%" -> PrimaryGreen
                                                else -> TextPrimary
                                            }
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    )
}

// Question Palette Bottom Sheet / Grid
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuestionPaletteBottomSheet(
    totalQuestions: Int,
    userAnswers: Map<Int, Int>, // index -> option
    flaggedQuestions: Set<Int>,
    currentIndex: Int,
    onSelectQuestion: (Int) -> Unit,
    onEndExamClick: (() -> Unit)? = null,
    onDismiss: () -> Unit
) {
    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = rememberModalBottomSheetState()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp, vertical = 12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Question Palette ($totalQuestions)",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                IconButton(onClick = onDismiss) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Close")
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Legend
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(modifier = Modifier.size(10.dp).clip(CircleShape).background(CorrectGreen))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Answered", style = MaterialTheme.typography.labelSmall)
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(modifier = Modifier.size(10.dp).clip(CircleShape).background(BorderSubtle))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Unanswered", style = MaterialTheme.typography.labelSmall)
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(modifier = Modifier.size(10.dp).clip(CircleShape).background(WarningAmber))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Flagged", style = MaterialTheme.typography.labelSmall)
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(5),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 280.dp)
            ) {
                items(totalQuestions) { index ->
                    val isAnswered = userAnswers.containsKey(index)
                    val isFlagged = flaggedQuestions.contains(index)
                    val isCurrent = index == currentIndex

                    Surface(
                        modifier = Modifier
                            .aspectRatio(1f)
                            .clickable {
                                onSelectQuestion(index)
                                onDismiss()
                            },
                        shape = RoundedCornerShape(10.dp),
                        color = when {
                            isFlagged -> WarningAmberBg
                            isAnswered -> CorrectGreenBg
                            isCurrent -> MaterialTheme.colorScheme.primaryContainer
                            else -> MaterialTheme.colorScheme.surface
                        },
                        border = androidx.compose.foundation.BorderStroke(
                            width = if (isCurrent) 2.dp else 1.dp,
                            color = when {
                                isCurrent -> MaterialTheme.colorScheme.primary
                                isFlagged -> WarningAmber
                                isAnswered -> CorrectGreen
                                else -> MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)
                            }
                        )
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = "${index + 1}",
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = if (isCurrent || isAnswered || isFlagged) FontWeight.Bold else FontWeight.Medium,
                                color = when {
                                    isFlagged -> WarningAmber
                                    isAnswered -> CorrectGreen
                                    isCurrent -> MaterialTheme.colorScheme.primary
                                    else -> MaterialTheme.colorScheme.onSurface
                                }
                            )
                        }
                    }
                }
            }

            if (onEndExamClick != null) {
                Spacer(modifier = Modifier.height(14.dp))
                OutlinedButton(
                    onClick = {
                        onDismiss()
                        onEndExamClick()
                    },
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = IncorrectRed),
                    border = androidx.compose.foundation.BorderStroke(1.dp, IncorrectRed.copy(alpha = 0.5f)),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth().testTag("palette_end_exam_btn")
                ) {
                    Text("End Exam", fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
