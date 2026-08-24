package com.example.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(
    entities = [
        UserAccountEntity::class,
        QuestionEntity::class,
        PracticeSessionEntity::class,
        MistakeEntity::class,
        OfflinePackEntity::class,
        BookmarkEntity::class,
        UserProfileEntity::class,
        FriendEntity::class,
        LiteratureBookEntity::class,
        StudyTaskEntity::class,
        FriendChatMessageEntity::class,
        QuestionExposureEntity::class
    ],
    version = 11,
    exportSchema = false
)
abstract class PrepzaDatabase : RoomDatabase() {
    abstract fun userAccountDao(): UserAccountDao
    abstract fun questionDao(): QuestionDao
    abstract fun practiceSessionDao(): PracticeSessionDao
    abstract fun mistakeDao(): MistakeDao
    abstract fun offlinePackDao(): OfflinePackDao
    abstract fun bookmarkDao(): BookmarkDao
    abstract fun userProfileDao(): UserProfileDao
    abstract fun friendDao(): FriendDao
    abstract fun literatureBookDao(): LiteratureBookDao
    abstract fun studyTaskDao(): StudyTaskDao
    abstract fun friendChatMessageDao(): FriendChatMessageDao
    abstract fun questionExposureDao(): QuestionExposureDao

    companion object {
        @Volatile
        private var INSTANCE: PrepzaDatabase? = null

        private fun tableExists(db: SupportSQLiteDatabase, tableName: String): Boolean {
            return try {
                val cursor = db.query(
                    "SELECT 1 FROM sqlite_master WHERE type='table' AND name=?",
                    arrayOf(tableName)
                )
                val exists = cursor.moveToFirst()
                cursor.close()
                exists
            } catch (_: Exception) {
                false
            }
        }

        private fun columnExists(db: SupportSQLiteDatabase, tableName: String, columnName: String): Boolean {
            return try {
                val cursor = db.query("PRAGMA table_info($tableName)")
                val nameIndex = cursor.getColumnIndex("name")
                var found = false
                if (nameIndex != -1) {
                    while (cursor.moveToNext()) {
                        if (cursor.getString(nameIndex).equals(columnName, ignoreCase = true)) {
                            found = true
                            break
                        }
                    }
                }
                cursor.close()
                found
            } catch (_: Exception) {
                false
            }
        }

        private fun addColumnIfNotExists(
            db: SupportSQLiteDatabase,
            tableName: String,
            columnName: String,
            columnDefinition: String
        ) {
            if (tableExists(db, tableName) && !columnExists(db, tableName, columnName)) {
                try {
                    db.execSQL("ALTER TABLE $tableName ADD COLUMN $columnName $columnDefinition")
                } catch (_: Exception) {}
            }
        }

        private fun safeMigrate(db: SupportSQLiteDatabase) {
            addColumnIfNotExists(db, "user_profile", "isPlusSubscriber", "INTEGER NOT NULL DEFAULT 0")
            addColumnIfNotExists(db, "user_profile", "trialStartDate", "INTEGER NOT NULL DEFAULT 0")
            addColumnIfNotExists(db, "user_profile", "trialDurationDays", "INTEGER NOT NULL DEFAULT 30")
            addColumnIfNotExists(db, "user_profile", "simulatedDaysPassed", "INTEGER NOT NULL DEFAULT 0")
            addColumnIfNotExists(db, "user_profile", "dismissedReminderMilestonesCsv", "TEXT NOT NULL DEFAULT ''")
            addColumnIfNotExists(db, "questions", "passageText", "TEXT")
            addColumnIfNotExists(db, "questions", "difficulty", "TEXT NOT NULL DEFAULT 'Medium'")
            addColumnIfNotExists(db, "questions", "originType", "TEXT NOT NULL DEFAULT 'JAMB_ORIGINAL'")
            addColumnIfNotExists(db, "questions", "originLabel", "TEXT NOT NULL DEFAULT 'Original JAMB Question • 2024'")
            addColumnIfNotExists(db, "questions", "isVerifiedJamb", "INTEGER NOT NULL DEFAULT 1")
            addColumnIfNotExists(db, "questions", "imageUrl", "TEXT")
            addColumnIfNotExists(db, "mistakes", "selectedWrongOptionIndex", "INTEGER NOT NULL DEFAULT -1")
            
            try {
                db.execSQL("CREATE TABLE IF NOT EXISTS offline_packs (subject TEXT NOT NULL PRIMARY KEY, totalQuestions INTEGER NOT NULL, downloadedAt INTEGER NOT NULL, sizeMb REAL NOT NULL, yearsAvailable TEXT NOT NULL, isDownloaded INTEGER NOT NULL, downloadProgressPercent INTEGER NOT NULL)")
            } catch (_: Exception) {}

            try {
                db.execSQL("CREATE TABLE IF NOT EXISTS question_exposures (questionId TEXT NOT NULL, userId TEXT NOT NULL, subject TEXT NOT NULL, exposureCount INTEGER NOT NULL, lastExposedTimestamp INTEGER NOT NULL, PRIMARY KEY(questionId, userId))")
            } catch (_: Exception) {}

            addColumnIfNotExists(db, "user_profile", "jambExamDateTimestamp", "INTEGER NOT NULL DEFAULT 1745020800000")
            addColumnIfNotExists(db, "user_accounts", "jambExamDateTimestamp", "INTEGER NOT NULL DEFAULT 1745020800000")
            addColumnIfNotExists(db, "user_profile", "myReferralCode", "TEXT NOT NULL DEFAULT 'PRZ-5821'")
            addColumnIfNotExists(db, "user_profile", "referralCount", "INTEGER NOT NULL DEFAULT 0")
            addColumnIfNotExists(db, "user_profile", "referredByCode", "TEXT")
            addColumnIfNotExists(db, "user_profile", "freePlusRewardUnlocked", "INTEGER NOT NULL DEFAULT 0")
            addColumnIfNotExists(db, "user_accounts", "myReferralCode", "TEXT NOT NULL DEFAULT 'PRZ-5821'")
            addColumnIfNotExists(db, "user_accounts", "referralCount", "INTEGER NOT NULL DEFAULT 0")
            addColumnIfNotExists(db, "user_accounts", "referredByCode", "TEXT")
            addColumnIfNotExists(db, "user_accounts", "freePlusRewardUnlocked", "INTEGER NOT NULL DEFAULT 0")
        }

        val MIGRATION_1_2 = object : Migration(1, 2) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_2_3 = object : Migration(2, 3) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_3_4 = object : Migration(3, 4) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_4_5 = object : Migration(4, 5) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_5_6 = object : Migration(5, 6) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_6_7 = object : Migration(6, 7) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_7_8 = object : Migration(7, 8) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_8_9 = object : Migration(8, 9) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_9_10 = object : Migration(9, 10) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_10_11 = object : Migration(10, 11) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_1_11 = object : Migration(1, 11) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }
        val MIGRATION_9_11 = object : Migration(9, 11) { override fun migrate(db: SupportSQLiteDatabase) { safeMigrate(db) } }

        fun getDatabase(context: Context): PrepzaDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PrepzaDatabase::class.java,
                    "prepza_db"
                )
                    .addMigrations(
                        MIGRATION_1_2, MIGRATION_2_3, MIGRATION_3_4, MIGRATION_4_5, MIGRATION_5_6, MIGRATION_6_7, MIGRATION_7_8, MIGRATION_8_9,
                        MIGRATION_9_10, MIGRATION_10_11, MIGRATION_1_11, MIGRATION_9_11
                    )
                    .fallbackToDestructiveMigration(true)
                    .fallbackToDestructiveMigrationOnDowngrade(true)
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
