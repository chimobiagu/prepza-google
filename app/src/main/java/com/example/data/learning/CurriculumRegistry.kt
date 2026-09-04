package com.example.data.learning

/**
 * Registry facilitating curriculum lookups and topic pack access for PREPZA.
 * Driven by [TopicDatabase] as the single source of truth for all 14 subjects and 350 topics.
 */
object CurriculumRegistry {

    fun getCurriculum(subjectName: String): SubjectCurriculum? {
        val subject = TopicDatabase.getSubject(subjectName) ?: return null
        return TopicDatabase.toSubjectCurriculum(subject)
    }

    fun getAllCurriculums(): List<SubjectCurriculum> {
        return TopicDatabase.ALL_SUBJECTS.map { TopicDatabase.toSubjectCurriculum(it) }
    }

    fun getTopicPack(subjectName: String, topicName: String): LearningPack? {
        val topic = TopicDatabase.findTopic(subjectName, topicName)
        if (topic != null) {
            return topic.toLearningPack()
        }

        val subject = TopicDatabase.getSubject(subjectName)
        val defaultTopic = subject?.topics?.firstOrNull()
        return defaultTopic?.toLearningPack() ?: LearningPack(
            id = "${subjectName.lowercase().trim()}-intro",
            subject = subjectName,
            topicName = topicName,
            groupName = "UTME Syllabus",
            overview = "Core syllabus requirements and exam notes for $topicName in $subjectName.",
            estimatedMinutes = 5,
            cards = emptyList(),
            recallQuestions = emptyList()
        )
    }
}
