package com.example.data.db

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "user_accounts",
    indices = [
        Index(value = ["email"]),
        Index(value = ["isLoggedIn"])
    ]
)
data class UserAccountEntity(
    @PrimaryKey val id: String,
    val name: String,
    val email: String? = null,
    val phoneNumber: String? = null,
    val authProvider: String = "email", // "email", "google", "phone"
    val passwordHash: String? = null,
    val targetScore: Int = 320,
    val jambSubjectsCsv: String = "English Language,Mathematics,Physics,Chemistry",
    val targetInstitution: String = "University of Lagos (UNILAG)",
    val dreamCourse: String = "Medicine & Surgery",
    val learningStyle: String = "Intensive Mock Practice", // "Intensive Mock Practice", "Concept Mastery", "Weak Topic Drill"
    val preferredStudyTime: String = "Evening (7:00 PM)",
    val streakDays: Int = 12,
    val totalXp: Int = 1450,
    val level: Int = 4,
    val lastActiveDateString: String = "",
    val avatarUrl: String = "",
    val studyGoalMinutesPerDay: Int = 45,
    val isLoggedIn: Boolean = true,
    val jambExamDateTimestamp: Long = 1745020800000L,
    val myReferralCode: String = "PRZ-5821",
    val referralCount: Int = 0,
    val referredByCode: String? = null,
    val freePlusRewardUnlocked: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)

@Entity(
    tableName = "questions",
    indices = [
        Index(value = ["subject"]),
        Index(value = ["subject", "topic"]),
        Index(value = ["subject", "year"]),
        Index(value = ["isVerifiedJamb"]),
        Index(value = ["originType"])
    ]
)
data class QuestionEntity(
    @PrimaryKey val id: String,
    val subject: String,          // e.g. "English Language", "Mathematics", "Biology", "Chemistry", "Physics", "Commerce", "CRS", "Literature", "Government", "Economics", "Financial Accounting"
    val topic: String,            // e.g. "Permutations", "Cell Biology", "Lexis and Structure"
    val year: String,             // e.g. "2024", "2004", "1998", "Sample"
    val questionText: String,
    val optionA: String,
    val optionB: String,
    val optionC: String,
    val optionD: String,
    val correctAnswerIndex: Int,  // 0 -> A, 1 -> B, 2 -> C, 3 -> D
    val explanation: String,
    val passageText: String? = null,
    val difficulty: String = "Medium", // "Easy", "Medium", "Hard"
    val originType: String = "JAMB_ORIGINAL", // "JAMB_ORIGINAL" or "PREPZA_ORIGINAL"
    val originLabel: String = "Original JAMB Question • 2024", // or "Prepza Original Question", "Made by Prepza"
    val isVerifiedJamb: Boolean = true,
    val imageUrl: String? = null
) {
    val options: List<String> get() = listOf(optionA, optionB, optionC, optionD)
}

@Entity(
    tableName = "practice_sessions",
    indices = [
        Index(value = ["userId"]),
        Index(value = ["timestamp"]),
        Index(value = ["isSynced"])
    ]
)
data class PracticeSessionEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val userId: String = "",
    val mode: String,              // "Quick Practice", "Topic Practice", "CBT Mock", "Daily Challenge", "Weak Area"
    val score: Int,
    val totalQuestions: Int,
    val timestamp: Long = System.currentTimeMillis(),
    val subjectsCsv: String,       // e.g. "English Language,Mathematics,Physics,Chemistry"
    val durationSeconds: Long,
    val userAnswersJson: String,   // JSON string mapping questionId -> selectedOptionIndex
    val isSynced: Boolean = false,
    val syncedAtTimestamp: Long? = null
)

@Entity(
    tableName = "mistakes",
    indices = [
        Index(value = ["userId", "subject"]),
        Index(value = ["isMastered"])
    ]
)
data class MistakeEntity(
    @PrimaryKey val questionId: String,
    val userId: String = "",
    val subject: String,
    val topic: String,
    val selectedWrongOptionIndex: Int = -1,
    val timestamp: Long = System.currentTimeMillis(),
    val attemptCount: Int = 1,
    val isMastered: Boolean = false,
    val userNotes: String? = null
)

@Entity(tableName = "offline_packs")
data class OfflinePackEntity(
    @PrimaryKey val subject: String,
    val totalQuestions: Int,
    val downloadedAt: Long = System.currentTimeMillis(),
    val sizeMb: Float = 2.4f,
    val yearsAvailable: String = "2015 - 2024",
    val isDownloaded: Boolean = true,
    val downloadProgressPercent: Int = 100
)

@Entity(
    tableName = "bookmarks",
    indices = [
        Index(value = ["userId"]),
        Index(value = ["timestamp"])
    ]
)
data class BookmarkEntity(
    @PrimaryKey val questionId: String,
    val userId: String = "",
    val timestamp: Long = System.currentTimeMillis(),
    val note: String? = null
)

@Entity(tableName = "user_profile")
data class UserProfileEntity(
    @PrimaryKey val id: Int = 1,
    val accountId: String = "user_default_1",
    val name: String = "Chinedu Okafor",
    val email: String? = "chinedu.okafor@gmail.com",
    val phoneNumber: String? = null,
    val authProvider: String = "email",
    val targetScore: Int = 320,
    val jambSubjectsCsv: String = "English Language,Mathematics,Physics,Chemistry",
    val targetInstitution: String = "University of Lagos (UNILAG)",
    val dreamCourse: String = "Medicine & Surgery",
    val learningStyle: String = "Intensive Mock Practice",
    val preferredStudyTime: String = "Evening (7:00 PM)",
    val streakDays: Int = 12,
    val totalXp: Int = 1450,
    val level: Int = 4,
    val lastActiveDateString: String = "",
    val avatarUrl: String = "",
    val studyGoalMinutesPerDay: Int = 45,
    val isPlusSubscriber: Boolean = false,
    val trialStartDate: Long = System.currentTimeMillis(),
    val trialDurationDays: Int = 30,
    val simulatedDaysPassed: Int = 0,
    val dismissedReminderMilestonesCsv: String = "",
    val jambExamDateTimestamp: Long = 1745020800000L,
    val myReferralCode: String = "PRZ-5821",
    val referralCount: Int = 0,
    val referredByCode: String? = null,
    val freePlusRewardUnlocked: Boolean = false
) {
    val daysUntilJamb: Long
        get() {
            val diff = jambExamDateTimestamp - System.currentTimeMillis()
            return if (diff > 0) (diff / (1000L * 3600 * 24)) else 0L
        }

    val hoursUntilJamb: Long
        get() {
            val diff = jambExamDateTimestamp - System.currentTimeMillis()
            return if (diff > 0) ((diff % (1000L * 3600 * 24)) / (1000L * 3600)) else 0L
        }

    val minutesUntilJamb: Long
        get() {
            val diff = jambExamDateTimestamp - System.currentTimeMillis()
            return if (diff > 0) ((diff % (1000L * 3600)) / (1000L * 60)) else 0L
        }

    val secondsUntilJamb: Long
        get() {
            val diff = jambExamDateTimestamp - System.currentTimeMillis()
            return if (diff > 0) ((diff % (1000L * 60)) / 1000L) else 0L
        }

    val formattedJambDate: String
        get() {
            return try {
                val sdf = java.text.SimpleDateFormat("MMMM d, yyyy", java.util.Locale.getDefault())
                sdf.format(java.util.Date(jambExamDateTimestamp))
            } catch (e: Exception) {
                "April 19, 2025"
            }
        }

    val effectiveDaysPassed: Int
        get() {
            val realDays = ((System.currentTimeMillis() - trialStartDate) / (1000L * 3600 * 24)).toInt().coerceAtLeast(0)
            return (realDays + simulatedDaysPassed).coerceAtLeast(0)
        }

    val daysRemainingInTrial: Int
        get() {
            if (isPlusSubscriber) return 999
            return (trialDurationDays - effectiveDaysPassed).coerceAtLeast(0)
        }

    val isTrialExpired: Boolean
        get() = !isPlusSubscriber && daysRemainingInTrial <= 0

    val activeMilestoneReminder: Int?
        get() {
            if (isPlusSubscriber || isTrialExpired) return null
            val remaining = daysRemainingInTrial
            val dismissed = dismissedReminderMilestonesCsv.split(",").mapNotNull { it.trim().toIntOrNull() }
            
            // Check milestones: 2, 5, 10, 20
            if (remaining <= 2 && !dismissed.contains(2)) {
                return 2
            }
            if (remaining <= 5 && !dismissed.contains(5)) {
                return 5
            }
            if (remaining <= 10 && !dismissed.contains(10)) {
                return 10
            }
            if (remaining <= 20 && !dismissed.contains(20)) {
                return 20
            }
            return null
        }
}

@Entity(tableName = "friends")
data class FriendEntity(
    @PrimaryKey val id: String,
    val name: String,
    val avatarUrl: String = "",
    val accuracyPercent: Int,
    val streakDays: Int,
    val friendCode: String,
    val status: String,            // "following", "request_received", "request_sent"
    val isFollowing: Boolean = true
)

@Entity(tableName = "literature_books")
data class LiteratureBookEntity(
    @PrimaryKey val id: String,
    val title: String,
    val author: String,
    val description: String,
    val category: String = "UTME Literature Novel",
    val chaptersJson: String,      // JSON string of list of Chapter(title, content)
    val readingProgressPercent: Int = 0,
    val lastReadChapterIndex: Int = 0
)

@Entity(tableName = "study_tasks")
data class StudyTaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val subject: String,
    val topic: String,
    val targetQuestions: Int,
    val completedQuestions: Int = 0,
    val targetMinutes: Int = 20,
    val dateString: String,        // e.g. "2026-08-13"
    val isDone: Boolean = false
)

@Entity(tableName = "friend_chat_messages")
data class FriendChatMessageEntity(
    @PrimaryKey val id: String,
    val friendId: String,
    val senderName: String,
    val text: String,
    val timestamp: Long = System.currentTimeMillis(),
    val isFromMe: Boolean = false,
    val isRead: Boolean = true,
    val messageType: String = "text" // "text", "challenge", "greeting"
)

@Entity(tableName = "question_exposures", primaryKeys = ["questionId", "userId"])
data class QuestionExposureEntity(
    val questionId: String,
    val userId: String = "",
    val subject: String = "",
    val exposureCount: Int = 1,
    val lastExposedTimestamp: Long = System.currentTimeMillis()
)

@Entity(tableName = "active_exam_state")
data class ActiveExamStateEntity(
    @PrimaryKey val id: String = "active_cbt_session",
    val mode: String,                 // "Full CBT Mock Exam", "Mini CBT: Mathematics", etc.
    val subjectsCsv: String,
    val questionIdsCsv: String,       // comma separated question IDs in exact order
    val userAnswersJson: String,      // JSON map of questionId -> selectedOptionIndex
    val flaggedIndicesCsv: String = "", // comma separated list of question indices that are flagged
    val currentQuestionIndex: Int = 0,
    val selectedSubject: String = "",
    val timerSecondsRemaining: Long = 7200L,
    val totalDurationSeconds: Long = 7200L,
    val isMiniCbt: Boolean = false,
    val startTimestamp: Long = System.currentTimeMillis(),
    val lastUpdatedTimestamp: Long = System.currentTimeMillis(),
    val isCompleted: Boolean = false
)

@Entity(
    tableName = "topic_progress",
    indices = [
        Index(value = ["userId", "subject"]),
        Index(value = ["userId", "subject", "topicName"])
    ]
)
data class TopicProgressEntity(
    @PrimaryKey val id: String, // "${userId}_${subject}_${topicName}"
    val userId: String = "",
    val subject: String,
    val topicName: String,
    val currentCardIndex: Int = 0,
    val totalCards: Int = 0,
    val isLearningCompleted: Boolean = false,
    val lastRecallScore: Int = 0,
    val recallTotal: Int = 0,
    val practiceCount: Int = 0,
    val practiceAccuracyPercent: Int = 0,
    val masteryState: String = "NOT_STARTED", // "NOT_STARTED", "IN_PROGRESS", "LEARNED", "NEEDS_PRACTICE", "STRONG"
    val lastStudiedTimestamp: Long = System.currentTimeMillis(),
    val isBookmarked: Boolean = false,
    val personalNotes: String? = null
)

@Entity(
    tableName = "user_personal_cards",
    indices = [
        Index(value = ["userId", "subject", "topicName"])
    ]
)
data class UserPersonalCardEntity(
    @PrimaryKey val id: String, // UUID string
    val userId: String = "",
    val subject: String,
    val topicName: String,
    val frontText: String,
    val backText: String,
    val note: String? = null,
    val createdAt: Long = System.currentTimeMillis()
)

@Entity(
    tableName = "card_bookmarks",
    primaryKeys = ["cardId", "userId"]
)
data class CardBookmarkEntity(
    val cardId: String,
    val userId: String = "",
    val topicName: String,
    val subject: String,
    val timestamp: Long = System.currentTimeMillis()
)



