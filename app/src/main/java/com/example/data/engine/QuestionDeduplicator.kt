package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.util.Locale

object QuestionDeduplicator {

    /**
     * Normalizes raw question text into a canonical stem for reliable duplicate detection,
     * stripping numbering prefixes, markdown syntax, typographic punctuation variations,
     * and irregular whitespace.
     */
    fun normalizeText(rawText: String): String {
        if (rawText.isBlank()) return ""

        var text = rawText.lowercase(Locale.ROOT).trim()

        // 1. Strip leading question number indicators like "1.", "Q1:", "Question 1.", "(1)"
        text = text.replace(Regex("^(\\d{1,3}[.)\\-:]|q\\d{1,3}[.:]|question\\s+\\d{1,3}[.:])\\s*"), "")

        // 2. Strip Markdown formatting
        text = text.replace(Regex("[*_{}`#\\[\\]]"), " ")

        // 3. Normalize quotes and apostrophes
        text = text.replace('“', '"')
            .replace('”', '"')
            .replace('‘', '\'')
            .replace('’', '\'')
            .replace('`', '\'')
            .replace('—', '-')
            .replace('–', '-')

        // 4. Remove excessive punctuation while preserving basic alphanumeric characters and math symbols
        text = text.replace(Regex("[^a-z0-9+\\-*/=^√%° ]"), " ")

        // 5. Compress multiple whitespace/newline blocks into single spaces
        text = text.replace(Regex("\\s+"), " ").trim()

        return text
    }

    /**
     * Generates a structural fingerprint representing the question stem and its 4 options.
     */
    fun getQuestionFingerprint(question: QuestionEntity): String {
        val normStem = normalizeText(question.questionText)
        val normSubject = question.subject.trim().lowercase(Locale.ROOT)
        return "$normSubject::$normStem"
    }

    /**
     * Filters out duplicate questions from a collection based on:
     * 1. Unique Question ID
     * 2. Canonical normalized text stem
     * 3. Question fingerprint
     */
    fun deduplicateQuestions(questions: List<QuestionEntity>): List<QuestionEntity> {
        val seenIds = mutableSetOf<String>()
        val seenFingerprints = mutableSetOf<String>()
        val uniqueList = mutableListOf<QuestionEntity>()

        for (q in questions) {
            val trimmedId = q.id.trim()
            val fingerprint = getQuestionFingerprint(q)

            if (trimmedId.isNotBlank() && trimmedId in seenIds) {
                continue
            }
            if (fingerprint.isNotBlank() && fingerprint in seenFingerprints) {
                continue
            }

            if (trimmedId.isNotBlank()) seenIds.add(trimmedId)
            if (fingerprint.isNotBlank()) seenFingerprints.add(fingerprint)
            uniqueList.add(q)
        }

        return uniqueList
    }

    /**
     * Checks if a candidate question is a duplicate against existing active sets of IDs and normalized texts.
     */
    fun isDuplicate(
        candidate: QuestionEntity,
        existingIds: Set<String>,
        existingNormalizedTexts: Set<String>
    ): Boolean {
        if (candidate.id in existingIds) return true
        val normStem = normalizeText(candidate.questionText)
        if (normStem in existingNormalizedTexts) return true
        return false
    }
}
