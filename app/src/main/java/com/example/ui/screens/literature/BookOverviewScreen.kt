package com.example.ui.screens.literature

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.literature.LiteratureBookStudyData
import com.example.ui.theme.*

/**
 * Literature Section Destination Enum for Book Hub Navigation.
 */
enum class LiteratureSection {
    OVERVIEW,
    READER,
    SUMMARIES,
    BACKGROUND,
    PLOT,
    CHARACTERS,
    THEMES,
    LITERARY_DEVICES,
    AUTHOR,
    SETTING,
    EXAM_PREP,
    IMPORTANT_FACTS,
    QUICK_REVISION
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookOverviewScreen(
    bookData: LiteratureBookStudyData,
    currentProgressPercent: Int,
    lastReadChapterIndex: Int,
    onBackToLibrary: () -> Unit,
    onOpenSection: (LiteratureSection) -> Unit,
    onContinueReading: (chapterIndex: Int) -> Unit,
    onAskAiTutor: (bookTitle: String) -> Unit,
    modifier: Modifier = Modifier
) {
    val totalChapters = bookData.chapters.size

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = bookData.title,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = bookData.author,
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }
                },
                navigationIcon = {
                    IconButton(
                        onClick = onBackToLibrary,
                        modifier = Modifier.testTag("book_overview_back_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back to Library"
                        )
                    }
                },
                actions = {
                    FilledTonalButton(
                        onClick = { onAskAiTutor(bookData.title) },
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                        colors = ButtonDefaults.filledTonalButtonColors(
                            containerColor = PrimaryGreen.copy(alpha = 0.12f),
                            contentColor = PrimaryGreenDark
                        ),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .testTag("book_ai_tutor_button")
                    ) {
                        Icon(
                            imageVector = Icons.Default.AutoAwesome,
                            contentDescription = "Ask Kelvin",
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Ask Kelvin",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = SurfaceWhite
                )
            )
        },
        containerColor = AppBackground,
        modifier = modifier
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // 1. Header Card with Reading Progress
            item {
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = SurfaceWhite,
                    border = BorderStroke(1.dp, BorderSubtle),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                color = PrimaryGreen.copy(alpha = 0.1f),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    text = bookData.category.uppercase(),
                                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                                    color = PrimaryGreenDark,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }

                            Text(
                                text = if (bookData.isPoetry) "Full Poem" else "$totalChapters Chapters",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary
                            )
                        }

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = bookData.title,
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )

                        Text(
                            text = "By ${bookData.author}",
                            style = MaterialTheme.typography.bodyMedium,
                            color = TextSecondary
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        // Progress bar
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = if (currentProgressPercent > 0) "Reading Progress" else "Not Started",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary
                            )
                            Text(
                                text = "$currentProgressPercent%",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = if (currentProgressPercent > 0) PrimaryGreen else TextSecondary
                            )
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        LinearProgressIndicator(
                            progress = { (currentProgressPercent / 100f).coerceIn(0f, 1f) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(4.dp)
                                .clip(RoundedCornerShape(2.dp)),
                            color = PrimaryGreen,
                            trackColor = BorderSubtle
                        )
                    }
                }
            }

            // 2. Main Actions: Read & Summaries
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Button(
                        onClick = { onContinueReading(lastReadChapterIndex.coerceAtLeast(0)) },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = PrimaryGreen,
                            contentColor = SurfaceWhite
                        ),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .height(44.dp)
                            .testTag("read_book_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.MenuBook,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = if (currentProgressPercent > 0) "Continue" else "Read",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.labelLarge
                        )
                    }

                    OutlinedButton(
                        onClick = { onOpenSection(LiteratureSection.SUMMARIES) },
                        colors = ButtonDefaults.outlinedButtonColors(
                            contentColor = PrimaryGreenDark
                        ),
                        border = BorderStroke(1.dp, PrimaryGreen.copy(alpha = 0.5f)),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .weight(1f)
                            .height(44.dp)
                            .testTag("summaries_button")
                    ) {
                        Icon(
                            imageVector = Icons.Default.Summarize,
                            contentDescription = null,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = if (bookData.isPoetry) "Stanzas" else "Summaries",
                            fontWeight = FontWeight.Bold,
                            style = MaterialTheme.typography.labelLarge
                        )
                    }
                }
            }

            // 3. Study Modules Header
            item {
                Text(
                    text = "STUDY MODULES",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryGreenDark,
                    letterSpacing = 0.8.sp,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }

            // 4. Study Modules Grid (2 Columns)
            item {
                val studyModules = remember(bookData.id) {
                    listOf(
                        StudyModule(
                            section = LiteratureSection.CHARACTERS,
                            title = if (bookData.isPoetry) "Speaker & Figures" else "Characters",
                            count = "${bookData.characters.size} Profiles",
                            icon = Icons.Default.PeopleAlt
                        ),
                        StudyModule(
                            section = LiteratureSection.THEMES,
                            title = "Themes & Motifs",
                            count = "${bookData.themes.size} Themes",
                            icon = Icons.Default.Lightbulb
                        ),
                        StudyModule(
                            section = LiteratureSection.PLOT,
                            title = if (bookData.isPoetry) "Structure" else "Plot Stages",
                            count = "5 Stages",
                            icon = Icons.Default.Timeline
                        ),
                        StudyModule(
                            section = LiteratureSection.LITERARY_DEVICES,
                            title = if (bookData.isPoetry) "Poetic Devices" else "Literary Devices",
                            count = "${bookData.literaryDevices.size} Devices",
                            icon = Icons.Default.Psychology
                        ),
                        StudyModule(
                            section = LiteratureSection.EXAM_PREP,
                            title = "UTME Practice",
                            count = "${bookData.practiceQuestions.size} Questions",
                            icon = Icons.Default.Quiz
                        ),
                        StudyModule(
                            section = LiteratureSection.QUICK_REVISION,
                            title = "Quick Revision",
                            count = "Key Notes",
                            icon = Icons.Default.Bolt
                        ),
                        StudyModule(
                            section = LiteratureSection.IMPORTANT_FACTS,
                            title = "High-Yield Facts",
                            count = "${bookData.importantFacts.size} Facts",
                            icon = Icons.Default.PushPin
                        ),
                        StudyModule(
                            section = LiteratureSection.BACKGROUND,
                            title = "Background",
                            count = "Context",
                            icon = Icons.Default.AccountBalance
                        ),
                        StudyModule(
                            section = LiteratureSection.SETTING,
                            title = "Setting",
                            count = "Time & Place",
                            icon = Icons.Default.Place
                        ),
                        StudyModule(
                            section = LiteratureSection.AUTHOR,
                            title = if (bookData.isPoetry) "About Poet" else "About Author",
                            count = "Bio & Works",
                            icon = Icons.Default.Edit
                        )
                    )
                }

                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    for (i in studyModules.indices step 2) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            StudyModuleCard(
                                module = studyModules[i],
                                onClick = { onOpenSection(studyModules[i].section) },
                                modifier = Modifier.weight(1f)
                            )
                            if (i + 1 < studyModules.size) {
                                StudyModuleCard(
                                    module = studyModules[i + 1],
                                    onClick = { onOpenSection(studyModules[i + 1].section) },
                                    modifier = Modifier.weight(1f)
                                )
                            } else {
                                Spacer(modifier = Modifier.weight(1f))
                            }
                        }
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}

private data class StudyModule(
    val section: LiteratureSection,
    val title: String,
    val count: String,
    val icon: ImageVector
)

@Composable
private fun StudyModuleCard(
    module: StudyModule,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(10.dp),
        color = SurfaceWhite,
        border = BorderStroke(1.dp, BorderSubtle),
        modifier = modifier.testTag("module_card_${module.section.name.lowercase()}")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(PrimaryGreen.copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = module.icon,
                    contentDescription = null,
                    tint = PrimaryGreen,
                    modifier = Modifier.size(16.dp)
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = module.title,
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = module.count,
                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 11.sp),
                    color = TextSecondary,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}
