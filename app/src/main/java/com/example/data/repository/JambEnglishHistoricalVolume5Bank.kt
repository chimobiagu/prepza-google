package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, verified, and organized JAMB Use of English Historical Series: 1997 - 2001.
 * Standardized with 4 options (A-D), complete passage context, verified answers, and pedagogical explanations.
 */
object JambEnglishHistoricalVolume5Bank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // JAMB USE OF ENGLISH 1997 & 1998
        // =========================================================================
        val passage1998_jos = """
            Those who have visited the city of Jos in Nigeria attest to its uniqueness. The first striking thing to notice, perhaps, is the benevolence of the climate. It will be no exaggeration to say that in no other Nigerian city does one feel so much at peace, so relaxed, with the climate as in Jos. When people say that Jos is cool, the remark is always a compliment, referring to the cool, serene feeling of being at peace with nature, which one experiences in the city. This feeling is topographically symbolized by the surrounding rocky hills, which adorn the horizon from every angle of the city.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_1998_001",
                subject = "English Language",
                topic = "Comprehension: Climate of Jos",
                year = "1998",
                questionText = "$passage1998_jos\n\nThe benevolence of Jos climate is reflected in the:",
                optionA = "Feeling of peace and harmony with nature which the city evokes",
                optionB = "Cold climate of the city which makes people always dress warmly",
                optionC = "Fact that the inhabitants of Jos do not need to work hard",
                optionD = "Average life-span of the inhabitants of Jos",
                correctAnswerIndex = 0,
                explanation = "The passage explains that calling Jos cool refers to the 'cool, serene feeling of being at peace with nature, which one experiences in the city.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1998 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1998_033",
                subject = "English Language",
                topic = "Idioms: At the eleventh hour",
                year = "1998",
                questionText = "Choose the option that best explains the meaning of the sentence:\n'The expected guests arrived at the eleventh hour.'",
                optionA = "The guests arrived at the last possible minute",
                optionB = "The guests arrived at 11 o’clock sharp",
                optionC = "The guests arrived at the expected time",
                optionD = "The guests arrived eleven hours behind schedule",
                correctAnswerIndex = 0,
                explanation = "'At the eleventh hour' is an idiom meaning at the very last moment or almost too late.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1998 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1998_061",
                subject = "English Language",
                topic = "Idioms: Stew in own juice",
                year = "1998",
                questionText = "Choose the option that best explains the idiom:\n'Any student found guilty of examination malpractice should be allowed to stew in his own juice.'",
                optionA = "Taste a repeat of the examination",
                optionB = "Suffer the natural consequences of his own misdeeds without rescue",
                optionC = "Bear the brunt of public disgrace",
                optionD = "Forfeit future education forever",
                correctAnswerIndex = 1,
                explanation = "To 'stew in one's own juice' means to suffer the unpleasant consequences of one's own actions without interference or help from others.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1998 • Q61"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1998_065",
                subject = "English Language",
                topic = "Idioms: Chequered career",
                year = "1998",
                questionText = "Choose the option nearest in meaning to the italicized phrase:\n'Hers was a chequered career.'",
                optionA = "an interesting and successful career",
                optionB = "a career full of sorrow and tears",
                optionC = "a bright and memorable career",
                optionD = "a career full of alternating ups and downs",
                correctAnswerIndex = 3,
                explanation = "A 'chequered career' is a career marked by periods of success mixed with periods of failure or misfortune (ups and downs).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1998 • Q65"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1998_081",
                subject = "English Language",
                topic = "Idioms: Eat one's words",
                year = "1998",
                questionText = "Choose the correct verbal idiom:\n'Okonkwo is a stubborn man; he will never _____ his words.'",
                optionA = "chew",
                optionB = "spit",
                optionC = "eat",
                optionD = "bite",
                correctAnswerIndex = 2,
                explanation = "To 'eat one's words' is the standard English idiom meaning to retract or take back something said previously.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1998 • Q81"
            )
        )

        // =========================================================================
        // JAMB USE OF ENGLISH 1999 & 2000
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eng_1999_029",
                subject = "English Language",
                topic = "Idioms: Go under the hammer",
                year = "1999",
                questionText = "Choose the option that best explains the sentence:\n'Hundreds of used items will go under the hammer during the weekend.'",
                optionA = "Unserviceable goods will be publicly destroyed",
                optionB = "Impounded household items will be sold to the public",
                optionC = "Damaged items will be tested",
                optionD = "Many old items will be sold at a public auction",
                correctAnswerIndex = 3,
                explanation = "To 'go under the hammer' means to be sold at an auction.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1999 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1999_039",
                subject = "English Language",
                topic = "Antonyms: Loquacious",
                year = "1999",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'My brother married a loquacious woman.'",
                optionA = "quiet",
                optionB = "noisy",
                optionC = "talkative",
                optionD = "beautiful",
                correctAnswerIndex = 0,
                explanation = "'Loquacious' means talkative. Its direct antonym is 'quiet' or reticent.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1999 • Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1999_056",
                subject = "English Language",
                topic = "Vocabulary: Dexterity",
                year = "1999",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'Mr. Dzokoto plays the piano with great dexterity.'",
                optionA = "wisdom",
                optionB = "power",
                optionC = "force",
                optionD = "skill",
                correctAnswerIndex = 3,
                explanation = "'Dexterity' means skill in performing tasks, especially with the hands; hence, 'skill'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1999 • Q56"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2000_045",
                subject = "English Language",
                topic = "Vocabulary: Turncoat",
                year = "2000",
                questionText = "Choose the correct political term:\n'I like the character who played the role of a political _____ at the convention.'",
                optionA = "thorncoat",
                optionB = "torncoat",
                optionC = "turncoat",
                optionD = "turnedcoat",
                correctAnswerIndex = 2,
                explanation = "A 'turncoat' is a person who deserts one party or cause in order to join an opposing one (a traitor or renegade).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2000 • Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2000_072",
                subject = "English Language",
                topic = "Vocabulary: Nebulous",
                year = "2000",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The essay topic is nebulous.'",
                optionA = "vague",
                optionB = "incorrect",
                optionC = "distinct",
                optionD = "clear",
                correctAnswerIndex = 0,
                explanation = "'Nebulous' means in the form of a cloud or haze; hazy, indistinct, or 'vague'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2000 • Q72"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2000_079",
                subject = "English Language",
                topic = "Vocabulary: Apogee",
                year = "2000",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'My father was at the apogee of his career when he was retired.'",
                optionA = "terminal point",
                optionB = "highest point",
                optionC = "least productive stage",
                optionD = "redundant stage",
                correctAnswerIndex = 1,
                explanation = "'Apogee' refers to the highest point or culmination of a career or trajectory (pinnacle/zenith).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2000 • Q79"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2000_091",
                subject = "English Language",
                topic = "Idioms: See eye to eye",
                year = "2000",
                questionText = "Choose the option opposite in meaning to the italicized idiom:\n'It is rare for a leader and his deputy to see eye to eye.'",
                optionA = "disagree",
                optionB = "respect each other",
                optionC = "be of one mind",
                optionD = "reproach each other",
                correctAnswerIndex = 0,
                explanation = "To 'see eye to eye' means to agree fully. The direct opposite is to 'disagree'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2000 • Q91"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2000_096",
                subject = "English Language",
                topic = "Antonyms: Taut",
                year = "2000",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The string was taut.'",
                optionA = "loose",
                optionB = "firm",
                optionC = "stretched",
                optionD = "tight",
                correctAnswerIndex = 0,
                explanation = "'Taut' means stretched or pulled tight; not slack. Its direct antonym is 'loose'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2000 • Q96"
            )
        )

        return list
    }
}
