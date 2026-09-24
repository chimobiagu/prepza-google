package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.security.MessageDigest

/**
 * Immutable session snapshot locking the exact question sequence, duration,
 * subjects, and cryptographic integrity verification.
 *
 * Once created and locked, the active CBT session must ONLY read from this snapshot.
 * No questions may be dynamically substituted, rewritten, or AI-generated.
 */
data class CbtSessionSnapshot(
    val sessionId: String,
    val mode: String,
    val subjects: List<String>,
    val orderedQuestionIds: List<String>,
    val totalDurationSeconds: Long,
    val isMiniCbt: Boolean,
    val initialQuestion: QuestionEntity,
    val createdTimestamp: Long,
    val integrityHash: String
) {
    companion object {
        fun create(
            sessionId: String,
            mode: String,
            subjects: List<String>,
            orderedQuestionIds: List<String>,
            totalDurationSeconds: Long,
            isMiniCbt: Boolean,
            initialQuestion: QuestionEntity,
            createdTimestamp: Long = System.currentTimeMillis()
        ): CbtSessionSnapshot {
            val raw = "$sessionId|$mode|${subjects.joinToString(",")}|${orderedQuestionIds.joinToString(",")}|$totalDurationSeconds|$createdTimestamp"
            val digest = MessageDigest.getInstance("SHA-256")
            val hashBytes = digest.digest(raw.toByteArray(Charsets.UTF_8))
            val hash = hashBytes.joinToString("") { "%02x".format(it) }

            return CbtSessionSnapshot(
                sessionId = sessionId,
                mode = mode,
                subjects = subjects,
                orderedQuestionIds = orderedQuestionIds,
                totalDurationSeconds = totalDurationSeconds,
                isMiniCbt = isMiniCbt,
                initialQuestion = initialQuestion,
                createdTimestamp = createdTimestamp,
                integrityHash = hash
            )
        }
    }

    /**
     * Verifies cryptographic integrity of the session snapshot.
     */
    fun verifyIntegrity(): Boolean {
        val raw = "$sessionId|$mode|${subjects.joinToString(",")}|${orderedQuestionIds.joinToString(",")}|$totalDurationSeconds|$createdTimestamp"
        val digest = MessageDigest.getInstance("SHA-256")
        val hashBytes = digest.digest(raw.toByteArray(Charsets.UTF_8))
        val currentHash = hashBytes.joinToString("") { "%02x".format(it) }
        return currentHash == integrityHash
    }
}
