package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Literature-in-English 2016, 2017, and 2018 UTME Official Exams.
 * Spanning Frank Ogbeche's 'Harvest of Corruption', Shakespeare's 'Othello', Amma Darko's 'Faceless',
 * Bayo Adebowale's 'Lonely Days', Richard Wright's 'Native Son', and J.P. Clark's 'The Wives' Revolt'.
 */
object JambLiterature2016to2018CompleteExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2016 LITERATURE IN ENGLISH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_2016_01",
                subject = "Literature in English",
                topic = "Drama: Harvest of Corruption (Frank Ogbeche)",
                year = "2016",
                questionText = "'We'll dangle this babe before the Chief for a price. He will employ her and we can make use of her to get what we want...' In Frank Ogbeche's 'Harvest of Corruption', 'the babe' refers to:",
                optionA = "Ogeyi",
                optionB = "Alice",
                optionC = "Ochuole",
                optionD = "Aloho",
                correctAnswerIndex = 3,
                explanation = "Ochuole devises a scheme to lure her innocent, desperate job-seeking friend Aloho into Chief Ade Haladu-Amaka's predatory corrupt network.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_03",
                subject = "Literature in English",
                topic = "Drama: Harvest of Corruption (Frank Ogbeche)",
                year = "2016",
                questionText = "The central urban setting of the play 'Harvest of Corruption' is the fictional capital city of:",
                optionA = "Mabu",
                optionB = "Gbossa",
                optionC = "Darkin",
                optionD = "Jabu",
                correctAnswerIndex = 3,
                explanation = "The drama is set in Jabu, a corrupt metropolitan capital representing contemporary societal decay in developing nations.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_05",
                subject = "Literature in English",
                topic = "Drama: Harvest of Corruption (Frank Ogbeche)",
                year = "2016",
                questionText = "In 'Harvest of Corruption', Chief Ade Haladu-Amaka is criminally prosecuted for:",
                optionA = "child trafficking",
                optionB = "illegal land grabbing",
                optionC = "cocaine trafficking, drug smuggling, and public embezzlement",
                optionD = "election ballot rigging",
                correctAnswerIndex = 2,
                explanation = "Chief Haladu-Amaka abuses his ministerial position for massive public fund embezzlement and international hard-drug smuggling using unsuspecting couriers like Aloho.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_07",
                subject = "Literature in English",
                topic = "Drama: Othello (Shakespeare)",
                year = "2016",
                questionText = "In Shakespeare's tragedy 'Othello', the tragic Moor suffocates Desdemona primarily because of:",
                optionA = "Iago's poisonous manipulation inducing unfounded sexual jealousy",
                optionB = "her father's racial slurs",
                optionC = "her refusal to convert to his religion",
                optionD = "political treason against Venice",
                correctAnswerIndex = 0,
                explanation = "Othello is consumed and destroyed by the green-eyed monster of jealousy manipulated masterfully by Iago with the planted strawberry handkerchief.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_08",
                subject = "Literature in English",
                topic = "Drama: Othello (Shakespeare)",
                year = "2016",
                questionText = "Senator Brabantio violently opposes the marriage between Othello and Desdemona because:",
                optionA = "he prefers Iago as a son-in-law",
                optionB = "Othello is a Moorish foreigner whom he suspects used witchcraft or sorcery to win her",
                optionC = "Roderigo already signed a dowry agreement",
                optionD = "Desdemona was promised to the Duke",
                correctAnswerIndex = 1,
                explanation = "Brabantio cannot comprehend that his daughter eloped willingly with an African Moor and accuses Othello of using illicit love potions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_11",
                subject = "Literature in English",
                topic = "Prose: Faceless (Amma Darko)",
                year = "2016",
                questionText = "In Amma Darko's novel 'Faceless', the name of Kabria's husband is:",
                optionA = "Kwei",
                optionB = "Kpakpo",
                optionC = "Adade",
                optionD = "Ottu",
                correctAnswerIndex = 2,
                explanation = "Adade is Kabria's indifferent and unhelpful husband whose old car ('the beetle') constantly gives trouble.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_12",
                subject = "Literature in English",
                topic = "Prose: Faceless (Amma Darko)",
                year = "2016",
                questionText = "'She was both a child and an adult and could act like both.' In 'Faceless', this description portrays the street-smart vulnerability of:",
                optionA = "Fofo",
                optionB = "Baby T (crushed under street exploitation)",
                optionC = "Odarley",
                optionD = "Maa Tsuru",
                correctAnswerIndex = 0,
                explanation = "Fourteen-year-old Fofo exhibits hardened survival maturity forced upon her by the ruthless streets of Agbogbloshie while still remaining a vulnerable child.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_14",
                subject = "Literature in English",
                topic = "Prose: Lonely Days (Bayo Adebowale)",
                year = "2016",
                questionText = "In Bayo Adebowale's 'Lonely Days', mourning widows in the traditional village of Kufi are compelled by customs to wear clothes that are:",
                optionA = "bright crimson red",
                optionB = "stark mourning black",
                optionC = "pure white",
                optionD = "spotted indigo",
                correctAnswerIndex = 1,
                explanation = "Widows in Kufi endure harsh dehumanizing rituals, including wearing black mourning garb and having their heads shaved.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_16",
                subject = "Literature in English",
                topic = "Prose: Lonely Days (Bayo Adebowale)",
                year = "2016",
                questionText = "In 'Lonely Days', Yaremi's only son who migrated to the modern city is:",
                optionA = "Alani",
                optionB = "Wande",
                optionC = "Olode",
                optionD = "Deyo",
                correctAnswerIndex = 0,
                explanation = "Alani is Yaremi's only son who lives and works as a carpenter in the city of Ibadan.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_17",
                subject = "Literature in English",
                topic = "Prose: Native Son (Richard Wright)",
                year = "2016",
                questionText = "In Richard Wright's 'Native Son', Bigger Thomas disposes of Mary Dalton's body after accidental suffocating by burning it in the:",
                optionA = "kitchen garbage incinerator",
                optionB = "basement furnace",
                optionC = "snowy backyard",
                optionD = "lumber yard fireplace",
                correctAnswerIndex = 1,
                explanation = "Terrified of being caught in Mary's bedroom, Bigger carries her corpse down to the Dalton cellar and stuffs her into the roaring coal furnace.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q17"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2017 & 2018 LITERATURE IN ENGLISH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_2017_01",
                subject = "Literature in English",
                topic = "Drama: Harvest of Corruption (Frank Ogbeche)",
                year = "2017",
                questionText = "In 'Harvest of Corruption', Aloho initially regards her unexpected pregnancy by Chief Haladu-Amaka as a form of divine:",
                optionA = "reward for loyalty",
                optionB = "blessing to secure a wealthy husband",
                optionC = "punishment and eternal moral shame",
                optionD = "social triumph",
                correctAnswerIndex = 2,
                explanation = "Aloho is shattered by guilt and devastation, viewing her out-of-wedlock pregnancy as harsh retribution for abandoning her moral upbringing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2017_11",
                subject = "Literature in English",
                topic = "Prose: Faceless (Amma Darko)",
                year = "2017",
                questionText = "In 'Faceless', the use of the biblical name 'Sodom and Gomorrah' to designate the squalid Agbogbloshie slum is an example of:",
                optionA = "mixed metaphor",
                optionB = "biblical allusion",
                optionC = "synecdoche",
                optionD = "euphemism",
                correctAnswerIndex = 1,
                explanation = "The moniker 'Sodom and Gomorrah' directly alludes to the ancient cities of sin, chaos, squalor, and destruction in the Book of Genesis.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_21",
                subject = "Literature in English",
                topic = "Drama: The Wives' Revolt (J.P. Clark)",
                year = "2018",
                questionText = "In J.P. Clark's dramatic comedy 'The Wives' Revolt', the central message demonstrates that gender equity and mutual respect in marriage are:",
                optionA = "both undesirable and impossible",
                optionB = "desirable but historically unattainable",
                optionC = "vital, attainable, and indispensable for community harmony",
                optionD = "an aggressive foreign imposition",
                correctAnswerIndex = 2,
                explanation = "Through satirical humor and the women's mass walkout to Iyara over oil compensation money, Clark proves that community progress requires fair gender partnership.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_25",
                subject = "Literature in English",
                topic = "Drama: The Wives' Revolt (J.P. Clark)",
                year = "2018",
                questionText = "The poetic and caustic exchange of insults between spouses in 'The Wives' Revolt' is drawn from the traditional Urhobo satirical song-poetry tradition known as:",
                optionA = "Ikaki",
                optionB = "Udje dance and song contest",
                optionC = "Etiyeri",
                optionD = "Ekpe masquerade",
                correctAnswerIndex = 1,
                explanation = "Clark incorporates the Urhobo 'Udje' oral tradition where rival quarters and individuals compose structured satirical verse against human folly.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q25"
            )
        )

        return list
    }
}
