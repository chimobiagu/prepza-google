import sys
from parse_eng_helper import write_bank_file

questions = [
    # 1979 Lexis & Structure
    {
        "id": "eng_1979_q26",
        "topic": "Grammar: Participial Clauses",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'_____ for the team for six years, he decided to join another.'",
        "opts": ["When he played", "Playing", "Having played", "In playing"],
        "ans": 2,
        "exp": "The perfect participle 'Having played' shows that one action was completed before the next past action began.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q26"
    },
    {
        "id": "eng_1979_q27",
        "topic": "Phrasal Verbs: Blown up",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'The bridge connecting the two cities was _____ by the enemy.'",
        "opts": ["blown up", "blown down", "blown off", "blown over"],
        "ans": 0,
        "exp": "'Blown up' means destroyed by explosion or dynamite.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1979 • Q27"
    },
    {
        "id": "eng_1979_q28",
        "topic": "Prepositions: Suffer from",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'My little boy is suffering _____ jaundice.'",
        "opts": ["from", "of", "for", "with"],
        "ans": 0,
        "exp": "The verb 'suffer' collocated with an illness or condition takes the preposition 'from'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1979 • Q28"
    },
    {
        "id": "eng_1979_q29",
        "topic": "Grammar: Order of Adjectives",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'They went to the market and bought a suitcase and _____ bag.'",
        "opts": ["a big leather brown", "a leather brown big", "a big brown leather", "a brown big leather"],
        "ans": 2,
        "exp": "Standard order of adjectives: Size ('big') -> Colour ('brown') -> Material ('leather') -> Noun ('bag').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q29"
    },
    {
        "id": "eng_1979_q30",
        "topic": "Grammar: Future Perfect Tense",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'By the end of this year, _____ in this town for eleven years.'",
        "opts": ["I'm living", "I'd be living", "I'll live", "I'll have lived"],
        "ans": 3,
        "exp": "Future perfect tense ('will have lived') indicates an action that will be completed at a specific point in future time.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q30"
    },
    {
        "id": "eng_1979_q31",
        "topic": "Conditionals: Third Conditional",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'If he had left home earlier, he _____ late.'",
        "opts": ["would not be", "would have not be", "would not been", "would not have been"],
        "ans": 3,
        "exp": "Third conditional formula: 'If + had + past participle, would have + past participle' ('would not have been').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q31"
    },
    {
        "id": "eng_1979_q37",
        "topic": "Grammar: Indirect Questions",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'Jane asked James _____.'",
        "opts": [
            "whether could she meet him later",
            "could she meet him later",
            "if she could meet him later",
            "that she could meet him later"
        ],
        "ans": 2,
        "exp": "Reported yes/no questions take 'if/whether + subject + modal/verb' with statement word order (not inversion).",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q37"
    },
    {
        "id": "eng_1979_q38",
        "topic": "Grammar: Question Tags",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'She doesn\\'t have to attend the lecture, _____?'",
        "opts": ["doesn't she", "is she", "has she", "does she"],
        "ans": 3,
        "exp": "A negative statement with 'does not' takes a positive tag 'does she?'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1979 • Q38"
    },
    {
        "id": "eng_1979_q41",
        "topic": "Phrasal Verbs: Ward off",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'There is an obvious need to ward _____ enemy attacks.'",
        "opts": ["away", "against", "out", "off"],
        "ans": 3,
        "exp": "To 'ward off' means to prevent, deflect, or avert something undesirable or dangerous.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1979 • Q41"
    },
    {
        "id": "eng_1979_q44",
        "topic": "Idioms: At great length",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'Mr. Thomas talked _____ about the successes of his institute in the past year.'",
        "opts": ["at a great length", "for great length", "at great length", "for a great length"],
        "ans": 2,
        "exp": "The correct fixed English prepositional idiom is 'at great length' (without 'a' and without plural 's').",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q44"
    },
    {
        "id": "eng_1979_q46",
        "topic": "Grammar: Transitive Verb 'Discuss'",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'The members of the panel were _____.'",
        "opts": ["discussing about it", "discussing on it", "discussing upon it", "discussing it"],
        "ans": 3,
        "exp": "'Discuss' is a transitive verb taking a direct object directly without the preposition 'about'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q46"
    },
    {
        "id": "eng_1979_q49",
        "topic": "Idioms: Learn by heart",
        "year": "1979",
        "text": "Choose the expression which best completes the sentence:\n'It was a long poem but he learnt it _____.'",
        "opts": ["off head", "in memory", "by heart", "from memory"],
        "ans": 2,
        "exp": "To memorize verbatim is idiomatically to 'learn by heart'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1979 • Q49"
    },
    {
        "id": "eng_1979_q54",
        "topic": "Vocabulary: Gullible",
        "year": "1979",
        "text": "Choose the option nearest in meaning to the underlined word:\n'As he was a gullible leader, his followers took advantage of him.'",
        "opts": [
            "He was weak and unable to enforce authority",
            "He was partial and unfair",
            "He was easily deceived and simple-minded",
            "He was slow to act in state matters"
        ],
        "ans": 2,
        "exp": "'Gullible' means easily persuaded to believe something, naive, or credulous.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1979 • Q54"
    },
    {
        "id": "eng_1979_q56",
        "topic": "Vocabulary: Aversion",
        "year": "1979",
        "text": "Choose the option nearest in meaning to the underlined word:\n'Do you have the same aversion as I do for war films?'",
        "opts": ["Bitterness", "Strong dislike", "Criticism", "Preference"],
        "ans": 1,
        "exp": "'Aversion' means a strong dislike or disinclination towards something.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1979 • Q56"
    },
    {
        "id": "eng_1979_q57",
        "topic": "Phrasal Verbs: Taken in",
        "year": "1979",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'I didn\\'t think she could be so easily taken in by his pretences.'",
        "opts": ["Flattered", "Deceived", "Enamoured", "Overcome"],
        "ans": 1,
        "exp": "To be 'taken in' means to be cheated, tricked, or deceived.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1979 • Q57"
    },
    {
        "id": "eng_1979_q58",
        "topic": "Idioms: Crux of the matter",
        "year": "1979",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'The crux of the matter is that the president has just become aware of the mismanagement.'",
        "opts": [
            "The part of the problem that just surfaced",
            "The result of the matter",
            "The most important and decisive aspect of the problem",
            "The moment of crisis"
        ],
        "ans": 2,
        "exp": "'The crux of the matter' is the central, vital, or most decisive point of an issue.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q58"
    },
    {
        "id": "eng_1979_q59",
        "topic": "Vocabulary: Perjury",
        "year": "1979",
        "text": "Choose the option nearest in meaning to the underlined phrase:\n'The witness was guilty of swearing to a statement he knew to be false.'",
        "opts": ["Forgery", "Perjury", "Libel", "Slander"],
        "ans": 1,
        "exp": "'Perjury' is the criminal offense of deliberately telling an untruth or swearing falsely under oath in court.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1979 • Q59"
    },
    # 1980 Lexis & Structure
    {
        "id": "eng_1980_q37",
        "topic": "Vocabulary: Penury",
        "year": "1980",
        "text": "Choose the word closest in meaning to the underlined word:\n'His penury gave him a lifetime of hunger.'",
        "opts": ["Avariciousness", "Affluence", "Extreme poverty", "Penny-pinching"],
        "ans": 2,
        "exp": "'Penury' refers to the state of being extremely poor or destitute.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1980 • Q37"
    },
    {
        "id": "eng_1980_q38",
        "topic": "Vocabulary: Prodigal",
        "year": "1980",
        "text": "Choose the word closest in meaning to the underlined word:\n'The bible\\'s prodigal son became quite wealthy eventually.'",
        "opts": ["Prestigious", "Phlegmatic", "Errant", "Extravagant and wasteful"],
        "ans": 3,
        "exp": "'Prodigal' means spending money or using resources freely and recklessly; wastefully extravagant.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1980 • Q38"
    },
    {
        "id": "eng_1980_q39",
        "topic": "Vocabulary: Innocuous",
        "year": "1980",
        "text": "Choose the word closest in meaning to the underlined word:\n'Don\\'t eat just any innocuous-looking mushroom you see around.'",
        "opts": ["Harmful", "Harmless and inoffensive", "Innocent", "Conspicuous"],
        "ans": 1,
        "exp": "'Innocuous' means not harmful or offensive; harmless.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1980 • Q39"
    },
    {
        "id": "eng_1980_q40",
        "topic": "Vocabulary: Colossal",
        "year": "1980",
        "text": "Choose the word closest in meaning to the word:\n'Colossal' means:",
        "opts": ["A Greek column", "Gigantic and immense", "A calamity", "Sale of colours"],
        "ans": 1,
        "exp": "'Colossal' means extremely large, huge, or gigantic.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1980 • Q40"
    },
    {
        "id": "eng_1980_q47",
        "topic": "Phrasal Verbs: Make up for",
        "year": "1980",
        "text": "Choose the best option to fill the gap:\n'You have been absent from classes for four months. How can you _____ for the lost time?'",
        "opts": ["make in", "make up", "make off", "make out"],
        "ans": 1,
        "exp": "To 'make up for' means to compensate for a loss, absence, or mistake.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1980 • Q47"
    },
    {
        "id": "eng_1980_q48",
        "topic": "Idioms: Out of order",
        "year": "1980",
        "text": "Choose the best option to fill the gap:\n'I am afraid you cannot use this telephone; it is _____.'",
        "opts": ["out of order", "in order", "for order", "at order"],
        "ans": 0,
        "exp": "'Out of order' is the standard English idiom for broken or non-functioning equipment.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1980 • Q48"
    },
    {
        "id": "eng_1980_q55",
        "topic": "Grammar: Subjunctive with 'As if'",
        "year": "1980",
        "text": "Choose the option that correctly completes the sentence:\n'He acts _____ he were a general manager.'",
        "opts": ["as", "if", "as if", "so as"],
        "ans": 2,
        "exp": "'As if' introduces an unreal comparison or counterfactual condition requiring the past subjunctive 'were'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1980 • Q55"
    },
    {
        "id": "eng_1980_q57",
        "topic": "Grammar: Preference with 'Would rather'",
        "year": "1980",
        "text": "Choose the option that correctly completes the sentence:\n'Could I ring him up? I\\'d rather you _____.'",
        "opts": ["visit him", "visited him", "would visit him", "visiting him"],
        "ans": 1,
        "exp": "When 'would rather' has a different subject for the subordinate clause ('you'), it takes the past subjunctive ('visited him').",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 1980 • Q57"
    },
    {
        "id": "eng_1980_q66",
        "topic": "Vocabulary: Jaundiced",
        "year": "1980",
        "text": "Choose the option which has the same meaning as the underlined word:\n'He has never been a good mediator because in most cases his views are always jaundiced.'",
        "opts": ["Coloured", "Sickly", "Suspicious", "Prejudiced and biased"],
        "ans": 3,
        "exp": "'Jaundiced' figuratively means showing or feeling resentment, prejudice, or bitter bias.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1980 • Q66"
    },
    {
        "id": "eng_1980_q67",
        "topic": "Idioms: Point blank",
        "year": "1980",
        "text": "Choose the option which has the same meaning as the underlined phrase:\n'The husband accused her point-blank of misconduct.'",
        "opts": ["Bluntly and directly", "Pointedly", "Emphatically", "Mistakenly"],
        "ans": 0,
        "exp": "'Point-blank' means bluntly, directly, and without evasion.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1980 • Q67"
    },
    {
        "id": "eng_1980_q68",
        "topic": "Idioms: Ring true",
        "year": "1980",
        "text": "Choose the option which has the same meaning as the underlined phrase:\n'The vote of thanks which was moved did not ring true.'",
        "opts": ["Was inaudible", "Was not honest/genuine", "Was all lies", "Was distorted"],
        "ans": 1,
        "exp": "To 'ring true' means to sound authentic and sincere. Negative: 'did not sound genuine/honest'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1980 • Q68"
    },
    {
        "id": "eng_1980_q69",
        "topic": "Idioms: Cock and bull story",
        "year": "1980",
        "text": "Choose the option which has the same meaning as the underlined phrase:\n'I listened with rapt attention as he told me a cock and bull story.'",
        "opts": ["A story about animals", "An incredible and fabricated story", "An interesting legend", "An eyewitness account"],
        "ans": 1,
        "exp": "A 'cock and bull story' is an absurd, unbelievable, and implausible tale used as an excuse.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1980 • Q69"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart2", questions)
print("Part 2 built successfully")
