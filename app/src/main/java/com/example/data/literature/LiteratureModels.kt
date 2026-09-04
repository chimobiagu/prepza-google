package com.example.data.literature

import androidx.compose.ui.graphics.Color

/**
 * High-yield, structured data models for the PREPZA Literature & Library Learning System.
 * Supports polymorphic content for all JAMB UTME Prescribed and Historical Literature texts.
 */

data class AuthorInfo(
    val name: String,
    val lifespan: String,
    val nationality: String,
    val biography: String,
    val notableWorks: List<String>,
    val literaryMovementOrPeriod: String,
    val examSignificance: String
)

data class LiteratureChapter(
    val chapterNumber: Int,
    val title: String,
    val summary: String,
    val keyQuotes: List<String>,
    val fullText: String
)

data class LiteratureBackground(
    val historicalContext: String,
    val socialContext: String,
    val circumstancesSurroundingWork: String,
    val targetExamRelevance: String
)

data class PlotStage(
    val title: String,
    val subtitle: String,
    val description: String,
    val keyEvents: List<String>
)

data class LiteraturePlot(
    val overview: String,
    val beginning: PlotStage,
    val majorEvents: PlotStage,
    val turningPoints: PlotStage,
    val climax: PlotStage,
    val resolution: PlotStage
)

data class LiteratureCharacter(
    val name: String,
    val role: String, // e.g. "Protagonist", "Antagonist", "Major Supporting", "Deuteragonist"
    val isProtagonist: Boolean = false,
    val isAntagonist: Boolean = false,
    val personalityTraits: List<String>,
    val relationships: String,
    val storyImportance: String,
    val characterDevelopment: String = "",
    val memorableQuotes: List<String> = emptyList()
)

data class LiteratureTheme(
    val title: String,
    val explanation: String,
    val appearanceInStory: String,
    val examplesAndEvents: List<String>,
    val examTakeaway: String
)

data class LiteratureDevice(
    val deviceName: String, // Metaphor, Simile, Dramatic Irony, Symbolism, Foreshadowing, Satire, Personification, etc.
    val definition: String,
    val exactExcerpt: String,
    val contextAndAnalysis: String,
    val examImportance: String
)

data class LiteratureSetting(
    val whereLocations: List<Pair<String, String>>, // Location Name -> Description
    val whenTimePeriod: String,
    val socialEnvironmentalSetting: String,
    val symbolicSignificance: String
)

data class ImportantFactItem(
    val category: String, // "Characters", "Relationships", "Events", "Locations", "Themes", "Author", "Literary Concepts"
    val fact: String,
    val examTip: String = "High-Yield UTME literature takeaway"
) {
    val factTitle: String get() = fact.take(45) + if (fact.length > 45) "..." else ""
    val detail: String get() = fact
    val importance: String get() = examTip
}

typealias LiteratureFact = ImportantFactItem

data class QuickRevisionSheet(
    val oneSentenceSummary: String,
    val coreSynopsis: String,
    val keyCharactersSummary: List<Pair<String, String>>,
    val topThemes: List<Pair<String, String>>,
    val dominantDevices: List<Pair<String, String>>,
    val tenMustKnowExamFacts: List<String>
) {
    val topThemesSummary: List<Pair<String, String>> get() = topThemes
    val mustKnowExamFacts: List<String> get() = tenMustKnowExamFacts
}

data class LiteratureQuizQuestion(
    val id: Int,
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String,
    val questionType: String = "Practice Question", // "Practice Question", "Past Question", "Quick Quiz", "Chapter Question"
    val relatedChapter: String? = null,
    val utmeYear: String? = null
) {
    val questionText: String get() = question
    val correctOptionIndex: Int get() = correctIndex
}

/**
 * Master polymorphic study bundle for any book in PREPZA Library.
 */
data class LiteratureBookStudyData(
    val id: String,
    val title: String,
    val author: String,
    val authorInfo: AuthorInfo,
    val category: String, // "Compulsory UTME Prose", "African Prose", "African Drama", "Non-African Drama", "Non-African Prose", "Selected UTME Poems"
    val publicationYear: String,
    val tagline: String,
    val coverAccentColor: Color,
    val totalChaptersCount: Int,
    val chapters: List<LiteratureChapter>,
    val background: LiteratureBackground,
    val plot: LiteraturePlot,
    val characters: List<LiteratureCharacter>,
    val themes: List<LiteratureTheme>,
    val literaryDevices: List<LiteratureDevice>,
    val setting: LiteratureSetting,
    val importantFacts: List<ImportantFactItem>,
    val quickRevision: QuickRevisionSheet,
    val practiceQuestions: List<LiteratureQuizQuestion>
)
