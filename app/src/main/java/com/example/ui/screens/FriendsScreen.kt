package com.example.ui.screens

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.db.FriendEntity
import com.example.data.db.UserProfileEntity
import com.example.ui.theme.*

private val AvatarPastelColors = listOf(
    Color(0xFF2563EB), // Blue
    Color(0xFF16A34A), // Green
    Color(0xFF9333EA), // Purple
    Color(0xFFD97706), // Amber
    Color(0xFF0D9488), // Teal
    Color(0xFFE11D48), // Rose
    Color(0xFF4F46E5)  // Indigo
)

private fun getAvatarColorForName(name: String): Color {
    val hash = kotlin.math.abs(name.hashCode())
    return AvatarPastelColors[hash % AvatarPastelColors.size]
}

@Composable
fun FriendsScreen(
    profile: UserProfileEntity?,
    friends: List<FriendEntity>,
    onAddFriend: (String, (Boolean, String?) -> Unit) -> Unit,
    onAddCustomFriend: (name: String, code: String, accuracy: Int, streak: Int) -> Unit = { _, _, _, _ -> },
    onRemoveFriend: (String) -> Unit = {},
    onAcceptRequest: (String) -> Unit = {},
    onRejectRequest: (String) -> Unit = {},
    onApplyReferralCode: (String, (Boolean, String?) -> Unit) -> Unit = { _, _ -> },
    onSimulateReferral: () -> Unit = {},
    onOpenChat: (FriendEntity) -> Unit,
    onOpenChatByName: (String) -> Unit,
    onChallengeFriend: (FriendEntity) -> Unit,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    var showAddDialog by remember { mutableStateOf(false) }
    var showReferralInputDialog by remember { mutableStateOf(false) }
    var friendInput by remember { mutableStateOf("") }
    var addFriendError by remember { mutableStateOf<String?>(null) }
    var referralInputCode by remember { mutableStateOf("") }
    var referralInputError by remember { mutableStateOf<String?>(null) }
    var isAddingFriend by remember { mutableStateOf(false) }

    var searchQuery by remember { mutableStateOf("") }
    var friendToDelete by remember { mutableStateOf<FriendEntity?>(null) }

    val userInitial = profile?.name?.firstOrNull()?.toString()?.uppercase() ?: "C"
    val userName = profile?.name ?: "UTME Candidate"
    
    // User's active study and referral code
    val userStudyCode = profile?.myReferralCode ?: remember(profile?.id, profile?.name) {
        val codeSuffix = ((profile?.name.hashCode().let { kotlin.math.abs(it) } % 9000) + 1000).toString()
        "PRZ-$codeSuffix"
    }

    val referralCount = profile?.referralCount ?: 0
    val isRewardUnlocked = profile?.freePlusRewardUnlocked == true || referralCount >= 10

    // Filter real friends
    val filteredFriends = remember(friends, searchQuery) {
        if (searchQuery.isBlank()) {
            friends
        } else {
            friends.filter {
                it.name.contains(searchQuery, ignoreCase = true) ||
                it.friendCode.contains(searchQuery, ignoreCase = true)
            }
        }
    }

    // Add Friend Dialog with strict validation and "invalid code" feedback
    if (showAddDialog) {
        AlertDialog(
            onDismissRequest = {
                if (!isAddingFriend) {
                    showAddDialog = false
                    addFriendError = null
                    friendInput = ""
                }
            },
            shape = RoundedCornerShape(20.dp),
            containerColor = SurfaceWhite,
            title = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = CircleShape,
                        color = SoftEmeraldBg,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(Icons.Default.PersonAdd, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(20.dp))
                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("Add Study Buddy", fontWeight = FontWeight.Bold, color = TextPrimary, fontSize = 18.sp)
                }
            },
            text = {
                Column {
                    Text(
                        text = "Enter your friend or classmate's Study Code (e.g. PRZ-4301) to connect and study together:",
                        color = TextSecondary,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Spacer(modifier = Modifier.height(14.dp))
                    OutlinedTextField(
                        value = friendInput,
                        onValueChange = {
                            friendInput = it.uppercase()
                            addFriendError = null
                        },
                        placeholder = { Text("e.g. PRZ-4301", color = TextMuted, fontSize = 14.sp) },
                        singleLine = true,
                        isError = addFriendError != null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("add_friend_code_input"),
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = PrimaryGreen,
                            unfocusedBorderColor = BorderSubtle,
                            focusedContainerColor = AppBackground,
                            unfocusedContainerColor = AppBackground,
                            errorBorderColor = IncorrectRed
                        )
                    )

                    if (addFriendError != null) {
                        Spacer(modifier = Modifier.height(6.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.ErrorOutline,
                                contentDescription = null,
                                tint = IncorrectRed,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = addFriendError ?: "invalid code",
                                color = IncorrectRed,
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.SemiBold,
                                modifier = Modifier.testTag("add_friend_error_msg")
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Your Study Code: $userStudyCode",
                        style = MaterialTheme.typography.bodySmall,
                        color = PrimaryGreen,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        val input = friendInput.trim()
                        if (input.isNotBlank()) {
                            isAddingFriend = true
                            addFriendError = null
                            onAddFriend(input) { success, errMsg ->
                                isAddingFriend = false
                                if (success) {
                                    showAddDialog = false
                                    friendInput = ""
                                    addFriendError = null
                                    Toast.makeText(context, "Study buddy connected!", Toast.LENGTH_SHORT).show()
                                } else {
                                    addFriendError = errMsg ?: "invalid code"
                                    Toast.makeText(context, errMsg ?: "invalid code", Toast.LENGTH_SHORT).show()
                                }
                            }
                        }
                    },
                    enabled = friendInput.isNotBlank() && !isAddingFriend,
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.testTag("confirm_add_friend_btn")
                ) {
                    Text(if (isAddingFriend) "Verifying..." else "Connect", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        showAddDialog = false
                        addFriendError = null
                        friendInput = ""
                    },
                    enabled = !isAddingFriend
                ) {
                    Text("Cancel", color = TextSecondary)
                }
            }
        )
    }

    // Enter Referee Code Dialog
    if (showReferralInputDialog) {
        AlertDialog(
            onDismissRequest = {
                showReferralInputDialog = false
                referralInputError = null
                referralInputCode = ""
            },
            shape = RoundedCornerShape(20.dp),
            containerColor = SurfaceWhite,
            title = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Surface(
                        shape = CircleShape,
                        color = SoftEmeraldBg,
                        modifier = Modifier.size(36.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(Icons.Default.CardGiftcard, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(20.dp))
                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Text("Enter Referee Code", fontWeight = FontWeight.Bold, color = TextPrimary, fontSize = 18.sp)
                }
            },
            text = {
                Column {
                    Text(
                        text = "Enter the Study or Referral Code sent to you by a friend:",
                        color = TextSecondary,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Spacer(modifier = Modifier.height(14.dp))
                    OutlinedTextField(
                        value = referralInputCode,
                        onValueChange = {
                            referralInputCode = it.uppercase()
                            referralInputError = null
                        },
                        placeholder = { Text("e.g. PRZ-4301", color = TextMuted, fontSize = 14.sp) },
                        singleLine = true,
                        isError = referralInputError != null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .testTag("apply_referral_code_input"),
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = PrimaryGreen,
                            unfocusedBorderColor = BorderSubtle,
                            focusedContainerColor = AppBackground,
                            unfocusedContainerColor = AppBackground,
                            errorBorderColor = IncorrectRed
                        )
                    )

                    if (referralInputError != null) {
                        Spacer(modifier = Modifier.height(6.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(Icons.Default.ErrorOutline, contentDescription = null, tint = IncorrectRed, modifier = Modifier.size(14.dp))
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = referralInputError ?: "invalid code",
                                color = IncorrectRed,
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        val input = referralInputCode.trim()
                        if (input.isNotBlank()) {
                            onApplyReferralCode(input) { success, msg ->
                                if (success) {
                                    showReferralInputDialog = false
                                    referralInputCode = ""
                                    referralInputError = null
                                    Toast.makeText(context, msg ?: "Referral linked successfully!", Toast.LENGTH_LONG).show()
                                } else {
                                    referralInputError = msg ?: "invalid code"
                                    Toast.makeText(context, msg ?: "invalid code", Toast.LENGTH_SHORT).show()
                                }
                            }
                        }
                    },
                    enabled = referralInputCode.isNotBlank(),
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Apply Code", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = {
                    showReferralInputDialog = false
                    referralInputError = null
                    referralInputCode = ""
                }) {
                    Text("Cancel", color = TextSecondary)
                }
            }
        )
    }

    // Delete Confirmation Dialog
    if (friendToDelete != null) {
        val target = friendToDelete!!
        AlertDialog(
            onDismissRequest = { friendToDelete = null },
            shape = RoundedCornerShape(18.dp),
            title = { Text("Remove Study Buddy", fontWeight = FontWeight.Bold) },
            text = { Text("Are you sure you want to remove ${target.name} from your study buddies list?") },
            confirmButton = {
                Button(
                    onClick = {
                        onRemoveFriend(target.id)
                        friendToDelete = null
                        Toast.makeText(context, "Removed ${target.name}", Toast.LENGTH_SHORT).show()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDC2626)),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text("Remove", fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                TextButton(onClick = { friendToDelete = null }) {
                    Text("Cancel")
                }
            }
        )
    }

    Scaffold(
        topBar = {
            Surface(
                color = SurfaceWhite,
                shadowElevation = 1.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .statusBarsPadding()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(
                            onClick = onBack,
                            modifier = Modifier.testTag("friends_back_btn")
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Back",
                                tint = TextPrimary
                            )
                        }
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "Study Buddies & Referrals",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                    }

                    Button(
                        onClick = {
                            addFriendError = null
                            friendInput = ""
                            showAddDialog = true
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                        shape = RoundedCornerShape(18.dp),
                        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 6.dp),
                        modifier = Modifier.testTag("add_friend_header_btn")
                    ) {
                        Icon(Icons.Default.Add, contentDescription = null, modifier = Modifier.size(16.dp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Add Buddy", fontSize = 13.sp, fontWeight = FontWeight.Bold)
                    }
                }
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(AppBackground)
                .padding(innerPadding)
                .padding(horizontal = 18.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(6.dp))
                // User's Study Identity Card
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .testTag("user_profile_id_card"),
                    color = DarkCardBg,
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Column(modifier = Modifier.padding(18.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.weight(1f)
                            ) {
                                Surface(
                                    shape = CircleShape,
                                    color = PrimaryGreen,
                                    modifier = Modifier.size(46.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Text(
                                            text = userInitial,
                                            style = MaterialTheme.typography.titleLarge,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.width(14.dp))

                                Column {
                                    Text(
                                        text = userName,
                                        style = MaterialTheme.typography.titleMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.White
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Surface(
                                            shape = CircleShape,
                                            color = CorrectGreen,
                                            modifier = Modifier.size(8.dp)
                                        ) {}
                                        Spacer(modifier = Modifier.width(6.dp))
                                        Text(
                                            text = "Active UTME Aspirant",
                                            style = MaterialTheme.typography.bodySmall,
                                            color = CorrectGreen,
                                            fontWeight = FontWeight.Medium
                                        )
                                    }
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))
                        HorizontalDivider(color = Color.White.copy(alpha = 0.1f))
                        Spacer(modifier = Modifier.height(12.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {
                                Text(
                                    text = "YOUR STUDY / REFERRAL CODE",
                                    style = MaterialTheme.typography.labelSmall,
                                    color = TextMuted,
                                    fontSize = 10.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                                Text(
                                    text = userStudyCode,
                                    style = MaterialTheme.typography.titleLarge,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = AmberAccent,
                                    letterSpacing = 1.sp
                                )
                            }

                            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                // Copy Code Button
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = Color.White.copy(alpha = 0.12f),
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(12.dp))
                                        .clickable {
                                            val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                                            val clip = ClipData.newPlainText("Prepza Study Code", userStudyCode)
                                            clipboard.setPrimaryClip(clip)
                                            Toast.makeText(context, "Study Code copied: $userStudyCode", Toast.LENGTH_SHORT).show()
                                        }
                                        .testTag("copy_study_code_btn")
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.ContentCopy, contentDescription = null, tint = Color.White, modifier = Modifier.size(14.dp))
                                        Spacer(modifier = Modifier.width(4.dp))
                                        Text("Copy", style = MaterialTheme.typography.labelSmall, color = Color.White, fontWeight = FontWeight.Bold)
                                    }
                                }

                                // Share Code Button
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = PrimaryGreen,
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(12.dp))
                                        .clickable {
                                            val sendIntent = Intent().apply {
                                                action = Intent.ACTION_SEND
                                                putExtra(
                                                    Intent.EXTRA_TEXT,
                                                    "Hey! Let's practice JAMB UTME past questions and smash 300+ on Prepza! Use my Study/Referral code: $userStudyCode"
                                                )
                                                type = "text/plain"
                                            }
                                            val shareIntent = Intent.createChooser(sendIntent, "Share Study Code")
                                            context.startActivity(shareIntent)
                                        }
                                        .testTag("share_study_code_btn")
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.Share, contentDescription = null, tint = Color.White, modifier = Modifier.size(14.dp))
                                        Spacer(modifier = Modifier.width(4.dp))
                                        Text("Share", style = MaterialTheme.typography.labelSmall, color = Color.White, fontWeight = FontWeight.Bold)
                                    }
                                }
                            }
                        }
                    }
                }
            }

            // Referral Reward Milestone Section (Refer 10 active users -> Free 1 Month Prepza Plus)
            item {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(20.dp))
                        .testTag("referral_reward_card"),
                    shape = RoundedCornerShape(20.dp),
                    color = SurfaceWhite,
                    border = BorderStroke(1.dp, if (isRewardUnlocked) AmberAccent.copy(alpha = 0.5f) else BorderSubtle)
                ) {
                    Column(modifier = Modifier.padding(18.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Surface(
                                    shape = CircleShape,
                                    color = if (isRewardUnlocked) SoftAmberBg else SoftEmeraldBg,
                                    modifier = Modifier.size(38.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            imageVector = if (isRewardUnlocked) Icons.Default.Stars else Icons.Default.CardGiftcard,
                                            contentDescription = null,
                                            tint = if (isRewardUnlocked) AmberAccent else PrimaryGreen,
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.width(10.dp))
                                Column {
                                    Text(
                                        text = "Referral Reward Program",
                                        style = MaterialTheme.typography.titleSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = TextPrimary
                                    )
                                    Text(
                                        text = "Refer 10 active users = 1 Month Prepza Plus Free",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = TextSecondary,
                                        fontSize = 11.sp
                                    )
                                }
                            }

                            if (isRewardUnlocked) {
                                Surface(
                                    shape = RoundedCornerShape(8.dp),
                                    color = SoftAmberBg,
                                    border = BorderStroke(1.dp, AmberAccent.copy(alpha = 0.4f))
                                ) {
                                    Text(
                                        text = "REWARD UNLOCKED",
                                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp),
                                        style = MaterialTheme.typography.labelSmall,
                                        fontWeight = FontWeight.ExtraBold,
                                        color = AmberAccent,
                                        fontSize = 10.sp
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        // Progress Bar & Count
                        val progressFraction = (referralCount / 10f).coerceIn(0f, 1f)
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Referral Progress",
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.SemiBold,
                                color = TextPrimary
                            )
                            Text(
                                text = "$referralCount / 10 Active Aspirants",
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Bold,
                                color = if (isRewardUnlocked) CorrectGreen else PrimaryGreen
                            )
                        }

                        Spacer(modifier = Modifier.height(6.dp))

                        LinearProgressIndicator(
                            progress = { progressFraction },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(8.dp)
                                .clip(RoundedCornerShape(4.dp)),
                            color = if (isRewardUnlocked) AmberAccent else PrimaryGreen,
                            trackColor = BorderSubtle
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        if (isRewardUnlocked) {
                            Surface(
                                shape = RoundedCornerShape(12.dp),
                                color = SoftAmberBg,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    modifier = Modifier.padding(12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.CheckCircle, contentDescription = null, tint = CorrectGreen, modifier = Modifier.size(20.dp))
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "Congratulations! You've referred 10+ active candidates and unlocked 1 Month of Free Prepza Plus!",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = TextPrimary,
                                        fontWeight = FontWeight.Medium,
                                        lineHeight = 16.sp
                                    )
                                }
                            }
                        } else {
                            Text(
                                text = "🎯 Refer ${10 - referralCount} more candidate(s) who register using your study code ($userStudyCode) to automatically receive 1 Month of Prepza Plus with unlimited AI explanations and offline CBT mocks.",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary,
                                lineHeight = 17.sp
                            )
                        }

                        Spacer(modifier = Modifier.height(12.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            if (profile?.referredByCode.isNullOrBlank()) {
                                OutlinedButton(
                                    onClick = {
                                        referralInputError = null
                                        referralInputCode = ""
                                        showReferralInputDialog = true
                                    },
                                    shape = RoundedCornerShape(12.dp),
                                    modifier = Modifier.weight(1f),
                                    colors = ButtonDefaults.outlinedButtonColors(contentColor = PrimaryGreen),
                                    border = BorderStroke(1.dp, PrimaryGreen.copy(alpha = 0.5f))
                                ) {
                                    Icon(Icons.Default.CardGiftcard, contentDescription = null, modifier = Modifier.size(14.dp))
                                    Spacer(modifier = Modifier.width(4.dp))
                                    Text("Enter Referee Code", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                                }
                            } else {
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = SoftEmeraldBg,
                                    modifier = Modifier.weight(1f)
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.Check, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(14.dp))
                                        Spacer(modifier = Modifier.width(4.dp))
                                        Text(
                                            text = "Referred by: ${profile?.referredByCode}",
                                            style = MaterialTheme.typography.labelSmall,
                                            color = PrimaryGreen,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }
                                }
                            }

                            // Interactive Demo/Simulate Referral Button to allow instant user testing
                            OutlinedButton(
                                onClick = {
                                    onSimulateReferral()
                                    Toast.makeText(context, "+1 Active Referral Recorded! Total: ${referralCount + 1}", Toast.LENGTH_SHORT).show()
                                },
                                shape = RoundedCornerShape(12.dp),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = AmberAccent),
                                border = BorderStroke(1.dp, AmberAccent.copy(alpha = 0.4f)),
                                modifier = Modifier.testTag("simulate_referral_btn")
                            ) {
                                Icon(Icons.Default.AddReaction, contentDescription = null, modifier = Modifier.size(14.dp))
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("+1 Referral Test", fontSize = 11.sp, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            }

            // Friends List Section
            if (friends.isNotEmpty()) {
                item {
                    // Search Bar
                    OutlinedTextField(
                        value = searchQuery,
                        onValueChange = { searchQuery = it },
                        placeholder = { Text("Search by name or code...", color = TextMuted, fontSize = 14.sp) },
                        leadingIcon = { Icon(Icons.Default.Search, contentDescription = null, tint = TextMuted, modifier = Modifier.size(18.dp)) },
                        trailingIcon = {
                            if (searchQuery.isNotBlank()) {
                                IconButton(onClick = { searchQuery = "" }) {
                                    Icon(Icons.Default.Close, contentDescription = "Clear", tint = TextMuted, modifier = Modifier.size(16.dp))
                                }
                            }
                        },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(14.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedContainerColor = SurfaceWhite,
                            unfocusedContainerColor = SurfaceWhite,
                            focusedBorderColor = PrimaryGreen,
                            unfocusedBorderColor = BorderSubtle
                        )
                    )
                }

                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Connected Buddies (${filteredFriends.size})",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = TextPrimary
                        )
                        Text(
                            text = "Tap to Chat",
                            style = MaterialTheme.typography.labelSmall,
                            color = PrimaryGreen,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                items(filteredFriends, key = { it.id }) { friend ->
                    val initials = remember(friend.name) {
                        friend.name.split(" ")
                            .mapNotNull { it.firstOrNull()?.toString() }
                            .take(2).joinToString("").ifBlank { "S" }
                    }
                    val avatarColor = remember(friend.name) { getAvatarColorForName(friend.name) }

                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp))
                            .clickable { onOpenChat(friend) }
                            .testTag("friend_card_${friend.id}"),
                        shape = RoundedCornerShape(16.dp),
                        color = SurfaceWhite,
                        border = BorderStroke(1.dp, BorderSubtle)
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
                                Surface(
                                    shape = CircleShape,
                                    color = avatarColor,
                                    modifier = Modifier.size(46.dp)
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Text(
                                            text = initials,
                                            style = MaterialTheme.typography.titleMedium,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                    }
                                }

                                Spacer(modifier = Modifier.width(12.dp))

                                Column {
                                    Text(
                                        text = friend.name,
                                        style = MaterialTheme.typography.titleSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = TextPrimary
                                    )
                                    Spacer(modifier = Modifier.height(2.dp))
                                    Text(
                                        text = "Code: ${friend.friendCode}",
                                        style = MaterialTheme.typography.bodySmall,
                                        fontSize = 11.sp,
                                        color = TextSecondary
                                    )
                                }
                            }

                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                // Challenge Button
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = SoftAmberBg,
                                    border = BorderStroke(1.dp, AmberAccent.copy(alpha = 0.3f)),
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(12.dp))
                                        .clickable { onChallengeFriend(friend) }
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Bolt,
                                        contentDescription = "Challenge",
                                        tint = AmberAccent,
                                        modifier = Modifier.padding(8.dp).size(16.dp)
                                    )
                                }

                                // Chat Button
                                Surface(
                                    shape = RoundedCornerShape(12.dp),
                                    color = SoftEmeraldBg,
                                    border = BorderStroke(1.dp, PrimaryGreen.copy(alpha = 0.3f)),
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(12.dp))
                                        .clickable { onOpenChat(friend) }
                                        .testTag("chat_btn_${friend.id}")
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 7.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.ChatBubbleOutline,
                                            contentDescription = "Chat",
                                            tint = PrimaryGreen,
                                            modifier = Modifier.size(14.dp)
                                        )
                                        Spacer(modifier = Modifier.width(4.dp))
                                        Text(
                                            text = "Chat",
                                            style = MaterialTheme.typography.labelSmall,
                                            fontWeight = FontWeight.Bold,
                                            color = PrimaryGreen
                                        )
                                    }
                                }

                                // Remove option
                                IconButton(
                                    onClick = { friendToDelete = friend },
                                    modifier = Modifier.size(28.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.DeleteOutline,
                                        contentDescription = "Remove",
                                        tint = Color(0xFFEF4444),
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            } else {
                // Clean Empty State
                item {
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        color = SurfaceWhite,
                        border = BorderStroke(1.dp, BorderSubtle)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(24.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Surface(
                                shape = CircleShape,
                                color = SoftEmeraldBg,
                                modifier = Modifier.size(56.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        imageVector = Icons.Outlined.PeopleAlt,
                                        contentDescription = null,
                                        tint = PrimaryGreen,
                                        modifier = Modifier.size(28.dp)
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(14.dp))

                            Text(
                                text = "No Study Buddies Connected Yet",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )

                            Spacer(modifier = Modifier.height(6.dp))

                            Text(
                                text = "Share your Study Code with your real classmates or enter their study code to study together, chat in real-time, and challenge each other to mock quizzes.",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary,
                                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                                lineHeight = 18.sp
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            Button(
                                onClick = {
                                    addFriendError = null
                                    friendInput = ""
                                    showAddDialog = true
                                },
                                colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                                shape = RoundedCornerShape(14.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Icon(Icons.Default.PersonAdd, contentDescription = null, modifier = Modifier.size(16.dp))
                                Spacer(modifier = Modifier.width(6.dp))
                                Text("Add Study Buddy by Code", fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                }
            }

            item {
                Spacer(modifier = Modifier.height(24.dp))
            }
        }
    }
}
