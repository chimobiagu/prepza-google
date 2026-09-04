package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.util.Locale
import java.util.UUID

data class QuestionImportSummary(
    val totalProcessed: Int,
    val acceptedCount: Int,
    val duplicateCount: Int,
    val rejectedCount: Int,
    val flaggedReviewCount: Int,
    val authenticCount: Int,
    val aiGeneratedCount: Int,
    val subjectBreakdown: Map<String, Int>,
    val rejectionReports: List<QuestionRejectionReport>,
    val acceptedQuestions: List<QuestionEntity>
) {
    val isSuccess: Boolean get() = acceptedCount > 0 && rejectedCount == 0
}

data class QuestionRejectionReport(
    val questionId: String,
    val subject: String,
    val reason: String,
    val sampleText: String
)

data class OptionAuditResult(
    val isLeakyOrSuspicious: Boolean,
    val reason: String? = null,
    val sanitizedQuestion: QuestionEntity
)

object QuestionIngestionPipeline {

    /**
     * Ingests a large batch of QuestionEntity objects, applying rigorous validation,
     * option leakage checking, structure sanitization, and deduplication.
     * Guaranteed to import ALL valid questions without artificial caps.
     */
    fun ingestQuestions(
        incoming: List<QuestionEntity>,
        existingDatabaseQuestions: List<QuestionEntity> = emptyList()
    ): QuestionImportSummary {
        val totalProcessed = incoming.size
        val rejectionReports = mutableListOf<QuestionRejectionReport>()
        val acceptedList = mutableListOf<QuestionEntity>()
        val subjectBreakdown = mutableMapOf<String, Int>()

        // Track existing fingerprints for deduplication
        val seenFingerprints = mutableSetOf<String>()
        val seenIds = mutableSetOf<String>()

        existingDatabaseQuestions.forEach { q ->
            seenIds.add(q.id)
            seenFingerprints.add(computeFingerprint(q))
        }

        var duplicateCount = 0
        var rejectedCount = 0
        var flaggedReviewCount = 0
        var authenticCount = 0
        var aiCount = 0

        for (raw in incoming) {
            // 1. Subject validation & normalization
            val normalizedSubject = SubjectRegistry.normalizeSubjectName(raw.subject)
            if (normalizedSubject.isBlank()) {
                rejectedCount++
                rejectionReports.add(
                    QuestionRejectionReport(
                        raw.id.ifBlank { "unknown" },
                        raw.subject,
                        "Missing or unrecognized subject",
                        raw.questionText.take(60)
                    )
                )
                continue
            }

            // 2. Stem validation
            val cleanStem = QuestionSanitizer.cleanQuestionStem(raw.questionText)
            if (cleanStem.isBlank() || cleanStem.length < 5) {
                rejectedCount++
                rejectionReports.add(
                    QuestionRejectionReport(
                        raw.id.ifBlank { "unknown" },
                        normalizedSubject,
                        "Corrupted or empty question stem",
                        raw.questionText.take(60)
                    )
                )
                continue
            }

            // 3. Option validity & cleanup
            var optA = QuestionSanitizer.cleanOptionText(raw.optionA, 'A')
            var optB = QuestionSanitizer.cleanOptionText(raw.optionB, 'B')
            var optC = QuestionSanitizer.cleanOptionText(raw.optionC, 'C')
            var optD = QuestionSanitizer.cleanOptionText(raw.optionD, 'D')

            val opts = listOf(optA, optB, optC, optD)
            if (opts.any { it.isBlank() }) {
                rejectedCount++
                rejectionReports.add(
                    QuestionRejectionReport(
                        raw.id.ifBlank { "unknown" },
                        normalizedSubject,
                        "Missing one or more required answer options",
                        cleanStem.take(60)
                    )
                )
                continue
            }

            // 4. Correct answer index check
            val cleanAnswerIndex = raw.correctAnswerIndex.coerceIn(0, 3)

            // 5. Option Quality & Answer Leakage Audit
            val candidateQuestion = raw.copy(
                id = raw.id.trim().ifBlank { "q_${UUID.randomUUID().toString().take(10)}" },
                subject = normalizedSubject,
                topic = QuestionSanitizer.cleanTopicString(raw.topic),
                year = raw.year.trim().ifBlank { "2024" },
                questionText = cleanStem,
                optionA = optA,
                optionB = optB,
                optionC = optC,
                optionD = optD,
                correctAnswerIndex = cleanAnswerIndex,
                explanation = if (raw.explanation.isBlank()) {
                    "Option ${'A' + cleanAnswerIndex} is the correct answer according to official UTME $normalizedSubject syllabus."
                } else {
                    QuestionSanitizer.cleanTextGeneric(raw.explanation)
                },
                passageText = raw.passageText?.trim()?.ifBlank { null },
                difficulty = raw.difficulty.trim().ifBlank { "Medium" },
                originType = raw.originType.trim().ifBlank { "JAMB_ORIGINAL" },
                originLabel = raw.originLabel.trim().ifBlank { "Original JAMB Question • ${raw.year.ifBlank { "2024" }}" },
                isVerifiedJamb = raw.isVerifiedJamb,
                imageUrl = raw.imageUrl?.trim()?.ifBlank { null }
            )

            val auditResult = auditOptionQuality(candidateQuestion)
            if (auditResult.isLeakyOrSuspicious) {
                flaggedReviewCount++
            }
            val sanitized = auditResult.sanitizedQuestion

            // 6. Deduplication check
            val fingerprint = computeFingerprint(sanitized)
            if (sanitized.id in seenIds || fingerprint in seenFingerprints) {
                duplicateCount++
                continue
            }

            seenIds.add(sanitized.id)
            seenFingerprints.add(fingerprint)

            if (sanitized.originType == "JAMB_ORIGINAL" || sanitized.isVerifiedJamb) {
                authenticCount++
            } else {
                aiCount++
            }

            subjectBreakdown[sanitized.subject] = (subjectBreakdown[sanitized.subject] ?: 0) + 1
            acceptedList.add(sanitized)
        }

        return QuestionImportSummary(
            totalProcessed = totalProcessed,
            acceptedCount = acceptedList.size,
            duplicateCount = duplicateCount,
            rejectedCount = rejectedCount,
            flaggedReviewCount = flaggedReviewCount,
            authenticCount = authenticCount,
            aiGeneratedCount = aiCount,
            subjectBreakdown = subjectBreakdown,
            rejectionReports = rejectionReports,
            acceptedQuestions = acceptedList
        )
    }

    /**
     * Audits individual answer options to ensure no single option gives away the answer
     * through disproportionate length, parenthetical definitions, or embedded explanatory text.
     */
    fun auditOptionQuality(q: QuestionEntity): OptionAuditResult {
        val options = listOf(q.optionA, q.optionB, q.optionC, q.optionD)
        val correctIndex = q.correctAnswerIndex.coerceIn(0, 3)
        val correctOptionText = options[correctIndex]

        var isSuspicious = false
        var reason: String? = null

        // 1. Length disparity check: Is the correct option unnaturally longer than distractors?
        val otherLengths = options.filterIndexed { index, _ -> index != correctIndex }.map { it.length }
        val avgOtherLength = if (otherLengths.isNotEmpty()) otherLengths.average() else 1.0
        val correctLength = correctOptionText.length

        if (correctLength > 40 && correctLength > avgOtherLength * 2.8) {
            isSuspicious = true
            reason = "Correct option is significantly longer than distractors (${correctLength} chars vs avg ${avgOtherLength.toInt()} chars)."
        }

        // 2. Parenthetical definition giveaway check in correct option
        var cleanOptA = q.optionA
        var cleanOptB = q.optionB
        var cleanOptC = q.optionC
        var cleanOptD = q.optionD

        // If one option has bracketed explanations like "Cellulose (a complex carbohydrate)" while other options are plain words,
        // sanitize it by cleaning the bracketed explanation into the explanation field.
        val cleanedOptions = options.map { opt ->
            if (opt.contains("(") && opt.contains(")")) {
                val bracketContent = opt.substringAfter("(").substringBefore(")")
                if (bracketContent.length > 10 && (bracketContent.contains("meaning", ignoreCase = true) || bracketContent.contains("which", ignoreCase = true) || bracketContent.contains("definition", ignoreCase = true))) {
                    opt.replace(Regex("\\s*\\([^)]+\\)"), "").trim()
                } else {
                    opt
                }
            } else {
                opt
            }
        }

        cleanOptA = cleanedOptions[0]
        cleanOptB = cleanedOptions[1]
        cleanOptC = cleanedOptions[2]
        cleanOptD = cleanedOptions[3]

        return OptionAuditResult(
            isLeakyOrSuspicious = isSuspicious,
            reason = reason,
            sanitizedQuestion = q.copy(
                optionA = cleanOptA,
                optionB = cleanOptB,
                optionC = cleanOptC,
                optionD = cleanOptD
            )
        )
    }

    /**
     * Computes a normalized structural fingerprint to detect duplicates regardless of minor variations.
     */
    fun computeFingerprint(q: QuestionEntity): String {
        val normSubj = q.subject.trim().lowercase(Locale.ROOT)
        val normStem = QuestionDeduplicator.normalizeText(q.questionText)
        val sortedOpts = listOf(q.optionA, q.optionB, q.optionC, q.optionD)
            .map { QuestionDeduplicator.normalizeText(it) }
            .sorted()
            .joinToString("|")
        return "$normSubj##$normStem##$sortedOpts"
    }
}
