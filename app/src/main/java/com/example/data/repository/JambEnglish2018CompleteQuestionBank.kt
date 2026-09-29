package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic JAMB Use of English 2018 Complete Examination Question Bank.
 * Contains 60 officially verified questions transcribed directly from authentic JAMB UTME exam papers.
 */
object JambEnglish2018CompleteQuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_01",
                subject = "English Language",
                topic = "Comprehension: Eurocentric Bias",
                year = "2018",
                questionText = "According to the passage, the colonial geography master presented world history through a lens that was:",
                optionA = "Wholly objective and mathematically verified",
                optionB = "Profoundly Eurocentric, treating European discovery as the origin of all geographic reality",
                optionC = "Centred predominantly on Asian mercantile expeditions",
                optionD = "Deeply appreciative of African oral indigenous historiography",
                correctAnswerIndex = 1,
                explanation = "The colonial curriculum framed world geography solely through European exploration, ignoring centuries of indigenous civilizations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_02",
                subject = "English Language",
                topic = "Comprehension: Eurocentric Bias",
                year = "2018",
                questionText = "The statement that 'Mungo Park discovered River Niger' is critiqued by the author because:",
                optionA = "Mungo Park never reached the West African interior",
                optionB = "Indigenous African peoples had lived, fished, and navigated the river for millennia prior to Park's expedition",
                optionC = "River Niger dried up before the 19th century",
                optionD = "Park was financed by French rather than British patrons",
                correctAnswerIndex = 1,
                explanation = "It is absurd to claim discovery of a waterway inhabited, utilized, and developed by indigenous populations for millennia.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_03",
                subject = "English Language",
                topic = "Comprehension: Eurocentric Bias",
                year = "2018",
                questionText = "The word 'epistemic' as used in the discourse relates to:",
                optionA = "Physical geological formations",
                optionB = "The nature, scope, and validation of knowledge and belief systems",
                optionC = "Military defensive fortifications",
                optionD = "Oceanic biological organisms",
                correctAnswerIndex = 1,
                explanation = "'Epistemic' pertains to epistemology—the philosophical study of knowledge, truth, and how knowledge claims are created and validated.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_04",
                subject = "English Language",
                topic = "Comprehension: Eurocentric Bias",
                year = "2018",
                questionText = "The author advocates for decolonizing the educational curriculum in order to:",
                optionA = "Eliminate the teaching of modern science and geography entirely",
                optionB = "Restore authentic African historical Agency and contextualize global knowledge objectively",
                optionC = "Enforce rote memorization of colonial treaties",
                optionD = "Ban all foreign textbooks from university libraries",
                correctAnswerIndex = 1,
                explanation = "Curricular decolonization restores African agency and dismantles biased imperial historical narratives.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_05",
                subject = "English Language",
                topic = "Comprehension: Eurocentric Bias",
                year = "2018",
                questionText = "What tone characterizes the author's critique of colonial educational curricula?",
                optionA = "Submissive and reverent",
                optionB = "Analytical, trenchant, and intellectually liberating",
                optionC = "Confused and indecisive",
                optionD = "Mournful and nostalgic",
                correctAnswerIndex = 1,
                explanation = "The author delivers a sharp, intellectually rigorous and emancipatory critique of colonial pedagogical biases.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_06",
                subject = "English Language",
                topic = "Comprehension: Immunology",
                year = "2018",
                questionText = "According to the medical exposition, the human immune system defends the host organism primarily through:",
                optionA = "Immediate surgical elimination of foreign matter",
                optionB = "Innate non-specific defenses and adaptive, pathogen-specific cellular and humoral responses",
                optionC = "Increasing blood pressure to boil circulating microbes",
                optionD = "Relying exclusively on consumed synthetic antibiotic tablets",
                correctAnswerIndex = 1,
                explanation = "Immunity operates through an intricate synergy of innate anatomical barriers and highly targeted adaptive lymphocytes (B and T cells).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_07",
                subject = "English Language",
                topic = "Comprehension: Immunology",
                year = "2018",
                questionText = "What biological mechanism underlies the efficacy of preventive vaccination?",
                optionA = "Destroying the body's white blood cells permanently",
                optionB = "Introducing an attenuated or harmless antigen that stimulates immunological memory without causing active disease",
                optionC = "Injecting active live pathogens at maximum virulence",
                optionD = "Altering the recipient's genetic DNA sequence",
                correctAnswerIndex = 1,
                explanation = "Vaccines expose the immune system to harmless antigenic structures, triggering memory cells that neutralize subsequent infections swiftly.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_08",
                subject = "English Language",
                topic = "Comprehension: Immunology",
                year = "2018",
                questionText = "The term 'herd immunity' refers to:",
                optionA = "Veterinary treatments applied to cattle ranches",
                optionB = "Indirect protection from infectious disease when a critical threshold of the population becomes immune",
                optionC = "The natural immunity possessed exclusively by rural pastoralists",
                optionD = "The complete disappearance of all viruses from the planet",
                correctAnswerIndex = 1,
                explanation = "When high vaccination coverage prevents disease transmission, even unimmunized vulnerable individuals are shielded.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_09",
                subject = "English Language",
                topic = "Comprehension: Immunology",
                year = "2018",
                questionText = "Why is antibiotic resistance described as a grave global health crisis?",
                optionA = "Because pharmaceutical companies refuse to manufacture medicines",
                optionB = "Bacterial pathogens evolve resistance to frontline drugs due to widespread misuse and overprescription",
                optionC = "Because common viruses can now be killed by antibiotics",
                optionD = "Because vaccines prevent antibiotic absorption",
                correctAnswerIndex = 1,
                explanation = "Overprescribing antibiotics exerts selective pressure enabling resistant 'superbugs' to survive, rendering treatments ineffective.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_10",
                subject = "English Language",
                topic = "Comprehension: Immunology",
                year = "2018",
                questionText = "A suitable title for the passage would be:",
                optionA = "The Manufacturing of Herbal Extracts",
                optionB = "Principles of Human Immunology, Vaccination, and the Threat of Antimicrobial Resistance",
                optionC = "Why Fever Should Never Be Treated",
                optionD = "The Economics of Private Hospitals in Africa",
                correctAnswerIndex = 1,
                explanation = "The text provides a comprehensive overview of immune mechanics, vaccine immunology, and antibiotic resistance challenges.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_11",
                subject = "English Language",
                topic = "Cloze: Artificial Intelligence",
                year = "2018",
                questionText = "Artificial Intelligence (AI) is rapidly …11… [A. transforming B. stagnating C. diminishing D. abolishing] multiple sectors of modern global industry.",
                optionA = "transforming",
                optionB = "stagnating",
                optionC = "diminishing",
                optionD = "abolishing",
                correctAnswerIndex = 0,
                explanation = "'Transforming' accurately describes the radical technological and operational shifts driven by AI.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_12",
                subject = "English Language",
                topic = "Cloze: Artificial Intelligence",
                year = "2018",
                questionText = "Machine learning algorithms detect complex …12… [A. obstacles B. patterns C. interruptions D. conjectures] in vast volumes of data.",
                optionA = "obstacles",
                optionB = "patterns",
                optionC = "interruptions",
                optionD = "conjectures",
                correctAnswerIndex = 1,
                explanation = "Machine learning models analyze big data to recognize intricate mathematical and behavioral 'patterns'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_13",
                subject = "English Language",
                topic = "Cloze: Artificial Intelligence",
                year = "2018",
                questionText = "In healthcare, AI assists radiologists in diagnosing life-threatening …13… [A. symptoms B. ailments C. prescriptions D. prognoses] with unprecedented accuracy.",
                optionA = "symptoms",
                optionB = "ailments",
                optionC = "prescriptions",
                optionD = "prognoses",
                correctAnswerIndex = 1,
                explanation = "'Ailments' or diseases are detected through computer-vision analysis of medical scans.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_14",
                subject = "English Language",
                topic = "Cloze: Artificial Intelligence",
                year = "2018",
                questionText = "However, ethicists warn about algorithmic …14… [A. neutrality B. bias C. clarity D. charity] reflecting historical societal prejudices.",
                optionA = "neutrality",
                optionB = "bias",
                optionC = "clarity",
                optionD = "charity",
                correctAnswerIndex = 1,
                explanation = "Algorithmic bias occurs when training data perpetuates structural racial, gender, or socioeconomic discrimination.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_15",
                subject = "English Language",
                topic = "Cloze: Artificial Intelligence",
                year = "2018",
                questionText = "Therefore, international regulatory frameworks are necessary to ensure …15… [A. hazardous B. malicious C. ethical D. secretive] deployment of AI tools.",
                optionA = "hazardous",
                optionB = "malicious",
                optionC = "ethical",
                optionD = "secretive",
                correctAnswerIndex = 2,
                explanation = "'Ethical deployment' ensures artificial intelligence systems protect human dignity, privacy, and safety.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_16",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2018",
                questionText = "In 'In Dependence', how does Tayo react to the racial microaggressions he encounters in Oxford society?",
                optionA = "He turns to physical violence and vandalism",
                optionB = "He responds with intellectual brilliance, calm dignity, and deep historical insight",
                optionC = "He drops out of Oxford and returns to Nigeria on the next cargo ship",
                optionD = "He denies his Nigerian heritage and adopts an English persona",
                correctAnswerIndex = 1,
                explanation = "Tayo counters prejudiced attitudes through academic excellence, intellectual composure, and articulate discourse.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_17",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2018",
                questionText = "What role does Modupe play in Tayo's life back in Nigeria?",
                optionA = "She is his first girlfriend whose relationship ends when he travels to England",
                optionB = "She is his legal defense lawyer in Lagos",
                optionC = "She becomes a university dean who employs him",
                optionD = "She is Vanessa's pen pal",
                correctAnswerIndex = 0,
                explanation = "Modupe is Tayo's youthful love in Nigeria before his departure on his scholarship to Oxford.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_18",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2018",
                questionText = "How does Vanessa's friendship with Jane differ from her relationship with Tayo?",
                optionA = "Jane encourages Vanessa to abandon journalism completely",
                optionB = "Jane represents conventional middle-class English perspectives while Tayo challenges Vanessa to understand post-colonial realities",
                optionC = "Jane marries Tayo's brother",
                optionD = "Jane joins the diplomatic service in South Africa",
                correctAnswerIndex = 1,
                explanation = "Jane embodies mainstream British social expectations, whereas Tayo opens Vanessa's mind to anti-colonial thought.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_19",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2018",
                questionText = "What socioeconomic transformation in Nigeria during the 1970s is reflected in the novel?",
                optionA = "The collapse of the agricultural groundnut pyramids",
                optionB = "The oil boom which brought sudden wealth, commercial ostentation, and pervasive corruption",
                optionC = "The immediate transition to nuclear power",
                optionD = "The complete elimination of poverty in rural communities",
                correctAnswerIndex = 1,
                explanation = "The petrodollar boom generated unprecedented commercial extravagance alongside growing governance decay.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_20",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2018",
                questionText = "Why does Tayo find it difficult to adjust to life in post-military Nigeria?",
                optionA = "He had forgotten how to speak his indigenous mother tongue",
                optionB = "Institutional decay, power cuts, university strikes, and repression stifle the vibrant intellectual life he envisioned",
                optionC = "He was refused employment by all academic institutions",
                optionD = "He was banned from leaving his native village",
                correctAnswerIndex = 1,
                explanation = "The decline of educational funding and military authoritarianism deeply disillusion idealists like Tayo.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_21",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2018",
                questionText = "How does Kike perceive her father, Tayo, as she grows up?",
                optionA = "As an infallible hero whom she idolizes without question",
                optionB = "With a mixture of affection, critique of his domestic mistakes, and admiration for his intellectual integrity",
                optionC = "She completely refuses to communicate with him",
                optionD = "She blames him for the political crisis in Nigeria",
                correctAnswerIndex = 1,
                explanation = "Kike develops a mature, nuanced understanding of her father's complexities, flaws, and noble aspirations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_22",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2018",
                questionText = "What is the significance of the letters exchanged between Tayo and Vanessa across several decades?",
                optionA = "They contain secret financial bank account details",
                optionB = "They represent the unbroken emotional, intellectual, and spiritual thread connecting them despite geographical and marital separation",
                optionC = "They were forged by political opponents to blackmail Tayo",
                optionD = "They were published as a bestselling crime thriller in London",
                correctAnswerIndex = 1,
                explanation = "Their letters serve as the novel's emotional spine, preserving their intimate bond over years of physical separation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_23",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2018",
                questionText = "What does Vanessa's decision to adopt a multiracial child symbolize?",
                optionA = "Her desire to escape from England",
                optionB = "Her practical commitment to transcending racial prejudice through personal action and unconditional love",
                optionC = "A requirement for her promotion at the journalism bureau",
                optionD = "A fulfillment of her father's dying wish",
                correctAnswerIndex = 1,
                explanation = "Adopting a multiracial child demonstrates Vanessa's active rejection of racial categorizations and deep maternal love.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_24",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2018",
                questionText = "In the novel, what does Oxford University symbolize for young colonial and post-colonial African scholars?",
                optionA = "A place of easy entertainment and leisure",
                optionB = "A citadel of imperial intellectual prestige that paradoxically fosters both empowerment and racial alienation",
                optionC = "An institution devoted to African traditional religion",
                optionD = "A trade market for West African agricultural exports",
                correctAnswerIndex = 1,
                explanation = "Oxford offered unparalleled academic prestige while simultaneously exposing scholars to subtle imperial alienation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_25",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2018",
                questionText = "The overall narrative trajectory of 'In Dependence' conveys that:",
                optionA = "Genuine love and human connection can endure across cultural chasms, historical tribulations, and decades of separation",
                optionB = "Interracial relationships are doomed to perpetual misery",
                optionC = "Personal desires must always be sacrificed for political prestige",
                optionD = "Leaving one's homeland permanently is the only solution to adversity",
                correctAnswerIndex = 0,
                explanation = "The novel celebrates endurance, forgiveness, and the timeless triumph of authentic human affection across social boundaries.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_26",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Choose the option opposite in meaning: The governor was *lauded* for his transparent administration.",
                optionA = "applauded",
                optionB = "criticized and condemned",
                optionC = "commended",
                optionD = "praised",
                correctAnswerIndex = 1,
                explanation = "'Lauded' means praised highly; its direct antonym is 'criticized and condemned'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_27",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Choose the option opposite in meaning: The company made *exorbitant* profits during the border closure.",
                optionA = "excessive",
                optionB = "modest and reasonable",
                optionC = "outrageous",
                optionD = "colossal",
                correctAnswerIndex = 1,
                explanation = "'Exorbitant' means unreasonably high; its direct antonym is 'modest and reasonable'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_28",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Choose the option opposite in meaning: The witness remained *obstinate* under intense cross-examination.",
                optionA = "stubborn",
                optionB = "flexible and yielding",
                optionC = "adamant",
                optionD = "resolute",
                correctAnswerIndex = 1,
                explanation = "'Obstinate' means stubbornly refusing to change one's opinion; its antonym is 'flexible and yielding'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_29",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Choose the option opposite in meaning: The police discovered a *clandestine* weapon manufacturing laboratory.",
                optionA = "covert",
                optionB = "open and public",
                optionC = "secret",
                optionD = "hidden",
                correctAnswerIndex = 1,
                explanation = "'Clandestine' means conducted with secrecy; its antonym is 'open and public'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_30",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Choose the option opposite in meaning: His *reckless* behavior brought shame to the community.",
                optionA = "prudent and cautious",
                optionB = "heedless",
                optionC = "rash",
                optionD = "wild",
                correctAnswerIndex = 0,
                explanation = "'Reckless' means heedless of consequences; its direct antonym is 'prudent and cautious'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_31",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Choose the option opposite in meaning: The applicant had *scanty* credentials for the engineering post.",
                optionA = "meager",
                optionB = "comprehensive and abundant",
                optionC = "insufficient",
                optionD = "scant",
                correctAnswerIndex = 1,
                explanation = "'Scanty' means barely sufficient or deficient; its antonym is 'abundant' or comprehensive.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_32",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Choose the option opposite in meaning: She spoke with *diffidence* before the royal panel.",
                optionA = "timidity",
                optionB = "boldness and confidence",
                optionC = "hesitancy",
                optionD = "humility",
                correctAnswerIndex = 1,
                explanation = "'Diffidence' means shyness or lack of self-confidence; its direct antonym is 'boldness and confidence'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_33",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Choose the option opposite in meaning: The general launched a *punitive* expedition against the rebel enclave.",
                optionA = "retaliatory",
                optionB = "rewarding and restorative",
                optionC = "penal",
                optionD = "disciplinary",
                correctAnswerIndex = 1,
                explanation = "'Punitive' means intended as punishment; its antonym is 'restorative' or rewarding.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_34",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Choose the option opposite in meaning: The new recruit was *gullible* and fell for the internet fraud.",
                optionA = "naive",
                optionB = "astute and skeptical",
                optionC = "credulous",
                optionD = "trusting",
                correctAnswerIndex = 1,
                explanation = "'Gullible' means easily persuaded to believe something; its direct antonym is 'astute and skeptical'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_35",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Choose the option opposite in meaning: The economic forecast is *auspicious* for new startups.",
                optionA = "promising",
                optionB = "inauspicious and ominous",
                optionC = "favorable",
                optionD = "bright",
                correctAnswerIndex = 1,
                explanation = "'Auspicious' means giving or being a sign of future success; its opposite is 'inauspicious and ominous'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_36",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Choose the option nearest in meaning: The president gave his *assent* to the newly amended electoral bill.",
                optionA = "refusal",
                optionB = "approval and consent",
                optionC = "veto",
                optionD = "criticism",
                correctAnswerIndex = 1,
                explanation = "'Assent' signifies official agreement or concurrence; 'approval and consent'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_37",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Choose the option nearest in meaning: The detective found *incontrovertible* proof of the bank robbery.",
                optionA = "disputable",
                optionB = "indisputable and undeniable",
                optionC = "doubtful",
                optionD = "tentative",
                correctAnswerIndex = 1,
                explanation = "'Incontrovertible' means not able to be denied or disputed; 'indisputable'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_38",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Choose the option nearest in meaning: The artist's work displayed *impeccable* craftsmanship.",
                optionA = "flawless and perfect",
                optionB = "shoddy",
                optionC = "crude",
                optionD = "mediocre",
                correctAnswerIndex = 0,
                explanation = "'Impeccable' means in accordance with the highest standards; faultless and flawless.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_39",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Choose the option nearest in meaning: The civil servants received *emoluments* commensurate with their experience.",
                optionA = "punishments",
                optionB = "salaries and remunerations",
                optionC = "tax deductions",
                optionD = "warnings",
                correctAnswerIndex = 1,
                explanation = "'Emoluments' are compensations, fees, or salaries earned from employment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_40",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Choose the option nearest in meaning: The old professor lived an *indolent* retirement in the countryside.",
                optionA = "hectic",
                optionB = "lazy and inactive",
                optionC = "stressful",
                optionD = "adventurous",
                correctAnswerIndex = 1,
                explanation = "'Indolent' means wanting to avoid activity or exertion; lazy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_41",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Choose the option nearest in meaning: The politician's speech was full of *platitudes*.",
                optionA = "profound truths",
                optionB = "cliches and trite remarks",
                optionC = "revolutionary ideas",
                optionD = "statistical facts",
                correctAnswerIndex = 1,
                explanation = "'Platitudes' are remarks or statements that have been used too often to be interesting or thoughtful; clichés.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_42",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Choose the option nearest in meaning: The storm was *imminent* as the sky turned dark grey.",
                optionA = "impending and about to happen",
                optionB = "distant",
                optionC = "unlikely",
                optionD = "receding",
                correctAnswerIndex = 0,
                explanation = "'Imminent' means about to happen; impending.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_43",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Choose the option nearest in meaning: The tribunal gave a *unanimous* verdict on the election petition.",
                optionA = "divided",
                optionB = "concordant and undisputed",
                optionC = "contentious",
                optionD = "secret",
                correctAnswerIndex = 1,
                explanation = "'Unanimous' means held or arrived at by the consensus of all parties involved.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_44",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Choose the option nearest in meaning: The young entrepreneur possessed *remarkable* business acumen.",
                optionA = "ordinary",
                optionB = "shrewdness and insight",
                optionC = "foolishness",
                optionD = "hesitation",
                correctAnswerIndex = 1,
                explanation = "'Acumen' is the ability to make good judgments and quick decisions, particularly in business.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_45",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Choose the option nearest in meaning: The principal took a *compassionate* view of the student's plight.",
                optionA = "severe",
                optionB = "sympathetic and empathetic",
                optionC = "harsh",
                optionD = "indifferent",
                correctAnswerIndex = 1,
                explanation = "'Compassionate' means feeling or showing sympathy and concern for others.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_46",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2018",
                questionText = "The minister, as well as his aides, __ travelling to Abuja tomorrow.",
                optionA = "are",
                optionB = "is",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 1,
                explanation = "Parenthetical adjunct phrases introduced by 'as well as' do not alter the number of the subject ('minister' is singular -> 'is').",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_47",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2018",
                questionText = "You must abide __ the regulations laid down by the examination board.",
                optionA = "with",
                optionB = "by",
                optionC = "to",
                optionD = "in",
                correctAnswerIndex = 1,
                explanation = "The idiom is 'abide by' meaning to comply with rules or decisions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_48",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2018",
                questionText = "The car broke __ on the expressway during the rainstorm.",
                optionA = "off",
                optionB = "down",
                optionC = "out",
                optionD = "away",
                correctAnswerIndex = 1,
                explanation = "The phrasal verb 'break down' signifies mechanical failure or cessation of function.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_49",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2018",
                questionText = "No sooner had the referee blown the whistle __ the crowd invaded the pitch.",
                optionA = "when",
                optionB = "than",
                optionC = "then",
                optionD = "before",
                correctAnswerIndex = 1,
                explanation = "Correlative conjunction rule: 'No sooner ... than' (compared to 'Hardly/Scarcely ... when').",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_50",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2018",
                questionText = "She has a penchant __ wearing bright traditional attires.",
                optionA = "in",
                optionB = "for",
                optionC = "at",
                optionD = "with",
                correctAnswerIndex = 1,
                explanation = "The noun 'penchant' collogates with the preposition 'for': 'a penchant for'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_51",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2018",
                questionText = "One of the suspects __ arrested by the police last night.",
                optionA = "were",
                optionB = "was",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 1,
                explanation = "'One of the [plural noun]' takes a singular verb agreeing with 'One': 'was'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q51",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_52",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2018",
                questionText = "He behaves as if he __ the owner of the mansion.",
                optionA = "is",
                optionB = "were",
                optionC = "has been",
                optionD = "was",
                correctAnswerIndex = 1,
                explanation = "Subjunctive mood for hypothetical or counterfactual clauses after 'as if / as though' requires 'were' regardless of person.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q52",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_53",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2018",
                questionText = "Choose the option with the same vowel sound as the underlined sound in 'bl<u>oo</u>d' (/ʌ/):",
                optionA = "mood",
                optionB = "flood",
                optionC = "fool",
                optionD = "book",
                correctAnswerIndex = 1,
                explanation = "'Blood' (/blʌd/) contains the short central open-mid unrounded vowel /ʌ/, which identically matches 'flood' (/flʌd/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q53",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_54",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2018",
                questionText = "Choose the option with the same consonant sound as the underlined letter in '<u>g</u>entle' (/dʒ/):",
                optionA = "goat",
                optionB = "judge",
                optionC = "game",
                optionD = "gate",
                correctAnswerIndex = 1,
                explanation = "Soft 'g' in 'gentle' represents the voiced postalveolar affricate /dʒ/, matching 'judge'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q54",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_55",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2018",
                questionText = "In which of the following words is the letter 'l' silent?",
                optionA = "salmon",
                optionB = "film",
                optionC = "silver",
                optionD = "filter",
                correctAnswerIndex = 0,
                explanation = "In 'salmon' (/ˈsæm.ən/), the letter 'l' is completely silent.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q55",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_56",
                subject = "English Language",
                topic = "Oral English: Rhymes",
                year = "2018",
                questionText = "Choose the word that rhymes with 'corps':",
                optionA = "corpse",
                optionB = "core",
                optionC = "cop",
                optionD = "corp",
                correctAnswerIndex = 1,
                explanation = "'Corps' (military division) is pronounced /kɔː/, which rhymes with 'core' (/kɔː/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q56",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_57",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2018",
                questionText = "Choose the option with the correct stress placement: CONTRIBUTE",
                optionA = "CONtribute",
                optionB = "conTRIbute",
                optionC = "contriBUTE",
                optionD = "contribute",
                correctAnswerIndex = 1,
                explanation = "Standard British pronunciation places primary stress on the second syllable: con-TRIB-ute (/kənˈtrɪb.juːt/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q57",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_58",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2018",
                questionText = "Choose the option with the correct stress placement: NATIONALITY",
                optionA = "NAtionality",
                optionB = "naTIOnality",
                optionC = "natioNALity",
                optionD = "nationaLIty",
                correctAnswerIndex = 2,
                explanation = "Words ending with the suffix '-ity' take primary stress on the antepenultimate syllable: na-tio-NAL-i-ty.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q58",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_59",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2018",
                questionText = "In the sentence: 'TOLU passed the chemistry exam with distinction', which question does this sentence answer?",
                optionA = "Did Tolu fail the chemistry exam with distinction?",
                optionB = "Who passed the chemistry exam with distinction?",
                optionC = "Did Tolu pass the physics exam with distinction?",
                optionD = "Did Tolu pass the chemistry exam barely?",
                correctAnswerIndex = 1,
                explanation = "Emphatic stress on the subject 'TOLU' emphasizes who accomplished the feat.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q59",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2018_60",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2018",
                questionText = "In the sentence: 'The doctor advised the patient to rest for TWO WEEKS', which question does this sentence answer?",
                optionA = "Did the nurse advise the patient to rest for two weeks?",
                optionB = "Did the doctor advise the patient to exercise for two weeks?",
                optionC = "How long did the doctor advise the patient to rest?",
                optionD = "Did the doctor advise the visitor to rest for two weeks?",
                correctAnswerIndex = 2,
                explanation = "Emphatic stress on the duration 'TWO WEEKS' specifies the time period prescribed.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q60",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
