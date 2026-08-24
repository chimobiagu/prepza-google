package com.example.ui.screens

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.widget.Toast
import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.ContentCopy
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.ai.TutorPersona
import com.example.ui.theme.*
import com.example.ui.viewmodel.AiChatMessage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AiTutorScreen(
    messages: List<AiChatMessage>,
    isLoading: Boolean,
    contextQuestion: String = "",
    selectedPersona: TutorPersona = TutorPersona.GENERAL_COACH,
    onSelectPersona: (TutorPersona) -> Unit = {},
    onSendMessage: (text: String, persona: TutorPersona) -> Unit,
    onClearChat: (TutorPersona) -> Unit = {},
    onBack: () -> Unit
) {
    var inputText by remember { mutableStateOf("") }
    val listState = rememberLazyListState()
    val context = LocalContext.current

    val quickPrompts = when (selectedPersona) {
        TutorPersona.STEM_SPECIALIST -> listOf(
            "Solve quadratic using formula",
            "Derive projectile max height formula",
            "Organic chemistry esterification mechanism",
            "Calculate kinetic energy & work done",
            "Differentiation power rule with examples",
            "Faraday's laws of electrolysis calculations"
        )
        TutorPersona.RAPID_SPRINT -> listOf(
            "Quick: Top 5 Concord rules",
            "Instant: Gas law equations",
            "Flash: Silent letters in Oral English",
            "Speed: 320+ Exam time allocation",
            "Instant: 2x2 Matrix determinant shortcut",
            "Rapid: Blood group donors & recipients"
        )
        TutorPersona.LITERATURE_ANALYST -> listOf(
            "Summarize 'The Life Changer' plot",
            "Explain Ummi & Salma's conflict",
            "Who is Kabir and what did he do?",
            "Major themes in The Life Changer",
            "Omar's JAMB score & admission course",
            "Common literary figures of speech"
        )
        else -> listOf(
            "Summarize 'The Life Changer'",
            "Top 10 Concord rules in UTME",
            "Math calculus & sequence tricks",
            "Organic chemistry reaction hacks",
            "How to score 320+ in JAMB",
            "Explain projectile motion formula"
        )
    }

    LaunchedEffect(messages.size) {
        if (messages.isNotEmpty()) {
            listState.animateScrollToItem(messages.size - 1)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            shape = CircleShape,
                            color = PaleGreenBg,
                            modifier = Modifier.size(38.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = when (selectedPersona) {
                                        TutorPersona.STEM_SPECIALIST -> Icons.Default.Calculate
                                        TutorPersona.RAPID_SPRINT -> Icons.Default.Bolt
                                        TutorPersona.LITERATURE_ANALYST -> Icons.Default.MenuBook
                                        else -> Icons.Default.AutoAwesome
                                    },
                                    contentDescription = null,
                                    tint = PrimaryGreen,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Text(
                                    text = "Prepza AI Tutor",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.width(6.dp))
                                Surface(
                                    shape = RoundedCornerShape(6.dp),
                                    color = SoftEmeraldBg
                                ) {
                                    Row(
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Bolt,
                                            contentDescription = null,
                                            tint = PrimaryGreenDark,
                                            modifier = Modifier.size(11.dp)
                                        )
                                        Spacer(modifier = Modifier.width(2.dp))
                                        Text(
                                            text = selectedPersona.modelId.replace("models/", ""),
                                            style = MaterialTheme.typography.labelSmall,
                                            color = PrimaryGreenDark,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 9.sp
                                        )
                                    }
                                }
                            }
                            Text(
                                text = selectedPersona.displayName,
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary,
                                fontSize = 11.sp
                            )
                        }
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack, modifier = Modifier.testTag("ai_tutor_back_btn")) {
                        Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    IconButton(
                        onClick = { onClearChat(selectedPersona) },
                        modifier = Modifier.testTag("ai_tutor_clear_btn")
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Delete,
                            contentDescription = "Clear Chat",
                            tint = TextSecondary
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = SurfaceWhite)
            )
        },
        bottomBar = {
            Surface(
                color = SurfaceWhite,
                shadowElevation = 8.dp,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 10.dp)
                ) {
                    // Quick Suggested Prompts Carousel
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState())
                            .padding(bottom = 8.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        quickPrompts.forEach { prompt ->
                            Surface(
                                shape = RoundedCornerShape(16.dp),
                                color = AppBackground,
                                border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                                modifier = Modifier
                                    .clip(RoundedCornerShape(16.dp))
                                    .clickable(enabled = !isLoading) {
                                        onSendMessage(prompt, selectedPersona)
                                    }
                            ) {
                                Text(
                                    text = prompt,
                                    style = MaterialTheme.typography.labelMedium,
                                    color = TextPrimary,
                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                                    fontWeight = FontWeight.Medium
                                )
                            }
                        }
                    }

                    // Input Bar
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        OutlinedTextField(
                            value = inputText,
                            onValueChange = { inputText = it },
                            placeholder = {
                                Text(
                                    when (selectedPersona) {
                                        TutorPersona.STEM_SPECIALIST -> "Ask a complex derivation, math proof, formula..."
                                        TutorPersona.RAPID_SPRINT -> "Ask for rapid concept, instant rule, formula..."
                                        TutorPersona.LITERATURE_ANALYST -> "Ask about Life Changer, themes, character..."
                                        else -> "Ask a question, formula, or novel plot..."
                                    },
                                    fontSize = 13.sp
                                )
                            },
                            modifier = Modifier
                                .weight(1f)
                                .testTag("ai_tutor_input_field"),
                            shape = RoundedCornerShape(22.dp),
                            maxLines = 4,
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = PrimaryGreen,
                                unfocusedBorderColor = BorderSubtle
                            )
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        IconButton(
                            onClick = {
                                if (inputText.isNotBlank() && !isLoading) {
                                    onSendMessage(inputText.trim(), selectedPersona)
                                    inputText = ""
                                }
                            },
                            enabled = inputText.isNotBlank() && !isLoading,
                            modifier = Modifier
                                .size(48.dp)
                                .background(
                                    if (inputText.isNotBlank() && !isLoading) PrimaryGreen else BorderSubtle,
                                    CircleShape
                                )
                                .testTag("ai_tutor_send_btn")
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.Send,
                                contentDescription = "Send",
                                tint = Color.White,
                                modifier = Modifier.size(20.dp)
                            )
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
            // Tutor Persona Selector Tabs
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(SurfaceWhite)
                    .horizontalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                TutorPersona.values().forEach { persona ->
                    val isSelected = persona == selectedPersona
                    val chipBg = if (isSelected) PrimaryGreen else SurfaceWhite
                    val chipTextColor = if (isSelected) Color.White else TextSecondary
                    val chipBorderColor = if (isSelected) PrimaryGreen else BorderSubtle

                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = chipBg,
                        border = androidx.compose.foundation.BorderStroke(1.dp, chipBorderColor),
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .clickable {
                                onSelectPersona(persona)
                            }
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Icon(
                                imageVector = when (persona) {
                                    TutorPersona.STEM_SPECIALIST -> Icons.Default.Calculate
                                    TutorPersona.RAPID_SPRINT -> Icons.Default.Bolt
                                    TutorPersona.LITERATURE_ANALYST -> Icons.Default.MenuBook
                                    else -> Icons.Default.AutoAwesome
                                },
                                contentDescription = null,
                                tint = chipTextColor,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = persona.displayName,
                                style = MaterialTheme.typography.labelSmall,
                                color = chipTextColor,
                                fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                            )
                        }
                    }
                }
            }

            // Role Description Banner
            Surface(
                color = SoftEmeraldBg.copy(alpha = 0.5f),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Role: ${selectedPersona.tagline} • Powered by ${selectedPersona.modelId}",
                        style = MaterialTheme.typography.labelSmall,
                        color = PrimaryGreenDark,
                        fontSize = 11.sp
                    )
                }
            }

            // If active question context is present, show a context banner
            if (contextQuestion.isNotBlank()) {
                Surface(
                    color = PaleGreenBg,
                    border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreenLight.copy(alpha = 0.4f)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 6.dp),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.HelpOutline,
                            contentDescription = null,
                            tint = PrimaryGreen,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Discussing selected practice question",
                            style = MaterialTheme.typography.labelMedium,
                            color = PrimaryGreenDark,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            // Multi-Turn Chat Scrollable Thread
            LazyColumn(
                state = listState,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                items(messages) { msg ->
                    val isUser = msg.sender == "user"

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = if (isUser) Arrangement.End else Arrangement.Start
                    ) {
                        if (!isUser) {
                            Surface(
                                shape = CircleShape,
                                color = PrimaryGreen,
                                modifier = Modifier
                                    .size(30.dp)
                                    .padding(top = 4.dp)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Icon(
                                        imageVector = when (selectedPersona) {
                                            TutorPersona.STEM_SPECIALIST -> Icons.Default.Calculate
                                            TutorPersona.RAPID_SPRINT -> Icons.Default.Bolt
                                            TutorPersona.LITERATURE_ANALYST -> Icons.Default.MenuBook
                                            else -> Icons.Default.AutoAwesome
                                        },
                                        contentDescription = null,
                                        tint = Color.White,
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                        }

                        Surface(
                            shape = RoundedCornerShape(
                                topStart = if (isUser) 18.dp else 4.dp,
                                topEnd = 18.dp,
                                bottomStart = 18.dp,
                                bottomEnd = if (isUser) 4.dp else 18.dp
                            ),
                            color = if (isUser) TextPrimary else SurfaceWhite,
                            border = if (isUser) null else androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
                            shadowElevation = if (isUser) 0.dp else 1.dp,
                            modifier = Modifier.widthIn(max = 320.dp)
                        ) {
                            Column(modifier = Modifier.padding(14.dp)) {
                                Text(
                                    text = msg.text,
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = if (isUser) Color.White else TextPrimary,
                                    lineHeight = 22.sp
                                )

                                if (!isUser) {
                                    Spacer(modifier = Modifier.height(8.dp))
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.End,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        IconButton(
                                            onClick = {
                                                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                                                val clip = ClipData.newPlainText("Prepza AI Note", msg.text)
                                                clipboard.setPrimaryClip(clip)
                                                Toast.makeText(context, "Copied explanation to clipboard", Toast.LENGTH_SHORT).show()
                                            },
                                            modifier = Modifier.size(24.dp)
                                        ) {
                                            Icon(
                                                imageVector = Icons.Outlined.ContentCopy,
                                                contentDescription = "Copy text",
                                                tint = TextSecondary,
                                                modifier = Modifier.size(15.dp)
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                if (isLoading) {
                    item {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp)
                        ) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(18.dp),
                                color = PrimaryGreen,
                                strokeWidth = 2.dp
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "${selectedPersona.modelId} is preparing your ${selectedPersona.displayName} explanation...",
                                style = MaterialTheme.typography.bodySmall,
                                color = TextSecondary,
                                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                            )
                        }
                    }
                }
            }
        }
    }
}
