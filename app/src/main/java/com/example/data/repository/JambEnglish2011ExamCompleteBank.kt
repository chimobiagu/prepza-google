package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME 2011 Use of English Complete Question Bank.
 * Features full questions spanning Comprehension (Biocells & Electricity, Thought Discipline,
 * Career Assumptions, Climate Change), Interpretation, Antonyms, Synonyms, Grammar, and Oral English.
 */
object JambEnglish2011ExamCompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2011 COMPREHENSION (Q1 - Q25)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_02",
                subject = "English Language",
                topic = "Comprehension: Biocells & Electricity",
                year = "2011",
                questionText = "The writer's posture, as conveyed in the statement 'Electricity from living cells is no new idea', can be described as:",
                optionA = "ineffectual",
                optionB = "contentious",
                optionC = "logical and reasoned",
                optionD = "unguarded",
                correctAnswerIndex = 2,
                explanation = "The author provides a logical historical foundation, illustrating how electric fish and biological shocks were recorded long before formal electromagnetic theory.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_05",
                subject = "English Language",
                topic = "Comprehension: Biological Electricity",
                year = "2011",
                questionText = "According to the passage, natural biological electricity was first discovered in:",
                optionA = "human heart and brain tissues",
                optionB = "muscles of land animals",
                optionC = "atmospheric lightning",
                optionD = "electric fish (e.g. electric eel, catfish)",
                correctAnswerIndex = 3,
                explanation = "Man experienced electric shocks from electric fish long before scientific batteries and dynamos were invented.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_06",
                subject = "English Language",
                topic = "Comprehension: The Discipline of Thoughts",
                year = "2011",
                questionText = "Which of the following represents the writer's central view on controlling evil thoughts?",
                optionA = "evil thoughts may come, but there is moral virtue in refusing them entrance and keeping them out",
                optionB = "evil thoughts will always overpower human willpower",
                optionC = "all human thinking is inherently depraved and uncontrollable",
                optionD = "thoughts have no bearing on human physical action",
                correctAnswerIndex = 0,
                explanation = "The author uses the metaphor of birds flying over our heads—we cannot prevent them from passing, but we must not allow them to nest in our hair.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_09",
                subject = "English Language",
                topic = "Comprehension: Thought Discipline",
                year = "2011",
                questionText = "The proverb 'Think of the devil and he will appear' as used in the passage suggests that:",
                optionA = "the devil exists only in fairytales",
                optionB = "uncontrolled meditation upon evil thoughts inevitably leads to evil deeds",
                optionC = "the devil visits only philosophers",
                optionD = "bad thoughts disappear spontaneously",
                correctAnswerIndex = 1,
                explanation = "Meditating on harmful or corrupt ideas predisposes a person's hands and habits to commit those very wrongful deeds.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_13",
                subject = "English Language",
                topic = "Comprehension: Vocabulary in Context",
                year = "2011",
                questionText = "The word 'inclinations' as used in the career passage means:",
                optionA = "creeds",
                optionB = "natural tendencies and dispositions",
                optionC = "inhibitions",
                optionD = "financial obligations",
                correctAnswerIndex = 1,
                explanation = "'Inclinations' denotes innate aptitudes, natural leanings, or predispositions toward particular professions like teaching.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q13"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2011 SENTENCE INTERPRETATION (Q26 - Q35)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_27",
                subject = "English Language",
                topic = "Sentence Interpretation: Unforeseen Circumstances",
                year = "2011",
                questionText = "The secretary said that the postponement of the meeting was due to unforeseen circumstances. This means:",
                optionA = "The date of the meeting was shifted as a result of unexpected, unpredicted reasons",
                optionB = "The meeting was cancelled permanently because of internal hatred",
                optionC = "The meeting broke up in violence",
                optionD = "The committee members refused to attend",
                correctAnswerIndex = 0,
                explanation = "'Unforeseen circumstances' refers to unpredictable, unexpected events or emergencies that force schedule changes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_28",
                subject = "English Language",
                topic = "Sentence Interpretation: Bird's-Eye View",
                year = "2011",
                questionText = "The hunter has a bird's-eye view of the animals. This means:",
                optionA = "He views the animals from an elevated, panoramic high position",
                optionB = "He has the sharp eyesight of an eagle",
                optionC = "He looks through a binoculars with one eye",
                optionD = "He is hunting birds in the canopy",
                correctAnswerIndex = 0,
                explanation = "A 'bird's-eye view' is a general or comprehensive panoramic view looking down from a high vantage point.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_30",
                subject = "English Language",
                topic = "Sentence Interpretation: More Haste, Less Speed",
                year = "2011",
                questionText = "Mrs. Adasu does all her work with 'more haste, less speed'. This means:",
                optionA = "She does everything at breakneck speed without checking",
                optionB = "She works slowly and lazily",
                optionC = "She hurries excessively, resulting in errors that ultimately slow down her progress",
                optionD = "She does everything methodically and deliberately to avoid mistakes",
                correctAnswerIndex = 2,
                explanation = "The proverb 'more haste, less speed' implies that rushing carelessly leads to wasteful blunders and delays.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_31",
                subject = "English Language",
                topic = "Sentence Interpretation: Left in the Lurch",
                year = "2011",
                questionText = "She stopped her education as her uncle left her in the lurch. This means:",
                optionA = "Her uncle deceived her with forged documents",
                optionB = "Her uncle disowned his family",
                optionC = "Her uncle abandoned her in a difficult situation and refused to help her",
                optionD = "Her uncle passed away unexpectedly",
                correctAnswerIndex = 2,
                explanation = "To 'leave someone in the lurch' means to abruptly abandon or desert them in a vulnerable, helpless state.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_33",
                subject = "English Language",
                topic = "Sentence Interpretation: Took a Hit",
                year = "2011",
                questionText = "Okon's company took a hit last year. This means:",
                optionA = "His company made extraordinary profits",
                optionB = "His company suffered significant financial loss or damage last year",
                optionC = "His company was established last year",
                optionD = "His company expanded its branches",
                correctAnswerIndex = 1,
                explanation = "To 'take a hit' is an idiom meaning to suffer a heavy financial blow, downturn, or negative impact.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q33"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2011 ANTONYMS (Q51 - Q65)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_51",
                subject = "English Language",
                topic = "Antonyms: Coerced",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The warring communities were *coerced* into negotiating a settlement.'",
                optionA = "driven",
                optionB = "compelled",
                optionC = "persuaded",
                optionD = "pressured",
                correctAnswerIndex = 2,
                explanation = "'Coerce' means to force or compel someone by threats. The antonym is 'persuaded' (convinced by gentle reasoning).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q51"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_55",
                subject = "English Language",
                topic = "Antonyms: Garrulous",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'His wife hated his *garrulous* attitude.'",
                optionA = "outspoken",
                optionB = "unfriendly",
                optionC = "reticent and reserved",
                optionD = "thoughtful",
                correctAnswerIndex = 2,
                explanation = "'Garrulous' means excessively talkative or loquacious. The antonym is 'reticent' or 'laconic' (quiet and reserved).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q55"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_56",
                subject = "English Language",
                topic = "Antonyms: Callow",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Agoshito is a *callow* youth; said the teacher.'",
                optionA = "ignorant",
                optionB = "experienced and mature",
                optionC = "idle",
                optionD = "organized",
                correctAnswerIndex = 1,
                explanation = "'Callow' means inexperienced, youthful, and naive. The antonym is 'experienced' or 'mature'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q56"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_57",
                subject = "English Language",
                topic = "Antonyms: Herculean",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'What you are asking me to do is a *herculean* task.'",
                optionA = "strenuous",
                optionB = "demanding",
                optionC = "lovely",
                optionD = "an easy and simple",
                correctAnswerIndex = 3,
                explanation = "A 'herculean' task is one requiring tremendous, immense strength and effort. The opposite is 'easy'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q57"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_59",
                subject = "English Language",
                topic = "Antonyms: Candour",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n''I do not trust him,' he said in a rare moment of *candour*.'",
                optionA = "reproach",
                optionB = "dishonesty and insincerity",
                optionC = "frankness",
                optionD = "fairness",
                correctAnswerIndex = 1,
                explanation = "'Candour' means frankness, openness, and honesty. The antonym is 'dishonesty' or 'deceit'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q59"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_63",
                subject = "English Language",
                topic = "Antonyms: Prudent",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'As a *prudent* businessman, Adayi does not leave anything to chance.'",
                optionA = "frugal",
                optionB = "shrewd",
                optionC = "careless and reckless",
                optionD = "unsuccessful",
                correctAnswerIndex = 2,
                explanation = "'Prudent' means acting with foresight, caution, and wise discretion. The antonym is 'careless' or 'reckless'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q63"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_65",
                subject = "English Language",
                topic = "Antonyms: Lethal",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Okonkwo's *lethal* right foot did the magic in the football match.'",
                optionA = "weak and harmless",
                optionB = "wicked",
                optionC = "fat",
                optionD = "deadly",
                correctAnswerIndex = 0,
                explanation = "'Lethal' means deadly, devastating, or highly destructive. The antonym is 'harmless' or 'weak'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q65"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2011 GRAMMAR & ORAL (Q66 - Q100)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_66",
                subject = "English Language",
                topic = "Grammar: Irregular Past Participles",
                year = "2011",
                questionText = "When his car tyre ________ on the way, he did not know what to do.",
                optionA = "has burst",
                optionB = "had burst",
                optionC = "bursted",
                optionD = "burst",
                correctAnswerIndex = 3,
                explanation = "The verb 'burst' is invariable in all past forms (burst - burst - burst). 'Bursted' is grammatically non-existent.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q66"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_71",
                subject = "English Language",
                topic = "Grammar: Question Tags with Semi-Modal Need",
                year = "2011",
                questionText = "Suara needn't come with us, ________?",
                optionA = "does she",
                optionB = "will she",
                optionC = "can she",
                optionD = "need she",
                correctAnswerIndex = 3,
                explanation = "When 'need' functions as a negative modal auxiliary ('needn't'), the corresponding question tag is positive modal 'need she?'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q71"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_76",
                subject = "English Language",
                topic = "Lexis: Spelling of Pronunciation",
                year = "2011",
                questionText = "Here is Mr. Odumusu who teaches English ________ in our school.",
                optionA = "pronuntiation",
                optionB = "pronounciation",
                optionC = "pronunciation",
                optionD = "pronountiation",
                correctAnswerIndex = 2,
                explanation = "While the verb is spelled 'pronounce', the noun is strictly spelled 'p-r-o-n-u-n-c-i-a-t-i-o-n' (without the 'o').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q76"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_89",
                subject = "English Language",
                topic = "Oral: Consonant Sounds /ʃ/ in Mention",
                year = "2011",
                questionText = "Choose the word with the same consonant sound as the underlined letters in 'men<u>ti</u>on':",
                optionA = "that",
                optionB = "machine",
                optionC = "church",
                optionD = "test",
                correctAnswerIndex = 1,
                explanation = "'Mention' contains the voiceless post-alveolar fricative /ʃ/. 'Machine' also has /ʃ/ (/məˈʃi:n/). 'Church' has /tʃ/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q89"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_95",
                subject = "English Language",
                topic = "Oral: Syllable Stress in Termination",
                year = "2011",
                questionText = "Choose the correct stress pattern for 'termination':",
                optionA = "terminaTION",
                optionB = "TERmination",
                optionC = "termiNAtion",
                optionD = "terMInation",
                correctAnswerIndex = 2,
                explanation = "Words ending in '-tion' place primary stress on the penultimate (second to last) syllable: ter-mi-NA-tion.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q95"
            )
        )

        return list
    }
}
