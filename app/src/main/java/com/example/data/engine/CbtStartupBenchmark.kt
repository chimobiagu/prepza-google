package com.example.data.engine

import android.util.Log

/**
 * Real startup instrumentation metrics tracking exact timestamps and execution latency.
 */
data class CbtStartupMetrics(
    val tapTimestamp: Long = 0,
    val snapshotLockedTimestamp: Long = 0,
    val navigationTimestamp: Long = 0,
    val q1DataAvailableTimestamp: Long = 0,
    val q1RenderedTimestamp: Long = 0,
    val q1InteractiveTimestamp: Long = 0,
    // Step breakdowns (ms)
    val questionSelectionTimeMs: Long = 0,
    val deduplicationTimeMs: Long = 0,
    val snapshotCreationTimeMs: Long = 0,
    val roomQueryTimeMs: Long = 0,
    val imageLoadingTimeMs: Long = 0,
    val composeUiRenderingTimeMs: Long = 0,
    val navigationTimeMs: Long = 0,
    val totalStartupToInteractiveMs: Long = 0
)

/**
 * Instrumentation logger and recorder for Prepza CBT startup performance.
 */
object CbtStartupBenchmark {
    private const val TAG = "CbtBenchmark"

    @Volatile
    var latestMetrics: CbtStartupMetrics = CbtStartupMetrics()
        private set

    fun recordMetrics(metrics: CbtStartupMetrics) {
        latestMetrics = metrics
        try {
            Log.i(TAG, """
                ==================================================
                PREPZA CBT STARTUP INSTRUMENTATION AUDIT
                ==================================================
                Tap Timestamp:                  ${metrics.tapTimestamp}
                Snapshot Locked Timestamp:       ${metrics.snapshotLockedTimestamp}
                Navigation Timestamp:           ${metrics.navigationTimestamp}
                Q1 Data Available:              ${metrics.q1DataAvailableTimestamp}
                Q1 Rendered:                    ${metrics.q1RenderedTimestamp}
                Q1 Interactive:                 ${metrics.q1InteractiveTimestamp}
                --------------------------------------------------
                Question Selection Time:        ${metrics.questionSelectionTimeMs} ms
                Deduplication Time:             ${metrics.deduplicationTimeMs} ms
                Snapshot Creation Time:         ${metrics.snapshotCreationTimeMs} ms
                Room Query Time:                ${metrics.roomQueryTimeMs} ms
                Compose/UI Rendering Time:      ${metrics.composeUiRenderingTimeMs} ms
                Navigation Latency:             ${metrics.navigationTimeMs} ms
                Image Loading / Pre-decode:     ${metrics.imageLoadingTimeMs} ms
                ==================================================
                TOTAL TIME TO Q1 INTERACTIVE:   ${metrics.totalStartupToInteractiveMs} ms
                Target: Warm < 1000ms | Cold < 3000ms -> ${
                    if (metrics.totalStartupToInteractiveMs < 1000) "EXCELLENT (WARM TARGET MET)"
                    else if (metrics.totalStartupToInteractiveMs < 3000) "GOOD (COLD TARGET MET)"
                    else "NEEDS OPTIMIZATION"
                }
                ==================================================
            """.trimIndent())
        } catch (_: Exception) {
            // JVM Unit test environments where android.util.Log may be stubbed
            println("[CbtBenchmark] Total Time to Q1 Interactive: ${metrics.totalStartupToInteractiveMs} ms (QSelection: ${metrics.questionSelectionTimeMs}ms, Deduplication: ${metrics.deduplicationTimeMs}ms, Snapshot: ${metrics.snapshotCreationTimeMs}ms, Room: ${metrics.roomQueryTimeMs}ms, UI: ${metrics.composeUiRenderingTimeMs}ms)")
        }
    }
}
