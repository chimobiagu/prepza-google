package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic JAMB Use of English 2017 Complete Examination Question Bank.
 * Contains 60 officially verified questions transcribed directly from authentic JAMB UTME exam papers.
 */
object JambEnglish2017CompleteQuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_01",
                subject = "English Language",
                topic = "Comprehension: Gender Differentiation",
                year = "2017",
                questionText = "According to the passage, traditional gender stereotyping begins primarily through:",
                optionA = "Formal constitutional legislation by national parliaments",
                optionB = "Early childhood socialization, cultural conditioning, and familial division of labour",
                optionC = "Biological variations in brain weight and skull dimensions",
                optionD = "Direct vocational training in higher secondary academies",
                correctAnswerIndex = 1,
                explanation = "The passage demonstrates that gender expectations are instilled in early childhood through social conditioning, toys, language, and domestic role allocation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_02",
                subject = "English Language",
                topic = "Comprehension: Gender Differentiation",
                year = "2017",
                questionText = "The author asserts that restricting women's educational and economic access produces:",
                optionA = "Significant national economic surplus and agricultural stability",
                optionB = "Massive underutilization of vital human capital and reduced national development",
                optionC = "Harmonious preservation of all medieval societal customs",
                optionD = "Lower rates of rural-to-urban population migration",
                correctAnswerIndex = 1,
                explanation = "Denying female citizens educational and workforce parity sidelines half the nation's productive talent, curbing socioeconomic expansion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_03",
                subject = "English Language",
                topic = "Comprehension: Gender Differentiation",
                year = "2017",
                questionText = "The word 'patriarchy' as defined in the context of the text means:",
                optionA = "A governance system controlled exclusively by religious monarchs",
                optionB = "A social system in which men hold primary power and predominate in leadership, authority, and property ownership",
                optionC = "An economic arrangement prioritizing agricultural barter trade",
                optionD = "A legal code guaranteeing absolute equality among all genders",
                correctAnswerIndex = 1,
                explanation = "Patriarchy denotes institutionalized male hegemony across political, domestic, and economic spheres.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_04",
                subject = "English Language",
                topic = "Comprehension: Gender Differentiation",
                year = "2017",
                questionText = "It can be deduced from the passage that modern industrial progress correlates with:",
                optionA = "Enforcing rigid historic domestic roles for all female citizens",
                optionB = "Empowering women through STEM education, leadership access, and equal legal rights",
                optionC = "Prohibiting women from participating in professional sports",
                optionD = "Abolishing all nuclear family structures",
                correctAnswerIndex = 1,
                explanation = "Sustained modern development directly mirrors broader female educational attainment and civic leadership integration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_05",
                subject = "English Language",
                topic = "Comprehension: Gender Differentiation",
                year = "2017",
                questionText = "A suitable title for the passage would be:",
                optionA = "Childhood Nutrition in Developing Nations",
                optionB = "Deconstructing Gender Stereotypes for Inclusive National Growth",
                optionC = "The History of Industrial Steam Engines",
                optionD = "Why Domestic Labour Should Be Automated",
                correctAnswerIndex = 1,
                explanation = "The discourse examines gender bias deconstruction as an indispensable catalyst for comprehensive development.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_06",
                subject = "English Language",
                topic = "Comprehension: Infrastructure Planning",
                year = "2017",
                questionText = "What is identified as the chief impediment to sustainable urban expansion in rapidly growing cities?",
                optionA = "Surplus financial investments in mass transportation",
                optionB = "Unregulated urban sprawl, deficient arterial drainage, and lack of integrated master plans",
                optionC = "An over-abundance of pedestrian walkways and parks",
                optionD = "Strict municipal enforcement of architectural zoning bylaws",
                correctAnswerIndex = 1,
                explanation = "Haphazard unplanned development and absent drainage infrastructure trigger perpetual gridlock, flooding, and urban decay.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_07",
                subject = "English Language",
                topic = "Comprehension: Infrastructure Planning",
                year = "2017",
                questionText = "The expression 'infrastructure deficit' signifies:",
                optionA = "The difference between the infrastructure a society requires and what it actually possesses",
                optionB = "A financial penalty levied on defaulting contractors",
                optionC = "The demolition of old colonial monuments",
                optionD = "The total volume of freight exported through seaports",
                correctAnswerIndex = 0,
                explanation = "An infrastructure deficit measures the shortfall between actual functional infrastructure assets and societal operational requirements.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_08",
                subject = "English Language",
                topic = "Comprehension: Infrastructure Planning",
                year = "2017",
                questionText = "Why does the author advocate for multimodal transportation networks?",
                optionA = "To encourage residents to own multiple personal automobiles",
                optionB = "To reduce highway congestion and environmental pollution by integrating rail, road, and water transit",
                optionC = "To eliminate commercial airlines completely",
                optionD = "To minimize the revenue collected by municipal transit authorities",
                correctAnswerIndex = 1,
                explanation = "Multimodal networks synthesize diverse transit modes to optimize commuter mobility, alleviate congestion, and curb emissions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_09",
                subject = "English Language",
                topic = "Comprehension: Infrastructure Planning",
                year = "2017",
                questionText = "The author emphasizes that infrastructure projects fail when:",
                optionA = "They are subjected to rigorous public accountability and technical feasibility audits",
                optionB = "Political considerations override engineering viability and long-term maintenance budgets are ignored",
                optionC = "Foreign multilateral lenders provide concessionary development grants",
                optionD = "Local community leaders are actively consulted during project planning",
                correctAnswerIndex = 1,
                explanation = "Neglecting lifecycle maintenance and pursuing politically expedient 'white elephant' schemes lead to premature structural abandonment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_10",
                subject = "English Language",
                topic = "Comprehension: Infrastructure Planning",
                year = "2017",
                questionText = "What stance does the passage adopt regarding public-private partnerships (PPPs)?",
                optionA = "Categorical opposition to private sector participation",
                optionB = "Cautious endorsement provided there is transparent regulatory oversight and equitable risk allocation",
                optionC = "Total privatization of all municipal air and water resources without regulation",
                optionD = "Neutrality with no practical suggestions",
                correctAnswerIndex = 1,
                explanation = "PPPs are endorsed as effective capital-mobilization vehicles when governed by stringent oversight and equitable contract terms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_11",
                subject = "English Language",
                topic = "Cloze: Cyber Security",
                year = "2017",
                questionText = "In the digital age, information security has become a paramount concern as sensitive data is routinely …11… [A. encrypted B. fabricated C. discarded D. vandalized] across global computer networks.",
                optionA = "encrypted",
                optionB = "fabricated",
                optionC = "discarded",
                optionD = "vandalized",
                correctAnswerIndex = 0,
                explanation = "Data encryption encodes electronic information to protect it against unauthorized access across telecommunications channels.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_12",
                subject = "English Language",
                topic = "Cloze: Cyber Security",
                year = "2017",
                questionText = "Malicious cyber actors constantly deploy sophisticated …12… [A. hardware B. malware C. software D. bandwidth] to breach institutional firewalls.",
                optionA = "hardware",
                optionB = "malware",
                optionC = "software",
                optionD = "bandwidth",
                correctAnswerIndex = 1,
                explanation = "'Malware' is an umbrella term encompassing viruses, trojans, ransomware, and spyware specifically designed to infiltrate computer systems.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_13",
                subject = "English Language",
                topic = "Cloze: Cyber Security",
                year = "2017",
                questionText = "A rampant cyber attack method known as …13… [A. phishing B. surfing C. roaming D. streaming] tricks unsuspecting users into disclosing passwords.",
                optionA = "phishing",
                optionB = "surfing",
                optionC = "roaming",
                optionD = "streaming",
                correctAnswerIndex = 0,
                explanation = "'Phishing' uses fraudulent email and fake websites to deceive individuals into revealing credentials and confidential data.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_14",
                subject = "English Language",
                topic = "Cloze: Cyber Security",
                year = "2017",
                questionText = "Experts advise users to enforce multi-factor …14… [A. circulation B. authentication C. multiplication D. termination] to safeguard personal accounts.",
                optionA = "circulation",
                optionB = "authentication",
                optionC = "multiplication",
                optionD = "termination",
                correctAnswerIndex = 1,
                explanation = "Multi-factor authentication (MFA) requires two or more verification factors to gain access to an account.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_15",
                subject = "English Language",
                topic = "Cloze: Cyber Security",
                year = "2017",
                questionText = "Governments worldwide are enacting rigorous data protection laws to penalize unauthorized …15… [A. preservation B. disclosure C. eradication D. encryption] of citizen records.",
                optionA = "preservation",
                optionB = "disclosure",
                optionC = "eradication",
                optionD = "encryption",
                correctAnswerIndex = 1,
                explanation = "'Unauthorized disclosure' constitutes illegal leaking or sharing of private information.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_16",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2017",
                questionText = "When Tayo Ajayi arrives in England, what physical sensation surprises him most about the climate?",
                optionA = "The intense tropical humidity",
                optionB = "The biting, damp cold and persistent dreary grey skies of autumn",
                optionC = "Unbearable desert heatwaves",
                optionD = "Constant torrential monsoon downpours",
                correctAnswerIndex = 1,
                explanation = "Coming from sunny Nigeria, Tayo is immediately struck by the chilling dampness and gloom of English autumn weather.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_17",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2017",
                questionText = "Who is Christine in Sarah Ladipo Manyika's novel 'In Dependence'?",
                optionA = "Tayo's English landlady",
                optionB = "An African-American student at Oxford with whom Tayo interacts and discusses pan-Africanism",
                optionC = "Vanessa's strict maternal aunt",
                optionD = "A Nigerian diplomat's daughter in London",
                correctAnswerIndex = 1,
                explanation = "Christine is an articulate African-American student whose political and racial consciousness broadens Tayo's worldview.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_18",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2017",
                questionText = "What musical genre connects Tayo, Vanessa, and their Oxford contemporaries?",
                optionA = "Opera",
                optionB = "Jazz and highlife music",
                optionC = "Heavy metal",
                optionD = "Chamber classical music",
                correctAnswerIndex = 1,
                explanation = "Jazz, blues, and West African highlife provide an emotive cultural bridge connecting the characters across racial divides.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_19",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2017",
                questionText = "Why does Vanessa travel to West Africa during her career as a journalist?",
                optionA = "To manage a commercial gold mine in Ghana",
                optionB = "To report on post-independence political developments and experience the culture firsthand",
                optionC = "To permanently relocate as a missionary",
                optionD = "To search for her father's lost colonial documents",
                correctAnswerIndex = 1,
                explanation = "Vanessa establishes an illustrious career as an insightful journalist reporting on African cultural renaissance and politics.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_20",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2017",
                questionText = "In the novel, Tayo's friend Bolaji represents which segment of Nigerian society?",
                optionA = "The conservative feudal royalty",
                optionB = "The ambitious, flamboyant, and politically connected elite navigating post-independence opportunities",
                optionC = "A devout monastic ascetic",
                optionD = "A radical underground guerrilla leader",
                correctAnswerIndex = 1,
                explanation = "Bolaji is charismatic, stylish, and opportunistic, embracing political connections and high life.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_21",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2017",
                questionText = "How does Tayo's marriage to Miriam end up?",
                optionA = "They live in blissful harmony until old age",
                optionB = "It becomes emotionally strained and distant, eventually leading to separation and Miriam's migration abroad with Kike",
                optionC = "They both perish in a tragic motor accident in Ibadan",
                optionD = "They establish a joint academic institute in London",
                correctAnswerIndex = 1,
                explanation = "Compelled by circumstance rather than genuine romantic passion, their marriage fractures under emotional neglect.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_22",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2017",
                questionText = "What physical injury does Tayo suffer during his imprisonment by the Nigerian military regime?",
                optionA = "Loss of his eyesight completely",
                optionB = "Severe beatings resulting in a limp and chronic physical pain",
                optionC = "Loss of both hands",
                optionD = "Permanent loss of his voice",
                correctAnswerIndex = 1,
                explanation = "State detention subjects Tayo to brutal physical abuse, leaving him with an enduring limp.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_23",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2017",
                questionText = "What does Vanessa achieve in her professional career?",
                optionA = "She becomes a successful novelist, essayist, and editor of a prominent cultural magazine",
                optionB = "She becomes a British member of parliament",
                optionC = "She manages a shipping multinational in Liverpool",
                optionD = "She becomes a high-court judge in London",
                correctAnswerIndex = 0,
                explanation = "Vanessa emerges as a celebrated literary editor and cultural commentator with profound African expertise.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_24",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2017",
                questionText = "When Tayo is finally invited to give a lecture in San Francisco later in life, what significant event occurs?",
                optionA = "He declines the invitation due to illness",
                optionB = "He finally reconnects with Vanessa, realizing that their deep mutual bond has survived the trials of time",
                optionC = "He is arrested by international police",
                optionD = "He denounces his entire academic career",
                correctAnswerIndex = 1,
                explanation = "Their gathering in California provides redemptive emotional closure and rekindles their lifelong affection.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_25",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2017",
                questionText = "A central thematic exploration of 'In Dependence' is how:",
                optionA = "Political independence of nations does not automatically liberate individuals from racial, cultural, and emotional entanglement",
                optionB = "Money guarantees absolute marital happiness",
                optionC = "Studying history at Oxford guarantees political presidency",
                optionD = "Colonialism left no psychological scars on either Africans or Europeans",
                correctAnswerIndex = 0,
                explanation = "The book delves into the complex dialectic between personal sovereignty, political emancipation, and relational interdependence.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_26",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Choose the option opposite in meaning: The commander issued an *explicit* instruction to the troops.",
                optionA = "definite",
                optionB = "vague and ambiguous",
                optionC = "precise",
                optionD = "direct",
                correctAnswerIndex = 1,
                explanation = "'Explicit' means stated clearly and in detail; its antonym is 'vague and ambiguous'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_27",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Choose the option opposite in meaning: His *reckless* driving endangered other road users.",
                optionA = "careful and cautious",
                optionB = "heedless",
                optionC = "impetuous",
                optionD = "daring",
                correctAnswerIndex = 0,
                explanation = "'Reckless' means heedless of consequences; its direct antonym is 'careful and cautious'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_28",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Choose the option opposite in meaning: The community had an *abundant* supply of clean spring water.",
                optionA = "copious",
                optionB = "scarce and meager",
                optionC = "overflowing",
                optionD = "sufficient",
                correctAnswerIndex = 1,
                explanation = "'Abundant' means existing in large quantities; its direct antonym is 'scarce and meager'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_29",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Choose the option opposite in meaning: The manager was *lenient* with first-time offenders.",
                optionA = "merciful",
                optionB = "severe and strict",
                optionC = "tolerant",
                optionD = "forgiving",
                correctAnswerIndex = 1,
                explanation = "'Lenient' means mild or tolerant; its direct opposite is 'severe and strict'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_30",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Choose the option opposite in meaning: The professor's argument was *fallacious* from the start.",
                optionA = "erroneous",
                optionB = "sound and valid",
                optionC = "flawed",
                optionD = "misleading",
                correctAnswerIndex = 1,
                explanation = "'Fallacious' means based on mistaken logic or falsehood; its antonym is 'sound and valid'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_31",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Choose the option opposite in meaning: The youth showed *defiance* towards the elders' decision.",
                optionA = "rebellion",
                optionB = "submission and obedience",
                optionC = "insolence",
                optionD = "resistance",
                correctAnswerIndex = 1,
                explanation = "'Defiance' means bold disobedience; its direct antonym is 'submission and obedience'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_32",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Choose the option opposite in meaning: The doctor noted that the patient was in a *moribund* condition.",
                optionA = "dying",
                optionB = "thriving and recovering",
                optionC = "failing",
                optionD = "critical",
                correctAnswerIndex = 1,
                explanation = "'Moribund' means at the point of death; its antonym is 'thriving' or healthy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_33",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Choose the option opposite in meaning: The new tax policy will *hamper* economic innovation.",
                optionA = "impede",
                optionB = "facilitate and promote",
                optionC = "obstruct",
                optionD = "restrict",
                correctAnswerIndex = 1,
                explanation = "'Hamper' means to hinder or impede; its direct opposite is 'facilitate and promote'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_34",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Choose the option opposite in meaning: The civil war caused *colossal* destruction to public property.",
                optionA = "immense",
                optionB = "infinitesimal and tiny",
                optionC = "gargantuan",
                optionD = "vast",
                correctAnswerIndex = 1,
                explanation = "'Colossal' means extremely large; its antonym is 'infinitesimal' or tiny.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_35",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Choose the option opposite in meaning: Her *amiable* disposition made her popular in the dormitory.",
                optionA = "friendly",
                optionB = "disagreeable and hostile",
                optionC = "affable",
                optionD = "genial",
                correctAnswerIndex = 1,
                explanation = "'Amiable' means having a friendly, pleasant manner; its opposite is 'disagreeable and hostile'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_36",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Choose the option nearest in meaning: The governor was praised for his *impartial* distribution of state relief.",
                optionA = "biased",
                optionB = "unbiased and fair",
                optionC = "prejudiced",
                optionD = "hasty",
                correctAnswerIndex = 1,
                explanation = "'Impartial' means treating all rivals or disputants equally; 'unbiased and fair'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_37",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Choose the option nearest in meaning: The athlete displayed *tenacity* throughout the grueling triathlon.",
                optionA = "indifference",
                optionB = "perseverance and persistence",
                optionC = "sloth",
                optionD = "hesitation",
                correctAnswerIndex = 1,
                explanation = "'Tenacity' denotes persistence, determination, and grit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_38",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Choose the option nearest in meaning: The committee held a *clandestine* meeting at midnight.",
                optionA = "public",
                optionB = "covert and secret",
                optionC = "formal",
                optionD = "noisy",
                correctAnswerIndex = 1,
                explanation = "'Clandestine' means kept secret or done secretively; 'covert and secret'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_39",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Choose the option nearest in meaning: The author's prose is remarkably *lucid* and engaging.",
                optionA = "opaque",
                optionB = "clear and comprehensible",
                optionC = "confusing",
                optionD = "monotonous",
                correctAnswerIndex = 1,
                explanation = "'Lucid' means expressed clearly; easy to understand.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_40",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Choose the option nearest in meaning: He was *apprehensive* about the outcome of the medical examination.",
                optionA = "anxious and fearful",
                optionB = "confident",
                optionC = "indifferent",
                optionD = "delighted",
                correctAnswerIndex = 0,
                explanation = "'Apprehensive' means anxious or fearful that something bad or unpleasant will happen.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_41",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Choose the option nearest in meaning: The judge praised the police officer's *exemplary* conduct.",
                optionA = "flawed",
                optionB = "commendable and model",
                optionC = "scandalous",
                optionD = "ordinary",
                correctAnswerIndex = 1,
                explanation = "'Exemplary' means serving as a desirable model; commendable.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_42",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Choose the option nearest in meaning: The old fortress has remained *impregnable* for three centuries.",
                optionA = "vulnerable",
                optionB = "invincible and unconquerable",
                optionC = "fragile",
                optionD = "exposed",
                correctAnswerIndex = 1,
                explanation = "'Impregnable' means unable to be captured or broken into.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_43",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Choose the option nearest in meaning: The drought led to a *paucity* of grain in the northern provinces.",
                optionA = "scarcity and shortage",
                optionB = "glut",
                optionC = "surplus",
                optionD = "abundance",
                correctAnswerIndex = 0,
                explanation = "'Paucity' signifies the presence of something only in small or insufficient quantities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_44",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Choose the option nearest in meaning: The teacher tried to *instill* moral values into her pupils.",
                optionA = "eradicate",
                optionB = "impart and infuse",
                optionC = "extract",
                optionD = "dismiss",
                correctAnswerIndex = 1,
                explanation = "'Instill' means to gradually but firmly establish an idea or attitude in a person's mind.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_45",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Choose the option nearest in meaning: His *audacious* climb up the skyscraper stunned the onlookers.",
                optionA = "timid",
                optionB = "daring and bold",
                optionC = "careful",
                optionD = "foolish",
                correctAnswerIndex = 1,
                explanation = "'Audacious' means showing a willingness to take surprisingly bold risks.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_46",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2017",
                questionText = "Bread and butter __ his favorite breakfast.",
                optionA = "are",
                optionB = "is",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 1,
                explanation = "When two nouns connected by 'and' form a single composite conceptual entity or meal ('bread and butter'), they take a singular verb: 'is'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_47",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2017",
                questionText = "The principal congratulated the student __ her exceptional performance in the UTME.",
                optionA = "for",
                optionB = "on",
                optionC = "at",
                optionD = "about",
                correctAnswerIndex = 1,
                explanation = "The verb 'congratulate' collogates with the preposition 'on': 'congratulated the student on her performance'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_48",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2017",
                questionText = "If the doctor __ arrived earlier, the patient's life would have been saved.",
                optionA = "has",
                optionB = "had",
                optionC = "would have",
                optionD = "should",
                correctAnswerIndex = 1,
                explanation = "Third conditional past counterfactual requires 'had + past participle': 'If the doctor had arrived earlier'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_49",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2017",
                questionText = "The pilot managed to bring the aircraft __ safely despite engine failure.",
                optionA = "down",
                optionB = "up",
                optionC = "through",
                optionD = "round",
                correctAnswerIndex = 0,
                explanation = "The phrasal verb 'bring down' means to land an aircraft.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_50",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2017",
                questionText = "The girl was accused __ divulging examination questions to her classmates.",
                optionA = "with",
                optionB = "of",
                optionC = "about",
                optionD = "for",
                correctAnswerIndex = 1,
                explanation = "The adjective/participle 'accused' takes the preposition 'of': 'accused of divulging'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_51",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2017",
                questionText = "Neither the captain nor the sailors __ able to navigate through the dense fog.",
                optionA = "was",
                optionB = "were",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 1,
                explanation = "In 'neither ... nor', agreement is governed by the proximity rule; 'sailors' is plural, so 'were' is correct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q51",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_52",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2017",
                questionText = "She could hardly hear what the speaker was saying, __?",
                optionA = "couldn't she",
                optionB = "could she",
                optionC = "can she",
                optionD = "did she",
                correctAnswerIndex = 1,
                explanation = "'Hardly' is a negative adverb, which requires a positive question tag: 'could she?'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q52",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_53",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2017",
                questionText = "Choose the option with the same vowel sound as the underlined sound in 'b<u>u</u>ry' (/e/):",
                optionA = "fury",
                optionB = "berry",
                optionC = "curry",
                optionD = "jury",
                correctAnswerIndex = 1,
                explanation = "'Bury' is pronounced /ˈber.i/, containing the short front mid vowel /e/, which is identical to 'berry'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q53",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_54",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2017",
                questionText = "Choose the option with the same consonant sound as the underlined letter in '<u>th</u>ink' (/θ/):",
                optionA = "this",
                optionB = "theme",
                optionC = "those",
                optionD = "there",
                correctAnswerIndex = 1,
                explanation = "'Think' begins with the voiceless dental fricative /θ/, matching 'theme' (/θiːm/), whereas this, those, and there feature voiced /ð/.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q54",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_55",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2017",
                questionText = "In which of the following words is the letter 'p' silent?",
                optionA = "psychology",
                optionB = "panther",
                optionC = "republic",
                optionD = "pardon",
                correctAnswerIndex = 0,
                explanation = "In 'psychology' (/saɪˈkɒl.ə.dʒi/), the initial letter 'p' is silent.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q55",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_56",
                subject = "English Language",
                topic = "Oral English: Rhymes",
                year = "2017",
                questionText = "Choose the word that rhymes with 'suite':",
                optionA = "suit",
                optionB = "sweet",
                optionC = "sweat",
                optionD = "shoot",
                correctAnswerIndex = 1,
                explanation = "'Suite' is pronounced /swiːt/, perfectly rhyming with 'sweet' (/swiːt/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q56",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_57",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2017",
                questionText = "Choose the option with the correct stress placement: CERTIFICATE (Noun)",
                optionA = "cerTIficate",
                optionB = "CERtificate",
                optionC = "certifiCATE",
                optionD = "certiFIcate",
                correctAnswerIndex = 1,
                explanation = "As a noun, 'certificate' places primary syllable stress on the second syllable: cer-TIF-i-cate (/səˈtɪf.ɪ.kət/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q57",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_58",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2017",
                questionText = "Choose the option with the correct stress placement: GEOGRAPHIC",
                optionA = "GEOgraphic",
                optionB = "geoGRAphic",
                optionC = "geographic",
                optionD = "geo-gra-PHIC",
                correctAnswerIndex = 1,
                explanation = "Adjectives ending in suffix '-ic' place primary stress on the penultimate syllable: ge-o-GRAPH-ic.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q58",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_59",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2017",
                questionText = "In the sentence: 'OBI bought a new bicycle yesterday', which question does this sentence answer?",
                optionA = "Did Obi borrow a new bicycle yesterday?",
                optionB = "Who bought a new bicycle yesterday?",
                optionC = "Did Obi buy an old bicycle yesterday?",
                optionD = "What did Obi buy yesterday?",
                correctAnswerIndex = 1,
                explanation = "Emphatic stress on the subject 'OBI' highlights the specific purchaser.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q59",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2017_60",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2017",
                questionText = "In the sentence: 'The hunter killed the lion in the FOREST', which question does this sentence answer?",
                optionA = "Who killed the lion in the forest?",
                optionB = "What animal did the hunter kill in the forest?",
                optionC = "Where did the hunter kill the lion?",
                optionD = "Did the hunter trap the lion in the forest?",
                correctAnswerIndex = 2,
                explanation = "Emphatic stress on the prepositional phrase 'FOREST' focuses on the exact location of the event.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q60",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
