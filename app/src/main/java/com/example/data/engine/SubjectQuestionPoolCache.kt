package com.example.data.engine

import com.example.data.db.QuestionEntity
import com.example.data.repository.PrepzaRepository
import com.example.data.repository.QuestionBankGenerator
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.concurrent.ConcurrentHashMap

/**
 * High-performance, thread-safe in-memory cache for CBT question pools.
 * Eliminates redundant database round-trips and static array scanning during CBT startup.
 */
object SubjectQuestionPoolCache {

    private val poolCache = ConcurrentHashMap<String, List<QuestionEntity>>()
    @Volatile
    private var isPrewarmed = false

    /**
     * Retrieves the question pool for a list of subjects in sub-millisecond time.
     * Uses in-memory cache when available; falls back to Room DAO or static generator once.
     */
    suspend fun getPoolForSubjects(
        subjects: List<String>,
        repository: PrepzaRepository
    ): List<QuestionEntity> {
        val result = ArrayList<QuestionEntity>()
        val missingSubjects = mutableListOf<String>()

        for (subj in subjects) {
            val norm = QuestionBankGenerator.normalizeSubjectName(subj)
            val cached = poolCache[norm]
            if (cached != null && cached.isNotEmpty()) {
                result.addAll(cached)
            } else {
                missingSubjects.add(norm)
            }
        }

        if (missingSubjects.isNotEmpty()) {
            for (missing in missingSubjects) {
                val dbQuestions = repository.questionDao.getQuestionsBySubjectOnce(missing)
                val subjectQuestions = if (dbQuestions.isNotEmpty()) {
                    dbQuestions
                } else {
                    QuestionBankGenerator.getAllSeedQuestions().filter {
                        it.subject.equals(missing, ignoreCase = true)
                    }
                }
                if (subjectQuestions.isNotEmpty()) {
                    poolCache[missing] = subjectQuestions
                    result.addAll(subjectQuestions)
                }
            }
        }

        return result
    }

    /**
     * Retrieves the question pool for a single subject.
     */
    suspend fun getPoolForSubject(
        subject: String,
        repository: PrepzaRepository
    ): List<QuestionEntity> {
        val norm = QuestionBankGenerator.normalizeSubjectName(subject)
        val cached = poolCache[norm]
        if (cached != null && cached.isNotEmpty()) {
            return cached
        }

        val dbQuestions = repository.questionDao.getQuestionsBySubjectOnce(norm)
        val subjectQuestions = if (dbQuestions.isNotEmpty()) {
            dbQuestions
        } else {
            QuestionBankGenerator.getAllSeedQuestions().filter {
                it.subject.equals(norm, ignoreCase = true)
            }
        }

        if (subjectQuestions.isNotEmpty()) {
            poolCache[norm] = subjectQuestions
        }
        return subjectQuestions
    }

    /**
     * Pre-warms the question pool cache in the background during application initialization.
     */
    fun prewarm(repository: PrepzaRepository) {
        if (isPrewarmed) return
        isPrewarmed = true

        CoroutineScope(Dispatchers.Default).launch {
            try {
                val coreSubjects = listOf(
                    "English Language",
                    "Mathematics",
                    "Physics",
                    "Chemistry",
                    "Biology",
                    "Economics",
                    "Government",
                    "Literature in English",
                    "CRS",
                    "Commerce",
                    "Principles of Accounts"
                )

                for (subj in coreSubjects) {
                    val norm = QuestionBankGenerator.normalizeSubjectName(subj)
                    if (!poolCache.containsKey(norm)) {
                        val dbQuestions = repository.questionDao.getQuestionsBySubjectOnce(norm)
                        val subjectQuestions = if (dbQuestions.isNotEmpty()) {
                            dbQuestions
                        } else {
                            QuestionBankGenerator.getAllSeedQuestions().filter {
                                it.subject.equals(norm, ignoreCase = true)
                            }
                        }
                        if (subjectQuestions.isNotEmpty()) {
                            poolCache[norm] = subjectQuestions
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    /**
     * Clears the in-memory cache (e.g., after DB re-seeding or updates).
     */
    fun invalidate() {
        poolCache.clear()
        isPrewarmed = false
    }
}
