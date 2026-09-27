package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.db.OfflinePackEntity
import com.example.ui.components.PrepzaCard
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OfflineDownloadsScreen(
    offlinePacks: List<OfflinePackEntity>,
    userSubjectsCsv: String?,
    onDownloadPack: (subject: String) -> Unit,
    onDownloadAllSelectedSubjects: (subjects: List<String>) -> Unit,
    onDeletePack: (subject: String) -> Unit,
    onBack: () -> Unit
) {
    val userSubjects = remember(userSubjectsCsv) {
        (userSubjectsCsv ?: "Use of English,Mathematics,Physics,Chemistry")
            .split(",")
            .map { it.trim() }
            .filter { it.isNotBlank() }
    }

    val totalDownloadedCount = remember(offlinePacks) {
        offlinePacks.count { it.isDownloaded }
    }

    val totalQuestionsCached = remember(offlinePacks) {
        offlinePacks.filter { it.isDownloaded }.sumOf { it.totalQuestions }
    }

    val totalStorageMb = remember(offlinePacks) {
        offlinePacks.filter { it.isDownloaded }.sumOf { it.sizeMb.toDouble() }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Offline Questions",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBack, modifier = Modifier.testTag("offline_manager_back_btn")) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = AppBackground)
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(AppBackground)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(10.dp))

            // Offline Status Card
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = PaleGreenBg,
                shape = RoundedCornerShape(14.dp),
                border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreenLight.copy(alpha = 0.4f))
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            color = PrimaryGreen,
                            shape = CircleShape,
                            modifier = Modifier.size(32.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.WifiOff,
                                    contentDescription = null,
                                    tint = Color.White,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Offline Ready",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryGreenDark
                            )
                            Text(
                                text = "Full CBT runs locally without internet connection",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    HorizontalDivider(color = PrimaryGreenLight.copy(alpha = 0.3f))
                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = "$totalQuestionsCached",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = "Cached Qs",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary
                            )
                        }
                        Column {
                            Text(
                                text = "$totalDownloadedCount / ${offlinePacks.size}",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = "Packs",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary
                            )
                        }
                        Column {
                            Text(
                                text = "%.1f MB".format(totalStorageMb),
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = "Storage",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // One-tap Download All 4 Subjects Button
            Button(
                onClick = { onDownloadAllSelectedSubjects(userSubjects) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .testTag("download_all_subjects_btn"),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                shape = RoundedCornerShape(12.dp)
            ) {
                Icon(imageVector = Icons.Default.Download, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Cache All 4 Exam Subjects for Offline CBT",
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "Offline Questions by Subject",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = TextPrimary
            )

            Spacer(modifier = Modifier.height(10.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                contentPadding = PaddingValues(bottom = 24.dp)
            ) {
                items(offlinePacks, key = { it.subject }) { pack ->
                    val isUserSubject = userSubjects.any { it.equals(pack.subject, ignoreCase = true) }
                    OfflinePackRowItem(
                        pack = pack,
                        isUserSubject = isUserSubject,
                        onDownload = { onDownloadPack(pack.subject) },
                        onDelete = { onDeletePack(pack.subject) }
                    )
                }
            }
        }
    }
}

@Composable
fun OfflinePackRowItem(
    pack: OfflinePackEntity,
    isUserSubject: Boolean,
    onDownload: () -> Unit,
    onDelete: () -> Unit
) {
    val isDownloading = !pack.isDownloaded && pack.downloadProgressPercent in 1..99
    val isAvailableOffline = pack.isDownloaded && pack.downloadProgressPercent >= 100

    PrepzaCard {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = pack.subject,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    if (isUserSubject) {
                        Spacer(modifier = Modifier.width(6.dp))
                        Surface(
                            color = PaleGreenBg,
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Text(
                                text = "Exam Subject",
                                style = MaterialTheme.typography.labelSmall,
                                color = PrimaryGreen,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "${pack.totalQuestions} Questions · ${pack.yearsAvailable}",
                    style = MaterialTheme.typography.bodySmall,
                    color = TextSecondary
                )
                Spacer(modifier = Modifier.height(2.dp))
                // Status indicator
                Row(verticalAlignment = Alignment.CenterVertically) {
                    val statusText = when {
                        isAvailableOffline -> "Available offline"
                        isDownloading -> "Downloading (${pack.downloadProgressPercent}%)"
                        else -> "Not downloaded"
                    }
                    val statusColor = when {
                        isAvailableOffline -> PrimaryGreen
                        isDownloading -> WarningAmber
                        else -> TextSecondary
                    }
                    Text(
                        text = statusText,
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.SemiBold,
                        color = statusColor
                    )
                    Text(
                        text = " · ${pack.sizeMb} MB",
                        style = MaterialTheme.typography.labelSmall,
                        color = TextSecondary.copy(alpha = 0.7f)
                    )
                }
            }

            Spacer(modifier = Modifier.width(12.dp))

            when {
                isAvailableOffline -> {
                    Surface(
                        color = PaleGreenBg,
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = null,
                                tint = PrimaryGreen,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Available offline",
                                style = MaterialTheme.typography.labelSmall,
                                color = PrimaryGreen,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
                isDownloading -> {
                    Surface(
                        color = WarningAmberBg,
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                        ) {
                            CircularProgressIndicator(
                                color = WarningAmber,
                                strokeWidth = 2.dp,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Downloading...",
                                style = MaterialTheme.typography.labelSmall,
                                color = WarningAmber,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
                else -> {
                    OutlinedButton(
                        onClick = onDownload,
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Download,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Download", fontWeight = FontWeight.SemiBold, fontSize = 12.5.sp)
                    }
                }
            }
        }
    }
}
