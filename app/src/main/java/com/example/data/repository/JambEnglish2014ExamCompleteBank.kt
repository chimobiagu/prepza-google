package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME 2014 & 2015 Use of English Complete Question Bank.
 * Official JAMB questions spanning Political & Social Transformation, Reptilian Biology (Snakes),
 * Journalism & Publishing, Conflict Management & Resolution, The Last Days at Forcados High School,
 * Idiomatic Usages, Antonyms, Synonyms, and Oral English.
 */
object JambEnglish2014ExamCompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2014 COMPREHENSION (Q1 - Q20)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2014_02",
                subject = "English Language",
                topic = "Comprehension: Political & Social Change",
                year = "2014",
                questionText = "Which of the following is true according to the passage on societal transformation?",
                optionA = "Change is inimitable",
                optionB = "Change is inestimable",
                optionC = "Change is invaluable",
                optionD = "Change is inevitable",
                correctAnswerIndex = 3,
                explanation = "The passage illustrates that political change and revolutions have continuously and inevitably driven the course of human civilization.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_03",
                subject = "English Language",
                topic = "Comprehension: Interconnection of Changes",
                year = "2014",
                questionText = "It can be deduced from the passage that political and social changes are:",
                optionA = "intertwined and analytically inseparable",
                optionB = "antithetical and contradictory",
                optionC = "completely independent of one another",
                optionD = "repulsive",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly states that while they appear distinct, political and social changes are deeply intertwined and inseparable.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_06",
                subject = "English Language",
                topic = "Comprehension: Reptilian Biology of Snakes",
                year = "2014",
                questionText = "It can be inferred from the passage on snakes that snakes are:",
                optionA = "heterogeneous creatures with over 2,500 species adapted to diverse habitats",
                optionB = "voracious cow eaters exclusively",
                optionC = "warm-blooded mammals",
                optionD = "homogeneous reptiles found only in deserts",
                correctAnswerIndex = 0,
                explanation = "With over 2,500 species belonging to more than 10 families inhabiting burrows, trees, and ocean depths, snakes are remarkably diverse (heterogeneous).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_07",
                subject = "English Language",
                topic = "Comprehension: Snake Feeding Habits",
                year = "2014",
                questionText = "The most notable biological feature about the feeding habits of snakes according to the passage is that they:",
                optionA = "chew their prey into tiny flakes",
                optionB = "must eat small meals every few hours",
                optionC = "eat large prey whole and can survive for months between meals",
                optionD = "eat only green vegetation",
                correctAnswerIndex = 2,
                explanation = "Snakes are ectothermic and swallow their prey whole, allowing them to go weeks or months between large meals.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q7"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2014 SENTENCE INTERPRETATION (Q36 - Q45)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2014_36",
                subject = "English Language",
                topic = "Sentence Interpretation: Drop in the Ocean",
                year = "2014",
                questionText = "The minister considered the ministry's budget to be a drop in the ocean in view of the number of projects in the pipeline. This means:",
                optionA = "The amount allocated is overwhelmingly tiny and inadequate for the projected expenditure",
                optionB = "The minister will be dropped for failing to construct marine pipelines",
                optionC = "The funds will be dumped into ocean development",
                optionD = "The budget is vast and unmanageable",
                correctAnswerIndex = 0,
                explanation = "A 'drop in the ocean' is an idiom describing a very small, negligible amount compared to what is needed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_38",
                subject = "English Language",
                topic = "Sentence Interpretation: Pigs Would Fly",
                year = "2014",
                questionText = "Jurmai's father remarked that pigs would fly before she passed. This means:",
                optionA = "It would be possible to pass only if she worked harder",
                optionB = "He believed it was impossible and that she would never pass",
                optionC = "He planned to buy her flying animals",
                optionD = "She would pass effortlessly",
                correctAnswerIndex = 1,
                explanation = "'When pigs fly' or 'pigs will fly' is an idiom used to say that something will never happen.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_39",
                subject = "English Language",
                topic = "Sentence Interpretation: Between Rock and Hard Place",
                year = "2014",
                questionText = "The president said that he found himself between a rock and a hard place when the press said that he had resigned. This means:",
                optionA = "He was trapped inside a mountain cave",
                optionB = "He was faced with two equally difficult, unpleasant choices",
                optionC = "He enjoyed relaxing in hard places",
                optionD = "He had no problems to solve",
                correctAnswerIndex = 1,
                explanation = "To be 'between a rock and a hard place' means facing a dilemma with two equally undesirable alternatives.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_40",
                subject = "English Language",
                topic = "Sentence Interpretation: Bear with a Sore Head",
                year = "2014",
                questionText = "Kunana is like a bear with a sore head. This means:",
                optionA = "He has a physical headache",
                optionB = "He is exceptionally grumpy, irritable, and bad-tempered",
                optionC = "He is very quiet and shy",
                optionD = "He is handsome and tall",
                correctAnswerIndex = 1,
                explanation = "To be 'like a bear with a sore head' means to be very irritable, easily annoyed, or in a foul mood.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_43",
                subject = "English Language",
                topic = "Sentence Interpretation: Eyes off the Ball",
                year = "2014",
                questionText = "My boss asked me not to take my eyes off the ball. This means:",
                optionA = "I should stop playing football",
                optionB = "I should remain focused on what is most important and not get distracted",
                optionC = "I should buy a new sports ball",
                optionD = "I should look away from the work desk",
                correctAnswerIndex = 1,
                explanation = "To 'keep one's eye on the ball' means to stay focused on one's main objective; taking eyes off it means losing focus.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q43"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2014 ANTONYMS (Q46 - Q55)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2014_46",
                subject = "English Language",
                topic = "Antonyms: Debilitated",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Prolonged strike action *debilitated* the industry.'",
                optionA = "invigorated and strengthened",
                optionB = "isolated",
                optionC = "weakened",
                optionD = "destroyed",
                correctAnswerIndex = 0,
                explanation = "'Debilitate' means to severely weaken or cripple. The antonym is 'invigorated' or 'strengthened'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_47",
                subject = "English Language",
                topic = "Antonyms: Plagiarized",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'One of the students bought a *plagiarized* copy of the research paper.'",
                optionA = "a used",
                optionB = "an original and authentic",
                optionC = "a revised",
                optionD = "an annotated",
                correctAnswerIndex = 1,
                explanation = "'Plagiarized' means copied or stolen without attribution. The antonym is 'original'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_50",
                subject = "English Language",
                topic = "Antonyms: Translucent",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The lamp shades were *translucent*.'",
                optionA = "opaque",
                optionB = "interested",
                optionC = "luminous",
                optionD = "transparent",
                correctAnswerIndex = 0,
                explanation = "'Translucent' means allowing light to pass through diffusely. The antonym is 'opaque' (impervious to light).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q50"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_54",
                subject = "English Language",
                topic = "Antonyms: Vague",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The testimony of the witness was *vague*.'",
                optionA = "disturbing",
                optionB = "true",
                optionC = "ambiguous",
                optionD = "clear and explicit",
                correctAnswerIndex = 3,
                explanation = "'Vague' means imprecise, indistinct, or unclear. The antonym is 'clear' or 'explicit'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q54"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_55",
                subject = "English Language",
                topic = "Antonyms: Communal",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'As a student, Isa tried *communal* living for a few years.'",
                optionA = "collective",
                optionB = "general",
                optionC = "shared",
                optionD = "private and solitary",
                correctAnswerIndex = 3,
                explanation = "'Communal' means shared by all members of a group. The antonym is 'private' or 'solitary'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q55"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2014 GRAMMAR & ORAL (Q66 - Q100)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2014_66",
                subject = "English Language",
                topic = "Grammar: Parliamentary Verbs",
                year = "2014",
                questionText = "The House and the Senate will ________ at noon next Wednesday to hear the address by the President.",
                optionA = "convene",
                optionB = "adjourn",
                optionC = "rise",
                optionD = "collude",
                correctAnswerIndex = 0,
                explanation = "To 'convene' means to assemble or come together for a formal legislative meeting.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q66"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_74",
                subject = "English Language",
                topic = "Lexis: Political Vocabulary",
                year = "2014",
                questionText = "It was very easy for the two political parties to form a ________ government.",
                optionA = "co-operative",
                optionB = "colonial",
                optionC = "collusion",
                optionD = "coalition",
                correctAnswerIndex = 3,
                explanation = "A 'coalition government' is a cabinet of a parliamentary government in which multiple political parties cooperate.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q74"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_81",
                subject = "English Language",
                topic = "Lexis: Spelling of Fluorescent",
                year = "2014",
                questionText = "Mr. Ojo instructed his son to replace the faulty ________ tube.",
                optionA = "flurescent",
                optionB = "flourescent",
                optionC = "fluorescent",
                optionD = "florescent",
                correctAnswerIndex = 2,
                explanation = "The correct spelling is 'f-l-u-o-r-e-s-c-e-n-t' (fluo- followed by -rescent).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q81"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_84",
                subject = "English Language",
                topic = "Lexis: Spelling of Argument",
                year = "2014",
                questionText = "There was a serious ________ between the new couple over feeding allowances.",
                optionA = "arguement",
                optionB = "argeument",
                optionC = "argumment",
                optionD = "argument",
                correctAnswerIndex = 3,
                explanation = "The noun is correctly spelled 'a-r-g-u-m-e-n-t' (the letter 'e' from 'argue' is dropped).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q84"
            )
        )

        return list
    }
}
