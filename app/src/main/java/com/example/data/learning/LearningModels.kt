package com.example.data.learning

enum class TopicMasteryState(val label: String, val iconSymbol: String) {
    NOT_STARTED("Not Started", "○"),
    IN_PROGRESS("In Progress", "◐"),
    LEARNED("Learned", "✓"),
    NEEDS_PRACTICE("Needs Practice", "!"),
    STRONG("Strong", "★")
}

enum class LearningCardType {
    TEXT,
    DIAGRAM,
    COMPARISON,
    DEFINITION,
    EXAMPLE,
    WORKED_EXAMPLE,
    PROCESS,
    TABLE,
    FORMULA,
    QUESTION_REVEAL,
    KEY_TAKEAWAYS,
    EXAM_TIP,
    RULES
}

data class LearningCard(
    val id: String,
    val cardType: LearningCardType,
    val title: String,
    val content: String,
    val subtitle: String? = null,
    val keyTakeaway: String? = null,
    val bulletPoints: List<String> = emptyList(),
    val formula: String? = null,
    val formulaVariables: List<Pair<String, String>> = emptyList(), // e.g. "F" -> "Force in Newtons", "m" -> "Mass in kg"
    val comparisonLeftTitle: String? = null,
    val comparisonRightTitle: String? = null,
    val comparisonPairs: List<Pair<String, String>> = emptyList(),
    val processSteps: List<Pair<String, String>> = emptyList(), // Step label -> Step description
    val tableHeaders: List<String> = emptyList(),
    val tableRows: List<List<String>> = emptyList(),
    val revealPrompt: String? = null,
    val revealAnswer: String? = null,
    val examTip: String? = null,
    val learnMore: String? = null,
    val diagramId: String? = null // key for custom Compose visual diagram
)

data class Flashcard(
    val id: String,
    val cardType: LearningCardType = LearningCardType.DEFINITION,
    val title: String = "",
    val content: String = "",
    val subtitle: String? = null,
    val keyTakeaway: String? = null,
    val bulletPoints: List<String> = emptyList(),
    val formula: String? = null,
    val formulaVariables: List<Pair<String, String>> = emptyList(),
    val comparisonLeftTitle: String? = null,
    val comparisonRightTitle: String? = null,
    val comparisonPairs: List<Pair<String, String>> = emptyList(),
    val processSteps: List<Pair<String, String>> = emptyList(),
    val tableHeaders: List<String> = emptyList(),
    val tableRows: List<List<String>> = emptyList(),
    val revealPrompt: String? = null,
    val revealAnswer: String? = null,
    val examTip: String? = null,
    val learnMore: String? = null,
    val diagramId: String? = null,
    val imageUrl: String? = null,
    val order: Int = 1
)

data class PrepzaTopic(
    val id: String,
    val subjectId: String,
    val subjectName: String,
    val topicName: String,
    val displayOrder: Int,
    val description: String? = null,
    val flashcards: List<Flashcard> = emptyList(),
    val estimatedMinutes: Int = 5,
    val recallQuestions: List<QuickRecallQuestion> = emptyList()
) {
    val flashcardCount: Int get() = flashcards.size

    fun toLearningPack(): LearningPack = LearningPack(
        id = id,
        subject = subjectName,
        topicName = topicName,
        groupName = "UTME Syllabus",
        overview = description ?: "Core syllabus definitions, concepts, and UTME exam requirements for $topicName in $subjectName.",
        estimatedMinutes = estimatedMinutes,
        cards = flashcards.map {
            LearningCard(
                id = it.id,
                cardType = it.cardType,
                title = it.title,
                content = it.content,
                subtitle = it.subtitle,
                keyTakeaway = it.keyTakeaway,
                bulletPoints = it.bulletPoints,
                formula = it.formula,
                formulaVariables = it.formulaVariables,
                comparisonLeftTitle = it.comparisonLeftTitle,
                comparisonRightTitle = it.comparisonRightTitle,
                comparisonPairs = it.comparisonPairs,
                processSteps = it.processSteps,
                tableHeaders = it.tableHeaders,
                tableRows = it.tableRows,
                revealPrompt = it.revealPrompt,
                revealAnswer = it.revealAnswer,
                examTip = it.examTip,
                learnMore = it.learnMore,
                diagramId = it.diagramId
            )
        },
        recallQuestions = recallQuestions
    )
}

data class PrepzaSubject(
    val id: String,
    val name: String,
    val category: String,
    val iconName: String,
    val topics: List<PrepzaTopic>
) {
    val topicCount: Int get() = topics.size
}

data class QuickRecallQuestion(
    val id: String,
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String
)

data class LearningPack(
    val id: String,
    val subject: String,
    val topicName: String,
    val groupName: String,
    val overview: String,
    val estimatedMinutes: Int = 5,
    val cards: List<LearningCard>,
    val recallQuestions: List<QuickRecallQuestion>
)

data class TopicGroup(
    val groupName: String,
    val description: String = "",
    val topics: List<LearningPack>
)

data class SubjectCurriculum(
    val subjectName: String,
    val category: String,
    val iconName: String,
    val groups: List<TopicGroup>,
    val subjectId: String = ""
) {
    val allTopics: List<LearningPack> get() = groups.flatMap { it.topics }
    val totalTopicsCount: Int get() = allTopics.size
}
