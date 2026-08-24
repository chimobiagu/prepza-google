package com.example.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.School
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.data.db.UserAccountEntity
import com.example.data.db.UserProfileEntity
import com.example.ui.theme.*

import androidx.compose.material.icons.outlined.Event
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AcademicSettingsDialog(
    profile: UserProfileEntity?,
    activeAccount: UserAccountEntity?,
    onSaveProfile: (targetScore: Int, subjectsCsv: String, studyGoalMinutes: Int, targetInstitution: String, dreamCourse: String, jambExamDateTimestamp: Long) -> Unit,
    onLogOut: () -> Unit,
    onUpgradeClick: () -> Unit = {},
    onOpenMistakeBank: () -> Unit = {},
    onOpenOfflinePacks: () -> Unit = {},
    onDismiss: () -> Unit
) {
    var targetScore by remember { mutableStateOf(profile?.targetScore?.toString() ?: "340") }
    var studyGoalMinutes by remember { mutableStateOf(profile?.studyGoalMinutesPerDay ?: 45) }
    var targetInstitution by remember { mutableStateOf(profile?.targetInstitution ?: "University of Lagos (UNILAG)") }
    var dreamCourse by remember { mutableStateOf(profile?.dreamCourse ?: "Medicine & Surgery") }
    var jambExamDateTimestamp by remember { mutableStateOf(profile?.jambExamDateTimestamp ?: (System.currentTimeMillis() + (64L * 24 * 3600 * 1000L))) }

    val compulsorySubject = "English Language"
    val electiveSubjects = remember {
        listOf(
            "Mathematics",
            "Physics",
            "Chemistry",
            "Biology",
            "Commerce",
            "CRS",
            "Literature in English",
            "Government",
            "Economics",
            "Principles of Accounts"
        )
    }

    val popularInstitutions = remember {
        listOf(
            "University of Lagos (UNILAG)",
            "University of Ibadan (UI)",
            "Obafemi Awolowo University (OAU)",
            "Ahmadu Bello University (ABU)",
            "University of Nigeria Nsukka (UNN)",
            "University of Benin (UNIBEN)",
            "Federal University of Tech Akure (FUTA)",
            "Covenant University",
            "Lagos State University (LASU)"
        )
    }

    val popularCourses = remember {
        listOf(
            "Medicine & Surgery",
            "Computer Science",
            "Law",
            "Pharmacy",
            "Mechanical Engineering",
            "Nursing Science",
            "Accounting",
            "Economics",
            "Software Engineering"
        )
    }

    val initialElectives = remember(profile?.jambSubjectsCsv) {
        val list = profile?.jambSubjectsCsv?.split(",")?.map { it.trim() } ?: listOf("Mathematics", "Physics", "Chemistry")
        list.filter { it != compulsorySubject }.toSet()
    }

    var selectedElectives by remember { mutableStateOf(initialElectives) }
    val totalCount = 1 + selectedElectives.size
    val isValid = totalCount == 4

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth(0.94f)
                .fillMaxHeight(0.92f)
                .clip(RoundedCornerShape(24.dp)),
            color = SurfaceWhite
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                // Header
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Settings",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )

                    IconButton(onClick = onDismiss) {
                        Icon(Icons.Default.Close, contentDescription = "Close", tint = TextPrimary)
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState())
                ) {
                    // Account info badge
                    Surface(
                        color = AppBackground,
                        shape = RoundedCornerShape(16.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.padding(14.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                color = PrimaryGreen,
                                shape = CircleShape,
                                modifier = Modifier.size(44.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Text(
                                        text = (profile?.name?.take(1) ?: "C").uppercase(),
                                        style = MaterialTheme.typography.titleMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.width(12.dp))

                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = profile?.name ?: "Chinedu Okafor",
                                    style = MaterialTheme.typography.titleSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = TextPrimary
                                )
                                Text(
                                    text = profile?.email ?: activeAccount?.phoneNumber ?: "Google Student Account",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = TextSecondary
                                )
                            }

                            Surface(
                                color = PaleGreenBg,
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Text(
                                    text = (profile?.authProvider ?: "Google").uppercase(),
                                    style = MaterialTheme.typography.labelSmall,
                                    color = PrimaryGreen,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    // Prepza Plus / Subscription Status Section in Settings
                    val isPlus = profile?.isPlusSubscriber == true
                    val daysRemaining = profile?.daysRemainingInTrial ?: 30
                    val isExpired = profile?.isTrialExpired == true

                    Surface(
                        shape = RoundedCornerShape(16.dp),
                        color = if (isPlus) PaleGreenBg.copy(alpha = 0.6f) else if (isExpired) IncorrectRedBg.copy(alpha = 0.6f) else AppBackground,
                        border = androidx.compose.foundation.BorderStroke(
                            1.dp,
                            if (isPlus) PrimaryGreen else if (isExpired) IncorrectRed else BorderSubtle
                        ),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(14.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Surface(
                                        shape = RoundedCornerShape(8.dp),
                                        color = if (isPlus) PrimaryGreen else if (isExpired) IncorrectRed else TextPrimary,
                                        modifier = Modifier.size(32.dp)
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Icon(
                                                imageVector = if (isPlus) Icons.Default.Star else Icons.Default.Bolt,
                                                contentDescription = null,
                                                tint = Color.White,
                                                modifier = Modifier.size(18.dp)
                                            )
                                        }
                                    }
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = if (isPlus) "Prepza Plus (Lifetime)" else "Prepza Plus (30-Day Trial)",
                                            style = MaterialTheme.typography.titleSmall,
                                            fontWeight = FontWeight.Bold,
                                            color = TextPrimary
                                        )
                                        Text(
                                            text = when {
                                                isPlus -> "Full Access • All Past Questions & Mocks"
                                                isExpired -> "30-Day Free Trial Expired"
                                                else -> "$daysRemaining days remaining in 30-day trial"
                                            },
                                            style = MaterialTheme.typography.bodySmall,
                                            color = if (isExpired) IncorrectRed else TextSecondary,
                                            fontWeight = if (isExpired) FontWeight.Bold else FontWeight.Normal
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            if (isPlus) {
                                Text(
                                    text = "• 180-Question CBT Exam Simulators Unlocked\n• 20+ Years Verified JAMB Past Questions\n• 24/7 Prepza AI Tutor Access",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = PrimaryGreenDark,
                                    lineHeight = 18.sp
                                )
                            } else {
                                Text(
                                    text = "30 days of full access from account creation. Upgrade to lifetime pass for only ₦500 to keep full access to 180-question simulators & AI tutor.",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = TextSecondary,
                                    lineHeight = 18.sp
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Button(
                                    onClick = {
                                        onUpgradeClick()
                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = TextPrimary),
                                    shape = RoundedCornerShape(10.dp),
                                    modifier = Modifier.fillMaxWidth().testTag("settings_upgrade_plus_btn")
                                ) {
                                    Text(
                                        text = if (isExpired) "Upgrade to Prepza Plus (₦500)" else "Upgrade to Plus Now (₦500)",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 13.sp
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    // Dream Course Section
                    Text(
                        text = "Dream Course / Major:",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        popularCourses.forEach { course ->
                            val isSelected = dreamCourse == course
                            FilterChip(
                                selected = isSelected,
                                onClick = { dreamCourse = course },
                                label = { Text(course, fontSize = 12.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = PrimaryGreen,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Target University Section
                    Text(
                        text = "Target Higher Institution:",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        popularInstitutions.forEach { inst ->
                            val isSelected = targetInstitution == inst
                            FilterChip(
                                selected = isSelected,
                                onClick = { targetInstitution = inst },
                                label = { Text(inst.substringBefore(" ("), fontSize = 12.sp) },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = TextPrimary,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    // Official JAMB Date Section
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Official JAMB UTME Date:",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        val daysRemaining = ((jambExamDateTimestamp - System.currentTimeMillis()) / (1000L * 3600 * 24)).toInt().coerceAtLeast(0)
                        Surface(
                            color = PaleGreenBg,
                            shape = RoundedCornerShape(8.dp),
                            border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreen.copy(alpha = 0.5f))
                        ) {
                            Text(
                                text = "$daysRemaining days remaining",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryGreenDark,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(6.dp))

                    val jambDateOptions = remember {
                        val now = System.currentTimeMillis()
                        listOf(
                            "Day 1 Official" to (now + (60L * 24 * 3600 * 1000L)),
                            "Batch B (+5d)" to (now + (65L * 24 * 3600 * 1000L)),
                            "Batch C (+10d)" to (now + (70L * 24 * 3600 * 1000L)),
                            "Late Batch" to (now + (85L * 24 * 3600 * 1000L))
                        )
                    }

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        jambDateOptions.forEach { (label, timestamp) ->
                            val isChosen = Math.abs(jambExamDateTimestamp - timestamp) < (24 * 3600 * 1000L)
                            Surface(
                                modifier = Modifier
                                    .weight(1f)
                                    .clip(RoundedCornerShape(10.dp))
                                    .clickable { jambExamDateTimestamp = timestamp },
                                color = if (isChosen) SoftEmeraldBg else AppBackground,
                                shape = RoundedCornerShape(10.dp),
                                border = androidx.compose.foundation.BorderStroke(1.dp, if (isChosen) PrimaryGreen else BorderSubtle)
                            ) {
                                Column(
                                    modifier = Modifier.padding(vertical = 6.dp, horizontal = 4.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(
                                        text = label,
                                        style = MaterialTheme.typography.labelSmall,
                                        fontWeight = if (isChosen) FontWeight.Bold else FontWeight.Medium,
                                        color = if (isChosen) PrimaryGreenDark else TextPrimary,
                                        fontSize = 10.sp,
                                        maxLines = 1
                                    )
                                    val sdf = SimpleDateFormat("MMM d", Locale.getDefault())
                                    Text(
                                        text = sdf.format(Date(timestamp)),
                                        style = MaterialTheme.typography.labelSmall,
                                        color = TextSecondary,
                                        fontSize = 9.sp
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        val sdfFull = SimpleDateFormat("EEEE, MMMM d, yyyy", Locale.getDefault())
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Outlined.Event, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(16.dp))
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = sdfFull.format(Date(jambExamDateTimestamp)),
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.SemiBold,
                                color = TextPrimary
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            OutlinedButton(
                                onClick = {
                                    jambExamDateTimestamp = (jambExamDateTimestamp - (24 * 3600 * 1000L)).coerceAtLeast(System.currentTimeMillis())
                                },
                                contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp),
                                modifier = Modifier.height(28.dp),
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text("-1d", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                            }

                            OutlinedButton(
                                onClick = {
                                    jambExamDateTimestamp += (24 * 3600 * 1000L)
                                },
                                contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp),
                                modifier = Modifier.height(28.dp),
                                shape = RoundedCornerShape(6.dp)
                            ) {
                                Text("+1d", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    // Target Score Section
                    Text(
                        text = "Target JAMB Score (Out of 400):",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listOf("280", "300", "320", "340", "360").forEach { scoreChoice ->
                            val isSelected = targetScore == scoreChoice
                            Surface(
                                modifier = Modifier
                                    .weight(1f)
                                    .clip(RoundedCornerShape(10.dp))
                                    .clickable { targetScore = scoreChoice },
                                color = if (isSelected) TextPrimary else AppBackground,
                                shape = RoundedCornerShape(10.dp),
                                border = androidx.compose.foundation.BorderStroke(
                                    1.dp,
                                    if (isSelected) TextPrimary else BorderSubtle
                                )
                            ) {
                                Box(
                                    modifier = Modifier.padding(vertical = 8.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = scoreChoice,
                                        style = MaterialTheme.typography.labelLarge,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isSelected) Color.White else TextPrimary
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    // Daily Goal Minutes
                    Text(
                        text = "Daily Study Target:",
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listOf(20 to "20m", 30 to "30m", 45 to "45m", 60 to "60m", 90 to "90m").forEach { (mins, label) ->
                            val isSelected = studyGoalMinutes == mins
                            Surface(
                                modifier = Modifier
                                    .weight(1f)
                                    .clip(RoundedCornerShape(10.dp))
                                    .clickable { studyGoalMinutes = mins },
                                color = if (isSelected) PaleGreenBg else AppBackground,
                                shape = RoundedCornerShape(10.dp),
                                border = androidx.compose.foundation.BorderStroke(
                                    1.dp,
                                    if (isSelected) PrimaryGreen else BorderSubtle
                                )
                            ) {
                                Box(
                                    modifier = Modifier.padding(vertical = 8.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = label,
                                        style = MaterialTheme.typography.labelLarge,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isSelected) PrimaryGreen else TextPrimary
                                    )
                                }
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    // 4 JAMB Subjects Editor
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Your 4 JAMB UTME Subjects:",
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )

                        Surface(
                            color = if (isValid) CorrectGreenBg else WarningAmberBg,
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = "$totalCount / 4 Selected",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = if (isValid) CorrectGreen else WarningAmber,
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Compulsory Subject Card
                    Surface(
                        color = PaleGreenBg,
                        shape = RoundedCornerShape(10.dp),
                        border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreen),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(Icons.Default.Check, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(compulsorySubject, style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold, color = PrimaryGreenDark)
                            }
                            Text("60 QUESTIONS (COMPULSORY)", style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp), fontWeight = FontWeight.Bold, color = PrimaryGreen)
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Electives Grid
                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalArrangement = Arrangement.spacedBy(6.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        electiveSubjects.forEach { subj ->
                            val isSelected = selectedElectives.contains(subj)
                            FilterChip(
                                selected = isSelected,
                                onClick = {
                                    val current = selectedElectives.toMutableSet()
                                    if (isSelected) {
                                        current.remove(subj)
                                    } else {
                                        if (current.size < 3) current.add(subj)
                                    }
                                    selectedElectives = current
                                },
                                label = { Text(subj, fontSize = 12.sp) },
                                leadingIcon = if (isSelected) {
                                    { Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(14.dp)) }
                                } else null,
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = TextPrimary,
                                    selectedLabelColor = Color.White
                                )
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Prepza Plus Membership Row
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = if (profile?.isPlusSubscriber == true) PaleGreenBg else AppBackground,
                        border = androidx.compose.foundation.BorderStroke(1.dp, if (profile?.isPlusSubscriber == true) PrimaryGreen.copy(alpha = 0.4f) else BorderSubtle),
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(12.dp))
                            .clickable { onUpgradeClick() }
                    ) {
                        Row(
                            modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Surface(
                                    shape = CircleShape,
                                    color = if (profile?.isPlusSubscriber == true) PrimaryGreen else PrimaryGreenLight.copy(alpha = 0.2f),
                                    modifier = Modifier.size(26.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            imageVector = Icons.Default.Bolt,
                                            contentDescription = null,
                                            tint = if (profile?.isPlusSubscriber == true) Color.White else PrimaryGreenDark,
                                            modifier = Modifier.size(15.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Column {
                                    Text(
                                        text = if (profile?.isPlusSubscriber == true) "Prepza Plus Member" else "Prepza Plus (₦500 Lifetime)",
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = TextPrimary
                                    )
                                    Text(
                                        text = if (profile?.isPlusSubscriber == true) "Lifetime access active" else "Unlimited CBT mocks & past questions",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = TextSecondary
                                    )
                                }
                            }
                            Icon(
                                imageVector = Icons.Default.ChevronRight,
                                contentDescription = null,
                                tint = TextMuted,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    // Offline & Learning Utilities
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        OutlinedButton(
                            onClick = onOpenMistakeBank,
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Icon(Icons.Default.Psychology, contentDescription = null, modifier = Modifier.size(16.dp), tint = SoftRed)
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("Mistake Bank", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                        }

                        OutlinedButton(
                            onClick = onOpenOfflinePacks,
                            modifier = Modifier.weight(1f),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Icon(Icons.Default.WifiOff, contentDescription = null, modifier = Modifier.size(16.dp), tint = PrimaryGreen)
                            Spacer(modifier = Modifier.width(6.dp))
                            Text("Offline Packs", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Log Out Action
                    OutlinedButton(
                        onClick = onLogOut,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = IncorrectRed),
                        border = androidx.compose.foundation.BorderStroke(1.dp, IncorrectRed.copy(alpha = 0.4f))
                    ) {
                        Icon(Icons.Default.ExitToApp, contentDescription = null, modifier = Modifier.size(18.dp))
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("Log Out / Switch Account", fontWeight = FontWeight.Bold)
                    }
                }

                Spacer(modifier = Modifier.height(14.dp))

                // Save Changes Button
                Button(
                    onClick = {
                        if (isValid) {
                            val score = targetScore.toIntOrNull() ?: 340
                            val fullSubjects = listOf(compulsorySubject) + selectedElectives.toList()
                            onSaveProfile(score, fullSubjects.joinToString(","), studyGoalMinutes, targetInstitution, dreamCourse, jambExamDateTimestamp)
                            onDismiss()
                        }
                    },
                    enabled = isValid,
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = TextPrimary, contentColor = Color.White)
                ) {
                    Text("Save & Apply Personalization", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
