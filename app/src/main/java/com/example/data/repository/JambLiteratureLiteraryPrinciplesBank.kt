package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB UTME Comprehensive Bank on General Literary Principles,
 * Poetic Forms, Figures of Speech, Dramatic Devices, and Literary Appreciation (2010 - 2018).
 */
object JambLiteratureLiteraryPrinciplesBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "lit_prin_01",
                subject = "Literature in English",
                topic = "General Literary Principles: Dramatic Forms",
                year = "2010",
                questionText = "A dramatic work whose primary objective is to provoke uncontrollable laughter through ridiculous, exaggerated situations and improbable character antics is a:",
                optionA = "tragicomedy",
                optionB = "high comedy",
                optionC = "farce",
                optionD = "burlesque satire",
                correctAnswerIndex = 2,
                explanation = "A farce is a low comedy characterized by broad physical humor, ludicrous improbable situations, and absurd characters.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2010 Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_02",
                subject = "Literature in English",
                topic = "General Literary Principles: Eulogy",
                year = "2010",
                questionText = "A formal dignified speech or piece of writing praising a person or deceased individual for outstanding past virtues and deeds is a:",
                optionA = "premiere",
                optionB = "eulogy / panegyric",
                optionC = "lampoon",
                optionD = "anthology",
                correctAnswerIndex = 1,
                explanation = "A eulogy (or panegyric) is a laudatory tribute in honor of someone, often delivered at a funeral or celebration of life.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2010 Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_03",
                subject = "Literature in English",
                topic = "General Literary Principles: Point of View",
                year = "2010",
                questionText = "The narrative perspective where the hero directly recounts the events using the personal pronoun 'I' or 'We' is:",
                optionA = "omniscient objective",
                optionB = "third-person limited",
                optionC = "first-person participant narrative",
                optionD = "stream of consciousness third-person",
                correctAnswerIndex = 2,
                explanation = "A first-person point of view presents the story through the narrator's direct voice and personal experience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2010 Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_04",
                subject = "Literature in English",
                topic = "General Literary Principles: Figures of Speech",
                year = "2010",
                questionText = "A rhetorical pun is a device that relies on:",
                optionA = "placing two opposing phrases side by side",
                optionB = "a deliberate humorous play on words with multiple meanings or similar sounds",
                optionC = "substituting the part for the whole",
                optionD = "harsh grammatical inversion",
                correctAnswerIndex = 1,
                explanation = "A pun (paronomasia) exploits words that sound alike or have multiple distinct definitions for humorous or provocative effect.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2010 Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_05",
                subject = "Literature in English",
                topic = "General Literary Principles: Prose Genres",
                year = "2010",
                questionText = "A detailed literary account documenting the personal experiences and reflections of a traveler during an expedition or journey is known as a:",
                optionA = "travelogue",
                optionB = "biography",
                optionC = "catalogue",
                optionD = "hagiography",
                correctAnswerIndex = 0,
                explanation = "A travelogue is a narrative account of travel, describing people, culture, and landscapes visited.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2010 Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_06",
                subject = "Literature in English",
                topic = "General Literary Principles: Poetic Metre",
                year = "2011",
                questionText = "A standard line of verse consisting of five metrical feet, each having one unstressed syllable followed by one stressed syllable (da-DUM da-DUM da-DUM da-DUM da-DUM), is called:",
                optionA = "trochaic tetrameter",
                optionB = "dactylic hexameter",
                optionC = "iambic pentameter",
                optionD = "anapestic heptameter",
                correctAnswerIndex = 2,
                explanation = "Iambic pentameter consists of five (penta) iambs (unstressed-stressed foot), totaling ten syllables.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2011 Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_07",
                subject = "Literature in English",
                topic = "General Literary Principles: Dramatic Terms",
                year = "2011",
                questionText = "A stage performance or dramatic portrayal conducted entirely through bodily movement, gestures, and facial expressions without spoken words is:",
                optionA = "monologue",
                optionB = "soliloquy",
                optionC = "aside",
                optionD = "mime (or pantomime)",
                correctAnswerIndex = 3,
                explanation = "Mime is the theatrical art of storytelling and emotional expression using solely non-verbal physical movements.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2011 Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_08",
                subject = "Literature in English",
                topic = "General Literary Principles: Tragic Hero",
                year = "2013",
                questionText = "The fatal personality flaw, error of judgment, or vulnerability in a tragic protagonist that precipitates their ultimate catastrophe is called:",
                optionA = "comic relief",
                optionB = "deus ex machina",
                optionC = "climax",
                optionD = "tragic flaw (hamartia)",
                correctAnswerIndex = 3,
                explanation = "Hamartia or tragic flaw is the internal defect (such as Macbeth's vaulting ambition or Othello's gullible jealousy) leading to downfall.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2013 Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_09",
                subject = "Literature in English",
                topic = "General Literary Principles: Aristotelian Drama",
                year = "2014",
                questionText = "In Aristotle's Poetics, the psychological and emotional purgation, cleansing, or release of pity and terror experienced by the audience of a tragedy is:",
                optionA = "anagnorisis",
                optionB = "peripeteia",
                optionC = "catharsis",
                optionD = "hubris",
                correctAnswerIndex = 2,
                explanation = "Catharsis refers to the emotional release and moral purification evoked in spectators by watching tragic drama.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2014 Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_10",
                subject = "Literature in English",
                topic = "General Literary Principles: Poetic Enjambment",
                year = "2016",
                questionText = "The poetic technique in which a sentence or grammatical clause runs over from one line of verse into the next without terminal punctuation is called:",
                optionA = "enjambment (run-on line)",
                optionB = "end-stopped line",
                optionC = "caesura",
                optionD = "refrain",
                correctAnswerIndex = 0,
                explanation = "Enjambment occurs when a syntactic unit continues across line boundaries without an end punctuation pause.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2016 Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_11",
                subject = "Literature in English",
                topic = "General Literary Principles: Characterization",
                year = "2016",
                questionText = "In literary fiction, a 'round character' (as defined by E.M. Forster in Aspects of the Novel) is one who:",
                optionA = "remains static and unchanging throughout the story",
                optionB = "displays complex, multi-dimensional psychology and undergoes dynamic growth",
                optionC = "embodies a single predictable stereotype",
                optionD = "acts as an unimportant background extra",
                correctAnswerIndex = 1,
                explanation = "Round characters are multi-faceted, complex, capable of surprising the reader convincingly, and develop dynamically.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2016 Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_prin_12",
                subject = "Literature in English",
                topic = "General Literary Principles: Allegory",
                year = "2018",
                questionText = "A complete narrative in prose or verse where characters, events, and settings systematically represent deeper abstract moral, religious, or political concepts is an:",
                optionA = "anecdote",
                optionB = "allegory (e.g. Orwell's Animal Farm)",
                optionC = "monologue",
                optionD = "epigram",
                correctAnswerIndex = 1,
                explanation = "An allegory operates on two levels: the literal story and a continuous symbolic subtext conveying profound truths.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature Principles • 2018 Q1"
            )
        )

        return list
    }
}
