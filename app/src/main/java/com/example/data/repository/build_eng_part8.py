import sys
from parse_eng_helper import write_bank_file

questions = [
    # Oral English & Stress Patterns & Figures of Speech from 2000-2020
    {
        "id": "eng_oral_stress_01",
        "topic": "Oral English: Syllable Stress ('Jurisprudence')",
        "year": "2008",
        "text": "Choose the appropriate primary stress pattern for the word:\n'JURISPRUDENCE'",
        "opts": ["jUsprudence", "juRIsprudence", "jurisPRUdence", "jurispruDENCE"],
        "ans": 2,
        "exp": "In the four-syllable noun 'jurisprudence' /ˌdʒʊər.ɪsˈpruː.dəns/, the primary lexical stress falls on the third syllable 'PRU'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2008 • Q92"
    },
    {
        "id": "eng_oral_stress_02",
        "topic": "Oral English: Syllable Stress ('Departmental')",
        "year": "2017",
        "text": "Choose the appropriate primary stress pattern for the word:\n'DEPARTMENTAL'",
        "opts": ["DEpartmental", "dePARTmental", "departMENtal", "departmentAL"],
        "ans": 2,
        "exp": "In words ending with suffix '-al' like 'departmental' /ˌdiː.pɑːtˈmen.təl/, the primary stress falls on the syllable immediately preceding the suffix: 'MEN'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2017 • Q57"
    },
    {
        "id": "eng_oral_stress_03",
        "topic": "Oral English: Syllable Stress ('Demarcation')",
        "year": "2018",
        "text": "Choose the appropriate primary stress pattern for the word:\n'DEMARCATION'",
        "opts": ["demarCAtion", "DEmarcation", "deMARcation", "demarcaTION"],
        "ans": 0,
        "exp": "Words ending in '-tion' / '-sion' always carry primary stress on the penultimate (second to last) syllable: 'demar-CA-tion'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2018 • Q92"
    },
    {
        "id": "eng_oral_stress_04",
        "topic": "Oral English: Syllable Stress ('Catholicism')",
        "year": "2019",
        "text": "Choose the appropriate primary stress pattern for the word:\n'CATHOLICISM'",
        "opts": ["CAtholicism", "caTHOlicism", "cathoLIcism", "catholiCIsm"],
        "ans": 1,
        "exp": "In 'Catholicism' /kəˈθɒl.ɪ.sɪ.zəm/, primary stress falls on the second syllable 'THO'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2019 • Q67"
    },
    {
        "id": "eng_emphatic_01",
        "topic": "Oral English: Emphatic Stress",
        "year": "2014",
        "text": "The capitalized word has the emphatic stress. Choose the option to which the sentence relates:\n'The traditional chief NARRATED the story to the children.'",
        "opts": [
            "Did the children hear the story from the chief?",
            "Who narrated the story to the children?",
            "The children could not listen to the story by the chief",
            "Did the chief hide the story from the children?"
        ],
        "ans": 3,
        "exp": "Emphatic stress on the verb 'NARRATED' contradicts or resolves a question about the action itself: 'Did he hide/write it?' -> 'No, he NARRATED it.'",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2014 • Q98"
    },
    {
        "id": "eng_emphatic_02",
        "topic": "Oral English: Emphatic Stress",
        "year": "2014",
        "text": "The capitalized word has the emphatic stress. Choose the option to which the sentence relates:\n'The ACCOUNTANT paid the workers\\' July salary in September.'",
        "opts": [
            "When were the workers paid?",
            "Did the cashier pay the workers' salary in September?",
            "Workers received their July salary in September",
            "Did the accountant pay the August salary?"
        ],
        "ans": 1,
        "exp": "Stress on 'ACCOUNTANT' emphasizes WHO made the payment in contrast to another official like the cashier.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2014 • Q99"
    },
    {
        "id": "eng_emphatic_03",
        "topic": "Oral English: Emphatic Stress",
        "year": "2014",
        "text": "The capitalized word has the emphatic stress. Choose the option to which the sentence relates:\n'The cat DEVOURED the rat.'",
        "opts": [
            "Did the rat devour the cat?",
            "What devoured the rat?",
            "Did the cat merely chase the rat without eating it?",
            "Is this the rat that the cat devoured?"
        ],
        "ans": 2,
        "exp": "Stress on 'DEVOURED' highlights the verb action (he did not merely injure or chase it, he DEVOURED it).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2014 • Q100"
    },
    {
        "id": "eng_rhymes_01",
        "topic": "Oral English: Rhymes ('Sheer')",
        "year": "2008",
        "text": "Choose the option that rhymes with the word:\n'SHEER' (/ʃɪər/)",
        "opts": ["Dear", "Shirt", "Spare", "Shade"],
        "ans": 0,
        "exp": "'Sheer' and 'Dear' both terminate with the diphthong /ɪə/, creating a perfect rhyme.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2008 • Q92"
    },
    {
        "id": "eng_rhymes_02",
        "topic": "Oral English: Rhymes ('Great')",
        "year": "2008",
        "text": "Choose the option that rhymes with the word:\n'GREAT' (/ɡreɪt/)",
        "opts": ["Creek", "Crate", "Knit", "Treat"],
        "ans": 1,
        "exp": "'Great' /ɡreɪt/ rhymes with 'Crate' /kreɪt/ (both have the diphthong /eɪ/ + /t/).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2008 • Q93"
    },
    {
        "id": "eng_vowels_01",
        "topic": "Oral English: Vowel Sounds (/ʌ/)",
        "year": "2008",
        "text": "Choose the option that has the same vowel sound as the underlined sound in 'cOU_ntry' (/ʌ/):",
        "opts": ["Worry", "Courteous", "Bought", "Poultry"],
        "ans": 0,
        "exp": "'Country' /ˈkʌntri/ and 'Worry' /ˈwʌri/ both contain the short central vowel /ʌ/.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2008 • Q87"
    },
    {
        "id": "eng_consonants_01",
        "topic": "Oral English: Consonant Sounds (/tʃ/)",
        "year": "2018",
        "text": "Choose the option that has the same consonant sound as the underlined sound in 'matCH' (/tʃ/):",
        "opts": ["Harsh", "Batch", "Such", "Watch"],
        "ans": 1,
        "exp": "'Match' and 'Batch' both share the voiceless postalveolar affricate /tʃ/ preceded by /æ/.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2018 • Q93"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart8", questions)
print("Part 8 built successfully")
