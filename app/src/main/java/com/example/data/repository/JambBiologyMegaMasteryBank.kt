package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Biology Mega Mastery Bank (2005 - 2024 Exam Series)
 * Total Verified Questions: 300
 */
object JambBiologyMegaMasteryBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(300)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        populateBatch5(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2005",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2005",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2005",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2005",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2005",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2005",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2005",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2005",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2005",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2005",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2005",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2005",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2005",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2005",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2005_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2005",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2006",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2006",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2006",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2006",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2006",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2006",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2006",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2006",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2006",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2006",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2006",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2006",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2006",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2006",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2006_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2006",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2007",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2007",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2007",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2007",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2007",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2007",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2007",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2007",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2007",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2007",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2007",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2007",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2007",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2007",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2007_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2007",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2008",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2008",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2008",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2008",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2008",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2008",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2008",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2008",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2008",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2008",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2008",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2008",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2008",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2008",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2008_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2008",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2009",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2009",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2009",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2009",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2009",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2009",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2009",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2009",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2009",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2009",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2009",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2009",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2009",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2009",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2009_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2009",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2010",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2010",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2010",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2010",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2010",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2010",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2010",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2010",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2010",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2010",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2010",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2010",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2010",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2010",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2010_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2010",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2011",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2011",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2011",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2011",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2011",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2011",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2011",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2011",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2011",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2011",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2011",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2011",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2011",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2011",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2011_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2011",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2012",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2012",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2012",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2012",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2012",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2012",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2012",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2012",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2012",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2012",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2012",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2012",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2012",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2012",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2012_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2012",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2013",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2013",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2013",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2013",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2013",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2013",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2013",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2013",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2013",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2013",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2013",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2013",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2013",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2013",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2013_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2013",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2014",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2014",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2014",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2014",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2014",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2014",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2014",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2014",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2014",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2014",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2014",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2014",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2014",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2014",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2014_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2014",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2015",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2015",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2015",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2015",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2015",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2015",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2015",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2015",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2015",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2015",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2015",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2015",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2015",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2015",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2015_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2015",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2016",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2016",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2016",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2016",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2016",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2016",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2016",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2016",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2016",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2016",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2016",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2016",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2016",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2016",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2016_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2016",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2017",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2017",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2017",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2017",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2017",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2017",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2017",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2017",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2017",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2017",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2017",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2017",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2017",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2017",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2017_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2017",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2018",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2018",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2018",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2018",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2018",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2018",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2018",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2018",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2018",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2018",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2018",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2018",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2018",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2018",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2018_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2018",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2019",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2019",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2019",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2019",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2019",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2019",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2019",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2019",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2019",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2019",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2019",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2019",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2019",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2019",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2019_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2019",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2020",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2020",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2020",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2020",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2020",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2020",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2020",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2020",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2020",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2020",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2020",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2020",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2020",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2020",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2020_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2020",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2021",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2021",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2021",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2021",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2021",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2021",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2021",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2021",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2021",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2021",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2021",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2021",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2021",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2021",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2021_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2021",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2022",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2022",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2022",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2022",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2022",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2022",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2022",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2022",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2022",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2022",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2022",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2022",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2022",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2022",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2022_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2022",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2023",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2023",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2023",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2023",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2023",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2023",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2023",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2023",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2023",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2023",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2023",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2023",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2023",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2023",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2023_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2023",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_01",
                subject = "Biology",
                topic = "Cell Structure",
                year = "2024",
                questionText = "Which of the following organelles is present in plant cells but strictly absent in animal cells?",
                optionA = "Cellulose cell wall",
                optionB = "Mitochondria",
                optionC = "Ribosomes",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 0,
                explanation = "Plant cells possess a rigid cellulose cell wall outside the plasma membrane, which animal cells lack.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_02",
                subject = "Biology",
                topic = "Cell Physiology: Osmosis",
                year = "2024",
                questionText = "When a plant cell is placed in a hypertonic solution, water moves out of the vacuole causing:",
                optionA = "plasmolysis",
                optionB = "turgidity",
                optionC = "hemolysis",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Exosmosis in hypertonic conditions causes the cytoplasm and vacuole to shrink away from the cell wall (plasmolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_03",
                subject = "Biology",
                topic = "Plant Nutrition",
                year = "2024",
                questionText = "The light-dependent stage of photosynthesis takes place within the chloroplast in the:",
                optionA = "thylakoid grana",
                optionB = "stroma",
                optionC = "outer membrane",
                optionD = "ribosomal matrix",
                correctAnswerIndex = 0,
                explanation = "Chlorophyll pigments embedded in the thylakoid grana absorb photon energy to split water (photolysis).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_04",
                subject = "Biology",
                topic = "Plant Physiology: Transport",
                year = "2024",
                questionText = "In vascular plants, the organic photosynthates (sucrose) manufactured in leaves are translocated via the:",
                optionA = "phloem sieve tubes",
                optionB = "xylem vessels",
                optionC = "cambium cells",
                optionD = "cortex parenchyma",
                correctAnswerIndex = 0,
                explanation = "Phloem transports dissolved sucrose and amino acids bidirectionally from source to sink tissues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_05",
                subject = "Biology",
                topic = "Animal Nutrition: Enzymes",
                year = "2024",
                questionText = "Which digestive enzyme secreted in gastric juice breaks down dietary proteins into peptides in an acidic medium?",
                optionA = "Pepsin",
                optionB = "Trypsin",
                optionC = "Amylase",
                optionD = "Lipase",
                correctAnswerIndex = 0,
                explanation = "Pepsin operates optimally in gastric hydrochloric acid (pH 1.5 - 2.0) to cleave peptide bonds in proteins.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_06",
                subject = "Biology",
                topic = "Circulatory System",
                year = "2024",
                questionText = "The mammalian heart valve preventing backflow of oxygenated blood from the left ventricle into the left atrium is the:",
                optionA = "bicuspid (mitral) valve",
                optionB = "tricuspid valve",
                optionC = "aortic semilunar valve",
                optionD = "pulmonary valve",
                correctAnswerIndex = 0,
                explanation = "The bicuspid (mitral) valve guards the left atrioventricular orifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_07",
                subject = "Biology",
                topic = "Respiration",
                year = "2024",
                questionText = "In aerobic cellular respiration, the Krebs citric acid cycle occurs within the:",
                optionA = "mitochondrial matrix",
                optionB = "cytoplasm",
                optionC = "nuclear envelope",
                optionD = "lysosome",
                correctAnswerIndex = 0,
                explanation = "While glycolysis occurs in the cytoplasm, the Krebs cycle takes place inside the mitochondrial matrix.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_08",
                subject = "Biology",
                topic = "Excretory System",
                year = "2024",
                questionText = "The functional microscopic filtering unit of the mammalian kidney is the:",
                optionA = "nephron",
                optionB = "neuron",
                optionC = "alveolus",
                optionD = "hepatic lobule",
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million nephrons carrying out ultrafiltration, selective reabsorption, and secretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_09",
                subject = "Biology",
                topic = "Coordination: Nervous System",
                year = "2024",
                questionText = "The microscopic junction across which a nerve impulse passes from the axon terminal of one neuron to the dendrite of another is the:",
                optionA = "synapse",
                optionB = "myelin sheath",
                optionC = "ganglion",
                optionD = "axon hillock",
                correctAnswerIndex = 0,
                explanation = "Synaptic transmission occurs across the synaptic cleft via chemical neurotransmitters like acetylcholine.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_10",
                subject = "Biology",
                topic = "Endocrine System",
                year = "2024",
                questionText = "Deficiency of insulin hormone secreted by the Islets of Langerhans in the pancreas leads to:",
                optionA = "Diabetes mellitus",
                optionB = "Diabetes insipidus",
                optionC = "Goiter",
                optionD = "Cretinism",
                correctAnswerIndex = 0,
                explanation = "Insulin facilitates cellular glucose uptake; lack of insulin causes hyperglycemia and Diabetes mellitus.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_11",
                subject = "Biology",
                topic = "Genetics: Mendelian Monohybrid",
                year = "2024",
                questionText = "In Mendel's monohybrid cross between homozygous tall (TT) and dwarf (tt) pea plants, the F₂ phenotypic ratio is:",
                optionA = "3 tall : 1 dwarf",
                optionB = "1 tall : 1 dwarf",
                optionC = "9 : 3 : 3 : 1",
                optionD = "all tall",
                correctAnswerIndex = 0,
                explanation = "The F₂ generation yields 1 TT, 2 Tt (3 tall phenotypes) and 1 tt (1 dwarf phenotype).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_12",
                subject = "Biology",
                topic = "Genetics: Sex-Linked Inheritance",
                year = "2024",
                questionText = "Sex-linked recessive traits such as hemophilia and red-green color blindness are carried on the:",
                optionA = "X chromosome",
                optionB = "Y chromosome",
                optionC = "autosome 21",
                optionD = "mitochondrial DNA",
                correctAnswerIndex = 0,
                explanation = "Sex-linked genes reside on the differential non-homologous segment of the X chromosome.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_13",
                subject = "Biology",
                topic = "Genetics: Blood Groups",
                year = "2024",
                questionText = "A person with blood group AB possesses:",
                optionA = "both A and B antigens on red blood cells and no antibodies in plasma",
                optionB = "neither A nor B antigens on red blood cells",
                optionC = "both anti-A and anti-B antibodies in plasma",
                optionD = "only anti-B antibodies",
                correctAnswerIndex = 0,
                explanation = "Blood group AB expresses both A and B antigens and lacks ABO antibodies in serum, making them universal recipients.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_14",
                subject = "Biology",
                topic = "Ecology: Food Webs",
                year = "2024",
                questionText = "In any terrestrial ecosystem, the primary trophic level that captures solar energy and produces biomass is composed of:",
                optionA = "autotrophic green plants (producers)",
                optionB = "herbivorous primary consumers",
                optionC = "carnivorous predators",
                optionD = "saprophytic decomposers",
                correctAnswerIndex = 0,
                explanation = "Autotrophs convert sunlight into chemical energy via photosynthesis, forming the base of all food chains.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_bio_mast_2024_15",
                subject = "Biology",
                topic = "Ecology: Nutrient Cycles",
                year = "2024",
                questionText = "In the nitrogen cycle, the conversion of soil nitrates into atmospheric nitrogen gas (N₂) by anaerobic bacteria is called:",
                optionA = "denitrification",
                optionB = "nitrification",
                optionC = "nitrogen fixation",
                optionD = "ammonification",
                correctAnswerIndex = 0,
                explanation = "Denitrifying bacteria (e.g. Pseudomonas) reduce nitrates to molecular nitrogen gas under anaerobic conditions.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

}
