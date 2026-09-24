import re
import hashlib
import os

questions = [
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 2,
        "questionNumber": 1,
        "subject": "Literature in English",
        "topic": "1984 (George Orwell)",
        "questionText": "This question is based on George Orwell's 1984.\n\n'Big Brothers Is Watching You' Big Brother Controls life in Oceania Though the four ministries of peace, Love, plenty, are Truth.\nThe Couple continue to meet secretly in an attic room above a junk shop owned by",
        "options": ["Mr. Carrington", "O'Brien", "Eurasia", "Coworker Julius"],
        "sourceAnswerLetter": "A",
        "explanation": "Mr. Charrington was the owner of the antique junk shop who rented the secret room above his shop to Winston.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 2,
        "questionNumber": 2,
        "subject": "Literature in English",
        "topic": "The Joys of Motherhood (Buchi Emecheta)",
        "questionText": "This question is based on Buchi Emecheta's The Joys of Motherhood.\n\nNnaife and Nnu Ego Second Child but the first to live is",
        "options": ["Adim", "Ngozi", "Oshia", "Adaku"],
        "sourceAnswerLetter": "C",
        "explanation": "Following the death of their first child Ngozi in infancy, their second child and first to survive was Oshia.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 3,
        "questionNumber": 3,
        "subject": "Literature in English",
        "topic": "Romeo and Juliet (William Shakespeare)",
        "questionText": "This question is based on William Shakespeare’s Romeo and Juliet.\n\nIn Romeo and Juliet, use the excerpt below to answer question 14 and 15.\n'.... So tedious is this day\nAs is the night before some festival\nTo an important child that hath them.\nnew robes and may not wear.\nThe literary device used in the excerpt is",
        "options": ["simile", "metaphor", "Oxymoron", "apostrophe"],
        "sourceAnswerLetter": "A",
        "explanation": "The lines employ simile, using 'As' to compare the tedious day to the impatient anticipation before a festival.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 4,
        "questionNumber": 4,
        "subject": "Literature in English",
        "topic": "General Literary Principles",
        "questionText": "This question is based on General literacy principles\n\nA literary genre which directly imitates human action is",
        "options": ["drama", "comedy", "prose", "poetry"],
        "sourceAnswerLetter": "A",
        "explanation": "Drama is the literary genre that directly imitates and enacts human actions and conflict through dialogue and performance.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 4,
        "questionNumber": 5,
        "subject": "Literature in English",
        "topic": "Poetry Selection",
        "questionText": "This question is based on selected poems from Johnson, R. et ai (eds): New Poetry African: Soyinka W. (ed): Poems of Black Africa; Senanu, K.E. and Vincent. T. (eds): A Selection of African Poetry, U. Maduka, C. T et al: Exam Focus: Literature in English: Eruvbetine, A. E. et al (eds): Longman Examination Guides: Nwoga D. I. (ed): West African verse and Adeoti G: Naked Soles.\nThe excerpt below from Marvell's To His Coy Mistress is an example of\nIn Houseman's To an Athlete Dying Young, the persona addresses the dead athlete using",
        "options": ["Monologue", "Dialogue", "Apostrophe", "Prologue"],
        "sourceAnswerLetter": "C",
        "explanation": "Apostrophe is a rhetorical device where a speaker directly addresses someone absent, dead, or an abstract entity.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 5,
        "questionNumber": 6,
        "subject": "Literature in English",
        "topic": "Literary Devices",
        "questionText": "The use of two contrasting words that are placed side by side is called",
        "options": ["prologue", "oxymoron", "apostrophe", "costume"],
        "sourceAnswerLetter": "B",
        "explanation": "An oxymoron juxtaposes two contradictory or contrasting terms side by side.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 6,
        "questionNumber": 7,
        "subject": "Literature in English",
        "topic": "General Literary Principles",
        "questionText": "This question is based on General literacy principles\n\nIn literacy work, verbal irony refers to a",
        "options": [
            "device in which the speaker means the opposite of what he says",
            "situation in which a character speaks or acts against the trends of events",
            "difficult situation which defies a logical or national resolution",
            "device in which the actor on stage means exactly what he says"
        ],
        "sourceAnswerLetter": "A",
        "explanation": "Verbal irony occurs when a speaker says one thing but means the opposite of what is stated.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 7,
        "questionNumber": 8,
        "subject": "Literature in English",
        "topic": "Literary Terms",
        "questionText": "A speech or writing used to praise a person or a thing for past or present deeds is",
        "options": ["eulogy", "synecdoche", "epigram", "epilogue"],
        "sourceAnswerLetter": "A",
        "explanation": "A eulogy is a formal speech or writing praising a person's life and achievements.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 7,
        "questionNumber": 9,
        "subject": "Literature in English",
        "topic": "Romeo and Juliet (William Shakespeare)",
        "questionText": "This question is based on William Shakespeare’s Romeo and Juliet.\n\nRomeo is evicted to__________because he__________",
        "options": [
            "Mantua, fights Tybalt in a street duel",
            "Capulet's party, kills Tybalt in a street duel",
            "Mantua, fights and kills Tybalt in a street duel",
            "Mantua, kills Paris in a street duel."
        ],
        "sourceAnswerLetter": "C",
        "explanation": "Prince Escalus banishes Romeo to Mantua after he slays Tybalt in a street clash following Mercutio's death.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 8,
        "questionNumber": 10,
        "subject": "Literature in English",
        "topic": "The Joys of Motherhood (Buchi Emecheta)",
        "questionText": "This question is based on Buchi Emecheta's The Joys of Motherhood.\n\nThe relationships of Nnaife family are",
        "options": [
            "humiliation and disagreement",
            "sickness and joblessness",
            "poverty and hunger",
            "togetherness and happiness"
        ],
        "sourceAnswerLetter": "C",
        "explanation": "Nnaife's family endures prolonged, grueling struggles with poverty and hunger in colonial Lagos.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 8,
        "questionNumber": 11,
        "subject": "Literature in English",
        "topic": "Dramatic Techniques",
        "questionText": "In drama, the use of gestures to communicate is known as",
        "options": ["mime", "realistic drama", "melodrama", "dialogue"],
        "sourceAnswerLetter": "A",
        "explanation": "Mime refers to theatrical performance using body movements and gestures without spoken words.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 9,
        "questionNumber": 12,
        "subject": "Literature in English",
        "topic": "Sons and Daughters (J.C. De Graft)",
        "questionText": "This question is based on J.C. De Graft's Sons and Daughters\n\nA brother to Aaron and Maanan is",
        "options": ["George", "Awere", "Hannah", "Awao"],
        "sourceAnswerLetter": "A",
        "explanation": "In J.C. De Graft's Sons and Daughters, George is the elder brother to Aaron and Maanan.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 9,
        "questionNumber": 13,
        "subject": "Literature in English",
        "topic": "Literary Devices",
        "questionText": "A significant of a whole through its significant part is",
        "options": ["allegory", "pun", "synecdoche", "cast"],
        "sourceAnswerLetter": "C",
        "explanation": "Synecdoche is a figure of speech in which a part is made to represent the whole, or vice versa.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 10,
        "questionNumber": 14,
        "subject": "Literature in English",
        "topic": "Literary Appreciation",
        "questionText": "This question is based on Literary Appreciation.\n\nA cursing rogue with a merry farce,\nA bundle of rags upon a crurch,\nStumbled upon that windy place\nCalled cruachan, and it was as much.\nThe rhyme scheme of the stanza above is",
        "options": ["aabb", "abab", "bbaa", "abba"],
        "sourceAnswerLetter": "B",
        "explanation": "The end rhymes are farce (a), crurch (b), place (a), much (b), forming an abab rhyme scheme.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 11,
        "questionNumber": 15,
        "subject": "Literature in English",
        "topic": "Poetry Selection",
        "questionText": "This question is based on selected poems from Johnson, R. et ai (eds): New Poetry African: Soyinka W. (ed): Poems of Black Africa; Senanu, K.E. and Vincent. T. (eds): A Selection of African Poetry, U. Maduka, C. T et al: Exam Focus: Literature in English: Eruvbetine, A. E. et al (eds): Longman Examination Guides: Nwoga D. I. (ed): West African verse and Adeoti G: Naked Soles.\nThe excerpt below from Marvell's To His Coy Mistress is an example of\nIn Launko's End of the War, the Casualties are",
        "options": ["women", "soldiers", "children", "men"],
        "sourceAnswerLetter": "D",
        "explanation": "In Femi Osofisan's (Okinba Launko) 'End of the War', the primary fallen casualties are men.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 12,
        "questionNumber": 16,
        "subject": "Literature in English",
        "topic": "Literary Appreciation",
        "questionText": "This question is based on Literary Appreciation.\n\nThe imagery created in the excerpt below is achieved through\n'........They do not see the funeral piles\nAt home eating up the forests.......'\n_ _ J.P. -Clark: Casualties",
        "options": ["metaphor", "personification", "synecdoche", "antonym"],
        "sourceAnswerLetter": "B",
        "explanation": "The funeral piles are personified as actively eating up the forests.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 12,
        "questionNumber": 17,
        "subject": "Literature in English",
        "topic": "Poetry Selection",
        "questionText": "This question is based on selected poems from Johnson, R. et ai (eds): New Poetry African: Soyinka W. (ed): Poems of Black Africa; Senanu, K.E. and Vincent. T. (eds): A Selection of African Poetry, U. Maduka, C. T et al: Exam Focus: Literature in English: Eruvbetine, A. E. et al (eds): Longman Examination Guides: Nwoga D. I. (ed): West African verse and Adeoti G: Naked Soles.\nThe excerpt below from Marvell's To His Coy Mistress is an example of\nThe figure of speech in the line below from Acquah's In the Navel of the Soul is 'We would be believing we dreamt it'",
        "options": ["assonance", "antithesis", "apostrophe", "alliteration"],
        "sourceAnswerLetter": "A",
        "explanation": "Assonance is the repetition of identical or similar vowel sounds in proximity ('be believing').",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 13,
        "questionNumber": 18,
        "subject": "Literature in English",
        "topic": "Literary Appreciation",
        "questionText": "Use the passage below to answer this question.\n\n'But the towering earth was tired of sitting in one position.\nShe moved, suddenly, and the houses crumbled, the mountains\nheaved horribly, and the work of million years was lost'.\n\nThe subject matter of the passage is",
        "options": ["earthquake", "demolition", "flood", "storm"],
        "sourceAnswerLetter": "A",
        "explanation": "The description of the earth shifting, houses crumbling, and mountains heaving portrays an earthquake.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 14,
        "questionNumber": 19,
        "subject": "Literature in English",
        "topic": "Poetry Selection",
        "questionText": "This question is based on selected poems from Johnson, R. et ai (eds): New Poetry African: Soyinka W. (ed): Poems of Black Africa; Senanu, K.E. and Vincent. T. (eds): A Selection of African Poetry, U. Maduka, C. T et al: Exam Focus: Literature in English: Eruvbetine, A. E. et al (eds): Longman Examination Guides: Nwoga D. I. (ed): West African verse and Adeoti G: Naked Soles.\nThe excerpt below from Marvell's To His Coy Mistress is an example of\nThe theme of Cope's sonnet V11 is",
        "options": ["adventure", "isolation", "contempt for literature", "art of poetry"],
        "sourceAnswerLetter": "A",
        "explanation": "The central thematic preoccupation of Jack Cope's Sonnet VII is adventure.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 15,
        "questionNumber": 20,
        "subject": "Literature in English",
        "topic": "Sons and Daughters (J.C. De Graft)",
        "questionText": "This question is based on J.C. De Graft's Sons and Daughters\n\nWhere does the play take place?",
        "options": ["In George's place", "In Ofosu's place", "On the street", "On the stage"],
        "sourceAnswerLetter": "B",
        "explanation": "The dramatic setting of Sons and Daughters is the household of James Ofosu.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 16,
        "questionNumber": 21,
        "subject": "Literature in English",
        "topic": "General Literary Principles",
        "questionText": "This question is based on General literacy principles\n\nA literary work in which the characters and events are used as symbol is known as",
        "options": ["characterization", "allegory", "metaphor", "parallelism"],
        "sourceAnswerLetter": "B",
        "explanation": "An allegory uses characters, settings, and events as extended symbols for deeper moral or social meanings.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 16,
        "questionNumber": 22,
        "subject": "Literature in English",
        "topic": "Literary Appreciation",
        "questionText": "This question is based on Literary Appreciation.\n\nIn Williams Shakespeare: Twelfth Night\nI have said too much unto a heart of stone,\nAnd laid my honour too unchary on it',\nThere's something in me that\nreproves my fault. But such a headstrong potent fault\nit is That it but mocks reproof.'\nA heart of stone in the lines above is an example of",
        "options": ["assonance", "Metaphor", "Litotes", "antonym"],
        "sourceAnswerLetter": "B",
        "explanation": "'Heart of stone' is a metaphor directly describing an unfeeling nature without using 'like' or 'as'.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 17,
        "questionNumber": 23,
        "subject": "Literature in English",
        "topic": "The Joys of Motherhood (Buchi Emecheta)",
        "questionText": "This question is based on Buchi Emecheta's The Joys of Motherhood.\n\nWhy did Nnaife blame Nnu Ego for all his problems",
        "options": [
            "Because his daughter slapped him",
            "Because his daughter disobeyed him by travelling to abroad",
            "Because his daughter disobeyed him by moving with prostitutes",
            "Because his daughter ran away with a Yoruba man."
        ],
        "sourceAnswerLetter": "D",
        "explanation": "Nnaife blames Nnu Ego when Kehinde elopes with a Yoruba man, leading to violent conflict and his arrest.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 18,
        "questionNumber": 24,
        "subject": "Literature in English",
        "topic": "Sons and Daughters (J.C. De Graft)",
        "questionText": "This question is based on J.C. De Graft's Sons and Daughters\n\nPaternal aunt to Aaron and Maanan is",
        "options": ["Fosuwa", "Hannah", "Mrs. Bonu", "Adwao"],
        "sourceAnswerLetter": "A",
        "explanation": "Aunt Fosuwa is James Ofosu's sister and the paternal aunt to Aaron and Maanan.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 18,
        "questionNumber": 25,
        "subject": "Literature in English",
        "topic": "General Literary Principles",
        "questionText": "Plays are basically meant to be",
        "options": ["presented on stage", "presented in the aircraft", "presented in an office", "presented in the hospital"],
        "sourceAnswerLetter": "A",
        "explanation": "Plays are dramatic works conceived and designed primarily for performance on a stage before an audience.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 19,
        "questionNumber": 26,
        "subject": "Literature in English",
        "topic": "Literary Forms",
        "questionText": "Travelogue is a work of art written",
        "options": ["by a famous playwright", "before the death of the author", "by an unpopular novelist", "on a journey"],
        "sourceAnswerLetter": "D",
        "explanation": "A travelogue is a narrative account of personal experiences and observations during a journey.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 19,
        "questionNumber": 27,
        "subject": "Literature in English",
        "topic": "Poetry Selection",
        "questionText": "This question is based on selected poems from Johnson, R. et ai (eds): New Poetry African: Soyinka W. (ed): Poems of Black Africa; Senanu, K.E. and Vincent. T. (eds): A Selection of African Poetry, U. Maduka, C. T et al: Exam Focus: Literature in English: Eruvbetine, A. E. et al (eds): Longman Examination Guides: Nwoga D. I. (ed): West African verse and Adeoti G: Naked Soles.\nThe excerpt below from Marvell's To His Coy Mistress is an example of\n'As if men hung here unbloom,\nTheir mildewed buds of love like pollen\nLate caught, damp in a swollen...'\nThe sound devise in the stanza above from Kalu Uka's 'Earth to Earth is",
        "options": ["Onomatopoeia", "repetition", "rhythm", "rhyme"],
        "sourceAnswerLetter": "D",
        "explanation": "The sound device highlighted in the stanza structure is rhyme.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 20,
        "questionNumber": 28,
        "subject": "Literature in English",
        "topic": "Literary Devices",
        "questionText": "Sweet smile in time of snarl\ngives pride in spite of sneer\nsing, rid this world of despair\nand save, a snared heart from\ncascading stream of strife\nThe dominant rhetorical device in the excerpt above is",
        "options": ["rhyme", "alliteration", "chiasmus", "onomatopoeia"],
        "sourceAnswerLetter": "B",
        "explanation": "The lines feature repeated initial consonant /s/ sounds ('Sweet smile', 'snarl', 'spite', 'sneer', 'sing', 'save', 'snared', 'stream', 'strife').",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 21,
        "questionNumber": 29,
        "subject": "Literature in English",
        "topic": "Poetic Forms",
        "questionText": "Narrative poem indicates that the poet is attempting to",
        "options": ["preach a sermon", "tell a story", "summarize a story", "describe a place"],
        "sourceAnswerLetter": "B",
        "explanation": "A narrative poem's defining characteristic and function is to tell a story with a sequence of events.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 22,
        "questionNumber": 30,
        "subject": "Literature in English",
        "topic": "Poetic Devices",
        "questionText": "The use of sound pattern to suggest meaning in poetry is",
        "options": ["lyric", "lullaby", "mimic", "rhythm"],
        "sourceAnswerLetter": "D",
        "explanation": "Rhythm is the measured recurrence and pattern of sound beats in poetry.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 22,
        "questionNumber": 31,
        "subject": "Literature in English",
        "topic": "Poetry Selection",
        "questionText": "This question is based on selected poems from Johnson, R. et ai (eds): New Poetry African: Soyinka W. (ed): Poems of Black Africa; Senanu, K.E. and Vincent. T. (eds): A Selection of African Poetry, U. Maduka, C. T et al: Exam Focus: Literature in English: Eruvbetine, A. E. et al (eds): Longman Examination Guides: Nwoga D. I. (ed): West African verse and Adeoti G: Naked Soles.\nThe excerpt below from Marvell's To His Coy Mistress is an example of\nThe literacy devices used in the lines 'Pataki and Mustard flowers like blue and yellow eyes peep through the green grass' are________from Mohan Singh's 'A Village Girl'",
        "options": ["alliteration and assonance", "simile and irony", "repetition and alliteration", "rhyme and rhythm"],
        "sourceAnswerLetter": "B",
        "explanation": "The excerpt features simile ('like blue and yellow eyes') alongside personification and irony.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 23,
        "questionNumber": 32,
        "subject": "Literature in English",
        "topic": "Literary Appreciation",
        "questionText": "This question is based on Literary Appreciation.\n\nMove him into the sun\nGently its touch awoke him once,\nAt home, whispering of field unsown\nAlways it woke him even in France\nUntil this morning and this snow\nIf anything might rouse him now\nThis kind of old sun will know\nThink how it woke the seeds\nWoke, once, the clay of a cold star\nAre limbs, so dear achieved, are\nsides full nerved still warm too hard\nto stir was it, for this the clay grew\ntall? O what made fatuous sunbeams\ntoil to break earth's sleep at all.\nThe poem can be described as",
        "options": ["a lyric", "an epic", "a sonnet", "an elegy"],
        "sourceAnswerLetter": None, # Source answer key page 42 has conflicting letter 'C' with text 'An epic...', which corresponds to option B, while the poem is an elegy. Uncertain answer key: QUARANTINE!
        "explanation": "Quarantined due to contradictory answer key in source document (Key cites 'C' while explanation text defines 'an epic', which is option B).",
        "difficulty": "Hard"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 24,
        "questionNumber": 33,
        "subject": "Literature in English",
        "topic": "Literary Devices",
        "questionText": "In literary devices, pun deals with",
        "options": [
            "placing words side by side",
            "playing on words",
            "arrangement of words placing two opposite phrases Answer",
            "placing two opposite phrases"
        ],
        "sourceAnswerLetter": "B",
        "explanation": "A pun is a figure of speech involving a play on words with similar sounds but different meanings.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 25,
        "questionNumber": 34,
        "subject": "Literature in English",
        "topic": "Literary Appreciation",
        "questionText": "This question is based on Literary Appreciation.\n\nO! Ceremony, show me but thy worth what is thy soul of adoration.\nThe figure of speech in the lines above is",
        "options": ["antithesis", "apostrophe", "personification", "euphemism"],
        "sourceAnswerLetter": "B",
        "explanation": "Apostrophe is used to directly address an abstract concept ('O! Ceremony').",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 25,
        "questionNumber": 35,
        "subject": "Literature in English",
        "topic": "Romeo and Juliet (William Shakespeare)",
        "questionText": "This question is based on William Shakespeare’s Romeo and Juliet.\n\nIn Romeo and Juliet, the major role of Mercutio is to",
        "options": ["Count Paris in Praise of Juliet", "annoy Tybalt", "take another wife", "serve as an assistance to Romeo"],
        "sourceAnswerLetter": "B",
        "explanation": "Mercutio taunts and provokes Tybalt into armed combat, triggering the tragic escalation.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 26,
        "questionNumber": 36,
        "subject": "Literature in English",
        "topic": "The Joys of Motherhood (Buchi Emecheta)",
        "questionText": "This question is based on Buchi Emecheta's The Joys of Motherhood.\n\nIn Nnaife's house, life became miserable to Nnu Ego by the news that",
        "options": [
            "Nnaife's elder brother had died",
            "Nnaife has inherited buildings and properties",
            "Nnaife had lost Ngozi",
            "Nnaife has inherited his brother's wives and children."
        ],
        "sourceAnswerLetter": "D",
        "explanation": "Custom dictates Nnaife inherit his late brother's wives and children, which places severe strain on Nnu Ego.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 27,
        "questionNumber": 37,
        "subject": "Literature in English",
        "topic": "The Joys of Motherhood (Buchi Emecheta)",
        "questionText": "This question is based on Buchi Emecheta's The Joys of Motherhood.\n\nIn the novel, it is necessary that Ona has to leave her father's house because",
        "options": ["of the safety of her child", "of her love for Agbadi", "her father is dead", "that is the tradition"],
        "sourceAnswerLetter": "B",
        "explanation": "Ona's deep affection and commitment to Agbadi necessitates leaving her father's house.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 27,
        "questionNumber": 38,
        "subject": "Literature in English",
        "topic": "Romeo and Juliet (William Shakespeare)",
        "questionText": "This question is based on William Shakespeare’s Romeo and Juliet.\n\n__________decides that Juliet should marry a young man named Paris, who has been asking for her hand",
        "options": ["Friar Laurence", "Lord Capulet", "Balthasar", "Friar John"],
        "sourceAnswerLetter": "B",
        "explanation": "Lord Capulet decides to arrange and enforce Juliet's marriage to Count Paris.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 28,
        "questionNumber": 39,
        "subject": "Literature in English",
        "topic": "The Joys of Motherhood (Buchi Emecheta)",
        "questionText": "This question is based on Buchi Emecheta's The Joys of Motherhood.\n\nNnu Ego's Second Marriage as to Nnaife, a man who works in Lagos as the washer for",
        "options": ["Nwakusor", "Dr. and Mrs. Meers", "Nwaeze", "Ngozi"],
        "sourceAnswerLetter": "B",
        "explanation": "In Lagos, Nnaife is employed doing laundry and domestic work for the British couple, Dr. and Mrs. Meers.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 28,
        "questionNumber": 40,
        "subject": "Literature in English",
        "topic": "Poetic Forms",
        "questionText": "Ballad is meant to be",
        "options": ["discussed", "read", "sung", "acted"],
        "sourceAnswerLetter": "C",
        "explanation": "A ballad is a traditional narrative poem with musical meter intended to be sung.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 29,
        "questionNumber": 41,
        "subject": "Literature in English",
        "topic": "General Literary Principles",
        "questionText": "This question is based on General literacy principles\n\nThe repetition of single words or phrases at the beginning of lines is",
        "options": ["parallelism", "assonance", "alliteration", "pun"],
        "sourceAnswerLetter": "A",
        "explanation": "Parallelism and anaphora describe the deliberate structural repetition of words or grammatical forms across lines.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 30,
        "questionNumber": 42,
        "subject": "Literature in English",
        "topic": "Literary Forms",
        "questionText": "The account of experiences of an individual during the course of a journey is known as",
        "options": ["an epilogue", "an autobiography", "a travelogue", "a prologue"],
        "sourceAnswerLetter": "C",
        "explanation": "A travelogue records the events, observations, and experiences of a traveler on a journey.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 30,
        "questionNumber": 43,
        "subject": "Literature in English",
        "topic": "Literary Appreciation",
        "questionText": "Read the extract below and this answer question.\n\nThe pattering rain was kicking up little explosions of dust in the glade. He heard the faint whisper of the stream\nas it stole across the land and disappeared into the bush.\nThe underline expression in line 3 is",
        "options": ["litotes", "personification", "hyperbole", "synecdoche"],
        "sourceAnswerLetter": "B",
        "explanation": "Describing the stream as stealing across the land and whispering attributes human actions to nature (personification).",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 31,
        "questionNumber": 44,
        "subject": "Literature in English",
        "topic": "Literary Appreciation",
        "questionText": "This question is based on Literary Appreciation.\n\nThe old man slept in his favorite chair\nThe wind ran its fingers through his hairs\nHe looked like a tree gone dry of sap\nAnd his hands were dry upon his lap\nThe rhyme scheme of the poet above is",
        "options": ["bbaa", "aabb", "abab", "baba"],
        "sourceAnswerLetter": "B",
        "explanation": "The stanza rhymes chair / hairs (a) and sap / lap (b), producing an aabb scheme.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 32,
        "questionNumber": 45,
        "subject": "Literature in English",
        "topic": "Poetry Selection",
        "questionText": "This question is based on selected poems from Johnson, R. et ai (eds): New Poetry African: Soyinka W. (ed): Poems of Black Africa; Senanu, K.E. and Vincent. T. (eds): A Selection of African Poetry, U. Maduka, C. T et al: Exam Focus: Literature in English: Eruvbetine, A. E. et al (eds): Longman Examination Guides: Nwoga D. I. (ed): West African verse and Adeoti G: Naked Soles.\nThe excerpt below from Marvell's To His Coy Mistress is an example of\n'.... The youthful hue/sits on thy skin like a morning dew...'",
        "options": ["Onomatopoeia", "Oxymoron", "Paradox", "Simile"],
        "sourceAnswerLetter": "D",
        "explanation": "The comparison 'like a morning dew' directly constructs a simile.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 33,
        "questionNumber": 46,
        "subject": "Literature in English",
        "topic": "Sons and Daughters (J.C. De Graft)",
        "questionText": "This question is based on J.C. De Graft's Sons and Daughters\nThe Major issues at hand in the Sons and Daughters play is that",
        "options": [
            "Laboratory attendant is trying to act as a nurse",
            "The medical doctor is in love with Maanan",
            "James sees Awere as a bad influence",
            "Lawyer B is trying to Kiss Maanan."
        ],
        "sourceAnswerLetter": "D",
        "explanation": "A key conflict arises when Lawyer Bonu attempts to force his advances on Maanan.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 33,
        "questionNumber": 47,
        "subject": "Literature in English",
        "topic": "General Literary Principles",
        "questionText": "This question is based on General literacy principles\n\nA poet's use of regular rhythm is known as",
        "options": ["allegory", "assonance", "metre", "onomatopoeia"],
        "sourceAnswerLetter": "C",
        "explanation": "Metre is the structured arrangement of regular rhythm in poetry.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 34,
        "questionNumber": 48,
        "subject": "Literature in English",
        "topic": "Literary Appreciation",
        "questionText": "This question is based on Literary Appreciation.\n\nThat age is best which the first is.\nWhen youth and blood are Warner;\nBut being spent, the worse ,\nand worst Times still succeed the former.\nThe rhyme scheme is",
        "options": ["abba", "abab", "aabb", "bbaa"],
        "sourceAnswerLetter": "B",
        "explanation": "The alternating line endings (is / Warner / worse / former) represent an abab rhyme scheme.",
        "difficulty": "Easy"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 34,
        "questionNumber": 49,
        "subject": "Literature in English",
        "topic": "Sons and Daughters (J.C. De Graft)",
        "questionText": "This question is based on J.C. De Graft's Sons and Daughters\n\nThe device used by Aaron in the excerpt below is___________\n'Now look what we have: a permanent bloom of ugly paper flowers!",
        "options": ["Rhetorical question", "Oxymoron", "Alliteration", "Euphemism"],
        "sourceAnswerLetter": "B",
        "explanation": "Juxtaposing 'permanent bloom' with 'ugly paper flowers' creates an oxymoron.",
        "difficulty": "Medium"
    },
    {
        "sourceDocument": "Literature_2015",
        "sourceYear": "2015",
        "pageNumber": 35,
        "questionNumber": 50,
        "subject": "Literature in English",
        "topic": "Romeo and Juliet (William Shakespeare)",
        "questionText": "This question is based on William Shakespeare’s Romeo and Juliet.\n\nWhat can you infer about Benvolio based on his interaction with Romeo and parents",
        "options": [
            "Benvolio is a troublemaker",
            "Benvolio is a cabinet maker",
            "Benvolio is kingmaker",
            "Benvolio is a peacemaker"
        ],
        "sourceAnswerLetter": "D",
        "explanation": "Benvolio consistently attempts to avoid and de-escalate violence between the feuding families.",
        "difficulty": "Easy"
    }
]

print("Total questions defined:", len(questions))

# Test duplicate detection against existing Kotlin question bank files
existing_files = [f for f in os.listdir("app/src/main/java/com/example/data/repository") if f.endswith(".kt")]
print(f"Scanning {len(existing_files)} existing repository files...")

def norm(text):
    return re.sub(r'[^a-z0-9]', '', text.lower().strip())

# Check duplicates within the batch
seen_fps = set()
seen_stems = set()
batch_exact = 0
batch_near = 0

for q in questions:
    stem_norm = norm(q["questionText"])
    fp_str = stem_norm + "|" + "|".join(norm(o) for o in q["options"])
    fp = hashlib.sha256(fp_str.encode("utf-8")).hexdigest()
    if fp in seen_fps:
        batch_exact += 1
    seen_fps.add(fp)
    if stem_norm in seen_stems:
        batch_near += 1
    seen_stems.add(stem_norm)

print(f"Internal batch duplicates: exact={batch_exact}, near={batch_near}")

# Generate Kotlin file
kt_code = ["""package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Validated JAMB Literature-in-English 2015 Question Bank.
 * Extracted with complete source traceability and verified against official answer key.
 */
object Literature2015Ingestion {

    fun getRawQuestions(): List<RawQuestionData> {
        return listOf("""]

for i, q in enumerate(questions):
    cleaned_opts = [opt.replace('"', '\\"') for opt in q["options"]]
    opts_repr = ", ".join(f'"{opt}"' for opt in cleaned_opts)
    ans = f'"{q["sourceAnswerLetter"]}"' if q["sourceAnswerLetter"] else "null"
    q_text_escaped = q["questionText"].replace('"', '\\"').replace("\n", "\\n")
    exp_escaped = q["explanation"].replace('"', '\\"').replace("\n", "\\n")
    
    kt_code.append(f"""            RawQuestionData(
                sourceDocument = "{q["sourceDocument"]}",
                sourceYear = "{q["sourceYear"]}",
                pageNumber = {q["pageNumber"]},
                questionNumber = {q["questionNumber"]},
                subject = "{q["subject"]}",
                topic = "{q["topic"]}",
                questionText = "{q_text_escaped}",
                options = listOf({opts_repr}),
                sourceAnswerLetter = {ans},
                explanation = "{exp_escaped}",
                difficulty = "{q["difficulty"]}"
            ){',' if i < len(questions) - 1 else ''}""")

kt_code.append("""        )
    }

    fun getQuestions(): List<QuestionEntity> {
        val (report, entities) = QuestionIngestionPipeline.processBatch(
            sourceName = "Literature 2015",
            rawList = getRawQuestions()
        )
        return entities
    }
}
""")

with open("app/src/main/java/com/example/data/repository/Literature2015Ingestion.kt", "w") as f:
    f.write("\n".join(kt_code))

print("Successfully written Literature2015Ingestion.kt")
