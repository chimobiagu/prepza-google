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
     * Safely shuffles the 4 options of a question and accurately remaps the correctAnswerIndex,
     * guaranteeing that the exact original correct answer text is preserved.
     * If shuffling is determined to be logically unsafe, the original option order is preserved.
     */
    fun safeRandomizeOptions(question: QuestionEntity): QuestionEntity {
        val originalOptions = listOf(
            question.optionA,
            question.optionB,
            question.optionC,
            question.optionD
        )

        val originalCorrectIndex = question.correctAnswerIndex.coerceIn(0, 3)
        val originalCorrectText = originalOptions[originalCorrectIndex]

        if (!isSafeToShuffleOptions(question)) {
            // Keep original order
            return question
        }

        // Perform safe shuffling
        val shuffledOptions = originalOptions.shuffled()
        val newCorrectIndex = shuffledOptions.indexOf(originalCorrectText)

        if (newCorrectIndex !in 0..3) {
            // Failsafe: if indexing failed for any unexpected reason, return untouched question
            return question
        }

        return question.copy(
            optionA = shuffledOptions[0],
            optionB = shuffledOptions[1],
            optionC = shuffledOptions[2],
            optionD = shuffledOptions[3],
            correctAnswerIndex = newCorrectIndex
        )
    }

    /**
     * Randomizes the options for a collection of questions safely.
     */
    fun safeRandomizeOptionList(questions: List<QuestionEntity>): List<QuestionEntity> {
        return questions.map { safeRandomizeOptions(it) }
    }
}
