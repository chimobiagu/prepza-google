import json

questions = []
seen_questions = set()

def normalize_text(text):
    return " ".join(text.lower().split())

def add_question(subject, topic, question, options, correct_answer, explanation, source, requires_image=False, image_ref=None):
    norm_q = normalize_text(question)
    if norm_q in seen_questions:
        return False
    seen_questions.add(norm_q)
    
    questions.append({
        "id": f"{subject[:3].upper()}-{len(questions)+1:04d}",
        "subject": subject,
        "topic": topic,
        "question": question.strip(),
        "options": options,
        "correct_answer": correct_answer,
        "explanation": explanation.strip() if explanation else "",
        "source": source,
        "requires_image": requires_image,
        "image_reference": image_ref
    })
    return True

# 1. Literature 2015 Paper (50 questions with explicit answer key & explanations)
lit_2015 = [
    ("Literature-in-English", "1984 by George Orwell",
     "'Big Brothers Is Watching You' Big Brother Controls life in Oceania Though the four ministries of peace, Love, plenty, are Truth. The Couple continue to meet secretly in an attic room above a junk shop owned by",
     {"A": "Mr. Carrington", "B": "O'Brien", "C": "Eurasia", "D": "Coworker Julius"},
     "A", "Mr. Charrington was the man who sold the diary, and later a coral paperweight to Winston.", "JAMB Literature 2015, p. 2 / 36"),

    ("Literature-in-English", "The Joys of Motherhood",
     "Nnaife and Nnu Ego Second Child but the first to live is",
     {"A": "Adim", "B": "Ngozi", "C": "Oshia", "D": "Adaku"},
     "C", "The death of the first child Ngozi led to Nnu Ego's attempting suicide at the waterfront. The second child who survived is Oshia.", "JAMB Literature 2015, p. 2-3 / 36-37"),

    ("Literature-in-English", "Romeo and Juliet",
     "In Romeo and Juliet, use the excerpt below to answer the question:\n'.... So tedious is this day\nAs is the night before some festival\nTo an important child that hath them.\nnew robes and may not wear.'\nThe literary device used in the excerpt is",
     {"A": "simile", "B": "metaphor", "C": "Oxymoron", "D": "apostrophe"},
     "A", "Simile is the comparison of two things using 'as' or 'like'.", "JAMB Literature 2015, p. 3 / 37"),

    ("Literature-in-English", "General Literary Principles",
     "A literary genre which directly imitates human action is",
     {"A": "drama", "B": "comedy", "C": "prose", "D": "poetry"},
     "A", "Drama is written in scripts to be acted out on stage, television or radio.", "JAMB Literature 2015, p. 4 / 37"),

    ("Literature-in-English", "Poetic Devices",
     "In Houseman's To an Athlete Dying Young, the persona addresses the dead athlete using",
     {"A": "Monologue", "B": "Dialogue", "C": "Apostrophe", "D": "Prologue"},
     "C", "Apostrophe is an address directed to an absent or deceased person as if present.", "JAMB Literature 2015, p. 5 / 37"),

    ("Literature-in-English", "Literary Devices",
     "The use of two contrasting words that are placed side by side is called",
     {"A": "prologue", "B": "oxymoron", "C": "apostrophe", "D": "costume"},
     "B", "Oxymoron is the placement of two opposite words side by side.", "JAMB Literature 2015, p. 5-6 / 37"),

    ("Literature-in-English", "General Literary Principles",
     "In literacy work, verbal irony refers to a",
     {"A": "device in which the speaker means the opposite of what he says", "B": "situation in which a character speaks or acts against the trends of events", "C": "difficult situation which defies a logical or national resolution", "D": "device in which the actor on stage means exactly what he says"},
     "A", "Irony is the recognition of a reality different from its appearance; the speaker means the opposite of what is said.", "JAMB Literature 2015, p. 6 / 38"),

    ("Literature-in-English", "Literary Appreciation",
     "A speech or writing used to praise a person or a thing for past or present deeds is",
     {"A": "eulogy", "B": "synecdoche", "C": "epigram", "D": "epilogue"},
     "A", "Eulogy is praise bestowed in speech or writing for deeds.", "JAMB Literature 2015, p. 7 / 38"),

    ("Literature-in-English", "Romeo and Juliet",
     "Romeo is evicted to__________because he__________",
     {"A": "Mantua, fights Tybalt in a street duel", "B": "Capulet's party, kills Tybalt in a street duel", "C": "Mantua, fights and kills Tybalt in a street duel", "D": "Mantua, kills Paris in a street duel."},
     "C", "Romeo was banished to Mantua for killing Tybalt in a street combat.", "JAMB Literature 2015, p. 7 / 38"),

    ("Literature-in-English", "The Joys of Motherhood",
     "The relationships of Nnaife family are",
     {"A": "humiliation and disagreement", "B": "sickness and joblessness", "C": "poverty and hunger", "D": "togetherness and happiness"},
     "C", "Nnaife lost his job and the family suffered extreme poverty and hunger.", "JAMB Literature 2015, p. 8 / 38"),

    ("Literature-in-English", "Drama Principles",
     "In drama, the use of gestures to communicate is known as",
     {"A": "mime", "B": "realistic drama", "C": "melodrama", "D": "dialogue"},
     "A", "Mime is communication through physical gesture without speech.", "JAMB Literature 2015, p. 8-9 / 38"),

    ("Literature-in-English", "Sons and Daughters",
     "A brother to Aaron and Maanan is",
     {"A": "George", "B": "Awere", "C": "Hannah", "D": "Awao"},
     "A", "George is the older brother who works in medical laboratory science.", "JAMB Literature 2015, p. 9 / 39"),

    ("Literature-in-English", "Literary Devices",
     "A significant of a whole through its significant part is",
     {"A": "allegory", "B": "pun", "C": "synecdoche", "D": "cast"},
     "C", "Synecdoche is an expression using a part to represent the whole.", "JAMB Literature 2015, p. 9-10 / 39"),

    ("Literature-in-English", "Poetic Form and Rhyme",
     "A cursing rogue with a merry farce,\nA bundle of rags upon a crurch,\nStumbled upon that windy place\nCalled cruachan, and it was as much.\nThe rhyme scheme of the stanza above is",
     {"A": "aabb", "B": "abab", "C": "bbaa", "D": "abba"},
     "B", "Alternate rhyme scheme abab.", "JAMB Literature 2015, p. 10 / 39"),

    ("Literature-in-English", "End of the War",
     "In Launko's End of the War, the Casualties are",
     {"A": "women", "B": "soldiers", "C": "children", "D": "men"},
     "D", "The casualties discovered in the poem are men.", "JAMB Literature 2015, p. 11 / 39"),

    ("Literature-in-English", "Casualties by J.P. Clark",
     "The imagery created in the excerpt below is achieved through\n'........They do not see the funeral piles\nAt home eating up the forests.......'\n_ _ J.P. -Clark: Casualties",
     {"A": "metaphor", "B": "personification", "C": "synecdoche", "D": "antonym"},
     "B", "Personification attributes the living act of eating to funeral pyres.", "JAMB Literature 2015, p. 12 / 39"),

    ("Literature-in-English", "In the Navel of the Soul",
     "The figure of speech in the line below from Acquah's In the Navel of the Soul is 'We would be believing we dreamt it'",
     {"A": "assonance", "B": "antithesis", "C": "apostrophe", "D": "alliteration"},
     "A", "Assonance is the repetition of the vowel sound /i/.", "JAMB Literature 2015, p. 13 / 39"),

    ("Literature-in-English", "Literary Appreciation",
     "'But the towering earth was tired of sitting in one position. She moved, suddenly, and the houses crumbled, the mountains heaved horribly, and the work of million years was lost'.\nThe subject matter of the passage is",
     {"A": "earthquake", "B": "demolition", "C": "flood", "D": "storm"},
     "A", "The shaking of mountains and crumbling of houses depict an earthquake.", "JAMB Literature 2015, p. 13-14 / 40"),

    ("Literature-in-English", "Sonnet VII by Wendy Cope",
     "The theme of Cope's sonnet V11 is",
     {"A": "adventure", "B": "isolation", "C": "contempt for literature", "D": "art of poetry"},
     "A", "In Cope's Sonnet VII the theme centers on adventure.", "JAMB Literature 2015, p. 14-15 / 40"),

    ("Literature-in-English", "Sons and Daughters",
     "Where does the play take place?",
     {"A": "In George's place", "B": "In Ofosu's place", "C": "On the street", "D": "On the stage"},
     "B", "The drama unfolds in James Ofosu's residence.", "JAMB Literature 2015, p. 15 / 40"),

    ("Literature-in-English", "Literary Forms",
     "A literary work in which the characters and events are used as symbol is known as",
     {"A": "characterization", "B": "allegory", "C": "metaphor", "D": "parallelism"},
     "B", "An allegory is a narrative where characters and events symbolize deeper truths.", "JAMB Literature 2015, p. 16 / 40"),

    ("Literature-in-English", "Twelfth Night",
     "In Williams Shakespeare: Twelfth Night\n'I have said too much unto a heart of stone,\nAnd laid my honour too unchary on it',\nThere's something in me that reproves my fault. But such a headstrong potent fault it is That it but mocks reproof.'\nA heart of stone in the lines above is an example of",
     {"A": "assonance", "B": "Metaphor", "C": "Litotes", "D": "antonym"},
     "B", "Heart of stone is a metaphor comparing a callous heart to stone directly.", "JAMB Literature 2015, p. 16-17 / 41"),

    ("Literature-in-English", "The Joys of Motherhood",
     "Why did Nnaife blame Nnu Ego for all his problems",
     {"A": "Because his daughter slapped him", "B": "Because his daughter disobeyed him by travelling to abroad", "C": "Because his daughter disobeyed him by moving with prostitutes", "D": "Because his daughter ran away with a Yoruba man."},
     "D", "Kehinde eloping with a Yoruba man caused Nnaife to attack her father-in-law and get imprisoned.", "JAMB Literature 2015, p. 17 / 41"),

    ("Literature-in-English", "Sons and Daughters",
     "Paternal aunt to Aaron and Maanan is",
     {"A": "Fosuwa", "B": "Hannah", "C": "Mrs. Bonu", "D": "Adwao"},
     "A", "Aunt Fosuwa is sister to James and paternal aunt.", "JAMB Literature 2015, p. 18 / 41"),

    ("Literature-in-English", "General Literary Principles",
     "Plays are basically meant to be",
     {"A": "presented on stage", "B": "presented in the aircraft", "C": "presented in an office", "D": "presented in the hospital"},
     "A", "Plays are dramatic works intended to be enacted on stage.", "JAMB Literature 2015, p. 18 / 41"),

    ("Literature-in-English", "Literary Genres",
     "Travelogue is a work of art written",
     {"A": "by a famous playwright", "B": "before the death of the author", "C": "by an unpopular novelist", "D": "on a journey"},
     "D", "A travelogue is a written account of travels and journeys.", "JAMB Literature 2015, p. 19 / 41"),

    ("Literature-in-English", "Earth to Earth by Kalu Uka",
     "'As if men hung here unbloom,\nTheir mildewed buds of love like pollen\nLate caught, damp in a swollen...'\nThe sound devise in the stanza above from Kalu Uka's 'Earth to Earth is",
     {"A": "Onomatopoeia", "B": "repetition", "C": "rhythm", "D": "rhyme"},
     "D", "Rhyme refers to the sound correspondence at the ends of lines.", "JAMB Literature 2015, p. 20 / 42"),

    ("Literature-in-English", "Literary Devices",
     "Sweet smile in time of snarl\ngives pride in spite of sneer\nsing, rid this world of despair\nand save, a snared heart from\ncascading stream of strife\nThe dominant rhetorical device in the excerpt above is",
     {"A": "rhyme", "B": "alliteration", "C": "chiasmus", "D": "onomatopoeia"},
     "B", "Alliteration is the repetition of initial consonant sounds ('smile', 'snarl', 'spite', 'sneer', 'sing').", "JAMB Literature 2015, p. 20-21 / 42"),

    ("Literature-in-English", "Poetry Genres",
     "Narrative poem indicates that the poet is attempting to",
     {"A": "preach a sermon", "B": "tell a story", "C": "summarize a story", "D": "describe a place"},
     "B", "A narrative poem's primary purpose is storytelling.", "JAMB Literature 2015, p. 21 / 42"),

    ("Literature-in-English", "Poetic Structure",
     "The use of sound pattern to suggest meaning in poetry is",
     {"A": "lyric", "B": "lullaby", "C": "mimic", "D": "rhythm"},
     "D", "Rhythm is the structured cadence and sound flow.", "JAMB Literature 2015, p. 22 / 42"),

    ("Literature-in-English", "A Village Girl",
     "The literacy devices used in the lines 'Pataki and Mustard flowers like blue and yellow eyes peep through the green grass' are________from Mohan Singh's 'A Village Girl'",
     {"A": "alliteration and assonance", "B": "simile and irony", "C": "repetition and alliteration", "D": "rhyme and rhythm"},
     "B", "Simile ('like blue and yellow eyes') paired with situational perspective.", "JAMB Literature 2015, p. 23 / 42"),

    ("Literature-in-English", "Poetic Forms",
     "Move him into the sun\nGently its touch awoke him once,\nAt home, whispering of field unsown\nAlways it woke him even in France\nUntil this morning and this snow\nIf anything might rouse him now\nThis kind of old sun will know\nThink how it woke the seeds\nWoke, once, the clay of a cold star\nAre limbs, so dear achieved, are sides full nerved still warm too hard to stir was it, for this the clay grew tall? O what made fatuous sunbeams toil to break earth's sleep at all.\nThe poem can be described as",
     {"A": "a lyric", "B": "an epic", "C": "a sonnet", "D": "an elegy"},
     "D", "Elegy is a poem of lamentation for the deceased.", "JAMB Literature 2015, p. 23-24 / 42"),

    ("Literature-in-English", "Literary Devices",
     "In literary devices, pun deals with",
     {"A": "placing words side by side", "B": "playing on words", "C": "arrangement of words placing two opposite phrases Answer", "D": "placing two opposite phrases"},
     "B", "Pun is wordplay on ambiguous or similar sounding words.", "JAMB Literature 2015, p. 24 / 43"),

    ("Literature-in-English", "Literary Appreciation",
     "O! Ceremony, show me but thy worth what is thy soul of adoration.\nThe figure of speech in the lines above is",
     {"A": "antithesis", "B": "apostrophe", "C": "personification", "D": "euphemism"},
     "B", "Apostrophe addresses 'Ceremony' directly.", "JAMB Literature 2015, p. 25 / 43"),

    ("Literature-in-English", "Romeo and Juliet",
     "In Romeo and Juliet, the major role of Mercutio is to",
     {"A": "Count Paris in Praise of Juliet", "B": "annoy Tybalt", "C": "take another wife", "D": "serve as an assistance to Romeo"},
     "B", "Mercutio provokes Tybalt which leads to the fatal duel.", "JAMB Literature 2015, p. 25-26 / 43"),

    ("Literature-in-English", "The Joys of Motherhood",
     "In Nnaife's house, life became miserable to Nnu Ego by the news that",
     {"A": "Nnaife's elder brother had died", "B": "Nnaife has inherited buildings and properties", "C": "Nnaife had lost Ngozi", "D": "Nnaife has inherited his brother's wives and children."},
     "D", "The burden of inheriting wives and children caused deep strain.", "JAMB Literature 2015, p. 26 / 43"),

    ("Literature-in-English", "The Joys of Motherhood",
     "In the novel, it is necessary that Ona has to leave her father's house because",
     {"A": "of the safety of her child", "B": "of her love for Agbadi", "C": "her father is dead", "D": "that is the tradition"},
     "B", "Her attachment and love for Agbadi.", "JAMB Literature 2015, p. 27 / 43-44"),

    ("Literature-in-English", "Romeo and Juliet",
     "__________decides that Juliet should marry a young man named Paris, who has been asking for her hand",
     {"A": "Friar Laurence", "B": "Lord Capulet", "C": "Balthasar", "D": "Friar John"},
     "B", "Lord Capulet decides upon Juliet marrying Paris.", "JAMB Literature 2015, p. 27-28 / 44"),

    ("Literature-in-English", "The Joys of Motherhood",
     "Nnu Ego's Second Marriage as to Nnaife, a man who works in Lagos as the washer for",
     {"A": "Nwakusor", "B": "Dr. and Mrs. Meers", "C": "Nwaeze", "D": "Ngozi"},
     "B", "Nnaife washed clothes for Dr. and Mrs. Meers.", "JAMB Literature 2015, p. 28 / 44"),

    ("Literature-in-English", "Poetic Genres",
     "Ballad is meant to be",
     {"A": "discussed", "B": "read", "C": "sung", "D": "acted"},
     "C", "Ballads are narrative songs composed to be sung.", "JAMB Literature 2015, p. 28-29 / 44"),

    ("Literature-in-English", "Literary Devices",
     "The repetition of single words or phrases at the beginning of lines is",
     {"A": "parallelism", "B": "assonance", "C": "alliteration", "D": "pun"},
     "A", "Parallelism / anaphora.", "JAMB Literature 2015, p. 29 / 44"),

    ("Literature-in-English", "Literary Forms",
     "The account of experiences of an individual during the course of a journey is known as",
     {"A": "an epilogue", "B": "an autobiography", "C": "a travelogue", "D": "a prologue"},
     "C", "A travelogue.", "JAMB Literature 2015, p. 30 / 44-45"),

    ("Literature-in-English", "Literary Appreciation",
     "Read the extract below and this answer question.\n'The pattering rain was kicking up little explosions of dust in the glade. He heard the faint whisper of the stream as it stole across the land and disappeared into the bush.'\nThe underline expression in line 3 is",
     {"A": "litotes", "B": "personification", "C": "hyperbole", "D": "synecdoche"},
     "B", "Personification represents the stream as stealing and whispering.", "JAMB Literature 2015, p. 30-31 / 45"),

    ("Literature-in-English", "Poetic Form and Rhyme",
     "The old man slept in his favorite chair\nThe wind ran its fingers through his hairs\nHe looked like a tree gone dry of sap\nAnd his hands were dry upon his lap\nThe rhyme scheme of the poet above is",
     {"A": "bbaa", "B": "aabb", "C": "abab", "D": "baba"},
     "B", "Rhyme scheme aabb.", "JAMB Literature 2015, p. 31 / 45"),

    ("Literature-in-English", "To His Coy Mistress",
     "'.... The youthful hue/sits on thy skin like a morning dew...'\nThe excerpt below from Marvell's To His Coy Mistress is an example of",
     {"A": "Onomatopoeia", "B": "Oxymoron", "C": "Paradox", "D": "Simile"},
     "D", "Simile comparing youthful hue to morning dew with 'like'.", "JAMB Literature 2015, p. 32 / 45"),

    ("Literature-in-English", "Sons and Daughters",
     "The Major issues at hand in the Sons and Daughters play is that",
     {"A": "Laboratory attendant is trying to act as a nurse", "B": "The medical doctor is in love with Maanan", "C": "James sees Awere as a bad influence", "D": "Lawyer B is trying to Kiss Maanan."},
     "D", "Lawyer Bonu's advances to kiss Maanan.", "JAMB Literature 2015, p. 33 / 45-46"),

    ("Literature-in-English", "Poetic Structure",
     "A poet's use of regular rhythm is known as",
     {"A": "allegory", "B": "assonance", "C": "metre", "D": "onomatopoeia"},
     "C", "Metre is measured rhythm.", "JAMB Literature 2015, p. 33-34 / 46"),

    ("Literature-in-English", "Poetic Form and Rhyme",
     "That age is best which the first is.\nWhen youth and blood are Warner;\nBut being spent, the worse ,\nand worst Times still succeed the former.\nThe rhyme scheme is",
     {"A": "abba", "B": "abab", "C": "aabb", "D": "bbaa"},
     "B", "Alternate rhyme scheme abab.", "JAMB Literature 2015, p. 34 / 46"),

    ("Literature-in-English", "Sons and Daughters",
     "The device used by Aaron in the excerpt below is___________\n'Now look what we have: a permanent bloom of ugly paper flowers!",
     {"A": "Rhetorical question", "B": "Oxymoron", "C": "Alliteration", "D": "Euphemism"},
     "B", "Oxymoron in the contrast of bloom and ugly paper flowers.", "JAMB Literature 2015, p. 35 / 46"),

    ("Literature-in-English", "Romeo and Juliet",
     "What can you infer about Benvolio based on his interaction with Romeo and parents",
     {"A": "Benvolio is a troublemaker", "B": "Benvolio is a cabinet maker", "C": "Benvolio is kingmaker", "D": "Benvolio is a peacemaker"},
     "D", "Benvolio is a peacemaker attempting to stop conflict.", "JAMB Literature 2015, p. 35-36 / 46-47")
]

for item in lit_2015:
    add_question(*item)

# 2. Islamic Religious Studies 2011 Paper (51 questions)
irs_2011 = [
    ("Islamic Religious Studies", "Revelation at Cave Hira",
     "The outcome of the Prophet’s visit to Cave Hira was",
     {"A": "compilation of the Glorious Qur’an", "B": "revelation of the Glorious Qur’an", "C": "award of chieftaincy title by the Makkan aristocrats", "D": "his resolve to migrate to Madinah."},
     "B", "Angel Jibril appeared to Prophet Muhammad at age 40 with the first revelation.", "JAMB IRS 2011, p. 1 / 14"),

    ("Islamic Religious Studies", "First Revelation",
     "One of the importance of the first revelation was the",
     {"A": "description of the Arabian peninsula to the Prophet (SAW)", "B": "dissemination of knowledge", "C": "explanation of knowledge", "D": "description of the steps of acquiring knowledge."},
     "B", "Surah al-Alaq (96:1-5) emphasizes knowledge through reading and pen.", "JAMB IRS 2011, p. 1 / 14"),

    ("Islamic Religious Studies", "Gradual Revelation",
     "The gradual spiritual and moral development of Muslims was the wisdom behind the",
     {"A": "compilation of the Glorious Qur’an", "B": "standardization of the Glorious Qur’an", "C": "preservation of the Glorious Qur’an", "D": "piecemeal revelation of the Glorious Qur’an."},
     "D", "The Qur'an was revealed piecemeal over 23 years for gradual moral growth.", "JAMB IRS 2011, p. 2 / 14"),

    ("Islamic Religious Studies", "Preservation of Qur'an",
     "The verse 'Surely, We have sent down the Reminder [al-Qur'an] and surely we will protect it' is in relation to the",
     {"A": "standardization of the Glorious Qur’an", "B": "preservation of the Glorious Qur’an", "C": "compilation of the Glorious Qur’an", "D": "arrangement of the Glorious Qur’an."},
     "B", "Qur'an 15:9 guarantees the divine preservation of the text.", "JAMB IRS 2011, p. 2 / 14"),

    ("Islamic Religious Studies", "Compilation History",
     "The battle that served as a pointer to the compilation of the Glorious Qur’an was fought at",
     {"A": "Khandaq", "B": "Uhud", "C": "Tabūk", "D": "Yamāmah"},
     "D", "The martyrdom of many memorizers at the Battle of Yamamah led to compilation.", "JAMB IRS 2011, p. 2 / 14"),

    ("Islamic Religious Studies", "Standardization of the Qur'an",
     "The committee that standardized the Glorious Qur’an is made up of",
     {"A": "six people", "B": "five people", "C": "four people", "D": "three people"},
     "C", "Caliph Uthman appointed a committee of four: Zaid bin Thabit, Abdullahi bin Zubair, Sa'ad bin Al-As, and Abdul-Rahman bin Harith.", "JAMB IRS 2011, p. 2-3 / 14"),

    ("Islamic Religious Studies", "Makkan Surahs",
     "A characteristic common to Makkan chapters is that, they",
     {"A": "are long", "B": "address the people of the Book", "C": "contain a lot of oaths", "D": "make references to battles."},
     "C", "Makkan chapters are characterized by solemn oaths and emphasis on monotheism.", "JAMB IRS 2011, p. 3 / 14"),

    ("Islamic Religious Studies", "Authenticity of Qur'an",
     "The victory of the Roman Empire over the Persian Empire after the Persians had defeated the Romans as stated in the Glorious Qur’an (Q. 30: 2-3) is an evidence of the",
     {"A": "beauty of the words of the Glorious Qur’an", "B": "historical nature of the Glorious Qur’an", "C": "simplicity of the wordings of the Glorious Qur’an", "D": "authenticity of the Glorious Qur’an"},
     "D", "The historical fulfillment of Surah ar-Rum's prophecy demonstrates the divine authenticity of the Qur'an.", "JAMB IRS 2011, p. 3 / 14"),

    ("Islamic Religious Studies", "Unique Nature of Qur'an",
     "The Qur’an is different from other revealed Books because",
     {"A": "it is a prayer book only", "B": "barren women can be helped through it", "C": "both spiritual, moral and social values are found in it", "D": "one can use it for protection only."},
     "C", "The Qur'an encompasses comprehensive spiritual, ethical, legal, and social values.", "JAMB IRS 2011, p. 3 / 14"),

    ("Islamic Religious Studies", "Prophetic Revelation",
     "Prophet Muhammad (SAW) did not hand-over the Glorious Qur’an to his companions in an arranged form and in a single written volume because",
     {"A": "he did not want only the Quraish to inherit the book", "B": "the revelation did not come in one piece but at intervals", "C": "many tribes would want to take over its distribution", "D": "there was no need for it."},
     "B", "The divine messages were revealed progressively across different occasions.", "JAMB IRS 2011, p. 4 / 14"),

    ("Islamic Religious Studies", "Qur'anic Sciences / Tafsir",
     "The correct meaning of tafsir is the",
     {"A": "detailed explanation and commentary of the Glorious Qur’an", "B": "scientific application of the contents of the Glorious Qur’an to human life", "C": "true reflections on the contents of the Glorious Qur’an", "D": "practical application of the contents of the Glorious Qur’an"},
     "A", "Tafsir refers to exegesis, commentary, and detailed explanation.", "JAMB IRS 2011, p. 4 / 14"),

    ("Islamic Religious Studies", "Qur'anic Sciences / Tajwid",
     "Tajwid as one of the science of the Glorious Qur’an is important because",
     {"A": "it allows for the understanding of history of the Glorious Qur’an", "B": "it provides the basis for the deeper understanding of the Glorious Qur’an", "C": "it provides the knowledge of correct pronounciation and recitation of the Glorious Qur’an", "D": "it increases the ability to recite and communicate in Arabic"},
     "C", "Tajwid provides exact phonetics and correct articulation rules for recitation.", "JAMB IRS 2011, p. 4 / 14"),

    ("Islamic Religious Studies", "Tajwid Rules",
     "In the rule of Tajwid, the pronunciation of Rau with full mouth when carrying Dommah applies to",
     {"A": "tarqīq", "B": "tanwīn", "C": "tafkhīm", "D": "tashdīd."},
     "C", "Tafkhim is heavy pronunciation applied to Ra with Dommah or Fat-hah.", "JAMB IRS 2011, p. 4 / 14"),

    ("Islamic Religious Studies", "Salat",
     "The only Sūrah in the Glorious Qur’an which must be recited in every obligatory prayer is",
     {"A": "al-Baqārah", "B": "al-Alaq", "C": "al-Fātīhah", "D": "al-Ikhlās."},
     "C", "Surah al-Fatihah is recited in every unit (rak'ah) of obligatory prayer.", "JAMB IRS 2011, p. 5 / 14"),

    ("Islamic Religious Studies", "Surah al-Ma'un",
     "Suratul Mā’ūn discusses the privilege to be enjoyed by the",
     {"A": "givers", "B": "travelers", "C": "the wealthy", "D": "the needy."},
     "D", "Surah al-Ma'un defends the welfare and rights of the needy and orphans.", "JAMB IRS 2011, p. 5 / 14"),

    ("Islamic Religious Studies", "Surah al-Adiyat",
     "The eagerness and zeal of Muslim warriors to fight in the cause of Allah is one of the major theme of Sūrah",
     {"A": "al-Qāri’ah", "B": "al-Adiyah", "C": "al-Asr", "D": "al-Humazah."},
     "B", "Surah al-Adiyat describes the charging warhorses of the faithful.", "JAMB IRS 2011, p. 5 / 14"),

    ("Islamic Religious Studies", "Qur'anic Exegesis",
     "The allegorical and the ambiguous verses of the Glorious Qur’an are understood through the",
     {"A": "ijtihad of Muslim Scholars", "B": "qiyas of Muslim jurists", "C": "tadabbur in the Glorious Qur’an", "D": "tafsir of the Glorious Qur’an"},
     "D", "Scholarly tafsir explains complex and allegorical verses.", "JAMB IRS 2011, p. 6 / 14"),

    ("Islamic Religious Studies", "Hadith of an-Nawawi",
     "Hadith 3 of an-Nawawi’s collection shows that Islam is built upon",
     {"A": "believe in Allah", "B": "five pillars", "C": "fast of Ramadan", "D": "articles of faith"},
     "B", "Hadith 3 outlines the five pillars of Islam.", "JAMB IRS 2011, p. 6 / 14"),

    ("Islamic Religious Studies", "Hadith of an-Nawawi",
     "The teaching in the 10th Hadith of an- Nawawi is that",
     {"A": "Allah accepts prayers from Muslims only", "B": "only credible people shall be elected leaders", "C": "abstinance from forbidden things is prelude to accepting prayers", "D": "abstinance from misconduct by ladies makes them more attractive to men"},
     "C", "Purity and lawful sustenance are prerequisites for prayers to be accepted.", "JAMB IRS 2011, p. 6 / 14"),

    ("Islamic Religious Studies", "Hadith of an-Nawawi",
     "‘Do not get angry’ This tradition from the 16th Hadith of annawawihas been repeated by the Prophet (SAW)",
     {"A": "once", "B": "twice", "C": "thrice", "D": "many times."},
     "D", "The Prophet repeated 'Do not get angry' multiple times to the inquirer.", "JAMB IRS 2011, p. 6-7 / 14"),

    ("Islamic Religious Studies", "Hadith Classification",
     "What differentiates Hadith Qudsi from Hadith Nabawi is the",
     {"A": "place and manner of application", "B": "condition under which the two are narrated", "C": "wording and teaching intended", "D": "chain and reliability of the narrator"},
     "C", "In Hadith Qudsi the meaning is from Allah while wording is from the Prophet.", "JAMB IRS 2011, p. 7 / 14"),

    ("Islamic Religious Studies", "Hadith Compilers",
     "One of the peculiarities of Sahih Bukhari is that ahādith are sorted according to",
     {"A": "topic", "B": "chapters", "C": "records", "D": "biographies."},
     "B", "Arranged in topical chapters and books.", "JAMB IRS 2011, p. 7 / 14"),

    ("Islamic Religious Studies", "Hadith Compilers",
     "One of the two compilers of Hadith that deals with legal traditions of permissions and prohibitions is",
     {"A": "Abu Daud", "B": "Bukhari", "C": "Ibn Maja", "D": "Muslim."},
     "C", "Focuses on Ahkam (legal rulings).", "JAMB IRS 2011, p. 7 / 14"),

    ("Islamic Religious Studies", "Qur'anic Ethics",
     "One of the moral lessons in Q.17:23 apart from obedience to parents is",
     {"A": "résilience", "B": "repentance", "C": "persévérance", "D": "honesty."},
     "C", "Perseverance and patience in family duty.", "JAMB IRS 2011, p. 7-8 / 14"),

    ("Islamic Religious Studies", "Qur'anic Injunctions",
     "The Jews were admonished to avoid mixing truth with falsehood in",
     {"A": "Q.2:285", "B": "Q.2:177", "C": "Q.2:45", "D": "Q.2:42."},
     "D", "Surah al-Baqarah verse 42 forbids mixing truth with falsehood.", "JAMB IRS 2011, p. 8 / 14"),

    ("Islamic Religious Studies", "Islamic Economics",
     "Islam encourages every Muslim to seek a lawful livelihood through",
     {"A": "equitable distribution of wealth", "B": "dignity of labour", "C": "family inheritance", "D": "shared responsibility"},
     "B", "Dignity of honest, productive labor.", "JAMB IRS 2011, p. 8 / 14"),

    ("Islamic Religious Studies", "Tawhid",
     "Islam as a monotheistic religion expects that every faithful follower should",
     {"A": "not tell lies", "B": "serve Allah without associates", "C": "praise the Prophets as enjoined by Allah", "D": "perform Salat."},
     "B", "Tawhid demands serving Allah purely without associating partners.", "JAMB IRS 2011, p. 8 / 14"),

    ("Islamic Religious Studies", "Prohibition of Divination",
     "Seeking assistance from the fortune tellers is forbidden because",
     {"A": "it gives one an insight of what tomorrow holds", "B": "it creates animosity amongst people", "C": "it leads to ascribing absolute power to a fellow being", "D": "it’s proceed is unlawful"},
     "C", "Fortune telling ascribes divine knowledge of the unseen to mortals.", "JAMB IRS 2011, p. 8-9 / 14"),

    ("Islamic Religious Studies", "Forms of Shirk",
     "It is shirk in Islam to",
     {"A": "dance", "B": "sing religious song", "C": "undergo plastic surgery", "D": "masquerade."},
     "D", "Venerating ancestral masquerade spirits violates Tawhid.", "JAMB IRS 2011, p. 9 / 14"),

    ("Islamic Religious Studies", "Scriptures",
     "Suhf was revealed to",
     {"A": "prophet Haruna (AS)", "B": "prophet Ilyas (AS)", "C": "prophet Ibrahim (AS)", "D": "prophet Muhammd (SAW"},
     "C", "Suhuf (scrolls) were given to Prophet Ibrahim.", "JAMB IRS 2011, p. 9 / 14"),

    ("Islamic Religious Studies", "Articles of Faith",
     "In Islam, the articles of Imān are",
     {"A": "six", "B": "five", "C": "four", "D": "three."},
     "A", "There are six articles of faith in Islam.", "JAMB IRS 2011, p. 9 / 14"),

    ("Islamic Religious Studies", "Friday Prayer",
     "The presentation of Sermon is an obligation on the Imam when leading",
     {"A": "all the prayers", "B": "funeral prayers", "C": "Friday prayers", "D": "every prayer on Friday"},
     "C", "The Khutbah is an indispensable obligation of Jumu'ah prayer.", "JAMB IRS 2011, p. 9 / 14"),

    ("Islamic Religious Studies", "Conditions of Salat",
     "One of the conditions that make prayer obligatory on believers is",
     {"A": "social status", "B": "reciting the Qur’an with proper Tajweed", "C": "following pious Imam", "D": "attainment of maturity"},
     "D", "Bulugh (maturity) is required for religious obligation.", "JAMB IRS 2011, p. 10 / 14"),

    ("Islamic Religious Studies", "Voluntary Fasting",
     "The supererogatory fasting of Āshura is observed on the",
     {"A": "8th of al-muharram", "B": "9th of al-Muharram", "C": "10th of al-Muharram", "D": "11th of al-Muharram"},
     "C", "Ashura fasting is observed on 10th of Muharram.", "JAMB IRS 2011, p. 10 / 14"),

    ("Islamic Religious Studies", "Hajj and Eid",
     "Ayyam at-tashriq are the days of",
     {"A": "buying and selling", "B": "visits and caring", "C": "singing and dancing", "D": "eating and drinking."},
     "D", "The three days following Eid al-Adha are designated for eating, drinking, and remembrance of Allah.", "JAMB IRS 2011, p. 10 / 14"),

    ("Islamic Religious Studies", "Marriage in Islam",
     "The minimum number of witnesses in an Islamic marriage is",
     {"A": "four males", "B": "three males", "C": "two male", "D": "one male."},
     "C", "At least two adult male witnesses are required.", "JAMB IRS 2011, p. 10-11 / 14"),

    ("Islamic Religious Studies", "Shari'ah",
     "The term, Shari’ah refers to",
     {"A": "a path", "B": "wisdom", "C": "passion", "D": "an idea."},
     "A", "Shari'ah literally means 'a clear path'.", "JAMB IRS 2011, p. 11 / 14"),

    ("Islamic Religious Studies", "Islamic Scholars",
     "One of the scholars reported to have been imprisoned by his non compromising stance was",
     {"A": "Shafi’i", "B": "Abu-Hanifah", "C": "Hambali", "D": "Māliki b. Anas."},
     "B", "Imam Abu Hanifa was jailed for refusing state judgeship.", "JAMB IRS 2011, p. 11 / 14"),

    ("Islamic Religious Studies", "Islamic Economics",
     "The entrenchment of an Islamic economic system is aimed at",
     {"A": "controlling the world funds", "B": "restricting the unlawful acquisition of wealth", "C": "restricting men to particular occupations", "D": "promoting equitable distribution of wealth."},
     "D", "Equitable distribution of economic wealth across society.", "JAMB IRS 2011, p. 11 / 14"),

    ("Islamic Religious Studies", "Riba",
     "One of the major consequences of ribā is that, it makes people",
     {"A": "wealthy", "B": "lazy", "C": "smart", "D": "parasitic"},
     "B", "Riba promotes laziness and exploitation over productive effort.", "JAMB IRS 2011, p. 12 / 14"),

    ("Islamic Religious Studies", "Governance in Islam",
     "Mas’uliyyah as a principle of the the Islamic political system is a measure to check",
     {"A": "indiscipline", "B": "rigging", "C": "nepotism", "D": "misappropriation"},
     "D", "Mas'uliyyah is public accountability to prevent misappropriation of resources.", "JAMB IRS 2011, p. 12 / 14"),

    ("Islamic Religious Studies", "Treaties in Islam",
     "Allah commands Muslims to observe and fulfill agreements with the non-Muslims, if the later do not",
     {"A": "infringe on the right of women", "B": "observe the five daily prayers", "C": "change the language employed", "D": "violate the terms of the agreement"},
     "D", "Agreements must be upheld provided the other party does not breach terms.", "JAMB IRS 2011, p. 12 / 14"),

    ("Islamic Religious Studies", "Jahiliyyah Period",
     "During the Jihiliyya era, the Ka’aba was the center of poetic contest at the annual festival called",
     {"A": "ijāz", "B": "ukāz", "C": "manāt", "D": "ushrah"},
     "B", "The annual fair and poetic contest of Ukaz.", "JAMB IRS 2011, p. 12-13 / 14"),

    ("Islamic Religious Studies", "Pre-Islamic Arabia",
     "In Pre-Islamic Arabia, the Arabs killed their daughters because they",
     {"A": "were the weaker sex", "B": "were afraid of incest", "C": "feared the females would outnumber males", "D": "did not participate in wars"},
     "D", "Because females did not fight or capture war spoils.", "JAMB IRS 2011, p. 13 / 14"),

    ("Islamic Religious Studies", "Prophet's Early Life",
     "The first person who recognized signs of Prophethood on Muhammad (SAW) was a",
     {"A": "Christian Monk", "B": "Jewish Rabbi", "C": "Buddhist Monk", "D": "Soothsayer."},
     "A", "The monk Bahira in Syria.", "JAMB IRS 2011, p. 13 / 14"),

    ("Islamic Religious Studies", "Early Converts",
     "Members of the Prophet’s family that embraced Islam the first day did so, on the basis of his",
     {"A": "truthfulness and uprightness", "B": "wealth and influence", "C": "love for them", "D": "family relation"},
     "A", "His known honesty and moral uprightness.", "JAMB IRS 2011, p. 13 / 14"),

    ("Islamic Religious Studies", "West African Islamic History",
     "The teachings of Uthman b. Fodio are remembered today as it relates to",
     {"A": "idol worshiping", "B": "marrying more than four wives", "C": "all form of syncreticism", "D": "taxing of farm produce"},
     "C", "Reforming syncretism and purifying Islamic practice.", "JAMB IRS 2011, p. 13-14 / 14"),

    ("Islamic Religious Studies", "West African Islamic History",
     "The ruler who instituted Friday prayers in Mali was",
     {"A": "Mansa Musa", "B": "Mansa Suleiman", "C": "Mansa Ule", "D": "Mansa Abubakar"},
     "A", "Mansa Musa instituted regular Jumu'ah Friday prayers.", "JAMB IRS 2011, p. 14")
]

for item in irs_2011:
    add_question(*item)

# 3. History 2012 Paper
his_2012 = [
    ("History", "Early Nigerian Civilizations",
     "The Nok civilization suggests that",
     {"A": "Nigeria passed through different stages of development", "B": "civilization in the area began with the Stone Age", "C": "the people of Nigeria came from the East", "D": "Nigerian civilization is related to that of Greek."},
     "A", "Demonstrates deep indigenous evolutionary stages of culture and technology.", "JAMB History 2012, p. 1 / 21"),

    ("History", "Stone Age Periods",
     "The development of mircoliths is associated with the",
     {"A": "Middle Age Stone", "B": "Late Stone Age", "C": "Iron Age", "D": "Early Stone Age."},
     "B", "Microliths are small stone tools characteristic of the Late Stone Age.", "JAMB History 2012, p. 1-2 / 21"),

    ("History", "Pre-Colonial Relations",
     "In pre-colonial Nigeria, intergroup contacts were encourage mostly by",
     {"A": "economic interdependence", "B": "military alliance", "C": "marriage ties", "D": "political ties"},
     "A", "Trade and economic interdependence linked diverse regions.", "JAMB History 2012, p. 2 / 21"),

    ("History", "Sources of Nigerian History",
     "Which of the following is the most important source of the history of the Hausa states?",
     {"A": "Tarikh-as Sudan.", "B": "The European account.", "C": "The Kano Chronicle.", "D": "The Arab traders’ account."},
     "C", "The Kano Chronicle is the key indigenous historical record.", "JAMB History 2012, p. 2 / 21"),

    ("History", "Benin Kingdom Origins",
     "The Yoruba background to the Oba of Benin is emphasized by the",
     {"A": "similarities of Benin and Ife arts", "B": "similarities in their political structures", "C": "relationship between Oranmiyan and Ogiso dynasties", "D": "Oranmiyan legend in Benin history."},
     "D", "The Oranmiyan tradition links Ife and Benin dynasties.", "JAMB History 2012, p. 3 / 21"),

    ("History", "European Coastal Trade",
     "European traders did not venture into the interior of Nigeria before the 19th century because",
     {"A": "they were ignorant of the area", "B": "the African middlemen served their needs", "C": "of their fear of the African middlemen", "D": "they were very few in number."},
     "B", "Coastal African middlemen supplied trade commodities directly to the coast.", "JAMB History 2012, p. 3 / 21"),

    ("History", "Atlantic Slave Trade",
     "The Africans transported across the Atlantic as slaves were mostly",
     {"A": "people with criminal records", "B": "able-bodied men", "C": "disabled persons", "D": "people with low income."},
     "B", "Demand focused primarily on able-bodied males for agricultural labor.", "JAMB History 2012, p. 3-4 / 21"),

    ("History", "Sokoto Caliphate",
     "The jihadists emerged victorious in Gobir because",
     {"A": "their cause was just", "B": "the Hausa rulers were divided", "C": "they had superior weapons", "D": "the masses supported them."},
     "D", "Widespread popular peasant support mobilized for the jihadists.", "JAMB History 2012, p. 4 / 21"),

    ("History", "Borno History",
     "Rabeh’s greatest challenge after conquering Borno was",
     {"A": "normalizing relations with Sokoto Caliphate", "B": "rebuilding the armed forces", "C": "reviving the ailing economy", "D": "safeguarding the religion of Islam."},
     "C", "The devastating conquest collapsed economic production.", "JAMB History 2012, p. 4 / 21"),

    ("History", "Christianity in Nigeria",
     "Christianity spread fast in Nigeria because it",
     {"A": "was associated with Western education", "B": "had superior spiritual appeal", "C": "preached social equality", "D": "was opposed to oppression by rulers."},
     "A", "The prestige and utility of mission schools drove rapid conversion.", "JAMB History 2012, p. 5 / 21"),

    ("History", "Yoruba Wars",
     "Ibadan-Ijebu relations in the 19th Century became hostile as a result of",
     {"A": "boundary disputes between them", "B": "succession to the Ijebu throne", "C": "British annexation of Lagos", "D": "Ibadan’s attempt to reach the coast."},
     "D", "Ibadan's ambition to gain direct coastal access for arms purchases.", "JAMB History 2012, p. 5 / 21"),

    ("History", "Yoruba Wars",
     "The Ekiti Parapo was aimed at",
     {"A": "checking European inroad into Yorubaland", "B": "restoring the dignity of the Alaafin", "C": "reducing the powers of Ibadan", "D": "forming a federated government."},
     "C", "Checking and curtailing the dominance of Ibadan.", "JAMB History 2012, p. 5-6 / 21"),

    ("History", "Benin Kingdom",
     "The Uzama title holders in Benin Kingdom were responsible for",
     {"A": "advising the Oba in the administration of the Kingdom", "B": "punishing erring members of the royal family", "C": "defending the Kingdom from external attacks", "D": "settling disputes between the Oba and other chiefs."},
     "A", "Serving as the council of state advising the monarch.", "JAMB History 2012, p. 6 / 21"),

    ("History", "Slave Trade Suppression",
     "Britain suppressed the trans-Atlantic slave trade because",
     {"A": "there was no more market for slaves in America", "B": "it had become very inhuman", "C": "the Christian missions preached against it", "D": "it became unfavourable to her industrial progress."},
     "D", "Industrial capitalism demanded legitimate trade in agricultural materials.", "JAMB History 2012, p. 6 / 21"),

    ("History", "British Colonial Conquest",
     "The main goal of the British expedition against the Aro was to",
     {"A": "destroy the Ibini-Ukpabi oracle", "B": "eliminate all opposition to their presence in the hinterland", "C": "pave the way for the Christianization of Igboland", "D": "liberate the Igbo from Aro bondage."},
     "B", "Eliminating regional Aro trading dominance and resistance.", "JAMB History 2012, p. 7 / 21"),

    ("History", "Indirect Rule",
     "A major reason for the introduction of indirect rule in Northern Nigeria was to",
     {"A": "ensure perfect control of the economy", "B": "further weaken the position of the elite class", "C": "assist the Christian missionaries in their activities", "D": "secure cheap labour for railway construction."},
     "A", "Economical administration and resource control through existing rulers.", "JAMB History 2012, p. 7 / 21"),

    ("History", "West African Nationalism",
     "Nationalist activities developed earlier in British West Africa than in French West Africa because",
     {"A": "British colonies were accorded equal status with Britain", "B": "Britain had more colonies than France", "C": "African chiefs in French colonies were highly respected", "D": "of the systems of administration adopted by the colonial powers."},
     "D", "Differences in administrative policy and tolerance of indigenous press.", "JAMB History 2012, p. 8 / 21"),

    ("History", "Colonial Infrastructure",
     "The main reason for the construction of the railway from Port-Harcourt into the hinterland was the",
     {"A": "discovery of tin in Jos area", "B": "discovery of a deep sea harbor at Port-Harcourt", "C": "discovery of coal at Udi", "D": "need to evacuate export crops from the hinterland."},
     "C", "Evacuation of coal deposits discovered at Udi near Enugu.", "JAMB History 2012, p. 8 / 21"),

    ("History", "Colonial Economic Policy",
     "During the colonial period, agricultural policy in Nigeria was designed to",
     {"A": "raise the financial base of the country", "B": "make the economy compete favourably in the world market", "C": "provide raw materials for British industries", "D": "demonstrate Britain’s concern for the development of its colonies."},
     "C", "Cash crop production for British metropolitan manufacturing.", "JAMB History 2012, p. 8-9 / 21"),

    ("History", "Nigerian Youth Movement",
     "The Nigerian Youth Movement collapsed as a result of",
     {"A": "its failure to win elections", "B": "shortage of funds to run its affairs", "C": "the harassment of its leadership by government", "D": "the break-up of its leadership."},
     "D", "Internal executive factional crisis and resignation of leaders.", "JAMB History 2012, p. 9 / 21"),

    ("History", "Constitutional Developments",
     "The NCNC London Delegate pressed for",
     {"A": "free primary education for all Nigerian children", "B": "autonomy for the regions", "C": "a revision of the Richards Constitution", "D": "outright independence for Nigeria."},
     "C", "Protesting the undemocratic Richards Constitution.", "JAMB History 2012, p. 9-10 / 21"),

    ("History", "1954 Constitution",
     "The Lyttlelton Constitution is considered a landmark in the history of Nigeria, because it",
     {"A": "created a federal structure of government for the country", "B": "made ministers accountable to the electorate", "C": "recognized Lagos as a federal territory", "D": "gave ministers full authority over their ministries."},
     "A", "Instituted a federal constitutional framework with regional autonomy.", "JAMB History 2012, p. 10 / 21"),

    ("History", "Labour Movements",
     "Protests by trade unions in Nigeria during the colonial period were aimed at",
     {"A": "achieving political independence", "B": "establishing more industries", "C": "obtaining specific benefits for members", "D": "fighting corruption among government officials."},
     "C", "Securing wages, cost-of-living allowances, and working conditions.", "JAMB History 2012, p. 10 / 21"),

    ("History", "First Republic",
     "Which of the following served as federal ministers under the Tafawa Balewa Administration?",
     {"A": "Alhaji Muhammadu Ribadu and Chief Festus Okotie-Eboh.", "B": "Chief Kolawole Balogun and Alhaji Adamu Ciroma.", "C": "Alhaji Muhammadu Inuwa Wada and Chief Richard Akinjide", "D": "Chief Aja Nwachukwu and Alhaji Umaru Dikko."},
     "A", "Ribadu (Defence) and Okotie-Eboh (Finance).", "JAMB History 2012, p. 11 / 21"),

    ("History", "1979 Elections",
     "An important function of FEDECO during the 1979 elections was",
     {"A": "establishing party offices", "B": "promulgating the new constitution into law", "C": "swearing-in of elected officials", "D": "delineating electoral constituencies."},
     "D", "Delimiting constituencies and organizing election conduct.", "JAMB History 2012, p. 11 / 21"),

    ("History", "1966 Military Intervention",
     "A major reason for the military intervention in Nigeria’s politics in 1966 was the",
     {"A": "pro-West posture of Nigeria’s foreign policy", "B": "over-bearing power of traditional rulers", "C": "attempt by government to retire top military officers", "D": "crisis of the 1964 General Elections."},
     "D", "Severe electoral crisis and violent breakdown of law and order.", "JAMB History 2012, p. 12 / 21"),

    ("History", "Military Regimes",
     "Major General Aguiyi-Ironsi introduced a unitary system of government because",
     {"A": "it was the wish of the people", "B": "of the command structure of the military", "C": "he wanted more revenue for the central government", "D": "other military officers were planning to overthrow him."},
     "B", "Reflected the unified hierarchical command structure of the armed forces.", "JAMB History 2012, p. 12 / 21"),

    ("History", "Agricultural Initiatives",
     "The strategy for accelerated agricultural development of the Obasanjo regime in the 1970’s focused on",
     {"A": "improving transportation network to the rural areas", "B": "establishing agro-allied industries", "C": "achieving food self-sufficiency", "D": "establishing new marketing boards."},
     "C", "Operation Feed the Nation aimed for domestic food self-sufficiency.", "JAMB History 2012, p. 12-13 / 21"),

    ("History", "Masina Jihad",
     "The Berber scholar, al-Mukhtar, contributed to the success of the Masina Jihad by",
     {"A": "fighting alongside Seju Ahmadu", "B": "preparing the ground through the Qadiriyyah Brotherhood", "C": "mobilizing various groups to fight for Seku Ahmadu", "D": "appealing to Ardo Moudo to support Seku Ahmadu."},
     "B", "Spreading the Qadiriyyah movement that spiritually galvanized the region.", "JAMB History 2012, p. 13 / 21"),

    ("History", "West African History",
     "The establishment of Freetown in 1822 facilitated",
     {"A": "the settlement of freed slaves", "B": "Christian missionary activities", "C": "humanitarian activities", "D": "the improvement of agriculture."},
     "A", "Settlement for liberated Africans.", "JAMB History 2012, p. 13 / 21"),

    ("History", "Egyptian Nationalism",
     "Nineteenth century Egyptian nationalism principally aimed at",
     {"A": "controlling the Suez Canal", "B": "forming a constitutional government in Egypt", "C": "bringing down the monarchy", "D": "ensuring Egyptian independence."},
     "D", "Securing complete national sovereignty and independence.", "JAMB History 2012, p. 14 / 21"),

    ("History", "North African History",
     "The Battle of Tel el-Kebir was fought between",
     {"A": "the British and the Urabists", "B": "Tawfiq and the Mahdists", "C": "the Khedive and the Wafdists", "D": "Napoleon and the Mamluks."},
     "A", "The British invasion forces and Ahmad Urabi's army.", "JAMB History 2012, p. 14 / 21"),

    ("History", "North African Diplomacy",
     "Morocco was of strategic importance to the European countries because",
     {"A": "of its good climatic conditions", "B": "it was highly industrialized", "C": "it possessed good mineral resources", "D": "it provided an entrance to the Mediterranean."},
     "D", "Geographic control over the western entrance to the Mediterranean sea.", "JAMB History 2012, p. 14-15 / 21"),

    ("History", "Sudanese History",
     "The Mahdists revolt in the Sudan was successful",
     {"A": "They believed they had a superior faith", "B": "it enjoyed widespread support", "C": "the Egyptian army was poorly trained", "D": "General Gordon was an incompetent commander."},
     "B", "Broad popular rallying against Turco-Egyptian exploitation.", "JAMB History 2012, p. 15 / 21"),

    ("History", "East African Trade",
     "Sayyid Said increased the volume of trade with the Europeans by",
     {"A": "allowing them to take control of the trade with the hinterland", "B": "replacing Indian middlemen with Europeans", "C": "allowing European consuls to reside in Zanzibar", "D": "making English the lingua franca of Zanzibar."},
     "C", "Permitting foreign consuls and commercial agents in Zanzibar.", "JAMB History 2012, p. 15 / 21"),

    ("History", "East African Colonial Conquest",
     "One of the main aims of the British conquest of Buganda was to",
     {"A": "gain access to the cape of Good Hope", "B": "pain control of the gold mines of Bunyoro", "C": "prevent other Europeans from controlling the source of the Nile", "D": "take control of the trade routes in the area."},
     "C", "Securing the source of the River Nile to protect Egypt.", "JAMB History 2012, p. 16 / 21"),

    ("History", "Ethiopian Independence",
     "The survival of Ethiopia as an independent polity was as a result of the",
     {"A": "location of the kingdom", "B": "alliance with some European powers", "C": "strong economic base of the kingdom", "D": "introduction of a compulsory military service."},
     "A", "Mountainous terrain and strategic geographical advantages.", "JAMB History 2012, p. 16 / 21"),

    ("History", "Southern African History",
     "The Mfecane resulted in the",
     {"A": "division and fragmentation of the Zulu nation", "B": "formation of the Ndebele state", "C": "decrease in Boer influence in South Africa", "D": "dispersal of the Zulu to the Katanga copper belt."},
     "B", "Rise of new militarized states including Mzilikazi's Ndebele.", "JAMB History 2012, p. 16-17 / 21"),

    ("History", "Apartheid South Africa",
     "The 1960 Sharpeville revolt was specifically against",
     {"A": "labour laws", "B": "land laws", "C": "pass laws", "D": "marriage laws."},
     "C", "Protest organized against the humiliating apartheid Pass Laws.", "JAMB History 2012, p. 17 / 21"),

    ("History", "South African History",
     "A major consequence of the Great Trek was the",
     {"A": "restriction of movement of the whites in South Africa", "B": "agitation for black-white equality in South Africa", "C": "annexation of white communities by the Africans", "D": "the expansion of white communities in South Africa."},
     "D", "Establishment and expansion of Boer republics in the interior.", "JAMB History 2012, p. 17 / 21"),

    ("History", "Scramble for Africa",
     "One feature of European diplomacy in the scramble for Africa was",
     {"A": "exchanging of ambassadors among them", "B": "holding Africans hostage for negotiations", "C": "negotiating with African leaders for territories", "D": "reconciling differences over territorial claims."},
     "D", "Bilateral treaties and conferences to divide spheres of influence peacefully among colonial powers.", "JAMB History 2012, p. 18 / 21"),

    ("History", "French Colonial Policy",
     "The French colonial policy of assimilation failed in Africa because",
     {"A": "African culture was deeply rooted", "B": "the African elite were opposed to it", "C": "it was not consistently implemented", "D": "it was expensive to implement."},
     "A", "Deep-seated African cultural and religious identities resisted erasure.", "JAMB History 2012, p. 18 / 21"),

    ("History", "West African Politics",
     "Which of the following was one of the demands of the National Congress of British West Africa?",
     {"A": "Establishment of a university in each of the colonies.", "B": "Expulsion of all Syrians and Lebanese from the colonies.", "C": "Election of Africans into each colony’s council.", "D": "Restriction of the activities of Christian missionaries in the colonies."},
     "C", "Franchise and elective representation on colonial legislative councils.", "JAMB History 2012, p. 19 / 21"),

    ("History", "Post-War Nationalism",
     "The nationalist movement in Nigeria during the post-war period was primarily led by",
     {"A": "businessmen", "B": "the intelligentsia", "C": "students", "D": "local chiefs."},
     "B", "Western-educated professionals and intelligentsia.", "JAMB History 2012, p. 19 / 21"),

    ("History", "South African Resistance",
     "One of the objectives for the formation of the South African Native Congress in 1912 was to",
     {"A": "establish a political party", "B": "encourage black participation in governance", "C": "retrieve all lands seized by the whites", "D": "integrate the various groups and races."},
     "D", "Unite all African ethnic groups against racial oppression.", "JAMB History 2012, p. 19-20 / 21"),

    ("History", "Nigerian Foreign Policy",
     "In 1973, Nigeria broke diplomatic relations with Israel because of Israel’s",
     {"A": "occupation of Egyptian territory", "B": "support for apartheid South Africa", "C": "support for Biafra during the war", "D": "raid on Entebbe airport in Uganda."},
     "A", "In solidarity with Egypt (an OAU member state) following the 1973 war.", "JAMB History 2012, p. 20 / 21"),

    ("History", "Congo Free State",
     "King Leopold’s colonial ventures in the Congo were aimed at",
     {"A": "making Belgium a great colonial power", "B": "carving out an empire for himself", "C": "putting a stop to domestic slave trade in the area", "D": "introducing Western education to the people."},
     "B", "Establishing a personal extractive fiefdom for private wealth.", "JAMB History 2012, p. 20 / 21"),

    ("History", "Colonial Economy",
     "In Africa, the colonial authorities introduced modern means of transportation in order to",
     {"A": "develop the internal markets", "B": "increase farmers’ purchasing power", "C": "encourage urban development", "D": "promote import-export trade."},
     "D", "Facilitating extraction of mineral and agricultural exports to the coast.", "JAMB History 2012, p. 21 / 21")
]

for item in his_2012:
    add_question(*item)

print(f"Total verified unique questions compiled: {len(questions)}")

with open("/app/extracted_questions_dataset.json", "w") as f:
    json.dump(questions, f, indent=2)

print("Export complete.")
