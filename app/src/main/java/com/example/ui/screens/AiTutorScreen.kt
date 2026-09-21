package com.example.ui.screens

import android.Manifest
import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.speech.RecognizerIntent
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.core.content.ContextCompat
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
    val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current

    // Voice Speech State
    var showVoiceDialog by remember { mutableStateOf(false) }
    var voiceSpokenText by remember { mutableStateOf("") }
    var voiceState by remember { mutableStateOf(VoiceInputState.IDLE) }
    var voiceRms by remember { mutableFloatStateOf(0f) }
    var voiceErrorMessage by remember { mutableStateOf<String?>(null) }
    var autoReadAloud by remember { mutableStateOf(false) }

    // Managers
    val voiceSpeechManager = remember { VoiceSpeechManager(context) }
    val voiceTtsManager = remember { VoiceTtsManager(context) }

    // Cleanup resources on disposal
    DisposableEffect(Unit) {
        onDispose {
            voiceSpeechManager.destroy()
            voiceTtsManager.shutdown()
        }
    }

    // Auto-read aloud incoming AI message if enabled
    LaunchedEffect(messages.size) {
        if (messages.isNotEmpty()) {
            listState.animateScrollToItem(messages.size - 1)
            val lastMsg = messages.last()
            if (autoReadAloud && lastMsg.sender != "user" && !isLoading) {
                voiceTtsManager.speak(lastMsg.text, lastMsg.timestamp.toString())
            }
        }
    }

    // Speech Intent Fallback Launcher
    val speechIntentLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK && result.data != null) {
            val matches = result.data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
            val spoken = matches?.firstOrNull() ?: ""
            if (spoken.isNotBlank()) {
                voiceSpokenText = spoken
                voiceState = VoiceInputState.IDLE
                showVoiceDialog = true
            }
        }
    }

    // Helper to trigger speech listening
    fun startListeningSession() {
        voiceErrorMessage = null
        voiceSpokenText = ""
        voiceRms = 0f
        voiceSpeechManager.startListening(
            onStateChange = { newState ->
                voiceState = newState
            },
            onRmsChanged = { rms ->
                voiceRms = rms
            },
            onPartialResult = { partial ->
                voiceSpokenText = partial
            },
            onFinalResult = { finalResult ->
                voiceSpokenText = finalResult
                voiceState = VoiceInputState.IDLE
            },
            onError = { error ->
                voiceErrorMessage = error
                voiceState = VoiceInputState.ERROR
            }
        )
    }

    // Permission Launcher for RECORD_AUDIO
    val micPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            showVoiceDialog = true
            startListeningSession()
        } else {
            Toast.makeText(
                context,
                "Microphone permission is required to ask questions verbally.",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    fun requestVoiceInput() {
        val hasPermission = ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.RECORD_AUDIO
        ) == PackageManager.PERMISSION_GRANTED

        if (hasPermission) {
            showVoiceDialog = true
            startListeningSession()
        } else {
            micPermissionLauncher.launch(Manifest.permission.RECORD_AUDIO)
        }
    }

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
                                            text = selectedPersona.engineName,
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
                    // Voice auto-read aloud toggle
                    IconButton(
                        onClick = {
                            autoReadAloud = !autoReadAloud
                            if (!autoReadAloud) {
                                voiceTtsManager.stop()
                            }
                            Toast.makeText(
                                context,
                                if (autoReadAloud) "Voice Read Aloud: Enabled" else "Voice Read Aloud: Disabled",
                                Toast.LENGTH_SHORT
                            ).show()
                        },
                        modifier = Modifier.testTag("ai_tutor_tts_toggle_btn")
                    ) {
                        Icon(
                            imageVector = if (autoReadAloud) Icons.Default.VolumeUp else Icons.Default.VolumeOff,
                            contentDescription = "Toggle Read Aloud",
                            tint = if (autoReadAloud) PrimaryGreen else TextSecondary
                        )
                    }

                    IconButton(
                        onClick = {
                            voiceTtsManager.stop()
                            onClearChat(selectedPersona)
                        },
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
                                border = BorderStroke(1.dp, BorderSubtle),
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

                    // Input Bar with Text & Voice Microphone Button
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
                                        TutorPersona.STEM_SPECIALIST -> "Ask a derivation, formula, proof or speak..."
                                        TutorPersona.RAPID_SPRINT -> "Ask instant rule, shortcut or speak..."
                                        TutorPersona.LITERATURE_ANALYST -> "Ask Life Changer, themes or speak..."
                                        else -> "Ask a question, formula or tap mic..."
                                    },
                                    fontSize = 13.sp
                                )
                            },
                            modifier = Modifier
                                .weight(1f)
                                .testTag("ai_tutor_input_field"),
                            shape = RoundedCornerShape(22.dp),
                            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Send),
                            keyboardActions = KeyboardActions(
                                onSend = {
                                    if (inputText.isNotBlank() && !isLoading) {
                                        focusManager.clearFocus()
                                        keyboardController?.hide()
                                        onSendMessage(inputText.trim(), selectedPersona)
                                        inputText = ""
                                    }
                                }
                            ),
                            maxLines = 4,
                            colors = OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = PrimaryGreen,
                                unfocusedBorderColor = BorderSubtle
                            )
                        )

                        Spacer(modifier = Modifier.width(6.dp))

                        // Voice Microphone Button
                        IconButton(
                            onClick = {
                                focusManager.clearFocus()
                                keyboardController?.hide()
                                requestVoiceInput()
                            },
                            enabled = !isLoading,
                            modifier = Modifier
                                .size(46.dp)
                                .background(
                                    if (showVoiceDialog && voiceState == VoiceInputState.LISTENING) SoftEmeraldBg else AppBackground,
                                    CircleShape
                                )
                                .border(
                                    1.dp,
                                    if (showVoiceDialog && voiceState == VoiceInputState.LISTENING) PrimaryGreen else BorderSubtle,
                                    CircleShape
                                )
                                .testTag("ai_tutor_mic_btn")
                        ) {
                            Icon(
                                imageVector = if (showVoiceDialog && voiceState == VoiceInputState.LISTENING) Icons.Default.Mic else Icons.Default.MicNone,
                                contentDescription = "Voice Input - Ask Question Verbally",
                                tint = if (showVoiceDialog && voiceState == VoiceInputState.LISTENING) PrimaryGreen else TextPrimary,
                                modifier = Modifier.size(22.dp)
                            )
                        }

                        Spacer(modifier = Modifier.width(6.dp))

                        // Send Button
                        IconButton(
                            onClick = {
                                if (inputText.isNotBlank() && !isLoading) {
                                    focusManager.clearFocus()
                                    keyboardController?.hide()
                                    onSendMessage(inputText.trim(), selectedPersona)
                                    inputText = ""
                                }
                            },
                            enabled = inputText.isNotBlank() && !isLoading,
                            modifier = Modifier
                                .size(46.dp)
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
                        border = BorderStroke(1.dp, chipBorderColor),
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
                        text = "Role: ${selectedPersona.tagline} • Powered by ${selectedPersona.engineName}",
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
                    border = BorderStroke(1.dp, PrimaryGreenLight.copy(alpha = 0.4f)),
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
                    val isCurrentlySpeaking = voiceTtsManager.currentlySpeakingId == msg.timestamp.toString()

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
                            color = if (isUser) PrimaryGreen else SurfaceWhite,
                            border = if (isUser) null else BorderStroke(1.dp, if (isCurrentlySpeaking) PrimaryGreen else BorderSubtle),
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
                                        // Read Aloud / TTS Button
                                        IconButton(
                                            onClick = {
                                                if (isCurrentlySpeaking) {
                                                    voiceTtsManager.stop()
                                                } else {
                                                    voiceTtsManager.speak(msg.text, msg.timestamp.toString())
                                                }
                                            },
                                            modifier = Modifier
                                                .size(28.dp)
                                                .testTag("ai_tutor_tts_btn_${msg.timestamp}")
                                        ) {
                                            Icon(
                                                imageVector = if (isCurrentlySpeaking) Icons.Default.Stop else Icons.Default.VolumeUp,
                                                contentDescription = if (isCurrentlySpeaking) "Stop reading" else "Read explanation aloud",
                                                tint = if (isCurrentlySpeaking) AmberAccent else TextSecondary,
                                                modifier = Modifier.size(16.dp)
                                            )
                                        }

                                        Spacer(modifier = Modifier.width(4.dp))

                                        // Copy to clipboard
                                        IconButton(
                                            onClick = {
                                                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                                                val clip = ClipData.newPlainText("Prepza AI Note", msg.text)
                                                clipboard.setPrimaryClip(clip)
                                                Toast.makeText(context, "Copied explanation to clipboard", Toast.LENGTH_SHORT).show()
                                            },
                                            modifier = Modifier.size(28.dp)
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
                                text = "${selectedPersona.engineName} is preparing your ${selectedPersona.displayName} explanation...",
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

    // Voice Input Bottom Sheet / Modal Dialog
    if (showVoiceDialog) {
        AiTutorVoiceDialog(
            state = voiceState,
            spokenText = voiceSpokenText,
            rms = voiceRms,
            errorMessage = voiceErrorMessage,
            selectedPersona = selectedPersona,
            quickPrompts = quickPrompts,
            onStartListening = {
                startListeningSession()
            },
            onStopListening = {
                voiceSpeechManager.stopListening()
                voiceState = VoiceInputState.IDLE
            },
            onSendQuestion = { question ->
                showVoiceDialog = false
                voiceSpeechManager.cancel()
                if (question.isNotBlank()) {
                    onSendMessage(question.trim(), selectedPersona)
                }
            },
            onInsertInTextField = { question ->
                showVoiceDialog = false
                voiceSpeechManager.cancel()
                inputText = question.trim()
            },
            onFallbackToSystemIntent = {
                voiceSpeechManager.cancel()
                try {
                    val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
                        putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
                        putExtra(RecognizerIntent.EXTRA_PROMPT, "Ask Prepza AI Tutor a question...")
                    }
                    speechIntentLauncher.launch(intent)
                } catch (e: Exception) {
                    Toast.makeText(context, "Voice recognition not available: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            },
            onDismiss = {
                voiceSpeechManager.cancel()
                showVoiceDialog = false
            }
        )
    }
}

/**
 * Dedicated Interactive Voice Dialog with animated sound waves, live transcription & instant send
 */
@Composable
fun AiTutorVoiceDialog(
    state: VoiceInputState,
    spokenText: String,
    rms: Float,
    errorMessage: String?,
    selectedPersona: TutorPersona,
    quickPrompts: List<String>,
    onStartListening: () -> Unit,
    onStopListening: () -> Unit,
    onSendQuestion: (String) -> Unit,
    onInsertInTextField: (String) -> Unit,
    onFallbackToSystemIntent: () -> Unit,
    onDismiss: () -> Unit
) {
    val isListening = state == VoiceInputState.LISTENING || state == VoiceInputState.INITIALIZING
    val isProcessing = state == VoiceInputState.PROCESSING

    // Animated ripple wave scale based on rms level
    val infiniteTransition = rememberInfiniteTransition(label = "voice_wave")
    val pulseScale by infiniteTransition.animateFloat(
        initialValue = 1.0f,
        targetValue = 1.25f,
        animationSpec = infiniteRepeatable(
            animation = tween(900, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulse_scale"
    )

    val animatedWaveScale by animateFloatAsState(
        targetValue = if (isListening) (1f + (rms * 0.5f)).coerceIn(1f, 1.6f) else 1f,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy),
        label = "rms_wave"
    )

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Surface(
            shape = RoundedCornerShape(28.dp),
            color = SurfaceWhite,
            shadowElevation = 16.dp,
            modifier = Modifier
                .fillMaxWidth(0.92f)
                .padding(vertical = 24.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Header Row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            shape = CircleShape,
                            color = SoftEmeraldBg,
                            modifier = Modifier.size(34.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.Mic,
                                    contentDescription = null,
                                    tint = PrimaryGreen,
                                    modifier = Modifier.size(18.dp)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Column {
                            Text(
                                text = "Ask AI Tutor by Voice",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = TextPrimary
                            )
                            Text(
                                text = "Speak your UTME question or formula",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary
                            )
                        }
                    }

                    IconButton(onClick = onDismiss, modifier = Modifier.size(32.dp)) {
                        Icon(Icons.Default.Close, contentDescription = "Close", tint = TextMuted)
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                // Animated Concentric Microphone Target Area
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(140.dp)
                        .padding(8.dp)
                ) {
                    // Outer Ripple Wave Ring
                    if (isListening) {
                        Surface(
                            shape = CircleShape,
                            color = PrimaryGreen.copy(alpha = 0.12f),
                            modifier = Modifier
                                .fillMaxSize()
                                .scale(pulseScale * animatedWaveScale)
                        ) {}

                        // Middle Wave Ring
                        Surface(
                            shape = CircleShape,
                            color = PrimaryGreen.copy(alpha = 0.22f),
                            modifier = Modifier
                                .size(105.dp)
                                .scale(animatedWaveScale)
                        ) {}
                    }

                    // Central Active Mic Button
                    Surface(
                        shape = CircleShape,
                        color = when {
                            isListening -> PrimaryGreen
                            isProcessing -> AmberAccent
                            state == VoiceInputState.ERROR -> Color(0xFFEF4444)
                            else -> PrimaryGreen
                        },
                        shadowElevation = 6.dp,
                        modifier = Modifier
                            .size(76.dp)
                            .clip(CircleShape)
                            .clickable {
                                if (isListening) {
                                    onStopListening()
                                } else {
                                    onStartListening()
                                }
                            }
                            .testTag("ai_tutor_voice_dialog_mic_target")
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = when {
                                    isListening -> Icons.Default.Mic
                                    isProcessing -> Icons.Default.HourglassTop
                                    state == VoiceInputState.ERROR -> Icons.Default.MicOff
                                    else -> Icons.Default.Mic
                                },
                                contentDescription = if (isListening) "Tap to pause" else "Tap to speak",
                                tint = Color.White,
                                modifier = Modifier.size(34.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Status Indicator
                Text(
                    text = when (state) {
                        VoiceInputState.INITIALIZING -> "Preparing microphone..."
                        VoiceInputState.LISTENING -> "🎙️ Listening... speak clearly"
                        VoiceInputState.PROCESSING -> "⚡ Analyzing speech..."
                        VoiceInputState.ERROR -> errorMessage ?: "Could not detect voice"
                        VoiceInputState.IDLE -> if (spokenText.isNotBlank()) "✅ Speech captured" else "Tap microphone to speak"
                    },
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = when (state) {
                        VoiceInputState.LISTENING -> PrimaryGreen
                        VoiceInputState.PROCESSING -> AmberAccent
                        VoiceInputState.ERROR -> Color(0xFFEF4444)
                        else -> TextPrimary
                    },
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Spoken Transcription Card / Preview Box
                Surface(
                    shape = RoundedCornerShape(16.dp),
                    color = AppBackground,
                    border = BorderStroke(1.dp, if (isListening) PrimaryGreen.copy(alpha = 0.5f) else BorderSubtle),
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 90.dp, max = 150.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        if (spokenText.isNotBlank()) {
                            Text(
                                text = "“$spokenText”",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Medium,
                                color = TextPrimary,
                                textAlign = TextAlign.Center,
                                lineHeight = 22.sp
                            )
                        } else {
                            Text(
                                text = if (isListening) "Listening for your question... say e.g. 'Explain Newton's second law of motion'" else "Spoken words will appear here in real time.",
                                style = MaterialTheme.typography.bodyMedium,
                                color = TextMuted,
                                textAlign = TextAlign.Center,
                                fontSize = 13.sp
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Action Buttons when text is captured
                if (spokenText.isNotBlank()) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Button(
                            onClick = { onSendQuestion(spokenText) },
                            colors = ButtonDefaults.buttonColors(containerColor = PrimaryGreen),
                            shape = RoundedCornerShape(14.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                                .testTag("ai_tutor_voice_ask_btn")
                        ) {
                            Icon(Icons.AutoMirrored.Filled.Send, contentDescription = null, modifier = Modifier.size(18.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Ask AI Tutor Now", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            OutlinedButton(
                                onClick = { onInsertInTextField(spokenText) },
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier
                                    .weight(1f)
                                    .height(42.dp)
                            ) {
                                Icon(Icons.Default.Edit, contentDescription = null, modifier = Modifier.size(14.dp))
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("Edit in Box", fontSize = 12.sp)
                            }

                            OutlinedButton(
                                onClick = onStartListening,
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier
                                    .weight(1f)
                                    .height(42.dp)
                            ) {
                                Icon(Icons.Default.Refresh, contentDescription = null, modifier = Modifier.size(14.dp))
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("Retry", fontSize = 12.sp)
                            }
                        }
                    }
                } else {
                    // System intent fallback & Quick prompt chips
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Try saying:",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary,
                                fontWeight = FontWeight.SemiBold
                            )

                            TextButton(
                                onClick = onFallbackToSystemIntent,
                                contentPadding = PaddingValues(horizontal = 6.dp, vertical = 2.dp)
                            ) {
                                Text("Google Voice Dialog", fontSize = 11.sp, color = PrimaryGreen)
                            }
                        }

                        Spacer(modifier = Modifier.height(4.dp))

                        // Spoken suggestions chips
                        Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {
                            quickPrompts.take(3).forEach { prompt ->
                                Surface(
                                    shape = RoundedCornerShape(10.dp),
                                    color = AppBackground,
                                    border = BorderStroke(1.dp, BorderSubtle),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(10.dp))
                                        .clickable {
                                            onSendQuestion(prompt)
                                        }
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.RecordVoiceOver, contentDescription = null, tint = PrimaryGreen, modifier = Modifier.size(14.dp))
                                        Spacer(modifier = Modifier.width(8.dp))
                                        Text(prompt, style = MaterialTheme.typography.bodySmall, color = TextPrimary, fontSize = 12.sp)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
