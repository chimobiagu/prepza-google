package com.example.data.engine

import android.os.SystemClock
import android.util.Log

/**
 * Detailed latency and timestamp instrumentation for CBT session startup.
 * Logs actual measured values to identify real bottlenecks instead of guessing.
 */
data class CbtStartupMetrics(
    val sessionId: String,
    val mode: String,
    val tapTimestamp: Long = System.currentTimeMillis(),
    val tapElapsedRealtime: Long = SystemClock.elapsedRealtime(),

    var snapshotLockedTimestamp: Long = 0L,
    var navigationTimestamp: Long = 0L,
    var q1DataAvailableTimestamp: Long = 0L,
    var q1RenderedTimestamp: Long = 0L,
    var q1InteractiveTimestamp: Long = 0L,

    var questionSelectionTimeMs: Long = 0L,
    var deduplicationTimeMs: Long = 0L,
    var snapshotCreationTimeMs: Long = 0L,
    var roomQueryTimeMs: Long = 0L,
    var imageLoadingTimeMs: Long = 0L,
    var composeUiRenderingTimeMs: Long = 0L,
    var navigationTimeMs: Long = 0L
) {
    val totalWarmStartupTimeMs: Long
        get() = if (q1InteractiveTimestamp > 0) (q1InteractiveTimestamp - tapTimestamp).coerceAtLeast(0) else 0L

    val isWarmTargetMet: Boolean
        get() = totalWarmStartupTimeMs in 1..999

    val isColdTargetMet: Boolean
        get() = totalWarmStartupTimeMs in 1..2999
}

object CbtStartupLogger {

    private const val TAG = "PrepzaCbtStartup"
    private val startupHistory = mutableListOf<CbtStartupMetrics>()

    @Synchronized
    fun startSession(sessionId: String, mode: String): CbtStartupMetrics {
        val metrics = CbtStartupMetrics(
            sessionId = sessionId,
            mode = mode
        )
        Log.i(TAG, "[CBT_STARTUP] Session initiated | ID: $sessionId | Mode: $mode | Tap: ${metrics.tapTimestamp}")
        return metrics
    }

    @Synchronized
    fun recordSnapshotLocked(metrics: CbtStartupMetrics) {
        metrics.snapshotLockedTimestamp = System.currentTimeMillis()
        val duration = metrics.snapshotLockedTimestamp - metrics.tapTimestamp
        Log.i(TAG, "[CBT_STARTUP] Snapshot locked in ${duration}ms | IDs locked into immutable state.")
    }

    @Synchronized
    fun recordNavigation(metrics: CbtStartupMetrics) {
        metrics.navigationTimestamp = System.currentTimeMillis()
        val duration = metrics.navigationTimestamp - metrics.tapTimestamp
        Log.i(TAG, "[CBT_STARTUP] Navigation triggered in ${duration}ms from tap.")
    }

    @Synchronized
    fun recordQ1DataAvailable(metrics: CbtStartupMetrics) {
        metrics.q1DataAvailableTimestamp = System.currentTimeMillis()
        val duration = metrics.q1DataAvailableTimestamp - metrics.tapTimestamp
        Log.i(TAG, "[CBT_STARTUP] Question 1 entity available in ${duration}ms from tap.")
    }

    @Synchronized
    fun recordQ1Rendered(metrics: CbtStartupMetrics) {
        metrics.q1RenderedTimestamp = System.currentTimeMillis()
        val duration = metrics.q1RenderedTimestamp - metrics.tapTimestamp
        Log.i(TAG, "[CBT_STARTUP] Question 1 rendered on screen in ${duration}ms from tap.")
    }

    @Synchronized
    fun recordQ1Interactive(metrics: CbtStartupMetrics) {
        metrics.q1InteractiveTimestamp = System.currentTimeMillis()
        metrics.composeUiRenderingTimeMs = metrics.q1InteractiveTimestamp - metrics.q1DataAvailableTimestamp
        val totalMs = metrics.totalWarmStartupTimeMs

        startupHistory.add(metrics)

        Log.i(TAG, "==================================================")
        Log.i(TAG, "CBT STARTUP BENCHMARK AUDIT REPORT")
        Log.i(TAG, "Session ID: ${metrics.sessionId} | Mode: ${metrics.mode}")
        Log.i(TAG, "Tap -> Snapshot Locked: ${metrics.snapshotLockedTimestamp - metrics.tapTimestamp}ms")
        Log.i(TAG, "Question Selection Time: ${metrics.questionSelectionTimeMs}ms")
        Log.i(TAG, "Deduplication Time: ${metrics.deduplicationTimeMs}ms")
        Log.i(TAG, "Snapshot Creation Time: ${metrics.snapshotCreationTimeMs}ms")
        Log.i(TAG, "Room Query Time: ${metrics.roomQueryTimeMs}ms")
        Log.i(TAG, "Tap -> Navigation: ${metrics.navigationTimestamp - metrics.tapTimestamp}ms")
        Log.i(TAG, "Tap -> Q1 Data Available: ${metrics.q1DataAvailableTimestamp - metrics.tapTimestamp}ms")
        Log.i(TAG, "Q1 Available -> Q1 Interactive: ${metrics.composeUiRenderingTimeMs}ms")
        Log.i(TAG, "TOTAL STARTUP TO Q1 INTERACTIVE: ${totalMs}ms")
        Log.i(TAG, "Target (<1000ms warm / <3000ms cold): ${if (totalMs < 1000) "MET (<1s)" else if (totalMs < 3000) "MET (<3s)" else "EXCEEDED"}")
        Log.i(TAG, "==================================================")
    }

    @Synchronized
    fun getLastMetrics(): CbtStartupMetrics? = startupHistory.lastOrNull()

    @Synchronized
    fun getAllMetrics(): List<CbtStartupMetrics> = startupHistory.toList()
}
