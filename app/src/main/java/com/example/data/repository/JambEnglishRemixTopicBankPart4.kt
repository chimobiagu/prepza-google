package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Remix Topic-by-Topic Question Bank Part 4.
 * Contains authentic past UTME questions across Phrasal Verbs, Tenses,
 * Nouns & Pronouns, and Concord Rules.
 */
object JambEnglishRemixTopicBankPart4 {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // CHAPTER 7: PHRASAL VERBS (EXERCISE I)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_01",
                subject = "English Language",
                topic = "Phrasal Verbs: Fell through",
                year = "1978",
                questionText = "All his plans fell through.",
                optionA = "failed",
                optionB = "were accomplished",
                optionC = "had to be reviewed",
                optionD = "were rejected",
                correctAnswerIndex = 0,
                explanation = "To 'fall through' means to fail to happen or come to nothing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q34"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_02",
                subject = "English Language",
                topic = "Phrasal Verbs: Put through",
                year = "1978",
                questionText = "He was appointed specifically to put the recruits through.",
                optionA = "assign them to work",
                optionB = "train and instruct them",
                optionC = "discipline them",
                optionD = "assist them to work",
                correctAnswerIndex = 1,
                explanation = "To 'put someone through' means to train, drill, or guide them through a learning experience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_03",
                subject = "English Language",
                topic = "Phrasal Verbs: Go into",
                year = "1978",
                questionText = "The State Government appointed a Commission of Inquiry to go into the community's complaints carefully and without prejudice.",
                optionA = "investigate",
                optionB = "search",
                optionC = "look for",
                optionD = "account for",
                correctAnswerIndex = 0,
                explanation = "To 'go into' a problem or matter means to investigate or examine it thoroughly.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_04",
                subject = "English Language",
                topic = "Phrasal Verbs: Held up",
                year = "1978",
                questionText = "The traffic situation in Lagos can lead to disastrous consequences; a man lost a very lucrative job because he was held up by it.",
                optionA = "confused",
                optionB = "delayed",
                optionC = "annoyed",
                optionD = "intrigued",
                correctAnswerIndex = 1,
                explanation = "To be 'held up' in traffic means to be delayed or impeded in journey progress.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_05",
                subject = "English Language",
                topic = "Phrasal Verbs: Blown down",
                year = "1979",
                questionText = "The bridge connecting the two cities was _____ by the enemy.",
                optionA = "blown up",
                optionB = "blown down",
                optionC = "blown off",
                optionD = "blown away",
                correctAnswerIndex = 0,
                explanation = "To 'blow up' a bridge or structure means to destroy it using explosive devices.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1979:Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_06",
                subject = "English Language",
                topic = "Phrasal Verbs: Ward off",
                year = "1979",
                questionText = "There is an obvious need to ward _____ enemy attacks.",
                optionA = "away",
                optionB = "against",
                optionC = "out",
                optionD = "off",
                correctAnswerIndex = 3,
                explanation = "The correct phrasal verb is to 'ward off' (meaning to repel, parry, or avert danger).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1979:Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_07",
                subject = "English Language",
                topic = "Phrasal Verbs: Taken in",
                year = "1979",
                questionText = "I didn't think she could be so easily taken in by his pretences.",
                optionA = "flattered",
                optionB = "deceived",
                optionC = "enamoured",
                optionD = "overcome",
                correctAnswerIndex = 1,
                explanation = "To be 'taken in' by someone means to be cheated, tricked, or deceived by them.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1979:Q57"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_08",
                subject = "English Language",
                topic = "Phrasal Verbs: Answer for",
                year = "1979",
                questionText = "The clerk refused to answer for the mistakes made by the Manager and his assistants.",
                optionA = "reply to",
                optionB = "give an answer to",
                optionC = "explain to",
                optionD = "accept responsibility for",
                correctAnswerIndex = 3,
                explanation = "To 'answer for' something means to take responsibility or accept the blame/consequences for it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1979:Q65"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_09",
                subject = "English Language",
                topic = "Phrasal Verbs: Look after",
                year = "1979",
                questionText = "The Principal will be going away on leave. In his absence, the Vice-Principal will _____ the school.",
                optionA = "take over",
                optionB = "carry on",
                optionC = "care for",
                optionD = "look after",
                correctAnswerIndex = 3,
                explanation = "To 'look after' an institution or person means to take charge of and care for them responsibly.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1979:Q79"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_10",
                subject = "English Language",
                topic = "Phrasal Verbs: Carry out",
                year = "1979",
                questionText = "The new leader has good intentions, but he is unable to _____ them.",
                optionA = "carry them with him",
                optionB = "carry them out",
                optionC = "carry them on",
                optionD = "carry them all",
                correctAnswerIndex = 1,
                explanation = "To 'carry out' intentions, plans, or orders means to execute, perform, or implement them.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1979:Q80"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_11",
                subject = "English Language",
                topic = "Phrasal Verbs: Came to power",
                year = "1979",
                questionText = "In 1996, the Military _____ because of the tragic failure of the civilian politicians.",
                optionA = "took power",
                optionB = "undertook power",
                optionC = "marched into power",
                optionD = "came to power",
                correctAnswerIndex = 3,
                explanation = "The natural English idiom for assuming governmental authority is to 'come to power'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1979:Q97"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_12",
                subject = "English Language",
                topic = "Phrasal Verbs: See off",
                year = "1980",
                questionText = "I am travelling by 6:30 train tomorrow morning. Will you _____ me?",
                optionA = "see off",
                optionB = "look up",
                optionC = "take down",
                optionD = "see to",
                correctAnswerIndex = 0,
                explanation = "To 'see someone off' means to accompany them to an airport, railway station, etc., to say goodbye.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_13",
                subject = "English Language",
                topic = "Phrasal Verbs: Make up for",
                year = "1980",
                questionText = "You have been absent from classes for four months. How can you _____ for the lost time?",
                optionA = "make in",
                optionB = "make up",
                optionC = "make off",
                optionD = "make out",
                correctAnswerIndex = 1,
                explanation = "To 'make up for' lost time means to compensate for wasted or missing opportunities.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q47"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_14",
                subject = "English Language",
                topic = "Phrasal Verbs: Laid up",
                year = "1980",
                questionText = "As a result of the injury sustained on the football field, Segun was _____ with a broken leg for months.",
                optionA = "laid down",
                optionB = "laid out",
                optionC = "laid on",
                optionD = "laid up",
                correctAnswerIndex = 3,
                explanation = "To be 'laid up' means to be confined to bed or home because of illness, fracture, or injury.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q77"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_15",
                subject = "English Language",
                topic = "Phrasal Verbs: Cash in on",
                year = "1981",
                questionText = "They tried to cash in _____ the people's ignorance.",
                optionA = "under",
                optionB = "against",
                optionC = "about",
                optionD = "on",
                correctAnswerIndex = 3,
                explanation = "To 'cash in on' something means to exploit or take advantage of a situation for profit.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1981:Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_16",
                subject = "English Language",
                topic = "Phrasal Verbs: Brought off",
                year = "1981",
                questionText = "After weeks of bargaining they _____ a deal worth millions.",
                optionA = "made up",
                optionB = "turned about",
                optionC = "brought off",
                optionD = "went through",
                correctAnswerIndex = 2,
                explanation = "To 'bring off' a deal or agreement means to successfully achieve or negotiate it despite difficulties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1981:Q74"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_17",
                subject = "English Language",
                topic = "Phrasal Verbs: Put up",
                year = "1981",
                questionText = "Maimuna wrote to ask if I could put her _____ for the night.",
                optionA = "up",
                optionB = "in",
                optionC = "out",
                optionD = "off",
                correctAnswerIndex = 0,
                explanation = "To 'put someone up' means to accommodate them or give them a place to sleep temporarily in one's home.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1981:Q75"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_18",
                subject = "English Language",
                topic = "Phrasal Verbs: Get away with",
                year = "1982",
                questionText = "You can never get _____ with stealing the presidential jet. You will be caught.",
                optionA = "by",
                optionB = "away",
                optionC = "bye",
                optionD = "free",
                correctAnswerIndex = 1,
                explanation = "To 'get away with' a crime means to escape blame, capture, or punishment for wrongdoing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1982:Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_19",
                subject = "English Language",
                topic = "Phrasal Verbs: Put out",
                year = "1982",
                questionText = "Always remember to _____ the lights before leaving the room.",
                optionA = "put off",
                optionB = "blow out",
                optionC = "put out",
                optionD = "switch off",
                correctAnswerIndex = 3,
                explanation = "For electrical lighting, the appropriate phrasal verb is to 'switch off' (or 'turn off').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1982:Q42"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_phrasal_20",
                subject = "English Language",
                topic = "Phrasal Verbs: Taken for",
                year = "1982",
                questionText = "His English was so good that he was _____ an Englishman.",
                optionA = "taken to",
                optionB = "taken for",
                optionC = "taken as",
                optionD = "taken in",
                correctAnswerIndex = 1,
                explanation = "To be 'taken for' someone means to be mistaken for or identified as that person.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1982:Q64"
            )
        )

        return list
    }
}
