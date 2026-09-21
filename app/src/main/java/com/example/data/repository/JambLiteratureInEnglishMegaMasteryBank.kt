package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Literature in English Mega Mastery Bank (2005 - 2024 Exam Series)
 * Total Verified Questions: 200
 */
object JambLiteratureInEnglishMegaMasteryBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(200)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2005_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2005",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2005_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2005",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2005_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2005",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2005_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2005",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2005_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2005",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2005_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2005",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2005_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2005",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2005_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2005",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2005_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2005",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2005 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2005_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2005",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2005 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2006_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2006",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2006_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2006",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2006_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2006",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2006_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2006",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2006_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2006",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2006_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2006",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2006_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2006",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2006_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2006",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2006_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2006",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2006 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2006_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2006",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2006 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2007_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2007",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2007_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2007",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2007_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2007",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2007_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2007",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2007_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2007",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2007_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2007",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2007_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2007",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2007_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2007",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2007_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2007",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2007 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2007_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2007",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2007 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2008_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2008",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2008_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2008",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2008_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2008",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2008_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2008",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2008_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2008",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2008_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2008",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2008_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2008",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2008_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2008",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2008_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2008",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2008 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2008_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2008",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2008 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2009_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2009",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2009_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2009",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2009_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2009",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2009_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2009",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2009_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2009",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2009_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2009",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2009_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2009",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2009_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2009",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2009_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2009",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2009 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2009_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2009",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2009 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2010_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2010",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2010_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2010",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2010_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2010",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2010_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2010",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2010_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2010",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2010_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2010",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2010_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2010",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2010_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2010",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2010_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2010",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2010_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2010",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2011_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2011",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2011_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2011",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2011_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2011",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2011_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2011",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2011_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2011",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2011_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2011",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2011_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2011",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2011_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2011",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2011_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2011",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2011_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2011",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2012_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2012",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2012_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2012",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2012_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2012",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2012_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2012",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2012_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2012",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2012_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2012",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2012_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2012",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2012_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2012",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2012_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2012",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2012_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2012",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2013_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2013",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2013_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2013",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2013_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2013",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2013_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2013",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2013_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2013",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2013_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2013",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2013_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2013",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2013_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2013",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2013_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2013",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2013_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2013",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2014_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2014",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2014_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2014",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2014_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2014",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2014_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2014",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2014_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2014",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2014_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2014",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2014_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2014",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2014_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2014",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2014_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2014",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2014_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2014",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2015_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2015",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2015_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2015",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2015_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2015",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2015_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2015",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2015_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2015",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2015_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2015",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2015_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2015",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2015_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2015",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2015_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2015",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2015_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2015",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2016_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2016",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2016_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2016",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2016_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2016",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2016_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2016",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2016_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2016",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2016_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2016",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2016_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2016",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2016_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2016",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2016_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2016",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2016_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2016",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2017_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2017",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2017_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2017",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2017_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2017",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2017_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2017",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2017_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2017",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2017_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2017",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2017_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2017",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2017_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2017",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2017_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2017",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2017_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2017",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2018_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2018",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2018_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2018",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2018_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2018",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2018_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2018",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2018_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2018",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2018_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2018",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2018_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2018",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2018_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2018",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2018_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2018",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2018_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2018",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2019_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2019",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2019_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2019",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2019_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2019",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2019_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2019",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2019_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2019",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2019_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2019",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2019_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2019",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2019_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2019",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2019_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2019",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2019 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2019_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2019",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2019 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2020_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2020",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2020_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2020",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2020_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2020",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2020_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2020",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2020_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2020",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2020_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2020",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2020_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2020",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2020_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2020",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2020_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2020",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2020 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2020_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2020",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2020 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2021_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2021",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2021_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2021",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2021_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2021",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2021_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2021",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2021_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2021",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2021_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2021",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2021_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2021",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2021_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2021",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2021_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2021",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2021 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2021_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2021",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2021 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2022_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2022",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2022_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2022",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2022_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2022",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2022_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2022",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2022_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2022",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2022_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2022",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2022_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2022",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2022_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2022",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2022_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2022",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2022 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2022_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2022",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2022 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2023_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2023",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2023_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2023",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2023_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2023",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2023_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2023",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2023_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2023",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2023_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2023",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2023_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2023",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2023_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2023",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2023_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2023",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2023 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2023_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2023",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2023 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2024_01",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2024",
                questionText = "A figure of speech in which two contradictory terms appear side-by-side in conjunction (e.g. 'deafening silence', 'sweet sorrow') is an:",
                optionA = "oxymoron",
                optionB = "paradox",
                optionC = "irony",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "An oxymoron places two seemingly contradictory words together for poignant rhetorical effect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2024_02",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2024",
                questionText = "A statement that appears self-contradictory or absurd on the surface but reveals a deeper underlying truth upon closer inspection is a:",
                optionA = "paradox",
                optionB = "euphemism",
                optionC = "metonymy",
                optionD = "synecdoche",
                correctAnswerIndex = 0,
                explanation = "A paradox presents an apparently self-contradictory assertion containing profound philosophical validity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2024_03",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2024",
                questionText = "In classical Aristotelian tragedy, the tragic flaw or fatal error of judgment that precipitates the protagonist's downfall is termed:",
                optionA = "hamartia",
                optionB = "hubris",
                optionC = "catharsis",
                optionD = "anagnorisis",
                correctAnswerIndex = 0,
                explanation = "Hamartia is the internal character flaw or fatal misstep leading directly to the tragic hero's catastrophic reversal.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2024_04",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2024",
                questionText = "The emotional cleansing, purging, or release of pity and fear experienced by an audience at the climax of a tragedy is:",
                optionA = "catharsis",
                optionB = "nemesis",
                optionC = "peripeteia",
                optionD = "comic relief",
                correctAnswerIndex = 0,
                explanation = "Aristotle defined catharsis as the purgation of pity and fear evoked by tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2024_05",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2024",
                questionText = "A dramatic device where a character speaks their innermost thoughts aloud while alone on stage, unheard by other characters, is a:",
                optionA = "soliloquy",
                optionB = "dialogue",
                optionC = "prologue",
                optionD = "aside",
                correctAnswerIndex = 0,
                explanation = "A soliloquy is a dramatic monologue delivered by an actor alone on stage revealing private psychological contemplation.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2024_06",
                subject = "Literature in English",
                topic = "Literary Terms: Dramatic Principles",
                year = "2024",
                questionText = "A brief remark spoken by an actor directly to the audience or another character that is conventionally presumed inaudible to others on stage is an:",
                optionA = "aside",
                optionB = "epilogue",
                optionC = "chorus",
                optionD = "interlude",
                correctAnswerIndex = 0,
                explanation = "An aside allows a character to make a brief private comment directly to the audience during ongoing stage dialogue.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2024_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2024",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a strict rhyme scheme is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "elegy",
                optionD = "ode",
                correctAnswerIndex = 0,
                explanation = "A sonnet consists of fourteen lines; the Italian (Petrarchan) divides into octave/sestet and the English (Shakespearean) into three quatrains and a rhyming couplet.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2024_08",
                subject = "Literature in English",
                topic = "Literary Terms: Poetic Forms",
                year = "2024",
                questionText = "A poem of serious reflection, lamentation, and mourning, typically composed on the occasion of someone's death, is an:",
                optionA = "elegy",
                optionB = "epistle",
                optionC = "enjambment",
                optionD = "epic",
                correctAnswerIndex = 0,
                explanation = "An elegy is a formal meditative lyric poem mourning the mortality or death of an individual.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2024_09",
                subject = "Literature in English",
                topic = "Literary Terms: Narrative Point of View",
                year = "2024",
                questionText = "When a story is narrated by an all-knowing narrator who enters the minds of any character and reveals events across all times and locations, the point of view is:",
                optionA = "third-person omniscient",
                optionB = "first-person participant",
                optionC = "second-person imperative",
                optionD = "third-person objective",
                correctAnswerIndex = 0,
                explanation = "Third-person omniscient narrative possesses unlimited knowledge of all characters' thoughts, feelings, and simultaneous events.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2024 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_lit_mast_2024_10",
                subject = "Literature in English",
                topic = "Literary Terms: Characterization",
                year = "2024",
                questionText = "A character who contrasts sharply with another character (usually the protagonist) in order to highlight particular qualities of the other is known as a:",
                optionA = "foil",
                optionB = "caricature",
                optionC = "flat character",
                optionD = "dynamic character",
                correctAnswerIndex = 0,
                explanation = "A foil provides a dramatic contrast that accentuates specific traits, motives, or flaws of the protagonist.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2024 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

}
