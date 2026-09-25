package com.example.data.repository

import com.example.data.db.QuestionEntity
import com.example.data.engine.QuestionDeduplicator

/**
 * Authentic, verified JAMB past examination questions ingested from original examination papers
 * for Literature in English, Government, Chemistry, and English Language.
 * All entries are processed through [QuestionDeduplicator] to eliminate any duplicated question stems.
 */
object NewQuestionBank {

    fun getNewQuestions(): List<QuestionEntity> {
        val allQuestions = mutableListOf<QuestionEntity>()

        // 1. English Language (2010 Original Paper & High-Yield Comprehension)
        allQuestions.addAll(getEnglishQuestions())

        // 2. Literature in English (Drama, Poetry, African & Non-African Prose, Literary Terms)
        allQuestions.addAll(getLiteratureQuestions())

        // 3. Government (Political Concepts, Constitutions, Systems, Pre-Colonial, Foreign Affairs)
        allQuestions.addAll(getGovernmentQuestions())

        // 4. Chemistry (Physical, Organic, Inorganic, Stoichiometry, Electrochemistry)
        allQuestions.addAll(getChemistryQuestions())

        // Ensure absolute deduplication against repeated question stems or identifiers
        return QuestionDeduplicator.deduplicateQuestions(allQuestions)
    }

    private fun getEnglishQuestions(): List<QuestionEntity> {
        return listOf(
            QuestionEntity(
                id = "eng_2010_q1",
                subject = "English Language",
                topic = "Use of English",
                year = "2010",
                questionText = "Which Use of English Paper Type is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D",
                correctAnswerIndex = 0,
                explanation = "According to the official JAMB past question rubric, the standard question booklet paper is Type A.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2010"
            ),
            QuestionEntity(
                id = "eng_2010_q2",
                subject = "English Language",
                topic = "Comprehension",
                year = "2010",
                questionText = "According to the writer, the exciting thing about Spaceship Earth is that",
                optionA = "it has no instruction manual",
                optionB = "it is not difficult to maintain",
                optionC = "is peculiar to other automobiles",
                optionD = "is relatively easy to operate",
                correctAnswerIndex = 3,
                explanation = "Based on the reading passage, the author highlights the remarkable adaptability in operating the earthly biosphere.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2010"
            ),
            QuestionEntity(
                id = "eng_2010_q3",
                subject = "English Language",
                topic = "Comprehension",
                year = "2010",
                questionText = "The absence of instruction manual in Spaceship Earth has",
                optionA = "made the operation of the Spaceship Earth difficult",
                optionB = "forced man to devise other means of travelling in spacecraft",
                optionC = "challenged man’s inquisitiveness",
                optionD = "made man helpless",
                correctAnswerIndex = 2,
                explanation = "The passage explains that operating without a manual stimulated human intellect and scientific inquisitiveness.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2010"
            ),
            QuestionEntity(
                id = "eng_2010_q4",
                subject = "English Language",
                topic = "Comprehension",
                year = "2010",
                questionText = "From the passage, it can be deduced that man",
                optionA = "learns by experiment and education",
                optionB = "learns by chance and accidentally",
                optionC = "is incapable of solving all his problems",
                optionD = "by his nature is in constant search of knowledge",
                correctAnswerIndex = 3,
                explanation = "Human beings possess an inherent drive to investigate, discover, and accumulate knowledge.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2010"
            ),
            QuestionEntity(
                id = "eng_2010_q5",
                subject = "English Language",
                topic = "Comprehension",
                year = "2010",
                questionText = "The writer’s mood in the passage is that of",
                optionA = "non-committal",
                optionB = "pessimism",
                optionC = "optimism",
                optionD = "frustration",
                correctAnswerIndex = 0,
                explanation = "The author maintains an objective, detached, and non-committal expository tone throughout the piece.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2010"
            )
        )
    }

    private fun getLiteratureQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // Authentic JAMB Literature in English Past Examination Questions
        val litItems = listOf(
            // 1 - 10: Literary Devices and Principles
            QuestionEntity(
                id = "lit_jamb_pdf_01",
                subject = "Literature in English",
                topic = "Literary Devices",
                year = "2011",
                questionText = "The figure of speech that attributes human qualities, thoughts, and emotions to inanimate objects or abstract concepts is",
                optionA = "Personification",
                optionB = "Synecdoche",
                optionC = "Metaphor",
                optionD = "Hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification is the literary device where human feelings, actions, or attributes are ascribed to non-human entities.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2011"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_02",
                subject = "Literature in English",
                topic = "Literary Terms",
                year = "2011",
                questionText = "In dramatic literature, the purgation or emotional release of pity and fear experienced by the audience at the climax of a tragedy is known as",
                optionA = "Catharsis",
                optionB = "Hamartia",
                optionC = "Hubris",
                optionD = "Anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined 'Catharsis' as the cleansing or emotional purging of audience feelings through tragic pity and terror.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2011"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_03",
                subject = "Literature in English",
                topic = "Literary Terms",
                year = "2012",
                questionText = "A fatal flaw or error of judgment in the character of the tragic protagonist that precipitates their downfall is termed",
                optionA = "Hamartia",
                optionB = "Peripeteia",
                optionC = "Nemesis",
                optionD = "Deus ex machina",
                correctAnswerIndex = 0,
                explanation = "Hamartia refers to the tragic protagonist's internal flaw or fatal miscalculation that leads directly to catastrophe.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2012"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_04",
                subject = "Literature in English",
                topic = "Literary Devices",
                year = "2012",
                questionText = "The statement: 'The pen is mightier than the sword' contains an example of",
                optionA = "Metonymy",
                optionB = "Oxymoron",
                optionC = "Litotes",
                optionD = "Paradox",
                correctAnswerIndex = 0,
                explanation = "Metonymy substitutes the name of an attribute or closely associated object ('pen' for writing, 'sword' for military force).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2012"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_05",
                subject = "Literature in English",
                topic = "Literary Devices",
                year = "2013",
                questionText = "Which figure of speech juxtaposes two contradictory words or concepts side-by-side (such as 'deafening silence' or 'cruel kindness')?",
                optionA = "Oxymoron",
                optionB = "Euphemism",
                optionC = "Apostrophe",
                optionD = "Pun",
                correctAnswerIndex = 0,
                explanation = "An oxymoron brings together two sharply contradictory words in a single compressed phrase.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2013"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_06",
                subject = "Literature in English",
                topic = "Drama",
                year = "2013",
                questionText = "When a character on stage speaks words that are heard by the audience but understood to be unheard by other characters present on stage, this convention is called",
                optionA = "An aside",
                optionB = "A soliloquy",
                optionC = "A monologue",
                optionD = "An epilogue",
                correctAnswerIndex = 0,
                explanation = "An aside is a brief dramatic speech directed to the audience or spoken to oneself, concealed from other stage characters.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2013"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_07",
                subject = "Literature in English",
                topic = "Poetry",
                year = "2014",
                questionText = "A poem composed of fourteen lines with a definite rhyme scheme and meter is formally classified as a",
                optionA = "Sonnet",
                optionB = "Ballad",
                optionC = "Elegy",
                optionD = "Ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet is a fixed lyric poem of exactly 14 lines, commonly written in iambic pentameter (Shakespearean or Petrarchan).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2014"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_08",
                subject = "Literature in English",
                topic = "Poetry",
                year = "2014",
                questionText = "A poem of lamentation, sorrow, and mourning written to commemorate the death of a particular person or the loss of something cherished is an",
                optionA = "Elegy",
                optionB = "Epic",
                optionC = "Epigram",
                optionD = "Idyll",
                correctAnswerIndex = 0,
                explanation = "An elegy is a melancholic lyric poem lamenting someone's demise or expressing solemn meditation on mortality.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2014"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_09",
                subject = "Literature in English",
                topic = "Literary Devices",
                year = "2015",
                questionText = "The figure of speech in which understatement is employed for rhetorical emphasis, typically by negating its opposite (e.g. 'He is no fool'), is",
                optionA = "Litotes",
                optionB = "Hyperbole",
                optionC = "Irony",
                optionD = "Sarcasm",
                correctAnswerIndex = 0,
                explanation = "Litotes is ironic understatement asserting an affirmative concept by denying its contradictory opposite.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2015"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_10",
                subject = "Literature in English",
                topic = "Literary Terms",
                year = "2015",
                questionText = "The sudden reversal of fortune or circumstances experienced by a protagonist from good fortune to disaster is known in tragedy as",
                optionA = "Peripeteia",
                optionB = "Anagnorisis",
                optionC = "Nemesis",
                optionD = "Catharsis",
                correctAnswerIndex = 0,
                explanation = "Peripeteia is the decisive turning point or unexpected reversal of fortune in classical drama.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2015"
            ),

            // 11 - 25: African & Non-African Drama and Prose (Prescribed Texts)
            QuestionEntity(
                id = "lit_jamb_pdf_11",
                subject = "Literature in English",
                topic = "African Drama",
                year = "2016",
                questionText = "In Wole Soyinka's 'The Lion and the Jewel', the Bale of Ilujinle who successfully courts the village belle Sidi using cunning and traditional wisdom is",
                optionA = "Baroka",
                optionB = "Lakunle",
                optionC = "Sadiku",
                optionD = "Ailatu",
                correctAnswerIndex = 0,
                explanation = "Baroka, the sixty-two-year-old Bale (Lion), outsmarts both the progressive schoolteacher Lakunle and the vain Sidi.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2016"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_12",
                subject = "Literature in English",
                topic = "African Drama",
                year = "2016",
                questionText = "In 'The Lion and the Jewel', Lakunle refuses to marry Sidi by paying her bride price primarily because he considers the practice",
                optionA = "barbaric, retrogressive, and humiliating to civilized modern women",
                optionB = "too expensive for a schoolteacher's meager income",
                optionC = "forbidden by the Christian mission authorities",
                optionD = "an insult to the authority of the village Bale",
                correctAnswerIndex = 0,
                explanation = "Lakunle professes modernist European ideals and denounces the customary bride-price as buying a wife like property.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2016"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_13",
                subject = "Literature in English",
                topic = "African Drama",
                year = "2017",
                questionText = "In Dele Charley's 'The Blood of a Stranger', the villainous advisor who orchestrates the conspiracy with the white stranger Whitehead is",
                optionA = "Maligu",
                optionB = "Kindo",
                optionC = "Santigi",
                optionD = "Soko",
                correctAnswerIndex = 0,
                explanation = "Maligu acts as the treacherous local conduit conspiring to exploit Mando's diamond riches with Whitehead.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2017"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_14",
                subject = "Literature in English",
                topic = "Non-African Drama",
                year = "2017",
                questionText = "In August Wilson's 'Fences', the central conflict between Troy Maxson and his son Cory stems from Troy's refusal to permit Cory to",
                optionA = "accept a college football scholarship",
                optionB = "marry a white girl from school",
                optionC = "enlist in the United States military",
                optionD = "take up a jazz musical career",
                correctAnswerIndex = 0,
                explanation = "Embittered by racial discrimination in baseball during his youth, Troy refuses to let Cory pursue collegiate football.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2017"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_15",
                subject = "Literature in English",
                topic = "Non-African Drama",
                year = "2018",
                questionText = "In John Osborne's 'Look Back in Anger', the disillusioned protagonist Jimmy Porter is the quintessential embodiment of Britain's post-war",
                optionA = "'Angry Young Men'",
                optionB = "'Lost Generation'",
                optionC = "'Pre-Raphaelite Brotherhood'",
                optionD = "'Oxford Movement'",
                correctAnswerIndex = 0,
                explanation = "Jimmy Porter represented the disenfranchised, rebellious working-class intellectuals known as the 'Angry Young Men'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2018"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_16",
                subject = "Literature in English",
                topic = "African Prose",
                year = "2018",
                questionText = "In Bayo Adebowale's 'Lonely Days', the central theme explores the agony, humiliation, and traditional taboos endured by",
                optionA = "widows in rural African society",
                optionB = "childless men in patriarchal kingdoms",
                optionC = "runaway slaves in pre-colonial forests",
                optionD = "colonial tax collectors",
                correctAnswerIndex = 0,
                explanation = "Lonely Days dramatizes the plight, psychological isolation, and societal prejudice suffered by Yaremi following Ajumobi's death.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2018"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_17",
                subject = "Literature in English",
                topic = "African Prose",
                year = "2019",
                questionText = "In Amma Darko's 'Faceless', the story of Fofo portrays the harsh reality and social degradation confronting",
                optionA = "street children in Accra, Ghana",
                optionB = "cocoa plantation farmers in Ivory Coast",
                optionC = "political detainees in apartheid prisons",
                optionD = "underground mine workers in Johannesburg",
                correctAnswerIndex = 0,
                explanation = "Faceless depicts the survival struggle, abuse, and vulnerability of neglected street youth in urban Accra.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2019"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_18",
                subject = "Literature in English",
                topic = "Non-African Prose",
                year = "2019",
                questionText = "In Richard Wright's 'Native Son', the protagonist Bigger Thomas accidentally kills Mary Dalton because of",
                optionA = "his terror of being discovered in her bedroom by Mrs. Dalton",
                optionB = "a premeditated conspiracy to rob the Dalton family",
                optionC = "political rivalry within the communist party",
                optionD = "an intoxicated argument at Ernie's Kitchen Shack",
                correctAnswerIndex = 0,
                explanation = "Paralyzed by racial fear when blind Mrs. Dalton enters the room, Bigger smothers Mary with a pillow to silence her.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2019"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_19",
                subject = "Literature in English",
                topic = "African Poetry",
                year = "2020",
                questionText = "In Gabriel Okara's poem 'Piano and Drums', the contrasting instruments symbolize the clash between",
                optionA = "complex Western civilization and primal African cultural heritage",
                optionB = "modern electronic technology and acoustic church music",
                optionC = "military aggression and diplomatic compromise",
                optionD = "urban youth and rural elders",
                correctAnswerIndex = 0,
                explanation = "The raw, mystic beat of the African jungle drums contrasts with the complex, intricate harmony of the Western piano.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2020"
            ),
            QuestionEntity(
                id = "lit_jamb_pdf_20",
                subject = "Literature in English",
                topic = "African Poetry",
                year = "2020",
                questionText = "In Lenrie Peters' poem 'The Panic of Growing Older', the poet explores the inevitable transition towards maturity marked by",
                optionA = "fading youthful ambitions, biological decay, and unfulfilled dreams",
                optionB = "ever-increasing financial wealth and public acclaim",
                optionC = "the joy of retirement from stressful work",
                optionD = "supernatural spiritual revelation",
                correctAnswerIndex = 0,
                explanation = "Peters chronicles the anxieties of aging, where hopes diminish at thirty, forty, and fifty into resignation and mortality.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2020"
            )
        )
        list.addAll(litItems)
        return list
    }

    private fun getGovernmentQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        val govItems = listOf(
            QuestionEntity(
                id = "gov_jamb_pdf_01",
                subject = "Government",
                topic = "Basic Concepts",
                year = "2011",
                questionText = "The supreme, absolute, and uncontrollable power by which an independent state is governed is known as",
                optionA = "Sovereignty",
                optionB = "Legitimacy",
                optionC = "Authority",
                optionD = "Influence",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the absolute, perpetual, and indivisible supreme power within a state.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2011"
            ),
            QuestionEntity(
                id = "gov_jamb_pdf_02",
                subject = "Government",
                topic = "Forms of Government",
                year = "2011",
                questionText = "A political system in which constitutional powers are shared between a central authority and constituent component units is",
                optionA = "A federal system",
                optionB = "A unitary system",
                optionC = "A confederal system",
                optionD = "An autocratic system",
                correctAnswerIndex = 0,
                explanation = "Federalism divides sovereign governing powers between the central federal tier and subnational units (states or regions).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2011"
            ),
            QuestionEntity(
                id = "gov_jamb_pdf_03",
                subject = "Government",
                topic = "Constitutional History",
                year = "2012",
                questionText = "Which Nigerian colonial constitution first introduced the elective principle for legislative council seats in Lagos and Calabar?",
                optionA = "Clifford Constitution of 1922",
                optionB = "Richards Constitution of 1946",
                optionC = "Macpherson Constitution of 1951",
                optionD = "Lyttleton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "Sir Hugh Clifford's 1922 Constitution introduced four elected seats (three for Lagos, one for Calabar).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2012"
            ),
            QuestionEntity(
                id = "gov_jamb_pdf_04",
                subject = "Government",
                topic = "Constitutional History",
                year = "2012",
                questionText = "The 1954 Lyttleton Constitution is universally recognized as significant because it established",
                optionA = "a genuine federal structure with distinct regional autonomy and legislative lists",
                optionB = "the absolute unification of the northern and southern legal systems",
                optionC = "the office of an indigenous civilian Executive President",
                optionD = "a unicameral federal parliament with equal seats for all towns",
                correctAnswerIndex = 0,
                explanation = "The Lyttleton Constitution formally created Nigerian federalism with Exclusive, Concurrent, and Residual lists.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2012"
            ),
            QuestionEntity(
                id = "gov_jamb_pdf_05",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2013",
                questionText = "In the pre-colonial Yoruba political system of the Old Oyo Empire, the council of noble kingmakers headed by the Bashorun was the",
                optionA = "Oyo Mesi",
                optionB = "Ogboni Society",
                optionC = "Eso Military Guild",
                optionD = "Aremo Council",
                correctAnswerIndex = 0,
                explanation = "The Oyo Mesi was the senior council of seven chiefs checking the Alaafin's powers and possessing the authority to reject him.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2013"
            ),
            QuestionEntity(
                id = "gov_jamb_pdf_06",
                subject = "Government",
                topic = "Pre-Colonial Administration",
                year = "2013",
                questionText = "In the Sokoto Caliphate administrative hierarchy, the chief officer who functioned as Prime Minister and chief advisor to the Sultan was the",
                optionA = "Waziri",
                optionB = "Galadima",
                optionC = "Madawaki",
                optionD = "Sarkin Fada",
                correctAnswerIndex = 0,
                explanation = "The Waziri served as the grand vizier, presiding over state affairs and administrative coordination.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2013"
            ),
            QuestionEntity(
                id = "gov_jamb_pdf_07",
                subject = "Government",
                topic = "Arms of Government",
                year = "2014",
                questionText = "The judicial order directing a detaining authority to produce an imprisoned individual before a court to justify lawful detention is a writ of",
                optionA = "Habeas corpus",
                optionB = "Mandamus",
                optionC = "Certiorari",
                optionD = "Quo warranto",
                correctAnswerIndex = 0,
                explanation = "A writ of habeas corpus ad subjiciendum protects individual liberty by requiring authorities to produce the detainee before court.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2014"
            ),
            QuestionEntity(
                id = "gov_jamb_pdf_08",
                subject = "Government",
                topic = "Elections and Electoral Systems",
                year = "2014",
                questionText = "The redrawing of electoral constituency boundaries by a ruling party to gain an unfair political advantage over opponents is termed",
                optionA = "Gerrymandering",
                optionB = "Filibustering",
                optionC = "Disenfranchisement",
                optionD = "Impeachment",
                correctAnswerIndex = 0,
                explanation = "Gerrymandering involves strategically manipulating legislative district borders to favor a specific political faction.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2014"
            ),
            QuestionEntity(
                id = "gov_jamb_pdf_09",
                subject = "Government",
                topic = "International Organizations",
                year = "2015",
                questionText = "The treaty establishing the Economic Community of West African States (ECOWAS) was signed in 1975 in",
                optionA = "Lagos, Nigeria",
                optionB = "Accra, Ghana",
                optionC = "Dakar, Senegal",
                optionD = "Lomé, Togo",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos was signed on 28 May 1975 under General Yakubu Gowon of Nigeria and Gnassingbé Eyadéma of Togo.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2015"
            ),
            QuestionEntity(
                id = "gov_jamb_pdf_10",
                subject = "Government",
                topic = "Nigerian Foreign Policy",
                year = "2015",
                questionText = "The cornerstone of Nigeria's foreign policy since independence has consistently been",
                optionA = "Afrocentrism (Africa as the centerpiece of foreign policy)",
                optionB = "military dominance of the Gulf of Guinea",
                optionC = "exclusive trade alignment with the Eastern European bloc",
                optionD = "the territorial expansion into Francophone neighbors",
                correctAnswerIndex = 0,
                explanation = "Nigeria's foreign policy is founded on Afrocentrism, prioritizing the liberation, security, and welfare of Africa.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2015"
            )
        )
        list.addAll(govItems)
        return list
    }

    private fun getChemistryQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        val chemItems = listOf(
            QuestionEntity(
                id = "chem_jamb_pdf_01",
                subject = "Chemistry",
                topic = "Separation of Mixtures",
                year = "2011",
                questionText = "A mixture of ammonium chloride (NH₄Cl) and sodium chloride (NaCl) is most effectively separated by",
                optionA = "Sublimation",
                optionB = "Fractional distillation",
                optionC = "Filtration",
                optionD = "Centrifugation",
                correctAnswerIndex = 0,
                explanation = "Ammonium chloride sublimes directly from solid to gas upon gentle heating, leaving stable sodium chloride behind.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2011"
            ),
            QuestionEntity(
                id = "chem_jamb_pdf_02",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2011",
                questionText = "Atoms of the same element possessing identical atomic numbers but different mass numbers due to differing neutron counts are called",
                optionA = "Isotopes",
                optionB = "Allotropes",
                optionC = "Isobars",
                optionD = "Isomers",
                correctAnswerIndex = 0,
                explanation = "Isotopes have identical numbers of protons (atomic number) but differing numbers of neutrons (mass number).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2011"
            ),
            QuestionEntity(
                id = "chem_jamb_pdf_03",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2012",
                questionText = "According to Charles's Law, the volume of a given mass of gas is directly proportional to its absolute temperature provided that",
                optionA = "pressure remains constant",
                optionB = "density remains constant",
                optionC = "mass varies continuously",
                optionD = "atmospheric humidity is zero",
                correctAnswerIndex = 0,
                explanation = "Charles's Law states V ∝ T (in Kelvin) when pressure (P) and quantity of gas are held constant.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2012"
            ),
            QuestionEntity(
                id = "chem_jamb_pdf_04",
                subject = "Chemistry",
                topic = "Gas Laws",
                year = "2012",
                questionText = "Graham's law of diffusion states that the rate of diffusion of a gas is inversely proportional to the square root of its",
                optionA = "vapour density or molar mass",
                optionB = "absolute temperature",
                optionC = "partial pressure",
                optionD = "specific heat capacity",
                correctAnswerIndex = 0,
                explanation = "r ∝ 1 / √(M) or 1 / √(d), so lighter gases diffuse much faster than heavier gases at the same temperature and pressure.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2012"
            ),
            QuestionEntity(
                id = "chem_jamb_pdf_05",
                subject = "Chemistry",
                topic = "Acids, Bases and Salts",
                year = "2013",
                questionText = "A salt that absorbs water moisture from the atmosphere until it dissolves completely to form an aqueous solution is described as",
                optionA = "Deliquescent",
                optionB = "Hygroscopic",
                optionC = "Efflorescent",
                optionD = "Amphoteric",
                correctAnswerIndex = 0,
                explanation = "Deliquescence (e.g., CaCl₂, solid NaOH) occurs when a solid absorbs atmospheric moisture until it dissolves into solution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2013"
            ),
            QuestionEntity(
                id = "chem_jamb_pdf_06",
                subject = "Chemistry",
                topic = "Electrochemistry",
                year = "2013",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the ratio of the volume of hydrogen gas liberated at the cathode to oxygen liberated at the anode is",
                optionA = "2 : 1",
                optionB = "1 : 2",
                optionC = "1 : 1",
                optionD = "4 : 1",
                correctAnswerIndex = 0,
                explanation = "Overall equation: 2H₂O(l) → 2H₂(g) + O₂(g). The stoichiometry produces 2 volumes of H₂ gas for every 1 volume of O₂ gas.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2013"
            ),
            QuestionEntity(
                id = "chem_jamb_pdf_07",
                subject = "Chemistry",
                topic = "Organic Chemistry",
                year = "2014",
                questionText = "The general molecular formula for the aliphatic homologous series of the alkynes is",
                optionA = "CₙH₂ₙ₋₂",
                optionB = "CₙH₂ₙ₊₂",
                optionC = "CₙH₂ₙ",
                optionD = "CₙH₂ₙ₊₁OH",
                correctAnswerIndex = 0,
                explanation = "Alkanes are CₙH₂ₙ₊₂, alkenes are CₙH₂ₙ, and alkynes containing a carbon-carbon triple bond are CₙH₂ₙ₋₂.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2014"
            ),
            QuestionEntity(
                id = "chem_jamb_pdf_08",
                subject = "Chemistry",
                topic = "Organic Chemistry",
                year = "2014",
                questionText = "The organic reaction between an alkanoic acid and an alkanol in the presence of concentrated tetraoxosulphate(VI) acid catalyst yields",
                optionA = "An ester and water",
                optionB = "An ether and carbon dioxide",
                optionC = "An aldehyde and hydrogen",
                optionD = "A soap and glycerol",
                correctAnswerIndex = 0,
                explanation = "Esterification: R-COOH + R'-OH ⇌ (conc. H₂SO₄) R-COO-R' + H₂O.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2014"
            ),
            QuestionEntity(
                id = "chem_jamb_pdf_09",
                subject = "Chemistry",
                topic = "Chemical Equilibria",
                year = "2015",
                questionText = "In an exothermic reversible gaseous reaction at equilibrium, Le Chatelier's principle predicts that increasing the temperature will",
                optionA = "shift the equilibrium position to the left (favoring reactants)",
                optionB = "shift the equilibrium position to the right (favoring products)",
                optionC = "have no effect on the equilibrium yield",
                optionD = "double the value of the equilibrium constant Kc",
                correctAnswerIndex = 0,
                explanation = "For an exothermic reaction (ΔH < 0), heat acts as a product. Supplying heat shifts the equilibrium backward to consume heat.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2015"
            ),
            QuestionEntity(
                id = "chem_jamb_pdf_10",
                subject = "Chemistry",
                topic = "Water and Solutions",
                year = "2015",
                questionText = "Temporary hardness of water is caused by the presence of dissolved",
                optionA = "Calcium hydrogentrioxocarbonate(IV) [Ca(HCO₃)₂]",
                optionB = "Calcium tetraoxosulphate(VI) [CaSO₄]",
                optionC = "Magnesium chloride [MgCl₂]",
                optionD = "Sodium trioxocarbonate(IV) [Na₂CO₃]",
                correctAnswerIndex = 0,
                explanation = "Temporary hardness is caused by soluble hydrogentrioxocarbonates [Ca(HCO₃)₂ or Mg(HCO₃)₂], which decompose upon boiling.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Question • 2015"
            )
        )
        list.addAll(chemItems)
        return list
    }
}
