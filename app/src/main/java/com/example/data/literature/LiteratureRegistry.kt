package com.example.data.literature

import androidx.compose.ui.graphics.Color
import com.example.ui.theme.PrimaryGreenDark
import com.example.ui.theme.BookCoverBlue
import com.example.ui.theme.BookCoverDark
import com.example.ui.theme.BookCoverGreen
import com.example.ui.theme.BookCoverPurple
import com.example.data.repository.TheLifeChangerCompleteBook
import com.example.data.repository.SecondClassCitizenBook
import com.example.data.repository.TheLionAndTheJewelBook
import com.example.data.repository.LookBackInAngerBook
import com.example.data.repository.WutheringHeightsBook

/**
 * Universal Literature Registry for PREPZA.
 * Provides rich, modular, structured study data for all JAMB UTME Literature books.
 */
object LiteratureRegistry {

    private val booksMap: MutableMap<String, LiteratureBookStudyData> = mutableMapOf()

    init {
        registerBook(buildLifeChangerData())
        registerBook(buildSecondClassCitizenData())
        registerBook(buildTheLionAndTheJewelData())
        registerBook(buildLookBackInAngerData())
        registerBook(buildWutheringHeightsData())
        registerBook(buildSheWalksInBeautyData())
        registerBook(buildSweetSixteenData())
    }

    fun registerBook(book: LiteratureBookStudyData) {
        booksMap[book.id] = book
    }

    fun getBookById(id: String): LiteratureBookStudyData? {
        return booksMap[id] ?: booksMap.values.find { 
            it.title.equals(id, ignoreCase = true) || 
            it.id.contains(id, ignoreCase = true) || 
            id.contains(it.id, ignoreCase = true) 
        }
    }

    fun getBookByTitle(title: String): LiteratureBookStudyData? {
        return booksMap.values.find { it.title.contains(title, ignoreCase = true) || title.contains(it.title, ignoreCase = true) }
            ?: booksMap["book_1"]
    }

    fun getBookByIdOrTitle(id: String, title: String): LiteratureBookStudyData {
        return getBookById(id) ?: getBookByTitle(title) ?: booksMap.values.first()
    }

    fun getAllBooks(): List<LiteratureBookStudyData> = booksMap.values.toList()

    // -------------------------------------------------------------
    // 1. THE LIFE CHANGER (Khadijat Abubakar Jalli)
    // -------------------------------------------------------------
    private fun buildLifeChangerData(): LiteratureBookStudyData {
        val lcChapters = TheLifeChangerCompleteBook.chapters.map { ch ->
            LiteratureChapter(
                chapterNumber = ch.chapterNumber,
                title = ch.title,
                summary = ch.summary,
                keyQuotes = ch.keyQuotes,
                fullText = ch.fullText
            )
        }

        return LiteratureBookStudyData(
            id = "book_1",
            title = "The Life Changer",
            author = "Khadijat Abubakar Jalli",
            authorInfo = AuthorInfo(
                name = "Khadijat Abubakar Jalli",
                lifespan = "Contemporary Nigerian Author",
                nationality = "Nigerian",
                biography = "Khadijat Abubakar Jalli holds a B.Sc (Ed) in Mathematics and is a seasoned educational entrepreneur and CEO of She's Boutique Afrique. 'The Life Changer' is her acclaimed debut novel, written to guide young adults through the social, moral, and academic transitions of tertiary education.",
                notableWorks = listOf("The Life Changer (2020)"),
                literaryMovementOrPeriod = "Contemporary 21st-Century Nigerian Campus Fiction / Moral Realism",
                examSignificance = "Mandatory general reading text for all UTME candidates in the Use of English paper, emphasizing campus ethics, Examination Malpractice (EMDC), cybercrime, parental guidance, and youth redemption."
            ),
            category = "Compulsory UTME Prose",
            publicationYear = "2020 (Academy Press Plc)",
            tagline = "A compelling campus narrative on youth choices, morality, and resilience.",
            coverAccentColor = BookCoverDark,
            totalChaptersCount = lcChapters.size,
            chapters = lcChapters,
            background = LiteratureBackground(
                historicalContext = "Set in 21st-century modern Nigeria, reflecting the transition of secondary school leavers into higher education institutions with contemporary challenges like cybercrime, social media allure, and peer pressure.",
                socialContext = "Explores the contrast between conservative northern Nigerian family values (exemplified by Ummi's household in Lafayette) and the cosmopolitan, hedonistic lifestyle of tertiary campus life.",
                circumstancesSurroundingWork = "Commissioned and selected by JAMB to address moral decadence, examination malpractice, and cultism among prospective university undergraduates.",
                targetExamRelevance = "High-priority core text. Students are tested on specific characters (Salma, Tomiwa, Ngozi, Ada, Habib, Labaran, Kabir), plot twists, moral lessons, and vocabulary."
            ),
            plot = LiteraturePlot(
                overview = "The novel is narrated from the perspective of Ummi as she counsels her children (Omar, Teemah, Jamila, and Bint) on the eve of Omar's departure for university. Through embedded flashbacks, Ummi recounts her own youthful encounters and the dramatic campus tribulations of Salma, highlighting redemption and moral vigilance.",
                beginning = PlotStage(
                    title = "1. Family Gathering in Lafayette",
                    subtitle = "Omar's Admission & The French Lesson",
                    description = "Five-year-old Bint amuses her family with her story of outsmarting her teacher in French class. Omar returns jubilantly with his admission letter to study Law at Ahmadu Bello University (ABU), prompting a maternal counseling session.",
                    keyEvents = listOf(
                        "Bint narrates the classroom French episode with Mallam Salihu.",
                        "Omar receives his JAMB admission letter to study Law.",
                        "Ummi emphasizes that education is a life changer."
                    )
                ),
                majorEvents = PlotStage(
                    title = "2. Campus Entrance & The Roommates",
                    subtitle = "Salma's Arrogance & Room 47",
                    description = "Salma arrives at the university full of haughtiness, showing off her beauty and scorning the dress code. She shares Room 47 with Tomiwa (from Ibadan), Ngozi (from Umunze), and Ada (from Benue), where mutual tolerance transcends tribal boundaries.",
                    keyEvents = listOf(
                        "Salma dismisses university rules and mocks Dr. Dabo during registration.",
                        "Formation of the inter-ethnic sisterhood in Room 47.",
                        "Salma engages with wealthy politicians (Habib and Labaran) using Tomiwa as an accomplice."
                    )
                ),
                turningPoints = PlotStage(
                    title = "3. The Fall & Fraudulent Networks",
                    subtitle = "Exam Malpractice & Kabir's Betrayal",
                    description = "Salma cheats during her final examination in Moral Philosophy and is caught by a vigilant female invigilator. She signs the Examination Malpractice Form (EMDC) and tries to bribe the committee through Kabir, a cunning tout who swindles her.",
                    keyEvents = listOf(
                        "Salma gets caught passing cheat notes in Moral Philosophy.",
                        "Salma meets Kabir, who poses as a well-connected university insider.",
                        "Kabir collects N100,000 and Salma's luxury necklace, then vanishes into gambling dens with Zaki."
                    )
                ),
                climax = PlotStage(
                    title = "4. Expulsion & Tragic Loss",
                    subtitle = "The EMDC Verdict & Family Grief",
                    description = "Salma is expelled from the university. At the same time, she suffers the tragic death of her father. Desolate and humbled, she realizes the utter vanity of her former deceitful lifestyle.",
                    keyEvents = listOf(
                        "The EMDC committee officially expels Salma.",
                        "Salma loses her father, plunging her into deep grief.",
                        "She undergoes a profound moral awakening and seeks forgiveness."
                    )
                ),
                resolution = PlotStage(
                    title = "5. Redemption & Parental Wisdom",
                    subtitle = "The New Salma & Omar's Readiness",
                    description = "Salma transforms her life, adopts modesty, and dedicates herself to honest enterprise and community service. Ummi concludes her storytelling, equipping Omar with timeless wisdom for his upcoming university voyage.",
                    keyEvents = listOf(
                        "Salma makes peace with Ummi and her former roommates.",
                        "Omar vows to pursue his Law studies with integrity and humility.",
                        "The family embraces, united in moral purpose."
                    )
                )
            ),
            characters = listOf(
                LiteratureCharacter(
                    name = "Ummi (The Narrator)",
                    role = "Protagonist / Storyteller & Mother",
                    isProtagonist = true,
                    personalityTraits = listOf("Wise", "Patient", "Virtuous", "Observant", "Nurturing"),
                    relationships = "Mother to Omar, Teemah, Jamila, and Bint; wife to their father.",
                    storyImportance = "Serves as the narrative consciousness, sharing personal experiences and Salma's cautionary tale to protect her son Omar from university pitfalls.",
                    characterDevelopment = "Remains steadfast in her moral integrity, acting as the ethical compass of the entire narrative.",
                    memorableQuotes = listOf(
                        "What you teach a child is like writing on a rock and when dried, it would be difficult to erase.",
                        "Education is a life changer... it changes your life and it also changes you."
                    )
                ),
                LiteratureCharacter(
                    name = "Salma",
                    role = "Central Focus / Tragic & Redeemed Heroine",
                    isProtagonist = false,
                    isAntagonist = false,
                    personalityTraits = listOf("Initially Proud", "Sophisticated", "Impulsive", "Extravagant", "Ultimately Penitent"),
                    relationships = "Roommate to Tomiwa, Ngozi, and Ada; mistress to Habib; victim of Kabir.",
                    storyImportance = "Illustrates the seductive perils of campus life, the devastating consequences of cheating, and the redemptive power of self-reckoning.",
                    characterDevelopment = "Evolves from a haughty, arrogant campus diva into a humble, deeply remorseful, and morally reformed woman after her expulsion and father's demise.",
                    memorableQuotes = listOf(
                        "University is not secondary school; nobody tells you when to sleep or when to study."
                    )
                ),
                LiteratureCharacter(
                    name = "Omar",
                    role = "Supporting / The Prospective Student",
                    personalityTraits = listOf("Ambitious", "Eager", "Respectful", "Curious"),
                    relationships = "Ummi's eldest child and only son; elder brother to Teemah, Jamila, and Bint.",
                    storyImportance = "His admission to study Law at ABU Zaria is the catalyst for the storytelling session.",
                    characterDevelopment = "Absorbs his mother's deep life lessons, maturing in his outlook toward independence and academic ethics."
                ),
                LiteratureCharacter(
                    name = "Tomiwa",
                    role = "Major Supporting / Roommate",
                    personalityTraits = listOf("Bright", "Fashionable", "Loyal", "Socially adept"),
                    relationships = "Roommate from Ibadan, close confidante to Salma, Ngozi, and Ada.",
                    storyImportance = "Represents inter-tribal harmony and intelligence in Room 47; inadvertently gets involved in Habib's social circle.",
                    characterDevelopment = "Maintains high academic performance while supporting Salma through her tribulations."
                ),
                LiteratureCharacter(
                    name = "Kabir",
                    role = "Antagonist / Campus Con-Artist",
                    isAntagonist = true,
                    personalityTraits = listOf("Deceitful", "Mercenary", "Cunning", "Gambler"),
                    relationships = "Associates with Zaki; poses as EMDC fixer to defraud Salma.",
                    storyImportance = "Embodies external campus predators who exploit vulnerable, desperate students involved in examination malpractice.",
                    characterDevelopment = "Continues in criminal schemes until assaulted and swindled in a gambling joint."
                ),
                LiteratureCharacter(
                    name = "Honourable Habib & Labaran",
                    role = "Supporting / Wealthy Political Figures",
                    personalityTraits = listOf("Wealthy", "Influential", "Patronizing"),
                    relationships = "Politician and driver/associate who shower gifts on Salma and Tomiwa.",
                    storyImportance = "Exemplifies external societal forces that attempt to sway and distract young female undergraduates with material luxuries."
                )
            ),
            themes = listOf(
                LiteratureTheme(
                    title = "The Transformative Power of Education",
                    explanation = "Education is portrayed not merely as a ticket to professional employment, but as a holistic agent that alters a person's worldview, intellect, and moral sensibilities.",
                    appearanceInStory = "Introduced through Omar's Law admission and contrasted with Salma's initial shallow perception of university life.",
                    examplesAndEvents = listOf(
                        "Ummi explains how university reshapes human personality.",
                        "Salma learns too late that true academic success requires diligence over shortcuts."
                    ),
                    examTakeaway = "Key theme: Education changes your life and also changes who you are."
                ),
                LiteratureTheme(
                    title = "Perils of Arrogance & Campus Vanity",
                    explanation = "Unchecked pride, reliance on physical beauty, and disregard for institutional discipline lead directly to personal downfall.",
                    appearanceInStory = "Salma's initial attitude toward lecturers, university dress codes, and her condescending remarks to Dr. Dabo.",
                    examplesAndEvents = listOf(
                        "Salma mocking Dr. Dabo during clearance.",
                        "Salma's flashy lifestyle leading to vulnerability and exploitation."
                    ),
                    examTakeaway = "Hubris is Salma's primary tragic flaw before her eventual redemption."
                ),
                LiteratureTheme(
                    title = "Examination Malpractice & Academic Integrity",
                    explanation = "Cheating undermines the integrity of education and attracts devastating legal, institutional, and emotional punishments.",
                    appearanceInStory = "Salma's attempt to copy notes in Moral Philosophy and her subsequent trial before the EMDC.",
                    examplesAndEvents = listOf(
                        "Vigilant invigilator catches Salma with smuggled notes.",
                        "The EMDC committee enforces strict zero-tolerance expulsion."
                    ),
                    examTakeaway = "JAMB frequently asks questions on the EMDC process, Kabir's bribery scam, and the Moral Philosophy exam."
                ),
                LiteratureTheme(
                    title = "National Unity & Inter-Tribal Harmony",
                    explanation = "Students from diverse ethnic and cultural backgrounds can coexist peacefully, supporting one another through understanding and tolerance.",
                    appearanceInStory = "Room 47 bringing together Salma (North), Tomiwa (Yoruba/West), Ngozi (Igbo/East), and Ada (Middle Belt/Benue).",
                    examplesAndEvents = listOf(
                        "The four roommates sharing meals, customs, and study sessions without ethnic prejudice."
                    ),
                    examTakeaway = "Room 47 is a micro-cosmic symbol of a harmonious Nigeria."
                )
            ),
            literaryDevices = listOf(
                LiteratureDevice(
                    deviceName = "Frame Narrative (Story within a Story)",
                    definition = "A narrative structure where an introductory or main story sets the stage for a series of embedded shorter stories.",
                    exactExcerpt = "Ummi sitting with her children under the mango tree, recounting the tales of Bint, Omar, and Salma.",
                    contextAndAnalysis = "The author uses Ummi's home counseling as the outer frame to deliver multiple moral campus sub-stories.",
                    examImportance = "Frequently asked in UTME Literature structure questions."
                ),
                LiteratureDevice(
                    deviceName = "Dramatic Irony",
                    definition = "A situation in which the audience or reader knows more about the circumstances than the characters themselves.",
                    exactExcerpt = "Salma believing Kabir has settled the EMDC committee members with her N100,000, while the reader sees Kabir heading to a gambling den.",
                    contextAndAnalysis = "Heightens tension and emphasizes Salma's naive desperation.",
                    examImportance = "Key question on Kabir's scam."
                ),
                LiteratureDevice(
                    deviceName = "Simile",
                    definition = "An explicit comparison of two distinct things using 'like' or 'as'.",
                    exactExcerpt = "What you teach a child is like writing on a rock and when dried, it would be difficult to erase.",
                    contextAndAnalysis = "Grandmother's proverb emphasizing the enduring nature of early childhood moral upbringing.",
                    examImportance = "Crucial quote analysis."
                ),
                LiteratureDevice(
                    deviceName = "Satire",
                    definition = "The use of humor, irony, exaggeration, or ridicule to expose and criticize people's stupidity or vices.",
                    exactExcerpt = "Salma cheating specifically in an examination titled 'Moral Philosophy'.",
                    contextAndAnalysis = "The author mocks the irony of cheating in a course designed to teach ethics and virtue.",
                    examImportance = "High-yield irony/satire question in UTME."
                )
            ),
            setting = LiteratureSetting(
                whereLocations = listOf(
                    "Lafayette Family Compound" to "Serene home in northern Nigeria where Ummi imparts wisdom to her children under the mango tree.",
                    "Ahmadu Bello University (ABU), Zaria" to "The vibrant, bustling campus grounds where the primary student dramas unfold.",
                    "Room 47, Queen Amina Hall" to "The shared dormitory room symbolizing ethnic harmony and unity among diverse Nigerian girls.",
                    "Faculty of Law, Kongo Campus" to "Omar's upcoming academic destination.",
                    "EMDC Hearing Chambers" to "The formal disciplinary room where examination malpractice cases are tried."
                ),
                whenTimePeriod = "Contemporary 21st-century Nigeria (post-2010s).",
                socialEnvironmentalSetting = "Rapidly modernizing Nigerian society with university admissions pressure, mobile banking, cybercrime, and traditional family expectations.",
                symbolicSignificance = "The journey from Lafayette (peaceful tradition) to Zaria (cosmopolitan test) symbolizes the youth's transition into adult responsibility."
            ),
            importantFacts = listOf(
                ImportantFactItem(
                    category = "Characters",
                    fact = "Bint is Ummi's 5-year-old daughter who learned 'Bonjour' and 'C'est tres bien'.",
                    examTip = "Often tested in opening chapter questions."
                ),
                ImportantFactItem(
                    category = "Events",
                    fact = "Salma was caught cheating in Moral Philosophy and signed the EMDC form.",
                    examTip = "Remember the course name: Moral Philosophy."
                ),
                ImportantFactItem(
                    category = "Relationships",
                    fact = "Room 47 consists of Salma, Tomiwa, Ngozi, and Ada from four distinct regions of Nigeria.",
                    examTip = "Shows inter-ethnic coexistence."
                ),
                ImportantFactItem(
                    category = "Plot",
                    fact = "Kabir was a tout who swindled Salma of N100,000 pretending to bribe EMDC officials.",
                    examTip = "Kabir loses the money in a gambling joint."
                ),
                ImportantFactItem(
                    category = "Author",
                    fact = "Khadijat Abubakar Jalli holds a B.Sc (Ed) in Mathematics.",
                    examTip = "Author background question."
                )
            ),
            quickRevision = QuickRevisionSheet(
                oneSentenceSummary = "A mother counsels her university-bound son through engaging campus stories highlighting the dangers of vanity, cheating, and deceit, and the ultimate triumph of moral redemption.",
                coreSynopsis = "Omar gains admission to study Law at ABU Zaria. His mother Ummi narrates the cautionary tale of Salma, an arrogant campus beauty who engages in luxury seeking, commits examination malpractice in Moral Philosophy, gets scammed by Kabir, and is expelled. Following her father's death, Salma is reformed, offering Omar an invaluable blueprint for academic integrity.",
                keyCharactersSummary = listOf(
                    "Ummi" to "Wise mother, narrator, and moral guide.",
                    "Salma" to "Arrogant beauty turned penitent and reformed woman.",
                    "Omar" to "Admitted law student and attentive listener.",
                    "Tomiwa, Ngozi, Ada" to "Room 47 roommates representing Nigerian unity.",
                    "Kabir" to "Dishonest tout and EMDC extortionist."
                ),
                topThemes = listOf(
                    "Transformative Education" to "Reshaping morals and intellect.",
                    "Examination Integrity" to "Cheating leads to expulsion.",
                    "Ethnic Harmony" to "Room 47 solidarity.",
                    "Humility vs Vanity" to "Downfall of pride."
                ),
                dominantDevices = listOf(
                    "Frame Narrative" to "Story within a story.",
                    "Dramatic Irony" to "Salma trusting Kabir.",
                    "Satire" to "Cheating in Moral Philosophy."
                ),
                tenMustKnowExamFacts = listOf(
                    "1. Bint's French teacher was Mallam Salihu.",
                    "2. Omar's admission is to study Law at ABU Zaria (Kongo Campus).",
                    "3. Salma's initial clearance encounter was with Dr. Dabo.",
                    "4. The course Salma cheated in was Moral Philosophy.",
                    "5. The disciplinary committee is EMDC (Examination Malpractice Disciplinary Committee).",
                    "6. Room 47 residents: Salma, Tomiwa, Ngozi, Ada.",
                    "7. Kabir collected N100,000 from Salma to bribe the committee.",
                    "8. Kabir lost the loot in a gambling parlor fight with Zaki.",
                    "9. Salma's father passed away shortly after her university expulsion.",
                    "10. The novel advocates repentance, modesty, and uncompromising integrity."
                )
            ),
            practiceQuestions = listOf(
                LiteratureQuizQuestion(
                    id = 101,
                    question = "Why did Bint's class teacher leave the classroom in Chapter One?",
                    options = listOf(
                        "A) He was angry at Bint's insolence",
                        "B) He went to call the senior French Mistress to answer Bint's question",
                        "C) The school bell for break had rung",
                        "D) He had an urgent staff meeting"
                    ),
                    correctIndex = 1,
                    explanation = "Mallam Salihu could not translate 'That's very good' into French, so he ran out to fetch the senior French Mistress.",
                    questionType = "Chapter Question",
                    relatedChapter = "Chapter 1"
                ),
                LiteratureQuizQuestion(
                    id = 102,
                    question = "Which examination course was Salma writing when she was caught cheating?",
                    options = listOf(
                        "A) Nigerian Constitutional Law",
                        "B) Introduction to Sociology",
                        "C) Moral Philosophy",
                        "D) General African Studies"
                    ),
                    correctIndex = 2,
                    explanation = "The ultimate irony in the novel is that Salma was caught cheating during the 'Moral Philosophy' exam.",
                    questionType = "Past Question",
                    relatedChapter = "Chapter 6"
                ),
                LiteratureQuizQuestion(
                    id = 103,
                    question = "What happened to the money Kabir took from Salma under the pretext of bribing the EMDC?",
                    options = listOf(
                        "A) He handed it over to the committee chairman",
                        "B) He deposited it in his personal bank account",
                        "C) He lost it to fellow gamblers and thugs",
                        "D) He bought a brand new car"
                    ),
                    correctIndex = 2,
                    explanation = "Kabir was tracked down to a local gambling den where he lost the money in reckless wagering and a brawl.",
                    questionType = "Practice Question",
                    relatedChapter = "Chapter 7"
                ),
                LiteratureQuizQuestion(
                    id = 104,
                    question = "Room 47 in Queen Amina Hall is symbolically significant because it demonstrates:",
                    options = listOf(
                        "A) The squalor of university hostel accommodation",
                        "B) Inter-ethnic solidarity and peaceful coexistence among Nigerian youths",
                        "C) The excessive wealth of university undergraduates",
                        "D) The breakdown of campus security"
                    ),
                    correctIndex = 1,
                    explanation = "Room 47 brought together girls from Hausa, Yoruba, Igbo, and Middle Belt backgrounds who lived in harmony.",
                    questionType = "Practice Question",
                    relatedChapter = "Chapter 3"
                ),
                LiteratureQuizQuestion(
                    id = 105,
                    question = "What major life tragedy contributed to Salma's complete moral transformation?",
                    options = listOf(
                        "A) A motor vehicle accident",
                        "B) The death of her father following her expulsion",
                        "C) Rejection by Honourable Habib",
                        "D) A long prison sentence"
                    ),
                    correctIndex = 1,
                    explanation = "Her expulsion combined with the grief of losing her father shattered her vanity and sparked genuine moral reform.",
                    questionType = "Quick Quiz",
                    relatedChapter = "Chapter 8"
                )
            )
        )
    }

    // -------------------------------------------------------------
    // 2. SECOND-CLASS CITIZEN (Buchi Emecheta)
    // -------------------------------------------------------------
    private fun buildSecondClassCitizenData(): LiteratureBookStudyData {
        val sccChapters = SecondClassCitizenBook.chapters.map { ch ->
            LiteratureChapter(
                chapterNumber = ch.chapterNumber,
                title = ch.title,
                summary = ch.summary,
                keyQuotes = ch.keyQuotes,
                fullText = ch.fullText
            )
        }

        return LiteratureBookStudyData(
            id = "book_second_class_citizen",
            title = "Second-Class Citizen",
            author = "Buchi Emecheta",
            authorInfo = AuthorInfo(
                name = "Buchi Emecheta (OBE)",
                lifespan = "1944 – 2017",
                nationality = "Nigerian-British",
                biography = "Buchi Emecheta was one of Africa's foremost feminist writers. Born in Lagos to Igbo parents from Ibuza, she moved to the UK in 1962, where she raised five children as a single mother while earning a sociology degree from the University of London. Her work chronicles female resilience against colonial and patriarchal subjugation.",
                notableWorks = listOf("Second-Class Citizen (1974)", "The Joys of Motherhood (1979)", "The Bride Price (1976)", "In the Ditch (1972)"),
                literaryMovementOrPeriod = "African Feminist Realism / Postcolonial Migrant Literature",
                examSignificance = "Prescribed African Prose in JAMB UTME. Students are tested on Adah's resilience, Francis's cruelty, racism in post-war Britain, and the destruction of the manuscript 'The Bride Price'."
            ),
            category = "African Prose",
            publicationYear = "1974 (Allison & Busby)",
            tagline = "An inspiring semi-autobiographical chronicle of resilience, womanhood, and migration.",
            coverAccentColor = BookCoverBlue,
            totalChaptersCount = sccChapters.size,
            chapters = sccChapters,
            background = LiteratureBackground(
                historicalContext = "Set during the 1960s post-independence era, depicting the mass migration of Commonwealth West African citizens to the United Kingdom in search of 'the Golden Fleece' (higher education).",
                socialContext = "Examines the severe shock of encountering systemic racism, housing discrimination ('No Coloureds, No Dogs'), and social descent from middle-class status in Nigeria to 'second-class' status in Britain.",
                circumstancesSurroundingWork = "Semi-autobiographical novel based on Buchi Emecheta's own harrowing early marriage to Sylvester Onwordi in North London.",
                targetExamRelevance = "Core African prose for UTME Literature. Frequent questions focus on characters (Adah, Francis, Trudy, Mr Noble, Bill), themes of patriarchy, and key plot events."
            ),
            plot = LiteraturePlot(
                overview = "Follows Adah Ofili from childhood in Lagos through her forced servitude, marriage to Francis Obi, and migration to London. In the UK, Adah endures poverty, racial prejudice, and brutal domestic abuse while working as a librarian. When Francis burns her cherished manuscript 'The Bride Price', Adah finally leaves him to secure freedom for herself and her children.",
                beginning = PlotStage(
                    title = "1. Childhood in Colonial Lagos",
                    subtitle = "The Quest for Schooling & Loss of Pa",
                    description = "Adah sneaks to Methodist School as a little girl because her parents prioritize her brother Boy's education. After her beloved father dies, she is sent to live as an unpaid servant in her maternal uncle's house.",
                    keyEvents = listOf(
                        "Adah runs away to attend Mr Fafunwa's class at Methodist School.",
                        "Pa dies in the hospital; Adah's mother is inherited by Pa's brother.",
                        "Adah wins a scholarship to Methodist Girls' High School."
                    )
                ),
                majorEvents = PlotStage(
                    title = "2. Marriage & Journey to the UK",
                    subtitle = "Francis Obi & Arrival in London",
                    description = "To escape forced marriage to older men, Adah marries student accountant Francis Obi. Working as a high-earning librarian at the American Consulate, she finances Francis's journey to England and eventually joins him with their two children.",
                    keyEvents = listOf(
                        "Adah marries Francis and secures a lucrative library post.",
                        "Francis sails to England; Adah finances the voyage.",
                        "Adah arrives at Liverpool and is shocked by London's cold and squalor."
                    )
                ),
                turningPoints = PlotStage(
                    title = "3. Squalor & Racial Prejudice",
                    subtitle = "Ashdown Street & Trudy the Child-Minder",
                    description = "Adah and Francis live in a damp, rodent-infested room on Ashdown Street. Francis fails his exams repeatedly, relies entirely on Adah's wages, and treats her as an inferior subject.",
                    keyEvents = listOf(
                        "Adah confronts racist housing notices ('No Blacks, No Dogs').",
                        "Trudy neglects Titi and Vicky, leading to Vicky contracting meningitis.",
                        "Adah secures a comfortable library job at Chalk Farm Library."
                    )
                ),
                climax = PlotStage(
                    title = "4. The Burning of 'The Bride Price'",
                    subtitle = "Francis's Ultimate Betrayal",
                    description = "Adah writes her first novel, 'The Bride Price', which receives warm praise from her library colleagues. Francis, infuriated by her intellectual independence, burns the entire manuscript in the fireplace.",
                    keyEvents = listOf(
                        "Adah writes 'The Bride Price' in secret joy.",
                        "Colleague Bill encourages her literary talent.",
                        "Francis burns the manuscript to ashes, claiming 'a woman is born to bear children, not write books'."
                    )
                ),
                resolution = PlotStage(
                    title = "5. Emancipation & A New Beginning",
                    subtitle = "Courtroom Freedom & Self-Realization",
                    description = "Adah leaves Francis permanently. In court, Francis denies paternity of his children and burns their birth certificates. Supported by kind strangers and friend Bill, Adah walks out triumphant into independent motherhood.",
                    keyEvents = listOf(
                        "Francis is summoned to court and disowns his five children.",
                        "Adah accepts full custody and pride as an independent mother.",
                        "Adah embraces her identity as a free Black female author."
                    )
                )
            ),
            characters = listOf(
                LiteratureCharacter(
                    name = "Adah Ofili (Obi)",
                    role = "Protagonist & Narrator",
                    isProtagonist = true,
                    personalityTraits = listOf("Resilient", "Brilliant", "Determined", "Visionary", "Fierce Mother"),
                    relationships = "Daughter of Pa; wife (later separated) of Francis; mother of Titi, Vicky, Bubu, Dada.",
                    storyImportance = "Her unyielding willpower carries her from unpaid domestic servant in Lagos to a respected librarian and published writer in London.",
                    characterDevelopment = "Overcomes internalized colonial and patriarchal subjugation to become an autonomous, empowered woman.",
                    memorableQuotes = listOf(
                        "I am going to the United Kingdom. I will have a good education, and I will write books.",
                        "Francis was an illusion; the children and my dreams are real."
                    )
                ),
                LiteratureCharacter(
                    name = "Francis Obi",
                    role = "Antagonist / Abusive Husband",
                    isAntagonist = true,
                    personalityTraits = listOf("Patriarchal", "Insecure", "Violent", "Indolent", "Hypocritical"),
                    relationships = "Adah's husband; father to her children; dependent on Adah's income.",
                    storyImportance = "Embodies traditional African patriarchy distorted by colonial inferiority and religious dogma (Jehovah's Witness).",
                    characterDevelopment = "Regresses from an insecure accounting student into an abusive, vindictive parasite who destroys Adah's manuscript and disowns his children in court."
                ),
                LiteratureCharacter(
                    name = "Bill",
                    role = "Supporting / Friend & Literary Mentor",
                    personalityTraits = listOf("Kind", "Encouraging", "Broad-minded", "Cultured"),
                    relationships = "Canadian library colleague at Chalk Farm Library.",
                    storyImportance = "Introduces Adah to Black literature (James Baldwin) and encourages her to write her first book.",
                    characterDevelopment = "Provides the vital external affirmation Adah needs to believe in her creative genius."
                ),
                LiteratureCharacter(
                    name = "Mr. Noble (Pa Noble)",
                    role = "Supporting / Landlord",
                    personalityTraits = listOf("Eccentric", "Comical", "Generous", "Desperate for Acceptance"),
                    relationships = "Nigerian landlord in London who rents rooms to Adah and Francis.",
                    storyImportance = "Illustrates the tragic loss of African dignity in colonial Britain; acquired his house after suffering physical trauma from a dare."
                ),
                LiteratureCharacter(
                    name = "Trudy",
                    role = "Minor Antagonist / Daily Child-Minder",
                    personalityTraits = listOf("Neglectful", "Deceitful", "Promiscuous"),
                    relationships = "Council-registered child-minder who looks after Titi and Vicky.",
                    storyImportance = "Exposes the poor social services and systemic neglect faced by immigrant working mothers in London."
                )
            ),
            themes = listOf(
                LiteratureTheme(
                    title = "Gender Inequality & Patriarchal Oppression",
                    explanation = "Traditional African society and the diaspora enforce rigid patriarchal norms that view women as chattel, child-bearers, and economic assets.",
                    appearanceInStory = "Adah's parents withholding school fees, her forced marriage, Francis's physical abuse, and his destruction of her intellectual work.",
                    examplesAndEvents = listOf(
                        "Adah having to sneak to school while brother Boy attended freely.",
                        "Francis destroying 'The Bride Price' because a woman shouldn't write books."
                    ),
                    examTakeaway = "Primary feminist critique in African literature."
                ),
                LiteratureTheme(
                    title = "Racism & Second-Class Citizenship",
                    explanation = "African immigrants in 1960s Britain discover that British colonial rhetoric of 'equality' is shattered by blatant racial hostility in housing, employment, and social status.",
                    appearanceInStory = "Adah and Francis being denied flats with 'No Blacks' signs; Adah being relegated to second-class accommodation.",
                    examplesAndEvents = listOf(
                        "The landlady turning Adah down after seeing her skin color.",
                        "Francis accepting defeat and adopting a 'second-class' mentality."
                    ),
                    examTakeaway = "Key distinction between Adah fighting the status and Francis surrendering to it."
                ),
                LiteratureTheme(
                    title = "Resilience & The Will to Self-Actualize",
                    explanation = "The human spirit's capacity to transcend extreme domestic, economic, and institutional adversity through relentless ambition.",
                    appearanceInStory = "Adah continuously advancing her education, securing top library posts, and nurturing her children against all odds.",
                    examplesAndEvents = listOf(
                        "Passing the entrance examination to Methodist Girls' High School.",
                        "Leaving Francis with nothing but her children and building a triumphant literary career."
                    ),
                    examTakeaway = "Adah's tenacity is the emotional backbone of the novel."
                )
            ),
            literaryDevices = listOf(
                LiteratureDevice(
                    deviceName = "Symbolism: The Dream of the United Kingdom",
                    definition = "Using an object or concept to represent a larger psychological or cultural desire.",
                    exactExcerpt = "The Presence that whispered to Adah about the United Kingdom.",
                    contextAndAnalysis = "The UK represents freedom, intellectual enlightenment, and escape from female subjugation in Lagos.",
                    examImportance = "Core symbol frequently examined in UTME."
                ),
                LiteratureDevice(
                    deviceName = "Symbolism: The Burning of 'The Bride Price'",
                    definition = "Destruction of a physical manuscript representing the suppression of female voice and intellect.",
                    exactExcerpt = "Francis feeding the handwritten pages of 'The Bride Price' into the roaring fireplace.",
                    contextAndAnalysis = "Represents patriarchy's violent attempt to extinguish female self-expression, prompting Adah's permanent departure.",
                    examImportance = "The ultimate turning point in the novel."
                ),
                LiteratureDevice(
                    deviceName = "Irony of the 'Second-Class Citizen'",
                    definition = "Discrepancy between expectation and reality.",
                    exactExcerpt = "Adah arriving in London expecting a golden paradise, only to find damp basements and racism.",
                    contextAndAnalysis = "Exposes the myth of the benevolent British Empire.",
                    examImportance = "High-yield thematic device."
                )
            ),
            setting = LiteratureSetting(
                whereLocations = listOf(
                    "Lagos, Nigeria (Colonial Era)" to "Adah's childhood home; bustling colonial capital with strong Igbo cultural enclaves.",
                    "Ibuza, Delta State" to "Adah's ancestral home, symbolizing strict patriarchal traditions.",
                    "Ashdown Street, North London" to "Damp, squalid, rodent-infested first lodging where Francis and Adah lived.",
                    "Chalk Farm Library, London" to "Sanctuary of intellectual work where Adah found warmth, equality, and friendship with Bill.",
                    "The Magistrate Court, London" to "Where Adah won legal independence and Francis disowned his children."
                ),
                whenTimePeriod = "1940s to late 1960s (Late colonial Nigeria to post-war Britain).",
                socialEnvironmentalSetting = "Post-colonial immigration wave characterized by racial prejudice, urban poverty, cold British weather, and changing gender roles.",
                symbolicSignificance = "The physical move from Lagos to London contrasts African communal warmth with British industrial alienation."
            ),
            importantFacts = listOf(
                ImportantFactItem(
                    category = "Characters",
                    fact = "Adah's children are Titi, Vicky, Bubu, and Dada.",
                    examTip = "Frequently asked in UTME family questions."
                ),
                ImportantFactItem(
                    category = "Events",
                    fact = "Francis burnt the manuscript of Adah's first novel 'The Bride Price'.",
                    examTip = "Critical climax event."
                ),
                ImportantFactItem(
                    category = "Locations",
                    fact = "Adah worked as a librarian at North Finchley and Chalk Farm Libraries in London.",
                    examTip = "Shows her intellectual career."
                ),
                ImportantFactItem(
                    category = "Themes",
                    fact = "Mr. Noble acquired his house after falling down subway stairs on a dare to prove an African had no brain damage.",
                    examTip = "Crucial context on racial degradation."
                )
            ),
            quickRevision = QuickRevisionSheet(
                oneSentenceSummary = "The courageous journey of an ambitious Nigerian woman who overcomes childhood deprivation, racial hostility in London, and an abusive husband to become an independent author and mother.",
                coreSynopsis = "Born in Lagos, Adah fights for her education, marries student Francis Obi, and moves to London. Confronted by severe racism and squalor, Adah works as a librarian to support her growing family while Francis grows increasingly abusive. When Francis destroys her beloved manuscript 'The Bride Price', Adah divorces him, embracing freedom, self-reliance, and literary triumph.",
                keyCharactersSummary = listOf(
                    "Adah" to "Resilient protagonist, mother, and writer.",
                    "Francis" to "Abusive, patriarchal, and failed student husband.",
                    "Pa" to "Loving father whose death forced Adah into servitude.",
                    "Bill" to "Canadian librarian who inspired Adah's writing.",
                    "Mr. Noble" to "Eccentric landlord symbolizing racial degradation."
                ),
                topThemes = listOf(
                    "Patriarchy & Domestic Violence" to "Francis's brutality.",
                    "Racial Discrimination" to "Second-class citizen status in Britain.",
                    "Female Autonomy & Maternal Love" to "Adah fighting for her children."
                ),
                dominantDevices = listOf(
                    "Autobiographical Realism" to "Life experiences of Buchi Emecheta.",
                    "Symbol of The Bride Price" to "Extinguished yet revived female voice.",
                    "Irony" to "Mother country vs cold reality."
                ),
                tenMustKnowExamFacts = listOf(
                    "1. Adah's father was a railway moulder in Lagos.",
                    "2. Adah ran to Methodist School without shoes as a child.",
                    "3. Adah's brother Boy was prioritized for school over her.",
                    "4. Adah paid for Francis's passage to England with her American Consulate salary.",
                    "5. Francis belonged to the Jehovah's Witness religious sect in London.",
                    "6. Trudy was the negligent child-minder whose filthy nursery made Vicky sick.",
                    "7. Vicky suffered from meningitis due to Trudy's neglect.",
                    "8. Bill introduced Adah to James Baldwin's 'Go Tell It on the Mountain'.",
                    "9. Francis burned 'The Bride Price' manuscript to ashes.",
                    "10. In court, Francis burned the children's birth certificates to escape maintenance payments."
                )
            ),
            practiceQuestions = listOf(
                LiteratureQuizQuestion(
                    id = 201,
                    question = "Why did Adah marry Francis Obi at an early age in Lagos?",
                    options = listOf(
                        "A) She was deeply in love with him",
                        "B) She needed a home where she could study in peace and avoid marriage to old suitors",
                        "C) Her maternal uncle forced her to marry him",
                        "D) Francis was a wealthy British merchant"
                    ),
                    correctIndex = 1,
                    explanation = "Adah married Francis because she needed accommodation and independence to pursue her studies without being forced onto wealthy elderly suitors.",
                    questionType = "Past Question",
                    relatedChapter = "Chapter 2"
                ),
                LiteratureQuizQuestion(
                    id = 202,
                    question = "What was Francis's immediate reaction when Adah presented her completed manuscript of 'The Bride Price'?",
                    options = listOf(
                        "A) He congratulated her and took it to a publisher",
                        "B) He burned it in the fireplace out of spite and patriarchal jealousy",
                        "C) He stole it and published it under his own name",
                        "D) He corrected the grammatical errors in it"
                    ),
                    correctIndex = 1,
                    explanation = "Francis burned the manuscript to ashes, claiming that a woman's duty was to cook and bear children, not write books.",
                    questionType = "Practice Question",
                    relatedChapter = "Chapter 11"
                ),
                LiteratureQuizQuestion(
                    id = 203,
                    question = "Who introduced Adah to Black American literature and encouraged her to write in London?",
                    options = listOf(
                        "A) Mr. Noble",
                        "B) Trudy",
                        "C) Bill, her Canadian colleague",
                        "D) Her maternal uncle"
                    ),
                    correctIndex = 2,
                    explanation = "Bill, the kind Canadian librarian at Chalk Farm Library, recognized her talent and lent her James Baldwin's books.",
                    questionType = "Practice Question",
                    relatedChapter = "Chapter 10"
                )
            )
        )
    }

    // -------------------------------------------------------------
    // 3. THE LION AND THE JEWEL (Wole Soyinka)
    // -------------------------------------------------------------
    private fun buildTheLionAndTheJewelData(): LiteratureBookStudyData {
        val lionChapters = TheLionAndTheJewelBook.sections.mapIndexed { idx, act ->
            LiteratureChapter(
                chapterNumber = idx + 1,
                title = act.title,
                summary = act.summary,
                keyQuotes = act.keyQuotes,
                fullText = act.fullText
            )
        }

        return LiteratureBookStudyData(
            id = "book_lion_jewel",
            title = "The Lion and the Jewel",
            author = "Wole Soyinka",
            authorInfo = AuthorInfo(
                name = "Akinwande Oluwole Babatunde Soyinka (Wole Soyinka)",
                lifespan = "1934 – Present",
                nationality = "Nigerian (Nobel Laureate in Literature, 1986)",
                biography = "Wole Soyinka is Africa's first Nobel Laureate in Literature. Playwright, poet, novelist, and political activist, Soyinka is celebrated for blending Yoruba mythology and theatrical traditions with modernist European drama.",
                notableWorks = listOf("The Lion and the Jewel (1959)", "Death and the King's Horseman (1975)", "The Trials of Brother Jero (1964)", "Kongi's Harvest (1965)"),
                literaryMovementOrPeriod = "African Postcolonial Drama / Yoruba Total Theatre",
                examSignificance = "Prescribed African Drama in UTME. Examines the clash between Western modernization (Lakunle) and traditional African cunning/power (Baroka), bride price, and Sidi's vanity."
            ),
            category = "African Drama",
            publicationYear = "1962 (Oxford University Press)",
            tagline = "A sparkling Yoruba comedic satire on tradition, modernism, and female vanity.",
            coverAccentColor = BookCoverGreen,
            totalChaptersCount = lionChapters.size,
            chapters = lionChapters,
            background = LiteratureBackground(
                historicalContext = "Set in the late 1950s in the Yoruba village of Ilujinle, during Nigeria's transitional period toward national independence.",
                socialContext = "Explores the tension between uncritical Westernization championed by superficial elites and entrenched African traditional authority.",
                circumstancesSurroundingWork = "Written when Soyinka was working at the Royal Court Theatre in London, satirizing both mimicry of Western ways and the feudal cunning of traditional rulers.",
                targetExamRelevance = "Core African drama. High frequency of UTME questions on the three time periods (Morning, Noon, Night), Baroka's feigned impotence, Lakunle's refusal of bride price, and the dance of the lost traveler."
            ),
            plot = LiteraturePlot(
                overview = "Set in the village of Ilujinle over a single day divided into Morning, Noon, and Night. The play dramatizes the comic contest between Lakunle, an arrogant modernist schoolteacher, and Baroka, the 62-year-old traditional Bale (chief), for the hand of the village belle, Sidi.",
                beginning = PlotStage(
                    title = "1. Morning",
                    subtitle = "Lakunle's Courtship & The Magazine Arrival",
                    description = "Lakunle tries to woo Sidi with grandiloquent English vocabulary and refuses to pay the traditional bride price. A Lagos photographer arrives with a glossy magazine showcasing Sidi's beauty on the front cover, while Baroka is relegated to a tiny corner.",
                    keyEvents = listOf(
                        "Lakunle carries Sidi's water pot and lectures her against traditional customs.",
                        "Sidi insists she will only marry him if he pays the bride price.",
                        "The magazine arrives, making Sidi celebrated and excessively proud."
                    )
                ),
                majorEvents = PlotStage(
                    title = "2. Noon",
                    subtitle = "Sidi's Vanity & Baroka's Cunning Plot",
                    description = "Sidi scorns Baroka's marriage proposal, boasting that her beauty outshines the ageing chief. In response, Baroka confides to his senior wife Sadiku that he has lost his manhood (impotence).",
                    keyEvents = listOf(
                        "Sadiku delivers Baroka's marriage proposal to Sidi; Sidi rejects it scornfully.",
                        "Sadiku performs the triumphant dance of female victory over male virility.",
                        "Baroka secretly plots to trap Sidi using Sadiku's inability to keep a secret."
                    )
                ),
                turningPoints = PlotStage(
                    title = "3. Night (The Trap)",
                    subtitle = "Sidi Visits the Palace",
                    description = "Believing Baroka is harmlessly impotent, Sidi visits the palace to mock him to his face. Baroka outwits her with flattering talk of stamp machines, wisdom, and progress.",
                    keyEvents = listOf(
                        "Sidi arrives at Baroka's palace during a wrestling match.",
                        "Baroka shows her the custom stamp-making machine bearing her face.",
                        "Baroka seduces and deflowers Sidi, disproving his supposed impotence."
                    )
                ),
                climax = PlotStage(
                    title = "4. The Climax & Truth Revealed",
                    subtitle = "Sidi's Weeping Return",
                    description = "Sidi runs back to the village square weeping. Lakunle offers to marry her without bride price now that she is no longer a virgin, but Sidi rejects him with scorn.",
                    keyEvents = listOf(
                        "Sadiku and Lakunle discover Baroka's manhood is intact.",
                        "Lakunle rejoices that he no longer has to pay bride price.",
                        "Sidi packs her bridal bundle and chooses Baroka over Lakunle."
                    )
                ),
                resolution = PlotStage(
                    title = "5. Resolution & Festive Wedding",
                    subtitle = "Sidi Marries the Bale",
                    description = "Sidi chooses the virile, resourceful Baroka (The Lion) over the shallow, impotent intellectualism of Lakunle. The play ends with a boisterous traditional wedding dance.",
                    keyEvents = listOf(
                        "Sidi praises Baroka's strength and real vitality.",
                        "Sidi presents Lakunle with her wedding blessing.",
                        "The village erupts into festive song and dance as Lakunle chases another maiden."
                    )
                )
            ),
            characters = listOf(
                LiteratureCharacter(
                    name = "Baroka (The Bale of Ilujinle / 'The Lion')",
                    role = "Protagonist / Traditional Ruler",
                    isProtagonist = true,
                    personalityTraits = listOf("Shrewd", "Cunning", "Virile", "Resourceful", "Pragmatic"),
                    relationships = "Husband to Sadiku and multiple wives; rival to Lakunle; suitor/husband to Sidi.",
                    storyImportance = "Represents living African tradition—adaptable, politically shrewd, and victorious over superficial modernism.",
                    characterDevelopment = "Outmaneuvers both Lakunle's Western ideals and Sidi's vanity through brilliant psychological warfare.",
                    memorableQuotes = listOf(
                        "I do not hate progress, only its monotony.",
                        "The lion has not lost his claws."
                    )
                ),
                LiteratureCharacter(
                    name = "Sidi (The Village Belle / 'The Jewel')",
                    role = "Central Character / The Sought Prize",
                    personalityTraits = listOf("Beautiful", "Vain", "Proud", "Spirited", "Practical"),
                    relationships = "Wooed by Lakunle and Baroka; junior wife to Baroka.",
                    storyImportance = "Represents the prize of African beauty and sovereignty courted by both Westernization and Tradition.",
                    characterDevelopment = "Transitions from shallow conceited pride after seeing her photograph in the magazine to respect for genuine power and strength."
                ),
                LiteratureCharacter(
                    name = "Lakunle",
                    role = "Comic Antagonist / Modernist Schoolteacher",
                    isAntagonist = true,
                    personalityTraits = listOf("Pretentious", "Bombastic", "Superficial", "Cowardly", "Mimic"),
                    relationships = "Schoolteacher in Ilujinle; suitor to Sidi.",
                    storyImportance = "Satirizes uncritical African intellectuals who copy Western manners and vocabulary without genuine substance.",
                    characterDevelopment = "Exposed as a talkative hypocrite whose refusal to pay bride price stems from stinginess rather than noble progress."
                ),
                LiteratureCharacter(
                    name = "Sadiku",
                    role = "Major Supporting / Senior Wife",
                    personalityTraits = listOf("Talkative", "Loyal to Tradition", "Gullible", "Triumphant"),
                    relationships = "Baroka's eldest wife and palace matchmaker.",
                    storyImportance = "Serves as Baroka's unwitting messenger and the vehicle through which his fake secret of impotence is leaked to Sidi."
                )
            ),
            themes = listOf(
                LiteratureTheme(
                    title = "Tradition vs. Modernity",
                    explanation = "The central conflict between deep-rooted African customs and shallow Western modernization.",
                    appearanceInStory = "The ongoing clash between Baroka's traditional power and Lakunle's Western textbooks and clothing.",
                    examplesAndEvents = listOf(
                        "Lakunle refusing bride price as 'barbaric' versus Sidi viewing it as the dignity of womanhood.",
                        "Baroka embracing modern technology (stamp machines) on his own cultural terms."
                    ),
                    examTakeaway = "Tradition triumphs because it possesses true vitality and intelligence, unlike Lakunle's mimicry."
                ),
                LiteratureTheme(
                    title = "The Folly of Pride & Vanity",
                    explanation = "Excessive infatuation with superficial beauty clouds judgment and makes one vulnerable to manipulation.",
                    appearanceInStory = "Sidi becoming arrogant after her photographs are published in the Lagos magazine.",
                    examplesAndEvents = listOf(
                        "Sidi mocking the Bale and walking directly into his palace trap."
                    ),
                    examTakeaway = "Sidi's vanity as 'The Jewel' leads directly to her capture by 'The Lion'."
                ),
                LiteratureTheme(
                    title = "Cunning & Psychological Warfare",
                    explanation = "Wisdom and patience consistently defeat overt, boastful aggression.",
                    appearanceInStory = "Baroka inventing his own impotence to entice Sidi into his chambers.",
                    examplesAndEvents = listOf(
                        "Baroka confiding in Sadiku knowing she cannot keep a secret."
                    ),
                    examTakeaway = "Soyinka's tribute to classical Yoruba folk wisdom."
                )
            ),
            literaryDevices = listOf(
                LiteratureDevice(
                    deviceName = "Extended Metaphor: The Lion and the Jewel",
                    definition = "A sustained metaphorical comparison extending throughout a whole literary work.",
                    exactExcerpt = "Baroka is 'The Lion' (strength, apex predator, authority) and Sidi is 'The Jewel' (rarity, precious village beauty).",
                    contextAndAnalysis = "Frames the entire drama as an elemental hunt where the cunning predator secures the prize.",
                    examImportance = "Core title question in every UTME Literature exam."
                ),
                LiteratureDevice(
                    deviceName = "Dramatic Irony",
                    definition = "When the audience knows the truth while a character remains deceived.",
                    exactExcerpt = "The audience witnessing Baroka laughing at Sadiku's dance, knowing his impotence is a ruse before Sidi enters the palace.",
                    contextAndAnalysis = "Creates immense comedic anticipation as Sidi walks arrogantly into the Bale's trap.",
                    examImportance = "Most prominent dramatic device in the play."
                ),
                LiteratureDevice(
                    deviceName = "Mime & Total Theatre (The Dance of the Lost Traveller)",
                    definition = "African performance style integrating dance, drumming, chanting, and silent physical reenactment.",
                    exactExcerpt = "The villagers dancing and reenacting the arrival of the motor-car photographer in Ilujinle.",
                    contextAndAnalysis = "Synthesizes traditional Yoruba communal storytelling with dramatic stagecraft.",
                    examImportance = "Essential feature of Soyinka's dramaturgy."
                )
            ),
            setting = LiteratureSetting(
                whereLocations = listOf(
                    "Ilujinle Village Square" to "The heart of community life with the Odan tree, schoolhouse, and market.",
                    "Baroka's Palace Chamber" to "A lavish traditional courtyard featuring animal skins, weapons, and the wrestling ring."
                ),
                whenTimePeriod = "A single 24-hour cycle (Morning, Noon, Night) in late 1950s colonial Nigeria.",
                socialEnvironmentalSetting = "A traditional Yoruba rural settlement largely untouched by colonial infrastructure, preserving age-old hierarchies.",
                symbolicSignificance = "Ilujinle represents the resilient soul of Africa resisting Western cultural erasure."
            ),
            importantFacts = listOf(
                ImportantFactItem(
                    category = "Structure",
                    fact = "The play is divided into three parts: Morning, Noon, and Night (not traditional Acts).",
                    examTip = "Frequently asked in UTME structure questions."
                ),
                ImportantFactItem(
                    category = "Characters",
                    fact = "Baroka is 62 years old; Lakunle is 23 years old.",
                    examTip = "Contrast in age and vitality."
                ),
                ImportantFactItem(
                    category = "Events",
                    fact = "The magazine photographer lost his way on a motorcycle when he first discovered Sidi.",
                    examTip = "Reenacted in the Dance of the Lost Traveller."
                ),
                ImportantFactItem(
                    category = "Themes",
                    fact = "Sidi refuses to marry Lakunle because he will not pay her bride price, which would make her look like a 'cheap woman'.",
                    examTip = "Crucial cultural context."
                )
            ),
            quickRevision = QuickRevisionSheet(
                oneSentenceSummary = "A brilliant comedic clash where a cunning traditional chief uses feigned impotence to outwit an arrogant schoolteacher and win the hand of the village belle.",
                coreSynopsis = "In the village of Ilujinle, schoolteacher Lakunle courts beautiful Sidi but refuses to pay bride price. When a glossy magazine features Sidi's photo, she becomes conceited. Chief Baroka plots to marry her by pretending to be impotent. Sidi visits the palace to mock him, is seduced by his virility and wisdom, and marries the Bale, leaving Lakunle empty-handed.",
                keyCharactersSummary = listOf(
                    "Baroka" to "The Lion: 62-year-old cunning Bale.",
                    "Sidi" to "The Jewel: Beautiful and vain village maiden.",
                    "Lakunle" to "Superficial Westernized schoolteacher.",
                    "Sadiku" to "Baroka's senior wife and palace herald."
                ),
                topThemes = listOf(
                    "Tradition vs Modernity" to "Baroka's wisdom over Lakunle's mimicry.",
                    "Bride Price & Dignity" to "Sidi's cultural worth.",
                    "The Triumph of Cunning" to "Faked impotence trick."
                ),
                dominantDevices = listOf(
                    "Metaphor" to "The Lion and the Jewel.",
                    "Dramatic Irony" to "Audience aware of Baroka's trick.",
                    "Total Theatre" to "Dances and mime."
                ),
                tenMustKnowExamFacts = listOf(
                    "1. The three divisions of the play are Morning, Noon, and Night.",
                    "2. Lakunle is the village schoolteacher wearing a frayed English suit.",
                    "3. Sidi refuses to marry Lakunle without bride price to protect her village honor.",
                    "4. The Lagos photographer's magazine gives Sidi three full pages.",
                    "5. Baroka foiled the colonial government's plan to build a railway through Ilujinle by bribing the surveyor.",
                    "6. Sadiku dances in triumph thinking female victory has triumphed over male virility.",
                    "7. Baroka seduces Sidi with the idea of printing stamps with her face.",
                    "8. Sidi chooses Baroka because of his proven strength and masculine authority.",
                    "9. Lakunle rejoices at first because a non-virgin requires no bride price.",
                    "10. Wole Soyinka won the Nobel Prize in Literature in 1986."
                )
            ),
            practiceQuestions = listOf(
                LiteratureQuizQuestion(
                    id = 301,
                    question = "Why does Sidi insist on Lakunle paying her bride price before marriage?",
                    options = listOf(
                        "A) Her parents demand large sums of money",
                        "B) Refusing bride price would make her look like an unchaste, cheap woman in the village",
                        "C) She wants to buy European clothes in Lagos",
                        "D) She intends to give the money to Baroka"
                    ),
                    correctIndex = 1,
                    explanation = "In traditional Yoruba custom, paying bride price confirms the bride's purity and social esteem; without it, the village would consider her cheap.",
                    questionType = "Past Question",
                    relatedChapter = "Morning"
                ),
                LiteratureQuizQuestion(
                    id = 302,
                    question = "How did Baroka previously prevent the railway line from passing through Ilujinle?",
                    options = listOf(
                        "A) By declaring war on the British colonial army",
                        "B) By bribing the railway surveyor with money, drinks, and livestock",
                        "C) By digging up the railway tracks at night",
                        "D) By petitioning the Queen of England"
                    ),
                    correctIndex = 1,
                    explanation = "Baroka preserved Ilujinle's traditional isolation by bribing the surveyor with a bag of money and gin to redirect the track.",
                    questionType = "Practice Question",
                    relatedChapter = "Noon"
                ),
                LiteratureQuizQuestion(
                    id = 303,
                    question = "What device does Soyinka primarily use when Baroka pretends to be impotent?",
                    options = listOf(
                        "A) Oxymoron",
                        "B) Dramatic Irony",
                        "C) Apostrophe",
                        "D) Soliloquy"
                    ),
                    correctIndex = 1,
                    explanation = "The audience and Baroka are aware of the trick while Sadiku and Sidi are completely duped, creating classic Dramatic Irony.",
                    questionType = "Quick Quiz",
                    relatedChapter = "Night"
                )
            )
        )
    }

    // -------------------------------------------------------------
    // 4. LOOK BACK IN ANGER (John Osborne)
    // -------------------------------------------------------------
    private fun buildLookBackInAngerData(): LiteratureBookStudyData {
        val angerChapters = LookBackInAngerBook.acts.map { act ->
            LiteratureChapter(
                chapterNumber = act.actNumber,
                title = "${act.title} (Scene ${act.sceneNumber})",
                summary = act.summary,
                keyQuotes = act.keyQuotes,
                fullText = act.fullText
            )
        }

        return LiteratureBookStudyData(
            id = "book_look_back_in_anger",
            title = "Look Back in Anger",
            author = "John Osborne",
            authorInfo = AuthorInfo(
                name = "John James Osborne",
                lifespan = "1929 – 1994",
                nationality = "English (British Playwright & Screenwriter)",
                biography = "John Osborne transformed modern English theatre in 1956 with 'Look Back in Anger', inaugurating the 'Kitchen Sink Realism' movement and the archetype of the 'Angry Young Man'. His blistering dialogue challenged class complacency and post-war stagnation.",
                notableWorks = listOf("Look Back in Anger (1956)", "The Entertainer (1957)", "Luther (1961)", "Inadmissible Evidence (1964)"),
                literaryMovementOrPeriod = "Post-War British Realism / 'Angry Young Men' / Kitchen Sink Drama",
                examSignificance = "Prescribed Non-African Drama for UTME Literature. Focuses on post-war class struggle, alienation, the bear and squirrel game, Jimmy's trauma, and Helena's religious conflict."
            ),
            category = "Non-African Drama",
            publicationYear = "1956 (Royal Court Theatre / Faber and Faber)",
            tagline = "The iconic masterpiece of class fury, post-war disillusionment, and intense passion.",
            coverAccentColor = BookCoverPurple,
            totalChaptersCount = angerChapters.size,
            chapters = angerChapters,
            background = LiteratureBackground(
                historicalContext = "Post-WWII 1950s Britain; a period of imperial decline, welfare state expansion, and lack of heroic causes for the educated working class.",
                socialContext = "Rigid British class stratification dividing the aristocratic upper-middle class (Alison and Colonel Redfern) from university-educated working-class youths (Jimmy).",
                circumstancesSurroundingWork = "Premiered on 8 May 1956 at London's Royal Court Theatre, breaking away from polite, escapist drawing-room comedies with raw emotional fury.",
                targetExamRelevance = "Frequent UTME questions on Jimmy's trumpet, the 'Bear and Squirrel' fantasy, Colonel Redfern's nostalgia for India, and Alison's miscarriage."
            ),
            plot = LiteraturePlot(
                overview = "Set in a dingy attic flat in the English Midlands. Jimmy Porter lives with his aristocratic wife Alison and Welsh working-class friend Cliff Lewis. Disillusioned with British social hypocrisy, Jimmy unleashes ferocious verbal tirades against Alison and the establishment.",
                beginning = PlotStage(
                    title = "1. Act I: The Sunday Ritual",
                    subtitle = "Ironing & Vitriol",
                    description = "Jimmy and Cliff read the Sunday newspapers while Alison endlessly irons clothes. Jimmy rants against upper-class indifference, the Church, and the lack of enthusiasm in modern Britain.",
                    keyEvents = listOf(
                        "Jimmy attacks the press and Alison's family.",
                        "Alison secretly reveals to Cliff that she is pregnant.",
                        "Helena Charles announces her upcoming visit."
                    )
                ),
                majorEvents = PlotStage(
                    title = "2. Act II, Scene 1: Helena's Arrival",
                    subtitle = "The Clash of Classes",
                    description = "Helena visits and observes Jimmy's hostility. She persuades Alison to notify her father to take her back home.",
                    keyEvents = listOf(
                        "Jimmy recounts watching his father die of wounds from the Spanish Civil War.",
                        "Helena sends a telegram to Colonel Redfern.",
                        "Jimmy plays his jazz trumpet furiously offstage."
                    )
                ),
                turningPoints = PlotStage(
                    title = "3. Act II, Scene 2: The Departure",
                    subtitle = "Colonel Redfern & Alison's Escape",
                    description = "Colonel Redfern arrives in his car to take Alison away. Jimmy returns, learns of Alison's departure, and confronts Helena, resulting in an unexpected passionate embrace.",
                    keyEvents = listOf(
                        "Colonel Redfern expresses surprising sympathy for Jimmy.",
                        "Alison leaves with her father without telling Jimmy about the pregnancy.",
                        "Helena slaps Jimmy, and they become lovers."
                    )
                ),
                climax = PlotStage(
                    title = "4. Act III, Scene 1 & 2: The Breakdown",
                    subtitle = "Cliff Leaves & Alison Returns",
                    description = "Months later, Helena has assumed Alison's domestic routine. Cliff decides to leave to make his own way in life. Alison reappears, physically devastated after losing her baby in a miscarriage.",
                    keyEvents = listOf(
                        "Cliff announces his departure from the flat.",
                        "A sick and broken Alison arrives at the door.",
                        "Helena's Christian conscience forces her to renounce Jimmy and leave."
                    )
                ),
                resolution = PlotStage(
                    title = "5. Act III Finale: The Sanctuary of Innocence",
                    subtitle = "The Bear and Squirrel Game",
                    description = "Alison breaks down, confessing that she has now experienced raw suffering and loss. Jimmy reconciles with her in their private animal fantasy world.",
                    keyEvents = listOf(
                        "Alison weeps on the floor, purged of aristocratic detachment.",
                        "Jimmy abandons his ferocious cynicism to comfort her.",
                        "They reunite in the sanctuary of their 'Bears and Squirrels' game."
                    )
                )
            ),
            characters = listOf(
                LiteratureCharacter(
                    name = "Jimmy Porter",
                    role = "Protagonist / The 'Angry Young Man'",
                    isProtagonist = true,
                    personalityTraits = listOf("Eloquent", "Volatile", "Passionate", "Traumatized", "Cynical"),
                    relationships = "Husband to Alison; lover to Helena; friend and business partner to Cliff.",
                    storyImportance = "The archetype of 1950s post-war British disillusionment, railing against social stratification and emotional numbness.",
                    characterDevelopment = "Driven by childhood trauma (father's death in the Spanish Civil War), he softens only when Alison experiences equal suffering.",
                    memorableQuotes = listOf(
                        "There aren't any good, brave causes left.",
                        "I want to hear a warm, thrilling voice cry out Hallelujah!"
                    )
                ),
                LiteratureCharacter(
                    name = "Alison Porter",
                    role = "Protagonist / Jimmy's Long-Suffering Wife",
                    isProtagonist = true,
                    personalityTraits = listOf("Reserved", "Aristocratic", "Enduring", "Vulnerable"),
                    relationships = "Daughter of Colonel Redfern; wife to Jimmy; friend to Helena.",
                    storyImportance = "Represents the detached upper-middle class subjected to working-class rage; finds redemption through personal suffering.",
                    characterDevelopment = "Transforms from passive silence to genuine emotional awakening after the trauma of her miscarriage."
                ),
                LiteratureCharacter(
                    name = "Cliff Lewis",
                    role = "Supporting / Peacemaker & Flatmate",
                    personalityTraits = listOf("Warm", "Easy-going", "Loyal", "Mediator"),
                    relationships = "Jimmy's flatmate and sweet-stall partner; affectionate confidant to Alison.",
                    storyImportance = "The emotional buffer between Jimmy and Alison, representing decent working-class solidarity."
                ),
                LiteratureCharacter(
                    name = "Helena Charles",
                    role = "Major Supporting / The Catalyst",
                    personalityTraits = listOf("Moralistic", "Conventional", "Passionate", "Guilt-ridden"),
                    relationships = "Alison's upper-class actress friend; temporarily Jimmy's lover.",
                    storyImportance = "Forces the crisis by rescuing Alison, replacing her, and ultimately leaving due to moral and religious guilt."
                ),
                LiteratureCharacter(
                    name = "Colonel Redfern",
                    role = "Supporting / The Imperial Nostalgic",
                    personalityTraits = listOf("Gentlemanly", "Reflective", "Nostalgic", "Kind"),
                    relationships = "Alison's father; retired British Army commander in India.",
                    storyImportance = "Represents the sunset of the British Empire (Edwardian era), nostalgic for a lost certainty."
                )
            ),
            themes = listOf(
                LiteratureTheme(
                    title = "Class Conflict & Alienation",
                    explanation = "Post-war Britain expanded higher education to working-class youths but failed to provide meaningful social integration or opportunities.",
                    appearanceInStory = "Jimmy running a sweet-stall despite his university degree, venting his fury on his aristocratic wife.",
                    examplesAndEvents = listOf(
                        "Jimmy's bitter hatred for Alison's family and the establishment."
                    ),
                    examTakeaway = "Jimmy is the defining symbol of the 'Angry Young Man'."
                ),
                LiteratureTheme(
                    title = "The Illusion of 'Good, Brave Causes'",
                    explanation = "Disillusionment in post-war society where ideological heroism (like the Spanish Civil War) has vanished into bureaucratic mediocrity.",
                    appearanceInStory = "Jimmy lamenting that there are no glorious moral battles left to fight in the 1950s.",
                    examplesAndEvents = listOf(
                        "Jimmy comparing his generation with his father's wartime sacrifice."
                    ),
                    examTakeaway = "Key quote: 'There aren't any good, brave causes left.'"
                ),
                LiteratureTheme(
                    title = "Suffering & The Need for Emotional Vitality",
                    explanation = "True human connection requires vulnerability, passion, and the willingness to feel genuine pain.",
                    appearanceInStory = "Jimmy despising Alison's emotional detachment until her miscarriage breaks her composure.",
                    examplesAndEvents = listOf(
                        "Alison's weeping breakdown in Act III bringing true reconciliation."
                    ),
                    examTakeaway = "Suffering is the bridge that unites Jimmy and Alison."
                )
            ),
            literaryDevices = listOf(
                LiteratureDevice(
                    deviceName = "Symbolism: The Bear and Squirrel Game",
                    definition = "A private fantasy role-play representing innocence, animal simplicity, and escape from human cruelty.",
                    exactExcerpt = "Jimmy as the lumbering Bear and Alison as the timid Squirrel.",
                    contextAndAnalysis = "The only realm where Jimmy and Alison can love each other without class warfare or intellectual bitterness.",
                    examImportance = "One of the most frequently tested symbols in UTME Drama."
                ),
                LiteratureDevice(
                    deviceName = "Symbolism: The Jazz Trumpet",
                    definition = "Musical instrument expressing raw emotional non-conformity and working-class defiance.",
                    exactExcerpt = "Jimmy blasting loud jazz notes on his trumpet from the adjoining room.",
                    contextAndAnalysis = "Vocalizes Jimmy's restless, aggressive energy that society refuses to channel.",
                    examImportance = "Key dramatic auditory motif."
                ),
                LiteratureDevice(
                    deviceName = "Symbolism: The Ironing Board",
                    definition = "Everyday domestic prop signifying monotonous female labour and trapped domesticity.",
                    exactExcerpt = "Alison and later Helena endlessly pressing clothes in the cramped attic.",
                    contextAndAnalysis = "Anchors the play firmly in the 'Kitchen Sink' realism aesthetic.",
                    examImportance = "Core visual motif of the play."
                )
            ),
            setting = LiteratureSetting(
                whereLocations = listOf(
                    "One-room Attic Flat in the English Midlands" to "Cramped, squalid, poorly lit flat with sloping ceilings, gas stove, and ironing board."
                ),
                whenTimePeriod = "Mid-1950s post-World War II Britain (Sunday mornings and evenings).",
                socialEnvironmentalSetting = "Depressed industrial town in the Midlands with grey rain, church bells, and weekly newspapers.",
                symbolicSignificance = "The cramped attic represents the suffocating claustrophobia of Jimmy's social and intellectual confinement."
            ),
            importantFacts = listOf(
                ImportantFactItem(
                    category = "Author",
                    fact = "John Osborne's play launched the 'Kitchen Sink' realism theatre movement in 1956.",
                    examTip = "Historical theatre context."
                ),
                ImportantFactItem(
                    category = "Symbols",
                    fact = "The Bear and the Squirrel game represents an uncorrupted sanctuary of love.",
                    examTip = "Top exam symbol."
                ),
                ImportantFactItem(
                    category = "Events",
                    fact = "Jimmy watched his father die slowly for 12 months after the Spanish Civil War.",
                    examTip = "Source of Jimmy's psychological trauma."
                ),
                ImportantFactItem(
                    category = "Characters",
                    fact = "Colonel Redfern served in India from 1914 to 1947.",
                    examTip = "Symbolizes the sunset of the British Empire."
                )
            ),
            quickRevision = QuickRevisionSheet(
                oneSentenceSummary = "A searing post-war British drama centering on university graduate Jimmy Porter whose class rage and trauma challenge social complacency and tear apart his marriage.",
                coreSynopsis = "Living in a squalid Midlands attic with aristocratic wife Alison and friend Cliff, Jimmy Porter unleashes blistering attacks on British class hypocrisy. Helena Charles helps Alison escape home with her father, but Helena herself becomes Jimmy's lover. When Alison returns broken after a miscarriage, Helena departs, and Jimmy and Alison reunite in their protective 'Bear and Squirrel' fantasy.",
                keyCharactersSummary = listOf(
                    "Jimmy Porter" to "Angry Young Man running a sweet-stall.",
                    "Alison Porter" to "Upper-class long-suffering wife.",
                    "Cliff Lewis" to "Affectionate Welsh mediator and flatmate.",
                    "Helena Charles" to "Moralistic actress and catalyst.",
                    "Colonel Redfern" to "Nostalgic retired army father."
                ),
                topThemes = listOf(
                    "Class Warfare" to "Working-class graduate vs upper-class aristocracy.",
                    "Loss of Ideals" to "No brave causes left.",
                    "Suffering as Redemption" to "Alison's miscarriage."
                ),
                dominantDevices = listOf(
                    "The Bear & Squirrel" to "Innocence and escape.",
                    "The Jazz Trumpet" to "Raw working-class defiance.",
                    "The Ironing Board" to "Kitchen-sink domestic trap."
                ),
                tenMustKnowExamFacts = listOf(
                    "1. Jimmy Porter runs a sweet-stall with Cliff Lewis.",
                    "2. The play takes place entirely in a one-room attic flat in the English Midlands.",
                    "3. Jimmy's father fought and died in the Spanish Civil War.",
                    "4. Alison's father Colonel Redfern spent over 30 years in India.",
                    "5. Helena Charles is an actress from an orthodox Christian background.",
                    "6. Alison leaves without telling Jimmy about her pregnancy.",
                    "7. Helena slaps Jimmy before they passionately embrace.",
                    "8. Cliff decides to leave the flat to seek his own fortune.",
                    "9. Alison loses her unborn child to a miscarriage.",
                    "10. Jimmy and Alison's reconciliation relies on the Bear and Squirrel game."
                )
            ),
            practiceQuestions = listOf(
                LiteratureQuizQuestion(
                    id = 401,
                    question = "What childhood experience is the primary source of Jimmy Porter's bitter disillusionment with human apathy?",
                    options = listOf(
                        "A) Being expelled from university",
                        "B) Watching his father die of wounds from the Spanish Civil War while relatives showed indifference",
                        "C) Being cheated in the sweet-stall business",
                        "D) Poverty during the London blitz"
                    ),
                    correctIndex = 1,
                    explanation = "At age ten, Jimmy sat with his dying father for a year while everyone else ignored him, teaching him what it meant to truly feel pain and rage.",
                    questionType = "Past Question",
                    relatedChapter = "Act II"
                ),
                LiteratureQuizQuestion(
                    id = 402,
                    question = "In 'Look Back in Anger', the 'Bear and Squirrel' game serves as:",
                    options = listOf(
                        "A) A children's board game played on Sundays",
                        "B) A private psychological escape where Jimmy and Alison can love each other without class bitterness",
                        "C) A mocking parody of Colonel Redfern's hunting trips in India",
                        "D) A political code for socialist revolutions"
                    ),
                    correctIndex = 1,
                    explanation = "The game represents their fragile sanctuary of uninhibited affection away from harsh class divisions and cruel intellectual analysis.",
                    questionType = "Practice Question",
                    relatedChapter = "Act III"
                )
            )
        )
    }

    // -------------------------------------------------------------
    // 5. WUTHERING HEIGHTS (Emily Brontë)
    // -------------------------------------------------------------
    private fun buildWutheringHeightsData(): LiteratureBookStudyData {
        val whChapters = WutheringHeightsBook.chapters.map { ch ->
            LiteratureChapter(
                chapterNumber = ch.chapterNumber,
                title = ch.title,
                summary = ch.summary,
                keyQuotes = ch.keyQuotes,
                fullText = ch.fullText
            )
        }

        return LiteratureBookStudyData(
            id = "book_wuthering_heights",
            title = "Wuthering Heights",
            author = "Emily Brontë",
            authorInfo = AuthorInfo(
                name = "Emily Jane Brontë (Ellis Bell)",
                lifespan = "1818 – 1848",
                nationality = "English (Victorian Novelist & Poet)",
                biography = "Emily Brontë lived a solitary life in the Yorkshire moors at Haworth parsonage. 'Wuthering Heights' is her only published novel, celebrated as one of the greatest masterpieces of English literature for its cosmic passion and complex narrative structure.",
                notableWorks = listOf("Wuthering Heights (1847)", "Poems by Currer, Ellis, and Acton Bell (1846)"),
                literaryMovementOrPeriod = "Gothic Romanticism / Victorian Realism",
                examSignificance = "Prescribed Non-African Prose in UTME. Tested on Heathcliff and Catherine's elemental passion, Nelly Dean's narration, Wuthering Heights vs Thrushcross Grange, and generational healing."
            ),
            category = "Non-African Prose",
            publicationYear = "1847 (Thomas Cautley Newby)",
            tagline = "The timeless gothic epic of tempestuous passion, vengeful fury, and redemptive grace.",
            coverAccentColor = BookCoverDark,
            totalChaptersCount = whChapters.size,
            chapters = whChapters,
            background = LiteratureBackground(
                historicalContext = "Late 18th to early 19th century Yorkshire, during the dawn of the Industrial Revolution.",
                socialContext = "Contrasts rough, wild yeoman farm life with refined, gentrified landowning society.",
                circumstancesSurroundingWork = "Published under the male pen name 'Ellis Bell' due to Victorian prejudices against female authors.",
                targetExamRelevance = "Core Non-African prose. Questions focus on double narrative (Lockwood & Nelly), Heathcliff's origins, Catherine's declaration ('I am Heathcliff'), and the two contrasting houses."
            ),
            plot = LiteraturePlot(
                overview = "Spans two generations across the Yorkshire moors. Mr Earnshaw brings home an orphaned boy, Heathcliff, who forms an intense, elemental bond with Catherine Earnshaw. When Catherine marries Edgar Linton for social status, Heathcliff embarks on a monstrous campaign of vengeance against the Earnshaws and Lintons, which is finally healed by the love between young Cathy and Hareton.",
                beginning = PlotStage(
                    title = "1. Heathcliff's Arrival & Youthful Bond",
                    subtitle = "The Moors of Childhood",
                    description = "Mr Earnshaw adopts Heathcliff in Liverpool and brings him to Wuthering Heights. Heathcliff and Catherine become inseparable, while Hindley Earnshaw despises and abuses the orphan.",
                    keyEvents = listOf(
                        "Mr Earnshaw introduces Heathcliff to Wuthering Heights.",
                        "Hindley degrades Heathcliff to a common farmhand after Earnshaw's death.",
                        "Heathcliff and Catherine roam the wild Yorkshire moors together."
                    )
                ),
                majorEvents = PlotStage(
                    title = "2. The Betrayal & Heathcliff's Flight",
                    subtitle = "Thrushcross Grange & 'I am Heathcliff'",
                    description = "Catherine spends five weeks at Thrushcross Grange and becomes civilized. She accepts Edgar Linton's marriage proposal. Overhearing her say it would degrade her to marry him, Heathcliff vanishes into the stormy night.",
                    keyEvents = listOf(
                        "Catherine visits Thrushcross Grange and is charmed by the Lintons.",
                        "Catherine confesses to Nelly: 'I am Heathcliff'.",
                        "Heathcliff flees before hearing Catherine profess her eternal love."
                    )
                ),
                turningPoints = PlotStage(
                    title = "3. The Vengeful Return & Catherine's Death",
                    subtitle = "Marital Destruction & Ghostly Torment",
                    description = "Heathcliff returns three years later, wealthy and vengeful. He marries Edgar's sister Isabella to torment the Lintons. Catherine falls fatally ill and dies after giving birth to young Cathy, begging Heathcliff to haunt her.",
                    keyEvents = listOf(
                        "Heathcliff elopes with Isabella Linton and abuses her.",
                        "Passionate, devastating final confrontation between Heathcliff and dying Catherine.",
                        "Catherine dies; Heathcliff prays her spirit will haunt him relentlessly."
                    )
                ),
                climax = PlotStage(
                    title = "4. Tyranny Over the Second Generation",
                    subtitle = "Disinheritance & Forced Marriage",
                    description = "Heathcliff acquires ownership of both Wuthering Heights and Thrushcross Grange. He enslaves Hindley's son Hareton and forces young Cathy to marry his dying sickly son Linton Heathcliff.",
                    keyEvents = listOf(
                        "Hindley dies in gambling ruin; Heathcliff claims Wuthering Heights.",
                        "Heathcliff imprisons young Cathy and forces marriage to weak Linton.",
                        "Linton dies, leaving Heathcliff absolute master of all estates."
                    )
                ),
                resolution = PlotStage(
                    title = "5. Reconciliation, Death & Peace",
                    subtitle = "Cathy & Hareton's Love",
                    description = "Young Cathy teaches illiterate Hareton to read, blossoming into genuine love. Disarmed by their happiness and longing for Catherine's ghost, Heathcliff refuses to eat and dies peacefully.",
                    keyEvents = listOf(
                        "Hareton and young Cathy fall in love, dismantling the cycle of vengeance.",
                        "Heathcliff sees Catherine's eyes in the young lovers and loses the will to torment them.",
                        "Heathcliff dies in Catherine's old oak-paneled bed; the ghosts are seen wandering the moors in eternal peace."
                    )
                )
            ),
            characters = listOf(
                LiteratureCharacter(
                    name = "Heathcliff",
                    role = "Protagonist / Byronic Antagonist",
                    isProtagonist = true,
                    isAntagonist = true,
                    personalityTraits = listOf("Passionate", "Vengeful", "Brooding", "Fierce", "Unforgiving"),
                    relationships = "Adopted son of Mr. Earnshaw; soulmate of Catherine; husband to Isabella; father to Linton.",
                    storyImportance = "One of literature's greatest anti-heroes; his elemental love and devastating vengeance drive the entire saga.",
                    characterDevelopment = "From abused gypsy foundling to ruthless, wealthy landowner, culminating in spiritual reunion with Catherine in death.",
                    memorableQuotes = listOf(
                        "Be with me always—take any form—drive me mad! only do not leave me in this abyss, where I cannot find you!",
                        "I cannot live without my life! I cannot live without my soul!"
                    )
                ),
                LiteratureCharacter(
                    name = "Catherine Earnshaw (Linton)",
                    role = "Protagonist / The Heroine",
                    isProtagonist = true,
                    personalityTraits = listOf("Wild", "Passionate", "Haughty", "Torn between two worlds"),
                    relationships = "Sister to Hindley; soulmate to Heathcliff; wife to Edgar; mother to young Cathy.",
                    storyImportance = "Her tragic choice between social elevation (Edgar) and cosmic soul connection (Heathcliff) is the catalyst for the tragedy.",
                    characterDevelopment = "Suffers psychological fragmentation between the wild moors and civilized society, haunting the narrative beyond the grave.",
                    memorableQuotes = listOf(
                        "Whatever our souls are made of, his and mine are the same; and Linton's is as different as a moonbeam from lightning, or frost from fire.",
                        "I am Heathcliff!"
                    )
                ),
                LiteratureCharacter(
                    name = "Ellen (Nelly) Dean",
                    role = "Primary Narrator / Housekeeper",
                    personalityTraits = listOf("Sensible", "Pragmatic", "Observant", "Moralistic"),
                    relationships = "Housekeeper at Wuthering Heights and Thrushcross Grange; foster sister to Hindley.",
                    storyImportance = "Serves as the internal, eyewitness narrative voice recountng the history of both families to Mr Lockwood."
                ),
                LiteratureCharacter(
                    name = "Edgar Linton",
                    role = "Supporting / Aristocratic Husband",
                    personalityTraits = listOf("Gentle", "Refined", "Cultured", "Patient"),
                    relationships = "Master of Thrushcross Grange; husband to Catherine; father to young Cathy.",
                    storyImportance = "Represents civilized Victorian gentility, contrasted with Heathcliff's wild, primal nature."
                ),
                LiteratureCharacter(
                    name = "Hareton Earnshaw & Young Cathy",
                    role = "Second Generation / Redemptive Lovers",
                    personalityTraits = listOf("Honest", "Noble", "Educable", "Loving"),
                    relationships = "Hindley's son and Catherine's daughter; future husband and wife.",
                    storyImportance = "Their mutual affection breaks the generational curse of hatred, restoring dignity to Wuthering Heights."
                )
            ),
            themes = listOf(
                LiteratureTheme(
                    title = "Elemental vs. Conventional Love",
                    explanation = "The contrast between transcendent, cosmic passion that defies death and conventional social/romantic affection.",
                    appearanceInStory = "Catherine comparing her love for Heathcliff (eternal rock) with her love for Edgar (seasonal foliage).",
                    examplesAndEvents = listOf(
                        "Catherine's famous declaration: 'Nelly, I am Heathcliff!'"
                    ),
                    examTakeaway = "Core thematic foundation of the novel."
                ),
                LiteratureTheme(
                    title = "Vengeance & Generational Curses",
                    explanation = "How systemic childhood cruelty breeds monstrous vindictiveness that infects subsequent generations.",
                    appearanceInStory = "Hindley abusing Heathcliff, and Heathcliff in turn systematically brutalizing Hindley's son Hareton.",
                    examplesAndEvents = listOf(
                        "Heathcliff disinheriting both houses until young Cathy's love disarms him."
                    ),
                    examTakeaway = "Vengeance is extinguished only by genuine forgiveness and education."
                ),
                LiteratureTheme(
                    title = "Storm vs. Calm (Wuthering Heights vs. Thrushcross Grange)",
                    explanation = "The structural opposition between wild, untamed nature and refined, civilized domesticity.",
                    appearanceInStory = "Wuthering Heights on the exposed windswept hill versus Thrushcross Grange nestled in the lush, protected valley.",
                    examplesAndEvents = listOf(
                        "Heathcliff and Catherine belonging to the storm, Edgar belonging to the calm."
                    ),
                    examTakeaway = "Classic setting-character symbolism."
                )
            ),
            literaryDevices = listOf(
                LiteratureDevice(
                    deviceName = "Double Narrative / Frame Story",
                    definition = "Nested narration where one narrator introduces another narrator who tells the central story.",
                    exactExcerpt = "Mr. Lockwood writing in his diary, recording Nelly Dean's oral history.",
                    contextAndAnalysis = "Provides multiple layers of perspective and narrative distance.",
                    examImportance = "Frequently examined in UTME narrative technique questions."
                ),
                LiteratureDevice(
                    deviceName = "Gothic Elements & The Supernatural",
                    definition = "Use of ghosts, stormy moors, nightmares, and haunted rooms.",
                    exactExcerpt = "Lockwood seeing Catherine's ghost tapping on the ice-covered window pane.",
                    contextAndAnalysis = "Creates eerie psychological intensity and suggests love transcending physical mortality.",
                    examImportance = "Core genre identifier for Wuthering Heights."
                ),
                LiteratureDevice(
                    deviceName = "Simile & Contrast",
                    definition = "Explicit comparisons showing the irreconcilable differences between two people.",
                    exactExcerpt = "Linton's [soul] is as different as a moonbeam from lightning, or frost from fire.",
                    contextAndAnalysis = "Catherine's contrast between Edgar's gentle mildness and Heathcliff's fierce thunderous spirit.",
                    examImportance = "One of the most famous quotes in Victorian literature."
                )
            ),
            setting = LiteratureSetting(
                whereLocations = listOf(
                    "Wuthering Heights" to "Bleak, rugged 300-year-old stone farmhouse exposed to howling winds on the stormy Yorkshire moors.",
                    "Thrushcross Grange" to "Lush, sheltered aristocratic mansion in the valley, adorned with chandeliers and rich gardens.",
                    "The Yorkshire Moors" to "Vast, untamed expanse of heather, bogs, and rocky crags where Catherine and Heathcliff found absolute freedom."
                ),
                whenTimePeriod = "1770s to 1802 (Late 18th century rural England).",
                socialEnvironmentalSetting = "Isolated northern England countryside during the transition to the modern era.",
                symbolicSignificance = "The two houses embody the eternal philosophical dialectic between wild Nature (Heights) and Culture/Civilization (Grange)."
            ),
            importantFacts = listOf(
                ImportantFactItem(
                    category = "Characters",
                    fact = "Mr. Earnshaw found Heathcliff starving on the streets of Liverpool.",
                    examTip = "Heathcliff's origin is mysterious."
                ),
                ImportantFactItem(
                    category = "Settings",
                    fact = "Wuthering Heights belonged to the Earnshaws; Thrushcross Grange belonged to the Lintons.",
                    examTip = "Essential ownership fact."
                ),
                ImportantFactItem(
                    category = "Narrators",
                    fact = "Mr. Lockwood is the outer narrator; Nelly Dean is the main inner narrator.",
                    examTip = "Double narrative structure."
                ),
                ImportantFactItem(
                    category = "Quotes",
                    fact = "'I am Heathcliff' was uttered by Catherine to Nelly in Chapter 9.",
                    examTip = "Iconic exam quote."
                )
            ),
            quickRevision = QuickRevisionSheet(
                oneSentenceSummary = "A gothic masterpiece of all-consuming love and relentless vengeance across two generations on the stormy Yorkshire moors.",
                coreSynopsis = "Adopted orphan Heathcliff falls deeply in love with Catherine Earnshaw. When Catherine marries wealthy Edgar Linton for status, Heathcliff flees, returns wealthy, and systematically destroys the Linton and Earnshaw dynasties through forced marriages and foreclosures. Ultimately, the love between young Cathy and Hareton Earnshaw breaks the curse, and Heathcliff dies to rejoin Catherine's ghost on the moors.",
                keyCharactersSummary = listOf(
                    "Heathcliff" to "Tormented Byronic anti-hero.",
                    "Catherine Earnshaw" to "Passionate, divided heroine.",
                    "Edgar Linton" to "Civilized master of Thrushcross Grange.",
                    "Nelly Dean" to "Sensible eyewitness narrator.",
                    "Hareton & Young Cathy" to "Second-generation lovers who restore peace."
                ),
                topThemes = listOf(
                    "Cosmic Love" to "Souls made of the same essence.",
                    "Revenge vs Forgiveness" to "Generational trauma healed by love.",
                    "Storm vs Calm" to "Heights vs Grange."
                ),
                dominantDevices = listOf(
                    "Frame Story" to "Lockwood and Nelly Dean.",
                    "Gothic Supernatural" to "Catherine's ghost at the window.",
                    "Symbolic Landscape" to "The windswept Yorkshire moors."
                ),
                tenMustKnowExamFacts = listOf(
                    "1. Emily Brontë published under the pen name Ellis Bell.",
                    "2. Mr. Lockwood stays at Thrushcross Grange as a tenant.",
                    "3. Nelly Dean worked for both the Earnshaw and Linton families.",
                    "4. Catherine's brother Hindley reduced Heathcliff to a farm labourer.",
                    "5. Catherine married Edgar Linton despite loving Heathcliff with her soul.",
                    "6. Heathcliff married Isabella Linton purely to punish Edgar.",
                    "7. Catherine died giving birth to young Cathy.",
                    "8. Heathcliff forced young Cathy to marry his sickly son Linton.",
                    "9. Young Cathy teaches Hareton to read, sparking their love.",
                    "10. The novel ends with the ghosts of Heathcliff and Catherine walking the moors together."
                )
            ),
            practiceQuestions = listOf(
                LiteratureQuizQuestion(
                    id = 501,
                    question = "Why did Catherine Earnshaw decide to marry Edgar Linton instead of Heathcliff?",
                    options = listOf(
                        "A) Heathcliff had rejected her proposal",
                        "B) Edgar was wealthy and of high social standing, whereas marrying Heathcliff would degrade her socially",
                        "C) Hindley forced her at gunpoint",
                        "D) She did not love Heathcliff anymore"
                    ),
                    correctIndex = 1,
                    explanation = "Catherine acknowledged that while she loved Heathcliff with her soul, marrying him would socially degrade her in Victorian society, whereas marrying Edgar made her the finest lady in the parish.",
                    questionType = "Past Question",
                    relatedChapter = "Chapter 9"
                ),
                LiteratureQuizQuestion(
                    id = 502,
                    question = "Who are the two primary narrators of 'Wuthering Heights'?",
                    options = listOf(
                        "A) Heathcliff and Catherine",
                        "B) Mr. Lockwood and Ellen (Nelly) Dean",
                        "C) Hindley Earnshaw and Joseph",
                        "D) Edgar Linton and Isabella"
                    ),
                    correctIndex = 1,
                    explanation = "The story uses a frame narrative structure: Mr. Lockwood writes down the comprehensive history told to him by the longtime housekeeper, Nelly Dean.",
                    questionType = "Practice Question",
                    relatedChapter = "Chapter 1"
                )
            )
        )
    }

    // -------------------------------------------------------------
    // 6. SHE WALKS IN BEAUTY & SELECTED UTME POEMS (Lord Byron, etc.)
    // -------------------------------------------------------------
    private fun buildSheWalksInBeautyData(): LiteratureBookStudyData {
        val poemChapters = listOf(
            LiteratureChapter(
                chapterNumber = 1,
                title = "Stanza 1: Harmony of Dark and Bright",
                summary = "The speaker introduces the unnamed lady, comparing her graceful movement and appearance to a cloudless, starry night. Her physical presence is a perfect equilibrium between darkness and brilliant light.",
                keyQuotes = listOf(
                    "\"She walks in beauty, like the night / Of cloudless climes and starry skies;\"",
                    "\"And all that’s best of dark and bright / Meet in her aspect and her eyes;\"",
                    "\"Thus mellowed to that tender light / Which heaven to gaudy day denies.\""
                ),
                fullText = """
                    She walks in beauty, like the night
                    Of cloudless climes and starry skies;
                    And all that’s best of dark and bright
                    Meet in her aspect and her eyes;
                    Thus mellowed to that tender light
                    Which heaven to gaudy day denies.
                """.trimIndent()
            ),
            LiteratureChapter(
                chapterNumber = 2,
                title = "Stanza 2: The Nameless Grace",
                summary = "The poet explains how the slightest change in lighting or shade would ruin the delicate beauty of her dark wavy hair (raven tresses) and serene face, which reflects pure, tranquil thoughts.",
                keyQuotes = listOf(
                    "\"One shade the more, one ray the less, / Had half impaired the nameless grace\"",
                    "\"Which waves in every raven tress, / Or softly lightens o’er her face;\"",
                    "\"Where thoughts serenely sweet express, / How pure, how dear their dwelling-place.\""
                ),
                fullText = """
                    One shade the more, one ray the less,
                    Had half impaired the nameless grace
                    Which waves in every raven tress,
                    Or softly lightens o’er her face;
                    Where thoughts serenely sweet express,
                    How pure, how dear their dwelling-place.
                """.trimIndent()
            ),
            LiteratureChapter(
                chapterNumber = 3,
                title = "Stanza 3: Inner Virtue and Moral Grace",
                summary = "The poet examines her glowing cheeks, soft brow, and winning smiles, concluding that her external beauty is a radiant manifestation of a virtuous, peaceful mind and an innocent heart.",
                keyQuotes = listOf(
                    "\"And on that cheek, and o’er that brow, / So soft, so calm, yet eloquent,\"",
                    "\"The smiles that win, the tints that glow, / But tell of days in goodness spent,\"",
                    "\"A mind at peace with all below, / A heart whose love is innocent!\""
                ),
                fullText = """
                    And on that cheek, and o’er that brow,
                    So soft, so calm, yet eloquent,
                    The smiles that win, the tints that glow,
                    But tell of days in goodness spent,
                    A mind at peace with all below,
                    A heart whose love is innocent!
                """.trimIndent()
            )
        )

        return LiteratureBookStudyData(
            id = "book_she_walks_in_beauty",
            title = "She Walks in Beauty",
            author = "Lord Byron (George Gordon)",
            authorInfo = AuthorInfo(
                name = "George Gordon Byron (6th Baron Byron)",
                lifespan = "1788 – 1824",
                nationality = "English (Romantic Poet)",
                biography = "Lord Byron was a leading figure of the British Romantic movement. Renowned for his lyric poetry, aristocratic charm, and rebellious spirit, Byron composed 'She Walks in Beauty' in June 1814 after seeing his cousin by marriage, Mrs. Anne Beatrix Wilmot, wearing a mourning dress set with silver spangles.",
                notableWorks = listOf("She Walks in Beauty (1814)", "Don Juan", "Childe Harold's Pilgrimage", "The Destruction of Sennacherib"),
                literaryMovementOrPeriod = "British Romanticism (19th Century Lyric Poetry)",
                examSignificance = "Prescribed Non-African Poetry for JAMB UTME. Focuses on iambic tetrameter, ABABAB rhyme scheme, antithesis, simile, and the connection between physical beauty and inner moral goodness."
            ),
            category = "Selected UTME Poems",
            publicationYear = "1815 (Hebrew Melodies)",
            tagline = "The quintessential Romantic lyric on harmony, grace, and inner purity.",
            coverAccentColor = BookCoverGreen,
            totalChaptersCount = poemChapters.size,
            chapters = poemChapters,
            background = LiteratureBackground(
                historicalContext = "Written during the height of the Romantic era in Britain, when poets celebrated the sublime beauty of nature, emotional truth, and inner spirituality over dry rationality.",
                socialContext = "Inspired by an aristocratic London party where Byron was captivated by the modest, serene beauty of Mrs. Wilmot in black mourning attire with sparkling silver spangles.",
                circumstancesSurroundingWork = "Published in Byron's 1815 collection 'Hebrew Melodies', set to traditional Jewish musical airs by Isaac Nathan.",
                targetExamRelevance = "Core prescribed poem. Tested on line-by-line figures of speech, rhyme scheme (ABABAB), meter (iambic tetrameter), and thematic harmony."
            ),
            plot = LiteraturePlot(
                overview = "A three-stanza lyrical meditation celebrating a woman whose physical beauty is a flawless harmony of dark and light, symbolizing her deep inner virtue and peace.",
                beginning = PlotStage(
                    title = "1. First Stanza: Visual Harmony",
                    subtitle = "The Night of Cloudless Skies",
                    description = "The speaker introduces the lady walking in radiant beauty, comparing her to a starry, cloudless night where dark and light blend in perfect harmony.",
                    keyEvents = listOf(
                        "Opening Simile: 'like the night of cloudless climes and starry skies'.",
                        "Contrast of 'tender light' against 'gaudy day'."
                    )
                ),
                majorEvents = PlotStage(
                    title = "2. Second Stanza: The Nameless Grace",
                    subtitle = "Raven Locks & Sweet Thoughts",
                    description = "The speaker marvels at the exact balance of light and shadow in her black hair (raven tresses) and serene countenance.",
                    keyEvents = listOf(
                        "Antithesis: 'One shade the more, one ray the less'.",
                        "Metaphor of her mind as the 'dwelling-place' of pure thoughts."
                    )
                ),
                turningPoints = PlotStage(
                    title = "3. Third Stanza: The Face as Mirror of the Soul",
                    subtitle = "Eloquent Cheeks & Winning Smiles",
                    description = "Her soft brow and expressive smiles reveal a life of moral goodness and inner calm.",
                    keyEvents = listOf(
                        "Personification of her soft cheeks and eloquent brow.",
                        "Smiles indicating 'days in goodness spent'."
                    )
                ),
                climax = PlotStage(
                    title = "4. Poetic Culmination: Inner Harmony",
                    subtitle = "Mind at Peace",
                    description = "The poet achieves his ultimate realization: her external splendor is merely the outward garment of a peaceful mind.",
                    keyEvents = listOf(
                        "Declaration of 'A mind at peace with all below'."
                    )
                ),
                resolution = PlotStage(
                    title = "5. Concluding Blessing: Pure Love",
                    subtitle = "Innocent Heart",
                    description = "The poem closes on a note of spiritual reverence, celebrating a heart whose love is completely innocent.",
                    keyEvents = listOf(
                        "Final line: 'A heart whose love is innocent!'."
                    )
                )
            ),
            characters = listOf(
                LiteratureCharacter(
                    name = "The Speaker (The Poet)",
                    role = "The Observant Romantic Voice",
                    isProtagonist = true,
                    personalityTraits = listOf("Aesthetic", "Reverent", "Observant", "Philosophical"),
                    relationships = "Admirer of the unnamed lady.",
                    storyImportance = "Contemplates beauty not with vulgar lust, but with elevated spiritual reverence."
                ),
                LiteratureCharacter(
                    name = "The Unnamed Lady (Mrs. Wilmot)",
                    role = "The Subject of Praise",
                    personalityTraits = listOf("Graceful", "Serene", "Modest", "Virtuous", "Innocent"),
                    relationships = "The muse whose beauty and moral aura inspired the poem.",
                    storyImportance = "The physical and moral embodiment of ideal beauty."
                )
            ),
            themes = listOf(
                LiteratureTheme(
                    title = "Harmony of Opposites (Dark & Bright)",
                    explanation = "True beauty is not an overwhelming blinding brilliance, but a delicate, peaceful equilibrium between light and dark.",
                    appearanceInStory = "Throughout stanzas 1 and 2 ('all that's best of dark and bright', 'one shade the more, one ray the less').",
                    examplesAndEvents = listOf(
                        "The lady's dark raven hair illuminating her bright face."
                    ),
                    examTakeaway = "Antithesis and balance are central to Byron's aesthetic vision."
                ),
                LiteratureTheme(
                    title = "Unity of External Beauty and Moral Purity",
                    explanation = "Physical elegance is a direct reflection of an innocent heart and a peaceful conscience.",
                    appearanceInStory = "Stanza 3 ('The smiles that win... But tell of days in goodness spent').",
                    examplesAndEvents = listOf(
                        "The concluding synthesis of external radiance with internal virtue."
                    ),
                    examTakeaway = "UTME questions often ask what the lady's smiles reveal (goodness and peace)."
                )
            ),
            literaryDevices = listOf(
                LiteratureDevice(
                    deviceName = "Simile",
                    definition = "Explicit comparison using 'like' or 'as'.",
                    exactExcerpt = "She walks in beauty, like the night / Of cloudless climes and starry skies;",
                    contextAndAnalysis = "Compares the lady's serene, dark-yet-sparkling aura to a clear starry night.",
                    examImportance = "Line 1 is universally tested in JAMB."
                ),
                LiteratureDevice(
                    deviceName = "Antithesis / Contrast",
                    definition = "Placing opposing ideas in close juxtaposition.",
                    exactExcerpt = "all that’s best of dark and bright / One shade the more, one ray the less / tender light vs gaudy day",
                    contextAndAnalysis = "Emphasizes the golden mean and flawless symmetry of her countenance.",
                    examImportance = "High-frequency exam device."
                ),
                LiteratureDevice(
                    deviceName = "Metaphor",
                    definition = "Direct comparison without using 'like' or 'as'.",
                    exactExcerpt = "raven tress / their dwelling-place",
                    contextAndAnalysis = "'Raven tress' compares her dark hair to a raven's glossy black feathers; 'dwelling-place' compares her mind to a sacred home.",
                    examImportance = "Tested in vocabulary and device questions."
                ),
                LiteratureDevice(
                    deviceName = "Alliteration",
                    definition = "Repetition of consonant sounds at the start of adjacent words.",
                    exactExcerpt = "cloudless climes / starry skies / serenely sweet / days in goodness spent",
                    contextAndAnalysis = "Creates soothing, melodic musicality reflecting the lady's graceful gait.",
                    examImportance = "Frequently asked sound device."
                )
            ),
            setting = LiteratureSetting(
                whereLocations = listOf(
                    "London High-Society Ballroom (Evening)" to "The social setting where Byron first witnessed Mrs. Wilmot in her sparkling mourning dress."
                ),
                whenTimePeriod = "June 1814 (19th-Century Romantic Era).",
                socialEnvironmentalSetting = "Regency-era aristocratic English salon.",
                symbolicSignificance = "The starry night sky serves as the macrocosm mirroring the lady's microcosm of beauty."
            ),
            importantFacts = listOf(
                ImportantFactItem(
                    category = "Structure",
                    fact = "The poem consists of 3 six-line stanzas (sestets), totaling 18 lines.",
                    examTip = "Total lines = 18."
                ),
                ImportantFactItem(
                    category = "Form",
                    fact = "The rhyme scheme is strictly ABABAB in regular iambic tetrameter (8 syllables per line).",
                    examTip = "Rhyme scheme = ABABAB."
                ),
                ImportantFactItem(
                    category = "Themes",
                    fact = "Daylight is described negatively as 'gaudy day' (vulgar and showy) compared to the 'tender light' of night.",
                    examTip = "Gaudy day vs tender light."
                )
            ),
            quickRevision = QuickRevisionSheet(
                oneSentenceSummary = "A masterwork of Romantic lyricism praising a lady whose flawless external beauty reflects her serene mind and moral innocence.",
                coreSynopsis = "Lord Byron gazes upon a beautiful woman and praises her harmony of darkness and radiance, comparing her to a starry cloudless night. He notes that her raven hair and serene face express a mind at peace with the world and an innocent heart.",
                keyCharactersSummary = listOf(
                    "The Speaker" to "Reverent Romantic poet celebrating pure beauty.",
                    "The Lady" to "Ideal embodiment of physical grace and moral innocence."
                ),
                topThemes = listOf(
                    "Harmony of Dark & Bright" to "Equilibrium of opposites.",
                    "Inner Goodness & Peace" to "Beauty as the soul's mirror."
                ),
                dominantDevices = listOf(
                    "Simile" to "Like the night of cloudless climes.",
                    "Antithesis" to "Dark and bright / Shade and ray.",
                    "Metaphor" to "Raven tress."
                ),
                tenMustKnowExamFacts = listOf(
                    "1. Author is Lord Byron (George Gordon).",
                    "2. Total of 18 lines divided into 3 six-line stanzas (sestets).",
                    "3. Rhyme scheme is ABABAB CDCDCD EFEFEF.",
                    "4. Written in Iambic Tetrameter (4 poetic feet / 8 syllables per line).",
                    "5. Opening line uses a Simile comparing the woman to 'the night'.",
                    "6. Day is depicted as 'gaudy' (harsh, showy, boastful).",
                    "7. 'Raven tress' is a metaphor for glossy jet-black hair.",
                    "8. The lady's face is described as the 'dwelling-place' of pure thoughts.",
                    "9. Her glowing smiles indicate 'days in goodness spent'.",
                    "10. The poem links physical perfection with spiritual innocence."
                )
            ),
            practiceQuestions = listOf(
                LiteratureQuizQuestion(
                    id = 601,
                    question = "What is the rhyme scheme of each stanza in 'She Walks in Beauty'?",
                    options = listOf(
                        "A) AABBCC",
                        "B) ABBAAB",
                        "C) ABABAB",
                        "D) ABCABC"
                    ),
                    correctIndex = 2,
                    explanation = "Each of the three stanzas strictly follows the alternate rhyme scheme ABABAB.",
                    questionType = "Past Question",
                    relatedChapter = "Stanza 1"
                ),
                LiteratureQuizQuestion(
                    id = 602,
                    question = "The expression 'gaudy day' in line 6 suggests that daylight is:",
                    options = listOf(
                        "A) Warm and comforting",
                        "B) Showy, harsh, and boastfully bright",
                        "C) Serene and peaceful",
                        "D) Dark and stormy"
                    ),
                    correctIndex = 1,
                    explanation = "'Gaudy' means extravagantly bright, tasteless, or showy, contrasting with the lady's soft, tender radiance.",
                    questionType = "Practice Question",
                    relatedChapter = "Stanza 1"
                )
            )
        )
    }

    // -------------------------------------------------------------
    // 7. SWEET SIXTEEN (Bolaji Abdullahi)
    // -------------------------------------------------------------
    private fun buildSweetSixteenData(): LiteratureBookStudyData {
        val chapters = listOf(
            LiteratureChapter(
                chapterNumber = 1,
                title = "Chapter 1: The Letter",
                summary = "On her 16th birthday, Aliya receives a 16-page letter from her journalist father, Mr. Bello, addressing the physical, emotional, and social transitions of young adulthood.",
                keyQuotes = listOf(
                    "\"You are sixteen now, and your life is opening up like a book.\"",
                    "\"Knowledge is the only shield against the confusion of youth.\""
                ),
                fullText = "Aliya awakens on her sixteenth birthday expecting material gifts from her father. Instead, she receives a comprehensive 16-page letter covering puberty, health, self-identity, friendship, and moral integrity."
            ),
            LiteratureChapter(
                chapterNumber = 2,
                title = "Chapter 2: The Drive & The Stereotype",
                summary = "During a road drive, father and daughter discuss stereotypes, gender roles, self-esteem, and why blind conformity harms individual destiny.",
                keyQuotes = listOf(
                    "\"Never allow society's stereotypes to define what you can become.\""
                ),
                fullText = "Mr. Bello and Aliya take a drive through the city, sparking deep discussions about religious and ethnic tolerance, beauty standards, and overcoming prejudice."
            ),
            LiteratureChapter(
                chapterNumber = 3,
                title = "Chapter 3: Work, Discipline & Destiny",
                summary = "Mr. Bello instills the indispensable value of diligence, academic focus, and moral courage in the face of peer pressure.",
                keyQuotes = listOf(
                    "\"Discipline is the bridge between goals and accomplishment.\""
                ),
                fullText = "Aliya reflects on her relationships with classmates and internalizes her father's guidance on emotional maturity and academic excellence."
            )
        )

        return LiteratureBookStudyData(
            id = "book_sweet_sixteen",
            title = "Sweet Sixteen",
            author = "Bolaji Abdullahi",
            authorInfo = AuthorInfo(
                name = "Bolaji Abdullahi",
                lifespan = "1969 – Present",
                nationality = "Nigerian (Author, Journalist & Politician)",
                biography = "Bolaji Abdullahi is a Nigerian writer, former Minister of Youth Development and Sports, and author of several acclaimed works. 'Sweet Sixteen' was written to foster dialogue between parents and teenagers.",
                notableWorks = listOf("Sweet Sixteen (2017)", "On a Platter of Gold"),
                literaryMovementOrPeriod = "Contemporary Nigerian Young-Adult Fiction",
                examSignificance = "Former mandatory UTME prose text exploring teenagerhood, self-identity, empathy, and parent-child communication."
            ),
            category = "UTME Prose",
            publicationYear = "2017 (Masobe Books)",
            tagline = "An inspiring dialogue between a father and daughter on growing up with dignity.",
            coverAccentColor = BookCoverPurple,
            totalChaptersCount = chapters.size,
            chapters = chapters,
            background = LiteratureBackground(
                historicalContext = "Contemporary 21st-century Nigeria amidst smartphones, internet culture, and teenage socialization.",
                socialContext = "Navigating adolescence, body shaming, peer pressure, and inter-generational communication.",
                circumstancesSurroundingWork = "Selected by JAMB to promote moral and health awareness among teenagers.",
                targetExamRelevance = "Tested on Aliya's questions, Mr. Bello's letter contents, and themes of self-esteem."
            ),
            plot = LiteraturePlot(
                overview = "The story follows 16-year-old Aliya as she navigates teenage questions through a series of thoughtful conversations and letters with her loving father, Mr. Bello.",
                beginning = PlotStage(
                    title = "1. The 16th Birthday",
                    subtitle = "A Father's Letter",
                    description = "Aliya receives a 16-page letter on her sixteenth birthday addressing teenage life.",
                    keyEvents = listOf("Aliya turns sixteen and reads her father's letter.")
                ),
                majorEvents = PlotStage(
                    title = "2. Conversations on Identity",
                    subtitle = "Body & Soul",
                    description = "Father and daughter explore physical changes, emotions, and peer relationships.",
                    keyEvents = listOf("Discussion on self-esteem and avoiding stereotypes.")
                ),
                turningPoints = PlotStage(
                    title = "3. Peer Pressure & Integrity",
                    subtitle = "Making the Right Choices",
                    description = "Aliya discusses moral integrity, academic discipline, and future goals.",
                    keyEvents = listOf("Learning the value of hard work over instant gratification.")
                ),
                climax = PlotStage(
                    title = "4. Epiphany of Maturity",
                    subtitle = "Internalizing Wisdom",
                    description = "Aliya realizes that growing up is about responsibility rather than mere age.",
                    keyEvents = listOf("Aliya embraces her father's guidance as her life compass.")
                ),
                resolution = PlotStage(
                    title = "5. Stepping into Young Adulthood",
                    subtitle = "Confident and Prepared",
                    description = "Aliya steps forward with confidence, mutual trust with her father, and clear life goals.",
                    keyEvents = listOf("A strengthened bond of love and intellectual respect.")
                )
            ),
            characters = listOf(
                LiteratureCharacter(
                    name = "Aliya Bello",
                    role = "Protagonist",
                    isProtagonist = true,
                    personalityTraits = listOf("Inquisitive", "Thoughtful", "Observant", "Growing"),
                    relationships = "Daughter of Mr. Bello.",
                    storyImportance = "Represents the modern teenager seeking guidance and self-identity."
                ),
                LiteratureCharacter(
                    name = "Mr. Bello",
                    role = "Mentor & Father",
                    personalityTraits = listOf("Wise", "Patient", "Educated", "Supportive"),
                    relationships = "Aliya's father.",
                    storyImportance = "The voice of parental wisdom, open dialogue, and empathy."
                )
            ),
            themes = listOf(
                LiteratureTheme(
                    title = "Parent-Child Communication",
                    explanation = "Open, non-judgmental dialogue between parents and teenagers builds trust and moral resilience.",
                    appearanceInStory = "The 16-page letter and road-trip conversations.",
                    examplesAndEvents = listOf("Mr. Bello addressing sensitive adolescent topics openly."),
                    examTakeaway = "Key lesson: Dialogue prevents youth delinquency."
                ),
                LiteratureTheme(
                    title = "Self-Identity & Overcoming Stereotypes",
                    explanation = "Resisting societal pressure to conform to superficial beauty and gender standards.",
                    appearanceInStory = "Discussions on self-worth and intellect.",
                    examplesAndEvents = listOf("Aliya learning that character defines true beauty."),
                    examTakeaway = "Core theme for teenage development."
                )
            ),
            literaryDevices = listOf(
                LiteratureDevice(
                    deviceName = "Epistolary Technique",
                    definition = "Use of letters and written correspondence to advance narration.",
                    exactExcerpt = "The 16-page birthday letter given to Aliya.",
                    contextAndAnalysis = "Allows intimate, direct conveyance of fatherly wisdom.",
                    examImportance = "Frequently asked format question."
                )
            ),
            setting = LiteratureSetting(
                whereLocations = listOf(
                    "The Bello Residence" to "A warm, book-filled family home.",
                    "The City Roads" to "Setting for the car ride discussions."
                ),
                whenTimePeriod = "Present-day Nigeria.",
                socialEnvironmentalSetting = "Modern middle-class Nigerian urban setting.",
                symbolicSignificance = "The home is a sanctuary of moral learning and growth."
            ),
            importantFacts = listOf(
                ImportantFactItem(
                    category = "Facts",
                    fact = "Mr. Bello gave Aliya a 16-page letter on her 16th birthday.",
                    examTip = "Letter length = 16 pages."
                )
            ),
            quickRevision = QuickRevisionSheet(
                oneSentenceSummary = "A father guides his 16-year-old daughter through the challenges of adolescence with empathy, wisdom, and open communication.",
                coreSynopsis = "On her 16th birthday, Aliya receives a 16-page letter from her father Mr. Bello covering health, puberty, self-esteem, stereotypes, and moral integrity. Through open conversations, Aliya gains the confidence to navigate young adulthood with dignity.",
                keyCharactersSummary = listOf(
                    "Aliya" to "Inquisitive 16-year-old girl.",
                    "Mr. Bello" to "Wise, loving journalist father."
                ),
                topThemes = listOf(
                    "Parent-Teen Communication" to "Open dialogue over harsh scolding.",
                    "Self-Identity" to "Resisting stereotypes."
                ),
                dominantDevices = listOf(
                    "Epistolary Technique" to "The 16-page letter."
                ),
                tenMustKnowExamFacts = listOf(
                    "1. Aliya's father is Mr. Bello, a journalist.",
                    "2. The letter given to Aliya contains exactly 16 pages.",
                    "3. The book covers puberty, body changes, and emotional growth.",
                    "4. Mr. Bello advocates against gender and racial stereotypes.",
                    "5. Aliya learns that self-esteem comes from character and knowledge.",
                    "6. Author is Bolaji Abdullahi, former Nigerian Minister.",
                    "7. The book encourages mutual respect between generations.",
                    "8. Health and physical hygiene are key topics in the letter.",
                    "9. The dialogue format fosters easy student understanding.",
                    "10. The novel promotes academic discipline and moral courage."
                )
            ),
            practiceQuestions = listOf(
                LiteratureQuizQuestion(
                    id = 701,
                    question = "What special gift did Mr. Bello give Aliya on her 16th birthday?",
                    options = listOf(
                        "A) A new smartphone",
                        "B) A 16-page letter addressing adolescent life",
                        "C) A trip to London",
                        "D) A gold necklace"
                    ),
                    correctIndex = 1,
                    explanation = "Mr. Bello wrote a thoughtful 16-page letter touching on all crucial aspects of adolescent development.",
                    questionType = "Past Question",
                    relatedChapter = "Chapter 1"
                )
            )
        )
    }
}
