package com.example.data.engine

/**
 * Visual classification for JAMB UTME questions.
 */
enum class VisualType {
    TEXT_ONLY,
    DIAGRAM_REQUIRED,
    GRAPH_REQUIRED,
    TABLE_REQUIRED,
    IMAGE_REQUIRED,
    MULTIPLE_VISUALS
}

/**
 * Verification state of an ingested or generated question.
 * Only [VERIFIED] questions may enter the active CBT exam pool.
 */
enum class VerificationStatus {
    UNVERIFIED,
    PROCESSING,
    VERIFIED,
    QUARANTINED,
    REJECTED
}

/**
 * Structured tabular data for visual questions that contain scientific or accounting data tables.
 */
data class TableVisualData(
    val title: String? = null,
    val headers: List<String>,
    val rows: List<List<String>>,
    val footnote: String? = null
)

/**
 * Metadata for a first-class visual asset associated with a question.
 */
data class VisualAsset(
    val assetId: String,
    val questionId: String,
    val type: VisualType,
    val sourcePage: Int = 1,
    val sourceRegion: String = "",
    val width: Int = 400,
    val height: Int = 260,
    val contentHash: String,
    val caption: String = "",
    val altText: String = "",
    val verified: Boolean = true,
    val diagramKey: String? = null,
    val tableData: TableVisualData? = null,
    val localUri: String? = null
)

/**
 * Provenance tracking for authentic examination questions.
 */
data class SourceMetadata(
    val exam: String = "JAMB UTME",
    val year: String,
    val subject: String,
    val sourceName: String = "Official Examination Series",
    val sourcePage: Int = 1,
    val sourceQuestionNumber: Int = 1,
    val sourceHash: String = ""
)

/**
 * Integrity information computed before a question enters the exam pool.
 */
data class IntegrityMetadata(
    val verificationStatus: VerificationStatus = VerificationStatus.VERIFIED,
    val visualType: VisualType = VisualType.TEXT_ONLY,
    val contentHash: String = "",
    val hasRequiredVisual: Boolean = true,
    val quarantineReason: String? = null
)
