package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic JAMB Biology Master Revision Question Bank (1983 - 1993 Series).
 * Contains verified past questions with accurate options, correct answer indices, and educational explanations.
 */
object JambBiologyHistoricalQuestionBank {

    fun getHistoricalBiologyQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =====================================================================
        // 1. BIOLOGY 1983 SERIES
        // =====================================================================
        list.add(
            QuestionEntity(
                id = "bio_1983_01",
                subject = "Biology",
                topic = "Plant Anatomy & Physiology",
                year = "1983",
                questionText = "Root hairs are developed from the:",
                optionA = "Root apex",
                optionB = "Epidermis of roots (piliferous layer)",
                optionC = "Vascular bundles",
                optionD = "Endodermis",
                correctAnswerIndex = 1,
                explanation = "Root hairs are lateral tubular extensions of the piliferous layer (epidermal cells) of the root, designed to increase surface area for the absorption of water and mineral salts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_02",
                subject = "Biology",
                topic = "Plant Anatomy & Stem Structure",
                year = "1983",
                questionText = "In a cross-section of a plant stem, which characteristic feature is used to identify a dicotyledonous stem from a monocotyledonous stem?",
                optionA = "Vascular bundles arranged in a distinct concentric ring",
                optionB = "Vascular bundles scattered randomly across the ground tissue",
                optionC = "Complete absence of epidermis",
                optionD = "Circular outline of the stem only",
                correctAnswerIndex = 0,
                explanation = "In dicotyledonous stems, vascular bundles are characteristically arranged in a distinct ring around a central pith, whereas in monocotyledonous stems they are scattered randomly throughout the ground parenchyma.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_03",
                subject = "Biology",
                topic = "Plant Anatomy & Secondary Growth",
                year = "1983",
                questionText = "In a dicotyledonous stem, the primary function of the vascular cambium is to:",
                optionA = "Separate the cortex from the pith",
                optionB = "Produce secondary xylem inward and secondary phloem outward",
                optionC = "Produce cork cells on the outer bark",
                optionD = "Translocate water and manufactured food",
                correctAnswerIndex = 1,
                explanation = "The vascular cambium is a lateral meristematic tissue responsible for secondary growth (thickening), giving rise to secondary xylem (wood) toward the interior and secondary phloem toward the exterior.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_04",
                subject = "Biology",
                topic = "Plant Anatomy & Root Morphology",
                year = "1983",
                questionText = "In the internal anatomy of a plant root, the primary function of the pericycle is to:",
                optionA = "Surround and insulate the vascular tissues",
                optionB = "Produce cork and bark",
                optionC = "Give rise to lateral (branch) roots",
                optionD = "Develop into photosynthetic guard cells",
                correctAnswerIndex = 2,
                explanation = "The pericycle is a layer of meristematic parenchyma cells located just inside the endodermis that retains the capacity for cell division to give rise to lateral roots in vascular plants.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_05",
                subject = "Biology",
                topic = "Plant Anatomy & Transpiration",
                year = "1983",
                questionText = "In a dicot leaf, guard cells differ distinctly from other surrounding epidermal cells because guard cells:",
                optionA = "Have no definite shape or cell wall",
                optionB = "Lack nuclei at functional maturity",
                optionC = "Are significantly smaller and irregular",
                optionD = "Contain chloroplasts to facilitate stomatal opening",
                correctAnswerIndex = 3,
                explanation = "Unlike typical epidermal cells which lack chloroplasts and are transparent, guard cells contain functional chloroplasts to carry out photosynthesis, generating the osmotic pressure needed for stomatal movement.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_06",
                subject = "Biology",
                topic = "Animal Taxonomy & Morphology",
                year = "1983",
                questionText = "Which of the following anatomical structures is NOT found in the female Agama lizard (Agama agama)?",
                optionA = "Pre-anal pads (pores)",
                optionB = "Tympanic eardrum",
                optionC = "Gular fold",
                optionD = "Nuchal crest",
                correctAnswerIndex = 0,
                explanation = "Pre-anal pads (pores) are secondary sexual characteristics found in male Agama lizards, which secrete waxy pheromones for territorial scent marking.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_07",
                subject = "Biology",
                topic = "Plant Morphology & Classification",
                year = "1983",
                questionText = "Herbs differ fundamentally from shrubs because herbs:",
                optionA = "Do not produce fruits or seeds",
                optionB = "Are exclusively utilized for herbal medicine",
                optionC = "Do not develop persistent woody stems",
                optionD = "Are strictly annual parasites",
                correctAnswerIndex = 2,
                explanation = "Herbs have soft, succulent, non-woody stems that die down to the ground level after their growing season, whereas shrubs have persistent woody stems branching near the base.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_08",
                subject = "Biology",
                topic = "Cell Physiology & Osmosis",
                year = "1983",
                questionText = "If an isolated living plant cell is placed in pure distilled water for two hours, the cell is likely to:",
                optionA = "Lose water to the surrounding fluid and crenate",
                optionB = "Lose all its cytoplasm and burst rapidly",
                optionC = "Undergo spontaneous binary fission",
                optionD = "Absorb water by osmosis and become more turgid",
                correctAnswerIndex = 3,
                explanation = "Distilled water is hypotonic relative to the cell's cytoplasm. Water enters the vacuole via endosmosis, causing the protoplast to swell and push against the rigid cell wall, making it turgid.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_09",
                subject = "Biology",
                topic = "Biochemical Tests & Food Nutrients",
                year = "1983",
                questionText = "When Benedict's qualitative reagent is heated with a solution containing a reducing sugar, the resulting positive reaction produces a:",
                optionA = "Brick-red precipitate of copper(I) oxide",
                optionB = "Blue-black iodine complex",
                optionC = "Violet-purple Biuret coloration",
                optionD = "Translucent spot on filter paper",
                correctAnswerIndex = 0,
                explanation = "Benedict's solution reacts with reducing sugars (e.g., glucose, fructose, maltose) when heated, reducing blue cupric ions (Cu²⁺) to a brick-red precipitate of cuprous oxide (Cu₂O).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_10",
                subject = "Biology",
                topic = "Plant Nutrition & Mineral Requirements",
                year = "1983",
                questionText = "Which mineral elements are indispensable for the biosynthesis and formation of chlorophyll in green plants?",
                optionA = "Magnesium and Iron",
                optionB = "Calcium and Potassium",
                optionC = "Calcium and Sulphur",
                optionD = "Phosphorus and Sodium",
                correctAnswerIndex = 0,
                explanation = "Magnesium is the central metallic constituent of the chlorophyll porphyrin ring, while iron acts as an essential catalyst/cofactor in the enzymatic pathway of chlorophyll synthesis.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_11",
                subject = "Biology",
                topic = "Human Physiology & Blood",
                year = "1983",
                questionText = "Which of the following statements is NOT true of mature mammalian erythrocytes (red blood cells)?",
                optionA = "They contain iron-rich haemoglobin for gas transport",
                optionB = "They appear pale yellowish when viewed individually under a microscope",
                optionC = "They are biconcave circular discs in humans",
                optionD = "They possess prominent nuclei at functional maturity",
                correctAnswerIndex = 3,
                explanation = "Mature mammalian erythrocytes are enucleated (lack nuclei) to maximize internal volume for hemoglobin molecules and increase oxygen-carrying capacity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_12",
                subject = "Biology",
                topic = "Plant Physiology & Stem Transport",
                year = "1983",
                questionText = "In woody dicotyledonous stems, the radial conduction of water, dissolved nutrients, and gases across the stem diameter is carried out by:",
                optionA = "Sclerenchyma fibres",
                optionB = "Cork cells (phellem)",
                optionC = "Medullary rays (vascular rays)",
                optionD = "Phloem parenchyma alone",
                correctAnswerIndex = 2,
                explanation = "Medullary rays (vascular rays) are radial ribbons of parenchyma tissue extending from the pith to the cortex, facilitating lateral and radial transport of fluids and gases across woody stems.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_13",
                subject = "Biology",
                topic = "Human Physiology & Excretion",
                year = "1983",
                questionText = "Which of the following chemical substances is NOT a normal major excretory constituent of human urine?",
                optionA = "Water",
                optionB = "Sodium chloride (NaCl)",
                optionC = "Urea and nitrogenous metabolites",
                optionD = "Calcium chloride in bulk amounts",
                correctAnswerIndex = 3,
                explanation = "Normal urine consists of water, urea, uric acid, creatinine, and sodium chloride. Calcium chloride is not excreted as a primary bulk constituent under normal metabolic conditions.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_14",
                subject = "Biology",
                topic = "Homeostasis & Osmoregulation",
                year = "1983",
                questionText = "The kidneys of all vertebrates function as osmoregulators. This biological role means that they:",
                optionA = "Regulate water and ionic balance to keep the composition of body fluids constant",
                optionB = "Control the volume of blood entering the renal arteries permanently",
                optionC = "Continuously decrease blood osmotic pressure regardless of hydration",
                optionD = "Inhibit all hormonal secretion from the adrenal cortex",
                correctAnswerIndex = 0,
                explanation = "Osmoregulation is the homeostatic process whereby kidneys adjust the reabsorption and excretion of water and dissolved electrolytes to maintain constant osmotic pressure in blood plasma and tissue fluids.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_15",
                subject = "Biology",
                topic = "Plant Coordination & Movements",
                year = "1983",
                questionText = "The movement of a plant part in response to an external non-directional stimulus is termed a:",
                optionA = "Taxic movement",
                optionB = "Tropic movement",
                optionC = "Haptotropic movement",
                optionD = "Nastic movement",
                correctAnswerIndex = 3,
                explanation = "Nastic movements (e.g., photonasty, seismonasty in Mimosa pudica) are non-directional growth or turgor responses to diffuse external stimuli, where the direction of movement is dictated by internal anatomy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_16",
                subject = "Biology",
                topic = "Nervous System & Brain Anatomy",
                year = "1983",
                questionText = "The part of the mammalian brain primarily responsible for coordinating voluntary movement, balance, and posture is the:",
                optionA = "Medulla oblongata",
                optionB = "Olfactory lobe",
                optionC = "Cerebellum",
                optionD = "Cerebrum",
                correctAnswerIndex = 2,
                explanation = "The cerebellum coordinates muscle tone, equilibrium, posture, and motor coordination by integrating sensory signals from the vestibular apparatus and proprioceptors.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_17",
                subject = "Biology",
                topic = "Plant Reproduction & Vegetative Structures",
                year = "1983",
                questionText = "In the vegetative reproduction of an onion bulb (Allium cepa), which anatomical part develops into a new daughter bulb?",
                optionA = "Fleshy scale leaf",
                optionB = "Axillary / terminal bud",
                optionC = "Adventitious fibrous root",
                optionD = "Outer dry tunic",
                correctAnswerIndex = 1,
                explanation = "The axillary (lateral) or terminal buds located on the condensed disc-like stem of an onion bulb undergo cell division and elongation to form new shoots and daughter bulbs.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_18",
                subject = "Biology",
                topic = "Plant Storage Organs",
                year = "1983",
                questionText = "In an onion bulb, food reserve (carbohydrate) is stored predominantly in the:",
                optionA = "Condensed disc stem",
                optionB = "Thickened fleshy leaf bases (scale leaves)",
                optionC = "Adventitious roots",
                optionD = "Embryonic cotyledon",
                correctAnswerIndex = 1,
                explanation = "An onion bulb is a specialized underground shoot where nutrients and sugars are stored in swollen, concentric, fleshy scale leaf bases surrounding the apical bud.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_19",
                subject = "Biology",
                topic = "Plant Morphology & Fruit Types",
                year = "1983",
                questionText = "Botanically, a groundnut (peanut) pod is classified as a fruit because it:",
                optionA = "Is harvested from beneath the soil surface",
                optionB = "Develops from a ripened fertilized ovary and encloses seeds in a pericarp",
                optionC = "Possesses a fleshy, sweet, edible mesocarp",
                optionD = "Is formed from an unfertilized ovule",
                correctAnswerIndex = 1,
                explanation = "A fruit is defined botanically as a mature, ripened ovary enclosing seeds. The groundnut shell is the pericarp of a subterranean legume fruit.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_20",
                subject = "Biology",
                topic = "Plant Morphology & Fruit Types",
                year = "1983",
                questionText = "What type of fruit is formed from a single flower possessing multiple free, distinct (apocarpous) carpels?",
                optionA = "Multiple (composite) fruit",
                optionB = "Simple dry fruit",
                optionC = "Aggregate fruit",
                optionD = "Caryopsis",
                correctAnswerIndex = 2,
                explanation = "An aggregate fruit (e.g., strawberry, custard apple, cola nut) develops from a single flower having an apocarpous gynoecium with several free ovaries.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_21",
                subject = "Biology",
                topic = "Ecology & Soil Science",
                year = "1983",
                questionText = "A 28 g fresh soil sample was oven-dried to a constant weight of 24 g. When heated to red-hot in a crucible and cooled, it weighed 18 g. What is the percentage of humus (organic matter) in the soil based on dry mass?",
                optionA = "25.0%",
                optionB = "55.6%",
                optionC = "75.0%",
                optionD = "12.5%",
                correctAnswerIndex = 0,
                explanation = "Mass of humus = Dry soil (24 g) - Ash after burning (18 g) = 6 g. Humus percentage of dry soil = (6 g / 24 g) × 100% = 25.0% (or 21.4% of fresh soil).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_22",
                subject = "Biology",
                topic = "Plant Pathology & Microorganisms",
                year = "1983",
                questionText = "Which of the following agricultural diseases is NOT caused by a virus?",
                optionA = "Rinderpest in cattle",
                optionB = "Maize rust disease",
                optionC = "Newcastle disease in poultry",
                optionD = "Cassava mosaic disease",
                correctAnswerIndex = 1,
                explanation = "Maize rust is a fungal disease caused by Puccinia sorghi, whereas Rinderpest, Newcastle disease, and Cassava mosaic are caused by viral pathogens.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_23",
                subject = "Biology",
                topic = "Animal Taxonomy & Arthropods",
                year = "1983",
                questionText = "A centipede (class Chilopoda) differs fundamentally from a millipede (class Diplopoda) by possessing:",
                optionA = "One pair of walking legs per body segment and venomous poison claws",
                optionB = "Two pairs of walking legs per body segment and no antennae",
                optionC = "A cylindrical body with vegetarian detritivorous diet",
                optionD = "An unsegmented soft body without appendages",
                correctAnswerIndex = 0,
                explanation = "Centipedes are carnivorous predators with dorsoventrally flattened bodies, one pair of legs per segment, and modified front claws (forcipules) containing poison glands.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_24",
                subject = "Biology",
                topic = "Genetics & Inheritance",
                year = "1983",
                questionText = "An organism possessing an identical pair of alleles for a particular hereditary gene locus is termed a/an:",
                optionA = "Heterozygote",
                optionB = "Hybrid",
                optionC = "Allelomorph",
                optionD = "Homozygote",
                correctAnswerIndex = 3,
                explanation = "An individual is homozygous (a homozygote) for a specific gene when identical alleles are present at that locus on homologous chromosomes (e.g., TT or tt).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_25",
                subject = "Biology",
                topic = "Ecology & Plant Adaptations",
                year = "1983",
                questionText = "Plants structurally and physiologically adapted to survive in habitats where water availability is severely limited are called:",
                optionA = "Bryophytes",
                optionB = "Mesophytes",
                optionC = "Xerophytes",
                optionD = "Hydrophytes",
                correctAnswerIndex = 2,
                explanation = "Xerophytes (e.g., cactus, aloe vera, acacia) possess adaptations such as reduced leaf surface area, succulent water-storing tissues, and sunken stomata to survive in arid environments.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_26",
                subject = "Biology",
                topic = "Agricultural Botany & Vegetative Propagation",
                year = "1983",
                questionText = "Banana, plantain, and pineapple are agronomic crops grouped together primarily because they are all propagated commercially by means of:",
                optionA = "Tiny viable seeds",
                optionB = "Multiple composite fruits",
                optionC = "Vegetative suckers",
                optionD = "Epiphytic runners",
                correctAnswerIndex = 2,
                explanation = "These monocots are routinely propagated vegetatively via suckers (lateral basal shoots arising from the underground rhizome or stem base).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_27",
                subject = "Biology",
                topic = "Microbiology & Human Diseases",
                year = "1983",
                questionText = "Which of the following diseases is NOT caused by a bacterium?",
                optionA = "Malaria",
                optionB = "Tuberculosis",
                optionC = "Pneumonia",
                optionD = "Tetanus",
                correctAnswerIndex = 0,
                explanation = "Malaria is caused by unicellular protozoan parasites of the genus Plasmodium, whereas Tuberculosis (Mycobacterium), Pneumonia (Streptococcus), and Tetanus (Clostridium) are bacterial infections.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_28",
                subject = "Biology",
                topic = "Animal Metamorphosis & Development",
                year = "1983",
                questionText = "In what sequential order do anatomical structures develop during the complete metamorphosis of the toad (Bufo)?",
                optionA = "External gills → Mouth → Internal gills → Hindlimbs → Forelimbs",
                optionB = "Mouth → Forelimbs → Hindlimbs → External gills → Internal gills",
                optionC = "Hindlimbs → Forelimbs → External gills → Mouth → Internal gills",
                optionD = "Internal gills → External gills → Mouth → Hindlimbs → Forelimbs",
                correctAnswerIndex = 0,
                explanation = "Tadpole development follows: Hatching with external gills → functional mouth formation → replacement by internal gills covered by operculum → appearance of hindlimbs → appearance of forelimbs and lung development.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_29",
                subject = "Biology",
                topic = "Mammalian Dentition & Anatomy",
                year = "1983",
                questionText = "The mammalian dental formula i 3/3, c 1/1, pm 4/4, m 2/3 = 42 represents the dentition of a/an:",
                optionA = "Adult rabbit",
                optionB = "Full-grown human",
                optionC = "Young child",
                optionD = "Adult dog",
                correctAnswerIndex = 3,
                explanation = "The dental formula i 3/3, c 1/1, pm 4/4, m 2/3 gives 21 teeth per side = 42 total permanent teeth, characteristic of the adult canine (dog).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_30",
                subject = "Biology",
                topic = "Plant Nutrition & Adaptations",
                year = "1983",
                questionText = "Which statement is NOT true concerning insectivorous (carnivorous) plants?",
                optionA = "They obtain part of their nutrients by trapping and digesting small insects",
                optionB = "They attract and trap insects solely to achieve floral cross-pollination",
                optionC = "They can thrive in soils that are severely deficient in nitrogenous salts",
                optionD = "Examples include pitcher plants (Nepenthes), sundews (Drosera), and bladderworts",
                correctAnswerIndex = 1,
                explanation = "Insectivorous plants trap insects to digest animal proteins as a supplementary nitrogen source in nutrient-poor bogs, not for floral pollination.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_31",
                subject = "Biology",
                topic = "Ecology & Invertebrate Zoology",
                year = "1983",
                questionText = "Which of the following worms is ecologically beneficial to humans and agriculture?",
                optionA = "Liver fluke (Fasciola)",
                optionB = "Tapeworm (Taenia)",
                optionC = "Earthworm (Lumbricus)",
                optionD = "Hookworm (Necator)",
                correctAnswerIndex = 2,
                explanation = "Earthworms improve agricultural soil structure and fertility through active burrowing (aeration and drainage) and by depositing humus-rich nitrogenous worm castings.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_32",
                subject = "Biology",
                topic = "Human Skeleton & Vertebrae",
                year = "1983",
                questionText = "The correct anatomical sequence of regions along the human vertebral column from superior to inferior is:",
                optionA = "Atlas, Axis, Cervical, Thoracic, Lumbar, Sacral",
                optionB = "Atlas, Cervical, Axis, Thoracic, Lumbar",
                optionC = "Axis, Atlas, Thoracic, Cervical, Lumbar",
                optionD = "Atlas, Axis, Thoracic, Cervical, Lumbar",
                correctAnswerIndex = 0,
                explanation = "The vertebral column begins with C1 (Atlas), C2 (Axis), followed by C3-C7 cervical vertebrae, 12 thoracic vertebrae, 5 lumbar vertebrae, sacrum, and coccyx.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_33",
                subject = "Biology",
                topic = "Ecology & Parasitology",
                year = "1983",
                questionText = "Which of the following human parasitic diseases is characteristically endemic to river basins with fast-flowing streams?",
                optionA = "Malaria",
                optionB = "Syphilis",
                optionC = "Onchocerciasis (River Blindness)",
                optionD = "Poliomyelitis",
                correctAnswerIndex = 2,
                explanation = "Onchocerciasis is caused by the filarial nematode Onchocerca volvulus, transmitted by female blackflies (Simulium spp.) which breed exclusively in fast-flowing, highly oxygenated river waters.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_34",
                subject = "Biology",
                topic = "Plant Evolution & Diversity",
                year = "1983",
                questionText = "Which sequence represents the correct evolutionary progression in the plant kingdom from primitive to advanced?",
                optionA = "Algae → Mosses → Ferns → Conifers → Flowering plants",
                optionB = "Flowering plants → Conifers → Ferns → Mosses → Algae",
                optionC = "Ferns → Algae → Conifers → Flowering plants → Mosses",
                optionD = "Mosses → Ferns → Algae → Conifers → Flowering plants",
                correctAnswerIndex = 0,
                explanation = "Evolutionary complexity progresses from Thallophytes (Algae) to Bryophytes (Mosses), Pteridophytes (Ferns), Gymnosperms (Conifers), and Angiosperms (Flowering plants).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_35",
                subject = "Biology",
                topic = "Cell Physiology & Osmosis",
                year = "1983",
                questionText = "Which of the following membrane materials is completely impermeable to water and will NOT permit osmosis to occur?",
                optionA = "Pig's urinary bladder",
                optionB = "Cellophane sheet",
                optionC = "Parchment paper",
                optionD = "Transparent polythene sheet",
                correctAnswerIndex = 3,
                explanation = "Osmosis requires a semi-permeable membrane that permits solvent molecules to pass. Polythene is a synthetic hydrophobic plastic that is completely impermeable to water.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_36",
                subject = "Biology",
                topic = "Mammalian Circulatory System",
                year = "1983",
                questionText = "Which of the following statements concerning the mammalian circulatory system is FALSE?",
                optionA = "Blood in the pulmonary artery has a higher oxygen content than blood in the pulmonary vein",
                optionB = "Blood in the hepatic portal vein is the richest in absorbed amino acids and glucose",
                optionC = "Backflow of venous blood is prevented by the presence of pocket valves",
                optionD = "Arterial blood pressure is maintained by thick muscular, elastic walls",
                correctAnswerIndex = 0,
                explanation = "The pulmonary artery carries deoxygenated blood from the right ventricle to the lungs, while the pulmonary vein returns oxygenated blood to the left atrium of the heart.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_37",
                subject = "Biology",
                topic = "Plant Hormones & Phototropism",
                year = "1983",
                questionText = "In the positive phototropic curvature of a plant shoot toward unidirectional light, bending occurs primarily because:",
                optionA = "Auxins migrate away from the illuminated side and concentrate on the shaded side",
                optionB = "Auxins are evenly distributed throughout all tissues of the coleoptile",
                optionC = "Cell elongation is completely inhibited on the shaded side",
                optionD = "Auxins are entirely absent from the coleoptile tip",
                correctAnswerIndex = 0,
                explanation = "Unidirectional light causes auxins to migrate laterally to the shaded side of the shoot, stimulating accelerated cell elongation on the shaded side and causing the tip to curve toward the light.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_38",
                subject = "Biology",
                topic = "Plant Morphology & Root Modifications",
                year = "1983",
                questionText = "The swollen storage organ of cassava (Manihot esculenta) is a root tuber rather than a stem tuber because it:",
                optionA = "Is swollen with stored starch reserves",
                optionB = "Produces an aerial vegetative shoot above ground",
                optionC = "Develops beneath the ground surface",
                optionD = "Lacks nodes, internodes, scale leaves, and axillary buds ('eyes')",
                correctAnswerIndex = 3,
                explanation = "Stem tubers (e.g., Irish potato) have nodes, internodes, and axillary buds ('eyes'). Cassava is an adventitious root tuber lacking these structural stem markers.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_39",
                subject = "Biology",
                topic = "Sense Organs & Ear Anatomy",
                year = "1983",
                questionText = "The primary physiological function of the auditory ossicles (malleus, incus, and stapes) in the mammalian ear is the:",
                optionA = "Transmission and mechanical amplification of sound vibrations to the oval window",
                optionB = "Equalization of air pressure across the tympanic membrane",
                optionC = "Structural protection of the semicircular canals",
                optionD = "Detection of linear gravitational acceleration",
                correctAnswerIndex = 0,
                explanation = "The three ear ossicles bridge the middle ear cavity, acting as a lever system that amplifies vibrations from the eardrum and conveys them to the oval window of the cochlea.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_40",
                subject = "Biology",
                topic = "Ecology & Limnological Instruments",
                year = "1983",
                questionText = "Which ecological instrument is used to determine the turbidity, water clarity, and light penetration in aquatic habitats?",
                optionA = "Thermometer",
                optionB = "Secchi Disc",
                optionC = "Anemometer",
                optionD = "Hygrometer",
                correctAnswerIndex = 1,
                explanation = "A Secchi disc is an opaque, circular black-and-white disc lowered vertically into water to quantitatively gauge transparency and turbidity based on disappearance depth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_41",
                subject = "Biology",
                topic = "Plant Taxonomy & Monocots vs Dicots",
                year = "1983",
                questionText = "Which of the following is NOT a typical diagnostic characteristic of monocotyledonous angiosperms?",
                optionA = "Reticulate (netted) leaf venation",
                optionB = "Embryo with a single cotyledon",
                optionC = "Fibrous adventitious root system",
                optionD = "Floral parts arranged in multiples of three (trimerous)",
                correctAnswerIndex = 0,
                explanation = "Monocots have parallel leaf venation, a single cotyledon, and trimerous flowers. Reticulate (netted) venation is a defining characteristic of dicots.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_42",
                subject = "Biology",
                topic = "Ecology & Trophic Food Chains",
                year = "1983",
                questionText = "Which of the following sequences represents the correct order of organisms in a terrestrial food chain? 1. Toad, 2. Mucuna (Plant), 3. Grasshopper, 4. Snake, 5. Hawk.",
                optionA = "5 → 4 → 1 → 3 → 2",
                optionB = "1 → 2 → 3 → 4 → 5",
                optionC = "2 → 3 → 1 → 4 → 5",
                optionD = "2 → 1 → 3 → 4 → 5",
                correctAnswerIndex = 2,
                explanation = "Trophic sequence: Producer (2: Mucuna) → Primary consumer (3: Grasshopper) → Secondary consumer (1: Toad) → Tertiary consumer (4: Snake) → Apex predator (5: Hawk).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_43",
                subject = "Biology",
                topic = "Fungal Nutrition & Storage",
                year = "1983",
                questionText = "In fungi such as Rhizopus (black bread mould), excess carbohydrate is stored biochemically in the form of:",
                optionA = "Free glucose monomers",
                optionB = "Paramylon granules",
                optionC = "Glycogen and oil droplets",
                optionD = "Insoluble plant starch",
                correctAnswerIndex = 2,
                explanation = "Like animal cells, fungi store surplus carbohydrates as glycogen granules and lipid droplets rather than plant starch.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_44",
                subject = "Biology",
                topic = "Plant Physiology & Transpiration",
                year = "1983",
                questionText = "Which of the following statements concerning the rate of transpiration in plants is INCORRECT?",
                optionA = "Transpiration increases with rising ambient temperature",
                optionB = "Transpiration is influenced by changes in incident light intensity",
                optionC = "Transpiration is completely unaffected by changes in atmospheric relative humidity",
                optionD = "Transpiration is accelerated by increased air movement (wind)",
                correctAnswerIndex = 2,
                explanation = "Transpiration is strongly dependent on atmospheric relative humidity; high humidity reduces the water vapor concentration gradient between leaf air spaces and the atmosphere, reducing transpiration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_45",
                subject = "Biology",
                topic = "Animal Taxonomy & Invertebrates",
                year = "1983",
                questionText = "A 'jointed exoskeleton' composed of chitinous cuticle is ABSENT in:",
                optionA = "Cockroach (Periplaneta)",
                optionB = "Garden snail (Helix)",
                optionC = "Spider (Araneae)",
                optionD = "Millipede (Diplopoda)",
                correctAnswerIndex = 1,
                explanation = "Snails belong to the Phylum Mollusca and possess soft, unsegmented bodies protected by a calcareous shell, lacking the jointed chitinous appendages of Arthropoda.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_46",
                subject = "Biology",
                topic = "Human Dentition & Anatomy",
                year = "1983",
                questionText = "Which of the following statements concerning the permanent dentition of adult humans is INCORRECT?",
                optionA = "Humans have more molars than incisors",
                optionB = "There is normally no diastema between teeth in the dental arch",
                optionC = "There is a total of thirty-two permanent teeth",
                optionD = "Humans have a total of only six molars across both jaws",
                correctAnswerIndex = 3,
                explanation = "An adult human has a total of twelve molars (3 in each of the 4 quadrants: 2 permanent molars + 1 wisdom tooth per quadrant).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_47",
                subject = "Biology",
                topic = "Cell Physiology & Osmosis",
                year = "1983",
                questionText = "When a mammalian red blood cell is immersed in a concentrated hypertonic saline solution, the cell:",
                optionA = "Remains completely unchanged in shape",
                optionB = "Absorbs water rapidly and undergoes haemolysis",
                optionC = "Becomes turgid due to membrane pressure",
                optionD = "Loses water by exosmosis and shrivels (crenates)",
                correctAnswerIndex = 3,
                explanation = "In a hypertonic environment, water moves out of the erythrocyte via exosmosis into the concentrated external solution, causing the cell to shrink and wrinkle (crenation).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_48",
                subject = "Biology",
                topic = "Human Physiology & Deamination",
                year = "1983",
                questionText = "In the human body, urea is synthesized from the deamination of excess amino acids primarily in the:",
                optionA = "Liver",
                optionB = "Urinary bladder",
                optionC = "Spleen",
                optionD = "Kidneys",
                correctAnswerIndex = 0,
                explanation = "Urea is formed in liver hepatocytes via the Ornithine (urea) Cycle to detoxify toxic ammonia produced during the deamination of excess amino acids.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_49",
                subject = "Biology",
                topic = "Mendelian Genetics",
                year = "1983",
                questionText = "What is the expected phenotypic ratio among the F2 offspring when heterozygous F1 individuals (Tt × Tt) are self-pollinated?",
                optionA = "1 dominant : 3 recessive",
                optionB = "3 dominant : 1 recessive",
                optionC = "1 dominant : 1 recessive",
                optionD = "4 dominant : 0 recessive",
                correctAnswerIndex = 1,
                explanation = "In a classic Mendelian monohybrid cross, selfing heterozygous F1 plants (Tt × Tt) produces a 3:1 phenotypic ratio (3 Tall : 1 Dwarf) and a 1:2:1 genotypic ratio (1 TT : 2 Tt : 1 tt).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1983_50",
                subject = "Biology",
                topic = "Human Circulatory System & Absorption",
                year = "1983",
                questionText = "Which sequence correctly traces the physiological pathway taken by absorbed glucose travelling from the ileum to the heart?",
                optionA = "Ileum → Hepatic portal vein → Liver → Hepatic vein → Inferior Vena Cava → Right Atrium",
                optionB = "Ileum → Hepatic artery → Liver → Vena Cava → Heart",
                optionC = "Ileum → Renal vein → Inferior Vena Cava → Left Atrium",
                optionD = "Ileum → Pulmonary artery → Pulmonary vein → Heart",
                correctAnswerIndex = 0,
                explanation = "Glucose absorbed through intestinal villi enters capillaries of the hepatic portal vein to the liver, exits via the hepatic vein into the inferior vena cava, and enters the right atrium of the heart.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1983"
            )
        )

        // =====================================================================
        // 2. BIOLOGY 1984 - 1993 SERIES
        // =====================================================================
        list.add(
            QuestionEntity(
                id = "bio_1984_01",
                subject = "Biology",
                topic = "Insect Morphology & Adaptations",
                year = "1984",
                questionText = "The mouthparts of the common housefly (Musca domestica) are structurally modified and adapted for:",
                optionA = "Lapping and sponging liquid food",
                optionB = "Sucking and chewing solid vegetation",
                optionC = "Piercing flesh and sucking blood",
                optionD = "Biting and grinding plant fibres",
                correctAnswerIndex = 0,
                explanation = "The housefly has a fleshy, retractable proboscis ending in pseudotracheae adapted for regurgitating saliva and sponging up liquid nutrients.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_02",
                subject = "Biology",
                topic = "Amphibian Morphology & Sexual Dimorphism",
                year = "1984",
                questionText = "A sexually mature male toad (Bufo regularis) is externally distinguished from a female toad by possessing:",
                optionA = "Vocal sacs and dark throat patches",
                optionB = "Significantly shorter hindlimbs",
                optionC = "Bulging dorsal eyes",
                optionD = "A transparent nictitating membrane",
                correctAnswerIndex = 0,
                explanation = "Male toads develop subgular vocal sacs that inflate to amplify breeding calls during the mating season, as well as nuptial pads on forelimbs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_03",
                subject = "Biology",
                topic = "Plant Taxonomy & Cryptogams",
                year = "1984",
                questionText = "Mosses, liverworts (Bryophytes), and ferns (Pteridophytes) can be grouped together taxonomically because they all:",
                optionA = "Are strictly aquatic hydrophytes",
                optionB = "Are non-flowering, seedless plants that reproduce via spores",
                optionC = "Grow exclusively in dry desert biomes",
                optionD = "Produce colorful, insect-pollinated flowers",
                correctAnswerIndex = 1,
                explanation = "Bryophytes and Pteridophytes are primitive, non-flowering, seedless embryophytes that reproduce by dispersing microscopic haploid spores.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_04",
                subject = "Biology",
                topic = "Plant Taxonomy & Thallophyta",
                year = "1984",
                questionText = "Spirogyra (green algae) and Mucor (fungus) are traditionally classified together as Thallophyta because:",
                optionA = "They are motile unicellular protozoans",
                optionB = "Their bodies consist of simple thalli or filaments lacking true roots, stems, and leaves",
                optionC = "They reproduce exclusively via sexual conjugation",
                optionD = "Their spores are strictly water-dispersed",
                correctAnswerIndex = 1,
                explanation = "Thallophytes are non-vascular organisms whose plant-like bodies (thalli) are undifferentiated into true vascular roots, stems, or leaves.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_12",
                subject = "Biology",
                topic = "Cell Physiology & Osmosis Definition",
                year = "1984",
                questionText = "Osmosis is strictly defined in biological systems as the:",
                optionA = "Movement of solute molecules from high concentration to low concentration",
                optionB = "Net diffusion of water molecules across a semi-permeable membrane from a dilute solution (high water potential) to a concentrated solution (low water potential)",
                optionC = "Active transport of mineral ions requiring ATP across a cell wall",
                optionD = "Bulk passage of water through large open vessels without resistance",
                correctAnswerIndex = 1,
                explanation = "Osmosis is the specialized diffusion of water (solvent) molecules across a selectively permeable membrane from an area of higher water potential (lower solute concentration) to lower water potential.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_24",
                subject = "Biology",
                topic = "Embryology & Bird Egg Anatomy",
                year = "1984",
                questionText = "In a fertilized domestic fowl's egg (Gallus gallus), the young chick embryo develops directly from the:",
                optionA = "Germinal disc (blastoderm) located on the yolk surface",
                optionB = "Chalaza spiral cord",
                optionC = "Albumen protein matrix",
                optionD = "Outer calcareous shell",
                correctAnswerIndex = 0,
                explanation = "The germinal disc (blastoderm) is the active site of cytoplasm and nucleus where fertilization occurs and embryonic cleavage begins.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1984_25",
                subject = "Biology",
                topic = "Embryology & Bird Egg Nutrition",
                year = "1984",
                questionText = "In the developing amniotic egg of a fowl, which structures supply food nutrients and water to the growing embryo?",
                optionA = "Yolk (fats and proteins) and Albumen (water and proteins)",
                optionB = "Chalaza and outer egg shell",
                optionC = "Air space and inner shell membrane",
                optionD = "Germinal disc alone",
                correctAnswerIndex = 0,
                explanation = "The yolk provides energy-dense lipids and proteins, while the albumen (egg white) provides aqueous hydration, mineral salts, and albumin proteins.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1984"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_14",
                subject = "Biology",
                topic = "Enzymatic Digestion & Protein Hydrolysis",
                year = "1985",
                questionText = "Which of the following represents the correct step-wise sequence during the enzymatic hydrolysis of dietary proteins in humans? 1. Polypeptides, 2. Amino acids, 3. Proteins, 4. Peptones.",
                optionA = "3 → 4 → 1 → 2",
                optionB = "3 → 1 → 2 → 4",
                optionC = "3 → 2 → 4 → 1",
                optionD = "3 → 1 → 4 → 2",
                correctAnswerIndex = 0,
                explanation = "Protein digestion proceeds hierarchically: complex Proteins (3) are cleaved by pepsin into Peptones (4), hydrolyzed by trypsin into Polypeptides (1), and digested by peptidases into Amino acids (2).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1985_21",
                subject = "Biology",
                topic = "Human Blood Groups & Transfusion",
                year = "1985",
                questionText = "A patient who can safely receive compatible blood transfusions from all ABO blood group donors (universal recipient) belongs to blood group:",
                optionA = "Group O",
                optionB = "Group A",
                optionC = "Group B",
                optionD = "Group AB",
                correctAnswerIndex = 3,
                explanation = "Individuals with Blood Group AB have both A and B antigens on their red blood cells and possess no anti-A or anti-B antibodies in plasma, allowing them to receive red cells from all ABO groups.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1985"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1986_34",
                subject = "Biology",
                topic = "Plant Morphology & Seed Germination",
                year = "1986",
                questionText = "In the germination of a maize grain (caryopsis), which internal structure develops directly into the new leafy shoot and primary root?",
                optionA = "Pericarp fused with testa",
                optionB = "Endosperm reserve tissue",
                optionC = "The embryo (plumule and radicle)",
                optionD = "The scutellum alone",
                correctAnswerIndex = 2,
                explanation = "The embryo consists of the embryonic shoot (plumule) and embryonic root (radicle) which germinate to form the adult plant.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1986"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1986_36",
                subject = "Biology",
                topic = "Plant Morphology & Seed Storage",
                year = "1986",
                questionText = "In a monocotyledonous seed such as a maize grain, the primary physiological function of the endosperm is to:",
                optionA = "Protect the embryo from mechanical injury",
                optionB = "Nourish the embryo and seedling during early germination",
                optionC = "Keep the seed interior moist",
                optionD = "Prevent fungal infection",
                correctAnswerIndex = 1,
                explanation = "The endosperm contains abundant starch, proteins, and oils which are mobilized during germination to support metabolic growth before the first photosynthetic leaves emerge.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1986"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1987_40",
                subject = "Biology",
                topic = "Genetics & Allelic Expression",
                year = "1987",
                questionText = "An allele that is expressed phenotypically only in the homozygous condition (when both copies are identical) is termed a:",
                optionA = "Mutant gene",
                optionB = "Dominant gene",
                optionC = "Recessive gene",
                optionD = "Lethal gene",
                correctAnswerIndex = 2,
                explanation = "Recessive alleles are masked in the presence of dominant alleles and can only manifest phenotypically when an individual inherits two copies (homozygous state).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1987"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1987_41",
                subject = "Biology",
                topic = "Human Genetics & Monohybrid Inheritance",
                year = "1987",
                questionText = "Which of the following human conditions is a classic example of autosomal monohybrid recessive inheritance governed by a single gene pair?",
                optionA = "Astigmatism",
                optionB = "Cretinism",
                optionC = "Hyperthyroidism",
                optionD = "Albinism",
                correctAnswerIndex = 3,
                explanation = "Albinism (lack of melanin pigment in skin, hair, and eyes) is caused by an autosomal recessive mutation in the tyrosinase gene, following standard Mendelian single-gene inheritance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1987"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1988_03",
                subject = "Biology",
                topic = "Plant Taxonomy & Thallophyta",
                year = "1988",
                questionText = "The traditional botanical group 'Thallophyta' includes simple, non-vascular organisms such as:",
                optionA = "Ferns and mosses",
                optionB = "Algae and fungi",
                optionC = "Mosses and liverworts",
                optionD = "Gymnosperms and ferns",
                correctAnswerIndex = 1,
                explanation = "Thallophytes comprise algae and fungi, characterized by a simple vegetative body (thallus) that lacks differentiation into true roots, stems, and leaves.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1988"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1988_06",
                subject = "Biology",
                topic = "Animal Evolution & Phyla Hierarchy",
                year = "1988",
                questionText = "Which sequence represents the correct evolutionary trend of animal phyla from simple to complex structural organization? 1. Mollusca, 2. Platyhelminthes, 3. Nematoda, 4. Protozoa.",
                optionA = "4 → 1 → 2 → 3",
                optionB = "4 → 3 → 2 → 1",
                optionC = "4 → 2 → 1 → 3",
                optionD = "4 → 2 → 3 → 1",
                correctAnswerIndex = 3,
                explanation = "Evolutionary complexity increases from Unicellular (4: Protozoa) → Acoelomate triploblastic (2: Platyhelminthes) → Pseudocoelomate (3: Nematoda) → True coelomate (1: Mollusca).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1988"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1989_24",
                subject = "Biology",
                topic = "Human Skeleton & Joint Types",
                year = "1989",
                questionText = "The synovial joint at the human elbow, which permits movement in a single angular plane, is classified as a:",
                optionA = "Pivot joint",
                optionB = "Gliding joint",
                optionC = "Ball and socket joint",
                optionD = "Hinge joint",
                correctAnswerIndex = 3,
                explanation = "The elbow (humeroulnar articulation) is a classic synovial hinge joint allowing flexion and extension in a single sagittal plane.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1989"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1989_25",
                subject = "Biology",
                topic = "Human Skeleton & Forearm Anatomy",
                year = "1989",
                questionText = "In the skeletal anatomy of the human forearm, the medial long bone aligned on the side of the little finger is the:",
                optionA = "Radius",
                optionB = "Ulna",
                optionC = "Humerus",
                optionD = "Clavicle",
                correctAnswerIndex = 1,
                explanation = "The forearm contains two parallel bones: the radius situated laterally (thumb side) and the ulna situated medially (little finger side).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1989"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1990_42",
                subject = "Biology",
                topic = "Ecology & Trophic Niches",
                year = "1990",
                questionText = "In an ecological food web where a rodent (such as a field mouse) feeds on both cereal grain crops and insects, the rodent is classified as a/an:",
                optionA = "Carnivore",
                optionB = "Herbivore",
                optionC = "Omnivore",
                optionD = "Primary producer",
                correctAnswerIndex = 2,
                explanation = "Omnivores are heterotrophic organisms whose diet regularly includes both plant tissues (producers) and animal prey (consumers).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1990"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1990_43",
                subject = "Biology",
                topic = "Ecology & Pyramid of Numbers",
                year = "1990",
                questionText = "In accordance with the thermodynamic laws governing ecological food chains (10% energy transfer rule), which organism will have the lowest population density in a terrestrial biome?",
                optionA = "Top apex predator (e.g., Hawk)",
                optionB = "Leguminous producer (e.g., Cowpea)",
                optionC = "Secondary consumer (e.g., Praying mantis)",
                optionD = "Primary consumer (e.g., Field mouse)",
                correctAnswerIndex = 0,
                explanation = "Because roughly 90% of energy is lost as metabolic heat at each successive trophic transfer, apex carnivores (Hawks) at the pinnacle of the pyramid have the lowest total biomass and smallest population density.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1990"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1991_25",
                subject = "Biology",
                topic = "Cell Physiology & Osmometer",
                year = "1991",
                questionText = "In an osmometer experiment with a thistle funnel containing concentrated sucrose solution X immersed in a beaker of pure water Y separated by a semi-permeable membrane, after 30 minutes:",
                optionA = "The liquid level in the thistle stem (X) will rise due to endosmosis",
                optionB = "The liquid level in the beaker (Y) will rise",
                optionC = "The liquid levels in X and Y will remain identical",
                optionD = "Sucrose will freely diffuse out into Y until concentrations equilibrate",
                correctAnswerIndex = 0,
                explanation = "Water molecules move down their concentration gradient (from pure water Y into concentrated sugar solution X) across the semi-permeable membrane via endosmosis, causing the level in stem X to rise.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1991"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1992_29",
                subject = "Biology",
                topic = "Growth & Sigmoid Growth Curve",
                year = "1992",
                questionText = "On a typical sigmoid growth curve of an organism or population, which distinct phase represents the fastest rate of growth and cell division?",
                optionA = "Lag phase of initial acclimatization",
                optionB = "Logarithmic (Exponential) phase",
                optionC = "Stationary plateau phase",
                optionD = "Senescence / decline phase",
                correctAnswerIndex = 1,
                explanation = "The log (exponential) phase is characterized by optimal conditions and the highest rate of cellular division and biomass accumulation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1992"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1992_30",
                subject = "Biology",
                topic = "Plant Physiology & Growth Phases",
                year = "1992",
                questionText = "In developmental biology, the botanical term 'grand period of growth' refers to the developmental stage during which the highest rate of elongation occurs, coinciding with the:",
                optionA = "Lag phase",
                optionB = "Stationary phase",
                optionC = "Logarithmic (Exponential) phase",
                optionD = "Decline phase",
                correctAnswerIndex = 2,
                explanation = "The 'grand period of growth' is the interval of maximum physiological expansion, corresponding to the exponential/log phase.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1992"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_1993_10",
                subject = "Biology",
                topic = "Animal Metamorphosis & Amphibians",
                year = "1993",
                questionText = "Which sequence represents the correct developmental progression through complete metamorphosis in the toad (Bufo)?",
                optionA = "Fertilized Egg → Tadpole with external gills → Tadpole with internal gills → Tadpole with developing limbs → Terrestrial adult toad",
                optionB = "Egg → Tadpole with limbs → Tadpole with internal gills → Adult toad",
                optionC = "Tadpole with internal gills → Tadpole with external gills → Adult toad",
                optionD = "Egg → Adult toad → Tadpole with external gills",
                correctAnswerIndex = 0,
                explanation = "Metamorphosis in toads progresses strictly: Spawn (egg) → Aquatic larva with external gills → Larva with internal gills and operculum → Emergence of hindlimbs then forelimbs with tail resorption → Adult air-breathing toad.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology Past Question • 1993"
            )
        )

        // Include extended 1984-1993 authentic question series
        list.addAll(JambBiologyExtendedSeries.getExtendedQuestions())

        return list
    }
}
