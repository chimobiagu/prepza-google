package com.example.data.security

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.json.JSONArray
import org.json.JSONObject

data class TelemetryEvent(
    val id: String,
    val type: String, // "CBT_COMPLETION", "APK_UPDATE", "OFFLINE_SYNC", "AUTH", "DATABASE_IO", "NETWORK_ERROR"
    val description: String,
    val isSuccess: Boolean,
    val latencyMs: Long = 0,
    val timestamp: Long = System.currentTimeMillis(),
    val metadata: Map<String, String> = emptyMap()
)

data class ProductionDiagnosticsSummary(
    val totalCbtSubmissions: Int = 0,
    val cbtSyncSuccessRatePercent: Int = 100,
    val avgCbtSubmitDurationMs: Long = 180,
    val offlineRecoveryCount: Int = 0,
    val lastUpdateCheckTimestamp: Long = 0L,
    val recentEvents: List<TelemetryEvent> = emptyList()
)

/**
 * Lightweight, zero-overhead production telemetry & diagnostics logger.
 * Safely buffers events locally and computes operational metrics without draining battery or CPU.
 */
class ProductionTelemetryManager(private val context: Context) {

    private val TAG = "PrepzaTelemetry"
    private val PREFS_NAME = "prepza_telemetry_prefs"
    private val KEY_EVENTS_JSON = "buffered_events_json"

    private val prefs: SharedPreferences by lazy {
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    private val _diagnosticsFlow = MutableStateFlow(loadDiagnosticsSummary())
    val diagnosticsFlow: StateFlow<ProductionDiagnosticsSummary> = _diagnosticsFlow.asStateFlow()

    @Synchronized
    fun recordEvent(
        type: String,
        description: String,
        isSuccess: Boolean = true,
        latencyMs: Long = 0,
        metadata: Map<String, String> = emptyMap()
    ) {
        val event = TelemetryEvent(
            id = "evt_${System.currentTimeMillis()}_${(100..999).random()}",
            type = type,
            description = description,
            isSuccess = isSuccess,
            latencyMs = latencyMs,
            timestamp = System.currentTimeMillis(),
            metadata = metadata
        )

        try {
            val events = getBufferedEvents().toMutableList()
            events.add(0, event) // newest first
            val trimmed = events.take(60) // Keep latest 60 events

            saveBufferedEvents(trimmed)
            _diagnosticsFlow.value = computeDiagnostics(trimmed)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to record telemetry event: ${e.message}")
        }
    }

    fun getDiagnosticsSummary(): ProductionDiagnosticsSummary {
        val events = getBufferedEvents()
        return computeDiagnostics(events)
    }

    private fun computeDiagnostics(events: List<TelemetryEvent>): ProductionDiagnosticsSummary {
        val cbtEvents = events.filter { it.type == "CBT_COMPLETION" || it.type == "OFFLINE_SYNC" }
        val successfulCbt = cbtEvents.count { it.isSuccess }
        val syncSuccessRate = if (cbtEvents.isNotEmpty()) (successfulCbt * 100) / cbtEvents.size else 100

        val avgLatency = if (cbtEvents.isNotEmpty()) {
            cbtEvents.map { it.latencyMs }.filter { it > 0 }.average().toLong().coerceAtLeast(120L)
        } else 150L

        val offlineRecoveries = events.count { it.type == "OFFLINE_SYNC" && it.isSuccess }
        val lastUpdateCheck = events.firstOrNull { it.type == "APK_UPDATE" }?.timestamp ?: System.currentTimeMillis()

        return ProductionDiagnosticsSummary(
            totalCbtSubmissions = cbtEvents.size,
            cbtSyncSuccessRatePercent = syncSuccessRate,
            avgCbtSubmitDurationMs = avgLatency,
            offlineRecoveryCount = offlineRecoveries,
            lastUpdateCheckTimestamp = lastUpdateCheck,
            recentEvents = events.take(15)
        )
    }

    private fun loadDiagnosticsSummary(): ProductionDiagnosticsSummary {
        return computeDiagnostics(getBufferedEvents())
    }

    private fun getBufferedEvents(): List<TelemetryEvent> {
        val jsonString = prefs.getString(KEY_EVENTS_JSON, "[]") ?: "[]"
        val list = mutableListOf<TelemetryEvent>()
        try {
            val array = JSONArray(jsonString)
            for (i in 0 until array.length()) {
                val obj = array.getJSONObject(i)
                val metaObj = obj.optJSONObject("metadata")
                val metaMap = mutableMapOf<String, String>()
                metaObj?.keys()?.forEach { key ->
                    metaMap[key] = metaObj.optString(key)
                }

                list.add(
                    TelemetryEvent(
                        id = obj.optString("id"),
                        type = obj.optString("type"),
                        description = obj.optString("description"),
                        isSuccess = obj.optBoolean("isSuccess", true),
                        latencyMs = obj.optLong("latencyMs", 0),
                        timestamp = obj.optLong("timestamp", System.currentTimeMillis()),
                        metadata = metaMap
                    )
                )
            }
        } catch (_: Exception) {}
        return list
    }

    private fun saveBufferedEvents(events: List<TelemetryEvent>) {
        val array = JSONArray()
        for (event in events) {
            val obj = JSONObject().apply {
                put("id", event.id)
                put("type", event.type)
                put("description", event.description)
                put("isSuccess", event.isSuccess)
                put("latencyMs", event.latencyMs)
                put("timestamp", event.timestamp)
                val metaObj = JSONObject()
                event.metadata.forEach { (k, v) -> metaObj.put(k, v) }
                put("metadata", metaObj)
            }
            array.put(obj)
        }
        prefs.edit().putString(KEY_EVENTS_JSON, array.toString()).apply()
    }
}
