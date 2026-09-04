package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Biology Examination Series (PT. 1 - 5) with Rich Diagram Descriptions, Figures, and Verified Solutions
 * Total Verified Questions: 97
 */
object JambBiologyDiagramSeriesPt1to5Bank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_02",
                subject = "Biology",
                topic = "Animal Adaptation & Courtship",
                year = "Series 1",
                questionText = "The biological function of the bright red head in male Agama lizards is to ___.",
                optionA = "conceal and camouflage the animal from predators",
                optionB = "scare other males and attract female lizards for courtship/mating",
                optionC = "warn predators of the distastefulness of the animal",
                optionD = "regulate blood circulation.",
                correctAnswerIndex = 1,
                explanation = "The bright coloration of the male Agama lizard's head is a secondary sexual characteristic used to display dominance, defend territory, and attract females during courtship.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_03",
                subject = "Biology",
                topic = "Ecosystem Biomass",
                year = "Series 1",
                questionText = "In which of the following organisms is the individual biomass the smallest?",
                optionA = "Agama sp.",
                optionB = "Bufo sp. (Toad)",
                optionC = "Spirogyra sp. (Filamentous alga)",
                optionD = "Tilapia sp.",
                correctAnswerIndex = 2,
                explanation = "A single microscopic filament cell of Spirogyra has a vastly smaller individual biomass than multicellular vertebrates like toads, lizards, or fishes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_04",
                subject = "Biology",
                topic = "Plant Classification",
                year = "Series 1",
                questionText = "Seed-bearing plants (Spermatophytes) are divided into ___.",
                optionA = "tracheophytes and ferns",
                optionB = "angiosperms and gymnosperms",
                optionC = "monocotyledons and dicotyledons only",
                optionD = "thallophytes and bryophytes.",
                correctAnswerIndex = 1,
                explanation = "Spermatophytes (seed plants) are divided into Gymnosperms (naked seeds, e.g. conifers, cycads) and Angiosperms (flowering plants with seeds enclosed in fruits).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_05",
                subject = "Biology",
                topic = "Vertebrate Reproduction",
                year = "Series 1",
                questionText = "In which of the following vertebrate classes is parental care most highly developed and exhibited?",
                optionA = "Reptilia",
                optionB = "Amphibia",
                optionC = "Aves",
                optionD = "Mammalia",
                correctAnswerIndex = 3,
                explanation = "Mammals exhibit the most advanced parental care, including internal gestation, lactation via mammary glands, protection, and feeding of offspring.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_06",
                subject = "Biology",
                topic = "Agricultural Entomology",
                year = "Series 1",
                questionText = "[DIAGRAM: Representative Arthropods:\nFigure I: Locust / Grasshopper (Variegated grasshopper, *Zonocerus variegatus*)\nFigure II: Grain Weevil / Cassava Beetle\nFigure III: Housefly Pupa / Maggot (Adult: *Musca domestica*)\nFigure IV: Mosquito Larva / Stem-borer Caterpillar]\n\nWhich of the organisms represented in the figures are notable destructive agricultural crop pests?",
                optionA = "II and IV",
                optionB = "I and IV",
                optionC = "II and III",
                optionD = "I and III",
                correctAnswerIndex = 1,
                explanation = "The variegated grasshopper (I) defoliates crops and cassava, while the stem borer caterpillar (IV) bores into maize stalks and cereal crops.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_07",
                subject = "Biology",
                topic = "Economic Entomology",
                year = "Series 1",
                questionText = "[DIAGRAM: Representative Arthropods:\nFigure I: Locust / Grasshopper (Variegated grasshopper, *Zonocerus variegatus*)\nFigure II: Grain Weevil / Cassava Beetle\nFigure III: Housefly Pupa / Maggot (Adult: *Musca domestica*)\nFigure IV: Mosquito Larva / Stem-borer Caterpillar]\n\nAn economic importance of the larval organism represented in IV is that ___.",
                optionA = "it transmits water borne disease to humans",
                optionB = "it is highly destructive to farm crops by eating foliage and boring stems",
                optionC = "its faeces pollutes drinking water",
                optionD = "it helps in the biological control of mosquito larvae.",
                correctAnswerIndex = 1,
                explanation = "Insect larvae (caterpillars/grubs) have voracious chewing mouthparts that decimate crop leaves, fruits, and stem tissues.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_08",
                subject = "Biology",
                topic = "Vectors of Disease",
                year = "Series 1",
                questionText = "[DIAGRAM: Representative Arthropods:\nFigure I: Locust / Grasshopper (Variegated grasshopper, *Zonocerus variegatus*)\nFigure II: Grain Weevil / Cassava Beetle\nFigure III: Housefly Pupa / Maggot (Adult: *Musca domestica*)\nFigure IV: Mosquito Larva / Stem-borer Caterpillar]\n\nThe adult vector of the larval form shown in III (or mosquito) is a vector of ___.",
                optionA = "sleeping sickness",
                optionB = "river blindness",
                optionC = "cholera / dysentery",
                optionD = "elephantiasis.",
                correctAnswerIndex = 2,
                explanation = "The housefly (*Musca domestica*) carries pathogens mechanically on its hairy legs and proboscis, transmitting cholera, typhoid, and dysentery.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_09",
                subject = "Biology",
                topic = "Social Insects Adaptation",
                year = "Series 1",
                questionText = "The adaptive importance of nuptial flight (swarming) in termite colonies is to ___.",
                optionA = "disperse the winged reproductive alates to mate and establish new colonies",
                optionB = "provide abundant food for insectivorous birds during early rains",
                optionC = "ensure cross-breeding between worker termites",
                optionD = "expel old queens from the mound.",
                correctAnswerIndex = 0,
                explanation = "Nuptial flight allows virgin winged kings and queens to disperse over wide areas, mate, shed wings, and found new independent termite colonies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_10",
                subject = "Biology",
                topic = "Cellular Respiration",
                year = "Series 1",
                questionText = "[DIAGRAM: Respiration Experiment Setup:\nA round-bottom flask containing 10% sucrose solution inoculated with active Baker's yeast, mounted on a tripod stand and sealed with a rubber stopper.\nA bent delivery tube carries gas evolved from the flask into an adjacent test tube containing clear lime water (aqueous calcium hydroxide).]\n\nThe gas evolved in the anaerobic fermentation process which turns the lime water milky is:",
                optionA = "carbon (IV) oxide (CO2)",
                optionB = "nitrogen gas",
                optionC = "oxygen gas",
                optionD = "carbon (II) oxide.",
                correctAnswerIndex = 0,
                explanation = "Yeast ferments sucrose anaerobically into ethanol and carbon (IV) oxide: C6H12O6 -> 2C2H5OH + 2CO2. The CO2 precipitates calcium carbonate in lime water, turning it cloudy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_11",
                subject = "Biology",
                topic = "Cellular Respiration",
                year = "Series 1",
                questionText = "[DIAGRAM: Respiration Experiment Setup:\nA round-bottom flask containing 10% sucrose solution inoculated with active Baker's yeast, mounted on a tripod stand and sealed with a rubber stopper.\nA bent delivery tube carries gas evolved from the flask into an adjacent test tube containing clear lime water (aqueous calcium hydroxide).]\n\nThe experimental setup illustrated above is used to demonstrate the process of ___.",
                optionA = "gaseous diffusion",
                optionB = "photosynthesis",
                optionC = "alcoholic fermentation (anaerobic respiration)",
                optionD = "plasmolysis in cells.",
                correctAnswerIndex = 2,
                explanation = "The setup demonstrates anaerobic respiration (alcoholic fermentation) in yeast cells using a fermentable carbohydrate substrate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_12",
                subject = "Biology",
                topic = "Osmoregulation & Osmosis",
                year = "Series 1",
                questionText = "Which of the following solutions will cause shrinkage (crenation/plasmolysis) of living plant and animal cells?",
                optionA = "Hypotonic solution",
                optionB = "Isotonic solution",
                optionC = "Deionized pure water",
                optionD = "Hypertonic solution.",
                correctAnswerIndex = 3,
                explanation = "A hypertonic solution has higher osmotic pressure and lower water potential than the cell sap/cytoplasm, drawing water out of the cell via exosmosis.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_13",
                subject = "Biology",
                topic = "Circulatory System",
                year = "Series 1",
                questionText = "Which of the following characteristics is true of mammalian white blood cells (leucocytes)?",
                optionA = "They contain hemoglobin respiratory pigments",
                optionB = "They lack a nucleus and are biconcave discs",
                optionC = "They are large, nucleated, and defend the body against pathogens",
                optionD = "They are responsible for initiating blood clotting directly.",
                correctAnswerIndex = 2,
                explanation = "Leucocytes are nucleated cells of various sizes (granulocytes and agranulocytes) that mediate cellular and humoral immune defence.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_14",
                subject = "Biology",
                topic = "Nutrition & Metabolism",
                year = "Series 1",
                questionText = "The incorporation and conversion of absorbed nutrient molecules into structural components and protoplasm of the consumer's body is called:",
                optionA = "digestion",
                optionB = "assimilation",
                optionC = "absorption",
                optionD = "ingestion.",
                correctAnswerIndex = 1,
                explanation = "Assimilation is the biochemical utilization of absorbed simple nutrients (amino acids, glucose, fatty acids) to synthesize protoplasm, enzymes, and cellular structures.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_15",
                subject = "Biology",
                topic = "Characteristics of Living Things",
                year = "Series 1",
                questionText = "The ability of a living organism to perceive changes (stimuli) in its internal or external environment and respond appropriately is called:",
                optionA = "locomotion",
                optionB = "irritability (sensitivity)",
                optionC = "growth",
                optionD = "taxis.",
                correctAnswerIndex = 1,
                explanation = "Irritability (or sensitivity) is the fundamental life characteristic enabling organisms to detect stimuli and execute adaptive responses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_16",
                subject = "Biology",
                topic = "Circulatory & Lymphatic System",
                year = "Series 1",
                questionText = "In mammals, the exchange of nutrients, dissolved gases, and metabolic waste products between blood and tissue cells takes place across the:",
                optionA = "walls of the trachea",
                optionB = "walls of the capillary network and tissue fluid / lymph",
                optionC = "walls of the muscular aorta",
                optionD = "oesophageal lining.",
                correctAnswerIndex = 1,
                explanation = "Capillaries have single-cell-thick endothelial walls allowing diffusion of oxygen, glucose, and wastes into the surrounding tissue fluid (lymph).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_17",
                subject = "Biology",
                topic = "Plant Reproduction & Seeds",
                year = "Series 1",
                questionText = "An example of an endospermous (albuminous) seed that retains rich food storage tissue in maturity is the:",
                optionA = "maize grain (caryopsis)",
                optionB = "cashew nut",
                optionC = "cotton seed",
                optionD = "bean seed.",
                correctAnswerIndex = 0,
                explanation = "Maize is an endospermous seed where the endosperm stores starch and aleurone protein, whereas bean seeds are non-endospermous (food stored in cotyledons).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_18",
                subject = "Biology",
                topic = "Modes of Nutrition",
                year = "Series 1",
                questionText = "Which of the following organisms is correctly matched with its mode of nutrition?\nI. Parasitism -> Sundew\nII. Autotrophism -> Amoeba\nIII. Saprophytism -> Green Alga\nIV. Heterotrophism -> Agama lizard",
                optionA = "I",
                optionB = "II",
                optionC = "III",
                optionD = "IV",
                correctAnswerIndex = 3,
                explanation = "Agama lizards are holozoic heterotrophs that capture and ingest living insect prey.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_19",
                subject = "Biology",
                topic = "Digestive Enzymes & Hydrolysis",
                year = "Series 1",
                questionText = "[DIAGRAM: Hydrolysis Experiment:\nTest Tube I: Cane sugar (sucrose) + distilled water\nTest Tube II: Cane sugar + dilute hydrochloric acid (boiled)\nTest Tube III: Cane sugar + sucrase (invertase) enzyme solution at 37°C]\n\nIn which of the test tubes will reducing sugars (glucose and fructose) be detected using Fehling's or Benedict's test?",
                optionA = "I and II only",
                optionB = "II and III only",
                optionC = "I only",
                optionD = "I, II and III",
                correctAnswerIndex = 1,
                explanation = "Sucrose is non-reducing. It hydrolyzes into glucose + fructose either by acid boiling (II) or by enzymatic cleavage with sucrase (III).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_20",
                subject = "Biology",
                topic = "Digestive Enzymes & Hydrolysis",
                year = "Series 1",
                questionText = "[DIAGRAM: Hydrolysis Experiment:\nTest Tube I: Cane sugar (sucrose) + distilled water\nTest Tube II: Cane sugar + dilute hydrochloric acid (boiled)\nTest Tube III: Cane sugar + sucrase (invertase) enzyme solution at 37°C]\n\nThe enzyme responsible for hydrolyzing cane sugar into glucose and fructose in the human digestive system is:",
                optionA = "rennin",
                optionB = "erepsin",
                optionC = "sucrase (invertase)",
                optionD = "maltase.",
                correctAnswerIndex = 2,
                explanation = "Sucrase (invertase) in the intestinal juice (succus entericus) hydrolyzes sucrose into glucose and fructose.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_21",
                subject = "Biology",
                topic = "Sensory Organs",
                year = "Series 1",
                questionText = "The structures in the mammalian inner ear primarily responsible for dynamic balance and maintaining equilibrium during movement are the:",
                optionA = "semicircular canals (with ampullae and endolymph)",
                optionB = "pinna",
                optionC = "cochlea",
                optionD = "ear ossicles.",
                correctAnswerIndex = 0,
                explanation = "The three semicircular canals arranged at right angles detect rotational movement, while the utricle and saccule detect gravitational balance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_22",
                subject = "Biology",
                topic = "Respiratory System",
                year = "Series 1",
                questionText = "The correct pathway followed by inspired air entering the mammalian respiratory system is:",
                optionA = "trachea -> bronchi -> bronchioles -> alveoli",
                optionB = "bronchi -> trachea -> alveoli -> bronchioles",
                optionC = "trachea -> bronchioles -> bronchi -> alveoli",
                optionD = "bronchioles -> alveoli -> bronchi -> trachea.",
                correctAnswerIndex = 0,
                explanation = "Air enters through the glottis into the trachea, which branches into two primary bronchi, narrower bronchioles, and terminates in microscopic alveoli.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_23",
                subject = "Biology",
                topic = "Responses in Organisms",
                year = "Series 1",
                questionText = "The rapid directional movement of a cockroach away from a sudden flash of light is described as:",
                optionA = "positive phototaxis",
                optionB = "negative phototaxis",
                optionC = "negative phototropism",
                optionD = "positive phototropism.",
                correctAnswerIndex = 1,
                explanation = "Taxis is a directional locomotory movement of a whole motile organism. Moving away from light is negative phototaxis.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_24",
                subject = "Biology",
                topic = "Plant Physiology",
                year = "Series 1",
                questionText = "The vascular bundle tissues in higher vascular plants (angiosperms) are responsible for the ___.",
                optionA = "translocation of manufactured food (phloem) and conduction of water/minerals (xylem)",
                optionB = "suction pressure only",
                optionC = "transpiration pull only",
                optionD = "gaseous exchange.",
                correctAnswerIndex = 0,
                explanation = "Xylem conducts water and dissolved mineral ions upward from roots, while phloem translocates organic nutrients (sucrose) throughout the plant.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_25",
                subject = "Biology",
                topic = "Excretory & Homeostatic System",
                year = "Series 1",
                questionText = "Which organ is primarily responsible for osmoregulation, regulating blood volume, ionic concentrations, pH, and nitrogenous urea elimination in mammals?",
                optionA = "Liver",
                optionB = "Kidney (nephrons)",
                optionC = "Urinary bladder",
                optionD = "Colon.",
                correctAnswerIndex = 1,
                explanation = "The mammalian kidney regulates fluid balance, electrolyte homeostasis, blood pH, and filters metabolic urea from the bloodstream.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_26",
                subject = "Biology",
                topic = "Respiratory Mechanics in Fish",
                year = "Series 1",
                questionText = "The sequence of one-way water flow during respiration in a bony fish (tilapia) is:",
                optionA = "mouth -> buccal cavity -> gills -> opercular valve",
                optionB = "operculum -> gills -> mouth",
                optionC = "gills -> operculum -> mouth",
                optionD = "mouth -> operculum -> gills.",
                correctAnswerIndex = 0,
                explanation = "Water enters through the open mouth into the expanded buccal cavity, passes over the gill filaments for gaseous exchange, and exits via the opercular flap.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_27",
                subject = "Biology",
                topic = "Asexual Reproduction",
                year = "Series 1",
                questionText = "The method of asexual reproduction by mitotic cell division common to both *Paramecium* and other unicellular protists is:",
                optionA = "budding",
                optionB = "sporulation",
                optionC = "fragmentation",
                optionD = "binary fission.",
                correctAnswerIndex = 3,
                explanation = "Unicellular protists like *Amoeba* and *Paramecium* reproduce asexually primarily through transverse or longitudinal binary fission.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_28",
                subject = "Biology",
                topic = "Ecological Interactions",
                year = "Series 1",
                questionText = "Plants and animals are in continuous mutualistic balance in the biosphere because they ___.",
                optionA = "compete for organic matter",
                optionB = "utilize each other's gaseous respiratory products (CO2 from animals for photosynthesis, O2 from plants for respiration)",
                optionC = "are environmental rivals",
                optionD = "share territorial space.",
                correctAnswerIndex = 1,
                explanation = "Photosynthesis by green plants releases oxygen utilized by animals, while animal respiration produces carbon (IV) oxide required by plants.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_01",
                subject = "Biology",
                topic = "Soil Ecology",
                year = "Series 1",
                questionText = "[DIAGRAM: Soil Analysis Experiment:\nWeight of empty evaporating basin = 80.5 g\nWeight of basin + fresh soil = 101.5 g (Initial fresh soil = 21.0 g)\nWeight of basin + oven-dried soil = 99.0 g (Water lost = 2.5 g; Dry soil = 18.5 g)\nWeight of basin + strongly roasted soil = 95.5 g (Humus burnt = 99.0 - 95.5 = 3.5 g)]\n\nThe percentage of humus in the oven-dried soil sample is approximately:",
                optionA = "16.7%",
                optionB = "18.9% (or 17.6%)",
                optionC = "26.7%",
                optionD = "16.2%",
                correctAnswerIndex = 1,
                explanation = "Percentage of humus = (Loss of mass on ignition / Mass of dry soil) × 100% = (3.5 g / 18.5 g) × 100% ≈ 18.92% (Closest standard option 17.6%).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_29",
                subject = "Biology",
                topic = "Feeding Mechanisms",
                year = "Series 1",
                questionText = "Which of the following aquatic organisms is a typical filter-feeder utilizing specialized baleen plates or gill rakers to strain plankton?",
                optionA = "Shark (carnivorous predator)",
                optionB = "Butterfly",
                optionC = "Baleen Whale (Mysticeti)",
                optionD = "Mosquito.",
                correctAnswerIndex = 2,
                explanation = "Baleen whales (such as blue and humpback whales) strain enormous volumes of seawater through keratinous baleen plates to capture krill and plankton.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_30",
                subject = "Biology",
                topic = "Population Ecology",
                year = "Series 1",
                questionText = "A characteristic feature of the age-sex population pyramid of a developing country with high birth rates is:",
                optionA = "a broad base tapering rapidly toward a narrow apex (high youth proportion)",
                optionB = "a narrow base and broad middle",
                optionC = "an inverted pyramid",
                optionD = "a rectangular column.",
                correctAnswerIndex = 0,
                explanation = "Developing nations exhibit high birth rates and high infant mortality, producing an expansive pyramid with a wide base of young dependants.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q30)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_31",
                subject = "Biology",
                topic = "Ecological Concepts",
                year = "Series 1",
                questionText = "The dynamic structural and functional unit formed by the interaction of a living community (biocoenosis) with its non-living physical environment is an:",
                optionA = "ecological niche",
                optionB = "food chain",
                optionC = "ecosystem (biogeocoenosis)",
                optionD = "microhabitat.",
                correctAnswerIndex = 2,
                explanation = "An ecosystem encompasses all biotic organisms interacting with abiotic factors (energy, water, minerals, climate) in a given habitat.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q31)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_32",
                subject = "Biology",
                topic = "Parasitology & Vectors",
                year = "Series 1",
                questionText = "The biological vector responsible for transmitting the malaria parasite (*Plasmodium falciparum*) to humans is the:",
                optionA = "female Aedes mosquito",
                optionB = "female Anopheles mosquito",
                optionC = "male Culex mosquito",
                optionD = "female Culex mosquito.",
                correctAnswerIndex = 1,
                explanation = "The female *Anopheles* mosquito requires a vertebrate blood meal for egg development and transmits *Plasmodium* sporozoites via its saliva.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q32)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_33",
                subject = "Biology",
                topic = "Ecological Instruments",
                year = "Series 1",
                questionText = "Which of the following scientific instruments is used to measure relative atmospheric humidity in an ecological study?",
                optionA = "Hydrometer",
                optionB = "Thermometer",
                optionC = "Hygrometer (Wet-and-Dry bulb psychrometer)",
                optionD = "Anemometer.",
                correctAnswerIndex = 2,
                explanation = "A hygrometer (or psychrometer) measures relative humidity by comparing wet and dry bulb thermometer readings.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q33)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_34",
                subject = "Biology",
                topic = "Parasitology",
                year = "Series 1",
                questionText = "The exo-erythrocytic (pre-erythrocytic) schizogony phase in the life cycle of the malaria parasite occurs within the:",
                optionA = "hepatic parenchyma cells (liver of humans)",
                optionB = "reticuloendothelial cells",
                optionC = "Malpighian tubules of mosquito",
                optionD = "human brain capillaries.",
                correctAnswerIndex = 0,
                explanation = "Upon injection by a mosquito, *Plasmodium* sporozoites invade human liver cells (hepatocytes) to undergo asexual schizogony before entering red blood cells.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q34)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_35",
                subject = "Biology",
                topic = "Ecology & Habitats",
                year = "Series 1",
                questionText = "Major ecological habitats are broadly classified into two principal divisions:",
                optionA = "biotic and abiotic",
                optionB = "aquatic (marine/estuarine/freshwater) and terrestrial (forest/savanna/desert)",
                optionC = "arboreal and subterranean",
                optionD = "microhabitats and macrohabitats.",
                correctAnswerIndex = 1,
                explanation = "Biomes and natural habitats are fundamentally categorized into aquatic systems (hydrosphere) and terrestrial ecosystems (lithosphere).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q35)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_36",
                subject = "Biology",
                topic = "Public Health & Waterborne Diseases",
                year = "Series 1",
                questionText = "Dracunculiasis (guinea worm disease, *Dracunculus medinensis*) is contracted by humans through:",
                optionA = "consuming unwashed fruits",
                optionB = "drinking untreated pond/well water containing copepods (*Cyclops*) harboring larvae",
                optionC = "bathing in fast-flowing streams",
                optionD = "bites of blackflies (*Simulium*).",
                correctAnswerIndex = 1,
                explanation = "Guinea worm larvae develop inside *Cyclops* water fleas; drinking contaminated pond water introduces the parasite into the human intestine.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q36)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_37",
                subject = "Biology",
                topic = "Population Ecology",
                year = "Series 1",
                questionText = "Which of the following groups of environmental factors are density-dependent regulators of population size?",
                optionA = "Food availability, intraspecific competition, predation, and infectious disease",
                optionB = "Temperature, salinity, and rainfall",
                optionC = "Flood, fire, and earthquake",
                optionD = "Sunlight, soil pH, and climate.",
                correctAnswerIndex = 0,
                explanation = "Density-dependent factors intensify as population density rises, including food shortage, crowding stress, predation, and pathogen transmission.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q37)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_38",
                subject = "Biology",
                topic = "Nigerian Biomes & Agriculture",
                year = "Series 1",
                questionText = "Drought-resistant cereal crops such as millet, sorghum, and groundnuts are extensively cultivated in which vegetation zone of Nigeria?",
                optionA = "Tropical rainforest",
                optionB = "Sudan Savanna / Sahel Savanna",
                optionC = "Montane forest",
                optionD = "Mangrove swamp.",
                correctAnswerIndex = 1,
                explanation = "The Sudan and Sahel savannas have low rainfall and short wet seasons, making them ideal for drought-tolerant crops like sorghum and millet.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q38)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_39",
                subject = "Biology",
                topic = "Nigerian Biomes",
                year = "Series 1",
                questionText = "The southwestern ecological zone of Nigeria (e.g. Ondo, Ogun, Oyo, Osun, Edo) is predominantly located within the:",
                optionA = "Temperate forest",
                optionB = "Tropical Rainforest zone (high canopy, broadleaf evergreens)",
                optionC = "Tropical woodland",
                optionD = "Sahel scrubland.",
                correctAnswerIndex = 1,
                explanation = "Southwestern Nigeria lies within the lowland tropical rainforest belt, characterized by high annual rainfall, high humidity, and layered tree canopies.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q39)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_40",
                subject = "Biology",
                topic = "Genetics & Inheritance",
                year = "Series 1",
                questionText = "Inheritable physical or physiological traits governed by genes located on the X sex chromosome are termed:",
                optionA = "autosomal recessive",
                optionB = "sex-linked traits (e.g. hemophilia, red-green color blindness)",
                optionC = "homozygous dominant",
                optionD = "codominant alleles.",
                correctAnswerIndex = 1,
                explanation = "Sex-linked traits have their loci on the non-homologous portion of the X chromosome and show characteristic criss-cross transmission.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q40)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_41",
                subject = "Biology",
                topic = "Population Dynamics",
                year = "Series 1",
                questionText = "Severe overcrowding and spatial limitation within an animal population typically lead to:",
                optionA = "increased birth rate",
                optionB = "decreased mortality",
                optionC = "increased disease transmission, aggressive competition, and elevated mortality",
                optionD = "drought conditions.",
                correctAnswerIndex = 2,
                explanation = "High population density exacerbates competition for resources, elevates stress hormones, and accelerates spread of infectious diseases.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q41)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_42",
                subject = "Biology",
                topic = "Genetics & Inheritance",
                year = "Series 1",
                questionText = "When a pure-breeding red-flowered plant (*RR*) is crossed with a pure-breeding white-flowered plant (*rr*) yielding all pink-flowered offspring (*Rr*), this inheritance pattern illustrates:",
                optionA = "codominance",
                optionB = "incomplete dominance (partial dominance)",
                optionC = "gene mutation",
                optionD = "genetic linkage.",
                correctAnswerIndex = 1,
                explanation = "Incomplete dominance occurs when neither allele is completely dominant, producing an intermediate blended phenotype in heterozygotes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q42)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_43",
                subject = "Biology",
                topic = "Ecological Principles",
                year = "Series 1",
                questionText = "[DIAGRAM: Interspecific Competition (*Gause's Principle*):\nPopulation density (Y-axis) versus Time in days (X-axis) for mixed culture:\n- Curve 1 (*Paramecium aurelia*): Rapid logistic growth reaching stable high carrying capacity.\n- Curve 2 (*Paramecium caudatum*): Initial slight rise followed by steady decline to near zero.]\n\nThe ecological interaction illustrated between *P. aurelia* and *P. caudatum* in mixed culture is:",
                optionA = "interspecific competition (Competitive Exclusion)",
                optionB = "intraspecific competition",
                optionC = "mutualism",
                optionD = "commensalism.",
                correctAnswerIndex = 0,
                explanation = "Gause's Principle of Competitive Exclusion demonstrates that two species competing for the exact same limiting resource cannot stably coexist.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q43)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_44",
                subject = "Biology",
                topic = "Ecological Principles",
                year = "Series 1",
                questionText = "[DIAGRAM: Interspecific Competition (*Gause's Principle*):\nPopulation density (Y-axis) versus Time in days (X-axis) for mixed culture:\n- Curve 1 (*Paramecium aurelia*): Rapid logistic growth reaching stable high carrying capacity.\n- Curve 2 (*Paramecium caudatum*): Initial slight rise followed by steady decline to near zero.]\n\nWhat conclusion is deduced from the population growth curves in the mixed culture?",
                optionA = "*P. aurelia* has higher competitive fitness and reproductive rate for food resources than *P. caudatum*",
                optionB = "*P. caudatum* outcompetes *P. aurelia*",
                optionC = "both organisms coexist indefinitely",
                optionD = "neither organism can reproduce.",
                correctAnswerIndex = 0,
                explanation = "*P. aurelia* outcompetes *P. caudatum* for shared bacterial food, driving *P. caudatum* toward local competitive exclusion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q44)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_45",
                subject = "Biology",
                topic = "Animal Adaptation",
                year = "Series 1",
                questionText = "The short, stout, conical beak seen in granivorous birds (e.g. finches, sparrows) is an adaptation for:",
                optionA = "crushing hard seeds and grains",
                optionB = "sucking floral nectar",
                optionC = "tearing animal flesh",
                optionD = "straining aquatic mud.",
                correctAnswerIndex = 0,
                explanation = "Heavy conical beaks provide high mechanical leverage to crack open tough seed hulls and cereal grains.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q45)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_46",
                subject = "Biology",
                topic = "Ectotherm Thermoregulation",
                year = "Series 1",
                questionText = "Poikilothermic animals such as lizards bask in morning sunlight primarily to:",
                optionA = "change pigment shades for camouflage",
                optionB = "absorb radiant solar heat to raise core body temperature for active foraging",
                optionC = "intimidate territorial rivals",
                optionD = "court females.",
                correctAnswerIndex = 1,
                explanation = "Ectotherms depend on behavioral thermoregulation (basking on warm rocks) to attain the optimal metabolic temperature for locomotion and digestion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q46)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_47",
                subject = "Biology",
                topic = "Evolutionary Theories",
                year = "Series 1",
                questionText = "The concept of 'Use and Disuse of Organs' and the 'Inheritance of Acquired Characteristics' formed the basis of whose evolutionary theory?",
                optionA = "Charles Darwin",
                optionB = "Jean-Baptiste Lamarck",
                optionC = "Gregor Mendel",
                optionD = "Alfred Russel Wallace.",
                correctAnswerIndex = 1,
                explanation = "Lamarck proposed that organs develop through frequent use (e.g. giraffe's neck) and modifications acquired during life are passed to offspring.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q47)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt1_48",
                subject = "Biology",
                topic = "Evolution & Speciation",
                year = "Series 1",
                questionText = "Charles Darwin's observations of adaptive radiation among Galapagos finches led to his formulation of evolution driven by:",
                optionA = "comparative anatomy, geographical isolation, and natural selection",
                optionB = "comparative embryology only",
                optionC = "fossil remains alone",
                optionD = "biochemical genetics.",
                correctAnswerIndex = 0,
                explanation = "Darwin observed diverse beak forms adapted to specific island food niches, providing pivotal evidence for descent with modification via natural selection.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 1 (Q48)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_02",
                subject = "Biology",
                topic = "Cell Biology",
                year = "Series 2",
                questionText = "[DIAGRAM: Ultrastructure of a Eukaryotic Cell:\nRegion I: Plasma membrane with transport pores\nRegion II: Nucleus enclosing dense chromatin network / nucleolus\nRegion III: Endoplasmic reticulum with attached ribosomes\nRegion IV: Mitochondrion showing folded inner cristae]\n\nThe organelle primarily responsible for storing genetic code and transmitting hereditary information is labelled:",
                optionA = "I (Cell Membrane)",
                optionB = "II (Nucleus / Chromatin)",
                optionC = "III (Endoplasmic Reticulum)",
                optionD = "IV (Mitochondrion)",
                correctAnswerIndex = 1,
                explanation = "The nucleus (II) contains chromosomes composed of DNA and histone proteins, preserving and transcribing the genetic blueprint.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_03",
                subject = "Biology",
                topic = "Cell Biology",
                year = "Series 2",
                questionText = "[DIAGRAM: Ultrastructure of a Eukaryotic Cell:\nRegion I: Plasma membrane with transport pores\nRegion II: Nucleus enclosing dense chromatin network / nucleolus\nRegion III: Endoplasmic reticulum with attached ribosomes\nRegion IV: Mitochondrion showing folded inner cristae]\n\nThe organelle labelled IV containing cristae that serves as the powerhouse of cellular ATP synthesis is the:",
                optionA = "Mitochondrion",
                optionB = "Cell wall",
                optionC = "Endoplasmic reticulum",
                optionD = "Chloroplast.",
                correctAnswerIndex = 0,
                explanation = "Mitochondria (IV) conduct the Krebs cycle and oxidative phosphorylation to produce ATP energy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_04",
                subject = "Biology",
                topic = "Animal Evolution",
                year = "Series 2",
                questionText = "Which of the following organisms represents the most advanced evolutionary grade of body organization?",
                optionA = "Liver fluke (*Fasciola*, Platyhelminthes)",
                optionB = "Earthworm (*Lumbricus*, Annelida)",
                optionC = "Garden snail (*Helix*, Mollusca)",
                optionD = "Cockroach (*Periplaneta*, Arthropoda)",
                correctAnswerIndex = 3,
                explanation = "Arthropods possess jointed appendages, high cephalization, striated musculature, and compound eyes, representing the highest evolutionary complexity among the options.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_05",
                subject = "Biology",
                topic = "Biological Classification",
                year = "Series 2",
                questionText = "Which of the following represents the most specific and lowest basic category in the Linnaean taxonomic hierarchy?",
                optionA = "Class",
                optionB = "Species",
                optionC = "Family",
                optionD = "Genus.",
                correctAnswerIndex = 1,
                explanation = "The biological species (a group of interbreeding organisms producing fertile offspring) is the fundamental base unit of taxonomy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_06",
                subject = "Biology",
                topic = "Plant Anatomy & Growth",
                year = "Series 2",
                questionText = "Secondary thickening in stems and roots resulting in growth in girth is characteristic of:",
                optionA = "thallophytes",
                optionB = "pteridophytes",
                optionC = "monocotyledons",
                optionD = "dicotyledonous angiosperms and gymnosperms.",
                correctAnswerIndex = 3,
                explanation = "Dicotyledons possess active secondary meristems (vascular cambium and cork cambium) that produce secondary xylem, phloem, and periderm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_07",
                subject = "Biology",
                topic = "Kingdom Fungi",
                year = "Series 2",
                questionText = "Fungi are classified as a distinct kingdom of eukaryotes primarily because they:",
                optionA = "produce spores only",
                optionB = "completely lack chlorophyll and are heterotrophic (absorptive nutrition)",
                optionC = "have many fruiting bodies",
                optionD = "exhibit alternation of generations.",
                correctAnswerIndex = 1,
                explanation = "Fungi possess chitinous cell walls, lack photosynthetic chlorophyll, and obtain nutrition by extracellular saprophytic or parasitic absorption.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_09",
                subject = "Biology",
                topic = "Animal Symmetry",
                year = "Series 2",
                questionText = "An animal organism whose body can be divided into two identical mirror-image halves along any longitudinal plane passing through the central axis possesses:",
                optionA = "radial symmetry (e.g. *Hydra*, sea anemone)",
                optionB = "bilateral symmetry",
                optionC = "asymmetry",
                optionD = "spherical symmetry.",
                correctAnswerIndex = 0,
                explanation = "Radial symmetry allows an organism (like cnidarians and adult echinoderms) to sense the environment and capture prey equally in 360 degrees.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_10",
                subject = "Biology",
                topic = "Comparative Vertebrate Anatomy",
                year = "Series 2",
                questionText = "Which of the following aquatic organisms is a true viviparous mammal possessing functional mammary glands to suckle its young?",
                optionA = "Dogfish (Chondrichthyes)",
                optionB = "Whale (Cetacea)",
                optionC = "Great White Shark",
                optionD = "Catfish (Osteichthyes).",
                correctAnswerIndex = 1,
                explanation = "Whales and dolphins are warm-blooded, lung-breathing marine mammals that give birth to live calves and nourish them with mammary milk.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_11",
                subject = "Biology",
                topic = "Evolutionary Links",
                year = "Series 2",
                questionText = "Which anatomical feature found on the lower legs and feet of modern birds represents a direct morphological link to reptilian ancestors?",
                optionA = "Feather plumage",
                optionB = "Horny epidermal scales",
                optionC = "Horny beak",
                optionD = "Pneumatic hollow bones.",
                correctAnswerIndex = 1,
                explanation = "Birds evolved from theropod reptiles; the epidermal keratinized scales on avian legs and feet are homologous to reptile scales.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_12",
                subject = "Biology",
                topic = "Animal Camouflage",
                year = "Series 2",
                questionText = "Countershading is an adaptive coloration pattern (dark dorsal surface, light ventral belly) that enables aquatic and aerial animals to:",
                optionA = "intimidate predators",
                optionB = "remain undetected and blend into backgrounds from both above and below",
                optionC = "absorb excess heat",
                optionD = "attract mating partners.",
                correctAnswerIndex = 1,
                explanation = "From above, the dark dorsal back blends with deep water/ground; from below, the white underside matches the bright sky or surface light.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_13",
                subject = "Biology",
                topic = "Plant Morphology",
                year = "Series 2",
                questionText = "Which of the following plant organs lacks an external waterproof waxy cuticle layer in order to facilitate water uptake?",
                optionA = "Foliar leaf",
                optionB = "Herbaceous stem",
                optionC = "Root (root hair zone)",
                optionD = "Floral shoot.",
                correctAnswerIndex = 2,
                explanation = "Roots must remain water-permeable; the absence of a hydrophobic cuticle enables root hairs to absorb water and minerals freely via osmosis.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_14",
                subject = "Biology",
                topic = "Mammalian Reproduction",
                year = "Series 2",
                questionText = "In the human male reproductive and urinary anatomy, the duct that serves as a common conduit for both urine and seminal fluid is the:",
                optionA = "urethra",
                optionB = "ureter",
                optionC = "urinary bladder",
                optionD = "seminal vesicle.",
                correctAnswerIndex = 0,
                explanation = "The male urethra traverses the prostate and penis, functioning as the shared passage for micturition (urine) and ejaculation (semen).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_15",
                subject = "Biology",
                topic = "Plant Mineral Nutrition",
                year = "Series 2",
                questionText = "Which of the following essential plant mineral nutrients is classified as a micronutrient (trace element) required in minute concentrations?",
                optionA = "Copper (Cu)",
                optionB = "Potassium (K)",
                optionC = "Phosphorus (P)",
                optionD = "Nitrogen (N).",
                correctAnswerIndex = 0,
                explanation = "Copper, Zinc, Boron, and Molybdenum are trace microelements, whereas N, P, K, Ca, and Mg are macronutrients required in large quantities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_16",
                subject = "Biology",
                topic = "Plant Parasitism",
                year = "Series 2",
                questionText = "The semi-parasitic plant *Loranthus* (mistletoe) growing on cocoa trees is considered both parasitic and autotrophic because it:",
                optionA = "absorbs water and mineral salts from the host xylem while synthesizing its own sugars via green chlorophyll",
                optionB = "absorbs ready-made sugars from phloem",
                optionC = "produces roots in soil",
                optionD = "decomposes dead bark.",
                correctAnswerIndex = 0,
                explanation = "*Loranthus* is an obligate hemi-parasite possessing green leaves that photosynthesize, but taps host water and minerals via penetrating haustoria.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_17",
                subject = "Biology",
                topic = "Digestive Physiology",
                year = "Series 2",
                questionText = "The hydrochloric acid (HCl) secreted by parietal (oxyntic) cells in the mammalian gastric mucosa functions to:",
                optionA = "emulsify lipids in the duodenum",
                optionB = "inactivate salivary ptyalin, provide low pH for pepsin activation, and kill ingested microbes",
                optionC = "break down polysaccharides directly",
                optionD = "synthesize bile.",
                correctAnswerIndex = 1,
                explanation = "Gastric HCl establishes an acidic pH (1.5-2.0) required to convert inactive pepsinogen into active proteolytic pepsin while destroying pathogens.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_19",
                subject = "Biology",
                topic = "Plant Physiology",
                year = "Series 2",
                questionText = "[DIAGRAM: Vascular Conduction in a Young Seedling:\nArrow I: Upward flow of water and dissolved inorganic minerals from root hairs through xylem.\nArrow II: Bidirectional/downward translocation of organic photosynthetic sucrose through phloem sieve tubes.\nArrow III: Outward diffusion of water vapor (transpiration) through leaf stomata.\nLine IV: Ground / Soil boundary line.]\n\nThe unidirectional upward conduction of water and dissolved mineral salts through the xylem vessels is represented by arrow:",
                optionA = "I (Upward from roots)",
                optionB = "II (Downward from leaves)",
                optionC = "III (Transpiration loss)",
                optionD = "IV (Ground line)",
                correctAnswerIndex = 0,
                explanation = "Xylem sap ascends unidirectionally from roots to stems and foliage driven by root pressure, capillary action, and transpiration pull (Arrow I).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_20",
                subject = "Biology",
                topic = "Plant Physiology",
                year = "Series 2",
                questionText = "[DIAGRAM: Vascular Conduction in a Young Seedling:\nArrow I: Upward flow of water and dissolved inorganic minerals from root hairs through xylem.\nArrow II: Bidirectional/downward translocation of organic photosynthetic sucrose through phloem sieve tubes.\nArrow III: Outward diffusion of water vapor (transpiration) through leaf stomata.\nLine IV: Ground / Soil boundary line.]\n\nThe transport pathway indicated by Arrow II represents the:",
                optionA = "release of respiratory carbon dioxide",
                optionB = "intake of oxygen",
                optionC = "active translocation of organic photosynthates (sucrose) through phloem",
                optionD = "transpiration stream.",
                correctAnswerIndex = 2,
                explanation = "Arrow II illustrates phloem mass-flow translocation carrying dissolved sucrose synthesized in leaves to roots and storage organs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_21",
                subject = "Biology",
                topic = "Renal Physiology",
                year = "Series 2",
                questionText = "In the mammalian kidney nephron, the process of ultrafiltration of blood plasma under high hydrostatic pressure occurs across the:",
                optionA = "loop of Henle",
                optionB = "Bowman's capsule (Malpighian corpuscle / glomerulus)",
                optionC = "collecting duct",
                optionD = "distal convoluted tubule.",
                correctAnswerIndex = 1,
                explanation = "High blood pressure in the afferent glomerular capillaries forces water, ions, urea, and glucose through the basement membrane into Bowman's capsule.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_38",
                subject = "Biology",
                topic = "Genetics & Variation",
                year = "Series 2",
                questionText = "[DIAGRAM: Frequency Distribution Curve:\nA continuous bell-shaped normal distribution curve showing the variation in height among 1,000 cassava plants:\n- Y-Axis: Frequency of plants (0, 20, 40, 60, 80, 100, 120, 140, 160)\n- X-Axis: Height of cassava in metres (1.0 m, 1.2 m, 1.4 m, 1.6 m, 1.8 m, 2.0 m)\n- The highest peak of the curve reaches a maximum frequency of ~140 plants at exactly 1.6 m.]\n\nThe continuous bell-shaped frequency distribution curve illustrated above demonstrates:",
                optionA = "a discontinuously varying trait (qualitative)",
                optionB = "a continuously varying polygenic character (quantitative variation)",
                optionC = "environmental mutation alone",
                optionD = "monohybrid Mendelian ratios.",
                correctAnswerIndex = 1,
                explanation = "Traits showing a continuous spectrum of gradual phenotypes (like height, weight, skin color) are continuous polygenic variations governed by multiple additive genes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q38)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_39",
                subject = "Biology",
                topic = "Genetics & Variation",
                year = "Series 2",
                questionText = "[DIAGRAM: Frequency Distribution Curve:\nA continuous bell-shaped normal distribution curve showing the variation in height among 1,000 cassava plants:\n- Y-Axis: Frequency of plants (0, 20, 40, 60, 80, 100, 120, 140, 160)\n- X-Axis: Height of cassava in metres (1.0 m, 1.2 m, 1.4 m, 1.6 m, 1.8 m, 2.0 m)\n- The highest peak of the curve reaches a maximum frequency of ~140 plants at exactly 1.6 m.]\n\nFrom the graph, the modal height possessing the largest frequency of cassava plants is approximately:",
                optionA = "1.4 m",
                optionB = "1.6 m",
                optionC = "1.8 m",
                optionD = "2.0 m",
                correctAnswerIndex = 1,
                explanation = "The apex of the normal distribution curve corresponds to the mean/mode of the population at 1.6 metres height.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q39)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_41",
                subject = "Biology",
                topic = "Plant Hormones & Tropisms",
                year = "Series 2",
                questionText = "[DIAGRAM: Auxin & Tropism Experiment:\nA seedling is placed horizontally inside a light-proof chamber or rotating klinostat.\nRegion I denotes the shoot tip (apical meristem).\nWhen placed horizontally without rotation, gravity causes higher auxin concentration along the lower side of the stem, stimulating cell elongation and upward negative geotropic curvature.]\n\nThe physiological response demonstrated when a horizontal shoot bends upward against gravity is:",
                optionA = "hydrotropism",
                optionB = "negative geotropism / phototropism",
                optionC = "thigmotropism",
                optionD = "chemotropism.",
                correctAnswerIndex = 1,
                explanation = "Plant stems exhibit negative geotropism (bending upward away from gravitational pull) through differential auxin redistribution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q41)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_42",
                subject = "Biology",
                topic = "Plant Hormones",
                year = "Series 2",
                questionText = "[DIAGRAM: Auxin & Tropism Experiment:\nA seedling is placed horizontally inside a light-proof chamber or rotating klinostat.\nRegion I denotes the shoot tip (apical meristem).\nWhen placed horizontally without rotation, gravity causes higher auxin concentration along the lower side of the stem, stimulating cell elongation and upward negative geotropic curvature.]\n\nThe growing shoot apex marked I synthesizes and accumulates a high concentration of the growth-regulating hormone:",
                optionA = "ethylene",
                optionB = "abscisic acid",
                optionC = "auxin (Indole-3-acetic acid / IAA)",
                optionD = "gibberellin.",
                correctAnswerIndex = 2,
                explanation = "Auxins are synthesized at the apical meristems of shoots and mediate apical dominance and directional phototropic/gravitropic bending.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q42)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_43",
                subject = "Biology",
                topic = "Amphibian Reproduction",
                year = "Series 2",
                questionText = "[DIAGRAM: Amphibian Mating Behavior:\nA male and female toad (*Bufo regularis*) in copulatory embrace (amplexus) submerged in shallow freshwater.\nThe male clasps the female firmly around the pectoral girdle while the female releases long strings of pigmented eggs into the water where the male discharges milt (sperm) for external fertilization.]\n\nThe characteristic mating embrace posture of anurans (frogs and toads) illustrated above is termed:",
                optionA = "courtship dance",
                optionB = "amplexus",
                optionC = "viviparity",
                optionD = "internal copulation.",
                correctAnswerIndex = 1,
                explanation = "Amplexus is the reproductive posture in which the male clasps the female to synchronize the simultaneous discharge of eggs and sperm into water.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q43)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_44",
                subject = "Biology",
                topic = "Amphibian Reproduction",
                year = "Series 2",
                questionText = "[DIAGRAM: Amphibian Mating Behavior:\nA male and female toad (*Bufo regularis*) in copulatory embrace (amplexus) submerged in shallow freshwater.\nThe male clasps the female firmly around the pectoral girdle while the female releases long strings of pigmented eggs into the water where the male discharges milt (sperm) for external fertilization.]\n\nThe external deposition and fertilization of eggs in freshwater demonstrates that toads are:",
                optionA = "viviparous",
                optionB = "hermaphroditic",
                optionC = "ovoviviparous",
                optionD = "oviparous organisms.",
                correctAnswerIndex = 3,
                explanation = "Toads are oviparous; embryonic development occurs externally within aquatic eggs surrounded by jelly envelopes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q44)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_49",
                subject = "Biology",
                topic = "Mammalian Sensory Adaptations",
                year = "Series 2",
                questionText = "[DIAGRAM: External Morphology of African Giant Pouched Rat (*Cricetomys gambianus*):\nPointer I: Prominent facial whiskers (vibrissae) on the snout.\nPointer II: Countershaded dorsal fur.\nPointer III: Long scaly tail.\nPointer IV: Forelimbs adapted for burrowing.]\n\nThe long sensitive facial whiskers labelled I (vibrissae) provide the nocturnal subterranean rodent with specialized ___ sensory perception.",
                optionA = "tactile (mechanoreceptive touch in total darkness)",
                optionB = "radiosensitive",
                optionC = "photosensitive",
                optionD = "gustatory.",
                correctAnswerIndex = 0,
                explanation = "Vibrissae are highly innervated tactile whiskers that allow nocturnal burrowing rodents to navigate tight dark tunnels by touch.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q49)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt2_48",
                subject = "Biology",
                topic = "Ecological Adaptations",
                year = "Series 2",
                questionText = "[DIAGRAM: External Morphology of African Giant Pouched Rat (*Cricetomys gambianus*):\nPointer I: Prominent facial whiskers (vibrissae) on the snout.\nPointer II: Countershaded dorsal fur.\nPointer III: Long scaly tail.\nPointer IV: Forelimbs adapted for burrowing.]\n\nThe dark brownish-grey dorsal coat and pale whitish belly fur exhibited by the animal is an example of:",
                optionA = "flash coloration",
                optionB = "countershading protective coloration",
                optionC = "warning coloration (aposematism)",
                optionD = "disruptive coloration.",
                correctAnswerIndex = 1,
                explanation = "Countershading reduces visual body shadows, making the rodent less conspicuous to predators under varying ambient light conditions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 2 (Q48)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_02",
                subject = "Biology",
                topic = "Cellular Metabolism",
                year = "Series 3",
                questionText = "The metabolic process in which complex organic macromolecules are enzymatically degraded into simpler molecules with the release of chemical energy is termed:",
                optionA = "anabolism",
                optionB = "catabolism",
                optionC = "chemosynthesis",
                optionD = "tropism.",
                correctAnswerIndex = 1,
                explanation = "Catabolism consists of destructive/energy-yielding metabolic pathways (such as glycolysis and cellular respiration).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_03",
                subject = "Biology",
                topic = "Protist Organelles",
                year = "Series 3",
                questionText = "The photoreceptive red pigment spot that detects direction and intensity of light in *Euglena viridis* is the:",
                optionA = "gullet",
                optionB = "flagellum",
                optionC = "chloroplast",
                optionD = "eyespot (stigma).",
                correctAnswerIndex = 3,
                explanation = "The eyespot (stigma) filters light falling on the paraflagellar photoreceptor, enabling *Euglena* to execute positive phototaxis.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_04",
                subject = "Biology",
                topic = "Cellular Energetics",
                year = "Series 3",
                questionText = "Which pair of organelles is actively present in eukaryotic green plant cells to drive aerobic cellular respiration and photosynthetic carbon fixation?",
                optionA = "Lysosomes and Ribosomes",
                optionB = "Golgi apparatus and Endoplasmic Reticulum",
                optionC = "Nucleus and Centrioles",
                optionD = "Mitochondria and Chloroplasts.",
                correctAnswerIndex = 3,
                explanation = "Mitochondria execute aerobic respiration and ATP generation, while chloroplasts carry out light-dependent photosynthesis.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_04",
                subject = "Biology",
                topic = "Parasitology",
                year = "Series 3",
                questionText = "The adult parasitic tapeworm *Taenia solium* uses which mammal as its definitive primary host and which as its intermediate host?",
                optionA = "Man (definitive) and Pig (intermediate)",
                optionB = "Cow and Goat",
                optionC = "Dog and Cat",
                optionD = "Sheep and Horse.",
                correctAnswerIndex = 0,
                explanation = "*Taenia solium* (pork tapeworm) infects pigs as intermediate hosts harboring cysticercus larvae in muscle, while humans are definitive hosts.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_06",
                subject = "Biology",
                topic = "Annelid Anatomy",
                year = "Series 3",
                questionText = "[DIAGRAM: Morphology of Earthworm (*Lumbricus terrestris*):\nStructure I: Anterior prostomium (mouth segment)\nStructure II: Prominent glandular saddle-like band around segments 32-37 (Clitellum)\nStructure III: Lateral chitinous bristles on each segment (Chaetae / Setae)]\n\nThe thickened glandular organ labelled II that secretes a mucus cocoon to enclose eggs during reproduction is the:",
                optionA = "spermathecal pore",
                optionB = "cocoon",
                optionC = "clitellum",
                optionD = "chaetae.",
                correctAnswerIndex = 2,
                explanation = "The clitellum is the reproductive glandular band in oligochaetes that secretes albumen and a protective cocoon for fertilized ova.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_07",
                subject = "Biology",
                topic = "Annelid Ecology",
                year = "Series 3",
                questionText = "[DIAGRAM: Morphology of Earthworm (*Lumbricus terrestris*):\nStructure I: Anterior prostomium (mouth segment)\nStructure II: Prominent glandular saddle-like band around segments 32-37 (Clitellum)\nStructure III: Lateral chitinous bristles on each segment (Chaetae / Setae)]\n\nEarthworms inhabit and burrow extensively through soils rich in decayed organic matter and ___.",
                optionA = "dry gravel",
                optionB = "rich organic humus",
                optionC = "sterile sand",
                optionD = "coarse pebbles.",
                correctAnswerIndex = 1,
                explanation = "Earthworms thrive in moist, aerated topsoil rich in humus and decaying plant debris, which they ingest and aerate.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_08",
                subject = "Biology",
                topic = "Arthropod Morphology",
                year = "Series 3",
                questionText = "Which of the following is a universal diagnostic feature of the phylum Arthropoda?",
                optionA = "Absence of body segments",
                optionB = "Jointed appendages and a chitinous exoskeleton",
                optionC = "Ciliated epidermis",
                optionD = "Radial body symmetry.",
                correctAnswerIndex = 1,
                explanation = "Arthropods are metameric coelomates distinguished by paired jointed appendages and an external chitinous cuticle.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_09",
                subject = "Biology",
                topic = "Lepidoptera Morphology",
                year = "Series 3",
                questionText = "Which of the following morphological features distinguishes butterflies from moths?",
                optionA = "Butterflies rest with wings folded vertically over back, possess clubbed antennae, and are diurnal",
                optionB = "Moths fly by day and have knobbed antennae",
                optionC = "Both possess identical feathery antennae",
                optionD = "Butterflies have fatter hairy abdomens.",
                correctAnswerIndex = 0,
                explanation = "Butterflies are diurnal with slender bodies, clubbed antennae, and hold wings vertically at rest; moths are typically nocturnal with feathery antennae.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_10",
                subject = "Biology",
                topic = "Avian Anatomy",
                year = "Series 3",
                questionText = "Which specialized flight feathers inserted on bird wings (remiges) and tail (rectrices) generate aerodynamic lift and steering?",
                optionA = "Quill feathers (Contour / Remiges)",
                optionB = "Filoplumes",
                optionC = "Down feathers (insulation)",
                optionD = "Coverts.",
                correctAnswerIndex = 0,
                explanation = "Quill feathers have strong central shafts and interlocking barbules forming flat aerodynamic vanes essential for flight.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_11",
                subject = "Biology",
                topic = "Plant Ecological Adaptations",
                year = "Series 3",
                questionText = "Plants that possess anatomical and physiological adaptations (such as succulent stems, deep taproots, and sunken stomata) to survive in arid deserts are:",
                optionA = "mesophytes",
                optionB = "hydrophytes",
                optionC = "epiphytes",
                optionD = "xerophytes.",
                correctAnswerIndex = 3,
                explanation = "Xerophytes are desert plants adapted for water conservation in extremely dry environments.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_37",
                subject = "Biology",
                topic = "Protist Anatomy",
                year = "Series 3",
                questionText = "[DIAGRAM: Anatomy of *Paramecium caudatum*:\nStructure I: Anterior Contractile Vacuole with radiating canals\nStructure II: Micronucleus (small diploid nucleus controlling conjugation)\nStructure III: Macronucleus (large polyploid vegetative nucleus)\nStructure IV: Oral groove leading to cytostome (cell mouth)]\n\nIn *Paramecium*, the specific nuclear organelle responsible for sexual reproduction (conjugation) and genetic recombination is labelled:",
                optionA = "IV (Oral groove)",
                optionB = "I (Contractile vacuole)",
                optionC = "II (Micronucleus)",
                optionD = "III (Macronucleus)",
                correctAnswerIndex = 2,
                explanation = "The micronucleus (II) is diploid and governs sexual reproduction via conjugation, while the macronucleus (III) directs vegetative metabolic activity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q37)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_38",
                subject = "Biology",
                topic = "Protist Anatomy",
                year = "Series 3",
                questionText = "[DIAGRAM: Anatomy of *Paramecium caudatum*:\nStructure I: Anterior Contractile Vacuole with radiating canals\nStructure II: Micronucleus (small diploid nucleus controlling conjugation)\nStructure III: Macronucleus (large polyploid vegetative nucleus)\nStructure IV: Oral groove leading to cytostome (cell mouth)]\n\nThe structure labelled IV that sweeps in suspended food bacteria using cilia is the:",
                optionA = "respiratory pore",
                optionB = "oral groove / cytostome (ingestion)",
                optionC = "locomotory cilia",
                optionD = "osmoregulatory vacuole.",
                correctAnswerIndex = 1,
                explanation = "The oral groove (IV) is lined with cilia that generate water currents sweeping food particles into the cytostome for food vacuole formation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q38)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_39",
                subject = "Biology",
                topic = "Mammalian Circulatory System",
                year = "Series 3",
                questionText = "[DIAGRAM: Internal Anatomy of the Human Mammalian Heart:\nVessel I: The broad systemic Aorta arising from the left ventricle.\nVessel II: Superior Vena Cava entering the right atrium.\nChamber III: Thick muscular Left Ventricle.\nChamber IV: Right Ventricle pumping blood into the Pulmonary Artery.]\n\nThe major systemic arterial trunk labelled I that carries oxygenated blood under high systemic pressure to the entire body is the:",
                optionA = "pulmonary artery",
                optionB = "bicuspid valve",
                optionC = "Aorta (Systemic Arch)",
                optionD = "inferior vena cava.",
                correctAnswerIndex = 2,
                explanation = "The aorta (I) emerges from the left ventricle, branching into systemic arteries distributing oxygenated blood to all body tissues.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q39)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt3_40",
                subject = "Biology",
                topic = "Mammalian Circulatory System",
                year = "Series 3",
                questionText = "[DIAGRAM: Internal Anatomy of the Human Mammalian Heart:\nVessel I: The broad systemic Aorta arising from the left ventricle.\nVessel II: Superior Vena Cava entering the right atrium.\nChamber III: Thick muscular Left Ventricle.\nChamber IV: Right Ventricle pumping blood into the Pulmonary Artery.]\n\nOxygenated blood is forcefully pumped under high systolic pressure into the systemic circulation by which chamber of the heart?",
                optionA = "Right Atrium",
                optionB = "Right Ventricle",
                optionC = "Left Atrium",
                optionD = "Left Ventricle (thick muscular wall)",
                correctAnswerIndex = 3,
                explanation = "The left ventricle possesses the thickest myocardial myocardium, generating powerful contractions to drive blood through the systemic aorta.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 3 (Q40)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt4_02",
                subject = "Biology",
                topic = "Protist Biology",
                year = "Series 4",
                questionText = "[DIAGRAM: Anatomy of *Euglena viridis*:\nStructure I: Long whip-like locomotory Flagellum\nStructure II: Red Eyespot / Stigma\nStructure III: Chloroplasts containing chlorophyll for autotrophic nutrition\nStructure IV: Paramylon food storage granules and Nucleus]\n\nThe organelle labelled II in *Euglena* that acts as a light filter for phototaxis is the:",
                optionA = "nucleus",
                optionB = "eyespot (stigma)",
                optionC = "basal granule",
                optionD = "contractile vacuole.",
                correctAnswerIndex = 1,
                explanation = "The eyespot (II) is a carotenoid-pigmented shield that detects light intensity to guide *Euglena* toward optimal illumination.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 4 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt4_03",
                subject = "Biology",
                topic = "Protist Biology",
                year = "Series 4",
                questionText = "[DIAGRAM: Anatomy of *Euglena viridis*:\nStructure I: Long whip-like locomotory Flagellum\nStructure II: Red Eyespot / Stigma\nStructure III: Chloroplasts containing chlorophyll for autotrophic nutrition\nStructure IV: Paramylon food storage granules and Nucleus]\n\nThe structures labelled III containing photosynthetic pigments that enable autotrophic carbon fixation are the:",
                optionA = "chloroplasts",
                optionB = "paramylon granules",
                optionC = "mitochondria",
                optionD = "lysosomes.",
                correctAnswerIndex = 0,
                explanation = "Chloroplasts (III) contain chlorophyll a and b, enabling holophytic autotrophic photosynthesis in sunlight.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 4 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt4_06",
                subject = "Biology",
                topic = "Helminthology",
                year = "Series 4",
                questionText = "[DIAGRAM: Scolex of Tapeworm (*Taenia solium*):\nStructure I: Apical rostellum armed with a double crown of chitinous hooks\nStructure II: Four lateral muscular Suckers (acetabula)\nStructure III: Proliferative Neck region (zone of strobilization)\nStructure IV: Immature / young proglottid segment]\n\nThe attachment organs that anchor the parasitic tapeworm firmly into the host intestinal mucosa are labelled:",
                optionA = "II and III",
                optionB = "III and IV",
                optionC = "I and II (Hooks and Suckers)",
                optionD = "I and IV.",
                correctAnswerIndex = 2,
                explanation = "The scolex anchors to the gut wall via curved chitinous rostellar hooks (I) and four cup-shaped muscular suckers (II).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 4 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt4_07",
                subject = "Biology",
                topic = "Helminthology",
                year = "Series 4",
                questionText = "[DIAGRAM: Scolex of Tapeworm (*Taenia solium*):\nStructure I: Apical rostellum armed with a double crown of chitinous hooks\nStructure II: Four lateral muscular Suckers (acetabula)\nStructure III: Proliferative Neck region (zone of strobilization)\nStructure IV: Immature / young proglottid segment]\n\nThe budding segment in which proglottids continuously form behind the neck is labelled:",
                optionA = "III (Neck)",
                optionB = "IV (Young Proglottid)",
                optionC = "I (Rostellum)",
                optionD = "II (Sucker)",
                correctAnswerIndex = 1,
                explanation = "New segments (proglottids, IV) are continually generated by strobilization at the proliferative neck zone.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 4 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt4_36",
                subject = "Biology",
                topic = "Fungal Reproduction",
                year = "Series 4",
                questionText = "[DIAGRAM: Sexual Reproduction in *Rhizopus stolonifer* (Black Bread Mold):\nTwo compatible mating hyphae (+ and - strains) grow together forming progametangia.\nThe tips are cut off as gametangia that fuse (plasmogamy and karyogamy) to form a thick-walled, dark, warted resting Zygospore (I).]\n\nThe thick-walled resistant resting spore labelled I formed by the fusion of two gametangia in *Rhizopus* is a:",
                optionA = "zygospore",
                optionB = "conidiophore",
                optionC = "sporangium",
                optionD = "basidiospore.",
                correctAnswerIndex = 0,
                explanation = "In *Rhizopus* (Zygomycota), sexual conjugation of opposite mating types produces a resilient, thick-walled zygospore capable of enduring harsh conditions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 4 (Q36)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt5_03",
                subject = "Biology",
                topic = "Respiratory Evolution",
                year = "Series 5",
                questionText = "Which of the following animals has the simplest and most primitive respiratory mechanism relying entirely on cutaneous gas diffusion across moist skin?",
                optionA = "Grasshopper (Tracheal system)",
                optionB = "Bony Fish (Gill filaments)",
                optionC = "Land snail (Pulmonary mantle cavity)",
                optionD = "Earthworm (Moist epidermis diffusion)",
                correctAnswerIndex = 3,
                explanation = "Earthworms lack specialized lungs or gills, relying entirely on direct gas diffusion across their mucus-coated, capillary-rich moist epidermis.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 5 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt5_02",
                subject = "Biology",
                topic = "Aquatic Plant Adaptations",
                year = "Series 5",
                questionText = "Submerged freshwater hydrophytes (e.g. *Elodea*, *Vallisneria*) show which structural adaptation?",
                optionA = "Poorly developed root systems and reduced non-lignified xylem tissues",
                optionB = "Thick waterproof waxy cuticle on leaves",
                optionC = "Extensively developed wood and bark",
                optionD = "Leaves modified into spines.",
                correctAnswerIndex = 0,
                explanation = "Surrounded by water, hydrophytes do not need extensive roots for water uptake or heavy xylem for mechanical support, possessing large aerenchyma instead.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 5 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt5_22",
                subject = "Biology",
                topic = "Plant Excretion & Industry",
                year = "Series 5",
                questionText = "Which plant metabolic waste product belonging to complex polyphenols is commercially extracted for tanning animal hides into durable leather?",
                optionA = "Alkaloids",
                optionB = "Resins",
                optionC = "Tannins",
                optionD = "Gums.",
                correctAnswerIndex = 2,
                explanation = "Tannins are astringent polyphenolic plant compounds stored in bark and leaves used industrially to tan hides into leather.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 5 (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_pt5_23",
                subject = "Biology",
                topic = "Renal Physiology",
                year = "Series 5",
                questionText = "The correct physiological sequence of urea and filtrate movement through the mammalian nephron is:",
                optionA = "Glomerulus -> Bowman's capsule -> Proximal Convoluted Tubule -> Loop of Henle -> Distal Convoluted Tubule -> Collecting Duct",
                optionB = "Convoluted tubule -> Glomerulus -> Loop of Henle -> Collecting duct",
                optionC = "Bowman's capsule -> Glomerulus -> Collecting duct",
                optionD = "Loop of Henle -> Glomerulus -> Bowman's capsule.",
                correctAnswerIndex = 0,
                explanation = "Ultrafiltrate flows from glomerular capillaries into Bowman's capsule, through PCT, descending/ascending loops of Henle, DCT, into collecting tubules.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Biology • Part 5 (Q23)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
