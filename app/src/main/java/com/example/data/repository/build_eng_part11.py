import sys
from parse_eng_helper import write_bank_file

questions = [
    # 1997-2001 Grammar & Lexis
    {
        "id": "eng_1997_lex_01",
        "topic": "Grammar: Prepositional Collocations ('Comply with')",
        "year": "1997",
        "text": "Choose the correct preposition to complete the sentence:\n'All citizens are required to comply _____ the safety regulations.'",
        "opts": ["to", "with", "by", "for"],
        "ans": 1,
        "exp": "'Comply' always takes the preposition 'with', whereas 'abide' takes 'by' and 'adhere' takes 'to'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1997 • Q32"
    },
    {
        "id": "eng_1997_lex_02",
        "topic": "Lexis: Synonyms ('Pragmatic')",
        "year": "1997",
        "text": "Choose the word nearest in meaning to PRAGMATIC:",
        "opts": ["Practical", "Theoretical", "Idealistic", "Unrealistic"],
        "ans": 0,
        "exp": "'Pragmatic' means dealing with things sensibly and realistically based on practical rather than theoretical considerations.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1997 • Q46"
    },
    {
        "id": "eng_1998_lex_01",
        "topic": "Grammar: Inversion with 'Seldom'",
        "year": "1998",
        "text": "Select the correct sentence structure:\n'Seldom _____ such an astounding display of athletic prowess.'",
        "opts": [
            "we have witnessed",
            "have we witnessed",
            "we witnessed",
            "did we witnessed"
        ],
        "ans": 1,
        "exp": "The negative/restrictive adverb 'Seldom' at the head of a clause triggers inversion of the subject and auxiliary verb: 'Seldom have we witnessed...'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1998 • Q55"
    },
    {
        "id": "eng_1998_lex_02",
        "topic": "Idioms: Bite the bullet",
        "year": "1998",
        "text": "Choose the option that best explains the idiom:\n'The company had to BITE THE BULLET and lay off ten workers.'",
        "opts": [
            "Face a painful situation with courage and fortitude",
            "Buy ammunition for protection",
            "Protest against management",
            "Seek financial assistance"
        ],
        "ans": 0,
        "exp": "'Bite the bullet' means to face a difficult or unpleasant situation with courage and accept inevitable hardship.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1998 • Q68"
    },
    {
        "id": "eng_1999_lex_01",
        "topic": "Grammar: Concord ('Neither of the two...')",
        "year": "1999",
        "text": "Choose the correct verb:\n'Neither of the two candidates _____ qualified for the job.'",
        "opts": ["are", "is", "were", "have been"],
        "ans": 1,
        "exp": "'Neither' as a pronoun takes a singular verb ('is') in formal standard English concord.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1999 • Q41"
    },
    {
        "id": "eng_1999_lex_02",
        "topic": "Lexis: Antonyms ('Meticulous')",
        "year": "1999",
        "text": "Choose the option opposite in meaning to METICULOUS:",
        "opts": ["Careless", "Thorough", "Painstaking", "Accurate"],
        "ans": 0,
        "exp": "'Meticulous' means showing great attention to detail; very careful and precise. The opposite is 'careless' or 'negligent'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1999 • Q54"
    },
    {
        "id": "eng_2000_lex_01",
        "topic": "Grammar: Subjunctive ('It is about time')",
        "year": "2000",
        "text": "Choose the grammatically correct completion:\n'It is about time we _____ our journey.'",
        "opts": ["start", "started", "should start", "must start"],
        "ans": 1,
        "exp": "The expressions 'it is time', 'it is high time', and 'it is about time' followed by a subject take a past subjunctive verb ('started').",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2000 • Q39"
    },
    {
        "id": "eng_2000_lex_02",
        "topic": "Idioms: At sixes and sevens",
        "year": "2000",
        "text": "Choose the best interpretation:\n'Since the manager resigned, the entire department has been AT SIXES AND SEVENS.'",
        "opts": [
            "Extremely organized and prosperous",
            "In a state of total confusion and disorder",
            "Working overtime every day",
            "Waiting for numbers"
        ],
        "ans": 1,
        "exp": "'At sixes and sevens' is an English idiom meaning in a state of confusion, disarray, or dispute.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2000 • Q61"
    },
    {
        "id": "eng_2001_lex_01",
        "topic": "Grammar: Prepositions ('Immune to')",
        "year": "2001",
        "text": "Fill in the blank with the appropriate preposition:\n'The newborn baby is immune _____ the infection.'",
        "opts": ["against", "to", "from", "with"],
        "ans": 1,
        "exp": "The adjective 'immune' standardly collocates with the preposition 'to' (immune to a disease/penalty).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2001 • Q48"
    },
    {
        "id": "eng_2001_lex_02",
        "topic": "Lexis: Synonyms ('Fastidious')",
        "year": "2001",
        "text": "Choose the word nearest in meaning to FASTIDIOUS:",
        "opts": ["Finicky", "Easy-going", "Careless", "Unconcerned"],
        "ans": 0,
        "exp": "'Fastidious' means very attentive to and concerned about accuracy and detail; hard to please; finicky.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2001 • Q60"
    },
    # 2002-2005 Grammar & Vocabulary
    {
        "id": "eng_2002_lex_01",
        "topic": "Grammar: Concord ('A pair of trousers')",
        "year": "2002",
        "text": "Choose the correct form of the verb:\n'A pair of trousers _____ lying on the bed.'",
        "opts": ["is", "are", "were", "have been"],
        "ans": 0,
        "exp": "While 'trousers' is plural, the subject of the clause is the singular noun phrase 'A pair', which takes the singular verb 'is'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2002 • Q35"
    },
    {
        "id": "eng_2003_lex_01",
        "topic": "Grammar: Phrasal Verbs ('Put up with')",
        "year": "2003",
        "text": "Choose the meaning of the underlined phrase:\n'I cannot PUT UP WITH such rudeness any longer.'",
        "opts": ["Tolerate or endure", "Encourage", "Report to authorities", "Ignore happily"],
        "ans": 0,
        "exp": "To 'put up with' means to tolerate, endure, or bear without complaint.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2003 • Q52"
    },
    {
        "id": "eng_2004_lex_01",
        "topic": "Lexis: Antonyms ('Arduous')",
        "year": "2004",
        "text": "Choose the option opposite in meaning to ARDUOUS:",
        "opts": ["Effortless", "Strenuous", "Laborious", "Taxing"],
        "ans": 0,
        "exp": "'Arduous' means involving or requiring strenuous effort; difficult and tiring. The opposite is 'effortless' or 'easy'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2004 • Q45"
    },
    {
        "id": "eng_2005_lex_01",
        "topic": "Grammar: Concord with 'As well as'",
        "year": "2005",
        "text": "Choose the correct verb form:\n'The captain, as well as his crew members, _____ rescued from the wreckage.'",
        "opts": ["was", "were", "are", "have been"],
        "ans": 0,
        "exp": "Phrases introduced by 'as well as', 'together with', 'in addition to' do not compound the subject; the verb agrees with the primary subject 'The captain' (singular 'was').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2005 • Q37"
    },
    {
        "id": "eng_2005_lex_02",
        "topic": "Oral English: Syllable Stress ('Photographer')",
        "year": "2005",
        "text": "Choose the appropriate primary stress pattern for the word 'PHOTOGRAPHER':",
        "opts": ["PHOtographer", "phoTOgrapher", "photogRApher", "photograPHER"],
        "ans": 1,
        "exp": "In 'photographer' /fəˈtɒɡrəfə/, primary stress falls on the second syllable: pho-TO-grapher (unlike 'PHOtograph').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2005 • Q95"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart11", questions)
print("Part 11 built successfully")
