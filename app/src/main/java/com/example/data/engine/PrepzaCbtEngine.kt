package com.example.data.engine

import com.example.data.db.QuestionEntity
import com.example.data.db.QuestionExposureEntity
import com.example.data.repository.QuestionBankGenerator

object PrepzaCbtEngine {

    /**
     * Generates a Standard 180-Question Full CBT Examination:
     * - English Language (Compulsory): exactly 60 questions
     * - Elective 1: exactly 40 questions
     * - Elective 2: exactly 40 questions
     * - Elective 3: exactly 40 questions
     * Total: exactly 180 questions | 2 Hours
     *
     * Adheres strictly to:
     * 1. Authentic question selection with preserved metadata
     * 2. Strict non-repetition (content-based & ID-based deduplication)
     * 3. Exposure prioritization (unseen first, then least-recently-seen)
     * 4. Smart topic & difficulty randomisation
     * 5. Logically safe option shuffling
     * 6. Pre-CBT Quality Control validation & auto-healing
     */
    fun generateFullCbtExam(
        userSubjects: List<String>,
        availablePool: List<QuestionEntity>,
        userExposures: List<QuestionExposureEntity> = emptyList(),
        excludedSessionIds: Set<String> = emptySet()
    ): List<QuestionEntity> {
        val compulsory = "English Language"
        val normalizedUserSubjects = userSubjects.map { QuestionBankGenerator.normalizeSubjectName(it.trim()) }
            .filter { it.isNotBlank() }
            .distinct()

        // Ensure 3 distinct elective subjects
        val electives = normalizedUserSubjects.filter { !it.equals(compulsory, ignoreCase = true) }.take(3).toMutableList()
        val defaultFallbacks = listOf(
            "Mathematics", "Physics", "Chemistry", "Biology", "Economics",
            "Government", "Literature in English", "CRS", "Commerce",
            "Principles of Accounts", "Geography", "History", "Islamic Religious Studies (IRS)"
        )
        for (fallback in defaultFallbacks) {
            if (electives.size >= 3) break
            if (!electives.contains(fallback) && !fallback.equals(compulsory, ignoreCase = true)) {
                electives.add(fallback)
            }
        }

        val exposureMap = userExposures.associateBy { it.questionId }
        val runningExcludedIds = excludedSessionIds.toMutableSet()
        val runningExcludedStems = mutableSetOf<String>()

        val fullExamQuestions = mutableListOf<QuestionEntity>()

        // 1. English Section: Exactly 60 Questions
        val englishSection = generateSubjectSection(
            subject = compulsory,
            targetCount = CbtBlueprint.ENGLISH_MANDATORY_COUNT,
            availablePool = availablePool,
            exposureMap = exposureMap,
            excludedIds = runningExcludedIds,
            excludedStems = runningExcludedStems
        )
        fullExamQuestions.addAll(englishSection)
        runningExcludedIds.addAll(englishSection.map { it.id })
        runningExcludedStems.addAll(englishSection.map { QuestionDeduplicator.normalizeText(it.questionText) })

        // 2. The 3 Elective Sections: Exactly 40 Questions each
        for (elective in electives) {
            val electiveSection = generateSubjectSection(
                subject = elective,
                targetCount = CbtBlueprint.ELECTIVE_STANDARD_COUNT,
                availablePool = availablePool,
                exposureMap = exposureMap,
                excludedIds = runningExcludedIds,
                excludedStems = runningExcludedStems
            )
            fullExamQuestions.addAll(electiveSection)
            runningExcludedIds.addAll(electiveSection.map { it.id })
            runningExcludedStems.addAll(electiveSection.map { QuestionDeduplicator.normalizeText(it.questionText) })
        }

        // 3. Pre-CBT Quality Control Verification
        val expectedSubjectCounts = mutableMapOf(compulsory to CbtBlueprint.ENGLISH_MANDATORY_COUNT)
        electives.forEach { expectedSubjectCounts[it] = CbtBlueprint.ELECTIVE_STANDARD_COUNT }

        val qualityReport = CbtQualityController.inspectExam(
            questions = fullExamQuestions,
            expectedTotalCount = CbtBlueprint.TOTAL_CBT_QUESTIONS,
            expectedSubjectCounts = expectedSubjectCounts
        )

        // 4. If any section needs repair, perform targeted healing
        val finalExam = if (!qualityReport.isValid) {
            healExam(fullExamQuestions, expectedSubjectCounts, availablePool)
        } else {
            fullExamQuestions
        }

        return finalExam
    }

    /**
     * Generates a Mini CBT Session of diverse, non-repeating questions for a single subject.
     */
    fun generateMiniCbtExam(
        subject: String,
        targetCount: Int = CbtBlueprint.MINI_CBT_QUESTIONS,
        availablePool: List<QuestionEntity>,
        userExposures: List<QuestionExposureEntity> = emptyList(),
        excludedSessionIds: Set<String> = emptySet()
    ): List<QuestionEntity> {
        val normSubject = QuestionBankGenerator.normalizeSubjectName(subject)
        val exposureMap = userExposures.associateBy { it.questionId }
        val excludedIds = excludedSessionIds.toMutableSet()
        val excludedStems = mutableSetOf<String>()

        val questions = generateSubjectSection(
            subject = normSubject,
            targetCount = targetCount,
            availablePool = availablePool,
            exposureMap = exposureMap,
            excludedIds = excludedIds,
            excludedStems = excludedStems
        )

        val report = CbtQualityController.inspectExam(
            questions = questions,
            expectedTotalCount = targetCount,
            expectedSubjectCounts = mapOf(normSubject to targetCount)
        )

        return if (!report.isValid) {
            CbtQualityController.autoRepairSection(
                subject = normSubject,
                targetCount = targetCount,
                currentQuestions = questions,
                replacementPool = availablePool,
                excludedIds = excludedSessionIds,
                excludedStems = emptySet()
            )
        } else {
            questions
        }
    }

    /**
     * Generates an individual subject section with authentic balance, weighted exposure tracking,
     * topic breadth, and safe option shuffling using [CbtWeightedRandomizer].
     */
    private fun generateSubjectSection(
        subject: String,
        targetCount: Int,
        availablePool: List<QuestionEntity>,
        exposureMap: Map<String, QuestionExposureEntity>,
        excludedIds: Set<String>,
        excludedStems: Set<String>
    ): List<QuestionEntity> {
        // 1. Gather all candidates from database pool + verified static question banks
        val subjectPool = availablePool.filter { it.subject.equals(subject, ignoreCase = true) }
            .ifEmpty { QuestionBankGenerator.getAllSeedQuestions().filter { it.subject.equals(subject, ignoreCase = true) } }

        // 2. Run Weighted Randomizer Algorithm with 'last seen' tracking & authenticity weighting
        val selected = CbtWeightedRandomizer.selectWeightedQuestions(
            subject = subject,
            targetCount = targetCount,
            pool = subjectPool,
            exposures = exposureMap,
            excludedIds = excludedIds,
            excludedStems = excludedStems
        ).toMutableList()

        val currentIds = (excludedIds + selected.map { it.id }).toMutableSet()
        val currentStems = (excludedStems + selected.map { QuestionDeduplicator.normalizeText(it.questionText) }).toMutableSet()

        // 3. If authentic candidates are completely exhausted, use controlled syllabus fallback
        var fallbackSeed = 0
        while (selected.size < targetCount) {
            val fallback = PrepzaAiQuestionEngine.generateFallbackQuestion(
                subject = subject,
                indexSeed = fallbackSeed++
            )
            val stem = QuestionDeduplicator.normalizeText(fallback.questionText)
            if (fallback.id !in currentIds && stem !in currentStems) {
                selected.add(fallback)
                currentIds.add(fallback.id)
                currentStems.add(stem)
            }
        }

        // 4. Randomize question order and safely randomize option mapping
        val finalShuffled = selected.take(targetCount).shuffled()
        return SmartOptionShuffler.safeRandomizeOptionList(finalShuffled)
    }

    /**
     * Performs healing on an entire exam by auto-repairing each subject section.
     */
    private fun healExam(
        rawQuestions: List<QuestionEntity>,
        expectedCounts: Map<String, Int>,
        availablePool: List<QuestionEntity>
    ): List<QuestionEntity> {
        val healedExam = mutableListOf<QuestionEntity>()
        val excludedIds = mutableSetOf<String>()
        val excludedStems = mutableSetOf<String>()

        expectedCounts.forEach { (subject, count) ->
            val sectionQuestions = rawQuestions.filter { it.subject.equals(subject, ignoreCase = true) }
            val repairedSection = CbtQualityController.autoRepairSection(
                subject = subject,
                targetCount = count,
                currentQuestions = sectionQuestions,
                replacementPool = availablePool,
                excludedIds = excludedIds,
                excludedStems = excludedStems
            )
            healedExam.addAll(repairedSection)
            excludedIds.addAll(repairedSection.map { it.id })
            excludedStems.addAll(repairedSection.map { QuestionDeduplicator.normalizeText(it.questionText) })
        }

        return healedExam
    }
}
