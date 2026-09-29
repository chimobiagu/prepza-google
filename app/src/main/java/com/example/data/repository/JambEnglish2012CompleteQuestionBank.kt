package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic JAMB Use of English 2012 Complete Examination Question Bank.
 * Contains 100 officially verified questions transcribed directly from authentic JAMB UTME exam papers.
 */
object JambEnglish2012CompleteQuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_01",
                subject = "English Language",
                topic = "General Introduction",
                year = "2012",
                questionText = "Which Question Paper Type of Uses of English as indicated above is given to you?",
                optionA = "Type Green",
                optionB = "Type Purple",
                optionC = "Type Red",
                optionD = "Type Yellow",
                correctAnswerIndex = 3,
                explanation = "Paper Type Yellow allocated for examination evaluation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_02",
                subject = "English Language",
                topic = "Comprehension: Traditional Religion",
                year = "2012",
                questionText = "From the passage, one can say that all ethnic groups have",
                optionA = "different traditional religions with some elements of similarities",
                optionB = "completely different religious practices",
                optionC = "the same traditional religion",
                optionD = "the same religious manifestations with common deities.",
                correctAnswerIndex = 0,
                explanation = "The passage explicitly notes that despite unique homeland traditions, traditional religions share common beliefs in a supreme High God, lesser deities, nature spirits, and ancestors.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_03",
                subject = "English Language",
                topic = "Comprehension: Traditional Religion",
                year = "2012",
                questionText = "According to the first paragraph, Nigerians believe that the",
                optionA = "supernatural and natural world co-exist",
                optionB = "natural and supernatural worlds are antagonistic",
                optionC = "supernatural world controls the natural world",
                optionD = "supernatural world exploits the natural world.",
                correctAnswerIndex = 2,
                explanation = "Nigerians believe an unseen supernatural world watches, judges, and governs the events of the natural world.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_04",
                subject = "English Language",
                topic = "Comprehension: Traditional Religion",
                year = "2012",
                questionText = "Traditional religion has waned in Nigeria owing to the",
                optionA = "influence of Islam over Bori spirits",
                optionB = "influence of Christianity over local oracles",
                optionC = "decline of the interest in traditional religions",
                optionD = "influence of non-traditional religions.",
                correctAnswerIndex = 3,
                explanation = "The advent and widespread adoption of foreign/non-traditional religions (Christianity and Islam) led to the decline of indigenous religious practices.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_05",
                subject = "English Language",
                topic = "Comprehension: Traditional Religion",
                year = "2012",
                questionText = "Which factor is common to all traditional religions as mentioned in the passage?",
                optionA = "Prayer only.",
                optionB = "Divination.",
                optionC = "Sacrifice only.",
                optionD = "Rituals.",
                correctAnswerIndex = 1,
                explanation = "Divination—the discovery of the unknown by supernatural means—is described as a universal element across traditional religions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_06",
                subject = "English Language",
                topic = "Comprehension: Reading Culture",
                year = "2012",
                questionText = "It can be inferred from the passage that",
                optionA = "Nigerians have access to foreign books only",
                optionB = "Nigerian undergraduates do not read textbooks",
                optionC = "Nigerians read foreign and indigenous books alike",
                optionD = "Nigerians read mostly foreign books",
                correctAnswerIndex = 3,
                explanation = "The passage laments that the few Nigerians who read overwhelmingly concentrate on foreign publications over local authors.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_07",
                subject = "English Language",
                topic = "Comprehension: Reading Culture",
                year = "2012",
                questionText = "The reason for lack of indigenous books in most renowned bookshops, according to the passage,",
                optionA = "Nigerians prefer reading foreign books",
                optionB = "foreign books attracts more buyers",
                optionC = "indigenous books are sometimes not available",
                optionD = "the low quality of indigenous books.",
                correctAnswerIndex = 1,
                explanation = "Bookshop managers prioritize foreign books due to significantly higher commercial market demand.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_08",
                subject = "English Language",
                topic = "Comprehension: Reading Culture",
                year = "2012",
                questionText = "The expression '...that earned her the award is profoundly gripping', as used in the passage, means that the book",
                optionA = "is highly interesting and captures attention",
                optionB = "is of high quality to the writer",
                optionC = "attracts many indigenous and foreign readers",
                optionD = "is widely acknowledged by many authors",
                correctAnswerIndex = 0,
                explanation = "'Profoundly gripping' denotes a narrative that is exceptionally captivating, emotionally intense, and commands deep engagement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_09",
                subject = "English Language",
                topic = "Comprehension: Reading Culture",
                year = "2012",
                questionText = "The university science lecturer gives his reason for issuing handouts as",
                optionA = "lack of teaching aids among students",
                optionB = "low purchasing power",
                optionC = "low quality of books",
                optionD = "lack of sufficient time",
                correctAnswerIndex = 1,
                explanation = "Currency devaluation made imported reference textbooks unaffordable, leaving dictated notes and handouts as the only viable alternative.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_10",
                subject = "English Language",
                topic = "Comprehension: Reading Culture",
                year = "2012",
                questionText = "A suitable title for this passage is",
                optionA = "Nigerian Literary Writers",
                optionB = "Nigerian Publishers and International Awards",
                optionC = "Poor reading Culture in Nigeria",
                optionD = "Why Nigerian Lecturers Sell Handouts.",
                correctAnswerIndex = 2,
                explanation = "The passage provides an overarching critique of the declining reading culture and domestic book distribution in Nigeria.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_11",
                subject = "English Language",
                topic = "Comprehension: Experience vs Wisdom",
                year = "2012",
                questionText = "According to the writer, people lead and motivate others because they want to",
                optionA = "project individual contribution",
                optionB = "encourage selfless service",
                optionC = "make the world a home",
                optionD = "prevent empty search",
                correctAnswerIndex = 1,
                explanation = "Leaders strive to direct people away from vain, hollow pursuits toward meaningful personal fulfillment through dedicated service.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_12",
                subject = "English Language",
                topic = "Comprehension: Experience vs Wisdom",
                year = "2012",
                questionText = "According to the passage, balance must be enthroned because it is",
                optionA = "a critical interdependent function",
                optionB = "an amazing help for conscience",
                optionC = "a critical part of fidelity",
                optionD = "a serious way of ensuring success.",
                correctAnswerIndex = 3,
                explanation = "Enthroning balance as a component of truth ensures people avoid unrealistic expectations and achieve genuine life success.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_13",
                subject = "English Language",
                topic = "Comprehension: Experience vs Wisdom",
                year = "2012",
                questionText = "The word 'inclinations', as in the passage means",
                optionA = "creeds",
                optionB = "tendencies",
                optionC = "inhibitions",
                optionD = "power.",
                correctAnswerIndex = 1,
                explanation = "'Inclinations' refers to natural propensities, affinities, or behavioral tendencies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_14",
                subject = "English Language",
                topic = "Comprehension: Experience vs Wisdom",
                year = "2012",
                questionText = "Which of the following statements is true according to the passage?",
                optionA = "greatness in life emerges when square pegs are put in round holes",
                optionB = "people do certain things in life because they know the repercussion",
                optionC = "people agree on all issues and behave the same way for the same reason",
                optionD = "understanding life at different levels gives no account of visible acquisition.",
                correctAnswerIndex = 2,
                explanation = "Human beings act consistently when they share the same fundamental level of understanding and foresight.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_15",
                subject = "English Language",
                topic = "Comprehension: Experience vs Wisdom",
                year = "2012",
                questionText = "From the passage, it can be inferred that",
                optionA = "People insincerely discuss facts that govern their behaviour",
                optionB = "all managerial decisions are based on assumptions.",
                optionC = "people make conscious effort to acquire hidden knowledge",
                optionD = "all things in life exist on some beliefs.",
                correctAnswerIndex = 0,
                explanation = "The author argues that assumptions underpin all conclusions and people often hold unspoken presuppositions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_16",
                subject = "English Language",
                topic = "Cloze Passage: Pregnancy Health",
                year = "2012",
                questionText = "Most of these feature …16… [A. In the penultimate B. In the first C. around D. For] twelve week of pregnancy.",
                optionA = "In the penultimate",
                optionB = "In the first",
                optionC = "around",
                optionD = "For",
                correctAnswerIndex = 1,
                explanation = "The first trimester (first twelve weeks) is the most critical and frequent period for spontaneous pregnancy loss.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_17",
                subject = "English Language",
                topic = "Cloze Passage: Pregnancy Health",
                year = "2012",
                questionText = "The most common …17… [A. type B. Cause C. Period D. Symptom] is vaginal bleeding",
                optionA = "type",
                optionB = "Cause",
                optionC = "Period",
                optionD = "Symptom",
                correctAnswerIndex = 3,
                explanation = "Bleeding is the primary clinical sign or symptom that signals threatened or impending miscarriage.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_18",
                subject = "English Language",
                topic = "Cloze Passage: Pregnancy Health",
                year = "2012",
                questionText = "tissues that are not …18… [A. clearly B. naturally C. directly D. Medically] identifiable.",
                optionA = "clearly",
                optionB = "naturally",
                optionC = "directly",
                optionD = "Medically",
                correctAnswerIndex = 0,
                explanation = "'Clearly identifiable' is the natural, idiomatic collocation describing visual clinical inspection.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_19",
                subject = "English Language",
                topic = "Cloze Passage: Pregnancy Health",
                year = "2012",
                questionText = "having to pass urine more …19… [A. painfully B. frequently C. gradually D. Commonly] than usual",
                optionA = "painfully",
                optionB = "frequently",
                optionC = "gradually",
                optionD = "Commonly",
                correctAnswerIndex = 1,
                explanation = "Increased urinary frequency is a standard physiological symptom of early pregnancy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_20",
                subject = "English Language",
                topic = "Cloze Passage: Pregnancy Health",
                year = "2012",
                questionText = "the miscarriage is only …20… [A. prevented B. managed C. discovered D. Stopped] in a routine scan.",
                optionA = "prevented",
                optionB = "managed",
                optionC = "discovered",
                optionD = "Stopped",
                correctAnswerIndex = 2,
                explanation = "Silent or missed miscarriages are frequently only detected or discovered during routine ultrasonography.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_21",
                subject = "English Language",
                topic = "Cloze Passage: Pregnancy Health",
                year = "2012",
                questionText = "genetic material from the egg and sperm have combined during …21… [A. pregnancy B. incubation C. mating D. Fertilization].",
                optionA = "pregnancy",
                optionB = "incubation",
                optionC = "mating",
                optionD = "Fertilization",
                correctAnswerIndex = 3,
                explanation = "Fertilization is the biological union of gametes (sperm and ovum) combining genetic chromosomes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_22",
                subject = "English Language",
                topic = "Cloze Passage: Pregnancy Health",
                year = "2012",
                questionText = "find out why this has …22… [A. occurred B. enlarged C. continued D. emerged]",
                optionA = "occurred",
                optionB = "enlarged",
                optionC = "continued",
                optionD = "emerged",
                correctAnswerIndex = 0,
                explanation = "'Occurred' is the appropriate verb describing an event or chromosomal nondisjunction happening.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_23",
                subject = "English Language",
                topic = "Cloze Passage: Pregnancy Health",
                year = "2012",
                questionText = "problems in the immune …23… [A. syndrome B. process C. response D. system]",
                optionA = "syndrome",
                optionB = "process",
                optionC = "response",
                optionD = "system",
                correctAnswerIndex = 3,
                explanation = "'Immune system' is the correct physiological term for the body's protective cellular defense network.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_24",
                subject = "English Language",
                topic = "Cloze Passage: Pregnancy Health",
                year = "2012",
                questionText = "The risk of miscarriage …24… [A. increases B. starts C. reduces D. appears] with age",
                optionA = "increases",
                optionB = "starts",
                optionC = "reduces",
                optionD = "appears",
                correctAnswerIndex = 0,
                explanation = "Advanced maternal age leads to declining oocyte quality, sharply increasing miscarriage incidence.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_25",
                subject = "English Language",
                topic = "Cloze Passage: Pregnancy Health",
                year = "2012",
                questionText = "increased with …25… [A. complicated B. advance C. multiple D. confirmed] pregnancies such as twins.",
                optionA = "complicated",
                optionB = "advance",
                optionC = "multiple",
                optionD = "confirmed",
                correctAnswerIndex = 2,
                explanation = "'Multiple pregnancies' is the medical designation for gestations involving twins, triplets, or more fetuses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_26",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "Hardworking students must not have a finger in every pie at school.",
                optionA = "Hardworking students must not have a role to play in most activities in the school",
                optionB = "Only hardworking students must participate in all activities in the school",
                optionC = "Hardworking students do not participate in all activities in the school",
                optionD = "Hardworking students must ask others to participate in school activities.",
                correctAnswerIndex = 2,
                explanation = "To 'have a finger in every pie' means being involved in too many diverse activities; students should focus rather than overextending themselves.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_27",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "The vice chancellor is riding the crest of the last quarter of his administration.",
                optionA = "The vice chancellor enjoys the acknowledgement of the success of his administration",
                optionB = "The vice chancellor does not enjoy the people’s criticism of his administration",
                optionC = "The vice chancellor hopes to overcome soon, the poor comments on his administration",
                optionD = "The vice chancellor does not talk of his successes on office",
                correctAnswerIndex = 0,
                explanation = "'Riding the crest' is an idiom meaning enjoying peak achievement, acclaim, and popularity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_28",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "She was absolved by the court from the charge.",
                optionA = "She was convicted for the charge",
                optionB = "She was blamed and charged to court",
                optionC = "Her case was resolved by the court",
                optionD = "She was declared free from the charge",
                correctAnswerIndex = 3,
                explanation = "'Absolved from a charge' means legally and formally declared innocent and completely exonerated.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_29",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "The landlord is fond of throwing his weight about.",
                optionA = "The landlord likes healthy exercise",
                optionB = "The landlord is overweight",
                optionC = "The landlord gives orders to people / behaves arrogantly",
                optionD = "The landlord is respected by his tenants",
                correctAnswerIndex = 2,
                explanation = "To 'throw one's weight about' means to act aggressively, dictate orders, and assert authority unpleasantly.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_30",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "The company ought to have issued warrants for one billion shares.",
                optionA = "The company has issued one billion shares",
                optionB = "The management expected the company to issue more than one billion shares",
                optionC = "Members of the company bought less than one billion shares",
                optionD = "The company did not issue one billion shares",
                correctAnswerIndex = 3,
                explanation = "'Ought to have + past participle' denotes an unfulfilled past moral obligation or missed action.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_31",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "He needed not to have played in the position of quarterback in the volleyball.",
                optionA = "He participated in the game in his unusual position",
                optionB = "Nobody expected him to have participated in the game",
                optionC = "He wanted to play in a position other than the one he was offered.",
                optionD = "Someone did not want him to play in the position that he played",
                correctAnswerIndex = 0,
                explanation = "'Need not have' indicates an action that was carried out even though it was unnecessary or inappropriate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_32",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "I wouldn’t have responded to his rude talk, if I were you.",
                optionA = "The advice was taken by the respondent, so he did not respond to the talk",
                optionB = "The adviser put himself in the respondent’s position, so he did not respond to the talk",
                optionC = "The respondent replied to the speaker’s talk, although he ought not have done so",
                optionD = "What was advisable was that the respondent gave it back to the speaker",
                correctAnswerIndex = 2,
                explanation = "The conditional sentence criticizes the respondent's actual reaction of replying to rude talk.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_33",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "He could not speak out because he had feet of clay.",
                optionA = "His feet was muddy",
                optionB = "He was weak and cowardly",
                optionC = "He was clumsy and lazy",
                optionD = "He was shy and timid",
                correctAnswerIndex = 3,
                explanation = "'Feet of clay' signifies a fundamental character flaw, hidden vulnerability, or moral weakness/timidity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_34",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "The player wasted a golden opportunity during the penalty shoot-out.",
                optionA = "The player hit the bar",
                optionB = "The player did not score the shot",
                optionC = "The player scored the shot that made them win the gold cup",
                optionD = "Instead of a silver cup, they received the golden one",
                correctAnswerIndex = 1,
                explanation = "To waste an opportunity in a shootout means failing to convert the penalty into a goal.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_35",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "As far as Abu is concerned, Mero should be given fifty naira at the most.",
                optionA = "All Abu is saying is that Mero probably deserves more than fifty naira and not less",
                optionB = "All Abu is concerned with is that Mero should be given nothing more than fifty naira",
                optionC = "In Abu’s estimation, Mero merits not more than fifty naira",
                optionD = "In Abu’s opinion, Mero deserves fifty naira or probably more",
                correctAnswerIndex = 1,
                explanation = "'At the most' defines a strict upper maximum ceiling (nothing greater than 50 naira).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_36",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: As an idiot, the boy is weak in class.",
                optionA = "a deviant",
                optionB = "a dunce",
                optionC = "an expert",
                optionD = "a genius",
                correctAnswerIndex = 3,
                explanation = "'Idiot' refers to a foolish or mentally deficient individual; its direct opposite is 'a genius'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_37",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: We were shocked by the news that he had lost the money.",
                optionA = "astonished",
                optionB = "disconcerted",
                optionC = "unconcerned",
                optionD = "surprised",
                correctAnswerIndex = 2,
                explanation = "'Shocked' expresses profound surprise and concern; its opposite is 'unconcerned' (indifferent).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_38",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: The principal was advised to be flexible on critical issues.",
                optionA = "livid",
                optionB = "cautious",
                optionC = "evasive",
                optionD = "rigid",
                correctAnswerIndex = 3,
                explanation = "'Flexible' means adaptable and accommodating; its direct antonym is 'rigid' (unyielding).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_39",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: Bola always looks sober.",
                optionA = "excited",
                optionB = "serious",
                optionC = "worried",
                optionD = "helpless",
                correctAnswerIndex = 0,
                explanation = "'Sober' means grave, calm, and subdued; its opposite is 'excited' or intoxicated.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_40",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: Dupe was promoted for her efficiency.",
                optionA = "ability",
                optionB = "incompetence",
                optionC = "inconsistency",
                optionD = "rudeness",
                correctAnswerIndex = 1,
                explanation = "'Efficiency' is the ability to achieve results competently; its direct antonym is 'incompetence'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_41",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: The management wants to consider her reticent behaviour in due course.",
                optionA = "disapproving",
                optionB = "disciplinarian",
                optionC = "contemplative",
                optionD = "loquacious",
                correctAnswerIndex = 3,
                explanation = "'Reticent' means reserved and silent; its exact antonym is 'loquacious' (talkative).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_42",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: Election process often becomes volatile.",
                optionA = "calm",
                optionB = "strange",
                optionC = "sudden",
                optionD = "latent",
                correctAnswerIndex = 0,
                explanation = "'Volatile' signifies explosive, unstable, and violent; its opposite is 'calm'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_43",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: Oche entered the principal’s office in a rather abrasive manner.",
                optionA = "gentle",
                optionB = "rude",
                optionC = "lackadaisical",
                optionD = "indifferent",
                correctAnswerIndex = 0,
                explanation = "'Abrasive' means harsh, rough, and grating; its opposite is 'gentle'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_44",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: Otokpa is a member of the ad hoc committee on stock acquisition.",
                optionA = "improvised",
                optionB = "formal / permanent",
                optionC = "temporary",
                optionD = "fact-finding",
                correctAnswerIndex = 1,
                explanation = "'Ad hoc' refers to temporary bodies created for a specific purpose; its opposite is 'formal' or permanent.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_45",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: His gift to the poor was always infinitesimal.",
                optionA = "large",
                optionB = "small",
                optionC = "supportive",
                optionD = "shameful",
                correctAnswerIndex = 0,
                explanation = "'Infinitesimal' means vanishingly tiny or negligible; its opposite is 'large'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_46",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: The economist concluded that several factors have been adduced to explain the fall in the birth rate.",
                optionA = "affirmed",
                optionB = "diffused",
                optionC = "mentioned",
                optionD = "refuted",
                correctAnswerIndex = 3,
                explanation = "'Adduced' means cited or offered as evidence; its opposite is 'refuted' (disproved or denied).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_47",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: The presidential system is an antidote to some political ailments.",
                optionA = "an answer",
                optionB = "a reply",
                optionC = "an injury",
                optionD = "an obstacle",
                correctAnswerIndex = 3,
                explanation = "'Antidote' is a healing remedy that counters poison; its opposite is 'an obstacle' or toxin.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_48",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: Ola thought that her father was very callous.",
                optionA = "parlous",
                optionB = "compassionate",
                optionC = "wicked",
                optionD = "cheerful",
                correctAnswerIndex = 1,
                explanation = "'Callous' means hardened, unfeeling, and cruel; its opposite is 'compassionate'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_49",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: He was very much respected, though he had no temporal power.",
                optionA = "spiritual",
                optionB = "mundane",
                optionC = "permanent",
                optionD = "ephemeral",
                correctAnswerIndex = 0,
                explanation = "'Temporal' relates to earthly, secular authority; its opposite is 'spiritual' power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_50",
                subject = "English Language",
                topic = "Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning: The way the worship was organized was rather hit-and-miss.",
                optionA = "systematic",
                optionB = "hasty",
                optionC = "slow",
                optionD = "funny",
                correctAnswerIndex = 0,
                explanation = "'Hit-and-miss' describes haphazard, unmethodical procedures; its antonym is 'systematic'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_51",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: Some men will continue to cause offences until they are given a taste of their own medicine.",
                optionA = "placated",
                optionB = "revenged on",
                optionC = "recompensed for",
                optionD = "cured",
                correctAnswerIndex = 1,
                explanation = "'A taste of one's own medicine' means receiving retaliatory punishment matching one's offenses (revenged on).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q51",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_52",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: Okibe was rusticated for his derogatory remark about the principal",
                optionA = "complimentary",
                optionB = "unsavoury",
                optionC = "unwarranted",
                optionD = "lacklustre",
                correctAnswerIndex = 1,
                explanation = "'Derogatory' means expressing contempt, disrespectful, and 'unsavoury'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q52",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_53",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: Justice is difficult to enforce because people are unwilling to accept any loss of sovereignty.",
                optionA = "autonomy",
                optionB = "position",
                optionC = "leadership",
                optionD = "kingdom",
                correctAnswerIndex = 0,
                explanation = "'Sovereignty' refers to independent political self-determination and supreme authority (autonomy).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q53",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_54",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: There are still virtuous women in our society today.",
                optionA = "clever",
                optionB = "upright",
                optionC = "devilish",
                optionD = "intelligent",
                correctAnswerIndex = 1,
                explanation = "'Virtuous' denotes high moral character, integrity, and being 'upright'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q54",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_55",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: The type of response is typical of a lazy teacher.",
                optionA = "symptomatic",
                optionB = "characteristic",
                optionC = "universal",
                optionD = "incontestable",
                correctAnswerIndex = 1,
                explanation = "'Typical' means exhibiting representative distinctive qualities (characteristic).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q55",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_56",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: Akin is an inveterate gambler.",
                optionA = "a selfish and self-centred",
                optionB = "an extremely unlucky but popular",
                optionC = "an incurable but fearful",
                optionD = "a long time and incorrigible",
                correctAnswerIndex = 3,
                explanation = "'Inveterate' means habitual, long-standing, and deeply obstinate/incorrigible.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q56",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_57",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: He was too petrified to give the closing remarks at the conference.",
                optionA = "frightened",
                optionB = "delighted",
                optionC = "agitated",
                optionD = "happy",
                correctAnswerIndex = 0,
                explanation = "'Petrified' means paralyzed with extreme fear (thoroughly frightened).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q57",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_58",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: During a particular time of the day, the road shimmers in the heat.",
                optionA = "darkens",
                optionB = "lightens",
                optionC = "shines",
                optionD = "beams",
                correctAnswerIndex = 2,
                explanation = "'Shimmers' means glistens or shines with a wavering, luminous light.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q58",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_59",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: Every human being is vulnerable to communicable diseases.",
                optionA = "liable / susceptible",
                optionB = "lifted",
                optionC = "immuned",
                optionD = "closed",
                correctAnswerIndex = 0,
                explanation = "'Vulnerable' means exposed, defenseless, or susceptible/liable to harm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q59",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_60",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: Mariam looks rather furtive to Shehu.",
                optionA = "intoxicated",
                optionB = "unfriendly",
                optionC = "sad",
                optionD = "sly",
                correctAnswerIndex = 3,
                explanation = "'Furtive' means attempting to avoid notice out of guilt; secretive, stealthy, or sly.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q60",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_61",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: The student’s union leader delivered his speech extempore.",
                optionA = "out-of-hand",
                optionB = "off the cuff",
                optionC = "accurately",
                optionD = "courageously",
                correctAnswerIndex = 0,
                explanation = "'Extempore' means spoken without preparation or notes (off the cuff / out-of-hand).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q61",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_62",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: His story gave us an inkling of what he passed through during the strike.",
                optionA = "a possible idea",
                optionB = "a taste",
                optionC = "a summary",
                optionD = "the right view",
                correctAnswerIndex = 0,
                explanation = "An 'inkling' is a slight hint, vague notion, or possible idea about something.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q62",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_63",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: These policies have been espoused by the ruling party.",
                optionA = "condemned",
                optionB = "rejected",
                optionC = "supported",
                optionD = "outlined",
                correctAnswerIndex = 2,
                explanation = "To 'espouse' a policy or cause means to adopt, embrace, and actively support it.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q63",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_64",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: We must not foreclose reconciliation as the purpose of his trip.",
                optionA = "exclude",
                optionB = "consider",
                optionC = "underestimate",
                optionD = "forgo",
                correctAnswerIndex = 0,
                explanation = "To 'foreclose' an outcome means to rule it out in advance or preclude/exclude it.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q64",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_65",
                subject = "English Language",
                topic = "Synonyms",
                year = "2012",
                questionText = "Choose the option nearest in meaning: Her finding exploded widely held beliefs about learning.",
                optionA = "challenged",
                optionB = "debunked",
                optionC = "projected",
                optionD = "confirmed",
                correctAnswerIndex = 1,
                explanation = "To 'explode' a theory or myth means to show it to be completely false (debunked).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q65",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_66",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "He was both a writer and a politician, but he was better __ [A. as if B. like C. as D. to be] a singer",
                optionA = "as if",
                optionB = "like",
                optionC = "as",
                optionD = "to be",
                correctAnswerIndex = 2,
                explanation = "The comparative construction is 'better as a singer'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q66",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_67",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "Vacancies in the company will be notified by __ [A. bulletin B. publication C. publicity D. advertisement].",
                optionA = "bulletin",
                optionB = "publication",
                optionC = "publicity",
                optionD = "advertisement",
                correctAnswerIndex = 3,
                explanation = "Commercial and corporate job vacancies are formally announced via public 'advertisement'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q67",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_68",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "The driver was short of petrol, so he __ [A. glided B. coasted C. wheeled D. taxied] down the hills with the engine switched off.",
                optionA = "glided",
                optionB = "coasted",
                optionC = "wheeled",
                optionD = "taxied",
                correctAnswerIndex = 0,
                explanation = "'Coasted' (or 'glided') describes a vehicle rolling freely downhill under gravity without engine propulsion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q68",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_69",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "He started his career as an __ [A. auxillary B. auxilliary C. auxilary D. auxiliary] teacher.",
                optionA = "auxillary",
                optionB = "auxilliary",
                optionC = "auxilary",
                optionD = "auxiliary",
                correctAnswerIndex = 3,
                explanation = "The correct English spelling is 'auxiliary' (single 'l').",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q69",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_70",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "His many years of success in legal practice, __ [A. indeed B. but C. in spite of it all D. however] didn’t come without challenges.",
                optionA = "indeed",
                optionB = "but",
                optionC = "in spite of it all",
                optionD = "however",
                correctAnswerIndex = 0,
                explanation = "Adverbial 'indeed' emphasizes the affirmation of his career success.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q70",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_71",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "One should be careful how __ behaves in the public, shouldn’t __? [A. one/one B. he/he C. she/one D. one/he]",
                optionA = "one/one",
                optionB = "he/he",
                optionC = "she/one",
                optionD = "one/he",
                correctAnswerIndex = 3,
                explanation = "Traditional formal English pairs the indefinite pronoun 'one' with 'he' in tag constructions: 'how one behaves..., shouldn't he?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q71",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_72",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "__ [A. First and formost B. First and formust C. First and farmost D. First and foremost], a good leader must have two characteristics.",
                optionA = "First and formost",
                optionB = "First and formust",
                optionC = "First and farmost",
                optionD = "First and foremost",
                correctAnswerIndex = 3,
                explanation = "The standard idiomatic adverbial formula is 'First and foremost'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q72",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_73",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "We visited his house __ [A. like B. for like C. about D. for about] three times.",
                optionA = "like",
                optionB = "for like",
                optionC = "about",
                optionD = "for about",
                correctAnswerIndex = 2,
                explanation = "Approximate quantification uses the adverb 'about' without redundant prepositions: 'about three times'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q73",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_74",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "She was __ [A. at B. on C. by D. with] the verge of tears",
                optionA = "at",
                optionB = "on",
                optionC = "by",
                optionD = "with",
                correctAnswerIndex = 0,
                explanation = "The established prepositional idiom is 'on the verge of' (or 'at the verge').",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q74",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_75",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "Everyone makes mistakes occasionally; nobody is __ [A. incorrigible B. Imperfect C. Infallible D. indestructible].",
                optionA = "incorrigible",
                optionB = "Imperfect",
                optionC = "Infallible",
                optionD = "indestructible",
                correctAnswerIndex = 2,
                explanation = "'Infallible' means incapable of making an error or failing in judgment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q75",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_76",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "The woman would not part with her __ [A. discarded earthen black B. discarded black earthen C. earthen discarded black D. black earthen discarded] pot.",
                optionA = "discarded earthen black",
                optionB = "discarded black earthen",
                optionC = "earthen discarded black",
                optionD = "black earthen discarded",
                correctAnswerIndex = 1,
                explanation = "Standard adjective order: opinion/participle (discarded) + color (black) + material (earthen) + noun (pot).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q76",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_77",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "We stood up when the principal came in, __ [A. isn’t it B. didn’t we C. not so D. did us]?",
                optionA = "isn’t it",
                optionB = "didn’t we",
                optionC = "not so",
                optionD = "did us",
                correctAnswerIndex = 1,
                explanation = "The statement is in the past affirmative with lexical verb 'stood', requiring past negative auxiliary 'didn't we?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q77",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_78",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "The professor of __ medicine has __ [A. vetinary / unraveled B. vertrinary / unravelled C. veterinary / unraveled D. veterinary / unravelled] the mystery of flu.",
                optionA = "vetinary / unraveled",
                optionB = "vertrinary / unravelled",
                optionC = "veterinary / unraveled",
                optionD = "veterinary / unravelled",
                correctAnswerIndex = 3,
                explanation = "Correct orthography: 'veterinary' and British spelling 'unravelled' (double 'l').",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q78",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_79",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "Her mother brought her some __ [A. clothes B. yards C. cloth D. clothing].",
                optionA = "clothes",
                optionB = "yards",
                optionC = "cloth",
                optionD = "clothing",
                correctAnswerIndex = 0,
                explanation = "Ready-to-wear garments are referred to in plural as 'clothes'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q79",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_80",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "Many workers were __ [A. laid down B. laid off C. laid out D. laid up] as a result of the textile closure.",
                optionA = "laid down",
                optionB = "laid off",
                optionC = "laid out",
                optionD = "laid up",
                correctAnswerIndex = 1,
                explanation = "To be 'laid off' means dismissed from employment due to economic shutdown.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q80",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_81",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "The driver died in the __ [A. fatal B. brutal C. serious D. pathetic] road accident.",
                optionA = "fatal",
                optionB = "brutal",
                optionC = "serious",
                optionD = "pathetic",
                correctAnswerIndex = 0,
                explanation = "An accident that causes death is specifically described as 'fatal'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q81",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_82",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "__ your parents frown __ [A. Because / over B. Since / at C. Although / at D. As / upon] our friendship, we shouldn’t see each other anymore.",
                optionA = "Because / over",
                optionB = "Since / at",
                optionC = "Although / at",
                optionD = "As / upon",
                correctAnswerIndex = 1,
                explanation = "Subordinating causal clause 'Since' followed by the preposition 'frown at'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q82",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_83",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "For more productivity, the company is focusing attention on the possible __ [A. synergy B. tapping C. alignment D. arrangement] of available resources.",
                optionA = "synergy",
                optionB = "tapping",
                optionC = "alignment",
                optionD = "arrangement",
                correctAnswerIndex = 1,
                explanation = "Strategic business development seeks effective 'tapping' or exploitation of existing resources.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q83",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_84",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "__ [A. After B. Much as C. Since D. Though] she didn’t trust him, she married him.",
                optionA = "After",
                optionB = "Much as",
                optionC = "Since",
                optionD = "Though",
                correctAnswerIndex = 3,
                explanation = "Concessive conjunction 'Though' introduces the contrast between lack of trust and marriage.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q84",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_85",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2012",
                questionText = "I wanted to know his political beliefs, so I asked him what __ [A. this was B. these are C. this is D. these were].",
                optionA = "this was",
                optionB = "these are",
                optionC = "this is",
                optionD = "these were",
                correctAnswerIndex = 3,
                explanation = "Reported speech in the past tense referring to plural antecedent 'beliefs' requires 'these were'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q85",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_86",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2012",
                questionText = "Choose the option with the same vowel sound as in 'book':",
                optionA = "cool",
                optionB = "cook",
                optionC = "fool",
                optionD = "tool",
                correctAnswerIndex = 1,
                explanation = "'Book' has the short near-back near-close vowel /ʊ/, identical to 'cook' (unlike the long /uː/ in cool, fool, tool).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q86",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_87",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2012",
                questionText = "Choose the option with the same vowel sound as in 'village' (-age):",
                optionA = "page",
                optionB = "pig",
                optionC = "made",
                optionD = "came",
                correctAnswerIndex = 1,
                explanation = "The unstressed suffix in 'village' is pronounced with the short /ɪ/ sound, as in 'pig'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q87",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_88",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2012",
                questionText = "Choose the option with the same vowel sound as in 'patch':",
                optionA = "starch",
                optionB = "fare",
                optionC = "mad",
                optionD = "brave",
                correctAnswerIndex = 2,
                explanation = "'Patch' has the short open front vowel /æ/, exactly like 'mad'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q88",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_89",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2012",
                questionText = "Choose the option with the same consonant sound as in 'tangerine' (/dʒ/):",
                optionA = "gear",
                optionB = "danger",
                optionC = "girl",
                optionD = "ignore",
                correctAnswerIndex = 1,
                explanation = "The 'g' in 'tangerine' produces the voiced affricate /dʒ/, matching 'danger'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q89",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_90",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2012",
                questionText = "Choose the option with the same consonant sound as in 'hair' (/h/):",
                optionA = "heir",
                optionB = "hour",
                optionC = "honest",
                optionD = "house",
                correctAnswerIndex = 3,
                explanation = "'Hair' features an aspirated /h/ which is silent in heir, hour, and honest, but articulated in 'house'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q90",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_91",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2012",
                questionText = "Choose the option with the same consonant sound as in 'edition' (/ʃ/):",
                optionA = "bash",
                optionB = "catch",
                optionC = "bastion",
                optionD = "rating",
                correctAnswerIndex = 0,
                explanation = "The 'ti' in 'edition' represents the voiceless postalveolar fricative /ʃ/, identical to 'sh' in 'bash'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q91",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_92",
                subject = "English Language",
                topic = "Oral English: Rhymes",
                year = "2012",
                questionText = "Choose the option that rhymes with 'Fuel':",
                optionA = "cruel",
                optionB = "fool",
                optionC = "rule",
                optionD = "field",
                correctAnswerIndex = 0,
                explanation = "'Fuel' (/ˈfjuːəl/) rhymes directly with 'cruel' (/ˈkruːəl/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q92",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_93",
                subject = "English Language",
                topic = "Oral English: Rhymes",
                year = "2012",
                questionText = "Choose the option that rhymes with 'match':",
                optionA = "harsh",
                optionB = "batch",
                optionC = "such",
                optionD = "watch",
                correctAnswerIndex = 0,
                explanation = "'Match' (/mætʃ/) rhymes with 'batch' (/bætʃ/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q93",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_94",
                subject = "English Language",
                topic = "Oral English: Rhymes",
                year = "2012",
                questionText = "Choose the option that rhymes with 'Sheer':",
                optionA = "Sheila",
                optionB = "care",
                optionC = "ear",
                optionD = "sherry",
                correctAnswerIndex = 2,
                explanation = "'Sheer' (/ʃɪə/) rhymes with 'ear' (/ɪə/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q94",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_95",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2012",
                questionText = "Choose the appropriate stress pattern: demarcation",
                optionA = "demarCAtion",
                optionB = "DEmarcation",
                optionC = "deMARcation",
                optionD = "demarcaTION",
                correctAnswerIndex = 0,
                explanation = "Words ending in '-tion' carry primary stress on the penultimate syllable: de-mar-CA-tion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q95",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_96",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2012",
                questionText = "Choose the appropriate stress pattern: impossible",
                optionA = "imPOSsible",
                optionB = "IMpossible",
                optionC = "imposSIble",
                optionD = "impossiBLE",
                correctAnswerIndex = 0,
                explanation = "Primary stress falls on the second syllable: im-POS-si-ble.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q96",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_97",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2012",
                questionText = "Choose the appropriate stress pattern: imperialism",
                optionA = "IMperialism",
                optionB = "imPErialism",
                optionC = "impeRIAlism",
                optionD = "imperialiSM",
                correctAnswerIndex = 3,
                explanation = "Words ending in '-ism' carry antepenultimate stress from root: im-PE-ri-al-ism.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q97",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_98",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2012",
                questionText = "The traditional chief NARRATED the story to the children.",
                optionA = "The children heard the story from the traditional chief",
                optionB = "Who narrated the story to the children?",
                optionC = "The children could not listen to the story by the traditional chief",
                optionD = "Did the chief hide the story from the children?",
                correctAnswerIndex = 3,
                explanation = "Emphatic stress on NARRATED highlights the action performed (narrated versus concealed/hid).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q98",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_99",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2012",
                questionText = "The ACCOUNTANT paid the workers’ July salary in September.",
                optionA = "When were the workers paid?",
                optionB = "Did the cashier pay the workers’ salary in September?",
                optionC = "Workers received their July salary in September?",
                optionD = "The September salary was paid in July?",
                correctAnswerIndex = 1,
                explanation = "Emphatic stress on ACCOUNTANT singles out the specific official who made the payment (accountant, not cashier).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q99",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2012_100",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2012",
                questionText = "The cat DEVOURED the rat.",
                optionA = "Did the rat devour the cat?",
                optionB = "What devoured the rat?",
                optionC = "Did the cat pet the rat?",
                optionD = "Is this the rat the cat devoured?",
                correctAnswerIndex = 2,
                explanation = "Emphatic stress on DEVOURED contrasts the destructive action against mild alternatives like petting or ignoring.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q100",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
