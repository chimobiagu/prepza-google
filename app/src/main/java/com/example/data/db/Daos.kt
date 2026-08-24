package com.example.data.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface UserAccountDao {
    @Query("SELECT * FROM user_accounts ORDER BY createdAt DESC")
    fun getAllAccounts(): Flow<List<UserAccountEntity>>

    @Query("SELECT * FROM user_accounts WHERE id = :id")
    fun getAccountById(id: String): Flow<UserAccountEntity?>

    @Query("SELECT * FROM user_accounts WHERE isLoggedIn = 1 LIMIT 1")
    fun getActiveAccount(): Flow<UserAccountEntity?>

    @Query("SELECT * FROM user_accounts WHERE isLoggedIn = 1 LIMIT 1")
    suspend fun getActiveAccountOnce(): UserAccountEntity?

    @Query("SELECT * FROM user_accounts WHERE email = :email LIMIT 1")
    suspend fun getAccountByEmail(email: String): UserAccountEntity?

    @Query("SELECT * FROM user_accounts WHERE phoneNumber = :phoneNumber LIMIT 1")
    suspend fun getAccountByPhone(phoneNumber: String): UserAccountEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAccount(account: UserAccountEntity)

    @Query("UPDATE user_accounts SET isLoggedIn = 0")
    suspend fun logOutAll()

    @Query("UPDATE user_accounts SET isLoggedIn = 1 WHERE id = :id")
    suspend fun setActiveAccount(id: String)

    @Query("DELETE FROM user_accounts WHERE id = :id")
    suspend fun deleteAccount(id: String)
}

@Dao
interface QuestionDao {
    @Query("SELECT * FROM questions")
    fun getAllQuestions(): Flow<List<QuestionEntity>>

    @Query("SELECT * FROM questions")
    suspend fun getAllQuestionsOnce(): List<QuestionEntity>

    @Query("SELECT * FROM questions WHERE subject = :subject")
    fun getQuestionsBySubject(subject: String): Flow<List<QuestionEntity>>

    @Query("SELECT * FROM questions WHERE subject IN (:subjects)")
    fun getQuestionsBySubjects(subjects: List<String>): Flow<List<QuestionEntity>>

    @Query("SELECT * FROM questions WHERE subject = :subject AND topic = :topic")
    fun getQuestionsBySubjectAndTopic(subject: String, topic: String): Flow<List<QuestionEntity>>

    @Query("SELECT * FROM questions WHERE questionText LIKE '%' || :query || '%' OR topic LIKE '%' || :query || '%' OR subject LIKE '%' || :query || '%'")
    fun searchQuestions(query: String): Flow<List<QuestionEntity>>

    @Query("SELECT * FROM questions WHERE id IN (:ids)")
    suspend fun getQuestionsByIds(ids: List<String>): List<QuestionEntity>

    @Query("SELECT * FROM questions WHERE id = :id")
    suspend fun getQuestionById(id: String): QuestionEntity?

    @Query("SELECT DISTINCT topic FROM questions WHERE subject = :subject")
    fun getTopicsForSubject(subject: String): Flow<List<String>>

    @Query("SELECT COUNT(*) FROM questions WHERE subject = :subject")
    suspend fun getQuestionCountForSubject(subject: String): Int

    @Query("SELECT COUNT(*) FROM questions")
    suspend fun getTotalQuestionCount(): Int

    @Query("SELECT DISTINCT year FROM questions WHERE subject = :subject ORDER BY year DESC")
    fun getYearsForSubject(subject: String): Flow<List<String>>

    @Query("SELECT * FROM questions WHERE subject = :subject ORDER BY RANDOM() LIMIT :limit")
    suspend fun getRandomQuestionsForSubject(subject: String, limit: Int): List<QuestionEntity>

    @Query("SELECT * FROM questions WHERE subject = :subject AND topic = :topic ORDER BY RANDOM() LIMIT :limit")
    suspend fun getRandomQuestionsForSubjectAndTopic(subject: String, topic: String, limit: Int): List<QuestionEntity>

    @Query("DELETE FROM questions")
    suspend fun deleteAllQuestions()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(questions: List<QuestionEntity>)
}

@Dao
interface PracticeSessionDao {
    @Query("SELECT * FROM practice_sessions ORDER BY timestamp DESC")
    fun getAllSessions(): Flow<List<PracticeSessionEntity>>

    @Query("SELECT * FROM practice_sessions WHERE userId = :userId OR userId = '' ORDER BY timestamp DESC LIMIT :limit")
    fun getRecentSessionsForUser(userId: String, limit: Int): Flow<List<PracticeSessionEntity>>

    @Query("SELECT * FROM practice_sessions ORDER BY timestamp DESC LIMIT :limit")
    fun getRecentSessions(limit: Int): Flow<List<PracticeSessionEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSession(session: PracticeSessionEntity): Long
}

@Dao
interface MistakeDao {
    @Query("SELECT * FROM mistakes ORDER BY timestamp DESC")
    fun getAllMistakes(): Flow<List<MistakeEntity>>

    @Query("SELECT * FROM mistakes WHERE (userId = :userId OR userId = '') AND isMastered = 0 ORDER BY timestamp DESC")
    fun getUnmasteredMistakesForUser(userId: String): Flow<List<MistakeEntity>>

    @Query("SELECT * FROM mistakes WHERE isMastered = 0 ORDER BY timestamp DESC")
    fun getUnmasteredMistakes(): Flow<List<MistakeEntity>>

    @Query("SELECT * FROM mistakes WHERE isMastered = 1 ORDER BY timestamp DESC")
    fun getMasteredMistakes(): Flow<List<MistakeEntity>>

    @Query("SELECT * FROM mistakes WHERE subject = :subject ORDER BY timestamp DESC")
    fun getMistakesBySubject(subject: String): Flow<List<MistakeEntity>>

    @Query("SELECT COUNT(*) FROM mistakes WHERE isMastered = 0")
    fun getUnmasteredCount(): Flow<Int>

    @Query("SELECT COUNT(*) FROM mistakes WHERE isMastered = 1")
    fun getMasteredCount(): Flow<Int>

    @Query("UPDATE mistakes SET isMastered = :isMastered WHERE questionId = :questionId")
    suspend fun markMastered(questionId: String, isMastered: Boolean = true)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertMistake(mistake: MistakeEntity)

    @Query("DELETE FROM mistakes WHERE questionId = :questionId")
    suspend fun deleteMistake(questionId: String)

    @Query("DELETE FROM mistakes")
    suspend fun clearAllMistakes()
}

@Dao
interface OfflinePackDao {
    @Query("SELECT * FROM offline_packs ORDER BY subject ASC")
    fun getAllPacks(): Flow<List<OfflinePackEntity>>

    @Query("SELECT * FROM offline_packs WHERE isDownloaded = 1")
    fun getDownloadedPacks(): Flow<List<OfflinePackEntity>>

    @Query("SELECT * FROM offline_packs WHERE subject = :subject LIMIT 1")
    suspend fun getPackBySubject(subject: String): OfflinePackEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertPack(pack: OfflinePackEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(packs: List<OfflinePackEntity>)

    @Query("UPDATE offline_packs SET isDownloaded = :isDownloaded, downloadProgressPercent = :progress WHERE subject = :subject")
    suspend fun updateDownloadStatus(subject: String, isDownloaded: Boolean, progress: Int)

    @Query("DELETE FROM offline_packs WHERE subject = :subject")
    suspend fun deletePack(subject: String)
}

@Dao
interface BookmarkDao {
    @Query("SELECT * FROM bookmarks ORDER BY timestamp DESC")
    fun getAllBookmarks(): Flow<List<BookmarkEntity>>

    @Query("SELECT * FROM bookmarks WHERE userId = :userId OR userId = '' ORDER BY timestamp DESC")
    fun getBookmarksForUser(userId: String): Flow<List<BookmarkEntity>>

    @Query("SELECT EXISTS(SELECT 1 FROM bookmarks WHERE questionId = :questionId)")
    fun isBookmarked(questionId: String): Flow<Boolean>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addBookmark(bookmark: BookmarkEntity)

    @Query("DELETE FROM bookmarks WHERE questionId = :questionId")
    suspend fun removeBookmark(questionId: String)
}

@Dao
interface UserProfileDao {
    @Query("SELECT * FROM user_profile WHERE id = 1")
    fun getUserProfile(): Flow<UserProfileEntity?>

    @Query("SELECT * FROM user_profile WHERE id = 1")
    suspend fun getUserProfileOnce(): UserProfileEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveUserProfile(profile: UserProfileEntity)
}

@Dao
interface FriendDao {
    @Query("SELECT * FROM friends ORDER BY accuracyPercent DESC")
    fun getAllFriends(): Flow<List<FriendEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertFriend(friend: FriendEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(friends: List<FriendEntity>)

    @Query("DELETE FROM friends WHERE id = :id")
    suspend fun deleteFriend(id: String)
}

@Dao
interface LiteratureBookDao {
    @Query("SELECT * FROM literature_books")
    fun getAllBooks(): Flow<List<LiteratureBookEntity>>

    @Query("SELECT * FROM literature_books WHERE id = :id")
    suspend fun getBookById(id: String): LiteratureBookEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertBook(book: LiteratureBookEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(books: List<LiteratureBookEntity>)
}

@Dao
interface StudyTaskDao {
    @Query("SELECT * FROM study_tasks WHERE dateString = :dateString ORDER BY id ASC")
    fun getTasksForDate(dateString: String): Flow<List<StudyTaskEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertTask(task: StudyTaskEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(tasks: List<StudyTaskEntity>)

    @Query("UPDATE study_tasks SET isDone = :isDone WHERE id = :taskId")
    suspend fun updateTaskStatus(taskId: Long, isDone: Boolean)
}

@Dao
interface FriendChatMessageDao {
    @Query("SELECT * FROM friend_chat_messages WHERE friendId = :friendId ORDER BY timestamp ASC")
    fun getMessagesForFriend(friendId: String): Flow<List<FriendChatMessageEntity>>

    @Query("SELECT * FROM friend_chat_messages ORDER BY timestamp DESC")
    fun getAllMessages(): Flow<List<FriendChatMessageEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMessage(message: FriendChatMessageEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(messages: List<FriendChatMessageEntity>)

    @Query("DELETE FROM friend_chat_messages WHERE friendId = :friendId")
    suspend fun deleteMessagesForFriend(friendId: String)
}

@Dao
interface QuestionExposureDao {
    @Query("SELECT * FROM question_exposures WHERE userId = :userId OR userId = ''")
    suspend fun getExposuresForUser(userId: String): List<QuestionExposureEntity>

    @Query("SELECT * FROM question_exposures WHERE (userId = :userId OR userId = '') AND subject = :subject")
    suspend fun getExposuresForSubject(userId: String, subject: String): List<QuestionExposureEntity>

    @Query("SELECT questionId FROM question_exposures WHERE userId = :userId OR userId = ''")
    suspend fun getExposedQuestionIds(userId: String): List<String>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun recordExposures(exposures: List<QuestionExposureEntity>)

    @Query("DELETE FROM question_exposures WHERE userId = :userId")
    suspend fun clearExposuresForUser(userId: String)
}

