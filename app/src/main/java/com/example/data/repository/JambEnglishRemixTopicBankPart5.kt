package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Remix Topic-by-Topic Question Bank Part 5.
 * Contains authentic past UTME questions across Idioms, Sayings & Figures of Speech (Chapter 6),
 * and Test of Oral Forms / Phonology (Chapter 17).
 */
object JambEnglishRemixTopicBankPart5 {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // CHAPTER 6: IDIOMS, SAYINGS, PROVERBS AND FIGURES OF SPEECH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_fig_01",
                subject = "English Language",
                topic = "Idioms: Dark horse",
                year = "1978",
                questionText = "In the match against the Uplanders team, the Sub mariners turned out to be the dark horse.",
                optionA = "played most brilliantly",
                optionB = "played below their usual form",
                optionC = "won unexpectedly despite being little known",
                optionD = "lost as expected",
                correctAnswerIndex = 2,
                explanation = "A 'dark horse' is a competitor about whom little is known, but who unexpectedly succeeds.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_fig_02",
                subject = "English Language",
                topic = "Idioms: Small fry",
                year = "1978",
                questionText = "Only the small fry get punished for such social misdemeanours.",
                optionA = "small boys",
                optionB = "unimportant and ordinary people",
                optionC = "frivolous people",
                optionD = "inexperienced people",
                correctAnswerIndex = 1,
                explanation = "'Small fry' refers to unimportant or insignificant people compared with larger or more influential figures.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_fig_03",
                subject = "English Language",
                topic = "Idioms: Heart in his mouth",
                year = "1978",
                questionText = "He spoke with his heart in his mouth.",
                optionA = "courageously",
                optionB = "with such unusual cowardice",
                optionC = "with a lot of confusion",
                optionD = "with great fear and anxiety",
                correctAnswerIndex = 3,
                explanation = "To have one's 'heart in one's mouth' means to feel great fear, nervousness, or extreme apprehension.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_fig_04",
                subject = "English Language",
                topic = "Idioms: Broke even",
                year = "1978",
                questionText = "The balance sheet at the end of the business year shows that we broke even.",
                optionA = "lost heavily",
                optionB = "made profit",
                optionC = "neither made profit nor incurred loss",
                optionD = "had no money to continue business",
                correctAnswerIndex = 2,
                explanation = "To 'break even' means to balance expenses and revenues exactly with neither net profit nor loss.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_fig_05",
                subject = "English Language",
                topic = "Idioms: Look on the bright side",
                year = "1978",
                questionText = "Being an optimist, our professor always sees the bright side of most things.",
                optionA = "harming",
                optionB = "illuminated",
                optionC = "cheerful and hopeful aspect",
                optionD = "pleasing",
                correctAnswerIndex = 2,
                explanation = "To 'look on the bright side' means to focus on the positive, promising, and hopeful aspects of a situation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_fig_06",
                subject = "English Language",
                topic = "Idioms: Heart of stone",
                year = "1978",
                questionText = "Mrs. Dada has been deserted by her husband because he feels she has a heart of stone.",
                optionA = "has a very heavy heart",
                optionB = "has little warmth or sympathy of feeling",
                optionC = "has a hard heart",
                optionD = "is hard hearted",
                correctAnswerIndex = 1,
                explanation = "To have a 'heart of stone' means to be completely unfeeling, cold, and devoid of compassion or sympathy.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_fig_07",
                subject = "English Language",
                topic = "Idioms: Neck and neck",
                year = "1978",
                questionText = "The two sprinters were running neck and neck.",
                optionA = "exactly level with each other",
                optionB = "very slowly",
                optionC = "very fast",
                optionD = "with their necks together",
                correctAnswerIndex = 0,
                explanation = "'Neck and neck' means level with each other in a race or competition with neither holding an advantage.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_fig_08",
                subject = "English Language",
                topic = "Idioms: Put up a bold front",
                year = "1978",
                questionText = "When the man was caught by the police he presented a bold front.",
                optionA = "he attacked the policemen boldly",
                optionB = "he walked up to the policemen",
                optionC = "he faced the situation with apparent courage",
                optionD = "he bravely attempted to give them a present",
                correctAnswerIndex = 2,
                explanation = "To 'put up a bold front' means to display apparent confidence, courage, or defiance in face of adversity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q46"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_fig_09",
                subject = "English Language",
                topic = "Idioms: Close quarters",
                year = "1978",
                questionText = "I have been able to observe him at close quarters.",
                optionA = "in government houses near by",
                optionB = "within a short space of time",
                optionC = "in a small family house",
                optionD = "at close range",
                correctAnswerIndex = 3,
                explanation = "To observe someone 'at close quarters' means from very close proximity or contact.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q47"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_fig_10",
                subject = "English Language",
                topic = "Idioms: Crux of the matter",
                year = "1979",
                questionText = "The crux of the matter is that the President has just become aware of the mismanagement.",
                optionA = "part of the problem that has just surfaced",
                optionB = "the result of the matter",
                optionC = "the most vital or decisive aspect of the problem",
                optionD = "the ways to solve the problem",
                correctAnswerIndex = 2,
                explanation = "The 'crux of the matter' is the central, essential, or pivotal point of an issue.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1979:Q58"
            )
        )

        // -------------------------------------------------------------------------
        // CHAPTER 17: TEST OF ORAL FORMS (VOWELS, CONSONANTS, STRESS & RHYMES)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_oral_01",
                subject = "English Language",
                topic = "Oral Forms: Vowel Sounds in Boot / Loot",
                year = "1999",
                questionText = "Choose the word that does NOT have the same vowel sound as the others:\n'loot', 'boot', 'rout', 'route'",
                optionA = "loot",
                optionB = "boot",
                optionC = "rout",
                optionD = "route",
                correctAnswerIndex = 2,
                explanation = "'Loot', 'boot', and 'route' share the long /uː/ sound, whereas 'rout' is pronounced with the /aʊ/ diphthong.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1999:Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_oral_02",
                subject = "English Language",
                topic = "Oral Forms: Vowel Sounds in Sun / Son",
                year = "1999",
                questionText = "Choose the word that does NOT have the same vowel sound as the others:\n'sun', 'shin', 'son', 'short'",
                optionA = "sun",
                optionB = "shin",
                optionC = "son",
                optionD = "short",
                correctAnswerIndex = 1,
                explanation = "'Sun' and 'son' have the short central open vowel /ʌ/, while 'shin' has /ɪ/ and 'short' has /ɔː/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1999:Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_oral_03",
                subject = "English Language",
                topic = "Oral Forms: Vowel Sounds in Deep / Lease",
                year = "1999",
                questionText = "Choose the word that does NOT have the same vowel sound as the others:\n'deep', 'lease', 'meet', 'lace'",
                optionA = "deep",
                optionB = "lease",
                optionC = "meet",
                optionD = "lace",
                correctAnswerIndex = 3,
                explanation = "'Deep', 'lease', and 'meet' feature the long vowel /iː/, whereas 'lace' contains the diphthong /eɪ/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1999:Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_oral_04",
                subject = "English Language",
                topic = "Oral Forms: Consonant Sounds in Sheath / Length",
                year = "2010",
                questionText = "Choose the option that has the same consonant sound as the underlined letters in: 'shea_th_'",
                optionA = "bathe",
                optionB = "length",
                optionC = "months",
                optionD = "paths",
                correctAnswerIndex = 1,
                explanation = "'Sheath' and 'length' both end with the voiceless dental fricative /θ/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 2010:Q89"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_oral_05",
                subject = "English Language",
                topic = "Oral Forms: Stress in Departmentalise",
                year = "2005",
                questionText = "Choose the appropriate stress pattern from the options for: 'departmentalise'",
                optionA = "departmenTAlise",
                optionB = "DEpartmentalise",
                optionC = "dePARTmentalise",
                optionD = "departmentaLISE",
                correctAnswerIndex = 0,
                explanation = "In 'departmentalise', primary stress falls on the fourth syllable: de-part-men-TA-lise.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 2005:Q61"
            )
        )

        return list
    }
}
