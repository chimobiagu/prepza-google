package com.example.ui.components

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.data.engine.CbtStartupProfile
import com.example.data.engine.StartupCheckpoint
import com.example.data.engine.StartupProfiler
import com.example.ui.theme.*

/**
 * Compact, floating debug badge shown during CBT Mock sessions to inspect startup latency.
 */
@Composable
fun StartupProfilerBadge(
    profile: CbtStartupProfile?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val totalMs = profile?.totalElapsedMs ?: 0.0
    val isReady = profile?.isComplete == true

    val badgeColor = when {
        !isReady -> Color(0xFF3B82F6) // Blue (in-flight)
        totalMs < 500.0 -> Color(0xFF10B981) // Bright Green (<500ms)
        totalMs < 1000.0 -> Color(0xFF059669) // Emerald (<1000ms)
        else -> Color(0xFFF59E0B) // Amber
    }

    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        color = badgeColor.copy(alpha = 0.15f),
        border = androidx.compose.foundation.BorderStroke(1.dp, badgeColor.copy(alpha = 0.5f)),
        modifier = modifier
            .testTag("startup_profiler_badge")
            .clip(RoundedCornerShape(12.dp))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Speed,
                contentDescription = "Startup Profiler",
                tint = badgeColor,
                modifier = Modifier.size(14.dp)
            )
            Text(
                text = if (isReady) String.format("%.1f ms", totalMs) else "Profiling...",
                fontSize = 11.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                color = badgeColor
            )
        }
    }
}

/**
 * Full Startup Profiler Debug Inspector Dialog.
 * Shows nanoTime-accurate breakdown across all 5 checkpoints:
 * 1. Tap
 * 2. ViewModel Init
 * 3. DB Query
 * 4. Snapshot Lock
 * 5. Q1 Render
 */
@Composable
fun StartupProfilerDialog(
    profile: CbtStartupProfile?,
    onDismiss: () -> Unit,
    onRunBenchmark: (() -> Unit)? = null
) {
    val context = LocalContext.current
    val history by StartupProfiler.profileHistoryFlow.collectAsStateWithLifecycle()
    var selectedProfile by remember(profile) { mutableStateOf(profile) }
    var activeTab by remember { mutableStateOf(0) } // 0 = Current, 1 = History

    val current = selectedProfile ?: profile

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .fillMaxHeight(0.85f)
                .clip(RoundedCornerShape(24.dp))
                .testTag("startup_profiler_dialog"),
            shape = RoundedCornerShape(24.dp),
            color = MaterialTheme.colorScheme.surface,
            tonalElevation = 6.dp
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
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(36.dp)
                                .clip(CircleShape)
                                .background(Color(0xFF10B981).copy(alpha = 0.15f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Timer,
                                contentDescription = null,
                                tint = Color(0xFF10B981),
                                modifier = Modifier.size(20.dp)
                            )
                        }
                        Column {
                            Text(
                                text = "CBT Startup Profiler",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "System.nanoTime() Granular Latency Audit",
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }

                    IconButton(onClick = onDismiss) {
                        Icon(imageVector = Icons.Filled.Close, contentDescription = "Close")
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Tab Switcher
                TabRow(
                    selectedTabIndex = activeTab,
                    containerColor = Color.Transparent,
                    contentColor = PrimaryGreen,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Tab(
                        selected = activeTab == 0,
                        onClick = { activeTab = 0 },
                        text = { Text("Active Session", fontWeight = FontWeight.SemiBold) }
                    )
                    Tab(
                        selected = activeTab == 1,
                        onClick = { activeTab = 1 },
                        text = { Text("History (${history.size})", fontWeight = FontWeight.SemiBold) }
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                if (activeTab == 0) {
                    if (current == null) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Icon(
                                    imageVector = Icons.Outlined.Speed,
                                    contentDescription = null,
                                    modifier = Modifier.size(48.dp),
                                    tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "No CBT session profiled yet.",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = "Start a CBT mock or practice session to view granular timings.",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
                                )
                            }
                        }
                    } else {
                        // Latency Summary Hero Card
                        StartupHeroCard(profile = current)

                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = "CHECKPOINT BREAKDOWN",
                            fontSize = 11.sp,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            letterSpacing = 1.sp
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        // Checkpoints List
                        LazyColumn(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            val allCheckpoints = StartupCheckpoint.values()
                            items(allCheckpoints) { checkpoint ->
                                val measurement = current.getCheckpoint(checkpoint)
                                CheckpointTimelineItem(
                                    checkpoint = checkpoint,
                                    measurement = measurement,
                                    totalSessionMs = current.totalElapsedMs
                                )
                            }
                        }
                    }
                } else {
                    // History List
                    if (history.isEmpty()) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "No past startup benchmarks recorded.",
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    } else {
                        LazyColumn(
                            modifier = Modifier
                                .weight(1f)
                                .fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            items(history) { item ->
                                Surface(
                                    onClick = {
                                        selectedProfile = item
                                        activeTab = 0
                                    },
                                    shape = RoundedCornerShape(12.dp),
                                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f),
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Row(
                                        modifier = Modifier
                                            .padding(12.dp)
                                            .fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Column {
                                            Text(
                                                text = item.mode,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 13.sp
                                            )
                                            Text(
                                                text = "ID: ${item.sessionId}",
                                                fontSize = 11.sp,
                                                color = MaterialTheme.colorScheme.onSurfaceVariant
                                            )
                                        }
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                                        ) {
                                            Text(
                                                text = String.format("%.2f ms", item.totalElapsedMs),
                                                fontFamily = FontFamily.Monospace,
                                                fontWeight = FontWeight.Bold,
                                                color = if (item.isWarmTargetMet) Color(0xFF10B981) else Color(0xFFF59E0B),
                                                fontSize = 14.sp
                                            )
                                            Icon(
                                                imageVector = Icons.Filled.ChevronRight,
                                                contentDescription = null,
                                                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                                                modifier = Modifier.size(16.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Bottom Actions
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    if (current != null) {
                        OutlinedButton(
                            onClick = {
                                val text = StartupProfiler.instance.formatExportText(current)
                                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                                val clip = ClipData.newPlainText("Startup Profiler Report", text)
                                clipboard.setPrimaryClip(clip)
                                Toast.makeText(context, "Profiler report copied to clipboard!", Toast.LENGTH_SHORT).show()
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Icon(imageVector = Icons.Outlined.ContentCopy, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("Copy Log")
                        }
                    }

                    Button(
                        onClick = onDismiss,
                        colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text("Done")
                    }
                }
            }
        }
    }
}

@Composable
private fun StartupHeroCard(profile: CbtStartupProfile) {
    val totalMs = profile.totalElapsedMs
    val isWarmMet = profile.isWarmTargetMet
    val isReady = profile.isComplete

    val statusBg = if (isWarmMet) Color(0xFF064E3B) else Color(0xFF78350F)
    val statusBorder = if (isWarmMet) Color(0xFF10B981) else Color(0xFFF59E0B)

    Surface(
        shape = RoundedCornerShape(16.dp),
        color = statusBg.copy(alpha = 0.2f),
        border = androidx.compose.foundation.BorderStroke(1.dp, statusBorder.copy(alpha = 0.4f)),
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
                        text = "TOTAL STARTUP LATENCY",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        letterSpacing = 0.5.sp
                    )
                    Text(
                        text = if (isReady) String.format("%.2f ms", totalMs) else "Measuring...",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Black,
                        fontFamily = FontFamily.Monospace,
                        color = if (isWarmMet) Color(0xFF10B981) else Color(0xFFF59E0B)
                    )
                }

                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = if (isWarmMet) Color(0xFF10B981).copy(alpha = 0.2f) else Color(0xFFF59E0B).copy(alpha = 0.2f),
                    border = androidx.compose.foundation.BorderStroke(
                        1.dp,
                        if (isWarmMet) Color(0xFF10B981) else Color(0xFFF59E0B)
                    )
                ) {
                    Text(
                        text = if (isWarmMet) "WARM TARGET MET (<1s)" else "EXCEEDED TARGET",
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        color = if (isWarmMet) Color(0xFF10B981) else Color(0xFFF59E0B)
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Mode: ${profile.mode}",
                    fontSize = 11.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = "Session: ${profile.sessionId}",
                    fontSize = 11.sp,
                    fontFamily = FontFamily.Monospace,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Composable
private fun CheckpointTimelineItem(
    checkpoint: StartupCheckpoint,
    measurement: com.example.data.engine.CheckpointMeasurement?,
    totalSessionMs: Double
) {
    val isReached = measurement != null
    val dotColor = if (isReached) Color(0xFF10B981) else MaterialTheme.colorScheme.outlineVariant

    Surface(
        shape = RoundedCornerShape(12.dp),
        color = if (isReached) MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f) else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.1f),
        border = androidx.compose.foundation.BorderStroke(
            1.dp,
            if (isReached) Color(0xFF10B981).copy(alpha = 0.3f) else MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.2f)
        ),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Checkpoint Icon / Step Indicator
            Box(
                modifier = Modifier
                    .size(28.dp)
                    .clip(CircleShape)
                    .background(dotColor.copy(alpha = 0.15f))
                    .border(1.dp, dotColor, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                if (isReached) {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = null,
                        tint = Color(0xFF10B981),
                        modifier = Modifier.size(14.dp)
                    )
                } else {
                    Box(
                        modifier = Modifier
                            .size(6.dp)
                            .clip(CircleShape)
                            .background(dotColor)
                    )
                }
            }

            // Description & Name
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = checkpoint.displayName,
                    fontWeight = FontWeight.Bold,
                    fontSize = 13.sp,
                    color = if (isReached) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = if (measurement?.details?.isNotBlank() == true) measurement.details else checkpoint.description,
                    fontSize = 11.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f)
                )
            }

            // Timings
            if (isReached && measurement != null) {
                Column(horizontalAlignment = Alignment.End) {
                    Text(
                        text = String.format("%.2f ms", measurement.elapsedFromTapMs),
                        fontFamily = FontFamily.Monospace,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                        color = Color(0xFF10B981)
                    )
                    Text(
                        text = String.format("+%.2f ms", measurement.intervalDeltaMs),
                        fontFamily = FontFamily.Monospace,
                        fontSize = 10.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            } else {
                Text(
                    text = "Pending",
                    fontSize = 11.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
                )
            }
        }
    }
}
