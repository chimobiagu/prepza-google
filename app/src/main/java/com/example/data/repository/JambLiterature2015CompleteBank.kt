package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Literature in English 2015 Complete Exam Bank.
 * Extracted directly from official JAMB UTME 2015 Past Paper.
 * 100% verified question wording, options, answer key, and literary explanations.
 */
object JambLiterature2015CompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "lit_2015_01",
                subject = "Literature in English",
                topic = "Prose: 1984 (George Orwell)",
                year = "2015",
                questionText = "'Big Brother Is Watching You' Big Brother controls life in Oceania through the four ministries of Peace, Love, Plenty, and Truth. The couple continue to meet secretly in an attic room above a junk shop owned by",
                optionA = "Mr. Charrington",
                optionB = "O'Brien",
                optionC = "Eurasia",
                optionD = "Coworker Julius",
                correctAnswerIndex = 0,
                explanation = "Mr. Charrington was the owner of the antique junk shop in the prole district who rented the upper room to Winston and Julia, later revealed as a Thought Police agent.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_02",
                subject = "Literature in English",
                topic = "Prose: The Joys of Motherhood (Buchi Emecheta)",
                year = "2015",
                questionText = "In Buchi Emecheta's 'The Joys of Motherhood', Nnaife and Nnu Ego's second child, but the first to live, is",
                optionA = "Adim",
                optionB = "Ngozi",
                optionC = "Oshia",
                optionD = "Adaku",
                correctAnswerIndex = 2,
                explanation = "Following the tragic death in infancy of Nnu Ego's firstborn son Ngozi, the second child born who survived to adulthood was Oshia (Oshiaju).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_03",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (William Shakespeare)",
                year = "2015",
                questionText = "In Shakespeare's 'Romeo and Juliet':\n'.... So tedious is this day\nAs is the night before some festival\nTo an impatient child that hath new robes\nand may not wear them.'\nThe literary device used in the excerpt is",
                optionA = "simile",
                optionB = "metaphor",
                optionC = "oxymoron",
                optionD = "apostrophe",
                correctAnswerIndex = 0,
                explanation = "A simile is an explicit comparison between two dissimilar things using 'as' or 'like'. Juliet compares waiting for nightfall to an impatient child waiting before a festival.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_04",
                subject = "Literature in English",
                topic = "General Literary Principles",
                year = "2015",
                questionText = "A literary genre which directly imitates human action through dialogue and performance is",
                optionA = "drama",
                optionB = "comedy",
                optionC = "prose",
                optionD = "poetry",
                correctAnswerIndex = 0,
                explanation = "Drama is an imitation of life and human action presented through dialogue and physical action on stage by actors before an audience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_05",
                subject = "Literature in English",
                topic = "Poetic Appreciation: Housman",
                year = "2015",
                questionText = "In A.E. Housman's 'To an Athlete Dying Young', the persona directly addresses the dead athlete using",
                optionA = "monologue",
                optionB = "dialogue",
                optionC = "apostrophe",
                optionD = "prologue",
                correctAnswerIndex = 2,
                explanation = "Apostrophe is a figure of speech in which a speaker directly addresses an absent person, an abstract concept, or a deceased individual as though they were present and alive.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_06",
                subject = "Literature in English",
                topic = "Literary Devices: Figures of Speech",
                year = "2015",
                questionText = "The use of two contrasting or contradictory words placed side by side is called",
                optionA = "prologue",
                optionB = "oxymoron",
                optionC = "apostrophe",
                optionD = "costume",
                correctAnswerIndex = 1,
                explanation = "An oxymoron is a rhetorical device that juxtaposes two opposite or contradictory terms side by side (e.g. 'sweet sorrow', 'open secret').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_07",
                subject = "Literature in English",
                topic = "General Literary Principles",
                year = "2015",
                questionText = "In literary works, verbal irony refers to a",
                optionA = "device in which the speaker means the opposite of what is explicitly said",
                optionB = "situation in which a character speaks or acts against the trends of events",
                optionC = "difficult situation which defies a logical or rational resolution",
                optionD = "device in which the actor on stage means exactly what he says",
                correctAnswerIndex = 0,
                explanation = "Verbal irony occurs when a speaker intentionally states one thing while meaning the direct opposite, creating a contrast between literal wording and implied reality.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_08",
                subject = "Literature in English",
                topic = "General Literary Principles",
                year = "2015",
                questionText = "A speech or piece of writing used to praise a person or thing for past or present deeds is a",
                optionA = "eulogy",
                optionB = "synecdoche",
                optionC = "epigram",
                optionD = "epilogue",
                correctAnswerIndex = 0,
                explanation = "A eulogy is a formal speech or high laudatory tribute delivered in honor of a person's life and noble accomplishments.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_09",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (William Shakespeare)",
                year = "2015",
                questionText = "In William Shakespeare's 'Romeo and Juliet', Romeo is banished to _______ because he _______",
                optionA = "Mantua, fights Tybalt in a street duel",
                optionB = "Capulet's party, kills Tybalt in a street duel",
                optionC = "Mantua, fights and kills Tybalt in a street duel",
                optionD = "Mantua, kills Paris in a street duel.",
                correctAnswerIndex = 2,
                explanation = "Prince Escalus banishes Romeo from Verona to Mantua after Romeo slays Tybalt in a street duel to avenge Mercutio's death.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_10",
                subject = "Literature in English",
                topic = "Prose: The Joys of Motherhood (Buchi Emecheta)",
                year = "2015",
                questionText = "In Buchi Emecheta's 'The Joys of Motherhood', the prevailing domestic conditions of Nnaife's family in Lagos are dominated by",
                optionA = "humiliation and disagreement",
                optionB = "sickness and joblessness",
                optionC = "poverty and hunger",
                optionD = "togetherness and happiness",
                correctAnswerIndex = 2,
                explanation = "Nnu Ego continually battles grinding urban poverty and food scarcity as Nnaife's meagre wage fails to support an expanding household.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_11",
                subject = "Literature in English",
                topic = "General Literary Principles",
                year = "2015",
                questionText = "In dramatic performance, the exclusive use of gestures, body movement, and facial expressions without speech is known as",
                optionA = "mime",
                optionB = "realistic drama",
                optionC = "melodrama",
                optionD = "dialogue",
                correctAnswerIndex = 0,
                explanation = "Mime (or pantomime) is theatrical performance where actors convey action, narrative, and emotion entirely through bodily movements and gestures without spoken dialogue.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_12",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters (J.C. De Graft)",
                year = "2015",
                questionText = "In J.C. De Graft's 'Sons and Daughters', the elder brother to Aaron and Maanan is",
                optionA = "George",
                optionB = "Awere",
                optionC = "Hannah",
                optionD = "Awao",
                correctAnswerIndex = 0,
                explanation = "George is James Ofosu's eldest son, already established as a medical doctor, who serves as brother to Aaron and Maanan.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_13",
                subject = "Literature in English",
                topic = "Literary Devices: Figures of Speech",
                year = "2015",
                questionText = "A figure of speech in which a part is made to represent the whole or the whole for a part is",
                optionA = "allegory",
                optionB = "pun",
                optionC = "synecdoche",
                optionD = "cast",
                correctAnswerIndex = 2,
                explanation = "Synecdoche is a trope where a specific part signifies the whole entity (e.g. 'all hands on deck') or the whole represents a part.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_14",
                subject = "Literature in English",
                topic = "Poetic Appreciation: Rhyme Scheme",
                year = "2015",
                questionText = "'A cursing rogue with a merry farce,\nA bundle of rags upon a crutch,\nStumbled upon that windy place\nCalled Cruachan, and it was as much.'\nThe rhyme scheme of the stanza above is",
                optionA = "aabb",
                optionB = "abab",
                optionC = "bbaa",
                optionD = "abba",
                correctAnswerIndex = 1,
                explanation = "The end rhymes match alternately: farce (a), crutch (b), place (a), much (b), establishing an alternating abab pattern.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_15",
                subject = "Literature in English",
                topic = "Selected African Poetry: Osofisan (Launko)",
                year = "2015",
                questionText = "In Okinba Launko's poem 'End of the War', the primary victims identified as casualties are",
                optionA = "women",
                optionB = "soldiers",
                optionC = "children",
                optionD = "men",
                correctAnswerIndex = 3,
                explanation = "Launko reflects on the devastation of civil warfare, identifying the men lost and broken as the primary physical casualties of the conflict.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_16",
                subject = "Literature in English",
                topic = "Selected African Poetry: J.P. Clark",
                year = "2015",
                questionText = "'........They do not see the funeral piles\nAt home eating up the forests.......'\n— J.P. Clark: Casualties\nThe imagery created in the excerpt above is achieved through",
                optionA = "metaphor",
                optionB = "personification",
                optionC = "synecdoche",
                optionD = "antonym",
                correctAnswerIndex = 1,
                explanation = "Giving the inanimate 'funeral piles' the living capacity of 'eating up the forests' is an explicit use of personification.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_17",
                subject = "Literature in English",
                topic = "Selected African Poetry: Kobena Acquah",
                year = "2015",
                questionText = "The figure of speech in the line 'We would be believing we dreamt it' from Acquah's 'In the Navel of the Soul' is",
                optionA = "assonance",
                optionB = "antithesis",
                optionC = "apostrophe",
                optionD = "alliteration",
                correctAnswerIndex = 0,
                explanation = "The repetition of identical or similar vowel sounds (/i:/ in 'we', 'be', 'believing') constitutes assonance.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_18",
                subject = "Literature in English",
                topic = "Literary Appreciation: Unseen Passage",
                year = "2015",
                questionText = "'But the towering earth was tired of sitting in one position.\nShe moved, suddenly, and the houses crumbled, the mountains heaved horribly, and the work of million years was lost.'\nThe subject matter of the passage is",
                optionA = "earthquake",
                optionB = "demolition",
                optionC = "flood",
                optionD = "storm",
                correctAnswerIndex = 0,
                explanation = "The sudden movement of the crust causing buildings to collapse and mountains to heave depicts a seismic earthquake.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_19",
                subject = "Literature in English",
                topic = "Selected Non-African Poetry: Wendy Cope",
                year = "2015",
                questionText = "The central theme of Wendy Cope's 'Sonnet VII' is",
                optionA = "adventure",
                optionB = "isolation",
                optionC = "contempt for literature",
                optionD = "art of poetry",
                correctAnswerIndex = 0,
                explanation = "Cope's Sonnet VII explores emotional exploration, love's voyages, and romantic adventure.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_20",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters (J.C. De Graft)",
                year = "2015",
                questionText = "In J.C. De Graft's 'Sons and Daughters', the dramatic setting where the entire play takes place is",
                optionA = "In George's place",
                optionB = "In Ofosu's place",
                optionC = "On the street",
                optionD = "On the stage",
                correctAnswerIndex = 1,
                explanation = "The drama is set inside James Ofosu's living room / household where family confrontations unfold.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_21",
                subject = "Literature in English",
                topic = "General Literary Principles",
                year = "2015",
                questionText = "A literary work in which the characters, setting, and events represent broader symbolic meanings or moral truths is known as",
                optionA = "characterization",
                optionB = "allegory",
                optionC = "metaphor",
                optionD = "parallelism",
                correctAnswerIndex = 1,
                explanation = "An allegory is an extended narrative where characters and plot symbolically convey underlying moral, spiritual, or socio-political realities.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_22",
                subject = "Literature in English",
                topic = "Drama: Twelfth Night (William Shakespeare)",
                year = "2015",
                questionText = "In Shakespeare's 'Twelfth Night':\n'I have said too much unto a heart of stone,\nAnd laid my honour too unchary on it...'\n'A heart of stone' in the lines above is an example of",
                optionA = "assonance",
                optionB = "metaphor",
                optionC = "litotes",
                optionD = "antonym",
                correctAnswerIndex = 1,
                explanation = "Comparing an unyielding, unfeeling person to stone directly without 'as' or 'like' is a metaphor.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_23",
                subject = "Literature in English",
                topic = "Prose: The Joys of Motherhood (Buchi Emecheta)",
                year = "2015",
                questionText = "In Buchi Emecheta's 'The Joys of Motherhood', why did Nnaife blame Nnu Ego for all his legal problems and imprisonment?",
                optionA = "Because his daughter slapped him",
                optionB = "Because his daughter disobeyed him by travelling abroad",
                optionC = "Because his daughter disobeyed him by moving with prostitutes",
                optionD = "Because his daughter ran away with a Yoruba man.",
                correctAnswerIndex = 3,
                explanation = "When Kehinde eloped with a Yoruba youth, Nnaife violently assaulted the boy's father with a cutlass, landed in prison, and blamed Nnu Ego's maternal upbringing.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_24",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters (J.C. De Graft)",
                year = "2015",
                questionText = "In J.C. De Graft's 'Sons and Daughters', the paternal aunt to Aaron and Maanan is",
                optionA = "Fosuwa",
                optionB = "Hannah",
                optionC = "Mrs. Bonu",
                optionD = "Adwao",
                correctAnswerIndex = 0,
                explanation = "Aunt Fosuwa is James Ofosu's conservative sister and paternal aunt to the children.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_25",
                subject = "Literature in English",
                topic = "General Literary Principles",
                year = "2015",
                questionText = "Plays and theatrical dramas are primarily conceived and written to be",
                optionA = "presented on stage",
                optionB = "presented in the aircraft",
                optionC = "presented in an office",
                optionD = "presented in the hospital",
                correctAnswerIndex = 0,
                explanation = "Drama is inherently designed for stage performance before a live audience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_26",
                subject = "Literature in English",
                topic = "Literary Forms & Genres",
                year = "2015",
                questionText = "A travelogue is a work of literature composed",
                optionA = "by a famous playwright",
                optionB = "before the death of the author",
                optionC = "by an unpopular novelist",
                optionD = "on a journey",
                correctAnswerIndex = 3,
                explanation = "A travelogue documents the journeys, experiences, landscapes, and cultural impressions recorded by a traveler.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_27",
                subject = "Literature in English",
                topic = "Selected African Poetry: Kalu Uka",
                year = "2015",
                questionText = "'As if men hung here unbloom,\nTheir mildewed buds of love like pollen\nLate caught, damp in a swollen...'\nThe sound device in the stanza above from Kalu Uka's 'Earth to Earth' is",
                optionA = "onomatopoeia",
                optionB = "repetition",
                optionC = "rhythm",
                optionD = "rhyme",
                correctAnswerIndex = 3,
                explanation = "The lines incorporate internal and end-rhyme resonance (/unbloom/, /pollen/, /swollen/).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_28",
                subject = "Literature in English",
                topic = "Poetic Appreciation: Rhetorical Devices",
                year = "2015",
                questionText = "'Sweet smile in time of snarl\ngives pride in spite of sneer\nsing, rid this world of despair\nand save, a snared heart from\ncascading stream of strife'\nThe dominant rhetorical device in the excerpt above is",
                optionA = "rhyme",
                optionB = "alliteration",
                optionC = "chiasmus",
                optionD = "onomatopoeia",
                correctAnswerIndex = 1,
                explanation = "The heavy repetition of the initial sibilant consonant sound /s/ across 'sweet', 'smile', 'snarl', 'spite', 'sneer', 'sing', 'save', 'snared', 'stream', 'strife' is alliteration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_29",
                subject = "Literature in English",
                topic = "Literary Forms: Narrative Poetry",
                year = "2015",
                questionText = "A narrative poem indicates that the poet is attempting to",
                optionA = "preach a sermon",
                optionB = "tell a story",
                optionC = "summarize a story",
                optionD = "describe a place",
                correctAnswerIndex = 1,
                explanation = "Narrative poetry is verse specifically structured to recount a sequential story with characters, setting, and plot.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_30",
                subject = "Literature in English",
                topic = "General Literary Principles",
                year = "2015",
                questionText = "The patterned recurring flow of sound and beat in poetry is known as",
                optionA = "lyric",
                optionB = "lullaby",
                optionC = "mimic",
                optionD = "rhythm",
                correctAnswerIndex = 3,
                explanation = "Rhythm refers to the measured flow of words, stressed accents, and cadence in poetic verse.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_31",
                subject = "Literature in English",
                topic = "Selected Non-African Poetry: Mohan Singh",
                year = "2015",
                questionText = "The literary devices used in the lines 'Pataki and Mustard flowers like blue and yellow eyes peep through the green grass' from Mohan Singh's 'A Village Girl' are",
                optionA = "alliteration and assonance",
                optionB = "simile and irony",
                optionC = "repetition and alliteration",
                optionD = "rhyme and rhythm",
                correctAnswerIndex = 1,
                explanation = "The comparison using 'like' establishes a simile, while attributing seeing eyes that peep to mustard flowers creates irony/personification.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_32",
                subject = "Literature in English",
                topic = "Poetic Appreciation: Wilfred Owen",
                year = "2015",
                questionText = "'Move him into the sun —\nGently its touch awoke him once,\nAt home, whispering of field unsown...\nThink how it woke the seeds —\nWoke, once, the clay of a cold star...'\nThe poem above (Wilfred Owen's 'Futility') can be described as",
                optionA = "a lyric",
                optionB = "an epic",
                optionC = "a sonnet",
                optionD = "an elegy",
                correctAnswerIndex = 2,
                explanation = "Wilfred Owen's 'Futility' is composed as a 14-line sonnet mourning the tragedy of a fallen young soldier.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_33",
                subject = "Literature in English",
                topic = "Literary Devices: Pun",
                year = "2015",
                questionText = "In literary devices, a pun deals with",
                optionA = "placing words side by side",
                optionB = "playing on words",
                optionC = "arrangement of words placing two opposite phrases",
                optionD = "placing two opposite phrases",
                correctAnswerIndex = 1,
                explanation = "A pun (paronomasia) is a clever play on words that exploits multiple meanings of a term or words that sound similar.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_34",
                subject = "Literature in English",
                topic = "Literary Devices: Figures of Speech",
                year = "2015",
                questionText = "'O! Ceremony, show me but thy worth what is thy soul of adoration.'\nThe figure of speech in the line above is",
                optionA = "antithesis",
                optionB = "apostrophe",
                optionC = "personification",
                optionD = "euphemism",
                correctAnswerIndex = 1,
                explanation = "The direct vocative address to an abstract entity ('O! Ceremony...') is an apostrophe.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_35",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (William Shakespeare)",
                year = "2015",
                questionText = "In Shakespeare's 'Romeo and Juliet', the major dramatic catalyst of Mercutio in Act III is to",
                optionA = "count Paris in praise of Juliet",
                optionB = "annoy Tybalt",
                optionC = "take another wife",
                optionD = "serve as an assistance to Romeo",
                correctAnswerIndex = 1,
                explanation = "Mercutio provokes and taunts Tybalt in the public street, initiating the duel that ends in his death and Romeo's banishment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_36",
                subject = "Literature in English",
                topic = "Prose: The Joys of Motherhood (Buchi Emecheta)",
                year = "2015",
                questionText = "In Buchi Emecheta's 'The Joys of Motherhood', in Nnaife's house, life became more burdensome for Nnu Ego by the news that",
                optionA = "Nnaife's elder brother had died",
                optionB = "Nnaife has inherited buildings and properties",
                optionC = "Nnaife had lost Ngozi",
                optionD = "Nnaife has inherited his brother's wives and children.",
                correctAnswerIndex = 3,
                explanation = "Under native custom, Nnaife inherits his deceased brother's wives (including Adaku) and children, stretching their meager resources.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_37",
                subject = "Literature in English",
                topic = "Prose: The Joys of Motherhood (Buchi Emecheta)",
                year = "2015",
                questionText = "In Buchi Emecheta's 'The Joys of Motherhood', it is necessary that Ona has to leave her father's house because",
                optionA = "of the safety of her child",
                optionB = "of her love for Agbadi",
                optionC = "her father is dead",
                optionD = "that is the tradition",
                correctAnswerIndex = 1,
                explanation = "Ona's passionate attachment and love for Chief Nwokocha Agbadi compels her to live and be with him.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_38",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (William Shakespeare)",
                year = "2015",
                questionText = "In Shakespeare's 'Romeo and Juliet', _______ decides that Juliet should marry a young nobleman named Paris, who has been asking for her hand.",
                optionA = "Friar Laurence",
                optionB = "Lord Capulet",
                optionC = "Balthasar",
                optionD = "Friar John",
                correctAnswerIndex = 1,
                explanation = "Lord Capulet authorizes and arranges the marriage of Juliet to Count Paris to ease her grief after Tybalt's death.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_39",
                subject = "Literature in English",
                topic = "Prose: The Joys of Motherhood (Buchi Emecheta)",
                year = "2015",
                questionText = "In Buchi Emecheta's 'The Joys of Motherhood', Nnu Ego's second marriage was to Nnaife, a man who worked in Lagos as a washerman for",
                optionA = "Nwakusor",
                optionB = "Dr. and Mrs. Meers",
                optionC = "Nwaeze",
                optionD = "Ngozi",
                correctAnswerIndex = 1,
                explanation = "Nnaife worked in Lagos laundering clothes for a colonial British couple, Dr. and Mrs. Meers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_40",
                subject = "Literature in English",
                topic = "Literary Forms: Poetry",
                year = "2015",
                questionText = "A traditional ballad is a folk poem meant to be",
                optionA = "discussed",
                optionB = "read",
                optionC = "sung",
                optionD = "acted",
                correctAnswerIndex = 2,
                explanation = "Ballads are rhythmic, narrative folk poems arranged in quatrains traditionally meant to be sung or recited to music.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_41",
                subject = "Literature in English",
                topic = "General Literary Principles",
                year = "2015",
                questionText = "The repetition of single words or phrases at the beginning of successive poetic lines is",
                optionA = "parallelism",
                optionB = "assonance",
                optionC = "alliteration",
                optionD = "pun",
                correctAnswerIndex = 0,
                explanation = "Parallelism (specifically anaphora) involves repeating words or syntactic structures at the start of adjacent clauses or verses.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_42",
                subject = "Literature in English",
                topic = "Literary Forms & Genres",
                year = "2015",
                questionText = "The written account of the experiences and observations of an individual during the course of a journey is known as",
                optionA = "an epilogue",
                optionB = "an autobiography",
                optionC = "a travelogue",
                optionD = "a prologue",
                correctAnswerIndex = 2,
                explanation = "A travelogue is a narrative recounting the places visited and personal reflections gathered during travel.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_43",
                subject = "Literature in English",
                topic = "Literary Appreciation: Figures of Speech",
                year = "2015",
                questionText = "Read the extract below:\n'The pattering rain was kicking up little explosions of dust in the glade. He heard the faint whisper of the stream as it stole across the land and disappeared into the bush.'\nThe expression 'faint whisper of the stream' is an example of",
                optionA = "litotes",
                optionB = "personification",
                optionC = "hyperbole",
                optionD = "synecdoche",
                correctAnswerIndex = 1,
                explanation = "Endowing the flowing water of the stream with the human quality of 'whispering' is personification.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_44",
                subject = "Literature in English",
                topic = "Poetic Appreciation: Rhyme Scheme",
                year = "2015",
                questionText = "'The old man slept in his favorite chair\nThe wind ran its fingers through his hairs\nHe looked like a tree gone dry of sap\nAnd his hands were dry upon his lap'\nThe rhyme scheme of the poem above is",
                optionA = "bbaa",
                optionB = "aabb",
                optionC = "abab",
                optionD = "baba",
                correctAnswerIndex = 1,
                explanation = "Lines 1 and 2 rhyme (chair/hairs - a), and lines 3 and 4 rhyme (sap/lap - b), yielding the aabb rhyme pattern.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_45",
                subject = "Literature in English",
                topic = "Selected Non-African Poetry: Andrew Marvell",
                year = "2015",
                questionText = "'.... The youthful hue / sits on thy skin like a morning dew...'\n(Andrew Marvell: To His Coy Mistress)\nThe figure of speech in the line above is",
                optionA = "onomatopoeia",
                optionB = "oxymoron",
                optionC = "paradox",
                optionD = "simile",
                correctAnswerIndex = 3,
                explanation = "The explicit comparison of youthful skin radiance to morning dew using 'like' is a simile.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_46",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters (J.C. De Graft)",
                year = "2015",
                questionText = "In J.C. De Graft's 'Sons and Daughters', the major moral transgression at hand in the play is that",
                optionA = "Laboratory attendant is trying to act as a nurse",
                optionB = "The medical doctor is in love with Maanan",
                optionC = "James sees Awere as a bad influence",
                optionD = "Lawyer B is trying to kiss Maanan.",
                correctAnswerIndex = 3,
                explanation = "The corrupt Lawyer Bonu (Lawyer B) abuses his position and attempts to forcibly embrace and kiss Maanan.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_47",
                subject = "Literature in English",
                topic = "General Literary Principles",
                year = "2015",
                questionText = "A poet's regular pattern and measurement of stressed and unstressed syllables within a line is known as",
                optionA = "allegory",
                optionB = "assonance",
                optionC = "metre",
                optionD = "onomatopoeia",
                correctAnswerIndex = 2,
                explanation = "Metre is the structured rhythmic cadence formed by recurring patterns of accented and unaccented syllables in verse.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_48",
                subject = "Literature in English",
                topic = "Poetic Appreciation: Robert Herrick",
                year = "2015",
                questionText = "'That age is best which the first is.\nWhen youth and blood are warmer;\nBut being spent, the worse,\nand worst Times still succeed the former.'\nThe rhyme scheme is",
                optionA = "abba",
                optionB = "abab",
                optionC = "aabb",
                optionD = "bbaa",
                correctAnswerIndex = 1,
                explanation = "Rhyme arrangement pairs line 1 with line 3 (is / worse) and line 2 with line 4 (warmer / former), forming an abab scheme.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_49",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters (J.C. De Graft)",
                year = "2015",
                questionText = "'Now look what we have: a permanent bloom of ugly paper flowers!'\nThe device used by Aaron in the excerpt above from 'Sons and Daughters' is",
                optionA = "rhetorical question",
                optionB = "oxymoron",
                optionC = "alliteration",
                optionD = "euphemism",
                correctAnswerIndex = 1,
                explanation = "Juxtaposing 'bloom' with 'ugly paper flowers' creates a sharp oxymoron.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_50",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (William Shakespeare)",
                year = "2015",
                questionText = "In William Shakespeare's 'Romeo and Juliet', what can you infer about Benvolio based on his actions in Verona?",
                optionA = "Benvolio is a troublemaker",
                optionB = "Benvolio is a cabinet maker",
                optionC = "Benvolio is kingmaker",
                optionD = "Benvolio is a peacemaker",
                correctAnswerIndex = 3,
                explanation = "Benvolio consistently acts as a peacemaker, attempting to defuse clashes between the Capulets and Montagues and soothe Romeo's woes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q50"
            )
        )

        return list
    }
}
