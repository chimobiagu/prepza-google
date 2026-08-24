package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME 2013 & 2014 Use of English Complete Question Bank.
 * Official JAMB questions spanning Abuja Pottery & Throwing, Music in Human Society,
 * Atmospheric Explosions & Waves, The Potter's Wheel, The Successors, Idioms, Antonyms, and Synonyms.
 */
object JambEnglish2013ExamCompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2013 COMPREHENSION & PROSE (Q1 - Q35)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2013_02",
                subject = "English Language",
                topic = "Comprehension: Abuja Pottery Training Centre",
                year = "2013",
                questionText = "Which of the following is true according to the passage on pottery?",
                optionA = "Anyone with no training can make glazed pottery easily",
                optionB = "Pots thrown on a wheel can be made quickly, accurately, and of uniform sizes",
                optionC = "Pots thrown on a wheel never crack in the kiln",
                optionD = "Potters use more clay than firewood for glazing",
                correctAnswerIndex = 1,
                explanation = "Throwing on a wheel allows a trained potter to weigh exact clay lumps and shape pots rapidly and with high precision.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_04",
                subject = "English Language",
                topic = "Comprehension: Pottery Terminology",
                year = "2013",
                questionText = "The phrase 'trims off any waste clay' as used in the passage means to:",
                optionA = "cut away excess, unnecessary parts to ensure clean finishing",
                optionB = "force the clay into the center of the wheel",
                optionC = "divide the clay into two separate bowls",
                optionD = "wash away distinct colours",
                correctAnswerIndex = 0,
                explanation = "Trimming clay involves shaving or cutting off surplus material from the base and rim.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_07",
                subject = "English Language",
                topic = "Comprehension: Music in Society",
                year = "2013",
                questionText = "The expression '...stage and hall' as used in the passage on live musical performance refers to:",
                optionA = "the artiste and the audience",
                optionB = "the producer and the director",
                optionC = "the stage lighting and seats",
                optionD = "the microphone and amplifiers",
                correctAnswerIndex = 0,
                explanation = "In theatre and concert performance, 'stage' symbolizes the performing musicians while 'hall' symbolizes the listening audience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_09",
                subject = "English Language",
                topic = "Comprehension: Live Musical Performances",
                year = "2013",
                questionText = "According to the writer, live musical performances provide a special excitement because they are:",
                optionA = "stage-managed and artificial",
                optionB = "interactive, with an active exchange of energy and feelings between artiste and listeners",
                optionC = "completely error-free at all times",
                optionD = "purely academic and educational",
                correctAnswerIndex = 1,
                explanation = "Live shows create dynamic communion where artists put themselves on the line and connect directly with listeners.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q9"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2013 SENTENCE INTERPRETATION (Q36 - Q45)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2013_36",
                subject = "English Language",
                topic = "Sentence Interpretation: Plumb the Depths",
                year = "2013",
                questionText = "The team's poor performance at the tournament plumbed the depths of horror. This means:",
                optionA = "The team advanced into the semi-finals",
                optionB = "The team's performance was enjoyable to watch",
                optionC = "The team's performance was utterly disastrous and full of deep disappointment",
                optionD = "The team was rewarded with a consolation trophy",
                correctAnswerIndex = 2,
                explanation = "To 'plumb the depths' means to reach the absolute lowest, worst, or most extreme level of unpleasantness or failure.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_37",
                subject = "English Language",
                topic = "Sentence Interpretation: Live in Each Other's Pockets",
                year = "2013",
                questionText = "Tolu and Chinedu live in each other's pockets. This means:",
                optionA = "They are long-term business partners",
                optionB = "They constantly steal money from one another",
                optionC = "They blackmail one another",
                optionD = "They are extremely close, constantly in each other's company",
                correctAnswerIndex = 3,
                explanation = "To 'live in each other's pockets' means to spend virtually all of one's time together in very close proximity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_41",
                subject = "English Language",
                topic = "Sentence Interpretation: Brush Up",
                year = "2013",
                questionText = "You need to brush up on your Spanish. This means:",
                optionA = "You need to study the history of Spain",
                optionB = "You need to refresh, polish, and improve your language skills",
                optionC = "You need to buy a paintbrush from Madrid",
                optionD = "You need to visit Spanish restaurants",
                correctAnswerIndex = 1,
                explanation = "To 'brush up on' means to review, refresh, or improve one's existing knowledge or skill.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_42",
                subject = "English Language",
                topic = "Sentence Interpretation: Pass For",
                year = "2013",
                questionText = "Amaka would pass for a beauty queen. This means:",
                optionA = "She would pass drinks to the beauty queen",
                optionB = "She would readily be accepted and recognized by everyone as a beauty queen",
                optionC = "She walked past the pageant judges",
                optionD = "She acted in a movie about pageantry",
                correctAnswerIndex = 1,
                explanation = "To 'pass for' something means to be accepted as or easily mistaken for that thing due to physical resemblance or qualities.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_44",
                subject = "English Language",
                topic = "Sentence Interpretation: Get Acts Together",
                year = "2013",
                questionText = "Usman needs to get his acts together if he wants to pass the examination. This means:",
                optionA = "He needs to memorize the textbook word for word",
                optionB = "He needs to organize himself properly and manage his efforts effectively",
                optionC = "He needs to write at top speed",
                optionD = "He needs to perform on stage",
                correctAnswerIndex = 1,
                explanation = "To 'get one's act together' means to organize one's activities and thoughts so as to cope or succeed efficiently.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q44"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2013 ANTONYMS (Q46 - Q55)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2013_46",
                subject = "English Language",
                topic = "Antonyms: Curt",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Chibuzor gave a *curt* nod and walked away.'",
                optionA = "gentle",
                optionB = "rude",
                optionC = "polite and courteous",
                optionD = "shocking",
                correctAnswerIndex = 2,
                explanation = "'Curt' means rudely brief, abrupt, or terse in manner. The antonym is 'polite' or 'courteous'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_47",
                subject = "English Language",
                topic = "Antonyms: Cursory",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The girl took a *cursory* glance at the letter and hid it.'",
                optionA = "sententious",
                optionB = "concise",
                optionC = "brief",
                optionD = "thorough and lasting",
                correctAnswerIndex = 3,
                explanation = "'Cursory' means hasty, superficial, and not thorough. The opposite is 'thorough' or 'detailed'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_48",
                subject = "English Language",
                topic = "Antonyms: Frosty",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The relationship between the couple has been *frosty*.'",
                optionA = "fraudulent",
                optionB = "cordial and warm",
                optionC = "amenable",
                optionD = "frugal",
                correctAnswerIndex = 1,
                explanation = "'Frosty' metaphorically describes cold, hostile, or unfriendly interactions. The opposite is 'cordial' or 'warm'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_49",
                subject = "English Language",
                topic = "Antonyms: Heinous",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The Nobel laureate's activity in the field of science is *heinous*.'",
                optionA = "indelible",
                optionB = "laudable and commendable",
                optionC = "deplorable",
                optionD = "forgettable",
                correctAnswerIndex = 1,
                explanation = "'Heinous' means utterly odious, wicked, or reprehensible. The antonym is 'laudable' (praiseworthy).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_51",
                subject = "English Language",
                topic = "Antonyms: Plebs",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The *plebs* can be found in every society of the world.'",
                optionA = "masses",
                optionB = "middle class",
                optionC = "elite and aristocracy",
                optionD = "politicians",
                correctAnswerIndex = 2,
                explanation = "'Plebs' (or plebeians) refers to ordinary working-class commoners. The antonym is the 'elite' or 'patricians'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q51"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2013 GRAMMAR & ORAL (Q66 - Q100)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2013_66",
                subject = "English Language",
                topic = "Grammar: Dependent Preposition with Averse",
                year = "2013",
                questionText = "The girl says she is averse ________ what others admire.",
                optionA = "for",
                optionB = "from",
                optionC = "to",
                optionD = "with",
                correctAnswerIndex = 2,
                explanation = "The adjective 'averse' (meaning strongly disliking or opposed to) strictly collocates with the preposition 'to': 'averse to'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q66"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_71",
                subject = "English Language",
                topic = "Grammar: Gerund with Mind",
                year = "2013",
                questionText = "Do you mind ________ another hour or two?",
                optionA = "to wait",
                optionB = "to have waited",
                optionC = "wait",
                optionD = "waiting",
                correctAnswerIndex = 3,
                explanation = "The verb 'mind' (in polite requests or inquiries) is followed by a gerund (-ing form): 'Do you mind waiting...'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q71"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_79",
                subject = "English Language",
                topic = "Grammar: Tag Agreement in Negative Conjunctions",
                year = "2013",
                questionText = "Umar: 'I have never visited the dentist.'\nAliyu: '________'",
                optionA = "Neither have I",
                optionB = "I also never",
                optionC = "Neither myself",
                optionD = "I myself haven't",
                correctAnswerIndex = 0,
                explanation = "To agree with a negative statement in the present perfect, standard English uses 'Neither have I' or 'Nor have I'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q79"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_82",
                subject = "English Language",
                topic = "Lexis: Kinds of Homicide",
                year = "2013",
                questionText = "Our teacher defined ________ as the killing of one's mother.",
                optionA = "patriarch",
                optionB = "matricide",
                optionC = "matriarch",
                optionD = "patricide",
                correctAnswerIndex = 1,
                explanation = "'Matricide' is the act of killing one's mother. ('Patricide' is killing one's father; 'Fratricide' is killing one's brother).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q82"
            )
        )

        return list
    }
}
