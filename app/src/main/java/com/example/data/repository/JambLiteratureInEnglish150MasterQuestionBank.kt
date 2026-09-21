package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Literature in English Authentic Historical Master Question Bank (150 Questions)
 * Covers 2010 - 2018 UTME examination series across Drama, Poetry, Prose, Literary Devices & Appreciation.
 */
object JambLiteratureInEnglish150MasterQuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // JAMB LITERATURE IN ENGLISH 2010 (Questions 1 - 40)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_2010_001",
                subject = "Literature in English",
                topic = "General Examination Protocols",
                year = "2010",
                questionText = "Which literature in English Question Paper Type is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D",
                correctAnswerIndex = 0,
                explanation = "This question refers to the specific question paper booklet type (Type A) assigned to the candidate during the examination.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_002",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2010",
                questionText = "'I simply don't understand what's the matter with everybody today. Everybody let me down', the speaker in the play 'Sons and Daughters' is referring to:",
                optionA = "Fosuwa and Maidservant",
                optionB = "Hannah and George",
                optionC = "Aaron and Maanan",
                optionD = "Lawyer B and Mrs. B",
                correctAnswerIndex = 0,
                explanation = "In J.C. De Graft's play, the frustrated character expresses disappointment over being let down by Fosuwa and the Maidservant.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_003",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2010",
                questionText = "Maanan expresses dislike for Lawyer B because of:",
                optionA = "his condemnation of her choice of career",
                optionB = "his recent advances towards her",
                optionC = "the betrayal of her father's trust",
                optionD = "the betrayal of his wife's trust",
                correctAnswerIndex = 1,
                explanation = "Maanan's strong aversion towards Lawyer B is rooted in his inappropriate and unwanted romantic advances made towards her.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_004",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2010",
                questionText = "The traditional order in the play 'Sons and Daughters' is represented by:",
                optionA = "Mrs. B",
                optionB = "Hannah",
                optionC = "Maanan",
                optionD = "Aunt",
                correctAnswerIndex = 3,
                explanation = "The Aunt represents conservatism and the old traditional social order in the family dynamic of the play.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_005",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2010",
                questionText = "Where does the play 'Sons and Daughters' take place?",
                optionA = "On the street",
                optionB = "In George's place",
                optionC = "In Aunt's house",
                optionD = "In Ofosu's place",
                correctAnswerIndex = 3,
                explanation = "The primary setting and action of the play 'Sons and Daughters' are situated inside Ofosu's residential compound.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_006",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2010",
                questionText = "'O deadly sin! O rude unthankfulness! Thy fault our law calls death, but the kind Prince, Taking thy part, hath rushed aside the law And turned that black word...' Deadly sin refers to:",
                optionA = "suicide of Juliet",
                optionB = "suicide of Romeo",
                optionC = "murder of Paris",
                optionD = "murder of Tybalt",
                correctAnswerIndex = 3,
                explanation = "Friar Lawrence uses these words to rebuke Romeo, referring to the murder of Tybalt which by law carries a penalty of death.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_007",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2010",
                questionText = "Shakespeare's 'Romeo and Juliet' is mostly written in:",
                optionA = "blank verse",
                optionB = "free verse",
                optionC = "metres",
                optionD = "foot",
                correctAnswerIndex = 1,
                explanation = "According to the official examination answer key, the format is identified as free verse (though academically it relies heavily on blank verse/iambic pentameter).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_008",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2010",
                questionText = "'O serpent heart, hid with a flowering face!' The statement refers to:",
                optionA = "Juliet",
                optionB = "Romeo",
                optionC = "Tybalt",
                optionD = "Benvolio",
                correctAnswerIndex = 1,
                explanation = "Juliet utters this paradox about Romeo upon learning that he killed her cousin Tybalt, expressing her inner emotional conflict.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_009",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2010",
                questionText = "The spatial setting of 'Romeo and Juliet' is:",
                optionA = "Athens",
                optionB = "Verona",
                optionC = "Padua",
                optionD = "Venice",
                correctAnswerIndex = 1,
                explanation = "The tragic events of Shakespeare's 'Romeo and Juliet' take place in the Italian city of Verona.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_010",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2010",
                questionText = "Romeo is banished to Mantua because he:",
                optionA = "kills Tybalt in a street duel",
                optionB = "marries Juliet without parental consent",
                optionC = "attends Capulet's party uninvited",
                optionD = "attempts to kill Paris his rival",
                correctAnswerIndex = 0,
                explanation = "Prince Escalus decrees Romeo's banishment to Mantua as punishment for killing Tybalt during their public street duel.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_011",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood",
                year = "2010",
                questionText = "In Buchi Emecheta's 'The Joys of Motherhood', the society puts high value on:",
                optionA = "egalitarianism",
                optionB = "male ascendancy",
                optionC = "procreation",
                optionD = "gender equity",
                correctAnswerIndex = 2,
                explanation = "The traditional Ibuza society highly prioritizes procreation and childbirth as the ultimate measure of a woman's fulfillment and social worth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_012",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood",
                year = "2010",
                questionText = "The medicine man links the lump discovered on the head of Nnu Ego at birth to the:",
                optionA = "possession of physical admirable qualities that makes her an epitome of perfection.",
                optionB = "wound inflicted on the slave woman buried with Agbadi's wife",
                optionC = "coming back of the Agunwa to the society to live again",
                optionD = "ill-luck and tragic events attributed to a predestined fate",
                correctAnswerIndex = 3,
                explanation = "The native doctor attributes Nnu Ego's head lump to the tragic fate and unfortunate events predestined by her personal chi.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_013",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood",
                year = "2010",
                questionText = "The constant companions of Nnaife's family are:",
                optionA = "togetherness and happiness",
                optionB = "poverty and hunger",
                optionC = "sickness and joblessness",
                optionD = "disagreement and humiliation",
                correctAnswerIndex = 1,
                explanation = "Emecheta depicts Nnaife's household in Lagos as constantly struggling under the severe pressure of poverty and lack of food.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_014",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2010",
                questionText = "The disagreement between Mvondo and Nti in 'The Old Man and the Medal' centres on the latter's claim to have:",
                optionA = "assisted Meka in getting the medal",
                optionB = "eaten the entire entrails of a sheep",
                optionC = "eaten more than his share of the food",
                optionD = "been in a white man's office",
                correctAnswerIndex = 2,
                explanation = "Their comic argument arises over allegations that Nti consumed more than his allotted portion of the collective meal.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_015",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2010",
                questionText = "Meka can best be described as:",
                optionA = "an egocentric old man",
                optionB = "a simple-hearted old man",
                optionC = "an impulsive old man",
                optionD = "an old religious bigot",
                correctAnswerIndex = 3,
                explanation = "The examination answer key lists D, indicating how Meka's devout, unquestioning faith in the white man's religion borders on bigotry.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_016",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2010",
                questionText = "In 'The Old Man and the Medal', the colonialists treat the Africans with:",
                optionA = "Kids' gloves",
                optionB = "disdain",
                optionC = "indifference",
                optionD = "honour",
                correctAnswerIndex = 1,
                explanation = "Despite Meka's loyalty and sacrifice, the colonial officers ultimately treat him and other Africans with patronizing contempt and disdain.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_017",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2010",
                questionText = "In George Orwell's 'Nineteen Eighty-four', the Ministry of Peace is concerned with making:",
                optionA = "instruments",
                optionB = "weapons",
                optionC = "wars",
                optionD = "reconciliation",
                correctAnswerIndex = 3,
                explanation = "The official key highlights D as the correct option under Oceania's doublethink framework where names represent paradoxes.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_018",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2010",
                questionText = "The primary subject matter of George Orwell's 'Nineteen Eighty-four' is:",
                optionA = "totalitarian dictatorship",
                optionB = "exploitation and cruelty",
                optionC = "retributive justice",
                optionD = "class segregation",
                correctAnswerIndex = 1,
                explanation = "The novel highlights the extreme exploitation, brutality, and emotional cruelty used by the Party to break down human spirit.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_019",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2010",
                questionText = "How did Winston start his rebellion against the state?",
                optionA = "By engaging in anti-party activities",
                optionB = "By keeping a private diary",
                optionC = "When he started a secret affair",
                optionD = "When he spied on the party",
                correctAnswerIndex = 0,
                explanation = "Winston's first concrete rebellious step starts when he actively participates in thoughtcrime and forbidden personal acts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_020",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2010",
                questionText = "The Party in 'Nineteen Eighty-four' seeks power for:",
                optionA = "the nation",
                optionB = "its own sake",
                optionC = "its members",
                optionD = "peoples' sake",
                correctAnswerIndex = 1,
                explanation = "O'Brien famously explains to Winston that the Party does not seek power for wealth or altruism, but strictly for its own sake.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_021",
                subject = "Literature in English",
                topic = "African Poetry: Naked Soles",
                year = "2010",
                questionText = "As the dancers move through paths strewn with glass chips, the images in Adeoti's 'Naked Soles' change from:",
                optionA = "joy to excitement",
                optionB = "inaction to action",
                optionC = "pain to grief",
                optionD = "sorrow to joy",
                correctAnswerIndex = 3,
                explanation = "The dynamic poetic imagery shifts from the initial hardship and sorrow of the dancers to ultimate triumph and joy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_022",
                subject = "Literature in English",
                topic = "African Poetry: An African Thunderstorm",
                year = "2010",
                questionText = "Rubadiri's 'An African Thunderstorm' states that during a thunderstorm in the village:",
                optionA = "women cook their food",
                optionB = "children play in the rain",
                optionC = "children are delighted while women move in and out",
                optionD = "both women and children are delighted",
                correctAnswerIndex = 2,
                explanation = "The poem contrasts the carefree delight of the children with the anxious, frantic movements of women trying to secure their homes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_023",
                subject = "Literature in English",
                topic = "Poetic Devices: Enjambment",
                year = "2010",
                questionText = "'Yet in their finger upon Our navel The midwives of the spirit say They feel a foetal throb.' The dominant literary device used here is:",
                optionA = "epigram",
                optionB = "allegory",
                optionC = "enjambment",
                optionD = "rhythm",
                correctAnswerIndex = 2,
                explanation = "The lines run into each other without punctuation pauses at the end, representing a clear use of enjambment (run-on lines).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_024",
                subject = "Literature in English",
                topic = "African Poetry: A Heritage of Liberation",
                year = "2010",
                questionText = "In Kunene's 'A Heritage of Liberation', the poet persona requests that the weapons of warfare be handed to their:",
                optionA = "friends",
                optionB = "relations",
                optionC = "grand children",
                optionD = "families",
                correctAnswerIndex = 2,
                explanation = "The persona demands that the weapons used to fight for liberation be preserved and handed down safely to their grandchildren.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_025",
                subject = "Literature in English",
                topic = "Poetic Devices: Paradox",
                year = "2010",
                questionText = "The predominant device in Launko's 'End of the War' is:",
                optionA = "onomatopoeia",
                optionB = "antithesis",
                optionC = "oxymoron",
                optionD = "paradox",
                correctAnswerIndex = 3,
                explanation = "The poem utilizes paradox to highlight the ironies of war, where victor and vanquished suffer similar fates.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_026",
                subject = "Literature in English",
                topic = "Poetry Themes: Give Me The Minstrel's Seat",
                year = "2010",
                questionText = "The theme of the poem 'Give Me The Minstrel's Seat' centres on:",
                optionA = "divorce",
                optionB = "fortune",
                optionC = "marriage",
                optionD = "companionship",
                correctAnswerIndex = 3,
                explanation = "The poem focuses heavily on human relationships, community bonds, and the value of close companionship.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_027",
                subject = "Literature in English",
                topic = "Non-African Poetry: To His Coy Mistress",
                year = "2010",
                questionText = "The poet persona in Marvell's 'To His Coy Mistress' is willing to praise the lady's eyes for:",
                optionA = "thirty thousand years",
                optionB = "six decades",
                optionC = "two centuries",
                optionD = "a century",
                correctAnswerIndex = 3,
                explanation = "Marvell writes: 'An hundred years should go to praise / Thine eyes, and on thy forehead gaze', which represents a century.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_028",
                subject = "Literature in English",
                topic = "Non-African Poetry: Bat",
                year = "2010",
                questionText = "In Lawrence's 'Bat', the poet persona mistakes the bats for:",
                optionA = "owls",
                optionB = "swallows",
                optionC = "pipistrello",
                optionD = "sparrows",
                correctAnswerIndex = 0,
                explanation = "The examination answer key lists A (owls) as the designated option, though the text depicts them flying like swallows initially.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_029",
                subject = "Literature in English",
                topic = "Non-African Poetry: Journey of the Magi",
                year = "2010",
                questionText = "In Eliot's 'Journey of the Magi', the magi are aided on their journey by:",
                optionA = "donkeys",
                optionB = "horses",
                optionC = "camels",
                optionD = "chariots",
                correctAnswerIndex = 2,
                explanation = "The poem mentions 'And the camels galled, sore-footed, refractory', showing they traveled using camels.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_030",
                subject = "Literature in English",
                topic = "Non-African Poetry: Sonnet VII",
                year = "2010",
                questionText = "According to Cope's 'Sonnet VII', poetry is basically:",
                optionA = "boring",
                optionB = "therapeutic",
                optionC = "philosophical",
                optionD = "inspiring",
                correctAnswerIndex = 1,
                explanation = "The sonnet explores the healing, soothing, and therapeutic capacity of written poetry for the human mind.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_031",
                subject = "Literature in English",
                topic = "Literary Genres: Farce",
                year = "2010",
                questionText = "A play which mainly aims at provoking excessive laughter is called:",
                optionA = "tragi-comedy",
                optionB = "comedy",
                optionC = "a farce",
                optionD = "satire",
                correctAnswerIndex = 2,
                explanation = "A farce is a low comedy characterized by exaggerated, improbable situations and physical humor designed to cause loud laughter.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_032",
                subject = "Literature in English",
                topic = "Dramatic Structure: Climax",
                year = "2010",
                questionText = "Both comedy and tragedy must have a:",
                optionA = "happy ending",
                optionB = "climax",
                optionC = "tragic hero",
                optionD = "stanza",
                correctAnswerIndex = 1,
                explanation = "All standard dramatic plots, whether comedic or tragic, require a climax where tension reaches its highest point.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_033",
                subject = "Literature in English",
                topic = "Literary Forms: Eulogy",
                year = "2010",
                questionText = "A formal, dignified speech or writing praising a person for past or present deeds is:",
                optionA = "premiere",
                optionB = "eulogy",
                optionC = "anthology",
                optionD = "lampoon",
                correctAnswerIndex = 1,
                explanation = "A eulogy is a speech or piece of writing highly praising someone, typically someone who has recently died or retired.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_034",
                subject = "Literature in English",
                topic = "Narrative Techniques: First-Person Point of View",
                year = "2010",
                questionText = "The narrative style in which the hero tells his own story directly is:",
                optionA = "objective",
                optionB = "subjective",
                optionC = "first-person",
                optionD = "third-person",
                correctAnswerIndex = 2,
                explanation = "First-person point of view is characterized by the use of 'I' or 'we', where the narrator directly recounts their own experiences.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_035",
                subject = "Literature in English",
                topic = "Elements of Prose: Setting",
                year = "2010",
                questionText = "The physical, historical, or cultural background of a literary work is referred to as:",
                optionA = "episode",
                optionB = "plot",
                optionC = "time",
                optionD = "setting",
                correctAnswerIndex = 3,
                explanation = "Setting defines the total environment, including geographic location, historical period, and cultural background of a narrative.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_036",
                subject = "Literature in English",
                topic = "Plot Structure: Organic Plot",
                year = "2010",
                questionText = "A plot structure that completely defies chronological progression can be described as:",
                optionA = "open-ended",
                optionB = "circular",
                optionC = "episodic",
                optionD = "organic",
                correctAnswerIndex = 3,
                explanation = "The official key marks D, indicating a highly integrated plot structure where events unfold naturally rather than in strict linear timeline.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_037",
                subject = "Literature in English",
                topic = "Literary Devices: Pun",
                year = "2010",
                questionText = "Pun as a literary device deals with:",
                optionA = "placing two opposite phrases",
                optionB = "placing words side by side",
                optionC = "playing on words",
                optionD = "arrangement of words",
                correctAnswerIndex = 2,
                explanation = "A pun is a humorous play on words that exploit multiple meanings of a term or of similar-sounding words.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_038",
                subject = "Literature in English",
                topic = "Poetic Forms: Narrative Poetry",
                year = "2010",
                questionText = "In a narrative poem, the poet attempts to:",
                optionA = "summarize a story",
                optionB = "describe a place",
                optionC = "preach a sermon",
                optionD = "tell a story",
                correctAnswerIndex = 3,
                explanation = "Narrative poetry is a form of poetry that tells a full story, complete with characters, plot, and conflict.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_039",
                subject = "Literature in English",
                topic = "Prose Forms: Travelogue",
                year = "2010",
                questionText = "The written account of experiences of an individual during the course of a journey is known as:",
                optionA = "a travelogue",
                optionB = "an autobiography",
                optionC = "a catalogue",
                optionD = "a memoir",
                correctAnswerIndex = 0,
                explanation = "A travelogue is a lecture, slide show, or written account describing travels, experiences, and observations of a traveler.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_040",
                subject = "Literature in English",
                topic = "Literary Devices: Irony & Satire",
                year = "2010",
                questionText = "Satirical writing primarily employs:",
                optionA = "epigram",
                optionB = "synecdoche",
                optionC = "irony",
                optionD = "onomatopoeia",
                correctAnswerIndex = 2,
                explanation = "Irony is the primary vehicle of satire, exposing human folly and vices by stating the opposite of what is actually meant.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q40"
            )
        )

        // =========================================================================
        // JAMB LITERATURE IN ENGLISH 2011 (Questions 41 - 60)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_2011_041",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2011",
                questionText = "In J. C. De Graft's 'Sons and Daughters', from its resolution of conflicts, the play can be described as:",
                optionA = "tragedy",
                optionB = "comedy",
                optionC = "farce",
                optionD = "melodrama",
                correctAnswerIndex = 1,
                explanation = "Because the conflicts are successfully resolved happily and peace is restored, the play concludes as a classic comedy.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_042",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2011",
                questionText = "The prevailing theme of J.C. De Graft's 'Sons and Daughters' is:",
                optionA = "love",
                optionB = "affluence",
                optionC = "social decadence",
                optionD = "self-will",
                correctAnswerIndex = 3,
                explanation = "The play focuses heavily on self-will and independence, as the youth fight for their own career and life decisions against parental pressure.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_043",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2011",
                questionText = "The final harassment of Maanan takes place in:",
                optionA = "Ofosu's office",
                optionB = "Lawyer B's house",
                optionC = "Lawyer B's chamber",
                optionD = "Ofosu's house",
                correctAnswerIndex = 3,
                explanation = "The crucial scene where Maanan is trapped and confronted by Lawyer B occurs within Ofosu's family home.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_044",
                subject = "Literature in English",
                topic = "Drama: Character Mood & Tone",
                year = "2011",
                questionText = "'Everything in this room outrages my sense of beauty, undermines my will to create pictures of lasting appeal.' The speaker is:",
                optionA = "happy",
                optionB = "frustrated",
                optionC = "excited",
                optionD = "tired",
                correctAnswerIndex = 1,
                explanation = "The speaker expresses artistic frustration and resentment over the uninspiring and ugly environment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_045",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2011",
                questionText = "'Farewell – God knows when we shall meet again. I have a faint cold fear thrills through my veins... Come, vial.' The intention of the speaker is to:",
                optionA = "commit suicide",
                optionB = "take a temporary harmful substance",
                optionC = "escape from harsh realities of life",
                optionD = "seek comfort",
                correctAnswerIndex = 1,
                explanation = "Juliet drinks the sleeping potion (a temporary, coma-inducing substance) prepared by Friar Lawrence to avoid marrying Paris.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_046",
                subject = "Literature in English",
                topic = "Dramatic Structure: Denouement",
                year = "2011",
                questionText = "'Romeo and Juliet' reaches its point of denouement:",
                optionA = "at the family feast",
                optionB = "when Romeo kills Paris at the tomb",
                optionC = "at the reconciliation of the feuding families",
                optionD = "when Romeo is informed of Juliet's death",
                correctAnswerIndex = 2,
                explanation = "The denouement or final resolution occurs when the Capulets and Montagues agree to end their ancient feud over their children's graves.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_047",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2011",
                questionText = "The tragic news of Juliet's death is broken to Romeo in Mantua by:",
                optionA = "Balthasar",
                optionB = "Friar Lawrence",
                optionC = "Boy",
                optionD = "Friar John",
                correctAnswerIndex = 0,
                explanation = "Romeo's servant Balthasar travels to Mantua to report that he saw Juliet being laid to rest in her family's tomb.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_048",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2011",
                questionText = "In 'Romeo and Juliet', Mercutio can be described as:",
                optionA = "fraudulent",
                optionB = "quarrelsome",
                optionC = "gentle",
                optionD = "kind-hearted",
                correctAnswerIndex = 1,
                explanation = "Mercutio is quick-witted, hot-headed, and quarrelsome, readily engaging in clashes and duels with the Capulets.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_049",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2011",
                questionText = "The heavy downpour on the night of Meka's investiture in 'The Old Man and the Medal' symbolizes:",
                optionA = "revelation",
                optionB = "mockery",
                optionC = "conviction",
                optionD = "blessing",
                correctAnswerIndex = 1,
                explanation = "The rain acts as a natural element of mockery, washing away Meka's temporary glory and leaving him stranded and humiliated.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_050",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2011",
                questionText = "Vandermayer's attitude and action towards Meka illustrates the colonial church's:",
                optionA = "despondency",
                optionB = "suspicion",
                optionC = "infuriation",
                optionD = "hypocrisy",
                correctAnswerIndex = 3,
                explanation = "Father Vandermayer treats Meka warmly in public but acts with deep-seated racial prejudice and hypocrisy behind closed doors.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q50"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_051",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood",
                year = "2011",
                questionText = "In Buchi Emecheta's 'The Joys of Motherhood', Nnaife was jailed for attempted murder for:",
                optionA = "four months",
                optionB = "three months",
                optionC = "five months",
                optionD = "two months",
                correctAnswerIndex = 0,
                explanation = "The official key indicates that Nnaife was sentenced to a prison term of four months for his violent outburst.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q51"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_052",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood",
                year = "2011",
                questionText = "In 'The Joys of Motherhood', Nwokocha Agbadi is famous for his oratorical powers and:",
                optionA = "height",
                optionB = "treachery",
                optionC = "illiteracy",
                optionD = "wealth",
                correctAnswerIndex = 3,
                explanation = "Nwokocha Agbadi is portrayed as a highly influential, handsome, wealthy chief who commands massive respect.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q52"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_053",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2011",
                questionText = "George Orwell's 'Nineteen Eighty-Four' draws a vivid picture of:",
                optionA = "a useless past",
                optionB = "a totalitarian future",
                optionC = "an unstable moment",
                optionD = "a peaceful atmosphere",
                correctAnswerIndex = 1,
                explanation = "Orwell's masterpiece is a dystopian warning projecting a terrifying, high-tech totalitarian future under Big Brother.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q53"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_054",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2011",
                questionText = "Room 101 in 'Nineteen Eighty-Four' symbolizes a place of:",
                optionA = "rest",
                optionB = "fun",
                optionC = "humiliation",
                optionD = "torture",
                correctAnswerIndex = 3,
                explanation = "Room 101 in the Ministry of Love is the ultimate torture chamber containing each prisoner's absolute worst personal nightmare.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q54"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_055",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2011",
                questionText = "The tone of George Orwell's 'Nineteen Eighty-Four' is:",
                optionA = "optimistic",
                optionB = "antagonistic",
                optionC = "persuasive",
                optionD = "pessimistic",
                correctAnswerIndex = 3,
                explanation = "The novel's conclusion, where Winston's spirit is crushed and he surrenders to Big Brother, represents an extremely pessimistic outlook.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q55"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_056",
                subject = "Literature in English",
                topic = "African Poetry: Naked Soles",
                year = "2011",
                questionText = "In 'Naked Soles', Adeoti writes that the carnival of naked soles dances through:",
                optionA = "scorching sun",
                optionB = "a dirty room",
                optionC = "blooming thorns",
                optionD = "a cloudy atmosphere",
                correctAnswerIndex = 2,
                explanation = "The dancers' journey through 'blooming thorns' represents painful struggles and survival against oppressive systems.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q56"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_057",
                subject = "Literature in English",
                topic = "African Poetry: An African Thunderstorm",
                year = "2011",
                questionText = "In Rubadiri's 'An African Thunderstorm', the thunderstorm begins with:",
                optionA = "rain from the west",
                optionB = "clouds from the east",
                optionC = "rain from the east",
                optionD = "clouds from the west",
                correctAnswerIndex = 3,
                explanation = "The opening stanza describes: 'From the west / Clouds come hurrying with the wind', initiating the storm.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q57"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_058",
                subject = "Literature in English",
                topic = "African Poetry: In the Navel of the Soul",
                year = "2011",
                questionText = "The theme of Acquah's 'In the Navel of the Soul' is:",
                optionA = "the conflict of traditions",
                optionB = "ensuring that traditions were strictly observed",
                optionC = "the futility of man and his tradition",
                optionD = "the strength in diversity of culture and traditional views",
                correctAnswerIndex = 0,
                explanation = "The poem explores the complex internal tension and conflict between modern Christian dogmas and native cultural traditions.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q58"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_059",
                subject = "Literature in English",
                topic = "Non-African Poetry: To His Coy Mistress",
                year = "2011",
                questionText = "Marvell, in 'To His Coy Mistress' uses the imagery of death to:",
                optionA = "appreciate God's power",
                optionB = "underscore life's transience",
                optionC = "condemn the lady",
                optionD = "scare the lady",
                correctAnswerIndex = 1,
                explanation = "Marvell invokes the inevitability of the grave ('then worms shall try / That long preserved virginity') to emphasize the brevity of human life.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q59"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_060",
                subject = "Literature in English",
                topic = "Poetic Devices: Suspense",
                year = "2011",
                questionText = "To sustain the interest of readers in 'Bat', Lawrence uses:",
                optionA = "elision",
                optionB = "hyperbole",
                optionC = "suspense",
                optionD = "oxymoron",
                correctAnswerIndex = 2,
                explanation = "Lawrence keeps the reader in suspense by delaying the direct identification of the flying creatures until they are revealed as bats.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q60"
            )
        )

        // =========================================================================
        // JAMB LITERATURE IN ENGLISH 2012 (Questions 61 - 80)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_2012_061",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2012",
                questionText = "Who is the paternal aunt to Aaron and Maanan in 'Sons and Daughters'?",
                optionA = "Mrs Bonu",
                optionB = "Hannah",
                optionC = "Fosuwa",
                optionD = "Adwoa",
                correctAnswerIndex = 2,
                explanation = "Aunt Fosuwa is the conservative, traditional paternal aunt who intervenes in Ofosu's domestic affairs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q61"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_062",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2012",
                questionText = "In J.C. De Graft's 'Sons and Daughters', George is a:",
                optionA = "laboratory assistant",
                optionB = "pharmacist",
                optionC = "nurse",
                optionD = "medical doctor",
                correctAnswerIndex = 1,
                explanation = "George's professional background and scientific education are in the field of pharmacy.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q62"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_063",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2012",
                questionText = "'If you touch me, I shall smash your face with this bottle.' This statement is made by:",
                optionA = "Maanan to Lawyer B",
                optionB = "Maanan to Mrs Bonu",
                optionC = "James to Awere",
                optionD = "Awere to Aaron",
                correctAnswerIndex = 0,
                explanation = "Maanan fiercely utters this defensive threat to ward off Lawyer B's predatory sexual advances in Ofosu's house.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q63"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_064",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2012",
                questionText = "'From forth the fatal loins of these two foes / A pair of star-crossed lovers take their life...' These lines suggest that the tragedy in 'Romeo and Juliet' is:",
                optionA = "could have been averted",
                optionB = "is predestined",
                optionC = "is brought on enmity",
                optionD = "brought misfortune on the lovers",
                correctAnswerIndex = 1,
                explanation = "The prologue's description of 'star-crossed' lovers indicates that their tragic fate was written in the stars and predestined.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q64"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_065",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2012",
                questionText = "'O she doth teach the torches to burn bright! It seems she hangs upon the cheek of night / A rich jewel in an Ethiop's ear.' From these lines, Juliet's beauty is presented as:",
                optionA = "in contrast to the dark night",
                optionB = "as a source of envy to all",
                optionC = "in terms of riches",
                optionD = "as being outstanding",
                correctAnswerIndex = 3,
                explanation = "Romeo's hyperbole describes Juliet's beauty as exceptionally radiant and outstanding compared to everything around her.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q65"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_066",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2012",
                questionText = "The major role of Mercutio in the play 'Romeo and Juliet' is to:",
                optionA = "serve as a contrast to Romeo",
                optionB = "aid and abet Romeo's passion",
                optionC = "annoy Tybalt",
                optionD = "accompany Romeo to Friar Lawrence",
                correctAnswerIndex = 0,
                explanation = "Mercutio's pragmatic, cynical, and highly skeptical view of love serves as a direct foil (contrast) to Romeo's deep romanticism.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q66"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_067",
                subject = "Literature in English",
                topic = "Dramatic Techniques: The Chorus",
                year = "2012",
                questionText = "The play 'Romeo and Juliet' shares the feature of classical tragedy through the use of:",
                optionA = "violence on stage",
                optionB = "chorus",
                optionC = "comic relief",
                optionD = "flashback",
                correctAnswerIndex = 1,
                explanation = "The use of an introductory Chorus to announce major events and deliver the prologue aligns the play with classical Greek tragedy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q67"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_068",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2012",
                questionText = "Meka, Kelara, Amalia, and her husband kneeling down signifies:",
                optionA = "parade",
                optionB = "dance",
                optionC = "prayer",
                optionD = "celebration",
                correctAnswerIndex = 2,
                explanation = "Their posture of kneeling in their rural home represents a solemn family prayer and devotion.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q68"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_069",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2012",
                questionText = "In 'The Old Man and the Medal', the description of feet with twisted toes pointing to the sky refers to:",
                optionA = "Kelara",
                optionB = "Meka",
                optionC = "Egamba",
                optionD = "Mvondo",
                correctAnswerIndex = 1,
                explanation = "This passage describes the physically weathered and hardworking feet of the protagonist, Meka.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q69"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_070",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood",
                year = "2012",
                questionText = "As a symbol of material success and fulfillment, the Ibuza community places importance on:",
                optionA = "childbirth",
                optionB = "wealth",
                optionC = "male child",
                optionD = "female child",
                correctAnswerIndex = 0,
                explanation = "In 'The Joys of Motherhood', the local community views abundant childbirth as the ultimate proof of a successful, blessed life.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q70"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_071",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood",
                year = "2012",
                questionText = "On her deathbed, Ona appeals to Agbadi to:",
                optionA = "give her a befitting burial",
                optionB = "take good care of her children",
                optionC = "take another wife",
                optionD = "allow Nnu Ego marry a man of her choice",
                correctAnswerIndex = 3,
                explanation = "Ona's dying wish is for Agbadi to guarantee their daughter Nnu Ego the freedom to marry for love and choice.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q71"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_072",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2012",
                questionText = "Winston writes in his private diary that the hope of Oceania lies in the:",
                optionA = "ministry of truth",
                optionB = "proles",
                optionC = "party",
                optionD = "children",
                correctAnswerIndex = 1,
                explanation = "Winston believes that only the 'proles' (proletariat), who make up 85% of the population, have the numbers to overthrow the Party.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q72"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_073",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2012",
                questionText = "In George Orwell's 'Nineteen Eighty-Four', the 'Two Minutes Hate' is a programme designed for:",
                optionA = "parents",
                optionB = "thought police",
                optionC = "the community",
                optionD = "children",
                correctAnswerIndex = 2,
                explanation = "The Party organizes the daily 'Two Minutes Hate' for the entire community to direct their anger towards state enemies like Goldstein.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q73"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_074",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2012",
                questionText = "Winston is subjected to forms of torture and inhuman treatment to drop his philosophy by:",
                optionA = "O'Brien",
                optionB = "thought police",
                optionC = "Big Brother",
                optionD = "Goldstein",
                correctAnswerIndex = 0,
                explanation = "O'Brien acts as Winston's torturer and interrogator inside the Ministry of Love, systematically breaking his mind and body.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q74"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_075",
                subject = "Literature in English",
                topic = "Non-African Poetry: Bat",
                year = "2012",
                questionText = "In Lawrence's 'Bat', the poet compares bats with:",
                optionA = "sparrows",
                optionB = "swans",
                optionC = "swallows",
                optionD = "crows",
                correctAnswerIndex = 2,
                explanation = "Lawrence contrasts bats with swallows, describing swallows as beautiful birds of light, while bats are creepy symbols of darkness.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q75"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_076",
                subject = "Literature in English",
                topic = "Non-African Poetry: The Journey of the Magi",
                year = "2012",
                questionText = "Eliot's 'The Journey of the Magi' could be said to examine the issue of:",
                optionA = "three trees on the low sky",
                optionB = "empty wine-skins",
                optionC = "spiritual rebirth",
                optionD = "holy pilgrimage",
                correctAnswerIndex = 2,
                explanation = "The journey of the Magi represents a difficult spiritual transition from their old pagan customs to a new spiritual rebirth.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q76"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_077",
                subject = "Literature in English",
                topic = "Literary Devices: Allegory",
                year = "2012",
                questionText = "A literary work in which the characters and events are used as symbols is known as:",
                optionA = "characterization",
                optionB = "allegory",
                optionC = "metaphor",
                optionD = "parallelism",
                correctAnswerIndex = 1,
                explanation = "An allegory is a story, poem, or picture that can be interpreted to reveal a hidden moral, political, or spiritual meaning.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q77"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_078",
                subject = "Literature in English",
                topic = "Dramatic Devices: Aside",
                year = "2012",
                questionText = "In theater, words spoken by a character that are heard by the audience but not other characters are called:",
                optionA = "aside",
                optionB = "soliloquy",
                optionC = "acoustic",
                optionD = "tone",
                correctAnswerIndex = 0,
                explanation = "An aside is a brief remark delivered directly to the audience while other actors remain on stage, supposedly unaware.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q78"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_079",
                subject = "Literature in English",
                topic = "Literary Genres: Drama",
                year = "2012",
                questionText = "A literary genre which directly imitates human action on stage is:",
                optionA = "drama",
                optionB = "comedy",
                optionC = "prose",
                optionD = "poetry",
                correctAnswerIndex = 0,
                explanation = "Drama is defined as a literary genre intended to be performed by actors on stage, directly imitating human interactions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q79"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_080",
                subject = "Literature in English",
                topic = "Literary Devices: Caricature",
                year = "2012",
                questionText = "The main aim of a caricature is to:",
                optionA = "describe",
                optionB = "expose",
                optionC = "emphasize",
                optionD = "ridicule",
                correctAnswerIndex = 3,
                explanation = "A caricature is a representation of a person where certain features are grossly exaggerated to mock or ridicule them.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q80"
            )
        )

        // =========================================================================
        // JAMB LITERATURE IN ENGLISH 2013 (Questions 81 - 100)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_2013_081",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2013",
                questionText = "'Let me swear, woman. And I will swear by my father's coffin...' These lines depict James as a:",
                optionA = "traditionalist",
                optionB = "Christian",
                optionC = "pagan",
                optionD = "Muslim",
                correctAnswerIndex = 0,
                explanation = "Swearing by a father's coffin shows James's adherence to traditional values and ancestral respect.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q81"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_082",
                subject = "Literature in English",
                topic = "Literary Devices: Personification",
                year = "2013",
                questionText = "'All I need really is a place in an Art school, engineering can go hang itself.' The dominant figure of speech is:",
                optionA = "metonymy",
                optionB = "synecdoche",
                optionC = "personification",
                optionD = "metaphor",
                correctAnswerIndex = 2,
                explanation = "Saying that 'engineering can go hang itself' attributes human actions (hanging oneself) to an inanimate discipline.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q82"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_083",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters",
                year = "2013",
                questionText = "In 'Sons and Daughters', the character of Aaron represents:",
                optionA = "painters",
                optionB = "art work",
                optionC = "new generation",
                optionD = "old generation",
                correctAnswerIndex = 2,
                explanation = "Aaron's rebellion to pursue his passion in fine arts represents the aspirations of the modern, new generation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q83"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_084",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2013",
                questionText = "'Uncle, this is a Montague, our foe; A villain that is hither come in spite, To scorn at our solemnity this night.' Tybalt is referring to Romeo:",
                optionA = "attempting to steal",
                optionB = "attending a feast uninvited",
                optionC = "engaging in a shouting match",
                optionD = "holding a sword",
                correctAnswerIndex = 1,
                explanation = "Tybalt is outraged because Romeo, a Montague, has entered the Capulets' private feast without an invitation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q84"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_085",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2013",
                questionText = "'What, drawn and talk of peace? I hate the word / As I hate hell, all Montagues, and thee.' These lines reveal Tybalt as a:",
                optionA = "violence seeker",
                optionB = "peace maker",
                optionC = "real Montague",
                optionD = "trouble shooter",
                correctAnswerIndex = 0,
                explanation = "Tybalt's fierce words and immediate attack highlight his violent, confrontational, and bloodthirsty character.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q85"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_086",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2013",
                questionText = "Romeo's mood at the start of the play 'Romeo and Juliet' can be described as:",
                optionA = "melancholic and sentimental",
                optionB = "dreamy and hopeful",
                optionC = "frustrated and pensive",
                optionD = "gay and elated",
                correctAnswerIndex = 0,
                explanation = "Romeo begins the play in a deeply melancholic, sentimental mood due to his unrequited love for Rosaline.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q86"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_087",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Romeo and Juliet",
                year = "2013",
                questionText = "'O deadly sin! O rude unthankfulness! ... and turned that black word death to banishment.' The speaker is:",
                optionA = "Lord Montague",
                optionB = "Friar Lawrence",
                optionC = "Apothecary",
                optionD = "Lord Capulet",
                correctAnswerIndex = 1,
                explanation = "Friar Lawrence says this to Romeo, urging him to show gratitude because the Prince chose banishment over execution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q87"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_088",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2013",
                questionText = "In 'The Old Man and the Medal', what does Meka get as a privilege for his sacrifices to the church?",
                optionA = "appointed into the church elders' council",
                optionB = "the privilege to choose a permanent place to sit",
                optionC = "a place near an aged leper",
                optionD = "a land to build a new house",
                correctAnswerIndex = 1,
                explanation = "As a token of appreciation, Meka is granted the special privilege of choosing his own permanent seat in the church.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q88"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_089",
                subject = "Literature in English",
                topic = "African Prose: The Old Man and the Medal",
                year = "2013",
                questionText = "To the white men, the medal given to Meka symbolizes:",
                optionA = "harmonious relationship",
                optionB = "love",
                optionC = "peace",
                optionD = "friendship",
                correctAnswerIndex = 3,
                explanation = "The administration presents the medal to Meka to symbolize the colonial government's supposed 'friendship' with natives.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q89"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_090",
                subject = "Literature in English",
                topic = "African Prose: The Joys of Motherhood",
                year = "2013",
                questionText = "In 'The Joys of Motherhood', Nnu Ego is blamed for the misfortunes of her:",
                optionA = "parents",
                optionB = "husband",
                optionC = "siblings",
                optionD = "children",
                correctAnswerIndex = 1,
                explanation = "Nnu Ego is constantly blamed by her husband Nnaife and his family for their financial struggles and bad luck.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q90"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_091",
                subject = "Literature in English",
                topic = "Non-African Prose: Nineteen Eighty-Four",
                year = "2013",
                questionText = "In 'Nineteen Eighty-Four', the Ministry of Love is concerned with:",
                optionA = "peace and freedom",
                optionB = "torture and pain",
                optionC = "joy and peace",
                optionD = "hatred and pain",
                correctAnswerIndex = 1,
                explanation = "The Ministry of Love is the state organ responsible for torture, beatings, and psychological re-education.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q91"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_092",
                subject = "Literature in English",
                topic = "Non-African Poetry: To His Coy Mistress",
                year = "2013",
                questionText = "'Time winged chariot' from Marvell's 'To His Coy Mistress' depicts:",
                optionA = "how fast time flies",
                optionB = "the usefulness of time",
                optionC = "the measurement of time",
                optionD = "how fast events unfold",
                correctAnswerIndex = 0,
                explanation = "This classic metaphor illustrates the swift, unstoppable, and terrifying flight of time.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q92"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_093",
                subject = "Literature in English",
                topic = "Narrative Techniques: Flashback",
                year = "2013",
                questionText = "The literary device in which a writer recalls a past event in a work is:",
                optionA = "interlude",
                optionB = "anti-climax",
                optionC = "flashback",
                optionD = "foreshadowing",
                correctAnswerIndex = 2,
                explanation = "A flashback is an administrative narrative device that interrupts the chronological order to show past events.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q93"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_094",
                subject = "Literature in English",
                topic = "Poetic Structure: Stanza",
                year = "2013",
                questionText = "A paragraph in prose is equivalent in poetry to a:",
                optionA = "trope",
                optionB = "verse",
                optionC = "stanza",
                optionD = "meter",
                correctAnswerIndex = 2,
                explanation = "A stanza is a grouped set of lines within a poem, acting similarly to a paragraph in a prose work.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q94"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_095",
                subject = "Literature in English",
                topic = "Literary Genres: Satire",
                year = "2013",
                questionText = "A literary work that ridicules the shortcomings of people or ideas is a:",
                optionA = "masque",
                optionB = "satire",
                optionC = "irony",
                optionD = "fable",
                correctAnswerIndex = 1,
                explanation = "Satire is a literary genre that uses humor, irony, and ridicule to expose and criticize people's stupidity or vices.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q95"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_096",
                subject = "Literature in English",
                topic = "Dramatic Techniques: Mime",
                year = "2013",
                questionText = "An action without speech in a play is called:",
                optionA = "soliloquy",
                optionB = "aside",
                optionC = "epilogue",
                optionD = "mime",
                correctAnswerIndex = 3,
                explanation = "Mime or pantomime refers to the theatrical technique of suggesting action, character, or emotion strictly through gesture and movement without words.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q96"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_097",
                subject = "Literature in English",
                topic = "Dramatic Concepts: Tragic Flaw",
                year = "2013",
                questionText = "A mistake committed by the hero which leads to his downfall is known as:",
                optionA = "comic relief",
                optionB = "tragic flaw",
                optionC = "climax",
                optionD = "hubris",
                correctAnswerIndex = 1,
                explanation = "A tragic flaw (or hamartia) is the specific personality defect or error in judgment that causes a protagonist's ruin.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q97"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_098",
                subject = "Literature in English",
                topic = "Dramatic Devices: Soliloquy",
                year = "2013",
                questionText = "The speech made by a character directly to himself on stage is a:",
                optionA = "monologue",
                optionB = "epilogue",
                optionC = "aside",
                optionD = "soliloquy",
                correctAnswerIndex = 3,
                explanation = "A soliloquy is an act of speaking one's thoughts aloud when alone on stage, revealing inner feelings to the audience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q98"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_099",
                subject = "Literature in English",
                topic = "Metaphysical Poetry: The Sun Rising",
                year = "2013",
                questionText = "'Busy old fool, unruly sun, / Why dost thou thus... through windows call on us?' The poet sees the sun as:",
                optionA = "a necessary evil",
                optionB = "a light provider",
                optionC = "illumination after darkness",
                optionD = "an unnecessary evil",
                correctAnswerIndex = 3,
                explanation = "Donne's speaker mockingly views the sun as an intrusive, annoying, and unnecessary interrupter of his intimate morning.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q99"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2013_100",
                subject = "Literature in English",
                topic = "Literary Devices: Parallelism",
                year = "2013",
                questionText = "'Will college make you a better Olokun priest? Did I go to college?' This is a speech from osifo's 'Dizzy Angel' representing:",
                optionA = "simile",
                optionB = "parallelism",
                optionC = "onomatopoeia",
                optionD = "metaphor",
                correctAnswerIndex = 1,
                explanation = "The repetitive syntax and parallel structure of the rhetorical questions demonstrate grammatical and rhetorical parallelism.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2013 • Q100"
            )
        )

        // =========================================================================
        // JAMB LITERATURE IN ENGLISH 2014 (Questions 101 - 115)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_2014_101",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2014",
                questionText = "In Femi Osofisan's 'Women of Owu', the gods are portrayed as:",
                optionA = "helpless",
                optionB = "architects of man's destiny",
                optionC = "amorous",
                optionD = "saviours of mankind",
                correctAnswerIndex = 1,
                explanation = "Anlugbua and other deities are depicted as the supreme forces who actively orchestrate the tragic collapse and fate of Owu.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q101"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_102",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2014",
                questionText = "Orisaye describes Balogun Kusa as:",
                optionA = "a great warrior",
                optionB = "an enemy and a butcher",
                optionC = "a friend in need",
                optionD = "a good leader",
                correctAnswerIndex = 1,
                explanation = "The visionary Orisaye condemns Balogun Kusa, labeling him as a ruthless, bloodthirsty butcher of innocent people.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q102"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_103",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2014",
                questionText = "In 'Women of Owu', Erelu is:",
                optionA = "the oldest wife of Oba Akinjobi",
                optionB = "a courtier to the Alaafin of Oyo",
                optionC = "the most brilliant woman in Owu",
                optionD = "the first wife of the Oba",
                correctAnswerIndex = 3,
                explanation = "Erelu Adeyinka is the queen mother and first wife of the Oba, serving as the symbolic leader of the Owu women.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q103"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_104",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2014",
                questionText = "In William Shakespeare's 'The Tempest', Ariel is identified as:",
                optionA = "leader of the spirits",
                optionB = "Prospero's daughter",
                optionC = "Alonso's wife",
                optionD = "assistant to Sycorax",
                correctAnswerIndex = 0,
                explanation = "Ariel is a powerful, airy spirit bound to Prospero's service, who leads the other magical spirits on the island.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q104"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_105",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2014",
                questionText = "Before the shipwreck, Prospero and his daughter Miranda have lived on the island for:",
                optionA = "two decades",
                optionB = "twelve years",
                optionC = "forty days",
                optionD = "eighteen months",
                correctAnswerIndex = 1,
                explanation = "Prospero tells Miranda that they arrived on the island exactly twelve years prior to the events of the play.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q105"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_106",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2014",
                questionText = "Caliban's intention to rape Miranda is born out of the desire to:",
                optionA = "destroy the island",
                optionB = "compete with Ferdinand",
                optionC = "populate the island with Calibans",
                optionD = "marry her",
                correctAnswerIndex = 2,
                explanation = "Caliban shamelessly boasts that if Prospero hadn't stopped him, he would have covered the island with his own offspring.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q106"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_107",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2014",
                questionText = "The character associated with absolute savagery and primitive nature in 'The Tempest' is:",
                optionA = "Ariel",
                optionB = "Stephano",
                optionC = "Caliban",
                optionD = "Ferdinand",
                correctAnswerIndex = 2,
                explanation = "Caliban represents the 'savage and deformed slave' whose physical and social attributes link him to raw, untamed nature.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q107"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_108",
                subject = "Literature in English",
                topic = "African Prose: A Woman in Her Prime",
                year = "2014",
                questionText = "Asare Konadu's 'A Woman in Her Prime' explores the central theme of:",
                optionA = "exploitation of the African woman",
                optionB = "sex discrimination in Ghana",
                optionC = "women liberation in Nigeria",
                optionD = "child quest of an African woman",
                correctAnswerIndex = 3,
                explanation = "The novel centers on Pokuwaa's agonizing, desperate struggle and rituals to conceive and bear a child.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q108"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_109",
                subject = "Literature in English",
                topic = "African Prose: A Woman in Her Prime",
                year = "2014",
                questionText = "According to 'A Woman in Her Prime', the worst social calamity that can befall an African woman is:",
                optionA = "inability to bear male children",
                optionB = "inability to marry",
                optionC = "divorce",
                optionD = "barrenness",
                correctAnswerIndex = 3,
                explanation = "Barrenness is depicted as a deeply agonizing condition that brings social stigma, mockery, and marital instability.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q109"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_110",
                subject = "Literature in English",
                topic = "African Prose: Purple Hibiscus",
                year = "2014",
                questionText = "In Chimamanda Adichie's 'Purple Hibiscus', one of the changes Father Benedict introduces into St. Agnes' church is:",
                optionA = "there must be fasting every month",
                optionB = "the Credo must be recited in Igbo",
                optionC = "the Kyrie must be rendered only in Latin",
                optionD = "everyone must take holy communion",
                correctAnswerIndex = 2,
                explanation = "Father Benedict enforces strict traditional European standards, insisting that the Kyrie be chanted exclusively in Latin.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q110"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_111",
                subject = "Literature in English",
                topic = "African Prose: Purple Hibiscus",
                year = "2014",
                questionText = "Eugene Achike in 'Purple Hibiscus' is portrayed as:",
                optionA = "a soft and gentle husband",
                optionB = "an uncompromising traditionalist",
                optionC = "a fanatical Catholic adherent",
                optionD = "a tough retired soldier",
                correctAnswerIndex = 2,
                explanation = "Papa Eugene is a highly devout, fanatical Catholic who imposes extreme religious rules and physical punishments on his family.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q111"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_112",
                subject = "Literature in English",
                topic = "Non-African Prose: The Old Man and the Sea",
                year = "2014",
                questionText = "In Ernest Hemingway's 'The Old Man and the Sea', the type of fish caught by Santiago after days of effort is a:",
                optionA = "shark",
                optionB = "iris",
                optionC = "marlin",
                optionD = "geisha",
                correctAnswerIndex = 2,
                explanation = "Santiago hooks and fights a massive, beautiful marlin that measures eighteen feet in length.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q112"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_113",
                subject = "Literature in English",
                topic = "Non-African Prose: The Old Man and the Sea",
                year = "2014",
                questionText = "'The Old Man and the Sea' primarily demonstrates:",
                optionA = "the attempt to catch fish",
                optionB = "the desire to understand life",
                optionC = "the influence of the sea on man",
                optionD = "the struggle of man against defeat",
                correctAnswerIndex = 3,
                explanation = "Santiago's famous declaration, 'man is not made for defeat', represents the central theme of human resilience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q113"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_114",
                subject = "Literature in English",
                topic = "Literary Devices: Apostrophe",
                year = "2014",
                questionText = "The sun in Donne's 'The Sun Rising' is personified and addressed through the use of:",
                optionA = "invocation",
                optionB = "ellipsis",
                optionC = "enjambment",
                optionD = "apostrophe",
                correctAnswerIndex = 3,
                explanation = "The poet addresses the sun directly as a living person ('Busy old fool, unruly sun'), utilizing rhetorical apostrophe.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q114"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2014_115",
                subject = "Literature in English",
                topic = "Dramatic Concepts: Catharsis",
                year = "2014",
                questionText = "The purgation of pity and fear at the end of a tragedy is known as:",
                optionA = "epilogue",
                optionB = "exposition",
                optionC = "catharsis",
                optionD = "catastrophe",
                correctAnswerIndex = 2,
                explanation = "Aristotelian catharsis describes the emotional release, cleansing, and purification experienced by the audience of a tragedy.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q115"
            )
        )

        // =========================================================================
        // JAMB LITERATURE IN ENGLISH 2015 (Questions 116 - 120)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_2015_116",
                subject = "Literature in English",
                topic = "African Poetry: Hard Lines",
                year = "2015",
                questionText = "In Adeoti's 'Hard Lines', Sodium cyanide is described as:",
                optionA = "poisonous",
                optionB = "adhesive",
                optionC = "sweet",
                optionD = "fragrant",
                correctAnswerIndex = 0,
                explanation = "Sodium cyanide is a highly toxic, lethal chemical compound, serving as a metaphor for destructive political policies.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q116"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_117",
                subject = "Literature in English",
                topic = "African Poetry: Homeless, not Hopeless",
                year = "2015",
                questionText = "In Owonibi's 'Homeless, not Hopeless', the persona explains that street beggars are primarily concerned with:",
                optionA = "always worrying about heaven",
                optionB = "attending conferences in towns",
                optionC = "their daily needs",
                optionD = "rarely sleeping and dreaming",
                correctAnswerIndex = 2,
                explanation = "The beggars focus strictly on immediate survival, securing food, and their basic day-to-day material needs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q117"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_118",
                subject = "Literature in English",
                topic = "Dramatic Structure: Episodic Plot",
                year = "2015",
                questionText = "A play in which the acts succeed one another without probable or necessary chronological sequence is:",
                optionA = "episodic",
                optionB = "simple",
                optionC = "linear",
                optionD = "convoluted",
                correctAnswerIndex = 0,
                explanation = "An episodic plot is constructed around a series of loosely connected chapters or scenes rather than tight causal links.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q118"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_119",
                subject = "Literature in English",
                topic = "Character Types: Eponymous Character",
                year = "2015",
                questionText = "A character whose name is used as the title of the literary text is an:",
                optionA = "antagonist",
                optionB = "round character",
                optionC = "eponymous character",
                optionD = "flat character",
                correctAnswerIndex = 2,
                explanation = "An eponymous protagonist (such as Macbeth or Hamlet) shares their name directly with the title of the work.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q119"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2015_120",
                subject = "Literature in English",
                topic = "Poetic Forms: Pastoral Poetry",
                year = "2015",
                questionText = "A form of writing in which a poet writes with nostalgia about simple, peaceful village life is:",
                optionA = "ballad",
                optionB = "romance",
                optionC = "epic",
                optionD = "pastoral",
                correctAnswerIndex = 3,
                explanation = "Pastoral literature romanticizes rural life, sheepherding, and the peaceful, unspoiled simplicity of the countryside.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q120"
            )
        )

        // =========================================================================
        // JAMB LITERATURE IN ENGLISH 2016 (Questions 121 - 130)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_2016_121",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2016",
                questionText = "In Frank Ogbeche's 'Harvest of Corruption', the 'babe' who is to be dangled before the Chief for a job refers to:",
                optionA = "Ogeyi",
                optionB = "Alice",
                optionC = "Ochuole",
                optionD = "Aloho",
                correctAnswerIndex = 3,
                explanation = "Ochuole and her accomplices conspire to use the unsuspecting, naive Aloho as bait to curry favor and contracts from Chief Ade Amaka.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q121"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_122",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2016",
                questionText = "The central urban setting of Frank Ogbeche's 'Harvest of Corruption' is:",
                optionA = "Mabu",
                optionB = "Gbossa",
                optionC = "Darkin",
                optionD = "Jabu",
                correctAnswerIndex = 3,
                explanation = "The corrupt administrative actions and political drama of the play are centered inside the fictional city of Jabu.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q122"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_123",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2016",
                questionText = "Chief Ade Amaka is heavily involved in which of the following criminal enterprises?",
                optionA = "Child trafficking",
                optionB = "Land grabbing",
                optionC = "Smuggling and drug trafficking",
                optionD = "Rigging",
                correctAnswerIndex = 2,
                explanation = "Chief Ade Amaka's massive, illegal fortune is built on large-scale smuggling, money laundering, and drug trafficking.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q123"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_124",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2016",
                questionText = "In William Shakespeare's 'Othello', Othello kills Desdemona primarily because:",
                optionA = "he is jealous and manipulated",
                optionB = "his race is insulted",
                optionC = "she is a witch",
                optionD = "she betrayed her state",
                correctAnswerIndex = 0,
                explanation = "Othello is driven to a murderous rage by Iago's relentless manipulation and fabricated proof of Desdemona's infidelity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q124"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_125",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2016",
                questionText = "Brabantio is strongly opposed to the relationship between Othello and Desdemona because:",
                optionA = "he prefers Iago",
                optionB = "Othello is a Moor",
                optionC = "Roderigo wooed her first",
                optionD = "Desdemona is too young",
                correctAnswerIndex = 1,
                explanation = "Brabantio's opposition is rooted in racial prejudice, viewing Othello as a foreign Moor who must have used black magic to win his daughter.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q125"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_126",
                subject = "Literature in English",
                topic = "African Prose: Faceless",
                year = "2016",
                questionText = "In Amma Darko's 'Faceless', the name of Kabria's husband is:",
                optionA = "Kwei",
                optionB = "Kpakpo",
                optionC = "Adade",
                optionD = "Ottu",
                correctAnswerIndex = 1,
                explanation = "Kabria is married to Kpakpo, a lazy, irresponsible husband who fails to support his family.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q126"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_127",
                subject = "Literature in English",
                topic = "African Prose: Faceless",
                year = "2016",
                questionText = "The character described as being 'both a child and an adult' in 'Faceless' is:",
                optionA = "Fofo",
                optionB = "Baby T.",
                optionC = "Odarley",
                optionD = "Obea",
                correctAnswerIndex = 0,
                explanation = "Fofo has been forced by the harsh life of Accra's streets to mature rapidly, showing a mixture of childlike vulnerability and adult survival skills.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q127"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_128",
                subject = "Literature in English",
                topic = "African Prose: Lonely Days",
                year = "2016",
                questionText = "In Bayo Adebowale's 'Lonely Days', widows in mourning wear garments that are:",
                optionA = "red",
                optionB = "black",
                optionC = "white",
                optionD = "dull",
                correctAnswerIndex = 3,
                explanation = "Widows are forced by custom to wear coarse, uncomfortable, and dull-colored garments as a physical sign of their bereavement.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q128"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_129",
                subject = "Literature in English",
                topic = "African Prose: Lonely Days",
                year = "2016",
                questionText = "In 'Lonely Days', the 'bage' cap signifies everlasting:",
                optionA = "happiness",
                optionB = "sorrow",
                optionC = "freedom",
                optionD = "despair",
                correctAnswerIndex = 1,
                explanation = "The bage cap is a traditional cultural symbol worn by male elders to signify deep, permanent mourning and sorrow.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q129"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2016_130",
                subject = "Literature in English",
                topic = "Non-African Prose: Native Son",
                year = "2016",
                questionText = "In Richard Wright's 'Native Son', Bigger Thomas burns Mary's body in the:",
                optionA = "toilet",
                optionB = "basement furnace",
                optionC = "backyard",
                optionD = "wardrobe",
                correctAnswerIndex = 1,
                explanation = "To destroy the evidence of her accidental death, Bigger decapitates Mary's body and burns it inside the Dalton family's coal furnace.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q130"
            )
        )

        // =========================================================================
        // JAMB LITERATURE IN ENGLISH 2017 (Questions 131 - 140)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_2017_131",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2017",
                questionText = "Aloho in 'Harvest of Corruption' perceives her pregnancy out of wedlock as a form of:",
                optionA = "reward",
                optionB = "blessing",
                optionC = "punishment",
                optionD = "injustice",
                correctAnswerIndex = 2,
                explanation = "Aloho views her tragic pregnancy by the corrupt Chief as a terrible moral punishment and shame upon her family.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q131"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2017_132",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2017",
                questionText = "According to Ochuole, a government job is primarily:",
                optionA = "a waste of time",
                optionB = "time consuming",
                optionC = "good for hardworking youths",
                optionD = "an avenue to personalize public funds",
                correctAnswerIndex = 3,
                explanation = "Ochuole's corrupt worldview leads her to view civil service not as a public duty, but as a direct channel to embezzle state funds.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q132"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2017_133",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2017",
                questionText = "In 'Othello', the words 'She is abused, stol'n from me and corrupted...' are spoken by:",
                optionA = "Brabantio",
                optionB = "Roderigo",
                optionC = "Iago",
                optionD = "Duke of Venice",
                correctAnswerIndex = 0,
                explanation = "Brabantio cries out these accusations before the Venetian Senate, claiming Othello drugged and stole Desdemona.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q133"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2017_134",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2017",
                questionText = "'All's One-Good faith, how foolish are our minds! If I do die before thee, prithee, shroud me / In one of those same sheets.' This plea is made by:",
                optionA = "Desdemona to Emilia",
                optionB = "Othello to Iago",
                optionC = "Iago to Emilia",
                optionD = "Cassio to Bianca",
                correctAnswerIndex = 0,
                explanation = "Desdemona has a dark premonition of her death and requests Emilia to wrap her body in her wedding sheets should she die.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q134"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2017_135",
                subject = "Literature in English",
                topic = "Literary Devices: Allusion",
                year = "2017",
                questionText = "'Sodom and Gomorrah' used in Amma Darko's 'Faceless' is an example of:",
                optionA = "mixed metaphor",
                optionB = "allusion",
                optionC = "synecdoche",
                optionD = "euphemism",
                correctAnswerIndex = 1,
                explanation = "The novel uses 'Sodom and Gomorrah' as a biblical allusion to describe the extreme moral degradation and decay of Accra's slums.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q135"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2017_136",
                subject = "Literature in English",
                topic = "African Prose: Faceless",
                year = "2017",
                questionText = "Amma Darko's 'Faceless' primarily focuses on:",
                optionA = "stubborn children",
                optionB = "negligent parents and street children",
                optionC = "greedy politicians",
                optionD = "peer group influence",
                correctAnswerIndex = 1,
                explanation = "The novel highlights the plight of street children and exposes how parental neglect drives youth onto dangerous streets.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q136"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2017_137",
                subject = "Literature in English",
                topic = "African Prose: Lonely Days",
                year = "2017",
                questionText = "In Bayo Adebowale's 'Lonely Days', 'Labankada' represents:",
                optionA = "wealth and peace",
                optionB = "wealth and life",
                optionC = "wealth and prosperity",
                optionD = "wealth and protection",
                correctAnswerIndex = 2,
                explanation = "Labankada is a traditional expression of celebration representing material wealth, abundance, and family prosperity.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q137"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2017_138",
                subject = "Literature in English",
                topic = "African Prose: Lonely Days",
                year = "2017",
                questionText = "The widows in Kufi are united by their common loss of:",
                optionA = "love",
                optionB = "family",
                optionC = "fame and wealth",
                optionD = "dignity and social status",
                correctAnswerIndex = 3,
                explanation = "Adebowale shows how widows are stripped of their dignity and social standing, uniting them in shared cultural oppression.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q138"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2017_139",
                subject = "Literature in English",
                topic = "Prose Styles: Descriptive Writing",
                year = "2017",
                questionText = "'Light flooded the room and revealed a black boy standing...' This stylistic passage is:",
                optionA = "narrative",
                optionB = "dramatic",
                optionC = "descriptive",
                optionD = "expository",
                correctAnswerIndex = 2,
                explanation = "The passage relies heavily on imagery and physical adjectives, representing descriptive writing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q139"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2017_140",
                subject = "Literature in English",
                topic = "Non-African Prose: Native Son",
                year = "2017",
                questionText = "Mr. Dalton is of the opinion that Negroes are happier when they are:",
                optionA = "together",
                optionB = "kept as servants in white households",
                optionC = "educated",
                optionD = "given respect",
                correctAnswerIndex = 1,
                explanation = "Mr. Dalton represents patronizing white liberalism, believing black people are happiest in subordinate, segregated roles.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q140"
            )
        )

        // =========================================================================
        // JAMB LITERATURE IN ENGLISH 2018 (Questions 141 - 150)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_2018_141",
                subject = "Literature in English",
                topic = "African Drama: Wives Revolt",
                year = "2018",
                questionText = "In J.P. Clark's 'Wives Revolt', the central idea is that gender equality is:",
                optionA = "both undesirable and unattainable",
                optionB = "desirable but unattainable",
                optionC = "attainable and desirable",
                optionD = "obnoxious but desirable",
                correctAnswerIndex = 2,
                explanation = "The play's resolution argues that equal respect and rights between genders are both attainable and highly desirable for communal progress.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q141"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_142",
                subject = "Literature in English",
                topic = "African Drama: Wives Revolt",
                year = "2018",
                questionText = "In their flight from the village, the women in 'Wives Revolt' settle at:",
                optionA = "Iyara",
                optionB = "Benin",
                optionC = "Warri",
                optionD = "Sapele",
                correctAnswerIndex = 0,
                explanation = "The protesting wives stage a collective walkout and relocate temporarily to the neighboring town of Iyara.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q142"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_143",
                subject = "Literature in English",
                topic = "African Drama: Wives Revolt",
                year = "2018",
                questionText = "'...Great Orators in the assembly, and poor nannies at home.' Those being ridiculed here are:",
                optionA = "husbands",
                optionB = "old-women",
                optionC = "wives",
                optionD = "spinsters",
                correctAnswerIndex = 0,
                explanation = "This line mocks the hypocritical village husbands who talk loudly in public assemblies but fail to care for their own homes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q143"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_144",
                subject = "Literature in English",
                topic = "African Drama: Wives Revolt",
                year = "2018",
                questionText = "The mutual exchange of structured poetic abuse in J.P. Clark's 'Wives Revolt' is reminiscent of:",
                optionA = "Ikaki",
                optionB = "Udje",
                optionC = "Etiyeri",
                optionD = "Ekpe",
                correctAnswerIndex = 1,
                explanation = "The satirical battle of words between the characters borrows heavily from the traditional Urhobo 'Udje' performance art.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q144"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_145",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2018",
                questionText = "In 'Othello', when Iago says 'Let him do his spite...', the 'him' refers to:",
                optionA = "Brabantio",
                optionB = "Cassio",
                optionC = "Roderigo",
                optionD = "Duke of Venice",
                correctAnswerIndex = 0,
                explanation = "Othello is confident that his valuable military service to Venice will outweigh Brabantio's personal anger and complaints.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q145"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_146",
                subject = "Literature in English",
                topic = "Poetic Forms: Light Verse",
                year = "2018",
                questionText = "The poem 'To a Bed-Bug' by Mbure is a good example of a:",
                optionA = "limerick",
                optionB = "lampoon",
                optionC = "light verse",
                optionD = "light opera",
                correctAnswerIndex = 2,
                explanation = "The poem uses a playful, humorous, and informal style to address a trivial household pest, qualifying as light verse.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q146"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_147",
                subject = "Literature in English",
                topic = "African Poetry: To a Bed-Bug",
                year = "2018",
                questionText = "The poet persona in 'To a Bed-Bug' expresses dismay about:",
                optionA = "bats",
                optionB = "bed-bugs",
                optionC = "grasshoppers",
                optionD = "spiders",
                correctAnswerIndex = 1,
                explanation = "The speaker complains about parasitic bed-bugs that interrupt sweet dreams to suck blood from their head.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q147"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_148",
                subject = "Literature in English",
                topic = "Poetic Devices: Personification",
                year = "2018",
                questionText = "The most dominant figure of speech in 'To a Bed-Bug' is:",
                optionA = "metaphor",
                optionB = "simile",
                optionC = "personification",
                optionD = "hyperbole",
                correctAnswerIndex = 2,
                explanation = "The speaker addresses the bed-bug directly as 'awful parasites' and attributes calculated human plans to them.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q148"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_149",
                subject = "Literature in English",
                topic = "Poetic Devices: Symbolism",
                year = "2018",
                questionText = "'The drums overwhelmed the guns' from J.P. Clark's 'Casualties' uses:",
                optionA = "litotes",
                optionB = "symbolism",
                optionC = "onomatopoeia",
                optionD = "alliteration",
                correctAnswerIndex = 1,
                explanation = "The drums symbolize traditional African identity and communication, while the guns symbolize destructive modern warfare.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q149"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2018_150",
                subject = "Literature in English",
                topic = "Literary Idioms & Inferences",
                year = "2018",
                questionText = "'This thing you are doing is too heavy for you... I have killed many many more years in this world.' It can be inferred that:",
                optionA = "listener is wise",
                optionB = "speaker is a porter",
                optionC = "listener is more experienced",
                optionD = "speaker is more experienced",
                correctAnswerIndex = 3,
                explanation = "The idiom 'killing many years' means living for a long time, showing that the older speaker has more life experience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2018 • Q150"
            )
        )

        return list
    }
}
