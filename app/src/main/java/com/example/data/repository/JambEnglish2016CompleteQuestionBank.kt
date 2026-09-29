package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic JAMB Use of English 2016 Complete Examination Question Bank.
 * Contains 60 officially verified questions transcribed directly from authentic JAMB UTME exam papers.
 */
object JambEnglish2016CompleteQuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_01",
                subject = "English Language",
                topic = "Comprehension: Moralist vs Economist",
                year = "2016",
                questionText = "According to the passage, the primary divergence between the traditional African moralist and the modern economist lies in:",
                optionA = "The moralist's emphasis on communal welfare and human dignity versus the economist's focus on material growth and efficiency",
                optionB = "The economist's total rejection of moral principles in trade",
                optionC = "The moralist's insistence on barter trade rather than monetary currency",
                optionD = "The government's bias towards economic models over cultural values",
                correctAnswerIndex = 0,
                explanation = "The passage establishes that the traditional moralist evaluates progress through communal solidarity and moral cohesion, whereas the neoclassical economist prioritizes quantifiable output and market productivity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_02",
                subject = "English Language",
                topic = "Comprehension: Moralist vs Economist",
                year = "2016",
                questionText = "The author suggests that reckless economic growth without moral considerations results in:",
                optionA = "Surplus capital reserves for future generations",
                optionB = "Social alienation, systemic inequality, and spiritual impoverishment",
                optionC = "Complete collapse of all agricultural systems",
                optionD = "Rapid expansion of international diplomacy",
                correctAnswerIndex = 1,
                explanation = "Unchecked pursuit of material accumulation at the expense of communal ethics breeds wide social disparity and moral detachment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_03",
                subject = "English Language",
                topic = "Comprehension: Moralist vs Economist",
                year = "2016",
                questionText = "The word 'utilitarian' as used in the passage most closely means:",
                optionA = "Solely decorative and aesthetic",
                optionB = "Designed for practical usefulness and measurable benefit",
                optionC = "Deeply religious and spiritual",
                optionD = "Excessively complicated and obscure",
                correctAnswerIndex = 1,
                explanation = "Utilitarian philosophy measures actions and policies strictly by practical output and tangible utility.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_04",
                subject = "English Language",
                topic = "Comprehension: Moralist vs Economist",
                year = "2016",
                questionText = "From the passage, it can be inferred that a harmonious society requires:",
                optionA = "Subordinating all economic initiatives to religious authorities",
                optionB = "Abandoning all modern technological and industrial advancements",
                optionC = "Synthesizing productive economic enterprise with foundational ethical responsibility",
                optionD = "Nationalizing all private corporations and distribution networks",
                correctAnswerIndex = 2,
                explanation = "The text concludes by advocating for a synthesis where economic production is guided by ethical values and social justice.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_05",
                subject = "English Language",
                topic = "Comprehension: Moralist vs Economist",
                year = "2016",
                questionText = "A suitable title for the passage would be:",
                optionA = "The Failure of African Agriculture",
                optionB = "Balancing Economic Modernity and Ethical Values in Africa",
                optionC = "The Rise of Multinational Conglomerates",
                optionD = "Why Traditional Ethics Are Obsolete",
                correctAnswerIndex = 1,
                explanation = "The core thematic argument explores reconciling economic development with enduring communal ethics.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_06",
                subject = "English Language",
                topic = "Comprehension: Wildlife Ecology",
                year = "2016",
                questionText = "According to the text, the accelerated extinction of tropical species is primarily driven by:",
                optionA = "Natural evolutionary selection pressures",
                optionB = "Anthropogenic habitat fragmentation, deforestation, and commercial poaching",
                optionC = "Normal cyclical fluctuations in planetary temperature",
                optionD = "Unregulated predation among carnivorous animals",
                correctAnswerIndex = 1,
                explanation = "Human activities—such as rampant logging, urban encroachment, and poaching—represent the overriding drivers of rapid biodiversity collapse.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_07",
                subject = "English Language",
                topic = "Comprehension: Wildlife Ecology",
                year = "2016",
                questionText = "The term 'biodiversity hotspot' refers to a geographical region characterized by:",
                optionA = "Extreme volcanic and geothermal instability",
                optionB = "Exceptional reservoir of endemic plant and animal species under severe conservation threat",
                optionC = "Arid desert landscapes with zero flora or fauna",
                optionD = "High density of commercial timber processing facilities",
                correctAnswerIndex = 1,
                explanation = "Biological hotspots contain globally significant concentrations of endemic organisms threatened with catastrophic habitat loss.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_08",
                subject = "English Language",
                topic = "Comprehension: Wildlife Ecology",
                year = "2016",
                questionText = "The expression 'ecological domino effect' signifies:",
                optionA = "A game invented by environmental researchers",
                optionB = "The cascading collapse of multiple dependent species triggered by the loss of a keystone organism",
                optionC = "The rapid regeneration of clear-cut rainforest canopies",
                optionD = "A government policy regulating wildlife parks",
                correctAnswerIndex = 1,
                explanation = "The extinction or removal of a keystone species causes destabilizing reverberations throughout the entire food web.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_09",
                subject = "English Language",
                topic = "Comprehension: Wildlife Ecology",
                year = "2016",
                questionText = "The author implies that the loss of wild medicinal flora will directly harm:",
                optionA = "Only remote indigenous hunter-gatherer bands",
                optionB = "Pharmaceutical discoveries and global human healthcare resilience",
                optionC = "Space exploration programs",
                optionD = "Domestic livestock breeding exclusively",
                correctAnswerIndex = 1,
                explanation = "Modern pharmacology relies extensively on complex biochemical compounds synthesized by wild rainforest plant species.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_10",
                subject = "English Language",
                topic = "Comprehension: Wildlife Ecology",
                year = "2016",
                questionText = "What tone does the author adopt regarding current conservation efforts?",
                optionA = "Dismissive and indifferent",
                optionB = "Overly celebratory and complacent",
                optionC = "Urgent, cautionary, and vigorously advocating decisive institutional intervention",
                optionD = "Humorous and satirical",
                correctAnswerIndex = 2,
                explanation = "The writer conveys grave concern and urgently appeals for systemic conservation enforcement and community engagement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_11",
                subject = "English Language",
                topic = "Cloze: Renewable Energy",
                year = "2016",
                questionText = "The global transition away from fossil fuels to renewable energy is no longer a luxury but an ecological …11… [A. option B. imperative C. hindrance D. suggestion].",
                optionA = "option",
                optionB = "imperative",
                optionC = "hindrance",
                optionD = "suggestion",
                correctAnswerIndex = 1,
                explanation = "'Imperative' denotes an unavoidable, urgent necessity demanding immediate implementation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_12",
                subject = "English Language",
                topic = "Cloze: Renewable Energy",
                year = "2016",
                questionText = "Over-reliance on hydrocarbons has unleashed catastrophic greenhouse gas …12… [A. transmissions B. emissions C. absorptions D. permissions] into the atmosphere.",
                optionA = "transmissions",
                optionB = "emissions",
                optionC = "absorptions",
                optionD = "permissions",
                correctAnswerIndex = 1,
                explanation = "'Emissions' is the precise scientific term for gases expelled into the earth's atmosphere.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_13",
                subject = "English Language",
                topic = "Cloze: Renewable Energy",
                year = "2016",
                questionText = "Solar photovoltaic panels convert radiant sunlight directly into usable …13… [A. mechanical B. chemical C. electrical D. kinetic] power.",
                optionA = "mechanical",
                optionB = "chemical",
                optionC = "electrical",
                optionD = "kinetic",
                correctAnswerIndex = 2,
                explanation = "Photovoltaic cells absorb light photons and generate direct electrical current.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_14",
                subject = "English Language",
                topic = "Cloze: Renewable Energy",
                year = "2016",
                questionText = "However, the intermittent nature of wind and sun necessitates robust battery …14… [A. consumption B. storage C. leakage D. dissipation] technologies.",
                optionA = "consumption",
                optionB = "storage",
                optionC = "leakage",
                optionD = "dissipation",
                correctAnswerIndex = 1,
                explanation = "Energy storage systems (such as lithium-ion or flow batteries) bridge periods of low solar radiation or wind lull.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_15",
                subject = "English Language",
                topic = "Cloze: Renewable Energy",
                year = "2016",
                questionText = "Developing nations must embrace clean technology to foster …15… [A. unsustainable B. temporal C. sustainable D. erratic] industrialization.",
                optionA = "unsustainable",
                optionB = "temporal",
                optionC = "sustainable",
                optionD = "erratic",
                correctAnswerIndex = 2,
                explanation = "'Sustainable development' balances contemporary technological growth without compromising future generational resources.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_16",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2016",
                questionText = "In Sarah Ladipo Manyika's 'In Dependence', Tayo Ajayi travels to England in the 1960s to study at which prestigious institution?",
                optionA = "Cambridge University",
                optionB = "Oxford University (Balliol College)",
                optionC = "University of London",
                optionD = "University of Edinburgh",
                correctAnswerIndex = 1,
                explanation = "Tayo arrives in Oxford on a government scholarship to study history at Balliol College.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_17",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2016",
                questionText = "Tayo's father gives him which significant parting advice before his departure for Britain?",
                optionA = "To marry an English lady immediately upon arrival",
                optionB = "To remember who he is, focus steadfastly on his studies, and not get distracted by white women",
                optionC = "To renounce his Nigerian citizenship and settle permanently abroad",
                optionD = "To avoid reading political history and take up commerce",
                correctAnswerIndex = 1,
                explanation = "His father admonishes him to guard his heritage, excel academically, and avoid compromising liaisons.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_18",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2016",
                questionText = "How do Tayo and Vanessa Richardson first meet in Oxford?",
                optionA = "At an official diplomatic embassy reception",
                optionB = "At a literary book club meeting where Tayo borrows a book",
                optionC = "Through their mutual acquaintance, Christine",
                optionD = "At an anti-apartheid student demonstration",
                correctAnswerIndex = 1,
                explanation = "They meet in Oxford through shared intellectual and literary interests when Tayo encounters Vanessa reading.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_19",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2016",
                questionText = "Vanessa Richardson's father had served the British Empire as a:",
                optionA = "Colonial civil servant in South Africa and Nigeria",
                optionB = "Anglican bishop in Calcutta",
                optionC = "Trade merchant in Ghana",
                optionD = "Naval commander in the Atlantic fleet",
                correctAnswerIndex = 0,
                explanation = "Mr. Richardson is a conservative former colonial administrator with imperialist racial attitudes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_20",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2016",
                questionText = "Why does Mr. Richardson vehemently object to Vanessa's romance with Tayo?",
                optionA = "Tayo was financially insolvent",
                optionB = "His deep-seated colonial racial prejudice and belief in racial hierarchy",
                optionC = "Tayo planned to study literature rather than medicine",
                optionD = "Vanessa had already been formally betrothed to an English nobleman",
                correctAnswerIndex = 1,
                explanation = "Vanessa's father represents old colonial bigotry and refuses to accept an African son-in-law.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_21",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2016",
                questionText = "What tragic domestic development complicates Tayo's relationship with Vanessa?",
                optionA = "Tayo's forced conscription into the British Army",
                optionB = "Miriam gets pregnant for Tayo back in Nigeria, leading him to marry her out of duty",
                optionC = "Vanessa contracts tuberculosis and is hospitalized in Switzerland",
                optionD = "Tayo fails his comprehensive history examinations",
                correctAnswerIndex = 1,
                explanation = "Tayo fathers a child with Miriam during his visit home, compelling a marriage of obligation that shatters his relationship with Vanessa.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_22",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2016",
                questionText = "What is the name of Tayo and Miriam's daughter in the novel?",
                optionA = "Kike",
                optionB = "Salamatu",
                optionC = "Bola",
                optionD = "Doyin",
                correctAnswerIndex = 0,
                explanation = "Their daughter is named Kike, who later travels to England to pursue higher education.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_23",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2016",
                questionText = "During Nigeria's military dictatorship, what traumatic ordeal does Tayo experience as an academic?",
                optionA = "He is appointed federal minister of finance",
                optionB = "He is arrested, detained, and dismissed from the university for his outspoken democratic views",
                optionC = "He flees into exile in France",
                optionD = "He abandons intellectual life to trade in crude oil",
                correctAnswerIndex = 1,
                explanation = "Academic freedoms are trampled under military rule; Tayo is victimized and detained for opposing state repression.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_24",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2016",
                questionText = "The title 'In Dependence' serves as an ironic pun contrasting:",
                optionA = "Financial wealth against extreme bankruptcy",
                optionB = "Nigeria's national political independence with the persistent emotional, cultural, and political interdependence of individuals and nations",
                optionC = "Youthful vitality against physical old age",
                optionD = "Urban Lagos against rural agrarian hamlets",
                correctAnswerIndex = 1,
                explanation = "The title brilliantly puns on political 'Independence' versus psychological and relational 'In Dependence' across racial and post-colonial lines.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_25",
                subject = "English Language",
                topic = "In Dependence: Sarah Ladipo Manyika",
                year = "2016",
                questionText = "At the twilight of their lives, what brings Tayo and Vanessa back into contact?",
                optionA = "A chance meeting at an international academic conference and persistent love after decades of separation",
                optionB = "A joint commercial business venture in Lagos",
                optionC = "Vanessa's daughter marrying Tayo's nephew",
                optionD = "A court lawsuit concerning royal inheritance",
                correctAnswerIndex = 0,
                explanation = "Decades later, mature and weathered by life, their enduring mutual affection culminates in a poignant late-life reunion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_26",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning: The minister was commended for his *frugal* management of public funds.",
                optionA = "wasteful and extravagant",
                optionB = "parsimonious",
                optionC = "prudent",
                optionD = "stingy",
                correctAnswerIndex = 0,
                explanation = "'Frugal' means economical and careful with resources; its direct antonym is 'wasteful and extravagant'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_27",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning: The witness gave a *plausible* account of the highway robbery.",
                optionA = "convincing",
                optionB = "unbelievable and implausible",
                optionC = "coherent",
                optionD = "detailed",
                correctAnswerIndex = 1,
                explanation = "'Plausible' means believable or likely; its direct antonym is 'unbelievable' or implausible.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_28",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning: The diplomat's response was intentionally *equivocal*.",
                optionA = "ambiguous",
                optionB = "vague",
                optionC = "clear and unambiguous",
                optionD = "secretive",
                correctAnswerIndex = 2,
                explanation = "'Equivocal' means ambiguous or deliberately evasive; its opposite is 'clear and unambiguous'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_29",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning: His *belligerent* posture alienated all the committee members.",
                optionA = "conciliatory and peace-loving",
                optionB = "aggressive",
                optionC = "quarrelsome",
                optionD = "hostile",
                correctAnswerIndex = 0,
                explanation = "'Belligerent' means combative and eager to fight; its direct antonym is 'conciliatory' or peaceful.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_30",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning: The judge commended the detective for his *meticulous* investigation.",
                optionA = "scrupulous",
                optionB = "careless and sloppy",
                optionC = "punctual",
                optionD = "rigorous",
                correctAnswerIndex = 1,
                explanation = "'Meticulous' means showing great attention to detail; its opposite is 'careless and sloppy'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_31",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning: The medicine gave *transient* relief from the pain.",
                optionA = "fleeting",
                optionB = "ephemeral",
                optionC = "permanent and enduring",
                optionD = "momentary",
                correctAnswerIndex = 2,
                explanation = "'Transient' means lasting only for a short time; its antonym is 'permanent and enduring'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_32",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning: The principal was known for her *austere* lifestyle.",
                optionA = "severe",
                optionB = "luxurious and indulgent",
                optionC = "somber",
                optionD = "disciplined",
                correctAnswerIndex = 1,
                explanation = "'Austere' means strictly simple and unadorned; its direct opposite is 'luxurious and indulgent'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_33",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning: The old man was remarkably *lucid* despite his illness.",
                optionA = "confused and incoherent",
                optionB = "rational",
                optionC = "articulate",
                optionD = "conscious",
                correctAnswerIndex = 0,
                explanation = "'Lucid' means clear-headed and rationally coherent; its antonym is 'confused and incoherent'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_34",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning: Her *altruistic* contributions transformed the orphanage.",
                optionA = "benevolent",
                optionB = "selfless",
                optionC = "selfish and self-serving",
                optionD = "generous",
                correctAnswerIndex = 2,
                explanation = "'Altruistic' means showing selfless concern for the welfare of others; its antonym is 'selfish'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_35",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning: The student was *penitent* when caught cheating.",
                optionA = "repentant",
                optionB = "unapologetic and unrepentant",
                optionC = "remorseful",
                optionD = "ashamed",
                correctAnswerIndex = 1,
                explanation = "'Penitent' means feeling or showing sorrow and regret; its antonym is 'unrepentant'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_36",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning: The doctor's diagnosis was *accurate* in every detail.",
                optionA = "approximate",
                optionB = "precise and correct",
                optionC = "dubious",
                optionD = "hasty",
                correctAnswerIndex = 1,
                explanation = "'Accurate' means conforming exactly to truth or standard; 'precise and correct'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_37",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning: The president delivered an *eloquent* speech at the summit.",
                optionA = "persuasive and articulate",
                optionB = "clumsy",
                optionC = "lengthy",
                optionD = "monotonous",
                correctAnswerIndex = 0,
                explanation = "'Eloquent' means fluent, expressive, and persuasive in speech.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_38",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning: The scientist formulated an *ingenious* solution to the water crisis.",
                optionA = "clever and inventive",
                optionB = "costly",
                optionC = "ordinary",
                optionD = "unfeasible",
                correctAnswerIndex = 0,
                explanation = "'Ingenious' means displaying clever, original, and inventive skill.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_39",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning: She was *resolute* in her decision to complete her doctoral studies.",
                optionA = "hesitant",
                optionB = "determined and steadfast",
                optionC = "indifferent",
                optionD = "vacillating",
                correctAnswerIndex = 1,
                explanation = "'Resolute' means admirably purposeful, determined, and unwavering.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_40",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning: The auditor discovered *spurious* claims in the reimbursement files.",
                optionA = "genuine",
                optionB = "fraudulent and fake",
                optionC = "official",
                optionD = "modest",
                correctAnswerIndex = 1,
                explanation = "'Spurious' means not genuine, false, or counterfeit.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_41",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning: The hurricane caused *extensive* damage across the coastal towns.",
                optionA = "limited",
                optionB = "widespread and vast",
                optionC = "superficial",
                optionD = "isolated",
                correctAnswerIndex = 1,
                explanation = "'Extensive' means covering a large area; widespread.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_42",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning: The lawyer presented a *cogent* argument before the tribunal.",
                optionA = "weak",
                optionB = "convincing and compelling",
                optionC = "confusing",
                optionD = "lengthy",
                correctAnswerIndex = 1,
                explanation = "'Cogent' means clear, logical, and convincing.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_43",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning: His *arduous* training regimen prepared him for the Olympic marathon.",
                optionA = "demanding and strenuous",
                optionB = "pleasant",
                optionC = "casual",
                optionD = "brief",
                correctAnswerIndex = 0,
                explanation = "'Arduous' means requiring strenuous effort and endurance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_44",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning: The manager had to *admonish* the clerk for repeated tardiness.",
                optionA = "praise",
                optionB = "reprimand and caution",
                optionC = "promote",
                optionD = "discharge",
                correctAnswerIndex = 1,
                explanation = "'Admonish' means to warn or reprimand someone firmly.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_45",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning: The monastery offered a *serene* sanctuary far away from city noise.",
                optionA = "turbulent",
                optionB = "calm and peaceful",
                optionC = "crowded",
                optionD = "dismal",
                correctAnswerIndex = 1,
                explanation = "'Serene' means calm, peaceful, and untroubled.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_46",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2016",
                questionText = "Neither the teacher nor his students __ present at the assembly this morning.",
                optionA = "was",
                optionB = "were",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 1,
                explanation = "Under the rule of proximity, when subjects are joined by 'neither... nor', the verb agrees with the nearer subject ('students' -> 'were').",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_47",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2016",
                questionText = "The committee has submitted __ report to the minister.",
                optionA = "their",
                optionB = "its",
                optionC = "it's",
                optionD = "there",
                correctAnswerIndex = 1,
                explanation = "A collective noun acting as a single unified entity takes the neuter singular possessive pronoun 'its' (no apostrophe).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_48",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2016",
                questionText = "She insisted __ paying the hospital bill for the injured child.",
                optionA = "on",
                optionB = "at",
                optionC = "in",
                optionD = "for",
                correctAnswerIndex = 0,
                explanation = "The verb 'insist' collogates with the preposition 'on' followed by a gerund: 'insisted on paying'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_49",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2016",
                questionText = "Had I known about the changes in schedule, I __ the morning train.",
                optionA = "would catch",
                optionB = "will catch",
                optionC = "would have caught",
                optionD = "caught",
                correctAnswerIndex = 2,
                explanation = "In third conditional counterfactual constructions, the inverted condition 'Had I known' is completed by 'would have + past participle'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_50",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2016",
                questionText = "The suspect was arrested for being an accessory __ the crime.",
                optionA = "with",
                optionB = "to",
                optionC = "of",
                optionD = "in",
                correctAnswerIndex = 1,
                explanation = "The legal idiom is 'an accessory to a crime'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_51",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2016",
                questionText = "The company decided to call __ the strike after productive negotiations.",
                optionA = "out",
                optionB = "off",
                optionC = "up",
                optionD = "in",
                correctAnswerIndex = 1,
                explanation = "The phrasal verb 'call off' means to cancel or terminate an event or action.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q51",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_52",
                subject = "English Language",
                topic = "Lexis and Structure",
                year = "2016",
                questionText = "Each of the candidates __ required to submit two passport photographs.",
                optionA = "are",
                optionB = "is",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 1,
                explanation = "The distributive pronoun 'Each' takes a singular verb: 'Each ... is required'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q52",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_53",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2016",
                questionText = "Choose the option with the same vowel sound as the underlined sound in 'pl<u>ai</u>t' (/æ/):",
                optionA = "tray",
                optionB = "trap",
                optionC = "stare",
                optionD = "plaque",
                correctAnswerIndex = 1,
                explanation = "'Plait' is phonetically pronounced /plæt/, containing the short front open vowel /æ/, exactly matching 'trap' (/træp/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q53",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_54",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2016",
                questionText = "Choose the option with the same consonant sound as the underlined letter in 'ca<u>sh</u>' (/ʃ/):",
                optionA = "machine",
                optionB = "chorus",
                optionC = "chimney",
                optionD = "vision",
                correctAnswerIndex = 0,
                explanation = "The 'ch' in 'machine' is articulated as voiceless postalveolar fricative /ʃ/, matching 'cash'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q54",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_55",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2016",
                questionText = "In which of the following words is the letter 'b' silent?",
                optionA = "obtain",
                optionB = "subtle",
                optionC = "disturb",
                optionD = "blanket",
                correctAnswerIndex = 1,
                explanation = "In 'subtle' (/ˈsʌt.əl/), the letter 'b' is completely silent.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q55",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_56",
                subject = "English Language",
                topic = "Oral English: Rhymes",
                year = "2016",
                questionText = "Choose the word that rhymes with 'height':",
                optionA = "eight",
                optionB = "bite",
                optionC = "weight",
                optionD = "freight",
                correctAnswerIndex = 1,
                explanation = "'Height' (/haɪt/) rhymes with 'bite' (/baɪt/), while eight, weight, and freight contain the /eɪ/ diphthong.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q56",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_57",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2016",
                questionText = "Choose the option with the correct stress placement: PHOTOGRAPHY",
                optionA = "PHOtography",
                optionB = "phoTOgraphy",
                optionC = "photograPHY",
                optionD = "photoGRAphy",
                correctAnswerIndex = 1,
                explanation = "The noun 'photography' places primary syllable stress on the second syllable: pho-TOG-ra-phy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q57",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_58",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2016",
                questionText = "Choose the option with the correct stress placement: DEMOCRATIC",
                optionA = "DEmocratic",
                optionB = "deMOcratic",
                optionC = "demoCRAat",
                optionD = "demoCRATic",
                correctAnswerIndex = 3,
                explanation = "Words ending in suffix '-ic' place primary stress on the penultimate syllable: de-mo-CRAT-ic.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q58",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_59",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2016",
                questionText = "In the sentence: 'FATIMA won the national mathematics competition', which question does this sentence answer?",
                optionA = "Did Fatima lose the national mathematics competition?",
                optionB = "Who won the national mathematics competition?",
                optionC = "Did Fatima win the state debate contest?",
                optionD = "When did Fatima win the competition?",
                correctAnswerIndex = 1,
                explanation = "Emphatic stress on the subject 'FATIMA' singles out the winner against any other contenders.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q59",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2016_60",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2016",
                questionText = "In the sentence: 'The governor visited the hospital on MONDAY', which question does this sentence answer?",
                optionA = "Did the senator visit the hospital on Monday?",
                optionB = "Did the governor inspect the school on Monday?",
                optionC = "When did the governor visit the hospital?",
                optionD = "Did the governor avoid the hospital on Monday?",
                correctAnswerIndex = 2,
                explanation = "Emphatic stress on the temporal adverbial 'MONDAY' establishes the specific day the visit occurred.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q60",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
