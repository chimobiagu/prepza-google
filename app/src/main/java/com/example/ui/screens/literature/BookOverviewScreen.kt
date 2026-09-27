package com.example.ui.screens.literature

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.automirrored.outlined.MenuBook
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.literature.LiteratureBookStudyData
import com.example.data.literature.LiteratureCharacter
import com.example.data.literature.LiteratureTheme
import com.example.data.literature.PlotStage
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

    // State for Collapsible Rows (Hierarchical layout)
    var charactersExpanded by remember { mutableStateOf(false) }
    var themesExpanded by remember { mutableStateOf(false) }
    var plotExpanded by remember { mutableStateOf(false) }

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
                            color = MaterialTheme.colorScheme.onSurfaceVariant
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
                            contentDescription = "Ask AI",
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "AI Study Tutor",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        },
        containerColor = MaterialTheme.colorScheme.background,
        modifier = modifier
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            // 1. COMPACT HERO / HEADER AREA
            item {
                BookHeroHeaderCard(
                    bookData = bookData,
                    progressPercent = currentProgressPercent,
                    lastReadChapterIndex = lastReadChapterIndex,
                    totalChapters = totalChapters
                )
            }

            // 2. PRIMARY ACTION: Read & Chapter Summaries
            item {
                PrimaryStudyActionCard(
                    bookData = bookData,
                    onOpenSummaries = { onOpenSection(LiteratureSection.SUMMARIES) },
                    onOpenReader = { onOpenSection(LiteratureSection.READER) }
                )
            }

            // 3. CLEAN OVERVIEW (SUMMARY & BACKGROUND)
            item {
                Text(
                    text = "OVERVIEW & CONTEXT",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    letterSpacing = 1.sp,
                    modifier = Modifier.padding(top = 4.dp, bottom = 2.dp)
                )
            }

            // Summary Card
            item {
                BookSummaryCard(
                    bookData = bookData,
                    onOpenQuickRevision = { onOpenSection(LiteratureSection.QUICK_REVISION) }
                )
            }

            // Background & Context Card
            item {
                BookBackgroundCard(
                    bookData = bookData,
                    onOpenFullBackground = { onOpenSection(LiteratureSection.BACKGROUND) }
                )
            }

            // 4. EXPANDABLE HIERARCHICAL ROWS
            item {
                Text(
                    text = "DEEP STUDY MODULES (COLLAPSIBLE)",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    letterSpacing = 1.sp,
                    modifier = Modifier.padding(top = 6.dp, bottom = 2.dp)
                )
            }

            // Collapsible Row 1: Characters & Cast
            item {
                CollapsibleSectionCard(
                    title = if (bookData.isPoetry) "Speaker, Persona & Key Figures" else if (bookData.isDrama) "Cast & Character Profiles" else "Characters & Profiles",
                    subtitle = "Explore major figures, dramatic foils, motivations, and traits",
                    badge = "${bookData.characters.size} Profiles",
                    icon = Icons.Default.PeopleAlt,
                    accentColor = Color(0xFFE65100),
                    isExpanded = charactersExpanded,
                    onToggle = { charactersExpanded = !charactersExpanded },
                    testTag = "collapsible_characters_row"
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        bookData.characters.take(5).forEach { character ->
                            CharacterMiniItem(character = character)
                        }

                        if (bookData.characters.size > 5) {
                            Text(
                                text = "+ ${bookData.characters.size - 5} more characters in detailed cast breakdown",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontStyle = FontStyle.Italic,
                                modifier = Modifier.padding(vertical = 2.dp)
                            )
                        }

                        OutlinedButton(
                            onClick = { onOpenSection(LiteratureSection.CHARACTERS) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 4.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = Color(0xFFE65100)
                            ),
                            border = BorderStroke(1.dp, Color(0xFFE65100).copy(alpha = 0.4f))
                        ) {
                            Icon(
                                imageVector = Icons.Default.PeopleAlt,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "View Full Character Breakdown",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }

            // Collapsible Row 2: Themes & Central Ideas
            item {
                CollapsibleSectionCard(
                    title = "Themes & Central Ideas",
                    subtitle = "Core thematic concerns, symbolic motifs & UTME takeaways",
                    badge = "${bookData.themes.size} Themes",
                    icon = Icons.Default.Lightbulb,
                    accentColor = Color(0xFFF57F17),
                    isExpanded = themesExpanded,
                    onToggle = { themesExpanded = !themesExpanded },
                    testTag = "collapsible_themes_row"
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        bookData.themes.take(4).forEach { theme ->
                            ThemeMiniItem(theme = theme)
                        }

                        if (bookData.themes.size > 4) {
                            Text(
                                text = "+ ${bookData.themes.size - 4} more thematic analyses available",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontStyle = FontStyle.Italic,
                                modifier = Modifier.padding(vertical = 2.dp)
                            )
                        }

                        OutlinedButton(
                            onClick = { onOpenSection(LiteratureSection.THEMES) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 4.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = Color(0xFFF57F17)
                            ),
                            border = BorderStroke(1.dp, Color(0xFFF57F17).copy(alpha = 0.4f))
                        ) {
                            Icon(
                                imageVector = Icons.Default.Lightbulb,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "View Full Themes & Quotes Analysis",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }

            // Collapsible Row 3: Plot Structure & Stages
            item {
                CollapsibleSectionCard(
                    title = if (bookData.isPoetry) "Structure & Poetic Progression" else "Plot Structure & Stages",
                    subtitle = "Beginning, rising action, major turning points, climax & resolution",
                    badge = "5 Stages",
                    icon = Icons.Default.Timeline,
                    accentColor = Color(0xFFC2185B),
                    isExpanded = plotExpanded,
                    onToggle = { plotExpanded = !plotExpanded },
                    testTag = "collapsible_plot_row"
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        PlotStageMiniItem(stageName = "1. Beginning / Exposition", stage = bookData.plot.beginning)
                        PlotStageMiniItem(stageName = "2. Major Events / Rising Action", stage = bookData.plot.majorEvents)
                        PlotStageMiniItem(stageName = "3. Turning Points", stage = bookData.plot.turningPoints)
                        PlotStageMiniItem(stageName = "4. Climax", stage = bookData.plot.climax)
                        PlotStageMiniItem(stageName = "5. Resolution / Denouement", stage = bookData.plot.resolution)

                        OutlinedButton(
                            onClick = { onOpenSection(LiteratureSection.PLOT) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 4.dp),
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = Color(0xFFC2185B)
                            ),
                            border = BorderStroke(1.dp, Color(0xFFC2185B).copy(alpha = 0.4f))
                        ) {
                            Icon(
                                imageVector = Icons.Default.Timeline,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "View Detailed Plot Progression",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }

            // 5. ADDITIONAL STUDY MODULES (GRID OF COMPACT TILES)
            item {
                Text(
                    text = "ADDITIONAL STUDY TOOLS",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    letterSpacing = 1.sp,
                    modifier = Modifier.padding(top = 6.dp, bottom = 2.dp)
                )
            }

            item {
                val tools = remember(bookData.id) {
                    listOf(
                        StudyToolItem(
                            section = LiteratureSection.LITERARY_DEVICES,
                            title = if (bookData.isPoetry) "Poetic Devices" else "Literary Devices",
                            subtitle = "${bookData.literaryDevices.size} figures & excerpts",
                            icon = Icons.Default.Psychology,
                            color = Color(0xFF00695C)
                        ),
                        StudyToolItem(
                            section = LiteratureSection.EXAM_PREP,
                            title = "UTME Quiz & Practice",
                            subtitle = "${bookData.practiceQuestions.size} questions with explanations",
                            icon = Icons.Default.Quiz,
                            color = Color(0xFF6A1B9A)
                        ),
                        StudyToolItem(
                            section = LiteratureSection.IMPORTANT_FACTS,
                            title = "High-Yield Exam Facts",
                            subtitle = "Crucial facts & exam traps",
                            icon = Icons.Default.PushPin,
                            color = Color(0xFFD84315)
                        ),
                        StudyToolItem(
                            section = LiteratureSection.QUICK_REVISION,
                            title = "Quick Revision Sheet",
                            subtitle = "One-page synthesis",
                            icon = Icons.Default.Bolt,
                            color = Color(0xFF00838F)
                        ),
                        StudyToolItem(
                            section = LiteratureSection.AUTHOR,
                            title = if (bookData.isPoetry) "About the Poet" else if (bookData.isDrama) "About Playwright" else "About Author",
                            subtitle = bookData.authorInfo.name.take(20),
                            icon = Icons.Default.Edit,
                            color = Color(0xFF4E342E)
                        ),
                        StudyToolItem(
                            section = LiteratureSection.SETTING,
                            title = "Setting & Atmosphere",
                            subtitle = "Locations & time period",
                            icon = Icons.Default.Place,
                            color = Color(0xFF2E7D32)
                        )
                    )
                }

                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    for (i in tools.indices step 2) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            StudyToolCard(
                                item = tools[i],
                                onClick = { onOpenSection(tools[i].section) },
                                modifier = Modifier.weight(1f)
                            )
                            if (i + 1 < tools.size) {
                                StudyToolCard(
                                    item = tools[i + 1],
                                    onClick = { onOpenSection(tools[i + 1].section) },
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
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

data class StudyToolItem(
    val section: LiteratureSection,
    val title: String,
    val subtitle: String,
    val icon: ImageVector,
    val color: Color
)

@Composable
fun StudyToolCard(
    item: StudyToolItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.6f)),
        modifier = modifier.testTag("tool_card_${item.section.name.lowercase()}")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(34.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(item.color.copy(alpha = 0.12f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = item.icon,
                    contentDescription = null,
                    tint = item.color,
                    modifier = Modifier.size(18.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = item.title,
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = item.subtitle,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

/**
 * 1. Compact Hero Header Card
 */
@Composable
fun BookHeroHeaderCard(
    bookData: LiteratureBookStudyData,
    progressPercent: Int,
    lastReadChapterIndex: Int,
    totalChapters: Int,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.6f)),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(14.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Book Thumbnail Badge
                Box(
                    modifier = Modifier
                        .size(width = 64.dp, height = 86.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    bookData.coverAccentColor,
                                    bookData.coverAccentColor.copy(alpha = 0.8f)
                                )
                            )
                        )
                        .padding(6.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.MenuBook,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.height(3.dp))
                        Text(
                            text = bookData.title.take(12),
                            style = MaterialTheme.typography.labelSmall.copy(fontSize = 9.sp),
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                Spacer(modifier = Modifier.width(14.dp))

                // Title, Author & Meta Details
                Column(modifier = Modifier.weight(1f)) {
                    Surface(
                        color = PrimaryGreen.copy(alpha = 0.12f),
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

                    Spacer(modifier = Modifier.height(3.dp))

                    Text(
                        text = bookData.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.ExtraBold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )

                    Text(
                        text = "By ${bookData.author}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontWeight = FontWeight.Medium
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.CollectionsBookmark,
                            contentDescription = null,
                            modifier = Modifier.size(13.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = if (bookData.isPoetry) "Complete Poem" else "$totalChapters Chapters",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "•",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = bookData.publicationYear.take(15),
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Reading Progress Indicator
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f))
                    .padding(horizontal = 10.dp, vertical = 8.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = if (progressPercent > 0) "Reading Progress: Ch. ${lastReadChapterIndex + 1} of $totalChapters" else "Reading Progress: Not Started",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "$progressPercent%",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = if (progressPercent > 0) PrimaryGreen else MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))

                LinearProgressIndicator(
                    progress = { (progressPercent / 100f).coerceIn(0f, 1f) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(4.dp)
                        .clip(RoundedCornerShape(2.dp)),
                    color = PrimaryGreen,
                    trackColor = MaterialTheme.colorScheme.outlineVariant
                )
            }
        }
    }
}

/**
 * 2. Primary Study Action Card (Read & Summaries)
 */
@Composable
fun PrimaryStudyActionCard(
    bookData: LiteratureBookStudyData,
    onOpenSummaries: () -> Unit,
    onOpenReader: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = PrimaryGreenDark
        ),
        modifier = modifier
            .fillMaxWidth()
            .testTag("primary_study_action_card")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color.White.copy(alpha = 0.18f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.MenuBook,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(22.dp)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "STUDY GUIDE & CHAPTERS",
                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                    fontWeight = FontWeight.Bold,
                    color = Color.White.copy(alpha = 0.85f),
                    letterSpacing = 0.8.sp
                )
                Text(
                    text = if (bookData.isPoetry) "Full Poem & Stanza Analysis" else "Chapter Summaries & Key Notes",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "Master plot, characters, themes & UTME notes",
                    style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.5.sp),
                    color = Color.White.copy(alpha = 0.75f)
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            FilledTonalButton(
                onClick = onOpenSummaries,
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.filledTonalButtonColors(
                    containerColor = Color.White,
                    contentColor = PrimaryGreenDark
                )
            ) {
                Text(
                    text = "Study",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

/**
 * 3. Book Summary Card (Concise Overview)
 */
@Composable
fun BookSummaryCard(
    bookData: LiteratureBookStudyData,
    onOpenQuickRevision: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.6f)),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(14.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFF0277BD).copy(alpha = 0.12f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Summarize,
                            contentDescription = null,
                            tint = Color(0xFF0277BD),
                            modifier = Modifier.size(16.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Synopsis & Core Summary",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )
                }

                Surface(
                    color = Color(0xFF0277BD).copy(alpha = 0.1f),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(
                        text = "Summary",
                        style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                        color = Color(0xFF0277BD),
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // One Sentence Summary Pill
            if (bookData.quickRevision.oneSentenceSummary.isNotBlank()) {
                Surface(
                    color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = bookData.quickRevision.oneSentenceSummary,
                        style = MaterialTheme.typography.bodySmall.copy(fontSize = 12.sp),
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier.padding(8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
            }

            // Core Synopsis
            Text(
                text = bookData.quickRevision.coreSynopsis.ifBlank { bookData.tagline },
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 18.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                TextButton(
                    onClick = onOpenQuickRevision,
                    contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = "Quick Revision Sheet",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF0277BD)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = null,
                        modifier = Modifier.size(14.dp),
                        tint = Color(0xFF0277BD)
                    )
                }
            }
        }
    }
}

/**
 * 4. Background & Historical Context Card
 */
@Composable
fun BookBackgroundCard(
    bookData: LiteratureBookStudyData,
    onOpenFullBackground: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.6f)),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(14.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color(0xFF4527A0).copy(alpha = 0.12f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.AccountBalance,
                            contentDescription = null,
                            tint = Color(0xFF4527A0),
                            modifier = Modifier.size(16.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "Background & Social Context",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold
                    )
                }

                Surface(
                    color = Color(0xFF4527A0).copy(alpha = 0.1f),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(
                        text = "Context",
                        style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                        color = Color(0xFF4527A0),
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = bookData.background.historicalContext.ifBlank { bookData.background.socialContext },
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 18.sp
            )

            if (bookData.background.targetExamRelevance.isNotBlank()) {
                Spacer(modifier = Modifier.height(8.dp))
                Surface(
                    color = Color(0xFF4527A0).copy(alpha = 0.08f),
                    shape = RoundedCornerShape(6.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.padding(8.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Icon(
                            imageVector = Icons.Default.Lightbulb,
                            contentDescription = null,
                            tint = Color(0xFF4527A0),
                            modifier = Modifier.size(14.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Exam Significance: ${bookData.background.targetExamRelevance}",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFF4527A0),
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                TextButton(
                    onClick = onOpenFullBackground,
                    contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = "Full Context & Era Details",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF4527A0)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = null,
                        modifier = Modifier.size(14.dp),
                        tint = Color(0xFF4527A0)
                    )
                }
            }
        }
    }
}

/**
 * 5. Reusable Collapsible Hierarchical Card
 */
@Composable
fun CollapsibleSectionCard(
    title: String,
    subtitle: String,
    badge: String,
    icon: ImageVector,
    accentColor: Color,
    isExpanded: Boolean,
    onToggle: () -> Unit,
    testTag: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    val rotationDegrees by animateFloatAsState(
        targetValue = if (isExpanded) 180f else 0f,
        label = "collapse_chevron_rotation"
    )

    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        border = BorderStroke(
            1.dp,
            if (isExpanded) accentColor.copy(alpha = 0.5f) else MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.6f)
        ),
        modifier = modifier
            .fillMaxWidth()
            .testTag(testTag)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Clickable Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(onClick = onToggle)
                    .padding(horizontal = 14.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(accentColor.copy(alpha = 0.12f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = accentColor,
                        modifier = Modifier.size(20.dp)
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        Text(
                            text = title,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Surface(
                            color = accentColor.copy(alpha = 0.1f),
                            shape = RoundedCornerShape(4.dp)
                        ) {
                            Text(
                                text = badge,
                                style = MaterialTheme.typography.labelSmall.copy(fontSize = 9.5.sp),
                                color = accentColor,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(horizontal = 5.dp, vertical = 1.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = if (isExpanded) "Collapse" else "Expand",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier
                        .size(22.dp)
                        .rotate(rotationDegrees)
                )
            }

            // Expandable Content Body
            AnimatedVisibility(
                visible = isExpanded,
                enter = expandVertically() + fadeIn(),
                exit = shrinkVertically() + fadeOut()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 14.dp, end = 14.dp, bottom = 14.dp, top = 2.dp)
                ) {
                    HorizontalDivider(
                        modifier = Modifier.padding(bottom = 12.dp),
                        color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
                    )
                    content()
                }
            }
        }
    }
}

/**
 * Character Mini Item for Collapsible Row
 */
@Composable
fun CharacterMiniItem(
    character: LiteratureCharacter,
    modifier: Modifier = Modifier
) {
    Surface(
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = character.name,
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Surface(
                    color = if (character.isProtagonist) PrimaryGreen.copy(alpha = 0.15f) else Color(0xFFE65100).copy(alpha = 0.12f),
                    shape = RoundedCornerShape(4.dp)
                ) {
                    Text(
                        text = character.role,
                        style = MaterialTheme.typography.labelSmall.copy(fontSize = 9.5.sp),
                        color = if (character.isProtagonist) PrimaryGreenDark else Color(0xFFE65100),
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = character.description.ifBlank { character.storyImportance },
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.5.sp),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 16.sp
            )

            if (character.personalityTraits.isNotEmpty()) {
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    character.personalityTraits.take(3).forEach { trait ->
                        Surface(
                            color = MaterialTheme.colorScheme.surface,
                            shape = RoundedCornerShape(3.dp),
                            border = BorderStroke(0.5.dp, MaterialTheme.colorScheme.outlineVariant)
                        ) {
                            Text(
                                text = trait,
                                style = MaterialTheme.typography.labelSmall.copy(fontSize = 9.sp),
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.padding(horizontal = 4.dp, vertical = 1.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * Theme Mini Item for Collapsible Row
 */
@Composable
fun ThemeMiniItem(
    theme: LiteratureTheme,
    modifier: Modifier = Modifier
) {
    Surface(
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = theme.title,
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(3.dp))

            Text(
                text = theme.explanation,
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.5.sp),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 16.sp
            )

            if (theme.examTakeaway.isNotBlank()) {
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "UTME Focus: ${theme.examTakeaway}",
                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                    color = Color(0xFFF57F17),
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

/**
 * Plot Stage Mini Item for Collapsible Row
 */
@Composable
fun PlotStageMiniItem(
    stageName: String,
    stage: PlotStage,
    modifier: Modifier = Modifier
) {
    Surface(
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f),
        shape = RoundedCornerShape(8.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(10.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stageName,
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = stage.subtitle,
                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                    color = Color(0xFFC2185B),
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(modifier = Modifier.height(3.dp))

            Text(
                text = stage.description,
                style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.5.sp),
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                lineHeight = 16.sp
            )

            if (stage.keyEvents.isNotEmpty()) {
                Spacer(modifier = Modifier.height(4.dp))
                stage.keyEvents.take(2).forEach { event ->
                    Row(
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier.padding(vertical = 1.dp)
                    ) {
                        Text(
                            text = "•",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color(0xFFC2185B),
                            modifier = Modifier.padding(end = 4.dp)
                        )
                        Text(
                            text = event,
                            style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.5.sp),
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }
    }
}
