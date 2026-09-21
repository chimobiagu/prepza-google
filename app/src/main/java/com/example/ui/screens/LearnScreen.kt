package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.data.db.QuestionEntity
import com.example.ui.components.*
import com.example.ui.theme.*

@Composable
fun LearnScreen(
    allQuestions: List<QuestionEntity>,
    onSelectTopicPractice: (subject: String, topic: String) -> Unit
) {
    val subjects = listOf(
        "Use of English",
        "Mathematics",
        "Chemistry",
        "Physics",
        "Biology",
        "CRS",
        "Government",
        "Economics",
        "Principles of Accounts",
        "Literature in English",
        "Commerce"
    )
    var selectedSubject by remember { mutableStateOf("Biology") }
    var expandedTopic by remember { mutableStateOf<String?>(null) }

    val topicsForSubject = remember(selectedSubject, allQuestions) {
        val list = allQuestions.filter { it.subject.equals(selectedSubject, ignoreCase = true) }
            .map { it.topic }
            .distinct()
        if (list.isEmpty()) {
            when (selectedSubject) {
                "Biology" -> listOf("Cell Biology", "Ecology", "Genetics", "Evolution", "Nutrition", "Reproduction")
                "Mathematics" -> listOf("Algebra", "Permutations & Combinations", "Trigonometry", "Statistics", "Calculus")
                "Chemistry" -> listOf("Atomic Structure", "Chemical Bonding", "Stoichiometry", "Organic Chemistry")
                "Physics" -> listOf("Electricity & Magnetism", "Mechanics", "Waves", "Light & Optics")
                "Use of English" -> listOf("Comprehension", "Lexis and Structure", "Synonyms & Antonyms", "Oral English")
                else -> listOf("General Principles", "Past Exam Questions", "Key Concepts")
            }
        } else list
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBackground)
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        Text(
            text = "Learn & Master",
            style = MaterialTheme.typography.displayMedium,
            fontWeight = FontWeight.Bold,
            color = TextPrimary
        )
        Text(
            text = "Structured topic-by-topic JAMB curriculum",
            style = MaterialTheme.typography.bodyMedium,
            color = TextSecondary
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Subject Selector Chips
        ScrollableTabRow(
            selectedTabIndex = subjects.indexOf(selectedSubject).coerceAtLeast(0),
            edgePadding = 0.dp,
            containerColor = Color.Transparent,
            divider = {}
        ) {
            subjects.forEach { subj ->
                val isSelected = subj == selectedSubject
                Tab(
                    selected = isSelected,
                    onClick = { selectedSubject = subj },
                    text = {
                        Text(
                            text = subj,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                            color = if (isSelected) PrimaryGreen else TextPrimary
                        )
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Subject Mastery Overview Header
        PrepzaCard(backgroundColor = PaleGreenBg, borderColor = PrimaryGreenLight.copy(alpha = 0.3f)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = selectedSubject,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    Text(
                        text = "${topicsForSubject.size} key topics in syllabus",
                        style = MaterialTheme.typography.bodySmall,
                        color = TextSecondary
                    )
                }
                Surface(
                    color = PrimaryGreen,
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = "68% Mastery",
                        style = MaterialTheme.typography.labelLarge,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            PrepzaProgressBar(progress = 0.68f)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Topics & Subtopics",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = TextPrimary
        )

        Spacer(modifier = Modifier.height(12.dp))

        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            topicsForSubject.forEach { topic ->
                val isExpanded = expandedTopic == topic

                PrepzaCard(
                    onClick = { expandedTopic = if (isExpanded) null else topic }
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = topic,
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = "15-25 past questions available",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary
                            )
                        }

                        Icon(
                            imageVector = if (isExpanded) Icons.Default.ExpandMore else Icons.Default.ChevronRight,
                            contentDescription = null,
                            tint = TextSecondary
                        )
                    }

                    if (isExpanded) {
                        Spacer(modifier = Modifier.height(14.dp))
                        HorizontalDivider(color = BorderSubtle)
                        Spacer(modifier = Modifier.height(12.dp))

                        Text(
                            text = "Key Syllabus Focus:",
                            style = MaterialTheme.typography.labelMedium,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryGreen
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "• Core principles, formulas, and recurring JAMB question structures.\n• High accuracy yields higher score in this section.",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )

                        Spacer(modifier = Modifier.height(14.dp))

                        Button(
                            onClick = { onSelectTopicPractice(selectedSubject, topic) },
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen, contentColor = Color.White),
                            modifier = Modifier
                                .fillMaxWidth()
                                .testTag("practice_topic_${topic.lowercase().replace(" ", "_")}")
                        ) {
                            Text("Practice $topic Questions →", fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }
}
