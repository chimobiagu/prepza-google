package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.db.LiteratureBookEntity
import com.example.ui.theme.*

enum class LibraryCategory(val label: String) {
    ALL("All Literature"),
    SELECTED_POEMS("Selected UTME Poems"),
    PROSE("Compulsory Prose"),
    DRAMA("UTME Drama")
}

enum class PoemReaderTab(val label: String) {
    FULL_POEM("Full Poem"),
    POETIC_DEVICES("Poetic Devices"),
    BACKGROUND("Background & Context"),
    STANZA_ANALYSIS("Stanzas & Themes"),
    UTME_QUIZ("UTME Quiz")
}

@Composable
fun LibraryScreen(
    books: List<LiteratureBookEntity>,
    activeBook: LiteratureBookEntity?,
    activeChapterIndex: Int,
    onOpenBook: (LiteratureBookEntity) -> Unit,
    onSelectChapter: (Int) -> Unit,
    onCloseReader: () -> Unit,
    onAskAiTutor: ((prompt: String) -> Unit)? = null,
    onBack: (() -> Unit)? = null
) {
    if (activeBook != null) {
        if (activeBook.id == "book_she_walks_in_beauty" || activeBook.title.contains("She Walks in Beauty", ignoreCase = true) || activeBook.title.contains("Poem", ignoreCase = true)) {
            PoemDedicatedReaderView(
                book = activeBook,
                onClose = onCloseReader,
                onAskAiTutor = onAskAiTutor
            )
        } else {
            GeneralLiteratureReaderView(
                book = activeBook,
                chapterIndex = activeChapterIndex,
                onSelectChapter = onSelectChapter,
                onClose = onCloseReader,
                onAskAiTutor = onAskAiTutor
            )
        }
        return
    }

    var selectedCategory by remember { mutableStateOf(LibraryCategory.ALL) }

    val fallbackBooks = remember {
        listOf(
            LiteratureBookEntity(
                id = "book_she_walks_in_beauty",
                title = "She Walks in Beauty",
                author = "Lord Byron (George Gordon)",
                category = "Selected UTME Poems",
                description = "Prescribed UTME Poem. Complete text, background summary, stanza breakdown, poetic devices, themes, and past questions.",
                chaptersJson = "[]",
                readingProgressPercent = 85
            ),
            LiteratureBookEntity(
                id = "book_1",
                title = "The Life Changer",
                author = "Khadija Abubakar Jalli",
                category = "Compulsory Prose",
                description = "A compulsory UTME novel about tertiary education realities, morals, and life lessons.",
                chaptersJson = "[]",
                readingProgressPercent = 45
            ),
            LiteratureBookEntity(
                id = "book_2",
                title = "Selected UTME Poems",
                author = "Various African & Non-African Poets",
                category = "Selected UTME Poems",
                description = "Comprehensive guide and analysis of official prescribed poems for JAMB UTME Literature.",
                chaptersJson = "[]",
                readingProgressPercent = 40
            ),
            LiteratureBookEntity(
                id = "book_sweet_sixteen",
                title = "Sweet Sixteen",
                author = "Bolaji Abdullahi",
                category = "Compulsory Prose",
                description = "Aliya's journey into adulthood, exploring self-identity, friendship, and family values.",
                chaptersJson = "[]",
                readingProgressPercent = 25
            ),
            LiteratureBookEntity(
                id = "book_lion_jewel",
                title = "The Lion and the Jewel",
                author = "Wole Soyinka",
                category = "UTME Drama",
                description = "Classic UTME drama pitting traditional African culture against modern western arrogance.",
                chaptersJson = "[]",
                readingProgressPercent = 15
            )
        )
    }

    val displayBooks = if (books.isNotEmpty()) {
        // Ensure "She Walks in Beauty" is in the display list if missing
        val hasSheWalks = books.any { it.id == "book_she_walks_in_beauty" || it.title.contains("She Walks in Beauty", ignoreCase = true) }
        if (!hasSheWalks) {
            listOf(fallbackBooks.first()) + books
        } else {
            books
        }
    } else {
        fallbackBooks
    }

    val filteredBooks = remember(displayBooks, selectedCategory) {
        when (selectedCategory) {
            LibraryCategory.ALL -> displayBooks
            LibraryCategory.SELECTED_POEMS -> displayBooks.filter { 
                it.category.contains("Poem", ignoreCase = true) || it.title.contains("Poem", ignoreCase = true) || it.title.contains("She Walks", ignoreCase = true)
            }
            LibraryCategory.PROSE -> displayBooks.filter { 
                it.category.contains("Prose", ignoreCase = true) || it.category.contains("Novel", ignoreCase = true) || it.id.contains("changer") || it.id.contains("sixteen")
            }
            LibraryCategory.DRAMA -> displayBooks.filter { 
                it.category.contains("Drama", ignoreCase = true) || it.category.contains("Play", ignoreCase = true) || it.id.contains("lion")
            }
        }
    }

    val bookColors = listOf(
        BookCoverGreen,
        BookCoverBlue,
        BookCoverPurple,
        BookCoverDark
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBackground)
            .padding(horizontal = 20.dp, vertical = 14.dp)
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

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "UTME Library & Literature",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )
                Text(
                    text = "Prescribed texts, poems & poetic device breakdowns",
                    style = MaterialTheme.typography.bodySmall,
                    color = TextSecondary
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Featured Hero Card for "She Walks in Beauty"
        val featuredPoem = displayBooks.find { it.id == "book_she_walks_in_beauty" || it.title.contains("She Walks in Beauty", ignoreCase = true) }
            ?: fallbackBooks.first()

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(18.dp))
                .clickable { onOpenBook(featuredPoem) }
                .testTag("featured_poem_card"),
            colors = CardDefaults.cardColors(containerColor = PrimaryGreen),
            shape = RoundedCornerShape(18.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = Color.White.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(20.dp)
                    ) {
                        Text(
                            text = "SELECTED UTME POEM",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                        )
                    }

                    Text(
                        text = "3 Stanzas • 18 Lines",
                        style = MaterialTheme.typography.labelSmall,
                        color = Color.White.copy(alpha = 0.85f),
                        fontWeight = FontWeight.Medium
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "She Walks in Beauty",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Text(
                    text = "By Lord Byron (George Gordon) • 1788–1824",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Medium,
                    color = Color.White.copy(alpha = 0.9f)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "“She walks in beauty, like the night / Of cloudless climes and starry skies…”",
                    style = MaterialTheme.typography.bodySmall.copy(fontStyle = FontStyle.Italic),
                    color = Color.White.copy(alpha = 0.8f)
                )

                Spacer(modifier = Modifier.height(14.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        listOf("Simile", "Antithesis", "ABABAB", "Iambic").forEach { tag ->
                            Surface(
                                color = Color.White.copy(alpha = 0.15f),
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text(
                                    text = tag,
                                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                                    color = Color.White,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }
                        }
                    }

                    Button(
                        onClick = { onOpenBook(featuredPoem) },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = PrimaryGreen),
                        shape = RoundedCornerShape(10.dp),
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp),
                        modifier = Modifier.height(34.dp)
                    ) {
                        Text("Study Guide", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

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
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
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
                    shape = RoundedCornerShape(12.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // Grid of Literature Items
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            verticalArrangement = Arrangement.spacedBy(14.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(filteredBooks) { book ->
                val index = displayBooks.indexOf(book)
                val coverColor = when {
                    book.id == "book_she_walks_in_beauty" -> BookCoverGreen
                    book.category.contains("Poem", ignoreCase = true) -> BookCoverBlue
                    book.id.contains("changer") -> BookCoverDark
                    book.id.contains("sixteen") -> BookCoverPurple
                    else -> bookColors.getOrElse(index % bookColors.size) { BookCoverGreen }
                }

                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(210.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .clickable { onOpenBook(book) }
                        .testTag("book_cover_${book.id}"),
                    color = coverColor,
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(14.dp),
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        // Top Header Tags
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                color = Color.White.copy(alpha = 0.25f),
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text(
                                    text = if (book.category.contains("Poem", ignoreCase = true)) "POEM" else "PROSE",
                                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                )
                            }

                            Text(
                                text = "${book.readingProgressPercent}% read",
                                style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                                fontWeight = FontWeight.Medium,
                                color = Color.White.copy(alpha = 0.85f)
                            )
                        }

                        // Middle: Book Title
                        Text(
                            text = book.title,
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontSize = 17.sp,
                                lineHeight = 22.sp
                            ),
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier.padding(vertical = 4.dp)
                        )

                        // Bottom: Author Name
                        Column {
                            Text(
                                text = book.author,
                                style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp),
                                fontWeight = FontWeight.Medium,
                                color = Color.White.copy(alpha = 0.85f),
                                maxLines = 1
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            LinearProgressIndicator(
                                progress = { (book.readingProgressPercent / 100f).coerceIn(0f, 1f) },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(4.dp)
                                    .clip(RoundedCornerShape(2.dp)),
                                color = AmberAccent,
                                trackColor = Color.White.copy(alpha = 0.25f),
                            )
                        }
                    }
                }
            }
        }
    }
}

// -------------------------------------------------------------
// DEDICATED POEM READER VIEW (FOR "SHE WALKS IN BEAUTY")
// -------------------------------------------------------------

data class UtmePoemQuizQuestion(
    val id: Int,
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PoemDedicatedReaderView(
    book: LiteratureBookEntity,
    onClose: () -> Unit,
    onAskAiTutor: ((prompt: String) -> Unit)? = null
) {
    BackHandler(onBack = onClose)

    var currentTab by remember { mutableStateOf(PoemReaderTab.FULL_POEM) }
    var selectedQuizAnswers by remember { mutableStateOf(mutableMapOf<Int, Int>()) }
    var showExplanationForQuestion by remember { mutableStateOf<Int?>(null) }

    val poemQuestions = remember {
        listOf(
            UtmePoemQuizQuestion(
                id = 1,
                question = "In the opening line 'She walks in beauty, like the night', what primary poetic device is used?",
                options = listOf(
                    "A) Metaphor",
                    "B) Simile",
                    "C) Hyperbole",
                    "D) Oxymoron"
                ),
                correctIndex = 1,
                explanation = "The poet uses explicit comparison using 'like' ('like the night / Of cloudless climes and starry skies') which makes it a Simile."
            ),
            UtmePoemQuizQuestion(
                id = 2,
                question = "What does the poet contrast with 'tender light' in the first stanza?",
                options = listOf(
                    "A) gaudy day",
                    "B) raven tress",
                    "C) nameless grace",
                    "D) cloudless climes"
                ),
                correctIndex = 0,
                explanation = "In line 6, the poet writes 'Which heaven to gaudy day denies', contrasting the soft, tender harmony of the lady's beauty with the harsh, showy brightness of 'gaudy day'."
            ),
            UtmePoemQuizQuestion(
                id = 3,
                question = "The phrase 'raven tress' (line 9) is a metaphor describing the lady's:",
                options = listOf(
                    "A) Dark dress",
                    "B) Glossy black hair",
                    "C) Heavy eyelashes",
                    "D) Sombre mood"
                ),
                correctIndex = 1,
                explanation = "A 'tress' is a lock of hair, and 'raven' refers to the jet-black, shiny bird. 'Raven tress' is a classic literary metaphor for glossy black hair."
            ),
            UtmePoemQuizQuestion(
                id = 4,
                question = "What is the rhyme scheme of each six-line stanza (sestet) in 'She Walks in Beauty'?",
                options = listOf(
                    "A) AABBCC",
                    "B) ABBAAB",
                    "C) ABABAB",
                    "D) ABCABC"
                ),
                correctIndex = 2,
                explanation = "Every stanza follows a strict alternate rhyme scheme: ABABAB (e.g. night/skies/bright/eyes/light/denies)."
            ),
            UtmePoemQuizQuestion(
                id = 5,
                question = "In the final stanza, the lady's physical beauty (smiles and tints) serves as evidence of:",
                options = listOf(
                    "A) Her great wealth and high social status",
                    "B) A mind at peace and days spent in moral goodness",
                    "C) Her grief over a lost lover",
                    "D) Pride in her royal heritage"
                ),
                correctIndex = 1,
                explanation = "The poem concludes that her glowing smiles 'tell of days in goodness spent, / A mind at peace with all below, / A heart whose love is innocent!', linking physical beauty directly with inner moral purity."
            )
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text("She Walks in Beauty", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                        Text("Lord Byron (George Gordon) • UTME Guide", style = MaterialTheme.typography.bodySmall, color = TextSecondary)
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onClose, modifier = Modifier.testTag("reader_back_btn")) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    if (onAskAiTutor != null) {
                        IconButton(
                            onClick = {
                                onAskAiTutor("Explain the poetic devices and central themes in Lord Byron's poem 'She Walks in Beauty' for JAMB UTME Literature in English.")
                            }
                        ) {
                            Icon(Icons.Filled.AutoAwesome, contentDescription = "Ask AI Tutor", tint = PrimaryGreen)
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = SurfaceWhite)
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(AppBackground)
        ) {
            // Scrollable Sub-tabs
            ScrollableTabRow(
                selectedTabIndex = currentTab.ordinal,
                containerColor = SurfaceWhite,
                contentColor = PrimaryGreen,
                edgePadding = 16.dp,
                divider = { HorizontalDivider(color = BorderSubtle) }
            ) {
                PoemReaderTab.values().forEach { tab ->
                    val isSelected = currentTab == tab
                    Tab(
                        selected = isSelected,
                        onClick = { currentTab = tab },
                        text = {
                            Text(
                                text = tab.label,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                color = if (isSelected) PrimaryGreen else TextSecondary,
                                style = MaterialTheme.typography.labelLarge
                            )
                        }
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(20.dp)
            ) {
                when (currentTab) {
                    PoemReaderTab.FULL_POEM -> {
                        FullPoemTextSection(onAskAiTutor = onAskAiTutor)
                    }
                    PoemReaderTab.POETIC_DEVICES -> {
                        PoeticDevicesSection()
                    }
                    PoemReaderTab.BACKGROUND -> {
                        BackgroundContextSection()
                    }
                    PoemReaderTab.STANZA_ANALYSIS -> {
                        StanzaAnalysisSection()
                    }
                    PoemReaderTab.UTME_QUIZ -> {
                        UtmeQuizSection(
                            questions = poemQuestions,
                            userAnswers = selectedQuizAnswers,
                            onSelectAnswer = { qId, optIdx ->
                                val newMap = selectedQuizAnswers.toMutableMap()
                                newMap[qId] = optIdx
                                selectedQuizAnswers = newMap
                                showExplanationForQuestion = qId
                            },
                            onResetQuiz = {
                                selectedQuizAnswers = mutableMapOf()
                                showExplanationForQuestion = null
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun FullPoemTextSection(onAskAiTutor: ((prompt: String) -> Unit)?) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, BorderSubtle)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(22.dp)
            ) {
                Text(
                    text = "She Walks in Beauty",
                    style = MaterialTheme.typography.headlineMedium.copy(fontSize = 24.sp),
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Text(
                    text = "By Lord Byron (George Gordon)",
                    style = MaterialTheme.typography.bodyMedium.copy(fontStyle = FontStyle.Italic),
                    color = TextSecondary,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(6.dp))
                HorizontalDivider(color = BorderSubtle, modifier = Modifier.padding(vertical = 12.dp))

                // Stanza 1
                StanzaBlock(
                    stanzaNumber = 1,
                    rhymeTags = listOf("night (A)", "skies (B)", "bright (A)", "eyes (B)", "light (A)", "denies (B)"),
                    lines = listOf(
                        "1" to "She walks in beauty, like the night",
                        "2" to "Of cloudless climes and starry skies;",
                        "3" to "And all that’s best of dark and bright",
                        "4" to "Meet in her aspect and her eyes;",
                        "5" to "Thus mellowed to that tender light",
                        "6" to "Which heaven to gaudy day denies."
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Stanza 2
                StanzaBlock(
                    stanzaNumber = 2,
                    rhymeTags = listOf("less (C)", "grace (D)", "tress (C)", "face (D)", "express (C)", "place (D)"),
                    lines = listOf(
                        "7" to "One shade the more, one ray the less,",
                        "8" to "Had half impaired the nameless grace",
                        "9" to "Which waves in every raven tress,",
                        "10" to "Or softly lightens o’er her face;",
                        "11" to "Where thoughts serenely sweet express,",
                        "12" to "How pure, how dear their dwelling-place."
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Stanza 3
                StanzaBlock(
                    stanzaNumber = 3,
                    rhymeTags = listOf("brow (E)", "eloquent (F)", "glow (E)", "spent (F)", "below (E)", "innocent (F)"),
                    lines = listOf(
                        "13" to "And on that cheek, and o’er that brow,",
                        "14" to "So soft, so calm, yet eloquent,",
                        "15" to "The smiles that win, the tints that glow,",
                        "16" to "But tell of days in goodness spent,",
                        "17" to "A mind at peace with all below,",
                        "18" to "A heart whose love is innocent!"
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Surface(
                    color = AppBackground,
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Public Domain • Lord Byron (1788–1824) • Prescribed UTME Poem",
                        style = MaterialTheme.typography.labelSmall,
                        color = TextSecondary,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }

        if (onAskAiTutor != null) {
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    onAskAiTutor("Can you explain line 7 of 'She Walks in Beauty' ('One shade the more, one ray the less') and what it signifies for UTME?")
                },
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Icon(Icons.Filled.AutoAwesome, contentDescription = null, modifier = Modifier.size(18.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Text("Ask AI Tutor to Analyze Lines", fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun StanzaBlock(
    stanzaNumber: Int,
    rhymeTags: List<String>,
    lines: List<Pair<String, String>>
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "STANZA $stanzaNumber",
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryGreen
            )

            Text(
                text = "Rhyme: ABABAB",
                style = MaterialTheme.typography.labelSmall,
                color = TextSecondary
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        lines.forEach { (lineNum, text) ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 3.dp),
                verticalAlignment = Alignment.Top
            ) {
                Text(
                    text = lineNum.padStart(2, ' '),
                    style = MaterialTheme.typography.bodySmall.copy(fontSize = 11.sp),
                    color = TextSecondary.copy(alpha = 0.6f),
                    modifier = Modifier.width(28.dp)
                )

                Text(
                    text = text,
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 16.sp,
                        lineHeight = 24.sp
                    ),
                    fontWeight = FontWeight.Medium,
                    color = TextPrimary
                )
            }
        }
    }
}

@Composable
fun PoeticDevicesSection() {
    val devices = listOf(
        Triple(
            "1. Simile",
            "“She walks in beauty, like the night\nOf cloudless climes and starry skies;” (Lines 1–2)",
            "Lord Byron explicitly compares the lady's graceful movement and aura to a tranquil, starry, cloudless night. Unlike common daytime comparisons, the night represents soothing serenity, mystery, and gentle radiance."
        ),
        Triple(
            "2. Antithesis / Contrast",
            "“And all that’s best of dark and bright” (Line 3)\n“One shade the more, one ray the less” (Line 7)\n“tender light / Which heaven to gaudy day denies” (Lines 5–6)",
            "The poet continually juxtaposes opposites ('dark' vs. 'bright', 'shade' vs. 'ray', 'tender light' vs. 'gaudy day') to emphasize that her beauty is not extreme, but a flawless harmony of contrasting forces."
        ),
        Triple(
            "3. Alliteration",
            "• “cloudless climes” (Line 2) — repetition of /k/ sound\n• “starry skies” (Line 2) — repetition of /s/ sound\n• “serenely sweet” (Line 11) — repetition of /s/ sound\n• “days in goodness spent” (Line 16) — /d/ & /s/ sounds",
            "Alliteration creates musicality, lyricism, and a soothing cadence that reinforces the gentle, harmonious theme of the poem."
        ),
        Triple(
            "4. Metaphor & Imagery",
            "• “raven tress” (Line 9) — Metaphor comparing her dark locks to the black feathers of a raven.\n• “dwelling-place” (Line 12) — Metaphor for her mind as a sanctuary for pure thoughts.",
            "Visual imagery (starry skies, tender light, glowing tints) brings her serene countenance to life without resorting to vulgar or physical descriptions."
        ),
        Triple(
            "5. Personification",
            "• “Which heaven to gaudy day denies” (Line 6)\n• “thoughts serenely sweet express” (Line 11)\n• “The smiles that win, the tints that glow” (Line 15)",
            "Day is portrayed as 'gaudy' (showy, boastful), heaven is depicted as having moral will, and thoughts/smiles are personified as active agents expressing her pure soul."
        ),
        Triple(
            "6. Synecdoche",
            "“cheek”, “brow”, “smiles”, “heart”, “aspect”, “eyes”",
            "Byron references specific parts of her face and anatomy to stand for her entire persona, moral nobility, and spiritual goodness."
        ),
        Triple(
            "7. Rhyme Scheme & Stanza Structure",
            "Regular ABABAB in three 6-line stanzas (sestets)",
            "Each stanza has six lines with strict alternate rhyming (Stanza 1: night/skies/bright/eyes/light/denies; Stanza 2: less/grace/tress/face/express/place; Stanza 3: brow/eloquent/glow/spent/below/innocent). The symmetry reflects her balanced character."
        ),
        Triple(
            "8. Meter & Rhythm",
            "Iambic Tetrameter (4 iambic feet per line / 8 syllables)",
            "Follows a steady da-DUM da-DUM da-DUM da-DUM rhythm (e.g. 'She WALKS in BEAU-ty, LIKE the NIGHT'). This regular rhythm mimics a graceful, measured walking pace."
        ),
        Triple(
            "9. Enjambment (Run-on Lines)",
            "Lines 1–2, 3–4, 8–9 flow without terminal punctuation.",
            "Enjambment allows thoughts to spill over naturally into succeeding lines, creating a smooth, unbroken lyrical flow."
        )
    )

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Poetic Devices & Literary Figures",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = TextPrimary
        )
        Text(
            text = "Crucial for JAMB UTME Literature-in-English questions",
            style = MaterialTheme.typography.bodySmall,
            color = TextSecondary
        )

        Spacer(modifier = Modifier.height(16.dp))

        devices.forEach { (name, example, explanation) ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 12.dp),
                colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                shape = RoundedCornerShape(14.dp),
                border = BorderStroke(1.dp, BorderSubtle)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = name,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryGreen
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Surface(
                        color = AppBackground,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = example,
                            style = MaterialTheme.typography.bodySmall.copy(fontStyle = FontStyle.Italic),
                            fontWeight = FontWeight.Medium,
                            color = TextPrimary,
                            modifier = Modifier.padding(10.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = explanation,
                        style = MaterialTheme.typography.bodyMedium,
                        lineHeight = 22.sp,
                        color = TextPrimary
                    )
                }
            }
        }
    }
}

@Composable
fun BackgroundContextSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, BorderSubtle)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Text(
                    text = "Background & Historical Context",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )

                HorizontalDivider(color = BorderSubtle, modifier = Modifier.padding(vertical = 12.dp))

                ContextItem(
                    title = "The Poet: Lord Byron (1788–1824)",
                    body = "George Gordon Byron, 6th Baron Byron, was a leading British Romantic poet known for his brilliant lyricism and flamboyant lifestyle. Alongside Percy Bysshe Shelley, John Keats, and William Wordsworth, he helped define the Romantic Movement."
                )

                Spacer(modifier = Modifier.height(14.dp))

                ContextItem(
                    title = "Inspiration: Mrs. Anne Beatrix Wilmot",
                    body = "On June 11, 1814, Lord Byron attended an evening party hosted by Lady Sitwell in London. There he saw his cousin-by-marriage, Mrs. Anne Beatrix Wilmot. She was in mourning, wearing a flowing black gown adorned with shimmering silver spangles. Struck by the sublime contrast between the dark gown, her fair skin, and dark hair, Byron was inspired to write this poem the very next morning."
                )

                Spacer(modifier = Modifier.height(14.dp))

                ContextItem(
                    title = "Publication: Hebrew Melodies (1815)",
                    body = "The poem was published in April 1815 as the opening piece of Byron's collection 'Hebrew Melodies', set to traditional Jewish tunes arranged by Isaac Nathan."
                )

                Spacer(modifier = Modifier.height(14.dp))

                ContextItem(
                    title = "Significance in JAMB UTME",
                    body = "This poem frequently appears in UTME Literature-in-English exams to test students' mastery of Romantic poetry, figures of speech (similes, antithesis, alliteration), rhyme scheme (ABABAB), iambic tetrameter, and the concept of harmony between inner virtue and outer beauty."
                )
            }
        }
    }
}

@Composable
fun ContextItem(title: String, body: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Bold,
            color = PrimaryGreen
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = body,
            style = MaterialTheme.typography.bodyMedium,
            lineHeight = 22.sp,
            color = TextPrimary
        )
    }
}

@Composable
fun StanzaAnalysisSection() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Stanza-by-Stanza Breakdown & Themes",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = TextPrimary
        )

        Spacer(modifier = Modifier.height(14.dp))

        // Stanza 1
        AnalysisCard(
            title = "Stanza 1: Cosmic Harmony (Lines 1–6)",
            keyQuote = "“She walks in beauty, like the night / Of cloudless climes and starry skies…”",
            analysis = "Byron introduces the lady's beauty not through daytime imagery (which he dismisses as 'gaudy'), but through a clear, star-filled night. Her face ('aspect') and eyes achieve a harmonious synthesis of darkness and brightness, creating a soft, tender light."
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Stanza 2
        AnalysisCard(
            title = "Stanza 2: Perfect Equilibrium & Mind (Lines 7–12)",
            keyQuote = "“One shade the more, one ray the less, / Had half impaired the nameless grace…”",
            analysis = "The poet emphasizes that her beauty is in such precise equilibrium that even the slightest alteration would ruin her 'nameless grace'. Her dark locks ('raven tress') frame a face whose serenity reveals an intellect and mind that are pure and holy."
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Stanza 3
        AnalysisCard(
            title = "Stanza 3: Moral Purity & Innocent Love (Lines 13–18)",
            keyQuote = "“The smiles that win, the tints that glow, / But tell of days in goodness spent…”",
            analysis = "The climax links physical beauty to moral nobility. Her soft smiles and glowing cheeks are not merely decorative; they are the external reflection of a virtuous life ('days in goodness spent'), a peaceful conscience, and a heart full of chaste, innocent love."
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Central Themes
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
            shape = RoundedCornerShape(16.dp),
            border = BorderStroke(1.dp, BorderSubtle)
        ) {
            Column(modifier = Modifier.padding(18.dp)) {
                Text(
                    text = "Core Themes for UTME",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryGreen
                )

                Spacer(modifier = Modifier.height(10.dp))

                ThemeBullet("1. Harmony of Opposites", "Darkness and light blend into a peaceful, tender balance rather than conflicting with each other.")
                ThemeBullet("2. Physical Beauty as a Mirror of Inner Virtue", "External grace is an outward sign of internal innocence, goodness, and moral purity.")
                ThemeBullet("3. Chaste & Reverent Love", "The speaker admires her with pure, sacred respect and worship rather than physical desire.")
                ThemeBullet("4. Serenity and Tranquility", "Her calm presence brings peace to the observer, echoing the stillness of a starry night.")
            }
        }
    }
}

@Composable
fun ThemeBullet(title: String, desc: String) {
    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
        Text(text = title, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodyMedium, color = TextPrimary)
        Text(text = desc, style = MaterialTheme.typography.bodySmall, color = TextSecondary, lineHeight = 18.sp)
    }
}

@Composable
fun AnalysisCard(title: String, keyQuote: String, analysis: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
        shape = RoundedCornerShape(14.dp),
        border = BorderStroke(1.dp, BorderSubtle)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
            Spacer(modifier = Modifier.height(6.dp))
            Surface(color = AppBackground, shape = RoundedCornerShape(8.dp), modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = keyQuote,
                    style = MaterialTheme.typography.bodySmall.copy(fontStyle = FontStyle.Italic),
                    color = TextPrimary,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = analysis, style = MaterialTheme.typography.bodyMedium, lineHeight = 22.sp, color = TextPrimary)
        }
    }
}

@Composable
fun UtmeQuizSection(
    questions: List<UtmePoemQuizQuestion>,
    userAnswers: Map<Int, Int>,
    onSelectAnswer: (Int, Int) -> Unit,
    onResetQuiz: () -> Unit
) {
    val totalAnswered = userAnswers.size
    val correctCount = questions.count { q -> userAnswers[q.id] == q.correctIndex }

    Column(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = "UTME Exam Practice",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )
                Text(
                    text = "Score: $correctCount / ${questions.size} completed",
                    style = MaterialTheme.typography.bodySmall,
                    color = PrimaryGreen,
                    fontWeight = FontWeight.Bold
                )
            }

            if (totalAnswered > 0) {
                TextButton(onClick = onResetQuiz) {
                    Text("Reset Quiz", color = IncorrectRed, fontWeight = FontWeight.Bold)
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        questions.forEachIndexed { idx, q ->
            val userSelected = userAnswers[q.id]
            val isAnswered = userSelected != null

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 14.dp),
                colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                shape = RoundedCornerShape(14.dp),
                border = BorderStroke(1.dp, BorderSubtle)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Question ${idx + 1}",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryGreen
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = q.question,
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.SemiBold,
                        color = TextPrimary
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    q.options.forEachIndexed { optIdx, optText ->
                        val isSelected = userSelected == optIdx
                        val isCorrect = optIdx == q.correctIndex

                        val containerColor = when {
                            !isAnswered -> SurfaceWhite
                            isSelected && isCorrect -> PrimaryGreen.copy(alpha = 0.12f)
                            isSelected && !isCorrect -> IncorrectRed.copy(alpha = 0.12f)
                            isCorrect -> PrimaryGreen.copy(alpha = 0.12f)
                            else -> SurfaceWhite
                        }

                        val borderColor = when {
                            !isAnswered -> BorderSubtle
                            isSelected && isCorrect -> PrimaryGreen
                            isSelected && !isCorrect -> IncorrectRed
                            isCorrect -> PrimaryGreen
                            else -> BorderSubtle
                        }

                        Surface(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .clickable { onSelectAnswer(q.id, optIdx) },
                            color = containerColor,
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.5.dp, borderColor)
                        ) {
                            Row(
                                modifier = Modifier.padding(12.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = optText,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = if (isSelected || (isAnswered && isCorrect)) FontWeight.Bold else FontWeight.Normal,
                                    color = TextPrimary,
                                    modifier = Modifier.weight(1f)
                                )

                                if (isAnswered) {
                                    if (isCorrect) {
                                        Icon(Icons.Filled.CheckCircle, contentDescription = "Correct", tint = PrimaryGreen, modifier = Modifier.size(20.dp))
                                    } else if (isSelected) {
                                        Icon(Icons.Filled.Cancel, contentDescription = "Incorrect", tint = IncorrectRed, modifier = Modifier.size(20.dp))
                                    }
                                }
                            }
                        }
                    }

                    if (isAnswered) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Surface(
                            color = AppBackground,
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(
                                    text = "Explanation:",
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = PrimaryGreen
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = q.explanation,
                                    style = MaterialTheme.typography.bodySmall,
                                    lineHeight = 18.sp,
                                    color = TextPrimary
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

// -------------------------------------------------------------
// GENERAL LITERATURE READER (FOR NOVELS & PROSE)
// -------------------------------------------------------------

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GeneralLiteratureReaderView(
    book: LiteratureBookEntity,
    chapterIndex: Int,
    onSelectChapter: (Int) -> Unit,
    onClose: () -> Unit,
    onAskAiTutor: ((prompt: String) -> Unit)? = null
) {
    BackHandler(onBack = onClose)

    val chapters = remember(book) {
        listOf(
            "Chapter 1: The New Horizon" to """
                Ummi had always been fascinated by university life. Sitting under the shade of the mango tree in her father's compound in Kano, she contemplated her journey into tertiary education. Getting admission into the university was not just a personal achievement for Ummi; it was a testament to her parents' sacrifices and her own tireless devotion to study.
                
                When the news of her admission broke, the household erupted in joy. Her mother wept tears of gratitude, while her father handed her an envelope containing her registration fees and words of eternal wisdom.
                
                "Education is the true life changer," her father told her, gazing solemnly into her eyes. "It gives you the wings to fly, but your character will determine how high you soar."
                
                Ummi held those words close to her heart as the long-awaited departure date approached. Her journey would test her resolve in ways she had never imagined.
            """.trimIndent(),
            "Chapter 2: Registration & Realities" to """
                Navigating the bustling campus on her first morning was overwhelming. Thousands of freshmen milled around the administrative complex, each carrying thick brown envelopes containing credentials, passports, and high hopes.
                
                Ummi met Salma, a sharp-tongued sophomore who seemed to know every shortcut on campus. Salma offered to help her skip the long queues, but at a price.
                
                "In this university, nobody gets anything for free," Salma whispered confidentially. Ummi remembered her father's warning about integrity and politely declined, choosing to wait in line like everyone else.
                
                It took six painstaking hours, but when her registration slip was stamped, her conscience was clean. She realized that shortcut temptations would appear frequently, and standing firm was her only armor.
            """.trimIndent()
        )
    }

    val currentChapter = chapters.getOrElse(chapterIndex) { chapters.first() }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(book.title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                        Text(currentChapter.first, style = MaterialTheme.typography.bodySmall, color = TextSecondary)
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onClose, modifier = Modifier.testTag("reader_back_btn")) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    if (onAskAiTutor != null) {
                        IconButton(
                            onClick = {
                                onAskAiTutor("Explain the key themes, moral lessons, and character developments in ${book.title} for UTME.")
                            }
                        ) {
                            Icon(Icons.Filled.AutoAwesome, contentDescription = "Ask AI Tutor", tint = PrimaryGreen)
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = AppBackground)
            )
        },
        bottomBar = {
            Surface(
                color = SurfaceWhite,
                shadowElevation = 6.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = { if (chapterIndex > 0) onSelectChapter(chapterIndex - 1) },
                        enabled = chapterIndex > 0,
                        colors = ButtonDefaults.buttonColors(containerColor = BorderSubtle, contentColor = TextPrimary),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Prev Chapter", fontWeight = FontWeight.Bold)
                    }

                    Text(
                        text = "${chapterIndex + 1} / ${chapters.size}",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold
                    )

                    Button(
                        onClick = { if (chapterIndex < chapters.size - 1) onSelectChapter(chapterIndex + 1) },
                        enabled = chapterIndex < chapters.size - 1,
                        colors = ButtonDefaults.buttonColors(containerColor = TextPrimary, contentColor = Color.White),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("Next Chapter", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(16.dp))
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(AppBackground)
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {
            Text(
                text = currentChapter.first,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = TextPrimary
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = currentChapter.second,
                style = MaterialTheme.typography.bodyLarge,
                lineHeight = 28.sp,
                color = TextPrimary
            )

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}
