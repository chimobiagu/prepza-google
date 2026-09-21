package com.example.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.db.ActiveExamStateEntity
import com.example.data.db.TopicProgressEntity
import com.example.data.db.UserProfileEntity
import com.example.data.learning.LearningPack
import com.example.data.remote.RemoteAnnouncement
import com.example.ui.components.CbtSubjectSelectionDialog
import com.example.ui.components.PracticeSetupDialog
import com.example.ui.theme.*

data class PrepzaHomeSubject(
    val id: String,
    val name: String,
    val description: String,
    val icon: ImageVector,
    val category: String
)

@Composable
fun HomeScreen(
    profile: UserProfileEntity?,
    topicProgressList: List<TopicProgressEntity> = emptyList(),
    activeUnfinishedTopic: TopicProgressEntity? = null,
    unmasteredMistakesCount: Int = 0,
    isOnline: Boolean = true,
    unsyncedCount: Int = 0,
    isSyncingCloud: Boolean = false,
    remoteAnnouncements: List<RemoteAnnouncement> = emptyList(),
    activeExamState: ActiveExamStateEntity? = null,
    onResumeActiveExam: () -> Unit = {},
    onDiscardActiveExam: () -> Unit = {},
    onSyncNow: () -> Unit = {},
    onOpenSubject: (String) -> Unit = {},
    onOpenTopic: (LearningPack) -> Unit = {},
    onStartLearningPack: (LearningPack, Int) -> Unit = { _, _ -> },
    onNavigateToPractice: (mode: String, subject: String?) -> Unit,
    onStartMiniCbt: (subject: String, questionCount: Int, timeLimitMinutes: Int) -> Unit = { subj, _, _ -> onNavigateToPractice("Practice", subj) },
    onNavigateToCbt: (selectedSubjects: List<String>) -> Unit,
    onNavigateToLibrary: () -> Unit,
    onNavigateToBookmarks: () -> Unit,
    onNavigateToAiTutor: () -> Unit,
    onNavigateToFriends: () -> Unit,
    onNavigateToMistakes: () -> Unit = {},
    onNavigateToOfflineManager: () -> Unit = {},
    onOpenSettings: () -> Unit = {},
    onUpgradeClick: () -> Unit = {}
) {
    var showCbtSubjectDialog by remember { mutableStateOf(false) }
    var searchQuery by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("All") }

    val userSubjects = remember(profile?.jambSubjectsCsv) {
        profile?.jambSubjectsCsv?.split(",")?.map { it.trim() }?.filter { it.isNotBlank() }
            ?: listOf("English Language", "Mathematics", "Physics", "Chemistry")
    }

    if (showCbtSubjectDialog) {
        CbtSubjectSelectionDialog(
            initialSubjects = userSubjects,
            onStartExam = { chosenSubjects ->
                showCbtSubjectDialog = false
                onNavigateToCbt(chosenSubjects)
            },
            onDismiss = {
                showCbtSubjectDialog = false
            }
        )
    }

    val studentName = profile?.name?.takeIf { it.isNotBlank() } ?: "Candidate"
    val studentInitial = studentName.firstOrNull()?.toString()?.uppercase() ?: "C"
    val streakDays = profile?.streakDays ?: 1
    val targetScore = profile?.targetScore ?: 320

    // Full 14 UTME subjects matching the original PREPZA database & screenshot
    val subjectsList = remember {
        listOf(
            PrepzaHomeSubject("english", "Use of English", "Comprehension, Lexis & Life Changer", Icons.Outlined.MenuBook, "Languages"),
            PrepzaHomeSubject("math", "Mathematics", "Algebra, Calculus & Geometry", Icons.Outlined.Calculate, "Sciences"),
            PrepzaHomeSubject("biology", "Biology", "Genetics, Physiology & Ecology", Icons.Outlined.Eco, "Sciences"),
            PrepzaHomeSubject("chemistry", "Chemistry", "Physical, Organic & Inorganic", Icons.Outlined.Science, "Sciences"),
            PrepzaHomeSubject("physics", "Physics", "Mechanics, Optics & Electricity", Icons.Outlined.Bolt, "Sciences"),
            PrepzaHomeSubject("economics", "Economics", "Microeconomics, Macro & Public Finance", Icons.Outlined.TrendingUp, "Commercial"),
            PrepzaHomeSubject("government", "Government", "Constitutional History & Systems", Icons.Outlined.AccountBalance, "Arts"),
            PrepzaHomeSubject("literature", "Literature in English", "Prescribed Prose, Drama & Poetry", Icons.Outlined.AutoStories, "Arts"),
            PrepzaHomeSubject("commerce", "Commerce", "Trade, Banking & Business Management", Icons.Outlined.Storefront, "Commercial"),
            PrepzaHomeSubject("crs", "CRS", "Old & New Testament, Epistles", Icons.Outlined.Bookmark, "Arts"),
            PrepzaHomeSubject("accounts", "Principles of Accounts", "Double Entry, Balance Sheet & Auditing", Icons.Outlined.ReceiptLong, "Commercial"),
            PrepzaHomeSubject("geography", "Geography", "Solar System, Rocks, Weather & Map Work", Icons.Outlined.Public, "Sciences"),
            PrepzaHomeSubject("history", "History", "Nigerian Kingdoms, Jihads & Nationalism", Icons.Outlined.HistoryEdu, "Arts"),
            PrepzaHomeSubject("irs", "Islamic Religious Studies (IRS)", "Tawhid, Fiqh, Quran, Hadith & Sirah", Icons.Outlined.Mosque, "Arts")
        )
    }

    val categories = listOf("All", "Languages", "Sciences", "Arts", "Commercial")

    val filteredSubjects = remember(searchQuery, selectedCategory) {
        subjectsList.filter { subj ->
            val matchesSearch = searchQuery.isBlank() ||
                    subj.name.contains(searchQuery, ignoreCase = true) ||
                    subj.description.contains(searchQuery, ignoreCase = true)

            val matchesCat = when (selectedCategory) {
                "All" -> true
                else -> subj.category.equals(selectedCategory, ignoreCase = true) ||
                        (selectedCategory == "Languages" && subj.name.contains("English", ignoreCase = true)) ||
                        (selectedCategory == "Sciences" && subj.name in listOf("Mathematics", "Physics", "Chemistry", "Biology", "Geography")) ||
                        (selectedCategory == "Commercial" && subj.name in listOf("Economics", "Commerce", "Principles of Accounts", "Mathematics")) ||
                        (selectedCategory == "Arts" && subj.name in listOf("Use of English", "Literature in English", "Government", "CRS", "History", "Islamic Religious Studies (IRS)"))
            }

            matchesSearch && matchesCat
        }
    }

    val isDark = LocalThemeIsDark.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(if (isDark) RawAppBackgroundDark else RawAppBackgroundLight)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 18.dp)
            .padding(top = 16.dp, bottom = 32.dp)
    ) {
        // ==========================================
        // 1. TOP PROFILE HEADER
        // ==========================================
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Circle Avatar
                Box(
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(if (isDark) Color(0xFF0F5132) else Color(0xFF0F5132)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = studentInitial,
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = studentName,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = if (isDark) Color(0xFFF8FAFC) else Color(0xFF1E293B)
                    )
                    Text(
                        text = "Target: $targetScore • ${streakDays}d streak",
                        style = MaterialTheme.typography.bodySmall,
                        color = if (isDark) Color(0xFF94A3B8) else Color(0xFF64748B)
                    )
                }
            }

            // Top Right Actions (Friends + Settings)
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Friends button
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .border(1.dp, if (isDark) Color(0xFF263345) else Color(0xFFE2E8F0), CircleShape)
                        .background(if (isDark) Color(0xFF16202E) else Color.White)
                        .clickable { onNavigateToFriends() }
                        .testTag("home_friends_button"),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Outlined.People,
                        contentDescription = "Friends",
                        tint = if (isDark) Color(0xFFCBD5E1) else Color(0xFF334155),
                        modifier = Modifier.size(20.dp)
                    )
                }

                // Settings button
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .border(1.dp, if (isDark) Color(0xFF263345) else Color(0xFFE2E8F0), CircleShape)
                        .background(if (isDark) Color(0xFF16202E) else Color.White)
                        .clickable { onOpenSettings() }
                        .testTag("home_settings_button"),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Settings,
                        contentDescription = "Settings",
                        tint = if (isDark) Color(0xFFCBD5E1) else Color(0xFF334155),
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // ==========================================
        // 2. CLOUD SYNCED PILL BANNER
        // ==========================================
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(enabled = isOnline && !isSyncingCloud, onClick = onSyncNow),
            shape = RoundedCornerShape(24.dp),
            color = if (isDark) Color(0xFF063A29).copy(alpha = 0.5f) else Color(0xFFF0FDF4),
            border = BorderStroke(1.dp, if (isDark) Color(0xFF047857) else Color(0xFFBBF7D0))
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = if (!isOnline) Icons.Outlined.CloudOff else Icons.Outlined.CloudQueue,
                    contentDescription = null,
                    tint = if (isDark) Color(0xFF10B981) else Color(0xFF15803D),
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = if (!isOnline) "Offline Mode • Stored locally" else if (isSyncingCloud) "Cloud Syncing in progress..." else "Cloud Synced • Automatic background sync enabled",
                    fontSize = 12.sp,
                    color = if (isDark) Color(0xFF34D399) else Color(0xFF166534),
                    fontWeight = FontWeight.Medium
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // ==========================================
        // 3. PREPZA PLUS UPGRADE CARD
        // ==========================================
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onUpgradeClick() },
            shape = RoundedCornerShape(16.dp),
            color = if (isDark) Color(0xFF063A29).copy(alpha = 0.5f) else Color(0xFFF0FDF4),
            border = BorderStroke(1.5.dp, if (isDark) Color(0xFF059669) else Color(0xFF22C55E))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(14.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    // Green circular lightning icon
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(CircleShape)
                            .background(if (isDark) Color(0xFF10B981) else Color(0xFF15803D)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Bolt,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(22.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Prepza Plus",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = if (isDark) Color.White else Color(0xFF1E293B)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(if (isDark) Color(0xFF065F46) else Color(0xFF14532D))
                                    .padding(horizontal = 6.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = "₦500 LIFETIME",
                                    color = Color.White,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "30 days left in free trial • Paystack & Transfer",
                            style = MaterialTheme.typography.bodySmall,
                            color = if (isDark) Color(0xFF94A3B8) else Color(0xFF475569),
                            fontSize = 11.sp
                        )
                    }
                }

                Spacer(modifier = Modifier.width(8.dp))

                // Upgrade Button
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(if (isDark) Color(0xFF065F46) else Color(0xFF14532D))
                        .clickable { onUpgradeClick() }
                        .padding(horizontal = 14.dp, vertical = 8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Upgrade",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        softWrap = false
                    )
                }
            }
        }

        // Active exam resumption if needed
        if (activeExamState != null) {
            Spacer(modifier = Modifier.height(14.dp))
            Surface(
                shape = RoundedCornerShape(14.dp),
                color = if (isDark) Color(0xFF382910) else Color(0xFFFFFBEB),
                border = BorderStroke(1.dp, if (isDark) Color(0xFFD97706) else Color(0xFFF59E0B)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Timer,
                            contentDescription = null,
                            tint = Color(0xFFF59E0B),
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            Text(
                                text = "Unfinished CBT Session",
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.sp,
                                color = if (isDark) Color(0xFFFDE68A) else Color(0xFF92400E)
                            )
                            Text(
                                text = "${activeExamState.timerSecondsRemaining / 60}m remaining",
                                fontSize = 11.sp,
                                color = if (isDark) Color(0xFFFBBF24) else Color(0xFFB45309)
                            )
                        }
                    }
                    Button(
                        onClick = onResumeActiveExam,
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD97706)),
                        shape = RoundedCornerShape(8.dp),
                        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Text("Resume", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // ==========================================
        // 4. "UTME Mastery" SECTION TITLE
        // ==========================================
        Text(
            text = "UTME Mastery",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.ExtraBold,
            color = if (isDark) Color(0xFFF8FAFC) else Color(0xFF0F172A),
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(14.dp))

        // ==========================================
        // 5. 2x2 FEATURE GRID (CBT Mock, AI Tutor, Literature, Saved)
        // ==========================================
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // CBT Mock Card
            Surface(
                modifier = Modifier
                    .weight(1f)
                    .height(68.dp)
                    .clickable { showCbtSubjectDialog = true }
                    .testTag("home_cbt_mock_card"),
                shape = RoundedCornerShape(16.dp),
                color = if (isDark) Color(0xFF16202E) else Color(0xFFFFFBEB),
                border = BorderStroke(1.dp, if (isDark) Color(0xFF263345) else Color(0xFFFDE68A))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(if (isDark) Color(0xFF451A03) else Color(0xFFFEF3C7)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Timer,
                            contentDescription = "CBT Mock",
                            tint = if (isDark) Color(0xFFF59E0B) else Color(0xFFD97706),
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "CBT Mock",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = if (isDark) Color.White else Color(0xFF1E293B),
                        fontSize = 15.sp
                    )
                }
            }

            // AI Tutor Card
            Surface(
                modifier = Modifier
                    .weight(1f)
                    .height(68.dp)
                    .clickable { onNavigateToAiTutor() }
                    .testTag("home_ai_tutor_card"),
                shape = RoundedCornerShape(16.dp),
                color = if (isDark) Color(0xFF063A29).copy(alpha = 0.5f) else Color(0xFFECFDF5),
                border = BorderStroke(1.dp, if (isDark) Color(0xFF059669) else Color(0xFFA7F3D0))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(if (isDark) Color(0xFF047857) else Color(0xFF065F46)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.AutoAwesome,
                            contentDescription = "AI Tutor",
                            tint = Color.White,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "AI Tutor",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = if (isDark) Color.White else Color(0xFF1E293B),
                        fontSize = 15.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Literature Card
            Surface(
                modifier = Modifier
                    .weight(1f)
                    .height(68.dp)
                    .clickable { onNavigateToLibrary() }
                    .testTag("home_literature_card"),
                shape = RoundedCornerShape(16.dp),
                color = if (isDark) Color(0xFF16202E) else Color(0xFFFAF5FF),
                border = BorderStroke(1.dp, if (isDark) Color(0xFF263345) else Color(0xFFE9D5FF))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(if (isDark) Color(0xFF3B0764) else Color(0xFFF3E8FF)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.MenuBook,
                            contentDescription = "Literature",
                            tint = if (isDark) Color(0xFFC084FC) else Color(0xFF9333EA),
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Literature",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = if (isDark) Color.White else Color(0xFF1E293B),
                        fontSize = 15.sp
                    )
                }
            }

            // Saved Card
            Surface(
                modifier = Modifier
                    .weight(1f)
                    .height(68.dp)
                    .clickable { onNavigateToBookmarks() }
                    .testTag("home_saved_card"),
                shape = RoundedCornerShape(16.dp),
                color = if (isDark) Color(0xFF16202E) else Color(0xFFEFF6FF),
                border = BorderStroke(1.dp, if (isDark) Color(0xFF263345) else Color(0xFFBFDBFE))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(38.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(if (isDark) Color(0xFF172554) else Color(0xFFDBEAFE)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Bookmark,
                            contentDescription = "Saved",
                            tint = if (isDark) Color(0xFF60A5FA) else Color(0xFF2563EB),
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Saved",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = if (isDark) Color.White else Color(0xFF1E293B),
                        fontSize = 15.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // ==========================================
        // 6. 100% OFFLINE READY BANNER
        // ==========================================
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onNavigateToOfflineManager() },
            shape = RoundedCornerShape(16.dp),
            color = if (isDark) Color(0xFF063A29).copy(alpha = 0.5f) else Color(0xFFF0FDF4),
            border = BorderStroke(1.dp, if (isDark) Color(0xFF047857) else Color(0xFFBBF7D0))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(if (isDark) Color(0xFF10B981) else Color(0xFF15803D)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Filled.CloudDownload,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {
                        Text(
                            text = "100% Offline Ready",
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                            color = if (isDark) Color.White else Color(0xFF0F172A)
                        )
                        Text(
                            text = "All 14 subject question banks stored on-device",
                            fontSize = 11.sp,
                            color = if (isDark) Color(0xFF94A3B8) else Color(0xFF64748B)
                        )
                    }
                }

                Text(
                    text = "Manage",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (isDark) Color(0xFF34D399) else Color(0xFF15803D),
                    maxLines = 1,
                    softWrap = false
                )
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        // ==========================================
        // 7. SEARCH INPUT FIELD
        // ==========================================
        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            color = if (isDark) Color(0xFF16202E) else Color.White,
            border = BorderStroke(1.dp, if (isDark) Color(0xFF263345) else Color(0xFFE2E8F0))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Outlined.Search,
                    contentDescription = "Search",
                    tint = Color(0xFF94A3B8),
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                BasicTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    singleLine = true,
                    textStyle = TextStyle(
                        fontSize = 14.sp,
                        color = if (isDark) Color.White else Color(0xFF1E293B)
                    ),
                    cursorBrush = SolidColor(if (isDark) Color(0xFF10B981) else Color(0xFF15803D)),
                    modifier = Modifier.fillMaxWidth(),
                    decorationBox = { innerTextField ->
                        if (searchQuery.isEmpty()) {
                            Text(
                                text = "Search subjects...",
                                fontSize = 14.sp,
                                color = Color(0xFF94A3B8)
                            )
                        }
                        innerTextField()
                    }
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        // ==========================================
        // 8. CATEGORY FILTER CHIPS
        // ==========================================
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(categories) { cat ->
                val isSelected = selectedCategory.equals(cat, ignoreCase = true)
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(20.dp))
                        .background(
                            if (isSelected) {
                                if (isDark) Color(0xFF10B981) else Color(0xFF15803D)
                            } else {
                                if (isDark) Color(0xFF16202E) else Color.White
                            }
                        )
                        .border(
                            1.dp,
                            if (isSelected) {
                                if (isDark) Color(0xFF10B981) else Color(0xFF15803D)
                            } else {
                                if (isDark) Color(0xFF263345) else Color(0xFFE2E8F0)
                            },
                            RoundedCornerShape(20.dp)
                        )
                        .clickable { selectedCategory = cat }
                        .padding(horizontal = 18.dp, vertical = 8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = cat,
                        fontSize = 13.sp,
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                        color = if (isSelected) Color.White else if (isDark) Color(0xFFCBD5E1) else Color(0xFF334155)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // ==========================================
        // 9. SUBJECT LIST CARDS (Leads to Subject Learning Flow)
        // ==========================================
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            filteredSubjects.forEach { subj ->
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onOpenSubject(subj.name) }
                        .testTag("subject_card_${subj.id}"),
                    shape = RoundedCornerShape(16.dp),
                    color = if (isDark) Color(0xFF16202E) else Color.White,
                    border = BorderStroke(1.dp, if (isDark) Color(0xFF263345) else Color(0xFFE2E8F0))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.weight(1f)
                        ) {
                            // Rounded Square with green tint
                            Box(
                                modifier = Modifier
                                    .size(46.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(if (isDark) Color(0xFF063A29) else Color(0xFFDCFCE7)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = subj.icon,
                                    contentDescription = subj.name,
                                    tint = if (isDark) Color(0xFF34D399) else Color(0xFF15803D),
                                    modifier = Modifier.size(24.dp)
                                )
                            }

                            Spacer(modifier = Modifier.width(14.dp))

                            Column {
                                Text(
                                    text = subj.name,
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    color = if (isDark) Color(0xFFF8FAFC) else Color(0xFF0F172A),
                                    fontSize = 15.sp
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = subj.description,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = if (isDark) Color(0xFF94A3B8) else Color(0xFF64748B),
                                    fontSize = 12.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        }

                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "Open ${subj.name}",
                            tint = if (isDark) Color(0xFF94A3B8) else Color(0xFF64748B),
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
            }
        }
    }
}
