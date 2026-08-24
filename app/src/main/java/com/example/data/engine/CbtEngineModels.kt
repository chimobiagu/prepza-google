package com.example.data.engine

import com.example.data.db.QuestionEntity

/**
 * Configuration parameters for generating a realistic, authentic CBT examination.
 */
data class CbtExamConfig(
    val compulsorySubject: String = "English Language",
    val electiveSubjects: List<String>,
    val englishQuestionCount: Int = 60,
    val electiveQuestionCount: Int = 40,
    val totalTimeSeconds: Long = 7200L, // 2 Hours (120 Minutes)
    val maxComprehensionCount: Int = 6,
    val targetDifficultyRatios: Map<String, Float> = mapOf(
        "Easy" to 0.25f,
        "Medium" to 0.55f,
        "Hard" to 0.20f
    )
) {
    val totalQuestions: Int get() = englishQuestionCount + (electiveSubjects.size * electiveQuestionCount)
}

/**
 * Result of the pre-CBT Quality Control validation inspection.
 */
data class CbtQualityReport(
    val isValid: Boolean,
    val totalQuestions: Int,
    val expectedQuestions: Int,
    val subjectCounts: Map<String, Int>,
    val duplicateCount: Int,
    val corruptedCount: Int,
    val invalidAnswerIndices: Int,
    val invalidOptionCounts: Int,
    val missingPassages: Int,
    val authenticCount: Int,
    val aiGeneratedCount: Int,
    val validationIssues: List<String> = emptyList()
)

/**
 * Tracking metadata for question exposure history.
 */
data class QuestionExposureRecord(
    val questionId: String,
    val normalizedText: String,
    val exposureCount: Int,
    val lastExposedTimestamp: Long
)
