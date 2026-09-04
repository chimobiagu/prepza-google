package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkRemove
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.data.db.BookmarkEntity
import com.example.data.db.QuestionEntity
import com.example.ui.components.EmptyStateView
import com.example.ui.components.FormattedText
import com.example.ui.components.PrepzaCard
import com.example.ui.components.QuestionImageViewer
import com.example.ui.components.QuestionMediaDetector
import com.example.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookmarksScreen(
    bookmarks: List<BookmarkEntity>,
    allQuestions: List<QuestionEntity>,
    onRemoveBookmark: (questionId: String) -> Unit,
    onPracticeSavedQuestion: (question: QuestionEntity) -> Unit,
    onBack: () -> Unit
) {
    val bookmarkedQuestions = bookmarks.mapNotNull { b ->
        allQuestions.find { it.id == b.questionId }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Saved Bookmarks (${bookmarkedQuestions.size})",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBack, modifier = Modifier.testTag("bookmarks_back_btn")) {
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
            if (bookmarkedQuestions.isEmpty()) {
                EmptyStateView(
                    icon = Icons.Default.Bookmark,
                    title = "No Bookmarks Yet",
                    description = "When practicing questions, tap the bookmark icon to save tricky questions here for quick revision."
                )
            } else {
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    contentPadding = PaddingValues(vertical = 12.dp)
                ) {
                    items(bookmarkedQuestions) { q ->
                        PrepzaCard {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Surface(
                                    color = PaleGreenBg,
                                    shape = RoundedCornerShape(8.dp)
                                ) {
                                    Text(
                                        text = "${q.subject} · ${q.year}",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = PrimaryGreen,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                                    )
                                }

                                IconButton(
                                    onClick = { onRemoveBookmark(q.id) },
                                    modifier = Modifier.size(32.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.BookmarkRemove,
                                        contentDescription = "Remove bookmark",
                                        tint = TextSecondary,
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            FormattedText(
                                text = q.questionText,
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.SemiBold,
                                color = TextPrimary,
                                maxLines = 3,
                                isQuestionStem = true
                            )

                            // Question Image / Diagram Display if present
                            QuestionImageViewer(
                                question = q,
                                modifier = Modifier.padding(top = 8.dp, bottom = 4.dp),
                                enableZoom = true
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Button(
                                onClick = { onPracticeSavedQuestion(q) },
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = TextPrimary),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Practice Question", fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            }
        }
    }
}
