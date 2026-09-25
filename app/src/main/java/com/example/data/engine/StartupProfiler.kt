package com.example.data.engine

import android.util.Log
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

/**
 * Granular checkpoint identifier for the CBT startup pipeline.
 */
enum class StartupCheckpoint(val displayName: String, val description: String) {
    TAP("Tap", "User tapped Start CBT button in UI"),
    VIEWMODEL_INIT("ViewModel Init", "ViewModel received intent and prepared state flows"),
    DB_QUERY("DB Query", "Room Database query for question pools and exposure history"),
    SNAPSHOT_LOCK("Snapshot Lock", "Question bank selected and locked into immutable snapshot"),
    Q1_RENDER("Q1 Render", "Question 1 rendered on screen and UI is interactive")
}

/**
 * High-precision timestamped measurement for a specific startup checkpoint.
 */
data class CheckpointMeasurement(
    val checkpoint: StartupCheckpoint,
    val timestampNanos: Long,
    val elapsedFromTapMs: Double,
    val intervalDeltaMs: Double,
    val details: String = ""
)

/**
 * Complete startup latency profile for a CBT session.
 */
data class CbtStartupProfile(
    val sessionId: String,
    val mode: String,
    val startWallClockMs: Long = System.currentTimeMillis(),
    val tapTimestampNanos: Long = 0L,
    val measurements: List<CheckpointMeasurement> = emptyList(),
    val isComplete: Boolean = false,
    val totalElapsedMs: Double = 0.0,
    val isWarmTargetMet: Boolean = true, // < 1000ms
    val isColdTargetMet: Boolean = true, // < 3000ms
    val detailsNote: String = ""
) {
    fun getCheckpoint(type: StartupCheckpoint): CheckpointMeasurement? =
        measurements.find { it.checkpoint == type }

    val formattedTotalMs: String
        get() = String.format("%.2f ms", totalElapsedMs)
}

/**
 * High-precision startup profiler for CBT exam initialization.
 * Uses System.nanoTime() to record monotonic, sub-millisecond checkpoints:
 * 1. TAP -> User interaction initiates CBT
 * 2. VIEWMODEL_INIT -> ViewModel handles request and starts coroutine
 * 3. DB_QUERY -> Room DB questions loaded / cached
 * 4. SNAPSHOT_LOCK -> Question selection finalized and snapshot locked
 * 5. Q1_RENDER -> Question 1 drawn and interactive in Jetpack Compose
 */
class StartupProfiler private constructor() {

    companion object {
        private const val TAG = "StartupProfiler"
        private const val NANOS_TO_MILLIS = 1_000_000.0

        val instance: StartupProfiler by lazy { StartupProfiler() }

        // Convenience static delegations
        fun recordTap(mode: String = "CBT Mock", customSessionId: String? = null, tapNanos: Long = System.nanoTime()): String =
            instance.startSession(mode, customSessionId, tapNanos)

        fun recordViewModelInit(sessionId: String? = null, details: String = "") =
            instance.checkpoint(StartupCheckpoint.VIEWMODEL_INIT, sessionId, details)

        fun recordDbQuery(sessionId: String? = null, durationNanos: Long? = null, details: String = "") =
            instance.checkpoint(StartupCheckpoint.DB_QUERY, sessionId, details, durationNanos)

        fun recordSnapshotLock(sessionId: String? = null, questionCount: Int = 0, details: String = "") =
            instance.checkpoint(
                StartupCheckpoint.SNAPSHOT_LOCK,
                sessionId,
                if (details.isBlank() && questionCount > 0) "$questionCount questions locked" else details
            )

        fun recordQ1Render(sessionId: String? = null, details: String = ""): CbtStartupProfile? =
            instance.recordQ1RenderInternal(sessionId, details)

        fun getLatestProfile(): CbtStartupProfile? = instance.latestProfile.value
        val latestProfileFlow: StateFlow<CbtStartupProfile?> get() = instance.latestProfile
        val profileHistoryFlow: StateFlow<List<CbtStartupProfile>> get() = instance.profileHistory
    }

    private val _latestProfile = MutableStateFlow<CbtStartupProfile?>(null)
    val latestProfile: StateFlow<CbtStartupProfile?> = _latestProfile.asStateFlow()

    private val _profileHistory = MutableStateFlow<List<CbtStartupProfile>>(emptyList())
    val profileHistory: StateFlow<List<CbtStartupProfile>> = _profileHistory.asStateFlow()

    private val inFlightSessions = ConcurrentHashMap<String, InFlightProfile>()
    @Volatile
    private var activeSessionId: String? = null

    private data class InFlightProfile(
        val sessionId: String,
        val mode: String,
        val tapNanos: Long,
        val wallClockMs: Long,
        val measurements: MutableList<CheckpointMeasurement> = mutableListOf(),
        var lastNanos: Long = tapNanos
    )

    /**
     * Initializes profiling for a CBT session at the exact moment of the user tap.
     */
    @Synchronized
    fun startSession(mode: String, customSessionId: String? = null, tapNanos: Long = System.nanoTime()): String {
        val sessionId = customSessionId ?: "cbt_${UUID.randomUUID().toString().take(8)}"
        activeSessionId = sessionId

        val inFlight = InFlightProfile(
            sessionId = sessionId,
            mode = mode,
            tapNanos = tapNanos,
            wallClockMs = System.currentTimeMillis()
        )

        // Record the initial TAP checkpoint
        val tapMeasurement = CheckpointMeasurement(
            checkpoint = StartupCheckpoint.TAP,
            timestampNanos = tapNanos,
            elapsedFromTapMs = 0.0,
            intervalDeltaMs = 0.0,
            details = "Tap event registered ($mode)"
        )
        inFlight.measurements.add(tapMeasurement)
        inFlightSessions[sessionId] = inFlight

        val initialProfile = CbtStartupProfile(
            sessionId = sessionId,
            mode = mode,
            startWallClockMs = inFlight.wallClockMs,
            tapTimestampNanos = tapNanos,
            measurements = listOf(tapMeasurement),
            isComplete = false,
            totalElapsedMs = 0.0
        )
        _latestProfile.value = initialProfile

        Log.i(TAG, "─────────────────────────────────────────────────────────────")
        Log.i(TAG, "[StartupProfiler] ⏱️ STARTUP TRACKING INITIALIZED")
        Log.i(TAG, "Session ID: $sessionId | Mode: $mode | Tap Nanos: $tapNanos")
        Log.i(TAG, "Checkpoint 1/5: [TAP] -> 0.00 ms")
        Log.i(TAG, "─────────────────────────────────────────────────────────────")

        return sessionId
    }

    /**
     * Records a generic or specific checkpoint during the CBT startup sequence.
     */
    @Synchronized
    fun checkpoint(
        checkpoint: StartupCheckpoint,
        sessionId: String? = null,
        details: String = "",
        explicitDurationNanos: Long? = null
    ) {
        val targetId = sessionId ?: activeSessionId ?: inFlightSessions.keys.lastOrNull() ?: return
        val inFlight = inFlightSessions[targetId] ?: return

        // Prevent duplicate checkpoints of same type
        if (inFlight.measurements.any { it.checkpoint == checkpoint }) {
            return
        }

        val currentNanos = System.nanoTime()
        val elapsedFromTapMs = (currentNanos - inFlight.tapNanos) / NANOS_TO_MILLIS
        val intervalDeltaMs = if (explicitDurationNanos != null) {
            explicitDurationNanos / NANOS_TO_MILLIS
        } else {
            (currentNanos - inFlight.lastNanos) / NANOS_TO_MILLIS
        }

        inFlight.lastNanos = currentNanos

        val measurement = CheckpointMeasurement(
            checkpoint = checkpoint,
            timestampNanos = currentNanos,
            elapsedFromTapMs = elapsedFromTapMs,
            intervalDeltaMs = intervalDeltaMs,
            details = details
        )
        inFlight.measurements.add(measurement)

        val updatedProfile = CbtStartupProfile(
            sessionId = targetId,
            mode = inFlight.mode,
            startWallClockMs = inFlight.wallClockMs,
            tapTimestampNanos = inFlight.tapNanos,
            measurements = inFlight.measurements.toList(),
            isComplete = false,
            totalElapsedMs = elapsedFromTapMs
        )
        _latestProfile.value = updatedProfile

        Log.i(
            TAG,
            String.format(
                "[StartupProfiler] [%s] -> +%.2f ms (Total: %.2f ms)%s",
                checkpoint.displayName,
                intervalDeltaMs,
                elapsedFromTapMs,
                if (details.isNotBlank()) " | $details" else ""
            )
        )
    }

    /**
     * Finalizes profiling when Question 1 is rendered and interactive on screen.
     */
    @Synchronized
    private fun recordQ1RenderInternal(sessionId: String? = null, details: String = ""): CbtStartupProfile? {
        val targetId = sessionId ?: activeSessionId ?: inFlightSessions.keys.lastOrNull() ?: return null
        val inFlight = inFlightSessions[targetId] ?: return null

        // If already completed, return existing
        if (inFlight.measurements.any { it.checkpoint == StartupCheckpoint.Q1_RENDER }) {
            return _latestProfile.value
        }

        val currentNanos = System.nanoTime()
        val elapsedFromTapMs = (currentNanos - inFlight.tapNanos) / NANOS_TO_MILLIS
        val intervalDeltaMs = (currentNanos - inFlight.lastNanos) / NANOS_TO_MILLIS

        val q1Measurement = CheckpointMeasurement(
            checkpoint = StartupCheckpoint.Q1_RENDER,
            timestampNanos = currentNanos,
            elapsedFromTapMs = elapsedFromTapMs,
            intervalDeltaMs = intervalDeltaMs,
            details = if (details.isBlank()) "Q1 interactive and drawn" else details
        )
        inFlight.measurements.add(q1Measurement)

        val warmMet = elapsedFromTapMs < 1000.0
        val coldMet = elapsedFromTapMs < 3000.0

        val completedProfile = CbtStartupProfile(
            sessionId = targetId,
            mode = inFlight.mode,
            startWallClockMs = inFlight.wallClockMs,
            tapTimestampNanos = inFlight.tapNanos,
            measurements = inFlight.measurements.toList(),
            isComplete = true,
            totalElapsedMs = elapsedFromTapMs,
            isWarmTargetMet = warmMet,
            isColdTargetMet = coldMet,
            detailsNote = "All 5 checkpoints recorded with nanoTime accuracy"
        )

        _latestProfile.value = completedProfile

        // Add to history (keep last 20)
        val currentHistory = _profileHistory.value.toMutableList()
        currentHistory.add(0, completedProfile)
        if (currentHistory.size > 20) {
            _profileHistory.value = currentHistory.take(20)
        } else {
            _profileHistory.value = currentHistory
        }

        inFlightSessions.remove(targetId)

        logBenchmarkReport(completedProfile)
        return completedProfile
    }

    /**
     * Prints a beautiful, formatted ASCII report to Logcat.
     */
    private fun logBenchmarkReport(profile: CbtStartupProfile) {
        val sb = StringBuilder()
        sb.appendLine("╔═════════════════════════════════════════════════════════════════════════╗")
        sb.appendLine("║               PREPZA CBT STARTUP PROFILER BENCHMARK REPORT              ║")
        sb.appendLine("╠═════════════════════════════════════════════════════════════════════════╣")
        sb.appendLine(String.format("║  Session ID   : %-55s ║", profile.sessionId))
        sb.appendLine(String.format("║  Exam Mode    : %-55s ║", profile.mode))
        sb.appendLine(String.format("║  Total Latency: %-55s ║", String.format("%.3f ms (%.2f seconds)", profile.totalElapsedMs, profile.totalElapsedMs / 1000.0)))
        sb.appendLine(String.format("║  Warm Target  : %-55s ║", if (profile.isWarmTargetMet) "PASSED (< 1000ms)" else "EXCEEDED (> 1000ms)"))
        sb.appendLine(String.format("║  Cold Target  : %-55s ║", if (profile.isColdTargetMet) "PASSED (< 3000ms)" else "EXCEEDED (> 3000ms)"))
        sb.appendLine("╠═════════════════════════════════════════════════════════════════════════╣")
        sb.appendLine("║  CHECKPOINT         │ DELTA (ms)    │ FROM TAP (ms) │ DETAILS           ║")
        sb.appendLine("╟─────────────────────┼───────────────┼───────────────┼───────────────────╢")

        for (m in profile.measurements) {
            val name = m.checkpoint.displayName
            val deltaStr = String.format("+%.3f ms", m.intervalDeltaMs)
            val elapsedStr = String.format("%.3f ms", m.elapsedFromTapMs)
            val detailStr = m.details.take(17)
            sb.appendLine(String.format("║  %-18s │ %-13s │ %-13s │ %-17s ║", name, deltaStr, elapsedStr, detailStr))
        }

        sb.appendLine("╚═════════════════════════════════════════════════════════════════════════╝")
        Log.i(TAG, "\n" + sb.toString())
    }

    /**
     * Resets profiling state.
     */
    @Synchronized
    fun reset() {
        inFlightSessions.clear()
        activeSessionId = null
    }

    /**
     * Formats exportable text string for clipboard or debug UI sharing.
     */
    fun formatExportText(profile: CbtStartupProfile): String {
        val sb = StringBuilder()
        sb.appendLine("Prepza CBT Startup Profiler")
        sb.appendLine("Session: ${profile.sessionId}")
        sb.appendLine("Mode: ${profile.mode}")
        sb.appendLine("Total Latency: ${String.format("%.2f ms", profile.totalElapsedMs)}")
        sb.appendLine("Warm Target Met: ${profile.isWarmTargetMet}")
        sb.appendLine("Checkpoints:")
        for (m in profile.measurements) {
            sb.appendLine("- ${m.checkpoint.displayName}: ${String.format("%.2f ms", m.elapsedFromTapMs)} (+${String.format("%.2f ms", m.intervalDeltaMs)}) ${m.details}")
        }
        return sb.toString()
    }
}
