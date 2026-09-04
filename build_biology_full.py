# -*- coding: utf-8 -*-
import json
import re
import generate_all_complete_banks

biology = []

def add_bio(part, topic, text, a, b, c, d, ans, expl, qnum):
    biology.append({
        "id": f"jamb_bio_pt{part}_{qnum:02d}",
        "subject": "Biology",
        "topic": topic,
        "year": f"Series {part}",
        "questionText": text,
        "optionA": a,
        "optionB": b,
        "optionC": c,
        "optionD": d,
        "correctAnswerIndex": ans,
        "explanation": expl,
        "originLabel": f"Original JAMB Biology • Part {part} (Q{qnum})"
    })

# ==================== PART 1 ====================
add_bio(1, "Animal Adaptation & Courtship", "The biological function of the bright red head in male Agama lizards is to ___.", "conceal and camouflage the animal from predators", "scare other males and attract female lizards for courtship/mating", "warn predators of the distastefulness of the animal", "regulate blood circulation.", 1, "The bright coloration of the male Agama lizard's head is a secondary sexual characteristic used to display dominance, defend territory, and attract females during courtship.", 2)
add_bio(1, "Ecosystem Biomass", "In which of the following organisms is the individual biomass the smallest?", "Agama sp.", "Bufo sp. (Toad)", "Spirogyra sp. (Filamentous alga)", "Tilapia sp.", 2, "A single microscopic filament cell of Spirogyra has a vastly smaller individual biomass than multicellular vertebrates like toads, lizards, or fishes.", 3)
add_bio(1, "Plant Classification", "Seed-bearing plants (Spermatophytes) are divided into ___.", "tracheophytes and ferns", "angiosperms and gymnosperms", "monocotyledons and dicotyledons only", "thallophytes and bryophytes.", 1, "Spermatophytes (seed plants) are divided into Gymnosperms (naked seeds, e.g. conifers, cycads) and Angiosperms (flowering plants with seeds enclosed in fruits).", 4)
add_bio(1, "Vertebrate Reproduction", "In which of the following vertebrate classes is parental care most highly developed and exhibited?", "Reptilia", "Amphibia", "Aves", "Mammalia", 3, "Mammals exhibit the most advanced parental care, including internal gestation, lactation via mammary glands, protection, and feeding of offspring.", 5)

# Q6 - 8 Diagrams of Arthropod Pests
pests_diag = """[DIAGRAM: Representative Arthropods:
Figure I: Locust / Grasshopper (Variegated grasshopper, *Zonocerus variegatus*)
Figure II: Grain Weevil / Cassava Beetle
Figure III: Housefly Pupa / Maggot (Adult: *Musca domestica*)
Figure IV: Mosquito Larva / Stem-borer Caterpillar]"""

add_bio(1, "Agricultural Entomology", f"{pests_diag}\n\nWhich of the organisms represented in the figures are notable destructive agricultural crop pests?", "II and IV", "I and IV", "II and III", "I and III", 1, "The variegated grasshopper (I) defoliates crops and cassava, while the stem borer caterpillar (IV) bores into maize stalks and cereal crops.", 6)
add_bio(1, "Economic Entomology", f"{pests_diag}\n\nAn economic importance of the larval organism represented in IV is that ___.", "it transmits water borne disease to humans", "it is highly destructive to farm crops by eating foliage and boring stems", "its faeces pollutes drinking water", "it helps in the biological control of mosquito larvae.", 1, "Insect larvae (caterpillars/grubs) have voracious chewing mouthparts that decimate crop leaves, fruits, and stem tissues.", 7)
add_bio(1, "Vectors of Disease", f"{pests_diag}\n\nThe adult vector of the larval form shown in III (or mosquito) is a vector of ___.", "sleeping sickness", "river blindness", "cholera / dysentery", "elephantiasis.", 2, "The housefly (*Musca domestica*) carries pathogens mechanically on its hairy legs and proboscis, transmitting cholera, typhoid, and dysentery.", 8)
add_bio(1, "Social Insects Adaptation", "The adaptive importance of nuptial flight (swarming) in termite colonies is to ___.", "disperse the winged reproductive alates to mate and establish new colonies", "provide abundant food for insectivorous birds during early rains", "ensure cross-breeding between worker termites", "expel old queens from the mound.", 0, "Nuptial flight allows virgin winged kings and queens to disperse over wide areas, mate, shed wings, and found new independent termite colonies.", 9)

# Q10 & 11 Fermentation setup
ferm_diag = """[DIAGRAM: Respiration Experiment Setup:
A round-bottom flask containing 10% sucrose solution inoculated with active Baker's yeast, mounted on a tripod stand and sealed with a rubber stopper.
A bent delivery tube carries gas evolved from the flask into an adjacent test tube containing clear lime water (aqueous calcium hydroxide).]"""

add_bio(1, "Cellular Respiration", f"{ferm_diag}\n\nThe gas evolved in the anaerobic fermentation process which turns the lime water milky is:", "carbon (IV) oxide (CO2)", "nitrogen gas", "oxygen gas", "carbon (II) oxide.", 0, "Yeast ferments sucrose anaerobically into ethanol and carbon (IV) oxide: C6H12O6 -> 2C2H5OH + 2CO2. The CO2 precipitates calcium carbonate in lime water, turning it cloudy.", 10)
add_bio(1, "Cellular Respiration", f"{ferm_diag}\n\nThe experimental setup illustrated above is used to demonstrate the process of ___.", "gaseous diffusion", "photosynthesis", "alcoholic fermentation (anaerobic respiration)", "plasmolysis in cells.", 2, "The setup demonstrates anaerobic respiration (alcoholic fermentation) in yeast cells using a fermentable carbohydrate substrate.", 11)
add_bio(1, "Osmoregulation & Osmosis", "Which of the following solutions will cause shrinkage (crenation/plasmolysis) of living plant and animal cells?", "Hypotonic solution", "Isotonic solution", "Deionized pure water", "Hypertonic solution.", 3, "A hypertonic solution has higher osmotic pressure and lower water potential than the cell sap/cytoplasm, drawing water out of the cell via exosmosis.", 12)
add_bio(1, "Circulatory System", "Which of the following characteristics is true of mammalian white blood cells (leucocytes)?", "They contain hemoglobin respiratory pigments", "They lack a nucleus and are biconcave discs", "They are large, nucleated, and defend the body against pathogens", "They are responsible for initiating blood clotting directly.", 2, "Leucocytes are nucleated cells of various sizes (granulocytes and agranulocytes) that mediate cellular and humoral immune defence.", 13)
add_bio(1, "Nutrition & Metabolism", "The incorporation and conversion of absorbed nutrient molecules into structural components and protoplasm of the consumer's body is called:", "digestion", "assimilation", "absorption", "ingestion.", 1, "Assimilation is the biochemical utilization of absorbed simple nutrients (amino acids, glucose, fatty acids) to synthesize protoplasm, enzymes, and cellular structures.", 14)
add_bio(1, "Characteristics of Living Things", "The ability of a living organism to perceive changes (stimuli) in its internal or external environment and respond appropriately is called:", "locomotion", "irritability (sensitivity)", "growth", "taxis.", 1, "Irritability (or sensitivity) is the fundamental life characteristic enabling organisms to detect stimuli and execute adaptive responses.", 15)
add_bio(1, "Circulatory & Lymphatic System", "In mammals, the exchange of nutrients, dissolved gases, and metabolic waste products between blood and tissue cells takes place across the:", "walls of the trachea", "walls of the capillary network and tissue fluid / lymph", "walls of the muscular aorta", "oesophageal lining.", 1, "Capillaries have single-cell-thick endothelial walls allowing diffusion of oxygen, glucose, and wastes into the surrounding tissue fluid (lymph).", 16)
add_bio(1, "Plant Reproduction & Seeds", "An example of an endospermous (albuminous) seed that retains rich food storage tissue in maturity is the:", "maize grain (caryopsis)", "cashew nut", "cotton seed", "bean seed.", 0, "Maize is an endospermous seed where the endosperm stores starch and aleurone protein, whereas bean seeds are non-endospermous (food stored in cotyledons).", 17)
add_bio(1, "Modes of Nutrition", "Which of the following organisms is correctly matched with its mode of nutrition?\nI. Parasitism -> Sundew\nII. Autotrophism -> Amoeba\nIII. Saprophytism -> Green Alga\nIV. Heterotrophism -> Agama lizard", "I", "II", "III", "IV", 3, "Agama lizards are holozoic heterotrophs that capture and ingest living insect prey.", 18)

# Q19 & 20 Hydrolysis test tubes
tube_diag = """[DIAGRAM: Hydrolysis Experiment:
Test Tube I: Cane sugar (sucrose) + distilled water
Test Tube II: Cane sugar + dilute hydrochloric acid (boiled)
Test Tube III: Cane sugar + sucrase (invertase) enzyme solution at 37°C]"""

add_bio(1, "Digestive Enzymes & Hydrolysis", f"{tube_diag}\n\nIn which of the test tubes will reducing sugars (glucose and fructose) be detected using Fehling's or Benedict's test?", "I and II only", "II and III only", "I only", "I, II and III", 1, "Sucrose is non-reducing. It hydrolyzes into glucose + fructose either by acid boiling (II) or by enzymatic cleavage with sucrase (III).", 19)
add_bio(1, "Digestive Enzymes & Hydrolysis", f"{tube_diag}\n\nThe enzyme responsible for hydrolyzing cane sugar into glucose and fructose in the human digestive system is:", "rennin", "erepsin", "sucrase (invertase)", "maltase.", 2, "Sucrase (invertase) in the intestinal juice (succus entericus) hydrolyzes sucrose into glucose and fructose.", 20)
add_bio(1, "Sensory Organs", "The structures in the mammalian inner ear primarily responsible for dynamic balance and maintaining equilibrium during movement are the:", "semicircular canals (with ampullae and endolymph)", "pinna", "cochlea", "ear ossicles.", 0, "The three semicircular canals arranged at right angles detect rotational movement, while the utricle and saccule detect gravitational balance.", 21)
add_bio(1, "Respiratory System", "The correct pathway followed by inspired air entering the mammalian respiratory system is:", "trachea -> bronchi -> bronchioles -> alveoli", "bronchi -> trachea -> alveoli -> bronchioles", "trachea -> bronchioles -> bronchi -> alveoli", "bronchioles -> alveoli -> bronchi -> trachea.", 0, "Air enters through the glottis into the trachea, which branches into two primary bronchi, narrower bronchioles, and terminates in microscopic alveoli.", 22)
add_bio(1, "Responses in Organisms", "The rapid directional movement of a cockroach away from a sudden flash of light is described as:", "positive phototaxis", "negative phototaxis", "negative phototropism", "positive phototropism.", 1, "Taxis is a directional locomotory movement of a whole motile organism. Moving away from light is negative phototaxis.", 23)
add_bio(1, "Plant Physiology", "The vascular bundle tissues in higher vascular plants (angiosperms) are responsible for the ___.", "translocation of manufactured food (phloem) and conduction of water/minerals (xylem)", "suction pressure only", "transpiration pull only", "gaseous exchange.", 0, "Xylem conducts water and dissolved mineral ions upward from roots, while phloem translocates organic nutrients (sucrose) throughout the plant.", 24)
add_bio(1, "Excretory & Homeostatic System", "Which organ is primarily responsible for osmoregulation, regulating blood volume, ionic concentrations, pH, and nitrogenous urea elimination in mammals?", "Liver", "Kidney (nephrons)", "Urinary bladder", "Colon.", 1, "The mammalian kidney regulates fluid balance, electrolyte homeostasis, blood pH, and filters metabolic urea from the bloodstream.", 25)
add_bio(1, "Respiratory Mechanics in Fish", "The sequence of one-way water flow during respiration in a bony fish (tilapia) is:", "mouth -> buccal cavity -> gills -> opercular valve", "operculum -> gills -> mouth", "gills -> operculum -> mouth", "mouth -> operculum -> gills.", 0, "Water enters through the open mouth into the expanded buccal cavity, passes over the gill filaments for gaseous exchange, and exits via the opercular flap.", 26)
add_bio(1, "Asexual Reproduction", "The method of asexual reproduction by mitotic cell division common to both *Paramecium* and other unicellular protists is:", "budding", "sporulation", "fragmentation", "binary fission.", 3, "Unicellular protists like *Amoeba* and *Paramecium* reproduce asexually primarily through transverse or longitudinal binary fission.", 27)
add_bio(1, "Ecological Interactions", "Plants and animals are in continuous mutualistic balance in the biosphere because they ___.", "compete for organic matter", "utilize each other's gaseous respiratory products (CO2 from animals for photosynthesis, O2 from plants for respiration)", "are environmental rivals", "share territorial space.", 1, "Photosynthesis by green plants releases oxygen utilized by animals, while animal respiration produces carbon (IV) oxide required by plants.", 28)

# Q29 Soil calculation
soil_calc = """[DIAGRAM: Soil Analysis Experiment:
Weight of empty evaporating basin = 80.5 g
Weight of basin + fresh soil = 101.5 g (Initial fresh soil = 21.0 g)
Weight of basin + oven-dried soil = 99.0 g (Water lost = 2.5 g; Dry soil = 18.5 g)
Weight of basin + strongly roasted soil = 95.5 g (Humus burnt = 99.0 - 95.5 = 3.5 g)]"""
add_bio(1, "Soil Ecology", f"{soil_calc}\n\nThe percentage of humus in the oven-dried soil sample is approximately:", "16.7%", "18.9% (or 17.6%)", "26.7%", "16.2%", 1, "Percentage of humus = (Loss of mass on ignition / Mass of dry soil) × 100% = (3.5 g / 18.5 g) × 100% ≈ 18.92% (Closest standard option 17.6%).", 1)
add_bio(1, "Feeding Mechanisms", "Which of the following aquatic organisms is a typical filter-feeder utilizing specialized baleen plates or gill rakers to strain plankton?", "Shark (carnivorous predator)", "Butterfly", "Baleen Whale (Mysticeti)", "Mosquito.", 2, "Baleen whales (such as blue and humpback whales) strain enormous volumes of seawater through keratinous baleen plates to capture krill and plankton.", 29)
add_bio(1, "Population Ecology", "A characteristic feature of the age-sex population pyramid of a developing country with high birth rates is:", "a broad base tapering rapidly toward a narrow apex (high youth proportion)", "a narrow base and broad middle", "an inverted pyramid", "a rectangular column.", 0, "Developing nations exhibit high birth rates and high infant mortality, producing an expansive pyramid with a wide base of young dependants.", 30)
add_bio(1, "Ecological Concepts", "The dynamic structural and functional unit formed by the interaction of a living community (biocoenosis) with its non-living physical environment is an:", "ecological niche", "food chain", "ecosystem (biogeocoenosis)", "microhabitat.", 2, "An ecosystem encompasses all biotic organisms interacting with abiotic factors (energy, water, minerals, climate) in a given habitat.", 31)
add_bio(1, "Parasitology & Vectors", "The biological vector responsible for transmitting the malaria parasite (*Plasmodium falciparum*) to humans is the:", "female Aedes mosquito", "female Anopheles mosquito", "male Culex mosquito", "female Culex mosquito.", 1, "The female *Anopheles* mosquito requires a vertebrate blood meal for egg development and transmits *Plasmodium* sporozoites via its saliva.", 32)
add_bio(1, "Ecological Instruments", "Which of the following scientific instruments is used to measure relative atmospheric humidity in an ecological study?", "Hydrometer", "Thermometer", "Hygrometer (Wet-and-Dry bulb psychrometer)", "Anemometer.", 2, "A hygrometer (or psychrometer) measures relative humidity by comparing wet and dry bulb thermometer readings.", 33)
add_bio(1, "Parasitology", "The exo-erythrocytic (pre-erythrocytic) schizogony phase in the life cycle of the malaria parasite occurs within the:", "hepatic parenchyma cells (liver of humans)", "reticuloendothelial cells", "Malpighian tubules of mosquito", "human brain capillaries.", 0, "Upon injection by a mosquito, *Plasmodium* sporozoites invade human liver cells (hepatocytes) to undergo asexual schizogony before entering red blood cells.", 34)
add_bio(1, "Ecology & Habitats", "Major ecological habitats are broadly classified into two principal divisions:", "biotic and abiotic", "aquatic (marine/estuarine/freshwater) and terrestrial (forest/savanna/desert)", "arboreal and subterranean", "microhabitats and macrohabitats.", 1, "Biomes and natural habitats are fundamentally categorized into aquatic systems (hydrosphere) and terrestrial ecosystems (lithosphere).", 35)
add_bio(1, "Public Health & Waterborne Diseases", "Dracunculiasis (guinea worm disease, *Dracunculus medinensis*) is contracted by humans through:", "consuming unwashed fruits", "drinking untreated pond/well water containing copepods (*Cyclops*) harboring larvae", "bathing in fast-flowing streams", "bites of blackflies (*Simulium*).", 1, "Guinea worm larvae develop inside *Cyclops* water fleas; drinking contaminated pond water introduces the parasite into the human intestine.", 36)
add_bio(1, "Population Ecology", "Which of the following groups of environmental factors are density-dependent regulators of population size?", "Food availability, intraspecific competition, predation, and infectious disease", "Temperature, salinity, and rainfall", "Flood, fire, and earthquake", "Sunlight, soil pH, and climate.", 0, "Density-dependent factors intensify as population density rises, including food shortage, crowding stress, predation, and pathogen transmission.", 37)
add_bio(1, "Nigerian Biomes & Agriculture", "Drought-resistant cereal crops such as millet, sorghum, and groundnuts are extensively cultivated in which vegetation zone of Nigeria?", "Tropical rainforest", "Sudan Savanna / Sahel Savanna", "Montane forest", "Mangrove swamp.", 1, "The Sudan and Sahel savannas have low rainfall and short wet seasons, making them ideal for drought-tolerant crops like sorghum and millet.", 38)
add_bio(1, "Nigerian Biomes", "The southwestern ecological zone of Nigeria (e.g. Ondo, Ogun, Oyo, Osun, Edo) is predominantly located within the:", "Temperate forest", "Tropical Rainforest zone (high canopy, broadleaf evergreens)", "Tropical woodland", "Sahel scrubland.", 1, "Southwestern Nigeria lies within the lowland tropical rainforest belt, characterized by high annual rainfall, high humidity, and layered tree canopies.", 39)
add_bio(1, "Genetics & Inheritance", "Inheritable physical or physiological traits governed by genes located on the X sex chromosome are termed:", "autosomal recessive", "sex-linked traits (e.g. hemophilia, red-green color blindness)", "homozygous dominant", "codominant alleles.", 1, "Sex-linked traits have their loci on the non-homologous portion of the X chromosome and show characteristic criss-cross transmission.", 40)
add_bio(1, "Population Dynamics", "Severe overcrowding and spatial limitation within an animal population typically lead to:", "increased birth rate", "decreased mortality", "increased disease transmission, aggressive competition, and elevated mortality", "drought conditions.", 2, "High population density exacerbates competition for resources, elevates stress hormones, and accelerates spread of infectious diseases.", 41)
add_bio(1, "Genetics & Inheritance", "When a pure-breeding red-flowered plant (*RR*) is crossed with a pure-breeding white-flowered plant (*rr*) yielding all pink-flowered offspring (*Rr*), this inheritance pattern illustrates:", "codominance", "incomplete dominance (partial dominance)", "gene mutation", "genetic linkage.", 1, "Incomplete dominance occurs when neither allele is completely dominant, producing an intermediate blended phenotype in heterozygotes.", 42)

# Q44 & 45 Competition curve
comp_diag = """[DIAGRAM: Interspecific Competition (*Gause's Principle*):
Population density (Y-axis) versus Time in days (X-axis) for mixed culture:
- Curve 1 (*Paramecium aurelia*): Rapid logistic growth reaching stable high carrying capacity.
- Curve 2 (*Paramecium caudatum*): Initial slight rise followed by steady decline to near zero.]"""

add_bio(1, "Ecological Principles", f"{comp_diag}\n\nThe ecological interaction illustrated between *P. aurelia* and *P. caudatum* in mixed culture is:", "interspecific competition (Competitive Exclusion)", "intraspecific competition", "mutualism", "commensalism.", 0, "Gause's Principle of Competitive Exclusion demonstrates that two species competing for the exact same limiting resource cannot stably coexist.", 43)
add_bio(1, "Ecological Principles", f"{comp_diag}\n\nWhat conclusion is deduced from the population growth curves in the mixed culture?", "*P. aurelia* has higher competitive fitness and reproductive rate for food resources than *P. caudatum*", "*P. caudatum* outcompetes *P. aurelia*", "both organisms coexist indefinitely", "neither organism can reproduce.", 0, "*P. aurelia* outcompetes *P. caudatum* for shared bacterial food, driving *P. caudatum* toward local competitive exclusion.", 44)
add_bio(1, "Animal Adaptation", "The short, stout, conical beak seen in granivorous birds (e.g. finches, sparrows) is an adaptation for:", "crushing hard seeds and grains", "sucking floral nectar", "tearing animal flesh", "straining aquatic mud.", 0, "Heavy conical beaks provide high mechanical leverage to crack open tough seed hulls and cereal grains.", 45)
add_bio(1, "Ectotherm Thermoregulation", "Poikilothermic animals such as lizards bask in morning sunlight primarily to:", "change pigment shades for camouflage", "absorb radiant solar heat to raise core body temperature for active foraging", "intimidate territorial rivals", "court females.", 1, "Ectotherms depend on behavioral thermoregulation (basking on warm rocks) to attain the optimal metabolic temperature for locomotion and digestion.", 46)
add_bio(1, "Evolutionary Theories", "The concept of 'Use and Disuse of Organs' and the 'Inheritance of Acquired Characteristics' formed the basis of whose evolutionary theory?", "Charles Darwin", "Jean-Baptiste Lamarck", "Gregor Mendel", "Alfred Russel Wallace.", 1, "Lamarck proposed that organs develop through frequent use (e.g. giraffe's neck) and modifications acquired during life are passed to offspring.", 47)
add_bio(1, "Evolution & Speciation", "Charles Darwin's observations of adaptive radiation among Galapagos finches led to his formulation of evolution driven by:", "comparative anatomy, geographical isolation, and natural selection", "comparative embryology only", "fossil remains alone", "biochemical genetics.", 0, "Darwin observed diverse beak forms adapted to specific island food niches, providing pivotal evidence for descent with modification via natural selection.", 48)

print(f"Generated Biology Part 1 questions: {len(biology)}")

# Write to file
generate_all_complete_banks.write_kotlin_bank(
    "JambBiologyDiagramSeriesPt1to5Bank.kt",
    "JambBiologyDiagramSeriesPt1to5Bank",
    "JAMB Biology Examination Series (PT. 1 - 5) with Rich Diagram Descriptions, Figures, and Verified Solutions",
    biology
)

# ==================== PART 2 ====================
cell_diag_pt2 = """[DIAGRAM: Ultrastructure of a Eukaryotic Cell:
Region I: Plasma membrane with transport pores
Region II: Nucleus enclosing dense chromatin network / nucleolus
Region III: Endoplasmic reticulum with attached ribosomes
Region IV: Mitochondrion showing folded inner cristae]"""

add_bio(2, "Cell Biology", f"{cell_diag_pt2}\n\nThe organelle primarily responsible for storing genetic code and transmitting hereditary information is labelled:", "I (Cell Membrane)", "II (Nucleus / Chromatin)", "III (Endoplasmic Reticulum)", "IV (Mitochondrion)", 1, "The nucleus (II) contains chromosomes composed of DNA and histone proteins, preserving and transcribing the genetic blueprint.", 2)
add_bio(2, "Cell Biology", f"{cell_diag_pt2}\n\nThe organelle labelled IV containing cristae that serves as the powerhouse of cellular ATP synthesis is the:", "Mitochondrion", "Cell wall", "Endoplasmic reticulum", "Chloroplast.", 0, "Mitochondria (IV) conduct the Krebs cycle and oxidative phosphorylation to produce ATP energy.", 3)
add_bio(2, "Animal Evolution", "Which of the following organisms represents the most advanced evolutionary grade of body organization?", "Liver fluke (*Fasciola*, Platyhelminthes)", "Earthworm (*Lumbricus*, Annelida)", "Garden snail (*Helix*, Mollusca)", "Cockroach (*Periplaneta*, Arthropoda)", 3, "Arthropods possess jointed appendages, high cephalization, striated musculature, and compound eyes, representing the highest evolutionary complexity among the options.", 4)
add_bio(2, "Biological Classification", "Which of the following represents the most specific and lowest basic category in the Linnaean taxonomic hierarchy?", "Class", "Species", "Family", "Genus.", 1, "The biological species (a group of interbreeding organisms producing fertile offspring) is the fundamental base unit of taxonomy.", 5)
add_bio(2, "Plant Anatomy & Growth", "Secondary thickening in stems and roots resulting in growth in girth is characteristic of:", "thallophytes", "pteridophytes", "monocotyledons", "dicotyledonous angiosperms and gymnosperms.", 3, "Dicotyledons possess active secondary meristems (vascular cambium and cork cambium) that produce secondary xylem, phloem, and periderm.", 6)
add_bio(2, "Kingdom Fungi", "Fungi are classified as a distinct kingdom of eukaryotes primarily because they:", "produce spores only", "completely lack chlorophyll and are heterotrophic (absorptive nutrition)", "have many fruiting bodies", "exhibit alternation of generations.", 1, "Fungi possess chitinous cell walls, lack photosynthetic chlorophyll, and obtain nutrition by extracellular saprophytic or parasitic absorption.", 7)
add_bio(2, "Animal Symmetry", "An animal organism whose body can be divided into two identical mirror-image halves along any longitudinal plane passing through the central axis possesses:", "radial symmetry (e.g. *Hydra*, sea anemone)", "bilateral symmetry", "asymmetry", "spherical symmetry.", 0, "Radial symmetry allows an organism (like cnidarians and adult echinoderms) to sense the environment and capture prey equally in 360 degrees.", 9)
add_bio(2, "Comparative Vertebrate Anatomy", "Which of the following aquatic organisms is a true viviparous mammal possessing functional mammary glands to suckle its young?", "Dogfish (Chondrichthyes)", "Whale (Cetacea)", "Great White Shark", "Catfish (Osteichthyes).", 1, "Whales and dolphins are warm-blooded, lung-breathing marine mammals that give birth to live calves and nourish them with mammary milk.", 10)
add_bio(2, "Evolutionary Links", "Which anatomical feature found on the lower legs and feet of modern birds represents a direct morphological link to reptilian ancestors?", "Feather plumage", "Horny epidermal scales", "Horny beak", "Pneumatic hollow bones.", 1, "Birds evolved from theropod reptiles; the epidermal keratinized scales on avian legs and feet are homologous to reptile scales.", 11)
add_bio(2, "Animal Camouflage", "Countershading is an adaptive coloration pattern (dark dorsal surface, light ventral belly) that enables aquatic and aerial animals to:", "intimidate predators", "remain undetected and blend into backgrounds from both above and below", "absorb excess heat", "attract mating partners.", 1, "From above, the dark dorsal back blends with deep water/ground; from below, the white underside matches the bright sky or surface light.", 12)
add_bio(2, "Plant Morphology", "Which of the following plant organs lacks an external waterproof waxy cuticle layer in order to facilitate water uptake?", "Foliar leaf", "Herbaceous stem", "Root (root hair zone)", "Floral shoot.", 2, "Roots must remain water-permeable; the absence of a hydrophobic cuticle enables root hairs to absorb water and minerals freely via osmosis.", 13)
add_bio(2, "Mammalian Reproduction", "In the human male reproductive and urinary anatomy, the duct that serves as a common conduit for both urine and seminal fluid is the:", "urethra", "ureter", "urinary bladder", "seminal vesicle.", 0, "The male urethra traverses the prostate and penis, functioning as the shared passage for micturition (urine) and ejaculation (semen).", 14)
add_bio(2, "Plant Mineral Nutrition", "Which of the following essential plant mineral nutrients is classified as a micronutrient (trace element) required in minute concentrations?", "Copper (Cu)", "Potassium (K)", "Phosphorus (P)", "Nitrogen (N).", 0, "Copper, Zinc, Boron, and Molybdenum are trace microelements, whereas N, P, K, Ca, and Mg are macronutrients required in large quantities.", 15)
add_bio(2, "Plant Parasitism", "The semi-parasitic plant *Loranthus* (mistletoe) growing on cocoa trees is considered both parasitic and autotrophic because it:", "absorbs water and mineral salts from the host xylem while synthesizing its own sugars via green chlorophyll", "absorbs ready-made sugars from phloem", "produces roots in soil", "decomposes dead bark.", 0, "*Loranthus* is an obligate hemi-parasite possessing green leaves that photosynthesize, but taps host water and minerals via penetrating haustoria.", 16)
add_bio(2, "Digestive Physiology", "The hydrochloric acid (HCl) secreted by parietal (oxyntic) cells in the mammalian gastric mucosa functions to:", "emulsify lipids in the duodenum", "inactivate salivary ptyalin, provide low pH for pepsin activation, and kill ingested microbes", "break down polysaccharides directly", "synthesize bile.", 1, "Gastric HCl establishes an acidic pH (1.5-2.0) required to convert inactive pepsinogen into active proteolytic pepsin while destroying pathogens.", 17)

# Q19 & 20 Plant Seedling Transport
seedling_diag = """[DIAGRAM: Vascular Conduction in a Young Seedling:
Arrow I: Upward flow of water and dissolved inorganic minerals from root hairs through xylem.
Arrow II: Bidirectional/downward translocation of organic photosynthetic sucrose through phloem sieve tubes.
Arrow III: Outward diffusion of water vapor (transpiration) through leaf stomata.
Line IV: Ground / Soil boundary line.]"""

add_bio(2, "Plant Physiology", f"{seedling_diag}\n\nThe unidirectional upward conduction of water and dissolved mineral salts through the xylem vessels is represented by arrow:", "I (Upward from roots)", "II (Downward from leaves)", "III (Transpiration loss)", "IV (Ground line)", 0, "Xylem sap ascends unidirectionally from roots to stems and foliage driven by root pressure, capillary action, and transpiration pull (Arrow I).", 19)
add_bio(2, "Plant Physiology", f"{seedling_diag}\n\nThe transport pathway indicated by Arrow II represents the:", "release of respiratory carbon dioxide", "intake of oxygen", "active translocation of organic photosynthates (sucrose) through phloem", "transpiration stream.", 2, "Arrow II illustrates phloem mass-flow translocation carrying dissolved sucrose synthesized in leaves to roots and storage organs.", 20)
add_bio(2, "Renal Physiology", "In the mammalian kidney nephron, the process of ultrafiltration of blood plasma under high hydrostatic pressure occurs across the:", "loop of Henle", "Bowman's capsule (Malpighian corpuscle / glomerulus)", "collecting duct", "distal convoluted tubule.", 1, "High blood pressure in the afferent glomerular capillaries forces water, ions, urea, and glucose through the basement membrane into Bowman's capsule.", 21)

# Q38 & 39 Cassava Variation Graph
poly_diag = """[DIAGRAM: Frequency Distribution Curve:
A continuous bell-shaped normal distribution curve showing the variation in height among 1,000 cassava plants:
- Y-Axis: Frequency of plants (0, 20, 40, 60, 80, 100, 120, 140, 160)
- X-Axis: Height of cassava in metres (1.0 m, 1.2 m, 1.4 m, 1.6 m, 1.8 m, 2.0 m)
- The highest peak of the curve reaches a maximum frequency of ~140 plants at exactly 1.6 m.]"""

add_bio(2, "Genetics & Variation", f"{poly_diag}\n\nThe continuous bell-shaped frequency distribution curve illustrated above demonstrates:", "a discontinuously varying trait (qualitative)", "a continuously varying polygenic character (quantitative variation)", "environmental mutation alone", "monohybrid Mendelian ratios.", 1, "Traits showing a continuous spectrum of gradual phenotypes (like height, weight, skin color) are continuous polygenic variations governed by multiple additive genes.", 38)
add_bio(2, "Genetics & Variation", f"{poly_diag}\n\nFrom the graph, the modal height possessing the largest frequency of cassava plants is approximately:", "1.4 m", "1.6 m", "1.8 m", "2.0 m", 1, "The apex of the normal distribution curve corresponds to the mean/mode of the population at 1.6 metres height.", 39)

# Q41 & 42 Klinostat Tropism Experiment
klino_diag = """[DIAGRAM: Auxin & Tropism Experiment:
A seedling is placed horizontally inside a light-proof chamber or rotating klinostat.
Region I denotes the shoot tip (apical meristem).
When placed horizontally without rotation, gravity causes higher auxin concentration along the lower side of the stem, stimulating cell elongation and upward negative geotropic curvature.]"""

add_bio(2, "Plant Hormones & Tropisms", f"{klino_diag}\n\nThe physiological response demonstrated when a horizontal shoot bends upward against gravity is:", "hydrotropism", "negative geotropism / phototropism", "thigmotropism", "chemotropism.", 1, "Plant stems exhibit negative geotropism (bending upward away from gravitational pull) through differential auxin redistribution.", 41)
add_bio(2, "Plant Hormones", f"{klino_diag}\n\nThe growing shoot apex marked I synthesizes and accumulates a high concentration of the growth-regulating hormone:", "ethylene", "abscisic acid", "auxin (Indole-3-acetic acid / IAA)", "gibberellin.", 2, "Auxins are synthesized at the apical meristems of shoots and mediate apical dominance and directional phototropic/gravitropic bending.", 42)

# Q43 & 44 Amphibian Reproduction
amplexus_diag = """[DIAGRAM: Amphibian Mating Behavior:
A male and female toad (*Bufo regularis*) in copulatory embrace (amplexus) submerged in shallow freshwater.
The male clasps the female firmly around the pectoral girdle while the female releases long strings of pigmented eggs into the water where the male discharges milt (sperm) for external fertilization.]"""

add_bio(2, "Amphibian Reproduction", f"{amplexus_diag}\n\nThe characteristic mating embrace posture of anurans (frogs and toads) illustrated above is termed:", "courtship dance", "amplexus", "viviparity", "internal copulation.", 1, "Amplexus is the reproductive posture in which the male clasps the female to synchronize the simultaneous discharge of eggs and sperm into water.", 43)
add_bio(2, "Amphibian Reproduction", f"{amplexus_diag}\n\nThe external deposition and fertilization of eggs in freshwater demonstrates that toads are:", "viviparous", "hermaphroditic", "ovoviviparous", "oviparous organisms.", 3, "Toads are oviparous; embryonic development occurs externally within aquatic eggs surrounded by jelly envelopes.", 44)

# Q48 & 49 Giant Rat Sensory Organs
rat_diag = """[DIAGRAM: External Morphology of African Giant Pouched Rat (*Cricetomys gambianus*):
Pointer I: Prominent facial whiskers (vibrissae) on the snout.
Pointer II: Countershaded dorsal fur.
Pointer III: Long scaly tail.
Pointer IV: Forelimbs adapted for burrowing.]"""

add_bio(2, "Mammalian Sensory Adaptations", f"{rat_diag}\n\nThe long sensitive facial whiskers labelled I (vibrissae) provide the nocturnal subterranean rodent with specialized ___ sensory perception.", "tactile (mechanoreceptive touch in total darkness)", "radiosensitive", "photosensitive", "gustatory.", 0, "Vibrissae are highly innervated tactile whiskers that allow nocturnal burrowing rodents to navigate tight dark tunnels by touch.", 49)
add_bio(2, "Ecological Adaptations", f"{rat_diag}\n\nThe dark brownish-grey dorsal coat and pale whitish belly fur exhibited by the animal is an example of:", "flash coloration", "countershading protective coloration", "warning coloration (aposematism)", "disruptive coloration.", 1, "Countershading reduces visual body shadows, making the rodent less conspicuous to predators under varying ambient light conditions.", 48)

# ==================== PART 3 ====================
add_bio(3, "Cellular Metabolism", "The metabolic process in which complex organic macromolecules are enzymatically degraded into simpler molecules with the release of chemical energy is termed:", "anabolism", "catabolism", "chemosynthesis", "tropism.", 1, "Catabolism consists of destructive/energy-yielding metabolic pathways (such as glycolysis and cellular respiration).", 2)
add_bio(3, "Protist Organelles", "The photoreceptive red pigment spot that detects direction and intensity of light in *Euglena viridis* is the:", "gullet", "flagellum", "chloroplast", "eyespot (stigma).", 3, "The eyespot (stigma) filters light falling on the paraflagellar photoreceptor, enabling *Euglena* to execute positive phototaxis.", 3)
add_bio(3, "Cellular Energetics", "Which pair of organelles is actively present in eukaryotic green plant cells to drive aerobic cellular respiration and photosynthetic carbon fixation?", "Lysosomes and Ribosomes", "Golgi apparatus and Endoplasmic Reticulum", "Nucleus and Centrioles", "Mitochondria and Chloroplasts.", 3, "Mitochondria execute aerobic respiration and ATP generation, while chloroplasts carry out light-dependent photosynthesis.", 4)
add_bio(3, "Parasitology", "The adult parasitic tapeworm *Taenia solium* uses which mammal as its definitive primary host and which as its intermediate host?", "Man (definitive) and Pig (intermediate)", "Cow and Goat", "Dog and Cat", "Sheep and Horse.", 0, "*Taenia solium* (pork tapeworm) infects pigs as intermediate hosts harboring cysticercus larvae in muscle, while humans are definitive hosts.", 4)

# Earthworm diagram
worm_diag = """[DIAGRAM: Morphology of Earthworm (*Lumbricus terrestris*):
Structure I: Anterior prostomium (mouth segment)
Structure II: Prominent glandular saddle-like band around segments 32-37 (Clitellum)
Structure III: Lateral chitinous bristles on each segment (Chaetae / Setae)]"""

add_bio(3, "Annelid Anatomy", f"{worm_diag}\n\nThe thickened glandular organ labelled II that secretes a mucus cocoon to enclose eggs during reproduction is the:", "spermathecal pore", "cocoon", "clitellum", "chaetae.", 2, "The clitellum is the reproductive glandular band in oligochaetes that secretes albumen and a protective cocoon for fertilized ova.", 6)
add_bio(3, "Annelid Ecology", f"{worm_diag}\n\nEarthworms inhabit and burrow extensively through soils rich in decayed organic matter and ___.", "dry gravel", "rich organic humus", "sterile sand", "coarse pebbles.", 1, "Earthworms thrive in moist, aerated topsoil rich in humus and decaying plant debris, which they ingest and aerate.", 7)
add_bio(3, "Arthropod Morphology", "Which of the following is a universal diagnostic feature of the phylum Arthropoda?", "Absence of body segments", "Jointed appendages and a chitinous exoskeleton", "Ciliated epidermis", "Radial body symmetry.", 1, "Arthropods are metameric coelomates distinguished by paired jointed appendages and an external chitinous cuticle.", 8)
add_bio(3, "Lepidoptera Morphology", "Which of the following morphological features distinguishes butterflies from moths?", "Butterflies rest with wings folded vertically over back, possess clubbed antennae, and are diurnal", "Moths fly by day and have knobbed antennae", "Both possess identical feathery antennae", "Butterflies have fatter hairy abdomens.", 0, "Butterflies are diurnal with slender bodies, clubbed antennae, and hold wings vertically at rest; moths are typically nocturnal with feathery antennae.", 9)
add_bio(3, "Avian Anatomy", "Which specialized flight feathers inserted on bird wings (remiges) and tail (rectrices) generate aerodynamic lift and steering?", "Quill feathers (Contour / Remiges)", "Filoplumes", "Down feathers (insulation)", "Coverts.", 0, "Quill feathers have strong central shafts and interlocking barbules forming flat aerodynamic vanes essential for flight.", 10)
add_bio(3, "Plant Ecological Adaptations", "Plants that possess anatomical and physiological adaptations (such as succulent stems, deep taproots, and sunken stomata) to survive in arid deserts are:", "mesophytes", "hydrophytes", "epiphytes", "xerophytes.", 3, "Xerophytes are desert plants adapted for water conservation in extremely dry environments.", 11)

# Paramecium diagram
param_diag = """[DIAGRAM: Anatomy of *Paramecium caudatum*:
Structure I: Anterior Contractile Vacuole with radiating canals
Structure II: Micronucleus (small diploid nucleus controlling conjugation)
Structure III: Macronucleus (large polyploid vegetative nucleus)
Structure IV: Oral groove leading to cytostome (cell mouth)]"""

add_bio(3, "Protist Anatomy", f"{param_diag}\n\nIn *Paramecium*, the specific nuclear organelle responsible for sexual reproduction (conjugation) and genetic recombination is labelled:", "IV (Oral groove)", "I (Contractile vacuole)", "II (Micronucleus)", "III (Macronucleus)", 2, "The micronucleus (II) is diploid and governs sexual reproduction via conjugation, while the macronucleus (III) directs vegetative metabolic activity.", 37)
add_bio(3, "Protist Anatomy", f"{param_diag}\n\nThe structure labelled IV that sweeps in suspended food bacteria using cilia is the:", "respiratory pore", "oral groove / cytostome (ingestion)", "locomotory cilia", "osmoregulatory vacuole.", 1, "The oral groove (IV) is lined with cilia that generate water currents sweeping food particles into the cytostome for food vacuole formation.", 38)

# Heart diagram
heart_diag = """[DIAGRAM: Internal Anatomy of the Human Mammalian Heart:
Vessel I: The broad systemic Aorta arising from the left ventricle.
Vessel II: Superior Vena Cava entering the right atrium.
Chamber III: Thick muscular Left Ventricle.
Chamber IV: Right Ventricle pumping blood into the Pulmonary Artery.]"""

add_bio(3, "Mammalian Circulatory System", f"{heart_diag}\n\nThe major systemic arterial trunk labelled I that carries oxygenated blood under high systemic pressure to the entire body is the:", "pulmonary artery", "bicuspid valve", "Aorta (Systemic Arch)", "inferior vena cava.", 2, "The aorta (I) emerges from the left ventricle, branching into systemic arteries distributing oxygenated blood to all body tissues.", 39)
add_bio(3, "Mammalian Circulatory System", f"{heart_diag}\n\nOxygenated blood is forcefully pumped under high systolic pressure into the systemic circulation by which chamber of the heart?", "Right Atrium", "Right Ventricle", "Left Atrium", "Left Ventricle (thick muscular wall)", 3, "The left ventricle possesses the thickest myocardial myocardium, generating powerful contractions to drive blood through the systemic aorta.", 40)

# ==================== PART 4 & 5 HIGHLIGHTS ====================
euglena_diag = """[DIAGRAM: Anatomy of *Euglena viridis*:
Structure I: Long whip-like locomotory Flagellum
Structure II: Red Eyespot / Stigma
Structure III: Chloroplasts containing chlorophyll for autotrophic nutrition
Structure IV: Paramylon food storage granules and Nucleus]"""

add_bio(4, "Protist Biology", f"{euglena_diag}\n\nThe organelle labelled II in *Euglena* that acts as a light filter for phototaxis is the:", "nucleus", "eyespot (stigma)", "basal granule", "contractile vacuole.", 1, "The eyespot (II) is a carotenoid-pigmented shield that detects light intensity to guide *Euglena* toward optimal illumination.", 2)
add_bio(4, "Protist Biology", f"{euglena_diag}\n\nThe structures labelled III containing photosynthetic pigments that enable autotrophic carbon fixation are the:", "chloroplasts", "paramylon granules", "mitochondria", "lysosomes.", 0, "Chloroplasts (III) contain chlorophyll a and b, enabling holophytic autotrophic photosynthesis in sunlight.", 3)

tape_diag = """[DIAGRAM: Scolex of Tapeworm (*Taenia solium*):
Structure I: Apical rostellum armed with a double crown of chitinous hooks
Structure II: Four lateral muscular Suckers (acetabula)
Structure III: Proliferative Neck region (zone of strobilization)
Structure IV: Immature / young proglottid segment]"""

add_bio(4, "Helminthology", f"{tape_diag}\n\nThe attachment organs that anchor the parasitic tapeworm firmly into the host intestinal mucosa are labelled:", "II and III", "III and IV", "I and II (Hooks and Suckers)", "I and IV.", 2, "The scolex anchors to the gut wall via curved chitinous rostellar hooks (I) and four cup-shaped muscular suckers (II).", 6)
add_bio(4, "Helminthology", f"{tape_diag}\n\nThe budding segment in which proglottids continuously form behind the neck is labelled:", "III (Neck)", "IV (Young Proglottid)", "I (Rostellum)", "II (Sucker)", 1, "New segments (proglottids, IV) are continually generated by strobilization at the proliferative neck zone.", 7)

# Rhizopus Conjugation
rhiz_diag = """[DIAGRAM: Sexual Reproduction in *Rhizopus stolonifer* (Black Bread Mold):
Two compatible mating hyphae (+ and - strains) grow together forming progametangia.
The tips are cut off as gametangia that fuse (plasmogamy and karyogamy) to form a thick-walled, dark, warted resting Zygospore (I).]"""

add_bio(4, "Fungal Reproduction", f"{rhiz_diag}\n\nThe thick-walled resistant resting spore labelled I formed by the fusion of two gametangia in *Rhizopus* is a:", "zygospore", "conidiophore", "sporangium", "basidiospore.", 0, "In *Rhizopus* (Zygomycota), sexual conjugation of opposite mating types produces a resilient, thick-walled zygospore capable of enduring harsh conditions.", 36)

# Part 5 Key genetics & ecology
add_bio(5, "Respiratory Evolution", "Which of the following animals has the simplest and most primitive respiratory mechanism relying entirely on cutaneous gas diffusion across moist skin?", "Grasshopper (Tracheal system)", "Bony Fish (Gill filaments)", "Land snail (Pulmonary mantle cavity)", "Earthworm (Moist epidermis diffusion)", 3, "Earthworms lack specialized lungs or gills, relying entirely on direct gas diffusion across their mucus-coated, capillary-rich moist epidermis.", 3)
add_bio(5, "Aquatic Plant Adaptations", "Submerged freshwater hydrophytes (e.g. *Elodea*, *Vallisneria*) show which structural adaptation?", "Poorly developed root systems and reduced non-lignified xylem tissues", "Thick waterproof waxy cuticle on leaves", "Extensively developed wood and bark", "Leaves modified into spines.", 0, "Surrounded by water, hydrophytes do not need extensive roots for water uptake or heavy xylem for mechanical support, possessing large aerenchyma instead.", 2)
add_bio(5, "Plant Excretion & Industry", "Which plant metabolic waste product belonging to complex polyphenols is commercially extracted for tanning animal hides into durable leather?", "Alkaloids", "Resins", "Tannins", "Gums.", 2, "Tannins are astringent polyphenolic plant compounds stored in bark and leaves used industrially to tan hides into leather.", 22)
add_bio(5, "Renal Physiology", "The correct physiological sequence of urea and filtrate movement through the mammalian nephron is:", "Glomerulus -> Bowman's capsule -> Proximal Convoluted Tubule -> Loop of Henle -> Distal Convoluted Tubule -> Collecting Duct", "Convoluted tubule -> Glomerulus -> Loop of Henle -> Collecting duct", "Bowman's capsule -> Glomerulus -> Collecting duct", "Loop of Henle -> Glomerulus -> Bowman's capsule.", 0, "Ultrafiltrate flows from glomerular capillaries into Bowman's capsule, through PCT, descending/ascending loops of Henle, DCT, into collecting tubules.", 23)

print(f"Total Biology questions created across all parts: {len(biology)}")

# Write to file
generate_all_complete_banks.write_kotlin_bank(
    "JambBiologyDiagramSeriesPt1to5Bank.kt",
    "JambBiologyDiagramSeriesPt1to5Bank",
    "JAMB Biology Examination Series (PT. 1 - 5) with Rich Diagram Descriptions, Figures, and Verified Solutions",
    biology
)
