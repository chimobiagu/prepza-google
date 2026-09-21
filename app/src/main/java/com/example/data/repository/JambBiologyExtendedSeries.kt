package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Extended authentic JAMB Biology Past Questions (1984 - 1993 Series).
 */
object JambBiologyExtendedSeries {

    fun getExtendedQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =====================================================================
        // 1984 SERIES ADDITIONS
        // =====================================================================
        list.add(
            QuestionEntity(
                id = "bio_1984_05",
                subject = "Biology",
                topic = "Animal Taxonomy & Arthropods",
                year = "1984",
                questionText = "Which of the following invertebrate organisms does NOT possess antennae?",
                optionA = "Scorpion (Arachnida)",
                optionB = "Butterfly (Lepidoptera)",
                optionC = "Beetle (Coleoptera)",
                optionD = "Grasshopper (Orthoptera)",
                correctAnswerIndex = 0,
                explanation = "Scorpions belong to the Class Arachnida which lack antennae entirely, possessing chelicerae and pedipalps instead.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_06",
                subject = "Biology",
                topic = "Plant Reproduction & Pteridophytes",
                year = "1984",
                questionText = "Which of the following statements concerning the prothallus of a fern (Pteridophyte) is INCORRECT?",
                optionA = "It is a flattened, heart-shaped multicellular structure",
                optionB = "It contains chloroplasts and photosynthesizes independently",
                optionC = "It represents the dominant diploid phase in the fern life cycle",
                optionD = "It bears the sex organs (antheridia and archegonia) and rhizoids",
                correctAnswerIndex = 2,
                explanation = "In ferns, the leafy sporophyte is the dominant generation, whereas the prothallus is a small, inconspicuous haploid gametophyte.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_07",
                subject = "Biology",
                topic = "Cell Structure & Plant vs Animal Cells",
                year = "1984",
                questionText = "Which cellular organelle is present in green plant cells but ABSENT in typical animal cells?",
                optionA = "Mitochondria",
                optionB = "Chloroplast",
                optionC = "Ribosome",
                optionD = "Golgi apparatus",
                correctAnswerIndex = 1,
                explanation = "Chloroplasts are photosynthetic plastids found exclusively in autotrophic plant cells and certain algae, and are absent in animal cells.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_08",
                subject = "Biology",
                topic = "Genetics & Heredity Units",
                year = "1984",
                questionText = "The discrete hereditary factors responsible for transmitting and expressing inherited characteristics in living organisms are:",
                optionA = "Chromomeres",
                optionB = "Centromeres",
                optionC = "Chromatids",
                optionD = "Genes",
                correctAnswerIndex = 3,
                explanation = "Genes are segments of DNA located along chromosomes that encode functional proteins and determine hereditary traits.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_09",
                subject = "Biology",
                topic = "Biochemical Food Tests",
                year = "1984",
                questionText = "When a mixture of mercurous and mercuric nitrates in nitric acid (Millon's reagent) is added to a food sample and gently heated, forming a red precipitate, the food substance is:",
                optionA = "Protein",
                optionB = "Lipid / Fat",
                optionC = "Reducing carbohydrate",
                optionD = "Cellulose",
                correctAnswerIndex = 0,
                explanation = "Millon's test is specific for phenolic amino acids (like tyrosine) present in proteins, yielding a characteristic white precipitate that turns brick-red on gentle warming.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_10",
                subject = "Biology",
                topic = "Mammalian Reproduction & Embryology",
                year = "1984",
                questionText = "The temporary mammalian organ through which oxygen, nutrients, and waste products are exchanged between maternal blood and the developing fetus is the:",
                optionA = "Amnion",
                optionB = "Placenta",
                optionC = "Umbilical cord",
                optionD = "Allantois",
                correctAnswerIndex = 1,
                explanation = "The placenta facilitates diffusion of oxygen, glucose, amino acids, antibodies, and metabolic wastes between the maternal and fetal bloodstreams without direct mixing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_11",
                subject = "Biology",
                topic = "Avian Morphology & Feathers",
                year = "1984",
                questionText = "The basal, hollow, cylindrical stalk of a bird's contour feather that embeds into the skin follicle is termed the:",
                optionA = "Quill (Calamus)",
                optionB = "Rachis (Shaft)",
                optionC = "Vane (Vexillum)",
                optionD = "Barbule",
                correctAnswerIndex = 0,
                explanation = "The quill or calamus is the transparent, hollow lower portion of the feather shaft that anchors into the dermal follicle.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_13",
                subject = "Biology",
                topic = "Enzyme Biochemistry & Properties",
                year = "1984",
                questionText = "Which of the following statements concerning biological enzymes is INCORRECT?",
                optionA = "Enzymes are globular proteins",
                optionB = "Enzymes are highly specific in the substrates they catalyze",
                optionC = "Enzymes are sensitive to hydrogen ion concentration (pH)",
                optionD = "Enzymes retain their high catalytic activity at boiling temperatures",
                correctAnswerIndex = 3,
                explanation = "High temperatures (typically above 45-60°C) denature enzymes by disrupting hydrogen bonds and altering tertiary conformation, inactivating them.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_14",
                subject = "Biology",
                topic = "Fish Locomotion & Fins",
                year = "1984",
                questionText = "In bony fish (Osteichthyes), the unpaired median fins (dorsal and anal fins) function primarily in:",
                optionA = "Propelling the fish forward rapidly",
                optionB = "Preventing rolling and yawing (maintaining stability)",
                optionC = "Acting as hydrofoils for ascending and descending",
                optionD = "Extracting dissolved oxygen from water",
                correctAnswerIndex = 1,
                explanation = "The dorsal and anal fins are vertical keel-like stabilizers that prevent the fish from rolling side-to-side or yawing during swimming.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_15",
                subject = "Biology",
                topic = "Skeletal Systems in Invertebrates",
                year = "1984",
                questionText = "A rigid chitinous exoskeleton is ABSENT in which of the following organisms?",
                optionA = "Housefly maggot",
                optionB = "Mosquito larva",
                optionC = "Earthworm (Lumbricus)",
                optionD = "Termite worker",
                correctAnswerIndex = 2,
                explanation = "Earthworms are Annelids possessing a hydrostatic skeleton (fluid-filled coelom) surrounded by circular and longitudinal muscles, lacking an arthropod exoskeleton.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_16",
                subject = "Biology",
                topic = "Circulation & Blood Clotting",
                year = "1984",
                questionText = "The blood clotting cascade in mammals is initiated when damaged tissue and disintegrating cells release thromboplastin from:",
                optionA = "Leucocytes",
                optionB = "Blood platelets (Thrombocytes)",
                optionC = "Erythrocytes",
                optionD = "Plasma globulins",
                correctAnswerIndex = 1,
                explanation = "Blood platelets adhere to damaged endothelium and disintegrate to release thromboplastin (thrombokinase), initiating the conversion of prothrombin to thrombin.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_17",
                subject = "Biology",
                topic = "Enzymatic Digestion",
                year = "1984",
                questionText = "Pepsin is a proteolytic enzyme in the gastric juice that hydrolyzes:",
                optionA = "Starch into maltose",
                optionB = "Complex proteins into soluble peptones and polypeptides",
                optionC = "Emulsified fats into glycerol and fatty acids",
                optionD = "Sucrose into glucose and fructose",
                correctAnswerIndex = 1,
                explanation = "In the acidic environment of gastric juice, active pepsin cleaves peptide bonds in dietary proteins to produce shorter peptones and polypeptide chains.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_18",
                subject = "Biology",
                topic = "Cellular Respiration & Fermentation",
                year = "1984",
                questionText = "Anaerobic respiration (fermentation) in yeast cells converts glucose into:",
                optionA = "Carbon dioxide (CO₂) and Ethanol (C₂H₅OH)",
                optionB = "Carbon dioxide and Lactic acid",
                optionC = "Carbon dioxide, Water, and 38 ATP",
                optionD = "Ethanol and Water only",
                correctAnswerIndex = 0,
                explanation = "Alcoholic fermentation in yeast converts glucose via glycolysis and pyruvate decarboxylation into ethanol, carbon dioxide, and 2 net ATP.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_19",
                subject = "Biology",
                topic = "Plant Morphology & Underground Stems",
                year = "1984",
                questionText = "Modified underground stems that grow horizontally beneath the soil surface with nodes, internodes, and scale leaves (e.g., in ginger) are called:",
                optionA = "Bulbs",
                optionB = "Rhizomes",
                optionC = "Runners",
                optionD = "Corms",
                correctAnswerIndex = 1,
                explanation = "Rhizomes are horizontal, perennial underground stems containing food reserves that produce roots below and vegetative shoots above from nodes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_20",
                subject = "Biology",
                topic = "Human Genetics & Sickle Cell",
                year = "1984",
                questionText = "Two carrier parents with sickle-cell trait (genotype AS) have a child who also has sickle-cell trait. What is the child's genotype?",
                optionA = "AA",
                optionB = "SS",
                optionC = "AS",
                optionD = "SC",
                correctAnswerIndex = 2,
                explanation = "Individuals with the heterozygous 'sickle-cell trait' carry one normal adult hemoglobin allele (A) and one mutated beta-globin allele (S), giving genotype AS.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_21",
                subject = "Biology",
                topic = "Biochemical Food Tests & Biuret",
                year = "1984",
                questionText = "In performing the Biuret test for proteins, a dilute aqueous solution of which chemical must be added drop-wise to the protein-sodium hydroxide mixture to yield a violet coloration?",
                optionA = "Copper(II) sulphate (CuSO₄)",
                optionB = "Mercuric nitrate",
                optionC = "Sodium carbonate",
                optionD = "Iron(III) chloride",
                correctAnswerIndex = 0,
                explanation = "The Biuret reagent consists of sodium hydroxide (NaOH) and dilute copper(II) sulphate (CuSO₄), which reacts with peptide bonds to form a characteristic violet-purple coordination complex.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_22",
                subject = "Biology",
                topic = "Digestive Physiology & Pancreas",
                year = "1984",
                questionText = "The total surgical pancreatectomy (complete removal of the pancreas) in an adult human severely impairs the digestion of:",
                optionA = "Starches only",
                optionB = "Starches, proteins, and dietary fats simultaneously",
                optionC = "Fats and lipids only",
                optionD = "Proteins only",
                correctAnswerIndex = 1,
                explanation = "The exocrine pancreas secretes pancreatic amylase (carbohydrate digestion), trypsinogen/chymotrypsinogen (protein digestion), and pancreatic lipase (lipid digestion).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_23",
                subject = "Biology",
                topic = "Parasitology & Cestodes",
                year = "1984",
                questionText = "The anatomical structures utilized by the tapeworm (Taenia solium) to anchor and fasten itself firmly onto the mucosal wall of the host's small intestine are:",
                optionA = "Rostellum, curved hooks, and muscular suckers",
                optionB = "Neck and proglottids only",
                optionC = "Oral teeth and jaws",
                optionD = "Cilia and setae",
                correctAnswerIndex = 0,
                explanation = "The scolex (head) of the pork tapeworm possesses an apical rostellum ringed with chitinous hooks and four surrounding muscular cup-shaped suckers for mucosal attachment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_26",
                subject = "Biology",
                topic = "Comparative Vertebrate Anatomy",
                year = "1984",
                questionText = "Which region of the vertebral column has a constant, identical number of vertebrae (seven) across rabbits, rats, and humans?",
                optionA = "Caudal region",
                optionB = "Thoracic region",
                optionC = "Lumbar region",
                optionD = "Cervical region (neck)",
                correctAnswerIndex = 3,
                explanation = "Almost all placental mammals (from mice to humans and giraffes) possess exactly seven cervical (neck) vertebrae.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_28",
                subject = "Biology",
                topic = "Floral Biology & Sex Distribution",
                year = "1984",
                questionText = "A flowering angiosperm is classified as 'monoecious' when:",
                optionA = "Both male (staminate) and female (pistillate) unisexual flowers occur on the same individual plant",
                optionB = "Male and female flowers occur on separate male and female plants",
                optionC = "All flowers on the plant are completely sterile",
                optionD = "The ovary develops without fertilization",
                correctAnswerIndex = 0,
                explanation = "Monoecious plants (e.g., maize, oil palm) possess separate staminate and pistillate flowers situated on the same individual sporophyte.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_30",
                subject = "Biology",
                topic = "Plant Physiology & Excretion",
                year = "1984",
                questionText = "Which of the following plant fluids is NOT a metabolic waste product but rather a functional transport fluid?",
                optionA = "Tannins",
                optionB = "Vascular sap (phloem/xylem sap)",
                optionC = "Alkaloids",
                optionD = "Latex resin",
                correctAnswerIndex = 1,
                explanation = "Plant vascular sap is a nutrient-rich fluid transporting photosynthesized sugars, amino acids, and water/minerals, unlike excretory byproducts like tannins and alkaloids.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_31",
                subject = "Biology",
                topic = "Neurobiology & Brain Functions",
                year = "1984",
                questionText = "An animal that exhibits agile, rapid, and highly coordinated muscular movement has a particularly well-developed:",
                optionA = "Olfactory lobe",
                optionB = "Cerebral hemisphere",
                optionC = "Cerebellum",
                optionD = "Optic chiasma",
                correctAnswerIndex = 2,
                explanation = "The cerebellum is the neurological processing center for motor coordination, balance, agility, and muscle synchronization.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_32",
                subject = "Biology",
                topic = "Avian Locomotion & Adaptations",
                year = "1984",
                questionText = "Which of the following morphological adaptations is NOT concerned with aerial flight in birds?",
                optionA = "Streamlined aerodynamic body profile",
                optionB = "Pneumatized hollow bones and air sacs",
                optionC = "Deeply keeled sternum for flight muscle attachment",
                optionD = "Webbed interdigital feet",
                correctAnswerIndex = 3,
                explanation = "Webbed feet are an aquatic adaptation for swimming and paddling in waterfowl (like ducks), not for aerodynamic flight.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_33",
                subject = "Biology",
                topic = "Ecological Sampling Techniques",
                year = "1984",
                questionText = "In quantitative ecology, the line transect method is employed primarily to measure:",
                optionA = "The absolute total count of all animals in a rainforest",
                optionB = "The spatial distribution and zonation of plant/animal species along an environmental gradient",
                optionC = "The chemical dissolved oxygen concentration in ponds",
                optionD = "The average diameter of tree canopies",
                correctAnswerIndex = 1,
                explanation = "A line transect records the presence, frequency, and distribution of species at regular intervals along a measured line across an environmental gradient.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_34",
                subject = "Biology",
                topic = "Reproduction & Life Cycles",
                year = "1984",
                questionText = "Asexual reproduction does NOT occur in which of the following animal groups?",
                optionA = "Ascaris (Nematoda)",
                optionB = "Amoeba (Protozoa)",
                optionC = "Paramecium (Ciliophora)",
                optionD = "Hydra (Cnidaria)",
                correctAnswerIndex = 0,
                explanation = "Ascaris lumbricoides is a dioecious roundworm that reproduces exclusively via sexual reproduction with internal fertilization.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_35",
                subject = "Biology",
                topic = "Biochemical Food Tests & Fehling's",
                year = "1984",
                questionText = "Fehling's solution (A and B) changes color from deep blue to a reddish-orange precipitate when it is:",
                optionA = "Warmed with a solution of a reducing sugar (e.g., glucose)",
                optionB = "Mixed with pure starch in the cold",
                optionC = "Heated with vegetable oil",
                optionD = "Added to dilute sodium chloride",
                correctAnswerIndex = 0,
                explanation = "Alkaline cupric tartrate (Fehling's solution) is reduced by aldehyde/ketone groups of reducing sugars when heated, precipitating red cuprous oxide (Cu₂O).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_37",
                subject = "Biology",
                topic = "Cardiovascular Physiology & Hemodynamics",
                year = "1984",
                questionText = "Under normal physiological conditions, systemic blood flow NEVER proceeds in which of the following directions?",
                optionA = "Artery to Arterioles",
                optionB = "Arterioles to Capillaries",
                optionC = "Arterioles to the Parent Artery (backward flow)",
                optionD = "Capillaries to Venules",
                correctAnswerIndex = 2,
                explanation = "Blood flows down a high-to-low pressure gradient: Heart → Arteries → Arterioles → Capillaries → Venules → Veins → Heart. Retrograde flow from arterioles into arteries is prevented by hydraulic pressure gradients.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_40",
                subject = "Biology",
                topic = "Hemostasis & Clotting Stages",
                year = "1984",
                questionText = "Which sequence correctly represents the physiological cascade of blood clotting? 1. Fibrin mesh forms 2. Blood cells trapped in clot 3. Fibrinogen converts to insoluble fibrin 4. Platelet activation/tissue damage.",
                optionA = "4 → 3 → 1 → 2",
                optionB = "4 → 1 → 3 → 2",
                optionC = "3 → 1 → 4 → 2",
                optionD = "1 → 2 → 3 → 4",
                correctAnswerIndex = 0,
                explanation = "Tissue injury/platelet activation (4) triggers thrombin to convert soluble fibrinogen into insoluble fibrin monomers (3), which polymerize into a mesh (1) that traps blood cells to seal the clot (2).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_41",
                subject = "Biology",
                topic = "Ecology & Trophic Roles",
                year = "1984",
                questionText = "Saprophytic micro-organisms such as non-photosynthetic bacteria and saprophytic fungi occupy which functional ecological niche in an ecosystem?",
                optionA = "Primary producers",
                optionB = "Primary consumers",
                optionC = "Decomposers (micro-consumers)",
                optionD = "Tertiary predators",
                correctAnswerIndex = 2,
                explanation = "Saprophytes are decomposers that secrete extracellular enzymes to break down organic detritus from dead organisms, recycling essential inorganic nutrients back into the soil and atmosphere.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_42",
                subject = "Biology",
                topic = "Meteorological & Ecological Instruments",
                year = "1984",
                questionText = "An anemometer is an ecological and meteorological instrument designed specifically for measuring:",
                optionA = "Relative atmospheric humidity",
                optionB = "Wind speed / velocity",
                optionC = "Total solar irradiance",
                optionD = "Water salinity",
                correctAnswerIndex = 1,
                explanation = "An anemometer (such as a rotating cup anemometer) quantifies wind velocity in meters per second or knots.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_43",
                subject = "Biology",
                topic = "Environmental Pollution",
                year = "1984",
                questionText = "Which of the following atmospheric gases is a normal, non-polluting constituent comprising approximately 78% of clean dry air?",
                optionA = "Sulphur dioxide (SO₂)",
                optionB = "Carbon monoxide (CO)",
                optionC = "Nitrogen gas (N₂)",
                optionD = "Nitrogen dioxide (NO₂)",
                correctAnswerIndex = 2,
                explanation = "Gaseous nitrogen (N₂) makes up 78% of the Earth's atmosphere and is completely inert and non-toxic under ambient atmospheric conditions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_44",
                subject = "Biology",
                topic = "Ecology & Abiotic Factors",
                year = "1984",
                questionText = "Which of the following groupings contains strictly and completely abiotic ecological factors?",
                optionA = "Salinity, pH, plankton, turbidity",
                optionB = "Temperature, rainfall, soil nematodes, light",
                optionC = "Wind, altitude, relative humidity, light intensity",
                optionD = "Soil humus, decomposing bacteria, rainfall",
                correctAnswerIndex = 2,
                explanation = "Abiotic factors are purely physical and chemical non-living components of an environment, such as wind, altitude, humidity, and light.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_45",
                subject = "Biology",
                topic = "Infectious Diseases & Pathogens",
                year = "1984",
                questionText = "Which of the following matches of infectious disease, pathogen type, and transmission mode is CORRECT?",
                optionA = "Smallpox — Virus — Skin blisters and respiratory droplets via close contact",
                optionB = "Cholera — Virus — Contaminated food and water",
                optionC = "Malaria — Bacterium — Inhalation of aerosols",
                optionD = "Tetanus — Protozoan — Mosquito bite",
                correctAnswerIndex = 0,
                explanation = "Smallpox is caused by the Variola virus and spreads through close contact and respiratory droplets, producing skin pustules and vesicular blisters.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_46",
                subject = "Biology",
                topic = "Soil Conservation & Agriculture",
                year = "1984",
                questionText = "Water erosion along a steep agricultural hillside can be significantly minimized by implementing:",
                optionA = "Contour ridging across the slope",
                optionB = "Ridging vertically down the slope",
                optionC = "Complete deforestation and burning",
                optionD = "Overgrazing by cattle",
                correctAnswerIndex = 0,
                explanation = "Contour ridging (plowing across the slope) creates horizontal ridges that intercept surface water runoff, reducing velocity and encouraging infiltration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_47",
                subject = "Biology",
                topic = "Soil Texture & Particle Sedimentation",
                year = "1984",
                questionText = "When a garden soil sample is shaken vigorously in a measuring cylinder with water and left to stand, the settled layers from top (lightest) to bottom (densest) are:",
                optionA = "Floating humus → Clay → Silt → Sand → Gravel/Stones",
                optionB = "Gravel/Stones → Sand → Silt → Clay → Humus",
                optionC = "Clay → Humus → Sand → Silt → Stones",
                optionD = "Humus → Sand → Silt → Clay → Stones",
                correctAnswerIndex = 0,
                explanation = "Due to particle density and mass, floating organic humus remains at the top, followed in descending order by colloidal clay, fine silt, coarse sand, and dense gravel/stones at the bottom.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_48",
                subject = "Biology",
                topic = "Nitrogen Cycle & Microbiology",
                year = "1984",
                questionText = "In the nitrogen cycle, denitrifying bacteria (e.g., Pseudomonas denitrificans) liberate free nitrogen gas directly from:",
                optionA = "Ammonium salts in soil",
                optionB = "Soil nitrates (NO₃⁻)",
                optionC = "Atmospheric ammonia gas",
                optionD = "Insoluble plant proteins",
                correctAnswerIndex = 1,
                explanation = "Denitrification is the anaerobic microbial reduction of soil nitrates (NO₃⁻) and nitrites (NO₂⁻) back into molecular gaseous nitrogen (N₂).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_49",
                subject = "Biology",
                topic = "Soil Science & Leaching",
                year = "1984",
                questionText = "Leaching in agricultural soil refers specifically to the:",
                optionA = "Downward washing of dissolved minerals and nutrients beyond the root zone by percolating water",
                optionB = "Mechanical removal of topsoil by surface runoff",
                optionC = "Loss of organic humus due to intense direct sunlight",
                optionD = "Compaction of soil particles by farm machinery",
                correctAnswerIndex = 0,
                explanation = "Leaching is the process whereby heavy rainfall dissolves soluble mineral nutrients (such as calcium, nitrates, and potassium) and carries them down into deep, unreachable subsoil horizons.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_50",
                subject = "Biology",
                topic = "Soil Erosion Progression",
                year = "1984",
                questionText = "The natural developmental stages of water-induced soil erosion progress in which order of increasing severity?",
                optionA = "Sheet erosion → Rill erosion → Gully erosion",
                optionB = "Gully erosion → Rill erosion → Sheet erosion",
                optionC = "Rill erosion → Gully erosion → Sheet erosion",
                optionD = "Sheet erosion → Gully erosion → Rill erosion",
                correctAnswerIndex = 0,
                explanation = "Water erosion begins with uniform removal of topsoil (sheet erosion), concentrates into shallow micro-channels (rill erosion), and deepens into large ravines (gully erosion).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        // =====================================================================
        // 1985 - 1993 COMPREHENSIVE REVISION ADDITIONS
        // =====================================================================
        list.add(
            QuestionEntity(
                id = "bio_1985_01",
                subject = "Biology",
                topic = "Algal Cytology & Chloroplasts",
                year = "1985",
                questionText = "In the green filamentous alga Spirogyra, the proteinaceous body known as the pyrenoid functions in:",
                optionA = "Excreting cellular nitrogenous wastes",
                optionB = "Serving as a center for starch synthesis and deposition",
                optionC = "Anchoring the filament to rocks",
                optionD = "Initiating nuclear cell division",
                correctAnswerIndex = 1,
                explanation = "Pyrenoids are distinct protein micro-compartments located within the ribbon-like chloroplasts of Spirogyra that facilitate carbon fixation and starch crystallization.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_02",
                subject = "Biology",
                topic = "Protozoan Locomotion",
                year = "1985",
                questionText = "Locomotor organelles such as cilia and flagella are characteristically found in which group of microscopic organisms?",
                optionA = "Platyhelminthes (Flatworms)",
                optionB = "Nematodes (Roundworms)",
                optionC = "Annelids",
                optionD = "Protozoa",
                correctAnswerIndex = 3,
                explanation = "Protozoans utilize cilia (e.g., Paramecium) or flagella (e.g., Euglena, Trypanosoma) as primary locomotor organelles for aquatic swimming.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_03",
                subject = "Biology",
                topic = "Plant Taxonomy & Spermatophytes",
                year = "1985",
                questionText = "Which of the following plants is seed-bearing (Spermatophyte)?",
                optionA = "Moss gametophyte",
                optionB = "Whistling pine (Casuarina / Gymnosperm)",
                optionC = "Spirogyra algal filament",
                optionD = "Fern prothallus",
                correctAnswerIndex = 1,
                explanation = "Whistling pine (Casuarina) and conifers are gymnosperms that produce seeds, whereas mosses, algae, and ferns reproduce non-seed spores.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_05",
                subject = "Biology",
                topic = "Fish Sensory Physiology",
                year = "1985",
                questionText = "In bony and cartilaginous fishes, mechanoreceptors that detect low-frequency water vibrations and pressure waves are located within the:",
                optionA = "Operculum",
                optionB = "Lateral line system",
                optionC = "Pectoral fins",
                optionD = "Nostrils",
                correctAnswerIndex = 1,
                explanation = "The lateral line consists of fluid-filled canals containing neuromast hair cells that detect hydrodynamic water currents and pressure changes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_06",
                subject = "Biology",
                topic = "Protist Nutrition & Euglena",
                year = "1985",
                questionText = "Euglena viridis is considered a photoautotrophic organism because it possesses:",
                optionA = "An anterior flagellum for swimming",
                optionB = "Chloroplasts containing chlorophyll to synthesize organic food via photosynthesis",
                optionC = "A light-sensitive eyespot (stigma)",
                optionD = "A flexible proteinaceous pellicle",
                correctAnswerIndex = 1,
                explanation = "Euglena contains functional chloroplasts with photosynthetic pigments allowing it to manufacture glucose in the presence of sunlight (holophytic autotrophy).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_08",
                subject = "Biology",
                topic = "Plant Taxonomy & Bryophytes",
                year = "1985",
                questionText = "Bryophytes (mosses and liverworts) differ fundamentally from flowering angiosperms because bryophytes:",
                optionA = "Live strictly in salt water",
                optionB = "Completely lack specialized vascular conducting tissues (xylem and phloem)",
                optionC = "Reproduce only through binary fission",
                optionD = "Contain no cell walls",
                correctAnswerIndex = 1,
                explanation = "Bryophytes are non-vascular land plants lacking lignified xylem and phloem, relying on cell-to-cell diffusion and osmosis for transport.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_10",
                subject = "Biology",
                topic = "Plant Morphology & Moss Rhizoids",
                year = "1985",
                questionText = "In non-vascular plants like mosses, which filamentous structures perform the anchoring and absorptive functions of true roots?",
                optionA = "Hyphae",
                optionB = "Rhizoids",
                optionC = "Mycelium",
                optionD = "Setae",
                correctAnswerIndex = 1,
                explanation = "Mosses possess hair-like multicellular rhizoids that anchor the gametophyte into the soil and absorb water and dissolved minerals.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_11",
                subject = "Biology",
                topic = "Leaf Anatomy & Vascular Arrangement",
                year = "1985",
                questionText = "In the transverse section of an angiosperm leaf midrib, the xylem tissue is characteristically situated:",
                optionA = "On the upper (adaxial) side relative to the phloem",
                optionB = "Completely surrounding the phloem in a ring",
                optionC = "On the lower (abaxial) side beneath the phloem",
                optionD = "Scattered irregularly in the spongy mesophyll",
                correctAnswerIndex = 0,
                explanation = "In the vascular bundles of leaves, xylem lies toward the upper (adaxial) epidermis, while phloem is oriented toward the lower (abaxial) epidermis.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_12",
                subject = "Biology",
                topic = "Levels of Biological Organization",
                year = "1985",
                questionText = "A coordinated collection of structurally similar cells organized to perform a specific biological function is defined as a/an:",
                optionA = "Organelle",
                optionB = "Organ",
                optionC = "Tissue",
                optionD = "Organ system",
                correctAnswerIndex = 2,
                explanation = "A biological tissue is an ensemble of similar cells and their extracellular matrix from the same origin that together carry out a specific function.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_15",
                subject = "Biology",
                topic = "Biochemical Food Tests & Lipids",
                year = "1985",
                questionText = "A food sample that produces a bright red stain or red-stained oil droplets when treated with Sudan III solution contains:",
                optionA = "Complex proteins",
                optionB = "Reducing monosaccharides",
                optionC = "Lipids / Fats and Oils",
                optionD = "Insoluble plant starch",
                correctAnswerIndex = 2,
                explanation = "Sudan III is a fat-soluble lysochrome diazo dye that selectively dissolves in and stains neutral lipids (fats and oils) brilliant red.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_18",
                subject = "Biology",
                topic = "Lymphatic System & Immunity",
                year = "1985",
                questionText = "The primary immunological function of mammalian lymph nodes located along lymphatic vessels is to:",
                optionA = "Synthesize and secrete digestive enzymes",
                optionB = "Filter lymph fluid, trapping and phagocytosing foreign bacteria and cellular debris",
                optionC = "Generate red blood cells in healthy adults",
                optionD = "Excrete surplus urea directly",
                correctAnswerIndex = 1,
                explanation = "Lymph nodes contain reticular meshes packed with macrophages and lymphocytes that filter pathogens from lymph before it re-enters venous circulation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_19",
                subject = "Biology",
                topic = "Human Cardiovascular Anatomy",
                year = "1985",
                questionText = "The large systemic vein that collects deoxygenated venous blood from the head, neck, and upper limbs returning it to the right atrium is the:",
                optionA = "Inferior Vena Cava",
                optionB = "Superior Vena Cava",
                optionC = "Pulmonary Vein",
                optionD = "Hepatic Vein",
                correctAnswerIndex = 1,
                explanation = "The Superior Vena Cava drains deoxygenated blood from anatomical structures superior to the diaphragm into the right atrium of the heart.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_26",
                subject = "Biology",
                topic = "Renal Histology & Nephron",
                year = "1985",
                questionText = "In the mammalian kidney, the ultrafiltration units known as Bowman's capsules (glomerular capsules) are located exclusively in the:",
                optionA = "Renal Cortex",
                optionB = "Renal Medulla",
                optionC = "Renal Pelvis",
                optionD = "Ureter",
                correctAnswerIndex = 0,
                explanation = "Bowman's capsules and glomeruli (Malpighian corpuscles) reside strictly in the outer renal cortex, whereas the Loops of Henle and collecting ducts extend into the medulla.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_30",
                subject = "Biology",
                topic = "Fruit vs Seed Morphology",
                year = "1985",
                questionText = "Botanically, a maize grain is classified as a single-seeded fruit (caryopsis) rather than a true seed because:",
                optionA = "It possesses a large starchy endosperm",
                optionB = "Its outer pericarp (fruit wall) is completely fused with the seed coat (testa)",
                optionC = "It germinates hypogeally",
                optionD = "It lacks a plumule and radicle",
                correctAnswerIndex = 1,
                explanation = "In cereals like maize, the caryopsis is a dry indehiscent fruit where the ovary wall (pericarp) is permanently fused with the seed coat (testa).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_35",
                subject = "Biology",
                topic = "Molecular Genetics & Nucleic Acids",
                year = "1985",
                questionText = "The macromolecular genetic material that encodes the hereditary blueprint in all cellular organisms is:",
                optionA = "Adenosine Triphosphate (ATP)",
                optionB = "Ribonucleic Acid (RNA)",
                optionC = "Deoxyribonucleic Acid (DNA)",
                optionD = "Adenosine Diphosphate (ADP)",
                correctAnswerIndex = 2,
                explanation = "DNA is the double-helical nucleic acid polymer that stores and transmits genetic instructions for development and functioning in living cells.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1986_01",
                subject = "Biology",
                topic = "Virology & Nature of Viruses",
                year = "1986",
                questionText = "Viruses are considered non-living or on the borderline of life primarily because outside a host cell they:",
                optionA = "Have no protein coat",
                optionB = "Cannot respire, excrete, or metabolize independently and can be crystallized",
                optionC = "Contain neither DNA nor RNA",
                optionD = "Disintegrate immediately in sunlight",
                correctAnswerIndex = 1,
                explanation = "Viruses lack cellular organelles and metabolic machinery for respiration and excretion; they exist as inert crystalline nucleoprotein particles outside living host cells.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1986"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1986_14",
                subject = "Biology",
                topic = "Photosynthesis & Photolysis",
                year = "1986",
                questionText = "Isotopic tracing experiments (using Oxygen-18) demonstrated that the molecular oxygen (O₂) liberated during photosynthesis originates from:",
                optionA = "Carbon dioxide (CO₂)",
                optionB = "Atmospheric air",
                optionC = "Water molecules (H₂O) via photolysis",
                optionD = "Chlorophyll breakdown",
                correctAnswerIndex = 2,
                explanation = "During the light-dependent reactions of photosynthesis, photons split water molecules (photolysis of water) in photosystem II: 2H₂O → 4H⁺ + 4e⁻ + O₂.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1986"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1986_28",
                subject = "Biology",
                topic = "Cellular Respiration Equations",
                year = "1986",
                questionText = "Which balanced chemical equation correctly summarizes the anaerobic fermentation of glucose by yeast?",
                optionA = "C₆H₁₂O₆ → 2 C₂H₅OH + 2 CO₂ + Energy (2 ATP)",
                optionB = "6 CO₂ + 6 H₂O → C₆H₁₂O₆ + 6 O₂",
                optionC = "C₆H₁₂O₆ + 6 O₂ → 6 CO₂ + 6 H₂O + Energy",
                optionD = "C₆H₁₂O₆ → 2 CH₃CH(OH)COOH + Energy",
                correctAnswerIndex = 0,
                explanation = "Anaerobic fermentation in yeast degrades 1 mole of glucose into 2 moles of ethanol, 2 moles of carbon dioxide, and net ATP.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1986"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1986_30",
                subject = "Biology",
                topic = "Nitrogen Metabolism & Deamination",
                year = "1986",
                questionText = "The biochemical deamination of surplus dietary amino acids and their conversion into urea occurs in the:",
                optionA = "Kidney cortex",
                optionB = "Pancreas",
                optionC = "Liver",
                optionD = "Spleen",
                correctAnswerIndex = 2,
                explanation = "Deamination takes place in liver hepatocytes, removing amine groups from excess amino acids to form ammonia, which is then synthesized into less toxic urea via the urea cycle.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1986"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1986_31",
                subject = "Biology",
                topic = "Integumentary System & Skin Histology",
                year = "1986",
                questionText = "In the mammalian skin, melanin pigment granules and actively dividing keratinocytes are produced within the:",
                optionA = "Sebaceous glands",
                optionB = "Subcutaneous adipose layer",
                optionC = "Stratum Malpighii (Malpighian layer / Stratum basale)",
                optionD = "Stratum corneum",
                correctAnswerIndex = 2,
                explanation = "The stratum basale (Malpighian layer) of the epidermis contains actively dividing basal cells and melanocytes that synthesize melanin for UV photoprotection.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1986"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1987_01",
                subject = "Biology",
                topic = "Cell Organelles & Endoplasmic Reticulum",
                year = "1987",
                questionText = "The primary cellular function of the endoplasmic reticulum network in eukaryotic cells is:",
                optionA = "Intracellular synthesis and transport of proteins and lipids",
                optionB = "Engulfing and destroying foreign pathogens directly",
                optionC = "Generating ATP via oxidative phosphorylation",
                optionD = "Carrying out carbon dioxide fixation",
                correctAnswerIndex = 0,
                explanation = "The rough ER synthesizes and folds proteins, while the smooth ER synthesizes lipids and facilitates intracellular transport throughout the cytoplasm.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1987"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1987_45",
                subject = "Biology",
                topic = "Ecology & Environmental Factors",
                year = "1987",
                questionText = "In ecological studies, 'edaphic factors' relate specifically to the influence of:",
                optionA = "Atmospheric climate, temperature, and rainfall",
                optionB = "Physical and chemical properties of soil on living organisms",
                optionC = "Topographic altitude and slope aspects",
                optionD = "Biological interactions such as predation and parasitism",
                correctAnswerIndex = 1,
                explanation = "Edaphic factors include soil texture, soil pH, moisture content, aeration, humus concentration, and mineral nutrients affecting flora and fauna.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1987"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1988_09",
                subject = "Biology",
                topic = "Protozoan Organelles & Trichocysts",
                year = "1988",
                questionText = "In the ciliate protozoan Paramecium caudatum, the sub-pellicular organelle known as the trichocyst functions in:",
                optionA = "Osmoregulatory water expulsion",
                optionB = "Offensive prey capture and defensive protection against predators",
                optionC = "Asexual binary fission",
                optionD = "Ingesting bacteria into the oral groove",
                correctAnswerIndex = 1,
                explanation = "Trichocysts are spindle-shaped cortical extrusomes that discharge elongated filament darts when mechanically stimulated for defense or anchoring.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1988"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1988_30",
                subject = "Biology",
                topic = "Artificial Vegetative Propagation",
                year = "1988",
                questionText = "In horticultural artificial propagation, which vegetative structure requires attachment to the rooted stock of another plant to grow?",
                optionA = "Scion (in grafting)",
                optionB = "Rhizome",
                optionC = "Sucker",
                optionD = "Bulb",
                correctAnswerIndex = 0,
                explanation = "In grafting, the scion is a detached shoot or bud containing dormant buds from a desirable plant that is surgically joined onto the rooted rootstock of another plant.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1988"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1989_03",
                subject = "Biology",
                topic = "Cell Biology & Mitochondria",
                year = "1989",
                questionText = "Which cytoplasmic organelle is universally designated as the 'powerhouse of the cell' due to its generation of ATP through aerobic respiration?",
                optionA = "Mitochondrion",
                optionB = "Golgi body",
                optionC = "Nucleolus",
                optionD = "Lysosome",
                correctAnswerIndex = 0,
                explanation = "Mitochondria contain cristae enzymes and the Krebs cycle matrix that convert pyruvate and fatty acids into ATP via the electron transport chain and oxidative phosphorylation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1989"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1989_27",
                subject = "Biology",
                topic = "Human Skeleton & Vertebral Anatomy",
                year = "1989",
                questionText = "A human lumbar vertebra is distinguished structurally from a thoracic vertebra by having a:",
                optionA = "Significantly thicker, massive centrum to bear body weight",
                optionB = "Much longer, downward-pointing neural spine",
                optionC = "Pair of costal facets for rib articulation",
                optionD = "Vertebrarterial canal in each transverse process",
                correctAnswerIndex = 0,
                explanation = "Lumbar vertebrae (L1-L5) possess large, thick, kidney-shaped centra designed to support the substantial compressive load of the upper torso.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1989"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1990_11",
                subject = "Biology",
                topic = "Vertebrate Reproduction & Fertilization",
                year = "1990",
                questionText = "External fertilization in an aquatic medium takes place in which of the following animals?",
                optionA = "Common toad (Bufo)",
                optionB = "Agama lizard",
                optionC = "Domestic fowl",
                optionD = "Cockroach",
                correctAnswerIndex = 0,
                explanation = "Amphibians like toads release eggs (spawn) and milt (sperm) synchronously into fresh water during amplexus, where fertilization occurs externally.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1990"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1990_27",
                subject = "Biology",
                topic = "Renal Anatomy & Glomerulus",
                year = "1990",
                questionText = "In the microscopic functional unit of the kidney (nephron), the high-pressure knot of fenestrated blood capillaries where ultrafiltration occurs is the:",
                optionA = "Glomerulus",
                optionB = "Loop of Henle",
                optionC = "Proximal convoluted tubule",
                optionD = "Collecting duct",
                correctAnswerIndex = 0,
                explanation = "The glomerulus is a capillary tuft supplied by the afferent arteriole and drained by the narrower efferent arteriole, generating hydrostatic pressure for ultrafiltration into Bowman's capsule.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1990"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1990_31",
                subject = "Biology",
                topic = "Plant Reproduction & Parthenocarpy",
                year = "1990",
                questionText = "Seedless fruits that develop from an ovary without prior pollination and fertilization (e.g., commercial bananas and pineapples) are termed:",
                optionA = "Parthenocarpic fruits",
                optionB = "Aggregate fruits",
                optionC = "Composite fruits",
                optionD = "Dehiscent legumes",
                correctAnswerIndex = 0,
                explanation = "Parthenocarpy is the natural or artificially induced production of seedless fruit without ovule fertilization.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1990"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1991_08",
                subject = "Biology",
                topic = "Pteridophytes & Spore Dispersal",
                year = "1991",
                questionText = "In the sporangium of a mature fern, the specialized hygroscopic ring of thick-walled cells that facilitates explosive spore dispersal is the:",
                optionA = "Annulus",
                optionB = "Indusium",
                optionC = "Rachis",
                optionD = "Stomium alone",
                correctAnswerIndex = 0,
                explanation = "The annulus consists of differentially thickened cell walls that lose moisture upon drying, creating mechanical tension that violently snaps the sporangium open to eject spores.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1991"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1991_15",
                subject = "Biology",
                topic = "Fish Anatomy & Feeding Adaptations",
                year = "1991",
                questionText = "In the branchial apparatus of bony fishes, the comb-like bony projections termed gill rakers function primarily in:",
                optionA = "Filtering and retaining food particles while protecting delicate gill filaments from mechanical damage",
                optionB = "Extracting dissolved oxygen directly from water",
                optionC = "Generating forward swimming propulsion",
                optionD = "Regulating blood pressure in the branchial arches",
                correctAnswerIndex = 0,
                explanation = "Gill rakers project inward from the gill arches to strain food organisms and prevent solid debris from entering and clogging respiratory gill filaments.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1991"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1992_02",
                subject = "Biology",
                topic = "Levels of Biological Organization",
                year = "1992",
                questionText = "In histology and cell biology, a biological 'tissue' is most accurately defined as:",
                optionA = "An aggregate of structurally similar cells working together to perform a specific common function",
                optionB = "A collection of completely different organs cooperating in a body system",
                optionC = "Any single isolated cell containing organelles",
                optionD = "A mixture of blood and extracellular fluid without cellular structure",
                correctAnswerIndex = 0,
                explanation = "A tissue is a group of similar cells and their intercellular substance specialized to perform one or more specific physiological roles.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1992"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1992_47",
                subject = "Biology",
                topic = "Xerophytic Adaptations",
                year = "1992",
                questionText = "Which morphological adaptation represents a characteristic specialization of plants living in arid xerophytic environments?",
                optionA = "Fleshy succulent water-storing tissues and reduced leaves / spines",
                optionB = "Broad, thin leaves with numerous exposed surface stomata",
                optionC = "Spongy aerenchyma tissues throughout stems and leaves",
                optionD = "Absence of protective cuticles",
                correctAnswerIndex = 0,
                explanation = "Xerophytes (like Opuntia and Aloe) minimize water loss and store moisture using succulent parenchyma, thick waxy cuticles, and leaves reduced to protective spines.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1992"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1993_01",
                subject = "Biology",
                topic = "Cytogenetics & Chromosomes",
                year = "1993",
                questionText = "In the eukaryotic cell nucleus, the fundamental units of inheritance (genes) are physically situated along:",
                optionA = "Chromosomes",
                optionB = "Golgi bodies",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Genes occupy specific loci linearly arranged along the chromatin/chromosomes within the cell nucleus.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1993"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1993_02",
                subject = "Biology",
                topic = "Gymnosperms & Conifers",
                year = "1993",
                questionText = "The production of 'naked seeds' (seeds not enclosed within an ovary or true fruit) is a defining biological characteristic of:",
                optionA = "Conifers (Gymnosperms)",
                optionB = "Leguminous plants (Fabaceae)",
                optionC = "Gramineae (Grasses)",
                optionD = "Palms (Arecaceae)",
                correctAnswerIndex = 0,
                explanation = "Gymnosperms (such as Pinus and Cycas) produce naked ovules and seeds borne on the surface of cone scales, rather than enclosed within a carpel/ovary.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1993"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1993_13",
                subject = "Biology",
                topic = "Plant Vascular Translocation",
                year = "1993",
                questionText = "In vascular flowering plants, manufactured soluble food substances (sucrose and amino acids) are translocated through the:",
                optionA = "Phloem sieve tubes and companion cells",
                optionB = "Xylem vessels and tracheids",
                optionC = "Vascular cambium",
                optionD = "Cortical parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem sieve tube elements and companion cells facilitate the translocation of photosynthates (sucrose) from photosynthetic sources to metabolic sinks.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1993"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1993_49",
                subject = "Biology",
                topic = "Evolution & Natural Selection",
                year = "1993",
                questionText = "According to Darwin's theory of evolution by Natural Selection, the primary mechanism driving evolutionary adaptation is that:",
                optionA = "Organisms produce more offspring than the environment can support, leading to competition where individuals with advantageous variations survive and reproduce",
                optionB = "All organisms within a population have identical capacities for survival",
                optionC = "Acquired phenotypic characteristics during life are inherited by offspring",
                optionD = "Mutations always occur in direct response to environmental need",
                correctAnswerIndex = 0,
                explanation = "Darwinian natural selection posits that overproduction leads to a struggle for existence, where individuals with beneficial hereditary adaptations have higher differential reproductive success.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1993"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_42",
                subject = "Biology",
                topic = "Ecology & Trophic Energy Flow",
                year = "1985",
                questionText = "Which of the following aquatic food chains is arranged in the correct ecological sequence?",
                optionA = "Aquatic Weeds → Tadpoles → Water Beetles → Fish → Man",
                optionB = "Aquatic Weeds → Tadpoles → Fish → Water Beetles → Man",
                optionC = "Tadpoles → Water Beetles → Aquatic Weeds → Man → Fish",
                optionD = "Man → Fish → Water Beetles → Tadpoles → Aquatic Weeds",
                correctAnswerIndex = 0,
                explanation = "Energy transfers sequentially from autotrophic producers (Weeds) to primary consumers (Tadpoles), secondary consumers (Beetles), tertiary consumers (Fish), and apex predator (Man).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1986_40",
                subject = "Biology",
                topic = "Endocrinology & Blood Sugar Homeostasis",
                year = "1986",
                questionText = "The pancreatic hormone responsible for regulating and lowering blood glucose concentration by promoting glycogenesis is:",
                optionA = "Adrenaline",
                optionB = "Auxin",
                optionC = "Insulin",
                optionD = "Thyroxine",
                correctAnswerIndex = 2,
                explanation = "Insulin is secreted by beta cells of the islets of Langerhans in the pancreas to stimulate glucose uptake by cells and its conversion into glycogen in the liver and muscles.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1986"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1987_43",
                subject = "Biology",
                topic = "Genetics & Sickle Cell Probability",
                year = "1987",
                questionText = "What is the statistical probability of a child being born with sickle cell anaemia (genotype SS) from a marriage between two carrier parents (genotype AS)?",
                optionA = "1 in 4 (25%)",
                optionB = "3 in 4 (75%)",
                optionC = "1 in 2 (50%)",
                optionD = "1 in 3 (33%)",
                correctAnswerIndex = 0,
                explanation = "A monohybrid cross AS × AS yields offspring genotypes AA (25%), AS (50%), and SS (25%), giving a 1 in 4 (25%) probability of an SS child.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1987"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1987_44",
                subject = "Biology",
                topic = "Sex-Linked Inheritance & Color Blindness",
                year = "1987",
                questionText = "In human sex-linked inheritance, which parental cross will result in ALL female offspring being red-green colour blind?",
                optionA = "Colour blind mother (XᵇXᵇ) × Colour blind father (XᵇY)",
                optionB = "Colour blind mother (XᵇXᵇ) × Normal vision father (XᴮY)",
                optionC = "Carrier mother (XᴮXᵇ) × Colour blind father (XᵇY)",
                optionD = "Carrier mother (XᴮXᵇ) × Normal vision father (XᴮY)",
                correctAnswerIndex = 0,
                explanation = "Red-green color blindness is an X-linked recessive trait. For a female daughter to be affected (XᵇXᵇ), she must inherit one recessive allele from the mother and one from the father, requiring both parents to be color blind.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1987"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1988_08",
                subject = "Biology",
                topic = "Comparative Plant Reproduction",
                year = "1988",
                questionText = "The prothallus of a fern is biologically equivalent to the gametophyte generation of a moss because both:",
                optionA = "Are conspicuous diploid structures",
                optionB = "Bear the reproductive sex organs (antheridia and archegonia)",
                optionC = "Possess true lignified roots and vascular bundles",
                optionD = "Produce seeds after fertilization",
                correctAnswerIndex = 1,
                explanation = "Both the fern prothallus and the moss plant represent the haploid gametophyte generation whose defining function is the formation of gametangia (antheridia and archegonia).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1988"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1989_24",
                subject = "Biology",
                topic = "Skeletal System & Synovial Joints",
                year = "1989",
                questionText = "The synovial articulation at the human elbow, allowing movement predominantly in a single plane, is classified as a:",
                optionA = "Pivot joint",
                optionB = "Gliding joint",
                optionC = "Ball and socket joint",
                optionD = "Hinge joint",
                correctAnswerIndex = 3,
                explanation = "A hinge joint (such as the elbow and knee) allows flexion and extension movement in one single anatomical plane.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1989"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1989_25",
                subject = "Biology",
                topic = "Appendicular Skeleton & Forelimb",
                year = "1989",
                questionText = "In the mammalian forelimb skeleton, the medial long bone of the forearm extending from the elbow to the wrist parallel to the radius is the:",
                optionA = "Humerus",
                optionB = "Femur",
                optionC = "Ulna",
                optionD = "Tibia",
                correctAnswerIndex = 2,
                explanation = "The forearm contains two parallel long bones: the radius situated laterally (on the thumb side) and the ulna situated medially (on the pinky side).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1989"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1990_30",
                subject = "Biology",
                topic = "Floral Anatomy & Placentation",
                year = "1990",
                questionText = "The type of placentation in which ovules develop in a single longitudinal row attached along the ventral suture of a monocarpellary ovary (e.g., in flamboyant and peas) is:",
                optionA = "Parietal placentation",
                optionB = "Marginal placentation",
                optionC = "Axile placentation",
                optionD = "Free-central placentation",
                correctAnswerIndex = 1,
                explanation = "In marginal placentation, the gynoecium is monocarpellary with ovules borne along the fusion line (margin) of the single carpel wall, as in legumes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1990"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1991_25",
                subject = "Biology",
                topic = "Osmosis & Osmometer Demonstration",
                year = "1991",
                questionText = "In an osmometer experiment where a concentrated sugar solution inside a cellophane dialysis bag is immersed in a beaker of pure distilled water, after 30 minutes the liquid level will:",
                optionA = "Remain exactly unchanged in both compartments",
                optionB = "Rise inside the sugar solution due to osmotic influx of water",
                optionC = "Fall inside the sugar solution",
                optionD = "Rise equally in both the beaker and the bag",
                correctAnswerIndex = 1,
                explanation = "Water molecules diffuse down their water potential gradient from the hypotonic distilled water across the semi-permeable cellophane membrane into the hypertonic sugar solution, causing the solution level to rise.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1991"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1991_26",
                subject = "Biology",
                topic = "Cell Membrane Physiology & Transport",
                year = "1991",
                questionText = "The physiological process by which water molecules move across a selectively permeable membrane from a region of higher water potential (dilute solution) to lower water potential (concentrated solution) is:",
                optionA = "Simple diffusion",
                optionB = "Active transport",
                optionC = "Osmosis",
                optionD = "Plasmolysis",
                correctAnswerIndex = 2,
                explanation = "Osmosis is specifically defined as the passive net movement of solvent (water) across a selectively permeable membrane along a concentration gradient of water potential.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1991"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1992_35",
                subject = "Biology",
                topic = "Ecological Pyramids & Energy Transfer",
                year = "1992",
                questionText = "In a standard pyramid of energy representing a biological community, which trophic level contains the SMALLEST amount of total stored energy?",
                optionA = "Top carnivore / Tertiary consumer level",
                optionB = "Secondary consumer level",
                optionC = "Primary consumer level",
                optionD = "Primary producer level",
                correctAnswerIndex = 0,
                explanation = "According to Lindeman's efficiency law, approximately 90% of energy is dissipated as metabolic heat at each trophic transfer, leaving the apex predator level with the least stored chemical energy.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1992"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1992_36",
                subject = "Biology",
                topic = "Marine Trophic Levels",
                year = "1992",
                questionText = "In an ocean food pyramid consisting of Diatoms → Zooplankton → Small Fish → Shark, which organism functions as the tertiary consumer?",
                optionA = "Diatoms (Algae)",
                optionB = "Shark",
                optionC = "Zooplankton",
                optionD = "Small Fish",
                correctAnswerIndex = 1,
                explanation = "Diatoms are primary producers (T1), Zooplankton are primary consumers (T2), Small Fish are secondary consumers (T3), and Sharks are tertiary consumers (T4).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1992"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1993_08",
                subject = "Biology",
                topic = "Invertebrate Excretory Systems",
                year = "1993",
                questionText = "Flame cells (solenocytes/protonephridia) function as the specialized excretory and osmoregulatory organs in:",
                optionA = "Insects (Arthropoda)",
                optionB = "Earthworms (Annelida)",
                optionC = "Flatworms (Platyhelminthes, e.g., Planaria and Tapeworms)",
                optionD = "Snails (Mollusca)",
                correctAnswerIndex = 2,
                explanation = "Flame cells contain tufts of beating cilia that draw interstitial fluid into collecting ducts for waste excretion and osmoregulation in Platyhelminthes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1993"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_21",
                subject = "Biology",
                topic = "Soil Science & Humus Content Calculation",
                year = "1983",
                questionText = "A 28g fresh soil sample was heated to a constant dry weight of 24g. When further heated to red hot to burn organic matter and cooled, it weighed 18g. What is the percentage of humus in the dry soil sample?",
                optionA = "22.2%",
                optionB = "55.6%",
                optionC = "75.0%",
                optionD = "25.0%",
                correctAnswerIndex = 3,
                explanation = "Humus mass lost = Dry weight (24g) - Ash weight (18g) = 6g. Humus percentage = (6g / 24g) × 100% = 25.0%.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_31_v",
                subject = "Biology",
                topic = "Mammalian Skeletal System & Vertebrae",
                year = "1983",
                questionText = "What is the correct anatomical sequence of the vertebral column in mammals from the neck downward to the lower back?",
                optionA = "Axis → Atlas → Cervical → Thoracic → Lumbar",
                optionB = "Atlas → Axis → Cervical → Thoracic → Lumbar",
                optionC = "Atlas → Cervical → Axis → Thoracic → Lumbar",
                optionD = "Atlas → Axis → Thoracic → Cervical → Lumbar",
                correctAnswerIndex = 1,
                explanation = "The mammalian vertebral column begins with the first cervical vertebra (Atlas C1), followed by the second (Axis C2), the remaining cervical vertebrae (C3-C7), thoracic vertebrae (T1-T12), and lumbar vertebrae (L1-L5).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_16",
                subject = "Biology",
                topic = "Circulatory System & Blood Clotting",
                year = "1984",
                questionText = "The biological cascade of blood clotting at a site of vascular injury is initiated by the breakdown of:",
                optionA = "Leucocytes (White blood cells)",
                optionB = "Blood Platelets (Thrombocytes)",
                optionC = "Erythrocytes (Red blood cells)",
                optionD = "Haemoglobin molecules",
                correctAnswerIndex = 1,
                explanation = "Damaged platelets disintegrate and release the enzyme thromboplastin (thrombokinase), which in the presence of calcium ions converts prothrombin into active thrombin to form a fibrin clot.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_18",
                subject = "Biology",
                topic = "Cellular Respiration & Fermentation",
                year = "1984",
                questionText = "Anaerobic cellular respiration in yeast (alcoholic fermentation) produces:",
                optionA = "Carbon dioxide and Ethanol",
                optionB = "Carbon dioxide and Water",
                optionC = "Ethanol and Oxygen",
                optionD = "Lactic acid and Water",
                correctAnswerIndex = 0,
                explanation = "In the absence of molecular oxygen, yeast cells decarboxylate pyruvate into acetaldehyde and reduce it to ethanol, yielding C2H5OH + CO2 + 2 ATP.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_26",
                subject = "Biology",
                topic = "Mammalian Excretory System & Kidney Anatomy",
                year = "1985",
                questionText = "In a longitudinal section of the mammalian kidney, the Bowman's capsules and renal Malpighian corpuscles are situated in the:",
                optionA = "Renal Cortex",
                optionB = "Renal Medulla",
                optionC = "Renal Pelvis",
                optionD = "Ureter",
                correctAnswerIndex = 0,
                explanation = "The renal cortex (the outer granular region of the kidney) houses the ultrafiltration units including Bowman's capsules and glomeruli.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1986_06",
                subject = "Biology",
                topic = "Algae & Thallophyta Characteristics",
                year = "1986",
                questionText = "Which of the following statements is NOT true concerning the filamentous green alga Spirogyra?",
                optionA = "It reproduces sexually by scalariform and lateral conjugation",
                optionB = "It reproduces asexually by filament fragmentation",
                optionC = "It consists of branched multicellular filaments",
                optionD = "It contains spiral, ribbon-shaped chloroplasts with pyrenoids",
                correctAnswerIndex = 2,
                explanation = "Spirogyra consists of unbranched, cylindrical filaments; branching is absent in this genus.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1986"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1987_40",
                subject = "Biology",
                topic = "Genetics & Mendelian Inheritance",
                year = "1987",
                questionText = "A gene which expresses its phenotypic effect ONLY when in the homozygous condition is described as:",
                optionA = "Dominant",
                optionB = "Recessive",
                optionC = "Co-dominant",
                optionD = "Lethal",
                correctAnswerIndex = 1,
                explanation = "A recessive allele is masked in the presence of a dominant allele and only manifests in the organism's phenotype when two identical recessive copies are present (homozygous).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1987"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1987_44",
                subject = "Biology",
                topic = "Sex-Linked Genetics & Colour Blindness",
                year = "1987",
                questionText = "In human genetics, in which of the following parental crosses will 100% of all the female offspring be colour blind?",
                optionA = "Colour blind mother (XbXb) × Colour blind father (XbY)",
                optionB = "Colour blind mother (XbXb) × Normal vision father (XBY)",
                optionC = "Carrier mother (XBXb) × Colour blind father (XbY)",
                optionD = "Carrier mother (XBXb) × Normal vision father (XBY)",
                correctAnswerIndex = 0,
                explanation = "Since red-green colour blindness is an X-linked recessive trait, a female child must receive an affected X chromosome from both parents (Xb from mother and Xb from father) to be 100% colour blind.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1987"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1989_03",
                subject = "Biology",
                topic = "Cellular Organelles & Bioenergetics",
                year = "1989",
                questionText = "Which cellular organelle is universally referred to as the 'powerhouse of the cell' due to its role in ATP synthesis?",
                optionA = "Ribosome",
                optionB = "Mitochondrion",
                optionC = "Golgi apparatus",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 1,
                explanation = "Mitochondria carry out the Krebs cycle and oxidative phosphorylation on their cristae, generating the bulk of the cell's ATP currency during aerobic respiration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1989"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1990_31",
                subject = "Biology",
                topic = "Plant Reproduction & Fruit Development",
                year = "1990",
                questionText = "Fruits which develop from the ovary of a flower without prior fertilization of the ovules are described as:",
                optionA = "Parthenocarpic fruits",
                optionB = "Aggregate fruits",
                optionC = "Multiple (composite) fruits",
                optionD = "Dehiscent fruits",
                correctAnswerIndex = 0,
                explanation = "Parthenocarpy is the natural or artificially induced development of fruit without fertilization, producing seedless fruits such as commercial bananas and seedless oranges.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1990"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1990_45",
                subject = "Biology",
                topic = "Ecology & Physiological Adaptations",
                year = "1990",
                questionText = "The physiological dormancy and reduced metabolic rate exhibited by certain animals (e.g., African lungfish and land snails) to survive periods of intense heat and drought is called:",
                optionA = "Hibernation (Winter sleep)",
                optionB = "Aestivation (Summer dormancy)",
                optionC = "Acclimatization",
                optionD = "Camouflage",
                correctAnswerIndex = 1,
                explanation = "Aestivation is the state of dormancy that animals enter during high-temperature, arid conditions to conserve body moisture and metabolic energy.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1990"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1991_25",
                subject = "Biology",
                topic = "Osmosis & Semipermeable Membranes",
                year = "1991",
                questionText = "In a classic osmometer experiment where a semi-permeable membrane separates a concentrated sucrose solution (Y) inside a thistle funnel from pure water (X) in a beaker, after 30 minutes the liquid level will:",
                optionA = "Rise in beaker X only",
                optionB = "Rise in thistle funnel Y only",
                optionC = "Remain exactly unchanged in both",
                optionD = "Fall in thistle funnel Y",
                correctAnswerIndex = 1,
                explanation = "Water moves by osmosis from the region of higher water potential (pure water in beaker X) across the semipermeable membrane into the region of lower water potential (sucrose solution Y), causing the liquid level in Y to rise.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1991"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1992_49",
                subject = "Biology",
                topic = "Evolution & Natural Selection",
                year = "1992",
                questionText = "The scientific theory of evolution through the mechanism of Natural Selection was independently formulated and published by:",
                optionA = "Jean-Baptiste Lamarck and Gregor Mendel",
                optionB = "Charles Darwin and Alfred Russel Wallace",
                optionC = "Gregor Mendel and Thomas Morgan",
                optionD = "Louis Pasteur and Robert Hooke",
                correctAnswerIndex = 1,
                explanation = "Charles Darwin and Alfred Russel Wallace presented joint papers to the Linnean Society in 1858 establishing the theory of evolution by natural selection.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1992"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1993_01",
                subject = "Biology",
                topic = "Genetics & Cytology",
                year = "1993",
                questionText = "On which nuclear structures are the genes (discrete units of biological inheritance) physically arranged in linear sequence?",
                optionA = "Ribosomes",
                optionB = "Golgi bodies",
                optionC = "Chromosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 2,
                explanation = "Chromosomes are thread-like chromatin structures inside the cell nucleus that carry DNA and genes at specific chromosomal loci.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1993"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1993_11",
                subject = "Biology",
                topic = "Amphibian Metamorphosis & Respiration",
                year = "1993",
                questionText = "During the intermediate aquatic larval stage of toad metamorphosis (tadpole with internal gills covered by the opercular fold), respiration occurs through:",
                optionA = "Lungs",
                optionB = "External branching gills",
                optionC = "Internal gills",
                optionD = "Tracheal tubes",
                correctAnswerIndex = 2,
                explanation = "As the tadpole grows, external gills degenerate and are replaced by internal gills enclosed within an opercular chamber for aquatic gas exchange before pulmonary respiration develops.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1993"
            )
        )

        return list
    }
}
