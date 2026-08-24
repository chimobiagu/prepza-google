package com.example.data.engine

import java.util.Locale

object CbtBlueprint {

    const val ENGLISH_MANDATORY_COUNT = 60
    const val ELECTIVE_STANDARD_COUNT = 40
    const val TOTAL_CBT_QUESTIONS = 180
    const val MINI_CBT_QUESTIONS = 20
    const val FULL_EXAM_DURATION_SECONDS = 7200L // 2 Hours
    const val MINI_EXAM_DURATION_SECONDS = 1200L // 20 Minutes

    /**
     * Standardized subject names according to JAMB UTME nomenclature.
     */
    val SUPPORTED_SUBJECTS = listOf(
        "English Language",
        "Mathematics",
        "Physics",
        "Chemistry",
        "Biology",
        "Economics",
        "Government",
        "Literature in English",
        "CRS",
        "Commerce",
        "Principles of Accounts"
    )

    /**
     * Key syllabus topics per subject to ensure balanced coverage across syllabus branches.
     */
    val SUBJECT_TOPIC_DOMAINS: Map<String, List<String>> = mapOf(
        "English Language" to listOf(
            "Comprehension",
            "Lexis and Structure",
            "Sentence Completion",
            "Antonyms and Synonyms",
            "Idioms and Figurative Expressions",
            "Oral English (Vowels & Consonants)",
            "Stress Patterns and Intonation",
            "Concord and Grammatical Agreement"
        ),
        "Mathematics" to listOf(
            "Number Bases and Modular Arithmetic",
            "Indices, Logarithms and Surds",
            "Algebraic Operations and Polynomials",
            "Simultaneous and Quadratic Equations",
            "Sequences and Series (AP & GP)",
            "Variation and Ratio",
            "Geometry and Polygon Angles",
            "Trigonometry and Bearings",
            "Coordinate Geometry and Straight Lines",
            "Calculus (Differentiation & Integration)",
            "Matrices and Determinants",
            "Statistics, Probability and Permutations"
        ),
        "Physics" to listOf(
            "Scalar and Vector Quantities",
            "Linear Kinematics and Motion",
            "Dynamics, Force and Friction",
            "Work, Energy and Power",
            "Simple Harmonic Motion and Elasticity",
            "Gravitation and Planetary Motion",
            "Fluid Mechanics and Pressure",
            "Thermal Physics and Gas Laws",
            "Waves and Sound Resonance",
            "Optics, Refraction and Lenses",
            "Electrostatics and Capacitance",
            "Current Electricity and Resistance",
            "Magnetic Fields and Induction",
            "Modern Physics, Radioactivity and Atomic Structure"
        ),
        "Chemistry" to listOf(
            "Separation of Mixtures and Purification",
            "Atomic Structure and Electron Configuration",
            "Periodic Table and Periodic Properties",
            "Chemical Bonding and Molecular Geometry",
            "Stoichiometry and Mole Concept",
            "Gas Laws and Kinetic Theory",
            "Acids, Bases, Salts and pH",
            "Oxidation-Reduction and Redox Reactions",
            "Electrochemistry and Electrolysis",
            "Chemical Energetics and Thermodynamics",
            "Chemical Kinetics and Equilibrium",
            "Non-Metals and Their Compounds",
            "Metals and Qualitative Inorganic Analysis",
            "Hydrocarbons (Alkanes, Alkenes, Alkynes)",
            "Organic Functional Groups and Polymers"
        ),
        "Biology" to listOf(
            "Cell Structure, Functions and Organization",
            "Cell Division (Mitosis and Meiosis)",
            "Plant Physiology (Photosynthesis, Transpiration)",
            "Animal Nutrition and Digestive Enzymes",
            "Circulatory System and Blood Groups",
            "Respiratory System and Gas Exchange",
            "Excretory System and Osmoregulation",
            "Nervous System, Sense Organs and Hormones",
            "Reproduction in Plants and Animals",
            "Genetics, Heredity and Variation",
            "Ecology, Biomes and Ecosystem Dynamics",
            "Soil Science and Nutrient Cycles",
            "Microorganisms, Pathogens and Immunology",
            "Evolution and Adaptation"
        ),
        "Economics" to listOf(
            "Basic Concepts (Scarcity, Choice, Opportunity Cost)",
            "Production Possibility Curve (PPC)",
            "Demand, Supply and Price Determination",
            "Elasticity of Demand and Supply",
            "Theory of Production and Diminishing Returns",
            "Cost and Revenue Concepts",
            "Market Structures (Perfect & Imperfect)",
            "National Income Accounting",
            "Money, Inflation and Banking Systems",
            "Public Finance, Taxation and Fiscal Policy",
            "International Trade and Balance of Payments",
            "Economic Development and Population"
        ),
        "Government" to listOf(
            "Basic Concepts of Government (State, Nation, Power)",
            "Forms and Systems of Government",
            "Rule of Law and Separation of Powers",
            "Political Parties and Electoral Systems",
            "Public Administration and Civil Service",
            "Pre-Colonial Political Systems in Nigeria",
            "Colonial Administration and Indirect Rule",
            "Constitutional Development in Nigeria",
            "Nigerian Federalism and Structure",
            "Foreign Policy and International Organizations"
        ),
        "Literature in English" to listOf(
            "Literary Terms and Appreciation",
            "Figures of Speech and Rhetoric",
            "Dramatic Techniques and Theatre",
            "Poetic Forms, Meter and Rhyme",
            "Prescribed Drama Analysis",
            "Prescribed African & Non-African Prose",
            "Prescribed African & Non-African Poetry"
        ),
        "CRS" to listOf(
            "Creation Story and Fall of Man",
            "Abrahamic Covenant and Faith",
            "Exodus, Sinai Covenant and Mosaic Law",
            "Judges and Early Monarchy of Israel",
            "Prophets and Social Justice",
            "Birth, Baptism and Temptation of Jesus",
            "Ministry, Parables and Miracles of Jesus",
            "Passion, Death and Resurrection of Christ",
            "Early Church, Pentecost and Fellowship",
            "Paul's Missionary Journeys and Epistles"
        ),
        "Commerce" to listOf(
            "Introduction to Commerce and Production",
            "Home Trade (Wholesale and Retail)",
            "Foreign Trade and Documents",
            "Banking and Financial Services",
            "Insurance and Risk Management",
            "Transportation, Communication and Warehousing",
            "Advertising and Public Relations",
            "Business Organizations and Capital Structure",
            "Consumer Protection and Regulatory Agencies"
        ),
        "Principles of Accounts" to listOf(
            "Accounting Concepts, Principles and Equations",
            "Double Entry System and Ledger Accounts",
            "Books of Prime Entry and Cash Books",
            "Bank Reconciliation Statements",
            "Trial Balance and Correction of Errors",
            "Trading, Profit and Loss Accounts",
            "Balance Sheet and Final Accounts",
            "Depreciation of Fixed Assets",
            "Partnership Accounts",
            "Manufacturing and Non-Profit Accounts"
        )
    )

    /**
     * Identifies if a question is comprehension/passage based.
     */
    fun isComprehensionQuestion(question: com.example.data.db.QuestionEntity): Boolean {
        val topic = question.topic.lowercase(Locale.ROOT)
        val text = question.questionText.lowercase(Locale.ROOT)
        return topic.contains("comprehension") ||
                topic.contains("passage") ||
                !question.passageText.isNullOrBlank() ||
                text.contains("according to the passage") ||
                text.contains("from the passage") ||
                text.contains("the writer states") ||
                text.contains("the passage suggests")
    }
}
