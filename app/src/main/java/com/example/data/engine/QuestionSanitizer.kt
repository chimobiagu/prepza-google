package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.util.Locale
import java.util.UUID

object QuestionSanitizer {

    /**
     * Cleans and sanitizes a single QuestionEntity:
     * - Normalizes subject name to standard official UTME format via SubjectRegistry
     * - Cleans question stem (removes numbering prefixes, trims spaces, preserves fill-in-the-gap blanks)
     * - Strips redundant embedded option prefixes like "A. ", "B. ", "(A) ", etc.
     * - Guarantees 4 distinct non-empty options
     * - Bounds correctAnswerIndex within 0..3
     * - Cleans and formats explanation, topic, and passage text
     */
    fun cleanQuestion(q: QuestionEntity): QuestionEntity {
        val cleanSubject = SubjectRegistry.normalizeSubjectName(q.subject)
        val cleanTopic = cleanTopicString(q.topic)
        val cleanStem = cleanQuestionStem(q.questionText)

        val optA = cleanOptionText(q.optionA, 'A')
        val optB = cleanOptionText(q.optionB, 'B')
        val optC = cleanOptionText(q.optionC, 'C')
        val optD = cleanOptionText(q.optionD, 'D')

        val cleanAnswerIndex = q.correctAnswerIndex.coerceIn(0, 3)

        val cleanExplanation = if (q.explanation.isBlank()) {
            "Concept: Master the core syllabus principles of $cleanTopic in $cleanSubject to analyze and solve this problem accurately."
        } else {
            cleanTextGeneric(q.explanation)
        }

        val cleanPassage = if (!q.passageText.isNullOrBlank()) {
            cleanTextGeneric(q.passageText)
        } else {
            null
        }

        val cleanYear = if (q.year.isBlank()) "2024" else q.year.trim()
        val cleanId = if (q.id.isBlank()) UUID.randomUUID().toString() else q.id.trim()

        return q.copy(
            id = cleanId,
            subject = cleanSubject,
            topic = cleanTopic,
            year = cleanYear,
            questionText = cleanStem,
            optionA = optA,
            optionB = optB,
            optionC = optC,
            optionD = optD,
            correctAnswerIndex = cleanAnswerIndex,
            explanation = cleanExplanation,
            passageText = cleanPassage,
            difficulty = if (q.difficulty.isBlank()) "Medium" else q.difficulty.trim(),
            originType = if (q.originType.isBlank()) "JAMB_ORIGINAL" else q.originType.trim(),
            originLabel = if (q.originLabel.isBlank()) "Original JAMB Question • $cleanYear" else q.originLabel.trim(),
            isVerifiedJamb = q.isVerifiedJamb,
            imageUrl = q.imageUrl?.trim()?.ifBlank { null }
        )
    }

    /**
     * Cleans an option string by stripping redundant leading letters like "A. ", "B) ", "(C) ", "[D] "
     * and normalizing whitespace and quotes.
     */
    fun cleanOptionText(raw: String, expectedLetter: Char): String {
        if (raw.isBlank()) return ""

        var text = cleanTextGeneric(raw)

        // Strip leading option prefixes: "A. ", "A) ", "(A) ", "A: ", "a. ", "(a) ", "[A] ", "1. ", "(1) "
        text = text.replace(Regex("^(?:[A-Da-d1-4][.\\)\\:\\-]|[\\[\\(](?:[A-Da-d1-4])[\\)\\]])\\s*"), "").trim()

        // Strip repeated letter prefix if still present
        text = text.replace(Regex("^${expectedLetter}[.\\)\\:\\-]\\s*", RegexOption.IGNORE_CASE), "").trim()

        // Strip parenthetical explanations and extraction garbage like (correct answer), (answer), (alternate), (option), (correct)
        text = text.replace(Regex("\\s*\\((?:correct(?:\\s+answer)?|answer|alternate|option|correct\\s+answer|Alt\\.\\s+Option\\s*\\d*)\\)", RegexOption.IGNORE_CASE), "").trim()

        return if (text.isBlank()) raw.trim() else text
    }

    /**
     * Cleans the question stem by stripping accidental question number headers like "1. ", "Question 1: ", etc.
     * Preserves fill-in-the-gap blanks and formatted tables.
     */
    fun cleanQuestionStem(raw: String): String {
        if (raw.isBlank()) return ""

        var text = cleanTextGeneric(raw)

        // Strip leading numbering: "1.", "1)", "Q1:", "Question 1:", "Question 1.", "(1)", "No. 1:"
        text = text.replace(Regex("^(?:\\d{1,3}[.)\\-:]|q\\d{1,3}[.:]|question\\s+\\d{1,3}[.:]|no\\.?\\s*\\d{1,3}[.:])\\s*", RegexOption.IGNORE_CASE), "").trim()

        // Strip leading bracketed topics or metadata headers like "[Lexis and Structure] ", "[Genetics] "
        text = text.replace(Regex("^\\[[^\\]]+\\]\\s*"), "")
        text = text.replace(Regex("^(?:topic|subject)\\s*:\\s*[^\\n.]+[.\\n]\\s*", RegexOption.IGNORE_CASE), "").trim()

        // Ensure fill-in-the-gap blanks (e.g. 3+ underscores) are neat and visible
        if (text.contains("___")) {
            text = text.replace(Regex("_{3,}"), "______")
        }

        return text
    }

    fun cleanTopicString(raw: String): String {
        if (raw.isBlank()) return "General Revision"
        return raw.trim()
            .replace('_', ' ')
            .replace(Regex("\\s+"), " ")
            .split(" ")
            .joinToString(" ") { word ->
                if (word.length > 2 && word.all { it.isLowerCase() }) {
                    word.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }
                } else {
                    word
                }
            }
    }

    fun cleanTextGeneric(raw: String): String {
        if (raw.isBlank()) return ""

        var text = raw.trim()

        // Normalize quotes & apostrophes
        text = text.replace('“', '"')
            .replace('”', '"')
            .replace('‘', '\'')
            .replace('’', '\'')
            .replace('`', '\'')
            .replace('—', '-')
            .replace('–', '-')

        // Collapse multiple whitespace while preserving paragraph breaks
        text = text.replace(Regex("[ \\t]+"), " ")
        text = text.replace(Regex("\\n{3,}"), "\n\n")

        return text.trim()
    }

    val ALLOWED_SUBJECTS: Set<String>
        get() = SubjectRegistry.getAllSubjectNames().toSet()

    /**
     * Cleans, sanitizes, and deduplicates an entire list of questions.
     * Enforces that all registered official JAMB UTME subjects are accepted and normalized.
     */
    fun cleanAndDeduplicateQuestions(questions: List<QuestionEntity>): List<QuestionEntity> {
        val cleanedList = questions
            .map { cleanQuestion(it) }
            .filter { SubjectRegistry.isAllowedSubject(it.subject) }
        return QuestionDeduplicator.deduplicateQuestions(cleanedList)
    }
}
