package com.example.data.supabase

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SupabaseQuestionDto(
    @Json(name = "id") val id: String,
    @Json(name = "subject") val subject: String,
    @Json(name = "topic") val topic: String,
    @Json(name = "year") val year: String = "2024",
    @Json(name = "question_text") val questionText: String,
    @Json(name = "option_a") val optionA: String,
    @Json(name = "option_b") val optionB: String,
    @Json(name = "option_c") val optionC: String,
    @Json(name = "option_d") val optionD: String,
    @Json(name = "correct_answer_index") val correctAnswerIndex: Int,
    @Json(name = "explanation") val explanation: String,
    @Json(name = "passage_text") val passageText: String? = null,
    @Json(name = "difficulty") val difficulty: String = "Medium",
    @Json(name = "origin_type") val originType: String = "JAMB_ORIGINAL",
    @Json(name = "origin_label") val originLabel: String = "Original JAMB Question",
    @Json(name = "is_verified_jamb") val isVerifiedJamb: Boolean = true,
    @Json(name = "image_url") val imageUrl: String? = null,
    @Json(name = "content_version") val contentVersion: Int = 1,
    @Json(name = "is_disabled") val isDisabled: Boolean = false,
    @Json(name = "updated_at") val updatedAt: Long = 0L
)

@JsonClass(generateAdapter = true)
data class SupabaseReportDto(
    @Json(name = "report_id") val reportId: String,
    @Json(name = "question_id") val questionId: String,
    @Json(name = "user_id") val userId: String,
    @Json(name = "subject") val subject: String,
    @Json(name = "exam_year") val examYear: String = "",
    @Json(name = "question_source") val questionSource: String = "JAMB_ORIGINAL",
    @Json(name = "question_text") val questionText: String,
    @Json(name = "option_a") val optionA: String,
    @Json(name = "option_b") val optionB: String,
    @Json(name = "option_c") val optionC: String,
    @Json(name = "option_d") val optionD: String,
    @Json(name = "current_answer_key") val currentAnswerKey: Int,
    @Json(name = "current_explanation") val currentExplanation: String,
    @Json(name = "selected_reason") val selectedReason: String,
    @Json(name = "user_written_report") val userWrittenReport: String = "",
    @Json(name = "timestamp") val timestamp: Long = System.currentTimeMillis(),
    @Json(name = "app_version") val appVersion: String = "1.0",
    @Json(name = "report_status") val reportStatus: String = "PENDING",
    @Json(name = "admin_decision") val adminDecision: String? = null,
    @Json(name = "admin_notes") val adminNotes: String? = null,
    @Json(name = "resolved_at") val resolvedAt: Long? = null
)

@JsonClass(generateAdapter = true)
data class SupabaseBookmarkDto(
    @Json(name = "user_id") val userId: String,
    @Json(name = "question_id") val questionId: String,
    @Json(name = "note") val note: String? = null,
    @Json(name = "created_at") val createdAt: Long = System.currentTimeMillis()
)

data class SyncReportResult(
    val uploadedReportsCount: Int,
    val failedReportsCount: Int
)

data class SyncQuestionsResult(
    val updatedCount: Int,
    val disabledCount: Int,
    val maxVersion: Int,
    val isSuccess: Boolean,
    val message: String
)
