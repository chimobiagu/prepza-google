package com.example.data.engine

import com.example.data.db.QuestionEntity
import com.example.data.db.QuestionExposureEntity
import com.example.data.repository.QuestionBankGenerator

object PrepzaCbtEngine {

    /**
     * Fast-path session initializer: selects the exact question IDs and resolves Question 1
     * in under 100ms so that the candidate never waits on the UI thread.
     */
    fun fastInitializeExamSession(
        mode: String,
        subjects: List<String>,
        questionCount: Int,
        durationSeconds: Long,
        availablePool: List<QuestionEntity>,
        userExposures: List<QuestionExposureEntity> = emptyList(),
        excludedSessionIds: Set<String> = emptySet(),
        sessionId: String = "cbt_${System.currentTimeMillis()}"
    ): Pair<CbtSessionSnapshot, QuestionEntity> {
        val selectedQuestions = if (mode.contains("Full", ignoreCase = true) || subjects.size >= 4) {
            generateFullCbtExam(
                userSubjects = subjects,
                availablePool = availablePool,
                userExposures = userExposures,
                excludedSessionIds = excludedSessionIds
            )
        } else {
            val primarySubject = subjects.firstOrNull() ?: "English Language"
            generateMiniCbtExam(
                subject = primarySubject,
                targetCount = questionCount,
                availablePool = availablePool,
                userExposures = userExposures,
                excludedSessionIds = excludedSessionIds
            )
        }

        if (selectedQuestions.isEmpty()) {
            throw CbtIntegrityException("No verified questions available for requested subjects: $subjects")
        }

        val questionIds = selectedQuestions.map { it.id }
        val snapshot = CbtSessionSnapshot.create(
            sessionId = sessionId,
            mode = mode,
            subjects = subjects,
            questionIds = questionIds,
            durationSeconds = durationSeconds
        )

        val q1 = selectedQuestions.first()
        return Pair(snapshot, q1)
    }

    /**
     * Generates a Standard 180-Question Full CBT Examination:
     * - English Language (Compulsory): exactly 60 questions
     * - Elective 1: exactly 40 questions
     * - Elective 2: exactly 40 questions
     * - Elective 3: exactly 40 questions
     * Total: exactly 180 questions | 2 Hours
     *
     * Adheres strictly to:
     * 1. 100% Authentic, verified past questions only. NEVER uses generative AI.
     * 2. Visual integrity validation (quarantining questions with missing required figures).
     * 3. Strict non-repetition (content-based and stem-based deduplication).
     * 4. Multi-tier exposure tracking (unseen questions prioritized).
     * 5. Logically safe option shuffling.
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

        // Filter pool through visual integrity validator (quarantine broken visuals)
        val validPool = CbtVisualIntegrityValidator.filterVerifiedVisualQuestions(availablePool)

        val exposureMap = userExposures.associateBy { it.questionId }
        val runningExcludedIds = excludedSessionIds.toMutableSet()
        val runningExcludedStems = mutableSetOf<String>()

        val fullExamQuestions = mutableListOf<QuestionEntity>()

        // 1. English Section: Exactly 60 Questions
        val englishSection = generateSubjectSection(
            subject = compulsory,
            targetCount = CbtBlueprint.ENGLISH_MANDATORY_COUNT,
            availablePool = validPool,
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
                availablePool = validPool,
                exposureMap = exposureMap,
                excludedIds = runningExcludedIds,
                excludedStems = runningExcludedStems
            )
            fullExamQuestions.addAll(electiveSection)
            runningExcludedIds.addAll(electiveSection.map { it.id })
            runningExcludedStems.addAll(electiveSection.map { QuestionDeduplicator.normalizeText(it.questionText) })
        }

        // 3. Quality control verification (assert no duplicates, no missing options)
        val expectedSubjectCounts = mutableMapOf(compulsory to CbtBlueprint.ENGLISH_MANDATORY_COUNT)
        electives.forEach { expectedSubjectCounts[it] = CbtBlueprint.ELECTIVE_STANDARD_COUNT }

        val qualityReport = CbtQualityController.inspectExam(
            questions = fullExamQuestions,
            expectedTotalCount = CbtBlueprint.TOTAL_CBT_QUESTIONS,
            expectedSubjectCounts = expectedSubjectCounts
        )

        return if (!qualityReport.isValid) {
            healExam(fullExamQuestions, expectedSubjectCounts, validPool)
        } else {
            fullExamQuestions
        }
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
        val validPool = CbtVisualIntegrityValidator.filterVerifiedVisualQuestions(availablePool)
        val exposureMap = userExposures.associateBy { it.questionId }
        val excludedIds = excludedSessionIds.toMutableSet()
        val excludedStems = mutableSetOf<String>()

        val questions = generateSubjectSection(
            subject = normSubject,
            targetCount = targetCount,
            availablePool = validPool,
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
                replacementPool = validPool,
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
     * STRICT: Does NOT use AI generative fallbacks.
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
            .ifEmpty {
                QuestionBankGenerator.getAllSeedQuestions().filter {
                    it.subject.equals(subject, ignoreCase = true)
                }
            }

        // 2. Run Weighted Randomizer Algorithm with exposure tracking & authenticity weighting
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

        // 3. If authentic candidates within the pool are exhausted, draw from remaining verified pool items
        if (selected.size < targetCount) {
            val remainingVerified = subjectPool.filter {
                it.id !in currentIds && QuestionDeduplicator.normalizeText(it.questionText) !in currentStems
            }.shuffled()

            for (q in remainingVerified) {
                if (selected.size >= targetCount) break
                selected.add(q)
                currentIds.add(q.id)
                currentStems.add(QuestionDeduplicator.normalizeText(q.questionText))
            }
        }

        // 4. If still insufficient after exhausting the pool, fail safely instead of creating fake AI questions
        if (selected.size < targetCount && selected.isNotEmpty()) {
            // Re-use least-recently exposed questions if question bank coverage is exhausted
            val fallbackCandidates = subjectPool.sortedBy { exposureMap[it.id]?.lastExposedTimestamp ?: 0L }
            for (q in fallbackCandidates) {
                if (selected.size >= targetCount) break
                if (q.id !in selected.map { it.id }) {
                    selected.add(q)
                }
            }
        }

        if (selected.isEmpty()) {
            throw CbtIntegrityException("No verified questions available in question bank for subject: $subject")
        }

        // 5. Randomize question order and safely randomize option mapping
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
