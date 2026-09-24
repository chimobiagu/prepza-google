package com.example

import com.example.data.db.QuestionEntity
import com.example.data.engine.*
import com.example.data.repository.QuestionBankGenerator
import org.junit.Assert.*
import org.junit.Test
import java.util.UUID

class CbtEngineIntegrityTest {

    @Test
    fun testCbtSessionSnapshotCreationAndIntegrityHashVerification() {
        val sampleQuestion = QuestionEntity(
            id = "test_q1",
            subject = "English Language",
            topic = "Grammar",
            year = "2024",
            questionText = "Identify the correct option to fill the blank.",
            optionA = "A",
            optionB = "B",
            optionC = "C",
            optionD = "D",
            correctAnswerIndex = 1,
            explanation = "Option B is verified by grammar rules."
        )

        val snapshot = CbtSessionSnapshot.create(
            sessionId = UUID.randomUUID().toString(),
            mode = "Full CBT Mock Exam",
            subjects = listOf("English Language", "Mathematics", "Physics", "Chemistry"),
            orderedQuestionIds = listOf("test_q1", "test_q2", "test_q3"),
            totalDurationSeconds = 7200L,
            isMiniCbt = false,
            initialQuestion = sampleQuestion
        )

        assertNotNull(snapshot.integrityHash)
        assertTrue(snapshot.integrityHash.length == 64) // SHA-256 hex length
        assertTrue("Snapshot integrity verification must pass", snapshot.verifyIntegrity())

        // Mutating fields will violate integrity
        val tamperedSnapshot = snapshot.copy(totalDurationSeconds = 9999L)
        assertFalse("Tampered snapshot must fail integrity verification", tamperedSnapshot.verifyIntegrity())
    }

    @Test
    fun testStartupMetricsInstrumentation() {
        val tapTime = System.currentTimeMillis()
        val snapshotLockedTime = tapTime + 12
        val q1AvailableTime = tapTime + 15
        val navTime = tapTime + 20
        val q1RenderedTime = tapTime + 45
        val q1InteractiveTime = tapTime + 50

        val metrics = CbtStartupMetrics(
            tapTimestamp = tapTime,
            snapshotLockedTimestamp = snapshotLockedTime,
            navigationTimestamp = navTime,
            q1DataAvailableTimestamp = q1AvailableTime,
            q1RenderedTimestamp = q1RenderedTime,
            q1InteractiveTimestamp = q1InteractiveTime,
            questionSelectionTimeMs = 12,
            deduplicationTimeMs = 3,
            snapshotCreationTimeMs = 5,
            roomQueryTimeMs = 0,
            composeUiRenderingTimeMs = 30,
            navigationTimeMs = 5,
            totalStartupToInteractiveMs = 50
        )

        CbtStartupBenchmark.recordMetrics(metrics)
        assertEquals(metrics, CbtStartupBenchmark.latestMetrics)
        assertTrue("Warm startup should be well below 1000ms", metrics.totalStartupToInteractiveMs < 1000)
    }

    @Test
    fun testVisualQuestionValidatorAndAuditReport() {
        val qWithImage = QuestionEntity(
            id = "vis_1",
            subject = "Physics",
            topic = "Current Electricity",
            year = "1995",
            questionText = "From the circuit diagram shown below, calculate the equivalent resistance.",
            imageUrl = "drawables/physics_circuit_1995.png",
            optionA = "2 ohms",
            optionB = "4 ohms",
            optionC = "6 ohms",
            optionD = "8 ohms",
            correctAnswerIndex = 1,
            explanation = "In parallel R = (R1*R2)/(R1+R2)."
        )

        val qWithCanvas = QuestionEntity(
            id = "vis_2",
            subject = "Mathematics",
            topic = "Circle Geometry",
            year = "2018",
            questionText = "In the diagram, a tangent touches the circle at point T.",
            optionA = "30°",
            optionB = "45°",
            optionC = "60°",
            optionD = "90°",
            correctAnswerIndex = 2,
            explanation = "Angle between tangent and radius is 90°."
        )

        val qTextOnly = QuestionEntity(
            id = "text_1",
            subject = "English Language",
            topic = "Synonyms",
            year = "2021",
            questionText = "Choose the word nearest in meaning to: EPHEMERAL.",
            optionA = "transitory",
            optionB = "eternal",
            optionC = "spurious",
            optionD = "luminous",
            correctAnswerIndex = 0,
            explanation = "Ephemeral means short-lived or transitory."
        )

        val res1 = QuestionVisualIntegrityValidator.validateQuestionVisual(qWithImage)
        assertTrue("Direct image question must be satisfied", res1.isSatisfied)
        assertEquals(VisualRequirementType.IMAGE_REQUIRED, res1.visualRequirementType)

        val res2 = QuestionVisualIntegrityValidator.validateQuestionVisual(qWithCanvas)
        assertTrue("Canvas-resolvable question must be satisfied", res2.isSatisfied)
        assertNotNull(res2.visualAsset)

        val res3 = QuestionVisualIntegrityValidator.validateQuestionVisual(qTextOnly)
        assertTrue("Text only question must be satisfied", res3.isSatisfied)
        assertEquals(VisualRequirementType.TEXT_ONLY, res3.visualRequirementType)

        val audit = QuestionVisualIntegrityValidator.auditQuestionBank(listOf(qWithImage, qWithCanvas, qTextOnly))
        assertEquals(3, audit.totalQuestionsAudited)
        assertEquals(1, audit.textOnlyCount)
        assertEquals(0, audit.missingRequiredVisualCount)
    }

    @Test
    fun testMiniCbtExamInstantStartup() {
        val pool = QuestionBankGenerator.getAllSeedQuestions()
        val subject = "Physics"
        val subjectPool = pool.filter { it.subject.equals(subject, ignoreCase = true) }

        // Warm up JIT and classloaders
        PrepzaCbtEngine.generateMiniCbtExam(subject = subject, targetCount = 5, availablePool = subjectPool)

        val start = System.currentTimeMillis()
        val questions = PrepzaCbtEngine.generateMiniCbtExam(
            subject = subject,
            targetCount = 20,
            availablePool = subjectPool
        )
        val elapsed = System.currentTimeMillis() - start

        assertEquals(20, questions.size)
        println("Mini CBT generation time: $elapsed ms")
        assertTrue("Mini CBT generation must complete promptly (was $elapsed ms)", elapsed < 4000)

        // Snapshot creation
        val snapshot = PrepzaCbtEngine.createSessionSnapshot(
            sessionId = "test_mini_session",
            mode = "Practice: Physics",
            subjects = listOf("Physics"),
            orderedQuestions = questions,
            totalDurationSeconds = 1200L,
            isMiniCbt = true
        )
        assertTrue(snapshot.verifyIntegrity())
        assertEquals(questions.first().id, snapshot.initialQuestion.id)
    }

    @Test
    fun testFullCbtExamInstantStartupAndNoDuplicates() {
        val pool = QuestionBankGenerator.getAllSeedQuestions()
        val subjects = listOf("English Language", "Mathematics", "Physics", "Chemistry")

        // Warm up JIT
        PrepzaCbtEngine.generateMiniCbtExam(subject = "Physics", targetCount = 5, availablePool = pool)

        val start = System.currentTimeMillis()
        val questions = PrepzaCbtEngine.generateFullCbtExam(
            userSubjects = subjects,
            availablePool = pool
        )
        val elapsed = System.currentTimeMillis() - start

        assertEquals(180, questions.size)
        println("Full CBT (180 questions) generation time: $elapsed ms")
        assertTrue("Full CBT generation must complete promptly (was $elapsed ms)", elapsed < 5000)

        // Verify zero duplicates
        val distinctIds = questions.map { it.id }.distinct()
        assertEquals("There must be zero duplicate question IDs in a 180-question CBT session", 180, distinctIds.size)

        // Verify subject breakdown: 60 English + 40 + 40 + 40
        val englishCount = questions.count { it.subject.contains("English", ignoreCase = true) }
        val mathCount = questions.count { it.subject.equals("Mathematics", ignoreCase = true) }
        val physicsCount = questions.count { it.subject.equals("Physics", ignoreCase = true) }
        val chemCount = questions.count { it.subject.equals("Chemistry", ignoreCase = true) }

        assertEquals(60, englishCount)
        assertEquals(40, mathCount)
        assertEquals(40, physicsCount)
        assertEquals(40, chemCount)

        // Verify question 1 is immediately ready and locked
        val snapshot = PrepzaCbtEngine.createSessionSnapshot(
            sessionId = "test_full_session",
            mode = "Full CBT Mock Exam",
            subjects = subjects,
            orderedQuestions = questions,
            totalDurationSeconds = 7200L,
            isMiniCbt = false
        )
        assertTrue(snapshot.verifyIntegrity())
        assertEquals(questions.first().id, snapshot.initialQuestion.id)
    }
}
