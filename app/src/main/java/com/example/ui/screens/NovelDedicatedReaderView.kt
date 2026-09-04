package com.example.ui.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.db.LiteratureBookEntity
import com.example.data.repository.*
import com.example.ui.theme.*

enum class NovelReaderTab(val label: String) {
    FULL_TEXT("Read Chapters"),
    SUMMARY("Chapter Summaries"),
    CHARACTERS("Characters"),
    THEMES("Themes & Analysis"),
    UTME_QUIZ("UTME Practice Quiz")
}

// ----------------------------------------------------------------------
// SECOND-CLASS CITIZEN DEDICATED READER
// ----------------------------------------------------------------------

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondClassCitizenReaderView(
    book: LiteratureBookEntity,
    initialChapterIndex: Int = 0,
    onClose: () -> Unit,
    onAskAiTutor: ((prompt: String) -> Unit)? = null
) {
    BackHandler(onBack = onClose)

    var currentTab by remember { mutableStateOf(NovelReaderTab.FULL_TEXT) }
    var currentChapterIndex by remember { mutableStateOf(initialChapterIndex.coerceIn(0, SecondClassCitizenBook.chapters.size - 1)) }
    var selectedQuizAnswers by remember { mutableStateOf(mutableMapOf<Int, Int>()) }
    var fontSizeSp by remember { mutableStateOf(16) }

    val chapters = SecondClassCitizenBook.chapters
    val currentChapter = chapters[currentChapterIndex]

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(SecondClassCitizenBook.title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                        Text(
                            when (currentTab) {
                                NovelReaderTab.FULL_TEXT -> currentChapter.title
                                NovelReaderTab.SUMMARY -> "All Chapter Summaries"
                                NovelReaderTab.CHARACTERS -> "Character Profiles"
                                NovelReaderTab.THEMES -> "Key Themes & Motifs"
                                NovelReaderTab.UTME_QUIZ -> "UTME Past Questions & Quiz"
                            },
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onClose, modifier = Modifier.testTag("reader_back_btn")) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    if (currentTab == NovelReaderTab.FULL_TEXT) {
                        IconButton(onClick = { if (fontSizeSp < 22) fontSizeSp += 2 }) {
                            Icon(Icons.Filled.FormatSize, contentDescription = "Increase Font Size", tint = TextSecondary)
                        }
                    }
                    if (onAskAiTutor != null) {
                        IconButton(
                            onClick = {
                                onAskAiTutor("Explain the main themes, characters (Adah and Francis), and UTME examination points for Buchi Emecheta's 'Second-Class Citizen'.")
                            }
                        ) {
                            Icon(Icons.Filled.AutoAwesome, contentDescription = "Ask AI Tutor", tint = PrimaryGreen)
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = SurfaceWhite)
            )
        },
        bottomBar = {
            if (currentTab == NovelReaderTab.FULL_TEXT) {
                Surface(
                    color = SurfaceWhite,
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
                        Button(
                            onClick = { if (currentChapterIndex > 0) currentChapterIndex-- },
                            enabled = currentChapterIndex > 0,
                            colors = ButtonDefaults.buttonColors(containerColor = BorderSubtle, contentColor = TextPrimary),
                            shape = RoundedCornerShape(10.dp),
                            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp)
                        ) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Prev", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                        }

                        Text(
                            text = "Ch ${currentChapterIndex + 1} / ${chapters.size}",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryGreen
                        )

                        Button(
                            onClick = { if (currentChapterIndex < chapters.size - 1) currentChapterIndex++ },
                            enabled = currentChapterIndex < chapters.size - 1,
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen, contentColor = Color.White),
                            shape = RoundedCornerShape(10.dp),
                            contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp)
                        ) {
                            Text("Next", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(16.dp))
                        }
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
        ) {
            ScrollableTabRow(
                selectedTabIndex = currentTab.ordinal,
                containerColor = SurfaceWhite,
                contentColor = PrimaryGreen,
                edgePadding = 16.dp,
                divider = { HorizontalDivider(color = BorderSubtle) }
            ) {
                NovelReaderTab.values().forEach { tab ->
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
                    .padding(16.dp)
            ) {
                when (currentTab) {
                    NovelReaderTab.FULL_TEXT -> {
                        Column {
                            Surface(
                                color = SurfaceWhite,
                                shape = RoundedCornerShape(16.dp),
                                shadowElevation = 1.dp,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(
                                        text = currentChapter.title,
                                        style = MaterialTheme.typography.titleLarge,
                                        fontWeight = FontWeight.Bold,
                                        color = TextPrimary
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(
                                        text = "Author: ${SecondClassCitizenBook.author} • ${SecondClassCitizenBook.genre}",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = TextSecondary
                                    )
                                    Spacer(modifier = Modifier.height(12.dp))
                                    HorizontalDivider(color = BorderSubtle)
                                    Spacer(modifier = Modifier.height(12.dp))

                                    // Key Quote Callout
                                    if (currentChapter.keyQuotes.isNotEmpty()) {
                                        Surface(
                                            color = PrimaryGreen.copy(alpha = 0.08f),
                                            shape = RoundedCornerShape(10.dp),
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Column(modifier = Modifier.padding(12.dp)) {
                                                Row(verticalAlignment = Alignment.CenterVertically) {
                                                    Icon(Icons.Filled.FormatQuote, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(18.dp))
                                                    Spacer(modifier = Modifier.width(6.dp))
                                                    Text("Key Quote / UTME Focus", style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                                }
                                                Spacer(modifier = Modifier.height(4.dp))
                                                Text(
                                                    text = "\"${currentChapter.keyQuotes.first()}\"",
                                                    style = MaterialTheme.typography.bodyMedium,
                                                    fontStyle = FontStyle.Italic,
                                                    color = TextPrimary,
                                                    lineHeight = 20.sp
                                                )
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(14.dp))
                                    }

                                    Text(
                                        text = currentChapter.fullText,
                                        style = MaterialTheme.typography.bodyMedium.copy(fontSize = fontSizeSp.sp),
                                        lineHeight = (fontSizeSp + 10).sp,
                                        color = TextPrimary
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(24.dp))
                        }
                    }
                    NovelReaderTab.SUMMARY -> {
                        Column {
                            Text(
                                text = "Chapter Summaries & Key Points",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            chapters.forEachIndexed { idx, ch ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp)
                                        .clickable {
                                            currentChapterIndex = idx
                                            currentTab = NovelReaderTab.FULL_TEXT
                                        },
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween,
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Text(
                                                text = ch.title,
                                                style = MaterialTheme.typography.titleSmall,
                                                fontWeight = FontWeight.Bold,
                                                color = PrimaryGreen
                                            )
                                            Text(
                                                text = "Read Ch >",
                                                style = MaterialTheme.typography.labelSmall,
                                                color = AmberAccent,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(
                                            text = ch.summary,
                                            style = MaterialTheme.typography.bodySmall,
                                            lineHeight = 19.sp,
                                            color = TextPrimary
                                        )
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.CHARACTERS -> {
                        Column {
                            Text(
                                text = "Major & Minor Characters",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            SecondClassCitizenBook.characters.forEach { char ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp),
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween,
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Text(char.name, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = TextPrimary)
                                            Surface(
                                                color = PrimaryGreen.copy(alpha = 0.12f),
                                                shape = RoundedCornerShape(6.dp)
                                            ) {
                                                Text(
                                                    text = char.role,
                                                    style = MaterialTheme.typography.labelSmall,
                                                    fontWeight = FontWeight.Bold,
                                                    color = PrimaryGreen,
                                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                                )
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(char.description, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text("Key Traits: ${char.keyTraits}", style = MaterialTheme.typography.labelSmall, color = TextSecondary, fontStyle = FontStyle.Italic)
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.THEMES -> {
                        Column {
                            Text(
                                text = "Central Themes & UTME Essay Angles",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            SecondClassCitizenBook.themes.forEach { theme ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp),
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Text(theme.title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(theme.description, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Surface(
                                            color = AmberAccent.copy(alpha = 0.15f),
                                            shape = RoundedCornerShape(6.dp),
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                                                Icon(Icons.Filled.School, contentDescription = null, tint = TextPrimary, modifier = Modifier.size(16.dp))
                                                Spacer(modifier = Modifier.width(6.dp))
                                                Text(theme.utmeSignificance, style = MaterialTheme.typography.labelSmall, color = TextPrimary, fontWeight = FontWeight.Medium)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.UTME_QUIZ -> {
                        NovelQuizSection(
                            questions = SecondClassCitizenBook.quizQuestions,
                            selectedAnswers = selectedQuizAnswers,
                            onSelectAnswer = { qId, optIdx ->
                                selectedQuizAnswers = selectedQuizAnswers.toMutableMap().apply { put(qId, optIdx) }
                            }
                        )
                    }
                }
            }
        }
    }
}

// ----------------------------------------------------------------------
// LOOK BACK IN ANGER DEDICATED READER
// ----------------------------------------------------------------------

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LookBackInAngerReaderView(
    book: LiteratureBookEntity,
    onClose: () -> Unit,
    onAskAiTutor: ((prompt: String) -> Unit)? = null
) {
    BackHandler(onBack = onClose)

    var currentTab by remember { mutableStateOf(NovelReaderTab.FULL_TEXT) }
    var currentActIndex by remember { mutableStateOf(0) }
    var selectedQuizAnswers by remember { mutableStateOf(mutableMapOf<Int, Int>()) }
    var fontSizeSp by remember { mutableStateOf(16) }

    val acts = LookBackInAngerBook.acts
    val currentAct = acts[currentActIndex.coerceIn(0, acts.size - 1)]

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(LookBackInAngerBook.title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                        Text("John Osborne • Modern British Realist Drama", style = MaterialTheme.typography.bodySmall, color = TextSecondary)
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onClose, modifier = Modifier.testTag("reader_back_btn")) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    if (currentTab == NovelReaderTab.FULL_TEXT) {
                        IconButton(onClick = { if (fontSizeSp < 22) fontSizeSp += 2 }) {
                            Icon(Icons.Filled.FormatSize, contentDescription = "Font Size", tint = TextSecondary)
                        }
                    }
                    if (onAskAiTutor != null) {
                        IconButton(
                            onClick = {
                                onAskAiTutor("Analyze Jimmy Porter's disillusionment, the 'bears and squirrels' metaphor, and themes of class alienation in John Osborne's 'Look Back in Anger' for UTME.")
                            }
                        ) {
                            Icon(Icons.Filled.AutoAwesome, contentDescription = "Ask AI Tutor", tint = PrimaryGreen)
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = SurfaceWhite)
            )
        },
        bottomBar = {
            if (currentTab == NovelReaderTab.FULL_TEXT) {
                Surface(
                    color = SurfaceWhite,
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
                        Button(
                            onClick = { if (currentActIndex > 0) currentActIndex-- },
                            enabled = currentActIndex > 0,
                            colors = ButtonDefaults.buttonColors(containerColor = BorderSubtle, contentColor = TextPrimary),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Prev Act", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                        }

                        Text(
                            text = "Act ${currentActIndex + 1} / ${acts.size}",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryGreen
                        )

                        Button(
                            onClick = { if (currentActIndex < acts.size - 1) currentActIndex++ },
                            enabled = currentActIndex < acts.size - 1,
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen, contentColor = Color.White),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text("Next Act", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(16.dp))
                        }
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
        ) {
            ScrollableTabRow(
                selectedTabIndex = currentTab.ordinal,
                containerColor = SurfaceWhite,
                contentColor = PrimaryGreen,
                edgePadding = 16.dp,
                divider = { HorizontalDivider(color = BorderSubtle) }
            ) {
                NovelReaderTab.values().forEach { tab ->
                    val isSelected = currentTab == tab
                    Tab(
                        selected = isSelected,
                        onClick = { currentTab = tab },
                        text = {
                            Text(
                                text = if (tab == NovelReaderTab.FULL_TEXT) "Read Acts" else if (tab == NovelReaderTab.SUMMARY) "Act Summaries" else tab.label,
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
                    .padding(16.dp)
            ) {
                when (currentTab) {
                    NovelReaderTab.FULL_TEXT -> {
                        Column {
                            Surface(
                                color = SurfaceWhite,
                                shape = RoundedCornerShape(16.dp),
                                shadowElevation = 1.dp,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(currentAct.title, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold, color = TextPrimary)
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text("Setting: ${currentAct.setting}", style = MaterialTheme.typography.bodySmall, color = TextSecondary, fontStyle = FontStyle.Italic)
                                    Spacer(modifier = Modifier.height(12.dp))
                                    HorizontalDivider(color = BorderSubtle)
                                    Spacer(modifier = Modifier.height(12.dp))

                                    if (currentAct.keyQuotes.isNotEmpty()) {
                                        Surface(
                                            color = PrimaryGreen.copy(alpha = 0.08f),
                                            shape = RoundedCornerShape(10.dp),
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Column(modifier = Modifier.padding(12.dp)) {
                                                Row(verticalAlignment = Alignment.CenterVertically) {
                                                    Icon(Icons.Filled.FormatQuote, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(18.dp))
                                                    Spacer(modifier = Modifier.width(6.dp))
                                                    Text("Iconic Monologue / Quote", style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                                }
                                                Spacer(modifier = Modifier.height(4.dp))
                                                Text(
                                                    text = "\"${currentAct.keyQuotes.first()}\"",
                                                    style = MaterialTheme.typography.bodyMedium,
                                                    fontStyle = FontStyle.Italic,
                                                    color = TextPrimary,
                                                    lineHeight = 20.sp
                                                )
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(14.dp))
                                    }

                                    Text(
                                        text = currentAct.fullText,
                                        style = MaterialTheme.typography.bodyMedium.copy(fontSize = fontSizeSp.sp),
                                        lineHeight = (fontSizeSp + 10).sp,
                                        color = TextPrimary
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(24.dp))
                        }
                    }
                    NovelReaderTab.SUMMARY -> {
                        Column {
                            acts.forEachIndexed { idx, act ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp)
                                        .clickable {
                                            currentActIndex = idx
                                            currentTab = NovelReaderTab.FULL_TEXT
                                        },
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Text(act.title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(act.summary, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.CHARACTERS -> {
                        Column {
                            LookBackInAngerBook.characters.forEach { char ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp),
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween,
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Text(char.name, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = TextPrimary)
                                            Surface(
                                                color = PrimaryGreen.copy(alpha = 0.12f),
                                                shape = RoundedCornerShape(6.dp)
                                            ) {
                                                Text(char.role, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(char.description, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text("Traits: ${char.keyTraits}", style = MaterialTheme.typography.labelSmall, color = TextSecondary, fontStyle = FontStyle.Italic)
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.THEMES -> {
                        Column {
                            LookBackInAngerBook.themes.forEach { theme ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp),
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Text(theme.title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(theme.description, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Surface(
                                            color = AmberAccent.copy(alpha = 0.15f),
                                            shape = RoundedCornerShape(6.dp),
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                                                Icon(Icons.Filled.School, contentDescription = null, tint = TextPrimary, modifier = Modifier.size(16.dp))
                                                Spacer(modifier = Modifier.width(6.dp))
                                                Text(theme.utmeSignificance, style = MaterialTheme.typography.labelSmall, color = TextPrimary, fontWeight = FontWeight.Medium)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.UTME_QUIZ -> {
                        NovelQuizSection(
                            questions = LookBackInAngerBook.quizQuestions,
                            selectedAnswers = selectedQuizAnswers,
                            onSelectAnswer = { qId, optIdx ->
                                selectedQuizAnswers = selectedQuizAnswers.toMutableMap().apply { put(qId, optIdx) }
                            }
                        )
                    }
                }
            }
        }
    }
}

// ----------------------------------------------------------------------
// THE LION AND THE JEWEL DEDICATED READER
// ----------------------------------------------------------------------

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LionAndJewelReaderView(
    book: LiteratureBookEntity,
    onClose: () -> Unit,
    onAskAiTutor: ((prompt: String) -> Unit)? = null
) {
    BackHandler(onBack = onClose)

    var currentTab by remember { mutableStateOf(NovelReaderTab.FULL_TEXT) }
    var currentSectionIndex by remember { mutableStateOf(0) }
    var selectedQuizAnswers by remember { mutableStateOf(mutableMapOf<Int, Int>()) }
    var fontSizeSp by remember { mutableStateOf(16) }

    val sections = TheLionAndTheJewelBook.sections
    val currentSection = sections[currentSectionIndex.coerceIn(0, sections.size - 1)]

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(TheLionAndTheJewelBook.title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                        Text("Wole Soyinka • African Satirical Comedy", style = MaterialTheme.typography.bodySmall, color = TextSecondary)
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onClose, modifier = Modifier.testTag("reader_back_btn")) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    if (currentTab == NovelReaderTab.FULL_TEXT) {
                        IconButton(onClick = { if (fontSizeSp < 22) fontSizeSp += 2 }) {
                            Icon(Icons.Filled.FormatSize, contentDescription = "Font Size", tint = TextSecondary)
                        }
                    }
                    if (onAskAiTutor != null) {
                        IconButton(
                            onClick = {
                                onAskAiTutor("Explain the clash between tradition and modernity in Wole Soyinka's 'The Lion and the Jewel' focusing on Baroka, Sidi, and Lakunle.")
                            }
                        ) {
                            Icon(Icons.Filled.AutoAwesome, contentDescription = "Ask AI Tutor", tint = PrimaryGreen)
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = SurfaceWhite)
            )
        },
        bottomBar = {
            if (currentTab == NovelReaderTab.FULL_TEXT) {
                Surface(
                    color = SurfaceWhite,
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
                        Button(
                            onClick = { if (currentSectionIndex > 0) currentSectionIndex-- },
                            enabled = currentSectionIndex > 0,
                            colors = ButtonDefaults.buttonColors(containerColor = BorderSubtle, contentColor = TextPrimary),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Prev Part", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                        }

                        Text(
                            text = "Part ${currentSectionIndex + 1} / ${sections.size}",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryGreen
                        )

                        Button(
                            onClick = { if (currentSectionIndex < sections.size - 1) currentSectionIndex++ },
                            enabled = currentSectionIndex < sections.size - 1,
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen, contentColor = Color.White),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text("Next Part", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(16.dp))
                        }
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
        ) {
            ScrollableTabRow(
                selectedTabIndex = currentTab.ordinal,
                containerColor = SurfaceWhite,
                contentColor = PrimaryGreen,
                edgePadding = 16.dp,
                divider = { HorizontalDivider(color = BorderSubtle) }
            ) {
                NovelReaderTab.values().forEach { tab ->
                    val isSelected = currentTab == tab
                    Tab(
                        selected = isSelected,
                        onClick = { currentTab = tab },
                        text = {
                            Text(
                                text = if (tab == NovelReaderTab.FULL_TEXT) "Read Drama" else if (tab == NovelReaderTab.SUMMARY) "Part Summaries" else tab.label,
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
                    .padding(16.dp)
            ) {
                when (currentTab) {
                    NovelReaderTab.FULL_TEXT -> {
                        Column {
                            Surface(
                                color = SurfaceWhite,
                                shape = RoundedCornerShape(16.dp),
                                shadowElevation = 1.dp,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(currentSection.title, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold, color = TextPrimary)
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text("Setting: ${currentSection.setting}", style = MaterialTheme.typography.bodySmall, color = TextSecondary, fontStyle = FontStyle.Italic)
                                    Spacer(modifier = Modifier.height(12.dp))
                                    HorizontalDivider(color = BorderSubtle)
                                    Spacer(modifier = Modifier.height(12.dp))

                                    if (currentSection.keyQuotes.isNotEmpty()) {
                                        Surface(
                                            color = PrimaryGreen.copy(alpha = 0.08f),
                                            shape = RoundedCornerShape(10.dp),
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Column(modifier = Modifier.padding(12.dp)) {
                                                Row(verticalAlignment = Alignment.CenterVertically) {
                                                    Icon(Icons.Filled.FormatQuote, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(18.dp))
                                                    Spacer(modifier = Modifier.width(6.dp))
                                                    Text("Memorable Dialogue", style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                                }
                                                Spacer(modifier = Modifier.height(4.dp))
                                                Text(
                                                    text = "\"${currentSection.keyQuotes.first()}\"",
                                                    style = MaterialTheme.typography.bodyMedium,
                                                    fontStyle = FontStyle.Italic,
                                                    color = TextPrimary,
                                                    lineHeight = 20.sp
                                                )
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(14.dp))
                                    }

                                    Text(
                                        text = currentSection.fullText,
                                        style = MaterialTheme.typography.bodyMedium.copy(fontSize = fontSizeSp.sp),
                                        lineHeight = (fontSizeSp + 10).sp,
                                        color = TextPrimary
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(24.dp))
                        }
                    }
                    NovelReaderTab.SUMMARY -> {
                        Column {
                            sections.forEachIndexed { idx, sec ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp)
                                        .clickable {
                                            currentSectionIndex = idx
                                            currentTab = NovelReaderTab.FULL_TEXT
                                        },
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Text(sec.title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(sec.summary, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.CHARACTERS -> {
                        Column {
                            TheLionAndTheJewelBook.characters.forEach { char ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp),
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween,
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Text(char.name, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = TextPrimary)
                                            Surface(
                                                color = PrimaryGreen.copy(alpha = 0.12f),
                                                shape = RoundedCornerShape(6.dp)
                                            ) {
                                                Text(char.role, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(char.description, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text("Traits: ${char.keyTraits}", style = MaterialTheme.typography.labelSmall, color = TextSecondary, fontStyle = FontStyle.Italic)
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.THEMES -> {
                        Column {
                            TheLionAndTheJewelBook.themes.forEach { theme ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp),
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Text(theme.title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(theme.description, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Surface(
                                            color = AmberAccent.copy(alpha = 0.15f),
                                            shape = RoundedCornerShape(6.dp),
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                                                Icon(Icons.Filled.School, contentDescription = null, tint = TextPrimary, modifier = Modifier.size(16.dp))
                                                Spacer(modifier = Modifier.width(6.dp))
                                                Text(theme.utmeSignificance, style = MaterialTheme.typography.labelSmall, color = TextPrimary, fontWeight = FontWeight.Medium)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.UTME_QUIZ -> {
                        NovelQuizSection(
                            questions = TheLionAndTheJewelBook.quizQuestions,
                            selectedAnswers = selectedQuizAnswers,
                            onSelectAnswer = { qId, optIdx ->
                                selectedQuizAnswers = selectedQuizAnswers.toMutableMap().apply { put(qId, optIdx) }
                            }
                        )
                    }
                }
            }
        }
    }
}

// ----------------------------------------------------------------------
// WUTHERING HEIGHTS DEDICATED READER
// ----------------------------------------------------------------------

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WutheringHeightsReaderView(
    book: LiteratureBookEntity,
    onClose: () -> Unit,
    onAskAiTutor: ((prompt: String) -> Unit)? = null
) {
    BackHandler(onBack = onClose)

    var currentTab by remember { mutableStateOf(NovelReaderTab.FULL_TEXT) }
    var currentChapterIndex by remember { mutableStateOf(0) }
    var selectedQuizAnswers by remember { mutableStateOf(mutableMapOf<Int, Int>()) }
    var fontSizeSp by remember { mutableStateOf(16) }

    val chapters = WutheringHeightsBook.chapters
    val currentChapter = chapters[currentChapterIndex.coerceIn(0, chapters.size - 1)]

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(WutheringHeightsBook.title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                        Text("Emily Brontë • 19th Century Gothic Masterpiece", style = MaterialTheme.typography.bodySmall, color = TextSecondary)
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onClose, modifier = Modifier.testTag("reader_back_btn")) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    if (currentTab == NovelReaderTab.FULL_TEXT) {
                        IconButton(onClick = { if (fontSizeSp < 22) fontSizeSp += 2 }) {
                            Icon(Icons.Filled.FormatSize, contentDescription = "Font Size", tint = TextSecondary)
                        }
                    }
                    if (onAskAiTutor != null) {
                        IconButton(
                            onClick = {
                                onAskAiTutor("Explain the complex gothic themes of revenge, spiritual union between Heathcliff and Catherine, and redemption in Emily Brontë's 'Wuthering Heights' for UTME.")
                            }
                        ) {
                            Icon(Icons.Filled.AutoAwesome, contentDescription = "Ask AI Tutor", tint = PrimaryGreen)
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = SurfaceWhite)
            )
        },
        bottomBar = {
            if (currentTab == NovelReaderTab.FULL_TEXT) {
                Surface(
                    color = SurfaceWhite,
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
                        Button(
                            onClick = { if (currentChapterIndex > 0) currentChapterIndex-- },
                            enabled = currentChapterIndex > 0,
                            colors = ButtonDefaults.buttonColors(containerColor = BorderSubtle, contentColor = TextPrimary),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Prev Section", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                        }

                        Text(
                            text = "Part ${currentChapterIndex + 1} / ${chapters.size}",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryGreen
                        )

                        Button(
                            onClick = { if (currentChapterIndex < chapters.size - 1) currentChapterIndex++ },
                            enabled = currentChapterIndex < chapters.size - 1,
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen, contentColor = Color.White),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Text("Next Section", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelMedium)
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = null, modifier = Modifier.size(16.dp))
                        }
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
        ) {
            ScrollableTabRow(
                selectedTabIndex = currentTab.ordinal,
                containerColor = SurfaceWhite,
                contentColor = PrimaryGreen,
                edgePadding = 16.dp,
                divider = { HorizontalDivider(color = BorderSubtle) }
            ) {
                NovelReaderTab.values().forEach { tab ->
                    val isSelected = currentTab == tab
                    Tab(
                        selected = isSelected,
                        onClick = { currentTab = tab },
                        text = {
                            Text(
                                text = if (tab == NovelReaderTab.FULL_TEXT) "Read Text" else if (tab == NovelReaderTab.SUMMARY) "Section Summaries" else tab.label,
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
                    .padding(16.dp)
            ) {
                when (currentTab) {
                    NovelReaderTab.FULL_TEXT -> {
                        Column {
                            Surface(
                                color = SurfaceWhite,
                                shape = RoundedCornerShape(16.dp),
                                shadowElevation = 1.dp,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(16.dp)) {
                                    Text(currentChapter.title, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold, color = TextPrimary)
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text("Narrated by Mr. Lockwood & Nelly Dean", style = MaterialTheme.typography.bodySmall, color = TextSecondary, fontStyle = FontStyle.Italic)
                                    Spacer(modifier = Modifier.height(12.dp))
                                    HorizontalDivider(color = BorderSubtle)
                                    Spacer(modifier = Modifier.height(12.dp))

                                    if (currentChapter.keyQuotes.isNotEmpty()) {
                                        Surface(
                                            color = PrimaryGreen.copy(alpha = 0.08f),
                                            shape = RoundedCornerShape(10.dp),
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Column(modifier = Modifier.padding(12.dp)) {
                                                Row(verticalAlignment = Alignment.CenterVertically) {
                                                    Icon(Icons.Filled.FormatQuote, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(18.dp))
                                                    Spacer(modifier = Modifier.width(6.dp))
                                                    Text("Famous Quote / Gothic Expression", style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                                }
                                                Spacer(modifier = Modifier.height(4.dp))
                                                Text(
                                                    text = "\"${currentChapter.keyQuotes.first()}\"",
                                                    style = MaterialTheme.typography.bodyMedium,
                                                    fontStyle = FontStyle.Italic,
                                                    color = TextPrimary,
                                                    lineHeight = 20.sp
                                                )
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(14.dp))
                                    }

                                    Text(
                                        text = currentChapter.fullText,
                                        style = MaterialTheme.typography.bodyMedium.copy(fontSize = fontSizeSp.sp),
                                        lineHeight = (fontSizeSp + 10).sp,
                                        color = TextPrimary
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(24.dp))
                        }
                    }
                    NovelReaderTab.SUMMARY -> {
                        Column {
                            chapters.forEachIndexed { idx, ch ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp)
                                        .clickable {
                                            currentChapterIndex = idx
                                            currentTab = NovelReaderTab.FULL_TEXT
                                        },
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Text(ch.title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(ch.summary, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.CHARACTERS -> {
                        Column {
                            WutheringHeightsBook.characters.forEach { char ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp),
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Row(
                                            modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.SpaceBetween,
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Text(char.name, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = TextPrimary)
                                            Surface(
                                                color = PrimaryGreen.copy(alpha = 0.12f),
                                                shape = RoundedCornerShape(6.dp)
                                            ) {
                                                Text(char.role, style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen, modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp))
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(char.description, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text("Traits: ${char.keyTraits}", style = MaterialTheme.typography.labelSmall, color = TextSecondary, fontStyle = FontStyle.Italic)
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.THEMES -> {
                        Column {
                            WutheringHeightsBook.themes.forEach { theme ->
                                Card(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(bottom = 12.dp),
                                    colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                                    shape = RoundedCornerShape(12.dp)
                                ) {
                                    Column(modifier = Modifier.padding(14.dp)) {
                                        Text(theme.title, style = MaterialTheme.typography.titleSmall, fontWeight = FontWeight.Bold, color = PrimaryGreen)
                                        Spacer(modifier = Modifier.height(6.dp))
                                        Text(theme.description, style = MaterialTheme.typography.bodySmall, lineHeight = 18.sp, color = TextPrimary)
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Surface(
                                            color = AmberAccent.copy(alpha = 0.15f),
                                            shape = RoundedCornerShape(6.dp),
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                                                Icon(Icons.Filled.School, contentDescription = null, tint = TextPrimary, modifier = Modifier.size(16.dp))
                                                Spacer(modifier = Modifier.width(6.dp))
                                                Text(theme.utmeSignificance, style = MaterialTheme.typography.labelSmall, color = TextPrimary, fontWeight = FontWeight.Medium)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    NovelReaderTab.UTME_QUIZ -> {
                        NovelQuizSection(
                            questions = WutheringHeightsBook.quizQuestions,
                            selectedAnswers = selectedQuizAnswers,
                            onSelectAnswer = { qId, optIdx ->
                                selectedQuizAnswers = selectedQuizAnswers.toMutableMap().apply { put(qId, optIdx) }
                            }
                        )
                    }
                }
            }
        }
    }
}

// ----------------------------------------------------------------------
// REUSABLE NOVEL QUIZ COMPONENT
// ----------------------------------------------------------------------

@Composable
fun NovelQuizSection(
    questions: List<NovelQuizData>,
    selectedAnswers: Map<Int, Int>,
    onSelectAnswer: (Int, Int) -> Unit
) {
    Column {
        Text(
            text = "UTME High-Yield Practice Questions",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = TextPrimary
        )
        Text(
            text = "Select an option to test your understanding and view instant analysis.",
            style = MaterialTheme.typography.bodySmall,
            color = TextSecondary
        )
        Spacer(modifier = Modifier.height(14.dp))

        questions.forEach { q ->
            val selectedOption = selectedAnswers[q.id]
            val isAnswered = selectedOption != null

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 14.dp),
                colors = CardDefaults.cardColors(containerColor = SurfaceWhite),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Text(
                        text = "Question ${q.id}: ${q.question}",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = TextPrimary,
                        lineHeight = 22.sp
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    q.options.forEachIndexed { optIdx, optText ->
                        val isSelected = selectedOption == optIdx
                        val isCorrect = optIdx == q.correctIndex

                        val (cardColor, borderColor, contentColor) = when {
                            !isAnswered -> Triple(SurfaceWhite, BorderSubtle, TextPrimary)
                            isSelected && isCorrect -> Triple(PrimaryGreen.copy(alpha = 0.12f), PrimaryGreen, PrimaryGreen)
                            isSelected && !isCorrect -> Triple(Color(0xFFFFEBEE), Color(0xFFE53935), Color(0xFFD32F2F))
                            isCorrect -> Triple(PrimaryGreen.copy(alpha = 0.08f), PrimaryGreen.copy(alpha = 0.5f), PrimaryGreen)
                            else -> Triple(SurfaceWhite, BorderSubtle, TextSecondary)
                        }

                        Surface(
                            color = cardColor,
                            shape = RoundedCornerShape(8.dp),
                            border = androidx.compose.foundation.BorderStroke(1.dp, borderColor),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .clickable(enabled = !isAnswered) {
                                    onSelectAnswer(q.id, optIdx)
                                }
                        ) {
                            Row(
                                modifier = Modifier.padding(10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(20.dp)
                                        .clip(CircleShape)
                                        .background(if (isSelected) contentColor else BorderSubtle),
                                    contentAlignment = Alignment.Center
                                ) {
                                    if (isSelected) {
                                        Icon(
                                            imageVector = if (isCorrect) Icons.Filled.Check else Icons.Filled.Close,
                                            contentDescription = null,
                                            tint = Color.White,
                                            modifier = Modifier.size(14.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    text = optText,
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                    color = contentColor
                                )
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
