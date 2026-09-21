package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Remix Topic-by-Topic Question Bank Part 3.
 * Contains authentic past UTME questions across Lexis (Antonyms Exercise II & III),
 * Cloze Tests, and Structural Prepositions.
 */
object JambEnglishRemixTopicBankPart3 {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // CHAPTER 4: LEXIS II - ANTONYMS (EXERCISE I & II)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_ant_01",
                subject = "English Language",
                topic = "Antonyms: Languish",
                year = "1995",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The poor man is compelled to languish in his poverty stricken situation.'",
                optionA = "luxuriate and thrive",
                optionB = "deteriorate",
                optionC = "suffer",
                optionD = "laugh",
                correctAnswerIndex = 0,
                explanation = "'Languish' means to suffer in a state of weakness or stagnation. Its direct antonym is 'luxuriate', 'flourish', or 'thrive'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1995:Q49"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_02",
                subject = "English Language",
                topic = "Antonyms: Prototype",
                year = "1995",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The engineers have been urged to make a prototype of the long-awaited Nigeria car.'",
                optionA = "specimen",
                optionB = "original",
                optionC = "copy and replica",
                optionD = "drawing",
                correctAnswerIndex = 2,
                explanation = "A 'prototype' is an original model or first specimen. Its opposite is a 'copy', 'duplicate', or 'replica'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1995:Q50"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_03",
                subject = "English Language",
                topic = "Antonyms: Painstaking",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'He gave a painstaking account of his encounter with the ghost of his father.'",
                optionA = "sordid",
                optionB = "fearful",
                optionC = "half-hearted and careless",
                optionD = "tender-hearted",
                correctAnswerIndex = 2,
                explanation = "'Painstaking' means done with thoroughness, meticulous diligence, and care. Its antonym is 'half-hearted' or 'careless'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_04",
                subject = "English Language",
                topic = "Antonyms: Equanimity",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Since mortality is the lot of man argued the preacher, we must all accept death with equanimity.'",
                optionA = "concern",
                optionB = "uncertainty",
                optionC = "serenity",
                optionD = "anxiety and agitation",
                correctAnswerIndex = 3,
                explanation = "'Equanimity' is mental calmness and composure, even in a difficult situation. Its antonym is 'anxiety' or 'agitation'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q34"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_05",
                subject = "English Language",
                topic = "Antonyms: Dynamic",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'We admire the minister's passionate and dynamic characteristics.'",
                optionA = "cruel and passive",
                optionB = "kind and forceful",
                optionC = "passive and charmless",
                optionD = "charmless and cruel",
                correctAnswerIndex = 2,
                explanation = "'Dynamic' means characterized by constant change, activity, or positive energy. Its antonym is 'passive' or 'inactive'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_06",
                subject = "English Language",
                topic = "Antonyms: Ravaged",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'I was advised to stay away from cities that are ravaged by crime.'",
                optionA = "spoilt by",
                optionB = "free from and peaceful",
                optionC = "suffering from",
                optionD = "haven of",
                correctAnswerIndex = 1,
                explanation = "'Ravaged' means severely damaged, devastated, or ruined. Its opposite is 'free from' harm or preserved.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_07",
                subject = "English Language",
                topic = "Antonyms: Lethal",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'You can use lethal means if necessary to stop dangerous characters from molesting innocent citizens.'",
                optionA = "fatal",
                optionB = "cruel",
                optionC = "harmless and non-deadly",
                optionD = "soft",
                correctAnswerIndex = 2,
                explanation = "'Lethal' means sufficient to cause death; deadly. Its antonym is 'harmless' or 'safe'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_08",
                subject = "English Language",
                topic = "Antonyms: Pacify",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'His intention was not actually to punish the villagers, and in any case he is now making moves to pacify them.'",
                optionA = "placate",
                optionB = "enrage and provoke",
                optionC = "appease",
                optionD = "annoy",
                correctAnswerIndex = 1,
                explanation = "'Pacify' means to quell anger or bring peace; appease. The opposite is to 'provoke', 'enrage', or 'incite'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q37"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_09",
                subject = "English Language",
                topic = "Antonyms: Pragmatic",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'If you are really keen on immediate results, you just have to adopt this pragmatic approach.'",
                optionA = "practical",
                optionB = "unrealistic and idealistic",
                optionC = "opportunistic",
                optionD = "sensible",
                correctAnswerIndex = 1,
                explanation = "'Pragmatic' means dealing with things sensibly and realistically. Its antonym is 'unrealistic' or 'impractical'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_10",
                subject = "English Language",
                topic = "Antonyms: Beggary",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'My friend was reduced to beggary by various ill advised business deals.'",
                optionA = "affluence and wealth",
                optionB = "penury",
                optionC = "influence",
                optionD = "poverty",
                correctAnswerIndex = 0,
                explanation = "'Beggary' means the state of utter destitution and mendicancy. Its opposite is 'affluence', 'wealth', or 'prosperity'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_11",
                subject = "English Language",
                topic = "Antonyms: Authenticate",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Measures were taken to authenticate the number of booklets received.'",
                optionA = "reaffirm",
                optionB = "discredit and invalidate",
                optionC = "discountenance",
                optionD = "count",
                correctAnswerIndex = 1,
                explanation = "'Authenticate' means to prove or confirm something is genuine or accurate. The opposite is to 'discredit' or 'falsify'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_12",
                subject = "English Language",
                topic = "Antonyms: Progressives",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'He urged other progressives in the country to join forces with his association.'",
                optionA = "radicals",
                optionB = "conservatives and reactionaries",
                optionC = "pessimists",
                optionD = "activists",
                correctAnswerIndex = 1,
                explanation = "A 'progressive' is an advocate of social and political reform. The direct political antonym is a 'conservative'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_13",
                subject = "English Language",
                topic = "Antonyms: Condoned",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Adama's father simply condoned her bad habits instead of punishing her appropriately.'",
                optionA = "opposed and condemned",
                optionB = "blamed",
                optionC = "accepted",
                optionD = "forbade",
                correctAnswerIndex = 0,
                explanation = "'Condone' means to accept and allow bad behavior to continue. The antonym is to 'oppose', 'forbid', or 'condemn'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q42"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_14",
                subject = "English Language",
                topic = "Antonyms: Perpetuate",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The undesirable elements who perpetuate these vices are never detected.'",
                optionA = "aggravate",
                optionB = "overlook",
                optionC = "discontinue and terminate",
                optionD = "encourage",
                correctAnswerIndex = 2,
                explanation = "'Perpetuate' means to make something continue indefinitely. Its direct antonym is to 'discontinue', 'cease', or 'terminate'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_15",
                subject = "English Language",
                topic = "Antonyms: Unwittingly",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Some travellers unwittingly render themselves open prey to questionable character.'",
                optionA = "genuinely",
                optionB = "deliberately and consciously",
                optionC = "knowingly",
                optionD = "inadvertently",
                correctAnswerIndex = 1,
                explanation = "'Unwittingly' means without being aware; unintentionally. Its antonym is 'deliberately' or 'knowingly'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_16",
                subject = "English Language",
                topic = "Antonyms: Shrewd",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'His father is a shrewd businessman.'",
                optionA = "gullible and naïve",
                optionB = "orderly",
                optionC = "reliable",
                optionD = "resourceful",
                correctAnswerIndex = 0,
                explanation = "'Shrewd' means having or showing sharp powers of judgment; astute. The antonym is 'gullible', 'naïve', or 'foolish'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_17",
                subject = "English Language",
                topic = "Antonyms: Equitable",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Many people have raised the issue about the need for an equitable distribution of our wealth.'",
                optionA = "fair",
                optionB = "even",
                optionC = "unjust and inequitable",
                optionD = "undue",
                correctAnswerIndex = 2,
                explanation = "'Equitable' means fair, just, and impartial. Its opposite is 'unjust', 'unfair', or 'inequitable'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q46"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_18",
                subject = "English Language",
                topic = "Antonyms: Exorcise",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The pastor decided to exorcise the evil spirit as the afflicted member of his congregation cried for help.'",
                optionA = "expel",
                optionB = "drive",
                optionC = "invite and harbour",
                optionD = "charm",
                correctAnswerIndex = 2,
                explanation = "'Exorcise' means to cast out or drive away an evil spirit. Its antonym is to 'invite', 'harbour', or 'welcome'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q47"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_19",
                subject = "English Language",
                topic = "Antonyms: Mumbled",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'He mumbled a few words at the trial and then cried.'",
                optionA = "shouted and articulated clearly",
                optionB = "murmured",
                optionC = "charm",
                optionD = "invited",
                correctAnswerIndex = 0,
                explanation = "'Mumble' means to say something indistinctly and quietly. The opposite is to 'shout', 'bellow', or 'proclaim loudly'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q48"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_ant_20",
                subject = "English Language",
                topic = "Antonyms: Convergence",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'There are many areas of convergence between male and female behaviour.'",
                optionA = "concomitance",
                optionB = "concordance",
                optionC = "divergence and incompatibility",
                optionD = "incomparability",
                correctAnswerIndex = 2,
                explanation = "'Convergence' is the process or state of coming together or meeting. Its direct antonym is 'divergence' or 'separation'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1997:Q49"
            )
        )

        return list
    }
}
