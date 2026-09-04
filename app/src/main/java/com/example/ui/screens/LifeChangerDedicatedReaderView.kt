package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.db.LiteratureBookEntity
import com.example.data.repository.TheLifeChangerCompleteBook
import com.example.ui.theme.*

enum class LifeChangerTab(val label: String, val icon: androidx.compose.ui.graphics.vector.ImageVector) {
    READ_BOOK("Read Book", Icons.AutoMirrored.Filled.MenuBook),
    POETIC_DEVICES("Literary Devices", Icons.Filled.Psychology),
    BACKGROUND("Background & Author", Icons.Filled.Info),
    SUMMARIES("Chapter Summaries", Icons.Filled.FormatListNumbered),
    CHARACTERS("Characters", Icons.Filled.People),
    THEMES("Themes & Morals", Icons.Filled.Lightbulb),
    UTME_QUIZ("UTME Quiz", Icons.Filled.Quiz)
}

enum class ReadingTheme(val label: String, val bg: Color, val text: Color, val accent: Color) {
    DAY("Day", Color(0xFFFAF9F6), Color(0xFF1E293B), PrimaryGreen),
    SEPIA("Sepia", Color(0xFFF7EEDD), Color(0xFF432C0F), Color(0xFF8D5B18)),
    NIGHT("Night", Color(0xFF121824), Color(0xFFE2E8F0), Color(0xFF38BDF8))
}

enum class BookReadMode(val label: String) {
    CHAPTER_BY_CHAPTER("Chapter by Chapter"),
    ENTIRE_BOOK("Continuous Full Novel")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LifeChangerDedicatedReaderView(
    book: LiteratureBookEntity,
    initialChapterIndex: Int = 0,
    onClose: () -> Unit,
    onAskAiTutor: ((prompt: String) -> Unit)? = null
) {
    BackHandler(onBack = onClose)

    var currentTab by remember { mutableStateOf(LifeChangerTab.READ_BOOK) }
    var selectedChapterIndex by remember { mutableIntStateOf(initialChapterIndex.coerceIn(0, 8)) }
    var readMode by remember { mutableStateOf(BookReadMode.CHAPTER_BY_CHAPTER) }
    var readingTheme by remember { mutableStateOf(ReadingTheme.DAY) }
    var fontSizeMultiplier by remember { mutableFloatStateOf(1.0f) } // 0.85f to 1.35f
    var showChapterSelectorSheet by remember { mutableStateOf(false) }

    // Quiz state
    var selectedQuizAnswers by remember { mutableStateOf(mutableMapOf<Int, Int>()) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "The Life Changer",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Khadijat Abubakar Jalli • Mandatory UTME Novel",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onClose, modifier = Modifier.testTag("life_changer_back_btn")) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    if (currentTab == LifeChangerTab.READ_BOOK) {
                        // Reader customizer controls (font size & reading theme)
                        IconButton(
                            onClick = {
                                readingTheme = when (readingTheme) {
                                    ReadingTheme.DAY -> ReadingTheme.SEPIA
                                    ReadingTheme.SEPIA -> ReadingTheme.NIGHT
                                    ReadingTheme.NIGHT -> ReadingTheme.DAY
                                }
                            }
                        ) {
                            Icon(
                                imageVector = when (readingTheme) {
                                    ReadingTheme.DAY -> Icons.Outlined.LightMode
                                    ReadingTheme.SEPIA -> Icons.Filled.Palette
                                    ReadingTheme.NIGHT -> Icons.Filled.DarkMode
                                },
                                contentDescription = "Reading Theme: ${readingTheme.label}",
                                tint = if (readingTheme == ReadingTheme.NIGHT) Color(0xFF38BDF8) else PrimaryGreen
                            )
                        }

                        IconButton(
                            onClick = {
                                fontSizeMultiplier = if (fontSizeMultiplier >= 1.25f) 0.9f else fontSizeMultiplier + 0.15f
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.FormatSize,
                                contentDescription = "Adjust Font Size",
                                tint = TextPrimary
                            )
                        }

                        IconButton(onClick = { showChapterSelectorSheet = true }) {
                            Icon(imageVector = Icons.Filled.Toc, contentDescription = "Table of Contents", tint = TextPrimary)
                        }
                    }

                    if (onAskAiTutor != null) {
                        IconButton(
                            onClick = {
                                onAskAiTutor("Explain the central themes, literary devices, and character development in 'The Life Changer' for JAMB UTME Literature.")
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Filled.AutoAwesome,
                                contentDescription = "Ask AI Tutor",
                                tint = PrimaryGreen
                            )
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
            // Scrollable Category Navigation Tabs
            ScrollableTabRow(
                selectedTabIndex = currentTab.ordinal,
                containerColor = SurfaceWhite,
                contentColor = PrimaryGreen,
                edgePadding = 16.dp,
                divider = { HorizontalDivider(color = BorderSubtle) }
            ) {
                LifeChangerTab.values().forEach { tab ->
                    val isSelected = currentTab == tab
                    Tab(
                        selected = isSelected,
                        onClick = { currentTab = tab },
                        text = {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = tab.icon,
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp),
                                    tint = if (isSelected) PrimaryGreen else TextSecondary
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = tab.label,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                    color = if (isSelected) PrimaryGreen else TextSecondary,
                                    fontSize = 13.sp
                                )
                            }
                        }
                    )
                }
            }

            // Tab Content
            when (currentTab) {
                LifeChangerTab.READ_BOOK -> {
                    LifeChangerReadBookTab(
                        readingTheme = readingTheme,
                        fontSizeMultiplier = fontSizeMultiplier,
                        readMode = readMode,
                        onToggleReadMode = {
                            readMode = if (readMode == BookReadMode.CHAPTER_BY_CHAPTER) BookReadMode.ENTIRE_BOOK else BookReadMode.CHAPTER_BY_CHAPTER
                        },
                        selectedChapterIndex = selectedChapterIndex,
                        onSelectChapter = { selectedChapterIndex = it },
                        onOpenToc = { showChapterSelectorSheet = true },
                        onAskAiTutor = onAskAiTutor
                    )
                }
                LifeChangerTab.POETIC_DEVICES -> {
                    LifeChangerLiteraryDevicesTab(onAskAiTutor = onAskAiTutor)
                }
                LifeChangerTab.BACKGROUND -> {
                    LifeChangerBackgroundTab(onAskAiTutor = onAskAiTutor)
                }
                LifeChangerTab.SUMMARIES -> {
                    LifeChangerSummariesTab(
                        onSelectChapterToRead = { chIndex ->
                            selectedChapterIndex = chIndex
                            currentTab = LifeChangerTab.READ_BOOK
                        }
                    )
                }
                LifeChangerTab.CHARACTERS -> {
                    LifeChangerCharactersTab(onAskAiTutor = onAskAiTutor)
                }
                LifeChangerTab.THEMES -> {
                    LifeChangerThemesTab(onAskAiTutor = onAskAiTutor)
                }
                LifeChangerTab.UTME_QUIZ -> {
                    LifeChangerQuizTab(
                        selectedAnswers = selectedQuizAnswers,
                        onSelectAnswer = { qId, optIndex ->
                            selectedQuizAnswers = selectedQuizAnswers.toMutableMap().apply { put(qId, optIndex) }
                        },
                        onResetQuiz = {
                            selectedQuizAnswers = mutableMapOf()
                        }
                    )
                }
            }
        }
    }

    if (showChapterSelectorSheet) {
        ModalBottomSheet(
            onDismissRequest = { showChapterSelectorSheet = false },
            containerColor = SurfaceWhite
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Table of Contents",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    Text(
                        text = "9 Chapters (Complete)",
                        style = MaterialTheme.typography.bodySmall,
                        color = PrimaryGreen,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                LazyColumn(modifier = Modifier.fillMaxWidth().heightIn(max = 420.dp)) {
                    items(TheLifeChangerCompleteBook.chapters) { ch ->
                        val isCurrent = ch.chapterNumber - 1 == selectedChapterIndex
                        Card(
                            onClick = {
                                selectedChapterIndex = ch.chapterNumber - 1
                                showChapterSelectorSheet = false
                            },
                            colors = CardDefaults.cardColors(
                                containerColor = if (isCurrent) PrimaryGreen.copy(alpha = 0.12f) else AppBackground
                            ),
                            shape = RoundedCornerShape(12.dp),
                            border = if (isCurrent) BorderStroke(1.5.dp, PrimaryGreen) else null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                        ) {
                            Row(
                                modifier = Modifier.padding(14.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(32.dp)
                                        .clip(CircleShape)
                                        .background(if (isCurrent) PrimaryGreen else BorderSubtle),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "${ch.chapterNumber}",
                                        color = if (isCurrent) Color.White else TextPrimary,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 13.sp
                                    )
                                }

                                Spacer(modifier = Modifier.width(12.dp))

                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = ch.title,
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = if (isCurrent) FontWeight.Bold else FontWeight.SemiBold,
                                        color = if (isCurrent) PrimaryGreen else TextPrimary
                                    )
                                    Text(
                                        text = ch.summary.take(70) + "...",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = TextSecondary,
                                        maxLines = 1
                                    )
                                }

                                if (isCurrent) {
                                    Icon(
                                        imageVector = Icons.Filled.CheckCircle,
                                        contentDescription = "Active Chapter",
                                        tint = PrimaryGreen,
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

// -------------------------------------------------------------
// 1. READ BOOK TAB (CHAPTER-BY-CHAPTER OR CONTINUOUS NOVEL)
// -------------------------------------------------------------

@Composable
fun LifeChangerReadBookTab(
    readingTheme: ReadingTheme,
    fontSizeMultiplier: Float,
    readMode: BookReadMode,
    onToggleReadMode: () -> Unit,
    selectedChapterIndex: Int,
    onSelectChapter: (Int) -> Unit,
    onOpenToc: () -> Unit,
    onAskAiTutor: ((prompt: String) -> Unit)?
) {
    val chapter = TheLifeChangerCompleteBook.chapters.getOrElse(selectedChapterIndex) {
        TheLifeChangerCompleteBook.chapters.first()
    }
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(readingTheme.bg)
    ) {
        // Mode & Chapter selector header
        Surface(
            color = readingTheme.bg,
            shadowElevation = 2.dp,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Read Mode Pill
                AssistChip(
                    onClick = onToggleReadMode,
                    label = {
                        Text(
                            text = if (readMode == BookReadMode.CHAPTER_BY_CHAPTER) "📖 Single Chapter Mode" else "📚 Full Book Mode",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = readingTheme.accent
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.SwapHoriz,
                            contentDescription = null,
                            tint = readingTheme.accent,
                            modifier = Modifier.size(14.dp)
                        )
                    },
                    colors = AssistChipDefaults.assistChipColors(
                        containerColor = readingTheme.accent.copy(alpha = 0.12f)
                    ),
                    border = BorderStroke(1.dp, readingTheme.accent.copy(alpha = 0.3f))
                )

                // Chapter Indicator / Toc
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Ch ${selectedChapterIndex + 1} of 9",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = readingTheme.text.copy(alpha = 0.8f)
                    )
                    IconButton(onClick = onOpenToc, modifier = Modifier.size(36.dp)) {
                        Icon(
                            imageVector = Icons.Filled.List,
                            contentDescription = "Chapter Index",
                            tint = readingTheme.accent
                        )
                    }
                }
            }
        }

        // Reading Content Box
        if (readMode == BookReadMode.CHAPTER_BY_CHAPTER) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(scrollState)
                    .padding(horizontal = 20.dp, vertical = 16.dp)
            ) {
                // Chapter Header
                Text(
                    text = chapter.title,
                    fontSize = (22 * fontSizeMultiplier).sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = readingTheme.accent,
                    fontFamily = FontFamily.Serif,
                    lineHeight = (28 * fontSizeMultiplier).sp
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Chapter Summary Card
                Surface(
                    color = readingTheme.accent.copy(alpha = 0.08f),
                    shape = RoundedCornerShape(10.dp),
                    border = BorderStroke(1.dp, readingTheme.accent.copy(alpha = 0.2f)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Filled.AutoAwesome, contentDescription = null, tint = readingTheme.accent, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "Chapter Synopsis (UTME High-Yield)",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                                color = readingTheme.accent
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = chapter.summary,
                            fontSize = (13 * fontSizeMultiplier).sp,
                            lineHeight = (18 * fontSizeMultiplier).sp,
                            color = readingTheme.text.copy(alpha = 0.9f)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                // Verbatim Chapter Full Text
                Text(
                    text = chapter.fullText,
                    fontSize = (16 * fontSizeMultiplier).sp,
                    lineHeight = (26 * fontSizeMultiplier).sp,
                    color = readingTheme.text,
                    fontFamily = FontFamily.Serif,
                    textAlign = TextAlign.Start
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Key Quotes Section
                if (chapter.keyQuotes.isNotEmpty()) {
                    Text(
                        text = "📌 Key Quotes & Memorable Lines",
                        fontWeight = FontWeight.Bold,
                        fontSize = (14 * fontSizeMultiplier).sp,
                        color = readingTheme.accent
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    chapter.keyQuotes.forEach { quote ->
                        Surface(
                            color = readingTheme.accent.copy(alpha = 0.06f),
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                        ) {
                            Text(
                                text = quote,
                                fontStyle = FontStyle.Italic,
                                fontSize = (14 * fontSizeMultiplier).sp,
                                lineHeight = (20 * fontSizeMultiplier).sp,
                                color = readingTheme.text,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(40.dp))
            }

            // Bottom Navigation Bar for Next/Prev chapter
            Surface(
                color = readingTheme.bg,
                shadowElevation = 8.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedButton(
                        onClick = {
                            if (selectedChapterIndex > 0) onSelectChapter(selectedChapterIndex - 1)
                        },
                        enabled = selectedChapterIndex > 0,
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Previous")
                    }

                    Text(
                        text = "Chapter ${selectedChapterIndex + 1} / 9",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        color = readingTheme.text
                    )

                    Button(
                        onClick = {
                            if (selectedChapterIndex < 8) onSelectChapter(selectedChapterIndex + 1)
                        },
                        enabled = selectedChapterIndex < 8,
                        colors = ButtonDefaults.buttonColors(containerColor = readingTheme.accent),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text("Next Chapter", color = Color.White)
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(16.dp), tint = Color.White)
                    }
                }
            }
        } else {
            // ENTIRE NOVEL CONTINUOUS READING MODE
            val allChapters = TheLifeChangerCompleteBook.chapters
            val listState = rememberLazyListState()

            LazyColumn(
                state = listState,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp, vertical = 16.dp)
            ) {
                // Book Title & Front Matter
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "THE LIFE CHANGER",
                            fontSize = (26 * fontSizeMultiplier).sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = readingTheme.accent,
                            fontFamily = FontFamily.Serif
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "By Khadijat Abubakar Jalli",
                            fontSize = (15 * fontSizeMultiplier).sp,
                            fontStyle = FontStyle.Italic,
                            color = readingTheme.text.copy(alpha = 0.8f)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = TheLifeChangerCompleteBook.dedication,
                            fontSize = (13 * fontSizeMultiplier).sp,
                            textAlign = TextAlign.Center,
                            color = readingTheme.text.copy(alpha = 0.7f)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        HorizontalDivider(color = readingTheme.accent.copy(alpha = 0.3f), thickness = 1.5.dp)
                    }
                }

                items(allChapters) { ch ->
                    Column(modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp)) {
                        Text(
                            text = ch.title.uppercase(),
                            fontSize = (20 * fontSizeMultiplier).sp,
                            fontWeight = FontWeight.Bold,
                            color = readingTheme.accent,
                            fontFamily = FontFamily.Serif
                        )
                        Spacer(modifier = Modifier.height(14.dp))
                        Text(
                            text = ch.fullText,
                            fontSize = (16 * fontSizeMultiplier).sp,
                            lineHeight = (26 * fontSizeMultiplier).sp,
                            color = readingTheme.text,
                            fontFamily = FontFamily.Serif
                        )
                        Spacer(modifier = Modifier.height(24.dp))
                        HorizontalDivider(color = readingTheme.accent.copy(alpha = 0.2f), thickness = 1.dp)
                    }
                }

                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 32.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "— END OF NOVEL —",
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = readingTheme.accent
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Review Literary Devices, Characters & Practice UTME Quiz using the top tabs.",
                            fontSize = 13.sp,
                            color = readingTheme.text.copy(alpha = 0.7f),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}

// -------------------------------------------------------------
// 2. LITERARY & POETIC DEVICES TAB
// -------------------------------------------------------------

@Composable
fun LifeChangerLiteraryDevicesTab(onAskAiTutor: ((prompt: String) -> Unit)?) {
    val devices = TheLifeChangerCompleteBook.literaryDevices

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            Card(
                colors = CardDefaults.cardColors(containerColor = SoftPurpleBg),
                shape = RoundedCornerShape(14.dp),
                border = BorderStroke(1.dp, PurpleAccent.copy(alpha = 0.3f)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(PurpleAccent.copy(alpha = 0.2f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Filled.Psychology, contentDescription = null, tint = PurpleAccent)
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Literary Devices & Stylistic Analysis",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        Text(
                            text = "Figures of speech, ironies, allusions, and narrative techniques tested in JAMB UTME.",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }

        items(devices) { item ->
            Card(
                colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                shape = RoundedCornerShape(14.dp),
                border = BorderStroke(1.dp, BorderSubtle),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = item.deviceName,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryGreen
                        )
                        Surface(
                            color = AppBackground,
                            shape = RoundedCornerShape(6.dp)
                        ) {
                            Text(
                                text = item.category,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextSecondary,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Surface(
                        color = AppBackground,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = item.example,
                            style = MaterialTheme.typography.bodyMedium,
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.SemiBold,
                            color = TextPrimary,
                            modifier = Modifier.padding(10.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = item.contextAndAnalysis,
                        style = MaterialTheme.typography.bodyMedium,
                        lineHeight = 22.sp,
                        color = TextPrimary
                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
            if (onAskAiTutor != null) {
                Button(
                    onClick = {
                        onAskAiTutor("Provide all figures of speech and literary devices in 'The Life Changer' with past JAMB UTME exam examples.")
                    },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen)
                ) {
                    Icon(Icons.Filled.AutoAwesome, contentDescription = null, modifier = Modifier.size(18.dp))
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Deep Dive with AI Literature Tutor", fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

// -------------------------------------------------------------
// 3. BACKGROUND & AUTHOR PROFILE TAB
// -------------------------------------------------------------

@Composable
fun LifeChangerBackgroundTab(onAskAiTutor: ((prompt: String) -> Unit)?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Author Card
        Card(
            colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
            shape = RoundedCornerShape(14.dp),
            border = BorderStroke(1.dp, BorderSubtle),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(CircleShape)
                            .background(PrimaryGreen.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Filled.Person, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(28.dp))
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = "Khadijat Abubakar Jalli",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        Text(
                            text = "Author & Educationalist",
                            style = MaterialTheme.typography.bodySmall,
                            color = PrimaryGreen,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))
                HorizontalDivider(color = BorderSubtle)
                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "Author Profile & Background:",
                    style = MaterialTheme.typography.labelLarge,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "• Holds a B.Sc (Ed) degree in Mathematics.\n• Entrepreneur and Chief Executive Officer (CEO) of She's Boutique Afrique.\n• Married with children (Dedicating this novel to: Zahra, Najwa, Basma, Sadiq and Farha).\n• Published by Academy Press Plc, Lagos in 2020.",
                    style = MaterialTheme.typography.bodyMedium,
                    lineHeight = 22.sp,
                    color = TextPrimary
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // About The Novel Card
        Card(
            colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
            shape = RoundedCornerShape(14.dp),
            border = BorderStroke(1.dp, BorderSubtle),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "About The Book (Official Synopsis)",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryGreen
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = TheLifeChangerCompleteBook.aboutTheBook,
                    style = MaterialTheme.typography.bodyMedium,
                    lineHeight = 22.sp,
                    color = TextPrimary
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Setting & Cultural Context Card
        Card(
            colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
            shape = RoundedCornerShape(14.dp),
            border = BorderStroke(1.dp, BorderSubtle),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Setting & Geographical Milieu",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "1. Lafayette Community: A close-knit, rural, communal village where the District Head (Hakimi) maintains traditional governance and stranger supervision.\n\n2. Ahmadu Bello University (ABU), Zaria: Specifically the Main Campus at Samaru and the Kongo Campus (Faculty of Law). Queen Amina Hall represents the coveted female undergraduate hall of residence.\n\n3. Kwangila & Zaria Town: The urban peri-campus transit points, eateries (Frizzlers, Faculty of Suya), and off-campus accommodation.",
                    style = MaterialTheme.typography.bodyMedium,
                    lineHeight = 22.sp,
                    color = TextPrimary
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))
    }
}

// -------------------------------------------------------------
// 4. CHAPTER SUMMARIES TAB
// -------------------------------------------------------------

@Composable
fun LifeChangerSummariesTab(onSelectChapterToRead: (Int) -> Unit) {
    val chapters = TheLifeChangerCompleteBook.chapters

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(chapters) { ch ->
            Card(
                colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                shape = RoundedCornerShape(14.dp),
                border = BorderStroke(1.dp, BorderSubtle),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Chapter ${ch.chapterNumber}",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryGreen
                        )
                        TextButton(onClick = { onSelectChapterToRead(ch.chapterNumber - 1) }) {
                            Text("Read Chapter", fontWeight = FontWeight.Bold, fontSize = 12.sp)
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(14.dp))
                        }
                    }

                    Text(
                        text = ch.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = ch.summary,
                        style = MaterialTheme.typography.bodyMedium,
                        lineHeight = 22.sp,
                        color = TextPrimary
                    )

                    if (ch.keyQuotes.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Surface(
                            color = AppBackground,
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(
                                    text = "Pivotal Quote:",
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = TextSecondary
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = ch.keyQuotes.first(),
                                    fontStyle = FontStyle.Italic,
                                    fontSize = 13.sp,
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
// 5. CHARACTER ANALYSIS TAB
// -------------------------------------------------------------

@Composable
fun LifeChangerCharactersTab(onAskAiTutor: ((prompt: String) -> Unit)?) {
    val characters = TheLifeChangerCompleteBook.characters

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            Text(
                text = "Dramatis Personae & Character Profiles",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = TextPrimary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Detailed psychological and thematic analysis of major and minor characters for JAMB CBT.",
                style = MaterialTheme.typography.bodySmall,
                color = TextSecondary
            )
            Spacer(modifier = Modifier.height(14.dp))
        }

        items(characters) { char ->
            Card(
                colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                shape = RoundedCornerShape(14.dp),
                border = BorderStroke(1.dp, BorderSubtle),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = char.name,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryGreen
                        )
                        Surface(
                            color = PrimaryGreen.copy(alpha = 0.12f),
                            shape = RoundedCornerShape(6.dp)
                        ) {
                            Text(
                                text = char.role,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryGreen,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Character Traits Pills
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                        char.traits.forEach { trait ->
                            Surface(
                                color = AppBackground,
                                shape = RoundedCornerShape(12.dp)
                            ) {
                                Text(
                                    text = trait,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Medium,
                                    color = TextSecondary,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = char.description,
                        style = MaterialTheme.typography.bodyMedium,
                        lineHeight = 22.sp,
                        color = TextPrimary
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Surface(
                        color = AppBackground,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text(
                                text = "Key Significance in Plot:",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryGreen
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = char.keyMoments,
                                style = MaterialTheme.typography.bodySmall,
                                lineHeight = 18.sp,
                                color = TextPrimary
                            )
                        }
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(30.dp)) }
    }
}

// -------------------------------------------------------------
// 6. THEMES & MORAL LESSONS TAB
// -------------------------------------------------------------

@Composable
fun LifeChangerThemesTab(onAskAiTutor: ((prompt: String) -> Unit)?) {
    val themes = TheLifeChangerCompleteBook.themes

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            Text(
                text = "Central Themes & Moral Lessons",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = TextPrimary
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "High-yield thematic analysis directly tested in UTME Use of English and Literature.",
                style = MaterialTheme.typography.bodySmall,
                color = TextSecondary
            )
            Spacer(modifier = Modifier.height(14.dp))
        }

        items(themes) { theme ->
            Card(
                colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                shape = RoundedCornerShape(14.dp),
                border = BorderStroke(1.dp, BorderSubtle),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = theme.title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryGreen
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = theme.description,
                        style = MaterialTheme.typography.bodyMedium,
                        lineHeight = 22.sp,
                        color = TextPrimary
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Surface(
                        color = AppBackground,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text(
                                text = "Occurrences in Novel:",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = TextSecondary
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = theme.occurrencesInNovel,
                                style = MaterialTheme.typography.bodySmall,
                                lineHeight = 18.sp,
                                color = TextPrimary
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Surface(
                        color = PrimaryGreen.copy(alpha = 0.08f),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(10.dp)) {
                            Text(
                                text = "🎯 UTME Exam Takeaway:",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryGreen
                            )
                            Spacer(modifier = Modifier.height(2.dp))
                            Text(
                                text = theme.utmeTakeaway,
                                style = MaterialTheme.typography.bodySmall,
                                lineHeight = 18.sp,
                                color = TextPrimary
                            )
                        }
                    }
                }
            }
        }
        item { Spacer(modifier = Modifier.height(30.dp)) }
    }
}

// -------------------------------------------------------------
// 7. UTME PRACTICE QUIZ TAB
// -------------------------------------------------------------

@Composable
fun LifeChangerQuizTab(
    selectedAnswers: Map<Int, Int>,
    onSelectAnswer: (Int, Int) -> Unit,
    onResetQuiz: () -> Unit
) {
    val questions = TheLifeChangerCompleteBook.quizQuestions
    val answeredCount = selectedAnswers.size
    val correctCount = questions.count { q -> selectedAnswers[q.id] == q.correctIndex }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Score Header
        item {
            Card(
                colors = CardDefaults.cardColors(containerColor = PrimaryGreen),
                shape = RoundedCornerShape(14.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Text(
                                text = "UTME Mastery Quiz",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                text = "10 Real Past CBT Exam Questions",
                                style = MaterialTheme.typography.bodySmall,
                                color = Color.White.copy(alpha = 0.8f)
                            )
                        }
                        Surface(
                            color = Color.White.copy(alpha = 0.2f),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = "$correctCount / $answeredCount Correct",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }

        items(questions) { q ->
            val selectedOption = selectedAnswers[q.id]
            val isAnswered = selectedOption != null
            val isCorrect = selectedOption == q.correctIndex

            Card(
                colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                shape = RoundedCornerShape(14.dp),
                border = BorderStroke(1.dp, BorderSubtle),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Question ${q.id}:",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryGreen
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = q.question,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = TextPrimary
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    q.options.forEachIndexed { optIndex, optText ->
                        val isSelected = selectedOption == optIndex
                        val isOptionCorrect = optIndex == q.correctIndex

                        val containerColor = when {
                            !isAnswered -> SurfaceWhite
                            isOptionCorrect -> PrimaryGreen.copy(alpha = 0.12f)
                            isSelected -> IncorrectRed.copy(alpha = 0.12f)
                            else -> SurfaceWhite
                        }

                        val borderColor = when {
                            !isAnswered -> BorderSubtle
                            isOptionCorrect -> PrimaryGreen
                            isSelected -> IncorrectRed
                            else -> BorderSubtle
                        }

                        Surface(
                            onClick = { onSelectAnswer(q.id, optIndex) },
                            color = containerColor,
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.5.dp, borderColor),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                        ) {
                            Row(
                                modifier = Modifier.padding(12.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = optText,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = if (isSelected || (isAnswered && isOptionCorrect)) FontWeight.Bold else FontWeight.Normal,
                                    color = TextPrimary,
                                    modifier = Modifier.weight(1f)
                                )

                                if (isAnswered) {
                                    if (isOptionCorrect) {
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

        item {
            Spacer(modifier = Modifier.height(16.dp))
            OutlinedButton(
                onClick = onResetQuiz,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Icon(Icons.Filled.Refresh, contentDescription = null, modifier = Modifier.size(16.dp))
                Spacer(modifier = Modifier.width(6.dp))
                Text("Reset Quiz")
            }
            Spacer(modifier = Modifier.height(40.dp))
        }
    }
}
