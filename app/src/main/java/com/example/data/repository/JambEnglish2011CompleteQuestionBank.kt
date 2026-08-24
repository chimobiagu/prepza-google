package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, standardized, and verified complete 2011 JAMB UTME Use of English Examination (Questions 1 to 100).
 * Standardized to 4 options (A-D) with full comprehension passages, answer keys, and educational explanations.
 */
object JambEnglish2011CompleteQuestionBank {

    fun getEnglish2011Questions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =====================================================================
        // PASSAGES
        // =====================================================================
        val passage1 = """
            In 1962, a team of scientists produced a special radio station that had a range of fifteen miles. Even though communication was being accomplished in space at a range of more than a million times this distance, the new radio station caused much excitement among scientists. The reason: its power supply was a ‘battery’ made of bacteria. For the first time, practical amounts of electricity were being produced by a form of life and put to use.

            Bio cell, the new power supply, had a liquid fuel containing tiny forms of life that changed the fuel directly into electric energy; this was far more than an interesting experiment. The bio cell is being developed as a producer of electricity for radio, for signals to guide ships, for lighting and other uses. Though the working bio cell is only a few years old, some scientists feel that it will one day produce power as cheaply as is now being done by other methods, and that the bio cell will use materials that would otherwise be considered a waste. Early bio cells were powered with sugar, but a wide range of fuel can be used. Work is being done using sea water to feed the bacteria.

            Electricity from living cells is no new idea. Man experienced the strange shock produced by some fish even before electricity was really discovered. Then in time, there were other discoveries. Benjamin Franklin found that lightning in the sky was electricity. Luigi Galvani found some electricity in the muscles and nerves of animals, but the African catfish produced far more electricity than most other living creatures. And another fish, the electric eel, is well named, for it has an even greater electric charge. Research workers also discovered that even humans produce small amounts of electricity in their bodies. Our hearts produce a very small amount that can be measured, so do our brains. The bio cell is completely new in the field of power production and as yet, no mass-production models have begun to replace the older type of batteries. It might be wondered, then, what the excitement is all about.
        """.trimIndent()

        val passage2 = """
            Like a clock with the pendulum in full swing, the mind moves as fast as time. But we ought to be careful to what we turn our thoughts, for if they are not our friends, they will be too many for us and will drag us down to ruin.

            But some people may say that they cannot help having bad thoughts even though they sting like vipers. That may be so, but the question is, do they hate them or not?. We cannot keep thieves from looking in at our window, but if we open our doors to them and receive them joyfully, we are as bad as they. We cannot help the birds flying over our heads; but we may keep them from building their nests in our hair. Vain thoughts will knock at the door but we must not open to them. Though bad and evil thoughts rise in our hearts, they must not be allowed to reign. He who turns a morsel over and over in his mouth does so because he likes the flavour, and he who meditates upon evil, loves it, and is ripe to commit it. Think of the devil, and he will appear; turn your thoughts toward evil and your hands will soon follow. Snails leave their slime behind them, and so do vain thoughts. An arrow may fly through the air and leave no trace, but an evil thought always leaves a trail like a serpent.

            Where there is much traffic of bad thinking, there will be much mire and dirt. Every wave of wicked thought adds something to the corruption which rots upon the shore of life. It is dreadful to think that a vile imagination, once indulged, gets the key of our minds, and can get in again very easily, whether or not we let it in, and what may follow, no one knows. Nurse evil on the laps of thought, and it will grow into a giant. Therefore, there is wisdom in watching every day the thoughts and imagination of our heart. Good thoughts are blessed guests and should be welcomed, and much sought after, but bad thoughts must fly out as swiftly as they moved in.
        """.trimIndent()

        val passage3 = """
            Though assumption is the lowest level of knowledge; it is still a form of knowledge, and knowledge is key. Assumptions are the foundation upon which interpretation and conclusion are built. Everything in life operates under certain assumptions.

            We make management decisions based on the assumptions we hold about how management ought to function and how people ought to be governed. For some of us, we consciously imbibe assumptions and principles about life and consciously decide based on them; for others, it is unconscious but potent all the same. Our assumptions will either drown us or help us soar through life.

            We have always seen life as an immense mansion with many rooms. Some rooms lead to wealth, others to the opposite. Ultimately, we decide where we end up; and life, thus far, has proved that not everyone of us decides well. We all behave differently where we have different levels of understanding, and behave the same way where our understanding is the same.

            We eat because we all understand the consequences of not eating. We all wear clothes because each of us comprehends lunacy. The list goes on and on. It is inevitable that some of us will make choices that get and keep us on the lower rung of the ladder by reason of exposure, training or some other variables. Life is about role playing. We choose our roles wisely or foolishly, consciously or unconsciously. Some of us get wiser to new levels of self-awareness enough to redefine our roles, others make no effort to build further capacity and therefore remain where they are.

            It is based on those realities that we draw the conclusion that not everyone will be wealthy in life. We lead, inspire and motivate people to strive and succeed. It is also important that we paint the full and true picture of life so that we can discourage vain pursuits. Balance must be enthroned as a critical component of truth, and people know, for instance, that ‘the top’ is not a place that all must ascend.

            Our greatest consolation lies in our deep conviction that true prosperity is in fulfillment through hard work than in intangible acquisition. There are set roles that some of us have been wired up to play in life but which we are not content enough to play because society esteems such roles to be inferior. Take the almost sacred office of a teacher for instance; there are people who have the natural gifts and inclinations to be school teachers. But teaching profession, as it is, does not appear to be lucrative. So we have people who could have been more fulfilled and effective working as school teachers serving in banks.
        """.trimIndent()

        val passage4 = """
            Believe it or not, change is to human existence what the blood is to the human body. We live in an era of amazing fast-paced change spawned by advancing technology and industrialization. However, man’s commitment to promoting and defending change in a deliberate effort to establish customs that stimulate advancement for man’s concern is proving unfavorable to the climate with threatening repercussions. Human-induced climate change has awakened widespread concern across the globe. As a matter of fact, climate change is now a foremost global issue. It is a major test of Africa’s ingenuity! The Fourth Assessment Report (AR4) of the Intergovernmental Panel on Climate Change (IPCC) confirms that human actions are changing the earth’s climate and creating major disturbance in human society and ecosystems. The IPCC reports that the world has warmed by an average of 0.76°C since pre-industrial times. The rising global demand for energy and the adverse changes on each were commensurate with the level of greenhouse emissions it spews out, perhaps Africa would have been spared and would probably be just an amused spectator. But as it is, this is not the case. Here again, we see well-meaning global citizens appealing for the rest of the world to take responsibility for the problem of Africa, a strategy that cannot, thus far, be termed credible.
        """.trimIndent()

        // ---------------------------------------------------------------------
        // SECTION A: COMPREHENSION & CLOZE (Questions 1 - 25)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_01",
                subject = "English Language",
                topic = "General Instructions",
                year = "2011",
                questionText = "Which question paper type of Use of English is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D",
                correctAnswerIndex = 3,
                explanation = "According to the official UTME 2011 marking scheme, this examination paper corresponds to Type D.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_02",
                subject = "English Language",
                topic = "Comprehension: Bio-Cells & Living Energy",
                year = "2011",
                questionText = "The writer’s posture, as conveyed in the statement 'Electricity from living cells is no new idea', can be described as:",
                optionA = "Ineffectual",
                optionB = "Contentious and argumentative",
                optionC = "Logical",
                optionD = "Unguarded",
                correctAnswerIndex = 1,
                explanation = "The author adopts a contentious stance to challenge the assumption that biological electricity is purely a modern concept by citing historic discoveries.",
                passageText = passage1,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_03",
                subject = "English Language",
                topic = "Comprehension: Bio-Cells & Living Energy",
                year = "2011",
                questionText = "Which of the following is true according to the passage on bio-cells?",
                optionA = "Scientists felt that bio-cells would produce exceptionally costly energy",
                optionB = "Bio-cells, at the beginning, derived their energy from sugar",
                optionC = "Sugar and diesel fuel were simultaneously required to feed bacteria",
                optionD = "Bio-cells were initially tested on spacecraft circuits only",
                correctAnswerIndex = 1,
                explanation = "The passage explicitly states: 'Early bio cells were powered with sugar, but a wide range of fuel can be used.'",
                passageText = passage1,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_04",
                subject = "English Language",
                topic = "Comprehension: Bio-Cells & Living Energy",
                year = "2011",
                questionText = "The scientists justified the future development of the bio-cell by arguing that it would:",
                optionA = "develop ways for converting bio-cells directly into crude petroleum",
                optionB = "yield a sustainable source of energy cheaply using waste materials",
                optionC = "replace every electrical grid on Earth immediately",
                optionD = "eliminate all other biological research",
                correctAnswerIndex = 1,
                explanation = "The text indicates that bio-cells will one day produce power as cheaply as current methods and utilize materials otherwise discarded as waste.",
                passageText = passage1,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_05",
                subject = "English Language",
                topic = "Comprehension: Bio-Cells & Living Energy",
                year = "2011",
                questionText = "According to the passage, electrical phenomena in nature were first directly experienced by humans in:",
                optionA = "the human heart and brain",
                optionB = "the muscles of laboratory frogs",
                optionC = "atmospheric lightning",
                optionD = "electric fish",
                correctAnswerIndex = 3,
                explanation = "The author notes that 'Man experienced the strange shock produced by some fish even before electricity was really discovered.'",
                passageText = passage1,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_06",
                subject = "English Language",
                topic = "Comprehension: Mental Discipline",
                year = "2011",
                questionText = "Which of the following represents the central philosophy expressed by the writer in Passage II?",
                optionA = "evil thoughts may arise, but moral virtue lies in refusing them entry and harbor",
                optionB = "evil thoughts will inevitably sting us like vipers regardless of our resistance",
                optionC = "like a mechanical pendulum, the mind is completely uncontrollable",
                optionD = "evil thoughts fly swiftly through human consciousness without leaving any impact",
                correctAnswerIndex = 0,
                explanation = "The author uses the metaphors of birds and thieves to demonstrate that although bad thoughts may knock, we must not let them nest or reign in our minds.",
                passageText = passage2,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_07",
                subject = "English Language",
                topic = "Comprehension: Mental Discipline",
                year = "2011",
                questionText = "Which statement summarizes the author's primary warning in the first paragraph of Passage II?",
                optionA = "evil thoughts will eventually ruin only the physically weak",
                optionB = "if we do not stop the pendulum from swinging, our thoughts will freeze",
                optionC = "uncontrolled harmful thoughts will multiply and drag an individual down to ruin",
                optionD = "the speed of time is solely governed by human imagination",
                correctAnswerIndex = 2,
                explanation = "The writer warns: 'if they are not our friends, they will be too many for us and will drag us down to ruin.'",
                passageText = passage2,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_08",
                subject = "English Language",
                topic = "Comprehension: Mental Discipline",
                year = "2011",
                questionText = "From the second paragraph, evil thoughts conquer and control the lives of individuals who:",
                optionA = "are completely helpless against external temptations",
                optionB = "reject all forms of introspection",
                optionC = "are convicted thieves by profession",
                optionD = "cherish, ruminate, and meditate upon them",
                correctAnswerIndex = 3,
                explanation = "The text argues that 'he who turns a morsel over and over in his mouth does so because he likes the flavour, and he who meditates upon evil, loves it, and is ripe to commit it.'",
                passageText = passage2,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_09",
                subject = "English Language",
                topic = "Comprehension: Mental Discipline",
                year = "2011",
                questionText = "The expression 'Think of the devil, and he will appear...' suggests in context that:",
                optionA = "the devil is an imaginary creature without real influence",
                optionB = "entertaining evil thoughts inevitably translates into evil actions",
                optionC = "evil thoughts are purely generated by demonic intervention",
                optionD = "speaking about morality attracts wicked individuals",
                correctAnswerIndex = 1,
                explanation = "The passage explains: 'turn your thoughts toward evil and your hands will soon follow.'",
                passageText = passage2,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_10",
                subject = "English Language",
                topic = "Comprehension: Mental Discipline",
                year = "2011",
                questionText = "Which statement best summarizes the conclusion in the final paragraph of Passage II?",
                optionA = "physical roads with dirt and mire generate psychological instability",
                optionB = "the more we indulge in vile thoughts, the more corrupt and morally enslaved we become",
                optionC = "good thoughts require no cultivation or deliberate welcoming",
                optionD = "the human heart cannot discern between good and evil guests",
                correctAnswerIndex = 1,
                explanation = "The author concludes that indulging vile imagination grants it 'the key of our minds' and allows evil to grow into an unmanageable giant.",
                passageText = passage2,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_11",
                subject = "English Language",
                topic = "Comprehension: Epistemology & Purpose",
                year = "2011",
                questionText = "According to the writer in Passage III, leaders motivate and inspire others because they aim to:",
                optionA = "project individual contribution and capacity toward fulfillment",
                optionB = "force everyone into high-paying corporate banking careers",
                optionC = "eliminate all differences in human understanding",
                optionD = "prevent all forms of material acquisition",
                correctAnswerIndex = 0,
                explanation = "The writer states that leadership encourages individuals to strive and succeed within their authentic capacities.",
                passageText = passage3,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_12",
                subject = "English Language",
                topic = "Comprehension: Epistemology & Purpose",
                year = "2011",
                questionText = "According to the passage, balance must be enthroned because it is:",
                optionA = "a method for eliminating economic disparities entirely",
                optionB = "an artificial standard imposed by societal institutions",
                optionC = "a critical component of truth that discourages vain pursuits and ensures authentic fulfillment",
                optionD = "a guarantee that every citizen will achieve immense wealth",
                correctAnswerIndex = 2,
                explanation = "The author notes that enthroning balance reveals that 'the top' is not a place everyone must ascend, steering people away from empty materialism.",
                passageText = passage3,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_13",
                subject = "English Language",
                topic = "Comprehension: Epistemology & Purpose",
                year = "2011",
                questionText = "The word 'inclinations', as used in the passage, contextually denotes:",
                optionA = "creeds",
                optionB = "natural tendencies and dispositions",
                optionC = "external inhibitions",
                optionD = "legal mandates",
                correctAnswerIndex = 1,
                explanation = "'Inclinations' refers to innate behavioral or vocational tendencies.",
                passageText = passage3,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_14",
                subject = "English Language",
                topic = "Comprehension: Epistemology & Purpose",
                year = "2011",
                questionText = "Which of the following propositions is strongly affirmed in Passage III?",
                optionA = "True prosperity consists in vocational fulfillment through hard work rather than mere tangible acquisition",
                optionB = "Every individual has the capacity to become exceptionally wealthy if given identical training",
                optionC = "Teaching should be abandoned for banking because banking is more fulfilling",
                optionD = "Assumptions have no influence over managerial decision making",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly affirms: 'true prosperity is in fulfillment through hard work than in intangible acquisition.'",
                passageText = passage3,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_15",
                subject = "English Language",
                topic = "Comprehension: Epistemology & Purpose",
                year = "2011",
                questionText = "From the passage, it can be inferred that:",
                optionA = "human behavior and life outcomes are fundamentally shaped by foundational assumptions and self-awareness",
                optionB = "all assumptions held by human beings are purely unconscious",
                optionC = "exposure and training play zero role in social hierarchy",
                optionD = "societal opinion always correctly values the most important professions",
                correctAnswerIndex = 0,
                explanation = "The author illustrates how assumptions, level of understanding, and self-awareness govern decisions in life.",
                passageText = passage3,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_16",
                subject = "English Language",
                topic = "Cloze Passage: Climate Change",
                year = "2011",
                questionText = "In Gap 16 ('We live in an era of amazing ... 16 ... change spawned by advancing technology'):",
                optionA = "well-defined",
                optionB = "fast-paced",
                optionC = "favorable",
                optionD = "social",
                correctAnswerIndex = 1,
                explanation = "Modern technological evolution is universally described as 'fast-paced'.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_17",
                subject = "English Language",
                topic = "Cloze Passage: Climate Change",
                year = "2011",
                questionText = "In Gap 17 ('However, man’s ... 17 ... promoting and defending change'):",
                optionA = "knowledge of",
                optionB = "attitude to",
                optionC = "commitment to",
                optionD = "opinion of",
                correctAnswerIndex = 2,
                explanation = "One's active dedication and drive is termed a 'commitment to' a cause.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_18",
                subject = "English Language",
                topic = "Cloze Passage: Climate Change",
                year = "2011",
                questionText = "In Gap 18 ('...effort to establish ... 18 ... that stimulate advancement'):",
                optionA = "customs",
                optionB = "companies",
                optionC = "trade-zones",
                optionD = "variations",
                correctAnswerIndex = 0,
                explanation = "'Customs' or institutional practices are established to stimulate socio-economic advancement.",
                passageText = passage4,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_19",
                subject = "English Language",
                topic = "Cloze Passage: Climate Change",
                year = "2011",
                questionText = "In Gap 19 ('...unfavorable to the climate with threatening ... 19 ...'):",
                optionA = "repercussions",
                optionB = "clouds",
                optionC = "pressure",
                optionD = "implications",
                correctAnswerIndex = 0,
                explanation = "'Repercussions' refers to serious, adverse ecological consequences.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_20",
                subject = "English Language",
                topic = "Cloze Passage: Climate Change",
                year = "2011",
                questionText = "In Gap 20 ('...climate change is now ... 20 ... global issue'):",
                optionA = "an acceptable",
                optionB = "a foremost",
                optionC = "the only",
                optionD = "the last",
                correctAnswerIndex = 1,
                explanation = "'A foremost' issue means one of the most prominent and urgent global challenges.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_21",
                subject = "English Language",
                topic = "Cloze Passage: Climate Change",
                year = "2011",
                questionText = "In Gap 21 ('It is a major test of Africa’s ... 21 ...!'):",
                optionA = "popularity",
                optionB = "energy",
                optionC = "ingenuity",
                optionD = "incapability",
                correctAnswerIndex = 2,
                explanation = "'Ingenuity' refers to clever inventiveness and adaptive problem-solving.",
                passageText = passage4,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_22",
                subject = "English Language",
                topic = "Cloze Passage: Climate Change",
                year = "2011",
                questionText = "In Gap 22 ('...creating major disturbance in human ... 22 ... and ecosystems'):",
                optionA = "geography",
                optionB = "society",
                optionC = "systems",
                optionD = "life",
                correctAnswerIndex = 1,
                explanation = "Human 'society' pairs naturally with natural 'ecosystems'.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_23",
                subject = "English Language",
                topic = "Cloze Passage: Climate Change",
                year = "2011",
                questionText = "In Gap 23 ('The rising global ... 23 ... for energy...'):",
                optionA = "command",
                optionB = "demand",
                optionC = "warning",
                optionD = "supply",
                correctAnswerIndex = 1,
                explanation = "'Demand for energy' is the standard economic and ecological collocation.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_24",
                subject = "English Language",
                topic = "Cloze Passage: Climate Change",
                year = "2011",
                questionText = "In Gap 24 ('...with the level of greenhouse ... 24 ... it spews out'):",
                optionA = "structure",
                optionB = "paints",
                optionC = "emulsion",
                optionD = "emissions",
                correctAnswerIndex = 3,
                explanation = "'Greenhouse gas emissions' is the precise scientific term for gases released into the atmosphere.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_25",
                subject = "English Language",
                topic = "Cloze Passage: Climate Change",
                year = "2011",
                questionText = "In Gap 25 ('...a strategy that cannot, thus far, be termed ... 25 ...'):",
                optionA = "notable",
                optionB = "liable",
                optionC = "credible",
                optionD = "flexible",
                correctAnswerIndex = 2,
                explanation = "A 'credible' strategy is one that is convincingly effective and trustworthy.",
                passageText = passage4,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        // ---------------------------------------------------------------------
        // SECTION B: LEXIS, STRUCTURE & IDIOMS (Questions 26 - 35)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_26",
                subject = "English Language",
                topic = "Conditional Clauses & Subjunctive",
                year = "2011",
                questionText = "'If he were here, it could be more fun.'\nThis sentence implies that:",
                optionA = "He was expected but did not show up to make the occasion lively",
                optionB = "There was no fun whatsoever at the occasion",
                optionC = "He was absent, and so the occasion lacked much fun",
                optionD = "He was being expected to supply the refreshments",
                correctAnswerIndex = 2,
                explanation = "The subjunctive conditional ('If he were here...') indicates counterfactual reality: he is not here, hence the event lacked the added fun.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_27",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2011",
                questionText = "The secretary said that the postponement of the meeting was due to unforeseen circumstances.\nThis means that:",
                optionA = "The date of the meeting was shifted as a result of unexpected reasons",
                optionB = "The meeting’s date was put off for strange reasons",
                optionC = "The meeting was called off permanently due to unknown obstacles",
                optionD = "The meeting broke off as a result of sudden internal conflict",
                correctAnswerIndex = 0,
                explanation = "'Unforeseen circumstances' means events that were unanticipated and unexpected.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_28",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2011",
                questionText = "The hunter has a bird’s-eye view of the animals.\nThis means that:",
                optionA = "He views the animals clearly from an elevated, panoramic vantage point",
                optionB = "He examines the eyes of the birds in the forest",
                optionC = "He watches the birds on the tree using only one eye",
                optionD = "He mimics the flight of birds to get closer to game",
                correctAnswerIndex = 0,
                explanation = "A 'bird's-eye view' is an elevated, broad overview of a landscape or situation from above.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_29",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2011",
                questionText = "Even though Susan was the last in the examination, her result wasn’t too different from what had been expected.\nThis means that:",
                optionA = "Her result was an unexpected shock to the family",
                optionB = "Her performance was a bitter disappointment",
                optionC = "Her poor performance had been anticipated",
                optionD = "She had studied exceptionally hard for the exam",
                correctAnswerIndex = 2,
                explanation = "The phrase 'wasn't too different from what had been expected' confirms that the outcome aligned with expectations.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_30",
                subject = "English Language",
                topic = "Proverbs & Idioms",
                year = "2011",
                questionText = "Mrs. Adasu does all her work with more haste, less speed.\nThis implies that:",
                optionA = "She executes tasks hurriedly and carelessly",
                optionB = "She approaches everything with reckless abandon",
                optionC = "She completes everything very quickly to meet deadlines",
                optionD = "She performs her duties patiently and meticulously to avoid mistakes",
                correctAnswerIndex = 3,
                explanation = "The proverb 'more haste, less speed' teaches that rushing leads to mistakes; therefore, working deliberately and carefully achieves faster overall progress.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_31",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2011",
                questionText = "She stopped her education as her uncle left her in the lurch.\nThis means that:",
                optionA = "Her uncle deceived her with false promises",
                optionB = "Her uncle legally disinherited her",
                optionC = "Her uncle abandoned her in a difficult financial situation without assistance",
                optionD = "Her uncle expelled her from his household",
                correctAnswerIndex = 2,
                explanation = "To 'leave someone in the lurch' means to desert or abandon them in a state of distress.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_32",
                subject = "English Language",
                topic = "Vocabulary & Phrasal Meanings",
                year = "2011",
                questionText = "The plan to upgrade the dispensary to a general hospital did not materialize.\nThis implies that:",
                optionA = "The project failed to meet government technical specifications",
                optionB = "The proposed arrangement did not happen or come into reality",
                optionC = "Building materials were too expensive to purchase",
                optionD = "The purchased hospital beds were defective",
                correctAnswerIndex = 1,
                explanation = "If a plan does not 'materialize', it means it fails to become a reality.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_33",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2011",
                questionText = "Okon’s company took a hit last year.\nThis means that:",
                optionA = "His company enjoyed exceptional commercial growth",
                optionB = "His company suffered severe financial loss or setback",
                optionC = "His company was newly incorporated",
                optionD = "His company acquired competitor shares",
                correctAnswerIndex = 1,
                explanation = "To 'take a hit' is a standard business idiom meaning to suffer a financial damage or setback.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_34",
                subject = "English Language",
                topic = "Relative Clauses & Apposition",
                year = "2011",
                questionText = "'My eldest son, who is in Lagos, is studying English.'\nThis sentence implies that:",
                optionA = "The speaker has only one son",
                optionB = "All the speaker's sons reside in Lagos",
                optionC = "The speaker has more than one son, and the firstborn is in Lagos",
                optionD = "The speaker has sons who only study foreign languages",
                correctAnswerIndex = 2,
                explanation = "The superlative 'eldest' indicates that the speaker has at least three sons, with the oldest currently in Lagos.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_35",
                subject = "English Language",
                topic = "Conditional Sentences",
                year = "2011",
                questionText = "'If I went to the village, I would visit the king.'\nThis means that:",
                optionA = "Whenever I go to the village, I will certainly visit the king",
                optionB = "I did not go to the village, and therefore I did not visit the king",
                optionC = "I have permanently relocated to the king's palace",
                optionD = "The king requested my immediate presence in the village",
                correctAnswerIndex = 1,
                explanation = "The second conditional (past subjunctive + would) expresses a hypothetical situation contrary to past/present reality.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        // ---------------------------------------------------------------------
        // SECTION C: SYNONYMS / NEAREST IN MEANING (Questions 36 - 50)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_36",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nSince its *inception* in 1983, the newspaper has attracted thousands of readers.",
                optionA = "renaissance",
                optionB = "coming",
                optionC = "commencement",
                optionD = "publication",
                correctAnswerIndex = 2,
                explanation = "'Inception' refers to the origin, commencement, or initial establishment of an institution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_37",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nMrs. Asio wanted her sister to stop being so *detached*.",
                optionA = "friendly",
                optionB = "careless",
                optionC = "indifferent and aloof",
                optionD = "passionate",
                correctAnswerIndex = 2,
                explanation = "'Detached' means showing emotional distance, aloofness, or indifference.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_38",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nLantana *dwelt* in a ruined cottage on the hillside.",
                optionA = "sat",
                optionB = "worked",
                optionC = "slept",
                optionD = "lived and resided",
                correctAnswerIndex = 3,
                explanation = "To 'dwell' means to reside or live in a place as a permanent inhabitant.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_39",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe mistake brought the show to an *ignominious* end.",
                optionA = "a commendable",
                optionB = "a palatable",
                optionC = "a disgraceful and humiliating",
                optionD = "a satisfactory",
                correctAnswerIndex = 2,
                explanation = "'Ignominious' means characterized by shame, disgrace, or dishonor.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_40",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nHe *compliments* me on my meticulous way of doing things.",
                optionA = "imitates",
                optionB = "criticizes",
                optionC = "praises and commends",
                optionD = "disregards",
                correctAnswerIndex = 2,
                explanation = "To 'compliment' someone is to express praise, admiration, or congratulation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_41",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe girl is angry with her friend who had *ensnared* her into this relationship.",
                optionA = "tricked and entrapped",
                optionB = "encouraged",
                optionC = "persuaded",
                optionD = "forced physically",
                correctAnswerIndex = 0,
                explanation = "To 'ensnare' means to lure or trap someone through deceitful maneuvering.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_42",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nTheir new house was roofed with *corrugated* sheets.",
                optionA = "folded into ridges and grooves",
                optionB = "smooth iron",
                optionC = "thick concrete",
                optionD = "transparent plastic",
                correctAnswerIndex = 0,
                explanation = "'Corrugated' describes a material bent or shaped into alternating parallel ridges and grooves for strength.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_43",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe stockbroker said it was an *astute* move to sell the shares then.",
                optionA = "a disastrous",
                optionB = "a shrewd and perceptive",
                optionC = "an unprofitable",
                optionD = "an insincere",
                correctAnswerIndex = 1,
                explanation = "'Astute' means showing sharp, shrewd discernment and practical business acumen.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_44",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe principal described Oche as the most *tactful* person he had ever worked with.",
                optionA = "passionate",
                optionB = "diplomatic and discreet",
                optionC = "aggressive",
                optionD = "innovative",
                correctAnswerIndex = 1,
                explanation = "'Tactful' means possessing sensitivity and diplomacy in dealing with delicate interpersonal issues.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_45",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe old woman is suffering from *dementia*.",
                optionA = "lucidity",
                optionB = "senility and cognitive decline",
                optionC = "insomnia",
                optionD = "sagacity",
                correctAnswerIndex = 1,
                explanation = "'Dementia' is a medical condition characterized by progressive memory loss and cognitive decline (senility).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_46",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nSome drugs have *deleterious* effects on a child’s development.",
                optionA = "invigorating",
                optionB = "therapeutic",
                optionC = "harmful and damaging",
                optionD = "negligible",
                correctAnswerIndex = 2,
                explanation = "'Deleterious' means causing harm, injury, or severe damage.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_47",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nFila has always been described as *belligerent*.",
                optionA = "affable",
                optionB = "submissive",
                optionC = "combative and hostile",
                optionD = "magnanimous",
                correctAnswerIndex = 2,
                explanation = "'Belligerent' means hostile, aggressive, and eager to fight.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_48",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nLaraba saw a *forlorn* little figure sitting outside the class.",
                optionA = "boisterous and energetic",
                optionB = "lonely, sad, and abandoned",
                optionC = "smart and healthy",
                optionD = "pampered and cheerful",
                correctAnswerIndex = 1,
                explanation = "'Forlorn' means pitifully sad, abandoned, or desolate.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_49",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe circular *supersedes* all previous correspondence on the matter.",
                optionA = "supports",
                optionB = "displaces and replaces",
                optionC = "reiterates",
                optionD = "circumvents",
                correctAnswerIndex = 1,
                explanation = "To 'supersede' means to take precedence over and replace prior rules or documents.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_50",
                subject = "English Language",
                topic = "Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\nHer problem was *exacerbated* by the loss of her father.",
                optionA = "mitigated",
                optionB = "resolved",
                optionC = "aggravated and worsened",
                optionD = "overlooked",
                correctAnswerIndex = 2,
                explanation = "To 'exacerbate' means to make a bad situation or problem significantly worse.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        // ---------------------------------------------------------------------
        // SECTION D: ANTONYMS / OPPOSITE IN MEANING (Questions 51 - 65)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_51",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nThe warring communities were *coerced* into negotiating a settlement.",
                optionA = "driven",
                optionB = "compelled",
                optionC = "persuaded gently without force",
                optionD = "threatened",
                correctAnswerIndex = 2,
                explanation = "'Coerced' means compelled by force or intimidation; its direct opposite is 'persuaded'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_52",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nHis father served as a *mercenary* in the army.",
                optionA = "preacher",
                optionB = "regular and permanent soldier",
                optionC = "recruit",
                optionD = "guerrilla fighter",
                correctAnswerIndex = 1,
                explanation = "A 'mercenary' is a soldier hired for foreign financial gain; a 'regular' is a standing professional member of the state army.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_53",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nJummai is *cruel* to her husband.",
                optionA = "harsh",
                optionB = "brutal",
                optionC = "kind and compassionate",
                optionD = "ferocious",
                correctAnswerIndex = 2,
                explanation = "'Cruel' means inflicting suffering; the antonym is 'kind and compassionate'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_54",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nThe teacher who beat the student was treated with *mercy*.",
                optionA = "disrespect",
                optionB = "contempt",
                optionC = "vengeance and harsh punishment",
                optionD = "clemency",
                correctAnswerIndex = 2,
                explanation = "'Mercy' is leniency and forgiveness; its opposite is 'vengeance' or retribution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_55",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nHis wife hated his *garrulous* attitude.",
                optionA = "outspoken",
                optionB = "loquacious",
                optionC = "reticent and reserved",
                optionD = "thoughtful",
                correctAnswerIndex = 2,
                explanation = "'Garrulous' means excessively and pointlessly talkative; 'reticent' means reserved and silent.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_56",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nAgoshito is a *callow* youth, said the teacher.",
                optionA = "An ignorant",
                optionB = "An experienced and mature",
                optionC = "An idle",
                optionD = "An insolent",
                correctAnswerIndex = 1,
                explanation = "'Callow' means youthful, naive, and inexperienced; the opposite is 'experienced and mature'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_57",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nWhat you are asking me to do is a *herculean* task.",
                optionA = "a strenuous",
                optionB = "a demanding",
                optionC = "a monumental",
                optionD = "an easy and effortless",
                correctAnswerIndex = 3,
                explanation = "A 'herculean' task requires immense physical or mental exertion; its antonym is 'easy and effortless'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_58",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nNkechi was a *novice* when she was first employed.",
                optionA = "trainee",
                optionB = "apprentice",
                optionC = "beginner",
                optionD = "professional and seasoned expert",
                correctAnswerIndex = 3,
                explanation = "A 'novice' is a beginner; the antonym is 'professional and seasoned expert'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_59",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'I do not trust him,' he said, in a rare moment of *candour*.",
                optionA = "reproach",
                optionB = "dishonesty and deceit",
                optionC = "frankness",
                optionD = "fairness",
                correctAnswerIndex = 1,
                explanation = "'Candour' means open, unvarnished honesty; the antonym is 'dishonesty'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_60",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nMrs. Akunilo looks *anaemic* today.",
                optionA = "pallid",
                optionB = "sick",
                optionC = "feeble",
                optionD = "robust, vigorous, and strong",
                correctAnswerIndex = 3,
                explanation = "'Anaemic' means looking pale, sickly, and vitality-deprived; the opposite is 'robust and strong'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_61",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nIt is *inconceivable* that the sun shone at midnight in Lagos.",
                optionA = "credible and plausible",
                optionB = "unthinkable",
                optionC = "impossible",
                optionD = "unimaginable",
                correctAnswerIndex = 0,
                explanation = "'Inconceivable' means impossible to believe; the antonym is 'credible and plausible'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_62",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nShe only gives a *superficial* impression of warmth and friendliness.",
                optionA = "a shallow",
                optionB = "a fleeting",
                optionC = "a deep and genuine",
                optionD = "an unrealistic",
                correctAnswerIndex = 2,
                explanation = "'Superficial' means shallow or surface-level; the antonym is 'deep and genuine'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_63",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nAs a *prudent* businessman, Adayi does not leave anything to chance.",
                optionA = "A frugal",
                optionB = "A shrewd",
                optionC = "A reckless and careless",
                optionD = "An unsuccessful",
                correctAnswerIndex = 2,
                explanation = "'Prudent' means acting with foresight and caution; the antonym is 'reckless and careless'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_64",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nHis *antipathy* affected the growth of his retail business.",
                optionA = "hatred",
                optionB = "warm receptiveness and goodwill",
                optionC = "malice",
                optionD = "hostility",
                correctAnswerIndex = 1,
                explanation = "'Antipathy' is a deep-seated feeling of dislike; its antonym is 'warm receptiveness and goodwill'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_65",
                subject = "English Language",
                topic = "Antonyms",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\nOkonkwo’s *lethal* right foot did the magic in the football match.",
                optionA = "weak and harmless",
                optionB = "wicked",
                optionC = "fat",
                optionD = "destructive",
                correctAnswerIndex = 0,
                explanation = "'Lethal' in sports denotes deadly, devastating power; the opposite is 'weak and harmless'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        // ---------------------------------------------------------------------
        // SECTION E: STRUCTURE & SENTENCE COMPLETION (Questions 66 - 85)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_66",
                subject = "English Language",
                topic = "Irregular Verbs",
                year = "2011",
                questionText = "When his car tyre ________ on the expressway, he did not know what to do.",
                optionA = "has burst",
                optionB = "had burst",
                optionC = "bursted",
                optionD = "burst",
                correctAnswerIndex = 3,
                explanation = "The verb 'burst' is irregular and retains the form 'burst' across present, past simple, and past participle.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_67",
                subject = "English Language",
                topic = "Habitual Past Tense",
                year = "2011",
                questionText = "Lami’s father ________ as a gardener when he was young, but now he is a driver.",
                optionA = "had been working",
                optionB = "use to work",
                optionC = "has worked",
                optionD = "used to work",
                correctAnswerIndex = 3,
                explanation = "'Used to work' correctly signifies a discontinued past habit or occupation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_68",
                subject = "English Language",
                topic = "Adverbial Conjunctions",
                year = "2011",
                questionText = "________ he switches on the light, the shadow disappears immediately.",
                optionA = "Whenever",
                optionB = "Except",
                optionC = "Since",
                optionD = "Until",
                correctAnswerIndex = 0,
                explanation = "'Whenever' expresses invariable time condition ('every time that').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_69",
                subject = "English Language",
                topic = "Spelling & Lexis",
                year = "2011",
                questionText = "It is important that you clear the refuse in front of your house every ________.",
                optionA = "fourtnight",
                optionB = "fortnight",
                optionC = "fourthnight",
                optionD = "forthnight",
                correctAnswerIndex = 1,
                explanation = "The correct spelling for a two-week period is 'fortnight'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_70",
                subject = "English Language",
                topic = "Phrasal Verbs",
                year = "2011",
                questionText = "The policemen became suspicious as the hoodlums ________ in the administrative office.",
                optionA = "ferreted",
                optionB = "loitered about",
                optionC = "ferreted about",
                optionD = "prowled into",
                correctAnswerIndex = 2,
                explanation = "To 'ferret about' means to rummage and search around inquisitively for hidden documents.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_71",
                subject = "English Language",
                topic = "Question Tags",
                year = "2011",
                questionText = "Suara needn’t come with us, ________?",
                optionA = "does she",
                optionB = "will she",
                optionC = "can she",
                optionD = "need she",
                correctAnswerIndex = 3,
                explanation = "When 'needn't' is used as a semi-modal auxiliary in a negative statement, the standard tag is 'need she?'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_72",
                subject = "English Language",
                topic = "Vocabulary & Collocations",
                year = "2011",
                questionText = "Unoka ________ the whole house to find his missing gold wristwatch.",
                optionA = "scourged",
                optionB = "scoured",
                optionC = "scored",
                optionD = "scouted",
                correctAnswerIndex = 1,
                explanation = "To 'scour' a place means to thoroughly search every corner of it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_73",
                subject = "English Language",
                topic = "Indirect Reported Speech",
                year = "2011",
                questionText = "Ife asked me ________.",
                optionA = "what time it was",
                optionB = "what is it by my time",
                optionC = "what time is it",
                optionD = "what time it is",
                correctAnswerIndex = 0,
                explanation = "In indirect questions, word order is declarative (subject + verb) with backshifted past tense: 'what time it was'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_74",
                subject = "English Language",
                topic = "Spelling",
                year = "2011",
                questionText = "There are many ways to solve this problem, so we should be ________ in our methodological approach.",
                optionA = "ecletic",
                optionB = "eclectic",
                optionC = "eclektic",
                optionD = "eclectik",
                correctAnswerIndex = 1,
                explanation = "The correct spelling is 'eclectic', meaning drawing ideas from a broad variety of sources.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_75",
                subject = "English Language",
                topic = "Prepositional Idioms",
                year = "2011",
                questionText = "Audu took these bold decisions purely ________ his own professional career.",
                optionA = "on furtherance of",
                optionB = "in furtherance of",
                optionC = "to furtherance in",
                optionD = "in furtherance with",
                correctAnswerIndex = 1,
                explanation = "'In furtherance of' is the correct fixed prepositional phrase meaning in advancement of.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_76",
                subject = "English Language",
                topic = "Spelling",
                year = "2011",
                questionText = "Here is Mr. Odumosu who teaches English ________ in our school.",
                optionA = "pronuntiation",
                optionB = "pronounciation",
                optionC = "pronunciation",
                optionD = "pronountiation",
                correctAnswerIndex = 2,
                explanation = "The noun form of 'pronounce' is spelled 'pronunciation' (with -nun-, not -noun-).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_77",
                subject = "English Language",
                topic = "Gerunds & Prepositions",
                year = "2011",
                questionText = "Instead of ________, she lied to the panel.",
                optionA = "pleading",
                optionB = "her to plead",
                optionC = "her pleading",
                optionD = "plead",
                correctAnswerIndex = 0,
                explanation = "The preposition 'of' governs a gerund verb form: 'Instead of pleading'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_78",
                subject = "English Language",
                topic = "Degrees of Comparison",
                year = "2011",
                questionText = "Of the three girls in the boarding house, Uka is the ________.",
                optionA = "so much notorious",
                optionB = "notorious",
                optionC = "naught",
                optionD = "naughtiest",
                correctAnswerIndex = 3,
                explanation = "Comparing three or more individuals requires the superlative degree: 'the naughtiest'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_79",
                subject = "English Language",
                topic = "Phrasal Verbs",
                year = "2011",
                questionText = "I wonder how he will ________ for being absent from school for a whole term.",
                optionA = "make in",
                optionB = "make up",
                optionC = "make off",
                optionD = "make out",
                correctAnswerIndex = 1,
                explanation = "'Make up' (followed by for) means to compensate or catch up on lost study time.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_80",
                subject = "English Language",
                topic = "Homophones & Spelling",
                year = "2011",
                questionText = "Please sit on the bicycle ________ while I ride.",
                optionA = "carier",
                optionB = "career",
                optionC = "carrier",
                optionD = "carrear",
                correctAnswerIndex = 2,
                explanation = "A 'carrier' is the rack on a bicycle designed to carry passengers or luggage.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_81",
                subject = "English Language",
                topic = "Homophones & Vocabulary",
                year = "2011",
                questionText = "I want to ________ this golden opportunity to acquaint you with the latest developments.",
                optionA = "size",
                optionB = "seize",
                optionC = "sieze",
                optionD = "cease",
                correctAnswerIndex = 1,
                explanation = "'Seize' (spelled s-e-i-z-e) means to eagerly grab or take hold of an opportunity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_82",
                subject = "English Language",
                topic = "Idiomatic Collocations",
                year = "2011",
                questionText = "Securing a lucrative employment in this economic climate is an ________ task.",
                optionA = "utmost",
                optionB = "upbeat",
                optionC = "uphill",
                optionD = "upfield",
                correctAnswerIndex = 2,
                explanation = "An 'uphill task' is an established idiom describing an arduous, demanding challenge.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_83",
                subject = "English Language",
                topic = "Prepositional Phrasal Verbs",
                year = "2011",
                questionText = "The personal assistant has no constitutional right to ________ my private affairs.",
                optionA = "spy from",
                optionB = "meddle in",
                optionC = "toy at",
                optionD = "complain into",
                correctAnswerIndex = 1,
                explanation = "To 'meddle in' means to improperly interfere in another person's private business.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_84",
                subject = "English Language",
                topic = "Verb Patterns & Gerunds",
                year = "2011",
                questionText = "Bola studiously avoided ________ the sensitive question during the press conference.",
                optionA = "parrying",
                optionB = "answering",
                optionC = "projecting",
                optionD = "destroying",
                correctAnswerIndex = 1,
                explanation = "The transitive verb 'avoid' is followed by a gerund object: 'avoided answering'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_85",
                subject = "English Language",
                topic = "Determiners & Noun Modification",
                year = "2011",
                questionText = "The school management dismissed him for ________ reasons, but I won’t disclose them yet.",
                optionA = "certain",
                optionB = "a reason",
                optionC = "more reason",
                optionD = "a certain",
                correctAnswerIndex = 0,
                explanation = "'For certain reasons' is the standard plural idiomatic expression indicating unstated specific grounds.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        // ---------------------------------------------------------------------
        // SECTION F: ORAL FORMS & PHONOLOGY (Questions 86 - 100)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_86",
                subject = "English Language",
                topic = "Oral Forms: Vowel Sounds",
                year = "2011",
                questionText = "Choose the option that has the same vowel sound as the one represented by the underlined letter in: b<u>u</u>bble",
                optionA = "guy",
                optionB = "bull",
                optionC = "b<u>u</u>mper",
                optionD = "gurgle",
                correctAnswerIndex = 2,
                explanation = "Both 'bubble' /ˈbʌbəl/ and 'bumper' /ˈbʌmpə/ share the short open-mid back unrounded vowel /ʌ/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_87",
                subject = "English Language",
                topic = "Oral Forms: Vowel Sounds",
                year = "2011",
                questionText = "Choose the option that has the same vowel sound as the one represented by the underlined letters in: w<u>eigh</u>t",
                optionA = "wh<u>a</u>le",
                optionB = "while",
                optionC = "wheat",
                optionD = "writhe",
                correctAnswerIndex = 0,
                explanation = "'Weight' /weɪt/ and 'whale' /weɪl/ share the closing diphthong /eɪ/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_88",
                subject = "English Language",
                topic = "Oral Forms: Vowel Sounds",
                year = "2011",
                questionText = "Choose the option that has the same vowel sound as the one represented by the underlined letters in: l<u>ea</u>ch",
                optionA = "g<u>ea</u>r",
                optionB = "c<u>e</u>dar",
                optionC = "cheer",
                optionD = "death",
                correctAnswerIndex = 1,
                explanation = "'Leach' /liːtʃ/ and 'cedar' /ˈsiːdə/ share the long close front unrounded vowel /iː/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_89",
                subject = "English Language",
                topic = "Oral Forms: Consonant Sounds",
                year = "2011",
                questionText = "Choose the option that has the same consonant sound as the one represented by the underlined letters in: men<u>ti</u>on",
                optionA = "that",
                optionB = "ma<u>ch</u>ine",
                optionC = "church",
                optionD = "test",
                correctAnswerIndex = 1,
                explanation = "The 'ti' in 'mention' /ˈmenʃən/ and the 'ch' in 'machine' /məˈʃiːn/ are both realized as the voiceless postalveolar fricative /ʃ/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_90",
                subject = "English Language",
                topic = "Oral Forms: Consonant Sounds",
                year = "2011",
                questionText = "Choose the option that has the same consonant sound as the one represented by the underlined letter in: presti<u>g</u>e",
                optionA = "bag",
                optionB = "badge",
                optionC = "reggae",
                optionD = "lei<u>s</u>ure",
                correctAnswerIndex = 3,
                explanation = "The 'ge' in 'prestige' /preˈstiːʒ/ and 's' in 'leisure' /ˈleʒə/ are both realized as the voiced postalveolar fricative /ʒ/.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_91",
                subject = "English Language",
                topic = "Oral Forms: Silent Letters",
                year = "2011",
                questionText = "Choose the option that has the same consonant sound as the one represented by the initial sound in: <u>kn</u>ot",
                optionA = "cot",
                optionB = "keep",
                optionC = "<u>n</u>orm",
                optionD = "king",
                correctAnswerIndex = 2,
                explanation = "In 'knot', the 'k' is silent, resulting in the alveolar nasal /n/, matching 'norm'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_92",
                subject = "English Language",
                topic = "Oral Forms: Rhymes",
                year = "2011",
                questionText = "Choose the option that rhymes with: fuel",
                optionA = "cruel",
                optionB = "fool",
                optionC = "rule",
                optionD = "field",
                correctAnswerIndex = 0,
                explanation = "'Fuel' /ˈfjuːəl/ rhymes with 'cruel' /ˈkruːəl/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_93",
                subject = "English Language",
                topic = "Oral Forms: Rhymes",
                year = "2011",
                questionText = "Choose the option that rhymes with: match",
                optionA = "harsh",
                optionB = "batch",
                optionC = "such",
                optionD = "watch",
                correctAnswerIndex = 1,
                explanation = "'Match' /mætʃ/ rhymes with 'batch' /bætʃ/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_94",
                subject = "English Language",
                topic = "Oral Forms: Rhymes",
                year = "2011",
                questionText = "Choose the option that rhymes with: sheer",
                optionA = "Sheila",
                optionB = "care",
                optionC = "ear",
                optionD = "sherry",
                correctAnswerIndex = 2,
                explanation = "'Sheer' /ʃɪə/ rhymes with 'ear' /ɪə/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_95",
                subject = "English Language",
                topic = "Oral Forms: Syllabic Stress",
                year = "2011",
                questionText = "Choose the word with the correct primary stress pattern: termination",
                optionA = "terminaTION",
                optionB = "TERmination",
                optionC = "ter-mi-NA-tion",
                optionD = "terMInation",
                correctAnswerIndex = 2,
                explanation = "Words ending in '-tion' take primary tonic accent on the penultimate syllable: ter-mi-NA-tion /ˌtɜːmɪˈneɪʃən/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_96",
                subject = "English Language",
                topic = "Oral Forms: Syllabic Stress",
                year = "2011",
                questionText = "Choose the word with the correct primary stress pattern: meditative",
                optionA = "meDItative",
                optionB = "mediTAtive",
                optionC = "ME-di-ta-tive",
                optionD = "meditaTIVE",
                correctAnswerIndex = 2,
                explanation = "In 'meditative', the primary stress is on the first syllable: ME-di-ta-tive /ˈmedɪtətɪv/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_97",
                subject = "English Language",
                topic = "Oral Forms: Syllabic Stress",
                year = "2011",
                questionText = "Choose the word with the correct primary stress pattern: suggestible",
                optionA = "suggeSTIble",
                optionB = "SUGgestible",
                optionC = "sug-GES-ti-ble",
                optionD = "suggestiBLE",
                correctAnswerIndex = 2,
                explanation = "In 'suggestible', primary stress falls on the second syllable: sug-GES-ti-ble /səɡˈdʒestəbəl/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_98",
                subject = "English Language",
                topic = "Oral Forms: Emphatic Stress",
                year = "2011",
                questionText = "Choose the question to which the given sentence is the most appropriate answer:\nUche LOVES Toyota cars.",
                optionA = "Who loves Toyota cars?",
                optionB = "What brand of car does Uche love?",
                optionC = "Does Uche hate Toyota cars?",
                optionD = "Does Uche love bicycles?",
                correctAnswerIndex = 2,
                explanation = "Emphatic stress on the verb 'LOVES' directly contradicts and corrects the opposing verb 'hate'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_99",
                subject = "English Language",
                topic = "Oral Forms: Emphatic Stress",
                year = "2011",
                questionText = "Choose the question to which the given sentence is the most appropriate answer:\nThe POLICE arrested the suspect.",
                optionA = "Did the police placate the suspect?",
                optionB = "Who arrested the suspect?",
                optionC = "Who did the police arrest?",
                optionD = "Did the police arrest the judge?",
                correctAnswerIndex = 1,
                explanation = "Emphatic stress on 'The POLICE' emphasizes the identity of the arresting authority.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2011_100",
                subject = "English Language",
                topic = "Oral Forms: Emphatic Stress",
                year = "2011",
                questionText = "Choose the question to which the given sentence is the most appropriate answer:\nMaiduguri is the CAPITAL of Borno state.",
                optionA = "Is Maiduguri the capital of Plateau state?",
                optionB = "Which state is Maiduguri the capital of?",
                optionC = "Is Maiduguri merely a local town in Borno state?",
                optionD = "What is the capital of Borno state?",
                correctAnswerIndex = 2,
                explanation = "Emphatic stress on 'CAPITAL' clarifies and highlights its administrative status as a capital city.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2011"
            )
        )

        return list
    }
}
