package com.example.ui.components

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.data.db.UserAccountEntity
import com.example.data.db.UserProfileEntity
import com.example.data.notifications.NotificationScheduler
import com.example.ui.theme.*
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AcademicSettingsDialog(
    profile: UserProfileEntity?,
    activeAccount: UserAccountEntity?,
    isSyncingContent: Boolean = false,
    lastSyncMessage: String? = null,
    currentThemeMode: AppThemeMode = AppThemeMode.SYSTEM,
    onThemeModeChange: (AppThemeMode) -> Unit = {},
    onSaveProfile: (targetScore: Int, subjectsCsv: String, studyGoalMinutes: Int, targetInstitution: String, dreamCourse: String, jambExamDateTimestamp: Long) -> Unit,
    onLogOut: () -> Unit,
    onUpgradeClick: () -> Unit = {},
    onOpenMistakeBank: () -> Unit = {},
    onOpenOfflinePacks: () -> Unit = {},
    onOpenReferrals: () -> Unit = {},
    onCheckAppUpdate: () -> Unit = {},
    onSyncContent: () -> Unit = {},
    onDismiss: () -> Unit
) {
    val context = LocalContext.current

    // State variables
    var targetScore by remember { mutableStateOf(profile?.targetScore?.toString() ?: "340") }
    var studyGoalMinutes by remember { mutableStateOf(profile?.studyGoalMinutesPerDay ?: 45) }
    var targetInstitution by remember { mutableStateOf(profile?.targetInstitution ?: "University of Lagos (UNILAG)") }
    var dreamCourse by remember { mutableStateOf(profile?.dreamCourse ?: "Medicine & Surgery") }
    var jambExamDateTimestamp by remember { mutableStateOf(profile?.jambExamDateTimestamp ?: (System.currentTimeMillis() + (64L * 24 * 3600 * 1000L))) }

    // Subject state
    val compulsorySubject = "English Language"
    val allAvailableElectives = remember {
        listOf(
            "Mathematics",
            "Physics",
            "Chemistry",
            "Biology",
            "Economics",
            "Government",
            "Literature in English",
            "CRS",
            "Commerce",
            "Principles of Accounts",
            "Geography",
            "History",
            "Islamic Religious Studies (IRS)"
        )
    }

    // Parse initial electives
    val initialSelected = remember(profile?.jambSubjectsCsv) {
        val list = profile?.jambSubjectsCsv?.split(",")?.map { it.trim() } ?: listOf("Mathematics", "Physics", "Chemistry")
        val filtered = list.filter { it != compulsorySubject }
        val res = mutableListOf<String>()
        res.addAll(filtered.take(3))
        while (res.size < 3) {
            val fallback = allAvailableElectives.firstOrNull { !res.contains(it) } ?: "Mathematics"
            res.add(fallback)
        }
        res
    }

    var elective1 by remember { mutableStateOf(initialSelected.getOrElse(0) { "Mathematics" }) }
    var elective2 by remember { mutableStateOf(initialSelected.getOrElse(1) { "Physics" }) }
    var elective3 by remember { mutableStateOf(initialSelected.getOrElse(2) { "Chemistry" }) }

    // Section expansion states (Accordion style - groups complex preferences)
    var isSchoolExpanded by remember { mutableStateOf(true) }
    var isSubjectsExpanded by remember { mutableStateOf(false) }
    var isGoalsExpanded by remember { mutableStateOf(false) }
    var isNotificationsExpanded by remember { mutableStateOf(false) }
    var isUtilitiesExpanded by remember { mutableStateOf(false) }

    // Internal Dropdown expansion states
    var courseDropdownExpanded by remember { mutableStateOf(false) }
    var courseSearchQuery by remember { mutableStateOf("") }

    var institutionDropdownExpanded by remember { mutableStateOf(false) }
    var institutionSearchQuery by remember { mutableStateOf("") }
    var institutionCategoryFilter by remember { mutableStateOf("All") }

    var scoreDropdownExpanded by remember { mutableStateOf(false) }
    var goalDropdownExpanded by remember { mutableStateOf(false) }
    var dateDropdownExpanded by remember { mutableStateOf(false) }

    var elective1Expanded by remember { mutableStateOf(false) }
    var elective2Expanded by remember { mutableStateOf(false) }
    var elective3Expanded by remember { mutableStateOf(false) }

    // Notification toggles
    val notifPrefs = remember { context.getSharedPreferences(NotificationScheduler.PREFS_NAME, android.content.Context.MODE_PRIVATE) }
    var dailyPracticeReminderEnabled by remember { mutableStateOf(notifPrefs.getBoolean(NotificationScheduler.KEY_DAILY_PRACTICE_ENABLED, true)) }
    var streakReminderEnabled by remember { mutableStateOf(notifPrefs.getBoolean(NotificationScheduler.KEY_DAILY_STREAK_ENABLED, true)) }
    var cbtMockReminderEnabled by remember { mutableStateOf(notifPrefs.getBoolean(NotificationScheduler.KEY_CBT_MOCK_ENABLED, true)) }

    // Master list of Nigerian Institutions with category classification
    val masterInstitutions = remember {
        listOf(
            "University of Lagos (UNILAG)" to "Federal",
            "University of Ibadan (UI)" to "Federal",
            "Obafemi Awolowo University (OAU)" to "Federal",
            "Ahmadu Bello University (ABU)" to "Federal",
            "University of Nigeria Nsukka (UNN)" to "Federal",
            "University of Benin (UNIBEN)" to "Federal",
            "Federal University of Technology Akure (FUTA)" to "Federal",
            "University of Ilorin (UNILORIN)" to "Federal",
            "Federal University of Technology Minna (FUTMINNA)" to "Federal",
            "Federal University of Agriculture Abeokuta (FUNAAB)" to "Federal",
            "Bayero University Kano (BUK)" to "Federal",
            "University of Port Harcourt (UNIPORT)" to "Federal",
            "University of Calabar (UNICAL)" to "Federal",
            "University of Abuja (UNIABUJA)" to "Federal",
            "Nnamdi Azikiwe University (UNIZIK)" to "Federal",
            "Lagos State University (LASU)" to "State",
            "Olabisi Onabanjo University (OOU)" to "State",
            "Ekiti State University (EKSU)" to "State",
            "Delta State University (DELSU)" to "State",
            "Rivers State University (RSU)" to "State",
            "Kaduna State University (KASU)" to "State",
            "Covenant University (CU)" to "Private",
            "Babcock University" to "Private",
            "Landmark University" to "Private",
            "Bowen University" to "Private",
            "Afe Babalola University (ABUAD)" to "Private",
            "Pan-Atlantic University (PAU)" to "Private"
        )
    }

    // Master list of Courses
    val masterCourses = remember {
        listOf(
            "Medicine & Surgery",
            "Computer Science",
            "Software Engineering",
            "Law / Jurisprudence",
            "Pharmacy",
            "Nursing Science",
            "Mechanical Engineering",
            "Electrical & Electronics Engineering",
            "Civil Engineering",
            "Petroleum Engineering",
            "Accounting",
            "Economics",
            "Business Administration",
            "Dentistry",
            "Medical Laboratory Science",
            "Mass Communication",
            "Political Science & Public Admin",
            "Biochemistry",
            "Microbiology",
            "Architecture",
            "Finance & Banking",
            "Cybersecurity",
            "Radiography",
            "Physiotherapy"
        )
    }

    val filteredInstitutions = remember(institutionSearchQuery, institutionCategoryFilter) {
        masterInstitutions.filter { (name, category) ->
            val matchesCategory = (institutionCategoryFilter == "All" || category.equals(institutionCategoryFilter, ignoreCase = true))
            val matchesQuery = institutionSearchQuery.isBlank() || name.contains(institutionSearchQuery, ignoreCase = true)
            matchesCategory && matchesQuery
        }.map { it.first }
    }

    val filteredCourses = remember(courseSearchQuery) {
        if (courseSearchQuery.isBlank()) masterCourses
        else masterCourses.filter { it.contains(courseSearchQuery, ignoreCase = true) }
    }

    val safeDismiss = {
        courseDropdownExpanded = false
        institutionDropdownExpanded = false
        elective1Expanded = false
        elective2Expanded = false
        elective3Expanded = false
        scoreDropdownExpanded = false
        goalDropdownExpanded = false
        dateDropdownExpanded = false
        onDismiss()
    }

    Dialog(
        onDismissRequest = safeDismiss,
        properties = DialogProperties(
            dismissOnBackPress = true,
            dismissOnClickOutside = true,
            usePlatformDefaultWidth = false
        )
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .fillMaxHeight(0.94f)
                .clip(RoundedCornerShape(24.dp)),
            color = SurfaceWhite,
            shadowElevation = 10.dp,
            border = BorderStroke(1.dp, BorderSubtle)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                // Header Bar
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            color = PaleGreenBg,
                            shape = CircleShape,
                            modifier = Modifier.size(38.dp),
                            border = BorderStroke(1.dp, PrimaryGreen.copy(alpha = 0.3f))
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.Tune,
                                    contentDescription = null,
                                    tint = PrimaryGreen,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Settings & Academic Plan",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = "Preferences, Target, Combinations & Display",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary,
                                fontSize = 11.sp
                            )
                        }
                    }

                    IconButton(
                        onClick = safeDismiss,
                        modifier = Modifier.testTag("close_settings_button")
                    ) {
                        Icon(Icons.Default.Close, contentDescription = "Close", tint = TextPrimary)
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Scrollable Content
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    // 1. Account Identity & Subscription Header Card
                    Surface(
                        color = AppBackground,
                        shape = RoundedCornerShape(16.dp),
                        border = BorderStroke(1.dp, BorderSubtle),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                color = PrimaryGreen,
                                shape = CircleShape,
                                modifier = Modifier.size(46.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Text(
                                        text = (profile?.name?.take(1) ?: "S").uppercase(),
                                        style = MaterialTheme.typography.titleMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.width(12.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = profile?.name ?: "UTME Scholar",
                                    style = MaterialTheme.typography.titleSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = TextPrimary
                                )
                                Text(
                                    text = profile?.email ?: activeAccount?.phoneNumber ?: "Google Student Account",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = TextSecondary,
                                    fontSize = 11.sp,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }

                            val isPlus = profile?.isPlusSubscriber == true
                            Surface(
                                color = if (isPlus) PaleGreenBg else SoftAmberBg,
                                shape = RoundedCornerShape(8.dp),
                                border = BorderStroke(1.dp, if (isPlus) PrimaryGreen else AmberAccent)
                            ) {
                                Text(
                                    text = if (isPlus) "PREPZA PLUS" else "TRIAL PLAN",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = if (isPlus) PrimaryGreenDark else AmberAccent,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                    fontSize = 10.sp
                                )
                            }
                        }
                    }

                    // 2. High-Fidelity Theme & Display Mode Selector
                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = AppBackground,
                        border = BorderStroke(1.dp, BorderSubtle),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        imageVector = Icons.Default.Palette,
                                        contentDescription = null,
                                        tint = PrimaryGreen,
                                        modifier = Modifier.size(18.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "Theme & Appearance",
                                        style = MaterialTheme.typography.titleSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = TextPrimary
                                    )
                                }

                                Surface(
                                    color = PaleGreenBg,
                                    shape = RoundedCornerShape(6.dp)
                                ) {
                                    Text(
                                        text = currentThemeMode.name,
                                        style = MaterialTheme.typography.labelSmall,
                                        color = PrimaryGreen,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                        fontSize = 9.sp
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                val themeOptions = listOf(
                                    Triple(AppThemeMode.SYSTEM, "System", Icons.Default.BrightnessAuto),
                                    Triple(AppThemeMode.LIGHT, "Light", Icons.Default.LightMode),
                                    Triple(AppThemeMode.DARK, "Dark OLED", Icons.Default.DarkMode)
                                )

                                themeOptions.forEach { (mode, label, icon) ->
                                    val isSelected = currentThemeMode == mode
                                    Surface(
                                        modifier = Modifier
                                            .weight(1f)
                                            .clip(RoundedCornerShape(12.dp))
                                            .clickable { onThemeModeChange(mode) }
                                            .testTag("theme_mode_${mode.name.lowercase()}"),
                                        color = if (isSelected) PrimaryGreen else SurfaceWhite,
                                        shape = RoundedCornerShape(12.dp),
                                        border = BorderStroke(
                                            1.dp,
                                            if (isSelected) PrimaryGreen else BorderSubtle
                                        ),
                                        shadowElevation = if (isSelected) 2.dp else 0.dp
                                    ) {
                                        Column(
                                            modifier = Modifier.padding(vertical = 10.dp, horizontal = 6.dp),
                                            horizontalAlignment = Alignment.CenterHorizontally
                                        ) {
                                            Icon(
                                                imageVector = icon,
                                                contentDescription = null,
                                                tint = if (isSelected) Color.White else TextPrimary,
                                                modifier = Modifier.size(18.dp)
                                            )
                                            Spacer(modifier = Modifier.height(4.dp))
                                            Text(
                                                text = label,
                                                style = MaterialTheme.typography.labelSmall,
                                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
                                                color = if (isSelected) Color.White else TextPrimary,
                                                fontSize = 11.sp,
                                                maxLines = 1
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }

                    // ==========================================
                    // 3. ACCORDION SECTION 1: Target School & Career Path
                    // ==========================================
                    SettingsAccordionCard(
                        icon = Icons.Default.AccountBalance,
                        iconTint = PrimaryGreen,
                        title = "Target School & Career Path",
                        subtitle = "Select institution & dream course",
                        summaryBadge = "${targetInstitution.substringBefore(" (").take(14)} • ${dreamCourse.take(14)}",
                        isExpanded = isSchoolExpanded,
                        onToggle = { isSchoolExpanded = !isSchoolExpanded },
                        testTag = "accordion_school_career"
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            // Dream Course Selection
                            Text(
                                text = "Dream Course / Major",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Spacer(modifier = Modifier.height(6.dp))

                            ExposedDropdownMenuBox(
                                expanded = courseDropdownExpanded,
                                onExpandedChange = { courseDropdownExpanded = !courseDropdownExpanded }
                            ) {
                                OutlinedTextField(
                                    value = dreamCourse,
                                    onValueChange = {},
                                    readOnly = true,
                                    leadingIcon = {
                                        Icon(Icons.Default.School, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(20.dp))
                                    },
                                    trailingIcon = {
                                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = courseDropdownExpanded)
                                    },
                                    modifier = Modifier
                                        .menuAnchor()
                                        .fillMaxWidth()
                                        .testTag("dropdown_dream_course"),
                                    shape = RoundedCornerShape(12.dp),
                                    colors = OutlinedTextFieldDefaults.colors(
                                        focusedContainerColor = InputFieldBg,
                                        unfocusedContainerColor = InputFieldBg,
                                        focusedBorderColor = PrimaryGreen,
                                        unfocusedBorderColor = BorderSubtle,
                                        focusedTextColor = TextPrimary,
                                        unfocusedTextColor = TextPrimary
                                    )
                                )

                                ExposedDropdownMenu(
                                    expanded = courseDropdownExpanded,
                                    onDismissRequest = { courseDropdownExpanded = false },
                                    modifier = Modifier
                                        .background(ElevatedSurface)
                                        .heightIn(max = 280.dp)
                                ) {
                                    OutlinedTextField(
                                        value = courseSearchQuery,
                                        onValueChange = { courseSearchQuery = it },
                                        placeholder = { Text("Search course...", fontSize = 12.sp, color = TextMuted) },
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(horizontal = 8.dp, vertical = 4.dp),
                                        singleLine = true,
                                        textStyle = MaterialTheme.typography.bodySmall.copy(color = TextPrimary),
                                        shape = RoundedCornerShape(8.dp),
                                        colors = OutlinedTextFieldDefaults.colors(
                                            focusedContainerColor = InputFieldBg,
                                            unfocusedContainerColor = InputFieldBg,
                                            focusedBorderColor = PrimaryGreen,
                                            unfocusedBorderColor = BorderSubtle,
                                            focusedTextColor = TextPrimary,
                                            unfocusedTextColor = TextPrimary
                                        )
                                    )
                                    Divider(color = BorderSubtle)

                                    filteredCourses.forEach { courseItem ->
                                        DropdownMenuItem(
                                            text = {
                                                Text(
                                                    text = courseItem,
                                                    style = MaterialTheme.typography.bodyMedium,
                                                    fontWeight = if (courseItem == dreamCourse) FontWeight.Bold else FontWeight.Normal,
                                                    color = if (courseItem == dreamCourse) PrimaryGreen else TextPrimary
                                                )
                                            },
                                            onClick = {
                                                dreamCourse = courseItem
                                                courseDropdownExpanded = false
                                                courseSearchQuery = ""
                                            },
                                            leadingIcon = if (courseItem == dreamCourse) {
                                                { Icon(Icons.Default.Check, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(16.dp)) }
                                            } else null
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(14.dp))

                            // Higher Institution Selection
                            Text(
                                text = "Target Higher Institution",
                                style = MaterialTheme.typography.labelMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Spacer(modifier = Modifier.height(6.dp))

                            // Category filter chips (All, Federal, State, Private)
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                listOf("All", "Federal", "State", "Private").forEach { cat ->
                                    val isCatSelected = institutionCategoryFilter == cat
                                    Surface(
                                        modifier = Modifier
                                            .clip(RoundedCornerShape(8.dp))
                                            .clickable { institutionCategoryFilter = cat },
                                        color = if (isCatSelected) PrimaryGreen else ElevatedSurface,
                                        shape = RoundedCornerShape(8.dp),
                                        border = BorderStroke(1.dp, if (isCatSelected) PrimaryGreen else BorderSubtle)
                                    ) {
                                        Text(
                                            text = cat,
                                            style = MaterialTheme.typography.labelSmall,
                                            fontWeight = if (isCatSelected) FontWeight.Bold else FontWeight.Medium,
                                            color = if (isCatSelected) Color.White else TextSecondary,
                                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                                            fontSize = 10.sp
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            ExposedDropdownMenuBox(
                                expanded = institutionDropdownExpanded,
                                onExpandedChange = { institutionDropdownExpanded = !institutionDropdownExpanded }
                            ) {
                                OutlinedTextField(
                                    value = targetInstitution,
                                    onValueChange = {},
                                    readOnly = true,
                                    leadingIcon = {
                                        Icon(Icons.Default.AccountBalance, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(20.dp))
                                    },
                                    trailingIcon = {
                                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = institutionDropdownExpanded)
                                    },
                                    modifier = Modifier
                                        .menuAnchor()
                                        .fillMaxWidth()
                                        .testTag("dropdown_institution"),
                                    shape = RoundedCornerShape(12.dp),
                                    colors = OutlinedTextFieldDefaults.colors(
                                        focusedContainerColor = InputFieldBg,
                                        unfocusedContainerColor = InputFieldBg,
                                        focusedBorderColor = PrimaryGreen,
                                        unfocusedBorderColor = BorderSubtle,
                                        focusedTextColor = TextPrimary,
                                        unfocusedTextColor = TextPrimary
                                    )
                                )

                                ExposedDropdownMenu(
                                    expanded = institutionDropdownExpanded,
                                    onDismissRequest = { institutionDropdownExpanded = false },
                                    modifier = Modifier
                                        .background(ElevatedSurface)
                                        .heightIn(max = 280.dp)
                                ) {
                                    OutlinedTextField(
                                        value = institutionSearchQuery,
                                        onValueChange = { institutionSearchQuery = it },
                                        placeholder = { Text("Search university / polytechnic...", fontSize = 12.sp, color = TextMuted) },
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(horizontal = 8.dp, vertical = 4.dp),
                                        singleLine = true,
                                        textStyle = MaterialTheme.typography.bodySmall.copy(color = TextPrimary),
                                        shape = RoundedCornerShape(8.dp),
                                        colors = OutlinedTextFieldDefaults.colors(
                                            focusedContainerColor = InputFieldBg,
                                            unfocusedContainerColor = InputFieldBg,
                                            focusedBorderColor = PrimaryGreen,
                                            unfocusedBorderColor = BorderSubtle,
                                            focusedTextColor = TextPrimary,
                                            unfocusedTextColor = TextPrimary
                                        )
                                    )
                                    Divider(color = BorderSubtle)

                                    filteredInstitutions.forEach { instItem ->
                                        DropdownMenuItem(
                                            text = {
                                                Text(
                                                    text = instItem,
                                                    style = MaterialTheme.typography.bodyMedium,
                                                    fontWeight = if (instItem == targetInstitution) FontWeight.Bold else FontWeight.Normal,
                                                    color = if (instItem == targetInstitution) PrimaryGreen else TextPrimary
                                                )
                                            },
                                            onClick = {
                                                targetInstitution = instItem
                                                institutionDropdownExpanded = false
                                                institutionSearchQuery = ""
                                            },
                                            leadingIcon = if (instItem == targetInstitution) {
                                                { Icon(Icons.Default.Check, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(16.dp)) }
                                            } else null
                                        )
                                    }
                                }
                            }
                        }
                    }

                    // ==========================================
                    // 4. ACCORDION SECTION 2: 4-Subject UTME Combination
                    // ==========================================
                    SettingsAccordionCard(
                        icon = Icons.Default.MenuBook,
                        iconTint = InfoBlue,
                        title = "4-Subject UTME Combination",
                        subtitle = "English Language + 3 electives",
                        summaryBadge = "Eng, ${elective1.take(4)}, ${elective2.take(4)}, ${elective3.take(4)}",
                        isExpanded = isSubjectsExpanded,
                        onToggle = { isSubjectsExpanded = !isSubjectsExpanded },
                        testTag = "accordion_subjects"
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            // Quick Combination Presets
                            Text(
                                text = "Quick Faculty Presets:",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = TextSecondary
                            )
                            Spacer(modifier = Modifier.height(6.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                val presets = listOf(
                                    "Medical" to Triple("Biology", "Chemistry", "Physics"),
                                    "Engineering" to Triple("Mathematics", "Physics", "Chemistry"),
                                    "Social Sci" to Triple("Economics", "Government", "Mathematics"),
                                    "Commercial" to Triple("Principles of Accounts", "Commerce", "Economics")
                                )

                                presets.forEach { (label, combo) ->
                                    val isCurrentPreset = elective1 == combo.first && elective2 == combo.second && elective3 == combo.third
                                    Surface(
                                        modifier = Modifier
                                            .weight(1f)
                                            .clip(RoundedCornerShape(8.dp))
                                            .clickable {
                                                elective1 = combo.first
                                                elective2 = combo.second
                                                elective3 = combo.third
                                            },
                                        color = if (isCurrentPreset) InfoBlue else ElevatedSurface,
                                        shape = RoundedCornerShape(8.dp),
                                        border = BorderStroke(1.dp, if (isCurrentPreset) InfoBlue else BorderSubtle)
                                    ) {
                                        Text(
                                            text = label,
                                            style = MaterialTheme.typography.labelSmall,
                                            fontWeight = if (isCurrentPreset) FontWeight.Bold else FontWeight.Medium,
                                            color = if (isCurrentPreset) Color.White else TextPrimary,
                                            modifier = Modifier.padding(horizontal = 4.dp, vertical = 6.dp),
                                            fontSize = 9.sp,
                                            maxLines = 1
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            // Compulsory English Header
                            Surface(
                                color = PaleGreenBg,
                                shape = RoundedCornerShape(10.dp),
                                border = BorderStroke(1.dp, PrimaryGreen.copy(alpha = 0.4f)),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 10.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(Icons.Default.Lock, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(16.dp))
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = "1. English Language",
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = FontWeight.Bold,
                                            color = PrimaryGreenDark
                                        )
                                    }
                                    Surface(
                                        color = PrimaryGreen,
                                        shape = RoundedCornerShape(6.dp)
                                    ) {
                                        Text(
                                            text = "COMPULSORY",
                                            style = MaterialTheme.typography.labelSmall,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White,
                                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                            fontSize = 8.sp
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            // Elective 1 Dropdown
                            Text("2. First Elective", style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.SemiBold, color = TextSecondary)
                            Spacer(modifier = Modifier.height(4.dp))
                            ExposedDropdownMenuBox(
                                expanded = elective1Expanded,
                                onExpandedChange = { elective1Expanded = !elective1Expanded }
                            ) {
                                OutlinedTextField(
                                    value = elective1,
                                    onValueChange = {},
                                    readOnly = true,
                                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = elective1Expanded) },
                                    modifier = Modifier.menuAnchor().fillMaxWidth(),
                                    shape = RoundedCornerShape(10.dp),
                                    colors = OutlinedTextFieldDefaults.colors(
                                        focusedContainerColor = InputFieldBg,
                                        unfocusedContainerColor = InputFieldBg,
                                        focusedBorderColor = PrimaryGreen,
                                        unfocusedBorderColor = BorderSubtle,
                                        focusedTextColor = TextPrimary,
                                        unfocusedTextColor = TextPrimary
                                    )
                                )
                                ExposedDropdownMenu(
                                    expanded = elective1Expanded,
                                    onDismissRequest = { elective1Expanded = false },
                                    modifier = Modifier.background(ElevatedSurface)
                                ) {
                                    allAvailableElectives.filter { it != elective2 && it != elective3 }.forEach { opt ->
                                        DropdownMenuItem(
                                            text = { Text(opt, fontWeight = if (opt == elective1) FontWeight.Bold else FontWeight.Normal, color = TextPrimary) },
                                            onClick = {
                                                elective1 = opt
                                                elective1Expanded = false
                                            }
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            // Elective 2 Dropdown
                            Text("3. Second Elective", style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.SemiBold, color = TextSecondary)
                            Spacer(modifier = Modifier.height(4.dp))
                            ExposedDropdownMenuBox(
                                expanded = elective2Expanded,
                                onExpandedChange = { elective2Expanded = !elective2Expanded }
                            ) {
                                OutlinedTextField(
                                    value = elective2,
                                    onValueChange = {},
                                    readOnly = true,
                                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = elective2Expanded) },
                                    modifier = Modifier.menuAnchor().fillMaxWidth(),
                                    shape = RoundedCornerShape(10.dp),
                                    colors = OutlinedTextFieldDefaults.colors(
                                        focusedContainerColor = InputFieldBg,
                                        unfocusedContainerColor = InputFieldBg,
                                        focusedBorderColor = PrimaryGreen,
                                        unfocusedBorderColor = BorderSubtle,
                                        focusedTextColor = TextPrimary,
                                        unfocusedTextColor = TextPrimary
                                    )
                                )
                                ExposedDropdownMenu(
                                    expanded = elective2Expanded,
                                    onDismissRequest = { elective2Expanded = false },
                                    modifier = Modifier.background(ElevatedSurface)
                                ) {
                                    allAvailableElectives.filter { it != elective1 && it != elective3 }.forEach { opt ->
                                        DropdownMenuItem(
                                            text = { Text(opt, fontWeight = if (opt == elective2) FontWeight.Bold else FontWeight.Normal, color = TextPrimary) },
                                            onClick = {
                                                elective2 = opt
                                                elective2Expanded = false
                                            }
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(8.dp))

                            // Elective 3 Dropdown
                            Text("4. Third Elective", style = MaterialTheme.typography.labelSmall, fontWeight = FontWeight.SemiBold, color = TextSecondary)
                            Spacer(modifier = Modifier.height(4.dp))
                            ExposedDropdownMenuBox(
                                expanded = elective3Expanded,
                                onExpandedChange = { elective3Expanded = !elective3Expanded }
                            ) {
                                OutlinedTextField(
                                    value = elective3,
                                    onValueChange = {},
                                    readOnly = true,
                                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = elective3Expanded) },
                                    modifier = Modifier.menuAnchor().fillMaxWidth(),
                                    shape = RoundedCornerShape(10.dp),
                                    colors = OutlinedTextFieldDefaults.colors(
                                        focusedContainerColor = InputFieldBg,
                                        unfocusedContainerColor = InputFieldBg,
                                        focusedBorderColor = PrimaryGreen,
                                        unfocusedBorderColor = BorderSubtle,
                                        focusedTextColor = TextPrimary,
                                        unfocusedTextColor = TextPrimary
                                    )
                                )
                                ExposedDropdownMenu(
                                    expanded = elective3Expanded,
                                    onDismissRequest = { elective3Expanded = false },
                                    modifier = Modifier.background(ElevatedSurface)
                                ) {
                                    allAvailableElectives.filter { it != elective1 && it != elective2 }.forEach { opt ->
                                        DropdownMenuItem(
                                            text = { Text(opt, fontWeight = if (opt == elective3) FontWeight.Bold else FontWeight.Normal, color = TextPrimary) },
                                            onClick = {
                                                elective3 = opt
                                                elective3Expanded = false
                                            }
                                        )
                                    }
                                }
                            }
                        }
                    }

                    // ==========================================
                    // 5. ACCORDION SECTION 3: UTME Score & Study Goal Management
                    // ==========================================
                    val targetScoreInt = targetScore.toIntOrNull() ?: 320
                    val scoreTierLabel = when {
                        targetScoreInt >= 350 -> "Top 0.5% Elite Merit"
                        targetScoreInt >= 320 -> "Top 2% High Competitive"
                        targetScoreInt >= 300 -> "Top 5% University Cut-Off"
                        else -> "Standard UTME Merit"
                    }

                    SettingsAccordionCard(
                        icon = Icons.Default.TrackChanges,
                        iconTint = AmberAccent,
                        title = "Target Score & Study Goal",
                        subtitle = "Score target, daily time & exam batch",
                        summaryBadge = "$targetScore/400 • ${studyGoalMinutes}m/d",
                        isExpanded = isGoalsExpanded,
                        onToggle = { isGoalsExpanded = !isGoalsExpanded },
                        testTag = "accordion_goals"
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            // Target Score Dropdown with dynamic Merit Tier indicator
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text("Target UTME Score", style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold, color = TextPrimary)
                                Surface(
                                    color = SoftAmberBg,
                                    shape = RoundedCornerShape(6.dp)
                                ) {
                                    Text(
                                        text = scoreTierLabel,
                                        style = MaterialTheme.typography.labelSmall,
                                        color = AmberAccent,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                        fontSize = 9.sp
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(6.dp))

                            ExposedDropdownMenuBox(
                                expanded = scoreDropdownExpanded,
                                onExpandedChange = { scoreDropdownExpanded = !scoreDropdownExpanded }
                            ) {
                                OutlinedTextField(
                                    value = "$targetScore / 400 Marks",
                                    onValueChange = {},
                                    readOnly = true,
                                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = scoreDropdownExpanded) },
                                    modifier = Modifier.menuAnchor().fillMaxWidth(),
                                    shape = RoundedCornerShape(12.dp),
                                    colors = OutlinedTextFieldDefaults.colors(
                                        focusedContainerColor = InputFieldBg,
                                        unfocusedContainerColor = InputFieldBg,
                                        focusedBorderColor = PrimaryGreen,
                                        unfocusedBorderColor = BorderSubtle,
                                        focusedTextColor = TextPrimary,
                                        unfocusedTextColor = TextPrimary
                                    )
                                )

                                ExposedDropdownMenu(
                                    expanded = scoreDropdownExpanded,
                                    onDismissRequest = { scoreDropdownExpanded = false },
                                    modifier = Modifier.background(ElevatedSurface)
                                ) {
                                    listOf("280", "300", "320", "340", "350", "360", "380").forEach { scoreOpt ->
                                        DropdownMenuItem(
                                            text = {
                                                Text(
                                                    text = "$scoreOpt / 400",
                                                    fontWeight = if (targetScore == scoreOpt) FontWeight.Bold else FontWeight.Normal,
                                                    color = if (targetScore == scoreOpt) PrimaryGreen else TextPrimary
                                                )
                                            },
                                            onClick = {
                                                targetScore = scoreOpt
                                                scoreDropdownExpanded = false
                                            }
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(14.dp))

                            // Daily Study Goal Dropdown
                            Text("Daily Study Time Commitment", style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold, color = TextPrimary)
                            Spacer(modifier = Modifier.height(6.dp))

                            ExposedDropdownMenuBox(
                                expanded = goalDropdownExpanded,
                                onExpandedChange = { goalDropdownExpanded = !goalDropdownExpanded }
                            ) {
                                OutlinedTextField(
                                    value = "$studyGoalMinutes minutes / day",
                                    onValueChange = {},
                                    readOnly = true,
                                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = goalDropdownExpanded) },
                                    modifier = Modifier.menuAnchor().fillMaxWidth(),
                                    shape = RoundedCornerShape(12.dp),
                                    colors = OutlinedTextFieldDefaults.colors(
                                        focusedContainerColor = InputFieldBg,
                                        unfocusedContainerColor = InputFieldBg,
                                        focusedBorderColor = PrimaryGreen,
                                        unfocusedBorderColor = BorderSubtle,
                                        focusedTextColor = TextPrimary,
                                        unfocusedTextColor = TextPrimary
                                    )
                                )

                                ExposedDropdownMenu(
                                    expanded = goalDropdownExpanded,
                                    onDismissRequest = { goalDropdownExpanded = false },
                                    modifier = Modifier.background(ElevatedSurface)
                                ) {
                                    listOf(
                                        15 to "15 mins (Quick Drill)",
                                        30 to "30 mins (Standard Practice)",
                                        45 to "45 mins (Recommended)",
                                        60 to "60 mins (Intensive Study)",
                                        90 to "90 mins (Champion Track)",
                                        120 to "120 mins (Mastery Track)"
                                    ).forEach { (mins, label) ->
                                        DropdownMenuItem(
                                            text = {
                                                Text(
                                                    text = label,
                                                    fontWeight = if (studyGoalMinutes == mins) FontWeight.Bold else FontWeight.Normal,
                                                    color = if (studyGoalMinutes == mins) PrimaryGreen else TextPrimary
                                                )
                                            },
                                            onClick = {
                                                studyGoalMinutes = mins
                                                goalDropdownExpanded = false
                                            }
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(14.dp))

                            // JAMB Exam Batch Date
                            Text("Target JAMB Exam Batch", style = MaterialTheme.typography.labelMedium, fontWeight = FontWeight.Bold, color = TextPrimary)
                            Spacer(modifier = Modifier.height(6.dp))

                            val sdfFull = remember { SimpleDateFormat("EEEE, MMMM d, yyyy", Locale.getDefault()) }
                            ExposedDropdownMenuBox(
                                expanded = dateDropdownExpanded,
                                onExpandedChange = { dateDropdownExpanded = !dateDropdownExpanded }
                            ) {
                                OutlinedTextField(
                                    value = sdfFull.format(Date(jambExamDateTimestamp)),
                                    onValueChange = {},
                                    readOnly = true,
                                    leadingIcon = {
                                        Icon(Icons.Outlined.Event, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(20.dp))
                                    },
                                    trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = dateDropdownExpanded) },
                                    modifier = Modifier.menuAnchor().fillMaxWidth(),
                                    shape = RoundedCornerShape(12.dp),
                                    colors = OutlinedTextFieldDefaults.colors(
                                        focusedContainerColor = InputFieldBg,
                                        unfocusedContainerColor = InputFieldBg,
                                        focusedBorderColor = PrimaryGreen,
                                        unfocusedBorderColor = BorderSubtle,
                                        focusedTextColor = TextPrimary,
                                        unfocusedTextColor = TextPrimary
                                    )
                                )

                                val now = System.currentTimeMillis()
                                val jambScheduleOptions = remember {
                                    listOf(
                                        "Official Day 1 Batch" to (now + (60L * 24 * 3600 * 1000L)),
                                        "Batch B (+5 Days)" to (now + (65L * 24 * 3600 * 1000L)),
                                        "Batch C (+10 Days)" to (now + (70L * 24 * 3600 * 1000L)),
                                        "Mop-Up / Late Batch (+25 Days)" to (now + (85L * 24 * 3600 * 1000L))
                                    )
                                }

                                ExposedDropdownMenu(
                                    expanded = dateDropdownExpanded,
                                    onDismissRequest = { dateDropdownExpanded = false },
                                    modifier = Modifier.background(ElevatedSurface)
                                ) {
                                    jambScheduleOptions.forEach { (label, timestamp) ->
                                        DropdownMenuItem(
                                            text = {
                                                Column {
                                                    Text(label, fontWeight = FontWeight.Bold, color = TextPrimary)
                                                    Text(sdfFull.format(Date(timestamp)), style = MaterialTheme.typography.bodySmall, color = TextSecondary, fontSize = 11.sp)
                                                }
                                            },
                                            onClick = {
                                                jambExamDateTimestamp = timestamp
                                                dateDropdownExpanded = false
                                            }
                                        )
                                    }
                                }
                            }
                        }
                    }

                    // ==========================================
                    // 6. ACCORDION SECTION 4: Study Reminders & Notifications
                    // ==========================================
                    val activeNotifsCount = listOf(dailyPracticeReminderEnabled, streakReminderEnabled, cbtMockReminderEnabled).count { it }

                    SettingsAccordionCard(
                        icon = Icons.Default.NotificationsActive,
                        iconTint = PrimaryGreen,
                        title = "Study Reminders & Streaks",
                        subtitle = "Background drills & streak protection",
                        summaryBadge = "$activeNotifsCount Active",
                        isExpanded = isNotificationsExpanded,
                        onToggle = { isNotificationsExpanded = !isNotificationsExpanded },
                        testTag = "accordion_notifications"
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {
                            // Toggle 1: 12:00 PM Practice
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    modifier = Modifier.weight(1f),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.NotificationsActive, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(20.dp))
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text("12:00 PM Practice Drill Alert", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.SemiBold, color = TextPrimary)
                                        Text("Daily 15-minute quick UTME speed drill", style = MaterialTheme.typography.bodySmall, color = TextSecondary, fontSize = 11.sp)
                                    }
                                }
                                Switch(
                                    checked = dailyPracticeReminderEnabled,
                                    onCheckedChange = { isChecked ->
                                        dailyPracticeReminderEnabled = isChecked
                                        NotificationScheduler.updateNotificationPreferences(
                                            context = context,
                                            dailyPracticeEnabled = isChecked,
                                            dailyStreakEnabled = streakReminderEnabled,
                                            cbtMockEnabled = cbtMockReminderEnabled
                                        )
                                    },
                                    colors = SwitchDefaults.colors(checkedThumbColor = Color.White, checkedTrackColor = PrimaryGreen)
                                )
                            }

                            Divider(color = BorderSubtle, modifier = Modifier.padding(vertical = 10.dp))

                            // Toggle 2: 6:00 PM Streak Alert
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    modifier = Modifier.weight(1f),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.LocalFireDepartment, contentDescription = null, tint = AmberAccent, modifier = Modifier.size(20.dp))
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text("6:00 PM Streak Protection Alert", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.SemiBold, color = TextPrimary)
                                        Text("Protects your daily learning streak momentum", style = MaterialTheme.typography.bodySmall, color = TextSecondary, fontSize = 11.sp)
                                    }
                                }
                                Switch(
                                    checked = streakReminderEnabled,
                                    onCheckedChange = { isChecked ->
                                        streakReminderEnabled = isChecked
                                        NotificationScheduler.updateNotificationPreferences(
                                            context = context,
                                            dailyPracticeEnabled = dailyPracticeReminderEnabled,
                                            dailyStreakEnabled = isChecked,
                                            cbtMockEnabled = cbtMockReminderEnabled
                                        )
                                    },
                                    colors = SwitchDefaults.colors(checkedThumbColor = Color.White, checkedTrackColor = AmberAccent)
                                )
                            }

                            Divider(color = BorderSubtle, modifier = Modifier.padding(vertical = 10.dp))

                            // Toggle 3: CBT Mock Announcements
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    modifier = Modifier.weight(1f),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.Campaign, contentDescription = null, tint = InfoBlue, modifier = Modifier.size(20.dp))
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text("JAMB & CBT Mock Announcements", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.SemiBold, color = TextPrimary)
                                        Text("Syllabus updates, novel reviews & tests", style = MaterialTheme.typography.bodySmall, color = TextSecondary, fontSize = 11.sp)
                                    }
                                }
                                Switch(
                                    checked = cbtMockReminderEnabled,
                                    onCheckedChange = { isChecked ->
                                        cbtMockReminderEnabled = isChecked
                                        NotificationScheduler.updateNotificationPreferences(
                                            context = context,
                                            dailyPracticeEnabled = dailyPracticeReminderEnabled,
                                            dailyStreakEnabled = streakReminderEnabled,
                                            cbtMockEnabled = isChecked
                                        )
                                    },
                                    colors = SwitchDefaults.colors(checkedThumbColor = Color.White, checkedTrackColor = InfoBlue)
                                )
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            // Send Test Notification Button
                            OutlinedButton(
                                onClick = {
                                    val scheduler = NotificationScheduler(context)
                                    NotificationScheduler.initChannels(context)
                                    scheduler.postNotification(
                                        id = 99901,
                                        channelId = NotificationScheduler.CHANNEL_PRACTICE,
                                        title = "PREPZA • Notification Test 🎯",
                                        body = "Awesome! Your notifications are live. Target $targetScore+ in JAMB UTME with daily speed drills!",
                                        destination = "home"
                                    )
                                    Toast.makeText(context, "Test notification dispatched to status bar!", Toast.LENGTH_SHORT).show()
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("send_test_notification_btn"),
                                shape = RoundedCornerShape(10.dp),
                                border = BorderStroke(1.dp, PrimaryGreen)
                            ) {
                                Icon(Icons.Default.Send, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Send Test Notification to Device", color = PrimaryGreen, fontWeight = FontWeight.SemiBold, fontSize = 12.sp)
                            }
                        }
                    }

                    // ==========================================
                    // 7. ACCORDION SECTION 5: Utilities & Account Actions
                    // ==========================================
                    SettingsAccordionCard(
                        icon = Icons.Default.SettingsSuggest,
                        iconTint = PurpleAccent,
                        title = "Utilities & Account Actions",
                        subtitle = "Offline banks, mistake review & sync",
                        summaryBadge = "Tools",
                        isExpanded = isUtilitiesExpanded,
                        onToggle = { isUtilitiesExpanded = !isUtilitiesExpanded },
                        testTag = "accordion_utilities"
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            // Offline Packs
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = ElevatedSurface,
                                border = BorderStroke(1.dp, BorderSubtle),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                                    .clickable { onOpenOfflinePacks() }
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(Icons.Default.CloudDownload, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(20.dp))
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text("Offline Subject Question Packs", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.SemiBold, color = TextPrimary)
                                    }
                                    Icon(Icons.Default.ChevronRight, contentDescription = null, tint = TextMuted, modifier = Modifier.size(18.dp))
                                }
                            }

                            // Mistake Bank
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = ElevatedSurface,
                                border = BorderStroke(1.dp, BorderSubtle),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(12.dp))
                                    .clickable { onOpenMistakeBank() }
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 12.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(Icons.Default.ErrorOutline, contentDescription = null, tint = IncorrectRed, modifier = Modifier.size(20.dp))
                                        Spacer(modifier = Modifier.width(10.dp))
                                        Text("Mistake Bank Revision", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.SemiBold, color = TextPrimary)
                                    }
                                    Icon(Icons.Default.ChevronRight, contentDescription = null, tint = TextMuted, modifier = Modifier.size(18.dp))
                                }
                            }

                            // Sync & App Update Actions
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                OutlinedButton(
                                    onClick = onSyncContent,
                                    modifier = Modifier.weight(1f),
                                    shape = RoundedCornerShape(10.dp),
                                    border = BorderStroke(1.dp, BorderSubtle),
                                    enabled = !isSyncingContent
                                ) {
                                    if (isSyncingContent) {
                                        CircularProgressIndicator(modifier = Modifier.size(14.dp), strokeWidth = 2.dp)
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Text("Syncing...", fontSize = 11.sp, color = TextPrimary)
                                    } else {
                                        Icon(Icons.Default.Sync, contentDescription = null, modifier = Modifier.size(16.dp), tint = TextPrimary)
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Text("Sync Bank", fontSize = 11.sp, color = TextPrimary)
                                    }
                                }

                                OutlinedButton(
                                    onClick = onCheckAppUpdate,
                                    modifier = Modifier.weight(1f),
                                    shape = RoundedCornerShape(10.dp),
                                    border = BorderStroke(1.dp, BorderSubtle)
                                ) {
                                    Icon(Icons.Default.SystemUpdate, contentDescription = null, modifier = Modifier.size(16.dp), tint = TextPrimary)
                                    Spacer(modifier = Modifier.width(6.dp))
                                    Text("Check Update", fontSize = 11.sp, color = TextPrimary)
                                }
                            }

                            // Log Out Button
                            OutlinedButton(
                                onClick = onLogOut,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("settings_logout_button"),
                                shape = RoundedCornerShape(10.dp),
                                border = BorderStroke(1.dp, IncorrectRed.copy(alpha = 0.5f))
                            ) {
                                Icon(Icons.Default.Logout, contentDescription = null, tint = IncorrectRed, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Log Out / Switch Account", color = IncorrectRed, fontWeight = FontWeight.SemiBold, fontSize = 12.sp)
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                }

                // Sticky Bottom Save & Apply Button
                Surface(
                    color = SurfaceWhite,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    val finalSubjectsCsv = "$compulsorySubject,$elective1,$elective2,$elective3"
                    val parsedScore = targetScore.toIntOrNull() ?: 320

                    Button(
                        onClick = {
                            onSaveProfile(
                                parsedScore,
                                finalSubjectsCsv,
                                studyGoalMinutes,
                                targetInstitution,
                                dreamCourse,
                                jambExamDateTimestamp
                            )
                            Toast.makeText(context, "Academic settings updated successfully!", Toast.LENGTH_SHORT).show()
                            safeDismiss()
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .testTag("save_academic_settings_button"),
                        shape = RoundedCornerShape(14.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen)
                    ) {
                        Icon(Icons.Default.Check, contentDescription = null, tint = Color.White, modifier = Modifier.size(18.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Save & Apply Changes",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

/**
 * High-fidelity Expandable/Collapsible Accordion Card for grouped preferences.
 */
@Composable
fun SettingsAccordionCard(
    icon: ImageVector,
    iconTint: Color,
    title: String,
    subtitle: String,
    summaryBadge: String,
    isExpanded: Boolean,
    onToggle: () -> Unit,
    testTag: String,
    content: @Composable () -> Unit
) {
    val rotationAngle by animateFloatAsState(targetValue = if (isExpanded) 180f else 0f, label = "chevronRotation")

    Surface(
        shape = RoundedCornerShape(16.dp),
        color = AppBackground,
        border = BorderStroke(1.dp, if (isExpanded) iconTint.copy(alpha = 0.5f) else BorderSubtle),
        modifier = Modifier
            .fillMaxWidth()
            .testTag(testTag)
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            // Header Row (Clickable)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp))
                    .clickable { onToggle() },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.weight(1f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Surface(
                        color = iconTint.copy(alpha = 0.12f),
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier.size(34.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = icon,
                                contentDescription = null,
                                tint = iconTint,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(10.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = title,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        Text(
                            text = subtitle,
                            style = MaterialTheme.typography.bodySmall,
                            color = TextSecondary,
                            fontSize = 11.sp
                        )
                    }
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    if (!isExpanded && summaryBadge.isNotBlank()) {
                        Surface(
                            color = iconTint.copy(alpha = 0.12f),
                            shape = RoundedCornerShape(6.dp)
                        ) {
                            Text(
                                text = summaryBadge,
                                style = MaterialTheme.typography.labelSmall,
                                color = iconTint,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                fontSize = 9.sp,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }

                    IconButton(
                        onClick = onToggle,
                        modifier = Modifier.size(28.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ExpandMore,
                            contentDescription = if (isExpanded) "Collapse" else "Expand",
                            tint = TextSecondary,
                            modifier = Modifier
                                .size(20.dp)
                                .rotate(rotationAngle)
                        )
                    }
                }
            }

            // Animated Expandable Content Body
            AnimatedVisibility(
                visible = isExpanded,
                enter = expandVertically() + fadeIn(),
                exit = shrinkVertically() + fadeOut()
            ) {
                Column {
                    Divider(
                        color = BorderSubtle,
                        modifier = Modifier.padding(vertical = 12.dp)
                    )
                    content()
                }
            }
        }
    }
}
