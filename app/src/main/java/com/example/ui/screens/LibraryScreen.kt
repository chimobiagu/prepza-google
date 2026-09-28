package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.*
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
import com.example.data.db.LiteratureBookEntity
import com.example.data.literature.LiteratureRegistry
import com.example.ui.screens.literature.*
import com.example.ui.theme.*

enum class LibraryCategory(val label: String) {
    ALL("All"),
    PROSE("Prose"),
    POEMS("Poetry"),
    DRAMA("Drama")
}

@Composable
fun LibraryScreen(
    books: List<LiteratureBookEntity>,
    activeBook: LiteratureBookEntity?,
    activeChapterIndex: Int,
    onOpenBook: (LiteratureBookEntity) -> Unit,
    onSelectChapter: (Int) -> Unit,
    onCloseReader: () -> Unit,
    onProgressUpdated: ((bookId: String, chapterIndex: Int, progressPercent: Int) -> Unit)? = null,
    onAskAiTutor: ((prompt: String) -> Unit)? = null,
    onBack: (() -> Unit)? = null
) {
    if (activeBook != null) {
        val studyData = remember(activeBook.id, activeBook.title) {
            LiteratureRegistry.getOrCreateStudyData(activeBook)
        }
        var activeSection by remember(activeBook.id) { mutableStateOf(LiteratureSection.OVERVIEW) }
        var currentChapterIdx by remember(activeBook.id, activeChapterIndex) {
            mutableStateOf(if (activeChapterIndex >= 0) activeChapterIndex else activeBook.lastReadChapterIndex)
        }

        BackHandler(enabled = true) {
            if (activeSection != LiteratureSection.OVERVIEW) {
                activeSection = LiteratureSection.OVERVIEW
            } else {
                onCloseReader()
            }
        }

        when (activeSection) {
            LiteratureSection.OVERVIEW -> {
                BookOverviewScreen(
                    bookData = studyData,
                    currentProgressPercent = activeBook.readingProgressPercent,
                    lastReadChapterIndex = currentChapterIdx,
                    onBackToLibrary = onCloseReader,
                    onOpenSection = { section -> activeSection = section },
                    onContinueReading = { chIdx ->
                        currentChapterIdx = chIdx
                        onSelectChapter(chIdx)
                        activeSection = LiteratureSection.READER
                    },
                    onAskAiTutor = { title ->
                        onAskAiTutor?.invoke("Can you provide an in-depth UTME Literature study guide for $title?")
                    }
                )
            }
            LiteratureSection.READER -> {
                LiteratureReaderScreen(
                    bookData = studyData,
                    initialChapterIndex = currentChapterIdx,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW },
                    onProgressUpdated = { chIdx, percent ->
                        currentChapterIdx = chIdx
                        onSelectChapter(chIdx)
                        onProgressUpdated?.invoke(activeBook.id, chIdx, percent)
                    }
                )
            }
            LiteratureSection.SUMMARIES -> {
                ChapterSummariesScreen(
                    bookData = studyData,
                    initialChapterIndex = currentChapterIdx,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW },
                    onOpenFullChapter = { chIdx ->
                        currentChapterIdx = chIdx
                        onSelectChapter(chIdx)
                        activeSection = LiteratureSection.READER
                    }
                )
            }
            LiteratureSection.BACKGROUND -> {
                LiteratureBackgroundScreen(
                    bookData = studyData,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW }
                )
            }
            LiteratureSection.PLOT -> {
                LiteraturePlotScreen(
                    bookData = studyData,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW }
                )
            }
            LiteratureSection.CHARACTERS -> {
                LiteratureCharactersScreen(
                    bookData = studyData,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW }
                )
            }
            LiteratureSection.THEMES -> {
                LiteratureThemesScreen(
                    bookData = studyData,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW }
                )
            }
            LiteratureSection.LITERARY_DEVICES -> {
                LiteratureDevicesScreen(
                    bookData = studyData,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW }
                )
            }
            LiteratureSection.AUTHOR -> {
                LiteratureAuthorScreen(
                    bookData = studyData,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW }
                )
            }
            LiteratureSection.SETTING -> {
                LiteratureSettingScreen(
                    bookData = studyData,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW }
                )
            }
            LiteratureSection.EXAM_PREP -> {
                LiteratureExamPrepScreen(
                    bookData = studyData,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW }
                )
            }
            LiteratureSection.IMPORTANT_FACTS -> {
                LiteratureImportantFactsScreen(
                    bookData = studyData,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW }
                )
            }
            LiteratureSection.QUICK_REVISION -> {
                LiteratureQuickRevisionScreen(
                    bookData = studyData,
                    onBackToOverview = { activeSection = LiteratureSection.OVERVIEW }
                )
            }
        }
        return
    }

    var selectedCategory by remember { mutableStateOf(LibraryCategory.ALL) }

    val fallbackBooks = remember {
        listOf(
            LiteratureBookEntity(
                id = "book_1",
                title = "The Life Changer",
                author = "Khadijat Abubakar Jalli",
                category = "Compulsory UTME Prose",
                description = "Official general UTME text on university life, moral challenges, exams, and youthful decisions.",
                chaptersJson = "[]",
                readingProgressPercent = 55
            ),
            LiteratureBookEntity(
                id = "book_second_class_citizen",
                title = "Second-Class Citizen",
                author = "Buchi Emecheta",
                category = "African Prose",
                description = "Adah's heroic struggle for education and self-actualization against patriarchy and racial discrimination.",
                chaptersJson = "[]",
                readingProgressPercent = 40
            ),
            LiteratureBookEntity(
                id = "book_look_back_in_anger",
                title = "Look Back in Anger",
                author = "John Osborne",
                category = "Non-African Drama",
                description = "Post-war British realist drama centered on Jimmy Porter's disillusionment and marital conflict.",
                chaptersJson = "[]",
                readingProgressPercent = 20
            ),
            LiteratureBookEntity(
                id = "book_lion_jewel",
                title = "The Lion and the Jewel",
                author = "Wole Soyinka",
                category = "African Drama",
                description = "Wole Soyinka's satirical masterpiece exploring the contest between Baroka and Lakunle for Sidi.",
                chaptersJson = "[]",
                readingProgressPercent = 35
            ),
            LiteratureBookEntity(
                id = "book_wuthering_heights",
                title = "Wuthering Heights",
                author = "Emily Brontë",
                category = "Non-African Prose",
                description = "19th century gothic novel exploring the intense passion and vengeance of Heathcliff and Catherine.",
                chaptersJson = "[]",
                readingProgressPercent = 15
            ),
            LiteratureBookEntity(
                id = "book_she_walks_in_beauty",
                title = "She Walks in Beauty",
                author = "Lord Byron",
                category = "Selected UTME Poems",
                description = "Prescribed Romantic lyric poem with full text, stanza analysis, poetic devices, and past questions.",
                chaptersJson = "[]",
                readingProgressPercent = 90
            ),
            LiteratureBookEntity(
                id = "book_sweet_sixteen",
                title = "Sweet Sixteen",
                author = "Bolaji Abdullahi",
                category = "Compulsory UTME Prose",
                description = "Coming-of-age story of Aliya and her father's letter on self-identity, puberty, and moral growth.",
                chaptersJson = "[]",
                readingProgressPercent = 75
            ),
            LiteratureBookEntity(
                id = "book_modern_haiku",
                title = "Modern Haiku",
                author = "Selected UTME Poets",
                category = "Selected UTME Poems",
                description = "Radical brevity, season markers, and modern African epiphanies through 5-7-5 syllabic verse.",
                chaptersJson = "[]",
                readingProgressPercent = 50
            )
        )
    }

    val displayBooks = if (books.isNotEmpty()) books else fallbackBooks

    val filteredBooks = remember(displayBooks, selectedCategory) {
        when (selectedCategory) {
            LibraryCategory.ALL -> displayBooks
            LibraryCategory.POEMS -> displayBooks.filter {
                it.category.contains("Poem", ignoreCase = true) ||
                it.category.contains("Poetry", ignoreCase = true) ||
                it.title.contains("Poem", ignoreCase = true) ||
                it.title.contains("Haiku", ignoreCase = true) ||
                it.title.contains("She Walks", ignoreCase = true) ||
                it.id.contains("haiku") ||
                it.id.contains("beauty")
            }
            LibraryCategory.PROSE -> displayBooks.filter {
                it.category.contains("Prose", ignoreCase = true) ||
                it.category.contains("Novel", ignoreCase = true) ||
                it.id.contains("changer") ||
                it.id.contains("citizen") ||
                it.id.contains("heights") ||
                it.id.contains("sweet")
            }
            LibraryCategory.DRAMA -> displayBooks.filter {
                it.category.contains("Drama", ignoreCase = true) ||
                it.category.contains("Play", ignoreCase = true) ||
                it.id.contains("lion") ||
                it.id.contains("anger")
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBackground)
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        // Top Header
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            if (onBack != null) {
                Surface(
                    shape = CircleShape,
                    color = SurfaceWhite,
                    border = BorderStroke(1.dp, BorderSubtle),
                    modifier = Modifier
                        .size(38.dp)
                        .clip(CircleShape)
                        .clickable(onClick = onBack)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = TextPrimary,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.width(12.dp))
            }

            Column {
                Text(
                    text = "Library",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )
                Text(
                    text = "JAMB UTME Literature Texts",
                    style = MaterialTheme.typography.bodySmall,
                    color = TextSecondary
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Category Filter Chips
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(LibraryCategory.values()) { category ->
                val isSelected = selectedCategory == category
                FilterChip(
                    selected = isSelected,
                    onClick = { selectedCategory = category },
                    label = {
                        Text(
                            text = category.label,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                            style = MaterialTheme.typography.labelMedium
                        )
                    },
                    colors = FilterChipDefaults.filterChipColors(
                        selectedContainerColor = PrimaryGreen,
                        selectedLabelColor = Color.White,
                        containerColor = SurfaceWhite,
                        labelColor = TextPrimary
                    ),
                    border = FilterChipDefaults.filterChipBorder(
                        enabled = true,
                        selected = isSelected,
                        borderColor = BorderSubtle,
                        selectedBorderColor = PrimaryGreen
                    ),
                    shape = RoundedCornerShape(10.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Grid of Literature Books
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(filteredBooks) { book ->
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(170.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .clickable { onOpenBook(book) }
                        .testTag("book_cover_${book.id}"),
                    color = SurfaceWhite,
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, BorderSubtle)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        // Category Pill & Progress
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                color = PrimaryGreen.copy(alpha = 0.1f),
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                val catLabel = when {
                                    book.category.contains("Poem", ignoreCase = true) -> "POETRY"
                                    book.category.contains("Drama", ignoreCase = true) -> "DRAMA"
                                    else -> "PROSE"
                                }
                                Text(
                                    text = catLabel,
                                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 9.sp),
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryGreenDark,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }

                            Text(
                                text = "${book.readingProgressPercent}%",
                                style = MaterialTheme.typography.labelSmall.copy(fontSize = 11.sp),
                                fontWeight = FontWeight.Bold,
                                color = if (book.readingProgressPercent > 0) PrimaryGreen else TextSecondary
                            )
                        }

                        // Title & Author
                        Column {
                            Text(
                                text = book.title,
                                style = MaterialTheme.typography.titleMedium.copy(
                                    fontSize = 15.sp,
                                    lineHeight = 19.sp
                                ),
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = book.author,
                                style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp),
                                color = TextSecondary,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }

                        // Progress Bar
                        LinearProgressIndicator(
                            progress = { (book.readingProgressPercent / 100f).coerceIn(0f, 1f) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(3.dp)
                                .clip(RoundedCornerShape(2.dp)),
                            color = PrimaryGreen,
                            trackColor = BorderSubtle
                        )
                    }
                }
            }
        }
    }
}
