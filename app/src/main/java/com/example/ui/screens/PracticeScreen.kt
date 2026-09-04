package com.example.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.CbtSubjectSelectionDialog
import com.example.ui.components.PracticeSetupDialog
import com.example.ui.theme.*

@Composable
fun PracticeScreen(
    userSubjectsCsv: String? = null,
    activeExamState: com.example.data.db.ActiveExamStateEntity? = null,
    onResumeActiveExam: () -> Unit = {},
    onDiscardActiveExam: () -> Unit = {},
    onStartPractice: (mode: String, subject: String?) -> Unit,
    onStartMiniCbt: (subject: String, questionCount: Int, timeLimitMinutes: Int) -> Unit = { subj, count, time -> onStartPractice("Practice", subj) },
    onStartCbtMock: (selectedSubjects: List<String>) -> Unit,
    onNavigateToAiTutor: () -> Unit = {}
) {
    var searchQuery by remember { mutableStateOf("") }
    var showSubjectSelectionDialog by remember { mutableStateOf(false) }
    var selectedSubjectForSetup by remember { mutableStateOf<String?>(null) }

    val initialUserSubjects = remember(userSubjectsCsv) {
        userSubjectsCsv?.split(",")?.map { it.trim() }?.filter { it.isNotBlank() }
            ?: listOf("English Language", "Mathematics", "Physics", "Chemistry")
    }

    if (showSubjectSelectionDialog) {
        CbtSubjectSelectionDialog(
            initialSubjects = initialUserSubjects,
            onStartExam = { chosenSubjects ->
                showSubjectSelectionDialog = false
                onStartCbtMock(chosenSubjects)
            },
            onDismiss = {
                showSubjectSelectionDialog = false
            }
        )
    }

    if (selectedSubjectForSetup != null) {
        PracticeSetupDialog(
            subject = selectedSubjectForSetup!!,
            onStartSession = { subject, questionCount, timeLimitMinutes ->
                val targetSubject = selectedSubjectForSetup!!
                selectedSubjectForSetup = null
                onStartMiniCbt(targetSubject, questionCount, timeLimitMinutes)
            },
            onDismiss = {
                selectedSubjectForSetup = null
            }
        )
    }

    val allSubjects = listOf(
        PracticeSubjectItem("Use of English", "Comprehension & Lexis", Icons.Outlined.MenuBook, SoftEmeraldBg, PrimaryGreen),
        PracticeSubjectItem("Mathematics", "Algebra, Calculus & Geometry", Icons.Outlined.Calculate, SoftEmeraldBg, PrimaryGreen),
        PracticeSubjectItem("Physics", "Mechanics, Optics & Electricity", Icons.Outlined.Bolt, SoftOrangeBg, OrangeAccent),
        PracticeSubjectItem("Chemistry", "Inorganic & Organic Chemistry", Icons.Outlined.Science, SoftAmberBg, AmberAccent),
        PracticeSubjectItem("Biology", "Genetics & Human Physiology", Icons.Outlined.Eco, SoftEmeraldBg, PrimaryGreen),
        PracticeSubjectItem("Economics", "Micro & Macroeconomics", Icons.Outlined.TrendingUp, SoftBlueBg, BlueAccent),
        PracticeSubjectItem("Government", "Systems & Nigerian History", Icons.Outlined.AccountBalance, SoftEmeraldBg, PrimaryGreen),
        PracticeSubjectItem("Literature in English", "Prose, Drama & African Poetry", Icons.Outlined.AutoStories, SoftPurpleBg, PurpleAccent),
        PracticeSubjectItem("Commerce", "Trade, Banking & Management", Icons.Outlined.Storefront, SoftTealBg, TealAccent),
        PracticeSubjectItem("CRS", "Christian Ethics & Scripture", Icons.Outlined.Bookmark, SoftEmeraldBg, PrimaryGreen),
        PracticeSubjectItem("Principles of Accounts", "Balance Sheet & Accounts", Icons.Outlined.ReceiptLong, SoftAmberBg, AmberAccent),
        PracticeSubjectItem("Geography", "Physical & Regional Geography", Icons.Outlined.Public, SoftTealBg, TealAccent),
        PracticeSubjectItem("History", "Pre-Colonial & Modern History", Icons.Outlined.HistoryEdu, SoftPurpleBg, PurpleAccent),
        PracticeSubjectItem("Islamic Religious Studies (IRS)", "Tawhid, Fiqh & Quranic Studies", Icons.Outlined.Mosque, SoftEmeraldBg, PrimaryGreen)
    )

    val filteredSubjects = if (searchQuery.isBlank()) allSubjects else allSubjects.filter { it.name.contains(searchQuery, ignoreCase = true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBackground)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 14.dp)
    ) {
        // Minimalist Header
        Text(
            text = "Practice",
            style = MaterialTheme.typography.displayMedium.copy(
                fontSize = 26.sp,
                letterSpacing = (-0.5).sp
            ),
            fontWeight = FontWeight.Bold,
            color = TextPrimary
        )

        Spacer(modifier = Modifier.height(14.dp))

        // Active CBT Exam Interruption Recovery Banner
        if (activeExamState != null) {
            val answeredCount = remember(activeExamState.userAnswersJson) {
                if (activeExamState.userAnswersJson.isBlank() || activeExamState.userAnswersJson == "{}") 0
                else activeExamState.userAnswersJson.split(",").count { it.contains(":") }
            }
            val totalQuestionsCount = remember(activeExamState.questionIdsCsv) {
                activeExamState.questionIdsCsv.split(",").count { it.isNotBlank() }
            }
            val minutesLeft = activeExamState.timerSecondsRemaining / 60
            val secondsLeft = activeExamState.timerSecondsRemaining % 60

            Surface(
                shape = RoundedCornerShape(16.dp),
                color = SoftAmberBg,
                border = androidx.compose.foundation.BorderStroke(1.5.dp, AmberAccent),
                shadowElevation = 3.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 14.dp)
                    .testTag("practice_active_cbt_recovery_banner")
            ) {
                Column(modifier = Modifier.padding(14.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Surface(
                                shape = CircleShape,
                                color = AmberAccent,
                                modifier = Modifier.size(30.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        imageVector = Icons.Default.PendingActions,
                                        contentDescription = "Resume Exam",
                                        tint = Color.White,
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "In-Progress Exam Detected",
                                    fontWeight = FontWeight.Bold,
                                    style = MaterialTheme.typography.titleSmall,
                                    color = TextPrimary
                                )
                                Text(
                                    text = "${activeExamState.mode} • %02d:%02d left".format(minutesLeft, secondsLeft),
                                    style = MaterialTheme.typography.bodySmall,
                                    color = AmberAccent,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }

                        Surface(
                            shape = RoundedCornerShape(8.dp),
                            color = AmberAccent.copy(alpha = 0.15f)
                        ) {
                            Text(
                                text = "$answeredCount/$totalQuestionsCount answered",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = AmberAccent,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                fontSize = 10.sp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        OutlinedButton(
                            onClick = onDiscardActiveExam,
                            modifier = Modifier
                                .weight(0.35f)
                                .height(40.dp)
                                .testTag("practice_discard_exam_btn"),
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = TextSecondary
                            ),
                            border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Text("Discard", fontSize = 12.sp, fontWeight = FontWeight.Medium)
                        }

                        Button(
                            onClick = onResumeActiveExam,
                            modifier = Modifier
                                .weight(0.65f)
                                .height(40.dp)
                                .testTag("practice_resume_exam_btn"),
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = PrimaryGreen
                            ),
                            contentPadding = PaddingValues(0.dp)
                        ) {
                            Icon(Icons.Default.PlayArrow, contentDescription = null, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Resume Exam", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }

        // Hero Card: Timed Full CBT Mock Exam
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(18.dp))
                .clickable { showSubjectSelectionDialog = true }
                .testTag("start_cbt_mock_banner"),
            color = DarkCardBg,
            shape = RoundedCornerShape(18.dp)
        ) {
            Row(
                modifier = Modifier.padding(18.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    Surface(
                        shape = RoundedCornerShape(10.dp),
                        color = Color.White.copy(alpha = 0.12f),
                        modifier = Modifier.size(42.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = Icons.Outlined.Timer,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(22.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {
                        Text(
                            text = "Full CBT Mock Exam",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            text = "Standard 180 Questions · 2 Hours",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextMuted
                        )
                    }
                }

                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Start",
                    tint = Color.White.copy(alpha = 0.8f),
                    modifier = Modifier.size(20.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        // AI Tutor Quick Assistance Banner
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(14.dp))
                .clickable { onNavigateToAiTutor() }
                .testTag("practice_ai_tutor_card"),
            shape = RoundedCornerShape(14.dp),
            color = SoftEmeraldBg,
            border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreenLight.copy(alpha = 0.4f))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = RoundedCornerShape(8.dp),
                        color = PrimaryGreen,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = Icons.Default.AutoAwesome,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column {
                        Text(
                            text = "AI 24/7 Step-by-Step Tutor",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        Text(
                            text = "Ask questions, formula proofs & concept breakdowns",
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary
                        )
                    }
                }

                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = "Open AI Tutor",
                    tint = PrimaryGreen,
                    modifier = Modifier.size(18.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Search Bar
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            placeholder = { Text("Search subjects...", color = TextMuted, fontSize = 14.sp) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    tint = TextSecondary,
                    modifier = Modifier.size(18.dp)
                )
            },
            trailingIcon = if (searchQuery.isNotEmpty()) {
                {
                    IconButton(onClick = { searchQuery = "" }) {
                        Icon(Icons.Default.Clear, contentDescription = "Clear", tint = TextSecondary, modifier = Modifier.size(16.dp))
                    }
                }
            } else null,
            modifier = Modifier
                .fillMaxWidth()
                .testTag("practice_search_bar"),
            shape = RoundedCornerShape(14.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = SurfaceWhite,
                unfocusedContainerColor = SurfaceWhite,
                focusedBorderColor = PrimaryGreen,
                unfocusedBorderColor = BorderSubtle
            ),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(14.dp))

        // Subject List
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            filteredSubjects.forEach { subj ->
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(14.dp))
                        .clickable { selectedSubjectForSetup = subj.name }
                        .testTag("practice_subject_${subj.name.lowercase().replace(" ", "_")}"),
                    shape = RoundedCornerShape(14.dp),
                    color = SurfaceWhite,
                    border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 14.dp, vertical = 12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Surface(
                            shape = RoundedCornerShape(10.dp),
                            color = subj.badgeBgColor,
                            modifier = Modifier.size(38.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = subj.icon,
                                    contentDescription = null,
                                    tint = subj.badgeIconColor,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = subj.name,
                                style = MaterialTheme.typography.titleSmall,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = subj.syllabusSubtitle,
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary
                            )
                        }

                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "Practice Subject",
                            tint = TextSecondary,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
    }
}

private data class PracticeSubjectItem(
    val name: String,
    val syllabusSubtitle: String,
    val icon: ImageVector,
    val badgeBgColor: Color,
    val badgeIconColor: Color
)
