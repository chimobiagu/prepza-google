import sys
from parse_eng_helper import write_bank_file

questions = [
    # 2016-2020 Modern Exam Patterns
    {
        "id": "eng_2016_lex_01",
        "topic": "Lexis: Antonyms ('Treacherous')",
        "year": "2016",
        "text": "Choose the option opposite in meaning to TREACHEROUS:\n'The guide warned us about the treacherous mountain path.'",
        "opts": ["Safe and reliable", "Dangerous", "Deceptive", "Perilous"],
        "ans": 0,
        "exp": "'Treacherous' means hazardous or presenting hidden, unpredictable dangers. The direct opposite is 'safe and reliable'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2016 • Q48"
    },
    {
        "id": "eng_2016_lex_02",
        "topic": "Grammar: Adverbial Clauses ('No matter how')",
        "year": "2016",
        "text": "Choose the most appropriate completion:\n'No matter how hard he tried, he _____ solve the riddle.'",
        "opts": ["could not", "cannot", "must not", "will not"],
        "ans": 0,
        "exp": "Because the subordinate clause is in the past tense ('tried'), the main clause must maintain past tense harmony ('could not').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2016 • Q59"
    },
    {
        "id": "eng_2017_lex_01",
        "topic": "Grammar: Prepositions ('In accordance with')",
        "year": "2017",
        "text": "Fill in the blank:\n'The project was executed in accordance _____ international best practices.'",
        "opts": ["with", "to", "by", "for"],
        "ans": 0,
        "exp": "The prepositional phrase is 'in accordance with' (in a way that agrees with a rule or standard).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2017 • Q36"
    },
    {
        "id": "eng_2017_lex_02",
        "topic": "Lexis: Synonyms ('Sagacious')",
        "year": "2017",
        "text": "Choose the word nearest in meaning to SAGACIOUS:",
        "opts": ["Wise", "Foolish", "Ignorant", "Naive"],
        "ans": 0,
        "exp": "'Sagacious' means having or showing keen mental discernment and good judgment; wise or shrewd.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2017 • Q52"
    },
    {
        "id": "eng_2018_lex_01",
        "topic": "Grammar: Concord ('The number of' vs 'A number of')",
        "year": "2018",
        "text": "Choose the correct verb form:\n'The number of applicants _____ increased significantly this year.'",
        "opts": ["has", "have", "are", "were"],
        "ans": 0,
        "exp": "'The number of' takes a singular verb ('has'), whereas 'A number of' takes a plural verb ('have').",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2018 • Q42"
    },
    {
        "id": "eng_2018_lex_02",
        "topic": "Oral English: Silent Letters ('Doubt')",
        "year": "2018",
        "text": "In which of the following words is the letter 'b' silent?",
        "opts": ["Subtle", "Obtain", "Combine", "Rubber"],
        "ans": 0,
        "exp": "In 'subtle' /ˈsʌt.əl/, the letter 'b' is completely silent.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2018 • Q89"
    },
    {
        "id": "eng_2019_lex_01",
        "topic": "Idioms: Call it a day",
        "year": "2019",
        "text": "Choose the correct meaning of the idiom:\n'After working for ten hours straight, the team decided to CALL IT A DAY.'",
        "opts": [
            "Stop working for the rest of the day",
            "Give a name to the day",
            "Work throughout the night",
            "Celebrate a birthday"
        ],
        "ans": 0,
        "exp": "To 'call it a day' is an idiomatic phrase meaning to stop what you are doing because you do not want to do any more or think you have done enough.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2019 • Q45"
    },
    {
        "id": "eng_2019_lex_02",
        "topic": "Oral English: Syllable Stress ('Electricity')",
        "year": "2019",
        "text": "Choose the syllable that carries the primary stress in 'ELECTRICITY':",
        "opts": ["e-lec-TRI-ci-ty", "E-lec-tri-ci-ty", "e-LEC-tri-ci-ty", "e-lec-tri-ci-TY"],
        "ans": 0,
        "exp": "Words ending in '-ity' have primary stress on the antepenultimate syllable (third from the end): e-lec-TRI-ci-ty.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2019 • Q72"
    },
    {
        "id": "eng_2020_lex_01",
        "topic": "Grammar: Double Negatives",
        "year": "2020",
        "text": "Select the standard English sentence that avoids an ungrammatical double negative:",
        "opts": [
            "I couldn't find my keys anywhere.",
            "I couldn't find my keys nowhere.",
            "I didn't see nobody at the park.",
            "She won't say nothing to anyone."
        ],
        "ans": 0,
        "exp": "Standard English requires 'anywhere' with the negative auxiliary 'couldn't'. 'Couldn't find nowhere' is a double negative.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2020 • Q39"
    },
    {
        "id": "eng_2020_lex_02",
        "topic": "Lexis: Antonyms ('Vociferous')",
        "year": "2020",
        "text": "Choose the word opposite in meaning to VOCIFEROUS:\n'The crowd made a vociferous protest against the policy.'",
        "opts": ["Muted and quiet", "Loud and clamorous", "Vehement", "Outspoken"],
        "ans": 0,
        "exp": "'Vociferous' means expressing opinions or feelings loudly and forcefully. Its antonym is 'muted and quiet' (or subdued).",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2020 • Q58"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart13", questions)
print("Part 13 built successfully")
