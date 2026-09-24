package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.security.MessageDigest

/**
 * Categorization of visual requirement for a JAMB past question.
 */
enum class VisualRequirementType {
    TEXT_ONLY,
    DIAGRAM_REQUIRED,
    GRAPH_REQUIRED,
    TABLE_REQUIRED,
    IMAGE_REQUIRED,
    MULTIPLE_VISUALS
}

/**
 * Metadata and specification for a verified visual asset associated with a CBT question.
 */
data class VisualAsset(
    val assetId: String,
    val questionId: String,
    val type: String, // "GEOMETRIC_FIGURE", "CIRCUIT", "APPARATUS", "ANATOMY", "ORGANIC_STRUCTURE", "GRAPH", "TABLE", "MAP", "WAVE", "OPTICS", "PULLEY", "LEVER", "INCLINED_PLANE", "CELL", "FLOWER", "HEART", "KIDNEY", "LUNGS", "DIGESTIVE", "VENN", "COORDINATE_GRAPH", "CONTOURS"
    val sourceDocument: String = "JAMB_ARCHIVE",
    val sourcePage: Int = 1,
    val sourceRegion: String = "0,0,100,100",
    val width: Int = 600,
    val height: Int = 400,
    val contentHash: String = "",
    val caption: String = "",
    val altText: String = "",
    val verified: Boolean = true,
    val isReconstructed: Boolean = false,
    val vectorSpec: String? = null,
    val localUri: String? = null
) {
    companion object {
        fun computeAssetHash(questionId: String, type: String, caption: String): String {
            val raw = "$questionId|$type|$caption"
            val digest = MessageDigest.getInstance("SHA-256")
            val hashBytes = digest.digest(raw.toByteArray(Charsets.UTF_8))
            return hashBytes.joinToString("") { "%02x".format(it) }
        }
    }
}

/**
 * Integrity report for an individual question's visual completeness.
 */
data class VisualValidationResult(
    val questionId: String,
    val visualRequirementType: VisualRequirementType,
    val isSatisfied: Boolean,
    val visualAsset: VisualAsset? = null,
    val failureReason: String? = null
)

/**
 * Aggregate question bank visual audit report.
 */
data class VisualBankAuditReport(
    val totalQuestionsAudited: Int,
    val textOnlyCount: Int,
    val diagramCount: Int,
    val graphCount: Int,
    val tableCount: Int,
    val imageCount: Int,
    val multipleVisualsCount: Int,
    val missingRequiredVisualCount: Int,
    val quarantinedCount: Int,
    val verifiedVisualCount: Int
)
