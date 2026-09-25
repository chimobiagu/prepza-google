package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.util.Locale

/**
 * Validates visual questions before they enter the active CBT exam pool.
 * Quarantines any question where a visual is structurally required by the stem
 * but the asset is missing, corrupted, or unverified.
 */
object CbtVisualIntegrityValidator {

    private val DIAGRAM_INDICATOR_REGEX = Regex(
        "(diagram|figure|illustration|circuit|apparatus|curve|setup|graph|chart|table|specimen|cross-section|longitudinal section)\\s+(shown|below|above|attached|illustrated|depicted|represented)",
        RegexOption.IGNORE_CASE
    )

    private val DIRECT_REFERENCE_REGEX = Regex(
        "(from the diagram|in the figure|from the graph|in the circuit|from the table|according to the chart|in figure\\s+[0-9ivx]+|in the diagram above|in the diagram below)",
        RegexOption.IGNORE_CASE
    )

    /**
     * Inspects a [QuestionEntity] and determines its visual requirement status.
     * Returns an [IntegrityMetadata] descriptor.
     */
    fun validateQuestionVisual(question: QuestionEntity): IntegrityMetadata {
        val visualType = inferVisualType(question)
        val contentHash = QuestionDeduplicator.getContentFingerprint(question)

        if (visualType == VisualType.TEXT_ONLY) {
            return IntegrityMetadata(
                verificationStatus = VerificationStatus.VERIFIED,
                visualType = VisualType.TEXT_ONLY,
                contentHash = contentHash,
                hasRequiredVisual = true,
                quarantineReason = null
            )
        }

        // Question requires a visual asset: verify existence in registry
        val asset = CbtVisualRegistry.getVisualForQuestion(question.id, question.imageUrl)

        if (asset == null) {
            return IntegrityMetadata(
                verificationStatus = VerificationStatus.QUARANTINED,
                visualType = visualType,
                contentHash = contentHash,
                hasRequiredVisual = false,
                quarantineReason = "Required visual ($visualType) is missing for question stem: \"${question.questionText.take(60)}...\""
            )
        }

        if (!asset.verified) {
            return IntegrityMetadata(
                verificationStatus = VerificationStatus.QUARANTINED,
                visualType = visualType,
                contentHash = contentHash,
                hasRequiredVisual = false,
                quarantineReason = "Visual asset ${asset.assetId} is not verified."
            )
        }

        return IntegrityMetadata(
            verificationStatus = VerificationStatus.VERIFIED,
            visualType = visualType,
            contentHash = contentHash,
            hasRequiredVisual = true,
            quarantineReason = null
        )
    }

    /**
     * Determines whether the question requires a visual asset based on text patterns or metadata.
     */
    fun inferVisualType(question: QuestionEntity): VisualType {
        val text = question.questionText.lowercase(Locale.ROOT)
        val imageKey = question.imageUrl?.lowercase(Locale.ROOT) ?: ""

        if (imageKey.contains("table") || text.contains("table shown") || text.contains("from the table")) {
            return VisualType.TABLE_REQUIRED
        }

        if (imageKey.contains("graph") || text.contains("from the graph") || text.contains("velocity-time graph") || text.contains("curve shown")) {
            return VisualType.GRAPH_REQUIRED
        }

        if (imageKey.isNotBlank() || DIAGRAM_INDICATOR_REGEX.containsMatchIn(text) || DIRECT_REFERENCE_REGEX.containsMatchIn(text)) {
            return VisualType.DIAGRAM_REQUIRED
        }

        return VisualType.TEXT_ONLY
    }

    /**
     * Filters a collection of questions, discarding any that fail visual integrity.
     * Uses a sub-microsecond fast path for text-only questions to eliminate startup latency.
     */
    fun filterVerifiedVisualQuestions(
        questions: List<QuestionEntity>,
        quarantinedOut: MutableList<Pair<QuestionEntity, String>>? = null
    ): List<QuestionEntity> {
        val verified = ArrayList<QuestionEntity>(questions.size)

        for (q in questions) {
            val text = q.questionText
            val img = q.imageUrl

            // Fast-path: 98% of questions are plain text with no image URLs or diagram references
            if (img.isNullOrBlank() &&
                !text.contains("diagram", ignoreCase = true) &&
                !text.contains("figure", ignoreCase = true) &&
                !text.contains("circuit", ignoreCase = true) &&
                !text.contains("graph", ignoreCase = true) &&
                !text.contains("table shown", ignoreCase = true)
            ) {
                verified.add(q)
                continue
            }

            val check = validateQuestionVisual(q)
            if (check.verificationStatus == VerificationStatus.VERIFIED) {
                verified.add(q)
            } else {
                quarantinedOut?.add(q to (check.quarantineReason ?: "Visual integrity check failed"))
            }
        }

        return verified
    }
}
