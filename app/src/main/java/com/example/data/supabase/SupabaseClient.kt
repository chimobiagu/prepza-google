package com.example.data.supabase

import android.util.Log
import com.example.data.db.FlaggedQuestionEntity
import com.example.data.db.QuestionEntity
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.util.concurrent.TimeUnit

object SupabaseClient {

    private const val TAG = "SupabaseClient"
    private val JSON_MEDIA_TYPE = "application/json; charset=utf-8".toMediaType()

    private val httpClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
            .build()
    }

    private val moshi: Moshi by lazy {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    private val reportAdapter by lazy { moshi.adapter(SupabaseReportDto::class.java) }
    private val questionAdapter by lazy { moshi.adapter(SupabaseQuestionDto::class.java) }
    private val questionListAdapter by lazy {
        val listType = Types.newParameterizedType(List::class.java, SupabaseQuestionDto::class.java)
        moshi.adapter<List<SupabaseQuestionDto>>(listType)
    }

    /**
     * Submits a question report (flag) to Supabase table `question_reports`.
     * Preserves the full snapshot of the question as seen by the student.
     */
    suspend fun submitQuestionReport(entity: FlaggedQuestionEntity): Result<Boolean> = withContext(Dispatchers.IO) {
        try {
            val dto = SupabaseReportDto(
                reportId = entity.id,
                questionId = entity.questionId,
                userId = entity.userId.ifBlank { "anonymous_student" },
                subject = entity.subject,
                examYear = entity.year,
                questionSource = entity.questionSource,
                questionText = entity.questionText,
                optionA = entity.optionA,
                optionB = entity.optionB,
                optionC = entity.optionC,
                optionD = entity.optionD,
                currentAnswerKey = entity.correctAnswerIndex,
                currentExplanation = entity.explanation,
                selectedReason = entity.reason,
                userWrittenReport = entity.userNotes,
                timestamp = entity.timestamp,
                appVersion = entity.appVersion,
                reportStatus = entity.status,
                adminDecision = entity.adminDecision,
                adminNotes = entity.adminNotes,
                resolvedAt = entity.resolvedAt
            )

            val jsonBody = reportAdapter.toJson(dto)
            val url = "${SupabaseConfig.SUPABASE_URL}/rest/v1/question_reports"

            val request = Request.Builder()
                .url(url)
                .header("apikey", SupabaseConfig.SUPABASE_ANON_KEY)
                .header("Authorization", "Bearer ${SupabaseConfig.SUPABASE_ANON_KEY}")
                .header("Content-Type", "application/json")
                .header("Prefer", "resolution=merge-duplicates,return=minimal")
                .post(jsonBody.toRequestBody(JSON_MEDIA_TYPE))
                .build()

            val response = httpClient.newCall(request).execute()
            if (response.isSuccessful || response.code == 201 || response.code == 409) {
                Log.d(TAG, "Successfully posted/merged question report ${entity.id} to Supabase (HTTP ${response.code})")
                Result.success(true)
            } else {
                val errorBody = response.body?.string().orEmpty()
                Log.w(TAG, "Supabase report upload failed with HTTP ${response.code}: $errorBody")
                Result.failure(Exception("Supabase HTTP ${response.code}: $errorBody"))
            }
        } catch (e: Exception) {
            Log.w(TAG, "Network exception submitting question report: ${e.message}")
            Result.failure(e)
        }
    }

    /**
     * Queries Supabase for questions updated after a given content version or timestamp.
     */
    suspend fun fetchUpdatedQuestions(sinceVersion: Int, sinceTimestamp: Long): Result<List<QuestionEntity>> = withContext(Dispatchers.IO) {
        try {
            val url = if (sinceVersion > 0) {
                "${SupabaseConfig.SUPABASE_URL}/rest/v1/questions?select=*&content_version=gt.$sinceVersion&order=content_version.asc&limit=250"
            } else if (sinceTimestamp > 0) {
                "${SupabaseConfig.SUPABASE_URL}/rest/v1/questions?select=*&updated_at=gt.$sinceTimestamp&order=updated_at.asc&limit=250"
            } else {
                "${SupabaseConfig.SUPABASE_URL}/rest/v1/questions?select=*&order=updated_at.desc&limit=250"
            }

            val request = Request.Builder()
                .url(url)
                .header("apikey", SupabaseConfig.SUPABASE_ANON_KEY)
                .header("Authorization", "Bearer ${SupabaseConfig.SUPABASE_ANON_KEY}")
                .header("Accept", "application/json")
                .get()
                .build()

            val response = httpClient.newCall(request).execute()
            if (response.isSuccessful) {
                val body = response.body?.string().orEmpty()
                val dtoList = questionListAdapter.fromJson(body) ?: emptyList()

                val domainEntities = dtoList.map { dto ->
                    QuestionEntity(
                        id = dto.id,
                        subject = dto.subject,
                        topic = dto.topic,
                        year = dto.year,
                        questionText = dto.questionText,
                        optionA = dto.optionA,
                        optionB = dto.optionB,
                        optionC = dto.optionC,
                        optionD = dto.optionD,
                        correctAnswerIndex = dto.correctAnswerIndex.coerceIn(0, 3),
                        explanation = dto.explanation,
                        passageText = dto.passageText,
                        difficulty = dto.difficulty,
                        originType = dto.originType,
                        originLabel = dto.originLabel,
                        isVerifiedJamb = dto.isVerifiedJamb,
                        imageUrl = dto.imageUrl,
                        contentVersion = dto.contentVersion,
                        isDisabled = dto.isDisabled,
                        updatedAt = if (dto.updatedAt > 0) dto.updatedAt else System.currentTimeMillis()
                    )
                }
                Result.success(domainEntities)
            } else {
                val errorBody = response.body?.string().orEmpty()
                Result.failure(Exception("Supabase fetch failed: HTTP ${response.code} $errorBody"))
            }
        } catch (e: Exception) {
            Log.w(TAG, "Network exception fetching Supabase questions: ${e.message}")
            Result.failure(e)
        }
    }

    /**
     * Admin action: updates canonical question on Supabase (increments version and updates content).
     * Protected by service authorization.
     */
    suspend fun updateCanonicalQuestion(question: QuestionEntity): Result<Boolean> = withContext(Dispatchers.IO) {
        try {
            val dto = SupabaseQuestionDto(
                id = question.id,
                subject = question.subject,
                topic = question.topic,
                year = question.year,
                questionText = question.questionText,
                optionA = question.optionA,
                optionB = question.optionB,
                optionC = question.optionC,
                optionD = question.optionD,
                correctAnswerIndex = question.correctAnswerIndex,
                explanation = question.explanation,
                passageText = question.passageText,
                difficulty = question.difficulty,
                originType = question.originType,
                originLabel = question.originLabel,
                isVerifiedJamb = question.isVerifiedJamb,
                imageUrl = question.imageUrl,
                contentVersion = question.contentVersion,
                isDisabled = question.isDisabled,
                updatedAt = System.currentTimeMillis()
            )

            val jsonBody = questionAdapter.toJson(dto)
            val url = "${SupabaseConfig.SUPABASE_URL}/rest/v1/questions?id=eq.${question.id}"

            val request = Request.Builder()
                .url(url)
                .header("apikey", SupabaseConfig.SUPABASE_ANON_KEY)
                .header("Authorization", "Bearer ${SupabaseConfig.SUPABASE_ANON_KEY}")
                .header("Content-Type", "application/json")
                .header("Prefer", "return=minimal")
                .patch(jsonBody.toRequestBody(JSON_MEDIA_TYPE))
                .build()

            val response = httpClient.newCall(request).execute()
            if (response.isSuccessful) {
                Result.success(true)
            } else {
                Result.failure(Exception("HTTP ${response.code} updating canonical question"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    /**
     * Admin action: updates report status on Supabase.
     */
    suspend fun resolveReportOnServer(
        reportId: String,
        status: String,
        decision: String,
        notes: String
    ): Result<Boolean> = withContext(Dispatchers.IO) {
        try {
            val json = """
                {
                    "report_status": "$status",
                    "admin_decision": "$decision",
                    "admin_notes": "${notes.replace("\"", "\\\"")}",
                    "resolved_at": ${System.currentTimeMillis()}
                }
            """.trimIndent()

            val url = "${SupabaseConfig.SUPABASE_URL}/rest/v1/question_reports?report_id=eq.$reportId"
            val request = Request.Builder()
                .url(url)
                .header("apikey", SupabaseConfig.SUPABASE_ANON_KEY)
                .header("Authorization", "Bearer ${SupabaseConfig.SUPABASE_ANON_KEY}")
                .header("Content-Type", "application/json")
                .patch(json.toRequestBody(JSON_MEDIA_TYPE))
                .build()

            val response = httpClient.newCall(request).execute()
            if (response.isSuccessful) {
                Result.success(true)
            } else {
                Result.failure(Exception("HTTP ${response.code} updating report"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
