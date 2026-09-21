package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Literature in English Extended Exam Series Bank
 * Contains comprehensive literary appreciation questions and historical play/novel analyses (2010 - 2018).
 */
object JambLiteratureInEnglishExtendedExamSeriesBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------
        // UTME 2010 LITERARY APPRECIATION & PASSAGE ANALYSIS
        // -------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_appr_2010_041",
                subject = "Literature in English",
                topic = "Literary Appreciation: King Baabu",
                year = "2010",
                questionText = "'Basha: You dumb skull of a bone head... you will face court martial for this. You look everywhere? You search inside toilet bowl?' In Wole Soyinka's 'King Baabu', the person being addressed is a:",
                optionA = "soldier",
                optionB = "student",
                optionC = "domestic servant",
                optionD = "lawyer",
                correctAnswerIndex = 0,
                explanation = "In Soyinka's political satire King Baabu, the military dictator Basha uses abusive, coarse language when interrogating a subordinate soldier.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2010_042",
                subject = "Literature in English",
                topic = "Literary Appreciation: Speaker Tone",
                year = "2010",
                questionText = "From the tone of Basha's speech ('You dumb skull of a bone head...'), the speaker is obviously:",
                optionA = "enraged",
                optionB = "lackadaisical",
                optionC = "elated",
                optionD = "happy",
                correctAnswerIndex = 0,
                explanation = "The harsh insults and violent threat of court martial demonstrate an intense, furious, and enraged emotional state.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2010_043",
                subject = "Literature in English",
                topic = "Literary Appreciation: Things Fall Apart",
                year = "2010",
                questionText = "'That year the harvest was sad, like a funeral, and many farmers wept as they dug up the miserable yams. One man tied his cloth to a tree branch and hanged himself.' The mood conveyed in this excerpt from Chinua Achebe's 'Things Fall Apart' is one of:",
                optionA = "sadness and despair",
                optionB = "frustration",
                optionC = "sympathy",
                optionD = "dilemma",
                correctAnswerIndex = 0,
                explanation = "The tragic crop failure, comparing the harvest to a funeral and describing a farmer's suicide, establishes an overwhelming mood of sadness and despair.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2010_044",
                subject = "Literature in English",
                topic = "Poetic Form: Rhyme Scheme",
                year = "2010",
                questionText = "'That age is best which is the first, / When youth and blood are warmer; / But being spent, the worse, and worst / Time still succeed the former.' The rhyme scheme in this excerpt from Herrick's poetry is:",
                optionA = "bbaa",
                optionB = "aabb",
                optionC = "abab",
                optionD = "abba",
                correctAnswerIndex = 2,
                explanation = "'first' (a) rhymes with 'worst' (a), and 'warmer' (b) rhymes with 'former' (b), producing the alternating abab rhyme scheme.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2010_045",
                subject = "Literature in English",
                topic = "Literary Appreciation: Subject Matter",
                year = "2010",
                questionText = "'But the towering earth was tired sitting in one position. She moved, suddenly, and the houses crumbled, the mountains heaved horribly, and the work of a million years was lost.' The subject matter of this excerpt is an:",
                optionA = "ocean storm",
                optionB = "sea waves",
                optionC = "house relocation",
                optionD = "earthquake",
                correctAnswerIndex = 3,
                explanation = "The sudden violent shifting of the earth causing houses to crumble and mountains to heave describes a catastrophic earthquake.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2010_046",
                subject = "Literature in English",
                topic = "Poetic Symbolism: Shadows",
                year = "2010",
                questionText = "'And your laughter like a flame piercing the shadows / Has revealed Africa to me beyond the snow of yesterday.' In this poem, 'shadows' represents:",
                optionA = "famine",
                optionB = "bleak future",
                optionC = "period of colonial suffering",
                optionD = "abstract ideas",
                correctAnswerIndex = 2,
                explanation = "The darkness and shadows pierced by laughter symbolize the historical epoch of colonial oppression and suffering in Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2010_047",
                subject = "Literature in English",
                topic = "Literary Appreciation: Speaker Demeanor",
                year = "2010",
                questionText = "'Don't panic. Be calm, If you are somehow upset... try to regain your composure.' The speaker in this excerpt is:",
                optionA = "hopeless",
                optionB = "uncertain",
                optionC = "afraid",
                optionD = "confident and reassuring",
                correctAnswerIndex = 3,
                explanation = "Urging others to remain calm, avoid panic, and regain composure reflects a composed, confident, and self-assured speaker.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2010_048",
                subject = "Literature in English",
                topic = "Poetic Genre: Wilfred Owen's Futility",
                year = "2010",
                questionText = "'Move him into the sun / Gently its touch awoke him once... Was it for this the clay grew tall? / O what made fatuous sunbeams toil / To break earth's sleep at all.' Wilfred Owen's poem 'Futility' is classified as an:",
                optionA = "lyric",
                optionB = "epic",
                optionC = "elegy",
                optionD = "ballad",
                correctAnswerIndex = 2,
                explanation = "Owen's 'Futility' is a war elegy mourning the death of a young soldier whose life cannot be revived by the sun.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2010_049",
                subject = "Literature in English",
                topic = "Poetic Themes: Futility of Life and War",
                year = "2010",
                questionText = "The central philosophical theme of Wilfred Owen's poem 'Futility' is the:",
                optionA = "futility and tragedy of life cut short by war",
                optionB = "distortion of natural science",
                optionC = "creation of physical life",
                optionD = "glory of military conquest",
                correctAnswerIndex = 0,
                explanation = "The poem questions why the universe creates human life if it is to be so easily and pointlessly extinguished in battle.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2010_050",
                subject = "Literature in English",
                topic = "Poetic Form: Rhyme Scheme Analysis",
                year = "2010",
                questionText = "'A cursing rogue with a merry farce, / A bundle of rags upon a crutch, / Stumbled upon that windy place / Called Cruachan, and it was as much.' The rhyme scheme of the stanza is:",
                optionA = "aabb",
                optionB = "abab",
                optionC = "bbaa",
                optionD = "abba",
                correctAnswerIndex = 1,
                explanation = "'farce' (a) rhymes with 'place' (a), and 'crutch' (b) rhymes with 'much' (b), producing an abab scheme.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q50"
            )
        )

        // -------------------------------------------------------------
        // UTME 2011 LITERARY APPRECIATION & DRAMA PASSAGES
        // -------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_appr_2011_041",
                subject = "Literature in English",
                topic = "Shakespearean Appreciation: A Midsummer Night's Dream",
                year = "2011",
                questionText = "'Theseus: Now, fair Hippolyta, our nuptial hour / Draws on apace... But O, methinks how slow / This old moon wanes, she lingers my desires, / Like to a step-dame or a dowager...' The literary devices used in Theseus's speech are:",
                optionA = "personification and simile",
                optionB = "irony and suspense",
                optionC = "alliteration and synecdoche",
                optionD = "rhyme and refrain",
                correctAnswerIndex = 0,
                explanation = "Theseus personifies the moon as a woman who 'lingers' his desires, and uses an explicit simile ('Like to a step-dame or a dowager') to describe its slow passage.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2011_042",
                subject = "Literature in English",
                topic = "Poetry Appreciation: Dream Code",
                year = "2011",
                questionText = "'You are the silent code of pleasure locked / dragon can plunder' In Gbemisola Adeoti's 'Dream Code', rhetorical effect is achieved through:",
                optionA = "repetition and meiosis",
                optionB = "metaphor and rhyme",
                optionC = "caesura and hyperbole",
                optionD = "alliteration and irony",
                correctAnswerIndex = 1,
                explanation = "The excerpt uses direct metaphorical identification ('You are the silent code...') along with rhythmic and rhyme patterning.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2011_043",
                subject = "Literature in English",
                topic = "Prose Appreciation: A Forest of Flowers",
                year = "2011",
                questionText = "'The lift was working now and he squeezed himself into it, breathing with difficulty the body odour emitted by one of the passengers. He sighed with relief when they got to the ground floor...' In Ken Saro-Wiwa's 'A Forest of Flowers', the passenger's experience in the lift is:",
                optionA = "timely",
                optionB = "comfortable",
                optionC = "unpleasant and suffocating",
                optionD = "amusing",
                correctAnswerIndex = 2,
                explanation = "The tight squeezing, foul body odor, and difficulty breathing describe an unpleasant, suffocating physical experience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2011_044",
                subject = "Literature in English",
                topic = "African Drama: The Gods Are Not To Blame",
                year = "2011",
                questionText = "'Now you have all come here sprawling vomiting, rubbing tears on one another begging me to do my duty and help you... Or is the land at peace? Are not people ailing and dying?' In Ola Rotimi's 'The Gods Are Not To Blame', the land is not at peace because of:",
                optionA = "chieftaincy tussle",
                optionB = "famine and war",
                optionC = "political unrest",
                optionD = "epidemic sickness and death",
                correctAnswerIndex = 3,
                explanation = "King Odewale addresses the citizens of Kutuje who are suffering from a deadly, mysterious plague and epidemic sickness.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2011_047",
                subject = "Literature in English",
                topic = "Figures of Speech: Metaphor in Twelfth Night",
                year = "2011",
                questionText = "'I have said too much unto a heart of stone, / And laid my honour too unchary on it...' In Shakespeare's 'Twelfth Night', the phrase 'a heart of stone' is an example of:",
                optionA = "metonymy",
                optionB = "litotes",
                optionC = "assonance",
                optionD = "metaphor",
                correctAnswerIndex = 3,
                explanation = "Comparing an unfeeling, unresponsive human heart directly to stone without using 'like' or 'as' is a classic metaphor.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2011_048",
                subject = "Literature in English",
                topic = "Prose Appreciation: Two Thousand Seasons",
                year = "2011",
                questionText = "'The rejection he had suffered at Idama's hands pushed his spirit into a comfortless hole in which, alone with himself, he searched in vain for ways to run from his inner emptiness.' In Ayi Kwei Armah's 'Two Thousand Seasons', the narrator's attitude to the king is one of:",
                optionA = "envy",
                optionB = "sympathy",
                optionC = "suspicion",
                optionD = "contempt",
                correctAnswerIndex = 3,
                explanation = "The narrator describes the corrupt king with scathing contempt, exposing his inner spiritual void, weakness, and pathetic isolation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2011_049",
                subject = "Literature in English",
                topic = "Poetic Sub-genres: Invocation",
                year = "2011",
                questionText = "'Homage to Peregede the triumphant mother of morning radiant in Chameleon's velvet. Let today's dawn bring on its rails trains of good tidings.' Gbemisola Adeoti's 'Salutation to the gods' is an example of an:",
                optionA = "invocation",
                optionB = "limerick",
                optionC = "ode",
                optionD = "elegy",
                correctAnswerIndex = 0,
                explanation = "The poem pays ritual homage and calls upon the deities to bring blessings, which defines an invocation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_appr_2011_050",
                subject = "Literature in English",
                topic = "Poetic Appreciation: Lord Tennyson's Tithonus",
                year = "2011",
                questionText = "'The woods decay, the woods decay and fall, / The vapours weep their burthen to the ground, / Man comes and tills the field and lies beneath, / And after many a summer dies the swan.' The overarching subject matter of these lines is:",
                optionA = "death and mortality",
                optionB = "heavy rainfall",
                optionC = "agricultural famine",
                optionD = "ocean storms",
                correctAnswerIndex = 0,
                explanation = "Tennyson's lines illustrate the universal, inevitable natural cycle of decay, aging, and death that comes to all living things.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q50"
            )
        )

        // -------------------------------------------------------------
        // UTME 2018 DRAMA ANALYSIS: J.P. CLARK'S THE WIVES' REVOLT
        // -------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_drama_2018_021",
                subject = "Literature in English",
                topic = "African Drama: The Wives' Revolt",
                year = "2018",
                questionText = "In J.P. Clark's drama 'The Wives' Revolt', the central thematic argument is that complete gender equality is:",
                optionA = "both undesirable and unattainable",
                optionB = "desirable but unattainable without social disruption",
                optionC = "attainable and desirable",
                optionD = "obnoxious but desirable",
                correctAnswerIndex = 2,
                explanation = "The play demonstrates through satirical comedy that gender equality and fair treatment of women are attainable and essential for communal progress.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_drama_2018_022",
                subject = "Literature in English",
                topic = "African Drama: The Wives' Revolt",
                year = "2018",
                questionText = "In their mass walkout and flight, the protesting women settle at the rival village of Iyara in order to:",
                optionA = "cure cross-piece sickness",
                optionB = "hurt and punish their husbands economically and socially",
                optionC = "forestall reconciliation permanently",
                optionD = "seek permanent divorce",
                correctAnswerIndex = 1,
                explanation = "The women strategically seek refuge in Iyara to demonstrate their economic indispensability and force the men of Erhuwaren to negotiate.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_drama_2018_023",
                subject = "Literature in English",
                topic = "African Drama: The Wives' Revolt",
                year = "2018",
                questionText = "'...Great orators in the assembly, and poor nannies at home!' Those being ridiculed in this speech in 'The Wives' Revolt' are the:",
                optionA = "husbands",
                optionB = "old women",
                optionC = "wives",
                optionD = "spinsters",
                correctAnswerIndex = 0,
                explanation = "The men/husbands are ridiculed because while they give pompous, powerful speeches in the village assembly, they become utterly helpless trying to care for children at home.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_drama_2018_024",
                subject = "Literature in English",
                topic = "African Drama: The Wives' Revolt",
                year = "2018",
                questionText = "'...Those with full breasts have walked out, and that leaves you, me, and the old-girls returned home on retirement, it's the dry season child.' The character spoken to in the play is positioned in:",
                optionA = "front of the veranda of Okoro's house",
                optionB = "the kitchen, upstage",
                optionC = "Okoro's front yard, downstage",
                optionD = "the direction of the kitchen, offstage",
                correctAnswerIndex = 0,
                explanation = "The stage directions place the dialogue directly in front of the veranda of Okoro's compound during the women's protest.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_drama_2018_025",
                subject = "Literature in English",
                topic = "African Drama: The Wives' Revolt",
                year = "2018",
                questionText = "The lively, satirical mutual exchange of abuse between characters in 'The Wives' Revolt' is reminiscent of the traditional Urhobo performance art of:",
                optionA = "Ikaki",
                optionB = "Udje",
                optionC = "Etiyeri",
                optionD = "Ekpe",
                correctAnswerIndex = 1,
                explanation = "Clark utilizes 'Udje', a traditional Urhobo song and performance genre based on competitive, satirical verbal jesting and social criticism.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q25"
            )
        )

        return list
    }
}
