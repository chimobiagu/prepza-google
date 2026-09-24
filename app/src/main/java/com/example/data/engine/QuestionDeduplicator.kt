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
        val lenDiff = Math.abs(stem1.length - stem2.length)
        val maxLen = Math.max(stem1.length, stem2.length)
        if (maxLen > 0 && lenDiff.toDouble() / maxLen > (1.0 - threshold)) return false

        val tokens1 = extractTokens(stem1)
        val tokens2 = extractTokens(stem2)
        if (tokens1.isEmpty() || tokens2.isEmpty()) return false
        if (tokens1.size < 4 && tokens2.size < 4) {
            return stem1 == stem2
        }
        return calculateJaccard(tokens1, tokens2) >= threshold
    }

    /**
     * Extracts non-trivial words (length > 1) without regex or intermediate list allocations.
     */
    fun extractTokens(text: String): Set<String> {
        if (text.isBlank()) return emptySet()
        val tokens = HashSet<String>()
        var start = -1
        for (i in 0 until text.length) {
            val c = text[i]
            if (c != ' ') {
                if (start == -1) start = i
            } else {
                if (start != -1) {
                    if (i - start > 1) {
                        tokens.add(text.substring(start, i))
                    }
                    start = -1
                }
            }
        }
        if (start != -1 && text.length - start > 1) {
            tokens.add(text.substring(start))
        }
        return tokens
    }

    /**
     * Fast Jaccard similarity calculation with zero Set allocations.
     */
    fun calculateJaccard(tokens1: Set<String>, tokens2: Set<String>): Double {
        if (tokens1.isEmpty() || tokens2.isEmpty()) return 0.0
        val minSize = Math.min(tokens1.size, tokens2.size)
        val maxSize = Math.max(tokens1.size, tokens2.size)
        if (minSize.toDouble() / maxSize < 0.70) return 0.0

        var intersection = 0
        val (smaller, larger) = if (tokens1.size <= tokens2.size) tokens1 to tokens2 else tokens2 to tokens1
        for (token in smaller) {
            if (token in larger) intersection++
        }
        val union = tokens1.size + tokens2.size - intersection
        return if (union == 0) 0.0 else intersection.toDouble() / union.toDouble()
    }

    /**
     * Filters out duplicate questions from a collection based on:
     * 1. Unique Question ID
     * 2. Canonical normalized text stem
     * 3. Content fingerprint
     * 4. High-confidence fuzzy near-duplicate stem match with length-bucketing
     */
    fun deduplicateQuestions(questions: List<QuestionEntity>): List<QuestionEntity> {
        val seenIds = HashSet<String>(questions.size)
        val seenStems = HashSet<String>(questions.size)
        val seenContentFingerprints = HashSet<String>(questions.size)
        val acceptedStemTokens = ArrayList<Pair<String, Set<String>>>()
        val uniqueList = ArrayList<QuestionEntity>(questions.size)

        for (q in questions) {
            val trimmedId = q.id.trim()
            val normStem = normalizeText(q.questionText)
            val contentFp = getContentFingerprint(q)

            if (trimmedId.isNotEmpty() && trimmedId in seenIds) {
                continue
            }
            if (normStem.isNotEmpty() && normStem in seenStems) {
                continue
            }
            if (contentFp.isNotEmpty() && contentFp in seenContentFingerprints) {
                continue
            }

            // Check fuzzy similarity against previously accepted stems with length filter
            var isFuzzyDuplicate = false
            if (normStem.length > 25) {
                var candidateTokens: Set<String>? = null
                val normLen = normStem.length
                for (i in 0 until acceptedStemTokens.size) {
                    val (existingStem, existingTokens) = acceptedStemTokens[i]
                    val lenDiff = Math.abs(normLen - existingStem.length)
                    val maxLen = Math.max(normLen, existingStem.length)
                    if (maxLen > 0 && lenDiff.toDouble() / maxLen > 0.15) {
                        continue
                    }
                    if (candidateTokens == null) {
                        candidateTokens = extractTokens(normStem)
                    }
                    if (calculateJaccard(candidateTokens, existingTokens) >= 0.88) {
                        isFuzzyDuplicate = true
                        break
                    }
                }
            }
            if (isFuzzyDuplicate) {
                continue
            }

            if (trimmedId.isNotEmpty()) seenIds.add(trimmedId)
            if (normStem.isNotEmpty()) {
                seenStems.add(normStem)
                if (normStem.length > 25) {
                    acceptedStemTokens.add(normStem to extractTokens(normStem))
                }
            }
            if (contentFp.isNotEmpty()) seenContentFingerprints.add(contentFp)
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
            var candidateTokens: Set<String>? = null
            val normLen = normStem.length
            for (existingStem in existingNormalizedTexts) {
                val lenDiff = Math.abs(normLen - existingStem.length)
                val maxLen = Math.max(normLen, existingStem.length)
                if (maxLen > 0 && lenDiff.toDouble() / maxLen > 0.15) {
                    continue
                }
                if (candidateTokens == null) {
                    candidateTokens = extractTokens(normStem)
                }
                val existingTokens = extractTokens(existingStem)
                if (calculateJaccard(candidateTokens, existingTokens) >= 0.88) {
                    return true
                }
            }
        }
        return false
    }
}
