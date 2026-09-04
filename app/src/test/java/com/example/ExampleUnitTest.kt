package com.example

import com.example.data.repository.QuestionBankGenerator
import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun testUtmeQuestionDistribution_English60_Others40_Total180() {
        val selectedSubjects = listOf("Use of English", "Mathematics", "Physics", "Chemistry")
        val pool = QuestionBankGenerator.getAllSeedQuestions()
        val questions = QuestionBankGenerator.generateCbtExamQuestions(selectedSubjects, pool)

        // Check total count: 60 + 40 + 40 + 40 = 180
        assertEquals(180, questions.size)

        val englishQuestions = questions.filter {
            it.subject.contains("English", ignoreCase = true)
        }
        val mathQuestions = questions.filter {
            it.subject.equals("Mathematics", ignoreCase = true)
        }
        val physicsQuestions = questions.filter {
            it.subject.equals("Physics", ignoreCase = true)
        }
        val chemistryQuestions = questions.filter {
            it.subject.equals("Chemistry", ignoreCase = true)
        }

        assertEquals("English MUST have 60 questions", 60, englishQuestions.size)
        assertEquals("Mathematics MUST have 40 questions", 40, mathQuestions.size)
        assertEquals("Physics MUST have 40 questions", 40, physicsQuestions.size)
        assertEquals("Chemistry MUST have 40 questions", 40, chemistryQuestions.size)
    }

    @Test
    fun testUtmeQuestionDistribution_MedicineCombo() {
        val selectedSubjects = listOf("English Language", "Biology", "Chemistry", "Physics")
        val pool = QuestionBankGenerator.getAllSeedQuestions()
        val questions = QuestionBankGenerator.generateCbtExamQuestions(selectedSubjects, pool)

        assertEquals(180, questions.size)

        val englishCount = questions.count { it.subject.contains("English", ignoreCase = true) }
        val biologyCount = questions.count { it.subject.equals("Biology", ignoreCase = true) }
        val chemistryCount = questions.count { it.subject.equals("Chemistry", ignoreCase = true) }
        val physicsCount = questions.count { it.subject.equals("Physics", ignoreCase = true) }

        assertEquals(60, englishCount)
        assertEquals(40, biologyCount)
        assertEquals(40, chemistryCount)
        assertEquals(40, physicsCount)
    }

    @Test
    fun testAiGeneratedQuestionFallback() {
        val aiQuestions = QuestionBankGenerator.getAiGeneratedPersonalizedQuestions("Economics", 1)
        assertTrue(aiQuestions.isNotEmpty())
        val aiQuestion = aiQuestions.first()
        assertNotNull(aiQuestion)
        assertEquals("Economics", aiQuestion.subject)
        assertEquals("AI_PERSONALIZED", aiQuestion.originType)
        assertFalse(aiQuestion.optionA.isBlank())
        assertFalse(aiQuestion.optionB.isBlank())
        assertFalse(aiQuestion.optionC.isBlank())
        assertFalse(aiQuestion.optionD.isBlank())
        assertTrue(aiQuestion.correctAnswerIndex in 0..3)
        assertFalse(aiQuestion.explanation.isBlank())
    }

    @Test
    fun testHistoricalBiologyQuestionBankIntegrity() {
        val historicalQuestions = com.example.data.repository.JambBiologyHistoricalQuestionBank.getHistoricalBiologyQuestions()
        assertTrue("Historical Biology bank should contain at least 110 questions", historicalQuestions.size >= 110)
        
        for (q in historicalQuestions) {
            assertEquals("Biology", q.subject)
            assertFalse("Question text must not be blank", q.questionText.isBlank())
            assertFalse("Option A must not be blank", q.optionA.isBlank())
            assertFalse("Option B must not be blank", q.optionB.isBlank())
            assertFalse("Option C must not be blank", q.optionC.isBlank())
            assertFalse("Option D must not be blank", q.optionD.isBlank())
            assertTrue("Correct answer index must be between 0 and 3", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)
        }
    }

    @Test
    fun testCbtOptionRandomizationAndEntropy() {
        val seed = QuestionBankGenerator.getAllSeedQuestions().first()
        val randomized1 = QuestionBankGenerator.randomizeOptions(seed)
        val randomized2 = QuestionBankGenerator.randomizeOptions(seed)

        // Verify that correct answer text is preserved under its new index
        val originalOptions = listOf(seed.optionA, seed.optionB, seed.optionC, seed.optionD)
        val originalCorrectText = originalOptions[seed.correctAnswerIndex]

        val options1 = listOf(randomized1.optionA, randomized1.optionB, randomized1.optionC, randomized1.optionD)
        assertEquals(originalCorrectText, options1[randomized1.correctAnswerIndex])

        val options2 = listOf(randomized2.optionA, randomized2.optionB, randomized2.optionC, randomized2.optionD)
        assertEquals(originalCorrectText, options2[randomized2.correctAnswerIndex])
    }

    @Test
    fun testMultiSubjectHistoricalQuestionBankIntegrity() {
        val questions = com.example.data.repository.JambMultiSubjectHistoricalQuestionBank.getHistoricalMultiSubjectQuestions()
        assertTrue("Multi-subject bank should contain verified questions", questions.isNotEmpty())

        for (q in questions) {
            assertFalse("Question text must not be blank", q.questionText.isBlank())
            assertFalse("Option A must not be blank", q.optionA.isBlank())
            assertFalse("Option B must not be blank", q.optionB.isBlank())
            assertFalse("Option C must not be blank", q.optionC.isBlank())
            assertFalse("Option D must not be blank", q.optionD.isBlank())
            assertTrue("Correct answer index must be between 0 and 3", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)
        }
    }

    @Test
    fun testComprehensionPassageResolution() {
        val questions = com.example.data.repository.JambMultiSubjectHistoricalQuestionBank.getHistoricalMultiSubjectQuestions()
        val spaceshipQ = questions.firstOrNull { it.id == "eng_2010_02" }
        assertNotNull("Spaceship Earth question should exist", spaceshipQ)
        
        val passage = com.example.ui.components.getEffectivePassageForQuestion(spaceshipQ!!)
        assertNotNull("Passage should be non-null for comprehension question", passage)
        assertTrue("Passage should mention Spaceship Earth", passage!!.contains("Spaceship Earth", ignoreCase = true))
    }

    @Test
    fun testEnglishQuestionDistribution_BalancedComprehension() {
        val pool = QuestionBankGenerator.getAllSeedQuestions()
        val cbtExam = QuestionBankGenerator.generateCbtExamQuestions(listOf("Use of English", "Biology", "Physics", "Chemistry"), pool)
        val englishQuestions = cbtExam.filter { it.subject.contains("English", ignoreCase = true) }

        assertEquals(60, englishQuestions.size)
        
        val compCount = englishQuestions.count {
            it.topic.contains("comprehension", ignoreCase = true) || !it.passageText.isNullOrBlank()
        }
        
        // Comprehension questions should not overwhelm the exam (capped at 6-8 max out of 60)
        assertTrue("Comprehension count should be strictly balanced (<= 8), found $compCount", compCount <= 8)
        
        // Non-comprehension (grammar, lexis, structure, oral forms, antonyms, synonyms, idioms) should be the vast majority (>= 52)
        val nonCompCount = englishQuestions.size - compCount
        assertTrue("Grammar, lexis and structure should form the majority (>= 52), found $nonCompCount", nonCompCount >= 52)
    }

    @Test
    fun testBiologyHistoricalSeriesIncludesExtendedQuestions() {
        val bioQuestions = com.example.data.repository.JambBiologyHistoricalQuestionBank.getHistoricalBiologyQuestions()
        assertTrue(bioQuestions.any { it.id == "bio_1983_21" })
        assertTrue(bioQuestions.any { it.id == "bio_1984_16" })
        assertTrue(bioQuestions.any { it.id == "bio_1987_44" })
        assertTrue(bioQuestions.any { it.id == "bio_1993_11" })
    }

    @Test
    fun testEnglish2010CompleteQuestionBankIntegrity() {
        val questions = com.example.data.repository.JambEnglish2010CompleteQuestionBank.getEnglish2010Questions()
        assertEquals(100, questions.size)

        for (q in questions) {
            assertEquals("English Language", q.subject)
            assertEquals("2010", q.year)
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)
        }
    }

    @Test
    fun testEnglish2011CompleteQuestionBankIntegrity() {
        val questions = com.example.data.repository.JambEnglish2011CompleteQuestionBank.getEnglish2011Questions()
        assertEquals(100, questions.size)

        for (q in questions) {
            assertEquals("English Language", q.subject)
            assertEquals("2011", q.year)
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)
        }
    }

    @Test
    fun testAccountsHistoricalQuestionBankIntegrity() {
        val questions = com.example.data.repository.JambAccountsHistoricalQuestionBank.getHistoricalAccountsQuestions()
        assertEquals(20, questions.size)

        for (q in questions) {
            assertEquals("Financial Accounting", q.subject)
            assertTrue("Year must be 1994 or 1995: ${q.year}", q.year == "1994" || q.year == "1995")
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)
        }
    }

    @Test
    fun testCrk1983QuestionBankIntegrity() {
        val questions = com.example.data.repository.JambCrk1983CompleteQuestionBank.getCrk1983Questions()
        assertEquals(48, questions.size)

        for (q in questions) {
            assertEquals("CRS", q.subject)
            assertEquals("1983", q.year)
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)

            // Verify randomization preservation
            val randomized = com.example.data.repository.QuestionBankGenerator.randomizeOptions(q)
            val originalCorrectText = listOf(q.optionA, q.optionB, q.optionC, q.optionD)[q.correctAnswerIndex]
            val randomizedCorrectText = listOf(randomized.optionA, randomized.optionB, randomized.optionC, randomized.optionD)[randomized.correctAnswerIndex]
            assertEquals(originalCorrectText, randomizedCorrectText)
        }
    }

    @Test
    fun testCrk1984QuestionBankIntegrity() {
        val questions = com.example.data.repository.JambCrk1984CompleteQuestionBank.getCrk1984Questions()
        assertEquals(49, questions.size)

        for (q in questions) {
            assertEquals("CRS", q.subject)
            assertEquals("1984", q.year)
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)

            // Verify randomization preservation
            val randomized = com.example.data.repository.QuestionBankGenerator.randomizeOptions(q)
            val originalCorrectText = listOf(q.optionA, q.optionB, q.optionC, q.optionD)[q.correctAnswerIndex]
            val randomizedCorrectText = listOf(randomized.optionA, randomized.optionB, randomized.optionC, randomized.optionD)[randomized.correctAnswerIndex]
            assertEquals(originalCorrectText, randomizedCorrectText)
        }
    }

    @Test
    fun testCrk1985QuestionBankIntegrity() {
        val questions = com.example.data.repository.JambCrk1985CompleteQuestionBank.getCrk1985Questions()
        assertEquals(44, questions.size)

        for (q in questions) {
            assertEquals("CRS", q.subject)
            assertEquals("1985", q.year)
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)

            // Verify randomization preservation
            val randomized = com.example.data.repository.QuestionBankGenerator.randomizeOptions(q)
            val originalCorrectText = listOf(q.optionA, q.optionB, q.optionC, q.optionD)[q.correctAnswerIndex]
            val randomizedCorrectText = listOf(randomized.optionA, randomized.optionB, randomized.optionC, randomized.optionD)[randomized.correctAnswerIndex]
            assertEquals(originalCorrectText, randomizedCorrectText)
        }
    }

    @Test
    fun testChemistryHistoricalQuestionBankIntegrity() {
        val questions = com.example.data.repository.JambChemistryHistoricalQuestionBank.getHistoricalChemistryQuestions()
        assertTrue("Historical chemistry bank should contain extensive questions: ${questions.size}", questions.size >= 90)

        val validYears = (1983..2004).map { it.toString() }
        for (q in questions) {
            assertEquals("Chemistry", q.subject)
            assertTrue("Year must be between 1983 and 2004: ${q.year}", q.year in validYears)
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)

            // Verify randomization preservation
            val randomized = com.example.data.repository.QuestionBankGenerator.randomizeOptions(q)
            val originalCorrectText = listOf(q.optionA, q.optionB, q.optionC, q.optionD)[q.correctAnswerIndex]
            val randomizedCorrectText = listOf(randomized.optionA, randomized.optionB, randomized.optionC, randomized.optionD)[randomized.correctAnswerIndex]
            assertEquals(originalCorrectText, randomizedCorrectText)
        }
    }

    @Test
    fun testChemistryMasterRevisionTableBankIntegrity() {
        val questions = com.example.data.repository.JambChemistryMasterRevisionTableBank.getQuestions()
        assertTrue("Chemistry revision questions should not be empty", questions.isNotEmpty())
        println("Chemistry master revision table count: ${questions.size}")

        for (q in questions) {
            assertEquals("Chemistry", q.subject)
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())

            // Verify randomization preservation
            val randomized = com.example.data.repository.QuestionBankGenerator.randomizeOptions(q)
            val originalCorrectText = listOf(q.optionA, q.optionB, q.optionC, q.optionD)[q.correctAnswerIndex]
            val randomizedCorrectText = listOf(randomized.optionA, randomized.optionB, randomized.optionC, randomized.optionD)[randomized.correctAnswerIndex]
            assertEquals(originalCorrectText, randomizedCorrectText)
        }
    }

    @Test
    fun testComprehensiveMasterPart4And5Integrity() {
        val part4 = com.example.data.repository.JambAllSubjectComprehensiveMasterPart4QuestionBank.getQuestions()
        val part5 = com.example.data.repository.JambAllSubjectComprehensiveMasterPart5QuestionBank.getQuestions()

        assertEquals(100, part4.size)
        assertEquals(100, part5.size)

        for (q in (part4 + part5)) {
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())
            assertFalse("Subject must not be blank: ${q.id}", q.subject.isBlank())

            val randomized = com.example.data.repository.QuestionBankGenerator.randomizeOptions(q)
            val originalCorrectText = listOf(q.optionA, q.optionB, q.optionC, q.optionD)[q.correctAnswerIndex]
            val randomizedCorrectText = listOf(randomized.optionA, randomized.optionB, randomized.optionC, randomized.optionD)[randomized.correctAnswerIndex]
            assertEquals(originalCorrectText, randomizedCorrectText)
        }
    }

    @Test
    fun testPhysicsHistoricalQuestionBankIntegrity() {
        val questions = com.example.data.repository.JambPhysicsHistoricalQuestionBank.getHistoricalPhysicsQuestions()
        assertEquals(50, questions.size)

        val validYears = (1983..2004).map { it.toString() }
        for (q in questions) {
            assertEquals("Physics", q.subject)
            assertTrue("Year must be between 1983 and 2004: ${q.year}", q.year in validYears)
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)

            // Verify randomization preservation
            val randomized = com.example.data.repository.QuestionBankGenerator.randomizeOptions(q)
            val originalCorrectText = listOf(q.optionA, q.optionB, q.optionC, q.optionD)[q.correctAnswerIndex]
            val randomizedCorrectText = listOf(randomized.optionA, randomized.optionB, randomized.optionC, randomized.optionD)[randomized.correctAnswerIndex]
            assertEquals(originalCorrectText, randomizedCorrectText)
        }
    }

    @Test
    fun testEnglishQuestionBankCountAndIntegrity() {
        val pool = QuestionBankGenerator.getAllSeedQuestions()
        val englishQuestions = pool.filter { QuestionBankGenerator.normalizeSubjectName(it.subject) == "English Language" }
        assertTrue("English questions should be at least 1500", englishQuestions.size >= 1500)
        for (q in englishQuestions) {
            assertFalse(q.questionText.isBlank())
            assertFalse(q.optionA.isBlank())
            assertFalse(q.optionB.isBlank())
            assertFalse(q.optionC.isBlank())
            assertFalse(q.optionD.isBlank())
            assertTrue(q.correctAnswerIndex in 0..3)
            assertFalse(q.explanation.isBlank())
        }
    }

    @Test
    fun testCrk1986to1993Integrity() {
        val crk86_87 = com.example.data.repository.JambCrk1986to1987CompleteQuestionBank.getQuestions()
        val crk88_89 = com.example.data.repository.JambCrk1988to1989CompleteQuestionBank.getQuestions()
        val crk91_93 = com.example.data.repository.JambCrk1991to1993CompleteQuestionBank.getQuestions()

        assertEquals(96, crk86_87.size)
        assertEquals(98, crk88_89.size)
        assertEquals(106, crk91_93.size)

        val allNewCrk = crk86_87 + crk88_89 + crk91_93
        assertEquals(300, allNewCrk.size)

        for (q in allNewCrk) {
            assertEquals("CRS", q.subject)
            assertFalse("Question text must not be blank: ${q.id}", q.questionText.isBlank())
            assertFalse("Option A must not be blank: ${q.id}", q.optionA.isBlank())
            assertFalse("Option B must not be blank: ${q.id}", q.optionB.isBlank())
            assertFalse("Option C must not be blank: ${q.id}", q.optionC.isBlank())
            assertFalse("Option D must not be blank: ${q.id}", q.optionD.isBlank())
            assertTrue("Correct answer index must be 0..3: ${q.id}", q.correctAnswerIndex in 0..3)
            assertFalse("Explanation must not be blank: ${q.id}", q.explanation.isBlank())
            assertEquals("JAMB_ORIGINAL", q.originType)

            val randomized = com.example.data.repository.QuestionBankGenerator.randomizeOptions(q)
            val originalCorrectText = listOf(q.optionA, q.optionB, q.optionC, q.optionD)[q.correctAnswerIndex]
            val randomizedCorrectText = listOf(randomized.optionA, randomized.optionB, randomized.optionC, randomized.optionD)[randomized.correctAnswerIndex]
            assertEquals(originalCorrectText, randomizedCorrectText)
        }
    }

    @Test
    fun testOnlyAllowedSubjectsInDatabase() {
        val allowedSubjects = com.example.data.engine.SubjectRegistry.getAllSubjectNames().toSet()

        val pool = QuestionBankGenerator.getAllSeedQuestions()
        val distinctSubjects = pool.map { QuestionBankGenerator.normalizeSubjectName(it.subject) }.distinct().toSet()

        println("=== DISTINCT SUBJECTS IN DATABASE ===")
        distinctSubjects.forEach { println(" - $it") }

        for (subj in distinctSubjects) {
            assertTrue("Subject '$subj' must be in allowed subjects list", subj in allowedSubjects)
        }
        assertEquals("Must have exactly the allowed registered subjects", allowedSubjects, distinctSubjects)
    }

    @Test
    fun testPrintAllSubjectCounts() {
        val pool = QuestionBankGenerator.getAllSeedQuestions()
        val counts = pool.groupBy { QuestionBankGenerator.normalizeSubjectName(it.subject) }
            .mapValues { it.value.size }
            .toList()
            .sortedByDescending { it.second }

        println("=== SUBJECT QUESTION COUNTS IN DATABASE ===")
        var total = 0
        for ((subj, count) in counts) {
            println("Subject: $subj -> $count questions")
            total += count
        }
        println("TOTAL QUESTIONS IN DATABASE: $total")
        println("===========================================")
        assertTrue(total > 0)
    }
}

