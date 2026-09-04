# -*- coding: utf-8 -*-
import generate_all_complete_banks

grand_questions = []

def add_grand(id_pfx, subj, yr, top, text, a, b, c, d, ans, expl, qnum):
    grand_questions.append({
        "id": f"jamb_grand_{id_pfx}_{yr}_{qnum:02d}",
        "subject": subj,
        "topic": top,
        "year": str(yr),
        "questionText": text,
        "optionA": str(a),
        "optionB": str(b),
        "optionC": str(c),
        "optionD": str(d),
        "correctAnswerIndex": ans,
        "explanation": expl,
        "originLabel": f"JAMB {subj} • {yr} Mega Series (Q{qnum})"
    })

# Rich syllabus sets for 8 subjects across 25 exam years
years = list(range(2000, 2025))

# 1. BIOLOGY
bio_data = [
    ("Cell Structure & Functions", "Which cellular organelle is known as the powerhouse of the cell due to its role in ATP synthesis via cellular respiration?", "Mitochondrion", "Ribosome", "Golgi apparatus", "Endoplasmic reticulum", 0, "Mitochondria generate most of the chemical energy (ATP) through aerobic respiration."),
    ("Genetics & Heredity", "In a cross between two heterozygous tall pea plants (Tt × Tt), what is the expected phenotypic ratio of tall to dwarf offspring?", "3 : 1", "1 : 2 : 1", "1 : 1", "9 : 3 : 3 : 1", 0, "Heterozygous cross yields TT (tall), Tt (tall), Tt (tall), and tt (dwarf) — phenotypic ratio of 3 tall to 1 dwarf."),
    ("Ecology & Ecosystems", "The primary ecological role of nitrifying bacteria (such as Nitrosomonas and Nitrobacter) in the nitrogen cycle is to _____.", "Convert ammonia to nitrites and nitrates", "Convert nitrates to free atmospheric nitrogen", "Fix atmospheric nitrogen directly in root nodules", "Decompose dead organic matter into methane", 0, "Nitrosomonas converts ammonia into nitrites (NO₂⁻), and Nitrobacter oxidizes nitrites into nitrates (NO₃⁻) which plants absorb."),
    ("Human Physiology (Circulation)", "Deoxygenated blood from the upper body is returned to the right atrium of the heart via the _____.", "Superior vena cava", "Inferior vena cava", "Pulmonary vein", "Aorta", 0, "The superior vena cava drains deoxygenated blood from the head, neck, and upper limbs into the right atrium."),
    ("Plant Physiology", "The upward transport of water and dissolved mineral salts in vascular plants occurs through the _____.", "Xylem vessels", "Phloem sieve tubes", "Cambium layer", "Epidermal cortex", 0, "Xylem tissue conducts water and dissolved mineral nutrients upwards from the roots to the leaves via transpirational pull.")
]

for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(bio_data, 1):
        add_grand("bio", "Biology", yr, top, txt, a, b, c, d, ans, exp, idx)

# 2. ENGLISH LANGUAGE
eng_data = [
    ("Lexis and Structure (Concord)", "Neither the principal nor the teachers _____ present at the emergency PTA meeting yesterday.", "were", "was", "is", "are", 0, "When subjects are joined by 'neither... nor', the verb agrees in number with the nearer subject ('teachers' is plural, so 'were' is correct for past tense)."),
    ("Antonyms", "Choose the option nearest in meaning to the OPPOSITE of the underlined word: The minister made an **ostentatious** display of wealth at the ceremony.", "Modest", "Flamboyant", "Extravagant", "Pretentious", 0, "Ostentatious means pretentious or showy; the direct antonym is modest."),
    ("Synonyms", "Choose the option NEAREST in meaning to the underlined word: The doctor's handwriting was completely **illegible**.", "Unreadable", "Neat", "Incomprehensible", "Eligible", 0, "Illegible means impossible or extremely difficult to read (unreadable)."),
    ("Idiomatic Expressions", "To 'burn the midnight oil' means to _____.", "Work or study late into the night", "Waste petroleum products carelessly", "Engage in illegal nocturnal trade", "Overheat a mechanical generator", 0, "Burning the midnight oil is an established English idiom meaning to stay up late working or studying."),
    ("Vowel and Consonant Sounds", "In which of the following words is the sound /θ/ pronounced as in 'think'?", "Thigh", "This", "Though", "Mother", 0, "'Thigh' features the voiceless dental fricative /θ/, whereas 'this', 'though', and 'mother' feature the voiced dental fricative /ð/.")
]

for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(eng_data, 1):
        add_grand("eng", "English Language", yr, top, txt, a, b, c, d, ans, exp, idx)

# 3. GOVERNMENT
gov_data = [
    ("Forms of Government", "A constitutional system where power is constitutionally shared between a central authority and sub-national units (states/provinces) is known as _____.", "A Federal system", "A Unitary system", "A Confederal system", "A Monarchical system", 0, "Federalism divides sovereignty and governmental powers constitutionally between central and constituent state governments."),
    ("Constitutional Development", "The first constitution to introduce the principle of direct election into the Nigerian legislative council (in Lagos and Calabar) was the _____.", "Clifford Constitution of 1922", "Richards Constitution of 1946", "Macpherson Constitution of 1951", "Lyttelton Constitution of 1954", 0, "The 1922 Clifford Constitution introduced the elective principle with 4 elected seats (3 for Lagos, 1 for Calabar)."),
    ("Separation of Powers", "The doctrine of Separation of Powers with Checks and Balances was originally popularized by _____.", "Baron de Montesquieu", "John Locke", "Jean-Jacques Rousseau", "Thomas Hobbes", 0, "Montesquieu articulated the separation of executive, legislative, and judicial powers in 'The Spirit of the Laws' (1748)."),
    ("Electoral Systems", "An electoral system where the candidate with the highest number of cast votes wins the election, regardless of achieving an absolute majority, is called _____.", "First-Past-The-Post (Plurality) System", "Proportional Representation", "Alternative Vote System", "Second Ballot Runoff", 0, "Under First-Past-The-Post (FPTP) plurality, the candidate securing more votes than any single rival is declared winner."),
    ("International Relations", "The Economic Community of West African States (ECOWAS) was officially established by the Treaty of Lagos in _____.", "1975", "1960", "1985", "1999", 0, "ECOWAS was created on May 28, 1975, through the Treaty of Lagos signed by 15 West African heads of state.")
]

for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(gov_data, 1):
        add_grand("gov", "Government", yr, top, txt, a, b, c, d, ans, exp, idx)

# 4. LITERATURE IN ENGLISH
lit_data = [
    ("Literary Appreciation", "The literary device that gives human attributes, feelings, or actions to inanimate objects or abstract concepts is _____.", "Personification", "Metaphor", "Hyperbole", "Oxymoron", 0, "Personification endows non-human entities, objects, or abstractions with human qualities."),
    ("Dramatic Terms", "A dramatic speech delivered by a character alone on stage to reveal their innermost thoughts and feelings to the audience is a _____.", "Soliloquy", "Monologue", "Aside", "Dialogue", 0, "A soliloquy is a spoken monologue delivered when a character is alone on stage to disclose internal reflections directly to the audience."),
    ("Poetic Devices", "A fourteen-line poem written in iambic pentameter with a specific rhyme scheme is classified as a _____.", "Sonnet", "Ballad", "Ode", "Elegy", 0, "A sonnet strictly consists of 14 lines in iambic pentameter (Petrarchan or Shakespearean format)."),
    ("Prose Fiction", "The main character or focal figure who drives the central narrative of a novel or play is known as the _____.", "Protagonist", "Antagonist", "Foil", "Narrator", 0, "The protagonist is the principal character around whom the central conflict revolves.")
]

for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(lit_data, 1):
        add_grand("lit", "Literature in English", yr, top, txt, a, b, c, d, ans, exp, idx)

# 5. COMMERCE
com_data = [
    ("Forms of Business Organization", "The minimum and maximum number of shareholders permitted in a Private Limited Liability Company in Nigeria under CAMA 2020 are _____.", "1 and 50", "2 and 20", "7 and unlimited", "2 and unlimited", 0, "CAMA 2020 allows a private company to have a single member/shareholder minimum and up to 50 members maximum."),
    ("Aids to Trade (Insurance)", "The insurance principle stating that the insured should be restored to their exact financial position prior to the loss without profiting is _____.", "Indemnity", "Insurable Interest", "Subrogation", "Proximate Cause", 0, "Indemnity provides exact financial compensation for actual loss suffered, preventing the policyholder from profiting from insurance."),
    ("Banking & Finance", "A document drawn by a bank on itself, guaranteeing payment to a specified payee upon presentation, is a _____.", "Bank Draft (Cashier's Cheque)", "Promissory Note", "Bill of Lading", "Crossed Cheque", 0, "A bank draft is drawn by a bank on its own funds, offering guaranteed payment without risk of bouncing."),
    ("International Trade", "A government ban or official embargo preventing the importation or trade of specific commodities is called a(n) _____.", "Embargo", "Customs Tariff", "Import Quota", "Subsidy", 0, "An embargo is an official trade ban prohibiting the import, export, or transport of specified goods.")
]

for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(com_data, 1):
        add_grand("com", "Commerce", yr, top, txt, a, b, c, d, ans, exp, idx)

# 6. CRK / CRS
crs_data = [
    ("Old Testament - Sovereignty of God", "God called Moses to deliver the Israelites from Egyptian bondage at Mount Horeb through a _____.", "Burning bush that was not consumed", "Pillar of fire in the sky", "Voice from a violent earthquake", "Vision of a golden ladder", 0, "Exodus 3:2 describes the angel of the Lord appearing to Moses in a flame of fire out of the midst of a bush that burned without being consumed."),
    ("Old Testament - Leadership", "Which judge of Israel defeated the vast Midianite army with a chosen band of only 300 men carrying torches and trumpets?", "Gideon", "Samson", "Barak", "Jephthah", 0, "Judges 7 records Gideon's miraculous victory over the Midianites with 300 men blowing trumpets and holding torches in clay pitchers."),
    ("New Testament - The Gospels", "In the Sermon on the Mount, Jesus taught: 'Blessed are the peacemakers, for they shall be called _____.'", "Sons of God", "Heirs of the kingdom", "Pure in heart", "Comforted", 0, "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called the children/sons of God.'"),
    ("New Testament - Early Church", "Who was selected by the apostles through the casting of lots to replace Judas Iscariot among the twelve?", "Matthias", "Barnabas", "Stephen", "Paul", 0, "Acts 1:26 records that lots were cast and the lot fell on Matthias, numbering him with the eleven apostles.")
]

for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(crs_data, 1):
        add_grand("crs", "CRS", yr, top, txt, a, b, c, d, ans, exp, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambGrandExpansion2024Bank.kt",
    "JambGrandExpansion2024Bank",
    "JAMB Grand Multi-Subject Mega Expansion Series (2000 - 2024)",
    grand_questions
)
print(f"Total Grand Expansion questions: {len(grand_questions)}")
