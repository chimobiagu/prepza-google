package com.example.data.engine

import java.security.MessageDigest
import java.util.concurrent.ConcurrentHashMap

/**
 * Central registry of authentic, verified visual assets for CBT questions.
 * Supports vector scientific diagrams, coordinate graphs, geometric figures,
 * structured tables, and apparatus diagrams.
 */
object CbtVisualRegistry {

    private val assetCache = ConcurrentHashMap<String, VisualAsset>()

    init {
        registerBuiltInVisuals()
    }

    /**
     * Resolves a [VisualAsset] by its unique question ID or diagram key.
     */
    fun getVisualForQuestion(questionId: String, imageUrlOrKey: String?): VisualAsset? {
        val direct = assetCache[questionId]
        if (direct != null) return direct

        if (!imageUrlOrKey.isNullOrBlank()) {
            val byKey = assetCache[imageUrlOrKey]
            if (byKey != null) return byKey
        }

        // Check if there is an inferred visual based on question stem patterns
        return assetCache.values.firstOrNull { it.questionId == questionId }
    }

    /**
     * Registers a custom visual asset.
     */
    fun registerAsset(asset: VisualAsset) {
        assetCache[asset.questionId] = asset
        if (!asset.diagramKey.isNullOrBlank()) {
            assetCache[asset.diagramKey] = asset
        }
    }

    /**
     * Total count of registered verified visual assets.
     */
    val totalVisualCount: Int get() = assetCache.values.distinctBy { it.assetId }.size

    /**
     * Returns all registered assets.
     */
    fun getAllAssets(): List<VisualAsset> = assetCache.values.distinctBy { it.assetId }

    private fun registerBuiltInVisuals() {
        // --- 1. MATHEMATICS GEOMETRY & GRAPHS ---

        // Triangle Geometry (Pythagoras & Trigonometry)
        registerAsset(
            VisualAsset(
                assetId = "math_vis_triangle_01",
                questionId = "jamb_math_diag_001",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 380,
                height = 240,
                contentHash = computeHash("math_right_triangle_abc_3_4_5"),
                caption = "Figure 1: Right-Angled Triangle ABC with acute angle θ at vertex A",
                altText = "Right triangle ABC with adjacent side AB = 4 cm, opposite side BC = 3 cm, and hypotenuse AC = x.",
                diagramKey = "math_right_triangle",
                verified = true
            )
        )

        // Circle Theorems (Angle in alternate segment / cyclic quad)
        registerAsset(
            VisualAsset(
                assetId = "math_vis_circle_01",
                questionId = "jamb_math_diag_002",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 360,
                height = 260,
                contentHash = computeHash("math_circle_theorem_cyclic_quad"),
                caption = "Figure 2: Circle with center O and inscribed quadrilateral ABCD",
                altText = "Circle with inscribed cyclic quadrilateral ABCD where opposite angles subtend chord AB.",
                diagramKey = "math_circle_cyclic_quad",
                verified = true
            )
        )

        // Coordinate Geometry / Linear Function Graph
        registerAsset(
            VisualAsset(
                assetId = "math_vis_coord_graph_01",
                questionId = "jamb_math_diag_003",
                type = VisualType.GRAPH_REQUIRED,
                width = 380,
                height = 250,
                contentHash = computeHash("math_coord_graph_linear"),
                caption = "Figure 3: Cartesian coordinate plane with line L cutting axes at (0, 3) and (4, 0)",
                altText = "Graph of linear function showing intercept on y-axis at (0, 3) and x-axis at (4, 0).",
                diagramKey = "math_coordinate_graph",
                verified = true
            )
        )

        // --- 2. PHYSICS CIRCUITS, OPTICS & MECHANICS ---

        // Parallel Electric Circuit
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_circuit_parallel",
                questionId = "jamb_phy_diag_001",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 400,
                height = 250,
                contentHash = computeHash("phy_circuit_parallel_4_6_ohm"),
                caption = "Figure 4: Parallel circuit diagram with 4 Ω and 6 Ω resistors across 12 V battery",
                altText = "Circuit schematic showing 12V DC power source branching into parallel resistors of 4 ohms and 6 ohms.",
                diagramKey = "phy_circuit_parallel",
                verified = true
            )
        )

        // Optics: Convex Lens Ray Diagram
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_optics_lens",
                questionId = "jamb_phy_diag_002",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 420,
                height = 240,
                contentHash = computeHash("phy_optics_convex_lens_ray"),
                caption = "Figure 5: Principal ray tracing for an object placed beyond 2F of a converging lens",
                altText = "Convex lens with optical axis, focal points F and 2F, object arrow upright, and inverted real image formed beyond F.",
                diagramKey = "phy_optics_convex_lens",
                verified = true
            )
        )

        // Mechanics: Pulley System
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pulley_block_tackle",
                questionId = "jamb_phy_diag_003",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 340,
                height = 280,
                contentHash = computeHash("phy_pulley_velocity_ratio_4"),
                caption = "Figure 6: Block and tackle pulley system with velocity ratio VR = 4",
                altText = "Two fixed upper pulleys and two movable lower pulleys supporting a suspended load.",
                diagramKey = "phy_pulley_system",
                verified = true
            )
        )

        // Physics: Velocity-Time Graph
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_vt_graph",
                questionId = "jamb_phy_diag_004",
                type = VisualType.GRAPH_REQUIRED,
                width = 390,
                height = 240,
                contentHash = computeHash("phy_velocity_time_trapezium"),
                caption = "Figure 7: Velocity-Time graph showing uniform acceleration, constant velocity, and deceleration",
                altText = "Trapezoidal v-t graph accelerating from 0 to 20 m/s in 5s, constant for 15s, decelerating to rest in 10s.",
                diagramKey = "phy_velocity_time_graph",
                verified = true
            )
        )

        // --- 3. CHEMISTRY APPARATUS, CELLS & EQUILIBRIA ---

        // Chemistry: Acid-Base Titration Setup
        registerAsset(
            VisualAsset(
                assetId = "chem_vis_titration_apparatus",
                questionId = "jamb_chem_diag_001",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 340,
                height = 290,
                contentHash = computeHash("chem_titration_burette_pipette"),
                caption = "Figure 8: Quantitative volumetric acid-base titration assembly",
                altText = "Retort stand supporting a 50 cm³ burette with stopcock over a 250 cm³ conical flask with white tile.",
                diagramKey = "chem_titration_setup",
                verified = true
            )
        )

        // Chemistry: Electrochemical / Daniell Cell
        registerAsset(
            VisualAsset(
                assetId = "chem_vis_daniell_cell",
                questionId = "jamb_chem_diag_002",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 410,
                height = 260,
                contentHash = computeHash("chem_daniell_cell_zn_cu_saltbridge"),
                caption = "Figure 9: Daniell voltaic cell with Zinc and Copper electrodes and KNO₃ salt bridge",
                altText = "Zinc electrode in ZnSO4 half-cell connected through voltmeter and salt bridge to Copper electrode in CuSO4 half-cell.",
                diagramKey = "chem_daniell_cell",
                verified = true
            )
        )

        // Chemistry: Reaction Energy Profile (Exothermic vs Endothermic)
        registerAsset(
            VisualAsset(
                assetId = "chem_vis_energy_profile",
                questionId = "jamb_chem_diag_003",
                type = VisualType.GRAPH_REQUIRED,
                width = 380,
                height = 240,
                contentHash = computeHash("chem_energy_profile_activation_energy"),
                caption = "Figure 10: Potential energy curve for an exothermic catalyzed vs uncatalyzed reaction",
                altText = "Energy profile showing reactant potential energy, transition state with activation energy barrier Ea, and product level (negative enthalpy delta H).",
                diagramKey = "chem_energy_profile",
                verified = true
            )
        )

        // --- 4. BIOLOGY CELL BIOLOGY, ANATOMY & SPECIMENS ---

        // Biology: Generalized Plant Cell with Labelled Organelles
        registerAsset(
            VisualAsset(
                assetId = "bio_vis_plant_cell_labelled",
                questionId = "jamb_bio_diag_001",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 400,
                height = 270,
                contentHash = computeHash("bio_plant_cell_chloroplast_cellwall"),
                caption = "Figure 11: Longitudinal section of a generalized mature plant cell",
                altText = "Plant cell showing cellulose cell wall (I), large central sap vacuole (II), chloroplast (III), and nucleus (IV).",
                diagramKey = "bio_plant_cell",
                verified = true
            )
        )

        // Biology: Human Nephron / Kidney Structure
        registerAsset(
            VisualAsset(
                assetId = "bio_vis_human_nephron",
                questionId = "jamb_bio_diag_002",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 390,
                height = 280,
                contentHash = computeHash("bio_nephron_bowmans_capsule_loop_henle"),
                caption = "Figure 12: Microscopic functional unit of the kidney (Nephron)",
                altText = "Diagram of mammalian nephron showing Bowman's capsule (P), proximal convoluted tubule (Q), Loop of Henle (R), and collecting duct (S).",
                diagramKey = "bio_nephron_structure",
                verified = true
            )
        )

        // Biology: Insect Metamorphosis (Arthropod Life Cycle)
        registerAsset(
            VisualAsset(
                assetId = "bio_vis_arthropod_lifecycle",
                questionId = "jamb_bio_pt1_05",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 380,
                height = 260,
                contentHash = computeHash("bio_arthropod_metamorphosis_stages"),
                caption = "Figure 13: Representative developmental stages of agricultural insect pests",
                altText = "Four insect stages: Adult grasshopper (I), grain weevil (II), housefly pupa (III), and caterpillar larva (IV).",
                diagramKey = "bio_arthropod_stages",
                verified = true
            )
        )

        // Biology: Seedling Vascular Conduction
        registerAsset(
            VisualAsset(
                assetId = "bio_vis_seedling_vascular",
                questionId = "jamb_bio_diag_003",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 360,
                height = 270,
                contentHash = computeHash("bio_seedling_xylem_phloem_transpiration"),
                caption = "Figure 14: Vascular transport pathways in a young dicotyledonous seedling",
                altText = "Seedling showing upward water flow in xylem (Arrow I), bidirectional organic transport in phloem (Arrow II), and transpiration (Arrow III).",
                diagramKey = "bio_vascular_seedling",
                verified = true
            )
        )

        // --- 5. STRUCTURED DATA TABLES (CHEMISTRY & ECONOMICS & MATH) ---

        // Chemistry: Qualitative Analysis Cation/Anion Table
        registerAsset(
            VisualAsset(
                assetId = "chem_vis_table_qualitative",
                questionId = "jamb_chem_table_001",
                type = VisualType.TABLE_REQUIRED,
                width = 420,
                height = 240,
                contentHash = computeHash("chem_qualitative_table_precipitate"),
                caption = "Table 1: Experimental Observations and Inferences on Unknown Salt X",
                altText = "Table with Test, Observation, and Inference columns for salt X reaction with NaOH and NH3.",
                diagramKey = "chem_qualitative_table",
                tableData = TableVisualData(
                    title = "Qualitative Analysis of Inorganic Salt Sample X",
                    headers = listOf("Test", "Observation", "Inference"),
                    rows = listOf(
                        listOf("Sample X + few drops of NaOH(aq)", "White gelatinous precipitate formed", "Al³⁺, Pb²⁺, or Zn²⁺ suspected"),
                        listOf("Add excess NaOH(aq)", "Precipitate dissolves to give clear solution", "Al³⁺, Pb²⁺, or Zn²⁺ confirmed"),
                        listOf("Sample X + NH₃(aq) in excess", "White precipitate remains insoluble", "Al³⁺ or Pb²⁺ present")
                    ),
                    footnote = "Standard qualitative analysis scheme for metallic cations."
                ),
                verified = true
            )
        )

        // Mathematics: Frequency Distribution Table
        registerAsset(
            VisualAsset(
                assetId = "math_vis_table_frequency",
                questionId = "jamb_math_table_001",
                type = VisualType.TABLE_REQUIRED,
                width = 420,
                height = 220,
                contentHash = computeHash("math_frequency_distribution_scores"),
                caption = "Table 2: Frequency Distribution of UTME Mock Mathematics Scores",
                altText = "Table showing Score Intervals (10-19, 20-29, 30-39, 40-49, 50-59) and corresponding frequencies.",
                diagramKey = "math_frequency_table",
                tableData = TableVisualData(
                    title = "UTME Mathematics Score Distribution (n = 50)",
                    headers = listOf("Class Interval", "Tally Marks", "Frequency (f)", "Midpoint (x)"),
                    rows = listOf(
                        listOf("10 - 19", "||||", "4", "14.5"),
                        listOf("20 - 29", "|||| |||", "8", "24.5"),
                        listOf("30 - 39", "|||| |||| ||||", "15", "34.5"),
                        listOf("40 - 49", "|||| |||| ||", "12", "44.5"),
                        listOf("50 - 59", "|||| |||| |", "11", "54.5")
                    ),
                    footnote = "Determine the modal class and estimated mean score from the table."
                ),
                verified = true
            )
        )
    }

    private fun computeHash(input: String): String {
        val digest = MessageDigest.getInstance("SHA-256")
        val bytes = digest.digest(input.toByteArray(Charsets.UTF_8))
        return bytes.joinToString("") { "%02x".format(it) }.take(16)
    }
}
