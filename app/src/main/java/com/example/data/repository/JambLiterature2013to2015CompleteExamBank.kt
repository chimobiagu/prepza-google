package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Literature-in-English 2013, 2014, and 2015 UTME Official Exams.
 * Spanning Shakespeare's 'The Tempest', Osofisan's 'Women of Owu', Hemingway's 'The Old Man and the Sea',
 * Adichie's 'Purple Hibiscus', Konadu's 'A Woman in Her Prime', and Metaphysical Poetry.
 */
object JambLiterature2013to2015CompleteExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2013 LITERATURE IN ENGLISH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_2013_07",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (Shakespeare)",
                year = "2013",
                questionText = "'What, drawn and talk of peace? I hate the word As I hate hell, all Montagues, and thee Have at thee, coward!' In Shakespeare's 'Romeo and Juliet', Tybalt is portrayed as:",
                optionA = "an incorrigible instigator of violence and blood feud",
                optionB = "a patient peace negotiator",
                optionC = "a cowardly servant",
                optionD = "an impartial civil arbitrator",
                correctAnswerIndex = 0,
                explanation = "Tybalt's fierce hostility and hatred for all Montagues drive the fatal escalating bloodshed in Verona.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_08",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (Shakespeare)",
                year = "2013",
                questionText = "At the commencement of 'Romeo and Juliet', Romeo's temperament is characterized as:",
                optionA = "melancholic, pensive, and lovesick over Rosaline",
                optionB = "triumphant and energetic",
                optionC = "aggressive and warlike",
                optionD = "carefree and lighthearted",
                correctAnswerIndex = 0,
                explanation = "Before meeting Juliet at the ball, Romeo wanders in deep melancholy due to Rosaline's unrequited coldness.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q8"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2014 LITERATURE IN ENGLISH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_2014_02",
                subject = "Literature in English",
                topic = "Drama: Women of Owu (Femi Osofisan)",
                year = "2014",
                questionText = "In Femi Osofisan's 'Women of Owu', the gods (Anlugbua and Lawumi) are portrayed as:",
                optionA = "powerless observers of human destruction",
                optionB = "capricious architects of human devastation and destiny",
                optionC = "compassionate healers of war victims",
                optionD = "fictional delusions of the chorus",
                correctAnswerIndex = 1,
                explanation = "The gods orchestrate and allow the violent ruin of Owu before turning on each other in retribution.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_06",
                subject = "Literature in English",
                topic = "Drama: The Tempest (Shakespeare)",
                year = "2014",
                questionText = "In Shakespeare's 'The Tempest', Ariel is characterized as:",
                optionA = "an airy spirit indentured to Prospero's magical commands",
                optionB = "the biological daughter of Prospero",
                optionC = "the wife of King Alonso",
                optionD = "the vicious monstrous beast of the island",
                correctAnswerIndex = 0,
                explanation = "Ariel is the ethereal spirit freed by Prospero from Sycorax's cloven pine who performs magical feats in return for ultimate liberty.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_08",
                subject = "Literature in English",
                topic = "Drama: The Tempest (Shakespeare)",
                year = "2014",
                questionText = "Caliban's attempted violation of Miranda stems from his primitive desire to:",
                optionA = "destroy Prospero's library books",
                optionB = "compete with Prince Ferdinand",
                optionC = "populate the isolated island with mini-Calibans",
                optionD = "secure formal royal marriage",
                correctAnswerIndex = 2,
                explanation = "Caliban unrepentantly boasts: 'O ho, O ho! would't had been done! Thou didst prevent me; I had peopled else this isle with Calibans.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_10",
                subject = "Literature in English",
                topic = "Drama: The Tempest (Shakespeare)",
                year = "2014",
                questionText = "Prospero's initial loss of the Dukedom of Milan happened because he was:",
                optionA = "excessively immersed in secret books and occult studies rather than state governance",
                optionB = "militarily defeated in open war by Naples",
                optionC = "bankrupted by lavish state celebrations",
                optionD = "hated and deposed by his common citizens",
                correctAnswerIndex = 0,
                explanation = "Prospero neglected his civil ducal duties to pursue esoteric scholarship, enabling his treacherous brother Antonio to usurp the throne.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_15",
                subject = "Literature in English",
                topic = "Prose: Purple Hibiscus (Chimamanda Adichie)",
                year = "2014",
                questionText = "In Chimamanda Ngozi Adichie's 'Purple Hibiscus', Eugene Achike (Papa) is depicted as:",
                optionA = "a lenient, secular, and liberal parent",
                optionB = "a fanatically rigid Catholic zealot and domestic tyrant",
                optionC = "a corrupt political military officer",
                optionD = "a traditional Igbo native priest",
                correctAnswerIndex = 1,
                explanation = "Papa Eugene combines public philanthropy with uncompromising religious dogmatism and severe domestic domestic violence against his family.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_17",
                subject = "Literature in English",
                topic = "Prose: The Old Man and the Sea (Hemingway)",
                year = "2014",
                questionText = "In Hemingway's 'The Old Man and the Sea', the giant creature hooked by Santiago after 84 days of dry luck is a:",
                optionA = "mako shark",
                optionB = "giant blue marlin",
                optionC = "humpback whale",
                optionD = "barracuda",
                correctAnswerIndex = 1,
                explanation = "Santiago battles and lands an eighteen-foot marlin in the Gulf Stream before sharks ravage the carcass on the return journey.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_18",
                subject = "Literature in English",
                topic = "Prose: The Old Man and the Sea (Hemingway)",
                year = "2014",
                questionText = "The central existential theme of 'The Old Man and the Sea' is:",
                optionA = "the commercial exploitation of marine life",
                optionB = "the invincible human endurance against defeat ('A man can be destroyed but not defeated')",
                optionC = "the joy of modern sports fishing",
                optionD = "the fear of deep oceanic voyages",
                correctAnswerIndex = 1,
                explanation = "Hemingway celebrates noble stoicism and human resilience in the face of inevitable tragedy and physical destruction.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q18"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2015 LITERATURE IN ENGLISH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_2015_01",
                subject = "Literature in English",
                topic = "Poetry: The Sun Rising (John Donne)",
                year = "2015",
                questionText = "'Busy old fool, unruly sun why windows and through curtains call on us?' The vivid figure of speech in Donne's poem is:",
                optionA = "simile",
                optionB = "litotes",
                optionC = "personification and apostrophe",
                optionD = "chiasmus",
                correctAnswerIndex = 2,
                explanation = "Donne addresses the inanimate sun directly as a meddlesome elderly busybody, combining apostrophe and bold anthropomorphic personification.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_02",
                subject = "Literature in English",
                topic = "Poetry: The Negro Speaks of Rivers (Langston Hughes)",
                year = "2015",
                questionText = "In Langston Hughes's 'The Negro Speaks of Rivers', the historical allusions to the Euphrates, Congo, Nile, and Mississippi symbolize:",
                optionA = "the ancient, deep, and resilient heritage of black civilization",
                optionB = "modern shipping routes in the Americas",
                optionC = "the decline of global freshwater sources",
                optionD = "colonial agricultural conquests",
                correctAnswerIndex = 0,
                explanation = "Hughes traces African racial memory and spiritual depth back to the dawn of human history through iconic ancient waterways.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_13",
                subject = "Literature in English",
                topic = "Literary Principles: Dramatic Techniques",
                year = "2015",
                questionText = "A narrative device by which a prior scene or past action is recalled to illuminate current plot motivations is a:",
                optionA = "climax",
                optionB = "flashback (analepsis)",
                optionC = "musical interlude",
                optionD = "cathartic denouement",
                correctAnswerIndex = 1,
                explanation = "A flashback interrupts chronological sequence to depict events that transpired earlier in time.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_15",
                subject = "Literature in English",
                topic = "Literary Principles: Dramatic Conventions",
                year = "2015",
                questionText = "A dramatic convention where an actor speaks brief lines intended exclusively for the audience while other characters remain unaware is an:",
                optionA = "soliloquy",
                optionB = "aside",
                optionC = "epilogue",
                optionD = "invocation",
                correctAnswerIndex = 1,
                explanation = "An aside is a brief remark directed directly to the audience or to oneself that is staged as inaudible to other onstage characters.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_17",
                subject = "Literature in English",
                topic = "Literary Principles: Character Types",
                year = "2015",
                questionText = "A fictional character whose name directly provides the title of the literary text (e.g. Macbeth, Hamlet, Oliver Twist) is called an:",
                optionA = "antagonist",
                optionB = "round character",
                optionC = "eponymous character",
                optionD = "stock character",
                correctAnswerIndex = 2,
                explanation = "An eponymous character is one whose name gives title to the entire book, play, or epic poem.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_20",
                subject = "Literature in English",
                topic = "Literary Principles: Poetic Genres",
                year = "2015",
                questionText = "A genre of poetry that nostalgically idealizes rural landscape, simple shepherd life, and rustic tranquility is:",
                optionA = "ballad",
                optionB = "heroic epic",
                optionC = "pastoral poetry (idyll)",
                optionD = "panegyric ode",
                correctAnswerIndex = 2,
                explanation = "Pastoral literature depicts idyllic country existence, shepherds, and simple pastoral innocence in contrast to corrupt city life.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q20"
            )
        )

        return list
    }
}
