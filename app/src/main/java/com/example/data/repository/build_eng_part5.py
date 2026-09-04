import sys
from parse_eng_helper import write_bank_file

questions = [
    # 2005 & 2006 Lexis & Structure & Antonyms
    {
        "id": "eng_2005_q46",
        "topic": "Antonyms: Debilitated",
        "year": "2005",
        "text": "Choose the option opposite in meaning to the underlined word:\n'Prolonged strike action debilitated the industry.'",
        "opts": ["Strayed", "Invigorated", "Isolated", "Weakened"],
        "ans": 1,
        "exp": "'Debilitate' means to severely weaken. The exact antonym is 'invigorated' (strengthened or energized).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2005 • Q46"
    },
    {
        "id": "eng_2005_q47",
        "topic": "Antonyms: Plagiarized",
        "year": "2005",
        "text": "Choose the option opposite in meaning to the underlined word:\n'One of the students bought a plagiarized copy of the book.'",
        "opts": ["An annotated copy", "A used copy", "An original copy", "A revised copy"],
        "ans": 2,
        "exp": "'Plagiarized' means copied without attribution; its direct opposite is 'original'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2005 • Q47"
    },
    {
        "id": "eng_2005_q50",
        "topic": "Antonyms: Translucent",
        "year": "2005",
        "text": "Choose the option opposite in meaning to the underlined word:\n'The lamp shades were translucent.'",
        "opts": ["Transparent", "Opaque", "Intersected", "Luminous"],
        "ans": 1,
        "exp": "'Translucent' means permitting light to pass through. The antonym is 'opaque' (not letting any light through).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2005 • Q50"
    },
    {
        "id": "eng_2005_q51",
        "topic": "Synonyms: Unquenchable",
        "year": "2005",
        "text": "Choose the option nearest in meaning to the underlined word:\n'My niece has an unquenchable thirst for adventure stories.'",
        "opts": ["An inextinguishable", "A spurious", "An illegitimate", "A reduced"],
        "ans": 0,
        "exp": "'Unquenchable' means impossible to extinguish, satisfy, or quench (inextinguishable).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2005 • Q51"
    },
    {
        "id": "eng_2005_q60",
        "topic": "Idioms: A doddle",
        "year": "2005",
        "text": "Choose the option nearest in meaning to the underlined word:\n'The first round of the tournament was a doddle.'",
        "opts": ["Exasperating", "Very easy", "Balanced", "Dodgy"],
        "ans": 1,
        "exp": "A 'doddle' is an informal British/Commonwealth idiom for a very easy task.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2005 • Q60"
    },
    {
        "id": "eng_2005_q62",
        "topic": "Vocabulary: Fomenting",
        "year": "2005",
        "text": "Choose the option nearest in meaning to the underlined word:\n'They accused him of fomenting political unrest.'",
        "opts": ["Guiding", "Inciting and stirring up", "Discouraging", "Preventing"],
        "ans": 1,
        "exp": "'Foment' means to instigate, stir up, or incite trouble or rebellion.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2005 • Q62"
    },
    {
        "id": "eng_2005_q65",
        "topic": "Vocabulary: Severing",
        "year": "2005",
        "text": "Choose the option nearest in meaning to the underlined word:\n'The dispute between the two countries has resulted in the severing of diplomatic relations.'",
        "opts": ["Strengthening", "Breaking and cutting off", "Securing", "Swapping"],
        "ans": 1,
        "exp": "'Severing' means dividing, cutting off, or terminating completely.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2005 • Q65"
    },
    {
        "id": "eng_2005_q66",
        "topic": "Vocabulary: Convene",
        "year": "2005",
        "text": "Choose the option that best completes the gap:\n'The House and the Senate will at noon next Wednesday _____ to hear a special address by the President.'",
        "opts": ["Collude", "Convene", "Adjourn", "Rise"],
        "ans": 1,
        "exp": "'Convene' means to assemble or come together for a formal meeting or legislative sitting.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2005 • Q66"
    },
    {
        "id": "eng_2005_q77",
        "topic": "Vocabulary: Forte",
        "year": "2005",
        "text": "Choose the option that best completes the gap:\n'Cooking has never been Jumoke\\'s _____.'",
        "opts": ["Forte", "Recital", "Conduct", "Style"],
        "ans": 0,
        "exp": "A person's 'forte' is their strong suit, area of special skill, or talent.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2005 • Q77"
    },
    {
        "id": "eng_2005_q78",
        "topic": "Vocabulary: Concurrent",
        "year": "2005",
        "text": "Choose the option that best completes the gap:\n'When the strike is over, there will probably be an increase in wages and a _____ increase in prices.'",
        "opts": ["Chronic", "Sporadic", "Concordant", "Concurrent"],
        "ans": 3,
        "exp": "'Concurrent' means occurring, operating, or existing simultaneously at the same time.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2005 • Q78"
    },
    {
        "id": "eng_2005_q89",
        "topic": "Oral English: Consonant Sounds (/ʒ/)",
        "year": "2005",
        "text": "Choose the option that has the same consonant sound as the underlined sound in 'viSi_on' (/ʒ/):",
        "opts": ["Enclosure", "Instruction", "Mansion", "Nation"],
        "ans": 0,
        "exp": "'Enclosure' has the voiced postalveolar fricative /ʒ/ (/ɪnˈkləʊʒə/), matching 'vision' (/ˈvɪʒn/). 'Mansion' and 'nation' have /ʃ/.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2005 • Q89"
    },
    {
        "id": "eng_2005_q90",
        "topic": "Oral English: Silent Consonants (/n/ in 'gnash')",
        "year": "2005",
        "text": "Choose the option that has the same initial consonant sound as the word 'Gnash' (/n/):",
        "opts": ["Ring", "Forge", "New", "King"],
        "ans": 2,
        "exp": "In 'gnash', the 'g' is silent, starting with /n/ ('New' /njuː/).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2005 • Q90"
    },
    # 2007 & 2008 Lexis, Antonyms & Synonyms
    {
        "id": "eng_2007_q39",
        "topic": "Antonyms: Teetotaler",
        "year": "2007",
        "text": "Choose the option opposite in meaning to the underlined word:\n'Otokpa took after his late father who was a teetotaler.'",
        "opts": ["A drunkard", "Careless", "A disciplinarian", "Sober"],
        "ans": 0,
        "exp": "A 'teetotaler' is a person who completely abstains from alcoholic drinks; the direct antonym is 'a drunkard'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2007 • Q39"
    },
    {
        "id": "eng_2007_q46",
        "topic": "Antonyms: Munificent",
        "year": "2007",
        "text": "Choose the option opposite in meaning to the underlined word:\n'Lami and her husband are simply munificent.'",
        "opts": ["Wealthy", "Angry", "Happy", "Niggardly/miserly"],
        "ans": 3,
        "exp": "'Munificent' means remarkably generous or bountiful. Its antonym is 'niggardly' (stingy).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2007 • Q46"
    },
    {
        "id": "eng_2007_q47",
        "topic": "Antonyms: Conceited",
        "year": "2007",
        "text": "Choose the option opposite in meaning to the underlined word:\n'Mr. Adeyemo is quite a conceited young man.'",
        "opts": ["Resourceful", "Experienced", "Practical", "Unassuming and modest"],
        "ans": 3,
        "exp": "'Conceited' means excessively proud of oneself or vain. The opposite is 'unassuming' (humble/modest).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2007 • Q47"
    },
    {
        "id": "eng_2007_q57",
        "topic": "Synonyms: Panacea",
        "year": "2007",
        "text": "Choose the option nearest in meaning to the underlined word:\n'The panacea for a country\\'s economic mess lies in systematic planning and hard work.'",
        "opts": ["A cure-all / universal remedy", "Foresight", "Hope", "Trouble"],
        "ans": 0,
        "exp": "A 'panacea' is a solution or remedy for all difficulties or diseases (a cure-all).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2007 • Q57"
    },
    {
        "id": "eng_2007_q60",
        "topic": "Synonyms: Mélange",
        "year": "2007",
        "text": "Choose the option nearest in meaning to the underlined word:\n'Jankoli was dressed in an old assortment of clothes.'",
        "opts": ["Avalanche", "Homogeneity", "Sameness", "Mélange / medley"],
        "ans": 3,
        "exp": "An 'assortment' is a mixture or varied collection, which is synonymous with 'mélange'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2007 • Q60"
    },
    {
        "id": "eng_2007_q61",
        "topic": "Vocabulary: Apposite",
        "year": "2007",
        "text": "Choose the option nearest in meaning to the underlined word:\n'The director\\'s remark was extremely apposite to the issue being discussed.'",
        "opts": ["Appropriate and relevant", "Inconsequential", "Emphatic", "Adequate"],
        "ans": 0,
        "exp": "'Apposite' means apt, suitable, or strikingly appropriate in the circumstances.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2007 • Q61"
    },
    {
        "id": "eng_2007_q75",
        "topic": "Grammar: Preposition 'Made of' vs 'Made from'",
        "year": "2007",
        "text": "Choose the option that best completes the sentence:\n'Paper is made _____ wood pulp.'",
        "opts": ["on", "of", "from", "with"],
        "ans": 2,
        "exp": "'Made from' is used when the material undergoes a complete chemical or physical transformation into a new substance (wood pulp -> paper). 'Made of' is used when the original material remains recognizable.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2007 • Q75"
    },
    {
        "id": "eng_2007_q87",
        "topic": "Oral English: Vowel Sounds (Diphthong /eə/)",
        "year": "2007",
        "text": "Choose the option that has the same vowel sound as the word 'pEAr' (/eə/):",
        "opts": ["dear", "year", "there", "near"],
        "ans": 2,
        "exp": "'Pear' and 'there' both contain the centring diphthong /eə/ (/peə/ and /ðeə/). 'Dear', 'year', 'near' contain /ɪə/.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2007 • Q87"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart5", questions)
print("Part 5 built successfully")
