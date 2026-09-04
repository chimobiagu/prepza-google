package com.example.ui.screens.literature

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
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
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
    val activeChapterNumber = (lastReadChapterIndex + 1).coerceIn(1, totalChapters.coerceAtLeast(1))
    val currentChapterTitle = bookData.chapters.getOrNull(lastReadChapterIndex)?.title ?: "Chapter $activeChapterNumber"

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
                            containerColor = PrimaryGreen.copy(alpha = 0.15f),
                            contentColor = PrimaryGreenDark
                        ),
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
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // 1. HERO HEADER: Book Cover, Meta & Reading Progress
            item {
                BookHeroHeaderCard(
                    bookData = bookData,
                    progressPercent = currentProgressPercent,
                    lastReadChapterIndex = lastReadChapterIndex,
                    totalChapters = totalChapters
                )
            }

            // 2. PRIMARY ACTION: Large "Continue Reading" or "Read The Book" Card
            item {
                PrimaryReadingActionCard(
                    bookData = bookData,
                    currentChapterNumber = activeChapterNumber,
                    currentChapterTitle = currentChapterTitle,
                    progressPercent = currentProgressPercent,
                    onContinueClick = { onContinueReading(lastReadChapterIndex) }
                )
            }

            // 3. SECTION HEADER
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, bottom = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "BOOK STUDY MODULES",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary,
                        letterSpacing = 1.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = "12 Comprehensive Sections",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            // 4. THE 12 TAPPABLE RECTANGULAR SECTION CARDS
            val sectionCards = listOf(
                SectionCardItem(
                    section = LiteratureSection.READER,
                    title = "1. Read The Book",
                    subtitle = "Complete legal text, comfortable reader, chapter navigation & dark mode",
                    icon = Icons.AutoMirrored.Filled.MenuBook,
                    accentColor = Color(0xFF1B5E20),
                    badge = "${bookData.chapters.size} Chapters"
                ),
                SectionCardItem(
                    section = LiteratureSection.SUMMARIES,
                    title = "2. Chapter Summaries",
                    subtitle = "Concise breakdown for every chapter with seamless sequential navigation",
                    icon = Icons.Default.Summarize,
                    accentColor = Color(0xFF0277BD),
                    badge = "Full Breakdown"
                ),
                SectionCardItem(
                    section = LiteratureSection.BACKGROUND,
                    title = "3. Background & Context",
                    subtitle = "Historical, social, and cultural context, publication circumstances & exam focus",
                    icon = Icons.Default.AccountBalance,
                    accentColor = Color(0xFF4527A0),
                    badge = "Context"
                ),
                SectionCardItem(
                    section = LiteratureSection.PLOT,
                    title = "4. Plot & Story Arc",
                    subtitle = "Beginning, major events, turning points, climax, and resolution breakdown",
                    icon = Icons.Default.Timeline,
                    accentColor = Color(0xFFC2185B),
                    badge = "5 Stages"
                ),
                SectionCardItem(
                    section = LiteratureSection.CHARACTERS,
                    title = "5. Characters & Profiles",
                    subtitle = "Protagonist, antagonists, major supporting cast, relationships & development",
                    icon = Icons.Default.PeopleAlt,
                    accentColor = Color(0xFFE65100),
                    badge = "${bookData.characters.size} Profiles"
                ),
                SectionCardItem(
                    section = LiteratureSection.THEMES,
                    title = "6. Themes & Motifs",
                    subtitle = "Core themes explained with story appearance, quotes, and exam takeaways",
                    icon = Icons.Default.Lightbulb,
                    accentColor = Color(0xFFF57F17),
                    badge = "${bookData.themes.size} Themes"
                ),
                SectionCardItem(
                    section = LiteratureSection.LITERARY_DEVICES,
                    title = "7. Literary Devices & Figures",
                    subtitle = "Metaphors, ironies, symbolism, and devices with exact text excerpts & analysis",
                    icon = Icons.Default.Psychology,
                    accentColor = Color(0xFF00695C),
                    badge = "${bookData.literaryDevices.size} Devices"
                ),
                SectionCardItem(
                    section = LiteratureSection.AUTHOR,
                    title = "8. Author Biography",
                    subtitle = "Author's background, notable works, literary era, and key exam facts",
                    icon = Icons.Default.Edit,
                    accentColor = Color(0xFF4E342E),
                    badge = "Bio & Works"
                ),
                SectionCardItem(
                    section = LiteratureSection.SETTING,
                    title = "9. Setting & Locations",
                    subtitle = "Where, when, social environments, and symbolic locations in the text",
                    icon = Icons.Default.Place,
                    accentColor = Color(0xFF2E7D32),
                    badge = "Locations"
                ),
                SectionCardItem(
                    section = LiteratureSection.EXAM_PREP,
                    title = "10. Exam Prep & Practice Quiz",
                    subtitle = "Interactive past UTME questions, quick quizzes, and instant scoring",
                    icon = Icons.Default.Quiz,
                    accentColor = Color(0xFF6A1B9A),
                    badge = "${bookData.practiceQuestions.size} Questions"
                ),
                SectionCardItem(
                    section = LiteratureSection.IMPORTANT_FACTS,
                    title = "11. Important High-Yield Facts",
                    subtitle = "Quick revision cards on characters, relationships, events, and twists",
                    icon = Icons.Default.PushPin,
                    accentColor = Color(0xFFD84315),
                    badge = "${bookData.importantFacts.size} Key Facts"
                ),
                SectionCardItem(
                    section = LiteratureSection.QUICK_REVISION,
                    title = "12. Quick Revision Sheet",
                    subtitle = "One-pager revision sheet synthesizing plot, characters, themes & 10 must-know facts",
                    icon = Icons.Default.Bolt,
                    accentColor = Color(0xFF00838F),
                    badge = "Must-Know"
                )
            )

            items(sectionCards.size) { index ->
                val card = sectionCards[index]
                LiteratureSectionCard(
                    cardItem = card,
                    onClick = { onOpenSection(card.section) }
                )
            }

            item {
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}

data class SectionCardItem(
    val section: LiteratureSection,
    val title: String,
    val subtitle: String,
    val icon: ImageVector,
    val accentColor: Color,
    val badge: String
)

@Composable
fun BookHeroHeaderCard(
    bookData: LiteratureBookStudyData,
    progressPercent: Int,
    lastReadChapterIndex: Int,
    totalChapters: Int,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top
            ) {
                // Book Cover Graphic Placeholder
                Box(
                    modifier = Modifier
                        .size(width = 80.dp, height = 110.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    bookData.coverAccentColor,
                                    bookData.coverAccentColor.copy(alpha = 0.8f)
                                )
                            )
                        )
                        .padding(8.dp),
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
                            modifier = Modifier.size(28.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = bookData.title.take(16),
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            maxLines = 2,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                Spacer(modifier = Modifier.width(16.dp))

                // Title, Author & Meta Details
                Column(modifier = Modifier.weight(1f)) {
                    // Category Badge
                    Surface(
                        color = MaterialTheme.colorScheme.primaryContainer,
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text(
                            text = bookData.category.uppercase(),
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = bookData.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.ExtraBold,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )

                    Text(
                        text = "By ${bookData.author}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontWeight = FontWeight.Medium
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.CollectionsBookmark,
                                contentDescription = null,
                                modifier = Modifier.size(14.dp),
                                tint = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                            Spacer(modifier = Modifier.width(3.dp))
                            Text(
                                text = "$totalChapters Chapters",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }

                        Text(
                            text = "•",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )

                        Text(
                            text = bookData.publicationYear.take(15),
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            // Reading Progress Section
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                    .padding(12.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = if (progressPercent > 0) "Reading Progress: Chapter ${lastReadChapterIndex + 1} of $totalChapters" else "Reading Progress: Not Started",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "$progressPercent%",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = if (progressPercent > 0) PrimaryGreen else MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))

                LinearProgressIndicator(
                    progress = { (progressPercent / 100f).coerceIn(0f, 1f) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = PrimaryGreen,
                    trackColor = MaterialTheme.colorScheme.outlineVariant
                )
            }
        }
    }
}

@Composable
fun PrimaryReadingActionCard(
    bookData: LiteratureBookStudyData,
    currentChapterNumber: Int,
    currentChapterTitle: String,
    progressPercent: Int,
    onContinueClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onContinueClick,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = PrimaryGreenDark
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = modifier
            .fillMaxWidth()
            .testTag("primary_reading_action_card")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(Color.White.copy(alpha = 0.2f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = if (progressPercent > 0) Icons.Default.PlayArrow else Icons.AutoMirrored.Filled.MenuBook,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = if (progressPercent > 0) "CONTINUE READING" else "START READING BOOK",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color.White.copy(alpha = 0.85f),
                    letterSpacing = 1.sp
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = currentChapterTitle,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.White,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = if (progressPercent > 0) "Resume from where you left off" else "Read full text with chapter navigation",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.White.copy(alpha = 0.75f)
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun LiteratureSectionCard(
    cardItem: SectionCardItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.5.dp),
        modifier = modifier
            .fillMaxWidth()
            .testTag("section_card_${cardItem.section.name.lowercase()}")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Icon Pill
            Box(
                modifier = Modifier
                    .size(44.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(cardItem.accentColor.copy(alpha = 0.12f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = cardItem.icon,
                    contentDescription = null,
                    tint = cardItem.accentColor,
                    modifier = Modifier.size(24.dp)
                )
            }

            Spacer(modifier = Modifier.width(14.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = cardItem.title,
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Surface(
                        color = cardItem.accentColor.copy(alpha = 0.1f),
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text(
                            text = cardItem.badge,
                            style = MaterialTheme.typography.labelSmall,
                            color = cardItem.accentColor,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(3.dp))

                Text(
                    text = cardItem.subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    lineHeight = 16.sp
                )
            }

            Spacer(modifier = Modifier.width(8.dp))

            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f),
                modifier = Modifier.size(18.dp)
            )
        }
    }
}
