import sys
from parse_eng_helper import write_bank_file

questions = [
    # 1978 Grammar & Lexis
    {
        "id": "eng_1978_lex_01",
        "topic": "Lexis: Synonyms ('Prodigal')",
        "year": "1978",
        "text": "Choose the option nearest in meaning to the capitalized word:\n'He was warned against his PRODIGAL habits.'",
        "opts": ["Extravagant", "Frugal", "Generous", "Stingy"],
        "ans": 0,
        "exp": "'Prodigal' means spending money or resources freely and recklessly; wastefully extravagant.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q31"
    },
    {
        "id": "eng_1978_lex_02",
        "topic": "Grammar: Prepositions ('Accused of')",
        "year": "1978",
        "text": "Fill in the blank with the most appropriate word:\n'The suspect was accused _____ stealing the company car.'",
        "opts": ["for", "with", "of", "about"],
        "ans": 2,
        "exp": "The verb 'accused' always collocates with the preposition 'of' (accused of something), whereas 'charge' takes 'with'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q45"
    },
    {
        "id": "eng_1978_lex_03",
        "topic": "Grammar: Phrasal Verbs ('Call off')",
        "year": "1978",
        "text": "Choose the correct interpretation:\n'Because of the torrential rain, the football match was CALLED OFF.'",
        "opts": ["Postponed to later today", "Cancelled entirely", "Started immediately", "Relocated"],
        "ans": 1,
        "exp": "To 'call off' an event means to cancel it, whereas to 'call on' means to visit or request, and 'put off' means to postpone.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q52"
    },
    {
        "id": "eng_1978_lex_04",
        "topic": "Grammar: Subjunctive ('Lest')",
        "year": "1978",
        "text": "Choose the option that best completes the sentence:\n'He worked day and night lest he _____ the examination.'",
        "opts": ["should fail", "will fail", "fails", "failed"],
        "ans": 0,
        "exp": "'Lest' expresses fear or prevention and is formally followed by the subjunctive 'should + base verb' or the bare infinitive.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1978 • Q63"
    },
    {
        "id": "eng_1978_lex_05",
        "topic": "Grammar: Question Tags",
        "year": "1978",
        "text": "Select the correct question tag:\n'She rarely arrives late to school, _____?'",
        "opts": ["does she", "doesn't she", "is she", "isn't she"],
        "ans": 0,
        "exp": "Adverbs with negative meaning like 'rarely', 'seldom', 'scarcely', and 'barely' make the statement negative, requiring a positive question tag: 'does she?'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q74"
    },
    # 1979 Grammar & Structure
    {
        "id": "eng_1979_lex_01",
        "topic": "Grammar: Subject-Verb Concord ('Neither... nor')",
        "year": "1979",
        "text": "Choose the correct option to fill the blank:\n'Neither the teacher nor the students _____ present at the auditorium.'",
        "opts": ["was", "were", "is", "are being"],
        "ans": 1,
        "exp": "With 'neither... nor', the verb agrees in number with the subject closer to it (proximity rule). 'Students' is plural, so the past plural verb 'were' is correct.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q35"
    },
    {
        "id": "eng_1979_lex_02",
        "topic": "Idioms: Burn the midnight oil",
        "year": "1979",
        "text": "Choose the option that best explains the underlined idiom:\n'If you want to pass this exam, you must BURN THE MIDNIGHT OIL.'",
        "opts": [
            "Use an oil lamp at night",
            "Study or work late into the night",
            "Waste fuel",
            "Sleep early"
        ],
        "ans": 1,
        "exp": "'Burn the midnight oil' is an idiomatic expression that means to study or work until late at night.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1979 • Q48"
    },
    {
        "id": "eng_1979_lex_03",
        "topic": "Grammar: Pronoun Case ('Between you and me')",
        "year": "1979",
        "text": "Choose the grammatically correct sentence:",
        "opts": [
            "Between you and I, this secret must not be revealed.",
            "Between you and me, this secret must not be revealed.",
            "Between you and he, this secret must not be revealed.",
            "Between you and they, this secret must not be revealed."
        ],
        "ans": 1,
        "exp": "'Between' is a preposition, and prepositions require object pronouns ('me', 'him', 'them', 'us'). Therefore, 'between you and me' is grammatically correct.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q60"
    },
    {
        "id": "eng_1979_lex_04",
        "topic": "Lexis: Antonyms ('Audacious')",
        "year": "1979",
        "text": "Choose the option opposite in meaning to the word AUDACIOUS:",
        "opts": ["Timid", "Courageous", "Bold", "Adventurous"],
        "ans": 0,
        "exp": "'Audacious' means showing a willingness to take surprisingly bold risks. The opposite is 'timid' (showing a lack of courage or easily frightened).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1979 • Q71"
    },
    {
        "id": "eng_1979_lex_05",
        "topic": "Grammar: Inversion ('No sooner... than')",
        "year": "1979",
        "text": "Choose the correct combination to complete the sentence:\n'No sooner _____ the house than it started raining.'",
        "opts": [
            "he had left",
            "had he left",
            "did he left",
            "he left"
        ],
        "ans": 1,
        "exp": "Negative adverbs at the beginning of a clause ('No sooner', 'Hardly', 'Scarcely') trigger subject-auxiliary inversion: 'No sooner had he left... than...'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1979 • Q82"
    },
    # 1980 Grammar & Vocabulary
    {
        "id": "eng_1980_lex_01",
        "topic": "Lexis: Collocations ('Make an amendment')",
        "year": "1980",
        "text": "Choose the most appropriate word:\n'The committee decided to _____ several amendments to the constitution.'",
        "opts": ["do", "make", "create", "effectuate"],
        "ans": 1,
        "exp": "In standard English collocation, one 'makes' an amendment (or an effort, a decision, a mistake), not 'does'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1980 • Q33"
    },
    {
        "id": "eng_1980_lex_02",
        "topic": "Grammar: Participles & Dangling Modifiers",
        "year": "1980",
        "text": "Identify the grammatically correct sentence without a dangling modifier:",
        "opts": [
            "Walking along the street, a falling mango hit John.",
            "Walking along the street, John was hit by a falling mango.",
            "Having eaten dinner, the plates were washed by Mary.",
            "Running to catch the bus, my book fell out."
        ],
        "ans": 1,
        "exp": "The introductory participial phrase 'Walking along the street' must logically modify the subject that follows immediately ('John', not the 'mango').",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1980 • Q54"
    },
    {
        "id": "eng_1980_lex_03",
        "topic": "Lexis: Synonyms ('Ephemeral')",
        "year": "1980",
        "text": "Choose the word nearest in meaning to EPHEMERAL:",
        "opts": ["Transitory", "Eternal", "Perpetual", "Enduring"],
        "ans": 0,
        "exp": "'Ephemeral' means lasting for a very short time. 'Transitory' is an exact synonym.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1980 • Q67"
    },
    {
        "id": "eng_1980_lex_04",
        "topic": "Grammar: Modal Auxiliaries ('Need not')",
        "year": "1980",
        "text": "Choose the option that best completes the sentence:\n'You _____ have washed those dishes; I had already cleaned them.'",
        "opts": ["need not", "could not", "must not", "would not"],
        "ans": 0,
        "exp": "'Need not have + past participle' denotes that an action was performed, but it was unnecessary.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1980 • Q78"
    },
    {
        "id": "eng_1980_lex_05",
        "topic": "Grammar: Plural of Compound Nouns",
        "year": "1980",
        "text": "What is the correct plural form of 'Commander-in-chief'?",
        "opts": [
            "Commander-in-chiefs",
            "Commanders-in-chief",
            "Commanders-in-chiefs",
            "Commander-ins-chief"
        ],
        "ans": 1,
        "exp": "For compound nouns joined by hyphens, the plural marker '-s' attaches to the principal noun component ('Commanders'), yielding 'Commanders-in-chief'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1980 • Q89"
    },
    # 1982 Grammar & Vocabulary
    {
        "id": "eng_1982_lex_01",
        "topic": "Idioms: A bone of contention",
        "year": "1982",
        "text": "Choose the option that best explains the underlined phrase:\n'The boundary between the two villages has always been A BONE OF CONTENTION.'",
        "opts": [
            "A source of peace",
            "A subject of dispute or argument",
            "A fertile piece of land",
            "A hidden treasure"
        ],
        "ans": 1,
        "exp": "A 'bone of contention' is a subject or issue over which there is continuing disagreement or dispute.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1982 • Q42"
    },
    {
        "id": "eng_1982_lex_02",
        "topic": "Grammar: Concord ('One of the students who...')",
        "year": "1982",
        "text": "Choose the correct form of the verb:\n'He is one of those students who _____ always punctual.'",
        "opts": ["is", "are", "was", "has been"],
        "ans": 1,
        "exp": "In the construction 'one of those [plural noun] who [verb]', the relative pronoun 'who' refers back to the plural noun 'students', thus requiring a plural verb 'are'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1982 • Q55"
    },
    {
        "id": "eng_1982_lex_03",
        "topic": "Lexis: Antonyms ('Taciturn')",
        "year": "1982",
        "text": "Choose the option opposite in meaning to TACITURN:",
        "opts": ["Loquacious", "Reserved", "Reticent", "Silent"],
        "ans": 0,
        "exp": "'Taciturn' means reserved or uncommunicative in speech; saying little. The antonym is 'loquacious' (talkative, garrulous).",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1982 • Q66"
    },
    {
        "id": "eng_1982_lex_04",
        "topic": "Grammar: Prepositions ('Prefer to')",
        "year": "1982",
        "text": "Choose the grammatically correct completion:\n'I prefer drinking coffee _____ tea.'",
        "opts": ["than", "to", "instead", "above"],
        "ans": 1,
        "exp": "The verb 'prefer' takes the preposition 'to' when comparing two nouns or gerunds (e.g. 'prefer X to Y').",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1982 • Q73"
    },
    {
        "id": "eng_1982_lex_05",
        "topic": "Grammar: Conditionals ('Had I known')",
        "year": "1982",
        "text": "Complete the third conditional clause:\n'Had I known about the party earlier, I _____ you.'",
        "opts": [
            "will have joined",
            "would have joined",
            "would join",
            "had joined"
        ],
        "ans": 1,
        "exp": "Inverted third conditional ('Had I known' = 'If I had known') requires 'would have + past participle' in the main clause.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1982 • Q85"
    },
    # 1983-1985 Grammar & Structure
    {
        "id": "eng_1983_lex_01",
        "topic": "Grammar: Adverbial Placement ('Scarcely... when')",
        "year": "1983",
        "text": "Complete the correlative conjunction pair:\n'Scarcely had the plane landed _____ the passengers began to unbuckle their seatbelts.'",
        "opts": ["than", "when", "then", "after"],
        "ans": 1,
        "exp": "'Scarcely' and 'Hardly' correlate with 'when', whereas 'No sooner' correlates with 'than'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1983 • Q47"
    },
    {
        "id": "eng_1983_lex_02",
        "topic": "Idioms: Turn a deaf ear",
        "year": "1983",
        "text": "Choose the option that best explains the idiom:\n'The principal TURNED A DEAF EAR to the students\\' demands.'",
        "opts": [
            "Could not hear because of ear illness",
            "Refused to listen or pay attention",
            "Listened very carefully",
            "Punished the students severely"
        ],
        "ans": 1,
        "exp": "To 'turn a deaf ear' means to deliberately refuse to listen, take notice of, or respond to someone.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1983 • Q58"
    },
    {
        "id": "eng_1984_lex_01",
        "topic": "Grammar: Concord ('The jury')",
        "year": "1984",
        "text": "Choose the correct form of the verb:\n'The jury _____ divided in their opinions regarding the verdict.'",
        "opts": ["was", "were", "is", "has been"],
        "ans": 1,
        "exp": "When a collective noun ('jury', 'committee') acts as separate individuals (indicated by 'divided in their opinions'), it takes a plural verb ('were').",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1984 • Q39"
    },
    {
        "id": "eng_1984_lex_02",
        "topic": "Lexis: Antonyms ('Inadvertent')",
        "year": "1984",
        "text": "Choose the option opposite in meaning to INADVERTENT:",
        "opts": ["Accidental", "Deliberate", "Unintentional", "Careless"],
        "ans": 1,
        "exp": "'Inadvertent' means not resulting from or achieved through deliberate planning; accidental. The opposite is 'deliberate' or 'intentional'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1984 • Q50"
    },
    {
        "id": "eng_1985_lex_01",
        "topic": "Grammar: Tag Questions with 'Let us'",
        "year": "1985",
        "text": "Choose the appropriate question tag for the sentence:\n'Let us go for a walk in the garden, _____?'",
        "opts": ["shall we", "will we", "can we", "won't we"],
        "ans": 0,
        "exp": "Imperative sentences starting with 'Let us' (or 'Let\\'s') take the tag 'shall we?'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1985 • Q62"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart9", questions)
print("Part 9 built successfully")
