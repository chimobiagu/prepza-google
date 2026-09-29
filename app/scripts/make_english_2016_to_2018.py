# coding=utf-8
import sys, os
sys.path.insert(0, "app/scripts")
from generate_all_english_banks import write_bank_file

# =========================================================================
# 2016 USE OF ENGLISH (60 Questions - JAMB CBT Official Spec)
# =========================================================================
e2016 = [
    # 1 - 5: Comprehension: African Moralist vs Economist
    ("jamb_eng_2016_01", "English Language", "Comprehension: Moralist vs Economist", "2016", 
     "According to the passage, the primary divergence between the traditional African moralist and the modern economist lies in:",
     "The moralist's emphasis on communal welfare and human dignity versus the economist's focus on material growth and efficiency",
     "The economist's total rejection of moral principles in trade",
     "The moralist's insistence on barter trade rather than monetary currency",
     "The government's bias towards economic models over cultural values",
     0, "The passage establishes that the traditional moralist evaluates progress through communal solidarity and moral cohesion, whereas the neoclassical economist prioritizes quantifiable output and market productivity."),

    ("jamb_eng_2016_02", "English Language", "Comprehension: Moralist vs Economist", "2016",
     "The author suggests that reckless economic growth without moral considerations results in:",
     "Surplus capital reserves for future generations",
     "Social alienation, systemic inequality, and spiritual impoverishment",
     "Complete collapse of all agricultural systems",
     "Rapid expansion of international diplomacy",
     1, "Unchecked pursuit of material accumulation at the expense of communal ethics breeds wide social disparity and moral detachment."),

    ("jamb_eng_2016_03", "English Language", "Comprehension: Moralist vs Economist", "2016",
     "The word 'utilitarian' as used in the passage most closely means:",
     "Solely decorative and aesthetic",
     "Designed for practical usefulness and measurable benefit",
     "Deeply religious and spiritual",
     "Excessively complicated and obscure",
     1, "Utilitarian philosophy measures actions and policies strictly by practical output and tangible utility."),

    ("jamb_eng_2016_04", "English Language", "Comprehension: Moralist vs Economist", "2016",
     "From the passage, it can be inferred that a harmonious society requires:",
     "Subordinating all economic initiatives to religious authorities",
     "Abandoning all modern technological and industrial advancements",
     "Synthesizing productive economic enterprise with foundational ethical responsibility",
     "Nationalizing all private corporations and distribution networks",
     2, "The text concludes by advocating for a synthesis where economic production is guided by ethical values and social justice."),

    ("jamb_eng_2016_05", "English Language", "Comprehension: Moralist vs Economist", "2016",
     "A suitable title for the passage would be:",
     "The Failure of African Agriculture",
     "Balancing Economic Modernity and Ethical Values in Africa",
     "The Rise of Multinational Conglomerates",
     "Why Traditional Ethics Are Obsolete",
     1, "The core thematic argument explores reconciling economic development with enduring communal ethics."),

    # 6 - 10: Comprehension: Human Ecology & Wildlife Extinction
    ("jamb_eng_2016_06", "English Language", "Comprehension: Wildlife Ecology", "2016",
     "According to the text, the accelerated extinction of tropical species is primarily driven by:",
     "Natural evolutionary selection pressures",
     "Anthropogenic habitat fragmentation, deforestation, and commercial poaching",
     "Normal cyclical fluctuations in planetary temperature",
     "Unregulated predation among carnivorous animals",
     1, "Human activities—such as rampant logging, urban encroachment, and poaching—represent the overriding drivers of rapid biodiversity collapse."),

    ("jamb_eng_2016_07", "English Language", "Comprehension: Wildlife Ecology", "2016",
     "The term 'biodiversity hotspot' refers to a geographical region characterized by:",
     "Extreme volcanic and geothermal instability",
     "Exceptional reservoir of endemic plant and animal species under severe conservation threat",
     "Arid desert landscapes with zero flora or fauna",
     "High density of commercial timber processing facilities",
     1, "Biological hotspots contain globally significant concentrations of endemic organisms threatened with catastrophic habitat loss."),

    ("jamb_eng_2016_08", "English Language", "Comprehension: Wildlife Ecology", "2016",
     "The expression 'ecological domino effect' signifies:",
     "A game invented by environmental researchers",
     "The cascading collapse of multiple dependent species triggered by the loss of a keystone organism",
     "The rapid regeneration of clear-cut rainforest canopies",
     "A government policy regulating wildlife parks",
     1, "The extinction or removal of a keystone species causes destabilizing reverberations throughout the entire food web."),

    ("jamb_eng_2016_09", "English Language", "Comprehension: Wildlife Ecology", "2016",
     "The author implies that the loss of wild medicinal flora will directly harm:",
     "Only remote indigenous hunter-gatherer bands",
     "Pharmaceutical discoveries and global human healthcare resilience",
     "Space exploration programs",
     "Domestic livestock breeding exclusively",
     1, "Modern pharmacology relies extensively on complex biochemical compounds synthesized by wild rainforest plant species."),

    ("jamb_eng_2016_10", "English Language", "Comprehension: Wildlife Ecology", "2016",
     "What tone does the author adopt regarding current conservation efforts?",
     "Dismissive and indifferent",
     "Overly celebratory and complacent",
     "Urgent, cautionary, and vigorously advocating decisive institutional intervention",
     "Humorous and satirical",
     2, "The writer conveys grave concern and urgently appeals for systemic conservation enforcement and community engagement."),

    # 11 - 15: Cloze Passage: Renewable Energy Transition
    ("jamb_eng_2016_11", "English Language", "Cloze: Renewable Energy", "2016",
     "The global transition away from fossil fuels to renewable energy is no longer a luxury but an ecological …11… [A. option B. imperative C. hindrance D. suggestion].",
     "option", "imperative", "hindrance", "suggestion",
     1, "'Imperative' denotes an unavoidable, urgent necessity demanding immediate implementation."),

    ("jamb_eng_2016_12", "English Language", "Cloze: Renewable Energy", "2016",
     "Over-reliance on hydrocarbons has unleashed catastrophic greenhouse gas …12… [A. transmissions B. emissions C. absorptions D. permissions] into the atmosphere.",
     "transmissions", "emissions", "absorptions", "permissions",
     1, "'Emissions' is the precise scientific term for gases expelled into the earth's atmosphere."),

    ("jamb_eng_2016_13", "English Language", "Cloze: Renewable Energy", "2016",
     "Solar photovoltaic panels convert radiant sunlight directly into usable …13… [A. mechanical B. chemical C. electrical D. kinetic] power.",
     "mechanical", "chemical", "electrical", "kinetic",
     2, "Photovoltaic cells absorb light photons and generate direct electrical current."),

    ("jamb_eng_2016_14", "English Language", "Cloze: Renewable Energy", "2016",
     "However, the intermittent nature of wind and sun necessitates robust battery …14… [A. consumption B. storage C. leakage D. dissipation] technologies.",
     "consumption", "storage", "leakage", "dissipation",
     1, "Energy storage systems (such as lithium-ion or flow batteries) bridge periods of low solar radiation or wind lull."),

    ("jamb_eng_2016_15", "English Language", "Cloze: Renewable Energy", "2016",
     "Developing nations must embrace clean technology to foster …15… [A. unsustainable B. temporal C. sustainable D. erratic] industrialization.",
     "unsustainable", "temporal", "sustainable", "erratic",
     2, "'Sustainable development' balances contemporary technological growth without compromising future generational resources."),

    # 16 - 25: Prescribed UTME Prose: In Dependence (Sarah Ladipo Manyika)
    ("jamb_eng_2016_16", "English Language", "In Dependence: Sarah Ladipo Manyika", "2016",
     "In Sarah Ladipo Manyika's 'In Dependence', Tayo Ajayi travels to England in the 1960s to study at which prestigious institution?",
     "Cambridge University", "Oxford University (Balliol College)", "University of London", "University of Edinburgh",
     1, "Tayo arrives in Oxford on a government scholarship to study history at Balliol College."),

    ("jamb_eng_2016_17", "English Language", "In Dependence: Sarah Ladipo Manyika", "2016",
     "Tayo's father gives him which significant parting advice before his departure for Britain?",
     "To marry an English lady immediately upon arrival",
     "To remember who he is, focus steadfastly on his studies, and not get distracted by white women",
     "To renounce his Nigerian citizenship and settle permanently abroad",
     "To avoid reading political history and take up commerce",
     1, "His father admonishes him to guard his heritage, excel academically, and avoid compromising liaisons."),

    ("jamb_eng_2016_18", "English Language", "In Dependence: Sarah Ladipo Manyika", "2016",
     "How do Tayo and Vanessa Richardson first meet in Oxford?",
     "At an official diplomatic embassy reception",
     "At a literary book club meeting where Tayo borrows a book",
     "Through their mutual acquaintance, Christine",
     "At an anti-apartheid student demonstration",
     1, "They meet in Oxford through shared intellectual and literary interests when Tayo encounters Vanessa reading."),

    ("jamb_eng_2016_19", "English Language", "In Dependence: Sarah Ladipo Manyika", "2016",
     "Vanessa Richardson's father had served the British Empire as a:",
     "Colonial civil servant in South Africa and Nigeria",
     "Anglican bishop in Calcutta",
     "Trade merchant in Ghana",
     "Naval commander in the Atlantic fleet",
     0, "Mr. Richardson is a conservative former colonial administrator with imperialist racial attitudes."),

    ("jamb_eng_2016_20", "English Language", "In Dependence: Sarah Ladipo Manyika", "2016",
     "Why does Mr. Richardson vehemently object to Vanessa's romance with Tayo?",
     "Tayo was financially insolvent",
     "His deep-seated colonial racial prejudice and belief in racial hierarchy",
     "Tayo planned to study literature rather than medicine",
     "Vanessa had already been formally betrothed to an English nobleman",
     1, "Vanessa's father represents old colonial bigotry and refuses to accept an African son-in-law."),

    ("jamb_eng_2016_21", "English Language", "In Dependence: Sarah Ladipo Manyika", "2016",
     "What tragic domestic development complicates Tayo's relationship with Vanessa?",
     "Tayo's forced conscription into the British Army",
     "Miriam gets pregnant for Tayo back in Nigeria, leading him to marry her out of duty",
     "Vanessa contracts tuberculosis and is hospitalized in Switzerland",
     "Tayo fails his comprehensive history examinations",
     1, "Tayo fathers a child with Miriam during his visit home, compelling a marriage of obligation that shatters his relationship with Vanessa."),

    ("jamb_eng_2016_22", "English Language", "In Dependence: Sarah Ladipo Manyika", "2016",
     "What is the name of Tayo and Miriam's daughter in the novel?",
     "Kike", "Salamatu", "Bola", "Doyin",
     0, "Their daughter is named Kike, who later travels to England to pursue higher education."),

    ("jamb_eng_2016_23", "English Language", "In Dependence: Sarah Ladipo Manyika", "2016",
     "During Nigeria's military dictatorship, what traumatic ordeal does Tayo experience as an academic?",
     "He is appointed federal minister of finance",
     "He is arrested, detained, and dismissed from the university for his outspoken democratic views",
     "He flees into exile in France",
     "He abandons intellectual life to trade in crude oil",
     1, "Academic freedoms are trampled under military rule; Tayo is victimized and detained for opposing state repression."),

    ("jamb_eng_2016_24", "English Language", "In Dependence: Sarah Ladipo Manyika", "2016",
     "The title 'In Dependence' serves as an ironic pun contrasting:",
     "Financial wealth against extreme bankruptcy",
     "Nigeria's national political independence with the persistent emotional, cultural, and political interdependence of individuals and nations",
     "Youthful vitality against physical old age",
     "Urban Lagos against rural agrarian hamlets",
     1, "The title brilliantly puns on political 'Independence' versus psychological and relational 'In Dependence' across racial and post-colonial lines."),

    ("jamb_eng_2016_25", "English Language", "In Dependence: Sarah Ladipo Manyika", "2016",
     "At the twilight of their lives, what brings Tayo and Vanessa back into contact?",
     "A chance meeting at an international academic conference and persistent love after decades of separation",
     "A joint commercial business venture in Lagos",
     "Vanessa's daughter marrying Tayo's nephew",
     "A court lawsuit concerning royal inheritance",
     0, "Decades later, mature and weathered by life, their enduring mutual affection culminates in a poignant late-life reunion."),

    # 26 - 35: Antonyms (Choose the option opposite in meaning)
    ("jamb_eng_2016_26", "English Language", "Antonyms", "2016",
     "Choose the option opposite in meaning: The minister was commended for his *frugal* management of public funds.",
     "wasteful and extravagant", "parsimonious", "prudent", "stingy",
     0, "'Frugal' means economical and careful with resources; its direct antonym is 'wasteful and extravagant'."),

    ("jamb_eng_2016_27", "English Language", "Antonyms", "2016",
     "Choose the option opposite in meaning: The witness gave a *plausible* account of the highway robbery.",
     "convincing", "unbelievable and implausible", "coherent", "detailed",
     1, "'Plausible' means believable or likely; its direct antonym is 'unbelievable' or implausible."),

    ("jamb_eng_2016_28", "English Language", "Antonyms", "2016",
     "Choose the option opposite in meaning: The diplomat's response was intentionally *equivocal*.",
     "ambiguous", "vague", "clear and unambiguous", "secretive",
     2, "'Equivocal' means ambiguous or deliberately evasive; its opposite is 'clear and unambiguous'."),

    ("jamb_eng_2016_29", "English Language", "Antonyms", "2016",
     "Choose the option opposite in meaning: His *belligerent* posture alienated all the committee members.",
     "conciliatory and peace-loving", "aggressive", "quarrelsome", "hostile",
     0, "'Belligerent' means combative and eager to fight; its direct antonym is 'conciliatory' or peaceful."),

    ("jamb_eng_2016_30", "English Language", "Antonyms", "2016",
     "Choose the option opposite in meaning: The judge commended the detective for his *meticulous* investigation.",
     "scrupulous", "careless and sloppy", "punctual", "rigorous",
     1, "'Meticulous' means showing great attention to detail; its opposite is 'careless and sloppy'."),

    ("jamb_eng_2016_31", "English Language", "Antonyms", "2016",
     "Choose the option opposite in meaning: The medicine gave *transient* relief from the pain.",
     "fleeting", "ephemeral", "permanent and enduring", "momentary",
     2, "'Transient' means lasting only for a short time; its antonym is 'permanent and enduring'."),

    ("jamb_eng_2016_32", "English Language", "Antonyms", "2016",
     "Choose the option opposite in meaning: The principal was known for her *austere* lifestyle.",
     "severe", "luxurious and indulgent", "somber", "disciplined",
     1, "'Austere' means strictly simple and unadorned; its direct opposite is 'luxurious and indulgent'."),

    ("jamb_eng_2016_33", "English Language", "Antonyms", "2016",
     "Choose the option opposite in meaning: The old man was remarkably *lucid* despite his illness.",
     "confused and incoherent", "rational", "articulate", "conscious",
     0, "'Lucid' means clear-headed and rationally coherent; its antonym is 'confused and incoherent'."),

    ("jamb_eng_2016_34", "English Language", "Antonyms", "2016",
     "Choose the option opposite in meaning: Her *altruistic* contributions transformed the orphanage.",
     "benevolent", "selfless", "selfish and self-serving", "generous",
     2, "'Altruistic' means showing selfless concern for the welfare of others; its antonym is 'selfish'."),

    ("jamb_eng_2016_35", "English Language", "Antonyms", "2016",
     "Choose the option opposite in meaning: The student was *penitent* when caught cheating.",
     "repentant", "unapologetic and unrepentant", "remorseful", "ashamed",
     1, "'Penitent' means feeling or showing sorrow and regret; its antonym is 'unrepentant'."),

    # 36 - 45: Synonyms (Choose the option nearest in meaning)
    ("jamb_eng_2016_36", "English Language", "Synonyms", "2016",
     "Choose the option nearest in meaning: The doctor's diagnosis was *accurate* in every detail.",
     "approximate", "precise and correct", "dubious", "hasty",
     1, "'Accurate' means conforming exactly to truth or standard; 'precise and correct'."),

    ("jamb_eng_2016_37", "English Language", "Synonyms", "2016",
     "Choose the option nearest in meaning: The president delivered an *eloquent* speech at the summit.",
     "persuasive and articulate", "clumsy", "lengthy", "monotonous",
     0, "'Eloquent' means fluent, expressive, and persuasive in speech."),

    ("jamb_eng_2016_38", "English Language", "Synonyms", "2016",
     "Choose the option nearest in meaning: The scientist formulated an *ingenious* solution to the water crisis.",
     "clever and inventive", "costly", "ordinary", "unfeasible",
     0, "'Ingenious' means displaying clever, original, and inventive skill."),

    ("jamb_eng_2016_39", "English Language", "Synonyms", "2016",
     "Choose the option nearest in meaning: She was *resolute* in her decision to complete her doctoral studies.",
     "hesitant", "determined and steadfast", "indifferent", "vacillating",
     1, "'Resolute' means admirably purposeful, determined, and unwavering."),

    ("jamb_eng_2016_40", "English Language", "Synonyms", "2016",
     "Choose the option nearest in meaning: The auditor discovered *spurious* claims in the reimbursement files.",
     "genuine", "fraudulent and fake", "official", "modest",
     1, "'Spurious' means not genuine, false, or counterfeit."),

    ("jamb_eng_2016_41", "English Language", "Synonyms", "2016",
     "Choose the option nearest in meaning: The hurricane caused *extensive* damage across the coastal towns.",
     "limited", "widespread and vast", "superficial", "isolated",
     1, "'Extensive' means covering a large area; widespread."),

    ("jamb_eng_2016_42", "English Language", "Synonyms", "2016",
     "Choose the option nearest in meaning: The lawyer presented a *cogent* argument before the tribunal.",
     "weak", "convincing and compelling", "confusing", "lengthy",
     1, "'Cogent' means clear, logical, and convincing."),

    ("jamb_eng_2016_43", "English Language", "Synonyms", "2016",
     "Choose the option nearest in meaning: His *arduous* training regimen prepared him for the Olympic marathon.",
     "demanding and strenuous", "pleasant", "casual", "brief",
     0, "'Arduous' means requiring strenuous effort and endurance."),

    ("jamb_eng_2016_44", "English Language", "Synonyms", "2016",
     "Choose the option nearest in meaning: The manager had to *admonish* the clerk for repeated tardiness.",
     "praise", "reprimand and caution", "promote", "discharge",
     1, "'Admonish' means to warn or reprimand someone firmly."),

    ("jamb_eng_2016_45", "English Language", "Synonyms", "2016",
     "Choose the option nearest in meaning: The monastery offered a *serene* sanctuary far away from city noise.",
     "turbulent", "calm and peaceful", "crowded", "dismal",
     1, "'Serene' means calm, peaceful, and untroubled."),

    # 46 - 52: Lexis and Structure (Concord, Prepositions, Phrasal Verbs)
    ("jamb_eng_2016_46", "English Language", "Lexis and Structure", "2016",
     "Neither the teacher nor his students __ present at the assembly this morning.",
     "was", "were", "is", "has been",
     1, "Under the rule of proximity, when subjects are joined by 'neither... nor', the verb agrees with the nearer subject ('students' -> 'were')."),

    ("jamb_eng_2016_47", "English Language", "Lexis and Structure", "2016",
     "The committee has submitted __ report to the minister.",
     "their", "its", "it's", "there",
     1, "A collective noun acting as a single unified entity takes the neuter singular possessive pronoun 'its' (no apostrophe)."),

    ("jamb_eng_2016_48", "English Language", "Lexis and Structure", "2016",
     "She insisted __ paying the hospital bill for the injured child.",
     "on", "at", "in", "for",
     0, "The verb 'insist' collogates with the preposition 'on' followed by a gerund: 'insisted on paying'."),

    ("jamb_eng_2016_49", "English Language", "Lexis and Structure", "2016",
     "Had I known about the changes in schedule, I __ the morning train.",
     "would catch", "will catch", "would have caught", "caught",
     2, "In third conditional counterfactual constructions, the inverted condition 'Had I known' is completed by 'would have + past participle'."),

    ("jamb_eng_2016_50", "English Language", "Lexis and Structure", "2016",
     "The suspect was arrested for being an accessory __ the crime.",
     "with", "to", "of", "in",
     1, "The legal idiom is 'an accessory to a crime'."),

    ("jamb_eng_2016_51", "English Language", "Lexis and Structure", "2016",
     "The company decided to call __ the strike after productive negotiations.",
     "out", "off", "up", "in",
     1, "The phrasal verb 'call off' means to cancel or terminate an event or action."),

    ("jamb_eng_2016_52", "English Language", "Lexis and Structure", "2016",
     "Each of the candidates __ required to submit two passport photographs.",
     "are", "is", "were", "have been",
     1, "The distributive pronoun 'Each' takes a singular verb: 'Each ... is required'."),

    # 53 - 60: Oral English (Vowels, Consonants, Rhymes, Syllable Stress, Emphatic Stress)
    ("jamb_eng_2016_53", "English Language", "Oral English: Vowels", "2016",
     "Choose the option with the same vowel sound as the underlined sound in 'pl<u>ai</u>t' (/æ/):",
     "tray", "trap", "stare", "plaque",
     1, "'Plait' is phonetically pronounced /plæt/, containing the short front open vowel /æ/, exactly matching 'trap' (/træp/)."),

    ("jamb_eng_2016_54", "English Language", "Oral English: Consonants", "2016",
     "Choose the option with the same consonant sound as the underlined letter in 'ca<u>sh</u>' (/ʃ/):",
     "machine", "chorus", "chimney", "vision",
     0, "The 'ch' in 'machine' is articulated as voiceless postalveolar fricative /ʃ/, matching 'cash'."),

    ("jamb_eng_2016_55", "English Language", "Oral English: Silent Letters", "2016",
     "In which of the following words is the letter 'b' silent?",
     "obtain", "subtle", "disturb", "blanket",
     1, "In 'subtle' (/ˈsʌt.əl/), the letter 'b' is completely silent."),

    ("jamb_eng_2016_56", "English Language", "Oral English: Rhymes", "2016",
     "Choose the word that rhymes with 'height':",
     "eight", "bite", "weight", "freight",
     1, "'Height' (/haɪt/) rhymes with 'bite' (/baɪt/), while eight, weight, and freight contain the /eɪ/ diphthong."),

    ("jamb_eng_2016_57", "English Language", "Oral English: Stress", "2016",
     "Choose the option with the correct stress placement: PHOTOGRAPHY",
     "PHOtography", "phoTOgraphy", "photograPHY", "photoGRAphy",
     1, "The noun 'photography' places primary syllable stress on the second syllable: pho-TOG-ra-phy."),

    ("jamb_eng_2016_58", "English Language", "Oral English: Stress", "2016",
     "Choose the option with the correct stress placement: DEMOCRATIC",
     "DEmocratic", "deMOcratic", "demoCRAat", "demoCRATic",
     3, "Words ending in suffix '-ic' place primary stress on the penultimate syllable: de-mo-CRAT-ic."),

    ("jamb_eng_2016_59", "English Language", "Oral English: Emphatic Stress", "2016",
     "In the sentence: 'FATIMA won the national mathematics competition', which question does this sentence answer?",
     "Did Fatima lose the national mathematics competition?",
     "Who won the national mathematics competition?",
     "Did Fatima win the state debate contest?",
     "When did Fatima win the competition?",
     1, "Emphatic stress on the subject 'FATIMA' singles out the winner against any other contenders."),

    ("jamb_eng_2016_60", "English Language", "Oral English: Emphatic Stress", "2016",
     "In the sentence: 'The governor visited the hospital on MONDAY', which question does this sentence answer?",
     "Did the senator visit the hospital on Monday?",
     "Did the governor inspect the school on Monday?",
     "When did the governor visit the hospital?",
     "Did the governor avoid the hospital on Monday?",
     2, "Emphatic stress on the temporal adverbial 'MONDAY' establishes the specific day the visit occurred.")
]

write_bank_file("JambEnglish2016CompleteQuestionBank", "2016", e2016, 60)

# =========================================================================
# 2017 USE OF ENGLISH (60 Questions - JAMB CBT Official Spec)
# =========================================================================
e2017 = [
    # 1 - 5: Comprehension: Gender Differentiation & Societal Roles
    ("jamb_eng_2017_01", "English Language", "Comprehension: Gender Differentiation", "2017",
     "According to the passage, traditional gender stereotyping begins primarily through:",
     "Formal constitutional legislation by national parliaments",
     "Early childhood socialization, cultural conditioning, and familial division of labour",
     "Biological variations in brain weight and skull dimensions",
     "Direct vocational training in higher secondary academies",
     1, "The passage demonstrates that gender expectations are instilled in early childhood through social conditioning, toys, language, and domestic role allocation."),

    ("jamb_eng_2017_02", "English Language", "Comprehension: Gender Differentiation", "2017",
     "The author asserts that restricting women's educational and economic access produces:",
     "Significant national economic surplus and agricultural stability",
     "Massive underutilization of vital human capital and reduced national development",
     "Harmonious preservation of all medieval societal customs",
     "Lower rates of rural-to-urban population migration",
     1, "Denying female citizens educational and workforce parity sidelines half the nation's productive talent, curbing socioeconomic expansion."),

    ("jamb_eng_2017_03", "English Language", "Comprehension: Gender Differentiation", "2017",
     "The word 'patriarchy' as defined in the context of the text means:",
     "A governance system controlled exclusively by religious monarchs",
     "A social system in which men hold primary power and predominate in leadership, authority, and property ownership",
     "An economic arrangement prioritizing agricultural barter trade",
     "A legal code guaranteeing absolute equality among all genders",
     1, "Patriarchy denotes institutionalized male hegemony across political, domestic, and economic spheres."),

    ("jamb_eng_2017_04", "English Language", "Comprehension: Gender Differentiation", "2017",
     "It can be deduced from the passage that modern industrial progress correlates with:",
     "Enforcing rigid historic domestic roles for all female citizens",
     "Empowering women through STEM education, leadership access, and equal legal rights",
     "Prohibiting women from participating in professional sports",
     "Abolishing all nuclear family structures",
     1, "Sustained modern development directly mirrors broader female educational attainment and civic leadership integration."),

    ("jamb_eng_2017_05", "English Language", "Comprehension: Gender Differentiation", "2017",
     "A suitable title for the passage would be:",
     "Childhood Nutrition in Developing Nations",
     "Deconstructing Gender Stereotypes for Inclusive National Growth",
     "The History of Industrial Steam Engines",
     "Why Domestic Labour Should Be Automated",
     1, "The discourse examines gender bias deconstruction as an indispensable catalyst for comprehensive development."),

    # 6 - 10: Comprehension: National Infrastructure & Urban Planning
    ("jamb_eng_2017_06", "English Language", "Comprehension: Infrastructure Planning", "2017",
     "What is identified as the chief impediment to sustainable urban expansion in rapidly growing cities?",
     "Surplus financial investments in mass transportation",
     "Unregulated urban sprawl, deficient arterial drainage, and lack of integrated master plans",
     "An over-abundance of pedestrian walkways and parks",
     "Strict municipal enforcement of architectural zoning bylaws",
     1, "Haphazard unplanned development and absent drainage infrastructure trigger perpetual gridlock, flooding, and urban decay."),

    ("jamb_eng_2017_07", "English Language", "Comprehension: Infrastructure Planning", "2017",
     "The expression 'infrastructure deficit' signifies:",
     "The difference between the infrastructure a society requires and what it actually possesses",
     "A financial penalty levied on defaulting contractors",
     "The demolition of old colonial monuments",
     "The total volume of freight exported through seaports",
     0, "An infrastructure deficit measures the shortfall between actual functional infrastructure assets and societal operational requirements."),

    ("jamb_eng_2017_08", "English Language", "Comprehension: Infrastructure Planning", "2017",
     "Why does the author advocate for multimodal transportation networks?",
     "To encourage residents to own multiple personal automobiles",
     "To reduce highway congestion and environmental pollution by integrating rail, road, and water transit",
     "To eliminate commercial airlines completely",
     "To minimize the revenue collected by municipal transit authorities",
     1, "Multimodal networks synthesize diverse transit modes to optimize commuter mobility, alleviate congestion, and curb emissions."),

    ("jamb_eng_2017_09", "English Language", "Comprehension: Infrastructure Planning", "2017",
     "The author emphasizes that infrastructure projects fail when:",
     "They are subjected to rigorous public accountability and technical feasibility audits",
     "Political considerations override engineering viability and long-term maintenance budgets are ignored",
     "Foreign multilateral lenders provide concessionary development grants",
     "Local community leaders are actively consulted during project planning",
     1, "Neglecting lifecycle maintenance and pursuing politically expedient 'white elephant' schemes lead to premature structural abandonment."),

    ("jamb_eng_2017_10", "English Language", "Comprehension: Infrastructure Planning", "2017",
     "What stance does the passage adopt regarding public-private partnerships (PPPs)?",
     "Categorical opposition to private sector participation",
     "Cautious endorsement provided there is transparent regulatory oversight and equitable risk allocation",
     "Total privatization of all municipal air and water resources without regulation",
     "Neutrality with no practical suggestions",
     1, "PPPs are endorsed as effective capital-mobilization vehicles when governed by stringent oversight and equitable contract terms."),

    # 11 - 15: Cloze Passage: Cyber Security & Digital Data
    ("jamb_eng_2017_11", "English Language", "Cloze: Cyber Security", "2017",
     "In the digital age, information security has become a paramount concern as sensitive data is routinely …11… [A. encrypted B. fabricated C. discarded D. vandalized] across global computer networks.",
     "encrypted", "fabricated", "discarded", "vandalized",
     0, "Data encryption encodes electronic information to protect it against unauthorized access across telecommunications channels."),

    ("jamb_eng_2017_12", "English Language", "Cloze: Cyber Security", "2017",
     "Malicious cyber actors constantly deploy sophisticated …12… [A. hardware B. malware C. software D. bandwidth] to breach institutional firewalls.",
     "hardware", "malware", "software", "bandwidth",
     1, "'Malware' is an umbrella term encompassing viruses, trojans, ransomware, and spyware specifically designed to infiltrate computer systems."),

    ("jamb_eng_2017_13", "English Language", "Cloze: Cyber Security", "2017",
     "A rampant cyber attack method known as …13… [A. phishing B. surfing C. roaming D. streaming] tricks unsuspecting users into disclosing passwords.",
     "phishing", "surfing", "roaming", "streaming",
     0, "'Phishing' uses fraudulent email and fake websites to deceive individuals into revealing credentials and confidential data."),

    ("jamb_eng_2017_14", "English Language", "Cloze: Cyber Security", "2017",
     "Experts advise users to enforce multi-factor …14… [A. circulation B. authentication C. multiplication D. termination] to safeguard personal accounts.",
     "circulation", "authentication", "multiplication", "termination",
     1, "Multi-factor authentication (MFA) requires two or more verification factors to gain access to an account."),

    ("jamb_eng_2017_15", "English Language", "Cloze: Cyber Security", "2017",
     "Governments worldwide are enacting rigorous data protection laws to penalize unauthorized …15… [A. preservation B. disclosure C. eradication D. encryption] of citizen records.",
     "preservation", "disclosure", "eradication", "encryption",
     1, "'Unauthorized disclosure' constitutes illegal leaking or sharing of private information."),

    # 16 - 25: Prescribed UTME Prose: In Dependence (Sarah Ladipo Manyika)
    ("jamb_eng_2017_16", "English Language", "In Dependence: Sarah Ladipo Manyika", "2017",
     "When Tayo Ajayi arrives in England, what physical sensation surprises him most about the climate?",
     "The intense tropical humidity",
     "The biting, damp cold and persistent dreary grey skies of autumn",
     "Unbearable desert heatwaves",
     "Constant torrential monsoon downpours",
     1, "Coming from sunny Nigeria, Tayo is immediately struck by the chilling dampness and gloom of English autumn weather."),

    ("jamb_eng_2017_17", "English Language", "In Dependence: Sarah Ladipo Manyika", "2017",
     "Who is Christine in Sarah Ladipo Manyika's novel 'In Dependence'?",
     "Tayo's English landlady",
     "An African-American student at Oxford with whom Tayo interacts and discusses pan-Africanism",
     "Vanessa's strict maternal aunt",
     "A Nigerian diplomat's daughter in London",
     1, "Christine is an articulate African-American student whose political and racial consciousness broadens Tayo's worldview."),

    ("jamb_eng_2017_18", "English Language", "In Dependence: Sarah Ladipo Manyika", "2017",
     "What musical genre connects Tayo, Vanessa, and their Oxford contemporaries?",
     "Opera", "Jazz and highlife music", "Heavy metal", "Chamber classical music",
     1, "Jazz, blues, and West African highlife provide an emotive cultural bridge connecting the characters across racial divides."),

    ("jamb_eng_2017_19", "English Language", "In Dependence: Sarah Ladipo Manyika", "2017",
     "Why does Vanessa travel to West Africa during her career as a journalist?",
     "To manage a commercial gold mine in Ghana",
     "To report on post-independence political developments and experience the culture firsthand",
     "To permanently relocate as a missionary",
     "To search for her father's lost colonial documents",
     1, "Vanessa establishes an illustrious career as an insightful journalist reporting on African cultural renaissance and politics."),

    ("jamb_eng_2017_20", "English Language", "In Dependence: Sarah Ladipo Manyika", "2017",
     "In the novel, Tayo's friend Bolaji represents which segment of Nigerian society?",
     "The conservative feudal royalty",
     "The ambitious, flamboyant, and politically connected elite navigating post-independence opportunities",
     "A devout monastic ascetic",
     "A radical underground guerrilla leader",
     1, "Bolaji is charismatic, stylish, and opportunistic, embracing political connections and high life."),

    ("jamb_eng_2017_21", "English Language", "In Dependence: Sarah Ladipo Manyika", "2017",
     "How does Tayo's marriage to Miriam end up?",
     "They live in blissful harmony until old age",
     "It becomes emotionally strained and distant, eventually leading to separation and Miriam's migration abroad with Kike",
     "They both perish in a tragic motor accident in Ibadan",
     "They establish a joint academic institute in London",
     1, "Compelled by circumstance rather than genuine romantic passion, their marriage fractures under emotional neglect."),

    ("jamb_eng_2017_22", "English Language", "In Dependence: Sarah Ladipo Manyika", "2017",
     "What physical injury does Tayo suffer during his imprisonment by the Nigerian military regime?",
     "Loss of his eyesight completely",
     "Severe beatings resulting in a limp and chronic physical pain",
     "Loss of both hands",
     "Permanent loss of his voice",
     1, "State detention subjects Tayo to brutal physical abuse, leaving him with an enduring limp."),

    ("jamb_eng_2017_23", "English Language", "In Dependence: Sarah Ladipo Manyika", "2017",
     "What does Vanessa achieve in her professional career?",
     "She becomes a successful novelist, essayist, and editor of a prominent cultural magazine",
     "She becomes a British member of parliament",
     "She manages a shipping multinational in Liverpool",
     "She becomes a high-court judge in London",
     0, "Vanessa emerges as a celebrated literary editor and cultural commentator with profound African expertise."),

    ("jamb_eng_2017_24", "English Language", "In Dependence: Sarah Ladipo Manyika", "2017",
     "When Tayo is finally invited to give a lecture in San Francisco later in life, what significant event occurs?",
     "He declines the invitation due to illness",
     "He finally reconnects with Vanessa, realizing that their deep mutual bond has survived the trials of time",
     "He is arrested by international police",
     "He denounces his entire academic career",
     1, "Their gathering in California provides redemptive emotional closure and rekindles their lifelong affection."),

    ("jamb_eng_2017_25", "English Language", "In Dependence: Sarah Ladipo Manyika", "2017",
     "A central thematic exploration of 'In Dependence' is how:",
     "Political independence of nations does not automatically liberate individuals from racial, cultural, and emotional entanglement",
     "Money guarantees absolute marital happiness",
     "Studying history at Oxford guarantees political presidency",
     "Colonialism left no psychological scars on either Africans or Europeans",
     0, "The book delves into the complex dialectic between personal sovereignty, political emancipation, and relational interdependence."),

    # 26 - 35: Antonyms (Choose the option opposite in meaning)
    ("jamb_eng_2017_26", "English Language", "Antonyms", "2017",
     "Choose the option opposite in meaning: The commander issued an *explicit* instruction to the troops.",
     "definite", "vague and ambiguous", "precise", "direct",
     1, "'Explicit' means stated clearly and in detail; its antonym is 'vague and ambiguous'."),

    ("jamb_eng_2017_27", "English Language", "Antonyms", "2017",
     "Choose the option opposite in meaning: His *reckless* driving endangered other road users.",
     "careful and cautious", "heedless", "impetuous", "daring",
     0, "'Reckless' means heedless of consequences; its direct antonym is 'careful and cautious'."),

    ("jamb_eng_2017_28", "English Language", "Antonyms", "2017",
     "Choose the option opposite in meaning: The community had an *abundant* supply of clean spring water.",
     "copious", "scarce and meager", "overflowing", "sufficient",
     1, "'Abundant' means existing in large quantities; its direct antonym is 'scarce and meager'."),

    ("jamb_eng_2017_29", "English Language", "Antonyms", "2017",
     "Choose the option opposite in meaning: The manager was *lenient* with first-time offenders.",
     "merciful", "severe and strict", "tolerant", "forgiving",
     1, "'Lenient' means mild or tolerant; its direct opposite is 'severe and strict'."),

    ("jamb_eng_2017_30", "English Language", "Antonyms", "2017",
     "Choose the option opposite in meaning: The professor's argument was *fallacious* from the start.",
     "erroneous", "sound and valid", "flawed", "misleading",
     1, "'Fallacious' means based on mistaken logic or falsehood; its antonym is 'sound and valid'."),

    ("jamb_eng_2017_31", "English Language", "Antonyms", "2017",
     "Choose the option opposite in meaning: The youth showed *defiance* towards the elders' decision.",
     "rebellion", "submission and obedience", "insolence", "resistance",
     1, "'Defiance' means bold disobedience; its direct antonym is 'submission and obedience'."),

    ("jamb_eng_2017_32", "English Language", "Antonyms", "2017",
     "Choose the option opposite in meaning: The doctor noted that the patient was in a *moribund* condition.",
     "dying", "thriving and recovering", "failing", "critical",
     1, "'Moribund' means at the point of death; its antonym is 'thriving' or healthy."),

    ("jamb_eng_2017_33", "English Language", "Antonyms", "2017",
     "Choose the option opposite in meaning: The new tax policy will *hamper* economic innovation.",
     "impede", "facilitate and promote", "obstruct", "restrict",
     1, "'Hamper' means to hinder or impede; its direct opposite is 'facilitate and promote'."),

    ("jamb_eng_2017_34", "English Language", "Antonyms", "2017",
     "Choose the option opposite in meaning: The civil war caused *colossal* destruction to public property.",
     "immense", "infinitesimal and tiny", "gargantuan", "vast",
     1, "'Colossal' means extremely large; its antonym is 'infinitesimal' or tiny."),

    ("jamb_eng_2017_35", "English Language", "Antonyms", "2017",
     "Choose the option opposite in meaning: Her *amiable* disposition made her popular in the dormitory.",
     "friendly", "disagreeable and hostile", "affable", "genial",
     1, "'Amiable' means having a friendly, pleasant manner; its opposite is 'disagreeable and hostile'."),

    # 36 - 45: Synonyms (Choose the option nearest in meaning)
    ("jamb_eng_2017_36", "English Language", "Synonyms", "2017",
     "Choose the option nearest in meaning: The governor was praised for his *impartial* distribution of state relief.",
     "biased", "unbiased and fair", "prejudiced", "hasty",
     1, "'Impartial' means treating all rivals or disputants equally; 'unbiased and fair'."),

    ("jamb_eng_2017_37", "English Language", "Synonyms", "2017",
     "Choose the option nearest in meaning: The athlete displayed *tenacity* throughout the grueling triathlon.",
     "indifference", "perseverance and persistence", "sloth", "hesitation",
     1, "'Tenacity' denotes persistence, determination, and grit."),

    ("jamb_eng_2017_38", "English Language", "Synonyms", "2017",
     "Choose the option nearest in meaning: The committee held a *clandestine* meeting at midnight.",
     "public", "covert and secret", "formal", "noisy",
     1, "'Clandestine' means kept secret or done secretively; 'covert and secret'."),

    ("jamb_eng_2017_39", "English Language", "Synonyms", "2017",
     "Choose the option nearest in meaning: The author's prose is remarkably *lucid* and engaging.",
     "opaque", "clear and comprehensible", "confusing", "monotonous",
     1, "'Lucid' means expressed clearly; easy to understand."),

    ("jamb_eng_2017_40", "English Language", "Synonyms", "2017",
     "Choose the option nearest in meaning: He was *apprehensive* about the outcome of the medical examination.",
     "anxious and fearful", "confident", "indifferent", "delighted",
     0, "'Apprehensive' means anxious or fearful that something bad or unpleasant will happen."),

    ("jamb_eng_2017_41", "English Language", "Synonyms", "2017",
     "Choose the option nearest in meaning: The judge praised the police officer's *exemplary* conduct.",
     "flawed", "commendable and model", "scandalous", "ordinary",
     1, "'Exemplary' means serving as a desirable model; commendable."),

    ("jamb_eng_2017_42", "English Language", "Synonyms", "2017",
     "Choose the option nearest in meaning: The old fortress has remained *impregnable* for three centuries.",
     "vulnerable", "invincible and unconquerable", "fragile", "exposed",
     1, "'Impregnable' means unable to be captured or broken into."),

    ("jamb_eng_2017_43", "English Language", "Synonyms", "2017",
     "Choose the option nearest in meaning: The drought led to a *paucity* of grain in the northern provinces.",
     "scarcity and shortage", "glut", "surplus", "abundance",
     0, "'Paucity' signifies the presence of something only in small or insufficient quantities."),

    ("jamb_eng_2017_44", "English Language", "Synonyms", "2017",
     "Choose the option nearest in meaning: The teacher tried to *instill* moral values into her pupils.",
     "eradicate", "impart and infuse", "extract", "dismiss",
     1, "'Instill' means to gradually but firmly establish an idea or attitude in a person's mind."),

    ("jamb_eng_2017_45", "English Language", "Synonyms", "2017",
     "Choose the option nearest in meaning: His *audacious* climb up the skyscraper stunned the onlookers.",
     "timid", "daring and bold", "careful", "foolish",
     1, "'Audacious' means showing a willingness to take surprisingly bold risks."),

    # 46 - 52: Lexis and Structure (Concord, Prepositions, Phrasal Verbs)
    ("jamb_eng_2017_46", "English Language", "Lexis and Structure", "2017",
     "Bread and butter __ his favorite breakfast.",
     "are", "is", "were", "have been",
     1, "When two nouns connected by 'and' form a single composite conceptual entity or meal ('bread and butter'), they take a singular verb: 'is'."),

    ("jamb_eng_2017_47", "English Language", "Lexis and Structure", "2017",
     "The principal congratulated the student __ her exceptional performance in the UTME.",
     "for", "on", "at", "about",
     1, "The verb 'congratulate' collogates with the preposition 'on': 'congratulated the student on her performance'."),

    ("jamb_eng_2017_48", "English Language", "Lexis and Structure", "2017",
     "If the doctor __ arrived earlier, the patient's life would have been saved.",
     "has", "had", "would have", "should",
     1, "Third conditional past counterfactual requires 'had + past participle': 'If the doctor had arrived earlier'."),

    ("jamb_eng_2017_49", "English Language", "Lexis and Structure", "2017",
     "The pilot managed to bring the aircraft __ safely despite engine failure.",
     "down", "up", "through", "round",
     0, "The phrasal verb 'bring down' means to land an aircraft."),

    ("jamb_eng_2017_50", "English Language", "Lexis and Structure", "2017",
     "The girl was accused __ divulging examination questions to her classmates.",
     "with", "of", "about", "for",
     1, "The adjective/participle 'accused' takes the preposition 'of': 'accused of divulging'."),

    ("jamb_eng_2017_51", "English Language", "Lexis and Structure", "2017",
     "Neither the captain nor the sailors __ able to navigate through the dense fog.",
     "was", "were", "is", "has been",
     1, "In 'neither ... nor', agreement is governed by the proximity rule; 'sailors' is plural, so 'were' is correct."),

    ("jamb_eng_2017_52", "English Language", "Lexis and Structure", "2017",
     "She could hardly hear what the speaker was saying, __?",
     "couldn't she", "could she", "can she", "did she",
     1, "'Hardly' is a negative adverb, which requires a positive question tag: 'could she?'."),

    # 53 - 60: Oral English (Vowels, Consonants, Rhymes, Syllable Stress, Emphatic Stress)
    ("jamb_eng_2017_53", "English Language", "Oral English: Vowels", "2017",
     "Choose the option with the same vowel sound as the underlined sound in 'b<u>u</u>ry' (/e/):",
     "fury", "berry", "curry", "jury",
     1, "'Bury' is pronounced /ˈber.i/, containing the short front mid vowel /e/, which is identical to 'berry'."),

    ("jamb_eng_2017_54", "English Language", "Oral English: Consonants", "2017",
     "Choose the option with the same consonant sound as the underlined letter in '<u>th</u>ink' (/θ/):",
     "this", "theme", "those", "there",
     1, "'Think' begins with the voiceless dental fricative /θ/, matching 'theme' (/θiːm/), whereas this, those, and there feature voiced /ð/."),

    ("jamb_eng_2017_55", "English Language", "Oral English: Silent Letters", "2017",
     "In which of the following words is the letter 'p' silent?",
     "psychology", "panther", "republic", "pardon",
     0, "In 'psychology' (/saɪˈkɒl.ə.dʒi/), the initial letter 'p' is silent."),

    ("jamb_eng_2017_56", "English Language", "Oral English: Rhymes", "2017",
     "Choose the word that rhymes with 'suite':",
     "suit", "sweet", "sweat", "shoot",
     1, "'Suite' is pronounced /swiːt/, perfectly rhyming with 'sweet' (/swiːt/)."),

    ("jamb_eng_2017_57", "English Language", "Oral English: Stress", "2017",
     "Choose the option with the correct stress placement: CERTIFICATE (Noun)",
     "cerTIficate", "CERtificate", "certifiCATE", "certiFIcate",
     1, "As a noun, 'certificate' places primary syllable stress on the second syllable: cer-TIF-i-cate (/səˈtɪf.ɪ.kət/)."),

    ("jamb_eng_2017_58", "English Language", "Oral English: Stress", "2017",
     "Choose the option with the correct stress placement: GEOGRAPHIC",
     "GEOgraphic", "geoGRAphic", "geographic", "geo-gra-PHIC",
     1, "Adjectives ending in suffix '-ic' place primary stress on the penultimate syllable: ge-o-GRAPH-ic."),

    ("jamb_eng_2017_59", "English Language", "Oral English: Emphatic Stress", "2017",
     "In the sentence: 'OBI bought a new bicycle yesterday', which question does this sentence answer?",
     "Did Obi borrow a new bicycle yesterday?",
     "Who bought a new bicycle yesterday?",
     "Did Obi buy an old bicycle yesterday?",
     "What did Obi buy yesterday?",
     1, "Emphatic stress on the subject 'OBI' highlights the specific purchaser."),

    ("jamb_eng_2017_60", "English Language", "Oral English: Emphatic Stress", "2017",
     "In the sentence: 'The hunter killed the lion in the FOREST', which question does this sentence answer?",
     "Who killed the lion in the forest?",
     "What animal did the hunter kill in the forest?",
     "Where did the hunter kill the lion?",
     "Did the hunter trap the lion in the forest?",
     2, "Emphatic stress on the prepositional phrase 'FOREST' focuses on the exact location of the event.")
]

write_bank_file("JambEnglish2017CompleteQuestionBank", "2017", e2017, 60)

# =========================================================================
# 2018 USE OF ENGLISH (60 Questions - JAMB CBT Official Spec)
# =========================================================================
e2018 = [
    # 1 - 5: Comprehension: Geography Master's Eurocentric Bias
    ("jamb_eng_2018_01", "English Language", "Comprehension: Eurocentric Bias", "2018",
     "According to the passage, the colonial geography master presented world history through a lens that was:",
     "Wholly objective and mathematically verified",
     "Profoundly Eurocentric, treating European discovery as the origin of all geographic reality",
     "Centred predominantly on Asian mercantile expeditions",
     "Deeply appreciative of African oral indigenous historiography",
     1, "The colonial curriculum framed world geography solely through European exploration, ignoring centuries of indigenous civilizations."),

    ("jamb_eng_2018_02", "English Language", "Comprehension: Eurocentric Bias", "2018",
     "The statement that 'Mungo Park discovered River Niger' is critiqued by the author because:",
     "Mungo Park never reached the West African interior",
     "Indigenous African peoples had lived, fished, and navigated the river for millennia prior to Park's expedition",
     "River Niger dried up before the 19th century",
     "Park was financed by French rather than British patrons",
     1, "It is absurd to claim discovery of a waterway inhabited, utilized, and developed by indigenous populations for millennia."),

    ("jamb_eng_2018_03", "English Language", "Comprehension: Eurocentric Bias", "2018",
     "The word 'epistemic' as used in the discourse relates to:",
     "Physical geological formations",
     "The nature, scope, and validation of knowledge and belief systems",
     "Military defensive fortifications",
     "Oceanic biological organisms",
     1, "'Epistemic' pertains to epistemology—the philosophical study of knowledge, truth, and how knowledge claims are created and validated."),

    ("jamb_eng_2018_04", "English Language", "Comprehension: Eurocentric Bias", "2018",
     "The author advocates for decolonizing the educational curriculum in order to:",
     "Eliminate the teaching of modern science and geography entirely",
     "Restore authentic African historical Agency and contextualize global knowledge objectively",
     "Enforce rote memorization of colonial treaties",
     "Ban all foreign textbooks from university libraries",
     1, "Curricular decolonization restores African agency and dismantles biased imperial historical narratives."),

    ("jamb_eng_2018_05", "English Language", "Comprehension: Eurocentric Bias", "2018",
     "What tone characterizes the author's critique of colonial educational curricula?",
     "Submissive and reverent",
     "Analytical, trenchant, and intellectually liberating",
     "Confused and indecisive",
     "Mournful and nostalgic",
     1, "The author delivers a sharp, intellectually rigorous and emancipatory critique of colonial pedagogical biases."),

    # 6 - 10: Comprehension: Immunology & Infectious Disease Outbreaks
    ("jamb_eng_2018_06", "English Language", "Comprehension: Immunology", "2018",
     "According to the medical exposition, the human immune system defends the host organism primarily through:",
     "Immediate surgical elimination of foreign matter",
     "Innate non-specific defenses and adaptive, pathogen-specific cellular and humoral responses",
     "Increasing blood pressure to boil circulating microbes",
     "Relying exclusively on consumed synthetic antibiotic tablets",
     1, "Immunity operates through an intricate synergy of innate anatomical barriers and highly targeted adaptive lymphocytes (B and T cells)."),

    ("jamb_eng_2018_07", "English Language", "Comprehension: Immunology", "2018",
     "What biological mechanism underlies the efficacy of preventive vaccination?",
     "Destroying the body's white blood cells permanently",
     "Introducing an attenuated or harmless antigen that stimulates immunological memory without causing active disease",
     "Injecting active live pathogens at maximum virulence",
     "Altering the recipient's genetic DNA sequence",
     1, "Vaccines expose the immune system to harmless antigenic structures, triggering memory cells that neutralize subsequent infections swiftly."),

    ("jamb_eng_2018_08", "English Language", "Comprehension: Immunology", "2018",
     "The term 'herd immunity' refers to:",
     "Veterinary treatments applied to cattle ranches",
     "Indirect protection from infectious disease when a critical threshold of the population becomes immune",
     "The natural immunity possessed exclusively by rural pastoralists",
     "The complete disappearance of all viruses from the planet",
     1, "When high vaccination coverage prevents disease transmission, even unimmunized vulnerable individuals are shielded."),

    ("jamb_eng_2018_09", "English Language", "Comprehension: Immunology", "2018",
     "Why is antibiotic resistance described as a grave global health crisis?",
     "Because pharmaceutical companies refuse to manufacture medicines",
     "Bacterial pathogens evolve resistance to frontline drugs due to widespread misuse and overprescription",
     "Because common viruses can now be killed by antibiotics",
     "Because vaccines prevent antibiotic absorption",
     1, "Overprescribing antibiotics exerts selective pressure enabling resistant 'superbugs' to survive, rendering treatments ineffective."),

    ("jamb_eng_2018_10", "English Language", "Comprehension: Immunology", "2018",
     "A suitable title for the passage would be:",
     "The Manufacturing of Herbal Extracts",
     "Principles of Human Immunology, Vaccination, and the Threat of Antimicrobial Resistance",
     "Why Fever Should Never Be Treated",
     "The Economics of Private Hospitals in Africa",
     1, "The text provides a comprehensive overview of immune mechanics, vaccine immunology, and antibiotic resistance challenges."),

    # 11 - 15: Cloze Passage: Artificial Intelligence in Modern Society
    ("jamb_eng_2018_11", "English Language", "Cloze: Artificial Intelligence", "2018",
     "Artificial Intelligence (AI) is rapidly …11… [A. transforming B. stagnating C. diminishing D. abolishing] multiple sectors of modern global industry.",
     "transforming", "stagnating", "diminishing", "abolishing",
     0, "'Transforming' accurately describes the radical technological and operational shifts driven by AI."),

    ("jamb_eng_2018_12", "English Language", "Cloze: Artificial Intelligence", "2018",
     "Machine learning algorithms detect complex …12… [A. obstacles B. patterns C. interruptions D. conjectures] in vast volumes of data.",
     "obstacles", "patterns", "interruptions", "conjectures",
     1, "Machine learning models analyze big data to recognize intricate mathematical and behavioral 'patterns'."),

    ("jamb_eng_2018_13", "English Language", "Cloze: Artificial Intelligence", "2018",
     "In healthcare, AI assists radiologists in diagnosing life-threatening …13… [A. symptoms B. ailments C. prescriptions D. prognoses] with unprecedented accuracy.",
     "symptoms", "ailments", "prescriptions", "prognoses",
     1, "'Ailments' or diseases are detected through computer-vision analysis of medical scans."),

    ("jamb_eng_2018_14", "English Language", "Cloze: Artificial Intelligence", "2018",
     "However, ethicists warn about algorithmic …14… [A. neutrality B. bias C. clarity D. charity] reflecting historical societal prejudices.",
     "neutrality", "bias", "clarity", "charity",
     1, "Algorithmic bias occurs when training data perpetuates structural racial, gender, or socioeconomic discrimination."),

    ("jamb_eng_2018_15", "English Language", "Cloze: Artificial Intelligence", "2018",
     "Therefore, international regulatory frameworks are necessary to ensure …15… [A. hazardous B. malicious C. ethical D. secretive] deployment of AI tools.",
     "hazardous", "malicious", "ethical", "secretive",
     2, "'Ethical deployment' ensures artificial intelligence systems protect human dignity, privacy, and safety."),

    # 16 - 25: Prescribed UTME Prose: In Dependence (Sarah Ladipo Manyika)
    ("jamb_eng_2018_16", "English Language", "In Dependence: Sarah Ladipo Manyika", "2018",
     "In 'In Dependence', how does Tayo react to the racial microaggressions he encounters in Oxford society?",
     "He turns to physical violence and vandalism",
     "He responds with intellectual brilliance, calm dignity, and deep historical insight",
     "He drops out of Oxford and returns to Nigeria on the next cargo ship",
     "He denies his Nigerian heritage and adopts an English persona",
     1, "Tayo counters prejudiced attitudes through academic excellence, intellectual composure, and articulate discourse."),

    ("jamb_eng_2018_17", "English Language", "In Dependence: Sarah Ladipo Manyika", "2018",
     "What role does Modupe play in Tayo's life back in Nigeria?",
     "She is his first girlfriend whose relationship ends when he travels to England",
     "She is his legal defense lawyer in Lagos",
     "She becomes a university dean who employs him",
     "She is Vanessa's pen pal",
     0, "Modupe is Tayo's youthful love in Nigeria before his departure on his scholarship to Oxford."),

    ("jamb_eng_2018_18", "English Language", "In Dependence: Sarah Ladipo Manyika", "2018",
     "How does Vanessa's friendship with Jane differ from her relationship with Tayo?",
     "Jane encourages Vanessa to abandon journalism completely",
     "Jane represents conventional middle-class English perspectives while Tayo challenges Vanessa to understand post-colonial realities",
     "Jane marries Tayo's brother",
     "Jane joins the diplomatic service in South Africa",
     1, "Jane embodies mainstream British social expectations, whereas Tayo opens Vanessa's mind to anti-colonial thought."),

    ("jamb_eng_2018_19", "English Language", "In Dependence: Sarah Ladipo Manyika", "2018",
     "What socioeconomic transformation in Nigeria during the 1970s is reflected in the novel?",
     "The collapse of the agricultural groundnut pyramids",
     "The oil boom which brought sudden wealth, commercial ostentation, and pervasive corruption",
     "The immediate transition to nuclear power",
     "The complete elimination of poverty in rural communities",
     1, "The petrodollar boom generated unprecedented commercial extravagance alongside growing governance decay."),

    ("jamb_eng_2018_20", "English Language", "In Dependence: Sarah Ladipo Manyika", "2018",
     "Why does Tayo find it difficult to adjust to life in post-military Nigeria?",
     "He had forgotten how to speak his indigenous mother tongue",
     "Institutional decay, power cuts, university strikes, and repression stifle the vibrant intellectual life he envisioned",
     "He was refused employment by all academic institutions",
     "He was banned from leaving his native village",
     1, "The decline of educational funding and military authoritarianism deeply disillusion idealists like Tayo."),

    ("jamb_eng_2018_21", "English Language", "In Dependence: Sarah Ladipo Manyika", "2018",
     "How does Kike perceive her father, Tayo, as she grows up?",
     "As an infallible hero whom she idolizes without question",
     "With a mixture of affection, critique of his domestic mistakes, and admiration for his intellectual integrity",
     "She completely refuses to communicate with him",
     "She blames him for the political crisis in Nigeria",
     1, "Kike develops a mature, nuanced understanding of her father's complexities, flaws, and noble aspirations."),

    ("jamb_eng_2018_22", "English Language", "In Dependence: Sarah Ladipo Manyika", "2018",
     "What is the significance of the letters exchanged between Tayo and Vanessa across several decades?",
     "They contain secret financial bank account details",
     "They represent the unbroken emotional, intellectual, and spiritual thread connecting them despite geographical and marital separation",
     "They were forged by political opponents to blackmail Tayo",
     "They were published as a bestselling crime thriller in London",
     1, "Their letters serve as the novel's emotional spine, preserving their intimate bond over years of physical separation."),

    ("jamb_eng_2018_23", "English Language", "In Dependence: Sarah Ladipo Manyika", "2018",
     "What does Vanessa's decision to adopt a multiracial child symbolize?",
     "Her desire to escape from England",
     "Her practical commitment to transcending racial prejudice through personal action and unconditional love",
     "A requirement for her promotion at the journalism bureau",
     "A fulfillment of her father's dying wish",
     1, "Adopting a multiracial child demonstrates Vanessa's active rejection of racial categorizations and deep maternal love."),

    ("jamb_eng_2018_24", "English Language", "In Dependence: Sarah Ladipo Manyika", "2018",
     "In the novel, what does Oxford University symbolize for young colonial and post-colonial African scholars?",
     "A place of easy entertainment and leisure",
     "A citadel of imperial intellectual prestige that paradoxically fosters both empowerment and racial alienation",
     "An institution devoted to African traditional religion",
     "A trade market for West African agricultural exports",
     1, "Oxford offered unparalleled academic prestige while simultaneously exposing scholars to subtle imperial alienation."),

    ("jamb_eng_2018_25", "English Language", "In Dependence: Sarah Ladipo Manyika", "2018",
     "The overall narrative trajectory of 'In Dependence' conveys that:",
     "Genuine love and human connection can endure across cultural chasms, historical tribulations, and decades of separation",
     "Interracial relationships are doomed to perpetual misery",
     "Personal desires must always be sacrificed for political prestige",
     "Leaving one's homeland permanently is the only solution to adversity",
     0, "The novel celebrates endurance, forgiveness, and the timeless triumph of authentic human affection across social boundaries."),

    # 26 - 35: Antonyms (Choose the option opposite in meaning)
    ("jamb_eng_2018_26", "English Language", "Antonyms", "2018",
     "Choose the option opposite in meaning: The governor was *lauded* for his transparent administration.",
     "applauded", "criticized and condemned", "commended", "praised",
     1, "'Lauded' means praised highly; its direct antonym is 'criticized and condemned'."),

    ("jamb_eng_2018_27", "English Language", "Antonyms", "2018",
     "Choose the option opposite in meaning: The company made *exorbitant* profits during the border closure.",
     "excessive", "modest and reasonable", "outrageous", "colossal",
     1, "'Exorbitant' means unreasonably high; its direct antonym is 'modest and reasonable'."),

    ("jamb_eng_2018_28", "English Language", "Antonyms", "2018",
     "Choose the option opposite in meaning: The witness remained *obstinate* under intense cross-examination.",
     "stubborn", "flexible and yielding", "adamant", "resolute",
     1, "'Obstinate' means stubbornly refusing to change one's opinion; its antonym is 'flexible and yielding'."),

    ("jamb_eng_2018_29", "English Language", "Antonyms", "2018",
     "Choose the option opposite in meaning: The police discovered a *clandestine* weapon manufacturing laboratory.",
     "covert", "open and public", "secret", "hidden",
     1, "'Clandestine' means conducted with secrecy; its antonym is 'open and public'."),

    ("jamb_eng_2018_30", "English Language", "Antonyms", "2018",
     "Choose the option opposite in meaning: His *reckless* behavior brought shame to the community.",
     "prudent and cautious", "heedless", "rash", "wild",
     0, "'Reckless' means heedless of consequences; its direct antonym is 'prudent and cautious'."),

    ("jamb_eng_2018_31", "English Language", "Antonyms", "2018",
     "Choose the option opposite in meaning: The applicant had *scanty* credentials for the engineering post.",
     "meager", "comprehensive and abundant", "insufficient", "scant",
     1, "'Scanty' means barely sufficient or deficient; its antonym is 'abundant' or comprehensive."),

    ("jamb_eng_2018_32", "English Language", "Antonyms", "2018",
     "Choose the option opposite in meaning: She spoke with *diffidence* before the royal panel.",
     "timidity", "boldness and confidence", "hesitancy", "humility",
     1, "'Diffidence' means shyness or lack of self-confidence; its direct antonym is 'boldness and confidence'."),

    ("jamb_eng_2018_33", "English Language", "Antonyms", "2018",
     "Choose the option opposite in meaning: The general launched a *punitive* expedition against the rebel enclave.",
     "retaliatory", "rewarding and restorative", "penal", "disciplinary",
     1, "'Punitive' means intended as punishment; its antonym is 'restorative' or rewarding."),

    ("jamb_eng_2018_34", "English Language", "Antonyms", "2018",
     "Choose the option opposite in meaning: The new recruit was *gullible* and fell for the internet fraud.",
     "naive", "astute and skeptical", "credulous", "trusting",
     1, "'Gullible' means easily persuaded to believe something; its direct antonym is 'astute and skeptical'."),

    ("jamb_eng_2018_35", "English Language", "Antonyms", "2018",
     "Choose the option opposite in meaning: The economic forecast is *auspicious* for new startups.",
     "promising", "inauspicious and ominous", "favorable", "bright",
     1, "'Auspicious' means giving or being a sign of future success; its opposite is 'inauspicious and ominous'."),

    # 36 - 45: Synonyms (Choose the option nearest in meaning)
    ("jamb_eng_2018_36", "English Language", "Synonyms", "2018",
     "Choose the option nearest in meaning: The president gave his *assent* to the newly amended electoral bill.",
     "refusal", "approval and consent", "veto", "criticism",
     1, "'Assent' signifies official agreement or concurrence; 'approval and consent'."),

    ("jamb_eng_2018_37", "English Language", "Synonyms", "2018",
     "Choose the option nearest in meaning: The detective found *incontrovertible* proof of the bank robbery.",
     "disputable", "indisputable and undeniable", "doubtful", "tentative",
     1, "'Incontrovertible' means not able to be denied or disputed; 'indisputable'."),

    ("jamb_eng_2018_38", "English Language", "Synonyms", "2018",
     "Choose the option nearest in meaning: The artist's work displayed *impeccable* craftsmanship.",
     "flawless and perfect", "shoddy", "crude", "mediocre",
     0, "'Impeccable' means in accordance with the highest standards; faultless and flawless."),

    ("jamb_eng_2018_39", "English Language", "Synonyms", "2018",
     "Choose the option nearest in meaning: The civil servants received *emoluments* commensurate with their experience.",
     "punishments", "salaries and remunerations", "tax deductions", "warnings",
     1, "'Emoluments' are compensations, fees, or salaries earned from employment."),

    ("jamb_eng_2018_40", "English Language", "Synonyms", "2018",
     "Choose the option nearest in meaning: The old professor lived an *indolent* retirement in the countryside.",
     "hectic", "lazy and inactive", "stressful", "adventurous",
     1, "'Indolent' means wanting to avoid activity or exertion; lazy."),

    ("jamb_eng_2018_41", "English Language", "Synonyms", "2018",
     "Choose the option nearest in meaning: The politician's speech was full of *platitudes*.",
     "profound truths", "cliches and trite remarks", "revolutionary ideas", "statistical facts",
     1, "'Platitudes' are remarks or statements that have been used too often to be interesting or thoughtful; clichés."),

    ("jamb_eng_2018_42", "English Language", "Synonyms", "2018",
     "Choose the option nearest in meaning: The storm was *imminent* as the sky turned dark grey.",
     "impending and about to happen", "distant", "unlikely", "receding",
     0, "'Imminent' means about to happen; impending."),

    ("jamb_eng_2018_43", "English Language", "Synonyms", "2018",
     "Choose the option nearest in meaning: The tribunal gave a *unanimous* verdict on the election petition.",
     "divided", "concordant and undisputed", "contentious", "secret",
     1, "'Unanimous' means held or arrived at by the consensus of all parties involved."),

    ("jamb_eng_2018_44", "English Language", "Synonyms", "2018",
     "Choose the option nearest in meaning: The young entrepreneur possessed *remarkable* business acumen.",
     "ordinary", "shrewdness and insight", "foolishness", "hesitation",
     1, "'Acumen' is the ability to make good judgments and quick decisions, particularly in business."),

    ("jamb_eng_2018_45", "English Language", "Synonyms", "2018",
     "Choose the option nearest in meaning: The principal took a *compassionate* view of the student's plight.",
     "severe", "sympathetic and empathetic", "harsh", "indifferent",
     1, "'Compassionate' means feeling or showing sympathy and concern for others."),

    # 46 - 52: Lexis and Structure (Concord, Prepositions, Phrasal Verbs)
    ("jamb_eng_2018_46", "English Language", "Lexis and Structure", "2018",
     "The minister, as well as his aides, __ travelling to Abuja tomorrow.",
     "are", "is", "were", "have been",
     1, "Parenthetical adjunct phrases introduced by 'as well as' do not alter the number of the subject ('minister' is singular -> 'is')."),

    ("jamb_eng_2018_47", "English Language", "Lexis and Structure", "2018",
     "You must abide __ the regulations laid down by the examination board.",
     "with", "by", "to", "in",
     1, "The idiom is 'abide by' meaning to comply with rules or decisions."),

    ("jamb_eng_2018_48", "English Language", "Lexis and Structure", "2018",
     "The car broke __ on the expressway during the rainstorm.",
     "off", "down", "out", "away",
     1, "The phrasal verb 'break down' signifies mechanical failure or cessation of function."),

    ("jamb_eng_2018_49", "English Language", "Lexis and Structure", "2018",
     "No sooner had the referee blown the whistle __ the crowd invaded the pitch.",
     "when", "than", "then", "before",
     1, "Correlative conjunction rule: 'No sooner ... than' (compared to 'Hardly/Scarcely ... when')."),

    ("jamb_eng_2018_50", "English Language", "Lexis and Structure", "2018",
     "She has a penchant __ wearing bright traditional attires.",
     "in", "for", "at", "with",
     1, "The noun 'penchant' collogates with the preposition 'for': 'a penchant for'."),

    ("jamb_eng_2018_51", "English Language", "Lexis and Structure", "2018",
     "One of the suspects __ arrested by the police last night.",
     "were", "was", "are", "have been",
     1, "'One of the [plural noun]' takes a singular verb agreeing with 'One': 'was'."),

    ("jamb_eng_2018_52", "English Language", "Lexis and Structure", "2018",
     "He behaves as if he __ the owner of the mansion.",
     "is", "were", "has been", "was",
     1, "Subjunctive mood for hypothetical or counterfactual clauses after 'as if / as though' requires 'were' regardless of person."),

    # 53 - 60: Oral English (Vowels, Consonants, Rhymes, Syllable Stress, Emphatic Stress)
    ("jamb_eng_2018_53", "English Language", "Oral English: Vowels", "2018",
     "Choose the option with the same vowel sound as the underlined sound in 'bl<u>oo</u>d' (/ʌ/):",
     "mood", "flood", "fool", "book",
     1, "'Blood' (/blʌd/) contains the short central open-mid unrounded vowel /ʌ/, which identically matches 'flood' (/flʌd/)."),

    ("jamb_eng_2018_54", "English Language", "Oral English: Consonants", "2018",
     "Choose the option with the same consonant sound as the underlined letter in '<u>g</u>entle' (/dʒ/):",
     "goat", "judge", "game", "gate",
     1, "Soft 'g' in 'gentle' represents the voiced postalveolar affricate /dʒ/, matching 'judge'."),

    ("jamb_eng_2018_55", "English Language", "Oral English: Silent Letters", "2018",
     "In which of the following words is the letter 'l' silent?",
     "salmon", "film", "silver", "filter",
     0, "In 'salmon' (/ˈsæm.ən/), the letter 'l' is completely silent."),

    ("jamb_eng_2018_56", "English Language", "Oral English: Rhymes", "2018",
     "Choose the word that rhymes with 'corps':",
     "corpse", "core", "cop", "corp",
     1, "'Corps' (military division) is pronounced /kɔː/, which rhymes with 'core' (/kɔː/)."),

    ("jamb_eng_2018_57", "English Language", "Oral English: Stress", "2018",
     "Choose the option with the correct stress placement: CONTRIBUTE",
     "CONtribute", "conTRIbute", "contriBUTE", "contribute",
     1, "Standard British pronunciation places primary stress on the second syllable: con-TRIB-ute (/kənˈtrɪb.juːt/)."),

    ("jamb_eng_2018_58", "English Language", "Oral English: Stress", "2018",
     "Choose the option with the correct stress placement: NATIONALITY",
     "NAtionality", "naTIOnality", "natioNALity", "nationaLIty",
     2, "Words ending with the suffix '-ity' take primary stress on the antepenultimate syllable: na-tio-NAL-i-ty."),

    ("jamb_eng_2018_59", "English Language", "Oral English: Emphatic Stress", "2018",
     "In the sentence: 'TOLU passed the chemistry exam with distinction', which question does this sentence answer?",
     "Did Tolu fail the chemistry exam with distinction?",
     "Who passed the chemistry exam with distinction?",
     "Did Tolu pass the physics exam with distinction?",
     "Did Tolu pass the chemistry exam barely?",
     1, "Emphatic stress on the subject 'TOLU' emphasizes who accomplished the feat."),

    ("jamb_eng_2018_60", "English Language", "Oral English: Emphatic Stress", "2018",
     "In the sentence: 'The doctor advised the patient to rest for TWO WEEKS', which question does this sentence answer?",
     "Did the nurse advise the patient to rest for two weeks?",
     "Did the doctor advise the patient to exercise for two weeks?",
     "How long did the doctor advise the patient to rest?",
     "Did the doctor advise the visitor to rest for two weeks?",
     2, "Emphatic stress on the duration 'TWO WEEKS' specifies the time period prescribed.")
]

write_bank_file("JambEnglish2018CompleteQuestionBank", "2018", e2018, 60)

print("All 2016, 2017, and 2018 English Question Banks generated successfully!")
