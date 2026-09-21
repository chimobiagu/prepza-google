package com.example.data.learning

/**
 * Single source of truth for the complete PREPZA Subject -> Topic Database.
 * Contains all 14 UTME subjects and their strictly ordered 25 syllabus topics each.
 * Flashcards list is structured and ready for future content expansion.
 */
object TopicDatabase {

    private fun createTopic(
        subjectId: String,
        subjectName: String,
        topicName: String,
        order: Int,
        description: String? = null
    ): PrepzaTopic {
        val safeSlug = topicName.lowercase()
            .replace("'", "")
            .replace(",", "")
            .replace("(", "")
            .replace(")", "")
            .replace("/", "-")
            .replace("&", "and")
            .trim()
            .replace(Regex("\\s+"), "-")

        val id = "$subjectId-$safeSlug"
        val cards = TopicContentRepository.getFlashcards(subjectId, topicName, id)
        return PrepzaTopic(
            id = id,
            subjectId = subjectId,
            subjectName = subjectName,
            topicName = topicName,
            displayOrder = order,
            description = description ?: "Syllabus requirements, fundamental concepts, and exam questions for $topicName in $subjectName.",
            flashcards = cards,
            recallQuestions = emptyList()
        )
    }

    // 1. USE OF ENGLISH
    private val useOfEnglishTopics = listOf(
        "Comprehension",
        "Lexis and Vocabulary",
        "Synonyms",
        "Antonyms",
        "Idioms",
        "Sentence Interpretation",
        "Sentence Completion",
        "Word Classes",
        "Nouns",
        "Pronouns",
        "Verbs",
        "Adjectives",
        "Adverbs",
        "Prepositions",
        "Conjunctions",
        "Concord",
        "Tenses",
        "Punctuation",
        "Registers",
        "Oral English",
        "Vowels",
        "Consonants",
        "Stress",
        "Intonation",
        "Figures of Speech"
    ).mapIndexed { index, name ->
        createTopic("english", "Use of English", name, index + 1)
    }

    // 2. MATHEMATICS
    private val mathematicsTopics = listOf(
        "Number Bases",
        "Fractions",
        "Decimals",
        "Percentages",
        "Ratios and Proportion",
        "Approximation",
        "Indices",
        "Logarithms",
        "Surds",
        "Sets",
        "Algebraic Expressions",
        "Linear Equations",
        "Simultaneous Equations",
        "Quadratic Equations",
        "Inequalities",
        "Sequences and Series",
        "Variation",
        "Geometry",
        "Mensuration",
        "Trigonometry",
        "Coordinate Geometry",
        "Statistics",
        "Probability",
        "Matrices",
        "Vectors"
    ).mapIndexed { index, name ->
        createTopic("mathematics", "Mathematics", name, index + 1)
    }

    // 3. PHYSICS
    private val physicsTopics = listOf(
        "Measurements and Units",
        "Scalars and Vectors",
        "Motion",
        "Speed and Velocity",
        "Acceleration",
        "Force",
        "Newton's Laws of Motion",
        "Work, Energy and Power",
        "Momentum",
        "Simple Machines",
        "Pressure",
        "Density",
        "Heat",
        "Temperature",
        "Thermal Expansion",
        "Waves",
        "Sound",
        "Light",
        "Electricity",
        "Magnetism",
        "Electromagnetic Induction",
        "Electronics",
        "Atomic Physics",
        "Nuclear Physics",
        "Energy Resources"
    ).mapIndexed { index, name ->
        createTopic("physics", "Physics", name, index + 1)
    }

    // 4. CHEMISTRY
    private val chemistryTopics = listOf(
        "Matter",
        "Atomic Structure",
        "Periodic Table",
        "Chemical Bonding",
        "Chemical Formulae",
        "Mole Concept",
        "Stoichiometry",
        "Chemical Reactions",
        "Acids",
        "Bases",
        "Salts",
        "Oxidation and Reduction",
        "Electrochemistry",
        "Gas Laws",
        "Solutions",
        "Solubility",
        "Rates of Reaction",
        "Chemical Equilibrium",
        "Organic Chemistry",
        "Hydrocarbons",
        "Alcohols",
        "Carboxylic Acids",
        "Polymers",
        "Petroleum",
        "Environmental Chemistry"
    ).mapIndexed { index, name ->
        createTopic("chemistry", "Chemistry", name, index + 1)
    }

    // 5. BIOLOGY
    private val biologyTopics = listOf(
        "Characteristics of Living Things",
        "Cell Structure",
        "Cell Functions",
        "Biological Organisation",
        "Classification",
        "Nutrition",
        "Digestive System",
        "Respiration",
        "Transport System",
        "Excretion",
        "Support and Movement",
        "Reproduction",
        "Growth",
        "Coordination",
        "Nervous System",
        "Hormones",
        "Genetics",
        "Evolution",
        "Ecology",
        "Food Chains and Food Webs",
        "Population",
        "Adaptation",
        "Microorganisms",
        "Diseases",
        "Conservation"
    ).mapIndexed { index, name ->
        createTopic("biology", "Biology", name, index + 1)
    }

    // 6. ECONOMICS
    private val economicsTopics = listOf(
        "Basic Economic Concepts",
        "Scarcity",
        "Opportunity Cost",
        "Production",
        "Factors of Production",
        "Division of Labour",
        "Scale of Production",
        "Demand",
        "Supply",
        "Price Determination",
        "Elasticity",
        "Market Structures",
        "Money",
        "Banking",
        "Inflation",
        "Unemployment",
        "National Income",
        "Economic Growth",
        "Economic Development",
        "Public Finance",
        "Taxation",
        "International Trade",
        "Balance of Payments",
        "Population",
        "Nigerian Economy"
    ).mapIndexed { index, name ->
        createTopic("economics", "Economics", name, index + 1)
    }

    // 7. GOVERNMENT
    private val governmentTopics = listOf(
        "Meaning of Government",
        "State",
        "Power and Authority",
        "Sovereignty",
        "Democracy",
        "Constitutionalism",
        "Rule of Law",
        "Separation of Powers",
        "Checks and Balances",
        "Citizenship",
        "Political Parties",
        "Pressure Groups",
        "Public Opinion",
        "Electoral Systems",
        "Elections",
        "Nigerian Constitution",
        "Federalism",
        "Local Government",
        "Legislature",
        "Executive",
        "Judiciary",
        "Nigerian Political Development",
        "Military Rule",
        "Foreign Policy",
        "International Organisations"
    ).mapIndexed { index, name ->
        createTopic("government", "Government", name, index + 1)
    }

    // 8. LITERATURE IN ENGLISH
    private val literatureTopics = listOf(
        "Meaning of Literature",
        "Genres of Literature",
        "Prose",
        "Poetry",
        "Drama",
        "Plot",
        "Setting",
        "Characterisation",
        "Theme",
        "Conflict",
        "Point of View",
        "Narrator",
        "Symbolism",
        "Irony",
        "Metaphor",
        "Simile",
        "Personification",
        "Imagery",
        "Diction",
        "Tone",
        "Mood",
        "Satire",
        "Tragedy",
        "Comedy",
        "Literary Analysis"
    ).mapIndexed { index, name ->
        createTopic("literature", "Literature in English", name, index + 1)
    }

    // 9. COMMERCE
    private val commerceTopics = listOf(
        "Meaning of Commerce",
        "Trade",
        "Home Trade",
        "Foreign Trade",
        "Occupation",
        "Production",
        "Factors of Production",
        "Business Units",
        "Sole Proprietorship",
        "Partnership",
        "Companies",
        "Public Enterprises",
        "Trade Associations",
        "Channels of Distribution",
        "Warehousing",
        "Transportation",
        "Communication",
        "Banking",
        "Insurance",
        "Advertising",
        "Stock Exchange",
        "Consumer Protection",
        "Business Finance",
        "International Trade",
        "Aids to Trade"
    ).mapIndexed { index, name ->
        createTopic("commerce", "Commerce", name, index + 1)
    }

    // 10. CRS
    private val crsTopics = listOf(
        "Creation",
        "The Fall of Man",
        "Cain and Abel",
        "Noah",
        "Abraham",
        "Isaac",
        "Jacob",
        "Joseph",
        "Moses",
        "Joshua",
        "Judges",
        "Kingship in Israel",
        "David",
        "Solomon",
        "Prophets",
        "Birth of Jesus",
        "Ministry of Jesus",
        "Miracles",
        "Parables",
        "Death and Resurrection",
        "Early Church",
        "Paul's Conversion",
        "Paul's Missionary Journeys",
        "Christian Conduct",
        "Love, Faith and Service"
    ).mapIndexed { index, name ->
        createTopic("crs", "CRS", name, index + 1)
    }

    // 11. PRINCIPLES OF ACCOUNTS
    private val accountsTopics = listOf(
        "Meaning of Accounting",
        "Accounting Concepts",
        "Accounting Principles",
        "Source Documents",
        "Double Entry",
        "Books of Original Entry",
        "Ledger",
        "Trial Balance",
        "Cash Book",
        "Bank Reconciliation",
        "Petty Cash",
        "Control Accounts",
        "Errors and Suspense Accounts",
        "Depreciation",
        "Bad Debts",
        "Final Accounts",
        "Trading Account",
        "Profit and Loss Account",
        "Balance Sheet",
        "Manufacturing Account",
        "Partnership Accounts",
        "Company Accounts",
        "Incomplete Records",
        "Not-for-Profit Accounts",
        "Accounting Ratios"
    ).mapIndexed { index, name ->
        createTopic("accounts", "Principles of Accounts", name, index + 1)
    }

    // 12. GEOGRAPHY
    private val geographyTopics = listOf(
        "Earth and Solar System",
        "Latitude and Longitude",
        "Time",
        "Maps",
        "Map Reading",
        "Scale",
        "Relief",
        "Rocks",
        "Weathering",
        "Erosion",
        "Rivers",
        "Coastal Processes",
        "Climate",
        "Weather",
        "Vegetation",
        "Soils",
        "Population",
        "Settlement",
        "Agriculture",
        "Mining",
        "Manufacturing",
        "Transportation",
        "Environmental Resources",
        "Environmental Hazards",
        "Nigeria's Geography"
    ).mapIndexed { index, name ->
        createTopic("geography", "Geography", name, index + 1)
    }

    // 13. HISTORY
    private val historyTopics = listOf(
        "Meaning of History",
        "Sources of History",
        "Early Nigerian Societies",
        "Hausa States",
        "Kanem-Bornu",
        "Oyo Empire",
        "Benin Kingdom",
        "Igbo Society",
        "Trans-Saharan Trade",
        "Trans-Atlantic Slave Trade",
        "Christian Missionaries",
        "European Exploration",
        "Colonial Rule",
        "Amalgamation",
        "Nationalism",
        "Nigerian Independence",
        "First Republic",
        "Military Rule",
        "Nigerian Civil War",
        "Second Republic",
        "Third Republic",
        "Fourth Republic",
        "African Nationalism",
        "Decolonisation",
        "International Relations"
    ).mapIndexed { index, name ->
        createTopic("history", "History", name, index + 1)
    }

    // 14. ISLAMIC RELIGIOUS STUDIES (IRS)
    private val irsTopics = listOf(
        "Tawhid",
        "Shirk",
        "Qur'an",
        "Revelation",
        "Hadith",
        "Sunnah",
        "Fiqh",
        "Salah",
        "Sawm",
        "Zakah",
        "Hajj",
        "Purification",
        "Islamic Morality",
        "Family Life",
        "Marriage",
        "Islamic Economic Principles",
        "Islamic Political Principles",
        "Prophet Muhammad",
        "Hijrah",
        "Madinah",
        "Islamic Community",
        "Islamic Leadership",
        "Islamic History",
        "Jihad",
        "Contemporary Islamic Issues"
    ).mapIndexed { index, name ->
        createTopic("irs", "Islamic Religious Studies (IRS)", name, index + 1)
    }

    val ALL_SUBJECTS: List<PrepzaSubject> = listOf(
        PrepzaSubject("english", "Use of English", "Languages", "menu_book", useOfEnglishTopics),
        PrepzaSubject("mathematics", "Mathematics", "Sciences", "calculate", mathematicsTopics),
        PrepzaSubject("physics", "Physics", "Sciences", "bolt", physicsTopics),
        PrepzaSubject("chemistry", "Chemistry", "Sciences", "science", chemistryTopics),
        PrepzaSubject("biology", "Biology", "Sciences", "eco", biologyTopics),
        PrepzaSubject("economics", "Economics", "Commercial", "trending_up", economicsTopics),
        PrepzaSubject("government", "Government", "Arts", "account_balance", governmentTopics),
        PrepzaSubject("literature", "Literature in English", "Arts", "auto_stories", literatureTopics),
        PrepzaSubject("commerce", "Commerce", "Commercial", "storefront", commerceTopics),
        PrepzaSubject("crs", "CRS", "Arts", "bookmark", crsTopics),
        PrepzaSubject("accounts", "Principles of Accounts", "Commercial", "receipt_long", accountsTopics),
        PrepzaSubject("geography", "Geography", "Sciences", "public", geographyTopics),
        PrepzaSubject("history", "History", "Arts", "history_edu", historyTopics),
        PrepzaSubject("irs", "Islamic Religious Studies (IRS)", "Arts", "mosque", irsTopics)
    )

    private val subjectMap: Map<String, PrepzaSubject> = ALL_SUBJECTS.associateBy { it.id }

    fun getSubject(subjectIdOrName: String): PrepzaSubject? {
        val query = subjectIdOrName.lowercase().trim()
        return subjectMap[query] ?: ALL_SUBJECTS.firstOrNull {
            it.name.equals(query, ignoreCase = true) ||
                    it.name.contains(query, ignoreCase = true) ||
                    query.contains(it.name.lowercase()) ||
                    (query.contains("english") && it.id == "english") ||
                    (query.contains("math") && it.id == "mathematics") ||
                    (query.contains("account") && it.id == "accounts") ||
                    (query.contains("irs") && it.id == "irs") ||
                    (query.contains("islamic") && it.id == "irs") ||
                    (query.contains("crs") && it.id == "crs") ||
                    (query.contains("literature") && it.id == "literature")
        }
    }

    fun getTopicsForSubject(subjectIdOrName: String): List<PrepzaTopic> {
        val subject = getSubject(subjectIdOrName) ?: return emptyList()
        return subject.topics.sortedBy { it.displayOrder }
    }

    fun searchTopics(subjectIdOrName: String, query: String): List<PrepzaTopic> {
        val topics = getTopicsForSubject(subjectIdOrName)
        if (query.isBlank()) return topics
        val trimmed = query.trim().lowercase()
        return topics.filter {
            it.topicName.lowercase().contains(trimmed) ||
                    (it.description?.lowercase()?.contains(trimmed) == true)
        }
    }

    fun findTopic(subjectIdOrName: String, topicNameOrId: String): PrepzaTopic? {
        val topics = getTopicsForSubject(subjectIdOrName)
        val query = topicNameOrId.trim().lowercase()
        return topics.firstOrNull {
            it.id.equals(query, ignoreCase = true) ||
                    it.topicName.equals(query, ignoreCase = true) ||
                    it.topicName.lowercase().contains(query) ||
                    query.contains(it.topicName.lowercase())
        }
    }

    fun toSubjectCurriculum(subject: PrepzaSubject): SubjectCurriculum {
        val packs = subject.topics.sortedBy { it.displayOrder }.map { it.toLearningPack() }
        val group = TopicGroup(
            groupName = "UTME Syllabus Topics",
            description = "All 25 official JAMB topics in order",
            topics = packs
        )
        return SubjectCurriculum(
            subjectId = subject.id,
            subjectName = subject.name,
            category = subject.category,
            iconName = subject.iconName,
            groups = listOf(group)
        )
    }
}
