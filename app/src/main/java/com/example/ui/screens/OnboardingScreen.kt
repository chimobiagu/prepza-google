package com.example.ui.screens

import androidx.compose.animation.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.AccountBalance
import androidx.compose.material.icons.outlined.AutoStories
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.components.PrepzaButton
import com.example.ui.theme.*

import androidx.compose.material.icons.outlined.Event
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

data class OnboardingStep(
    val title: String,
    val subtitle: String,
    val badge: String
)

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun OnboardingScreen(
    currentName: String = "Chinedu Okafor",
    onCompleteOnboarding: (name: String, targetScore: Int, subjectsCsv: String, institution: String, dreamCourse: String, jambExamDateTimestamp: Long) -> Unit
) {
    val steps = remember {
        listOf(
            OnboardingStep(
                title = "Your whole JAMB prep, in one place",
                subtitle = "Practice, timed mocks, explanations, and progress tracking. No clutter.",
                badge = "Smart JAMB Platform"
            ),
            OnboardingStep(
                title = "15,000+ real past questions, fully explained",
                subtitle = "Every answer comes with step-by-step AI explanations and verified JAMB origin tags.",
                badge = "Verified Past Questions"
            ),
            OnboardingStep(
                title = "Sit full 4-subject CBT mocks, just like real JAMB",
                subtitle = "60 English + 40/40/40 electives, 2-hour timer, on-screen calculator, and instant 400-point grading.",
                badge = "Realistic 180-Q Mocks"
            ),
            OnboardingStep(
                title = "Select your 4 JAMB subjects & target score",
                subtitle = "Personalize your study plan, weak-topic analytics, and smart practice drills.",
                badge = "Academic Profile"
            )
        )
    }

    var currentStepIndex by remember { mutableStateOf(0) }
    var userName by remember { mutableStateOf(currentName) }
    var targetScore by remember { mutableStateOf("320") }
    var targetInstitution by remember { mutableStateOf("UNILAG") }
    var dreamCourse by remember { mutableStateOf("Medicine & Surgery") }

    // Official JAMB Date Selection (Default ~64 days from current date)
    val defaultJambTimestamp = remember {
        val cal = Calendar.getInstance()
        cal.add(Calendar.DAY_OF_YEAR, 64)
        cal.timeInMillis
    }
    var selectedJambDateTimestamp by remember { mutableStateOf(defaultJambTimestamp) }
    var isCustomDateMode by remember { mutableStateOf(false) }

    // Compulsory subject: English Language is always included
    val compulsorySubject = "English Language"
    // Available elective options (choose exactly 3)
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
            "Principles of Accounts",
            "Geography",
            "History",
            "Islamic Religious Studies (IRS)"
        )
    }

    var selectedElectives by remember {
        mutableStateOf(setOf("Mathematics", "Physics", "Chemistry"))
    }

    val isLastStep = currentStepIndex == steps.size - 1
    val totalSelectedCount = 1 + selectedElectives.size // 1 compulsory + electives
    val isSelectionValid = totalSelectedCount == 4

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(AppBackground, PaleGreenBg, SoftGreenBg)
                )
            )
            .windowInsetsPadding(WindowInsets.systemBars)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Header Progress Dots
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    steps.indices.forEach { index ->
                        Box(
                            modifier = Modifier
                                .height(6.dp)
                                .width(if (index == currentStepIndex) 28.dp else 10.dp)
                                .clip(CircleShape)
                                .background(if (index == currentStepIndex) PrimaryGreen else BorderSubtle)
                        )
                    }
                }

                if (!isLastStep) {
                    TextButton(onClick = { currentStepIndex = steps.size - 1 }) {
                        Text("Skip to Setup", style = MaterialTheme.typography.labelLarge, color = TextSecondary)
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Step Content
            val step = steps[currentStepIndex]
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Surface(
                    color = SurfaceWhite,
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(1.dp, BorderSubtle),
                    modifier = Modifier.padding(bottom = 14.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = step.badge,
                            style = MaterialTheme.typography.labelMedium,
                            color = PrimaryGreen,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Text(
                    text = step.title,
                    style = MaterialTheme.typography.displayMedium,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary,
                    textAlign = TextAlign.Center,
                    lineHeight = 32.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = step.subtitle,
                    style = MaterialTheme.typography.bodyLarge,
                    color = TextSecondary,
                    textAlign = TextAlign.Center,
                    lineHeight = 22.sp
                )

                Spacer(modifier = Modifier.height(24.dp))

                if (isLastStep) {
                    // Setup Profile & JAMB Subjects Card
                    Surface(
                        color = SurfaceWhite,
                        shape = RoundedCornerShape(20.dp),
                        border = BorderStroke(1.dp, BorderSubtle),
                        shadowElevation = 2.dp,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Text(
                                text = "Candidate Profile & Preferences",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = "Your subjects & target score personalize all 180-Q CBT mocks, drills, and AI plans.",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary
                            )

                            Spacer(modifier = Modifier.height(14.dp))

                            OutlinedTextField(
                                value = userName,
                                onValueChange = { userName = it },
                                label = { Text("Full Name") },
                                singleLine = true,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .testTag("onboarding_name_input"),
                                shape = RoundedCornerShape(12.dp)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                OutlinedTextField(
                                    value = targetInstitution,
                                    onValueChange = { targetInstitution = it },
                                    label = { Text("Target University") },
                                    placeholder = { Text("e.g. UNILAG, UI, OAU") },
                                    singleLine = true,
                                    modifier = Modifier.weight(1f),
                                    shape = RoundedCornerShape(12.dp)
                                )

                                OutlinedTextField(
                                    value = dreamCourse,
                                    onValueChange = { dreamCourse = it },
                                    label = { Text("Dream Course") },
                                    placeholder = { Text("e.g. Medicine, Law") },
                                    singleLine = true,
                                    modifier = Modifier.weight(1f),
                                    shape = RoundedCornerShape(12.dp)
                                )
                            }

                            Spacer(modifier = Modifier.height(14.dp))

                            // Official JAMB Date Selector
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Your Official JAMB UTME Date:",
                                    style = MaterialTheme.typography.labelLarge,
                                    fontWeight = FontWeight.Bold,
                                    color = TextPrimary
                                )
                                val daysLeft = ((selectedJambDateTimestamp - System.currentTimeMillis()) / (1000L * 3600 * 24)).toInt().coerceAtLeast(0)
                                Surface(
                                    color = PaleGreenBg,
                                    shape = RoundedCornerShape(8.dp),
                                    border = BorderStroke(1.dp, PrimaryGreen.copy(alpha = 0.5f))
                                ) {
                                    Text(
                                        text = "$daysLeft days left",
                                        style = MaterialTheme.typography.labelSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = PrimaryGreenDark,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.height(6.dp))

                            val jambDatePresets = remember {
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
                                jambDatePresets.forEach { (label, timestamp) ->
                                    val isChosen = Math.abs(selectedJambDateTimestamp - timestamp) < (24 * 3600 * 1000L)
                                    Surface(
                                        modifier = Modifier
                                            .weight(1f)
                                            .clip(RoundedCornerShape(10.dp))
                                            .clickable { selectedJambDateTimestamp = timestamp },
                                        color = if (isChosen) SoftEmeraldBg else AppBackground,
                                        shape = RoundedCornerShape(10.dp),
                                        border = BorderStroke(1.dp, if (isChosen) PrimaryGreen else BorderSubtle)
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

                            // Date fine tuner (+ / - days)
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
                                        text = sdfFull.format(Date(selectedJambDateTimestamp)),
                                        style = MaterialTheme.typography.bodySmall,
                                        fontWeight = FontWeight.SemiBold,
                                        color = TextPrimary
                                    )
                                }

                                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                                    OutlinedButton(
                                        onClick = {
                                            selectedJambDateTimestamp = (selectedJambDateTimestamp - (24 * 3600 * 1000L)).coerceAtLeast(System.currentTimeMillis())
                                        },
                                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp),
                                        modifier = Modifier.height(28.dp),
                                        shape = RoundedCornerShape(6.dp)
                                    ) {
                                        Text("-1d", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                    }

                                    OutlinedButton(
                                        onClick = {
                                            selectedJambDateTimestamp += (24 * 3600 * 1000L)
                                        },
                                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 2.dp),
                                        modifier = Modifier.height(28.dp),
                                        shape = RoundedCornerShape(6.dp)
                                    ) {
                                        Text("+1d", fontSize = 10.sp, fontWeight = FontWeight.Bold)
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            // Target Score Selector
                            Text(
                                text = "Target JAMB Score (Out of 400):",
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Spacer(modifier = Modifier.height(6.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(8.dp)
                            ) {
                                listOf("280", "300", "320", "350").forEach { scoreChoice ->
                                    val isScoreSelected = targetScore == scoreChoice
                                    Surface(
                                        modifier = Modifier
                                            .weight(1f)
                                            .clip(RoundedCornerShape(10.dp))
                                            .clickable { targetScore = scoreChoice }
                                            .testTag("target_score_preset_$scoreChoice"),
                                        color = if (isScoreSelected) TextPrimary else AppBackground,
                                        shape = RoundedCornerShape(10.dp),
                                        border = BorderStroke(
                                            1.dp,
                                            if (isScoreSelected) TextPrimary else BorderSubtle
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
                                                color = if (isScoreSelected) Color.White else TextPrimary
                                            )
                                        }
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            // Quick Stream Presets
                            Text(
                                text = "Quick Stream Presets:",
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
                                    "Medicine" to setOf("Biology", "Chemistry", "Physics"),
                                    "Engineering" to setOf("Mathematics", "Physics", "Chemistry"),
                                    "Law / Arts" to setOf("Literature", "CRS", "Government"),
                                    "Commercial" to setOf("Economics", "Mathematics", "Commerce")
                                )
                                presets.forEach { (name, subjects) ->
                                    val isPresetActive = selectedElectives == subjects
                                    Surface(
                                        shape = RoundedCornerShape(8.dp),
                                        color = if (isPresetActive) SoftEmeraldBg else AppBackground,
                                        border = BorderStroke(1.dp, if (isPresetActive) PrimaryGreen else BorderSubtle),
                                        modifier = Modifier
                                            .weight(1f)
                                            .clickable { selectedElectives = subjects }
                                    ) {
                                        Text(
                                            text = name,
                                            style = MaterialTheme.typography.labelSmall,
                                            fontWeight = if (isPresetActive) FontWeight.Bold else FontWeight.Normal,
                                            color = if (isPresetActive) PrimaryGreenDark else TextPrimary,
                                            fontSize = 9.sp,
                                            modifier = Modifier.padding(vertical = 6.dp, horizontal = 2.dp),
                                            textAlign = TextAlign.Center
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            // Subjects Header with Counter
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Your 4 JAMB Subjects:",
                                    style = MaterialTheme.typography.labelLarge,
                                    fontWeight = FontWeight.Bold,
                                    color = TextPrimary
                                )

                                Surface(
                                    color = if (isSelectionValid) CorrectGreenBg else WarningAmberBg,
                                    shape = RoundedCornerShape(8.dp)
                                ) {
                                    Text(
                                        text = "$totalSelectedCount / 4 Selected",
                                        style = MaterialTheme.typography.labelSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = if (isSelectionValid) CorrectGreen else WarningAmber,
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            // 1. Compulsory English Card
                            Surface(
                                color = PaleGreenBg,
                                shape = RoundedCornerShape(12.dp),
                                border = BorderStroke(1.5.dp, PrimaryGreen),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(bottom = 10.dp)
                            ) {
                                Row(
                                    modifier = Modifier.padding(horizontal = 14.dp, vertical = 10.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(
                                            imageVector = Icons.Default.Check,
                                            contentDescription = null,
                                            tint = PrimaryGreen,
                                            modifier = Modifier.size(18.dp)
                                        )
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(
                                            text = compulsorySubject,
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = FontWeight.Bold,
                                            color = PrimaryGreenDark
                                        )
                                    }

                                    Surface(
                                        color = PrimaryGreen,
                                        shape = RoundedCornerShape(6.dp)
                                    ) {
                                        Row(
                                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Icon(Icons.Default.Lock, contentDescription = null, tint = Color.White, modifier = Modifier.size(12.dp))
                                            Spacer(modifier = Modifier.width(3.dp))
                                            Text(
                                                text = "60 Qs • COMPULSORY",
                                                style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                                                fontWeight = FontWeight.Bold,
                                                color = Color.White
                                            )
                                        }
                                    }
                                }
                            }

                            Text(
                                text = "Choose exactly 3 additional subjects (40 Qs each):",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary,
                                modifier = Modifier.padding(bottom = 8.dp)
                            )

                            // Elective Subjects Grid
                            FlowRow(
                                horizontalArrangement = Arrangement.spacedBy(8.dp),
                                verticalArrangement = Arrangement.spacedBy(8.dp),
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
                                                if (current.size < 3) {
                                                    current.add(subj)
                                                }
                                            }
                                            selectedElectives = current
                                        },
                                        label = { Text(subj) },
                                        leadingIcon = if (isSelected) {
                                            { Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(16.dp)) }
                                        } else null,
                                        colors = FilterChipDefaults.filterChipColors(
                                            selectedContainerColor = TextPrimary,
                                            selectedLabelColor = Color.White
                                        ),
                                        modifier = Modifier.testTag("elective_chip_${subj.lowercase().replace(" ", "_")}")
                                    )
                                }
                            }

                            if (!isSelectionValid) {
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(
                                    text = "Please choose exactly 3 additional subjects to complete your profile.",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = WarningAmber
                                )
                            }

                            Spacer(modifier = Modifier.height(16.dp))

                            // Prepza Plus 30-Day Free Trial info note
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = SoftEmeraldBg,
                                border = BorderStroke(1.dp, PrimaryGreenLight.copy(alpha = 0.5f)),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column(modifier = Modifier.padding(12.dp)) {
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Icon(
                                            imageVector = Icons.Default.Star,
                                            contentDescription = "Plus",
                                            tint = PrimaryGreenDark,
                                            modifier = Modifier.size(16.dp)
                                        )
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Text(
                                            text = "Prepza Plus 30-Day Free Trial Included",
                                            fontWeight = FontWeight.Bold,
                                            style = MaterialTheme.typography.labelMedium,
                                            color = PrimaryGreenDark
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(4.dp))
                                    Text(
                                        text = "Enjoy unlimited 180-Q CBT mocks, full offline packs & AI tutoring for your first month. Renews after 1 month at ₦1,500/mo. Cancel anytime.",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = TextSecondary,
                                        fontSize = 11.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Navigation Button
            Column(modifier = Modifier.fillMaxWidth()) {
                PrepzaButton(
                    text = if (isLastStep) "Complete Setup & Launch Prepza" else "Continue →",
                    onClick = {
                        if (isLastStep) {
                            if (isSelectionValid) {
                                val score = targetScore.toIntOrNull() ?: 320
                                val fullSubjectList = listOf(compulsorySubject) + selectedElectives.toList()
                                onCompleteOnboarding(
                                    userName.ifBlank { "Chinedu Okafor" },
                                    score,
                                    fullSubjectList.joinToString(","),
                                    targetInstitution.ifBlank { "UNILAG" },
                                    dreamCourse.ifBlank { "Medicine & Surgery" },
                                    selectedJambDateTimestamp
                                )
                            }
                        } else {
                            currentStepIndex += 1
                        }
                    },
                    enabled = !isLastStep || isSelectionValid,
                    icon = if (!isLastStep) Icons.AutoMirrored.Filled.ArrowForward else Icons.Default.School,
                    modifier = Modifier.testTag("onboarding_continue_btn")
                )
            }
        }
    }
}

