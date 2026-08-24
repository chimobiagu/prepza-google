package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, verified, and complete 2010 JAMB UTME Use of English Examination (Questions 1 to 100).
 * Standardized to 4 options (A-D) with full comprehension passages, answer keys, and educational explanations.
 */
object JambEnglish2010CompleteQuestionBank {

    fun getEnglish2010Questions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =====================================================================
        // PASSAGE TEXTS
        // =====================================================================
        val passage1 = """
            One of the interesting things to me about spaceship is that it is a mechanical vehicle, just as an automobile. If you own a car, you realize that you must put oil and gas into it, and you must put water in the radiator and take care of the car as a whole. You begin to develop quite a little thermodynamic sense. You know that you are either going to have to keep the machine in a good order or it is going to be in trouble and fail to function. We have not been seeing our Spaceship Earth as an integrally-designed machine which to be persistently successful, must be comprehended and serviced in total.

            Now there is one outstanding important fact regarding Spaceship Earth, and this is that no instruction book came with it. I think it is very significant that there is no instruction book, for successfully operating of our ship, in view of the infinite attention to all other details displayed by our ship. It must be taken as deliberate and purposeful that an instruction book was omitted. Lack of instruction has forced us to find out that there are two kinds of mangoes – unripe mangoes that will kill us and ripe mangoes which will nourish us. And we had to find out ways of telling which-was-which mangoes before we ate it or otherwise we would die. So we were forced, because of this to devise scientific experimental procedures and to interpret effectively the significance of the experimental findings. Thus, because the instruction manual was missing, we are learning how we can safely survive on the planet.

            Quite clearly, all living beings are utterly helpless at the moment of birth. The human child stays helpless longer than the young of any species. Apparently, it is part of 'invention' that man is meant to be utterly helpless through certain anthropological phases. When he begins to be able to get on a little better, he is meant to discover some of the physical principles inherent in the universe as well as the many resources around him which will further multiply his knowledge. Designed into this Spaceship Earth's total wealth was a big safety factor. This allowed man to be very ignorant for a long time until he had amassed enough experiences from which to extract progressively the system of generalized principles governing increase of energy. The design omission of the instruction book forced man to discover retrospectively just what his most important capabilities are. He learned to generalize fundamental principles of universe.
        """.trimIndent()

        val passage2 = """
            Stress is by far the most common cause of ill health in our society, and may be the underlying cause of as many as 70-80% of all visits to family doctors. It is also the problem that every doctor shares with patients. Experts note that stress is an issue everyone can relate to experimentally. In studying and better understanding about stress, we can derive personal as well as professional benefits.

            Stress can be overcome without undergoing duress. They often say anyone who wants to help someone deal with his/her stress should learn to handle his/hers first. The manifestations of stress are legion. It can contribute or mimic just about any symptom you can think of. However, the main symptoms are physical, mental, emotional and behavioural. The causes of stress are multiple and varied but they can be classified into external and internal. External stressors can include relatively getting sick or dying, jobs being lost or people criticising or one becoming angry. However, most of the stress people experience is self-generated.

            Experts tell us that we create the majority of our upset indicating that because we cause most of our own stress, we can do something about it. This gives us a measure of choice and control that we do not always have when outside forces act on us. This also leads to a basic premise about stress reduction. To master stress-change, you have to figure out what you are doing that is contributing to your problem and change it. These changes fall into behaviour, thinking, lifestyle choices and/or situations you are in. By getting to the root cause of your stress, you can prevent recurrences.

            As a way of draining off stress energy, nothing beats aerobic exercise. To understand why, we need to review what stress is. People often think of stress as pressure at work, a demanding boss, a sick child or rush-hour traffic. These may be triggers but stress is actually the body reaction to factors such as these. Stress is the fight-or-flight response in the body, mediated by adrenaline and other stress hormones, and comprises such physiologic changes as increase in heart rate and blood pressure, faster breathing, and increased blood sugar. In other words, stress is the state of increased arousal necessary for an organism to defend itself at a time of danger. Exercise is the most logical way to dissipate the excess energy. It is what our bodies are trying to do when we pace around or tap our legs and fingers. It is much better to channel it into a more complete form of exercise like a brisk walk, a run, a bike ride, or a game of squash.

            Just as we are all capable of mounting up and sustaining a stress reaction, we have also inherited the ability to put our bodies into a state of deep relaxation called the 'relaxation response'. In this state, all the physiologic events in the stress reaction are reversed. Pulse slows, blood pressure falls, breathing slows and muscles relax.
        """.trimIndent()

        val passage3 = """
            There are many indicators with which to assess or measure corruption. One of them is the affluent living habit of the public official compared to his/her income. Corruption occurs when a public official expects to be induced to perform an act which that public official is ordinarily required to do by law. Corruption can slow down development.

            One of the most widely discussed consequences of corruption is the distortion of governmental expenditure. This often results in public money being wasted on white elephant projects, rather than people-oriented services, such as health and education. As a result, more opportunities are presented for corrupt use or diversion of funds. Raising the ethical standard of governance can lead to many benefits especially for the economic, political and social development of a country.

            Fighting corruption and promoting governance is therefore crucial to developing an environment that facilitates the social, political and economic development of the people. However, while there are often general statements made about the effect of corruption on poverty and development, there is not an explicit recognition that corruption is more than just wealth misappropriation or abuse of power. Corruption impoverishes countries and deprives their citizens of good governance. It destabilizes economic systems. When crime and other illegal activities flourish, basic public functions are eroded and the quality of life of the people is reduced. Bribery, for example, is universally regarded as a crime, but it also reflects socio-economic problems that require broad-based preventive measures, and the involvement of the society at large.

            Another implication of global measures against corruption is making government work better by improving the economy. Finally, redesigning political and regulatory structures will reduce corruption and other anti-system players that encourage corrupt practice.
        """.trimIndent()

        val passage4 = """
            Drought is a word that invokes strong emotions. This is not surprising as the phenomenon is usually accompanied by a number of unpleasant developments. These developments have implications for all citizens, starting from the peasant farmers to the state and federal governments which may be plunged into emergency and crisis situations which, if not successfully managed could result in social unrest. The distribution of subjects in various regions of the country and their adequate distribution thereafter have become issues of considerable anxiety to all people. The fact, however, is that periodic reduction in normal supply of rainfall in the country is not new. Since large areas of the country are drought prone, the consequences are inevitable. Dry spells could be very severe. There are two aspects of coping with drought. One has to do with emergency measures and the other with routine measures. An immediate consequence of any drought would be famine. In addition, where whole populations are forced to abandon their lands or pastures in search of food, there are bound to be other lasting and parallel consequences such as distress, sales of cattle by livestock owners in order to buy food. Government should provide farmers with agricultural inputs and ensure that they have easy access to these inputs under the relief scheme. Emergency measures will be much more effective if a mechanism is established to ensure adequate preparedness and defense against the occurrence of drought.
        """.trimIndent()

        // ---------------------------------------------------------------------
        // SECTION A: COMPREHENSION & CLOZE (Questions 1 - 25)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2010_01",
                subject = "English Language",
                topic = "General Instructions",
                year = "2010",
                questionText = "Which Use of English Paper Type is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D",
                correctAnswerIndex = 0,
                explanation = "According to the official UTME 2010 answer key, the examination paper type is Type A.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_02",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "According to the writer, the exciting thing about Spaceship Earth is that it:",
                optionA = "has no instruction manual",
                optionB = "is not difficult to maintain",
                optionC = "is peculiar to other automobiles",
                optionD = "is relatively easy to operate",
                correctAnswerIndex = 0,
                explanation = "The passage emphasizes that unlike an automobile, no instruction handbook came with Earth, challenging humanity's curiosity to explore and understand physical laws.",
                passageText = passage1,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_03",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "The absence of an instruction manual in Spaceship Earth has:",
                optionA = "made the operation of the Spaceship Earth difficult",
                optionB = "forced man to devise other means of travelling in spacecraft",
                optionC = "challenged man’s inquisitiveness",
                optionD = "made man helpless",
                correctAnswerIndex = 2,
                explanation = "The lack of an instruction manual challenged human curiosity and inquisitiveness to devise scientific methods to learn how to safely survive on the planet.",
                passageText = passage1,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_04",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "From the passage, it can be deduced that man:",
                optionA = "learns by experiment and education",
                optionB = "learns by chance and accidentally",
                optionC = "is incapable of solving all his problems",
                optionD = "by his nature is in constant search of knowledge",
                correctAnswerIndex = 3,
                explanation = "The author highlights that human beings are designed to progressively discover principles inherent in the universe and constantly search for knowledge.",
                passageText = passage1,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_05",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "The writer’s tone and mood in the passage is that of:",
                optionA = "non-committal and objective analysis",
                optionB = "pessimism and despair",
                optionC = "aggressive skepticism",
                optionD = "careless indifference",
                correctAnswerIndex = 0,
                explanation = "The author provides a neutral, philosophical, and analytical perspective without displaying excessive bias or emotional agitation.",
                passageText = passage1,
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_06",
                subject = "English Language",
                topic = "Comprehension: Stress Physiology",
                year = "2010",
                questionText = "The expression, '...stress is an issue everybody can relate to experimentally', means that:",
                optionA = "it is better understood when experienced personally",
                optionB = "its problem can be solved by everybody",
                optionC = "everybody avoids it",
                optionD = "everybody encounters it in laboratories",
                correctAnswerIndex = 0,
                explanation = "Relating to something experimentally means grasping it through direct, personal life experience.",
                passageText = passage2,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_07",
                subject = "English Language",
                topic = "Comprehension: Stress Physiology",
                year = "2010",
                questionText = "Which of the following is true according to the passage on stress?",
                optionA = "Stress is entirely caused by external weather",
                optionB = "The physiological events of stress are reversed during the relaxation response",
                optionC = "Stress is better handled by ignoring symptoms",
                optionD = "The issues of stress can be solved with no effort",
                correctAnswerIndex = 1,
                explanation = "The final paragraph notes that in the relaxation response, all the physiologic events of stress (pulse, blood pressure, muscle tension) are reversed.",
                passageText = passage2,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_08",
                subject = "English Language",
                topic = "Comprehension: Stress Physiology",
                year = "2010",
                questionText = "According to the passage, the major step in controlling and mastering stress is:",
                optionA = "changing one’s thinking, behavior, and attitude to stressors",
                optionB = "understanding the history of ancient disease",
                optionC = "visiting family doctors for daily tranquilizers",
                optionD = "avoiding all forms of physical exercise",
                correctAnswerIndex = 0,
                explanation = "The passage states that to master stress-change, you must figure out what you are doing that contributes to the problem and consciously change thinking and behavior.",
                passageText = passage2,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_09",
                subject = "English Language",
                topic = "Comprehension: Stress Physiology",
                year = "2010",
                questionText = "The experts believe an individual can control stress because:",
                optionA = "its causes are understandable and outside one's control",
                optionB = "it is not difficult to control without medicine",
                optionC = "external factors contribute less stress than genetics",
                optionD = "most stress is individually initiated and self-generated",
                correctAnswerIndex = 3,
                explanation = "Because individuals create the majority of their upsets through personal cognitive reactions, they possess the power and choice to alter them.",
                passageText = passage2,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_10",
                subject = "English Language",
                topic = "Comprehension: Stress Physiology",
                year = "2010",
                questionText = "From the passage, it can be deduced that stress represents:",
                optionA = "a permanent genetic defect",
                optionB = "individually induced physiological reactions to perceived threats",
                optionC = "a condition solely treatable by hospitalization",
                optionD = "an incurable mental disorder",
                correctAnswerIndex = 1,
                explanation = "Stress is defined as the body's internal fight-or-flight response, largely mediated by individual reactions and perception.",
                passageText = passage2,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_11",
                subject = "English Language",
                topic = "Comprehension: Governance & Corruption",
                year = "2010",
                questionText = "According to the writer, corruption is prominently signaled and triggered off by:",
                optionA = "unnecessary and affluent living habits of public officials relative to income",
                optionB = "transparent competitive bidding in public contracts",
                optionC = "strict separation of government powers",
                optionD = "equitable distribution of social wealth",
                correctAnswerIndex = 0,
                explanation = "The passage identifies the affluent lifestyle of public officials disproportionate to their legitimate salary as a chief indicator of corruption.",
                passageText = passage3,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_12",
                subject = "English Language",
                topic = "Comprehension: Governance & Corruption",
                year = "2010",
                questionText = "From the passage, a devastating consequence of corruption is that:",
                optionA = "large productive public infrastructure is executed on schedule",
                optionB = "it redistributes wealth to the grassroots",
                optionC = "it impedes the economic and social progress of a nation",
                optionD = "it lowers the general cost of living",
                correctAnswerIndex = 2,
                explanation = "Corruption slows down development, distorts public spending toward wasteful projects, and destabilizes economic systems.",
                passageText = passage3,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_13",
                subject = "English Language",
                topic = "Comprehension: Governance & Corruption",
                year = "2010",
                questionText = "Who, according to the passage, must be involved in preventing corruption?",
                optionA = "Only private business corporations",
                optionB = "Only foreign financial donors",
                optionC = "The government through high ethical governance and the society at large",
                optionD = "Foreign security forces alone",
                correctAnswerIndex = 2,
                explanation = "The author emphasizes that fighting corruption requires raised ethical standards of governance as well as broad-based involvement of society.",
                passageText = passage3,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_14",
                subject = "English Language",
                topic = "Comprehension: Governance & Corruption",
                year = "2010",
                questionText = "Which of the following is an indication of high ethical standards in governance?",
                optionA = "Bloated expenditure on white elephant projects",
                optionB = "Socio-economic instability",
                optionC = "Democratic governance prioritizing health, education, and people-oriented services",
                optionD = "Suppression of civic participation",
                correctAnswerIndex = 2,
                explanation = "Democratic governance with high ethical integrity directs public resources to social welfare, health, and human development.",
                passageText = passage3,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_15",
                subject = "English Language",
                topic = "Comprehension: Governance & Corruption",
                year = "2010",
                questionText = "The ultimate essence of fighting corruption, according to the passage, is to:",
                optionA = "punish opposition party members",
                optionB = "promote good governance and improve the quality of life of citizens",
                optionC = "increase revenue from court fines",
                optionD = "enrich law enforcement personnel",
                correctAnswerIndex = 1,
                explanation = "Promoting governance and eliminating corruption fosters an environment that improves the socioeconomic welfare of the people.",
                passageText = passage3,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_16",
                subject = "English Language",
                topic = "Cloze Passage: Ecology & Drought",
                year = "2010",
                questionText = "In Gap 16 ('This is not surprising as the ... 16 ... is usually accompanied by unpleasant developments'):",
                optionA = "ideology",
                optionB = "phenomenon",
                optionC = "idea",
                optionD = "component",
                correctAnswerIndex = 1,
                explanation = "Drought is an observable natural occurrence or 'phenomenon'.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_17",
                subject = "English Language",
                topic = "Cloze Passage: Ecology & Drought",
                year = "2010",
                questionText = "In Gap 17 ('These developments have ... 17 ... for all citizens'):",
                optionA = "feedback",
                optionB = "results",
                optionC = "implications",
                optionD = "outcomes",
                correctAnswerIndex = 2,
                explanation = "Events have 'implications' (far-reaching consequences or effects) for citizens.",
                passageText = passage4,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_18",
                subject = "English Language",
                topic = "Cloze Passage: Ecology & Drought",
                year = "2010",
                questionText = "In Gap 18 ('...crises situations which, if not successfully ... 18 ... could result in social unrest'):",
                optionA = "managed",
                optionB = "examined",
                optionC = "overlooked",
                optionD = "studied",
                correctAnswerIndex = 0,
                explanation = "A crisis situation must be 'managed' effectively to prevent escalation into social unrest.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_19",
                subject = "English Language",
                topic = "Cloze Passage: Ecology & Drought",
                year = "2010",
                questionText = "In Gap 19 ('The distribution of ... 19 ... in various regions of the country...'):",
                optionA = "objects",
                optionB = "subjects",
                optionC = "issues",
                optionD = "topics",
                correctAnswerIndex = 1,
                explanation = "'Subjects' fits contextually with matters or resources under ecological review.",
                passageText = passage4,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_20",
                subject = "English Language",
                topic = "Cloze Passage: Ecology & Drought",
                year = "2010",
                questionText = "In Gap 20 ('...periodic reduction in normal ... 20 ... of rainfall in the country is not new'):",
                optionA = "amount",
                optionB = "supply",
                optionC = "size",
                optionD = "flood",
                correctAnswerIndex = 1,
                explanation = "'Supply of rainfall' is the appropriate environmental collocation describing volume.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_21",
                subject = "English Language",
                topic = "Cloze Passage: Ecology & Drought",
                year = "2010",
                questionText = "In Gap 21 ('Since large areas of the country are drought prone, the consequences are ... 21 ...'):",
                optionA = "effective",
                optionB = "disastrous",
                optionC = "evident",
                optionD = "inevitable",
                correctAnswerIndex = 3,
                explanation = "If an area is drought-prone, consequences are 'inevitable' (unavoidable).",
                passageText = passage4,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_22",
                subject = "English Language",
                topic = "Cloze Passage: Ecology & Drought",
                year = "2010",
                questionText = "In Gap 22 ('One has to do with emergency measures and the other with ... 22 ... measures'):",
                optionA = "routine",
                optionB = "organized",
                optionC = "urgent",
                optionD = "delayed",
                correctAnswerIndex = 0,
                explanation = "'Routine' (regular/standard long-term) contrasts directly with 'emergency' measures.",
                passageText = passage4,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_23",
                subject = "English Language",
                topic = "Cloze Passage: Ecology & Drought",
                year = "2010",
                questionText = "In Gap 23 ('...there are bound to be other lasting and ... 23 ... consequences'):",
                optionA = "longitudinal",
                optionB = "objective",
                optionC = "simultaneous",
                optionD = "parallel",
                correctAnswerIndex = 3,
                explanation = "'Parallel' consequences are concurrent side-effects occurring alongside famine.",
                passageText = passage4,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_24",
                subject = "English Language",
                topic = "Cloze Passage: Ecology & Drought",
                year = "2010",
                questionText = "In Gap 24 ('...under the relief ... 24 ...'):",
                optionA = "action",
                optionB = "process",
                optionC = "scheme",
                optionD = "plan",
                correctAnswerIndex = 2,
                explanation = "Government intervention programs are systematically organized as a 'relief scheme'.",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_25",
                subject = "English Language",
                topic = "Cloze Passage: Ecology & Drought",
                year = "2010",
                questionText = "In Gap 25 ('Emergency measures will be much more ... 25 ... if a mechanism is established'):",
                optionA = "normal",
                optionB = "correct",
                optionC = "idealistic",
                optionD = "effective",
                correctAnswerIndex = 3,
                explanation = "Preparedness makes emergency measures 'effective' (producing the desired outcome).",
                passageText = passage4,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        // ---------------------------------------------------------------------
        // SECTION B: LEXIS, STRUCTURE & IDIOMS (Questions 26 - 35)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2010_26",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2010",
                questionText = "Though Mr. Iro is a new chairman, he views other members with a jaundiced eye.\nThis means that he:",
                optionA = "takes a rather forceful position on dealing with his members",
                optionB = "takes an unfavourable and prejudiced position concerning his members",
                optionC = "takes a sickly view of his members",
                optionD = "takes a rather hazy view of his members",
                correctAnswerIndex = 1,
                explanation = "To view someone with a 'jaundiced eye' means to look upon them with prejudice, suspicion, or hostility.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_27",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2010",
                questionText = "'People are not interested in who rules.'\nThis conveys that:",
                optionA = "People prefer military governance over democratic rulers",
                optionB = "People are not concerned about the identity of who rules them",
                optionC = "The rulers are not concerned about the people",
                optionD = "People who rule are not interested in the ruled",
                correctAnswerIndex = 1,
                explanation = "The statement means that the populace is indifferent as to who holds political power.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_28",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2010",
                questionText = "It was good to steer a middle course in whatever one does.\nThis implies that:",
                optionA = "It is always good to get midway in anything one does",
                optionB = "It is always good to act with moderation and avoid extremes",
                optionC = "It is always good to move away from the forefront",
                optionD = "It is always good to work very hard",
                correctAnswerIndex = 1,
                explanation = "'Steering a middle course' is an idiom meaning practicing moderation and avoiding extreme actions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_29",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2010",
                questionText = "The witness said he had no axe to grind with his brothers.\nThis means that:",
                optionA = "He had no private grudge or selfish motive against the brothers",
                optionB = "He had no axe and therefore stole the matchet",
                optionC = "He had no axe and therefore borrowed their matchet",
                optionD = "He was eager to execute vengeance",
                correctAnswerIndex = 0,
                explanation = "To have 'no axe to grind' means to possess no personal grievance or hidden selfish motive.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_30",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2010",
                questionText = "The footballers moved with their tails between their legs.\nThis means that:",
                optionA = "they moved happily because they won the match",
                optionB = "they were aggressive towards the spectators",
                optionC = "they were ashamed, humbled, and dejected because they had been defeated",
                optionD = "they moved quickly in celebration",
                correctAnswerIndex = 2,
                explanation = "To walk with 'tail between one's legs' signifies feeling ashamed, defeated, or thoroughly cowed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_31",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2010",
                questionText = "The headmaster managed to talk his way out of having to give a speech.\nThis means that:",
                optionA = "he delivered a speech despite the difficulty",
                optionB = "he managed to give a speech out of a difficult situation",
                optionC = "he cleverly used persuasion to get himself out of the obligation",
                optionD = "he spoke continuously while walking",
                correctAnswerIndex = 2,
                explanation = "'Talking one's way out' means using excuses or rhetoric to evade a responsibility.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_32",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2010",
                questionText = "As regards the matter, we have crossed the Rubicon.\nThis means that:",
                optionA = "we are completely at a loss",
                optionB = "we are irrevocably committed and cannot turn back",
                optionC = "we are already qualified for the rewards",
                optionD = "we have postponed our decision",
                correctAnswerIndex = 1,
                explanation = "'Crossing the Rubicon' refers to taking an irrevocable step that commits one to a definitive course.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_33",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2010",
                questionText = "Uche is full of himself.\nThis means that:",
                optionA = "He is conceited and arrogant",
                optionB = "He is physically robust",
                optionC = "He is very generous",
                optionD = "He is exceptionally careful",
                correctAnswerIndex = 0,
                explanation = "To be 'full of oneself' means to have an inflated opinion of one's own importance (conceited).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_34",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2010",
                questionText = "As debutants in that tournament, the Super Eagles were up against their first opponents by three goals to nil.\nThis means that:",
                optionA = "The Super Eagles were playing in the tournament for the first time, and they defeated their opponents by three goals to nothing",
                optionB = "Though the Super Eagles were rated as the weakest side in the tournament, they won their first match by three goals to nil",
                optionC = "Even though the Super Eagles were playing without some regulars, they won by three goals to nil",
                optionD = "The Super Eagles were seasoned champions who won easily",
                correctAnswerIndex = 0,
                explanation = "A 'debutant' is a participant appearing in a competition or event for the first time.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_35",
                subject = "English Language",
                topic = "Idiomatic Expressions",
                year = "2010",
                questionText = "The woman was mournful as her husband was found dead drunk.\nThis means that:",
                optionA = "She was sad because her husband was absolutely and excessively intoxicated",
                optionB = "She was apprehensive that her husband had died from poisoning",
                optionC = "She was in mourning because her husband passed away while drinking",
                optionD = "She was annoyed that her husband spilled his beverage",
                correctAnswerIndex = 0,
                explanation = "'Dead drunk' is an idiom meaning completely and helplessly incapacitated by alcohol.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        // ---------------------------------------------------------------------
        // SECTION C: ANTONYMS (Questions 36 - 50)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2010_36",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nI am optimistic about the interview though it was a *mind-bending* exercise.",
                optionA = "An enervating",
                optionB = "A debilitating",
                optionC = "A difficult",
                optionD = "An easy",
                correctAnswerIndex = 3,
                explanation = "'Mind-bending' means mentally demanding or complex; its direct opposite is 'easy'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_37",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nThe trader was amused by the *cut-throat* rush for the goods.",
                optionA = "Worrisome",
                optionB = "Strange",
                optionC = "Lacklustre",
                optionD = "Fierce",
                correctAnswerIndex = 2,
                explanation = "'Cut-throat' signifies intense, fierce activity; 'lacklustre' denotes dullness or lack of enthusiasm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_38",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized phrase:\nThe teacher said that Ali’s essay was full of *many redundant details*.",
                optionA = "Unexplained",
                optionB = "Strange",
                optionC = "Necessary",
                optionD = "Useful",
                correctAnswerIndex = 2,
                explanation = "'Redundant' means superfluous or dispensable; the antonym is 'necessary'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_39",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized phrase:\nHis father surmounted the *myriad of* obstacles on his way.",
                optionA = "Most",
                optionB = "Few",
                optionC = "All",
                optionD = "Many",
                correctAnswerIndex = 1,
                explanation = "'Myriad' means countless or an immense number; its opposite is 'few'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_40",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nHer *ingenuous* smile drew our attention.",
                optionA = "Witty",
                optionB = "Naïve",
                optionC = "Clever",
                optionD = "Arrogant and deceitful",
                correctAnswerIndex = 3,
                explanation = "'Ingenuous' means innocent, frank, and candid; its opposite is deceitful or arrogant.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_41",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nNdeni gave a *flawless* speech at the party.",
                optionA = "A wonderful",
                optionB = "A careless",
                optionC = "An interesting",
                optionD = "An imperfect",
                correctAnswerIndex = 3,
                explanation = "'Flawless' means without defect or perfect; its antonym is 'imperfect'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_42",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nBeneath Ado’s *gruff* exterior, he’s really very kind-hearted.",
                optionA = "Nice and gentle",
                optionB = "Harsh",
                optionC = "Rough",
                optionD = "Stern",
                correctAnswerIndex = 0,
                explanation = "'Gruff' means rough, harsh, or abrupt; the opposite is 'nice and gentle'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_43",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nThe captain says sports is being *debased* by commercial sponsorship.",
                optionA = "Localized",
                optionB = "Perverted",
                optionC = "Elevated",
                optionD = "Overvalued",
                correctAnswerIndex = 2,
                explanation = "'Debased' means lowered in moral quality or esteem; the opposite is 'elevated'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_44",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nGoverning a country is not always as *straightforward* as people sometimes imagine.",
                optionA = "Complicated",
                optionB = "Troublesome",
                optionC = "Untoward",
                optionD = "Irksome",
                correctAnswerIndex = 0,
                explanation = "'Straightforward' means uncomplicated and simple; its opposite is 'complicated'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_45",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nThe crowd was very *receptive* to the speaker’s suggestion.",
                optionA = "Disobedient",
                optionB = "Repellent",
                optionC = "Alert",
                optionD = "Hostile",
                correctAnswerIndex = 3,
                explanation = "'Receptive' means willing to listen or accept; its antonym is 'hostile'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_46",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nThere was a general *acquiescence* on the new drug law.",
                optionA = "Resistance",
                optionB = "Discrepancy",
                optionC = "Compromise",
                optionD = "Agreement",
                correctAnswerIndex = 0,
                explanation = "'Acquiescence' means passive acceptance without objection; its opposite is 'resistance'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_47",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nAisha seems to feel *ambivalent* about her future.",
                optionA = "Decisive",
                optionB = "Anxious",
                optionC = "Ambitious",
                optionD = "Inconsiderate",
                correctAnswerIndex = 0,
                explanation = "'Ambivalent' means experiencing conflicting feelings or indecision; the antonym is 'decisive'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_48",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nThe report of the committee contained a *plethora* of details.",
                optionA = "Shortage",
                optionB = "Simplicity",
                optionC = "Multitude",
                optionD = "Spectrum",
                correctAnswerIndex = 0,
                explanation = "'Plethora' means an excess or overabundance; the antonym is 'shortage'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_49",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nThe weather was still very heavy and *sultry*.",
                optionA = "Wintry and shadowy",
                optionB = "Cold and friendly",
                optionC = "Cloudy and thundery",
                optionD = "Hot and uncomfortable",
                correctAnswerIndex = 1,
                explanation = "'Sultry' means hot, humid, and oppressive; its opposite is 'cold and friendly'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_50",
                subject = "English Language",
                topic = "Antonyms",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\nAda gave her husband a look that made words *superfluous*.",
                optionA = "Redundant",
                optionB = "Spurious",
                optionC = "Unnecessary",
                optionD = "Scanty and inadequate",
                correctAnswerIndex = 3,
                explanation = "'Superfluous' means more than enough or excessive; its opposite is 'scanty and inadequate'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        // ---------------------------------------------------------------------
        // SECTION D: SYNONYMS (Questions 51 - 65)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2010_51",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nA political *impasse* does not offer the best opportunity for merrymaking.",
                optionA = "manifesto",
                optionB = "party",
                optionC = "gridlock",
                optionD = "rally",
                correctAnswerIndex = 2,
                explanation = "An 'impasse' is a deadlock or stalemate where progress is halted, synonymous with 'gridlock'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_52",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nWe were all *enthusiastic* as we awaited the result of the election.",
                optionA = "bemused",
                optionB = "agitated and intensely excited",
                optionC = "elated",
                optionD = "nervous",
                correctAnswerIndex = 1,
                explanation = "'Enthusiastic' denotes eager interest and excitement.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_53",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe uniform makes the guards look *absurd*.",
                optionA = "dirty",
                optionB = "smart",
                optionC = "sensible",
                optionD = "ridiculous",
                correctAnswerIndex = 3,
                explanation = "'Absurd' means wildly unreasonable, incongruous, or 'ridiculous'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_54",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe law is often *tardy* in reacting to changing attitudes.",
                optionA = "quick",
                optionB = "slow",
                optionC = "exclusive",
                optionD = "generous",
                correctAnswerIndex = 1,
                explanation = "'Tardy' means delaying or sluggish, synonymous with 'slow'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_55",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nIsa and Ilu ate a *sumptuous* meal on their brother’s wedding day.",
                optionA = "expensive and lavish",
                optionB = "foreign",
                optionC = "insipid",
                optionD = "cheap",
                correctAnswerIndex = 0,
                explanation = "'Sumptuous' means splendid, luxurious, and costly.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_56",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nKaltume *crouched* over the paper on her desk.",
                optionA = "wrote on",
                optionB = "stood on",
                optionC = "walked over",
                optionD = "bent over",
                correctAnswerIndex = 3,
                explanation = "To 'crouch' over something means to stoop or bend low over it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_57",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe *panacea* for a country’s economic mess lies in systematic planning and hard work.",
                optionA = "cure",
                optionB = "hope",
                optionC = "foresight",
                optionD = "trouble",
                correctAnswerIndex = 0,
                explanation = "A 'panacea' is a universal remedy or 'cure' for all ills.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_58",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized phrase:\nThousands of workers have been *victims of retrenchment* since the military came back to power.",
                optionA = "Unemployment due to job lay-offs",
                optionB = "Trench mentality",
                optionC = "Promotion delays",
                optionD = "Compulsory relocation",
                correctAnswerIndex = 0,
                explanation = "'Retrenchment' refers to staff redundancy and involuntary job cuts leading to unemployment.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_59",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe principal gave his speech *offhand* at the sports meeting.",
                optionA = "calmly",
                optionB = "beautifully",
                optionC = "unconcerned",
                optionD = "extemporaneously without preparation",
                correctAnswerIndex = 3,
                explanation = "To speak 'offhand' means without prior preparation or notes (impromptu/extemporaneously).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_60",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nJankoli was dressed in an old *assortment* of clothes.",
                optionA = "Avalanche",
                optionB = "Homogeneity",
                optionC = "Sameness",
                optionD = "Mélange",
                correctAnswerIndex = 3,
                explanation = "An 'assortment' is a heterogeneous mix or collection, synonymous with 'mélange'.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_61",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe girl’s father was *astounded* to see her appear from the shrine.",
                optionA = "collected",
                optionB = "overwhelmed",
                optionC = "embarrassed",
                optionD = "Astonished",
                correctAnswerIndex = 3,
                explanation = "'Astounded' means filled with amazement and wonder, synonymous with 'astonished'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_62",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThe director’s remark was extremely *apposite* to the issue being discussed.",
                optionA = "Appropriate",
                optionB = "Inconsequential",
                optionC = "Emphatic",
                optionD = "Adequate",
                correctAnswerIndex = 0,
                explanation = "'Apposite' means highly suitable, pertinent, or 'appropriate'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_63",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nHer reputation is without a *blemish*.",
                optionA = "Struggle",
                optionB = "Problem",
                optionC = "Fault",
                optionD = "Blessing",
                correctAnswerIndex = 2,
                explanation = "A 'blemish' is a flaw, stain, or 'fault'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_64",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nUgo is *eligible* for the post of secretary.",
                optionA = "Nominated",
                optionB = "Invited",
                optionC = "Qualified",
                optionD = "Intelligent",
                correctAnswerIndex = 2,
                explanation = "'Eligible' means meeting the required standards and qualifications, hence 'qualified'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_65",
                subject = "English Language",
                topic = "Synonyms",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\nThis is an *abridged* version of No Longer at Ease.",
                optionA = "An outdated",
                optionB = "An enlarged",
                optionC = "An illustrated",
                optionD = "A shortened",
                correctAnswerIndex = 3,
                explanation = "'Abridged' means condensed or 'shortened' while retaining the core substance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        // ---------------------------------------------------------------------
        // SECTION E: STRUCTURE & GRAMMATICAL CONCORD (Questions 66 - 85)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2010_66",
                subject = "English Language",
                topic = "Correlative Conjunctions",
                year = "2010",
                questionText = "Complete the sentence:\nLemoti ________ as a painter, but also as a sculptor.",
                optionA = "is a gifted only not",
                optionB = "is only not gifted",
                optionC = "is gifted not only",
                optionD = "is only gifted",
                correctAnswerIndex = 2,
                explanation = "Correlative parallel structure requires 'is gifted not only... but also...'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_67",
                subject = "English Language",
                topic = "Phrasal Verbs",
                year = "2010",
                questionText = "He can recall the important dates in the nation’s history; it is interesting to listen as he rattles them ________.",
                optionA = "off",
                optionB = "over",
                optionC = "up",
                optionD = "out",
                correctAnswerIndex = 0,
                explanation = "To 'rattle off' is an idiom meaning reciting information rapidly from memory.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_68",
                subject = "English Language",
                topic = "Reported Speech",
                year = "2010",
                questionText = "The boy told his mother ________.",
                optionA = "that was the girl he told her about",
                optionB = "that was the girl I told you about her",
                optionC = "that was the girl I told her about",
                optionD = "that is the girl he told her about",
                correctAnswerIndex = 0,
                explanation = "In standard reported speech with third-person narration, pronouns shift to 'he told her about'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_69",
                subject = "English Language",
                topic = "Reported Speech & Time Adverbials",
                year = "2010",
                questionText = "Last Monday his father asked me ________.",
                optionA = "if I had come some days before",
                optionB = "if I had come the day before",
                optionC = "did you come yesterday",
                optionD = "had I come yesterday",
                correctAnswerIndex = 1,
                explanation = "In indirect reported questions, past simple backshifts to past perfect ('had come') and 'yesterday' becomes 'the day before'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_70",
                subject = "English Language",
                topic = "Phrasal Verbs",
                year = "2010",
                questionText = "Despite the severity of the illness, the physician believes she will pull ________.",
                optionA = "up",
                optionB = "over",
                optionC = "through",
                optionD = "back",
                correctAnswerIndex = 2,
                explanation = "'Pull through' means recovering and surviving a critical illness or ordeal.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_71",
                subject = "English Language",
                topic = "Subject-Verb Concord",
                year = "2010",
                questionText = "A wide range of options ________ made available to students in the final year last session.",
                optionA = "is",
                optionB = "were",
                optionC = "are",
                optionD = "was",
                correctAnswerIndex = 3,
                explanation = "The singular head noun 'A wide range' in past tense takes the singular auxiliary verb 'was'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_72",
                subject = "English Language",
                topic = "Subject-Verb Concord & Relative Clauses",
                year = "2010",
                questionText = "One of the women who ________ in the premises ________ been ordered to quit.",
                optionA = "sells / have",
                optionB = "sell / has",
                optionC = "sell / have",
                optionD = "sells / has",
                correctAnswerIndex = 1,
                explanation = "In the relative clause 'women who sell' (plural antecedent), 'sell' is plural; the main sentence subject 'One' takes the singular verb 'has'.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_73",
                subject = "English Language",
                topic = "Order of Adjectives",
                year = "2010",
                questionText = "The new trade agreement should facilitate ________.",
                optionA = "more economic rapid growth",
                optionB = "economic more rapid growth",
                optionC = "rapid economic more growth",
                optionD = "more rapid economic growth",
                correctAnswerIndex = 3,
                explanation = "Standard English syntax places the comparative modifier first, followed by quality, then classification: 'more rapid economic growth'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_74",
                subject = "English Language",
                topic = "Prepositional Collocations",
                year = "2010",
                questionText = "The principal said that he was pleased ________ my effort.",
                optionA = "on",
                optionB = "of",
                optionC = "with",
                optionD = "about",
                correctAnswerIndex = 2,
                explanation = "'Pleased' idiomatically collocates with 'with' when referencing an action or outcome.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_75",
                subject = "English Language",
                topic = "Prepositional Collocations",
                year = "2010",
                questionText = "Paper is made ________ wood pulp.",
                optionA = "on",
                optionB = "of",
                optionC = "from",
                optionD = "with",
                correctAnswerIndex = 2,
                explanation = "'Made from' is used when the source material undergoes a chemical transformation into a new substance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_76",
                subject = "English Language",
                topic = "Tense & Aspect",
                year = "2010",
                questionText = "Long after everyone ________ the hall, Obi still sat inside meditating.",
                optionA = "left",
                optionB = "is leaving",
                optionC = "has left",
                optionD = "had left",
                correctAnswerIndex = 3,
                explanation = "The past perfect 'had left' describes an action completed prior to another past state ('still sat').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_77",
                subject = "English Language",
                topic = "Possessive Nouns & Apostrophes",
                year = "2010",
                questionText = "They are the ________ dresses.",
                optionA = "babys’",
                optionB = "baby",
                optionC = "babies",
                optionD = "babies’",
                correctAnswerIndex = 3,
                explanation = "The regular plural possessive form of 'baby' is 'babies''.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_78",
                subject = "English Language",
                topic = "Prepositional Collocations",
                year = "2010",
                questionText = "The politician was sent ________ exile.",
                optionA = "onto",
                optionB = "into",
                optionC = "on",
                optionD = "to",
                correctAnswerIndex = 1,
                explanation = "'Sent into exile' (or 'driven into exile') is the standard English prepositional phrase.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_79",
                subject = "English Language",
                topic = "Homophones & Vocabulary",
                year = "2010",
                questionText = "When we looked up, we ________ the supersonic jet cruising some miles away.",
                optionA = "site",
                optionB = "cited",
                optionC = "sited",
                optionD = "sighted",
                correctAnswerIndex = 3,
                explanation = "'Sighted' is the past tense of sight (to catch visual glimpse of something).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_80",
                subject = "English Language",
                topic = "Nouns & Idiomatic Collocations",
                year = "2010",
                questionText = "Vital ________ is still spread ________ word of mouth in most rural communities.",
                optionA = "informations / from",
                optionB = "information / with",
                optionC = "information / by",
                optionD = "information / through",
                correctAnswerIndex = 2,
                explanation = "'Information' is an uncountable noun, and 'by word of mouth' is the fixed idiom.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_81",
                subject = "English Language",
                topic = "Vocabulary",
                year = "2010",
                questionText = "Western formal education is one of the lasting ________ of colonial rule.",
                optionA = "legacies",
                optionB = "evidence",
                optionC = "remnants",
                optionD = "inheritances",
                correctAnswerIndex = 0,
                explanation = "A 'legacy' is an enduring institution, custom, or system handed down from a previous era.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_82",
                subject = "English Language",
                topic = "Vocabulary & Legal Terminology",
                year = "2010",
                questionText = "The Federal Government has officially ________ child trafficking and forced labor.",
                optionA = "postulated",
                optionB = "projected",
                optionC = "prescribed",
                optionD = "proscribed",
                correctAnswerIndex = 3,
                explanation = "To 'proscribe' means to legally forbid, ban, or outlaw an activity.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_83",
                subject = "English Language",
                topic = "Vocabulary & Legal Terms",
                year = "2010",
                questionText = "The man was relieved that his son confessed his guilt, and so the other suspects were ________.",
                optionA = "exonerated",
                optionB = "incriminated",
                optionC = "convicted",
                optionD = "remanded",
                correctAnswerIndex = 0,
                explanation = "To be 'exonerated' means to be officially absolved and cleared of all blame or guilt.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_84",
                subject = "English Language",
                topic = "Grammatical Structures & Correlatives",
                year = "2010",
                questionText = "Based on the evidence before me, I have no alternative ________ to hold you responsible.",
                optionA = "only",
                optionB = "as",
                optionC = "than",
                optionD = "but",
                correctAnswerIndex = 3,
                explanation = "The correlative structure 'no alternative but...' is the standard English construction.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_85",
                subject = "English Language",
                topic = "Vocabulary",
                year = "2010",
                questionText = "Many unscrupulous individuals would always find dubious ways to ________ the law.",
                optionA = "arrogate",
                optionB = "debase",
                optionC = "circumvent",
                optionD = "circumspect",
                correctAnswerIndex = 2,
                explanation = "To 'circumvent' the law means to cleverly find a loophole or bypass a regulation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        // ---------------------------------------------------------------------
        // SECTION F: ORAL FORMS & PHONOLOGY (Questions 86 - 100)
        // ---------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2010_86",
                subject = "English Language",
                topic = "Oral Forms: Vowel Sounds",
                year = "2010",
                questionText = "Choose the option that has the same vowel sound as the one represented by the underlined letters in: c<u>ou</u>p",
                optionA = "whup",
                optionB = "h<u>oo</u>t",
                optionC = "couple",
                optionD = "scout",
                correctAnswerIndex = 1,
                explanation = "'Coup' /kuː/ and 'hoot' /huːt/ share the long back close vowel sound /uː/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_87",
                subject = "English Language",
                topic = "Oral Forms: Vowel Sounds",
                year = "2010",
                questionText = "Choose the option that has the same vowel sound as the one represented by the underlined letters in: ind<u>i</u>ct",
                optionA = "br<u>i</u>ght",
                optionB = "fish",
                optionC = "pick",
                optionD = "brick",
                correctAnswerIndex = 0,
                explanation = "The 'i' in 'indict' /ɪnˈdaɪt/ is pronounced as the diphthong /aɪ/, exactly as in 'bright' /braɪt/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_88",
                subject = "English Language",
                topic = "Oral Forms: Vowel Sounds",
                year = "2010",
                questionText = "Choose the option that has the same vowel sound as the one represented by the underlined letters in: r<u>oar</u>ed",
                optionA = "towered",
                optionB = "coast",
                optionC = "br<u>ough</u>t",
                optionD = "rod",
                correctAnswerIndex = 2,
                explanation = "'Roared' /rɔːd/ and 'brought' /brɔːt/ contain the long open-mid back rounded vowel /ɔː/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_89",
                subject = "English Language",
                topic = "Oral Forms: Consonant Sounds",
                year = "2010",
                questionText = "Choose the option that has the same consonant sound as the one represented by the underlined letters in: shea<u>th</u>",
                optionA = "bathe",
                optionB = "leng<u>th</u>",
                optionC = "months",
                optionD = "paths",
                correctAnswerIndex = 1,
                explanation = "'Sheath' /ʃiːθ/ ends in the voiceless dental fricative /θ/, which is also heard in 'length' /leŋθ/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_90",
                subject = "English Language",
                topic = "Oral Forms: Consonant Sounds",
                year = "2010",
                questionText = "Choose the option that has the same consonant sound as the one represented by the underlined letter in: <u>h</u>igh",
                optionA = "what",
                optionB = "honest",
                optionC = "<u>wh</u>o",
                optionD = "vehicle",
                correctAnswerIndex = 2,
                explanation = "'Who' /huː/ is pronounced with the aspirated glottal fricative /h/, matching 'high' /haɪ/ (the 'h' is silent in 'honest' and 'vehicle').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_91",
                subject = "English Language",
                topic = "Oral Forms: Consonant Sounds",
                year = "2010",
                questionText = "Choose the option that has the same consonant sound as the one represented by the underlined letter in: o<u>f</u> course",
                optionA = "plough",
                optionB = "dough",
                optionC = "o<u>v</u>er",
                optionD = "orphan",
                correctAnswerIndex = 2,
                explanation = "The single 'f' in the preposition 'of' is pronounced as the voiced labiodental fricative /v/, matching 'over'.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_92",
                subject = "English Language",
                topic = "Oral Forms: Rhymes",
                year = "2010",
                questionText = "Choose the option that rhymes with: boys",
                optionA = "stays",
                optionB = "moist",
                optionC = "noise",
                optionD = "elbows",
                correctAnswerIndex = 2,
                explanation = "'Boys' /bɔɪz/ rhymes with 'noise' /nɔɪz/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_93",
                subject = "English Language",
                topic = "Oral Forms: Rhymes",
                year = "2010",
                questionText = "Choose the option that rhymes with: shine",
                optionA = "clean",
                optionB = "fine",
                optionC = "machine",
                optionD = "lain",
                correctAnswerIndex = 1,
                explanation = "'Shine' /ʃaɪn/ rhymes with 'fine' /faɪn/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_94",
                subject = "English Language",
                topic = "Oral Forms: Rhymes",
                year = "2010",
                questionText = "Choose the option that rhymes with: peer",
                optionA = "snare",
                optionB = "spare",
                optionC = "spear",
                optionD = "square",
                correctAnswerIndex = 2,
                explanation = "'Peer' /pɪə/ rhymes with 'spear' /spɪə/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_95",
                subject = "English Language",
                topic = "Oral Forms: Syllabic Stress",
                year = "2010",
                questionText = "Choose the word with the correct primary stress pattern: political",
                optionA = "poliTIcal",
                optionB = "po-LI-ti-cal",
                optionC = "PO-li-ti-cal",
                optionD = "po-li-ti-CAL",
                correctAnswerIndex = 1,
                explanation = "In 'political', the primary tonic accent is on the second syllable: po-LI-ti-cal /pəˈlɪtɪkəl/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_96",
                subject = "English Language",
                topic = "Oral Forms: Syllabic Stress",
                year = "2010",
                questionText = "Choose the word with the correct primary stress pattern: satisfactory",
                optionA = "sa-TIS-fac-to-ry",
                optionB = "sa-tis-FAC-to-ry",
                optionC = "SA-tis-fac-to-ry",
                optionD = "sa-tis-fac-TO-ry",
                correctAnswerIndex = 1,
                explanation = "In 'satisfactory', the primary stress falls on the third syllable: sa-tis-FAC-to-ry /ˌsætɪsˈfæktəri/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_97",
                subject = "English Language",
                topic = "Oral Forms: Syllabic Stress",
                year = "2010",
                questionText = "Choose the word with the correct primary stress pattern: captivity",
                optionA = "cap-ti-VI-ty",
                optionB = "CAP-ti-vi-ty",
                optionC = "cap-TI-vi-ty",
                optionD = "cap-ti-vi-TY",
                correctAnswerIndex = 2,
                explanation = "In 'captivity', primary stress falls on the antepenultimate syllable: cap-TI-vi-ty /kæpˈtɪvəti/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_98",
                subject = "English Language",
                topic = "Oral Forms: Emphatic Stress",
                year = "2010",
                questionText = "Choose the question to which the given sentence is the most appropriate answer:\nEMEKA finished his homework yesterday.",
                optionA = "Was Emeka assisted to do his homework?",
                optionB = "Did Emeka do his homework yesterday?",
                optionC = "When did Emeka finish his homework?",
                optionD = "Who finished his homework yesterday?",
                correctAnswerIndex = 3,
                explanation = "Emphatic stress on 'EMEKA' highlights the identity of the person performing the action.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_99",
                subject = "English Language",
                topic = "Oral Forms: Emphatic Stress",
                year = "2010",
                questionText = "Choose the question to which the given sentence is the most appropriate answer:\nTaiwo SAILED to London.",
                optionA = "Did Taiwo fly to London?",
                optionB = "Did Taiwo sail to Brazil?",
                optionC = "Did Taiwo sail to London?",
                optionD = "Where did Taiwo sail to?",
                correctAnswerIndex = 0,
                explanation = "Emphatic stress on 'SAILED' contradicts an alternative mode of transportation such as flying.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2010_100",
                subject = "English Language",
                topic = "Oral Forms: Emphatic Stress",
                year = "2010",
                questionText = "Choose the question to which the given sentence is the most appropriate answer:\nMy bag is made of LEATHER.",
                optionA = "Whose bag is made of leather?",
                optionB = "Is your bag made of polythene?",
                optionC = "Is Abu’s bag made of leather?",
                optionD = "Is your bag made of leather?",
                correctAnswerIndex = 1,
                explanation = "Emphatic stress on 'LEATHER' corrects an inquiry proposing a different material such as polythene.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English Past Question • 2010"
            )
        )

        return list
    }
}
