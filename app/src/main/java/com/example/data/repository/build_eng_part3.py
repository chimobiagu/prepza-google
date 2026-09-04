import sys
from parse_eng_helper import write_bank_file

questions = [
    # 1986 Lexis & Structure
    {
        "id": "eng_1986_q26",
        "topic": "Antonyms: Flexible",
        "year": "1986",
        "text": "Choose the option opposite in meaning to the underlined word:\n'Mr. Jack was most flexible in his instructions.'",
        "opts": ["Rigid", "Correct", "Stiff", "Upright"],
        "ans": 0,
        "exp": "'Flexible' means adaptable or compromising. Its exact opposite in policy/instructions is 'rigid' (unbending/inflexible).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q26"
    },
    {
        "id": "eng_1986_q27",
        "topic": "Antonyms: Temporary",
        "year": "1986",
        "text": "Choose the option opposite in meaning to the underlined word:\n'The university has offered temporary accommodation for staff.'",
        "opts": ["Popular", "Permanent", "Recognized", "Regular"],
        "ans": 1,
        "exp": "'Temporary' means lasting for only a limited period of time; the direct opposite is 'permanent'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q27"
    },
    {
        "id": "eng_1986_q28",
        "topic": "Antonyms: Coarse",
        "year": "1986",
        "text": "Choose the option opposite in meaning to the underlined word:\n'Mary complained that she slept on the coarse floor.'",
        "opts": ["Smooth", "Rough", "Bad", "Harsh"],
        "ans": 0,
        "exp": "'Coarse' means rough or harsh in texture; its opposite is 'smooth'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q28"
    },
    {
        "id": "eng_1986_q29",
        "topic": "Antonyms: Spectators",
        "year": "1986",
        "text": "Choose the option opposite in meaning to the underlined word:\n'Jim was one of the spectators at the concert.'",
        "opts": ["Ushers", "Judges", "Guests", "Performers"],
        "ans": 3,
        "exp": "'Spectators' are people who watch a show or game; their opposite is 'performers' who act on stage.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q29"
    },
    {
        "id": "eng_1986_q30",
        "topic": "Antonyms: Declined",
        "year": "1986",
        "text": "Choose the option opposite in meaning to the underlined word:\n'The Governor declined to give audience to the journalist.'",
        "opts": ["Ignored", "Accepted", "Forgot", "Rejected"],
        "ans": 1,
        "exp": "'Declined' means politely refused; the antonym is 'accepted'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q30"
    },
    {
        "id": "eng_1986_q32",
        "topic": "Antonyms: Soothed",
        "year": "1986",
        "text": "Choose the option opposite in meaning to the underlined word:\n'The lotion recommended by the doctor soothed Okon\\'s aching tooth.'",
        "opts": ["Calmed", "Extracted", "Excited", "Worsened"],
        "ans": 3,
        "exp": "'Soothed' means relieved or reduced pain; the antonym is 'worsened' or aggravated.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q32"
    },
    {
        "id": "eng_1986_q39",
        "topic": "Synonyms: Niggardly",
        "year": "1986",
        "text": "Choose the option nearest in meaning to the underlined word:\n'The rich citizens are often niggardly in their ways.'",
        "opts": ["Beggarly", "Sordid", "Miserly", "Pompous"],
        "ans": 2,
        "exp": "'Niggardly' means ungenerous with money or resources; stingy or miserly.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1986 • Q39"
    },
    {
        "id": "eng_1986_q40",
        "topic": "Synonyms: Decline",
        "year": "1986",
        "text": "Choose the option nearest in meaning to the underlined word:\n'The musician\\'s popularity is beginning to decline.'",
        "opts": ["Change", "Wane", "Slide", "Disappear"],
        "ans": 1,
        "exp": "'Wane' means to decrease gradually in vigor, power, or extent (decline).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1986 • Q40"
    },
    {
        "id": "eng_1986_q44",
        "topic": "Idioms: Nipped in the bud",
        "year": "1986",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'His attempts were nipped in the bud.'",
        "opts": ["Unsuccessful", "Cut short at an early stage", "Frustrated", "Disqualified"],
        "ans": 1,
        "exp": "To 'nip something in the bud' means to suppress or stop it at an early development stage before it can mature.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q44"
    },
    {
        "id": "eng_1986_q46",
        "topic": "Idioms: Watch it",
        "year": "1986",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'\"Watch it! You could be followed,\" said the robber.'",
        "opts": ["Look around", "Be sober", "Be vigilant/careful", "Look out"],
        "ans": 2,
        "exp": "'Watch it' is an imperative idiom meaning be careful, on guard, or vigilant.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q46"
    },
    {
        "id": "eng_1986_q54",
        "topic": "Idioms: Off the record",
        "year": "1986",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'The pressman said that his interview with the President was off the record.'",
        "opts": [
            "Not written in government record books",
            "Not intended for publication",
            "Not recorded on tape",
            "Confidential to only civil servants"
        ],
        "ans": 1,
        "exp": "'Off the record' refers to information given in confidence and not intended to be officially published or quoted.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1986 • Q54"
    },
    {
        "id": "eng_1986_q61",
        "topic": "Idioms: Olive branch",
        "year": "1986",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'The new religious leader hands out an olive branch.'",
        "opts": ["Sues for peace", "Gives out branches of tree", "Challenges opponents to a fight", "Blesses his congregation"],
        "ans": 0,
        "exp": "To 'hold/hand out an olive branch' is a universal idiom meaning to offer peace or reconciliation.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q61"
    },
    {
        "id": "eng_1986_q63",
        "topic": "Idioms: Cooked the books",
        "year": "1986",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'The accounts clerk was jailed because he cooked the books.'",
        "opts": ["Set fire to the account books", "Sold the books for money", "Falsified the accounts for personal advantage", "Destroyed the records"],
        "ans": 2,
        "exp": "To 'cook the books' means to fraudulently manipulate or falsify financial records.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1986 • Q63"
    },
    {
        "id": "eng_1986_q64",
        "topic": "Vocabulary: Herculean",
        "year": "1986",
        "text": "Choose the option nearest in meaning to the underlined word:\n'The task was herculean.'",
        "opts": ["Irregular", "Related to mythology", "Extremely demanding and difficult", "Stimulating"],
        "ans": 2,
        "exp": "A 'herculean' task is one requiring immense strength, courage, or extraordinary effort.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1986 • Q64"
    },
    {
        "id": "eng_1986_q70",
        "topic": "Spelling: Trafficking",
        "year": "1986",
        "text": "Choose the word with the correct spelling to fill the gap:\n'Four persons accused of currency _____ are being held by security agents.'",
        "opts": ["traficking", "traviking", "trafficking", "traffiking"],
        "ans": 2,
        "exp": "The verb 'traffic' adds 'k' before '-ing' or '-ed', resulting in the correct spelling 'trafficking'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1986 • Q70"
    },
    # 1988 & 1991 Lexis & Structure
    {
        "id": "eng_1988_q51",
        "topic": "Vocabulary: Crestfallen",
        "year": "1988",
        "text": "Choose the option nearest in meaning to the underlined word:\n'The news of his performance in the sessional examination has made Okechukwu crestfallen.'",
        "opts": ["Highly irritable", "Dejected and disheartened", "Elated", "Pompous"],
        "ans": 1,
        "exp": "'Crestfallen' means sad, dejected, and disappointed after experiencing a setback.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1988 • Q51"
    },
    {
        "id": "eng_1988_q54",
        "topic": "Vocabulary: Penultimate",
        "year": "1988",
        "text": "Choose the option nearest in meaning to the underlined word:\n'I am yet to write the penultimate paragraph of my essay.'",
        "opts": ["Last but one", "Third to the last", "Concluding", "Introductory"],
        "ans": 0,
        "exp": "'Penultimate' specifically denotes the second to last (last but one) item in a series.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1988 • Q54"
    },
    {
        "id": "eng_1988_q58",
        "topic": "Vocabulary: Predominantly",
        "year": "1988",
        "text": "Choose the option nearest in meaning to the underlined word:\n'Nigeria, like most other African countries, is predominantly agricultural.'",
        "opts": ["Mainly/chiefly", "Certainly", "Entirely", "Undoubtedly"],
        "ans": 0,
        "exp": "'Predominantly' means mainly, primarily, or for the most part.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1988 • Q58"
    },
    {
        "id": "eng_1988_q64",
        "topic": "Idioms: Above board",
        "year": "1988",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'To be above board is to be _____.'",
        "opts": ["Afloat", "On top of a plank", "Honorable and above suspicion", "The chairman of a board"],
        "ans": 2,
        "exp": "'Above board' means legitimate, honest, and completely above suspicion.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1988 • Q64"
    },
    {
        "id": "eng_1988_q71",
        "topic": "Idioms: White elephant",
        "year": "1988",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'The government should stop white elephant projects.'",
        "opts": [
            "Projects in which elephants are preserved",
            "High-cost projects with low or no utility value",
            "Projects for painting buildings white",
            "Low-cost projects with high utility value"
        ],
        "ans": 1,
        "exp": "A 'white elephant' is an enterprise or possession that is useless or costly to maintain and out of proportion to its worth.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1988 • Q71"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart3", questions)
print("Part 3 built successfully")
