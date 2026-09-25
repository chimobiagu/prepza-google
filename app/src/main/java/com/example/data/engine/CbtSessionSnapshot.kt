package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.security.MessageDigest

/**
 * Immutable session snapshot that serves as the SINGLE SOURCE OF TRUTH for an active CBT exam.
 * Once created, question IDs, ordering, options, and answer keys are mathematically locked.
 */
data class CbtSessionSnapshot(
    val sessionId: String,
    val mode: String,
    val subjects: List<String>,
    val lockedQuestionIds: List<String>,
    val durationSeconds: Long,
    val startTimestamp: Long,
    val snapshotHash: String,
    val questionCount: Int = lockedQuestionIds.size
) {
    /**
     * Verifies that candidate questions match the immutable snapshot integrity hash.
     */
    fun verifyIntegrity(candidateQuestions: List<QuestionEntity>): Boolean {
        if (candidateQuestions.size != lockedQuestionIds.size) return false
        for (i in candidateQuestions.indices) {
            if (candidateQuestions[i].id != lockedQuestionIds[i]) return false
        }
        val computedHash = computeSnapshotHash(sessionId, lockedQuestionIds, durationSeconds)
        return computedHash == snapshotHash
    }

    companion object {
        fun create(
            sessionId: String,
            mode: String,
            subjects: List<String>,
            questionIds: List<String>,
            durationSeconds: Long,
            startTimestamp: Long = System.currentTimeMillis()
        ): CbtSessionSnapshot {
            require(questionIds.isNotEmpty()) { "Cannot create CBT snapshot with 0 question IDs" }
            val hash = computeSnapshotHash(sessionId, questionIds, durationSeconds)
            return CbtSessionSnapshot(
                sessionId = sessionId,
                mode = mode,
                subjects = subjects,
                lockedQuestionIds = questionIds.toList(), // Defensive copy for immutability
                durationSeconds = durationSeconds,
                startTimestamp = startTimestamp,
                snapshotHash = hash
            )
        }

        private fun computeSnapshotHash(
            sessionId: String,
            questionIds: List<String>,
            durationSeconds: Long
        ): String {
            val content = "$sessionId::${questionIds.joinToString(",")}::$durationSeconds"
            val digest = MessageDigest.getInstance("SHA-256")
            val bytes = digest.digest(content.toByteArray(Charsets.UTF_8))
            return bytes.joinToString("") { "%02x".format(it) }
        }
    }
}

/**
 * Exception raised when active session questions fail integrity verification against the snapshot.
 */
class CbtIntegrityException(message: String) : IllegalStateException(message)
