package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, verified, and structured JAMB Use of English Master Revision Volume 2.
 * Fully organized with 4 options (A-D), correct answer indexing (0-3), detailed explanations,
 * and standard JAMB UTME syllabus topic classifications.
 */
object JambEnglishMasterRevisionVolume2Bank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------
        // Comprehension & Critical Analysis Questions
        // -------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_mrv2_2010_04",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "According to the passage on Spaceship Earth, the designer of the machine:",
                optionA = "provided a beautifully illustrated guide",
                optionB = "left instructions in the stars",
                optionC = "did not include an instruction manual",
                optionD = "gave man complete control from the start",
                correctAnswerIndex = 2,
                explanation = "The passage emphasizes that 'no instruction book came with it,' making its operation a continuous stimulus and challenge to human intellect.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2010_05",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "The author implies that the 'Spaceship Earth' must be serviced:",
                optionA = "only when major failures occur",
                optionB = "in its entirety and with complete comprehension",
                optionC = "by moving to another planet",
                optionD = "by restricting all industrial manufacturing",
                correctAnswerIndex = 1,
                explanation = "The text explains that the earth must be comprehended and maintained in total rather than piecemeal to remain persistently habitable.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2012_01",
                subject = "English Language",
                topic = "Comprehension: Nigerian Worldview",
                year = "2012",
                questionText = "Based on Passage I, Nigerians can be described as highly religious because they believe:",
                optionA = "there is no boundary between natural and supernatural worlds",
                optionB = "an unseen supernatural world exists and influences the natural world",
                optionC = "prayers can solve all mechanical and physical problems",
                optionD = "priests should make all governmental decisions",
                correctAnswerIndex = 1,
                explanation = "The passage states that Nigerians believe in an unseen supernatural world inhabited by beings who watch, judge, and influence daily existence.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2012_02",
                subject = "English Language",
                topic = "Comprehension: Nigerian Worldview",
                year = "2012",
                questionText = "When the supernatural beings in the Nigerian worldview are offended, they must be:",
                optionA = "ignored completely",
                optionB = "appeased with prayers and sacrifices",
                optionC = "fought using modern technology",
                optionD = "compensated with money",
                correctAnswerIndex = 1,
                explanation = "The author notes that when spiritual entities are transgressed against, they must be appeased with prayer and sacrificial rituals.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2013_11",
                subject = "English Language",
                topic = "Comprehension: Scientific Phenomena",
                year = "2013",
                questionText = "According to the passage on the hydrogen bomb, the meteorologist views the explosion simply as:",
                optionA = "a political development",
                optionB = "an atmospheric disturbance",
                optionC = "a rare natural resource",
                optionD = "a standard volcanic eruption",
                correctAnswerIndex = 1,
                explanation = "The passage highlights that to a meteorologist, a hydrogen bomb detonation is fundamentally an artificial atmospheric disturbance.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2013_12",
                subject = "English Language",
                topic = "Comprehension: Scientific Phenomena",
                year = "2013",
                questionText = "The author compares the man-made atmospheric disturbance of the hydrogen bomb to natural occurrences like:",
                optionA = "earthquakes and landslides",
                optionB = "volcanic eruptions",
                optionC = "heavy rainstorms",
                optionD = "hurricanes",
                correctAnswerIndex = 1,
                explanation = "The text explicitly equates the magnitude of the atmospheric shockwave to natural energetic outbursts like volcanic eruptions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2014_04",
                subject = "English Language",
                topic = "Comprehension: Political Change",
                year = "2014",
                questionText = "Based on the passage discussing political structures, what is the most suitable title?",
                optionA = "Reasons for political change",
                optionB = "The struggle for political power",
                optionC = "Elements of politics",
                optionD = "Social change and political empowerment",
                correctAnswerIndex = 2,
                explanation = "The text outlines the fundamental components and characteristics that constitute political statecraft and systems.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2014_05",
                subject = "English Language",
                topic = "Vocabulary in Context: Alteration",
                year = "2014",
                questionText = "The word 'alteration' as used in the passage means:",
                optionA = "Multiplication",
                optionB = "Recognition",
                optionC = "Modification",
                optionD = "Complication",
                correctAnswerIndex = 2,
                explanation = "In the context of governance and constitutional reforms, 'alteration' is synonymous with 'modification' or change.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2014_06",
                subject = "English Language",
                topic = "Comprehension: Cold-blooded Animals",
                year = "2014",
                questionText = "Snakes are described as cold-blooded (ectodermic) because:",
                optionA = "they have no blood flowing in their veins",
                optionB = "they cannot produce their own body heat internally",
                optionC = "they live only in cold environments",
                optionD = "their body temperature remains permanently frozen",
                correctAnswerIndex = 1,
                explanation = "Ectodermic creatures lack internal physiological thermal regulation and rely on environmental sources like the sun to regulate body temperature.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2015_06",
                subject = "English Language",
                topic = "Comprehension: Population Growth",
                year = "2015",
                questionText = "The sentence 'There will be twice as many of us before most of us are dead' implies:",
                optionA = "some increase in human and animal population growth rates",
                optionB = "mankind is fast spreading across the earth",
                optionC = "many of us will die as a result of population explosion",
                optionD = "the population growth rate is so rapid that numbers will double within a single lifespan",
                correctAnswerIndex = 3,
                explanation = "The statement indicates that the doubling time of human population has accelerated dramatically within living memory.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2015_07",
                subject = "English Language",
                topic = "Comprehension: Wildlife Conservation",
                year = "2015",
                questionText = "According to the passage on wildlife conservation, the greatest threat to nature is that:",
                optionA = "man kills animals only when he can afford to do so",
                optionB = "man eats all categories of animals",
                optionC = "wild predators constantly threaten human civilization",
                optionD = "man's rapid expansion poses the greatest threat to nature",
                correctAnswerIndex = 3,
                explanation = "The passage demonstrates that habitat destruction driven by explosive human expansion represents the foremost ecological hazard.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2016_06",
                subject = "English Language",
                topic = "Comprehension: Near-Death Experiences",
                year = "2016",
                questionText = "During near-death experiences (NDEs), the dying individual usually feels like:",
                optionA = "his new body will not allow him to participate",
                optionB = "he is trapped in total darkness permanently",
                optionC = "he can only watch as an outside spectator while events unfold",
                optionD = "he is unable to understand human speech",
                correctAnswerIndex = 2,
                explanation = "Reports consistently show subjects experiencing detachment from their physical form, observing CPR/resuscitation attempts as external observers.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2016_07",
                subject = "English Language",
                topic = "Comprehension: Near-Death Studies",
                year = "2016",
                questionText = "According to the passage, scientific evidence has made it possible:",
                optionA = "to make arbitrary conjectures about what happens after death",
                optionB = "to know a little about what happens in the state of clinical death",
                optionC = "for one to experience death without physical resuscitation",
                optionD = "for the dead to return permanently to daily life",
                correctAnswerIndex = 1,
                explanation = "Systematic documentation of resuscitation cases provides structured empirical glimpses into terminal consciousness states.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2018_01",
                subject = "English Language",
                topic = "Comprehension: Logic and Definitions",
                year = "2018",
                questionText = "According to R.H. Thouless, a major cause of failure in defining words is:",
                optionA = "using vocabulary that is excessively long",
                optionB = "including attributes that do not belong to all members of the class, or including items to be excluded",
                optionC = "neglecting to use Latin etymology",
                optionD = "writing definitions that are purely figurative",
                correctAnswerIndex = 1,
                explanation = "Flawed definitions either fail to cover every member of the target group (too narrow) or encompass extraneous members (too broad).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_2018_02",
                subject = "English Language",
                topic = "Idioms & Modals: May well be",
                year = "2018",
                questionText = "The expression 'we may well be asked' in the passage is closest in meaning to:",
                optionA = "we cannot escape being asked",
                optionB = "it is quite likely that we will be asked",
                optionC = "we must refuse to be asked",
                optionD = "we are forbidden from being asked",
                correctAnswerIndex = 1,
                explanation = "The modal construction 'may well' expresses high likelihood or reasonable probability.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q2"
            )
        )

        // -------------------------------------------------------------
        // Idiomatic Expressions & Sentence Interpretation
        // -------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_01",
                subject = "English Language",
                topic = "Idioms: Have no axe to grind",
                year = "1999",
                questionText = "Select the option that best explains the underlined expression:\n'The mediator assured both parties that he had no axe to grind in the dispute.'",
                optionA = "He had no tools to resolve the quarrel",
                optionB = "He harboured deep personal hatred for the disputants",
                optionC = "He had no vested or selfish interest in the outcome",
                optionD = "He was unprepared to listen to the arguments",
                correctAnswerIndex = 2,
                explanation = "To 'have no axe to grind' means to possess no private, biased, or selfish motive in a situation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_02",
                subject = "English Language",
                topic = "Idioms: Tails between their legs",
                year = "2000",
                questionText = "Select the option that best explains the underlined expression:\n'After the resounding defeat, the visiting team left with their tails between their legs.'",
                optionA = "They departed joyfully because the match was over",
                optionB = "They were furious and physically attacked the officials",
                optionC = "They left feeling deeply humiliated, ashamed, and defeated",
                optionD = "They walked cautiously to avoid slippery grounds",
                correctAnswerIndex = 2,
                explanation = "To leave with one's 'tail between one's legs' means showing clear signs of embarrassment, cowardice, or defeat.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_03",
                subject = "English Language",
                topic = "Idioms: Talk one's way out of",
                year = "2001",
                questionText = "Select the option that best explains the underlined expression:\n'The suspect managed to talk his way out of the interrogation.'",
                optionA = "He delivered an official political address",
                optionB = "He shouted continuously until the police released him",
                optionC = "He used persuasive excuses and explanations to escape trouble",
                optionD = "He refused to utter a single word",
                correctAnswerIndex = 2,
                explanation = "To 'talk one's way out of' a predicament means to use clever speech or rhetoric to avoid penalty or blame.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_04",
                subject = "English Language",
                topic = "Idioms: Crossed the Rubicon",
                year = "2002",
                questionText = "Select the option that best explains the underlined expression:\n'By signing the final merger documents, the directors have crossed the Rubicon.'",
                optionA = "They are completely lost and directionless",
                optionB = "They have taken an irrevocable step and committed themselves permanently",
                optionC = "They have cancelled the business agreement",
                optionD = "They have traveled overseas for a holiday",
                correctAnswerIndex = 1,
                explanation = "'Crossing the Rubicon' refers to making an irreversible decision from which there is no turning back.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_05",
                subject = "English Language",
                topic = "Idioms: Full of oneself",
                year = "2003",
                questionText = "Select the option that best explains the underlined expression:\n'The newly appointed minister is rather full of himself.'",
                optionA = "He is conceited, arrogant, and excessively self-absorbed",
                optionB = "He is well-fed and healthy",
                optionC = "He works diligently for the masses",
                optionD = "He is cautious and careful in his policies",
                correctAnswerIndex = 0,
                explanation = "Being 'full of oneself' describes someone who is excessively proud, boastful, or conceited.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_06",
                subject = "English Language",
                topic = "Idioms: Dead drunk",
                year = "2005",
                questionText = "Select the option that best explains the underlined expression:\n'The revellers were found dead drunk on the lawn.'",
                optionA = "Mourning a deceased relative while drinking",
                optionB = "Pretending to sleep after a few drinks",
                optionC = "Extremely and helplessly intoxicated by alcohol",
                optionD = "Suffering from food poisoning",
                correctAnswerIndex = 2,
                explanation = "'Dead drunk' means completely incapacitated or immobilized due to heavy alcoholic consumption.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_07",
                subject = "English Language",
                topic = "Idioms: Chip off the old block",
                year = "2011",
                questionText = "Select the option that best explains the underlined expression:\n'In bravery and leadership, the young prince is a chip off the old block.'",
                optionA = "He has taken up a career different from his ancestors",
                optionB = "He closely resembles his father in character and demeanor",
                optionC = "He has been disowned by his family",
                optionD = "He opposes his father's policies",
                correctAnswerIndex = 1,
                explanation = "A 'chip off the old block' refers to a child whose character, qualities, or traits closely resemble one of their parents.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_08",
                subject = "English Language",
                topic = "Idioms: Play to the gallery",
                year = "2012",
                questionText = "Select the option that best explains the underlined expression:\n'The candidate prefers to play to the gallery rather than present concrete policies.'",
                optionA = "Participate in theatrical performances",
                optionB = "Act in a populist manner to win cheap acclaim from the audience",
                optionC = "Underrate the intelligence of his opponents",
                optionD = "Remain silent during parliamentary sessions",
                correctAnswerIndex = 1,
                explanation = "To 'play to the gallery' means to cater to popular prejudices or adopt showy behavior in order to gain cheap popularity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_09",
                subject = "English Language",
                topic = "Idioms: Living in a fool's paradise",
                year = "2013",
                questionText = "Select the option that best explains the underlined expression:\n'Those who think the economic crisis will vanish overnight are living in a fool's paradise.'",
                optionA = "Holding an illusion of contentment based on false assumptions",
                optionB = "Residing in an isolated luxury mansion",
                optionC = "Surrounded by unwise counselors",
                optionD = "Experiencing genuine peace and abundance",
                correctAnswerIndex = 0,
                explanation = "Living in a 'fool's paradise' means being in a state of happiness or security that is based on ignorance or delusion.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_10",
                subject = "English Language",
                topic = "Idioms: Keep at arm's length",
                year = "2014",
                questionText = "Select the option that best explains the underlined expression:\n'The manager always keeps suspicious contractors at arm's length.'",
                optionA = "Refuses to become overly familiar or intimate with them",
                optionB = "Measures their physical distance in meetings",
                optionC = "Threatens them with legal litigation",
                optionD = "Invites them to private social dinners",
                correctAnswerIndex = 0,
                explanation = "To keep someone 'at arm's length' means to avoid close friendship, familiarity, or alliance with them.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_11",
                subject = "English Language",
                topic = "Idioms: Make both ends meet",
                year = "2015",
                questionText = "Select the option that best explains the underlined expression:\n'With soaring inflation, civil servants struggle to make both ends meet.'",
                optionA = "Complete their daily office timetable",
                optionB = "Combine multiple commercial enterprises",
                optionC = "Live within their income and satisfy basic needs",
                optionD = "Connect broken electricity cables",
                correctAnswerIndex = 2,
                explanation = "To 'make both ends meet' means to earn just enough money to pay for one's necessary expenses and survive.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_12",
                subject = "English Language",
                topic = "Idioms: Bite off more than one can chew",
                year = "2016",
                questionText = "Select the option that best explains the underlined expression:\n'By taking on three complex research projects simultaneously, Musa bit off more than he could chew.'",
                optionA = "Ate food too hurriedly",
                optionB = "Accepted more commitments and responsibility than he could manage",
                optionC = "Spent beyond his personal budget",
                optionD = "Ignored academic directives",
                correctAnswerIndex = 1,
                explanation = "To 'bite off more than you can chew' means to undertake a task or obligation that is too large or difficult to handle.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_13",
                subject = "English Language",
                topic = "Idioms: Bring to book",
                year = "2017",
                questionText = "Select the option that best explains the underlined expression:\n'The auditor resolved that corrupt officials must be brought to book.'",
                optionA = "Made to read library textbooks",
                optionB = "Given an official written commendation",
                optionC = "Held accountable and punished for their misconduct",
                optionD = "Invited to draft legal documents",
                correctAnswerIndex = 2,
                explanation = "To 'bring someone to book' means to call them to account, investigate their conduct, or punish their wrongdoings.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_idiom_14",
                subject = "English Language",
                topic = "Idioms: White elephant",
                year = "1983",
                questionText = "Select the option that best explains the underlined expression:\n'The abandoned steel mill has become a white elephant project for the state.'",
                optionA = "A preserve for rare albino wildlife",
                optionB = "A very costly venture that yields little utility or economic return",
                optionC = "A prestigious and highly profitable investment",
                optionD = "An architectural masterpiece constructed in marble",
                correctAnswerIndex = 1,
                explanation = "A 'white elephant' is an expensive possession or undertaking that is unprofitable and troublesome to maintain.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Idiom Series"
            )
        )

        // -------------------------------------------------------------
        // Lexis & Structure: Synonyms & Antonyms
        // -------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_mrv2_vocab_01",
                subject = "English Language",
                topic = "Synonyms: Callous",
                year = "1989",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The warlord remained callous to the suffering of the villagers.'",
                optionA = "compassionate",
                optionB = "unfeeling and cruel",
                optionC = "fearful",
                optionD = "sympathetic",
                correctAnswerIndex = 1,
                explanation = "'Callous' means showing an insensitive, unfeeling, and cruel disregard for the pain of others.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Lexis"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_vocab_02",
                subject = "English Language",
                topic = "Synonyms: Temporal",
                year = "1990",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The preacher urged his congregation not to set their hearts purely on temporal wealth.'",
                optionA = "permanent",
                optionB = "spiritual",
                optionC = "worldly and secular",
                optionD = "celestial",
                correctAnswerIndex = 2,
                explanation = "'Temporal' relates to worldly or secular time and life on earth, as opposed to spiritual affairs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Lexis"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_vocab_03",
                subject = "English Language",
                topic = "Antonyms: Ingenuous",
                year = "2005",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Her ingenuous explanation won over the panel.'",
                optionA = "artful and devious",
                optionB = "simple",
                optionC = "naïve",
                optionD = "innocent",
                correctAnswerIndex = 0,
                explanation = "'Ingenuous' means candid, innocent, and unsuspecting. Its antonym is 'artful', 'crafty', or 'devious'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Antonyms"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_vocab_04",
                subject = "English Language",
                topic = "Antonyms: Flawless",
                year = "2006",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The pianist delivered a flawless rendition of the sonata.'",
                optionA = "perfect",
                optionB = "defective and imperfect",
                optionC = "spotless",
                optionD = "sublime",
                correctAnswerIndex = 1,
                explanation = "'Flawless' means without blemish or error. Its direct antonym is 'defective' or 'imperfect'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Antonyms"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_vocab_05",
                subject = "English Language",
                topic = "Antonyms: Gruff",
                year = "2007",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The security guard greeted the visitors in a gruff voice.'",
                optionA = "gentle and courteous",
                optionB = "harsh",
                optionC = "rough",
                optionD = "boisterous",
                correctAnswerIndex = 0,
                explanation = "'Gruff' describes a rough, abrupt, and harsh manner. Its antonym is 'gentle' or 'courteous'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Antonyms"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_vocab_06",
                subject = "English Language",
                topic = "Antonyms: Debased",
                year = "2008",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The standards of the institution were debased over the decades.'",
                optionA = "elevated and exalted",
                optionB = "perverted",
                optionC = "lowered",
                optionD = "corrupted",
                correctAnswerIndex = 0,
                explanation = "'Debased' means degraded in quality, value, or status. The direct antonym is 'elevated' or 'exalted'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Antonyms"
            )
        )

        // -------------------------------------------------------------
        // Phonology, Stress & Oral English
        // -------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_mrv2_oral_01",
                subject = "English Language",
                topic = "Oral English: Stress Pattern in Political",
                year = "1990",
                questionText = "Choose the option that shows the correct syllable stress in capital letters: 'political'",
                optionA = "poliTIcal",
                optionB = "poLItical",
                optionC = "POlitical",
                optionD = "politTIcal",
                correctAnswerIndex = 1,
                explanation = "In the four-syllable word 'political', stress falls on the second syllable: po-LI-ti-cal (/pəˈlɪtɪkəl/).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Oral Forms"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_oral_02",
                subject = "English Language",
                topic = "Oral English: Stress Pattern in Demarcation",
                year = "1992",
                questionText = "Choose the option that shows the correct syllable stress in capital letters: 'demarcation'",
                optionA = "demarCAtion",
                optionB = "DEmarcation",
                optionC = "deMARcation",
                optionD = "demarcaTION",
                correctAnswerIndex = 0,
                explanation = "Nouns ending in the suffix '-tion' are stressed on the penultimate (second to the last) syllable: de-mar-CA-tion (/ˌdiːmɑːˈkeɪʃən/).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Oral Forms"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_oral_03",
                subject = "English Language",
                topic = "Oral English: Consonants in Prestige",
                year = "2015",
                questionText = "Choose the option that has the same consonant sound as the underlined letter(s): 'pres_ti_ge'",
                optionA = "bag",
                optionB = "badge",
                optionC = "reggae",
                optionD = "leisure",
                correctAnswerIndex = 3,
                explanation = "The 'ge' in 'prestige' represents the voiced postalveolar fricative /ʒ/, identical to the 's' in 'leisure' (/ˈleʒər/).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Oral Forms"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_oral_04",
                subject = "English Language",
                topic = "Oral English: Rhymes in Cable",
                year = "1988",
                questionText = "Choose the option that rhymes with the given word: 'Cable'",
                optionA = "bible",
                optionB = "mabel",
                optionC = "able",
                optionD = "marble",
                correctAnswerIndex = 2,
                explanation = "'Cable' (/ˈkeɪbəl/) and 'able' (/ˈeɪbəl/) end with the identical phonetic sequence /-eɪbəl/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Oral Forms"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_oral_05",
                subject = "English Language",
                topic = "Oral English: Rhymes in Mail",
                year = "1989",
                questionText = "Choose the option that rhymes with the given word: 'Mail'",
                optionA = "bale",
                optionB = "slate",
                optionC = "girl",
                optionD = "hall",
                correctAnswerIndex = 0,
                explanation = "'Mail' (/meɪl/) and 'bale' (/beɪl/) share the identical rhyme ending /-eɪl/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Oral Forms"
            )
        )

        // -------------------------------------------------------------
        // Grammar, Concord & Prepositions
        // -------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_mrv2_gram_01",
                subject = "English Language",
                topic = "Concord: Proximity Rule with Neither/Nor",
                year = "1994",
                questionText = "Choose the grammatically correct verb:\n'Neither the driver nor the passengers _____ injured in the crash.'",
                optionA = "was",
                optionB = "were",
                optionC = "has been",
                optionD = "is",
                correctAnswerIndex = 1,
                explanation = "Under the rule of proximity in English syntax, when subjects are connected by 'neither... nor', the verb agrees in number with the nearer subject ('passengers' -> plural 'were').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Concord"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_gram_02",
                subject = "English Language",
                topic = "Verb Complementation: Comprise",
                year = "1995",
                questionText = "Choose the grammatically correct option:\n'The science faculty _____ twenty professors and fifteen laboratory technologists.'",
                optionA = "is comprised of",
                optionB = "comprises of",
                optionC = "are comprised with",
                optionD = "comprises",
                correctAnswerIndex = 3,
                explanation = "The verb 'comprise' means 'to consist of' and does NOT take the preposition 'of' in active voice sentences.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Syntax"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_gram_03",
                subject = "English Language",
                topic = "Prepositional Collocations: Accused of",
                year = "1996",
                questionText = "Choose the correct preposition:\n'The motorist was accused _____ dangerous driving on the highway.'",
                optionA = "for",
                optionB = "with",
                optionC = "of",
                optionD = "about",
                correctAnswerIndex = 2,
                explanation = "The verb 'accuse' is collocated with the preposition 'of' ('accuse someone of something').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Prepositions"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_gram_04",
                subject = "English Language",
                topic = "Conditionals: Third Conditional",
                year = "1998",
                questionText = "Choose the correct verbal structure:\n'If I had known of your arrival, I _____ you at the terminal.'",
                optionA = "will meet",
                optionB = "would have met",
                optionC = "met",
                optionD = "would meet",
                correctAnswerIndex = 1,
                explanation = "A third conditional structure (unreal past) requires 'had + past participle' in the if-clause and 'would have + past participle' in the main clause.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Conditionals"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_gram_05",
                subject = "English Language",
                topic = "Tenses: Present Perfect Continuous",
                year = "1999",
                questionText = "Choose the option that best completes the gap:\n'The contractors _____ on this highway since last November.'",
                optionA = "are working",
                optionB = "have been working",
                optionC = "worked",
                optionD = "have worked",
                correctAnswerIndex = 1,
                explanation = "Actions that started at a designated past time and continue up to the present take the present perfect continuous tense ('have been working').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Tenses"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_gram_06",
                subject = "English Language",
                topic = "Vocabulary: Valedictory",
                year = "2002",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The outgoing head girl presented the valedictory speech.'",
                optionA = "inaugural address",
                optionB = "farewell address",
                optionC = "lecture",
                optionD = "sermon",
                correctAnswerIndex = 1,
                explanation = "'Valedictory' pertains to saying farewell or bidding goodbye at a ceremony of departure or graduation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Lexis"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrv2_gram_07",
                subject = "English Language",
                topic = "Vocabulary: Virulent",
                year = "2003",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The epidemiology unit discovered a virulent strain of the influenza virus.'",
                optionA = "harmless",
                optionB = "extremely toxic, severe, or contagious",
                optionC = "dormant",
                optionD = "synthetic",
                correctAnswerIndex = 1,
                explanation = "'Virulent' describes a disease or poison that is extremely severe, virulent, infectious, or harmful in its action.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English • Lexis"
            )
        )

        return list
    }
}
