package com.example.ui.screens

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import androidx.compose.runtime.*
import java.util.Locale

/**
 * State for Voice Input in AI Tutor
 */
enum class VoiceInputState {
    IDLE,
    INITIALIZING,
    LISTENING,
    PROCESSING,
    ERROR
}

/**
 * Robust Speech-to-Text Manager utilizing Android SpeechRecognizer
 */
class VoiceSpeechManager(private val context: Context) {
    private var speechRecognizer: SpeechRecognizer? = null
    private val mainHandler = Handler(Looper.getMainLooper())

    var isAvailable: Boolean = SpeechRecognizer.isRecognitionAvailable(context)
        private set

    fun startListening(
        onStateChange: (VoiceInputState) -> Unit,
        onRmsChanged: (Float) -> Unit,
        onPartialResult: (String) -> Unit,
        onFinalResult: (String) -> Unit,
        onError: (String) -> Unit
    ) {
        mainHandler.post {
            try {
                destroy() // Clean up prior instance

                if (!SpeechRecognizer.isRecognitionAvailable(context)) {
                    onError("Speech recognition is not available on this device.")
                    onStateChange(VoiceInputState.ERROR)
                    return@post
                }

                speechRecognizer = SpeechRecognizer.createSpeechRecognizer(context).apply {
                    setRecognitionListener(object : RecognitionListener {
                        override fun onReadyForSpeech(params: Bundle?) {
                            onStateChange(VoiceInputState.LISTENING)
                        }

                        override fun onBeginningOfSpeech() {
                            onStateChange(VoiceInputState.LISTENING)
                        }

                        override fun onRmsChanged(rmsdB: Float) {
                            // rmsdB typically ranges from -2 to 10+ dB
                            val normalized = ((rmsdB + 2f) / 12f).coerceIn(0f, 1f)
                            onRmsChanged(normalized)
                        }

                        override fun onBufferReceived(buffer: ByteArray?) {}

                        override fun onEndOfSpeech() {
                            onStateChange(VoiceInputState.PROCESSING)
                        }

                        override fun onError(error: Int) {
                            val errorMessage = when (error) {
                                SpeechRecognizer.ERROR_AUDIO -> "Audio recording error. Please check your mic."
                                SpeechRecognizer.ERROR_CLIENT -> "Speech recognition client error."
                                SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS -> "Microphone permission required."
                                SpeechRecognizer.ERROR_NETWORK -> "Network connection error for speech."
                                SpeechRecognizer.ERROR_NETWORK_TIMEOUT -> "Network timed out."
                                SpeechRecognizer.ERROR_NO_MATCH -> "No speech detected. Please speak clearly into your mic."
                                SpeechRecognizer.ERROR_RECOGNIZER_BUSY -> "Speech recognizer is busy. Retrying..."
                                SpeechRecognizer.ERROR_SERVER -> "Speech server error."
                                SpeechRecognizer.ERROR_SPEECH_TIMEOUT -> "No speech detected. Please tap and speak."
                                else -> "Speech recognition error ($error)."
                            }
                            onError(errorMessage)
                            onStateChange(VoiceInputState.ERROR)
                        }

                        override fun onResults(results: Bundle?) {
                            val matches = results?.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                            val recognizedText = matches?.firstOrNull() ?: ""
                            if (recognizedText.isNotBlank()) {
                                onFinalResult(recognizedText)
                            } else {
                                onError("No speech recognized. Please try again.")
                            }
                            onStateChange(VoiceInputState.IDLE)
                        }

                        override fun onPartialResults(partialResults: Bundle?) {
                            val matches = partialResults?.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
                            val partialText = matches?.firstOrNull() ?: ""
                            if (partialText.isNotBlank()) {
                                onPartialResult(partialText)
                            }
                        }

                        override fun onEvent(eventType: Int, params: Bundle?) {}
                    })
                }

                val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
                    putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
                    putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en-US")
                    putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, "en-US")
                    putExtra(RecognizerIntent.EXTRA_ONLY_RETURN_LANGUAGE_PREFERENCE, "en-US")
                    putExtra(RecognizerIntent.EXTRA_PARTIAL_RESULTS, true)
                    putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 3)
                    putExtra(RecognizerIntent.EXTRA_PROMPT, "Ask Prepza AI Tutor a question...")
                }

                onStateChange(VoiceInputState.INITIALIZING)
                speechRecognizer?.startListening(intent)
            } catch (e: Exception) {
                onError("Failed to start voice input: ${e.localizedMessage}")
                onStateChange(VoiceInputState.ERROR)
            }
        }
    }

    fun stopListening() {
        mainHandler.post {
            try {
                speechRecognizer?.stopListening()
            } catch (e: Exception) {
                // Ignore
            }
        }
    }

    fun cancel() {
        mainHandler.post {
            try {
                speechRecognizer?.cancel()
            } catch (e: Exception) {
                // Ignore
            }
        }
    }

    fun destroy() {
        mainHandler.post {
            try {
                speechRecognizer?.destroy()
                speechRecognizer = null
            } catch (e: Exception) {
                // Ignore
            }
        }
    }
}

/**
 * TextToSpeech Helper to read AI Tutor explanations aloud
 */
class VoiceTtsManager(context: Context) {
    private var tts: TextToSpeech? = null
    var isInitialized by mutableStateOf(false)
        private set
    var currentlySpeakingId by mutableStateOf<String?>(null)
        private set

    init {
        tts = TextToSpeech(context.applicationContext) { status ->
            if (status == TextToSpeech.SUCCESS) {
                tts?.let { engine ->
                    val result = engine.setLanguage(Locale.US)
                    if (result != TextToSpeech.LANG_MISSING_DATA && result != TextToSpeech.LANG_NOT_SUPPORTED) {
                        engine.setSpeechRate(0.95f)
                        engine.setPitch(1.0f)
                        isInitialized = true
                    }
                }
            }
        }

        tts?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
            override fun onStart(utteranceId: String?) {
                currentlySpeakingId = utteranceId
            }

            override fun onDone(utteranceId: String?) {
                if (currentlySpeakingId == utteranceId) {
                    currentlySpeakingId = null
                }
            }

            override fun onError(utteranceId: String?) {
                if (currentlySpeakingId == utteranceId) {
                    currentlySpeakingId = null
                }
            }
        })
    }

    fun speak(text: String, utteranceId: String) {
        if (!isInitialized || tts == null) return
        stop()
        currentlySpeakingId = utteranceId
        // Clean markdown symbols for natural vocalization
        val cleanText = text
            .replace(Regex("[*#_`~]"), "")
            .replace(Regex("\\[(.*?)\\]\\(.*?\\)"), "$1")
            .take(1200) // Keep natural length
        tts?.speak(cleanText, TextToSpeech.QUEUE_FLUSH, null, utteranceId)
    }

    fun stop() {
        tts?.stop()
        currentlySpeakingId = null
    }

    fun shutdown() {
        tts?.stop()
        tts?.shutdown()
        tts = null
        currentlySpeakingId = null
    }
}
