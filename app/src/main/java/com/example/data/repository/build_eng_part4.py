import sys
from parse_eng_helper import write_bank_file

questions = [
    # 1994 & 1995 Lexis, Antonyms & Synonyms
    {
        "id": "eng_1994_q31",
        "topic": "Antonyms: Humorous",
        "year": "1994",
        "text": "Choose the option opposite in meaning to the underlined word:\n'The paper carries many humorous cartoons on Saturdays.'",
        "opts": ["Amorous", "Grievous", "Hilarious", "Grave and serious"],
        "ans": 3,
        "exp": "'Humorous' means funny or comical. The exact antonym is 'grave' (serious, solemn).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1994 • Q31"
    },
    {
        "id": "eng_1994_q33",
        "topic": "Antonyms: Obfuscating",
        "year": "1994",
        "text": "Choose the option opposite in meaning to the underlined word:\n'The lecture was merely obfuscating the issue with his endless examples.'",
        "opts": ["Complicating", "Clarifying and elucidating", "Confusing", "Summarizing"],
        "ans": 1,
        "exp": "'Obfuscate' means to make obscure, unclear, or unintelligible. The antonym is 'clarifying'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1994 • Q33"
    },
    {
        "id": "eng_1994_q34",
        "topic": "Antonyms: Exacerbating",
        "year": "1994",
        "text": "Choose the option opposite in meaning to the underlined word:\n'Such measures end up exacerbating the pain.'",
        "opts": ["Aggravating", "Increasing", "Eliminating", "Alleviating"],
        "ans": 3,
        "exp": "'Exacerbate' means to make a problem or pain worse. The antonym is 'alleviating' (easing or soothing).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1994 • Q34"
    },
    {
        "id": "eng_1994_q38",
        "topic": "Antonyms: Fulminate",
        "year": "1994",
        "text": "Choose the option opposite in meaning to the underlined word:\n'The elderly often fulminate against the apparent indolence of the young generation.'",
        "opts": ["Protest bitterly about", "Complain seriously about", "Commend warmly", "Promote vigorously"],
        "ans": 2,
        "exp": "'Fulminate' means to express vehement protest or condemnation; its opposite is to 'commend warmly'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1994 • Q38"
    },
    {
        "id": "eng_1994_q42",
        "topic": "Idioms: Taken aback",
        "year": "1994",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'She was taken aback by his attitude.'",
        "opts": ["Delayed", "Dragged back", "Surprised and shocked", "Overwhelmed"],
        "ans": 2,
        "exp": "To be 'taken aback' means to be surprised, shocked, or startled.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1994 • Q42"
    },
    {
        "id": "eng_1994_q43",
        "topic": "Vocabulary: Commensurate",
        "year": "1994",
        "text": "Choose the option nearest in meaning to the underlined word:\n'Many would argue that the achievement is commensurate with the effort.'",
        "opts": ["Unexpected in the light of", "Funny compared with", "Proportional to", "The wrong excuse for"],
        "ans": 2,
        "exp": "'Commensurate' means corresponding in size or degree; in proportion to.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1994 • Q43"
    },
    {
        "id": "eng_1994_q48",
        "topic": "Vocabulary: Agnostic",
        "year": "1994",
        "text": "Choose the option nearest in meaning to the underlined word:\n'I am surprised to learn that Badmus is an agnostic.'",
        "opts": [
            "Someone that believes in God",
            "Someone who antagonizes God",
            "Someone who believes that nothing is known of the existence of God",
            "An atheist who denies God completely"
        ],
        "ans": 2,
        "exp": "An 'agnostic' is a person who holds the view that the existence of God or the ultimate nature of things is unknowable.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1994 • Q48"
    },
    {
        "id": "eng_1994_q54",
        "topic": "Vocabulary: Chagrin",
        "year": "1994",
        "text": "Choose the option nearest in meaning to the underlined word:\n'Much to her chagrin, the bridegroom did not turn up for the wedding.'",
        "opts": ["Wonder", "Surprise", "Disappointment and distress", "Depression"],
        "ans": 2,
        "exp": "'Chagrin' means distress or embarrassment at having failed or been humiliated; keen disappointment.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1994 • Q54"
    },
    {
        "id": "eng_1994_q55",
        "topic": "Idioms: Out of the woods",
        "year": "1994",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'Ngozi\\'s countenance is less gloomy; it would appear as if she is relatively out of the woods.'",
        "opts": ["Free from difficulties and danger", "Just from the forest", "In good condition of health", "Out of wants"],
        "ans": 0,
        "exp": "To be 'out of the woods' means to be out of danger, difficulty, or severe trouble.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1994 • Q55"
    },
    {
        "id": "eng_1994_q59",
        "topic": "Grammar: Subject-Verb Concord with 'as well as'",
        "year": "1994",
        "text": "Fill the gap with the most appropriate option:\n'Sa\\'adatu as well as the maids _____ plantain chips.'",
        "opts": ["like", "are liking", "is liking", "likes"],
        "ans": 3,
        "exp": "When a singular subject ('Sa\\'adatu') is connected to another noun by 'as well as', the verb agrees strictly with the initial subject ('likes').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1994 • Q59"
    },
    {
        "id": "eng_1994_q60",
        "topic": "Grammar: Nouns Singular in Meaning (Measles)",
        "year": "1994",
        "text": "Fill the gap with the most appropriate option:\n'Measles _____ no longer impossible to manage these days.'",
        "opts": ["is", "are", "were", "was"],
        "ans": 0,
        "exp": "Names of diseases ending in '-s' (measles, mumps, rickets) are treated as singular nouns taking a singular present verb ('is').",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1994 • Q60"
    },
    # 2000 & 2002 Lexis & Structure
    {
        "id": "eng_2000_q52",
        "topic": "Phrasal Verbs: Defused",
        "year": "2000",
        "text": "Choose the best option to fill the gap:\n'The council chairman _____ the tension between the villagers and the tax collectors.'",
        "opts": ["dispersed", "defused", "diffused", "disputed"],
        "ans": 1,
        "exp": "To 'defuse' tension or a crisis means to make a dangerous situation calmer and less hostile.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2000 • Q52"
    },
    {
        "id": "eng_2000_q58",
        "topic": "Vocabulary: Prowess",
        "year": "2000",
        "text": "Choose the option nearest in meaning to the underlined word:\n'General Murtala Muhammed excelled in deeds of prowess.'",
        "opts": ["Warfare", "Politics", "Courage and skill", "Eloquence"],
        "ans": 2,
        "exp": "'Prowess' refers to skill, expertise, or distinguished bravery and courage in battle.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2000 • Q58"
    },
    {
        "id": "eng_2000_q62",
        "topic": "Vocabulary: Persona non grata",
        "year": "2000",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'Our uncle has been declared persona non grata by the French government.'",
        "opts": ["An unwelcome person/guest", "An impersonator", "An ungrateful person", "An unofficial diplomat"],
        "ans": 0,
        "exp": "'Persona non grata' is a Latin diplomatic term meaning an unacceptable or unwelcome person.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2000 • Q62"
    },
    {
        "id": "eng_2000_q63",
        "topic": "Vocabulary: Stickler",
        "year": "2000",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'The Vice-Chancellor, who is a stickler for rules, refused the request.'",
        "opts": ["A puritan", "A pedant", "A strict disciplinarian", "An idealist"],
        "ans": 2,
        "exp": "A 'stickler' is a person who insists on strict adherence to particular rules, standards, or etiquette.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2000 • Q63"
    },
    {
        "id": "eng_2000_q64",
        "topic": "Vocabulary: Trepidation",
        "year": "2000",
        "text": "Choose the option nearest in meaning to the underlined word:\n'The town looked deserted but we moved in with trepidation.'",
        "opts": ["Confidence", "Surprise", "Hesitation", "Fear and apprehension"],
        "ans": 3,
        "exp": "'Trepidation' is a feeling of fear, dread, or apprehension about something that may happen.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2000 • Q64"
    },
    {
        "id": "eng_2000_q66",
        "topic": "Prepositions: Connive at",
        "year": "2000",
        "text": "Fill the gap with the most appropriate option:\n'The policemen who were to keep watch connived _____ the robber\\'s escape.'",
        "opts": ["with", "at", "to", "for"],
        "ans": 1,
        "exp": "To 'connive at' wrong-doing means to secretly allow or overlook a wrongdoing that one should prevent.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2000 • Q66"
    },
    {
        "id": "eng_2000_q83",
        "topic": "Grammar: Concord with 'Many a'",
        "year": "2000",
        "text": "Choose the option that best completes the sentence:\n'Many a man _____ done without milk in _____ tea these days.'",
        "opts": ["had/their", "has/his", "have/their", "had/his"],
        "ans": 1,
        "exp": "The structure 'Many a + singular noun' takes a singular verb ('has') and a singular pronoun ('his').",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2000 • Q83"
    },
    {
        "id": "eng_2000_q86",
        "topic": "Grammar: Had better",
        "year": "2000",
        "text": "Choose the option that best completes the sentence:\n'You had better _____ what the doctor recommended this morning.'",
        "opts": ["done", "do", "did", "be doing"],
        "ans": 1,
        "exp": "'Had better' is always followed by a bare infinitive (base form of the verb without 'to'): 'do'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2000 • Q86"
    },
    {
        "id": "eng_2000_q91",
        "topic": "Vocabulary: Sowing seeds of discord",
        "year": "2000",
        "text": "Choose the option that best completes the sentence:\n'The manager was angry with Dauda for _____ seeds of discord among the workers.'",
        "opts": ["planting", "sewing", "cultivating", "sowing"],
        "ans": 3,
        "exp": "The idiom is to 'sow (not sew) seeds of discord/strife'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2000 • Q91"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart4", questions)
print("Part 4 built successfully")
