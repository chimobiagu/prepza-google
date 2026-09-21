import sys
from parse_eng_helper import write_bank_file

questions = [
    # 1986-1990 Grammar & Lexis
    {
        "id": "eng_1986_lex_01",
        "topic": "Grammar: Indirect Speech & Backshifting",
        "year": "1986",
        "text": "Convert into reported speech:\n'\"I will travel tomorrow,\" Musa said.'",
        "opts": [
            "Musa said that he will travel tomorrow.",
            "Musa said that he would travel the following day.",
            "Musa said that he is travelling the next day.",
            "Musa said that he would travel tomorrow."
        ],
        "ans": 1,
        "exp": "In reported speech with past reporting verb ('said'), 'will' becomes 'would' and time adverbial 'tomorrow' changes to 'the following day' or 'the next day'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1986 • Q41"
    },
    {
        "id": "eng_1986_lex_02",
        "topic": "Lexis: Synonyms ('Ostentatious')",
        "year": "1986",
        "text": "Choose the word nearest in meaning to OSTENTATIOUS:",
        "opts": ["Showy", "Modest", "Humble", "Simple"],
        "ans": 0,
        "exp": "'Ostentatious' describes something characterized by vulgar or pretentious display, designed to impress. 'Showy' is an exact synonym.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q53"
    },
    {
        "id": "eng_1987_lex_01",
        "topic": "Grammar: Subjunctive ('Demand that...')",
        "year": "1987",
        "text": "Select the correct verb form:\n'The judge ordered that the prisoner _____ remanded in custody.'",
        "opts": ["is", "be", "was", "should have been"],
        "ans": 1,
        "exp": "Verbs of command, demand, or order take the present subjunctive (base form of the verb 'be'): 'ordered that the prisoner be remanded'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1987 • Q38"
    },
    {
        "id": "eng_1987_lex_02",
        "topic": "Idioms: Throw in the towel",
        "year": "1987",
        "text": "Choose the option that best explains the idiom:\n'After battling the illness for months, he refused to THROW IN THE TOWEL.'",
        "opts": [
            "Surrender or give up",
            "Go for laundry",
            "Accept medical advice",
            "Complain openly"
        ],
        "ans": 0,
        "exp": "To 'throw in the towel' is an idiom originating from boxing meaning to admit defeat or give up.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1987 • Q64"
    },
    {
        "id": "eng_1988_lex_01",
        "topic": "Grammar: Relative Pronoun ('Whom')",
        "year": "1988",
        "text": "Fill in the blank with the correct relative pronoun:\n'The candidate _____ the panel interviewed yesterday has been employed.'",
        "opts": ["who", "whom", "which", "whose"],
        "ans": 1,
        "exp": "'Whom' functions as the object of the verb 'interviewed' ('the panel interviewed him/her').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1988 • Q45"
    },
    {
        "id": "eng_1988_lex_02",
        "topic": "Lexis: Antonyms ('Benevolent')",
        "year": "1988",
        "text": "Choose the option opposite in meaning to BENEVOLENT:",
        "opts": ["Malevolent", "Generous", "Kind-hearted", "Charitable"],
        "ans": 0,
        "exp": "'Benevolent' means well-meaning and kindly. Its antonym is 'malevolent' (having or showing a wish to do evil to others).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1988 • Q59"
    },
    {
        "id": "eng_1989_lex_01",
        "topic": "Grammar: Phrasal Verbs ('Look down on')",
        "year": "1989",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'Wealthy individuals should not LOOK DOWN ON the poor.'",
        "opts": [
            "Observe from a high altitude",
            "Regard with contempt or disdain",
            "Offer financial assistance to",
            "Refuse to see"
        ],
        "ans": 1,
        "exp": "To 'look down on' someone means to consider oneself superior to that person; to treat with disdain or contempt.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1989 • Q52"
    },
    {
        "id": "eng_1989_lex_02",
        "topic": "Grammar: Correlative Conjunction ('Not only... but also')",
        "year": "1989",
        "text": "Choose the sentence that maintains parallel grammatical structure:",
        "opts": [
            "She not only plays the piano, but also the guitar.",
            "She plays not only the piano, but also the guitar.",
            "Not only she plays the piano, but also plays guitar.",
            "She plays not only the piano, and also guitar."
        ],
        "ans": 1,
        "exp": "Parallelism requires the parts of speech following 'not only' and 'but also' to be balanced ('not only the piano [noun phrase] but also the guitar [noun phrase]').",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1989 • Q77"
    },
    # 1990-1995 Grammar & Structure
    {
        "id": "eng_1990_lex_01",
        "topic": "Grammar: Gerunds vs Infinitives ('Look forward to')",
        "year": "1990",
        "text": "Choose the grammatically correct completion:\n'I look forward to _____ you at the conference.'",
        "opts": ["see", "seeing", "seen", "have seen"],
        "ans": 1,
        "exp": "In the phrasal verb 'look forward to', 'to' is a preposition (not an infinitive marker), which must be followed by a noun or gerund ('seeing').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1990 • Q36"
    },
    {
        "id": "eng_1990_lex_02",
        "topic": "Lexis: Synonyms ('Impeccable')",
        "year": "1990",
        "text": "Choose the word nearest in meaning to IMPECCABLE:",
        "opts": ["Faultless", "Defective", "Careless", "Imperfect"],
        "ans": 0,
        "exp": "'Impeccable' means in accordance with the highest standards; faultless, flawless, or spotless.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1990 • Q48"
    },
    {
        "id": "eng_1992_lex_01",
        "topic": "Grammar: Conditional Clauses ('Unless')",
        "year": "1992",
        "text": "Choose the correct completion:\n'You will not succeed unless you _____ diligently.'",
        "opts": ["do not work", "work", "worked", "will work"],
        "ans": 1,
        "exp": "'Unless' already means 'if not' (negative condition). Adding another negative ('do not work') creates an incorrect double negative. Therefore, 'work' is correct.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1992 • Q44"
    },
    {
        "id": "eng_1993_lex_01",
        "topic": "Idioms: Take with a pinch of salt",
        "year": "1993",
        "text": "Choose the option that best interprets the idiom:\n'You must take all rumors concerning the election WITH A PINCH OF SALT.'",
        "opts": [
            "Swallow with table salt",
            "Listen with skepticism and doubt",
            "Accept as absolute truth",
            "Reject outrightly without thought"
        ],
        "ans": 1,
        "exp": "To take something 'with a pinch/grain of salt' means to maintain a degree of skepticism or not accept it as completely accurate.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1993 • Q56"
    },
    {
        "id": "eng_1994_lex_01",
        "topic": "Grammar: Concord ('Every one of the boys...')",
        "year": "1994",
        "text": "Choose the correct verb form:\n'Every one of the boys _____ given a prize at the assembly.'",
        "opts": ["was", "were", "are", "have been"],
        "ans": 0,
        "exp": "The indefinite pronoun 'Every one' is grammatically singular and takes a singular verb 'was'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1994 • Q40"
    },
    {
        "id": "eng_1995_lex_01",
        "topic": "Lexis: Antonyms ('Gregarious')",
        "year": "1995",
        "text": "Choose the option opposite in meaning to GREGARIOUS:",
        "opts": ["Sociable", "Reclusive", "Outgoing", "Friendly"],
        "ans": 1,
        "exp": "'Gregarious' means fond of company; sociable. The opposite is 'reclusive' or 'solitary'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1995 • Q52"
    },
    {
        "id": "eng_1995_lex_02",
        "topic": "Grammar: Prepositions ('Congratulate on')",
        "year": "1995",
        "text": "Fill in the blank with the appropriate preposition:\n'We congratulated him _____ his remarkable achievement.'",
        "opts": ["for", "on", "about", "with"],
        "ans": 1,
        "exp": "The verb 'congratulate' standardly pairs with the preposition 'on' (congratulate someone on something).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1995 • Q68"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart10", questions)
print("Part 10 built successfully")
