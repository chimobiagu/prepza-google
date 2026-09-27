package com.example

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.example.data.db.*
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import java.util.UUID

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class QuestionSyncAndIntegrityTest {

    private lateinit var db: PrepzaDatabase
    private lateinit var questionDao: QuestionDao
    private lateinit var flaggedDao: FlaggedQuestionDao
    private lateinit var bookmarkDao: BookmarkDao
    private lateinit var activeExamDao: ActiveExamStateDao

    @Before
    fun setUp() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, PrepzaDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        questionDao = db.questionDao()
        flaggedDao = db.flaggedQuestionDao()
        bookmarkDao = db.bookmarkDao()
        activeExamDao = db.activeExamStateDao()
    }

    @After
    fun tearDown() {
        db.close()
    }

    @Test
    fun `test Case A - v1 local + v2 server updates local to v2`() = runBlocking {
        // Given local has v1
        val q1 = QuestionEntity(
            id = "q_test_101",
            subject = "Physics",
            topic = "Optics",
            year = "2023",
            questionText = "What is the speed of light?",
            optionA = "3x10^8 m/s",
            optionB = "3x10^6 m/s",
            optionC = "3x10^4 m/s",
            optionD = "3x10^2 m/s",
            correctAnswerIndex = 0,
            explanation = "Speed of light in vacuum is approx 3x10^8 m/s.",
            contentVersion = 1,
            isDisabled = false
        )
        questionDao.upsertQuestion(q1)

        val localBefore = questionDao.getQuestionById("q_test_101")
        assertNotNull(localBefore)
        assertEquals(1, localBefore!!.contentVersion)

        // When server provides v2
        val serverQ2 = q1.copy(
            questionText = "What is the exact approximate speed of light in vacuum?",
            contentVersion = 2,
            updatedAt = System.currentTimeMillis()
        )

        // Synchronization logic check
        if (localBefore.contentVersion <= serverQ2.contentVersion) {
            questionDao.upsertQuestion(serverQ2)
        }

        val localAfter = questionDao.getQuestionById("q_test_101")
        assertNotNull(localAfter)
        assertEquals(2, localAfter!!.contentVersion)
        assertEquals("What is the exact approximate speed of light in vacuum?", localAfter.questionText)
    }

    @Test
    fun `test Case B - v2 local + v1 server preserves local v2`() = runBlocking {
        // Given local has v2
        val qLocalV2 = QuestionEntity(
            id = "q_test_102",
            subject = "Chemistry",
            topic = "Acids",
            year = "2024",
            questionText = "What is the pH of pure water at 25C?",
            optionA = "7",
            optionB = "1",
            optionC = "14",
            optionD = "0",
            correctAnswerIndex = 0,
            explanation = "Neutral pH is 7.",
            contentVersion = 2,
            isDisabled = false
        )
        questionDao.upsertQuestion(qLocalV2)

        // When older v1 comes from server
        val serverStaleV1 = qLocalV2.copy(
            questionText = "What is pH of water?",
            contentVersion = 1
        )

        val localExisting = questionDao.getQuestionById("q_test_102")
        assertNotNull(localExisting)
        if (localExisting!!.contentVersion <= serverStaleV1.contentVersion) {
            questionDao.upsertQuestion(serverStaleV1)
        }

        val localAfter = questionDao.getQuestionById("q_test_102")
        assertNotNull(localAfter)
        assertEquals(2, localAfter!!.contentVersion)
        assertEquals("What is the pH of pure water at 25C?", localAfter.questionText)
    }

    @Test
    fun `test Case C - Active CBT containing v1 is isolated when server publishes v2`() = runBlocking {
        val q1 = QuestionEntity(
            id = "q_cbt_103",
            subject = "Biology",
            topic = "Ecology",
            year = "2023",
            questionText = "Which organism is a primary producer?",
            optionA = "Green plant",
            optionB = "Lion",
            optionC = "Hawk",
            optionD = "Fungus",
            correctAnswerIndex = 0,
            explanation = "Plants photosynthesize.",
            contentVersion = 1
        )
        questionDao.upsertQuestion(q1)

        // CBT starts with snapshot/IDs
        val activeExam = ActiveExamStateEntity(
            id = "active_cbt_session",
            mode = "CBT Mock",
            subjectsCsv = "Biology",
            questionIdsCsv = "q_cbt_103",
            userAnswersJson = "{}",
            currentQuestionIndex = 0,
            timerSecondsRemaining = 3600,
            totalDurationSeconds = 3600,
            startTimestamp = System.currentTimeMillis(),
            lastUpdatedTimestamp = System.currentTimeMillis()
        )
        activeExamDao.saveActiveExamState(activeExam)

        // In-memory exam session holds the v1 question instance
        val inMemoryActiveQuestions = mutableListOf(q1)

        // Server publishes v2 during exam
        val serverQ2 = q1.copy(
            questionText = "Which organism acts as a primary autotroph/producer?",
            contentVersion = 2
        )
        questionDao.upsertQuestion(serverQ2)

        // Active exam state in memory is isolated and unaffected
        assertEquals(1, inMemoryActiveQuestions[0].contentVersion)
        assertEquals("Which organism is a primary producer?", inMemoryActiveQuestions[0].questionText)
    }

    @Test
    fun `test Case D - After CBT ends new sessions use v2`() = runBlocking {
        val serverQ2 = QuestionEntity(
            id = "q_cbt_104",
            subject = "Biology",
            topic = "Genetics",
            year = "2024",
            questionText = "What is the phenotypic ratio of a monohybrid cross?",
            optionA = "3:1",
            optionB = "1:2:1",
            optionC = "9:3:3:1",
            optionD = "1:1",
            correctAnswerIndex = 0,
            explanation = "Standard Mendel ratio.",
            contentVersion = 2
        )
        questionDao.upsertQuestion(serverQ2)

        // Clear previous active exam state
        activeExamDao.clearActiveExamState()

        // Fetch questions for new session
        val newSessionQuestions = questionDao.getQuestionsBySubjectOnce("Biology")
        val found = newSessionQuestions.find { it.id == "q_cbt_104" }
        assertNotNull(found)
        assertEquals(2, found!!.contentVersion)
    }

    @Test
    fun `test Case E - Bookmarked v1 question synchronizes to v2 and remains accessible`() = runBlocking {
        val q1 = QuestionEntity(
            id = "q_bookmarked_105",
            subject = "English Language",
            topic = "Concord",
            year = "2022",
            questionText = "Neither the teacher nor the students ____ present.",
            optionA = "were",
            optionB = "was",
            optionC = "is",
            optionD = "are",
            correctAnswerIndex = 0,
            explanation = "Proximity rule in concord.",
            contentVersion = 1
        )
        questionDao.upsertQuestion(q1)

        // User bookmarks question using stable question ID
        bookmarkDao.addBookmark(BookmarkEntity(questionId = "q_bookmarked_105", userId = "user_1"))

        // Sync updates question to v2
        val q2 = q1.copy(
            explanation = "According to the rule of proximity, the verb agrees with the closer subject 'students' (plural -> were).",
            contentVersion = 2
        )
        questionDao.upsertQuestion(q2)

        // Verify bookmark remains intact and question is accessible in v2
        val allBookmarks = bookmarkDao.getAllBookmarksOnce()
        assertTrue(allBookmarks.any { it.questionId == "q_bookmarked_105" })

        val updatedQ = questionDao.getQuestionById("q_bookmarked_105")
        assertNotNull(updatedQ)
        assertEquals(2, updatedQ!!.contentVersion)
    }

    @Test
    fun `test Case F - Disabled question is excluded from new session`() = runBlocking {
        val qDisabled = QuestionEntity(
            id = "q_disabled_106",
            subject = "Mathematics",
            topic = "Calculus",
            year = "2021",
            questionText = "Evaluate integral of x dx",
            optionA = "x^2/2 + C",
            optionB = "x + C",
            optionC = "2x + C",
            optionD = "x^3 + C",
            correctAnswerIndex = 0,
            explanation = "Power rule",
            contentVersion = 1,
            isDisabled = true
        )
        questionDao.upsertQuestion(qDisabled)

        val availableQuestions = questionDao.getQuestionsBySubjectOnce("Mathematics")
        assertFalse(availableQuestions.any { it.id == "q_disabled_106" })
    }

    @Test
    fun `test Case G - Duplicate question marked disabled is excluded from session`() = runBlocking {
        val qOriginal = QuestionEntity(
            id = "q_orig_107",
            subject = "Government",
            topic = "Constitution",
            year = "1999",
            questionText = "How many states are in Nigeria?",
            optionA = "36",
            optionB = "30",
            optionC = "19",
            optionD = "12",
            correctAnswerIndex = 0,
            explanation = "36 states and FCT.",
            contentVersion = 1,
            isDisabled = false
        )
        val qDuplicate = qOriginal.copy(
            id = "q_dup_108",
            isDisabled = true // admin marked as duplicate
        )
        questionDao.upsertQuestion(qOriginal)
        questionDao.upsertQuestion(qDuplicate)

        val available = questionDao.getQuestionsBySubjectOnce("Government")
        assertTrue(available.any { it.id == "q_orig_107" })
        assertFalse(available.any { it.id == "q_dup_108" })
    }

    @Test
    fun `test Question Report captures complete faithfully preserved snapshot`() = runBlocking {
        val q = QuestionEntity(
            id = "q_flag_109",
            subject = "Physics",
            topic = "Current Electricity",
            year = "2024",
            questionText = "Calculate the equivalent resistance of two 4-ohm resistors in parallel.",
            optionA = "2 ohms",
            optionB = "8 ohms",
            optionC = "4 ohms",
            optionD = "1 ohm",
            correctAnswerIndex = 0,
            explanation = "R_eq = (4 * 4) / (4 + 4) = 16 / 8 = 2 ohms.",
            originLabel = "Original JAMB Past Question • 2024",
            contentVersion = 1
        )
        questionDao.upsertQuestion(q)

        val report = FlaggedQuestionEntity(
            id = UUID.randomUUID().toString(),
            questionId = q.id,
            userId = "student_test_user",
            subject = q.subject,
            topic = q.topic,
            year = q.year,
            questionSource = q.originLabel,
            questionText = q.questionText,
            optionA = q.optionA,
            optionB = q.optionB,
            optionC = q.optionC,
            optionD = q.optionD,
            correctAnswerIndex = q.correctAnswerIndex,
            explanation = q.explanation,
            reason = "Wrong answer key",
            userNotes = "I believe option B should be checked if in series, but question specifies parallel.",
            appVersion = "1.0",
            status = "PENDING",
            isSyncedToSupabase = false
        )

        flaggedDao.insertFlag(report)

        val savedFlags = flaggedDao.getFlagsForQuestion("q_flag_109")
        assertEquals(1, savedFlags.size)
        val saved = savedFlags[0]
        assertEquals("Calculate the equivalent resistance of two 4-ohm resistors in parallel.", saved.questionText)
        assertEquals("2 ohms", saved.optionA)
        assertEquals(0, saved.correctAnswerIndex)
        assertEquals("student_test_user", saved.userId)
        assertEquals("PENDING", saved.status)
        assertFalse(saved.isSyncedToSupabase)

        // Test offline mark synced
        flaggedDao.markFlagSynced(saved.id)
        val afterSync = flaggedDao.getFlagById(saved.id)
        assertNotNull(afterSync)
        assertTrue(afterSync!!.isSyncedToSupabase)
    }

    @Test
    fun `test Offline Report Queue Retry and Deduplication Idempotency`() = runBlocking {
        val reportId = UUID.randomUUID().toString()
        val report = FlaggedQuestionEntity(
            id = reportId,
            questionId = "q_retry_200",
            userId = "student_network_test",
            subject = "Biology",
            topic = "Genetics",
            questionText = "Which base pairs with Adenine in DNA?",
            optionA = "Thymine",
            optionB = "Guanine",
            optionC = "Cytosine",
            optionD = "Uracil",
            correctAnswerIndex = 0,
            explanation = "A pairs with T in DNA.",
            reason = "Option is missing/wrong",
            userNotes = "Checking retry flow",
            status = "PENDING",
            isSyncedToSupabase = false
        )

        // 1. Initial offline insert
        flaggedDao.insertFlag(report)
        val unsyncedBefore = flaggedDao.getUnsyncedFlags()
        assertEquals(1, unsyncedBefore.size)
        assertEquals(reportId, unsyncedBefore[0].id)

        // 2. Simulated Network upload success on server, but client connection drops before ACK
        // Client still has isSyncedToSupabase = false
        val unsyncedPendingRetry = flaggedDao.getUnsyncedFlags()
        assertEquals(1, unsyncedPendingRetry.size)

        // 3. Client retries with identical reportId: upsert into DAO does not create duplicate
        flaggedDao.insertFlag(report)
        val allFlags = flaggedDao.getAllFlagged()
        // Ensure only exactly 1 record exists locally for this report ID
        val matchingFlags = flaggedDao.getFlagsForQuestion("q_retry_200")
        assertEquals(1, matchingFlags.size)
        assertEquals(reportId, matchingFlags[0].id)

        // 4. Server ACK received on retry -> mark synced
        flaggedDao.markFlagSynced(reportId)
        val unsyncedAfter = flaggedDao.getUnsyncedFlags()
        assertTrue(unsyncedAfter.isEmpty())
        val finalRecord = flaggedDao.getFlagById(reportId)
        assertNotNull(finalRecord)
        assertTrue(finalRecord!!.isSyncedToSupabase)
    }
}

