package com.example.data.repository

import com.example.data.db.QuestionEntity
import java.security.MessageDigest

data class RawQuestionData(
    val sourceDocument: String,
    val sourceYear: String,
    val pageNumber: Int,
    val questionNumber: Int,
    val subject: String,
    val topic: String,
    val questionText: String,
    val options: List<String>,
    val sourceAnswerLetter: String?,
    val explanation: String,
    val difficulty: String = "Medium"
)

data class QuarantinedQuestion(
    val raw: RawQuestionData,
    val reason: String
)

data class BatchIngestionReport(
    val source: String,
    val totalExtracted: Int,
    val accepted: Int,
    val exactDuplicates: Int,
    val nearDuplicates: Int,
    val invalidMetadata: Int,
    val missingAnswerKey: Int,
    val sourceFidelityFailures: Int,
    val quarantined: Int,
    val finalProductionCount: Int
) {
    fun printReport(): String {
        return """
Source: $source
Total extracted: $totalExtracted
Accepted: $accepted
Exact duplicates: $exactDuplicates
Near duplicates: $nearDuplicates
Invalid metadata: $invalidMetadata
Missing answer key: $missingAnswerKey
Source-fidelity failures: $sourceFidelityFailures
Quarantined: $quarantined
Final production count: $finalProductionCount
        """.trimIndent()
    }
}

object QuestionIngestionPipeline {

    private fun normalize(text: String): String {
        return text.lowercase()
            .replace(Regex("[^a-z0-9]"), "")
            .trim()
    }

    fun computeContentFingerprint(stem: String, options: List<String>): String {
        val payload = buildString {
            append(normalize(stem))
            options.forEach { opt ->
                append("|")
                append(normalize(opt))
            }
        }
        val bytes = MessageDigest.getInstance("SHA-256").digest(payload.toByteArray(Charsets.UTF_8))
        return bytes.joinToString("") { "%02x".format(it) }
    }

    fun computeSourceQuestionId(sourceDoc: String, year: String, page: Int, qNum: Int): String {
        val cleanDoc = sourceDoc.uppercase().replace(Regex("[^A-Z0-9_]"), "_")
        return "${cleanDoc}_${year}_P%03d_Q%02d".format(page, qNum)
    }

    /**
     * Ingest a batch of raw questions, running them through:
     * 1. Metadata check
     * 2. Content fidelity check
     * 3. Option structure check
     * 4. Answer key integrity & verification
     * 5. Exact & near-duplicate detection
     * 6. Quarantine isolation
     */
    fun processBatch(
        sourceName: String,
        rawList: List<RawQuestionData>,
        existingBankFingerprints: Set<String> = emptySet(),
        existingBankStems: Set<String> = emptySet()
    ): Pair<BatchIngestionReport, List<QuestionEntity>> {
        val acceptedEntities = mutableListOf<QuestionEntity>()
        val quarantinedList = mutableListOf<QuarantinedQuestion>()

        val seenFingerprints = existingBankFingerprints.toMutableSet()
        val seenStems = existingBankStems.toMutableSet()

        var exactDupCount = 0
        var nearDupCount = 0
        var invalidMetaCount = 0
        var missingAnswerCount = 0
        var sourceFidelityCount = 0

        for (raw in rawList) {
            // 1. Metadata check
            if (raw.sourceDocument.isBlank() || raw.sourceYear.isBlank() || raw.subject.isBlank() ||
                raw.pageNumber <= 0 || raw.questionNumber <= 0
            ) {
                invalidMetaCount++
                quarantinedList.add(QuarantinedQuestion(raw, "Invalid metadata"))
                continue
            }

            // 2. Content fidelity check
            if (raw.questionText.isBlank()) {
                sourceFidelityCount++
                quarantinedList.add(QuarantinedQuestion(raw, "Question stem is blank or missing"))
                continue
            }

            // 3. Option structure check
            if (raw.options.size != 4) {
                sourceFidelityCount++
                quarantinedList.add(QuarantinedQuestion(raw, "Expected exactly 4 options, found ${raw.options.size}"))
                continue
            }

            if (raw.options.any { it.isBlank() }) {
                sourceFidelityCount++
                quarantinedList.add(QuarantinedQuestion(raw, "One or more options are blank"))
                continue
            }

            val distinctNormalizedOptions = raw.options.map { normalize(it) }.distinct()
            if (distinctNormalizedOptions.size != 4) {
                sourceFidelityCount++
                quarantinedList.add(QuarantinedQuestion(raw, "Duplicate option texts detected"))
                continue
            }

            // 4. Answer key integrity
            val answerIndex = when (raw.sourceAnswerLetter?.trim()?.uppercase()) {
                "A" -> 0
                "B" -> 1
                "C" -> 2
                "D" -> 3
                else -> -1
            }

            if (answerIndex == -1) {
                missingAnswerCount++
                quarantinedList.add(QuarantinedQuestion(raw, "Missing or ambiguous answer key: ${raw.sourceAnswerLetter}"))
                continue
            }

            // 5. Duplicate checks
            val fingerprint = computeContentFingerprint(raw.questionText, raw.options)
            if (seenFingerprints.contains(fingerprint)) {
                exactDupCount++
                quarantinedList.add(QuarantinedQuestion(raw, "Exact duplicate detected by content fingerprint"))
                continue
            }

            val normStem = normalize(raw.questionText)
            if (seenStems.contains(normStem)) {
                nearDupCount++
                quarantinedList.add(QuarantinedQuestion(raw, "Near duplicate detected by matching question stem"))
                continue
            }

            // Register fingerprints & stems for batch uniqueness
            seenFingerprints.add(fingerprint)
            seenStems.add(normStem)

            val sourceQId = computeSourceQuestionId(raw.sourceDocument, raw.sourceYear, raw.pageNumber, raw.questionNumber)

            val entity = QuestionEntity(
                id = sourceQId,
                subject = raw.subject,
                topic = raw.topic,
                year = raw.sourceYear,
                questionText = raw.questionText,
                optionA = raw.options[0],
                optionB = raw.options[1],
                optionC = raw.options[2],
                optionD = raw.options[3],
                correctAnswerIndex = answerIndex,
                explanation = raw.explanation,
                difficulty = raw.difficulty,
                originType = "JAMB_ORIGINAL",
                originLabel = "Source: ${raw.sourceDocument}, Page ${raw.pageNumber}, Q${raw.questionNumber}"
            )
            acceptedEntities.add(entity)
        }

        val report = BatchIngestionReport(
            source = sourceName,
            totalExtracted = rawList.size,
            accepted = acceptedEntities.size,
            exactDuplicates = exactDupCount,
            nearDuplicates = nearDupCount,
            invalidMetadata = invalidMetaCount,
            missingAnswerKey = missingAnswerCount,
            sourceFidelityFailures = sourceFidelityCount,
            quarantined = quarantinedList.size,
            finalProductionCount = acceptedEntities.size
        )

        return Pair(report, acceptedEntities)
    }
}
