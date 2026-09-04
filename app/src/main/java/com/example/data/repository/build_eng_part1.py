import sys
from parse_eng_helper import write_bank_file

questions = [
    # 1978 Lexis & Structure & Comprehension
    {
        "id": "eng_1978_q26",
        "topic": "Idioms: Dark horse",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'In the match against the uplanders team, the submariners turned out to be the dark horse.'",
        "opts": ["Played most brilliantly", "Played below their usual form", "Won unexpectedly", "Lost as expected"],
        "ans": 2,
        "exp": "A 'dark horse' is a candidate or competitor about whom little is known but who unexpectedly wins or succeeds.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q26"
    },
    {
        "id": "eng_1978_q27",
        "topic": "Idioms: Small fry",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'Only the small fry get punished for such social misdemeanors.'",
        "opts": ["Small boys", "Unimportant people", "Frightened people", "Frivolous people"],
        "ans": 1,
        "exp": "'Small fry' refers to people or things considered unimportant or of little consequence in comparison with others.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q27"
    },
    {
        "id": "eng_1978_q28",
        "topic": "Idioms: Heart in mouth",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'He spoke with his heart in his mouth.'",
        "opts": ["Courageously", "With unusual cowardice", "With a lot of confusion in his speech", "With fright and agitation"],
        "ans": 3,
        "exp": "To speak or act with one's 'heart in one's mouth' means to be extremely anxious, frightened, or nervous.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q28"
    },
    {
        "id": "eng_1978_q29",
        "topic": "Vocabulary: Register",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined word:\n'The leader in today's issue of our popular newspaper focuses on inflation.'",
        "opts": ["President", "Headline", "Editorial article", "Columnist"],
        "ans": 2,
        "exp": "In journalism, a 'leader' or 'leading article' refers to an editorial expressing the opinion of the newspaper.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q29"
    },
    {
        "id": "eng_1978_q30",
        "topic": "Vocabulary: A bore",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined word:\n'From the way my friend talks, you can see he is such a bore.'",
        "opts": ["Rude person", "Brilliant person", "Uninteresting person", "Overbearing person"],
        "ans": 2,
        "exp": "A 'bore' is a dull, uninteresting person whose conversation tires other people.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q30"
    },
    {
        "id": "eng_1978_q31",
        "topic": "Vocabulary: Concurrently",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined word:\n'His jail terms were to run concurrently.'",
        "opts": ["Simultaneously", "Uniformly", "Consecutively", "Judiciously"],
        "ans": 0,
        "exp": "'Concurrently' means operating or occurring at the same time (simultaneously).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q31"
    },
    {
        "id": "eng_1978_q32",
        "topic": "Vocabulary: Symmetry",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined word:\n'There is some obvious symmetry in the whole presentation.'",
        "opts": ["Confusion", "Hesitation", "Orderliness and balance", "Dissatisfaction"],
        "ans": 2,
        "exp": "'Symmetry' refers to regular, balanced, and orderly arrangement or proportion.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q32"
    },
    {
        "id": "eng_1978_q33",
        "topic": "Vocabulary: Insolvent",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined word:\n'The bill has to wait as we are now insolvent.'",
        "opts": ["Overworked", "Bankrupt", "Unsettled", "Affluent"],
        "ans": 1,
        "exp": "'Insolvent' means unable to pay debts owed, i.e., bankrupt.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q33"
    },
    {
        "id": "eng_1978_q34",
        "topic": "Phrasal Verbs: Fell through",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'All his plans fell through.'",
        "opts": ["Failed", "Were accomplished", "Had to be reviewed", "Were rejected"],
        "ans": 0,
        "exp": "To 'fall through' means to fail to happen or come to nothing.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q34"
    },
    {
        "id": "eng_1978_q35",
        "topic": "Idioms: Broke even",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'The balance sheet at the end of the business year shows that we broke even.'",
        "opts": ["Lost heavily", "Made huge profit", "Neither lost nor gained", "Had no money to continue business"],
        "ans": 2,
        "exp": "To 'break even' means to reach a point in a venture where profits equal costs (neither gain nor loss).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q35"
    },
    {
        "id": "eng_1978_q36",
        "topic": "Phrasal Verbs: Put through",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'He was appointed specifically to put the recruits through.'",
        "opts": ["Assign them to work", "Train and instruct them", "Discipline them", "Assist them at work"],
        "ans": 1,
        "exp": "To 'put someone through' in training means to guide, train, and test them thoroughly.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q36"
    },
    {
        "id": "eng_1978_q37",
        "topic": "Vocabulary: Breakthrough",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined word:\n'The result of his experiment represents a breakthrough in medical science.'",
        "opts": ["An outstanding success", "A catastrophe", "A breaking point", "A colossal failure"],
        "ans": 0,
        "exp": "A 'breakthrough' is a major, sudden, and significant advance or outstanding success.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q37"
    },
    {
        "id": "eng_1978_q38",
        "topic": "Idioms: Bright side",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'Being an optimist, our professor always sees the bright side of most things.'",
        "opts": ["Charming aspect", "Brilliant aspect", "Pleasing aspect", "Cheerful and positive aspect"],
        "ans": 3,
        "exp": "The 'bright side' refers to the hopeful, favorable, and cheerful aspects of any circumstance.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q38"
    },
    {
        "id": "eng_1978_q39",
        "topic": "Phrasal Verbs: Go into",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'The state government appointed a commission of inquiry to go into the community\\'s complaints carefully.'",
        "opts": ["Investigate", "Search for", "Look for", "Account for"],
        "ans": 0,
        "exp": "To 'go into' a problem or complaint means to investigate or examine it thoroughly.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q39"
    },
    {
        "id": "eng_1978_q40",
        "topic": "Phrasal Verbs: Held up",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'A man lost a lucrative job because he was held up by the Lagos traffic.'",
        "opts": ["Confused", "Delayed", "Annoyed", "Obstructed completely"],
        "ans": 1,
        "exp": "In the context of traffic, to be 'held up' means to be delayed or impeded in progress.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q40"
    },
    {
        "id": "eng_1978_q41",
        "topic": "Idioms: Heart of stone",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'Mrs. Dada has been deserted by her husband because he feels she has a heart of stone.'",
        "opts": ["She has a heavy heart", "She has little warmth of feeling", "She is hard-hearted and unfeeling", "She has a diseased heart"],
        "ans": 2,
        "exp": "A person with a 'heart of stone' is completely callous, stern, and devoid of compassion.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q41"
    },
    {
        "id": "eng_1978_q43",
        "topic": "Conditionals: Third Conditional",
        "year": "1978",
        "text": "Select the option that best explains the meaning of the sentence:\n'If my father had not arrived, I would have starved.'",
        "opts": [
            "My father did arrive and I didn't starve",
            "I had to starve because my father didn't come",
            "My father didn't arrive and I didn't starve",
            "I had starved before my father arrived"
        ],
        "ans": 0,
        "exp": "The third conditional indicates a counterfactual past: the father DID arrive, preventing the starvation.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q43"
    },
    {
        "id": "eng_1978_q44",
        "topic": "Idioms: Neck and neck",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'The two sprinters were running neck and neck.'",
        "opts": ["At exactly the same level", "Very slowly", "Very fast", "With their bodies close together"],
        "ans": 0,
        "exp": "'Neck and neck' means level in a race or competition (at an equal pace/level).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q44"
    },
    {
        "id": "eng_1978_q46",
        "topic": "Idioms: Bold front",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'When the man was caught by the police, he presented a bold front.'",
        "opts": [
            "He attacked the policemen boldly",
            "He walked up to the policemen",
            "He faced the situation with apparent boldness and composure",
            "He attempted to offer them a bribe"
        ],
        "ans": 2,
        "exp": "To 'put up or present a bold front' means to display confidence or bravery in the face of danger.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q46"
    },
    {
        "id": "eng_1978_q47",
        "topic": "Idioms: At close quarters",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'I have been able to observe him at close quarters.'",
        "opts": ["In a government house nearby", "Within a short space of time", "In a small family house", "At close range"],
        "ans": 3,
        "exp": "'At close quarters' means from very close range or in immediate proximity.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q47"
    },
    {
        "id": "eng_1978_q48",
        "topic": "Idioms: Hair stood on end",
        "year": "1978",
        "text": "Choose the option that best conveys the meaning of the underlined phrase:\n'At the site of the ghastly accident, the poor woman\\'s hair stood on end.'",
        "opts": ["The woman's hair became straight", "The wind blew her hair upwards", "The woman was terrified and shocked", "The woman disarranged her hair"],
        "ans": 2,
        "exp": "When someone's 'hair stands on end', it means they are overcome with terror or intense horror.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q48"
    },
    {
        "id": "eng_1978_q49",
        "topic": "Grammar: Verbs of Lying & Laying",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'When the beggar was tired, he _____ down by the roadside.'",
        "opts": ["lied", "laid", "lay", "lain"],
        "ans": 2,
        "exp": "The intransitive verb 'to lie' (recline) has the past tense 'lay' (lie -> lay -> lain). 'Laid' is the past tense of 'lay' (transitive: to put something down).",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1978 • Q49"
    },
    {
        "id": "eng_1978_q50",
        "topic": "Grammar: Gerund with Possessive",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'He did not like _____ leaving the class early.'",
        "opts": ["we", "us", "our", "ourselves"],
        "ans": 2,
        "exp": "In formal English, a noun or pronoun modifying a gerund ('leaving') takes the possessive case ('our leaving').",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1978 • Q50"
    },
    {
        "id": "eng_1978_q51",
        "topic": "Grammar: Past Perfect Tense",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'Before the operation, the dentist found that his patient\\'s teeth _____.'",
        "opts": ["have long decayed", "have long been decayed", "had long decayed", "had been decayed"],
        "ans": 2,
        "exp": "Past perfect 'had long decayed' expresses an action that occurred prior to another past action ('found').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q51"
    },
    {
        "id": "eng_1978_q52",
        "topic": "Grammar: Subject-Verb Agreement",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'The employer, not the salesman and his representative, _____ responsible for the loss.'",
        "opts": ["are", "are being", "have been", "is"],
        "ans": 3,
        "exp": "When a singular subject ('The employer') is followed by parenthetical phrases like 'not...', the verb agrees solely with the true subject ('is').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q52"
    },
    {
        "id": "eng_1978_q54",
        "topic": "Grammar: Lend vs Borrow",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'As he was still owing me two naira, I was careful not to _____ him any more money.'",
        "opts": ["lend", "loan", "borrow", "extend"],
        "ans": 0,
        "exp": "'Lend' means to give money temporarily to someone. 'Borrow' means to receive money temporarily.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q54"
    },
    {
        "id": "eng_1978_q56",
        "topic": "Grammar: Uncountable Nouns",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'If you travel by air you will be given an allowance to cover _____.'",
        "opts": ["a luggage", "luggage", "luggages", "a baggage"],
        "ans": 1,
        "exp": "'Luggage' and 'baggage' are uncountable nouns in English; they do not take indefinite articles ('a') or plural 's'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q56"
    },
    {
        "id": "eng_1978_q57",
        "topic": "Vocabulary: Contemporary",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'Tennyson and Browning lived about the same time and therefore were _____ poets.'",
        "opts": ["contrary", "contractual", "contemporary", "contemptible"],
        "ans": 2,
        "exp": "'Contemporary' describes people or events existing or occurring during the same period of time.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q57"
    },
    {
        "id": "eng_1978_q59",
        "topic": "Vocabulary: Exhumed",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'In order to carry out necessary examination the dead body was _____.'",
        "opts": ["extracted", "extradited", "exiled", "exhumed"],
        "ans": 3,
        "exp": "'Exhume' means to dig up something that has been buried, especially a corpse for medical investigation.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q59"
    },
    {
        "id": "eng_1978_q60",
        "topic": "Grammar: Pronoun Case after Preposition",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'Remember this matter is strictly _____.'",
        "opts": ["between you and I", "among you and me", "between you and me", "between you and myself"],
        "ans": 2,
        "exp": "Prepositions ('between') require objective case pronouns ('you and me', not 'you and I').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q60"
    },
    {
        "id": "eng_1978_q61",
        "topic": "Grammar: Idiomatic Phrasing with 'with a view to'",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'He went abroad with a view _____ a business partner.'",
        "opts": ["to find", "to be finding", "to have found", "to finding"],
        "ans": 3,
        "exp": "The prepositional idiom 'with a view to' is always followed by a gerund ('-ing' form): 'with a view to finding'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1978 • Q61"
    },
    {
        "id": "eng_1978_q64",
        "topic": "Idioms: Beside the point",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'His suggestions are completely _____ the point and cannot be accepted.'",
        "opts": ["to", "about", "beside", "under"],
        "ans": 2,
        "exp": "'Beside the point' is an idiom meaning irrelevant, off-topic, or unimportant to the matter at hand.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q64"
    },
    {
        "id": "eng_1978_q67",
        "topic": "Grammar: Possessive Pronouns",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'Invariably, he ends his letters \"_____ amicably\".'",
        "opts": ["you", "your's", "yours'", "yours"],
        "ans": 3,
        "exp": "Possessive pronouns ('yours', 'ours', 'hers', 'theirs') never take an apostrophe.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q67"
    },
    {
        "id": "eng_1978_q76",
        "topic": "Grammar: Question Tags",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'The managing director did not pay his staff last month, _____?'",
        "opts": ["didn't he", "had he not", "did he", "has he"],
        "ans": 2,
        "exp": "A negative statement with auxiliary 'did not' takes a positive tag with the same auxiliary: 'did he?'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q76"
    },
    {
        "id": "eng_1978_q85",
        "topic": "Idioms: Jars on nerves",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'His horrible high-pitched laugh _____ on my nerves.'",
        "opts": ["jags", "jabs", "jams", "jars"],
        "ans": 3,
        "exp": "To 'jar on one's nerves' means to irritate, annoy, or cause grating discomfort to someone.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q85"
    },
    {
        "id": "eng_1978_q93",
        "topic": "Grammar: Subjunctive Past after 'High Time'",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'Isn\\'t it high time you _____ your office?'",
        "opts": ["are leaving", "do leave", "leave", "left"],
        "ans": 3,
        "exp": "The construction 'It is high time + subject' takes the simple past subjunctive form of the verb ('left').",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1978 • Q93"
    },
    {
        "id": "eng_1978_q94",
        "topic": "Vocabulary: Incidence vs Incident",
        "year": "1978",
        "text": "Choose the option that most suitably fills the space:\n'In West Africa the _____ of sickle cell is about 25 percent.'",
        "opts": ["incident", "incidence", "accident", "accidence"],
        "ans": 1,
        "exp": "'Incidence' refers to the occurrence, rate, or frequency of a disease or condition.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q94"
    },
    {
        "id": "eng_1978_q96",
        "topic": "Antonyms: Plaintiff",
        "year": "1978",
        "text": "Substitute for the underlined word the option that most closely expresses the opposite meaning:\n'The plaintiff made very cogent submissions to the trial judge.'",
        "opts": ["Bailiff", "Prosecutor", "Lawyer", "Defendant"],
        "ans": 3,
        "exp": "In civil law, the 'plaintiff' is the person who brings the suit, while the 'defendant' is the party against whom the suit is brought.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q96"
    },
    {
        "id": "eng_1978_q97",
        "topic": "Grammar: Relative Pronoun 'Whose'",
        "year": "1978",
        "text": "Choose the option nearest in meaning to the sentence:\n'We visited the home of one boy. That\\'s the boy I mean.'",
        "opts": [
            "That's the boy whom we visited his home",
            "That's the boy whose home we visited",
            "That's the boy to whose home we visited",
            "That's the boy whom we visited the home"
        ],
        "ans": 1,
        "exp": "'Whose' correctly serves as the possessive relative pronoun indicating the boy's home.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1978 • Q97"
    },
    {
        "id": "eng_1978_q99",
        "topic": "Grammar: Used to vs Be Used to",
        "year": "1978",
        "text": "Choose the option nearest in meaning to the sentence:\n'I can walk that distance and have done so many times.'",
        "opts": [
            "I am used to walk that distance",
            "I used to walk that distance",
            "I used to walking that distance",
            "I am used to walking that distance"
        ],
        "ans": 3,
        "exp": "'To be used to doing something' means to be accustomed to doing it through repeated experience.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q99"
    },
    {
        "id": "eng_1978_q100",
        "topic": "Idioms: For all he cared",
        "year": "1978",
        "text": "Choose the option nearest in meaning to the sentence:\n'For all he cared, his parents might have been dead for years.'",
        "opts": [
            "Although concerned about his parents, he had been unable to find out if they were alive",
            "He cared for no one except his parents",
            "He did not care whether his parents were alive or had died long before",
            "He was concerned about everyone not just his parents"
        ],
        "ans": 2,
        "exp": "'For all he cared' expresses complete indifference or unconcern towards the outcome.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1978 • Q100"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart1", questions)
print("Part 1 built successfully")
