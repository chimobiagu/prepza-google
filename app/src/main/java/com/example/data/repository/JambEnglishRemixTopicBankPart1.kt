package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Remix Topic-by-Topic Question Bank Part 1.
 * Contains authentic past UTME questions across Lexis (Synonyms & Antonyms)
 * and Interpretation of Words & Expressions with verified solutions and explanations.
 */
object JambEnglishRemixTopicBankPart1 {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // CHAPTER 3: LEXIS I - SYNONYMS (EXERCISE I)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_syn_01",
                subject = "English Language",
                topic = "Synonyms: Bore",
                year = "1978",
                questionText = "From the way my friend talks, you can see he is such a bore.",
                optionA = "rude",
                optionB = "brilliant",
                optionC = "uninteresting",
                optionD = "judicious",
                correctAnswerIndex = 2,
                explanation = "A 'bore' is a dull, uninteresting person who causes boredom or weariness.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_02",
                subject = "English Language",
                topic = "Synonyms: Concurrently",
                year = "1978",
                questionText = "His jail terms were to run concurrently.",
                optionA = "simultaneously",
                optionB = "laboriously",
                optionC = "consecutively",
                optionD = "judiciously",
                correctAnswerIndex = 0,
                explanation = "'Concurrently' means existing or happening at the same time; simultaneously.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_03",
                subject = "English Language",
                topic = "Synonyms: Symmetry",
                year = "1978",
                questionText = "There is some obvious symmetry in the whole presentation.",
                optionA = "confusion",
                optionB = "hesitation",
                optionC = "excitement",
                optionD = "orderliness",
                correctAnswerIndex = 3,
                explanation = "'Symmetry' denotes balance, harmony, regularity, and orderliness in arrangement.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_04",
                subject = "English Language",
                topic = "Synonyms: Insolvent",
                year = "1978",
                questionText = "This bill has to wait as we are now insolvent.",
                optionA = "overworked",
                optionB = "bankrupt",
                optionC = "unsettled",
                optionD = "affluent",
                correctAnswerIndex = 1,
                explanation = "'Insolvent' means unable to pay debts owed; bankrupt or lacking funds.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_05",
                subject = "English Language",
                topic = "Synonyms: Stared",
                year = "1978",
                questionText = "He stared at her.",
                optionA = "glanced",
                optionB = "peeped",
                optionC = "gazed",
                optionD = "looked",
                correctAnswerIndex = 2,
                explanation = "'Stare' means to look fixedly, intently, or vacate with eyes wide open; to gaze.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1978:Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_06",
                subject = "English Language",
                topic = "Synonyms: Aversion",
                year = "1979",
                questionText = "Do you have the same aversion as I do for war films?",
                optionA = "bitterness",
                optionB = "dislike",
                optionC = "criticism",
                optionD = "preference",
                correctAnswerIndex = 1,
                explanation = "'Aversion' means a strong feeling of dislike, opposition, or disinclination.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1979:Q56"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_07",
                subject = "English Language",
                topic = "Synonyms: Penury",
                year = "1980",
                questionText = "His penury gave him a lifetime of hunger.",
                optionA = "avariciousness",
                optionB = "affluence",
                optionC = "poverty",
                optionD = "penny pinching",
                correctAnswerIndex = 2,
                explanation = "'Penury' is the state of extreme poverty, indigence, or destitution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q37"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_08",
                subject = "English Language",
                topic = "Synonyms: Prodigal",
                year = "1980",
                questionText = "The Bible's prodigal son became quite wealthy eventually.",
                optionA = "prestigious",
                optionB = "phlegmatic",
                optionC = "errant",
                optionD = "extravagant",
                correctAnswerIndex = 3,
                explanation = "'Prodigal' means spending money or resources freely and recklessly; wastefully extravagant.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_09",
                subject = "English Language",
                topic = "Synonyms: Inoxious / Harmless",
                year = "1980",
                questionText = "Don't eat just any innocuous looking mushroom you see around.",
                optionA = "harmful",
                optionB = "harmless",
                optionC = "innocent",
                optionD = "conspicuous",
                correctAnswerIndex = 1,
                explanation = "'Innocuous' means not harmful, offensive, or poisonous; harmless.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_10",
                subject = "English Language",
                topic = "Synonyms: Colossal",
                year = "1980",
                questionText = "Colossal means:",
                optionA = "a Greek column",
                optionB = "gigantic",
                optionC = "something with too much fluid",
                optionD = "a calamity",
                correctAnswerIndex = 1,
                explanation = "'Colossal' means extremely large, gigantic, or massive.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_11",
                subject = "English Language",
                topic = "Synonyms: Jaundiced",
                year = "1980",
                questionText = "He has never been a good mediator, because in most cases his views are always jaundiced.",
                optionA = "coloured",
                optionB = "sick",
                optionC = "suspicious",
                optionD = "prejudiced",
                correctAnswerIndex = 3,
                explanation = "'Jaundiced' in a figurative sense means having or showing prejudice, bias, bitterness, or cynicism.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q66"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_12",
                subject = "English Language",
                topic = "Synonyms: Point-blank",
                year = "1980",
                questionText = "After the wife had covered her misdeeds by prevaricating, her poor husband accused her point-blank of adultery.",
                optionA = "bluntly",
                optionB = "pointedly",
                optionC = "emphatically",
                optionD = "unmistakingly",
                correctAnswerIndex = 0,
                explanation = "To accuse someone 'point-blank' means directly, bluntly, and without hesitation or ambiguity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q67"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_13",
                subject = "English Language",
                topic = "Synonyms: Flanked",
                year = "1980",
                questionText = "Sitting majestically on his throne is the Oba of Benin flanked by some of his wives.",
                optionA = "surrounded",
                optionB = "supported",
                optionC = "guarded",
                optionD = "protected",
                correctAnswerIndex = 0,
                explanation = "'Flanked' means to be situated on each side of someone or surrounded on the sides.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q75"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_14",
                subject = "English Language",
                topic = "Synonyms: Unseemly",
                year = "1980",
                questionText = "In a civilized society, it is unseemly to emit a loud belch at the end of a meal.",
                optionA = "noisy",
                optionB = "annoying",
                optionC = "impolite",
                optionD = "outrageous",
                correctAnswerIndex = 2,
                explanation = "'Unseemly' refers to behavior that is not proper, decent, or polite in society.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1980:Q76"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_15",
                subject = "English Language",
                topic = "Synonyms: Jealous / Envious",
                year = "1981",
                questionText = "Mary is jealous of her sister's success.",
                optionA = "suspicious",
                optionB = "bitter",
                optionC = "mindful",
                optionD = "envious",
                correctAnswerIndex = 3,
                explanation = "'Jealous' in this context means feeling envious or resentful of someone else's achievements.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1981:Q76"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_16",
                subject = "English Language",
                topic = "Synonyms: Officious",
                year = "1981",
                questionText = "Our school prefect is too officious and we all dislike him because of his behaviour.",
                optionA = "efficient",
                optionB = "overzealous",
                optionC = "active",
                optionD = "zealous",
                correctAnswerIndex = 1,
                explanation = "'Officious' means assertively domineering, meddlesome, or overzealous in offering unwanted service or authority.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1981:Q90"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_17",
                subject = "English Language",
                topic = "Synonyms: Regrets",
                year = "1981",
                questionText = "The President of our Club has sent his regrets. He may be unable to attend the next meeting.",
                optionA = "confusion",
                optionB = "explanations",
                optionC = "anxieties",
                optionD = "apologies",
                correctAnswerIndex = 3,
                explanation = "In formal English, to send one's 'regrets' means to send a formal message expressing an apology for inability to attend.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1981:Q91"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_18",
                subject = "English Language",
                topic = "Synonyms: Souvenirs",
                year = "1981",
                questionText = "Whenever I travel abroad, I always bring, on my return, photographs, postcards and other small items as souvenirs.",
                optionA = "mementoes",
                optionB = "remembrance",
                optionC = "memorials",
                optionD = "properties",
                correctAnswerIndex = 0,
                explanation = "'Souvenirs' are mementoes or keepsakes acquired to remember a place, occasion, or journey.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1981:Q92"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_19",
                subject = "English Language",
                topic = "Synonyms: Pointedly",
                year = "1981",
                questionText = "His wife for ten years refused point-blank to leave her matrimonial home when he brought another woman.",
                optionA = "directly",
                optionB = "boldly",
                optionC = "pointedly",
                optionD = "bluntly",
                correctAnswerIndex = 3,
                explanation = "'Point-blank' means bluntly, directly, and unequivocally.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1981:Q94"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_20",
                subject = "English Language",
                topic = "Synonyms: Manifested",
                year = "1981",
                questionText = "We all have both good and bad characteristics, either is, however easily manifested in times of crisis.",
                optionA = "demanded",
                optionB = "demonstrated",
                optionC = "submerged",
                optionD = "ridiculed",
                correctAnswerIndex = 1,
                explanation = "'Manifested' means clearly revealed, exhibited, displayed, or demonstrated.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1981:Q96"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_21",
                subject = "English Language",
                topic = "Synonyms: Wholesome",
                year = "1981",
                questionText = "One of the surest ways to ensure good health is to have a wholesome and adequate diet.",
                optionA = "palatable",
                optionB = "mixed",
                optionC = "hygienic and healthy",
                optionD = "delicious",
                correctAnswerIndex = 2,
                explanation = "'Wholesome' food promotes health and physical well-being; healthy and nutritious.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1981:Q97"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_22",
                subject = "English Language",
                topic = "Synonyms: Tranquil",
                year = "1982",
                questionText = "My mother has refused to come to live in Lagos because she prefers the tranquil life in the village to the hurly-burly of the city.",
                optionA = "free",
                optionB = "prosperous",
                optionC = "peaceful and serene",
                optionD = "decent",
                correctAnswerIndex = 2,
                explanation = "'Tranquil' means free from disturbance; calm, serene, and peaceful.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1982:Q90"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_23",
                subject = "English Language",
                topic = "Synonyms: Fantasy",
                year = "1983",
                questionText = "It is sheer fantasy to believe that there could never be a miscalculation by any nation that has atomic weapons.",
                optionA = "dream or illusion",
                optionB = "hope",
                optionC = "nonsense",
                optionD = "joke",
                correctAnswerIndex = 0,
                explanation = "'Fantasy' refers to an imagined or illusory expectation that does not correspond to reality.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1983:Q73"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_24",
                subject = "English Language",
                topic = "Synonyms: Ingenious",
                year = "1983",
                questionText = "The ingenious scheme of the robber broke down because of the efficiency of the police officer.",
                optionA = "suspicious",
                optionB = "ambitious",
                optionC = "deceitful",
                optionD = "clever",
                correctAnswerIndex = 3,
                explanation = "'Ingenious' means clever, original, inventive, and resourceful.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1983:Q74"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_25",
                subject = "English Language",
                topic = "Synonyms: Instantaneous",
                year = "1983",
                questionText = "When kerosene was poured on the fire, the effect was instantaneous.",
                optionA = "momentary",
                optionB = "momentous",
                optionC = "immediate",
                optionD = "terrifying",
                correctAnswerIndex = 2,
                explanation = "'Instantaneous' means occurring, done, or taking place instantly or immediately.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1983:Q99"
            )
        )

        return list
    }
}
