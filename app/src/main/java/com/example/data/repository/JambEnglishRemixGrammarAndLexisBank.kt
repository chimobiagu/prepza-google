package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Remix Topic-by-Topic Bank:
 * Advanced Grammar, Concord, Adjectives, Determiners, Verbs, Prepositions & Common Pitfalls.
 * Pages 75 to 116 in Samrate Academic Elixir.
 */
object JambEnglishRemixGrammarAndLexisBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // CHAPTER 8: NOUN AND PRONOUN
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_noun_01",
                subject = "English Language",
                topic = "Nouns: Uncountable Luggage",
                year = "1978",
                questionText = "If you travel by air you will be given an allowance to cover _____.",
                optionA = "a luggage",
                optionB = "luggage",
                optionC = "luggages",
                optionD = "a baggage",
                correctAnswerIndex = 1,
                explanation = "'Luggage' is an uncountable noun and does not take the indefinite article 'a' or plural 's'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 8 Q1 (1978:Q56)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_noun_02",
                topic = "Pronouns: Prepositional Objective Case",
                subject = "English Language",
                year = "1978",
                questionText = "Remember this matter is strictly _____.",
                optionA = "between you and I",
                optionB = "among you and I",
                optionC = "between you and me",
                optionD = "between you and mine",
                correctAnswerIndex = 2,
                explanation = "The preposition 'between' governs the objective case of pronouns ('you and me', not 'you and I').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 8 Q3 (1978:Q60)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_noun_03",
                subject = "English Language",
                topic = "Pronouns: Possessive Pronoun Yours",
                year = "1978",
                questionText = "Invariably, he ends all his letters '_____ faithfully'.",
                optionA = "Your's",
                optionB = "Yours'",
                optionC = "Yours",
                optionD = "Your own",
                correctAnswerIndex = 2,
                explanation = "The possessive pronoun 'Yours' never takes an apostrophe.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 8 Q4 (1978:Q67)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_noun_04",
                subject = "English Language",
                topic = "Nouns: Furniture and Equipment",
                year = "1983",
                questionText = "The school board has placed an order for _____ required in the new schools.",
                optionA = "all the furniture and equipments",
                optionB = "all the furniture and equipment",
                optionC = "all of the furnitures and equipments",
                optionD = "many of the furnitures and equipments",
                correctAnswerIndex = 1,
                explanation = "Both 'furniture' and 'equipment' are non-count (uncountable) mass nouns in standard English.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 8 Q39 (1983:Q39)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_noun_05",
                subject = "English Language",
                topic = "Nouns: Advice",
                year = "1985",
                questionText = "I do not want _____ from such a friend as Jimoh.",
                optionA = "any more advices",
                optionB = "no more advice",
                optionC = "any advices",
                optionD = "any advice",
                correctAnswerIndex = 3,
                explanation = "'Advice' is uncountable; it cannot be made plural as 'advices'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 8 Q50 (1985:Q89)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_noun_06",
                subject = "English Language",
                topic = "Nouns: Plural of Compounds",
                year = "1993",
                questionText = "They spent the last holiday with their _____.",
                optionA = "sister-in-laws",
                optionB = "sisters-in-law",
                optionC = "sisters-in-laws",
                optionD = "sisters-in-law's",
                correctAnswerIndex = 1,
                explanation = "In compound nouns joined by hyphens, the primary noun takes the plural 's' ('sisters-in-law').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 8 Q86 (1993:Q75)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_noun_07",
                subject = "English Language",
                topic = "Nouns: Double Plurals in Compound Professions",
                year = "1995",
                questionText = "The hospital can now boast of more _____.",
                optionA = "women doctor",
                optionB = "woman doctors",
                optionC = "women doctors",
                optionD = "woman's doctors",
                correctAnswerIndex = 2,
                explanation = "When 'man' or 'woman' modifies a profession, both elements are pluralized ('women doctors', 'men pilots').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 8 Q96 (1995:Q78)"
            )
        )

        // -------------------------------------------------------------------------
        // CHAPTER 9: VERB AND TENSES
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_tenses_01",
                subject = "English Language",
                topic = "Verbs: Lie vs Lay",
                year = "1978",
                questionText = "When the beggar was tired he _____ down by the roadside.",
                optionA = "lay",
                optionB = "laid",
                optionC = "layed",
                optionD = "lain",
                correctAnswerIndex = 0,
                explanation = "The past tense of the intransitive verb 'lie' (to recline) is 'lay' (lie -> lay -> lain).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 9 Q1 (1978:Q49)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_tenses_02",
                subject = "English Language",
                topic = "Verbs: Subjunctive & Inversion",
                year = "1979",
                questionText = "If he had left home earlier, he _____ late.",
                optionA = "would not be",
                optionB = "would have not been",
                optionC = "would not have been",
                optionD = "will not have been",
                correctAnswerIndex = 2,
                explanation = "Third conditional structure: 'If + past perfect' requires 'would + have + past participle' in the main clause.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 9 Q16 (1979:Q31)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_tenses_03",
                subject = "English Language",
                topic = "Verbs: Irregular Verb Broadcast",
                year = "1984",
                questionText = "The Governor has _____ to the people on many occasions.",
                optionA = "broadcast",
                optionB = "been broadcast",
                optionC = "broadcasted",
                optionD = "been broadcasted",
                correctAnswerIndex = 0,
                explanation = "The past participle of 'broadcast' in standard English remains 'broadcast' (broadcast -> broadcast -> broadcast).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 9 Q94 (1984:Q82)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_tenses_04",
                subject = "English Language",
                topic = "Verbs: Hang (Execution vs Suspension)",
                year = "1986",
                questionText = "When he had arranged the furniture, he _____ the picture on the wall.",
                optionA = "hanged",
                optionB = "hung",
                optionC = "hang",
                optionD = "hanged up",
                correctAnswerIndex = 1,
                explanation = "For suspending an object, the past tense is 'hung'. 'Hanged' is reserved exclusively for execution by the noose.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 9 Q19 (1986:Q97)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_tenses_05",
                subject = "English Language",
                topic = "Verbs: Lay (Past Participle for Eggs)",
                year = "1986",
                questionText = "Wada said that two of his chickens _____ eggs yesterday morning.",
                optionA = "layed",
                optionB = "lied",
                optionC = "laid",
                optionD = "lain",
                correctAnswerIndex = 2,
                explanation = "The verb 'lay' (to produce eggs) is transitive; its past tense and past participle are 'laid' (lay -> laid -> laid).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 9 Q20 (1986:Q100)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_tenses_06",
                subject = "English Language",
                topic = "Verbs: Stature and Shrinking",
                year = "1992",
                questionText = "Before mechanization, workers _____ water out of fabrics with their hands.",
                optionA = "wring",
                optionB = "wrung",
                optionC = "wringed",
                optionD = "wrunged",
                correctAnswerIndex = 1,
                explanation = "The past tense of the irregular verb 'wring' (to twist forcefully) is 'wrung'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 9 Q72 (1992:Q63)"
            )
        )

        // -------------------------------------------------------------------------
        // CHAPTER 10: PREPOSITIONS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_prep_01",
                subject = "English Language",
                topic = "Prepositions: Prone to",
                year = "1978",
                questionText = "My little boy is hyper-active and he is therefore prone _____ accidents.",
                optionA = "with respect",
                optionB = "for",
                optionC = "to",
                optionD = "about",
                correctAnswerIndex = 2,
                explanation = "The adjective 'prone' takes the preposition 'to' ('prone to accidents/errors').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 10 Q6 (1978:Q84)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_prep_02",
                subject = "English Language",
                topic = "Prepositions: Allergic to",
                year = "1980",
                questionText = "Grace must be allergic _____ smoke because any time she sits by someone who is smoking, she sneezes.",
                optionA = "to",
                optionB = "from",
                optionC = "with",
                optionD = "by",
                correctAnswerIndex = 0,
                explanation = "The fixed preposition for 'allergic' is 'to' ('allergic to dust/smoke').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 10 Q15 (1980:Q89)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_prep_03",
                subject = "English Language",
                topic = "Prepositions: Disappointed at/with",
                year = "1991",
                questionText = "Mr. and Mrs. Akoka were sad and disappointed _____ the performance of their son.",
                optionA = "about",
                optionB = "for",
                optionC = "at",
                optionD = "over",
                correctAnswerIndex = 2,
                explanation = "One is disappointed 'at' or 'by' an event or outcome, and 'in' or 'with' a person.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 10 Q80 (1991:Q95)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_prep_04",
                subject = "English Language",
                topic = "Prepositions: Differ from / with",
                year = "2005",
                questionText = "I was often angry with Oche since he differed _____ me on several issues.",
                optionA = "against",
                optionB = "from",
                optionC = "about",
                optionD = "with",
                correctAnswerIndex = 3,
                explanation = "To 'differ with' a person means to disagree in opinion; to 'differ from' means to be unlike in quality.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 10 Q4 (2005:Q91)"
            )
        )

        // -------------------------------------------------------------------------
        // CHAPTER 11: ADJECTIVES, ARTICLES & DETERMINERS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_adj_01",
                subject = "English Language",
                topic = "Adjectives: Order of Adjectives",
                year = "1979",
                questionText = "They went to the market and bought a _____ suitcase.",
                optionA = "big leather brown",
                optionB = "leather brown big",
                optionC = "big brown leather",
                optionD = "brown big leather",
                correctAnswerIndex = 2,
                explanation = "Standard OSASCOMP order of adjectives: Size (big) -> Color (brown) -> Material (leather).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 11 Q4 (1979:Q29)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_adj_02",
                subject = "English Language",
                topic = "Adjectives: Voracious Reader",
                year = "1980",
                questionText = "He must be a good student because he is a _____ reader.",
                optionA = "romanesque",
                optionB = "veracious",
                optionC = "voracious",
                optionD = "mendacious",
                correctAnswerIndex = 2,
                explanation = "'Voracious' means eagerly devouring great quantities of reading material.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 11 Q9 (1980:Q92)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_adj_03",
                subject = "English Language",
                topic = "Determiners: Few vs A Few",
                year = "1981",
                questionText = "Although the problem was simple, _____ students were able to solve it.",
                optionA = "little",
                optionB = "small",
                optionC = "few",
                optionD = "a few",
                correctAnswerIndex = 2,
                explanation = "'Few' has a negative connotation (almost none), contrasting with the simplicity of the problem.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 11 Q10 (1981:Q67)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_adj_04",
                subject = "English Language",
                topic = "Compound Adjectives: Hyphenation",
                year = "1995",
                questionText = "A _____ woman was attacked by a group of bandits.",
                optionA = "90-years old",
                optionB = "90 year-old",
                optionC = "90-year-old",
                optionD = "90 years old",
                correctAnswerIndex = 2,
                explanation = "Compound modifiers preceding a noun are hyphenated with the singular unit of measure: '90-year-old'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 11 Q35 (1995:Q71)"
            )
        )

        // -------------------------------------------------------------------------
        // CHAPTER 13: RULE OF CONCORD AND COLLOCATION
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_concord_01",
                subject = "English Language",
                topic = "Concord: Compound Subject with And",
                year = "1978",
                questionText = "The employer, not the salesman and the representative, _____ responsible for the loss.",
                optionA = "are",
                optionB = "were",
                optionC = "never",
                optionD = "is",
                correctAnswerIndex = 3,
                explanation = "Parenthetical expressions ('not the salesman...') do not alter the singular subject 'The employer' which takes 'is'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 13 Q1 (1978:Q52)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_concord_02",
                subject = "English Language",
                topic = "Concord: Rule of Proximity with Either/Or",
                year = "1980",
                questionText = "If Remi performs poorly in her forthcoming examination, then either her mother or I _____ to blame.",
                optionA = "must",
                optionB = "has",
                optionC = "will be",
                optionD = "am",
                correctAnswerIndex = 3,
                explanation = "In correlative conjunctions ('either... or'), the verb agrees with the closer subject pronoun 'I' -> 'am'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 13 Q3 (1980:Q81)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_concord_03",
                subject = "English Language",
                topic = "Concord: Many a + Singular Noun",
                year = "1987",
                questionText = "Many a candidate _____ to realise the difference between written and spoken English.",
                optionA = "fails",
                optionB = "fail",
                optionC = "have failed",
                optionD = "is failing",
                correctAnswerIndex = 0,
                explanation = "The structure 'Many a + singular noun' takes a singular verb ('Many a candidate fails').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 13 Q10 (1987:Q66)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_concord_04",
                subject = "English Language",
                topic = "Concord: Titles of Books as Singular",
                year = "1987",
                questionText = "'A Tale of Two Cities' _____ the book we were studying for the examination.",
                optionA = "are novels",
                optionB = "was novel",
                optionC = "were novels",
                optionD = "is novel",
                correctAnswerIndex = 1,
                explanation = "Even if a book title contains a plural noun, the title itself is a singular entity taking a singular verb ('was').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 13 Q13 (1987:Q79)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_concord_05",
                subject = "English Language",
                topic = "Concord: Diseases ending in -s",
                year = "1994",
                questionText = "Measles _____ no longer impossible to manage these days.",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "was",
                correctAnswerIndex = 0,
                explanation = "Names of diseases ending in -s (measles, mumps, rickets, diabetes) are grammatically singular.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 13 Q40 (1994:Q60)"
            )
        )

        // -------------------------------------------------------------------------
        // CHAPTER 14: QUESTION TAGS, INTERROGATIVES & REPORTED SPEECH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_tag_01",
                subject = "English Language",
                topic = "Question Tags: Negative Statement",
                year = "1978",
                questionText = "The Managing Director did not pay his staff last month, _____?",
                optionA = "didn't he",
                optionB = "had he",
                optionC = "is not it",
                optionD = "did he",
                correctAnswerIndex = 3,
                explanation = "A negative main clause ('did not pay') requires a positive tag ('did he?').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 14 Q1 (1978:Q76)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_tag_02",
                subject = "English Language",
                topic = "Question Tags: Let us",
                year = "1990",
                questionText = "Let's have a cup of coffee, _____?",
                optionA = "shall we",
                optionB = "will we",
                optionC = "should we",
                optionD = "could we",
                correctAnswerIndex = 0,
                explanation = "Proposals starting with 'Let's' universally take the question tag 'shall we?'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 14 Q34 (1990:Q98)"
            )
        )

        // -------------------------------------------------------------------------
        // CHAPTER 15: SPELLING MISTAKES
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_spell_01",
                subject = "English Language",
                topic = "Spelling: Accommodation",
                year = "1983",
                questionText = "Choose the correctly spelled option:\n'I have applied for... on the campus and I am almost certain I will get it.'",
                optionA = "accomodation",
                optionB = "accommodation",
                optionC = "accomodasion",
                optionD = "acommodation",
                correctAnswerIndex = 1,
                explanation = "'Accommodation' is spelled with double 'c' and double 'm' (a-c-c-o-m-m-o-d-a-t-i-o-n).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 15 Q3 (1983:Q54)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_spell_02",
                subject = "English Language",
                topic = "Spelling: Embarrassed",
                year = "1983",
                questionText = "Choose the option which contains a WRONGLY spelt word:",
                optionA = "disappointed",
                optionB = "embarrased",
                optionC = "equipped",
                optionD = "rhythm",
                correctAnswerIndex = 1,
                explanation = "'Embarrassed' requires double 'r' and double 's' (embarrassed).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 15 Q4 (1983:Q75)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_spell_03",
                subject = "English Language",
                topic = "Spelling: Harassment",
                year = "2004",
                questionText = "No teacher of honour would subject his student to any form of _____.",
                optionA = "harrasment",
                optionB = "harassment",
                optionC = "harasment",
                optionD = "harrassment",
                correctAnswerIndex = 1,
                explanation = "'Harassment' has single 'r' and double 's' (h-a-r-a-s-s-m-e-n-t).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 15 Q44 (2004:Q77)"
            )
        )

        // -------------------------------------------------------------------------
        // CHAPTER 16: COMMON MISTAKES & FIXED EXPRESSIONS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_mistake_01",
                subject = "English Language",
                topic = "Fixed Expressions: Lend vs Borrow",
                year = "1978",
                questionText = "As he was still owing me two Naira, I was reluctant to _____ him any more money.",
                optionA = "lend",
                optionB = "loan",
                optionC = "borrow",
                optionD = "extend",
                correctAnswerIndex = 0,
                explanation = "You 'lend' money to someone; you 'borrow' money from someone.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 16 Q1 (1978:Q54)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_mistake_02",
                subject = "English Language",
                topic = "Fixed Expressions: It is high time",
                year = "1978",
                questionText = "Isn't it high time you _____ your office?",
                optionA = "are leaving",
                optionB = "do leave",
                optionC = "leave",
                optionD = "left",
                correctAnswerIndex = 3,
                explanation = "The structure 'It is (high/about) time + subject' takes the past subjunctive verb form ('left').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 16 Q6 (1978:Q93)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_mistake_03",
                subject = "English Language",
                topic = "Fixed Expressions: Discuss",
                year = "1979",
                questionText = "The members of the panel were _____ the issue peacefully.",
                optionA = "discussing about",
                optionB = "discussing on",
                optionC = "discussing",
                optionD = "discussing around",
                correctAnswerIndex = 2,
                explanation = "The verb 'discuss' is transitive and does not take the preposition 'about'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 16 Q8 (1979:Q46)"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_remix_mistake_04",
                subject = "English Language",
                topic = "Fixed Expressions: Comprise vs Consist",
                year = "1979",
                questionText = "A society _____ individuals each of whom has his attributes and distinct characteristics.",
                optionA = "is constituted of",
                optionB = "comprises of",
                optionC = "consists of",
                optionD = "is made of",
                correctAnswerIndex = 2,
                explanation = "'Consists' takes 'of', while 'comprises' never takes 'of'. Hence 'consists of' is the correct option here.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix • Chapter 16 Q16 (1979:Q98)"
            )
        )

        return list
    }
}
