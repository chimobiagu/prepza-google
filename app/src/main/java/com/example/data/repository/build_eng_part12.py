import sys
from parse_eng_helper import write_bank_file

questions = [
    # 2006-2010 Grammar & Lexis
    {
        "id": "eng_2006_lex_01",
        "topic": "Grammar: Prepositions ('Divested of')",
        "year": "2006",
        "text": "Fill in the blank with the appropriate preposition:\n'The disgraced minister was divested _____ all his official titles.'",
        "opts": ["of", "from", "with", "off"],
        "ans": 0,
        "exp": "'Divest' standardly collocates with 'of' (to divest someone of power/titles/responsibilities).",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2006 • Q42"
    },
    {
        "id": "eng_2006_lex_02",
        "topic": "Lexis: Synonyms ('Insolent')",
        "year": "2006",
        "text": "Choose the word nearest in meaning to INSOLENT:",
        "opts": ["Disrespectful", "Polite", "Compliant", "Courteous"],
        "ans": 0,
        "exp": "'Insolent' means showing a rude and arrogant lack of respect. 'Disrespectful' or 'impudent' is an exact synonym.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2006 • Q55"
    },
    {
        "id": "eng_2007_lex_01",
        "topic": "Grammar: Quantifiers ('Few' vs 'A few')",
        "year": "2007",
        "text": "Choose the correct interpretation of the sentence:\n'FEW politicians attended the rally.'",
        "opts": [
            "Almost no politicians attended",
            "A considerable number of politicians attended",
            "All the politicians attended",
            "Only young politicians attended"
        ],
        "ans": 0,
        "exp": "'Few' (without an article) has a negative connotation meaning 'scarcely any' or 'almost none', whereas 'a few' has a positive connotation meaning 'some'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2007 • Q38"
    },
    {
        "id": "eng_2007_lex_02",
        "topic": "Oral English: Vowel Sounds (/iː/)",
        "year": "2007",
        "text": "Which word contains the long vowel sound /iː/ as in 'kEY'?",
        "opts": ["Receive", "Threat", "Friend", "Sieve"],
        "ans": 0,
        "exp": "'Receive' /rɪˈsiːv/ contains the long close front unrounded vowel /iː/, whereas 'threat' has /e/, 'friend' has /e/, and 'sieve' has /ɪ/.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2007 • Q88"
    },
    {
        "id": "eng_2008_lex_01",
        "topic": "Grammar: Reflexive Pronouns ('By oneself')",
        "year": "2008",
        "text": "Choose the grammatically correct completion:\n'She lives in that big house all by _____.'",
        "opts": ["herself", "her own", "her self", "herself alone"],
        "ans": 0,
        "exp": "The standard idiomatic expression for doing something alone without assistance is 'all by herself' (or 'on her own').",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2008 • Q45"
    },
    {
        "id": "eng_2008_lex_02",
        "topic": "Lexis: Antonyms ('Pusillanimous')",
        "year": "2008",
        "text": "Choose the option opposite in meaning to PUSILLANIMOUS:",
        "opts": ["Brave", "Cowardly", "Timid", "Fearful"],
        "ans": 0,
        "exp": "'Pusillanimous' means showing a lack of courage or determination; timid. The opposite is 'brave', 'courageous', or 'valiant'.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2008 • Q61"
    },
    {
        "id": "eng_2009_lex_01",
        "topic": "Grammar: Question Tags with 'I am'",
        "year": "2009",
        "text": "Choose the appropriate tag for the statement:\n'I am your best friend, _____?'",
        "opts": ["aren't I", "amn't I", "ain't I", "is it not"],
        "ans": 0,
        "exp": "In standard English, the negative question tag for 'I am' is 'aren't I?'.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2009 • Q36"
    },
    {
        "id": "eng_2009_lex_02",
        "topic": "Oral English: Consonant Sounds (/θ/)",
        "year": "2009",
        "text": "Identify the word containing the voiceless dental fricative /θ/ as in 'THin':",
        "opts": ["Therapy", "Though", "This", "Fathom"],
        "ans": 0,
        "exp": "'Therapy' /ˈθerəpi/ begins with voiceless /θ/, while 'though', 'this', and 'fathom' have voiced /ð/.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2009 • Q91"
    },
    # 2011-2015 Grammar & Structure
    {
        "id": "eng_2011_lex_01",
        "topic": "Grammar: Prepositions ('At the expense of')",
        "year": "2011",
        "text": "Complete the idiom:\n'He achieved commercial success _____ the expense of his personal health.'",
        "opts": ["at", "on", "with", "in"],
        "ans": 0,
        "exp": "The set prepositional phrase is 'at the expense of' (so as to cause harm or neglect to something).",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2011 • Q43"
    },
    {
        "id": "eng_2012_lex_01",
        "topic": "Lexis: Synonyms ('Surreptitious')",
        "year": "2012",
        "text": "Choose the word nearest in meaning to SURREPTITIOUS:",
        "opts": ["Clandestine", "Overt", "Public", "Conspicuous"],
        "ans": 0,
        "exp": "'Surreptitious' means kept secret, especially because it would not be approved of. 'Clandestine' or 'stealthy' is synonymous.",
        "diff": "Hard",
        "originLabel": "JAMB Use of English 2012 • Q57"
    },
    {
        "id": "eng_2013_lex_01",
        "topic": "Grammar: Concord ('Neither of them has/have')",
        "year": "2013",
        "text": "Choose the correct option:\n'Neither of the suspects _____ admitted guilt.'",
        "opts": ["has", "have", "were", "are"],
        "ans": 0,
        "exp": "'Neither' as a singular indefinite pronoun takes the singular auxiliary verb 'has'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2013 • Q39"
    },
    {
        "id": "eng_2014_lex_01",
        "topic": "Grammar: Conditionals ('If I were you')",
        "year": "2014",
        "text": "Choose the correct hypothetical clause:\n'If I _____ in your shoes, I would apologize immediately.'",
        "opts": ["were", "was", "am", "have been"],
        "ans": 0,
        "exp": "In the second conditional expressing unreal or hypothetical present situations, the subjunctive 'were' is standardly used for all persons.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2014 • Q48"
    },
    {
        "id": "eng_2015_lex_01",
        "topic": "Oral English: Rhymes ('Rough')",
        "year": "2015",
        "text": "Choose the word that rhymes with 'ROUGH' (/rʌf/):",
        "opts": ["Tough", "Cough", "Bough", "Through"],
        "ans": 0,
        "exp": "'Rough' /rʌf/ and 'Tough' /tʌf/ share the identical coda /-ʌf/, whereas 'cough' is /kɒf/, 'bough' is /baʊ/, and 'through' is /θruː/.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2015 • Q94"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart12", questions)
print("Part 12 built successfully")
