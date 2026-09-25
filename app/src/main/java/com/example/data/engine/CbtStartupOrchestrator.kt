package com.example.data.engine

import android.os.SystemClock
import com.example.data.db.ActiveExamStateEntity
import com.example.data.db.QuestionEntity
import com.example.data.repository.PrepzaRepository
import com.example.data.repository.QuestionBankGenerator
import kotlinx.coroutines.*
import java.util.UUID

/**
 * Orchestrates instantaneous CBT exam startup with monotonic timing,
 * progressive background question prefetching, and detailed latency metrics.
 */
object CbtStartupOrchestrator {

    /**
     * Executes the ultra-fast CBT startup pipeline:
     * 1. Locks question IDs into an immutable snapshot.
     * 2. Resolves Question 1 immediately (< 50ms).
     * 3. Triggers UI navigation with Q1 ready.
     * 4. Asynchronously prefetches Questions 2-5, then remaining questions in background.
     */
    suspend fun startInstantSession(
        mode: String,
        subjects: List<String>,
        questionCount: Int,
        durationSeconds: Long,
        repository: PrepzaRepository,
        seenQuestionIds: Set<String>,
        customSessionId: String? = null,
        onSessionLocked: (snapshot: CbtSessionSnapshot, q1: QuestionEntity) -> Unit,
        onQuestionsProgressiveUpdate: (allLoadedQuestions: List<QuestionEntity>) -> Unit
    ): CbtStartupMetrics = withContext(Dispatchers.Default) {
        val sessionId = customSessionId ?: "cbt_${UUID.randomUUID().toString().take(8)}"
        val metrics = CbtStartupLogger.startSession(sessionId, mode)

        val t0 = SystemClock.elapsedRealtime()

        // 1. Fast Query / Pool access (DB_QUERY Checkpoint)
        val queryStartNanos = System.nanoTime()
        val queryStart = SystemClock.elapsedRealtime()

        val pool = SubjectQuestionPoolCache.getPoolForSubjects(subjects, repository)

        val queryDurationNanos = System.nanoTime() - queryStartNanos
        metrics.roomQueryTimeMs = SystemClock.elapsedRealtime() - queryStart
        StartupProfiler.recordDbQuery(sessionId, queryDurationNanos, "${pool.size} pool items ready")

        // 2. Select Questions & Lock Snapshot (SNAPSHOT_LOCK Checkpoint)
        val selectStart = SystemClock.elapsedRealtime()
        val userExposures = repository.getExposuresForUser()

        val (snapshot, q1) = PrepzaCbtEngine.fastInitializeExamSession(
            mode = mode,
            subjects = subjects,
            questionCount = questionCount,
            durationSeconds = durationSeconds,
            availablePool = pool,
            userExposures = userExposures,
            excludedSessionIds = seenQuestionIds,
            sessionId = sessionId
        )
        metrics.questionSelectionTimeMs = SystemClock.elapsedRealtime() - selectStart

        val snapStart = SystemClock.elapsedRealtime()
        CbtStartupLogger.recordSnapshotLocked(metrics)
        StartupProfiler.recordSnapshotLock(sessionId, snapshot.lockedQuestionIds.size, "${snapshot.lockedQuestionIds.size} IDs locked")
        metrics.snapshotCreationTimeMs = SystemClock.elapsedRealtime() - snapStart

        CbtStartupLogger.recordQ1DataAvailable(metrics)

        // 3. Send Q1 to UI immediately for instantaneous rendering (< 20ms)
        withContext(Dispatchers.Main) {
            CbtStartupLogger.recordNavigation(metrics)
            onSessionLocked(snapshot, q1)
        }

        // 4. Background Persistence & Progressive Prefetching (Never blocks Q1 interactive rendering)
        CoroutineScope(Dispatchers.IO).launch {
            // Save state for auto-recovery asynchronously
            val minActiveState = ActiveExamStateEntity(
                id = "active_cbt_session",
                mode = mode,
                subjectsCsv = subjects.joinToString(","),
                questionIdsCsv = snapshot.lockedQuestionIds.joinToString(","),
                userAnswersJson = "{}",
                flaggedIndicesCsv = "",
                currentQuestionIndex = 0,
                selectedSubject = q1.subject,
                timerSecondsRemaining = durationSeconds,
                totalDurationSeconds = durationSeconds,
                isMiniCbt = !mode.contains("Full", ignoreCase = true),
                startTimestamp = System.currentTimeMillis(),
                lastUpdatedTimestamp = System.currentTimeMillis(),
                isCompleted = false
            )
            repository.saveActiveExamState(minActiveState)

            val allQuestionMap = pool.associateBy { it.id }.toMutableMap()
            val loadedList = mutableListOf(q1)

            // Stage A: Immediate Prefetch of Questions 2 to 5
            val q2to5Ids = snapshot.lockedQuestionIds.drop(1).take(4)
            for (id in q2to5Ids) {
                var item = allQuestionMap[id]
                if (item == null) {
                    item = repository.questionDao.getQuestionById(id)
                }
                if (item != null) {
                    loadedList.add(item)
                }
            }
            withContext(Dispatchers.Main) {
                onQuestionsProgressiveUpdate(loadedList.toList())
            }

            // Stage B: Progressive load of all remaining questions
            val remainingIds = snapshot.lockedQuestionIds.drop(5)
            if (remainingIds.isNotEmpty()) {
                val chunks = remainingIds.chunked(30)
                for (chunk in chunks) {
                    for (id in chunk) {
                        var item = allQuestionMap[id]
                        if (item == null) {
                            item = repository.questionDao.getQuestionById(id)
                        }
                        if (item != null) {
                            loadedList.add(item)
                        }
                    }
                    withContext(Dispatchers.Main) {
                        onQuestionsProgressiveUpdate(loadedList.toList())
                    }
                }
            }

            // Stage C: Asynchronous background telemetry & exposure update
            repository.recordQuestionExposures(loadedList)
        }

        metrics
    }
}
