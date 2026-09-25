package com.example

import com.example.data.db.QuestionEntity
import com.example.data.engine.*
import com.example.data.repository.QuestionBankGenerator
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import kotlin.system.measureTimeMillis

/**
 * Performance regression and integrity test suite for Prepza CBT Engine.
 * Enforces explicit latency thresholds and validation invariants:
 * - Mini CBT startup < 1000ms
 * - Full CBT 180-question preparation < 3000ms
 * - Snapshot immutability
 * - Zero AI question generation during CBT
 * - Visual integrity and quarantine rules
 */
class CbtEngineBenchmarkTest {

    private lateinit var seedQuestions: List<QuestionEntity>

    @Before
    fun setUp() {
        seedQuestions = QuestionBankGenerator.getAllSeedQuestions()
        assertTrue("Seed bank should contain at least 1,000 verified questions", seedQuestions.size >= 1000)
    }

    @Test
    fun testMiniCbtStartupLatencyThreshold() {
        val subject = "Mathematics"
        val count = 20
        val durationSeconds = 1200L

        val elapsedMs = measureTimeMillis {
            val (snapshot, q1) = PrepzaCbtEngine.fastInitializeExamSession(
                mode = "Mini CBT: $subject",
                subjects = listOf(subject),
                questionCount = count,
                durationSeconds = durationSeconds,
                availablePool = seedQuestions
            )

            assertNotNull("Q1 must not be null", q1)
            assertEquals("Q1 subject must match", subject, q1.subject)
            assertEquals("Snapshot must contain exactly requested count", count, snapshot.lockedQuestionIds.size)
            assertTrue("Snapshot hash must not be blank", snapshot.snapshotHash.isNotBlank())
        }

        println("[BENCHMARK] Mini CBT Startup Time: ${elapsedMs}ms (Threshold: <1000ms)")
        assertTrue("Mini CBT Q1 startup must be < 1000ms (was ${elapsedMs}ms)", elapsedMs < 1000)
    }

    @Test
    fun testFullCbtStartupLatencyThreshold() {
        val userSubjects = listOf("English Language", "Mathematics", "Physics", "Chemistry")
        val durationSeconds = 7200L

        val elapsedMs = measureTimeMillis {
            val (snapshot, q1) = PrepzaCbtEngine.fastInitializeExamSession(
                mode = "Full CBT Mock Exam",
                subjects = userSubjects,
                questionCount = 180,
                durationSeconds = durationSeconds,
                availablePool = seedQuestions
            )

            assertNotNull("Q1 must not be null", q1)
            assertEquals("Q1 must be English Language", "English Language", q1.subject)
            assertEquals("Full CBT snapshot must have exactly 180 questions", 180, snapshot.lockedQuestionIds.size)
            assertTrue("Snapshot integrity hash must be computed", snapshot.snapshotHash.isNotBlank())
        }

        println("[BENCHMARK] Full CBT 180-Question Startup Time: ${elapsedMs}ms (Threshold: <3000ms)")
        assertTrue("Full CBT startup must be < 3000ms (was ${elapsedMs}ms)", elapsedMs < 3000)
    }

    @Test
    fun testSnapshotImmutabilityAndIntegrity() {
        val (snapshot, _) = PrepzaCbtEngine.fastInitializeExamSession(
            mode = "Mini CBT: Physics",
            subjects = listOf("Physics"),
            questionCount = 10,
            durationSeconds = 600L,
            availablePool = seedQuestions
        )

        // Resolve matching questions
        val poolMap = seedQuestions.associateBy { it.id }
        val genuineList = snapshot.lockedQuestionIds.mapNotNull { poolMap[it] }

        // Authentic sequence matches integrity hash
        assertTrue("Genuine sequence must pass snapshot integrity verification", snapshot.verifyIntegrity(genuineList))

        // Attempt dynamic substitution (tampering)
        if (genuineList.size >= 2) {
            val tamperedList = genuineList.toMutableList()
            val temp = tamperedList[0]
            tamperedList[0] = tamperedList[1]
            tamperedList[1] = temp

            assertFalse("Tampered / substituted sequence must FAIL snapshot integrity verification", snapshot.verifyIntegrity(tamperedList))
        }
    }

    @Test
    fun testVisualIntegrityValidationAndQuarantine() {
        // 1. Question with valid registered visual passes
        val validVisualQuestion = QuestionEntity(
            id = "jamb_phy_diag_001",
            subject = "Physics",
            topic = "Current Electricity",
            year = "2023",
            questionText = "From the circuit diagram shown above with two resistors, calculate current.",
            optionA = "2 A",
            optionB = "5 A",
            optionC = "3 A",
            optionD = "1 A",
            correctAnswerIndex = 1,
            explanation = "Parallel circuit calculation.",
            imageUrl = "phy_circuit_parallel",
            originType = "JAMB_ORIGINAL"
        )
        val validReport = CbtVisualIntegrityValidator.validateQuestionVisual(validVisualQuestion)
        assertEquals("Valid visual question must be VERIFIED", VerificationStatus.VERIFIED, validReport.verificationStatus)
        assertTrue("Must indicate required visual is present", validReport.hasRequiredVisual)

        // 2. Question explicitly referencing a missing diagram gets QUARANTINED
        val brokenVisualQuestion = QuestionEntity(
            id = "fake_broken_001",
            subject = "Physics",
            topic = "Optics",
            year = "2024",
            questionText = "In the lens diagram shown above, find the focal length.",
            optionA = "10 cm",
            optionB = "20 cm",
            optionC = "30 cm",
            optionD = "40 cm",
            correctAnswerIndex = 0,
            explanation = "Missing figure.",
            imageUrl = null, // Missing!
            originType = "JAMB_ORIGINAL"
        )
        val brokenReport = CbtVisualIntegrityValidator.validateQuestionVisual(brokenVisualQuestion)
        assertEquals("Question with missing diagram must be QUARANTINED", VerificationStatus.QUARANTINED, brokenReport.verificationStatus)
        assertFalse("Must indicate required visual is missing", brokenReport.hasRequiredVisual)

        // 3. Regular text question passes as TEXT_ONLY
        val textQuestion = QuestionEntity(
            id = "regular_text_001",
            subject = "Government",
            topic = "Sovereignty",
            year = "2023",
            questionText = "The supreme power of a state to make and enforce laws without external control is known as",
            optionA = "Sovereignty",
            optionB = "Authority",
            optionC = "Legitimacy",
            optionD = "Power",
            correctAnswerIndex = 0,
            explanation = "Sovereignty is supreme power.",
            imageUrl = null
        )
        val textReport = CbtVisualIntegrityValidator.validateQuestionVisual(textQuestion)
        assertEquals("Text question must be VERIFIED", VerificationStatus.VERIFIED, textReport.verificationStatus)
        assertEquals("Text question must be classified as TEXT_ONLY", VisualType.TEXT_ONLY, textReport.visualType)
    }

    @Test
    fun testNeverGenerateAiQuestionsDuringExam() {
        val exam = PrepzaCbtEngine.generateFullCbtExam(
            userSubjects = listOf("English Language", "Mathematics", "Physics", "Chemistry"),
            availablePool = seedQuestions
        )

        assertEquals("Full CBT must contain exactly 180 questions", 180, exam.size)
        for (q in exam) {
            assertFalse("Exam must NOT contain AI fallback questions", q.id.startsWith("fallback_"))
            assertFalse("Exam question text must NOT be blank", q.questionText.isBlank())
            assertTrue("Correct answer index must be bounded within 0..3", q.correctAnswerIndex in 0..3)
            assertEquals("Must have 4 distinct options", 4, listOf(q.optionA, q.optionB, q.optionC, q.optionD).distinct().size)
        }
    }

    @Test
    fun testNoDuplicateQuestionsInSession() {
        val exam = PrepzaCbtEngine.generateFullCbtExam(
            userSubjects = listOf("English Language", "Mathematics", "Physics", "Chemistry"),
            availablePool = seedQuestions
        )

        val ids = exam.map { it.id }
        assertEquals("All question IDs in session must be unique", ids.size, ids.distinct().size)

        val stems = exam.map { QuestionDeduplicator.normalizeText(it.questionText) }
        assertEquals("All question stems in session must be unique", stems.size, stems.distinct().size)
    }

    @Test
    fun testCbtVisualRegistryCoverage() {
        assertTrue("Visual registry must contain verified assets", CbtVisualRegistry.totalVisualCount >= 10)

        // Math
        val mathTriangle = CbtVisualRegistry.getVisualForQuestion("jamb_math_diag_001", "math_right_triangle")
        assertNotNull("Math right triangle must exist", mathTriangle)
        assertEquals(VisualType.DIAGRAM_REQUIRED, mathTriangle?.type)

        // Physics
        val phyCircuit = CbtVisualRegistry.getVisualForQuestion("jamb_phy_diag_001", "phy_circuit_parallel")
        assertNotNull("Physics circuit must exist", phyCircuit)

        // Chemistry Table
        val chemTable = CbtVisualRegistry.getVisualForQuestion("jamb_chem_table_001", "chem_qualitative_table")
        assertNotNull("Chemistry table must exist", chemTable)
        assertEquals(VisualType.TABLE_REQUIRED, chemTable?.type)
        assertNotNull("Table data must be present", chemTable?.tableData)

        // Biology
        val bioCell = CbtVisualRegistry.getVisualForQuestion("jamb_bio_diag_001", "bio_plant_cell")
        assertNotNull("Biology plant cell must exist", bioCell)
    }
}
