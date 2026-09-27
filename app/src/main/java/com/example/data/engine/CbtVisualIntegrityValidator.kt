package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.util.Locale

/**
 * Validates visual questions before they enter the active CBT exam pool.
 * Quarantines any question where a visual/diagram/figure/table/graph/apparatus
 * is required by the stem but the asset is missing, corrupted, or unverified.
 *
 * Core Production Rule:
 * A question is not production-ready unless its stem, options, answer key,
 * source metadata, and every required visual asset have passed validation.
 */
object CbtVisualIntegrityValidator {

    private val VISUAL_DEPENDENCY_PATTERNS = listOf(
        // Diagram & figure references
        Regex("(in|from|refer\\s+to|as\\s+shown\\s+in)\\s+(the\\s+)?([a-z0-9_-]+\\s+)?(diagram|figure|illustration|circuit|setup|apparatus|graph)", RegexOption.IGNORE_CASE),
        Regex("(the\\s+)?([a-z0-9_-]+\\s+)?(diagram|figure|illustration|circuit|setup|apparatus|graph|table)\\s+(above|below|shown|attached|depicted|represents|illustrates)", RegexOption.IGNORE_CASE),
        Regex("(diagram|figure)\\s+[0-9ivx]+", RegexOption.IGNORE_CASE),

        // Labelled parts: e.g. "part labelled A", "labelled X", "indicated by the arrow"
        Regex("(part|structure|organ|region|point|line|angle|ray|component|element)\\s+(labelled|labeled)\\s+[A-Za-z0-9ivx]+", RegexOption.IGNORE_CASE),
        Regex("(labelled|labeled)\\s+[A-Za-z0-9ivx]+\\s+(is|represents|indicates|functions)", RegexOption.IGNORE_CASE),
        Regex("(indicated|pointed\\s+to|shown)\\s+by\\s+(the\\s+)?arrow", RegexOption.IGNORE_CASE),

        // Apparatus & experimental setups: e.g. "apparatus shown", "experimental setup above"
        Regex("(apparatus|setup|experimental\\s+setup|arrangement)\\s+(shown|above|below|illustrated|used)", RegexOption.IGNORE_CASE),
        Regex("in\\s+the\\s+(apparatus|setup|arrangement)\\s+(above|below|shown)", RegexOption.IGNORE_CASE),

        // Graphs, curves & charts
        Regex("(from|in)\\s+the\\s+(graph|curve|chart|pie\\s+chart|bar\\s+chart|histogram)", RegexOption.IGNORE_CASE),
        Regex("(the\\s+graph|the\\s+curve|the\\s+chart)\\s+(above|below|shown|represents|depicts)", RegexOption.IGNORE_CASE),
        Regex("(velocity-time|displacement-time|force-extension|titration|cooling|heating)\\s+(graph|curve)", RegexOption.IGNORE_CASE),

        // Tables
        Regex("(from|in|according\\s+to)\\s+the\\s+table\\s+(above|below|shown)", RegexOption.IGNORE_CASE),
        Regex("(the\\s+table\\s+above|the\\s+table\\s+below|table\\s+shown)", RegexOption.IGNORE_CASE),

        // Circuits
        Regex("(in|from)\\s+the\\s+circuit(\\s+diagram)?\\s+(above|below|shown)", RegexOption.IGNORE_CASE),
        Regex("(the\\s+circuit\\s+diagram|circuit\\s+shown|in\\s+the\\s+circuit)", RegexOption.IGNORE_CASE),

        // Maps
        Regex("(on|from|in)\\s+the\\s+(sketch\\s+)?map\\s+(above|below|shown)", RegexOption.IGNORE_CASE),
        Regex("(the\\s+map\\s+above|the\\s+map\\s+below|map\\s+shown)", RegexOption.IGNORE_CASE),

        // Geometry / mathematical figures
        Regex("(in|from)\\s+the\\s+geometric(al)?\\s+figure", RegexOption.IGNORE_CASE),
        Regex("in\\s+the\\s+triangle\\s+(shown|above|below)", RegexOption.IGNORE_CASE),
        Regex("in\\s+the\\s+polygon\\s+(shown|above|below)", RegexOption.IGNORE_CASE),
        Regex("(shaded|unshaded)\\s+(region|portion|area)\\s+(in\\s+the\\s+figure|above|below)", RegexOption.IGNORE_CASE),

        // Biological specimens / cross sections
        Regex("(specimen|organism|cross-section|longitudinal\\s+section)\\s+(shown|above|below|illustrated)", RegexOption.IGNORE_CASE),
        Regex("in\\s+the\\s+(specimen|cross-section|longitudinal\\s+section)\\s+(above|below|shown)", RegexOption.IGNORE_CASE)
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

        // Question requires a visual asset: verify existence in registry or valid imageUrl
        val registeredAsset = CbtVisualRegistry.getVisualForQuestion(question.id, question.imageUrl)
        val hasDirectImage = !question.imageUrl.isNullOrBlank()

        if (registeredAsset == null && !hasDirectImage) {
            return IntegrityMetadata(
                verificationStatus = VerificationStatus.QUARANTINED,
                visualType = visualType,
                contentHash = contentHash,
                hasRequiredVisual = false,
                quarantineReason = "Required visual ($visualType) is missing for question stem: \"${question.questionText.take(60)}...\""
            )
        }

        if (registeredAsset != null && !registeredAsset.verified) {
            return IntegrityMetadata(
                verificationStatus = VerificationStatus.QUARANTINED,
                visualType = visualType,
                contentHash = contentHash,
                hasRequiredVisual = false,
                quarantineReason = "Visual asset ${registeredAsset.assetId} is not verified."
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

        if (imageKey.isNotBlank()) {
            return VisualType.DIAGRAM_REQUIRED
        }

        for (pattern in VISUAL_DEPENDENCY_PATTERNS) {
            if (pattern.containsMatchIn(text)) {
                return VisualType.DIAGRAM_REQUIRED
            }
        }

        return VisualType.TEXT_ONLY
    }

    /**
     * Filters a collection of questions, discarding any that fail visual integrity.
     */
    fun filterVerifiedVisualQuestions(
        questions: List<QuestionEntity>,
        quarantinedOut: MutableList<Pair<QuestionEntity, String>>? = null
    ): List<QuestionEntity> {
        val verified = ArrayList<QuestionEntity>(questions.size)

        for (q in questions) {
            val check = validateQuestionVisual(q)
            if (check.verificationStatus == VerificationStatus.VERIFIED) {
                verified.add(q)
            } else {
                quarantinedOut?.add(q to (check.quarantineReason ?: "Visual integrity check failed: missing required diagram"))
            }
        }

        return verified
    }
}

