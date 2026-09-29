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

        // --- 6. AUTHENTIC JAMB MATHEMATICS 2014 EXAM VISUALS ---

        // Maths 2014 Q37: Discrete Frequency Distribution
        registerAsset(
            VisualAsset(
                assetId = "math_vis_2014_q37",
                questionId = "jamb_maths_2014_37",
                type = VisualType.TABLE_REQUIRED,
                width = 420,
                height = 200,
                contentHash = computeHash("math_2014_table_q37"),
                caption = "Table: Values and Associated Frequencies",
                altText = "Table showing Values (0, 1, 2, 3, 4) with Frequencies (1, 2, 2, 1, 9).",
                diagramKey = "math_table_distribution_0_4",
                tableData = TableVisualData(
                    title = "Frequency Distribution Table",
                    headers = listOf("Values", "0", "1", "2", "3", "4"),
                    rows = listOf(
                        listOf("Frequency", "1", "2", "2", "1", "9")
                    ),
                    footnote = "Find the mode of the distribution above."
                ),
                verified = true
            )
        )

        // Maths 2014 Q41: Die Throw Frequency Table
        registerAsset(
            VisualAsset(
                assetId = "math_vis_2014_q41",
                questionId = "jamb_maths_2014_41",
                type = VisualType.TABLE_REQUIRED,
                width = 440,
                height = 200,
                contentHash = computeHash("math_2014_table_die_q41"),
                caption = "Table: Outcome of Throwing a Die 100 Times",
                altText = "Table with Numbers 1 to 6 and Frequencies 18, 22, 20, 16, 10, 14.",
                diagramKey = "math_table_die_outcomes",
                tableData = TableVisualData(
                    title = "Die Throw Outcomes (n = 100)",
                    headers = listOf("Numbers", "1", "2", "3", "4", "5", "6"),
                    rows = listOf(
                        listOf("Frequency", "18", "22", "20", "16", "10", "14")
                    ),
                    footnote = "What is the probability of obtaining at least a 4?"
                ),
                verified = true
            )
        )

        // Maths 2014 Q43: Venn Diagram 3 Sets
        registerAsset(
            VisualAsset(
                assetId = "math_vis_2014_q43",
                questionId = "jamb_maths_2014_43",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 380,
                height = 250,
                contentHash = computeHash("math_2014_venn_q43"),
                caption = "Figure: Three-Set Venn Diagram (P, Q, R) with Shaded Intersections",
                altText = "Venn diagram showing circles P, Q, R with shaded regions representing (P ∩ Q) ∪ (P ∩ R).",
                diagramKey = "math_venn_diagram_3_sets",
                verified = true
            )
        )

        // Maths 2014 Q44: Parallel Lines Geometry
        registerAsset(
            VisualAsset(
                assetId = "math_vis_2014_q44",
                questionId = "jamb_maths_2014_44",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 380,
                height = 250,
                contentHash = computeHash("math_2014_geom_q44"),
                caption = "Figure: Parallel Lines KL // NM with Angle Bisector LN",
                altText = "Geometric diagram with KL parallel to NM, angle KLN = 54°, angle MKN = 35°, and LN bisecting angle KNM.",
                diagramKey = "math_parallel_lines_geometry",
                verified = true
            )
        )

        // Maths 2014 Q45: Intersecting Straight Lines
        registerAsset(
            VisualAsset(
                assetId = "math_vis_2014_q45",
                questionId = "jamb_maths_2014_45",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 360,
                height = 220,
                contentHash = computeHash("math_2014_lines_q45"),
                caption = "Figure: Intersecting Lines with Angles q° and 30°",
                altText = "Two intersecting lines with angle q° vertically opposite to 30°, and adjacent supplementary angle (p + 2q)°.",
                diagramKey = "math_intersecting_lines_angles",
                verified = true
            )
        )

        // Maths 2014 Q46: Triangle with Sine Rule
        registerAsset(
            VisualAsset(
                assetId = "math_vis_2014_q46",
                questionId = "jamb_maths_2014_46",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 380,
                height = 240,
                contentHash = computeHash("math_2014_tri_q46"),
                caption = "Figure: Triangle with Base Angles 30° and 60° and Side 10cm",
                altText = "Triangle with opposite side x to angle 60° and side 10cm to angle 30°.",
                diagramKey = "math_triangle_sine_rule",
                verified = true
            )
        )

        // Maths 2014 Q47: Coordinate Line on Cartesian Axes
        registerAsset(
            VisualAsset(
                assetId = "math_vis_2014_q47",
                questionId = "jamb_maths_2014_47",
                type = VisualType.GRAPH_REQUIRED,
                width = 380,
                height = 260,
                contentHash = computeHash("math_2014_cartesian_q47"),
                caption = "Figure: Straight Line Passing Through (0, 5) and (5, 0)",
                altText = "Cartesian plane graph with x and y axes from -5 to +5, showing line with y-intercept 5 and x-intercept 5.",
                diagramKey = "math_cartesian_line_05_50",
                verified = true
            )
        )

        // Maths 2014 Q48: Food Items Pie Chart
        registerAsset(
            VisualAsset(
                assetId = "math_vis_2014_q48",
                questionId = "jamb_maths_2014_48",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 380,
                height = 260,
                contentHash = computeHash("math_2014_pie_q48"),
                caption = "Figure: Monthly Salary Distribution on Food Items",
                altText = "Pie chart with sectors: Gari 70°, Rice 80°, Beans 50°, and Yam 160°.",
                diagramKey = "math_pie_chart_food",
                verified = true
            )
        )

        // --- 7. AUTHENTIC JAMB PHYSICS PT. 1-5 EXAM VISUALS ---

        // Physics PT.1 Q5: Right Angle Vectors
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt1_q05",
                questionId = "jamb_phy_pt1_05",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 360,
                height = 240,
                contentHash = computeHash("phy_pt1_q05_vectors"),
                caption = "Figure: Two Vectors at Right Angles (6.0 N and 8.0 N)",
                altText = "Vertical vector of 6.0 N and horizontal vector of 8.0 N at 90° to each other.",
                diagramKey = "phy_vectors_perpendicular",
                verified = true
            )
        )

        // Physics PT.1 Q8: Positions of a Cone
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt1_q08",
                questionId = "jamb_phy_pt1_08",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 400,
                height = 220,
                contentHash = computeHash("phy_pt1_q08_cone"),
                caption = "Figure: Positions of a Cone (X inverted, Y upright, Z on lateral surface)",
                altText = "Three cone orientations: X on apex (unstable), Y on base (stable), Z lying horizontally on side (neutral equilibrium).",
                diagramKey = "phy_cone_equilibrium",
                verified = true
            )
        )

        // Physics PT.1 Q34: Three Parallel Resistors
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt1_q34",
                questionId = "jamb_phy_pt1_34",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 380,
                height = 250,
                contentHash = computeHash("phy_pt1_q34_circuit"),
                caption = "Figure: Three Parallel Resistors (2Ω, 4Ω, 12Ω) across 12V Battery",
                altText = "Parallel combination of 2 ohms, 4 ohms, and 12 ohms connected to a 12V DC power source.",
                diagramKey = "phy_resistors_parallel_3",
                verified = true
            )
        )

        // Physics PT.2 Q4: Force Vectors (Parallelogram)
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt2_q04",
                questionId = "jamb_phy_pt2_04",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 360,
                height = 260,
                contentHash = computeHash("phy_pt2_q04_forces"),
                caption = "Figure: Vector Equilibrium with Resultant OR and Downward Tension OT",
                altText = "Parallelogram of forces with components OQ, OS = 8N, resultant OR along vertical axis, and downward balancing force OT.",
                diagramKey = "phy_parallelogram_forces",
                verified = true
            )
        )

        // Physics PT.2 Q5: Velocity-Time Graph
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt2_q05",
                questionId = "jamb_phy_pt2_05",
                type = VisualType.GRAPH_REQUIRED,
                width = 380,
                height = 240,
                contentHash = computeHash("phy_pt2_q05_vt"),
                caption = "Figure: Velocity-Time Graph (v = 60 m/s from t = 0 to 20s, stopping at 25s)",
                altText = "Graph showing initial constant velocity of 60 m/s from 0 to 20 seconds, then deceleration to 0 at 25 seconds.",
                diagramKey = "phy_vt_graph_constant_decel",
                verified = true
            )
        )

        // Physics PT.2 Q11: Force-Distance Work Graph
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt2_q11",
                questionId = "jamb_phy_pt2_11",
                type = VisualType.GRAPH_REQUIRED,
                width = 400,
                height = 250,
                contentHash = computeHash("phy_pt2_q11_fd"),
                caption = "Figure: Force-Distance Graph from x = 0m to x = 80m",
                altText = "Force vs distance graph showing positive triangular area up to 60N and x = 60m, then negative area to 80m.",
                diagramKey = "phy_force_distance_graph",
                verified = true
            )
        )

        // Physics PT.2 Q12: Block on Inclined Plane
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt2_q12",
                questionId = "jamb_phy_pt2_12",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 360,
                height = 230,
                contentHash = computeHash("phy_pt2_q12_incline"),
                caption = "Figure: Wooden Block about to Slide down Plane with Inclination α",
                altText = "Inclined plane at angle alpha to the horizontal supporting a rectangular block at the verge of sliding.",
                diagramKey = "phy_inclined_plane_alpha",
                verified = true
            )
        )

        // Physics PT.2 Q27: Transverse Wave Phase
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt2_q27",
                questionId = "jamb_phy_pt2_27",
                type = VisualType.GRAPH_REQUIRED,
                width = 390,
                height = 230,
                contentHash = computeHash("phy_pt2_q27_wave"),
                caption = "Figure: Sinusoidal Wave showing Distance x from Origin O to Particle F",
                altText = "Displacement-distance waveform showing origin O and particle F separated by distance x.",
                diagramKey = "phy_transverse_wave_phase",
                verified = true
            )
        )

        // Physics PT.2 Q31: Refraction at Glass-Water Boundary
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt2_q31",
                questionId = "jamb_phy_pt2_31",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 380,
                height = 240,
                contentHash = computeHash("phy_pt2_q31_refract"),
                caption = "Figure: Incident Ray from Glass (n=1.52) into Water (n=1.33)",
                altText = "Ray tracing at glass-water boundary showing normal line, incident angle i in glass, and refracted angle in water.",
                diagramKey = "phy_refraction_glass_water",
                verified = true
            )
        )

        // Physics PT.2 Q39 & PT.5 Q36: Six Cells Network
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt2_q39",
                questionId = "jamb_phy_pt2_39",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 390,
                height = 230,
                contentHash = computeHash("phy_pt2_q39_cells"),
                caption = "Figure: Six Identical 2V Cells in Series-Parallel Network",
                altText = "Schematic of six 2V cells with 4 connected aiding and 2 opposing in network.",
                diagramKey = "phy_six_cells_network",
                verified = true
            )
        )

        // Physics PT.4 Q06: Velocity-Time Graph (M-N-S-P-Q)
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt4_q06",
                questionId = "jamb_phy_pt4_06",
                type = VisualType.GRAPH_REQUIRED,
                width = 380,
                height = 240,
                contentHash = computeHash("phy_pt4_q06_vt"),
                caption = "Figure: Velocity-Time Graph with Sections M-N, N-S, S-P, and P-Q",
                altText = "Graph showing acceleration MN, zero acceleration (flat line) NS, acceleration SP, and deceleration PQ.",
                diagramKey = "phy_vt_graph_mnspq",
                verified = true
            )
        )

        // Physics PT.4 Q17: Stress-Strain Curve & Elastic Limit
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt4_q17",
                questionId = "jamb_phy_pt4_17",
                type = VisualType.GRAPH_REQUIRED,
                width = 380,
                height = 240,
                contentHash = computeHash("phy_pt4_q17_stress_strain"),
                caption = "Figure: Load-Extension Curve with Points Q, R (Elastic Limit), S (Yield), T (Fracture)",
                altText = "Stress-strain curve showing proportional limit Q, elastic limit R, maximum load S, and breaking point T.",
                diagramKey = "phy_stress_strain_elastic_limit",
                verified = true
            )
        )

        // Physics PT.4 Q28: Stationary Wave in Closed Tube
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt4_q28",
                questionId = "jamb_phy_pt4_28",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 350,
                height = 260,
                contentHash = computeHash("phy_pt4_q28_closed_pipe"),
                caption = "Figure: Stationary Wave of Wavelength 40cm in Closed Resonance Tube of Length L",
                altText = "Closed acoustic tube showing node at closed bottom and antinode at open top for fundamental resonance mode.",
                diagramKey = "phy_closed_tube_resonance",
                verified = true
            )
        )

        // Physics PT.4 Q35: Capacitor Circuit Network
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt4_q35",
                questionId = "jamb_phy_pt4_35",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 400,
                height = 240,
                contentHash = computeHash("phy_pt4_q35_capacitors"),
                caption = "Figure: Capacitor Circuit with Three Parallel 2μF Branch and Series 2μF, 3μF Components",
                altText = "Circuit showing parallel combination of three 2 microfarad capacitors connected with 2uF and 3uF components.",
                diagramKey = "phy_capacitor_network",
                verified = true
            )
        )

        // Physics PT.4 Q42: Step-up / Step-down Transformer
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt4_q42",
                questionId = "jamb_phy_pt4_42",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 390,
                height = 240,
                contentHash = computeHash("phy_pt4_q42_transformer"),
                caption = "Figure: Transformer Core with Primary Input Windings (Np) and Secondary Output Windings (Ns)",
                altText = "Iron core transformer with input coils on left primary winding and output coils on right secondary winding.",
                diagramKey = "phy_transformer_schematic",
                verified = true
            )
        )

        // Physics PT.4 Q50: Transistor I-V Characteristic
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt4_q50",
                questionId = "jamb_phy_pt4_50",
                type = VisualType.GRAPH_REQUIRED,
                width = 390,
                height = 240,
                contentHash = computeHash("phy_pt4_q50_iv_curve"),
                caption = "Figure: Current-Voltage (I-V) Characteristic Curves for Semiconductor Device",
                altText = "Four graphs A, B, C, D showing linear, exponential, and saturating collector current characteristics.",
                diagramKey = "phy_transistor_iv_curves",
                verified = true
            )
        )

        // Physics PT.5 Q02: Astronomical Telescope Lens Arrangement
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt5_q02",
                questionId = "jamb_phy_pt5_02",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 410,
                height = 240,
                contentHash = computeHash("phy_pt5_q02_optics"),
                caption = "Figure: Lens Arrangement with Large Objective and Eyepiece at Separation (fo + fe)",
                altText = "Ray diagram showing objective lens of focal length fo and eye lens fe with parallel incident rays from distant star.",
                diagramKey = "phy_telescope_lenses",
                verified = true
            )
        )

        // Physics PT.5 Q04: Inclined Plane Limiting Friction
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt5_q04",
                questionId = "jamb_phy_pt5_04",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 380,
                height = 250,
                contentHash = computeHash("phy_pt5_q04_incline_forces"),
                caption = "Figure: 6kg Mass on Inclined Plane with Normal Reaction R, Limiting Friction F=30N, Weight W",
                altText = "Block on ramp inclined at angle theta showing upward normal reaction R perpendicular to surface, friction F up the slope, and weight W vertically downwards.",
                diagramKey = "phy_inclined_plane_forces",
                verified = true
            )
        )

        // Physics PT.5 Q12: Particle Curved Trajectory in Electric Field
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt5_q12",
                questionId = "jamb_phy_pt5_12",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 380,
                height = 240,
                contentHash = computeHash("phy_pt5_q12_efield"),
                caption = "Figure: Charged Particle Injected Perpendicularly into Upward Electric Field (Curving Downwards)",
                altText = "Uniform upward electric field between parallel plates with horizontal particle beam deflecting downwards toward negative potential (electron).",
                diagramKey = "phy_electric_field_deflection",
                verified = true
            )
        )

        // Physics PT.5 Q26: Six's Maximum and Minimum Thermometer
        registerAsset(
            VisualAsset(
                assetId = "phy_vis_pt5_q26",
                questionId = "jamb_phy_pt5_26",
                type = VisualType.DIAGRAM_REQUIRED,
                width = 390,
                height = 270,
                contentHash = computeHash("phy_pt5_q26_six_thermometer"),
                caption = "Figure: Maximum and Minimum Thermometer showing Left Bulb P, Mercury Column Q, Right Bulb R",
                altText = "U-tube thermometer with alcohol in bulb P, mercury in bend Q, and alcohol/vapor in bulb R with steel indices.",
                diagramKey = "phy_max_min_thermometer",
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
