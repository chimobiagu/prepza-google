package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Use of English 2015 Complete Authentic CBT Exam Bank (80 Questions).
 * Complete paper extracted with source integrity and verified answers:
 * - Questions 1 - 15: Cloze Test (The Study of Culture in Psychological & Anthropological Research)
 * - Questions 16 - 20: Comprehension (Child Malnutrition, Immune System Deficits & Prevention)
 * - Questions 21 - 30: Prescribed UTME Prose (The Last Days at Forcados High School - A.H. Mohammed)
 * - Questions 31 - 40: Antonyms (Opposite in Meaning)
 * - Questions 41 - 50: Synonyms (Nearest in Meaning)
 * - Questions 51 - 65: Sentence Completion, Concord, Tenses, Prepositions & Phrasal Verbs
 * - Questions 66 - 80: Oral English (Vowels, Consonants, Silent Letters, Syllable & Emphatic Stress)
 */
object JambEnglish2015ExamCompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.addAll(getPart1())
        list.addAll(getPart2())
        return list
    }

    private fun getPart1(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_01",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [1]",
                optionA = "tenuous",
                optionB = "unrealistic",
                optionC = "remote",
                optionD = "critical",
                correctAnswerIndex = 2,
                explanation = "In psychological research, studying broad cultural variables often felt detached or 'remote' compared to direct laboratory observation.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_02",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [2]",
                optionA = "whole",
                optionB = "isolated",
                optionC = "primitive",
                optionD = "indigenous",
                correctAnswerIndex = 1,
                explanation = "Anthropologists historically prioritized 'isolated' communities (such as remote islands) to minimize confounding external factors.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_03",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [3]",
                optionA = "regions",
                optionB = "clans",
                optionC = "nations",
                optionD = "tribes",
                correctAnswerIndex = 3,
                explanation = "Anthropologists selected isolated islands or specific distinct 'tribes'.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_04",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [4]",
                optionA = "neglected",
                optionB = "avoided",
                optionC = "abandoned",
                optionD = "left",
                correctAnswerIndex = 3,
                explanation = "The study of culture in complex industrial societies was traditionally 'left' to sociologists.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_05",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [5]",
                optionA = "small",
                optionB = "slight",
                optionC = "poor",
                optionD = "little",
                correctAnswerIndex = 3,
                explanation = "'Little' is the correct quantifier for the uncountable noun 'systematic information'.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_06",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [6]",
                optionA = "presented",
                optionB = "exposed",
                optionC = "welcomed",
                optionD = "introduced",
                correctAnswerIndex = 1,
                explanation = "An individual in a complex modern society is continuously 'exposed' to diverse sociocultural stimuli.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_07",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [7]",
                optionA = "aggregate",
                optionB = "network",
                optionC = "conglomeration",
                optionD = "pattern",
                correctAnswerIndex = 3,
                explanation = "A complex 'pattern' of cultural influences shapes personal development.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_08",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [8]",
                optionA = "essentially",
                optionB = "virtually",
                optionC = "exceptionally",
                optionD = "particularly",
                correctAnswerIndex = 1,
                explanation = "'Virtually' everyone has unique personal exposure in a diversified modern society.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_09",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [9]",
                optionA = "status",
                optionB = "environment",
                optionC = "background",
                optionD = "framework",
                correctAnswerIndex = 2,
                explanation = "Each person in a differentiated society develops a unique cultural 'background'.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_10",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [10]",
                optionA = "problem",
                optionB = "task",
                optionC = "matter",
                optionD = "duty",
                correctAnswerIndex = 1,
                explanation = "The analytical 'task' of determining individualized cultural influences is exceedingly difficult.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_11",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [11]",
                optionA = "dynamic",
                optionB = "conservative",
                optionC = "uniform",
                optionD = "static",
                correctAnswerIndex = 2,
                explanation = "Traditional small-scale communities exhibited a far more 'uniform' cultural environment.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_12",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [12]",
                optionA = "misleading",
                optionB = "untrue",
                optionC = "inaccurate",
                optionD = "impossible",
                correctAnswerIndex = 0,
                explanation = "It is 'misleading' to treat any culture as monolithic without recognizing intra-group variance.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_13",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [13]",
                optionA = "constantly",
                optionB = "usually",
                optionC = "often",
                optionD = "always",
                correctAnswerIndex = 0,
                explanation = "Culture is inherently dynamic and 'constantly' undergoing incremental adaptation.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_14",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [14]",
                optionA = "remotest",
                optionB = "simplest",
                optionC = "most isolated",
                optionD = "most ancient",
                correctAnswerIndex = 1,
                explanation = "Modern technological and social developments have made even the 'simplest' of societies complex.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_15",
                subject = "English Language",
                topic = "Cloze Test: Study of Culture",
                year = "2015",
                questionText = "Choose the word that best fills gap [15]",
                optionA = "only",
                optionB = "now",
                optionC = "just",
                optionD = "ever",
                correctAnswerIndex = 0,
                explanation = "Social scientists are 'only' now beginning to grasp these complex multi-layered interactions.",
                passageText = "From the perspective of most field psychologists, the study of culture is a rather [1] affair. In trying to discover how individuals develop within their societies, anthropologists and psychologists have usually selected for study rather [2] communities, like the inhabitants of islands or specific [3]. The study of culture in complex societies has been largely [4] to the sociologists. The result is that there is rather [5] systematic information available about the cultural influences that affect each of us during our development.\nIt is an inevitable feature of life in a modern complex society that any individual is [6] to a very complex [7] of cultural influences from different sources. This means that [8] everyone will have a somewhat different cultural [9]. The [10] of determining what influences any given person is subject to is exceedingly difficult. It is partly for this reason that anthropologists have often turned to the study of primitive societies where the cultural environment is more [11]. Even among primitive societies, it is [12] to talk of culture as a unified whole. It is [13] changing, and is usually divided into various subcultures. Furthermore, modern social developments have made even the [14] of societies complex. The result is that social scientists are [15] beginning to understand how culture affects human behavior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_16",
                subject = "English Language",
                topic = "Comprehension: Malnutrition & Immunity",
                year = "2015",
                questionText = "According to the passage, the primary root cause of malnutrition in developing nations is",
                optionA = "inadequate rainfall and droughts",
                optionB = "poverty",
                optionC = "lack of western education",
                optionD = "high fertility rates",
                correctAnswerIndex = 1,
                explanation = "The passage explicitly begins by stating that poverty is the primary cause of malnutrition.",
                passageText = "Poverty is the primary cause of malnutrition, and it is a major challenge in developing countries. Malnutrition is caused by a lack of access to healthy food, poor infant and young child feeding practices, and inadequate access to healthcare. Malnutrition is associated with significant increases in mortality and morbidity. It weakens the immune system, making children more vulnerable to infectious diseases like diarrhea, pneumonia, and malaria. In turn, infectious diseases exacerbate malnutrition by decreasing appetite, impairing nutrient absorption, and increasing metabolic demands. This creates a vicious cycle of malnutrition and infection. Addressing malnutrition requires a multi-sectoral approach that includes improving access to nutritious food, promoting breastfeeding, ensuring adequate healthcare, and addressing underlying poverty. Interventions such as micro-nutrient supplementation, food fortification, and social protection programs can also be effective in reducing malnutrition.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_17",
                subject = "English Language",
                topic = "Comprehension: Malnutrition & Immunity",
                year = "2015",
                questionText = "How do infectious diseases exacerbate the condition of malnutrition in children?",
                optionA = "By accelerating mental alertness",
                optionB = "By decreasing appetite, impairing nutrient absorption, and increasing metabolic demands",
                optionC = "By promoting rapid cellular regeneration",
                optionD = "By eliminating all harmful gut bacteria",
                correctAnswerIndex = 1,
                explanation = "The text highlights that infections reduce appetite, compromise absorption in the digestive tract, and elevate metabolic requirements.",
                passageText = "Poverty is the primary cause of malnutrition, and it is a major challenge in developing countries. Malnutrition is caused by a lack of access to healthy food, poor infant and young child feeding practices, and inadequate access to healthcare. Malnutrition is associated with significant increases in mortality and morbidity. It weakens the immune system, making children more vulnerable to infectious diseases like diarrhea, pneumonia, and malaria. In turn, infectious diseases exacerbate malnutrition by decreasing appetite, impairing nutrient absorption, and increasing metabolic demands. This creates a vicious cycle of malnutrition and infection. Addressing malnutrition requires a multi-sectoral approach that includes improving access to nutritious food, promoting breastfeeding, ensuring adequate healthcare, and addressing underlying poverty. Interventions such as micro-nutrient supplementation, food fortification, and social protection programs can also be effective in reducing malnutrition.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_18",
                subject = "English Language",
                topic = "Comprehension: Malnutrition & Immunity",
                year = "2015",
                questionText = "The interaction between malnutrition and infection is described as a 'vicious cycle' because",
                optionA = "each condition triggers and reinforces the severity of the other in a recurring spiral",
                optionB = "both conditions are cured by the same simple vaccine",
                optionC = "malnutrition only occurs after infection has cleared",
                optionD = "it only affects adults in urban areas",
                correctAnswerIndex = 0,
                explanation = "Malnutrition lowers immune resistance making infections more frequent and severe, which in turn deepens nutritional deficits.",
                passageText = "Poverty is the primary cause of malnutrition, and it is a major challenge in developing countries. Malnutrition is caused by a lack of access to healthy food, poor infant and young child feeding practices, and inadequate access to healthcare. Malnutrition is associated with significant increases in mortality and morbidity. It weakens the immune system, making children more vulnerable to infectious diseases like diarrhea, pneumonia, and malaria. In turn, infectious diseases exacerbate malnutrition by decreasing appetite, impairing nutrient absorption, and increasing metabolic demands. This creates a vicious cycle of malnutrition and infection. Addressing malnutrition requires a multi-sectoral approach that includes improving access to nutritious food, promoting breastfeeding, ensuring adequate healthcare, and addressing underlying poverty. Interventions such as micro-nutrient supplementation, food fortification, and social protection programs can also be effective in reducing malnutrition.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_19",
                subject = "English Language",
                topic = "Comprehension: Malnutrition & Immunity",
                year = "2015",
                questionText = "Which of the following interventions is mentioned in the passage to combat malnutrition?",
                optionA = "Exclusive reliance on herbal concoctions",
                optionB = "Micro-nutrient supplementation, food fortification, and social protection programs",
                optionC = "Banning all imported agricultural food items",
                optionD = "Immediate industrialization of all rural villages",
                correctAnswerIndex = 1,
                explanation = "The passage explicitly names micro-nutrient supplementation, food fortification, and social protection programs.",
                passageText = "Poverty is the primary cause of malnutrition, and it is a major challenge in developing countries. Malnutrition is caused by a lack of access to healthy food, poor infant and young child feeding practices, and inadequate access to healthcare. Malnutrition is associated with significant increases in mortality and morbidity. It weakens the immune system, making children more vulnerable to infectious diseases like diarrhea, pneumonia, and malaria. In turn, infectious diseases exacerbate malnutrition by decreasing appetite, impairing nutrient absorption, and increasing metabolic demands. This creates a vicious cycle of malnutrition and infection. Addressing malnutrition requires a multi-sectoral approach that includes improving access to nutritious food, promoting breastfeeding, ensuring adequate healthcare, and addressing underlying poverty. Interventions such as micro-nutrient supplementation, food fortification, and social protection programs can also be effective in reducing malnutrition.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_20",
                subject = "English Language",
                topic = "Comprehension: Malnutrition & Immunity",
                year = "2015",
                questionText = "A suitable title for the passage would be",
                optionA = "The History of Infectious Outbreaks",
                optionB = "Malnutrition, Immune Deficiency, and Strategies for Prevention",
                optionC = "The Global Economy of Food Production",
                optionD = "The Biology of Infant Digestion",
                correctAnswerIndex = 1,
                explanation = "The central theme focuses on malnutrition, immune system interaction, and multi-sectoral remedies.",
                passageText = "Poverty is the primary cause of malnutrition, and it is a major challenge in developing countries. Malnutrition is caused by a lack of access to healthy food, poor infant and young child feeding practices, and inadequate access to healthcare. Malnutrition is associated with significant increases in mortality and morbidity. It weakens the immune system, making children more vulnerable to infectious diseases like diarrhea, pneumonia, and malaria. In turn, infectious diseases exacerbate malnutrition by decreasing appetite, impairing nutrient absorption, and increasing metabolic demands. This creates a vicious cycle of malnutrition and infection. Addressing malnutrition requires a multi-sectoral approach that includes improving access to nutritious food, promoting breastfeeding, ensuring adequate healthcare, and addressing underlying poverty. Interventions such as micro-nutrient supplementation, food fortification, and social protection programs can also be effective in reducing malnutrition.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_21",
                subject = "English Language",
                topic = "Prescribed Novel: The Last Days at Forcados High School",
                year = "2015",
                questionText = "In A.H. Mohammed's 'The Last Days at Forcados High School', Jimi Solade was well-known among students as",
                optionA = "a notorious truant and bully",
                optionB = "a charismatic, handsome student and star school footballer",
                optionC = "a timid newcomer who disliked sports",
                optionD = "a stern senior prefect who punished junior students",
                correctAnswerIndex = 1,
                explanation = "Jimi Solade was handsome, intelligent, athletic, and the school's star soccer player.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_22",
                subject = "English Language",
                topic = "Prescribed Novel: The Last Days at Forcados High School",
                year = "2015",
                questionText = "Why did Efua initially attract negative rumors and hostility among students at Forcados High?",
                optionA = "She stole laboratory chemicals",
                optionB = "She was reserved, aloof, and received mysterious letters from an older man",
                optionC = "She refused to wear the school uniform",
                optionD = "She failed all her terminal examinations",
                correctAnswerIndex = 1,
                explanation = "Efua kept to herself, which fueled gossip, worsened when Miss Agbeniyi found her personal correspondence.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_23",
                subject = "English Language",
                topic = "Prescribed Novel: The Last Days at Forcados High School",
                year = "2015",
                questionText = "What was Jimi Solade's older brother, Wole, notorious for in the novel?",
                optionA = "Winning national academic laurels",
                optionB = "Dropping out of university and getting involved in burglary and bad company",
                optionC = "Becoming a wealthy corporate bank executive",
                optionD = "Teaching physics at Forcados High",
                correctAnswerIndex = 1,
                explanation = "Wole was the troubled black sheep who had dropped out of university and stolen his father's jewelry and money.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_24",
                subject = "English Language",
                topic = "Prescribed Novel: The Last Days at Forcados High School",
                year = "2015",
                questionText = "Why did Jimi take the blame when laboratory equipment was stolen from Forcados High School?",
                optionA = "He actually committed the theft alone",
                optionB = "To shield his wayward older brother Wole from arrest and imprisonment",
                optionC = "He wanted to get expelled from school",
                optionD = "Efua forced him to confess at knifepoint",
                correctAnswerIndex = 1,
                explanation = "Jimi sacrificed his own stellar reputation to protect Wole from police arrest and criminal prosecution.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_25",
                subject = "English Language",
                topic = "Prescribed Novel: The Last Days at Forcados High School",
                year = "2015",
                questionText = "The reconciliation between Mr. Solade and his sons occurred primarily after",
                optionA = "Jimi won a prestigious national scholarship and their mother's illness softened family grief",
                optionB = "Mr. Solade lost his commercial company in Lagos",
                optionC = "Wole became a celebrated medical doctor",
                optionD = "They migrated overseas to the United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The family tragedy of their mother's terminal illness and Jimi's redemption brought mutual reconciliation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_26",
                subject = "English Language",
                topic = "Prescribed Novel: The Last Days at Forcados High School",
                year = "2015",
                questionText = "Who was Ansa in 'The Last Days at Forcados High School'?",
                optionA = "Jimi's artistic and loyal closest friend",
                optionB = "The principal of the school",
                optionC = "The captain of the rival football team",
                optionD = "The chemistry teacher",
                correctAnswerIndex = 0,
                explanation = "Ansa was Jimi's quiet, artistic, and deeply loyal childhood friend who loved painting.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_27",
                subject = "English Language",
                topic = "Prescribed Novel: The Last Days at Forcados High School",
                year = "2015",
                questionText = "Which teacher at Forcados High was fondly called 'Vampire' by the students?",
                optionA = "Mr. Mallum the principal",
                optionB = "Mr. Bade the literature teacher",
                optionC = "Mr. Karwi the strict mathematics teacher",
                optionD = "Mrs. Alli the biology teacher",
                correctAnswerIndex = 2,
                explanation = "Mr. Karwi was nicknamed 'Vampire' because of his austere face, stern demeanor, and strict disciplinary standards.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_28",
                subject = "English Language",
                topic = "Prescribed Novel: The Last Days at Forcados High School",
                year = "2015",
                questionText = "What did Nene Ekpo aspire to become in the future?",
                optionA = "A fashion model in Paris",
                optionB = "An investigative journalist or broadcaster",
                optionC = "A petroleum engineer",
                optionD = "A commercial bank manager",
                correctAnswerIndex = 1,
                explanation = "Nene Ekpo was outspoken, inquisitive, and dreamed of pursuing journalism and broadcasting.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_29",
                subject = "English Language",
                topic = "Prescribed Novel: The Last Days at Forcados High School",
                year = "2015",
                questionText = "How did the students at Forcados High show solidarity with Jimi when he was stripped of his prefect title?",
                optionA = "They organized a violent street protest",
                optionB = "They boycotted classes for a month",
                optionC = "They rallied behind him, cheered him at the inter-house matches, and supported his innocence",
                optionD = "They signed a petition to dismiss the principal",
                correctAnswerIndex = 2,
                explanation = "The students recognized Jimi's moral character, rallied around him, and celebrated his athletic achievements.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_30",
                subject = "English Language",
                topic = "Prescribed Novel: The Last Days at Forcados High School",
                year = "2015",
                questionText = "The major moral lesson illustrated through Jimi's journey in the novel is that",
                optionA = "wealth is more important than moral integrity",
                optionB = "loyalty, personal responsibility, and resilience overcome adversity and misunderstanding",
                optionC = "running away from home solves domestic crises",
                optionD = "academic competition justifies dishonest conduct",
                correctAnswerIndex = 1,
                explanation = "The novel emphasizes moral growth, integrity, forgiveness, and overcoming family and peer difficulties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_31",
                subject = "English Language",
                topic = "Antonyms (Opposite in Meaning)",
                year = "2015",
                questionText = "Choose the word opposite in meaning: The accountant was commended for his *scrupulous* attention to financial records.",
                optionA = "careless",
                optionB = "meticulous",
                optionC = "rigorous",
                optionD = "principled",
                correctAnswerIndex = 0,
                explanation = "'Scrupulous' means diligent, thorough, and attentive to details; its direct antonym is 'careless'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_32",
                subject = "English Language",
                topic = "Antonyms (Opposite in Meaning)",
                year = "2015",
                questionText = "Choose the word opposite in meaning: The governor gave a *plausible* explanation for the delay in road construction.",
                optionA = "convincing",
                optionB = "implausible",
                optionC = "reasonable",
                optionD = "acceptable",
                correctAnswerIndex = 1,
                explanation = "'Plausible' means believable or credible; its antonym is 'implausible' or unbelievable.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_33",
                subject = "English Language",
                topic = "Antonyms (Opposite in Meaning)",
                year = "2015",
                questionText = "Choose the word opposite in meaning: His *bellicose* attitude during the meeting provoked unnecessary conflict.",
                optionA = "aggressive",
                optionB = "pugnacious",
                optionC = "peaceful",
                optionD = "hostile",
                correctAnswerIndex = 2,
                explanation = "'Bellicose' means aggressive and eager to fight; its direct antonym is 'peaceful' or conciliatory.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_34",
                subject = "English Language",
                topic = "Antonyms (Opposite in Meaning)",
                year = "2015",
                questionText = "Choose the word opposite in meaning: The judge noted that the witness's testimony was *consistent* with the evidence.",
                optionA = "compatible",
                optionB = "contradictory",
                optionC = "congruent",
                optionD = "reliable",
                correctAnswerIndex = 1,
                explanation = "'Consistent' means in agreement or harmonious; its antonym is 'contradictory' or conflicting.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_35",
                subject = "English Language",
                topic = "Antonyms (Opposite in Meaning)",
                year = "2015",
                questionText = "Choose the word opposite in meaning: She was praised for her *frugal* spending habits during the economic downturn.",
                optionA = "extravagant",
                optionB = "prudent",
                optionC = "thrifty",
                optionD = "austere",
                correctAnswerIndex = 0,
                explanation = "'Frugal' means economical and sparing; its direct antonym is 'extravagant' or wasteful.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_36",
                subject = "English Language",
                topic = "Antonyms (Opposite in Meaning)",
                year = "2015",
                questionText = "Choose the word opposite in meaning: The company made a *tentative* agreement with the labor union pending board approval.",
                optionA = "provisional",
                optionB = "definite",
                optionC = "hesitant",
                optionD = "temporary",
                correctAnswerIndex = 1,
                explanation = "'Tentative' means not certain or provisional; its direct antonym is 'definite' or conclusive.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_37",
                subject = "English Language",
                topic = "Antonyms (Opposite in Meaning)",
                year = "2015",
                questionText = "Choose the word opposite in meaning: The speaker made an *ambiguous* statement that left everyone confused.",
                optionA = "clear",
                optionB = "vague",
                optionC = "obscure",
                optionD = "equivocal",
                correctAnswerIndex = 0,
                explanation = "'Ambiguous' means open to more than one interpretation; its antonym is 'clear' or unambiguous.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_38",
                subject = "English Language",
                topic = "Antonyms (Opposite in Meaning)",
                year = "2015",
                questionText = "Choose the word opposite in meaning: Many developing nations face *chronic* balance of payments deficits.",
                optionA = "persistent",
                optionB = "temporary",
                optionC = "incurable",
                optionD = "long-standing",
                correctAnswerIndex = 1,
                explanation = "'Chronic' means persisting for a long time or constantly recurring; its antonym is 'temporary' or acute.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_39",
                subject = "English Language",
                topic = "Antonyms (Opposite in Meaning)",
                year = "2015",
                questionText = "Choose the word opposite in meaning: The defendant appeared *remorseful* when the judgment was delivered.",
                optionA = "repentant",
                optionB = "unrepentant",
                optionC = "contrite",
                optionD = "sorrowful",
                correctAnswerIndex = 1,
                explanation = "'Remorseful' means filled with regret and sorrow; its opposite is 'unrepentant' or callous.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_40",
                subject = "English Language",
                topic = "Antonyms (Opposite in Meaning)",
                year = "2015",
                questionText = "Choose the word opposite in meaning: The doctor prescribed a medication that *alleviates* acute joint pain.",
                optionA = "soothes",
                optionB = "aggravates",
                optionC = "mitigates",
                optionD = "relieves",
                correctAnswerIndex = 1,
                explanation = "'Alleviate' means to lessen or make less severe; its antonym is 'aggravate' or worsen.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q40"
            )
        )
        return list
    }

    private fun getPart2(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_41",
                subject = "English Language",
                topic = "Synonyms (Nearest in Meaning)",
                year = "2015",
                questionText = "Choose the word nearest in meaning: The minister delivered an *extempore* address at the convocation ceremony.",
                optionA = "impromptu",
                optionB = "rehearsed",
                optionC = "written",
                optionD = "lengthy",
                correctAnswerIndex = 0,
                explanation = "'Extempore' means spoken or done without preparation or notes; 'impromptu' is the exact synonym.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_42",
                subject = "English Language",
                topic = "Synonyms (Nearest in Meaning)",
                year = "2015",
                questionText = "Choose the word nearest in meaning: The professor's lecture on quantum mechanics was *esoteric*.",
                optionA = "popular",
                optionB = "obscure and understood by few",
                optionC = "elementary",
                optionD = "superficial",
                correctAnswerIndex = 1,
                explanation = "'Esoteric' means intended for or likely to be understood by only a small number of people with specialized knowledge.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_43",
                subject = "English Language",
                topic = "Synonyms (Nearest in Meaning)",
                year = "2015",
                questionText = "Choose the word nearest in meaning: The lawyer presented an *unassailable* argument before the tribunal.",
                optionA = "flawed",
                optionB = "indisputable",
                optionC = "debatable",
                optionD = "fragile",
                correctAnswerIndex = 1,
                explanation = "'Unassailable' means unable to be attacked, questioned, or defeated; 'indisputable'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_44",
                subject = "English Language",
                topic = "Synonyms (Nearest in Meaning)",
                year = "2015",
                questionText = "Choose the word nearest in meaning: The civil war left the nation's infrastructure in a *deplorable* state.",
                optionA = "lamentable",
                optionB = "magnificent",
                optionC = "commendable",
                optionD = "satisfactory",
                correctAnswerIndex = 0,
                explanation = "'Deplorable' means shockingly bad or deserving strong condemnation; 'lamentable'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_45",
                subject = "English Language",
                topic = "Synonyms (Nearest in Meaning)",
                year = "2015",
                questionText = "Choose the word nearest in meaning: The committee made a *concise* summary of the investigation findings.",
                optionA = "succinct",
                optionB = "lengthy",
                optionC = "wordy",
                optionD = "rambling",
                correctAnswerIndex = 0,
                explanation = "'Concise' means giving a lot of information clearly and in a few words; 'succinct'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_46",
                subject = "English Language",
                topic = "Synonyms (Nearest in Meaning)",
                year = "2015",
                questionText = "Choose the word nearest in meaning: The new legislation will *mitigate* the impact of inflation on low-income earners.",
                optionA = "moderate",
                optionB = "intensify",
                optionC = "worsen",
                optionD = "escalate",
                correctAnswerIndex = 0,
                explanation = "'Mitigate' means make less severe, serious, or painful; 'moderate' or ease.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_47",
                subject = "English Language",
                topic = "Synonyms (Nearest in Meaning)",
                year = "2015",
                questionText = "Choose the word nearest in meaning: He was reprimanded for his *insolent* remarks to the presiding magistrate.",
                optionA = "disrespectful",
                optionB = "courteous",
                optionC = "timid",
                optionD = "humble",
                correctAnswerIndex = 0,
                explanation = "'Insolent' means showing a rude and arrogant lack of respect; 'disrespectful'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_48",
                subject = "English Language",
                topic = "Synonyms (Nearest in Meaning)",
                year = "2015",
                questionText = "Choose the word nearest in meaning: The detective found *cogent* evidence linking the suspect to the crime scene.",
                optionA = "convincing",
                optionB = "weak",
                optionC = "irrelevant",
                optionD = "inconclusive",
                correctAnswerIndex = 0,
                explanation = "'Cogent' means clear, logical, and convincing.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_49",
                subject = "English Language",
                topic = "Synonyms (Nearest in Meaning)",
                year = "2015",
                questionText = "Choose the word nearest in meaning: She approached the delicate negotiation with great *circumspection*.",
                optionA = "prudence and caution",
                optionB = "recklessness",
                optionC = "indifference",
                optionD = "haste",
                correctAnswerIndex = 0,
                explanation = "'Circumspection' means the quality of being wary and unwilling to take risks; 'prudence'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_50",
                subject = "English Language",
                topic = "Synonyms (Nearest in Meaning)",
                year = "2015",
                questionText = "Choose the word nearest in meaning: The diplomat's *cordial* manner helped diffuse rising border tensions.",
                optionA = "warm and friendly",
                optionB = "hostile",
                optionC = "aloof",
                optionD = "cold",
                correctAnswerIndex = 0,
                explanation = "'Cordial' means warm and friendly.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q50"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_51",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "Neither the principal nor the teachers ________ present at the emergency PTA meeting yesterday.",
                optionA = "were",
                optionB = "was",
                optionC = "are",
                optionD = "is",
                correctAnswerIndex = 0,
                explanation = "Under the rule of proximity with 'neither... nor', the verb agrees with the nearer subject ('teachers' = plural 'were').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q51"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_52",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "The suspect ________ guilty to all five counts of felony before the High Court.",
                optionA = "pleaded",
                optionB = "pledged",
                optionC = "plaid",
                optionD = "plead",
                correctAnswerIndex = 0,
                explanation = "In standard formal legal English, the past tense of plead is 'pleaded'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q52"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_53",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "Hardly had the referee blown the final whistle ________ the jubilant spectators invaded the pitch.",
                optionA = "when",
                optionB = "than",
                optionC = "then",
                optionD = "after",
                correctAnswerIndex = 0,
                explanation = "'Hardly had...' requires the correlative conjunction 'when', whereas 'No sooner had...' takes 'than'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q53"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_54",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "One of the boys who ________ selected for the national science olympiad has traveled abroad.",
                optionA = "was",
                optionB = "were",
                optionC = "is",
                optionD = "are",
                correctAnswerIndex = 1,
                explanation = "In the relative clause 'who were selected', the antecedent is the plural noun 'boys', so the verb must be plural ('were').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q54"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_55",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "The committee has submitted ________ final recommendations to the governing council.",
                optionA = "its",
                optionB = "their",
                optionC = "it's",
                optionD = "there",
                correctAnswerIndex = 0,
                explanation = "A collective noun acting as a single unified entity takes the singular possessive pronoun 'its'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q55"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_56",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "The university administration had no alternative ________ to rusticate the unruly students.",
                optionA = "than",
                optionB = "but",
                optionC = "besides",
                optionD = "except",
                correctAnswerIndex = 1,
                explanation = "The established idiomatic collocation is 'have no alternative/choice but to...'",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q56"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_57",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "The police commissioner congratulated the officer ________ his gallantry during the bank robbery.",
                optionA = "on",
                optionB = "for",
                optionC = "in",
                optionD = "about",
                correctAnswerIndex = 0,
                explanation = "The verb 'congratulate' takes the preposition 'on' (congratulate someone on something).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q57"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_58",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "The manager insisted ________ seeing the original receipts before approving the refund.",
                optionA = "on",
                optionB = "in",
                optionC = "at",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The verb 'insist' is standardly followed by the preposition 'on' or 'upon'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q58"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_59",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "You had better ________ your assignment before the teacher arrives.",
                optionA = "submit",
                optionB = "submitted",
                optionC = "to submit",
                optionD = "submitting",
                correctAnswerIndex = 0,
                explanation = "The modal phrase 'had better' is followed by the bare infinitive ('submit').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q59"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_60",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "The old printing press has been ________ by digital computer-to-plate technology.",
                optionA = "superseded",
                optionB = "superceded",
                optionC = "superceeded",
                optionD = "supersceded",
                correctAnswerIndex = 0,
                explanation = "'Superseded' (spelled with an 's', from Latin supersedere) is the correct standard spelling.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q60"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_61",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "If I ________ you, I would accept the international scholarship without hesitation.",
                optionA = "were",
                optionB = "was",
                optionC = "am",
                optionD = "be",
                correctAnswerIndex = 0,
                explanation = "Subjunctive mood expressing a hypothetical condition contrary to fact requires 'were' for all persons.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q61"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_62",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "The lecturer asked the students to ________ down the salient points of the discourse.",
                optionA = "jot",
                optionB = "take",
                optionC = "write",
                optionD = "note",
                correctAnswerIndex = 0,
                explanation = "'Jot down' is the idiomatic phrasal verb meaning to write down quickly or briefly.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q62"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_63",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "By this time next year, my elder sister ________ from the medical school.",
                optionA = "will have graduated",
                optionB = "will graduate",
                optionC = "has graduated",
                optionD = "graduates",
                correctAnswerIndex = 0,
                explanation = "An action that will be completed prior to a designated future time requires the Future Perfect tense ('will have graduated').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q63"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_64",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "The criminal syndicate was accused of ________ with corrupt customs officials.",
                optionA = "colluding",
                optionB = "colliding",
                optionC = "alluding",
                optionD = "eluding",
                correctAnswerIndex = 0,
                explanation = "'Collude' means to cooperate secretly or dishonestly in order to deceive others.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q64"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_65",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2015",
                questionText = "The government must not turn a deaf ear ________ the legitimate cries of the vulnerable citizens.",
                optionA = "to",
                optionB = "at",
                optionC = "for",
                optionD = "on",
                correctAnswerIndex = 0,
                explanation = "The idiom is 'turn a deaf ear to' someone or something.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q65"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_66",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Choose the word that has the same vowel sound as the one represented by the underlined letter(s): b*ee*k",
                optionA = "leak",
                optionB = "lick",
                optionC = "lake",
                optionD = "lack",
                correctAnswerIndex = 0,
                explanation = "'Beek' features the long front vowel /iː/, identical to 'leak' /liːk/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q66"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_67",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Choose the word that has the same vowel sound as the one in: p*o*t",
                optionA = "cot",
                optionB = "court",
                optionC = "coat",
                optionD = "cut",
                correctAnswerIndex = 0,
                explanation = "'Pot' features the short open back rounded vowel /ɒ/, as in 'cot' /kɒt/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q67"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_68",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Choose the word that contains the diphthong /aɪ/ as in: h*i*gh",
                optionA = "buy",
                optionB = "boy",
                optionC = "bay",
                optionD = "bow",
                correctAnswerIndex = 0,
                explanation = "'High' /haɪ/ and 'buy' /baɪ/ share the identical closing diphthong /aɪ/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q68"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_69",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Choose the word that has the same vowel sound as the underlined letters: c*ou*rt",
                optionA = "caught",
                optionB = "cart",
                optionC = "cut",
                optionD = "curt",
                correctAnswerIndex = 0,
                explanation = "'Court' and 'caught' both feature the long open-mid back rounded vowel /ɔː/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q69"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_70",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Choose the word that contains the short vowel /ʌ/ as in: b*u*s",
                optionA = "blood",
                optionB = "rude",
                optionC = "pull",
                optionD = "pool",
                correctAnswerIndex = 0,
                explanation = "'Bus' /bʌs/ and 'blood' /blʌd/ contain the short open-mid back unrounded vowel /ʌ/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q70"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_71",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Choose the word that has the same consonant sound as the underlined letter: *ph*oto",
                optionA = "tough",
                optionB = "though",
                optionC = "dough",
                optionD = "bough",
                correctAnswerIndex = 0,
                explanation = "The 'ph' in 'photo' produces the voiceless labiodental fricative /f/, identical to the 'gh' in 'tough' /tʌf/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q71"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_72",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "In which of the following words is the letter 'p' silent?",
                optionA = "psychology",
                optionB = "panther",
                optionC = "copper",
                optionD = "leopard",
                correctAnswerIndex = 0,
                explanation = "The initial 'p' before 's' in Greek loanwords like 'psychology' /saɪˈkɒlədʒi/ is silent.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q72"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_73",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Choose the word that contains the voiced dental fricative /ð/ as in: *th*is",
                optionA = "father",
                optionB = "faith",
                optionC = "theatre",
                optionD = "thought",
                correctAnswerIndex = 0,
                explanation = "'Father' contains the voiced dental fricative /ð/, unlike the voiceless /θ/ in faith, theatre, and thought.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q73"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_74",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "In which of the following words is the letter 'b' silent?",
                optionA = "subtle",
                optionB = "rubber",
                optionC = "table",
                optionD = "banner",
                correctAnswerIndex = 0,
                explanation = "In 'subtle' /ˈsʌt.əl/, the letter 'b' is completely silent.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q74"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_75",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Choose the word that has the same consonant sound as the underlined letter: *ch*ef",
                optionA = "machine",
                optionB = "church",
                optionC = "chemistry",
                optionD = "champion",
                correctAnswerIndex = 0,
                explanation = "In 'chef' and 'machine', the 'ch' represents the voiceless postalveolar fricative /ʃ/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q75"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_76",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Identify the syllable that carries primary stress in the word: PHO-TOG-RA-PHY",
                optionA = "pho-TOG-ra-phy (2nd syllable)",
                optionB = "PHO-to-gra-phy (1st syllable)",
                optionC = "pho-to-GRAPH-y (3rd syllable)",
                optionD = "pho-to-gra-PHY (4th syllable)",
                correctAnswerIndex = 0,
                explanation = "Words ending in -graphy have their primary accent on the antepenultimate syllable: pho-TOG-ra-phy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q76"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_77",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Identify the syllable that carries primary stress in the noun: EX-PORT",
                optionA = "EX-port (1st syllable)",
                optionB = "ex-PORT (2nd syllable)",
                optionC = "equal stress on both",
                optionD = "no stress",
                correctAnswerIndex = 0,
                explanation = "Two-syllable nouns typically take primary stress on the first syllable (EX-port), whereas the verb is stressed on the second (ex-PORT).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q77"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_78",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Identify the syllable that carries primary stress in the word: DE-MOC-RA-CY",
                optionA = "de-MOC-ra-cy (2nd syllable)",
                optionB = "DE-moc-ra-cy (1st syllable)",
                optionC = "de-moc-RA-cy (3rd syllable)",
                optionD = "de-moc-ra-CY (4th syllable)",
                correctAnswerIndex = 0,
                explanation = "Nouns ending in -cracy take primary lexical stress on the antepenultimate syllable: de-MOC-ra-cy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q78"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_79",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Which of the following questions is answered by the statement with emphatic stress: 'Kemi bought a NEW car yesterday'?",
                optionA = "Did Kemi buy an old car yesterday?",
                optionB = "Did John buy a new car yesterday?",
                optionC = "Did Kemi sell a new car yesterday?",
                optionD = "Did Kemi buy a new motorcycle yesterday?",
                correctAnswerIndex = 0,
                explanation = "Emphatic stress on 'NEW' highlights that the car was new, contrasting with an old or used car.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q79"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_cbt_80",
                subject = "English Language",
                topic = "Oral English (Phonetics & Stress)",
                year = "2015",
                questionText = "Which of the following questions is answered by the statement with emphatic stress: 'THE PRESIDENT addressed the nation on Monday'?",
                optionA = "Who addressed the nation on Monday?",
                optionB = "Did the president address parliament on Monday?",
                optionC = "When did the president address the nation?",
                optionD = "Did the president broadcast on radio on Monday?",
                correctAnswerIndex = 0,
                explanation = "Emphatic stress on 'THE PRESIDENT' answers 'Who' addressed the nation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB English 2015 CBT • Q80"
            )
        )
        return list
    }
}
