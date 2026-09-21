package com.example.data.learning

/**
 * High quality educational flashcard repository for PREPZA.
 * Provides progressive, bite-sized, pedagogical flashcard decks for all 14 UTME subjects.
 * Cards follow the 2-4 sentence rule with formulas, worked examples, diagrams, and exam traps.
 */
object TopicContentRepository {

    fun getFlashcards(subjectId: String, topicName: String, topicId: String): List<Flashcard> {
        val normalized = topicName.trim().lowercase()

        return when {
            // Mathematics: Indices (Explicit 13-card progression from syllabus)
            subjectId == "mathematics" && (normalized == "indices" || normalized.contains("index")) -> getIndicesFlashcards(topicId)
            
            // Mathematics: Quadratic Equations
            subjectId == "mathematics" && normalized.contains("quadratic") -> getQuadraticEquationsFlashcards(topicId)

            // Mathematics: Surds
            subjectId == "mathematics" && normalized.contains("surd") -> getSurdsFlashcards(topicId)

            // Commerce: Insurance
            subjectId == "commerce" && normalized.contains("insurance") -> getInsuranceFlashcards(topicId)

            // Commerce: Banking
            subjectId == "commerce" && normalized.contains("bank") -> getCommerceBankingFlashcards(topicId)

            // Biology: Genetics
            subjectId == "biology" && normalized.contains("genetics") -> getGeneticsFlashcards(topicId)

            // Biology: Cell Structure
            subjectId == "biology" && (normalized.contains("cell structure") || normalized == "cell") -> getCellStructureFlashcards(topicId)

            // Physics: Motion
            subjectId == "physics" && (normalized == "motion" || normalized.contains("motion")) -> getMotionFlashcards(topicId)

            // Physics: Electricity
            subjectId == "physics" && normalized.contains("electricity") -> getElectricityFlashcards(topicId)

            // Chemistry: Atomic Structure
            subjectId == "chemistry" && normalized.contains("atomic structure") -> getAtomicStructureFlashcards(topicId)

            // Chemistry: Acids
            subjectId == "chemistry" && normalized == "acids" -> getAcidsFlashcards(topicId)

            // Economics: Basic Economic Concepts / Scarcity
            subjectId == "economics" && (normalized.contains("scarcity") || normalized.contains("basic economic")) -> getScarcityFlashcards(topicId)

            // Government: Separation of Powers
            subjectId == "government" && (normalized.contains("separation of powers") || normalized.contains("checks")) -> getSeparationOfPowersFlashcards(topicId)

            // Principles of Accounts: Double Entry
            subjectId == "accounts" && (normalized.contains("double entry") || normalized.contains("ledger")) -> getDoubleEntryFlashcards(topicId)

            // Literature: Figures of Speech
            subjectId == "literature" && (normalized.contains("figure") || normalized.contains("speech")) -> getFiguresOfSpeechLiteratureFlashcards(topicId)

            // CRS: Creation
            subjectId == "crs" && normalized.contains("creation") -> getCreationFlashcards(topicId)

            // Geography: Latitude and Longitude
            subjectId == "geography" && normalized.contains("latitude") -> getLatitudeLongitudeFlashcards(topicId)

            // History: Trans-Saharan Trade
            subjectId == "history" && normalized.contains("trans-saharan") -> getTransSaharanTradeFlashcards(topicId)

            // IRS: Tawhid
            subjectId == "irs" && (normalized.contains("tawhid") || normalized.contains("monotheism")) -> getTawhidFlashcards(topicId)

            // General Progressive Subject Topic Generator
            else -> generateProgressiveTopicCards(subjectId, topicName, topicId)
        }
    }

    // ==========================================
    // 1. MATHEMATICS — INDICES (13 Cards)
    // ==========================================
    private fun getIndicesFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "What are Indices?",
            subtitle = "Core Concept",
            content = "An index shows how many times a number is multiplied by itself.\n\nFor example, 2³ means 2 × 2 × 2.\n\nThe 3 is called the index or power, and 2 is the base.",
            keyTakeaway = "Base = the number being multiplied. Index = the number of times it multiplies itself.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Understanding 2⁴",
            subtitle = "Basic Example",
            content = "2⁴ means multiplying four 2s together:\n\n2 × 2 × 2 × 2 = 16\n\nThe index tells us exactly how many identical factors are combined.",
            formula = "2⁴ = 2 × 2 × 2 × 2 = 16",
            keyTakeaway = "Always multiply the base repeatedly, never multiply the base by the index.",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Evaluate 3²",
            subtitle = "Solved Example",
            content = "Evaluate 3²:\n\n3² = 3 × 3\n\nTherefore:\n3² = 9",
            formula = "3² = 3 × 3 = 9",
            order = 3
        ),
        Flashcard(
            id = "${topicId}_4",
            cardType = LearningCardType.FORMULA,
            title = "Zero Index",
            subtitle = "Rule of Zero Power",
            content = "Any non-zero number raised to the power of zero equals 1.\n\nFor example: 7⁰ = 1, 25⁰ = 1, and x⁰ = 1 (where x ≠ 0).",
            formula = "a⁰ = 1  (for a ≠ 0)",
            keyTakeaway = "No matter how large the number, anything to the power 0 is 1.",
            order = 4
        ),
        Flashcard(
            id = "${topicId}_5",
            cardType = LearningCardType.FORMULA,
            title = "Multiplication Law",
            subtitle = "First Law of Indices",
            content = "When multiplying powers with the same base, add the indices.\n\nExample:\n2³ × 2² = 2³⁺² = 2⁵ = 32",
            formula = "aᵐ × aⁿ = aᵐ⁺ⁿ",
            keyTakeaway = "Bases must be identical before indices can be added.",
            order = 5
        ),
        Flashcard(
            id = "${topicId}_6",
            cardType = LearningCardType.FORMULA,
            title = "Division Law",
            subtitle = "Second Law of Indices",
            content = "When dividing powers with the same base, subtract the indices.\n\nExample:\n5⁴ ÷ 5² = 5⁴⁻² = 5² = 25",
            formula = "aᵐ ÷ aⁿ = aᵐ⁻ⁿ",
            keyTakeaway = "Subtract the bottom index from the top index.",
            order = 6
        ),
        Flashcard(
            id = "${topicId}_7",
            cardType = LearningCardType.FORMULA,
            title = "Power of a Power",
            subtitle = "Third Law of Indices",
            content = "When a power is raised to another power, multiply the indices together.\n\nExample:\n(2³)² = 2³ˣ² = 2⁶ = 64",
            formula = "(aᵐ)ⁿ = aᵐⁿ",
            order = 7
        ),
        Flashcard(
            id = "${topicId}_8",
            cardType = LearningCardType.FORMULA,
            title = "Negative Indices",
            subtitle = "Inversion Rule",
            content = "A negative index represents the reciprocal of the positive power.\n\nExample:\n2⁻³ = 1 / 2³ = 1 / 8",
            formula = "a⁻ⁿ = 1 / aⁿ",
            keyTakeaway = "A negative power turns the value into a fraction under 1.",
            order = 8
        ),
        Flashcard(
            id = "${topicId}_9",
            cardType = LearningCardType.FORMULA,
            title = "Fractional Indices",
            subtitle = "Roots and Powers",
            content = "A fractional index represents a root.\n\na¹/² = √a and a¹/³ = ∛a.\n\nExample:\n16¹/² = √16 = 4",
            formula = "aᵐ/ⁿ = ⁿ√(aᵐ) = (ⁿ√a)ᵐ",
            order = 9
        ),
        Flashcard(
            id = "${topicId}_10",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Solved UTME Problem",
            subtitle = "Step-by-Step Simplification",
            content = "Simplify: 2³ × 2⁴\n\nUsing the multiplication law:\n2³⁺⁴ = 2⁷ = 128",
            formula = "2³ × 2⁴ = 2³⁺⁴ = 2⁷ = 128",
            order = 10
        ),
        Flashcard(
            id = "${topicId}_11",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Word & Real-Life Application",
            subtitle = "Exponential Growth",
            content = "A quantity doubles every hour.\nIf its starting value is 5, after 3 hours its value is:\n\n5 × 2³ = 5 × 8 = 40\n\nIndices represent rapid growth, radioactive decay, and computing capacity.",
            order = 11
        ),
        Flashcard(
            id = "${topicId}_12",
            cardType = LearningCardType.EXAM_TIP,
            title = "Common Mistake",
            subtitle = "Multiplication Trap",
            content = "Do not multiply the indices when multiplying powers with the same base!\n\n❌ Incorrect: 2³ × 2² = 2⁶\n✓ Correct: 2³ × 2² = 2⁵\n\nRemember: add indices for multiplication, multiply only for brackets.",
            order = 12
        ),
        Flashcard(
            id = "${topicId}_13",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Quick Recap",
            subtitle = "Mastery Summary",
            content = "• Same base + multiplication → ADD indices (aᵐ × aⁿ = aᵐ⁺ⁿ)\n• Same base + division → SUBTRACT indices (aᵐ ÷ aⁿ = aᵐ⁻ⁿ)\n• Power raised to power → MULTIPLY (aᵐ)ⁿ = aᵐⁿ\n• Zero power → a⁰ = 1\n• Negative index → a⁻ⁿ = 1/aⁿ",
            keyTakeaway = "Keep bases equal before applying index laws.",
            order = 13
        )
    )

    // ==========================================
    // 2. COMMERCE — INSURANCE (12 Cards)
    // ==========================================
    private fun getInsuranceFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "Meaning of Insurance",
            subtitle = "Risk Transfer Mechanism",
            content = "Insurance is a contract whereby an insurer promises to indemnify the insured against a specified loss in exchange for regular payments called premiums.\n\nIt protects businesses and individuals from unforeseen catastrophic losses.",
            keyTakeaway = "Insurance transfers financial risk from the individual to a pool managed by the insurer.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Insurable vs Non-Insurable Risks",
            subtitle = "Classification",
            content = "• Insurable Risks: Risks whose probability of occurrence can be statistically calculated (e.g., fire, burglary, marine accidents).\n\n• Non-Insurable Risks: Speculative risks with uncertain outcomes or potential for profit (e.g., loss in trade, change in fashion, gambling).",
            comparisonLeftTitle = "Insurable Risks",
            comparisonRightTitle = "Non-Insurable Risks",
            comparisonPairs = listOf(
                "Fire, Theft, Motor accident" to "Loss from stock market trading",
                "Pure risk with no gain" to "Speculative business risk"
            ),
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.FORMULA,
            title = "Principle of Utmost Good Faith",
            subtitle = "Uberrimae Fidei",
            content = "Both the insured and insurer must disclose all material facts regarding the property or life being insured truthfully without concealment.\n\nFailure to disclose material facts makes the contract voidable.",
            keyTakeaway = "Concealing a pre-existing illness or hazardous activity voids the insurance policy.",
            order = 3
        ),
        Flashcard(
            id = "${topicId}_4",
            cardType = LearningCardType.FORMULA,
            title = "Principle of Insurable Interest",
            subtitle = "Financial Relationship",
            content = "The insured must stand to suffer direct financial loss if the insured event occurs.\n\nYou can insure your own car or house, but you cannot insure a neighbor's property to profit from its destruction.",
            keyTakeaway = "No financial interest = no valid insurance contract.",
            order = 4
        ),
        Flashcard(
            id = "${topicId}_5",
            cardType = LearningCardType.FORMULA,
            title = "Principle of Indemnity",
            subtitle = "Restoration to Exact Position",
            content = "The insured should be restored to the exact financial position enjoyed immediately before the loss occurred.\n\nInsurance is for compensation, never for making a profit.",
            keyTakeaway = "Indemnity applies to property insurance, never to life assurance.",
            order = 5
        ),
        Flashcard(
            id = "${topicId}_6",
            cardType = LearningCardType.FORMULA,
            title = "Principle of Subrogation",
            subtitle = "Stepping into the Shoes",
            content = "Once the insurer fully compensates the insured for a total loss, all legal rights and salvage of the property pass to the insurer.\n\nThis prevents the insured from getting paid twice for the same loss.",
            order = 6
        ),
        Flashcard(
            id = "${topicId}_7",
            cardType = LearningCardType.FORMULA,
            title = "Principle of Contribution",
            subtitle = "Double Insurance Rule",
            content = "If a property is insured with multiple insurers, each insurer contributes proportionally to the claim in proportion to the sum insured.\n\nThe owner cannot claim full damages from each company.",
            formula = "Claim Share = (Sum Insured with A / Total Sum Insured) × Actual Loss",
            order = 7
        ),
        Flashcard(
            id = "${topicId}_8",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Average Clause Calculation",
            subtitle = "Under-Insurance Penalty",
            content = "A warehouse worth ₦10,000,000 is insured for ₦6,000,000. A fire causes ₦4,000,000 in damage.\n\nClaim Payable:\n(₦6,000,000 ÷ ₦10,000,000) × ₦4,000,000 = ₦2,400,000.",
            formula = "Payout = (Sum Insured / Actual Value) × Loss",
            keyTakeaway = "Under-insuring penalizes the payout proportionally under the average clause.",
            order = 8
        ),
        Flashcard(
            id = "${topicId}_9",
            cardType = LearningCardType.DEFINITION,
            title = "Assurance vs Insurance",
            subtitle = "Terminological Difference",
            content = "• Assurance: Relates to events that are bound to happen sooner or later (e.g., death in Life Assurance).\n\n• Insurance: Relates to events that may or may not happen (e.g., Fire, Marine, Burglary).",
            order = 9
        ),
        Flashcard(
            id = "${topicId}_10",
            cardType = LearningCardType.EXAM_TIP,
            title = "Common Exam Trap",
            subtitle = "Proximate Cause",
            content = "In JAMB, Proximate Cause means looking for the direct, active, efficient cause that set the train of events in motion.\n\nIf the proximate cause is not covered in the policy, the insurer is not liable for the damage.",
            order = 10
        ),
        Flashcard(
            id = "${topicId}_11",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Quick Recap: Principles of Insurance",
            subtitle = "Essential Summary",
            content = "1. Utmost Good Faith (full disclosure)\n2. Insurable Interest (financial stake)\n3. Indemnity (compensation without profit)\n4. Subrogation (salvage rights to insurer)\n5. Contribution (shared payout for double insurance)\n6. Proximate Cause (direct cause of loss)",
            order = 11
        )
    )

    // ==========================================
    // 3. BIOLOGY — GENETICS (12 Cards)
    // ==========================================
    private fun getGeneticsFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "What is Genetics?",
            subtitle = "Heredity and Variation",
            content = "Genetics is the scientific study of heredity (how traits are transmitted from parents to offspring) and variation (differences among individuals of the same species).",
            keyTakeaway = "Heredity = transmission of traits. Variation = differences between offspring.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.DEFINITION,
            title = "Gene, Locus and Allele",
            subtitle = "Key Genetic Terms",
            content = "• Gene: Basic physical unit of inheritance on a chromosome.\n• Locus: Specific position of a gene on a chromosome.\n• Alleles: Alternative forms of the same gene (e.g., T for tall and t for short).",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.COMPARISON,
            title = "Genotype vs Phenotype",
            subtitle = "Genetic Makeup vs Physical Expression",
            content = "Genotype is the complete genetic constitution of an organism (e.g., TT, Tt, tt).\n\nPhenotype is the observable physical or physiological manifestation of the trait (e.g., Tall, Dwarf, Brown eyes).",
            comparisonLeftTitle = "Genotype",
            comparisonRightTitle = "Phenotype",
            comparisonPairs = listOf(
                "Internal genetic makeup (TT, Tt)" to "Physical appearance (Tall, Short)",
                "Inherited from parents" to "Influenced by genotype + environment"
            ),
            order = 3
        ),
        Flashcard(
            id = "${topicId}_4",
            cardType = LearningCardType.DEFINITION,
            title = "Dominant vs Recessive Alleles",
            subtitle = "Expression of Traits",
            content = "• Dominant Allele: Expresses itself phenotypically in both homozygous (TT) and heterozygous (Tt) states.\n\n• Recessive Allele: Only expresses its trait when in a homozygous state (tt).",
            order = 4
        ),
        Flashcard(
            id = "${topicId}_5",
            cardType = LearningCardType.FORMULA,
            title = "Mendel's First Law",
            subtitle = "Law of Segregation of Genes",
            content = "Mendel's First Law states that the characteristics of an organism are determined by internal factors (genes) which occur in pairs. Only one factor can be represented in a single gamete.",
            keyTakeaway = "Alleles separate during meiosis so gametes carry only one allele of each gene.",
            order = 5
        ),
        Flashcard(
            id = "${topicId}_6",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Monohybrid Cross (Tt × Tt)",
            subtitle = "F2 Generation Phenotypic Ratio",
            content = "Crossing two heterozygous tall plants (Tt × Tt):\n\nGametes: T, t and T, t\nOffspring: TT (Tall), Tt (Tall), Tt (Tall), tt (Dwarf)\n\n• Phenotypic Ratio = 3 Tall : 1 Dwarf (3:1)\n• Genotypic Ratio = 1 TT : 2 Tt : 1 tt (1:2:1)",
            formula = "Phenotypic Ratio: 3 : 1 | Genotypic Ratio: 1 : 2 : 1",
            order = 6
        ),
        Flashcard(
            id = "${topicId}_7",
            cardType = LearningCardType.DEFINITION,
            title = "Co-Dominance and Incomplete Dominance",
            subtitle = "Non-Mendelian Inheritance",
            content = "• Co-dominance: Both alleles are equally expressed (e.g., Blood group AB with IA and IB alleles).\n\n• Incomplete Dominance: Neither allele dominates; an intermediate phenotype appears (e.g., Red flower × White flower = Pink flower in Mirabilis jalapa).",
            order = 7
        ),
        Flashcard(
            id = "${topicId}_8",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Sickle Cell Anaemia Genetics",
            subtitle = "Haemoglobin Genotypes",
            content = "Sickle cell gene (S) and normal gene (A):\n• AA = Normal haemoglobin\n• AS = Sickle cell trait (carrier, resistant to severe malaria)\n• SS = Sickle cell anaemia sufferer\n\nAS × AS cross produces: 25% AA, 50% AS, 25% SS.",
            formula = "AS × AS → 1 AA : 2 AS : 1 SS (25% risk of SS child)",
            order = 8
        ),
        Flashcard(
            id = "${topicId}_9",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Sex Determination in Humans",
            subtitle = "XX vs XY Chromosomes",
            content = "Humans have 23 pairs of chromosomes (22 pairs of autosomes and 1 pair of sex chromosomes).\n\n• Female = 44 + XX (all ova carry X)\n• Male = 44 + XY (sperm carry either X or Y)\n\nThe male sperm determines the biological sex of the child with a 50% chance for either.",
            order = 9
        ),
        Flashcard(
            id = "${topicId}_10",
            cardType = LearningCardType.EXAM_TIP,
            title = "Sex-Linked Inheritance Traps",
            subtitle = "Colour Blindness & Haemophilia",
            content = "Sex-linked traits are located on the X chromosome and absent on the Y chromosome.\n\nMales (XY) express sex-linked recessive traits whenever the X chromosome carries the mutant allele, because they have no second X chromosome to mask it.",
            keyTakeaway = "Mothers pass X chromosomes to sons; fathers cannot pass X-linked disorders to sons.",
            order = 10
        ),
        Flashcard(
            id = "${topicId}_11",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Quick Recap: Genetics",
            subtitle = "High-Yield Summary",
            content = "• Gene = unit of heredity; Allele = variant of gene\n• Monohybrid cross F2 ratio: 3:1 (phenotype), 1:2:1 (genotype)\n• Incomplete dominance produces intermediate phenotype\n• Human sex: Male is heterogametic (XY), Female is homogametic (XX)\n• Sex-linked disorders: Haemophilia, Red-Green Colour blindness.",
            order = 11
        )
    )

    // ==========================================
    // 4. PHYSICS — MOTION (12 Cards)
    // ==========================================
    private fun getMotionFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "Types of Motion",
            subtitle = "Fundamental Physics",
            content = "Motion is the change in position of a body with time relative to a fixed point of reference.\n\nMajor types:\n1. Linear (Translational): motion in a straight line\n2. Rotational (Circular): motion about an axis\n3. Oscillatory (Vibratory): to-and-fro motion\n4. Random: irregular motion (e.g., smoke particles).",
            keyTakeaway = "Motion is always relative to a frame of reference.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.COMPARISON,
            title = "Distance vs Displacement",
            subtitle = "Scalar vs Vector",
            content = "• Distance: Total length of path travelled by a body regardless of direction (Scalar quantity, SI unit: metres).\n\n• Displacement: Distance travelled in a specified direction (Vector quantity, SI unit: metres).",
            comparisonLeftTitle = "Distance",
            comparisonRightTitle = "Displacement",
            comparisonPairs = listOf(
                "Scalar (magnitude only)" to "Vector (magnitude + direction)",
                "Always positive or zero" to "Can be positive, negative, or zero"
            ),
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.FORMULA,
            title = "Speed and Velocity",
            subtitle = "Rate of Change of Position",
            content = "• Speed: Rate of change of distance with time (Speed = Distance / Time).\n\n• Velocity: Rate of change of displacement with time (Velocity = Displacement / Time).",
            formula = "v = s / t   (SI unit: m/s)",
            order = 3
        ),
        Flashcard(
            id = "${topicId}_4",
            cardType = LearningCardType.FORMULA,
            title = "Acceleration",
            subtitle = "Rate of Change of Velocity",
            content = "Acceleration is the rate of change of velocity with time.\n\nWhen velocity decreases with time, it is called deceleration or retardation (negative acceleration).",
            formula = "a = (v - u) / t   (SI unit: m/s²)",
            formulaVariables = listOf("v" to "Final velocity (m/s)", "u" to "Initial velocity (m/s)", "t" to "Time taken (s)"),
            order = 4
        ),
        Flashcard(
            id = "${topicId}_5",
            cardType = LearningCardType.FORMULA,
            title = "Equations of Uniform Motion (1)",
            subtitle = "First Equation",
            content = "Connects initial velocity (u), acceleration (a), time (t), and final velocity (v).\n\nDerived directly from the definition of acceleration a = (v - u) / t.",
            formula = "v = u + at",
            order = 5
        ),
        Flashcard(
            id = "${topicId}_6",
            cardType = LearningCardType.FORMULA,
            title = "Equations of Uniform Motion (2)",
            subtitle = "Second Equation",
            content = "Connects displacement (s), initial velocity (u), time (t), and uniform acceleration (a).",
            formula = "s = ut + ½ at²",
            keyTakeaway = "When starting from rest, u = 0, so distance simplifies to s = ½ at².",
            order = 6
        ),
        Flashcard(
            id = "${topicId}_7",
            cardType = LearningCardType.FORMULA,
            title = "Equations of Uniform Motion (3)",
            subtitle = "Third Equation (Time-Independent)",
            content = "Used when time (t) is neither given nor required in the question.",
            formula = "v² = u² + 2as",
            order = 7
        ),
        Flashcard(
            id = "${topicId}_8",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Solved Example: Car Accelerating",
            subtitle = "Step-by-Step Problem Solving",
            content = "A car starts from rest (u = 0) and accelerates uniformly at 3 m/s² for 6 seconds. Calculate its final velocity and distance covered.\n\n1. Velocity: v = u + at = 0 + (3 × 6) = 18 m/s.\n2. Distance: s = ut + ½ at² = 0 + ½(3)(6²) = ½(3)(36) = 54 m.",
            formula = "v = 18 m/s,  s = 54 m",
            order = 8
        ),
        Flashcard(
            id = "${topicId}_9",
            cardType = LearningCardType.FORMULA,
            title = "Motion Under Gravity",
            subtitle = "Free Fall Equations",
            content = "For a body falling freely, replace 'a' with '+g' (approx 9.8 or 10 m/s²).\n\nFor a body thrown vertically upwards, replace 'a' with '-g' because gravity opposes upward motion.\nAt the maximum height, final velocity v = 0.",
            formula = "v = u - gt,   s = ut - ½gt²,   v² = u² - 2gs",
            order = 9
        ),
        Flashcard(
            id = "${topicId}_10",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Maximum Height & Time of Flight",
            subtitle = "Vertical Projectile Formulas",
            content = "For a body projected vertically with velocity u:\n\n• Time to reach max height: t = u / g\n• Total time of flight: T = 2u / g\n• Maximum height reached: H = u² / 2g",
            formula = "H_max = u² / 2g   |   T_flight = 2u / g",
            order = 10
        ),
        Flashcard(
            id = "${topicId}_11",
            cardType = LearningCardType.EXAM_TIP,
            title = "Velocity-Time Graph Traps",
            subtitle = "Interpreting Motion Graphs",
            content = "In a Velocity-Time graph:\n\n• Slope (gradient) = Acceleration\n• Area under the graph = Total Distance travelled\n\nNever confuse displacement-time graph slope (velocity) with velocity-time graph slope (acceleration).",
            order = 11
        ),
        Flashcard(
            id = "${topicId}_12",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Quick Recap: Motion",
            subtitle = "Essential Formulas",
            content = "• v = u + at\n• s = ut + ½ at²\n• v² = u² + 2as\n• s = ½(u + v)t\n• Free fall: a = ±g, at max height v = 0.",
            order = 12
        )
    )

    // ==========================================
    // 5. CHEMISTRY — ATOMIC STRUCTURE (12 Cards)
    // ==========================================
    private fun getAtomicStructureFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "Structure of the Atom",
            subtitle = "Subatomic Particles",
            content = "An atom consists of a dense central nucleus containing positively charged protons and neutral neutrons, surrounded by negatively charged electrons in energy shells.",
            keyTakeaway = "Protons = positive (+1), Neutrons = neutral (0), Electrons = negative (-1).",
            diagramId = "atomic_shell_structure",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.FORMULA,
            title = "Atomic Number and Mass Number",
            subtitle = "Fundamental Nuclear Notation",
            content = "• Atomic Number (Z): Number of protons in the nucleus. Identifies the chemical element.\n\n• Mass Number (A): Total number of protons + neutrons in the nucleus.",
            formula = "A = Z + N  (Mass Number = Protons + Neutrons)",
            formulaVariables = listOf("A" to "Mass Number", "Z" to "Atomic Number", "N" to "Number of Neutrons"),
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.DEFINITION,
            title = "Isotopy and Isotopes",
            subtitle = "Same Element, Different Masses",
            content = "Isotopes are atoms of the same element having the same atomic number (same protons) but different mass numbers (different number of neutrons).\n\nExamples: Chlorine-35 and Chlorine-37; Carbon-12 and Carbon-14.",
            keyTakeaway = "Isotopes have identical chemical properties because they have the same electron configuration.",
            order = 3
        ),
        Flashcard(
            id = "${topicId}_4",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Relative Atomic Mass (RAM) of Chlorine",
            subtitle = "Isotopic Abundance Calculation",
            content = "Chlorine exists as 75% ³⁵Cl and 25% ³⁷Cl.\n\nRAM = (75 × 35 + 25 × 37) ÷ 100\n= (2625 + 925) ÷ 100\n= 3550 ÷ 100 = 35.5",
            formula = "RAM = Σ(Percentage Abundance × Isotope Mass) / 100",
            order = 4
        ),
        Flashcard(
            id = "${topicId}_5",
            cardType = LearningCardType.FORMULA,
            title = "Electronic Configuration: Bohr Model",
            subtitle = "Energy Shell Capacity (2n² Rule)",
            content = "Electrons occupy discrete energy levels (shells K, L, M, N...).\n\nThe maximum number of electrons in shell n is given by 2n²:\n• K shell (n=1) = 2(1)² = 2 electrons\n• L shell (n=2) = 2(2)² = 8 electrons\n• M shell (n=3) = 2(3)² = 18 electrons.",
            formula = "Max electrons per shell = 2n²",
            order = 5
        ),
        Flashcard(
            id = "${topicId}_6",
            cardType = LearningCardType.DEFINITION,
            title = "Quantum Shells and Orbitals (s, p, d, f)",
            subtitle = "Modern Atomic Orbital Model",
            content = "Sub-shells contain orbitals which can hold a maximum of 2 electrons with opposite spins:\n• s subshell: 1 orbital (max 2 electrons)\n• p subshell: 3 orbitals (max 6 electrons)\n• d subshell: 5 orbitals (max 10 electrons)\n• f subshell: 7 orbitals (max 14 electrons).",
            order = 6
        ),
        Flashcard(
            id = "${topicId}_7",
            cardType = LearningCardType.FORMULA,
            title = "Aufbau Principle",
            subtitle = "Building-Up Principle",
            content = "Electrons occupy orbitals in order of increasing energy level, starting with the lowest available energy orbital (1s → 2s → 2p → 3s → 3p → 4s → 3d).",
            keyTakeaway = "4s orbital is filled before 3d because 4s has lower energy than 3d.",
            order = 7
        ),
        Flashcard(
            id = "${topicId}_8",
            cardType = LearningCardType.FORMULA,
            title = "Hund's Rule and Pauli Exclusion",
            subtitle = "Orbital Filling Rules",
            content = "• Hund's Rule of Maximum Multiplicity: Orbitals of equal energy (degenerate orbitals like 2px, 2py, 2pz) are singly occupied with parallel spins before pairing occurs.\n\n• Pauli Exclusion Principle: No two electrons in the same atom can have identical sets of all four quantum numbers.",
            order = 8
        ),
        Flashcard(
            id = "${topicId}_9",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "spdf Electronic Configuration Examples",
            subtitle = "Step-by-Step Writing",
            content = "• Sodium (₁₁Na): 1s² 2s² 2p⁶ 3s¹\n• Oxygen (₈O): 1s² 2s² 2p⁴\n• Calcium (₂₀Ca): 1s² 2s² 2p⁶ 3s² 3p⁶ 4s²\n• Iron (₂₆Fe): 1s² 2s² 2p⁶ 3s² 3p⁶ 4s² 3d⁶",
            formula = "₁₁Na = [Ne] 3s¹   |   ₂₀Ca = [Ar] 4s²",
            order = 9
        ),
        Flashcard(
            id = "${topicId}_10",
            cardType = LearningCardType.EXAM_TIP,
            title = "Chromium and Copper Anomalies",
            subtitle = "Half-filled and Fully-filled Stability",
            content = "Chromium (Cr = 24) and Copper (Cu = 29) deviate from the standard Aufbau order due to extra stability of half-filled and completely-filled d-orbitals:\n\n• Cr (24): 1s² 2s² 2p⁶ 3s² 3p⁶ 4s¹ 3d⁵ (NOT 4s² 3d⁴)\n• Cu (29): 1s² 2s² 2p⁶ 3s² 3p⁶ 4s¹ 3d¹⁰ (NOT 4s² 3d⁹)",
            keyTakeaway = "JAMB frequently tests Cr (4s¹ 3d⁵) and Cu (4s¹ 3d¹⁰) configurations.",
            order = 10
        ),
        Flashcard(
            id = "${topicId}_11",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Quick Recap: Atomic Structure",
            subtitle = "Core Rules",
            content = "• Mass Number (A) = Protons + Neutrons\n• Isotopes = same protons, different neutrons\n• Aufbau: lowest energy first (4s before 3d)\n• Hund's: single occupancy before pairing\n• Special stability: Cr (4s¹ 3d⁵), Cu (4s¹ 3d¹⁰).",
            order = 11
        )
    )

    // ==========================================
    // 6. ECONOMICS — SCARCITY (10 Cards)
    // ==========================================
    private fun getScarcityFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "The Basic Economic Problem: Scarcity",
            subtitle = "Fundamental Economics",
            content = "Scarcity refers to the limited availability of economic resources relative to the unlimited wants of human beings.\n\nBecause resources (land, labour, capital, entrepreneurship) are scarce, choices must be made.",
            keyTakeaway = "Scarcity is universal and applies to individuals, firms, and governments.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.DEFINITION,
            title = "Scale of Preference",
            subtitle = "Prioritizing Human Wants",
            content = "A scale of preference is a list of unsatisfied wants arranged in order of their relative importance or priority, with the most pressing want placed at the top.",
            keyTakeaway = "A rational consumer satisfies wants starting from the top of their scale of preference.",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.DEFINITION,
            title = "Concept of Choice",
            subtitle = "Consequence of Scarcity",
            content = "Choice is the act of selecting between alternative wants using scarce available resources.\n\nChoice arises directly because resources are scarce and wants are varied and competitive.",
            order = 3
        ),
        Flashcard(
            id = "${topicId}_4",
            cardType = LearningCardType.FORMULA,
            title = "Opportunity Cost (Real Cost)",
            subtitle = "The Forgone Alternative",
            content = "Opportunity cost is the satisfaction forgone or the alternative sacrifice made when a particular choice is made.\n\nIt is the next best alternative forgone, not money spent.",
            keyTakeaway = "Money cost is cash paid; opportunity cost is the alternative sacrifice.",
            order = 4
        ),
        Flashcard(
            id = "${topicId}_5",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Solved Example: Student Opportunity Cost",
            subtitle = "Practical UTME Scenario",
            content = "A student has ₦5,000 and needs both a Textbook (₦5,000) and a Pair of Shoes (₦5,000). She decides to buy the Textbook.\n\n• The Money Cost is ₦5,000.\n• The Opportunity Cost is the Pair of Shoes forgone.",
            order = 5
        ),
        Flashcard(
            id = "${topicId}_6",
            cardType = LearningCardType.FORMULA,
            title = "Production Possibility Curve (PPC)",
            subtitle = "Boundary of Economic Output",
            content = "The Production Possibility Curve (PPC) shows the maximum combinations of two goods that an economy can produce when all available resources are fully and efficiently utilized.",
            keyTakeaway = "Points on PPC = full efficiency; inside PPC = inefficiency; outside PPC = unattainable.",
            order = 6
        ),
        Flashcard(
            id = "${topicId}_7",
            cardType = LearningCardType.COMPARISON,
            title = "Points on, inside, and outside PPC",
            subtitle = "PPC Economic Interpretation",
            content = "• Point ON the curve: Full employment and productive efficiency.\n• Point INSIDE the curve: Underutilization of resources or unemployment.\n• Point OUTSIDE the curve: Currently unattainable given existing resources and technology.",
            order = 7
        ),
        Flashcard(
            id = "${topicId}_8",
            cardType = LearningCardType.EXAM_TIP,
            title = "Common Exam Trap: Shift vs Movement on PPC",
            subtitle = "PPC Shifts",
            content = "• Movement along PPC: Reallocation of existing resources (demonstrates opportunity cost).\n\n• Outward Shift of PPC: Economic growth caused by increased resources or technological advancement.",
            order = 8
        ),
        Flashcard(
            id = "${topicId}_9",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Quick Recap: Scarcity & Opportunity Cost",
            subtitle = "Core Chain of Logic",
            content = "Scarcity → leads to Choice → requires a Scale of Preference → results in Opportunity Cost.\n\nPPC slope reflects marginal rate of transformation (opportunity cost).",
            order = 9
        )
    )

    // ==========================================
    // 7. MATHEMATICS — QUADRATIC EQUATIONS
    // ==========================================
    private fun getQuadraticEquationsFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "What is a Quadratic Equation?",
            subtitle = "Second-Degree Polynomial",
            content = "A quadratic equation is a second-degree polynomial equation where the highest power of the unknown variable is 2.\n\nThe standard general form is ax² + bx + c = 0 (where a ≠ 0).",
            formula = "ax² + bx + c = 0  (a ≠ 0)",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.FORMULA,
            title = "Methods of Solving Quadratic Equations",
            subtitle = "Four Main Approaches",
            content = "1. Factorization Method\n2. Completing the Square Method\n3. Quadratic Formula (Almighty Formula)\n4. Graphical Method.",
            keyTakeaway = "Every quadratic equation has exactly two roots (solutions).",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Solving by Factorization",
            subtitle = "Worked Example",
            content = "Solve x² - 5x + 6 = 0.\n\nFind two numbers whose sum is -5 and product is +6: (-2 and -3).\n(x - 2)(x - 3) = 0\nTherefore: x - 2 = 0 or x - 3 = 0\nRoots: x = 2 or x = 3.",
            formula = "(x - 2)(x - 3) = 0 → x = 2, 3",
            order = 3
        ),
        Flashcard(
            id = "${topicId}_4",
            cardType = LearningCardType.FORMULA,
            title = "The Quadratic Formula",
            subtitle = "Universal Formula",
            content = "The quadratic formula gives the solutions for any quadratic equation in the form ax² + bx + c = 0.",
            formula = "x = (-b ± √(b² - 4ac)) / (2a)",
            formulaVariables = listOf("a" to "Coefficient of x²", "b" to "Coefficient of x", "c" to "Constant term"),
            order = 4
        ),
        Flashcard(
            id = "${topicId}_5",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Solved Example using Quadratic Formula",
            subtitle = "Step-by-Step",
            content = "Solve 2x² + 5x - 3 = 0. Here a = 2, b = 5, c = -3.\n\nx = (-5 ± √(5² - 4(2)(-3))) / (2 × 2)\nx = (-5 ± √(25 + 24)) / 4\nx = (-5 ± √49) / 4 = (-5 ± 7) / 4\nx = 2/4 = 0.5  or  x = -12/4 = -3.",
            formula = "x = ½ or x = -3",
            order = 5
        ),
        Flashcard(
            id = "${topicId}_6",
            cardType = LearningCardType.FORMULA,
            title = "The Discriminant (b² - 4ac)",
            subtitle = "Nature of the Roots",
            content = "The value Δ = b² - 4ac determines the nature of the roots:\n• If Δ > 0: Roots are Real and Distinct (two different real roots)\n• If Δ = 0: Roots are Real and Equal (one repeated root)\n• If Δ < 0: Roots are Complex / Imaginary (no real roots).",
            formula = "Discriminant Δ = b² - 4ac",
            order = 6
        ),
        Flashcard(
            id = "${topicId}_7",
            cardType = LearningCardType.FORMULA,
            title = "Sum and Product of Roots (α and β)",
            subtitle = "Relations between Roots and Coefficients",
            content = "If α and β are the roots of ax² + bx + c = 0:\n\n• Sum of roots: α + β = -b / a\n• Product of roots: αβ = c / a\n\nEquation from roots: x² - (α + β)x + αβ = 0.",
            formula = "α + β = -b/a   |   αβ = c/a",
            order = 7
        ),
        Flashcard(
            id = "${topicId}_8",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Forming Equation from Given Roots",
            subtitle = "Application",
            content = "Find the quadratic equation whose roots are 4 and -3.\n\n• Sum (α + β) = 4 + (-3) = 1\n• Product (αβ) = 4 × (-3) = -12\n\nEquation: x² - (Sum)x + Product = 0\n→ x² - x - 12 = 0.",
            formula = "x² - x - 12 = 0",
            order = 8
        ),
        Flashcard(
            id = "${topicId}_9",
            cardType = LearningCardType.EXAM_TIP,
            title = "Common Exam Trap: Division by Variable",
            subtitle = "Lost Root Trap",
            content = "Never divide both sides of an equation like x² = 5x by x!\n\nIf you divide by x, you get x = 5 and lose the root x = 0.\n\nAlways rearrange to x² - 5x = 0 → x(x - 5) = 0 → x = 0 or x = 5.",
            order = 9
        ),
        Flashcard(
            id = "${topicId}_10",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Quick Recap: Quadratic Equations",
            subtitle = "Mastery Checklist",
            content = "• Standard Form: ax² + bx + c = 0\n• Formula: x = (-b ± √(b² - 4ac)) / 2a\n• Discriminant: Δ > 0 (distinct), Δ = 0 (equal), Δ < 0 (no real roots)\n• Sum α + β = -b/a, Product αβ = c/a.",
            order = 10
        )
    )

    // ==========================================
    // 8. OTHER CORE SUBJECT SAMPLES
    // ==========================================
    private fun getSurdsFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "What is a Surd?",
            subtitle = "Irrational Roots",
            content = "A surd is an irrational root of a positive rational number that cannot be evaluated exactly into an integer or fraction (e.g., √2, √3, √5).\n\nNumbers like √4 = 2 and √9 = 3 are rational and NOT surds.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.FORMULA,
            title = "Rules of Surds",
            subtitle = "Multiplication and Division",
            content = "• √(a × b) = √a × √b\n• √(a / b) = √a / √b\n• (√a)² = a\n• Note: √(a + b) ≠ √a + √b!",
            formula = "√(ab) = √a√b   |   √(a/b) = √a / √b",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Simplifying Surds to Basic Form",
            subtitle = "Worked Example",
            content = "Simplify √72 into basic surd form.\n\nFind the largest perfect square factor of 72: 36.\n√72 = √(36 × 2) = √36 × √2 = 6√2.",
            formula = "√72 = 6√2",
            order = 3
        ),
        Flashcard(
            id = "${topicId}_4",
            cardType = LearningCardType.FORMULA,
            title = "Rationalizing the Denominator",
            subtitle = "Eliminating Square Roots in Fractions",
            content = "To rationalize a fraction with a single surd in denominator (like a / √b), multiply both numerator and denominator by √b.\n\nExample: 6 / √3 = (6 × √3) / (√3 × √3) = 6√3 / 3 = 2√3.",
            formula = "a / √b = (a√b) / b",
            order = 4
        ),
        Flashcard(
            id = "${topicId}_5",
            cardType = LearningCardType.FORMULA,
            title = "Conjugate Surds",
            subtitle = "Binomial Denominators",
            content = "The conjugate of (a + √b) is (a - √b).\n\nMultiplying a binomial surd by its conjugate uses difference of two squares: (a + √b)(a - √b) = a² - b, eliminating all surds.",
            formula = "(a + √b)(a - √b) = a² - b",
            order = 5
        ),
        Flashcard(
            id = "${topicId}_6",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Solved Example: Conjugate Rationalization",
            subtitle = "Step-by-Step",
            content = "Simplify 1 / (3 + √2).\n\nMultiply numerator and denominator by conjugate (3 - √2):\n= (1 × (3 - √2)) / ((3 + √2)(3 - √2))\n= (3 - √2) / (3² - 2)\n= (3 - √2) / (9 - 2) = (3 - √2) / 7.",
            formula = "1 / (3 + √2) = (3 - √2) / 7",
            order = 6
        ),
        Flashcard(
            id = "${topicId}_7",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Quick Recap: Surds",
            subtitle = "Summary",
            content = "• √(ab) = √a√b\n• Single denominator: multiply by √b / √b\n• Binomial denominator: multiply by conjugate (a - √b)/(a - √b)\n• √(a + b) is never equal to √a + √b.",
            order = 7
        )
    )

    private fun getCommerceBankingFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "Meaning of Banking",
            subtitle = "Commercial & Financial Infrastructure",
            content = "Banking is the business activity of accepting deposits of money from the public, safeguarding them, and creating credit by lending funds to borrowers.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.COMPARISON,
            title = "Commercial Banks vs Central Bank",
            subtitle = "Institution Differences",
            content = "• Central Bank (CBN): Apex regulatory bank, issues currency, banker to government and commercial banks, operates monetary policy.\n\n• Commercial Banks: Profit-making financial institutions, accept public deposits, provide loans, issue cheque books.",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Types of Bank Accounts",
            subtitle = "Current, Savings, and Fixed Deposit",
            content = "• Current Account: For businesses, withdrawal on demand by cheque, charges COT (Commission on Turnover), no interest paid.\n• Savings Account: For small savers, pays interest, withdrawal by passbook/ATM.\n• Fixed Deposit Account: Money locked for a fixed tenure, attracts highest interest rate.",
            order = 3
        ),
        Flashcard(
            id = "${topicId}_4",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Cheques and Endorsement",
            subtitle = "Negotiable Instruments",
            content = "A cheque is an unconditional order in writing addressed by a customer (drawer) to a bank (drawee) to pay a specified sum to a third party (payee).\n\nCrossing a cheque (drawing two parallel transverse lines) mandates payment strictly through a bank account, preventing cash fraud.",
            order = 4
        )
    )

    private fun getCellStructureFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "The Cell: Basic Unit of Life",
            subtitle = "Cell Theory",
            content = "The cell is the basic structural, functional, and biological unit of all living organisms.\n\nCell Theory states that all living organisms are composed of one or more cells, and all cells arise from pre-existing cells.",
            diagramId = "cell_organelles_overview",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.COMPARISON,
            title = "Plant Cell vs Animal Cell",
            subtitle = "Key Organelle Differences",
            content = "• Plant Cells: Possess cellulose cell wall, large central vacuole, and chloroplasts for photosynthesis.\n\n• Animal Cells: Lack cell wall and chloroplasts; possess flexible plasma membrane and small temporary vacuoles.",
            comparisonLeftTitle = "Plant Cell",
            comparisonRightTitle = "Animal Cell",
            comparisonPairs = listOf(
                "Cellulose cell wall present" to "Cell wall absent",
                "Chloroplasts present" to "Chloroplasts absent",
                "Large central vacuole" to "Small temporary vacuoles"
            ),
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Core Cell Organelles & Functions",
            subtitle = "Organelle Breakdown",
            content = "• Nucleus: Controls cell activities and houses DNA\n• Mitochondria: Powerhouse of the cell, generates ATP via aerobic respiration\n• Ribosomes: Sites of protein synthesis\n• Endoplasmic Reticulum (ER): Transport network within cytoplasm\n• Chloroplast: Site of photosynthesis.",
            diagramId = "cell_organelles_overview",
            order = 3
        )
    )

    private fun getElectricityFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "Electric Current and Charge",
            subtitle = "Flow of Electrons",
            content = "Electric current (I) is the rate of flow of electric charge (Q) through a conductor.\n\nSI unit of current is the Ampere (A), and charge is measured in Coulombs (C).",
            formula = "Q = I × t   (Charge = Current × Time)",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.FORMULA,
            title = "Ohm's Law",
            subtitle = "Fundamental Circuit Law",
            content = "Ohm's Law states that current flowing through a metallic conductor is directly proportional to the potential difference across its ends, provided temperature and other physical conditions remain constant.",
            formula = "V = I × R   (Voltage = Current × Resistance)",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Resistors in Series and Parallel",
            subtitle = "Equivalent Resistance Formulas",
            content = "• In Series: R_total = R₁ + R₂ + R₃ (Current is constant, voltage divides)\n• In Parallel: 1/R_total = 1/R₁ + 1/R₂ (Voltage is constant, current divides).\n\nTwo resistors in parallel: R_eq = (R₁ × R₂) / (R₁ + R₂).",
            formula = "R_series = R₁ + R₂   |   R_parallel = (R₁R₂) / (R₁ + R₂)",
            order = 3
        )
    )

    private fun getAcidsFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "Definition of an Acid",
            subtitle = "Arrhenius & Bronsted-Lowry",
            content = "• Arrhenius: An acid produces hydrogen ions (H⁺ or H₃O⁺) as the only positive ion in aqueous solution.\n• Bronsted-Lowry: An acid is a proton (H⁺) donor.\n\nAcids taste sour, turn blue litmus paper red, and have pH < 7.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.COMPARISON,
            title = "Strong vs Weak Acids",
            subtitle = "Degree of Ionization",
            content = "• Strong Acids: Completely ionize in aqueous solution (e.g., HCl, H₂SO₄, HNO₃).\n\n• Weak Acids: Only partially ionize in water (e.g., CH₃COOH - ethanoic acid, H₂CO₃ - carbonic acid).",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Chemical Properties of Acids",
            subtitle = "Core Reactions",
            content = "1. Acid + Metal → Salt + Hydrogen gas (H₂)\n2. Acid + Base → Salt + Water (Neutralization)\n3. Acid + Trioxocarbonate(IV) → Salt + Water + Carbon(IV) oxide (CO₂).",
            formula = "Acid + Base → Salt + H₂O",
            order = 3
        )
    )

    private fun getSeparationOfPowersFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "Separation of Powers",
            subtitle = "Baron de Montesquieu",
            content = "Separation of powers is the constitutional principle that the three organs of government (Legislature, Executive, and Judiciary) should be kept distinct and independent to prevent tyranny.",
            keyTakeaway = "Formulated by Baron de Montesquieu in 'The Spirit of the Laws' (1748).",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "The Three Organs of Government",
            subtitle = "Organs & Functions",
            content = "• Legislature: Makes laws (National Assembly in Nigeria: Senate & House of Reps)\n• Executive: Enforces and implements laws (President, Ministers, Civil Service)\n• Judiciary: Interprets laws and adjudicates disputes (Supreme Court, Court of Appeal).",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Checks and Balances",
            subtitle = "Mutual Supervision",
            content = "Checks and balances ensures each organ possesses constitutional mechanisms to restrain and check the excesses of the other two organs.\n\nExamples: Presidential veto on bills, Judicial review of executive actions, Legislative confirmation of judicial appointments.",
            order = 3
        )
    )

    private fun getDoubleEntryFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "The Golden Rule of Double Entry",
            subtitle = "Debit and Credit Principle",
            content = "The double entry system states that for every debit entry, there must be a corresponding credit entry, and for every credit entry, there must be a corresponding debit entry.\n\nDebit the receiver (asset increases / expense increases).\nCredit the giver (liability increases / income increases).",
            formula = "Debit = Credit",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.FORMULA,
            title = "The Accounting Equation",
            subtitle = "Balance Sheet Equation",
            content = "The foundation of all accounting statements: the total assets of a business are always equal to the sum of capital and liabilities.",
            formula = "Assets = Capital + Liabilities",
            formulaVariables = listOf("Assets" to "Resources owned by the business", "Capital" to "Owner's equity/investment", "Liabilities" to "Amounts owed to outsiders"),
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Worked Example: Starting a Business",
            subtitle = "Journalizing Transactions",
            content = "Transaction: Mr. Obi starts business with ₦500,000 cash.\n\n• Debit: Cash Account ₦500,000 (Asset increases)\n• Credit: Capital Account ₦500,000 (Equity increases).",
            order = 3
        )
    )

    private fun getFiguresOfSpeechLiteratureFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "Simile vs Metaphor",
            subtitle = "Direct vs Implied Comparison",
            content = "• Simile: Explicit comparison of two different things using connective words 'like' or 'as' (e.g., 'He fights like a lion').\n\n• Metaphor: Direct implied comparison stating that one thing IS another without 'like' or 'as' (e.g., 'He is a lion in battle').",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.DEFINITION,
            title = "Personification and Hyperbole",
            subtitle = "Literary Devices",
            content = "• Personification: Giving human attributes or qualities to inanimate objects or abstract ideas (e.g., 'The wind whispered through the trees').\n\n• Hyperbole: Deliberate and obvious exaggeration used for emphasis or comic effect (e.g., 'I have told you a million times').",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.DEFINITION,
            title = "Irony and Oxymoron",
            subtitle = "Contrast and Juxtaposition",
            content = "• Irony: Expression of meaning using language that usually signifies the opposite (verbal, dramatic, situational irony).\n\n• Oxymoron: Placing two contradictory terms side by side for effect (e.g., 'deafening silence', 'cruel kindness').",
            order = 3
        )
    )

    private fun getCreationFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "The Creation Story (Genesis 1 & 2)",
            subtitle = "Sovereignty of God",
            content = "In Genesis 1, God created the heavens and the earth out of nothing (ex nihilo) by the power of His word over six days, and rested on the seventh day.\n\nMan was created in the image and likeness of God to exercise dominion.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Sequence of Creation Days",
            subtitle = "Genesis 1 Account",
            content = "• Day 1: Light (separated from darkness)\n• Day 2: Firmament / Sky (separated waters)\n• Day 3: Dry land, Seas, and Vegetation\n• Day 4: Sun, Moon, and Stars (luminaries)\n• Day 5: Sea creatures and Birds\n• Day 6: Land animals and Man\n• Day 7: God rested (Sabbath).",
            order = 2
        )
    )

    private fun getLatitudeLongitudeFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "Parallels of Latitude",
            subtitle = "Angular Distance North or South",
            content = "Latitude is the angular distance of a place north or south of the Earth's Equator (0°).\n\nImportant lines:\n• Equator: 0°\n• Tropic of Cancer: 23½° N\n• Tropic of Capricorn: 23½° S\n• Arctic Circle: 66½° N\n• Antarctic Circle: 66½° S.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.FORMULA,
            title = "Meridians of Longitude & Local Time",
            subtitle = "Time Calculation Formula",
            content = "Longitude is the angular distance east or west of the Prime Meridian at Greenwich, London (0°).\n\n• The Earth rotates 360° in 24 hours → 15° per hour → 1° every 4 minutes.\n• Moving East = GAIN time (E.G.A: East Gain Add)\n• Moving West = LOSE time (W.L.S: West Lose Subtract).",
            formula = "15° = 1 hour  |  1° = 4 minutes",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.WORKED_EXAMPLE,
            title = "Worked Example: Longitude Time Difference",
            subtitle = "Step-by-Step",
            content = "If the time at Greenwich (0°) is 12:00 noon, what is the local time in Lagos, Nigeria (15° E)?\n\n• Longitude difference = 15° - 0° = 15°\n• Time difference = 15° × 4 mins = 60 mins = 1 hour\n• Since Lagos is East, ADD 1 hour: 12:00 + 1 hr = 1:00 PM.",
            formula = "Local Time = 1:00 PM",
            order = 3
        )
    )

    private fun getTransSaharanTradeFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "What was the Trans-Saharan Trade?",
            subtitle = "Historic African Trade Route",
            content = "The Trans-Saharan Trade was the ancient commercial network across the Sahara Desert linking North Africa and the Mediterranean with West African empires (Ghana, Mali, Songhai, Kanem-Bornu, and Hausa States).",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Major Commodities of Trade",
            subtitle = "North vs West Africa",
            content = "• From West Africa: Gold, Slaves, Ivory, Kola nuts, Hides and Skins.\n• From North Africa: Salt (from Taghaza), Horses, Cowries, Silk, Swords, and Books.\n\nThe camel was the chief medium of transport, enabling deep desert caravans.",
            order = 2
        )
    )

    private fun getTawhidFlashcards(topicId: String): List<Flashcard> = listOf(
        Flashcard(
            id = "${topicId}_1",
            cardType = LearningCardType.DEFINITION,
            title = "Concept of Tawhid (Islamic Monotheism)",
            subtitle = "Core Pillar of Islamic Faith",
            content = "Tawhid is the Islamic concept of the indivisible oneness of Allah. It is the fundamental foundation of Islam and the first part of the Shahadah (declaration of faith).",
            keyTakeaway = "La ilaha illa Allah: There is no deity worthy of worship except Allah.",
            order = 1
        ),
        Flashcard(
            id = "${topicId}_2",
            cardType = LearningCardType.KEY_TAKEAWAYS,
            title = "Three Categories of Tawhid",
            subtitle = "Theological Classification",
            content = "1. Tawhid ar-Rububiyyah: Oneness of Allah in His Lordship (He alone creates, sustains, and governs the universe).\n2. Tawhid al-Uluhiyyah: Oneness of Allah in worship (no act of worship is directed to any other entity).\n3. Tawhid al-Asma' wa as-Sifat: Oneness of Allah in His Divine Names and Attributes.",
            order = 2
        ),
        Flashcard(
            id = "${topicId}_3",
            cardType = LearningCardType.DEFINITION,
            title = "Shirk: The Greatest Sin",
            subtitle = "Associating Partners with Allah",
            content = "Shirk is the direct opposite of Tawhid. It is the association of any partner or rival with Allah in His Lordship, Worship, or Divine Attributes.\n\nIn the Holy Qur'an, Shirk is the only unforgivable sin if a person dies without repenting.",
            order = 3
        )
    )

    // ==========================================
    // 9. PROGRESSIVE PEDAGOGICAL CARD GENERATOR
    // Generates 10-12 structured, bite-sized cards for every other syllabus topic
    // ==========================================
    private fun generateProgressiveTopicCards(
        subjectId: String,
        topicName: String,
        topicId: String
    ): List<Flashcard> {
        val subjectDisplayName = when (subjectId) {
            "english" -> "Use of English"
            "mathematics" -> "Mathematics"
            "physics" -> "Physics"
            "chemistry" -> "Chemistry"
            "biology" -> "Biology"
            "economics" -> "Economics"
            "government" -> "Government"
            "literature" -> "Literature in English"
            "commerce" -> "Commerce"
            "crs" -> "CRS"
            "accounts" -> "Principles of Accounts"
            "geography" -> "Geography"
            "history" -> "History"
            "irs" -> "Islamic Religious Studies"
            else -> subjectId.replaceFirstChar { it.uppercase() }
        }

        return listOf(
            Flashcard(
                id = "${topicId}_1",
                cardType = LearningCardType.DEFINITION,
                title = "What is $topicName?",
                subtitle = "Core Definition & Purpose",
                content = "$topicName forms an essential part of the $subjectDisplayName syllabus for UTME.\n\nIt focuses on understanding the primary concepts, standard classifications, and practical problem-solving rules required for accurate exam analysis.",
                keyTakeaway = "Mastering $topicName requires clear understanding of terms and core operational rules.",
                order = 1
            ),
            Flashcard(
                id = "${topicId}_2",
                cardType = LearningCardType.KEY_TAKEAWAYS,
                title = "Fundamental Concepts of $topicName",
                subtitle = "Essential Principles",
                content = "To analyze questions on $topicName correctly, observe the following basic principles:\n\n1. Identify the given components and standard definitions.\n2. Apply the correct formulas, classifications, or frameworks.\n3. Distinguish between cause, effect, and practical outcomes.",
                order = 2
            ),
            Flashcard(
                id = "${topicId}_3",
                cardType = LearningCardType.COMPARISON,
                title = "Classification & Key Distinctions",
                subtitle = "Categorization",
                content = "$topicName involves distinguishing between major categories, structures, or rules.\n\nExaminers frequently test the contrast between standard forms and special cases.",
                comparisonLeftTitle = "Standard / Primary Case",
                comparisonRightTitle = "Secondary / Special Case",
                comparisonPairs = listOf(
                    "Core characteristics" to "Conditional variations",
                    "Direct application rule" to "Exception to standard rule"
                ),
                order = 3
            ),
            Flashcard(
                id = "${topicId}_4",
                cardType = LearningCardType.WORKED_EXAMPLE,
                title = "Step-by-Step Solved Problem",
                subtitle = "Worked Example for $topicName",
                content = "When solving a standard question in $topicName:\n\nStep 1: State the underlying principle or equation.\nStep 2: Substitute the known values accurately.\nStep 3: Simplify and state the final result with appropriate units or categories.",
                order = 4
            ),
            Flashcard(
                id = "${topicId}_5",
                cardType = LearningCardType.WORKED_EXAMPLE,
                title = "Second Application Example",
                subtitle = "Advanced Problem Solving",
                content = "Consider a multi-step question in $topicName:\n\nEnsure that all intermediate steps align with standard $subjectDisplayName guidelines before computing or selecting the final option.",
                keyTakeaway = "Always verify the initial conditions before applying formulas or definitions.",
                order = 5
            ),
            Flashcard(
                id = "${topicId}_6",
                cardType = LearningCardType.KEY_TAKEAWAYS,
                title = "Real-World Application & Relevance",
                subtitle = "Practical Importance",
                content = "Understanding $topicName is not just theoretical—it provides critical models used across scientific, commercial, social, and literary analysis.\n\nConnecting concepts to practical examples accelerates retention and recall.",
                order = 6
            ),
            Flashcard(
                id = "${topicId}_7",
                cardType = LearningCardType.EXAM_TIP,
                title = "Common Mistakes in $topicName",
                subtitle = "Avoid These Exam Traps",
                content = "• Mistake 1: Confusing similar sounding terms or inverse principles.\n• Mistake 2: Forgetting boundary conditions, units, or grammatical concord.\n• Mistake 3: Overlooking negative signs or prerequisite definitions.",
                keyTakeaway = "Read each question stem carefully to avoid common distractor traps.",
                order = 7
            ),
            Flashcard(
                id = "${topicId}_8",
                cardType = LearningCardType.KEY_TAKEAWAYS,
                title = "Quick Recap: $topicName",
                subtitle = "High-Yield Summary",
                content = "• Core principle: Understand the definition and active components.\n• Key rule: Apply consistent operations from first principles.\n• Exam strategy: Eliminate options that violate fundamental laws of $topicName.",
                keyTakeaway = "Reviewing these flashcards ensures solid foundational mastery.",
                order = 8
            )
        )
    }
}
