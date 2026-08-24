package com.example.data.engine

import com.example.data.db.QuestionEntity
import java.util.UUID

object PrepzaAiQuestionEngine {

    const val ORIGIN_TYPE_AI = "AI_GENERATED"
    const val ORIGIN_LABEL_AI = "Prepza AI Generated"

    /**
     * Generates a verified, syllabus-aligned fallback question for a specific subject and topic
     * when the authentic question bank pool has been exhausted.
     */
    fun generateFallbackQuestion(
        subject: String,
        topic: String? = null,
        difficulty: String = "Medium",
        indexSeed: Int = 0
    ): QuestionEntity {
        val normSubject = when (subject.trim().lowercase()) {
            "english", "use of english", "english language" -> "English Language"
            "math", "mathematics" -> "Mathematics"
            "physics" -> "Physics"
            "chemistry" -> "Chemistry"
            "biology" -> "Biology"
            "economics" -> "Economics"
            "government" -> "Government"
            "literature", "literature in english" -> "Literature in English"
            "crs", "crk" -> "CRS"
            "commerce" -> "Commerce"
            "financial accounting", "principles of accounts", "principles of account", "accounting" -> "Principles of Accounts"
            else -> subject.trim()
        }

        val template = getSyllabusQuestionTemplate(normSubject, topic, indexSeed)
        val uniqueId = "ai_q_${normSubject.take(3).lowercase()}_${System.currentTimeMillis()}_${(1000..9999).random()}"

        return QuestionEntity(
            id = uniqueId,
            subject = normSubject,
            topic = template.topic,
            year = "Syllabus Drill",
            questionText = template.questionText,
            optionA = template.optionA,
            optionB = template.optionB,
            optionC = template.optionC,
            optionD = template.optionD,
            correctAnswerIndex = template.correctAnswerIndex,
            explanation = template.explanation,
            passageText = template.passageText,
            difficulty = difficulty,
            originType = ORIGIN_TYPE_AI,
            originLabel = ORIGIN_LABEL_AI,
            isVerifiedJamb = false
        )
    }

    private data class QuestionTemplate(
        val topic: String,
        val questionText: String,
        val optionA: String,
        val optionB: String,
        val optionC: String,
        val optionD: String,
        val correctAnswerIndex: Int,
        val explanation: String,
        val passageText: String? = null
    )

    private fun getSyllabusQuestionTemplate(subject: String, requestedTopic: String?, seed: Int): QuestionTemplate {
        val templates = when (subject) {
            "English Language" -> englishTemplates
            "Mathematics" -> mathTemplates
            "Physics" -> physicsTemplates
            "Chemistry" -> chemistryTemplates
            "Biology" -> biologyTemplates
            "Economics" -> economicsTemplates
            "Government" -> governmentTemplates
            "Literature in English" -> literatureTemplates
            "CRS" -> crsTemplates
            "Commerce" -> commerceTemplates
            "Principles of Accounts", "Financial Accounting" -> accountingTemplates
            else -> englishTemplates
        }

        val filtered = if (!requestedTopic.isNullOrBlank()) {
            templates.filter { it.topic.equals(requestedTopic, ignoreCase = true) }
        } else emptyList()

        val pool = if (filtered.isNotEmpty()) filtered else templates
        return pool[Math.abs(seed) % pool.size]
    }

    // --- High-Quality Syllabus Templates ---

    private val englishTemplates = listOf(
        QuestionTemplate(
            topic = "Concord and Grammatical Agreement",
            questionText = "Neither the principal nor the teachers _______ present at the emergency briefing yesterday.",
            optionA = "was",
            optionB = "were",
            optionC = "is",
            optionD = "are",
            correctAnswerIndex = 1,
            explanation = "Under the rule of proximity for correlative conjunctions ('neither... nor'), the verb agrees with the closer subject. 'Teachers' is plural and the event occurred in the past, requiring the plural past auxiliary 'were'."
        ),
        QuestionTemplate(
            topic = "Antonyms and Synonyms",
            questionText = "Select the option that is most nearly OPPOSITE in meaning to the italicized word:\n\nThe minister made an *ostentatious* display of wealth during the charity gala.",
            optionA = "flamboyant",
            optionB = "modest",
            optionC = "extravagant",
            optionD = "luxurious",
            correctAnswerIndex = 1,
            explanation = "'Ostentatious' means pretentious, showy, or designed to impress. Its direct antonym is 'modest' (humble and unpretentious)."
        ),
        QuestionTemplate(
            topic = "Idioms and Figurative Expressions",
            questionText = "What is the interpretation of the idiom in the sentence:\n\n'The board decided to *nip the crisis in the bud* before it escalated.'",
            optionA = "Allow the situation to resolve naturally",
            optionB = "Stop a problem at its earliest stage",
            optionC = "Punish everyone involved severely",
            optionD = "Ignore the underlying complaints",
            correctAnswerIndex = 1,
            explanation = "To 'nip something in the bud' means to suppress or stop a problem before it has an opportunity to grow or mature."
        ),
        QuestionTemplate(
            topic = "Oral English (Vowels & Consonants)",
            questionText = "Choose the word that has the same vowel sound as the underlined sound in 'b<u>ir</u>d' (/ɜː/):",
            optionA = "board",
            optionB = "heard",
            optionC = "hard",
            optionD = "beard",
            correctAnswerIndex = 1,
            explanation = "'Bird' and 'heard' both contain the open-mid central unrounded long vowel sound /ɜː/."
        ),
        QuestionTemplate(
            topic = "Lexis and Structure",
            questionText = "The student was advised to desist _______ engaging in unauthorized commercial activities on campus.",
            optionA = "with",
            optionB = "from",
            optionC = "in",
            optionD = "at",
            correctAnswerIndex = 1,
            explanation = "The verb 'desist' takes the fixed preposition 'from' (i.e. to desist from an action)."
        )
    )

    private val mathTemplates = listOf(
        QuestionTemplate(
            topic = "Algebraic Operations and Polynomials",
            questionText = "If (x - 2) is a factor of the polynomial f(x) = 2x³ - 5x² + kx - 6, find the value of the constant k.",
            optionA = "3",
            optionB = "5",
            optionC = "7",
            optionD = "9",
            correctAnswerIndex = 1,
            explanation = "By the Factor Theorem, f(2) = 0. Substituting x = 2: 2(2)³ - 5(2)² + k(2) - 6 = 0 => 2(8) - 5(4) + 2k - 6 = 0 => 16 - 20 + 2k - 6 = 0 => 2k - 10 = 0 => k = 5."
        ),
        QuestionTemplate(
            topic = "Calculus (Differentiation & Integration)",
            questionText = "Evaluate the definite integral: ∫ from 0 to 3 of (2x + 1) dx.",
            optionA = "9",
            optionB = "12",
            optionC = "15",
            optionD = "18",
            correctAnswerIndex = 1,
            explanation = "∫ (2x + 1) dx = [x² + x] from 0 to 3 = (3² + 3) - (0) = 9 + 3 = 12."
        ),
        QuestionTemplate(
            topic = "Indices, Logarithms and Surds",
            questionText = "Solve for x if log₁₀(x + 3) + log₁₀(2) = 1.",
            optionA = "1",
            optionB = "2",
            optionC = "3",
            optionD = "5",
            correctAnswerIndex = 1,
            explanation = "log₁₀[2(x + 3)] = 1 => 2(x + 3) = 10¹ => 2x + 6 = 10 => 2x = 4 => x = 2."
        ),
        QuestionTemplate(
            topic = "Statistics, Probability and Permutations",
            questionText = "A bag contains 5 red balls and 3 green balls. If two balls are drawn at random one after another without replacement, find the probability that both are red.",
            optionA = "5/14",
            optionB = "15/56",
            optionC = "25/64",
            optionD = "5/28",
            correctAnswerIndex = 0,
            explanation = "P(First red) = 5/8. P(Second red | First red) = 4/7. P(Both red) = (5/8) × (4/7) = 20/56 = 5/14."
        )
    )

    private val physicsTemplates = listOf(
        QuestionTemplate(
            topic = "Linear Kinematics and Motion",
            questionText = "A car accelerating uniformly from rest covers a distance of 100 m in 10 s. What is its acceleration?",
            optionA = "1.0 m/s²",
            optionB = "2.0 m/s²",
            optionC = "4.0 m/s²",
            optionD = "5.0 m/s²",
            correctAnswerIndex = 1,
            explanation = "Using s = ut + ½at² with initial velocity u = 0: 100 = 0 + ½(a)(10)² => 100 = 50a => a = 2.0 m/s²."
        ),
        QuestionTemplate(
            topic = "Thermal Physics and Gas Laws",
            questionText = "A fixed mass of gas occupies a volume of 300 cm³ at 300 K. What will be its volume at 400 K if pressure remains constant?",
            optionA = "225 cm³",
            optionB = "350 cm³",
            optionC = "400 cm³",
            optionD = "450 cm³",
            correctAnswerIndex = 2,
            explanation = "By Charles's Law: V₁/T₁ = V₂/T₂ => 300/300 = V₂/400 => 1 = V₂/400 => V₂ = 400 cm³."
        ),
        QuestionTemplate(
            topic = "Current Electricity and Resistance",
            questionText = "Two resistors of resistances 3 Ω and 6 Ω are connected in parallel across a 12 V DC power source. Calculate the total current drawn from the source.",
            optionA = "2 A",
            optionB = "4 A",
            optionC = "6 A",
            optionD = "8 A",
            correctAnswerIndex = 2,
            explanation = "Equivalent parallel resistance R = (3 × 6) / (3 + 6) = 18 / 9 = 2 Ω. Total current I = V / R = 12 V / 2 Ω = 6 A."
        )
    )

    private val chemistryTemplates = listOf(
        QuestionTemplate(
            topic = "Atomic Structure and Electron Configuration",
            questionText = "What is the ground-state electron configuration of an element with atomic number Z = 17 (Chlorine)?",
            optionA = "1s² 2s² 2p⁶ 3s¹ 3p⁶",
            optionB = "1s² 2s² 2p⁶ 3s² 3p⁵",
            optionC = "1s² 2s² 2p⁶ 3s² 3p⁶",
            optionD = "1s² 2s² 2p⁵ 3s² 3p⁶",
            correctAnswerIndex = 1,
            explanation = "Chlorine has 17 electrons: 2 in K shell (1s²), 8 in L shell (2s² 2p⁶), and 7 valence electrons in M shell (3s² 3p⁵)."
        ),
        QuestionTemplate(
            topic = "Stoichiometry and Mole Concept",
            questionText = "Calculate the mass of anhydrous sodium carbonate (Na₂CO₃) required to prepare 500 cm³ of a 0.10 mol/dm³ standard solution. [Molar mass of Na₂CO₃ = 106 g/mol]",
            optionA = "2.65 g",
            optionB = "5.30 g",
            optionC = "10.60 g",
            optionD = "53.00 g",
            correctAnswerIndex = 1,
            explanation = "Moles required n = C × V = 0.10 mol/dm³ × (500/1000 dm³) = 0.05 mol. Mass = n × Molar mass = 0.05 mol × 106 g/mol = 5.30 g."
        )
    )

    private val biologyTemplates = listOf(
        QuestionTemplate(
            topic = "Genetics, Heredity and Variation",
            questionText = "In a cross between a heterozygous tall pea plant (Tt) and a homozygous dwarf pea plant (tt), what is the expected phenotypic ratio of offspring?",
            optionA = "3 tall : 1 dwarf",
            optionB = "1 tall : 1 dwarf",
            optionC = "All tall",
            optionD = "1 tall : 3 dwarf",
            correctAnswerIndex = 1,
            explanation = "Gametes from Tt are T and t; gametes from tt are t. Offspring genotypes: 50% Tt (tall) and 50% tt (dwarf), giving a 1:1 phenotypic ratio."
        ),
        QuestionTemplate(
            topic = "Animal Nutrition and Digestive Enzymes",
            questionText = "Which digestive enzyme is responsible for catalyzing the breakdown of emulsified fats into fatty acids and glycerol in the duodenum?",
            optionA = "Pepsin",
            optionB = "Pancreatic lipase",
            optionC = "Salivary amylase",
            optionD = "Trypsin",
            correctAnswerIndex = 1,
            explanation = "Pancreatic lipase digests emulsified lipid droplets in the alkaline medium of the duodenum into free fatty acids and glycerol."
        )
    )

    private val economicsTemplates = listOf(
        QuestionTemplate(
            topic = "Elasticity of Demand and Supply",
            questionText = "If a 10% increase in the price of a commodity leads to a 25% decrease in the quantity demanded, the price elasticity of demand is classified as:",
            optionA = "Inelastic",
            optionB = "Unitary elastic",
            optionC = "Elastic",
            optionD = "Perfectively inelastic",
            correctAnswerIndex = 2,
            explanation = "Price elasticity of demand = (% change in quantity demanded) / (% change in price) = 25% / 10% = 2.5. Since PED > 1, demand is price elastic."
        )
    )

    private val governmentTemplates = listOf(
        QuestionTemplate(
            topic = "Rule of Law and Separation of Powers",
            questionText = "According to A. V. Dicey, the doctrine of the Rule of Law embodies which of the following three cardinal principles?",
            optionA = "Supremacy of the law, equality before the law, and predominance of legal spirit",
            optionB = "Parliamentary sovereignty, immunity of rulers, and military oversight",
            optionC = "Unitary command, executive privilege, and censorship",
            optionD = "Judicial discretion, administrative tribunals, and emergency rule",
            correctAnswerIndex = 0,
            explanation = "Dicey's formulation of the Rule of Law rests on: (1) Absolute supremacy of regular law as opposed to arbitrary power, (2) Equality before the law for all classes, and (3) The constitution as the result of the ordinary law of the land."
        )
    )

    private val literatureTemplates = listOf(
        QuestionTemplate(
            topic = "Literary Terms and Appreciation",
            questionText = "A speech delivered by a character alone on stage that reveals their inner thoughts and emotions to the audience is known as a:",
            optionA = "dialogue",
            optionB = "soliloquy",
            optionC = "prologue",
            optionD = "chorus",
            correctAnswerIndex = 1,
            explanation = "A soliloquy is a dramatic convention where a solitary character reveals their intimate feelings and mental dilemmas directly to the audience."
        )
    )

    private val crsTemplates = listOf(
        QuestionTemplate(
            topic = "Exodus, Sinai Covenant and Mosaic Law",
            questionText = "The fifth commandment in the Decalogue is unique because it is the first commandment with a promise. It enjoins believers to:",
            optionA = "Observe the Sabbath day",
            optionB = "Honor father and mother",
            optionC = "Refrain from bearing false witness",
            optionD = "Not make any graven images",
            correctAnswerIndex = 1,
            explanation = "The Fifth Commandment (Exodus 20:12) commands children to honor their father and mother so that their days may be long upon the land."
        )
    )

    private val commerceTemplates = listOf(
        QuestionTemplate(
            topic = "Introduction to Commerce and Production",
            questionText = "Which branch of commerce is concerned with bridging the time gap between the production of goods and their consumption?",
            optionA = "Banking",
            optionB = "Warehousing",
            optionC = "Advertising",
            optionD = "Insurance",
            correctAnswerIndex = 1,
            explanation = "Warehousing provides storage facilities that protect goods until demanded, thereby bridging the temporal disparity between output and consumption."
        )
    )

    private val accountingTemplates = listOf(
        QuestionTemplate(
            topic = "Accounting Concepts, Principles and Equations",
            questionText = "If a business entity has total assets of ₦2,500,000 and total external liabilities of ₦900,000, what is the owner's equity (capital)?",
            optionA = "₦1,600,000",
            optionB = "₦3,400,000",
            optionC = "₦2,250,000",
            optionD = "₦900,000",
            correctAnswerIndex = 0,
            explanation = "From the fundamental accounting equation: Assets = Liabilities + Capital => Capital = Assets - Liabilities = ₦2,500,000 - ₦900,000 = ₦1,600,000."
        )
    )
}
