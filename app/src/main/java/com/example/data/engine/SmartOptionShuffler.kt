package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.util.Locale

object SmartOptionShuffler {

    // Patterns indicating that option shuffling would violate semantic logic
    private val POSITIONAL_OPTION_PATTERNS = listOf(
        "all of the above",
        "none of the above",
        "both a and b",
        "both b and c",
        "both a and c",
        "both a and d",
        "either a or b",
        "neither a nor b",
        "a and b only",
        "a and c only",
        "b and c only",
        "b and d only",
        "option a",
        "option b",
        "option c",
        "option d",
        "options a",
        "options b",
        "options c",
        "options d",
        "statements i and ii",
        "statements i and iii",
        "statements ii and iii",
        "i and ii only",
        "i and iii only",
        "ii and iii only",
        "i, ii and iii",
        "i, ii, iii and iv",
        "(i) and (ii)",
        "(i) and (iii)",
        "(ii) and (iii)",
        "(i), (ii) and (iii)",
        "above mentioned",
        "the first option",
        "the above statements",
        "none of these",
        "all of these"
    )

    /**
     * Determines whether it is logically safe to randomize the 4 options of this question.
     * Returns false if options contain positional references (e.g. "All of the above", "Both A and B"),
     * or if the question stem explicitly references option letters (e.g. "Which of option A-D...").
     */
    fun isSafeToShuffleOptions(question: QuestionEntity): Boolean {
        val allOptions = listOf(question.optionA, question.optionB, question.optionC, question.optionD)

        // 1. If options are empty or have duplicates, unsafe
        if (allOptions.any { it.isBlank() } || allOptions.distinct().size != 4) {
            return false
        }

        // 2. Check each option for positional or relative phrases
        for (opt in allOptions) {
            val lower = opt.lowercase(Locale.ROOT).trim()
            if (POSITIONAL_OPTION_PATTERNS.any { pattern -> lower.contains(pattern) }) {
                return false
            }
        }

        // 3. Check question text for positional references like "Which of options A or B", "Arrange in order:"
        val lowerStem = question.questionText.lowercase(Locale.ROOT)
        if (lowerStem.contains("arrange the following in order") ||
            lowerStem.contains("which of options a and b") ||
            lowerStem.contains("option a or b") ||
            lowerStem.contains("in sequential order") ||
            lowerStem.contains("match item i with")
        ) {
            return false
        }

        return true
    }

    /**
     * Preserves canonical option order and ensures exact index fidelity between
     * QuestionEntity, Room Database, ActiveExamState, userAnswers, and CBT Review screens.
     */
    fun safeRandomizeOptions(question: QuestionEntity): QuestionEntity {
        // Preserving canonical option mapping ensures 100% data integrity between exam, review, and mistake bank
        return question
    }

    /**
     * Preserves option order for a collection of questions safely.
     */
    fun safeRandomizeOptionList(questions: List<QuestionEntity>): List<QuestionEntity> {
        return questions
    }
}
