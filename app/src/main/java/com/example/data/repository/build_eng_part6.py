import sys
from parse_eng_helper import write_bank_file

questions = [
    # 2014 & 2015 Questions
    {
        "id": "eng_2014_q36",
        "topic": "Idioms: Drop in the ocean",
        "year": "2014",
        "text": "Select the option that best explains the information conveyed in the sentence:\n'The minister considered the ministry\\'s budget to be a drop in the ocean in view of the number of projects in the pipeline.'",
        "opts": [
            "The pipeline project across the ocean will be abandoned",
            "The amount available is far too inadequate for projected expenditure",
            "The minister may be dropped for failing to complete projects",
            "The money approved cannot complete the pipeline project"
        ],
        "ans": 1,
        "exp": "A 'drop in the ocean' is an idiom referring to a very small amount compared to what is needed or expected.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2014 • Q36"
    },
    {
        "id": "eng_2014_q38",
        "topic": "Idioms: When pigs fly",
        "year": "2014",
        "text": "Select the option that best explains the information conveyed in the sentence:\n'Jummai\\'s father remarked that pigs would fly before she passed.'",
        "opts": [
            "She would have to cheat in order to pass",
            "It would be possible to pass only if she worked harder",
            "It would never be possible for her to pass",
            "He would have to bribe her teachers to enable her to pass"
        ],
        "ans": 2,
        "exp": "'When pigs fly' is an idiom used to describe something that will never happen or is completely impossible.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2014 • Q38"
    },
    {
        "id": "eng_2014_q39",
        "topic": "Idioms: Between a rock and a hard place",
        "year": "2014",
        "text": "Select the option that best explains the information conveyed in the sentence:\n'The president said that he found himself between a rock and a hard place when the press said that he had resigned.'",
        "opts": [
            "Hard places are dangerous for the president",
            "He dreamt that he was abandoned",
            "He had a difficult choice between two equally unpleasant options",
            "He thought that rocks were unsafe"
        ],
        "ans": 2,
        "exp": "'Between a rock and a hard place' means in a dilemma facing two equally difficult, unpalatable alternatives.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2014 • Q39"
    },
    {
        "id": "eng_2014_q45",
        "topic": "Idioms: Hand-to-mouth",
        "year": "2014",
        "text": "Select the option that best explains the information conveyed in the sentence:\n'Many workers are not happy because they live a hand-to-mouth life.'",
        "opts": [
            "They work hard with their hands",
            "They are voracious and avaricious",
            "They have only just enough money to survive with nothing left over",
            "They have rejected the use of cutlery"
        ],
        "ans": 2,
        "exp": "Living 'hand-to-mouth' means having only just enough food or money to survive without any security or savings.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2014 • Q45"
    },
    {
        "id": "eng_2014_q54",
        "topic": "Antonyms: Vague",
        "year": "2014",
        "text": "Choose the option opposite in meaning to the underlined word:\n'The testimony of the witness was vague.'",
        "opts": ["Clear and explicit", "Disturbing", "True", "Ambiguous"],
        "ans": 0,
        "exp": "'Vague' means imprecise or unclear; its exact opposite is 'clear'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2014 • Q54"
    },
    {
        "id": "eng_2014_q58",
        "topic": "Vocabulary: Aghast",
        "year": "2014",
        "text": "Choose the option nearest in meaning to the underlined word:\n'All the candidates looked aghast at the reading of the questions.'",
        "opts": ["Relaxed", "Fulfilled", "Filled with dismay and shock", "Satisfied"],
        "ans": 2,
        "exp": "'Aghast' means filled with horror, shock, or dismay.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2014 • Q58"
    },
    {
        "id": "eng_2014_q68",
        "topic": "Grammar: Negative Concord Adverb 'Either'",
        "year": "2014",
        "text": "Choose the option that best completes the gap:\n'You may have the pencil, but you can\\'t have the ballpoint _____.'",
        "opts": ["as well", "either", "furthermore", "also"],
        "ans": 1,
        "exp": "In negative sentences, 'either' is used at the end of a clause to mean 'also/too' ('can't have the ballpoint either').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2014 • Q68"
    },
    {
        "id": "eng_2014_q81",
        "topic": "Grammar: Irregular Past Tense 'Struck'",
        "year": "2014",
        "text": "Choose the option that best completes the gap:\n'The clock _____ 12 o\\'clock two hours ago.'",
        "opts": ["striking", "strikes", "strike", "struck"],
        "ans": 3,
        "exp": "The simple past tense of 'strike' is 'struck'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2014 • Q81"
    },
    {
        "id": "eng_2014_q89",
        "topic": "Oral English: Consonant Sounds (/ʒ/)",
        "year": "2014",
        "text": "Choose the option that has the same consonant sound as the underlined sound in 'viSi_on' (/ʒ/):",
        "opts": ["Enclosure", "Instruction", "Mansion", "Nation"],
        "ans": 0,
        "exp": "'Enclosure' /ɪnˈkləʊʒə/ contains the voiced postalveolar fricative /ʒ/, identical to 'vision' /ˈvɪʒn/.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2014 • Q89"
    },
    # 2015 & 2016 Questions
    {
        "id": "eng_2015_q38",
        "topic": "Grammar: Correlative Negatives 'Neither/Nor'",
        "year": "2015",
        "text": "Select the option that best explains the information conveyed in the sentence:\n'I haven\\'t seen the movie and my brother hasn\\'t either.'",
        "opts": [
            "I have seen the movie but neither of my brothers has",
            "Neither my brother nor I have seen the movie",
            "Only my brother has seen the movie",
            "I was the only one that has seen the movie"
        ],
        "ans": 1,
        "exp": "'Haven't ... either' expresses that both persons did not perform the action ('Neither my brother nor I have seen the movie').",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2015 • Q38"
    },
    {
        "id": "eng_2015_q41",
        "topic": "Idioms: Road to Damascus",
        "year": "2015",
        "text": "Select the option that best explains the information conveyed in the sentence:\n'The lecture is Uye\\'s road to Damascus.'",
        "opts": [
            "The lecture is an opportunity to travel abroad",
            "The lecture is a life-transforming experience that radically changes her thinking",
            "The lecture talks exclusively about Damascus",
            "The lecture is a difficult journey"
        ],
        "ans": 1,
        "exp": "A 'road to Damascus' moment is an experience that results in a profound, dramatic transformation of one's beliefs or attitudes.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2015 • Q41"
    },
    {
        "id": "eng_2015_q46",
        "topic": "Antonyms: Frenzy",
        "year": "2015",
        "text": "Choose the option opposite in meaning to the underlined word:\n'Adewale\\'s arrival always triggers a media frenzy.'",
        "opts": ["Violence", "Agitation", "Calm and tranquility", "Excitement"],
        "ans": 2,
        "exp": "'Frenzy' is a state of wild excitement or uncontrolled agitation; the antonym is 'calm'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2015 • Q46"
    },
    {
        "id": "eng_2015_q47",
        "topic": "Antonyms: Harrowing",
        "year": "2015",
        "text": "Choose the option opposite in meaning to the underlined word:\n'She said the experience was harrowing.'",
        "opts": ["Educating", "Frightening", "Pleasant and delightful", "Strange"],
        "ans": 2,
        "exp": "'Harrowing' means acutely distressing or agonizing; its exact opposite is 'pleasant'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2015 • Q47"
    },
    {
        "id": "eng_2015_q57",
        "topic": "Synonyms: Caustic",
        "year": "2015",
        "text": "Choose the option nearest in meaning to the underlined word:\n'She gave a caustic remark on the occasion.'",
        "opts": ["Tangible", "Friendly", "Insignificant", "Sarcastic and biting"],
        "ans": 3,
        "exp": "'Caustic' in tone means sarcastic in a scathing, bitter, and biting way.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2015 • Q57"
    },
    {
        "id": "eng_2015_q62",
        "topic": "Synonyms: Distaste",
        "year": "2015",
        "text": "Choose the option nearest in meaning to the underlined word:\n'The man has a strong distaste for alcohol.'",
        "opts": ["Love", "Aversion and dislike", "Desire", "Excitement"],
        "ans": 1,
        "exp": "'Distaste' means mild or strong dislike or aversion.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2015 • Q62"
    },
    {
        "id": "eng_2015_q65",
        "topic": "Synonyms: Detests",
        "year": "2015",
        "text": "Choose the option nearest in meaning to the underlined word:\n'He detests dishonesty.'",
        "opts": ["Likes", "Hates and loathes", "Encourages", "Commands"],
        "ans": 1,
        "exp": "'Detest' means dislike intensely; hate or loathe.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2015 • Q65"
    },
    {
        "id": "eng_2015_q72",
        "topic": "Prepositions: Deal in vs Deal with",
        "year": "2015",
        "text": "Choose the option that best completes the gap:\n'The company deals _____ computer software.'",
        "opts": ["with", "for", "in", "to"],
        "ans": 2,
        "exp": "To 'deal in' a product means to buy, sell, or trade that commodity as a business.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2015 • Q72"
    },
    {
        "id": "eng_2015_q88",
        "topic": "Oral English: Rhymes ('Suite')",
        "year": "2015",
        "text": "Choose the option that rhymes with the given word:\n'Suite' (/swiːt/)",
        "opts": ["Tree", "Breath", "Bleat", "Sweet"],
        "ans": 3,
        "exp": "'Suite' is pronounced exactly as /swiːt/, rhyming perfectly with 'Sweet'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2015 • Q88"
    },
    # 2020 Questions
    {
        "id": "eng_2020_q38",
        "topic": "Vocabulary: Surmount",
        "year": "2020",
        "text": "Choose the option that has almost the same meaning as the underlined word:\n'We must work hard in order to surmount our difficulties.'",
        "opts": ["Decrease", "Overcome and conquer", "Remove", "Meet"],
        "ans": 1,
        "exp": "To 'surmount' an obstacle or difficulty means to overcome or triumph over it.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2020 • Q38"
    },
    {
        "id": "eng_2020_q40",
        "topic": "Phrasal Verbs: Look into",
        "year": "2020",
        "text": "Choose the option that has almost the same meaning as the underlined phrase:\n'The monitor was told to look into the cause of the confusion in the classroom.'",
        "opts": ["Investigate", "Punish", "Spy on", "Watch quietly"],
        "ans": 0,
        "exp": "To 'look into' an incident means to investigate or examine its causes.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2020 • Q40"
    },
    {
        "id": "eng_2020_q44",
        "topic": "Phrasal Verbs: Give up",
        "year": "2020",
        "text": "Choose the option that has almost the same meaning as the underlined phrase:\n'Mr. Subomi wants to give up his appointment.'",
        "opts": ["Transfer his appointment", "Resign his position", "Keep the appointment for his son", "Share his appointment"],
        "ans": 1,
        "exp": "To 'give up' a job or appointment means to resign or voluntarily relinquish it.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2020 • Q44"
    },
    {
        "id": "eng_2020_q47",
        "topic": "Grammar: Subject-Verb Agreement with 'accompanied by'",
        "year": "2020",
        "text": "Choose the option that correctly fills the gap:\n'The lady accompanied by her two friends _____.'",
        "opts": ["has arrived", "have arrived", "have been arriving", "is being arrived"],
        "ans": 0,
        "exp": "When a singular subject ('The lady') is joined with others by 'accompanied by', the verb remains singular ('has arrived').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2020 • Q47"
    },
    {
        "id": "eng_2020_q50",
        "topic": "Grammar: Relative Pronoun 'Who'",
        "year": "2020",
        "text": "Choose the option that correctly fills the gap:\n'This is the lady _____ stole my car.'",
        "opts": ["who", "which", "whom", "whose"],
        "ans": 0,
        "exp": "'Who' is the subjective relative pronoun used for persons acting as the subject of the clause ('who stole').",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2020 • Q50"
    },
    {
        "id": "eng_2020_q79",
        "topic": "Grammar: Reciprocal Pronouns 'One another'",
        "year": "2020",
        "text": "Choose the option that correctly fills the gap:\n'I don\\'t know what to do with these children, they are always quarrelling with _____.'",
        "opts": ["themselves", "myself", "one another", "each of them"],
        "ans": 2,
        "exp": "'One another' is used for reciprocal interaction among more than two persons ('these children').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2020 • Q79"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart6", questions)
print("Part 6 built successfully")
