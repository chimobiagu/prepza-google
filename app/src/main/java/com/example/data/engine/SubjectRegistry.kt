package com.example.data.engine

/**
 * Configuration-driven registry of official JAMB UTME subjects.
 * Provides metadata, aliases, syllabi, categories, and question availability state.
 * Allows new subjects to be added cleanly without architectural changes.
 */
data class SubjectDefinition(
    val id: String,
    val displayName: String,
    val code: String,
    val category: SubjectCategory,
    val description: String,
    val syllabusTopics: List<String>,
    val isCoreCompulsory: Boolean = false,
    val iconName: String = "menu_book",
    val defaultQuestionCount: Int = 40
)

enum class SubjectCategory(val label: String) {
    GENERAL("General"),
    SCIENCE("Sciences"),
    COMMERCIAL("Commercial & Business"),
    ARTS_HUMANITIES("Arts & Humanities"),
    LANGUAGES("Languages & Socials")
}

object SubjectRegistry {

    val USE_OF_ENGLISH = SubjectDefinition(
        id = "english",
        displayName = "English Language",
        code = "ENG",
        category = SubjectCategory.GENERAL,
        description = "Compulsory UTME subject testing Comprehension, Lexis, Structure, and Oral English.",
        syllabusTopics = listOf(
            "Comprehension & Summary",
            "Lexis and Structure",
            "Synonyms & Antonyms",
            "Sentence Completion",
            "Idioms & Figures of Speech",
            "Oral English & Phonetics",
            "UTME Prescribed Literature"
        ),
        isCoreCompulsory = true,
        iconName = "auto_stories",
        defaultQuestionCount = 60
    )

    val MATHEMATICS = SubjectDefinition(
        id = "mathematics",
        displayName = "Mathematics",
        code = "MTH",
        category = SubjectCategory.SCIENCE,
        description = "Core quantitative subject testing Algebra, Geometry, Trigonometry, Calculus, and Statistics.",
        syllabusTopics = listOf(
            "Number Bases & Modular Arithmetic",
            "Fractions, Decimals & Approximations",
            "Indices, Logarithms & Surds",
            "Sets, Relations & Functions",
            "Progressions (AP & GP)",
            "Quadratic & Polynomial Equations",
            "Simultaneous & Linear Equations",
            "Matrices & Determinants",
            "Trigonometry & Ratios",
            "Coordinate Geometry & Straight Lines",
            "Differentiation & Integration",
            "Statistics & Probability",
            "Permutations & Combinations"
        ),
        iconName = "calculate",
        defaultQuestionCount = 40
    )

    val BIOLOGY = SubjectDefinition(
        id = "biology",
        displayName = "Biology",
        code = "BIO",
        category = SubjectCategory.SCIENCE,
        description = "Life sciences examining Cell Biology, Physiology, Genetics, Ecology, and Evolution.",
        syllabusTopics = listOf(
            "Cell Biology & Organization of Life",
            "Plant & Animal Nutrition",
            "Transport Systems in Organisms",
            "Respiration & Gaseous Exchange",
            "Excretion & Osmoregulation",
            "Coordination & Nervous System",
            "Reproduction & Growth",
            "Genetics & Heredity",
            "Ecology & Ecosystems",
            "Evolution & Adaptation"
        ),
        iconName = "biotech",
        defaultQuestionCount = 40
    )

    val CHEMISTRY = SubjectDefinition(
        id = "chemistry",
        displayName = "Chemistry",
        code = "CHM",
        category = SubjectCategory.SCIENCE,
        description = "Physical, Organic, and Inorganic Chemistry principles and applications.",
        syllabusTopics = listOf(
            "Separation of Mixtures & Purification",
            "Atomic Structure & Periodic Table",
            "Chemical Bonding & Shapes of Molecules",
            "Stoichiometry & Mole Concept",
            "Gas Laws & Kinetic Theory",
            "Acids, Bases & Salts",
            "Chemical Energetics & Thermodynamics",
            "Rates of Reaction & Equilibrium",
            "Redox Reactions & Electrochemistry",
            "Non-Metals & Their Compounds",
            "Metals & Extraction Metallurgy",
            "Organic Chemistry & Hydrocarbons",
            "Functional Groups & Polymers"
        ),
        iconName = "science",
        defaultQuestionCount = 40
    )

    val PHYSICS = SubjectDefinition(
        id = "physics",
        displayName = "Physics",
        code = "PHY",
        category = SubjectCategory.SCIENCE,
        description = "Fundamental principles of Mechanics, Thermal Physics, Waves, Optics, Electricity, and Modern Physics.",
        syllabusTopics = listOf(
            "Units, Dimensions & Measurements",
            "Scalars & Vectors",
            "Motion, Speed & Acceleration",
            "Projectiles & Circular Motion",
            "Newton's Laws of Motion & Momentum",
            "Work, Energy & Power",
            "Machines & Mechanical Advantage",
            "Elasticity & Hooke's Law",
            "Fluid Statics, Pressure & Archimedes",
            "Thermal Physics, Heat & Gas Laws",
            "Waves & Sound Propagation",
            "Optics, Reflection & Refraction",
            "Electrostatics & Electric Fields",
            "Current Electricity & Circuits",
            "Magnetism & Electromagnetism",
            "Atomic & Modern Physics"
        ),
        iconName = "bolt",
        defaultQuestionCount = 40
    )

    val ECONOMICS = SubjectDefinition(
        id = "economics",
        displayName = "Economics",
        code = "ECO",
        category = SubjectCategory.COMMERCIAL,
        description = "Principles of Microeconomics, Macroeconomics, Public Finance, Money & Banking, and International Trade.",
        syllabusTopics = listOf(
            "Basic Economic Concepts (Scarcity & Choice)",
            "Theory of Demand and Supply",
            "Elasticity of Demand & Supply",
            "Theory of Production & Cost",
            "Market Structures & Price Determination",
            "Business Organizations & Firms",
            "National Income Accounting",
            "Money and Banking Systems",
            "Inflation, Deflation & Monetary Policy",
            "Public Finance & Taxation",
            "International Trade & Balance of Payments",
            "Economic Development & Planning"
        ),
        iconName = "trending_up",
        defaultQuestionCount = 40
    )

    val GOVERNMENT = SubjectDefinition(
        id = "government",
        displayName = "Government",
        code = "GOV",
        category = SubjectCategory.ARTS_HUMANITIES,
        description = "Political concepts, governance systems, constitutional developments, and Nigerian political history.",
        syllabusTopics = listOf(
            "Basic Political Concepts & Ideologies",
            "Forms of Government (Democracy, Federalism)",
            "Arms of Government & Rule of Law",
            "Elections, Parties & Pressure Groups",
            "Public Administration & Civil Service",
            "Pre-Colonial Administration in Nigeria",
            "Colonial Rule & Indirect Rule System",
            "Constitutional Development in Nigeria",
            "Post-Independence Politics & Republics",
            "Military Rule in Nigerian History",
            "Nigerian Foreign Policy",
            "International Organizations (UN, AU, ECOWAS)"
        ),
        iconName = "account_balance",
        defaultQuestionCount = 40
    )

    val LITERATURE = SubjectDefinition(
        id = "literature",
        displayName = "Literature in English",
        code = "LIT",
        category = SubjectCategory.ARTS_HUMANITIES,
        description = "Study of African and Non-African Prose, Drama, Poetry, and Literary Appreciation.",
        syllabusTopics = listOf(
            "Literary Principles & Devices",
            "African Prose",
            "Non-African Prose",
            "African Drama",
            "Non-African Drama",
            "African Poetry",
            "Non-African Poetry",
            "General Literary Appreciation"
        ),
        iconName = "menu_book",
        defaultQuestionCount = 40
    )

    val COMMERCE = SubjectDefinition(
        id = "commerce",
        displayName = "Commerce",
        code = "COM",
        category = SubjectCategory.COMMERCIAL,
        description = "Commercial activities, trade, marketing, banking, transport, insurance, and business management.",
        syllabusTopics = listOf(
            "Introduction to Commerce & Production",
            "Home Trade (Wholesale & Retail)",
            "Foreign Trade & Documents",
            "Advertising & Sales Promotion",
            "Transportation & Communication",
            "Warehousing & Inventory",
            "Banking & Financial Institutions",
            "Insurance Principles & Types",
            "Capital Market & Stock Exchange",
            "Business Management & Structure",
            "Consumer Protection & Trade Law",
            "E-Commerce & Digital Business"
        ),
        iconName = "storefront",
        defaultQuestionCount = 40
    )

    val CRS = SubjectDefinition(
        id = "crs",
        displayName = "CRS",
        code = "CRS",
        category = SubjectCategory.ARTS_HUMANITIES,
        description = "Christian Religious Studies covering Old Testament, Synoptic Gospels, Early Church, and Christian Living.",
        syllabusTopics = listOf(
            "Sovereignty and Faith of God",
            "Covenant and Leadership in Israel",
            "Kingship and Prophets in Israel",
            "The Birth and Ministry of Jesus",
            "The Passion, Death and Resurrection of Christ",
            "The Early Church and the Apostles (Acts)",
            "Pauline Epistles and Christian Ethics",
            "Faith and Works in Contemporary Society"
        ),
        iconName = "church",
        defaultQuestionCount = 40
    )

    val IRS = SubjectDefinition(
        id = "irs",
        displayName = "Islamic Religious Studies (IRS)",
        code = "IRS",
        category = SubjectCategory.ARTS_HUMANITIES,
        description = "Islamic studies covering Tawhid, Fiqh, Quranic studies, Hadith, Sirah of the Prophet (SAW), and Caliphate history.",
        syllabusTopics = listOf(
            "Tawhid & Pillars of Faith (Iman)",
            "Pillars of Islam (Ibadah & Fiqh)",
            "Quranic Studies & Prescribed Surahs",
            "Hadith & Sunnah of the Prophet",
            "Sirah (Biography of Prophet Muhammad SAW)",
            "The Rightly Guided Caliphs (Khulafa' al-Rashidun)",
            "Islamic Law (Shari'ah) & Ethics",
            "Islam in West Africa & Contemporary Relevance"
        ),
        iconName = "mosque",
        defaultQuestionCount = 40
    )

    val HISTORY = SubjectDefinition(
        id = "history",
        displayName = "History",
        code = "HIS",
        category = SubjectCategory.ARTS_HUMANITIES,
        description = "Nigerian, West African, and World History from pre-colonial antiquity to modern times.",
        syllabusTopics = listOf(
            "Sources & Historiography of African History",
            "Pre-Colonial Nigerian Kingdoms & Empires",
            "Kanem-Borno & Hausa States",
            "Benin Kingdom & Oyo Empire",
            "Sokoto Caliphate & Islamic Revolutions",
            "Trans-Atlantic & Trans-Saharan Trade",
            "British Conquest & Colonial Administration",
            "Nationalist Movements & Constitutional Reforms",
            "Independent Nigeria & First Republic",
            "Nigerian Civil War & Reconstruction",
            "Pan-Africanism & African Diaspora"
        ),
        iconName = "history_edu",
        defaultQuestionCount = 40
    )

    val GEOGRAPHY = SubjectDefinition(
        id = "geography",
        displayName = "Geography",
        code = "GEO",
        category = SubjectCategory.ARTS_HUMANITIES,
        description = "Physical geography, human geography, regional geography of Nigeria, map work, and environmental studies.",
        syllabusTopics = listOf(
            "The Earth and the Solar System",
            "Rocks, Weathering & Mass Wasting",
            "Landforms & Geomorphology",
            "Atmosphere, Weather & Climatology",
            "Vegetation Belts & Soils",
            "Map Reading & Cartography",
            "Human Population & Urbanization",
            "Agriculture & Mineral Resources",
            "Regional Geography of Nigeria",
            "Transportation & Regional Cooperation",
            "Environmental Hazards & Conservation"
        ),
        iconName = "public",
        defaultQuestionCount = 40
    )

    val PRINCIPLES_OF_ACCOUNTS = SubjectDefinition(
        id = "principles_of_accounts",
        displayName = "Principles of Accounts",
        code = "ACC",
        category = SubjectCategory.COMMERCIAL,
        description = "Bookkeeping, ledger accounting, financial statements, partnership, company accounts, and bank reconciliation.",
        syllabusTopics = listOf(
            "Principles of Double Entry Bookkeeping",
            "Books of Original Entry & Journals",
            "Ledger Accounts & Trial Balance",
            "Bank Reconciliation Statements",
            "Control Accounts & Self-Balancing Ledgers",
            "Correction of Errors & Suspense Account",
            "Final Accounts of Sole Traders",
            "Adjustments in Final Accounts",
            "Manufacturing Accounts",
            "Non-Profit Organizations & Subscriptions",
            "Partnership Accounts & Goodwill",
            "Company Accounts & Share Capital",
            "Incomplete Records & Single Entry"
        ),
        iconName = "receipt_long",
        defaultQuestionCount = 40
    )

    val FURTHER_MATHEMATICS = SubjectDefinition(
        id = "further_mathematics",
        displayName = "Further Mathematics",
        code = "FMTH",
        category = SubjectCategory.SCIENCE,
        description = "Advanced mathematics covering Pure Mathematics, Statistics, and Mechanics for science & engineering aspirants.",
        syllabusTopics = listOf(
            "Matrices, Determinants & Linear Transformations",
            "Vectors in 2D & 3D Space",
            "Polynomials & Partial Fractions",
            "Binomial Theorem & Power Series",
            "Conic Sections (Parabola, Ellipse, Hyperbola)",
            "Trigonometric Identities & Equations",
            "Advanced Differentiation & Integration",
            "Differential Equations & Applications",
            "Probability Distributions (Binomial, Poisson, Normal)",
            "Correlation & Regression Analysis",
            "Statics, Dynamics & Projectiles",
            "Momentum, Impulse & Collisions"
        ),
        iconName = "functions",
        defaultQuestionCount = 40
    )

    private val allSubjectDefinitions = listOf(
        USE_OF_ENGLISH,
        MATHEMATICS,
        BIOLOGY,
        CHEMISTRY,
        PHYSICS,
        ECONOMICS,
        GOVERNMENT,
        LITERATURE,
        COMMERCE,
        CRS,
        IRS,
        HISTORY,
        GEOGRAPHY,
        PRINCIPLES_OF_ACCOUNTS,
        FURTHER_MATHEMATICS
    )

    private val subjectMap: Map<String, SubjectDefinition> = allSubjectDefinitions.associateBy { it.displayName.lowercase() }

    private val aliasMap: Map<String, String> = mapOf(
        "english" to "English Language",
        "english language" to "English Language",
        "use of english" to "English Language",
        "math" to "Mathematics",
        "maths" to "Mathematics",
        "mathematics" to "Mathematics",
        "bio" to "Biology",
        "biology" to "Biology",
        "chem" to "Chemistry",
        "chemistry" to "Chemistry",
        "phy" to "Physics",
        "physics" to "Physics",
        "eco" to "Economics",
        "economics" to "Economics",
        "gov" to "Government",
        "government" to "Government",
        "lit" to "Literature in English",
        "literature" to "Literature in English",
        "literature in english" to "Literature in English",
        "com" to "Commerce",
        "commerce" to "Commerce",
        "crs" to "CRS",
        "christian religious studies" to "CRS",
        "christian religious knowledge" to "CRS",
        "crk" to "CRS",
        "irs" to "Islamic Religious Studies (IRS)",
        "islamic religious studies" to "Islamic Religious Studies (IRS)",
        "islamic religious studies (irs)" to "Islamic Religious Studies (IRS)",
        "irk" to "Islamic Religious Studies (IRS)",
        "islamic studies" to "Islamic Religious Studies (IRS)",
        "his" to "History",
        "history" to "History",
        "geo" to "Geography",
        "geography" to "Geography",
        "acc" to "Principles of Accounts",
        "accounts" to "Principles of Accounts",
        "financial accounting" to "Principles of Accounts",
        "principles of accounts" to "Principles of Accounts",
        "accounting" to "Principles of Accounts",
        "fmth" to "Further Mathematics",
        "further maths" to "Further Mathematics",
        "further mathematics" to "Further Mathematics"
    )

    fun getAllSubjects(): List<SubjectDefinition> = allSubjectDefinitions

    fun getSubjectsByCategory(category: SubjectCategory): List<SubjectDefinition> =
        allSubjectDefinitions.filter { it.category == category }

    fun normalizeSubjectName(raw: String): String {
        val clean = raw.trim().lowercase()
        return aliasMap[clean] ?: allSubjectDefinitions.firstOrNull { it.displayName.equals(raw.trim(), ignoreCase = true) }?.displayName ?: raw.trim()
    }

    fun isAllowedSubject(subject: String): Boolean {
        val norm = normalizeSubjectName(subject)
        return subjectMap.containsKey(norm.lowercase()) || aliasMap.containsKey(subject.trim().lowercase())
    }

    fun getSubjectDefinition(subject: String): SubjectDefinition? {
        val norm = normalizeSubjectName(subject)
        return subjectMap[norm.lowercase()]
    }

    fun getAllSubjectNames(): List<String> = allSubjectDefinitions.map { it.displayName }
}
