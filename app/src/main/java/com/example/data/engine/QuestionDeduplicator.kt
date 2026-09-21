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

        // 1. Strip leading question number indicators like "1.", "Q1:", "Question 1.", "(1)", "No. 5"
        text = text.replace(Regex("^(\\d{1,3}[.)\\-:]|q\\d{1,3}[.:]|question\\s+\\d{1,3}[.:]|no\\.?\\s*\\d{1,3}[.:])\\s*"), "")

        // 2. Strip Markdown formatting
        text = text.replace(Regex("[*_{}`#\\[\\]]"), " ")

        // 3. Normalize quotes, apostrophes, dashes and hyphens
        text = text.replace('“', '"')
            .replace('”', '"')
            .replace('‘', '\'')
            .replace('’', '\'')
            .replace('`', '\'')
            .replace('—', '-')
            .replace('–', '-')
            .replace('−', '-')

        // 4. Remove excessive punctuation while preserving basic alphanumeric characters and essential math symbols
        text = text.replace(Regex("[^a-z0-9+\\-*/=^√%° ]"), " ")

        // 5. Compress multiple whitespace/newline blocks into single spaces
        text = text.replace(Regex("\\s+"), " ").trim()

        return text
    }

    /**
     * Generates a structural fingerprint representing the question subject and normalized stem.
     */
    fun getQuestionFingerprint(question: QuestionEntity): String {
        val normStem = normalizeText(question.questionText)
        val normSubject = question.subject.trim().lowercase(Locale.ROOT)
        return "$normSubject::$normStem"
    }

    /**
     * Generates a comprehensive content fingerprint combining subject, normalized stem,
     * normalized options and correct answer index.
     */
    fun getContentFingerprint(question: QuestionEntity): String {
        val normStem = normalizeText(question.questionText)
        val normSubject = question.subject.trim().lowercase(Locale.ROOT)
        val normOptA = normalizeText(question.optionA)
        val normOptB = normalizeText(question.optionB)
        val normOptC = normalizeText(question.optionC)
        val normOptD = normalizeText(question.optionD)
        val sortedOpts = listOf(normOptA, normOptB, normOptC, normOptD).sorted().joinToString("|")
        return "$normSubject::$normStem::$sortedOpts::ans=${question.correctAnswerIndex}"
    }

    /**
     * Checks if two normalized stems are near duplicates by computing token-level Jaccard similarity.
     */
    fun isNearDuplicateStem(stem1: String, stem2: String, threshold: Double = 0.85): Boolean {
        if (stem1 == stem2) return true
        if (stem1.isBlank() || stem2.isBlank()) return false
        val tokens1 = stem1.split(" ").filter { it.length > 1 }.toSet()
        val tokens2 = stem2.split(" ").filter { it.length > 1 }.toSet()
        if (tokens1.isEmpty() || tokens2.isEmpty()) return false
        if (tokens1.size < 4 && tokens2.size < 4) {
            return stem1 == stem2
        }
        val intersectionSize = tokens1.intersect(tokens2).size
        val unionSize = tokens1.union(tokens2).size
        val similarity = intersectionSize.toDouble() / unionSize.toDouble()
        return similarity >= threshold
    }

    /**
     * Filters out duplicate questions from a collection based on:
     * 1. Unique Question ID
     * 2. Canonical normalized text stem
     * 3. Content fingerprint
     * 4. High-confidence fuzzy near-duplicate stem match
     */
    fun deduplicateQuestions(questions: List<QuestionEntity>): List<QuestionEntity> {
        val seenIds = mutableSetOf<String>()
        val seenStems = mutableSetOf<String>()
        val seenContentFingerprints = mutableSetOf<String>()
        val uniqueList = mutableListOf<QuestionEntity>()

        for (q in questions) {
            val trimmedId = q.id.trim()
            val normStem = normalizeText(q.questionText)
            val contentFp = getContentFingerprint(q)

            if (trimmedId.isNotBlank() && trimmedId in seenIds) {
                continue
            }
            if (normStem.isNotBlank() && normStem in seenStems) {
                continue
            }
            if (contentFp.isNotBlank() && contentFp in seenContentFingerprints) {
                continue
            }

            // Check fuzzy similarity against previously accepted stems in the same subject
            var isFuzzyDuplicate = false
            if (normStem.length > 25) {
                for (existingStem in seenStems) {
                    if (isNearDuplicateStem(normStem, existingStem, threshold = 0.88)) {
                        isFuzzyDuplicate = true
                        break
                    }
                }
            }
            if (isFuzzyDuplicate) {
                continue
            }

            if (trimmedId.isNotBlank()) seenIds.add(trimmedId)
            if (normStem.isNotBlank()) seenStems.add(normStem)
            if (contentFp.isNotBlank()) seenContentFingerprints.add(contentFp)
            uniqueList.add(q)
        }

        return uniqueList
    }

    /**
     * Checks if a candidate question is a duplicate or near-duplicate against existing active sets.
     */
    fun isDuplicate(
        candidate: QuestionEntity,
        existingIds: Set<String>,
        existingNormalizedTexts: Set<String>
    ): Boolean {
        if (candidate.id.trim() in existingIds) return true
        val normStem = normalizeText(candidate.questionText)
        if (normStem in existingNormalizedTexts) return true
        if (normStem.length > 25) {
            for (existingStem in existingNormalizedTexts) {
                if (isNearDuplicateStem(normStem, existingStem, threshold = 0.88)) {
                    return true
                }
            }
        }
        return false
    }
}
