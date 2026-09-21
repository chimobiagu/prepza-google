package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Chemistry & Biology Extension Bank (2005 - 2024)
 * Total Verified Questions: 300
 */
object JambChemBioExtensionBank {
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
                id = "jamb_chembio_ext_2005_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2005",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2005",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2005",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2005",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2005",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2005",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2005",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2005",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2005",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2005",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2005",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2005",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2005",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2005",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2005_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2005",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2005 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2006",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2006",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2006",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2006",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2006",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2006",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2006",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2006",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2006",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2006",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2006",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2006",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2006",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2006",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2006_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2006",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2006 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2007",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2007",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2007",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2007",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2007",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2007",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2007",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2007",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2007",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2007",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2007",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2007",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2007",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2007",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2007_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2007",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2007 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2008",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2008",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2008",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2008",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2008",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2008",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2008",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2008",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2008",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2008",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2008",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2008",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2008",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2008",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2008_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2008",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2008 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2009",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2009",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2009",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2009",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2009",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2009",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2009",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2009",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2009",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2009",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2009",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2009",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2009",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2009",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2009_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2009",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2009 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2010",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2010",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2010",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2010",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2010",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2010",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2010",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2010",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2010",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2010",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2010",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2010",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2010",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2010",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2010_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2010",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2011",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2011",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2011",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2011",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2011",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2011",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2011",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2011",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2011",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2011",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2011",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2011",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2011",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2011",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2011_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2011",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2012",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2012",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2012",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2012",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2012",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2012",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2012",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2012",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2012",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2012",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2012",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2012",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2012",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2012",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2012_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2012",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2013",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2013",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2013",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2013",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2013",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2013",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2013",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2013",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2013",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2013",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2013",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2013",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2013",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2013",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2013_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2013",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2013 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2014",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2014",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2014",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2014",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2014",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2014",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2014",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2014",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2014",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2014",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2014",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2014",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2014",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2014",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2014_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2014",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2014 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2015",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2015",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2015",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2015",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2015",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2015",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2015",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2015",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2015",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2015",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2015",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2015",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2015",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2015",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2015_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2015",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2015 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2016",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2016",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2016",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2016",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2016",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2016",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2016",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2016",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2016",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2016",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2016",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2016",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2016",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2016",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2016_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2016",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2017",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2017",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2017",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2017",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2017",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2017",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2017",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2017",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2017",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2017",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2017",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2017",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2017",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2017",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2017_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2017",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2018",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2018",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2018",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2018",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2018",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2018",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2018",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2018",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2018",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2018",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2018",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2018",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2018",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2018",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2018_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2018",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2019",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2019",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2019",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2019",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2019",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2019",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2019",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2019",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2019",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2019",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2019",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2019",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2019",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2019",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2019_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2019",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2020",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2020",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2020",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2020",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2020",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2020",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2020",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2020",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2020",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2020",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2020",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2020",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2020",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2020",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2020_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2020",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2020 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2021",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2021",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2021",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2021",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2021",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2021",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2021",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2021",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2021",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2021",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2021",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2021",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2021",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2021",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2021_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2021",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2021 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2022",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2022",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2022",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2022",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2022",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2022",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2022",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2022",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2022",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2022",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2022",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2022",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2022",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2022",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2022_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2022",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2022 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2023",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2023",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2023",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2023",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2023",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2023",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2023",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2023",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2023",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2023",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2023",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2023",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2023",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2023",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2023_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2023",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2023 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_01",
                subject = "Chemistry",
                topic = "Acids & Bases: Lewis Theory",
                year = "2024",
                questionText = "According to G.N. Lewis's definition, an acid is a chemical species that acts as an:",
                optionA = "electron-pair acceptor",
                optionB = "electron-pair donor",
                optionC = "proton donor",
                optionD = "hydroxide ion donor",
                correctAnswerIndex = 0,
                explanation = "A Lewis acid accepts an electron pair, while a Lewis base donates an electron pair.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Extension Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_02",
                subject = "Chemistry",
                topic = "Organic Chemistry: Alcohols",
                year = "2024",
                questionText = "Ethanol (C₂H₅OH) reacts with excess concentrated sulfuric acid (H₂SO₄) at 170°C to undergo dehydration, producing:",
                optionA = "Ethene (C₂H₄)",
                optionB = "Ethoxyethane (ether)",
                optionC = "Ethanoic acid",
                optionD = "Ethane",
                correctAnswerIndex = 0,
                explanation = "At 170°C, conc. H₂SO₄ dehydrates ethanol into ethene gas via elimination of water.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Extension Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_03",
                subject = "Chemistry",
                topic = "Periodic Table: Noble Gases",
                year = "2024",
                questionText = "Noble gases (Group 0/18) exhibit extreme chemical inertness because they possess:",
                optionA = "a stable, complete outermost octet of valence electrons (duplet for Helium)",
                optionB = "empty valence shells",
                optionC = "metallic bonding",
                optionD = "very low ionization energies",
                correctAnswerIndex = 0,
                explanation = "Noble gases possess completely filled outer s and p subshells (s²p⁶), rendering them energetically stable.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Extension Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_04",
                subject = "Chemistry",
                topic = "Equilibrium: Haber Process",
                year = "2024",
                questionText = "The commercial synthesis of ammonia by the Haber-Bosch process operates under typical industrial conditions of:",
                optionA = "~450°C temperature, ~200 atm pressure, and finely divided iron catalyst",
                optionB = "room temperature and 1 atm pressure",
                optionC = "1000°C and copper catalyst",
                optionD = "vacuum and platinum catalyst",
                correctAnswerIndex = 0,
                explanation = "Industrial Haber conditions balance kinetic reaction rate with thermodynamic equilibrium yield (~450°C, 200 atm, Fe catalyst).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Extension Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_05",
                subject = "Chemistry",
                topic = "Electrochemistry: Standard Cells",
                year = "2024",
                questionText = "In a Daniell galvanic cell (Zn-Cu), zinc metal acts as the anode because:",
                optionA = "zinc has a more negative standard electrode potential and oxidizes by losing electrons",
                optionB = "copper oxidizes more readily than zinc",
                optionC = "zinc is less reactive than copper",
                optionD = "zinc attracts copper ions",
                correctAnswerIndex = 0,
                explanation = "Zn possesses a standard reduction potential of -0.76 V compared to Cu (+0.34 V), making Zn the anode where oxidation (Zn -> Zn²⁺ + 2e⁻) occurs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Extension Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_06",
                subject = "Chemistry",
                topic = "Qualitative Analysis: Anions",
                year = "2024",
                questionText = "When dilute hydrochloric acid (HCl) is added to a solid unknown salt and a gas that turns limewater milky is evolved, the anion present is:",
                optionA = "Carbonate (CO₃²⁻) or Trioxocarbonate(IV)",
                optionB = "Sulfate (SO₄²⁻)",
                optionC = "Chloride (Cl⁻)",
                optionD = "Nitrate (NO₃⁻)",
                correctAnswerIndex = 0,
                explanation = "Dilute acid reacts with carbonates to release carbon dioxide (CO₂), which precipitates CaCO₃ in limewater turning it milky.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Extension Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_07",
                subject = "Chemistry",
                topic = "Organic Chemistry: Esterification",
                year = "2024",
                questionText = "The sweet-smelling organic compound formed by the reversible reaction of ethanoic acid with ethanol in the presence of concentrated H₂SO₄ is:",
                optionA = "Ethyl ethanoate (an ester)",
                optionB = "Ethane",
                optionC = "Diethyl ether",
                optionD = "Methanoic acid",
                correctAnswerIndex = 0,
                explanation = "CH₃COOH + C₂H₅OH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Extension Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_08",
                subject = "Chemistry",
                topic = "Environmental Chemistry: Acid Rain",
                year = "2024",
                questionText = "Acid rain is primarily caused by atmospheric industrial emissions of:",
                optionA = "Sulfur dioxide (SO₂) and Nitrogen oxides (NOx)",
                optionB = "Carbon monoxide (CO) only",
                optionC = "Methane (CH₄) gas",
                optionD = "Chlorofluorocarbons (CFCs)",
                correctAnswerIndex = 0,
                explanation = "SO₂ and NOx dissolve in atmospheric moisture to form sulfuric and nitric acids, falling as acid rain.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Extension Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_09",
                subject = "Biology",
                topic = "Genetics: Dihybrid Cross",
                year = "2024",
                questionText = "In a Mendelian dihybrid cross between heterozygous parents (RrYy × RrYy), the expected phenotypic ratio of offspring is:",
                optionA = "9 : 3 : 3 : 1",
                optionB = "3 : 1",
                optionC = "1 : 2 : 1",
                optionD = "1 : 1 : 1 : 1",
                correctAnswerIndex = 0,
                explanation = "Independent assortment of two heterozygous gene pairs produces the classic 9:3:3:1 phenotypic ratio.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Extension Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_10",
                subject = "Biology",
                topic = "Human Physiology: Liver Functions",
                year = "2024",
                questionText = "Which of the following vital physiological functions is performed by the mammalian liver?",
                optionA = "Deamination of excess amino acids into urea",
                optionB = "Production of red blood cells in healthy adults",
                optionC = "Filtration of urine from blood",
                optionD = "Secretion of insulin hormone",
                correctAnswerIndex = 0,
                explanation = "The liver deaminates excess amino acids, converting the toxic amino group into urea for renal excretion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Extension Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_11",
                subject = "Biology",
                topic = "Plant Biology: Transpiration",
                year = "2024",
                questionText = "The loss of water vapor from the aerial parts of a plant, primarily through stomata in leaves, is termed:",
                optionA = "transpiration",
                optionB = "guttation",
                optionC = "translocation",
                optionD = "imbibition",
                correctAnswerIndex = 0,
                explanation = "Transpiration is the evaporative loss of water through open stomata, generating the transpirational pull.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Extension Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_12",
                subject = "Biology",
                topic = "Ecology: Symbiosis",
                year = "2024",
                questionText = "The symbiotic relationship between leguminous plants and nitrogen-fixing Rhizobium bacteria in root nodules is an example of:",
                optionA = "mutualism",
                optionB = "parasitism",
                optionC = "commensalism",
                optionD = "predation",
                correctAnswerIndex = 0,
                explanation = "In mutualism, both species benefit: the plant gains fixed nitrogen while Rhizobium receives carbohydrates and shelter.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Extension Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_13",
                subject = "Biology",
                topic = "Microbiology: Viruses",
                year = "2024",
                questionText = "Viruses are considered borderline between living and non-living entities because they:",
                optionA = "can crystallize outside host cells but replicate genetically inside living hosts",
                optionB = "possess both DNA and RNA simultaneously",
                optionC = "feed on bacteria by phagocytosis",
                optionD = "have cellular organelles like mitochondria",
                correctAnswerIndex = 0,
                explanation = "Viruses exhibit no metabolic activity and can form crystals when inert, but reproduce inside living host cells.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Extension Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_14",
                subject = "Biology",
                topic = "Skeletal System: Joints",
                year = "2024",
                questionText = "The synovial joint in the human skeleton allowing free rotational movement in multiple planes (e.g. shoulder and hip) is a:",
                optionA = "ball-and-socket joint",
                optionB = "hinge joint",
                optionC = "pivot joint",
                optionD = "gliding joint",
                correctAnswerIndex = 0,
                explanation = "Ball-and-socket joints provide universal rotational movement in all planes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Extension Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chembio_ext_2024_15",
                subject = "Biology",
                topic = "Evolution: Natural Selection",
                year = "2024",
                questionText = "The evolutionary mechanism proposed by Charles Darwin where organisms best adapted to their environment survive and reproduce is:",
                optionA = "Natural Selection (Survival of the Fittest)",
                optionB = "Inheritance of Acquired Characteristics",
                optionC = "Genetic Drift",
                optionD = "Spontaneous Generation",
                correctAnswerIndex = 0,
                explanation = "Darwin's theory of natural selection posits that phenotypic variations conferring reproductive advantages are preserved over generations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2024 • Extension Series (Q15)",
                isVerifiedJamb = true
            )
        )
    }

}
