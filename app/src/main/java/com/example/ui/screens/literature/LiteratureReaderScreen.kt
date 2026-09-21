package com.example.ui.screens.literature

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.literature.LiteratureBookStudyData
import com.example.data.literature.LiteratureChapter
import com.example.ui.theme.PrimaryGreen
import com.example.ui.theme.PrimaryGreenDark

enum class ReaderTheme(
    val label: String,
    val backgroundColor: Color,
    val textColor: Color,
    val accentColor: Color,
    val surfaceColor: Color
) {
    LIGHT(
        label = "Light",
        backgroundColor = Color(0xFFFBFBFB),
        textColor = Color(0xFF1E293B),
        accentColor = Color(0xFF0F766E),
        surfaceColor = Color(0xFFF1F5F9)
    ),
    SEPIA(
        label = "Sepia",
        backgroundColor = Color(0xFFFBF0D9),
        textColor = Color(0xFF5F4B32),
        accentColor = Color(0xFF8D6E63),
        surfaceColor = Color(0xFFF4E3C1)
    ),
    NIGHT(
        label = "Night",
        backgroundColor = Color(0xFF121826),
        textColor = Color(0xFFE2E8F0),
        accentColor = Color(0xFF2DD4BF),
        surfaceColor = Color(0xFF1E293B)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiteratureReaderScreen(
    bookData: LiteratureBookStudyData,
    initialChapterIndex: Int = 0,
    onBackToOverview: () -> Unit,
    onProgressUpdated: (chapterIndex: Int, progressPercent: Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var currentChapterIndex by remember { mutableStateOf(initialChapterIndex.coerceIn(0, (bookData.chapters.size - 1).coerceAtLeast(0))) }
    var readerTheme by remember { mutableStateOf(ReaderTheme.LIGHT) }
    var fontSizeSp by remember { mutableStateOf(16) }
    var showSettingsModal by remember { mutableStateOf(false) }
    var showTocBottomSheet by remember { mutableStateOf(false) }
    var searchQuery by remember { mutableStateOf("") }
    var isSearchActive by remember { mutableStateOf(false) }

    val totalChapters = bookData.chapters.size
    val currentChapter: LiteratureChapter? = bookData.chapters.getOrNull(currentChapterIndex)
    val listState = rememberLazyListState()

    // Notify progress update
    LaunchedEffect(currentChapterIndex) {
        val percent = if (totalChapters > 0) {
            (((currentChapterIndex + 1).toFloat() / totalChapters.toFloat()) * 100f).toInt()
        } else 0
        onProgressUpdated(currentChapterIndex, percent)
        listState.scrollToItem(0)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = currentChapter?.title ?: "Chapter ${currentChapterIndex + 1}",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = readerTheme.textColor,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = "${bookData.title} • Chapter ${currentChapterIndex + 1} of $totalChapters",
                            style = MaterialTheme.typography.bodySmall,
                            color = readerTheme.textColor.copy(alpha = 0.7f),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                },
                navigationIcon = {
                    IconButton(
                        onClick = onBackToOverview,
                        modifier = Modifier.testTag("reader_back_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back to Overview",
                            tint = readerTheme.textColor
                        )
                    }
                },
                actions = {
                    // Search toggle
                    IconButton(
                        onClick = { isSearchActive = !isSearchActive },
                        modifier = Modifier.testTag("reader_search_button")
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search text",
                            tint = if (isSearchActive) readerTheme.accentColor else readerTheme.textColor
                        )
                    }

                    // Table of Contents Sheet Button
                    IconButton(
                        onClick = { showTocBottomSheet = true },
                        modifier = Modifier.testTag("reader_toc_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.List,
                            contentDescription = "Table of Contents",
                            tint = readerTheme.textColor
                        )
                    }

                    // Text & Theme Settings
                    IconButton(
                        onClick = { showSettingsModal = true },
                        modifier = Modifier.testTag("reader_settings_button")
                    ) {
                        Icon(
                            imageVector = Icons.Default.FormatSize,
                            contentDescription = "Reading Settings",
                            tint = readerTheme.textColor
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = readerTheme.backgroundColor
                )
            )
        },
        bottomBar = {
            // Reader Bottom Navigation (Previous & Next Chapter)
            Surface(
                color = readerTheme.surfaceColor,
                shadowElevation = 6.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedButton(
                        onClick = {
                            if (currentChapterIndex > 0) {
                                currentChapterIndex--
                            }
                        },
                        enabled = currentChapterIndex > 0,
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.outlinedButtonColors(
                            contentColor = readerTheme.textColor
                        ),
                        modifier = Modifier.testTag("reader_prev_chapter_button")
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text("Previous")
                    }

                    Text(
                        text = "${currentChapterIndex + 1} / $totalChapters",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Bold,
                        color = readerTheme.textColor
                    )

                    Button(
                        onClick = {
                            if (currentChapterIndex < totalChapters - 1) {
                                currentChapterIndex++
                            }
                        },
                        enabled = currentChapterIndex < totalChapters - 1,
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = readerTheme.accentColor,
                            contentColor = Color.White
                        ),
                        modifier = Modifier.testTag("reader_next_chapter_button")
                    ) {
                        Text("Next")
                        Spacer(modifier = Modifier.width(6.dp))
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        },
        containerColor = readerTheme.backgroundColor,
        modifier = modifier
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(readerTheme.backgroundColor)
        ) {
            // Search Input Bar if Active
            AnimatedVisibility(visible = isSearchActive) {
                Surface(
                    color = readerTheme.surfaceColor,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = searchQuery,
                            onValueChange = { searchQuery = it },
                            placeholder = { Text("Find in chapter...") },
                            singleLine = true,
                            modifier = Modifier
                                .weight(1f)
                                .testTag("reader_search_input"),
                            leadingIcon = {
                                Icon(Icons.Default.Search, contentDescription = null)
                            },
                            trailingIcon = {
                                if (searchQuery.isNotEmpty()) {
                                    IconButton(onClick = { searchQuery = "" }) {
                                        Icon(Icons.Default.Clear, contentDescription = "Clear")
                                    }
                                }
                            }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        TextButton(onClick = {
                            isSearchActive = false
                            searchQuery = ""
                        }) {
                            Text("Done")
                        }
                    }
                }
            }

            // Reader Content (Paragraphs & Quotes)
            val fullText = currentChapter?.fullText.orEmpty()
            val paragraphs = remember(fullText) {
                fullText.split("\n\n").filter { it.isNotBlank() }
            }

            val filteredParagraphs = if (searchQuery.isBlank()) {
                paragraphs
            } else {
                paragraphs.filter { it.contains(searchQuery, ignoreCase = true) }
            }

            LazyColumn(
                state = listState,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp),
                contentPadding = PaddingValues(top = 16.dp, bottom = 32.dp),
                verticalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                // Chapter Title Header
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 12.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "CHAPTER ${currentChapterIndex + 1}",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = readerTheme.accentColor,
                            letterSpacing = 2.sp
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = currentChapter?.title ?: "",
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.ExtraBold,
                            color = readerTheme.textColor,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        HorizontalDivider(
                            modifier = Modifier.width(60.dp),
                            thickness = 2.dp,
                            color = readerTheme.accentColor.copy(alpha = 0.5f)
                        )
                    }
                }

                // Key Quotes Banner if Available
                if (currentChapter?.keyQuotes?.isNotEmpty() == true) {
                    item {
                        Card(
                            shape = RoundedCornerShape(10.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = readerTheme.surfaceColor
                            ),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(14.dp)) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Default.FormatQuote,
                                        contentDescription = null,
                                        tint = readerTheme.accentColor,
                                        modifier = Modifier.size(20.dp)
                                    )
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text(
                                        text = "KEY EXAM QUOTE",
                                        style = MaterialTheme.typography.labelSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = readerTheme.accentColor
                                    )
                                }
                                Spacer(modifier = Modifier.height(4.dp))
                                currentChapter.keyQuotes.forEach { quote ->
                                    Text(
                                        text = quote,
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.Medium,
                                        color = readerTheme.textColor,
                                        fontFamily = FontFamily.Serif,
                                        modifier = Modifier.padding(vertical = 2.dp)
                                    )
                                }
                            }
                        }
                    }
                }

                // Chapter Paragraphs
                if (filteredParagraphs.isEmpty() && searchQuery.isNotBlank()) {
                    item {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 40.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "No matching text found for \"$searchQuery\"",
                                color = readerTheme.textColor.copy(alpha = 0.7f),
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                } else {
                    itemsIndexed(filteredParagraphs) { _, paragraph ->
                        Text(
                            text = paragraph.trim(),
                            fontSize = fontSizeSp.sp,
                            lineHeight = (fontSizeSp * 1.65).sp,
                            color = readerTheme.textColor,
                            fontFamily = FontFamily.Serif,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }

                // End of Chapter Action
                item {
                    Spacer(modifier = Modifier.height(24.dp))
                    Card(
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = readerTheme.surfaceColor
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "End of Chapter ${currentChapterIndex + 1}",
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = readerTheme.textColor
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            if (currentChapterIndex < totalChapters - 1) {
                                Button(
                                    onClick = { currentChapterIndex++ },
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = readerTheme.accentColor
                                    ),
                                    shape = RoundedCornerShape(8.dp)
                                ) {
                                    Text("Proceed to Next Chapter →")
                                }
                            } else {
                                Text(
                                    text = "🎉 You've completed reading all chapters of this book!",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = PrimaryGreen,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    // TABLE OF CONTENTS BOTTOM SHEET
    if (showTocBottomSheet) {
        ModalBottomSheet(
            onDismissRequest = { showTocBottomSheet = false },
            containerColor = MaterialTheme.colorScheme.surface
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 12.dp)
            ) {
                Text(
                    text = "Table of Contents",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(12.dp))

                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(max = 400.dp)
                ) {
                    items(bookData.chapters.size) { idx ->
                        val ch = bookData.chapters[idx]
                        val isSelected = idx == currentChapterIndex

                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = if (isSelected) PrimaryGreen.copy(alpha = 0.15f) else Color.Transparent,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    currentChapterIndex = idx
                                    showTocBottomSheet = false
                                }
                                .padding(vertical = 4.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "${ch.chapterNumber}.",
                                    style = MaterialTheme.typography.titleSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isSelected) PrimaryGreen else MaterialTheme.colorScheme.onSurfaceVariant
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Text(
                                    text = ch.title,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                    color = if (isSelected) PrimaryGreenDark else MaterialTheme.colorScheme.onSurface,
                                    modifier = Modifier.weight(1f)
                                )
                                if (isSelected) {
                                    Icon(
                                        imageVector = Icons.Default.Check,
                                        contentDescription = "Currently Reading",
                                        tint = PrimaryGreen,
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }

    // READING SETTINGS DIALOG (Font Size & Theme)
    if (showSettingsModal) {
        AlertDialog(
            onDismissRequest = { showSettingsModal = false },
            title = {
                Text(
                    text = "Reading Customization",
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    // Font Size Slider
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Font Size",
                                style = MaterialTheme.typography.titleSmall
                            )
                            Text(
                                text = "${fontSizeSp}sp",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Slider(
                            value = fontSizeSp.toFloat(),
                            onValueChange = { fontSizeSp = it.toInt() },
                            valueRange = 14f..24f,
                            steps = 4
                        )
                    }

                    // Reading Theme Selector
                    Column {
                        Text(
                            text = "Reading Mode",
                            style = MaterialTheme.typography.titleSmall
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            ReaderTheme.values().forEach { theme ->
                                val isSelected = theme == readerTheme
                                Surface(
                                    shape = RoundedCornerShape(8.dp),
                                    color = theme.backgroundColor,
                                    border = if (isSelected) ButtonDefaults.outlinedButtonBorder else null,
                                    shadowElevation = if (isSelected) 4.dp else 1.dp,
                                    modifier = Modifier
                                        .weight(1f)
                                        .clickable { readerTheme = theme }
                                        .padding(4.dp)
                                ) {
                                    Column(
                                        modifier = Modifier.padding(vertical = 12.dp),
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Text(
                                            text = theme.label,
                                            style = MaterialTheme.typography.labelMedium,
                                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                                            color = theme.textColor
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showSettingsModal = false }) {
                    Text("Done")
                }
            }
        )
    }
}
