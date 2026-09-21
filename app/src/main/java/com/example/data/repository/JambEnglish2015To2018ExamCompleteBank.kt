package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME 2015, 2016, 2017 & 2018 Use of English Complete Question Bank.
 * Official JAMB questions spanning:
 * - 2015: Conflict Management, Speech Delivery, The Last Days at Forcados High School
 * - 2016: African Moralist vs Economist, Human Ecology & Wildlife Extinction, Speech Delivery
 * - 2017: Gender Differentiation, National Infrastructure Planning, S.I. Manyika's In Dependence
 * - 2018: Geography Master's Eurocentric Bias, Infectious Diseases & Immunology, Lexis & Oral forms.
 */
object JambEnglish2015To2018ExamCompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2015 QUESTIONS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2015_01",
                subject = "English Language",
                topic = "Comprehension: Conflict Resolution",
                year = "2015",
                questionText = "The expression 'third party', as used in the conflict management passage, refers to a:",
                optionA = "politician",
                optionB = "intruder",
                optionC = "conformist",
                optionD = "mediator or neutral arbiter",
                correctAnswerIndex = 3,
                explanation = "A third party in conflict management acts as an impartial mediator facilitating diplomatic negotiations between disputants.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_03",
                subject = "English Language",
                topic = "Comprehension: Conflict Escalation",
                year = "2015",
                questionText = "Which of the following statements can be inferred from the passage on conflict?",
                optionA = "The approach to employ in conflict management depends directly on the prevailing state of affairs and level of escalation",
                optionB = "Only military coercion can be applied in all conflicts",
                optionC = "All conflicts resolve spontaneously",
                optionD = "Verbal persuasion works in every wartime situation",
                correctAnswerIndex = 0,
                explanation = "Different conflict management approaches have utility depending on the unique circumstances and escalation level.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_21",
                subject = "English Language",
                topic = "Prose: The Last Days at Forcados High School",
                year = "2015",
                questionText = "The information that Efua's diary had been leaked to everyone in the school was first made known to her by:",
                optionA = "Caro",
                optionB = "Ansa",
                optionC = "Nene",
                optionD = "Joke",
                correctAnswerIndex = 2,
                explanation = "In 'The Last Days at Forcados High School', Nene approaches Efua to break the distressing news regarding the leaked diary.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_27",
                subject = "English Language",
                topic = "Prose: The Last Days at Forcados High School",
                year = "2015",
                questionText = "Teacher Bade earned the nickname 'Cane' because he was:",
                optionA = "the discipline master who was always ready to punish student offenders",
                optionB = "a mathematics teacher with a cane walking stick",
                optionC = "the principal's cousin",
                optionD = "a former military general",
                correctAnswerIndex = 0,
                explanation = "Teacher Bade was the strict discipline master notorious for flogging offenders with his ever-present cane.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_46",
                subject = "English Language",
                topic = "Antonyms: Frenzy",
                year = "2015",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Adewale's arrival always triggers a media *frenzy*.'",
                optionA = "violence",
                optionB = "agitation",
                optionC = "calm and serenity",
                optionD = "excitement",
                correctAnswerIndex = 2,
                explanation = "'Frenzy' denotes wild excitement, agitation, or turbulent hysteria. The antonym is 'calm'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_47",
                subject = "English Language",
                topic = "Antonyms: Harrowing",
                year = "2015",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'She said the experience was *harrowing*.'",
                optionA = "educating",
                optionB = "frightening",
                optionC = "pleasant and comforting",
                optionD = "strange",
                correctAnswerIndex = 2,
                explanation = "'Harrowing' means acutely distressing, agonizing, or painful. The opposite is 'pleasant'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_57",
                subject = "English Language",
                topic = "Synonyms: Caustic",
                year = "2015",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'She gave a *caustic* remark on the occasion.'",
                optionA = "tangible",
                optionB = "friendly",
                optionC = "insignificant",
                optionD = "sarcastic and biting",
                correctAnswerIndex = 3,
                explanation = "'Caustic' in rhetoric means bitterly sarcastic, biting, or acerbic.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q57"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_60",
                subject = "English Language",
                topic = "Synonyms: Doddle",
                year = "2015",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The first round of the tournament was a *doddle*.'",
                optionA = "easy and effortless task",
                optionB = "balanced",
                optionC = "dodgy",
                optionD = "exasperating",
                correctAnswerIndex = 0,
                explanation = "A 'doddle' is an informal British/Commonwealth idiom meaning a very easy task or walkover.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q60"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2016 QUESTIONS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2016_02",
                subject = "English Language",
                topic = "Comprehension: Moralist vs Economist",
                year = "2016",
                questionText = "It can be concluded from the passage that morality, religion and economics are:",
                optionA = "somewhat interconnected in their influence on societal consumption habits",
                optionB = "clearly identical disciplines",
                optionC = "certainly incompatible with human existence",
                optionD = "purely theoretical concepts",
                correctAnswerIndex = 0,
                explanation = "Religious and moral prohibitions directly impact brewery revenues, manufacturing supply, and consumer demand.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2016_05",
                subject = "English Language",
                topic = "Comprehension: Perspectives on Consumption",
                year = "2016",
                questionText = "The positions maintained by the moralist and the economist regarding alcohol and tobacco can be described as being:",
                optionA = "quite indifferent",
                optionB = "very agreeable",
                optionC = "very passionate",
                optionD = "at variance",
                correctAnswerIndex = 3,
                explanation = "The moralist condemns consumption as degradation while the economist values it for creating utility, supply, and demand.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2016_08",
                subject = "English Language",
                topic = "Comprehension: Wildlife Extinction",
                year = "2016",
                questionText = "The basic causes of the elimination and endangerment of wildlife species from the earth include:",
                optionA = "deliberate battle against nature and hunting for leopard skins",
                optionB = "building cities and expanding agriculture",
                optionC = "dietary preferences for meat",
                optionD = "extensive killing of animals and the fast disappearance of their natural habitats",
                correctAnswerIndex = 3,
                explanation = "The passage identifies both extensive commercial over-hunting and the rapid destruction of natural ecosystems by expanding human populations.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2016_09",
                subject = "English Language",
                topic = "Comprehension: Evolution of Human Conscience",
                year = "2016",
                questionText = "The expression 'when man evolved a conscience' means when:",
                optionA = "man's intellect improved technologically",
                optionB = "man became a critical philosopher",
                optionC = "man developed an internal awareness of moral right and wrong regarding nature",
                optionD = "man began building cities",
                correctAnswerIndex = 2,
                explanation = "Conscience refers to the moral faculty enabling humans to feel ethical responsibility and guilt.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2016_66",
                subject = "English Language",
                topic = "Grammar: Question Tags in Present Simple",
                year = "2016",
                questionText = "You live in the city now, ________?",
                optionA = "are you",
                optionB = "don't you",
                optionC = "didn't you",
                optionD = "haven't you",
                correctAnswerIndex = 1,
                explanation = "For a positive statement in the present simple ('live'), the tag is negative auxiliary 'don't you?'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q66"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2016_71",
                subject = "English Language",
                topic = "Lexis: Post-mortem Examination",
                year = "2016",
                questionText = "They all gathered to exhume the musician's corpse for a ________ examination.",
                optionA = "posthumous",
                optionB = "post-mortem",
                optionC = "post-natal",
                optionD = "orthopaedic",
                correctAnswerIndex = 1,
                explanation = "A 'post-mortem' (or autopsy) is an examination of a dead body to determine the cause of death.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q71"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2017 QUESTIONS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2017_01",
                subject = "English Language",
                topic = "Comprehension: Gender Differentiation",
                year = "2017",
                questionText = "According to the passage on gender roles, advantages traditionally enjoyed by men began to:",
                optionA = "weaken through gender sensitivity",
                optionB = "diminish through women emancipation and female participation in all spheres",
                optionC = "dwindle with the advancement of civilization",
                optionD = "fade with wide self-realization",
                correctAnswerIndex = 2,
                explanation = "With the advancement of civilization, the traditional male monopoly of professional and public roles eroded.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2017_02",
                subject = "English Language",
                topic = "Comprehension: Dual Roles of Working Mothers",
                year = "2017",
                questionText = "According to the passage, what 'two masters' are working women struggling to serve?",
                optionA = "The health and education of their children",
                optionB = "The husband and the children",
                optionC = "The office and the husband",
                optionD = "The workplace (office) and the home (family obligations)",
                correctAnswerIndex = 3,
                explanation = "The passage observes that mothers balancing paid formal career employment with childcare face competing demands between office and home.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2017_16",
                subject = "English Language",
                topic = "Prose: In Dependence by Sarah Ladipo Manyika",
                year = "2017",
                questionText = "In the novel 'In Dependence', the college food at Oxford was described as dreadful by:",
                optionA = "Jane",
                optionB = "Charlie",
                optionC = "Muhul",
                optionD = "Vanessa",
                correctAnswerIndex = 3,
                explanation = "Vanessa expresses dissatisfaction with the bland and dreadful English college cafeteria catering.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2017_29",
                subject = "English Language",
                topic = "Sentence Interpretation: No Sooner... Than",
                year = "2017",
                questionText = "No sooner had he got into the pool than the telephone rang. This means:",
                optionA = "He did not enter the pool because the phone rang",
                optionB = "The telephone rang immediately and just after he entered the pool",
                optionC = "The phone rang hours before he arrived",
                optionD = "He answered the telephone inside the water",
                correctAnswerIndex = 1,
                explanation = "'No sooner... than' expresses an action that happens immediately after another preceding action has taken place.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2017_32",
                subject = "English Language",
                topic = "Antonyms: Averred",
                year = "2017",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The minister *averred* his commitment.'",
                optionA = "denied and renounced",
                optionB = "pledged",
                optionC = "undertook",
                optionD = "accented",
                correctAnswerIndex = 0,
                explanation = "'Aver' means to declare or affirm positively. The exact opposite is 'denied'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q32"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2018 QUESTIONS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2018_01",
                subject = "English Language",
                topic = "Comprehension: The Eurocentric Geography Master",
                year = "2018",
                questionText = "What biased point of view was the Geography master fond of advancing in the passage?",
                optionA = "Africans are superior to Europeans",
                optionB = "Europeans are free from diseases",
                optionC = "Africans are suffering from a divine curse inflicted for sins committed centuries ago",
                optionD = "God created mosquitoes solely for Africans",
                correctAnswerIndex = 2,
                explanation = "The Geography master clung dogmatically to the self-hating colonial trope that Africans were cursed by God.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2018_03",
                subject = "English Language",
                topic = "Literary Device: Figures of Speech in Comprehension",
                year = "2018",
                questionText = "In the sentence '...who had decided to rock the boat', what figure of speech is 'rock the boat'?",
                optionA = "Simile",
                optionB = "Metaphor / Idiom",
                optionC = "Personification",
                optionD = "Hyperbole",
                correctAnswerIndex = 1,
                explanation = "'Rock the boat' is an idiomatic metaphor meaning to disrupt a stable situation or challenge established conventions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2018_23",
                subject = "English Language",
                topic = "Sentence Interpretation: Beat About the Bush",
                year = "2018",
                questionText = "When asked to state her side of the story, Bunmi started by beating about the bush. This means that Bunmi:",
                optionA = "went straight to the point",
                optionB = "cleared the thick bush behind the house",
                optionC = "walked along a narrow path",
                optionD = "approached the subject evasively without coming to the main point",
                correctAnswerIndex = 3,
                explanation = "To 'beat about the bush' means to discuss a matter without coming directly to the point, often to delay or evade it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2018_24",
                subject = "English Language",
                topic = "Sentence Interpretation: Widow's Mite",
                year = "2018",
                questionText = "The amount he donated was small. He said it was his widow's mite. This means that:",
                optionA = "he inherited the money from a widow",
                optionB = "he was in extreme misery",
                optionC = "it was a modest sum representing all he could honestly afford to give",
                optionD = "he refused to donate properly",
                correctAnswerIndex = 2,
                explanation = "A 'widow's mite' is a small financial contribution that represents a major sacrifice because it is all one can afford.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2018_28",
                subject = "English Language",
                topic = "Sentence Interpretation: Greenhorn",
                year = "2018",
                questionText = "From the way Ngozi behaves, it is obvious she is a greenhorn. This means that Ngozi is:",
                optionA = "arrogant and boastful",
                optionB = "cautious",
                optionC = "inexperienced, naive, and a novice",
                optionD = "uncivilised",
                correctAnswerIndex = 2,
                explanation = "A 'greenhorn' is an inexperienced person, beginner, or novice who is new to a field or enterprise.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2018_31",
                subject = "English Language",
                topic = "Sentence Interpretation: Chip off the Old Block",
                year = "2018",
                questionText = "I knew Okoronkwo's father very well and I must say that his son is a chip off the old block. This means that Okoronkwo:",
                optionA = "chose the exact same carpentry career as his father",
                optionB = "resembles and behaves very much like his father in character and mannerisms",
                optionC = "is completely different from his father",
                optionD = "has quarrelled with his father",
                correctAnswerIndex = 1,
                explanation = "A 'chip off the old block' refers to someone who is very similar in character, appearance, or behavior to one of their parents.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2018_32",
                subject = "English Language",
                topic = "Sentence Interpretation: Play to the Gallery",
                year = "2018",
                questionText = "The debating team was warned to make convincing points and not to play to the gallery. This means the team should not:",
                optionA = "act in an art gallery",
                optionB = "underrate their opponents",
                optionC = "be timid on stage",
                optionD = "attempt to win cheap applause and popularity through theatrical antics rather than substance",
                correctAnswerIndex = 3,
                explanation = "To 'play to the gallery' means to cater to the low tastes of the audience to win cheap, superficial approval.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2018_56",
                subject = "English Language",
                topic = "Oral: Vowel Sounds /i:/ in Key",
                year = "2018",
                questionText = "Choose the word that has the same vowel sound as 'k<u>ey</u>':",
                optionA = "sit",
                optionB = "bet",
                optionC = "seat",
                optionD = "tread",
                correctAnswerIndex = 2,
                explanation = "'Key' /ki:/ has the long vowel sound /i:/, exactly identical to 'seat' /si:t/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q56"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2018_58",
                subject = "English Language",
                topic = "Oral: Syllable Stress in Comfortable",
                year = "2018",
                questionText = "Choose the appropriate stress pattern for 'comfortable':",
                optionA = "COMfortable",
                optionB = "comFORtable",
                optionC = "comfortaBLE",
                optionD = "comforTABLE",
                correctAnswerIndex = 0,
                explanation = "'Comfortable' is stressed on the first syllable: COM-for-ta-ble /ˈkʌmftəbl/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q58"
            )
        )

        return list
    }
}
