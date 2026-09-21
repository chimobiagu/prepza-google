package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.util.Locale

object CbtQualityController {

    /**
     * Inspects a candidate list of CBT questions and produces a detailed Quality Control Report.
     */
    fun inspectExam(
        questions: List<QuestionEntity>,
        expectedTotalCount: Int,
        expectedSubjectCounts: Map<String, Int>
    ): CbtQualityReport {
        val issues = mutableListOf<String>()
        val seenIds = mutableSetOf<String>()
        val seenStems = mutableSetOf<String>()

        var duplicateCount = 0
        var corruptedCount = 0
        var invalidAnswerIndices = 0
        var invalidOptionCounts = 0
        var missingPassages = 0
        var authenticCount = 0
        var aiCount = 0

        val actualSubjectCounts = mutableMapOf<String, Int>()

        for ((idx, q) in questions.withIndex()) {
            actualSubjectCounts[q.subject] = (actualSubjectCounts[q.subject] ?: 0) + 1

            // Check Authenticity tagging
            if (q.originType == "JAMB_ORIGINAL" || q.isVerifiedJamb) {
                authenticCount++
            } else {
                aiCount++
            }

            // 1. Duplicate check (ID and normalized text)
            val normStem = QuestionDeduplicator.normalizeText(q.questionText)
            if (q.id in seenIds || normStem in seenStems) {
                duplicateCount++
                issues.add("Question #${idx + 1} ('${q.id}') is a duplicate stem or ID.")
            } else {
                seenIds.add(q.id)
                seenStems.add(normStem)
            }

            // 2. Corrupted / blank text check
            if (q.questionText.isBlank() || q.questionText.length < 5) {
                corruptedCount++
                issues.add("Question #${idx + 1} has blank or corrupted question text.")
            }

            // 3. Correct answer index validity
            if (q.correctAnswerIndex !in 0..3) {
                invalidAnswerIndices++
                issues.add("Question #${idx + 1} has invalid correctAnswerIndex: ${q.correctAnswerIndex}")
            }

            // 4. Distinct 4 valid options check
            val opts = listOf(q.optionA, q.optionB, q.optionC, q.optionD)
            if (opts.any { it.isBlank() } || opts.distinctBy { it.trim().lowercase(Locale.ROOT) }.size != 4) {
                invalidOptionCounts++
                issues.add("Question #${idx + 1} does not have 4 distinct, non-empty options.")
            }

            // 5. Comprehension passage check
            if (CbtBlueprint.isComprehensionQuestion(q)) {
                val hasPassage = !q.passageText.isNullOrBlank() ||
                        q.questionText.contains("Passage", ignoreCase = true) ||
                        q.explanation.contains("Passage", ignoreCase = true)
                if (!hasPassage) {
                    missingPassages++
                    issues.add("Comprehension question #${idx + 1} is missing reference passage context.")
                }
            }

            // 6. Metadata check
            if (q.subject.isBlank() || q.topic.isBlank()) {
                corruptedCount++
                issues.add("Question #${idx + 1} has missing subject or topic metadata.")
            }
        }

        // Subject count checks
        expectedSubjectCounts.forEach { (subject, expectedCount) ->
            val actualCount = actualSubjectCounts[subject] ?: 0
            if (actualCount != expectedCount) {
                issues.add("Subject '$subject' count mismatch: expected $expectedCount, found $actualCount.")
            }
        }

        val totalMatches = questions.size == expectedTotalCount
        val isValid = totalMatches &&
                issues.isEmpty() &&
                duplicateCount == 0 &&
                corruptedCount == 0 &&
                invalidAnswerIndices == 0 &&
                invalidOptionCounts == 0

        return CbtQualityReport(
            isValid = isValid,
            totalQuestions = questions.size,
            expectedQuestions = expectedTotalCount,
            subjectCounts = actualSubjectCounts,
            duplicateCount = duplicateCount,
            corruptedCount = corruptedCount,
            invalidAnswerIndices = invalidAnswerIndices,
            invalidOptionCounts = invalidOptionCounts,
            missingPassages = missingPassages,
            authenticCount = authenticCount,
            aiGeneratedCount = aiCount,
            validationIssues = issues
        )
    }

    /**
     * Validates whether a single question is structurally valid and free of corruption.
     */
    fun isQuestionStructurallyValid(q: QuestionEntity): Boolean {
        if (q.questionText.isBlank() || q.questionText.length < 5) return false
        if (q.correctAnswerIndex !in 0..3) return false
        val opts = listOf(q.optionA, q.optionB, q.optionC, q.optionD)
        if (opts.any { it.isBlank() }) return false
        if (opts.distinctBy { it.trim().lowercase(Locale.ROOT) }.size != 4) return false
        if (q.subject.isBlank()) return false
        return true
    }

    /**
     * Repairs and heals a generated question set by removing any corrupted or duplicate items
     * and substituting with clean candidates from the available pool or validated fallback engine.
     */
    fun autoRepairSection(
        subject: String,
        targetCount: Int,
        currentQuestions: List<QuestionEntity>,
        replacementPool: List<QuestionEntity>,
        excludedIds: Set<String>,
        excludedStems: Set<String>
    ): List<QuestionEntity> {
        val validList = mutableListOf<QuestionEntity>()
        val seenIds = excludedIds.toMutableSet()
        val seenStems = excludedStems.toMutableSet()

        // 1. Keep structurally valid, non-duplicate questions
        for (q in currentQuestions) {
            val normStem = QuestionDeduplicator.normalizeText(q.questionText)
            if (isQuestionStructurallyValid(q) && q.id !in seenIds && normStem !in seenStems) {
                validList.add(q)
                seenIds.add(q.id)
                seenStems.add(normStem)
            }
            if (validList.size >= targetCount) break
        }

        // 2. If short, fill from replacement pool
        if (validList.size < targetCount) {
            for (candidate in replacementPool) {
                if (candidate.subject.equals(subject, ignoreCase = true)) {
                    val normStem = QuestionDeduplicator.normalizeText(candidate.questionText)
                    if (isQuestionStructurallyValid(candidate) && candidate.id !in seenIds && normStem !in seenStems) {
                        validList.add(candidate)
                        seenIds.add(candidate.id)
                        seenStems.add(normStem)
                    }
                }
                if (validList.size >= targetCount) break
            }
        }

        // 3. If still short, generate syllabus fallback questions
        var seed = 0
        while (validList.size < targetCount) {
            val fallback = PrepzaAiQuestionEngine.generateFallbackQuestion(
                subject = subject,
                indexSeed = seed++
            )
            val normStem = QuestionDeduplicator.normalizeText(fallback.questionText)
            if (fallback.id !in seenIds && normStem !in seenStems) {
                validList.add(fallback)
                seenIds.add(fallback.id)
                seenStems.add(normStem)
            }
        }

        return validList.take(targetCount)
    }
}
