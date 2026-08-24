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
        val defaultFallbacks = listOf("Mathematics", "Physics", "Chemistry", "Biology", "Economics", "Government", "Literature in English", "CRS", "Commerce", "Principles of Accounts")
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
     * Generates a Mini CBT Session of exactly 20 diverse, non-repeating questions for a single subject.
     */
    fun generateMiniCbtExam(
        subject: String,
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
            targetCount = CbtBlueprint.MINI_CBT_QUESTIONS,
            availablePool = availablePool,
            exposureMap = exposureMap,
            excludedIds = excludedIds,
            excludedStems = excludedStems
        )

        val report = CbtQualityController.inspectExam(
            questions = questions,
            expectedTotalCount = CbtBlueprint.MINI_CBT_QUESTIONS,
            expectedSubjectCounts = mapOf(normSubject to CbtBlueprint.MINI_CBT_QUESTIONS)
        )

        return if (!report.isValid) {
            CbtQualityController.autoRepairSection(
                subject = normSubject,
                targetCount = CbtBlueprint.MINI_CBT_QUESTIONS,
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
     * Generates an individual subject section with authentic balance, exposure tracking,
     * topic breadth, and safe option shuffling.
     */
    private fun generateSubjectSection(
        subject: String,
        targetCount: Int,
        availablePool: List<QuestionEntity>,
        exposureMap: Map<String, QuestionExposureEntity>,
        excludedIds: Set<String>,
        excludedStems: Set<String>
    ): List<QuestionEntity> {
        val isEnglish = subject.equals("English Language", ignoreCase = true)
        
        // 1. Gather all candidates from database pool + verified static question banks
        val subjectPool = availablePool.filter { it.subject.equals(subject, ignoreCase = true) }
            .ifEmpty { QuestionBankGenerator.getAllSeedQuestions().filter { it.subject.equals(subject, ignoreCase = true) } }

        // Deduplicate candidates
        val uniqueCandidates = QuestionDeduplicator.deduplicateQuestions(subjectPool)

        // 2. Score and partition by exposure:
        // Tier 1: Unseen questions (exposureCount == 0, not in excludedIds or excludedStems)
        // Tier 2: Least recently seen questions (sorted by lastExposedTimestamp ASC)
        val unseen = mutableListOf<QuestionEntity>()
        val seen = mutableListOf<Pair<QuestionEntity, Long>>()

        for (q in uniqueCandidates) {
            val stem = QuestionDeduplicator.normalizeText(q.questionText)
            if (q.id in excludedIds || stem in excludedStems) {
                continue
            }
            val exposure = exposureMap[q.id]
            if (exposure == null || exposure.exposureCount == 0) {
                unseen.add(q)
            } else {
                seen.add(Pair(q, exposure.lastExposedTimestamp))
            }
        }

        // Sort seen candidates by least recently exposed
        val leastRecentlySeen = seen.sortedBy { it.second }.map { it.first }

        val orderedCandidates = unseen.shuffled() + leastRecentlySeen

        val selected = mutableListOf<QuestionEntity>()
        val currentStems = excludedStems.toMutableSet()
        val currentIds = excludedIds.toMutableSet()

        if (isEnglish) {
            // Balance comprehension vs non-comprehension items
            val maxComprehension = if (targetCount >= 50) 6 else 2
            val compCandidates = orderedCandidates.filter { CbtBlueprint.isComprehensionQuestion(it) }
            val nonCompCandidates = orderedCandidates.filter { !CbtBlueprint.isComprehensionQuestion(it) }

            // Pick comprehension items
            for (q in compCandidates) {
                val stem = QuestionDeduplicator.normalizeText(q.questionText)
                if (q.id !in currentIds && stem !in currentStems && CbtQualityController.isQuestionStructurallyValid(q)) {
                    selected.add(q)
                    currentIds.add(q.id)
                    currentStems.add(stem)
                }
                if (selected.size >= maxComprehension) break
            }

            // Pick non-comprehension items (grammar, lexis, antonyms, oral English)
            val neededNonComp = targetCount - selected.size
            for (q in nonCompCandidates) {
                val stem = QuestionDeduplicator.normalizeText(q.questionText)
                if (q.id !in currentIds && stem !in currentStems && CbtQualityController.isQuestionStructurallyValid(q)) {
                    selected.add(q)
                    currentIds.add(q.id)
                    currentStems.add(stem)
                }
                if (selected.size >= targetCount) break
            }
        } else {
            // Multi-topic balanced selection
            val topicGroups = orderedCandidates.groupBy { it.topic }
            val topics = topicGroups.keys.toList().shuffled()

            if (topics.isNotEmpty()) {
                var topicIndex = 0
                val topicIterators = topicGroups.mapValues { it.value.toMutableList() }.toMutableMap()

                // Round-robin selection across topics for diverse coverage
                while (selected.size < targetCount && topicIterators.values.any { it.isNotEmpty() }) {
                    val topic = topics[topicIndex % topics.size]
                    val topicList = topicIterators[topic]
                    if (topicList != null && topicList.isNotEmpty()) {
                        val candidate = topicList.removeAt(0)
                        val stem = QuestionDeduplicator.normalizeText(candidate.questionText)
                        if (candidate.id !in currentIds && stem !in currentStems && CbtQualityController.isQuestionStructurallyValid(candidate)) {
                            selected.add(candidate)
                            currentIds.add(candidate.id)
                            currentStems.add(stem)
                        }
                    }
                    topicIndex++
                }
            }

            // If still need more, take remaining ordered candidates
            if (selected.size < targetCount) {
                for (q in orderedCandidates) {
                    val stem = QuestionDeduplicator.normalizeText(q.questionText)
                    if (q.id !in currentIds && stem !in currentStems && CbtQualityController.isQuestionStructurallyValid(q)) {
                        selected.add(q)
                        currentIds.add(q.id)
                        currentStems.add(stem)
                    }
                    if (selected.size >= targetCount) break
                }
            }
        }

        // 3. If authentic candidates are completely exhausted, use controlled AI fallback
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
