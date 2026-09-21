package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Literature in English Master Revision Bank Volume 2 - Part 1 (Questions 1 - 100)
 * Authentic historical UTME questions with comprehensive pedagogical explanations.
 */
object JambLiteratureInEnglishMasterRevisionVol2Part1QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // Questions 1 to 50 (2014 Series)
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_001",
                subject = "Literature in English",
                topic = "General Examination Protocols",
                year = "2014",
                questionText = "Which Literature-in-English Question Paper Type was given to you?",
                optionA = "Type F",
                optionB = "Type S",
                optionC = "Type L",
                optionD = "Type D",
                correctAnswerIndex = 3,
                explanation = "This question refers to the specific question paper booklet code (Type D) assigned to the candidate during the examination session.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_002",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2014",
                questionText = "In Femi Osofisan's 'Women of Owu', the gods are portrayed as:",
                optionA = "helpless",
                optionB = "architects of man's destiny",
                optionC = "amorous",
                optionD = "saviours of mankind",
                correctAnswerIndex = 1,
                explanation = "Osofisan portrays the traditional Yoruba deities (like Anlugbua and Lawumi) as active, powerful forces shaping the rise, fall, and ultimate destiny of human societies.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_003",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2014",
                questionText = "In 'Women of Owu', Orisaye describes Balogun Kusa as:",
                optionA = "a great warrior",
                optionB = "an enemy and a butcher",
                optionC = "a friend in need",
                optionD = "a good leader",
                correctAnswerIndex = 1,
                explanation = "Orisaye, the prophetic daughter of Erelu, condemns Balogun Kusa of the Allied forces as a heartless, violent butcher responsible for the massacre of Owu's citizens.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_004",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2014",
                questionText = "In the play 'Women of Owu', Erelu is:",
                optionA = "the oldest wife of Oba Akinjobi",
                optionB = "a courtier to the Alaafin of Oyo",
                optionC = "the most brilliant woman in Owu",
                optionD = "the first wife of the Oba",
                correctAnswerIndex = 0,
                explanation = "Erelu Bagbe is the queen mother and the oldest surviving wife of Oba Akinjobi, representing the direct matriarchal authority of the destroyed city-state of Owu.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_005",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2014",
                questionText = "In 'Women of Owu', Balogun Kusa is killed by a:",
                optionA = "god",
                optionB = "herbalist",
                optionC = "lunatic",
                optionD = "soldier",
                correctAnswerIndex = 2,
                explanation = "In a sudden twist of events, the powerful and ruthless military commander Balogun Kusa is unexpectedly stabbed and killed by a wandering lunatic.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_006",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2014",
                questionText = "In William Shakespeare's 'The Tempest', Ariel is identified as:",
                optionA = "leader of the spirits",
                optionB = "Prospero's daughter",
                optionC = "Alonso's wife",
                optionD = "assistant to Sycorax",
                correctAnswerIndex = 0,
                explanation = "Ariel is a powerful, airy spirit bound to Prospero's service, who commands and directs other minor spirits on the island to perform magical illusions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_007",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2014",
                questionText = "Before the shipwreck that occurs at the beginning of 'The Tempest', Prospero and his daughter have lived on the Island for:",
                optionA = "two decades",
                optionB = "twelve years",
                optionC = "forty days",
                optionD = "eighteen months",
                correctAnswerIndex = 1,
                explanation = "Prospero recounts to Miranda that exactly twelve years have passed since his brother Antonio usurped his dukedom and cast them adrift at sea, leading them to the island.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_008",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2014",
                questionText = "Caliban's intention to rape Miranda is born out of his desire to:",
                optionA = "destroy the Island",
                optionB = "compete with Ferdinand",
                optionC = "populate the Island with Calibans",
                optionD = "marry her",
                correctAnswerIndex = 2,
                explanation = "When confronted by Prospero, Caliban insolently declares that he tried to violate Miranda so that he could people/populate the island with miniature Calibans.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_009",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2014",
                questionText = "The character associated with absolute savagery and uncivilized nature in 'The Tempest' is:",
                optionA = "Ariel",
                optionB = "Stephano",
                optionC = "Caliban",
                optionD = "Ferdinand",
                correctAnswerIndex = 2,
                explanation = "Caliban, the deformed son of the witch Sycorax, represents raw nature, savagery, and the uncultivated base instincts of humanity on the island.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_010",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2014",
                questionText = "In 'The Tempest', Prospero is portrayed as a ruler who was:",
                optionA = "full of mistrust for everybody",
                optionB = "more interested in secret studies than in active governance",
                optionC = "dependent on the spirits for his physical survival",
                optionD = "eager to conquer the whole world",
                correctAnswerIndex = 1,
                explanation = "Prospero confesses that during his reign in Milan, his intense dedication to the liberal arts and secret occult studies led him to neglect his daily ducal administrative duties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_011",
                subject = "Literature in English",
                topic = "African Prose: A Woman in Her Prime",
                year = "2014",
                questionText = "Asare Konadu's 'A Woman in Her Prime' explores the central theme of:",
                optionA = "exploitation of the African woman",
                optionB = "sex discrimination in Ghana",
                optionC = "women liberation in Nigeria",
                optionD = "child quest of an African woman",
                correctAnswerIndex = 3,
                explanation = "The novel centers on Pokuwaa, a hardworking Ghanaian farmer, and her agonizing, intensive struggles and traditional rituals to conceive a child and achieve maternal fulfillment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_012",
                subject = "Literature in English",
                topic = "African Prose: A Woman in Her Prime",
                year = "2014",
                questionText = "According to 'A Woman in Her Prime', the worst calamity that can befall a woman is:",
                optionA = "inability to bear male children",
                optionB = "inability to marry",
                optionC = "divorce",
                optionD = "barrenness",
                correctAnswerIndex = 3,
                explanation = "In traditional rural Ghanaian society, complete childlessness or barrenness is viewed as a devastating social tragedy and personal curse for a woman.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_013",
                subject = "Literature in English",
                topic = "African Prose: A Woman in Her Prime",
                year = "2014",
                questionText = "In 'A Woman in Her Prime', 'Asogo' is a traditional game in which:",
                optionA = "fathers narrate animal stories to their sons",
                optionB = "boys tease and abuse girls with competitive music",
                optionC = "girls sing songs of praise and moral admonition",
                optionD = "mothers lure their babies to sleep",
                correctAnswerIndex = 1,
                explanation = "Asogo is depicted as a lively traditional game where local village boys use rhythmic, witty, and insulting songs to playfully tease girls.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_014",
                subject = "Literature in English",
                topic = "African Prose: Purple Hibiscus",
                year = "2014",
                questionText = "In Chimamanda Ngozi Adichie's 'Purple Hibiscus', one of the cultural changes introduced into St. Agnes' church by Father Benedict is that:",
                optionA = "there must be fasting every month",
                optionB = "the Credo must be recited in Igbo",
                optionC = "the Kyrie must be rendered only in Latin",
                optionD = "everyone must take holy communion",
                correctAnswerIndex = 1,
                explanation = "Father Benedict allows a few localized adaptations, such as chanting the Credo in Igbo, as long as the congregation maintains strict obedience to Catholic orthodoxy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_015",
                subject = "Literature in English",
                topic = "African Prose: Purple Hibiscus",
                year = "2014",
                questionText = "Eugene Achike in 'Purple Hibiscus' is portrayed as:",
                optionA = "a soft and gentle husband",
                optionB = "an uncompromising traditionalist",
                optionC = "a fanatical Catholic adherent",
                optionD = "a tough retired soldier",
                correctAnswerIndex = 2,
                explanation = "Papa Eugene is a highly complex character—a wealthy philanthropist who behaves as a tyrannical, fanatical Catholic patriarch inside his own household.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_016",
                subject = "Literature in English",
                topic = "African Prose: Purple Hibiscus",
                year = "2014",
                questionText = "In the Achike family in 'Purple Hibiscus', the character who is central to the narrative and acts as the speaker is:",
                optionA = "Kambili",
                optionB = "Mama",
                optionC = "Sisi",
                optionD = "Jaja",
                correctAnswerIndex = 0,
                explanation = "Kambili Achike, the fifteen-year-old daughter of Eugene, serves as the first-person narrator whose quiet, observant voice guides the entire story of family trauma.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_017",
                subject = "Literature in English",
                topic = "Non-African Prose: The Old Man and the Sea",
                year = "2014",
                questionText = "In Ernest Hemingway's 'The Old Man and the Sea', the type of giant fish caught by Santiago after eighty-four days of bad luck is a:",
                optionA = "shark",
                optionB = "iris",
                optionC = "marlin",
                optionD = "geisha",
                correctAnswerIndex = 2,
                explanation = "Santiago hooks a massive eighteen-foot Atlantic marlin, which drags his skiff far out into the Gulf Stream and tests his physical limits for three days.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_018",
                subject = "Literature in English",
                topic = "Non-African Prose: The Old Man and the Sea",
                year = "2014",
                questionText = "The thematic focus of 'The Old Man and the Sea' is the:",
                optionA = "futility of manual fishing methods",
                optionB = "desire of humanity to master deep-sea navigation",
                optionC = "influence of changing weather patterns on fishermen",
                optionD = "struggle of man against defeat and mortality",
                correctAnswerIndex = 3,
                explanation = "The novel is an allegory of human resilience, famously summarized by Santiago's maxim: 'Man is not made for defeat. A man can be destroyed but not defeated.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_019",
                subject = "Literature in English",
                topic = "Non-African Prose: The Old Man and the Sea",
                year = "2014",
                questionText = "In 'The Old Man and the Sea', the attitude of the old man toward nature, the sea, and its creatures is:",
                optionA = "cautious and sceptical",
                optionB = "hostile and callous",
                optionC = "careless and indifferent",
                optionD = "warm and friendly",
                correctAnswerIndex = 3,
                explanation = "Santiago regards the sea as a gentle woman (la mar) and views the creatures, including the marlin he must kill, as his beloved brothers and friends.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_020",
                subject = "Literature in English",
                topic = "Non-African Prose: The Old Man and the Sea",
                year = "2014",
                questionText = "Santiago's second recurring dream on his voyage or at home is of:",
                optionA = "his deceased wife",
                optionB = "massive schools of flying fish",
                optionC = "lions on the African beach",
                optionD = "severe ocean storms",
                correctAnswerIndex = 2,
                explanation = "In his youth, Santiago traveled as a sailor to Africa. He regularly dreams of noble lions playing like young kittens on the golden sandy beaches of East Africa.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_021",
                subject = "Literature in English",
                topic = "African Poetry: Hard Lines",
                year = "2014",
                questionText = "The dominant imagery employed in Gbemisola Adeoti's poem 'Hard Lines' is:",
                optionA = "auditory",
                optionB = "gustatory",
                optionC = "visual",
                optionD = "tactile",
                correctAnswerIndex = 3,
                explanation = "The poem utilizes harsh tactile sensations (such as cutting, burning, and hard physical surfaces) to convey the oppressive political and socio-economic landscape.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_022",
                subject = "Literature in English",
                topic = "African Poetry: Ambassadors of Poverty",
                year = "2014",
                questionText = "The tone of Kwesi Brew's 'Ambassadors of Poverty' (often associated with Umeh) can be described as:",
                optionA = "metaphorical",
                optionB = "sarcastic",
                optionC = "admonitory",
                optionD = "panegyrical",
                correctAnswerIndex = 2,
                explanation = "The poet adopts an admonitory tone, issuing a severe moral warning to African leaders who exploit their citizens and act as direct ambassadors of national misery.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_023",
                subject = "Literature in English",
                topic = "African Poetry: Homeless, not Hopeless",
                year = "2014",
                questionText = "In Owonibi's 'Homeless, not Hopeless', the poet persona explains that street beggars are primarily:",
                optionA = "always worrying about reaching heaven",
                optionB = "attending secret business conferences in major cities",
                optionC = "concerned with securing their basic daily survival needs",
                optionD = "rarely sleeping and never having dreams",
                correctAnswerIndex = 2,
                explanation = "The persona highlights the immediate material focus of the homeless, who prioritize finding food, shelter, and small alms over grand intellectual or spiritual pursuits.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_024",
                subject = "Literature in English",
                topic = "African Poetry: Myopia",
                year = "2014",
                questionText = "Syl Cheney-Coker's poem 'Myopia' can be classified as a:",
                optionA = "dirge",
                optionB = "lament",
                optionC = "sonnet",
                optionD = "ballad",
                correctAnswerIndex = 1,
                explanation = "Cheney-Coker's poem is a passionate personal and political lament mourning Sierra Leone's historical setbacks, corruption, and social shortsightedness (myopia).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_025",
                subject = "Literature in English",
                topic = "African Poetry: Authors",
                year = "2014",
                questionText = "The modern African poet Jared Angira belongs to which nation?",
                optionA = "Sierra-Leone",
                optionB = "Kenya",
                optionC = "South Africa",
                optionD = "Ghana",
                correctAnswerIndex = 1,
                explanation = "Jared Angira is one of Kenya's most celebrated and politically engaged contemporary poets, known for writing about social justice and post-colonial struggles.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_026",
                subject = "Literature in English",
                topic = "Non-African Poetry: Serenade",
                year = "2014",
                questionText = "The dominant literary technique used in the poem 'Serenade' is:",
                optionA = "metaphor",
                optionB = "simile",
                optionC = "oxymoron",
                optionD = "apostrophe",
                correctAnswerIndex = 3,
                explanation = "The speaker in 'Serenade' relies heavily on apostrophe, directly addressing an absent lover or abstract concepts to evoke a deep, melancholic mood.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_027",
                subject = "Literature in English",
                topic = "Non-African Poetry: The Sun Rising",
                year = "2014",
                questionText = "The personified sun in John Donne's 'The Sun Rising' is depicted through the immediate use of:",
                optionA = "invocation",
                optionB = "ellipsis",
                optionC = "enjambment",
                optionD = "apostrophe",
                correctAnswerIndex = 3,
                explanation = "Donne opens the poem with an insolent apostrophe directly addressing the sun as a 'Busy old fool, unruly sun,' demanding to know why it interrupts lovers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_028",
                subject = "Literature in English",
                topic = "Non-African Poetry: The Soul's Errand",
                year = "2014",
                questionText = "In Sir Walter Raleigh's 'The Soul's Errand', the soul is portrayed as a:",
                optionA = "friend of suffering masses",
                optionB = "fearless message-bearer",
                optionC = "restorer of lost national glory",
                optionD = "messenger of hope and peace",
                correctAnswerIndex = 1,
                explanation = "The speaker charges his departing soul with a fearless errand: to go travel the world and boldly tell various corrupt institutions of their moral decay.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_029",
                subject = "Literature in English",
                topic = "Non-African Poetry: The Negro Speaks of Rivers",
                year = "2014",
                questionText = "The literary and cultural allusions in Langston Hughes's 'The Negro Speaks of Rivers' are mainly:",
                optionA = "biblical",
                optionB = "historical",
                optionC = "classical",
                optionD = "literary",
                correctAnswerIndex = 1,
                explanation = "Hughes references historical landmarks—the Euphrates, Congo, Nile, and Mississippi—to trace the deep, ancient heritage of the black race.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_030",
                subject = "Literature in English",
                topic = "Non-African Poetry: Upon An Honest Man's Fortune",
                year = "2014",
                questionText = "John Fletcher's 'Upon An Honest Man's Fortune' encourages readers to:",
                optionA = "condemn soothsaying and astrology",
                optionB = "seek immediate spiritual aid in times of trial",
                optionC = "avoid planning for the future",
                optionD = "accept life's changing fortunes with internal stoicism",
                correctAnswerIndex = 3,
                explanation = "The poem advocates for self-reliance and stoic acceptance of whatever fortune or trial life presents, declaring that an honest mind is its own kingdom.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q30"
            )
        )

        // General Literary Principles & Appreciation (31 - 50)
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_031",
                subject = "Literature in English",
                topic = "Literary Terms: Pathos",
                year = "2014",
                questionText = "An action or scene in a tragic drama that stimulates the audience to feel intense pity for a character is called:",
                optionA = "pathos",
                optionB = "parody",
                optionC = "pyrrhic",
                optionD = "props",
                correctAnswerIndex = 0,
                explanation = "Pathos represents the quality in a work of art or literature that evokes deep feelings of sympathy, sorrow, and pity in the audience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_032",
                subject = "Literature in English",
                topic = "Dramatic Structure: Catharsis",
                year = "2014",
                questionText = "The therapeutic release or purgation of the audience's negative emotions of pity and fear at the end of a tragedy is known as:",
                optionA = "epilogue",
                optionB = "exposition",
                optionC = "catharsis",
                optionD = "catastrophe",
                correctAnswerIndex = 2,
                explanation = "Catharsis is the emotional cleansing experienced by the audience as they witness the tragic but inevitable downfall of the protagonist.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_033",
                subject = "Literature in English",
                topic = "Dramatic Techniques: Soliloquy",
                year = "2014",
                questionText = "A dramatic device where a character, alone on stage, speaks their innermost thoughts out loud to the audience is a:",
                optionA = "apostrophe",
                optionB = "dialogue",
                optionC = "soliloquy",
                optionD = "aside",
                correctAnswerIndex = 2,
                explanation = "Unlike a monologue addressed to others, a soliloquy is spoken strictly alone on stage, revealing the character's genuine internal state.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_034",
                subject = "Literature in English",
                topic = "Elements of Prose: Plot",
                year = "2014",
                questionText = "The plot of any standard literary work is fundamentally about the:",
                optionA = "resolution of all minor conflicts",
                optionB = "strict enforcement of poetic justice",
                optionC = "complete psychological delineation of characters",
                optionD = "causal and structured arrangement of events",
                correctAnswerIndex = 3,
                explanation = "According to Aristotelian principles, a plot is not just a sequence of happenings, but a structured, causal layout of actions.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_035",
                subject = "Literature in English",
                topic = "Poetic Elements: Tone & Mood",
                year = "2014",
                questionText = "In poetry, the combined terms 'tone' and 'mood' closely relate to the:",
                optionA = "setting",
                optionB = "space",
                optionC = "locale",
                optionD = "atmosphere",
                correctAnswerIndex = 3,
                explanation = "The tone (poet's attitude) and mood (reader's emotional response) work together to establish the overall psychological atmosphere of a poem.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_036",
                subject = "Literature in English",
                topic = "Dramatic Techniques: Comic Relief",
                year = "2014",
                questionText = "A humorous, light-hearted incident placed within an otherwise serious or tragic play is called:",
                optionA = "tragicomedy",
                optionB = "tragic hero",
                optionC = "comedy",
                optionD = "comic relief",
                correctAnswerIndex = 3,
                explanation = "Comic relief (like the Porter scene in Macbeth) provides a brief emotional break for the audience before resuming intense dramatic tension.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_037",
                subject = "Literature in English",
                topic = "Characterization: Flat Characters",
                year = "2014",
                questionText = "In prose fiction, a 'flat' character is best described as one who:",
                optionA = "dies abruptly in the middle of the story",
                optionB = "achieves massive social greatness",
                optionC = "remains simple and relatively undeveloped throughout the text",
                optionD = "undergoes profound psychological changes",
                correctAnswerIndex = 2,
                explanation = "Coined by E.M. Forster, flat characters are two-dimensional, built around a single idea or trait, and do not evolve over the course of a story.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_038",
                subject = "Literature in English",
                topic = "Dramatic Terminology: Dramatis Personae",
                year = "2014",
                questionText = "In a printed play text, 'dramatis personae' refers directly to the:",
                optionA = "technical cast list of actors",
                optionB = "main protagonist and antagonist",
                optionC = "comprehensive list of characters in the play",
                optionD = "chronological order of character appearances",
                correctAnswerIndex = 2,
                explanation = "'Dramatis Personae' is Latin for 'masks of the drama', conventionally placed at the beginning of a script to list all active characters.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_039",
                subject = "Literature in English",
                topic = "Dramatic Structure: Epilogue",
                year = "2014",
                questionText = "The formal speech delivered directly to the audience at the absolute end of a play is called:",
                optionA = "a dirge",
                optionB = "a monologue",
                optionC = "a prologue",
                optionD = "an epilogue",
                correctAnswerIndex = 3,
                explanation = "An epilogue is a speech, often written in rhyming verse, delivered by an actor at the conclusion of a play to wrap up the story and request applause.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_040",
                subject = "Literature in English",
                topic = "Prose Realism: Verisimilitude",
                year = "2014",
                questionText = "Which of the following concepts is central to establishing believable realism in narrative fiction?",
                optionA = "Objectivity",
                optionB = "Subjectivity",
                optionC = "Verisimilitude",
                optionD = "Dialogue",
                correctAnswerIndex = 2,
                explanation = "Verisimilitude is the quality of possessing a strong appearance or semblance of truth, making a fictional world believable to the reader.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_041",
                subject = "Literature in English",
                topic = "Literary Appreciation: Characterization",
                year = "2014",
                questionText = "'He put himself in uniform, made one for his five-year-old son, and marched with the infant...' This character in the excerpt is portrayed as:",
                optionA = "energetic",
                optionB = "a policeman",
                optionC = "a soldier",
                optionD = "abnormal",
                correctAnswerIndex = 3,
                explanation = "The character's obsessive, highly eccentric public marching behavior in custom-made military uniforms with his toddler indicates psychological abnormality.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_042",
                subject = "Literature in English",
                topic = "Figures of Speech: Oxymoron",
                year = "2014",
                questionText = "The literary statement 'He is a faithful liar' is an example of:",
                optionA = "epigram",
                optionB = "oxymoron",
                optionC = "euphemism",
                optionD = "antithesis",
                correctAnswerIndex = 1,
                explanation = "An oxymoron is a figure of speech that places two completely contradictory terms ('faithful' and 'liar') side-by-side to create a striking paradox.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_043",
                subject = "Literature in English",
                topic = "Figures of Speech: Hyperbole",
                year = "2014",
                questionText = "The descriptive phrase 'Fights by the book of arithmetic' is an example of:",
                optionA = "hyperbole",
                optionB = "Euphemism",
                optionC = "Litotes",
                optionD = "Innuendo",
                correctAnswerIndex = 0,
                explanation = "This is a hyperbolic exaggeration (Mercutio mocking Tybalt's precise, academic, and overly structured sword-fighting style).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_044",
                subject = "Literature in English",
                topic = "Literary Imagery: Metaphorical References",
                year = "2014",
                questionText = "'And when you trudge on your horny pads / Gullied like the soles of modern shoes...' The term 'horny pads' in the excerpt is a reference to the:",
                optionA = "boots of a policeman",
                optionB = "bare feet of a madman",
                optionC = "calloused soles of a pauper",
                optionD = "heavy boots of a soldier",
                correctAnswerIndex = 2,
                explanation = "The 'horny pads' describe the highly calloused, split, and tough bare feet of a poor person who must walk long distances without shoes.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_045",
                subject = "Literature in English",
                topic = "Poetic Forms: Sonnet",
                year = "2014",
                questionText = "'Lift not the painted veil which those who live call life...' Shelley's stanza is a part of which poetic form?",
                optionA = "quatrain",
                optionB = "sonnet",
                optionC = "couplet",
                optionD = "sestet",
                correctAnswerIndex = 1,
                explanation = "These lines form the opening of Percy Bysshe Shelley's famous philosophical fourteen-line sonnet exploring the illusions of mortal existence.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_046",
                subject = "Literature in English",
                topic = "Poetic Forms: Light Verse & Limerick",
                year = "2014",
                questionText = "'I wonder how long, you awful parasites, shall share with me this little bed...' These lines by Mbure to a bed-bug are an example of a:",
                optionA = "limerick",
                optionB = "lampoon",
                optionC = "light verse",
                optionD = "light opera",
                correctAnswerIndex = 0,
                explanation = "The playful, highly rhythmic, and humorous tone addressing a mundane nuisance classifies these light-hearted lines as a limerick style.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_047",
                subject = "Literature in English",
                topic = "Poetic Appreciation: To a Bed-Bug",
                year = "2014",
                questionText = "In the poem 'To a Bed-Bug', the poet persona expresses intense dismay and frustration about:",
                optionA = "bats",
                optionB = "cockroaches",
                optionC = "grasshoppers",
                optionD = "bed-bugs",
                correctAnswerIndex = 3,
                explanation = "The poem is a direct, humorous complaint addressing the persistent, blood-sucking nocturnal parasites sharing the speaker's bed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_048",
                subject = "Literature in English",
                topic = "Figures of Speech: Personification",
                year = "2014",
                questionText = "The dominant figure of speech in Mbure's 'To a Bed-Bug' when he addresses them as 'awful parasites' is:",
                optionA = "metaphor",
                optionB = "simile",
                optionC = "personification",
                optionD = "hyperbole",
                correctAnswerIndex = 2,
                explanation = "Addressing the bugs directly as conscious, malicious 'parasites' and complaining about them sharing his bed represents personification.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_049",
                subject = "Literature in English",
                topic = "Literary Genres: Lampoon",
                year = "2014",
                questionText = "'Your head is like a drum that is beaten for spirits / Your ears are like the fans used for blowing fire.' These lines are a good example of:",
                optionA = "caricature",
                optionB = "ridicule",
                optionC = "satire",
                optionD = "lampoon",
                correctAnswerIndex = 3,
                explanation = "A lampoon is a form of sharp, highly personal, and humorous written attack that uses crude physical comparisons to mock someone.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2014_050",
                subject = "Literature in English",
                topic = "Literary Appreciation: Idiomatic Inference",
                year = "2014",
                questionText = "'This thing you are doing is too heavy for you, he said. I went to school only a little but I have killed many many more years in this world than you have.' It can be inferred that the:",
                optionA = "listener is wise",
                optionB = "speaker is a porter",
                optionC = "listener is more experienced",
                optionD = "speaker is more experienced",
                correctAnswerIndex = 3,
                explanation = "The speaker's colloquial phrase 'killed many many more years' is an idiom indicating that he has lived much longer and accumulated far more life experience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2014 • Q50"
            )
        )

        // Questions 51 to 100 (2015 Series)
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_051",
                subject = "Literature in English",
                topic = "Figures of Speech: Personification",
                year = "2015",
                questionText = "'Busy old fool, unruly sun why / windows and through curtains call on us?' The most vivid figure of speech in John Donne's 'The Sun Rising' is:",
                optionA = "simile",
                optionB = "diction",
                optionC = "personification",
                optionD = "pun",
                correctAnswerIndex = 2,
                explanation = "Donne personifies the sun as an old, stubborn, intrusive busybody who peers through windows and curtains to disturb sleeping lovers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q51"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_052",
                subject = "Literature in English",
                topic = "Poetic Allusion: Historical",
                year = "2015",
                questionText = "The central allusion in Langston Hughes's 'The Negro Speaks of Rivers' is mainly:",
                optionA = "biblical",
                optionB = "classical",
                optionC = "literary",
                optionD = "historical",
                correctAnswerIndex = 3,
                explanation = "The poem makes historical references to the ancient cradles of black civilization along major global waterways to establish cultural heritage.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q52"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_053",
                subject = "Literature in English",
                topic = "Poetic Metaphor: Hard Lines",
                year = "2015",
                questionText = "In Gbemisola Adeoti's 'Hard Lines', the substance 'Sodium cyanide' is described as being:",
                optionA = "poisonous",
                optionB = "adhesive",
                optionC = "sweet",
                optionD = "fragrant",
                correctAnswerIndex = 0,
                explanation = "Adeoti references sodium cyanide, a highly lethal chemical poison, as a metaphor for the toxic, deadly nature of political corruption.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q53"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_054",
                subject = "Literature in English",
                topic = "Poetic Analysis: Homeless, not Hopeless",
                year = "2015",
                questionText = "In Owonibi's 'Homeless, not Hopeless', the poet persona explains that street beggars:",
                optionA = "always worry about entering heaven",
                optionB = "attend business conferences in major towns",
                optionC = "are primarily concerned with their immediate daily needs",
                optionD = "rarely sleep and never have dreams",
                correctAnswerIndex = 2,
                explanation = "The poem highlights that the day-to-day existence of beggars is entirely consumed with securing basic necessities like food and coins.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q54"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_055",
                subject = "Literature in English",
                topic = "Poetic Persona: Serenade",
                year = "2015",
                questionText = "The poet persona in the poem 'Serenade' is a:",
                optionA = "Suitor",
                optionB = "Mother",
                optionC = "spinster",
                optionD = "Passer-by",
                correctAnswerIndex = 0,
                explanation = "The speaker in 'Serenade' adopts the persona of a passionate suitor singing outside a window to express deep romantic devotion.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q55"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_056",
                subject = "Literature in English",
                topic = "Poetic Symbolism: Myopia",
                year = "2015",
                questionText = "In Syl Cheney-Coker's 'Myopia', the term 'peasants' represents the:",
                optionA = "Under-privileged masses",
                optionB = "Politicians",
                optionC = "farmers",
                optionD = "Rural dwellers",
                correctAnswerIndex = 0,
                explanation = "The 'peasants' are a collective symbol for the voiceless, suffering, and under-privileged masses of the nation who bear the costs of elite greed.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q56"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_057",
                subject = "Literature in English",
                topic = "Poetic Analysis: Expelled",
                year = "2015",
                questionText = "In Jared Angira's poem 'Expelled', the poet persona laments the:",
                optionA = "Loss of his ancestral property",
                optionB = "Harrowing experiences resulting from the stranger's visit",
                optionC = "presence of friendly strangers",
                optionD = "structural problems of his large family",
                correctAnswerIndex = 1,
                explanation = "The poem is a post-colonial lament focusing on the painful, disruptive, and harrowing consequences of colonial intrusion ('the stranger's visit').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q57"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_058",
                subject = "Literature in English",
                topic = "Poetic Techniques: Enjambment",
                year = "2015",
                questionText = "John Fletcher's 'Upon An Honest Man's Fortune' achieves its lyricism through the use of:",
                optionA = "Synecdoche",
                optionB = "Antithesis",
                optionC = "enjambment",
                optionD = "Ballad",
                correctAnswerIndex = 2,
                explanation = "The poem relies heavily on enjambment (run-on lines) to create a natural, flowing, and highly lyrical conversational rhythm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q58"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_059",
                subject = "Literature in English",
                topic = "Poetic Devices: Repetition",
                year = "2015",
                questionText = "The primary rhythmic momentum in Sir Walter Raleigh's 'The Soul's Errand' is achieved through:",
                optionA = "Metaphor",
                optionB = "Alliteration",
                optionC = "repetition",
                optionD = "Antithesis",
                correctAnswerIndex = 2,
                explanation = "The constant structural repetition of commands (such as 'Go, tell...', 'Give...') creates a driving, musical, and urgent poetic rhythm.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q59"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_060",
                subject = "Literature in English",
                topic = "Figures of Speech: Irony",
                year = "2015",
                questionText = "The title of Umeh's poem 'Ambassador of Poverty' is an example of:",
                optionA = "Repetition",
                optionB = "A simile",
                optionC = "an alliteration",
                optionD = "An irony",
                correctAnswerIndex = 3,
                explanation = "The title is highly ironic; an 'ambassador' conventionally represents power and wealth, yet here they represent deprivation and national poverty.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q60"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_061",
                subject = "Literature in English",
                topic = "Sound Devices: Alliteration",
                year = "2015",
                questionText = "The repetition of a consonant sound in quick succession for musical sound effect is called:",
                optionA = "Alliteration",
                optionB = "Pun",
                optionC = "onomatopoeia",
                optionD = "Assonance",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the literary device of repeating identical initial consonant sounds in close proximity to create rhythm and melody.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q61"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_062",
                subject = "Literature in English",
                topic = "Plot Structures: Episodic",
                year = "2015",
                questionText = "A play in which the scenes or acts succeed one another without any logical or necessary chronological sequence is:",
                optionA = "Episodic",
                optionB = "Simple",
                optionC = "linear",
                optionD = "Convoluted",
                correctAnswerIndex = 0,
                explanation = "An episodic plot consists of a series of loosely connected chapters or scenes rather than a tight, chronological cause-and-effect narrative.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q62"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_063",
                subject = "Literature in English",
                topic = "Narrative Techniques: Flashback",
                year = "2015",
                questionText = "A dramatic technique by which an earlier scene or action is recalled to shed light on present events is a:",
                optionA = "Climax",
                optionB = "Flashback",
                optionC = "interlude",
                optionD = "Catharsis",
                correctAnswerIndex = 1,
                explanation = "Flashbacks temporarily interrupt the narrative timeline to provide crucial background information about characters and past conflicts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q63"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_064",
                subject = "Literature in English",
                topic = "Literary Criticism",
                year = "2015",
                questionText = "Literary criticism is an academic activity which seeks to:",
                optionA = "Find technical faults in a work",
                optionB = "Analyse and evaluate a literary work",
                optionC = "compare and contrast completely unrelated novels",
                optionD = "Discover only the positive beauty of a work",
                correctAnswerIndex = 1,
                explanation = "The discipline of criticism focuses on the close reading, interpretation, contextual analysis, and objective evaluation of literary works.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q64"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_065",
                subject = "Literature in English",
                topic = "Dramatic Techniques: Aside",
                year = "2015",
                questionText = "A stage situation where an actor addresses the audience directly without the other actors on stage supposedly hearing him is an:",
                optionA = "Soliloquy",
                optionB = "Chorus",
                optionC = "aside",
                optionD = "Solo",
                correctAnswerIndex = 2,
                explanation = "An aside is a brief remark intended only for the audience's ears, maintaining the dramatic illusion that the other on-stage characters cannot hear it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q65"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_066",
                subject = "Literature in English",
                topic = "Dramatic Elements: Chorus",
                year = "2015",
                questionText = "A collective band of singers and dancers in drama who comment on the action and act as a link with the audience is the:",
                optionA = "Chorus",
                optionB = "Clown",
                optionC = "Playwright",
                optionD = "Cast",
                correctAnswerIndex = 0,
                explanation = "Dating back to classical Greek theater, the Chorus comments on moral themes, delivers prologues, and guides the audience's emotional response.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q66"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_067",
                subject = "Literature in English",
                topic = "Character Types: Eponymous",
                year = "2015",
                questionText = "A character whose specific name is used directly as the title of the literary text is described as:",
                optionA = "Antagonist",
                optionB = "Round",
                optionC = "eponymous",
                optionD = "Flat",
                correctAnswerIndex = 2,
                explanation = "An eponymous character (such as Hamlet, Silas Marner, or Oliver Twist) is one who gives their name directly to the title of the book.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q67"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_068",
                subject = "Literature in English",
                topic = "Poetic Principles: Poetic License",
                year = "2015",
                questionText = "In poetry, the technical term 'license' implies:",
                optionA = "Freedom to sell poems commercially",
                optionB = "Liberty the poets take with standard language rules",
                optionC = "formal state approval given to write poems",
                optionD = "academic honours awarded to deserving poets",
                correctAnswerIndex = 1,
                explanation = "Poetic license allows writers to violate conventional grammar, spelling, or syntax to achieve a particular artistic, rhythmic, or metric effect.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q68"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_069",
                subject = "Literature in English",
                topic = "Character Roles: Protagonist",
                year = "2015",
                questionText = "The person who occupies the absolute leading and most influential role in a play or novel is the:",
                optionA = "Protagonist",
                optionB = "Actor",
                optionC = "antagonist",
                optionD = "Actress",
                correctAnswerIndex = 0,
                explanation = "The protagonist is the central character around whom the plot revolves, driving the action and facing the main conflicts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q69"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_070",
                subject = "Literature in English",
                topic = "Literary Genres: Pastoral",
                year = "2015",
                questionText = "A style of creative writing in which the author describes rural landscapes and simple country life with nostalgia is:",
                optionA = "Ballad",
                optionB = "Romance",
                optionC = "epic",
                optionD = "pastoral",
                correctAnswerIndex = 3,
                explanation = "Pastoral literature romanticizes shepherd life, quiet fields, and nature, contrasting rural purity with urban corruption.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q70"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_071",
                subject = "Literature in English",
                topic = "Literary Appreciation: Speaker Tone",
                year = "2015",
                questionText = "'We all make decisions. Sometimes it is wrong, sometimes it is right.' The tone of the speaker in these lines is:",
                optionA = "Afraid",
                optionB = "Excited",
                optionC = "pessimistic",
                optionD = "Reassuring",
                correctAnswerIndex = 3,
                explanation = "The speaker offers a calm, reassuring perspective on the universal human experience of decision-making, acknowledging that errors are normal.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q71"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_072",
                subject = "Literature in English",
                topic = "Literary Style: Descriptive Prose/Poetry",
                year = "2015",
                questionText = "'Her neck is rope-like thin, long and skinny and her face sickly pale.' The literary style used in Okot p'Bitek's 'Song of Lawino' is:",
                optionA = "Narrative",
                optionB = "Argumentative",
                optionC = "dramatic",
                optionD = "Descriptive",
                correctAnswerIndex = 3,
                explanation = "This passage is highly descriptive, using vivid, graphic adjectives to paint a physical caricature of Clementine's westernized appearance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q72"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_073",
                subject = "Literature in English",
                topic = "Literary Appreciation: Insincerity",
                year = "2015",
                questionText = "'Once upon a time son, they used to laugh with their eyes; but now they only laugh with their teeth...' Gabriel Okara's lines are expressive of:",
                optionA = "Friendliness",
                optionB = "Insincerity",
                optionC = "jealousy",
                optionD = "Sympathy",
                correctAnswerIndex = 1,
                explanation = "Okara laments the loss of genuine human warmth, describing how modern social greetings have become cold, mechanical, and insincere.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q73"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_074",
                subject = "Literature in English",
                topic = "Literary Allusion: Romantic Climax",
                year = "2015",
                questionText = "'When she opens her heart the savior's image!' The religious allusion in this traditional love song indicates that:",
                optionA = "the poet is a devout Christian theologian",
                optionB = "the lover had a major medical heart surgery",
                optionC = "this represents the absolute climax of their love relationship",
                optionD = "this represents a major tragic anti-climax",
                correctAnswerIndex = 2,
                explanation = "Equating the beloved's devotion to a sacred vision of the Savior represents the ultimate, transcendent peak of romantic adoration.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q74"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_075",
                subject = "Literature in English",
                topic = "Figures of Speech: Simile",
                year = "2015",
                questionText = "'Here we live in an old rumbling mansion, that looks for all the world like an inn, but we never see company.' The figure of speech in the phrase 'looks like an inn' is:",
                optionA = "Irony",
                optionB = "Euphemism",
                optionC = "simile",
                optionD = "Metaphor",
                correctAnswerIndex = 2,
                explanation = "The use of the explicit comparative word 'like' to draw a comparison between the mansion and an inn establishes it as a simile.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q75"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_076",
                subject = "Literature in English",
                topic = "Figures of Speech: Personification",
                year = "2015",
                questionText = "'She gave out colanuts and together they ate to appease the angry earth and amadioha spoke through lightning and thunder.' The figure of speech in the third line is:",
                optionA = "Personification",
                optionB = "Simile",
                optionC = "hyperbole",
                optionD = "Metaphor",
                correctAnswerIndex = 0,
                explanation = "Saying that 'amadioha spoke' through natural elements attributes the human capacity of speech to a thunder deity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q76"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_077",
                subject = "Literature in English",
                topic = "Drama Appreciation: She Stoops to Conquer",
                year = "2015",
                questionText = "In Oliver Goldsmith's 'She Stoops to Conquer', Mrs. Hardcastle's description of their quiet life in the countryside conveys a feeling of being:",
                optionA = "hopeful",
                optionB = "frustrated",
                optionC = "regretful",
                optionD = "happy",
                correctAnswerIndex = 1,
                explanation = "Mrs. Hardcastle complains bitterly about being isolated in an old, uninspiring country house far from London's vibrant high society.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q77"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_078",
                subject = "Literature in English",
                topic = "Poetry Appreciation: Song of Lawino",
                year = "2015",
                questionText = "In 'Song of Lawino', Lawino uses descriptions of Clementine's skinny neck and pale face to convey:",
                optionA = "Ridicule",
                optionB = "admonition",
                optionC = "anger",
                optionD = "sympathy",
                correctAnswerIndex = 0,
                explanation = "Lawino mocks Clementine's appearance to ridicule her desperate attempts to copy European beauty standards.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q78"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_079",
                subject = "Literature in English",
                topic = "Figures of Speech: Personification",
                year = "2015",
                questionText = "'Ah, sunflower, weary of time who contests the steps of the sun...' The figure of speech in William Blake's second line is:",
                optionA = "Simile",
                optionB = "metaphor",
                optionC = "irony",
                optionD = "personification",
                correctAnswerIndex = 3,
                explanation = "Blake personifies the sunflower, describing it as 'weary of time' and actively following the path of the sun like a tired traveler.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q79"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_080",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Macbeth",
                year = "2015",
                questionText = "'There is no art to find the mind's construction on the face: he was a gentleman on whom I built an absolute trust.' The gentleman referred to in Shakespeare's 'Macbeth' is one who:",
                optionA = "fights alongside the speaker",
                optionB = "detests the speaker",
                optionC = "openly criticizes the speaker",
                optionD = "betrays the speaker's trust",
                correctAnswerIndex = 3,
                explanation = "King Duncan lamenting the betrayal of the original Thane of Cawdor highlights Cawdor's treacherous rebellion against the crown.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q80"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_081",
                subject = "Literature in English",
                topic = "Non-African Prose: The Old Man and the Sea",
                year = "2015",
                questionText = "In 'The Old Man and the Sea', the busy, flourishing fish market is located in:",
                optionA = "St. Louis",
                optionB = "Canary Island",
                optionC = "Cleveland",
                optionD = "Havana",
                correctAnswerIndex = 3,
                explanation = "Santiago's coastal fishing village is situated near Havana, Cuba, where caught fish are regularly brought to market.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q81"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_082",
                subject = "Literature in English",
                topic = "Non-African Prose: The Old Man and the Sea",
                year = "2015",
                questionText = "In summary, the character of the old man, Santiago, can be described as:",
                optionA = "a Marxist",
                optionB = "an idealist",
                optionC = "an optimist",
                optionD = "a realist",
                correctAnswerIndex = 2,
                explanation = "Despite going eighty-four days without catching a single fish, Santiago remains deeply optimistic and confident that his luck will change.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q82"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_083",
                subject = "Literature in English",
                topic = "Non-African Prose: The Old Man and the Sea",
                year = "2015",
                questionText = "As he struggled alone with the giant fish and the sharks, the old man constantly talks out loud to himself because:",
                optionA = "he is terrified of the dark sea",
                optionB = "that is what all fishermen conventionally do",
                optionC = "he knows it will scare the sharks away",
                optionD = "the boy Manolin has left him alone",
                correctAnswerIndex = 3,
                explanation = "To cope with his profound loneliness and keep his mind sharp during his grueling three-day trial, Santiago speaks to himself and the fish.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q83"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_084",
                subject = "Literature in English",
                topic = "Non-African Prose: The Old Man and the Sea",
                year = "2015",
                questionText = "To the old man, the music and concept of the mandolin represents:",
                optionA = "a symbol of colonial oppression",
                optionB = "the absolute cause of his bad luck",
                optionC = "a source of quiet encouragement",
                optionD = "the typical laziness of modern youth",
                correctAnswerIndex = 2,
                explanation = "Santiago associates the pleasant tunes of the mandolin with positive memories of his youth, drawing strength from them.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q84"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_085",
                subject = "Literature in English",
                topic = "African Prose: Purple Hibiscus",
                year = "2015",
                questionText = "The core thematic concern of 'Purple Hibiscus' is:",
                optionA = "domestic violence and religious fanaticism",
                optionB = "the economic struggles of university lecturers",
                optionC = "systemic child labor in urban Nigeria",
                optionD = "political instability and military regimes",
                correctAnswerIndex = 0,
                explanation = "The novel exposes the devastating emotional and physical trauma inflicted on a family by a highly abusive, religiously fanatical patriarch.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q85"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_086",
                subject = "Literature in English",
                topic = "African Prose: Purple Hibiscus",
                year = "2015",
                questionText = "In the Achike household in 'Purple Hibiscus', the central character who undergoes the most growth is:",
                optionA = "Kambili",
                optionB = "mama",
                optionC = "sisi",
                optionD = "Jaja",
                correctAnswerIndex = 0,
                explanation = "Kambili's journey from a terrified, stammering girl to a confident young woman who finds her own voice is the emotional core of the novel.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q86"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_087",
                subject = "Literature in English",
                topic = "African Prose: Purple Hibiscus",
                year = "2015",
                questionText = "Adichie's 'Purple Hibiscus' exposes:",
                optionA = "military dictatorship in public life and domestic tyranny in private life",
                optionB = "the academic challenges of Nigerian teenagers",
                optionC = "the complex nature of traditional Igbo royalty",
                optionD = "the economic difficulties of managing large agricultural estates",
                correctAnswerIndex = 0,
                explanation = "The narrative draws a parallel between the oppressive military coup ruling Nigeria and the absolute tyranny Papa Eugene imposes in his home.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q87"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_088",
                subject = "Literature in English",
                topic = "African Prose: A Woman in Her Prime",
                year = "2015",
                questionText = "'A priest rushed forward and poured libation... Having thus appealed to the keeper of the spirit world, they waited...' This traditional ritual is performed to:",
                optionA = "make Pokuwaa fertile and pregnant",
                optionB = "prepare for the burial of Yaw Boakye",
                optionC = "aid the search for the missing Yaw Boakye",
                optionD = "locate a stolen black sacrificial hen",
                correctAnswerIndex = 1,
                explanation = "In 'A Woman in Her Prime', the village elders perform these traditional rites to honor the spirit world before laying the deceased Yaw Boakye to rest.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q88"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_089",
                subject = "Literature in English",
                topic = "African Prose: A Woman in Her Prime",
                year = "2015",
                questionText = "According to the local medicine man in 'A Woman in Her Prime', Pokuwaa suffers a miscarriage because:",
                optionA = "Kwadwo regularly beats her during arguments",
                optionB = "she was cursed with barrenness from birth",
                optionC = "her mother failed to offer the required thanksgiving sacrifices",
                optionD = "Kwadwo's mother is a powerful witch",
                correctAnswerIndex = 2,
                explanation = "The native doctor blames the tragedy on ancestral anger, claiming Pokuwaa's family neglected their ritual obligations.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q89"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_090",
                subject = "Literature in English",
                topic = "African Prose: A Woman in Her Prime",
                year = "2015",
                questionText = "The solemn ritual pouring of libation and ancestral appeal narrated in 'A Woman in Her Prime' takes place:",
                optionA = "on the path leading to the stream",
                optionB = "inside the busy village market place",
                optionC = "close to the old communal cemetery",
                optionD = "at the village square under the ancestral oak",
                correctAnswerIndex = 2,
                explanation = "The elders gather near the cemetery borders to establish a spiritual connection with the ancestors before the burial begins.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q90"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_091",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2015",
                questionText = "The central theme of Shakespeare's 'The Tempest' is:",
                optionA = "revenge, forgiveness, and reconciliation",
                optionB = "deep-sea navigation and exploration",
                optionC = "the dangers of absolute power",
                optionD = "romantic courtship in high society",
                correctAnswerIndex = 0,
                explanation = "Prospero's journey on the island moves from a desire for bitter vengeance against his usurping enemies to ultimate mercy and reconciliation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q91"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_092",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2015",
                questionText = "In 'The Tempest', Prospero abandons his active duties as Duke of Milan to focus entirely on the pursuit of:",
                optionA = "magic and liberal arts knowledge",
                optionB = "military conquest",
                optionC = "romantic alliances",
                optionD = "artistic and musical pastimes",
                correctAnswerIndex = 0,
                explanation = "Prospero admits that his obsession with his private library and occult studies allowed his brother Antonio to easily usurp his throne.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q92"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_093",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2015",
                questionText = "Prospero's personal sense of justice on the island is highly one-sided because:",
                optionA = "while he is furious about his own usurpation, he keeps Ariel and Caliban enslaved",
                optionB = "he refuses to forgive his brother Antonio",
                optionC = "he forces Miranda to marry a prince she dislikes",
                optionD = "he is deeply unfair to the gentle spirit Ariel",
                correctAnswerIndex = 0,
                explanation = "The play highlights the irony of Prospero's outrage over losing his dukedom while he acts as an absolute colonizer and master to Ariel and Caliban.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q93"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_094",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2015",
                questionText = "A major recurring motif in 'The Tempest' is:",
                optionA = "the corrupting influence of gold",
                optionB = "the pursuit of academic degrees",
                optionC = "the development of agricultural technology",
                optionD = "love at first sight",
                correctAnswerIndex = 3,
                explanation = "The immediate, intense attraction between Miranda and Ferdinand represents a classic example of 'love at first sight', orchestrated by Prospero.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q94"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_095",
                subject = "Literature in English",
                topic = "Shakespearean Drama: The Tempest",
                year = "2015",
                questionText = "Gonzalo's character in 'The Tempest' is officially identified as a:",
                optionA = "treacherous brother to Antonio",
                optionB = "noble Milanese Senator who aided Prospero",
                optionC = "wise Neapolitan Councillor",
                optionD = "co-conspirator with Sebastian",
                correctAnswerIndex = 2,
                explanation = "Gonzalo is the compassionate, honest old Neapolitan councillor who secretly provided Prospero with water, food, and his beloved books when they were cast out.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q95"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_096",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2015",
                questionText = "In the historical tragedy 'Women of Owu', the gods are portrayed as:",
                optionA = "helpless observers of human conflict",
                optionB = "detached from mortal suffering",
                optionC = "amorous and petty",
                optionD = "supreme architects of man's destiny",
                correctAnswerIndex = 3,
                explanation = "The play begins and ends with the deities, illustrating how human wars and pride are subject to divine judgment.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q96"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_097",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2015",
                questionText = "Femi Osofisan's 'Women of Owu' demonstrates that war is fundamentally:",
                optionA = "completely destructive and futile for both sides",
                optionB = "a glorious path to national honor",
                optionC = "necessary to please the gods",
                optionD = "a great builder of strong societies",
                correctAnswerIndex = 0,
                explanation = "Osofisan focuses on the agonizing aftermath of Owu's fall, highlighting the immense suffering, rape, and displacement of women to de-romanticize war.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q97"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_098",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2015",
                questionText = "In 'Women of Owu', Orisaye insists that she receives her prophetic revelations from:",
                optionA = "Sango",
                optionB = "Ogun",
                optionC = "Obatala",
                optionD = "Orunmila",
                correctAnswerIndex = 2,
                explanation = "Orisaye is dedicated as a virgin priestess to Obatala, the god of creation and purity, from whom she receives her tragic, unheeded prophecies.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q98"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_099",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2015",
                questionText = "In 'Women of Owu', the ruthless commander of the Allied Forces is:",
                optionA = "Okunade",
                optionB = "Erelu",
                optionC = "Akinjobi",
                optionD = "Balogun Kusa",
                correctAnswerIndex = 3,
                explanation = "Balogun Kusa leads the combined Ijebu and Ife forces, enforcing brutal treatment on the surviving women of Owu.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q99"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2015_100",
                subject = "Literature in English",
                topic = "African Drama: Women of Owu",
                year = "2015",
                questionText = "In the play, Oba Asunkungbade is historically recognized as the:",
                optionA = "War leader of Ijebu",
                optionB = "Ooni of Ife",
                optionC = "Monarch of Oyo",
                optionD = "Founder of Owu-Ipole",
                correctAnswerIndex = 3,
                explanation = "Oba Asunkungbade is revered as the legendary, brave ancestral founder of the Owu-Ipole kingdom.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2015 • Q100"
            )
        )

        return list
    }
}
