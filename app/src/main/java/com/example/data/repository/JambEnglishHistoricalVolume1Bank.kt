package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, verified, and organized JAMB Use of English Historical Question Bank (1983 - 1988 Series).
 * Standardized with 4 options (A-D), full passage contexts, verified 0-indexed answers, and pedagogical explanations.
 */
object JambEnglishHistoricalVolume1Bank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // JAMB USE OF ENGLISH 1983
        // =========================================================================
        val passage1983_1 = """
            The approach to the University is being restructured to ease the flow of traffic, give better security and provide an appropriate introduction to a seat of higher learning. The Works and Services Complex is also under construction, and we intend to move into the completed major part of it within the next few weeks.
            All these projects are being executed with an eye to aesthetics, for we recognize the important influence of a beautiful and healthy environment on its inhabitants and feel that a cluster of buildings on a small space such as we have, should be so well designed as to have a beneficial psychological and sociological effect on all members of the community.
            I have gone to these lengths to itemize these examples of current development for two main reasons. Firstly, to advise you that the road diversions and other physical inconveniences currently being experienced will be on the increase because of intense development activity. We therefore appeal to you to bear with us in full knowledge and consolation that such inconveniences are temporary and will soon yield final tangible results. Secondly, to demonstrate our capacity for executing approved projects with dispatch, and to assure Government that we are up to the task. Indeed, I can assure Government that its ability to disburse funds to us will be more than matched by our capacity to collect and expend them on executing various worthy projects in record time.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_1983_001",
                subject = "English Language",
                topic = "Comprehension: University Development",
                year = "1983",
                questionText = "$passage1983_1\n\nFrom the passage, we can gather that:",
                optionA = "There is not much consideration for the health of the inhabitants",
                optionB = "There is a deliberate effort to inconvenience the people",
                optionC = "Buildings are put up anyhow without design",
                optionD = "The inconveniences suffered by the inhabitants will be for a while",
                correctAnswerIndex = 3,
                explanation = "The author explicitly appeals to the community to bear with the administration 'in full knowledge and consolation that such inconveniences are temporary and will soon yield final tangible results.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_002",
                subject = "English Language",
                topic = "Comprehension: Vocabulary in Context",
                year = "1983",
                questionText = "$passage1983_1\n\n'An eye to aesthetics' in this passage means:",
                optionA = "Regard for space utilization",
                optionB = "Beneficial psychological effects",
                optionC = "Consideration for beauty and visual harmony",
                optionD = "A cluster of architectural structures",
                correctAnswerIndex = 2,
                explanation = "Aesthetics refers to the appreciation of beauty and good artistic taste. In the context of the passage, projects are executed with regard to creating a visually appealing and beautiful environment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q3"
            )
        )

        val passage1983_2 = """
            Is work for prisoners a privilege to save them from the demoralizing effects and misery of endless unoccupied hours? Is it something added to a prison sentence to make it harder and more unpleasant, or something which should have a positive value as part of a system of rehabilitation?
            Those magistrates who clung to sentences of hard labour doubtless looked upon strenuous work as an additional punishment. This point of view is widely accepted as right and proper, but it ignores the fact that unwillingness to work is often one of the immediate causes of criminality. To send prisoners back to the outside world, more than ever convinced that labour is an evil to be avoided, is to confirm them in their old way of life.
            It has been said that the purpose of prison work in a programme of rehabilitation is twofold: training for work and training by work. The prisoner needs to be trained in habits of industry; over and above this, he will gain immeasurably if it is possible to rouse in him the consciousness of self-mastery and of purpose that the completion of any worthwhile piece of work can give to the doer. He may find a pride of achievement in something more satisfying, and more socially desirable, than crime. But these things can only come when the work itself has a purpose and demands an effort.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_1983_003",
                subject = "English Language",
                topic = "Comprehension: Prison Rehabilitation",
                year = "1983",
                questionText = "$passage1983_2\n\nAccording to the author, some magistrates sentence prisoners to hard labour because:",
                optionA = "Some prisoners are completely unwilling to work",
                optionB = "Work is regarded as a special privilege",
                optionC = "They look upon it as an additional punishment",
                optionD = "It is an effective means of social rehabilitation",
                correctAnswerIndex = 2,
                explanation = "The passage states: 'Those magistrates who clung to sentences of hard labour doubtless looked upon strenuous work as an additional punishment.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_004",
                subject = "English Language",
                topic = "Comprehension: Lexis in Context",
                year = "1983",
                questionText = "$passage1983_2\n\n'Demoralizing' in this passage means:",
                optionA = "Deforming and disfiguring",
                optionB = "Reforming and educating",
                optionC = "Agonizing and painful",
                optionD = "Corrupting and undermining morale or character",
                correctAnswerIndex = 3,
                explanation = "Demoralizing means destroying or undermining morale, ethical spirit, character, or enthusiasm (corrupting the soul).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q10"
            )
        )

        // 1983 Lexis & Structure
        list.add(
            QuestionEntity(
                id = "eng_1983_005",
                subject = "English Language",
                topic = "Idioms & Figurative Expressions",
                year = "1983",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'The story has to be taken with a grain of salt.'",
                optionA = "You need some salt to listen to the story",
                optionB = "The story is doubtful and questionable",
                optionC = "The story is completely true and factual",
                optionD = "You have exaggerated the story with salt",
                correctAnswerIndex = 1,
                explanation = "To take something 'with a grain of salt' is an English idiom meaning to view it with skepticism, reserve, or doubt.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_006",
                subject = "English Language",
                topic = "Idioms & Figurative Expressions",
                year = "1983",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'It is usually hard to change the course of action when one crosses the Rubicon.'",
                optionA = "Passes through a border checkpoint",
                optionB = "Crosses a dangerous river",
                optionC = "Takes an irrevocable and decisive step",
                optionD = "Passes a special military examination",
                correctAnswerIndex = 2,
                explanation = "To 'cross the Rubicon' means to make an irreversible commitment or take a decisive step from which there is no turning back.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_007",
                subject = "English Language",
                topic = "Idioms: Pull the wool over eyes",
                year = "1983",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'The salesman tried to pull the wool over my eyes.'",
                optionA = "Force me to buy his goods",
                optionB = "Offer me high quality cotton wool",
                optionC = "Cover my eyes with a warm fabric",
                optionD = "Deceive and dupe me",
                correctAnswerIndex = 3,
                explanation = "To 'pull the wool over someone's eyes' means to deceive, trick, or mislead them.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_008",
                subject = "English Language",
                topic = "Idioms: Count chickens before they hatch",
                year = "1983",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'Ijeoma counted her chickens before they were hatched.'",
                optionA = "Anticipated future success too prematurely",
                optionB = "Kept an exact inventory of her farm animals",
                optionC = "Protected her eggs carefully from cracking",
                optionD = "Insured her livestock against loss",
                correctAnswerIndex = 0,
                explanation = "To 'count one's chickens before they hatch' means to rely prematurely on a future benefit or success before it is guaranteed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_009",
                subject = "English Language",
                topic = "Idioms: In the air",
                year = "1983",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'Solo has resigned his job. His plans are still quite in the air.'",
                optionA = "Fully confirmed and finalized",
                optionB = "Sent through airmail",
                optionC = "Uncertain and unsettled",
                optionD = "Airborne and progressing rapidly",
                correctAnswerIndex = 2,
                explanation = "When plans are 'in the air', they are undecided, uncertain, or not yet settled.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_010",
                subject = "English Language",
                topic = "Vocabulary & Collocations",
                year = "1983",
                questionText = "Choose the option that best completes the sentence:\n'After the initial confusion, the Manager's suggestion brought a _____ of hope to the depressed investors.'",
                optionA = "glitter",
                optionB = "glimmer",
                optionC = "sparkle",
                optionD = "shower",
                correctAnswerIndex = 1,
                explanation = "The standard English collocation is 'a glimmer of hope', which denotes a faint, slight sign of hope or optimism.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_011",
                subject = "English Language",
                topic = "Nouns: Uncountable Nouns",
                year = "1983",
                questionText = "Choose the grammatically correct sentence:",
                optionA = "The young lady decided to reject all the advices given by her relatives",
                optionB = "The young lady decided to reject all the advice given by her relations",
                optionC = "The young lady decided to do away with the many advices given by her relatives",
                optionD = "The young lady decided to eject all the advices given by her relatives",
                correctAnswerIndex = 1,
                explanation = "'Advice' is an uncountable noun in English and never takes a plural 's'. 'Relations' or 'relatives' is grammatically sound, making 'all the advice given by her relations' the only correct option.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q37"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_012",
                subject = "English Language",
                topic = "Nouns: Furniture & Equipment",
                year = "1983",
                questionText = "Choose the correct sentence:",
                optionA = "The school Board has placed an order for all the furnitures and equipments required in the new schools",
                optionB = "The school Board has placed an order for all the furniture and equipment required in the new schools",
                optionC = "The school Board has placed an order for all of the furniture and equipments required in the new schools",
                optionD = "The school Board has placed an order for many of the furnitures and equipments required in the new schools",
                correctAnswerIndex = 1,
                explanation = "Both 'furniture' and 'equipment' are uncountable non-count nouns that cannot be pluralized as 'furnitures' or 'equipments'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_013",
                subject = "English Language",
                topic = "Order of Adjectives",
                year = "1983",
                questionText = "Choose the option with the correct order of adjectives:\n'On his way back the boy ran into a long procession of men, women and children in _____.'",
                optionA = "white beautiful exceedingly flowing gowns",
                optionB = "exceedingly flowing white beautiful gowns",
                optionC = "exceedingly beautiful white flowing gowns",
                optionD = "white flowing exceedingly beautiful gowns",
                correctAnswerIndex = 2,
                explanation = "The standard order of modifiers is: Adverb of degree (exceedingly) + Opinion (beautiful) + Colour (white) + Participle/Style (flowing) + Noun (gowns).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_014",
                subject = "English Language",
                topic = "Phrasal Verbs: Stand in",
                year = "1983",
                questionText = "Choose the option that best completes the sentence:\n'The Head of Department is away to the Airport and has asked Dr. Haruna to stand _____ for him.'",
                optionA = "out",
                optionB = "in",
                optionC = "on",
                optionD = "across",
                correctAnswerIndex = 1,
                explanation = "To 'stand in for' someone means to act as a substitute or take their place temporarily.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_015",
                subject = "English Language",
                topic = "Prepositions: Enquire into",
                year = "1983",
                questionText = "Choose the option that best completes the sentence:\n'The Commission was set up to enquire _____ the general conditions of child abuse in such institutions.'",
                optionA = "at",
                optionB = "from",
                optionC = "after",
                optionD = "into",
                correctAnswerIndex = 3,
                explanation = "To 'enquire into' a matter means to investigate or examine the facts surrounding it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_016",
                subject = "English Language",
                topic = "Verbs: Lie vs Lay",
                year = "1983",
                questionText = "Choose the correct past participle form:\n'The dead body of the armed robber has _____ in the street for three days.'",
                optionA = "laid",
                optionB = "lain",
                optionC = "layed",
                optionD = "lied",
                correctAnswerIndex = 1,
                explanation = "The intransitive verb 'to lie' (to recline or rest horizontally) has the principal parts: lie, lay, lain. With 'has', the past participle 'lain' is required.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q55"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_017",
                subject = "English Language",
                topic = "Gerunds: Accustomed to",
                year = "1983",
                questionText = "Choose the correct verbal form:\n'Candidates who are not accustomed to _____ fast will find it difficult to finish this paper.'",
                optionA = "write",
                optionB = "have written",
                optionC = "be writing",
                optionD = "writing",
                correctAnswerIndex = 3,
                explanation = "The prepositional adjective phrase 'accustomed to' takes a gerund (-ing form), i.e., 'accustomed to writing'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q56"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_018",
                subject = "English Language",
                topic = "Verb Complements: Mind",
                year = "1983",
                questionText = "Choose the correct verbal form:\n'Do you mind _____ another minute or two?'",
                optionA = "to wait",
                optionB = "wait",
                optionC = "waiting",
                optionD = "having awaited",
                correctAnswerIndex = 2,
                explanation = "The verb 'mind' is followed by a gerund ('waiting').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q57"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_019",
                subject = "English Language",
                topic = "Prepositions with Prefer",
                year = "1983",
                questionText = "Choose the correct preposition:\n'I always prefer the theatre _____ the cinema.'",
                optionA = "than",
                optionB = "then",
                optionC = "before",
                optionD = "to",
                correctAnswerIndex = 3,
                explanation = "The verb 'prefer' takes the preposition 'to', never 'than' ('prefer X to Y').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q66"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1983_020",
                subject = "English Language",
                topic = "Subjunctive & Conditional: As if",
                year = "1983",
                questionText = "Choose the option that best completes the sentence:\n'He acts _____ he were a manager.'",
                optionA = "like",
                optionB = "such as",
                optionC = "as",
                optionD = "as if",
                correctAnswerIndex = 3,
                explanation = "'As if' (or 'as though') is followed by the subjunctive past 'were' to indicate a hypothetical or contrary-to-fact situation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1983 • Q67"
            )
        )

        // =========================================================================
        // JAMB USE OF ENGLISH 1984
        // =========================================================================
        val passage1984_1 = """
            A British electronics manufacturer has built a factory in which quartz crystals can be grown in 3 weeks. The natural growth of quartz takes 3 million years, and very often the crystals are not sufficiently pure to satisfy the precise needs of science. However, the manufactured crystals are exceptionally pure, and this is important because quartz, in transistors, is used in an astonishing number of devices where constant accuracy is required: radio and television transmitters and receivers, space satellites and computers are familiar examples. In order to make artificial quartz, very small pieces of the natural crystal imported from Brazil are placed in long, narrow, steel cylinders. A high pressure and a high temperature are maintained within the cylinders for 3 weeks, and at the end of this time the small fragments have grown to the required weight of one pound. The quartz is then ready to be made into the tiny transistors that have replaced the much larger thermionic valves.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_1984_021",
                subject = "English Language",
                topic = "Comprehension: Science & Technology",
                year = "1984",
                questionText = "$passage1984_1\n\nThe manufactured crystals have to be pure:",
                optionA = "Because natural quartz is always pure",
                optionB = "To maintain hygiene in factory operations",
                optionC = "To satisfy the exact and precise requirements of science",
                optionD = "Otherwise they would take 3 million years to grow",
                correctAnswerIndex = 2,
                explanation = "The passage states: 'The natural growth of quartz takes 3 million years, and very often the crystals are not sufficiently pure to satisfy the precise needs of science. However, the manufactured crystals are exceptionally pure...'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_022",
                subject = "English Language",
                topic = "Comprehension: Comparative Technology",
                year = "1984",
                questionText = "$passage1984_1\n\nArtificial quartz as compared with natural quartz is:",
                optionA = "Superior in purity and speed of production",
                optionB = "Inferior in conductivity",
                optionC = "Just the same in every physical parameter",
                optionD = "Extremely limited in scientific application",
                correctAnswerIndex = 0,
                explanation = "Manufactured quartz takes only 3 weeks (compared to 3 million years) and is 'exceptionally pure', making it superior for precision devices.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q8"
            )
        )

        val passage1984_2 = """
            In 1973 a Japanese sericulturist arrived in Malawi with a batch of 40,000 silkworm eggs. They were taken to the Bvumbwe Agricultural Research Station in Thyolo District. In this station, work is being done to determine favourable silkworm rearing conditions and areas where mulberry trees, whose leaves the worms feed on, could grow well. According to researchers, the silkworms – which eventually develop into cocoons from which raw silk is produced – do well in areas with warm climatic conditions.
            Silk is one of the strongest of fibres. In fact, for thousands of years, silk fabrics have been regarded as the most beautiful and durable materials woven by man. Many people call silk the ‘cloth of kings and queens’.
            The weaving of silk originated in China. An old Chinese book, believed to be written by Confucius, tells us that the wife of Emperor Huang-ti was the first person to make fabrics of silk. Around 2640 B.C., Emperor Huang-ti asked his wife Hsi Ling-shih to study the worms that were destroying the mulberry trees in his garden. The Empress took some of the cocoons into the palace to see what they were made of. She dropped one of the cocoons into a bowl of boiling water and was amazed to see a cobweb-like tangle separate itself from the cocoon. She picked up the gauzy mass and found that one of the threads could be unwound almost without end from the cocoon. Hsi Ling-shih had discovered silk. She was delighted with the discovery and even wove a ceremonial robe for the Emperor out of the cocoon threads.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_1984_023",
                subject = "English Language",
                topic = "Comprehension: History of Sericulture",
                year = "1984",
                questionText = "$passage1984_2\n\nSericulture is:",
                optionA = "Carried out exclusively in ancient China",
                optionB = "The breeding and rearing of silkworms for the production of silk",
                optionC = "The chemical synthesis of artificial fabrics",
                optionD = "The cultivation of ornamental mulberry trees",
                correctAnswerIndex = 1,
                explanation = "Sericulture is defined in the context as the specialized agricultural science of breeding and rearing silkworms for raw silk production.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_024",
                subject = "English Language",
                topic = "Comprehension: Discovery of Silk",
                year = "1984",
                questionText = "$passage1984_2\n\nIt is implied in the passage that silk was discovered:",
                optionA = "After decades of planned laboratory experimentation",
                optionB = "By accident when a cocoon was dropped into boiling water",
                optionC = "Through a competitive decree issued by Emperor Huang-ti",
                optionD = "By Japanese scientists visiting Africa",
                correctAnswerIndex = 1,
                explanation = "The Empress accidentally discovered silk when she dropped a cocoon into a bowl of boiling water and observed the threads separating.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q22"
            )
        )

        // 1984 Lexis & Structure
        list.add(
            QuestionEntity(
                id = "eng_1984_025",
                subject = "English Language",
                topic = "Phrasal Verbs: Call off",
                year = "1984",
                questionText = "Choose the option nearest in meaning to the underlined word:\n'The meeting was cancelled because of the convocation ceremony.'",
                optionA = "brought up",
                optionB = "called off",
                optionC = "broken off",
                optionD = "phased out",
                correctAnswerIndex = 1,
                explanation = "To 'call off' an event means to cancel it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_026",
                subject = "English Language",
                topic = "Phrasal Verbs: Run into",
                year = "1984",
                questionText = "Choose the option nearest in meaning to the underlined word:\n'Our town is so small that we are always meeting our schoolmates accidentally.'",
                optionA = "coming across",
                optionB = "falling into",
                optionC = "knocking up",
                optionD = "running into",
                correctAnswerIndex = 3,
                explanation = "To 'run into' someone means to meet them unexpectedly or by chance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_027",
                subject = "English Language",
                topic = "Phrasal Verbs: Account for",
                year = "1984",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'Can you give a good explanation for your strange behaviour?'",
                optionA = "account for",
                optionB = "call for",
                optionC = "clear up",
                optionD = "make up",
                correctAnswerIndex = 0,
                explanation = "To 'account for' something means to explain the reason or cause for it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_028",
                subject = "English Language",
                topic = "Idioms: Bite off more than one can chew",
                year = "1984",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'In their desire to impress their friends, many young workers bite off more than they can chew in terms of financial obligations.'",
                optionA = "Spend all their income on rich foods",
                optionB = "Take on more responsibility than they can afford",
                optionC = "Show off their sudden wealth in public",
                optionD = "Borrow from multiple banks recklessly",
                correctAnswerIndex = 1,
                explanation = "To 'bite off more than one can chew' means to undertake a task or commitment that is too large or demanding to handle.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_029",
                subject = "English Language",
                topic = "Antonyms: Ideal",
                year = "1984",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'The long straight trunk of the tree is ideal for round wood uses like railway sleepers and rafters.'",
                optionA = "best",
                optionB = "perfect",
                optionC = "most unsuitable",
                optionD = "satisfactory",
                correctAnswerIndex = 2,
                explanation = "'Ideal' means optimal, perfect, or most suitable. Its direct antonym is 'most unsuitable'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_030",
                subject = "English Language",
                topic = "Prepositions: Apologize for",
                year = "1984",
                questionText = "Choose the option that best completes the sentence:\n'The student who went home without an exeat has apologized _____ his misconduct.'",
                optionA = "on",
                optionB = "at",
                optionC = "to",
                optionD = "for",
                correctAnswerIndex = 3,
                explanation = "One apologizes 'to' a person 'for' a wrongdoing or misconduct.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_031",
                subject = "English Language",
                topic = "Prepositions: Desist from",
                year = "1984",
                questionText = "Choose the option that best completes the sentence:\n'The Chairman has advised students to desist _____ blackmailing college authorities.'",
                optionA = "from",
                optionB = "in",
                optionC = "on",
                optionD = "against",
                correctAnswerIndex = 0,
                explanation = "The verb 'desist' takes the preposition 'from' + gerund ('desist from doing something').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q52"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_032",
                subject = "English Language",
                topic = "Vocabulary: Broadcast Form",
                year = "1984",
                questionText = "Choose the correct past participle form:\n'The Governor has _____ to the people on many occasions.'",
                optionA = "broadcast",
                optionB = "been broadcast",
                optionC = "broadcasted",
                optionD = "been broadcasted",
                correctAnswerIndex = 0,
                explanation = "The verb 'broadcast' has the invariant principal parts: broadcast, broadcast, broadcast. 'Broadcasted' is non-standard.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q82"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_033",
                subject = "English Language",
                topic = "Past Perfect Conditional",
                year = "1984",
                questionText = "Choose the option that best completes the conditional clause:\n'If the armed robbers _____ caught, they would have been lynched.'",
                optionA = "would be",
                optionB = "have been",
                optionC = "were",
                optionD = "had been",
                correctAnswerIndex = 3,
                explanation = "In third conditional sentences (unreal past), the 'if'-clause takes the past perfect ('had been caught') to pair with 'would have been' in the main clause.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q93"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_034",
                subject = "English Language",
                topic = "Phrasal Verbs: Break loose",
                year = "1984",
                questionText = "Choose the correct phrasal verb:\n'Omeime was taking his dog for a walk when the dog suddenly _____ from its chain and escaped.'",
                optionA = "broke through",
                optionB = "broke lose",
                optionC = "broke even",
                optionD = "broke loose",
                correctAnswerIndex = 3,
                explanation = "To 'break loose' means to escape suddenly from physical restraint or confinement.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q95"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1984_035",
                subject = "English Language",
                topic = "Pronouns: Possessive Pronouns",
                year = "1984",
                questionText = "Choose the correct possessive pronoun:\n'After we have taken our share, we shall give _____ to them.'",
                optionA = "their",
                optionB = "their's",
                optionC = "theirs",
                optionD = "there's",
                correctAnswerIndex = 2,
                explanation = "The absolute possessive pronoun 'theirs' is written without an apostrophe.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1984 • Q96"
            )
        )

        return list
    }
}
