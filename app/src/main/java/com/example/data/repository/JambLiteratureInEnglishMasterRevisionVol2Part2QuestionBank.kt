package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Literature in English Master Revision Bank Volume 2 - Part 2 (Questions 101 - 200)
 * Covers Harvest of Corruption, Othello, Faceless, Lonely Days, Native Son, Poetic Analysis & Literary Principles.
 */
object JambLiteratureInEnglishMasterRevisionVol2Part2QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // Questions 101 to 150 (2016 Series)
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_101",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2016",
                questionText = "'The usual works you know these things. We'll dangle this babe before the Chief for a price... She will run the errands while we pick the bucks.' The 'babe' in this excerpt from 'Harvest of Corruption' refers to:",
                optionA = "Ogeyi",
                optionB = "Alice",
                optionC = "Ochuole",
                optionD = "Aloho",
                correctAnswerIndex = 3,
                explanation = "Ochuole and her corrupt accomplices plan to use the desperate, job-seeking Aloho as a political pawn to exploit Chief Ade Amaka's influence.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_102",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2016",
                questionText = "'O! God forgive me. Is this a trap or what? God! Poor girl! Whatever is her reason for this dangerous decision.' This speech is made by:",
                optionA = "Chief Ade Amaka",
                optionB = "Doctor",
                optionC = "Inspector Inaku",
                optionD = "ACP Yakubu",
                correctAnswerIndex = 1,
                explanation = "The medical doctor laments Aloho's tragic situation and her dangerous decision to seek an illegal abortion, which ultimately costs her life.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_103",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2016",
                questionText = "The central urban setting of Frank Ogodo Ogbeche's 'Harvest of Corruption' is the fictional city of:",
                optionA = "Mabu",
                optionB = "Gbossa",
                optionC = "Darkin",
                optionD = "Jabu",
                correctAnswerIndex = 3,
                explanation = "The play is set in Jabu, a fictional contemporary African capital city plagued by massive institutional corruption, drug trafficking, and embezzlement.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_104",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2016",
                questionText = "'Good day (He says without looking up.) See me there by 4 p.m. Okay? Bye!' The word 'there' in this corrupt arrangement refers to:",
                optionA = "Court room",
                optionB = "Police station",
                optionC = "Airport",
                optionD = "Akpara hotel",
                correctAnswerIndex = 3,
                explanation = "Akpara Hotel serves as the private, highly compromised meeting spot where Chief Ade Amaka and his cronies coordinate their illegal transactions.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_105",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2016",
                questionText = "Chief Ade Amaka is primarily involved in which of the following criminal enterprises?",
                optionA = "Child trafficking",
                optionB = "Land grabbing",
                optionC = "Smuggling and drug trafficking",
                optionD = "Electoral rigging",
                correctAnswerIndex = 2,
                explanation = "Chief Ade Amaka uses his government influence as Minister of External Affairs to run a massive smuggling, bribery, and cocaine trafficking ring.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_106",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2016",
                questionText = "'ill-starred wench, pale as thy smock, When we shall meet at compt.' The dominant literary device used in these lines is:",
                optionA = "simile",
                optionB = "pun",
                optionC = "metaphor",
                optionD = "paradox",
                correctAnswerIndex = 0,
                explanation = "The explicit comparison of Desdemona's cold, lifeless pale skin to her white undergarment ('pale as thy smock') using 'as' establishes a simile.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_107",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2016",
                questionText = "Othello kills his wife Desdemona primarily because he:",
                optionA = "is consumed by intense, manipulated jealousy",
                optionB = "discovers she is a witch",
                optionC = "wants to marry Bianca",
                optionD = "is insulted by her father Brabantio",
                correctAnswerIndex = 0,
                explanation = "Driven mad by Iago's systematic, malicious lies and fabricated proof regarding Desdemona's fidelity, Othello smothers her in her bed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_108",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2016",
                questionText = "Brabantio is strongly opposed to the relationship between Othello and Desdemona because:",
                optionA = "he prefers Roderigo as a son-in-law",
                optionB = "Othello is a Moor of a different race",
                optionC = "Othello is too poor",
                optionD = "Desdemona is already married",
                correctAnswerIndex = 1,
                explanation = "Brabantio's opposition is rooted in racial prejudice, accusing Othello of using black magic and spells to steal his daughter.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_109",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2016",
                questionText = "'soft you; a word or two before you go. I have done the state some service, and they know't...' This final, dignified speech is made when Othello is:",
                optionA = "preparing to travel back to Venice",
                optionB = "sick with a severe fever",
                optionC = "on the verge of taking his own life",
                optionD = "planning to elope with Desdemona",
                correctAnswerIndex = 2,
                explanation = "Othello delivers this speech to the Venetian officers just before stabbing himself, reminding them of his loyal service to the state.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_110",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2016",
                questionText = "'O heaven; How got she out? O treason of the blood / Father, from hence trust not your daughters' minds...' The speaker of these frantic words is:",
                optionA = "Brabantio",
                optionB = "Othello",
                optionC = "Gratiano",
                optionD = "Roderigo",
                correctAnswerIndex = 0,
                explanation = "Brabantio cries out in panic upon discovering that Desdemona has secretly escaped from his house overnight to marry Othello.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_111",
                subject = "Literature in English",
                topic = "African Prose: Faceless",
                year = "2016",
                questionText = "In Amma Darko's urban realist novel 'Faceless', the name of Kabria's husband is:",
                optionA = "Kwei",
                optionB = "Kpakpo",
                optionC = "Adade",
                optionD = "Ottu",
                correctAnswerIndex = 2,
                explanation = "Adade is Kabria's highly irresponsible, neglectful husband who refuses to support his family, leaving Kabria to cope with their children alone.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_112",
                subject = "Literature in English",
                topic = "African Prose: Faceless",
                year = "2016",
                questionText = "'She was both a child and an adult and could act like both.' This description in 'Faceless' refers to the tragic character:",
                optionA = "Fofo",
                optionB = "Baby T.",
                optionC = "Odarley",
                optionD = "Obea",
                correctAnswerIndex = 1,
                explanation = "Baby T., forced into premature street labor and child exploitation, possesses a tragic duality of child-like innocence and adult-like survival instincts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_113",
                subject = "Literature in English",
                topic = "African Prose: Authors",
                year = "2016",
                questionText = "The author of the novel 'Faceless', Amma Darko, is a celebrated female writer from:",
                optionA = "Germany",
                optionB = "Scotland",
                optionC = "Ghana",
                optionD = "Nigeria",
                correctAnswerIndex = 2,
                explanation = "Amma Darko is a leading contemporary Ghanaian novelist whose raw, unflinching works expose social inequalities and the plight of street children in Accra.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_114",
                subject = "Literature in English",
                topic = "African Prose: Lonely Days",
                year = "2016",
                questionText = "In Bayo Adebowale's 'Lonely Days', widows in mourning in Kufi wear garments that are:",
                optionA = "red",
                optionB = "black",
                optionC = "white",
                optionD = "dull",
                correctAnswerIndex = 3,
                explanation = "Kufi custom forces mourning widows to wear coarse, unappealing, and dull-colored clothing to symbolize their grief and lack of status.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_115",
                subject = "Literature in English",
                topic = "African Prose: Lonely Days",
                year = "2016",
                questionText = "In 'Lonely Days', the cultural object known as 'bage cap' signifies everlasting:",
                optionA = "happiness",
                optionB = "sorrow",
                optionC = "freedom",
                optionD = "despair",
                correctAnswerIndex = 2,
                explanation = "The bage cap represents ancestral dignity, pride, and ultimate spiritual freedom within the rural community's traditional frameworks.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_116",
                subject = "Literature in English",
                topic = "African Prose: Lonely Days",
                year = "2016",
                questionText = "In 'Lonely Days', Yaremi's only son is named:",
                optionA = "Alani",
                optionB = "Wande",
                optionC = "Olode",
                optionD = "Deyo",
                correctAnswerIndex = 0,
                explanation = "Alani is Yaremi's adult son who resides in the city and rarely returns to the village, reflecting the breakdown of rural family ties.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_117",
                subject = "Literature in English",
                topic = "Non-African Prose: Native Son",
                year = "2016",
                questionText = "In Richard Wright's 'Native Son', Bigger Thomas burns Mary Dalton's body in the:",
                optionA = "toilet",
                optionB = "basement furnace",
                optionC = "backyard",
                optionD = "wardrobe",
                correctAnswerIndex = 1,
                explanation = "To conceal his accidental smothering of Mary, a terrified Bigger stuffs her body into the basement furnace of the Dalton home and incinerates it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_118",
                subject = "Literature in English",
                topic = "Non-African Prose: Native Son",
                year = "2016",
                questionText = "In 'Native Son', Mary Dalton's communist lover is named:",
                optionA = "Jan Erlone",
                optionB = "Buckley",
                optionC = "Bigger",
                optionD = "Max",
                correctAnswerIndex = 0,
                explanation = "Jan Erlone is Mary's radical, communist boyfriend whom the state authorities initially accuse of kidnapping and murdering Mary.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_119",
                subject = "Literature in English",
                topic = "Non-African Prose: Native Son",
                year = "2016",
                questionText = "'Suppose Mary had not burned? Suppose she was still there, exposed' The dominant literary device in this excerpt is:",
                optionA = "apostrophe",
                optionB = "euphemism",
                optionC = "syntactical parallelism",
                optionD = "rhetorical question",
                correctAnswerIndex = 3,
                explanation = "Bigger's anxious internal monologue uses rhetorical questions to emphasize his psychological terror and fear of discovery.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_120",
                subject = "Literature in English",
                topic = "Non-African Prose: Native Son",
                year = "2016",
                questionText = "In 'Native Son', Bigger and his gang prefer to rob other Negroes because:",
                optionA = "they are the same race",
                optionB = "they think it is not a serious crime",
                optionC = "they feel other Negroes are helpless and won't fight back",
                optionD = "it is much easier and less dangerous than robbing white businesses",
                correctAnswerIndex = 3,
                explanation = "Bigger admits that robbing a white-owned business invites immediate, ruthless police retribution, whereas crimes against blacks are largely ignored.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_121",
                subject = "Literature in English",
                topic = "Non-African Poetry: The Proud King",
                year = "2016",
                questionText = "One of the central themes in William Morris's 'The Proud King' is:",
                optionA = "arrogance and humility",
                optionB = "greed for land",
                optionC = "western education",
                optionD = "economic achievement",
                correctAnswerIndex = 0,
                explanation = "The poem is a moral fable about King Jovinian, whose extreme pride leads God to strip him of his identity until he learns true humility.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_122",
                subject = "Literature in English",
                topic = "African Poetry: The Panic of Growing Older",
                year = "2016",
                questionText = "'The panic / Of growing older / Spreads fluttering wings...' The dominant figure of speech in these lines from Lenrie Peters' poem is:",
                optionA = "onomatopoeia",
                optionB = "metaphor",
                optionC = "personification",
                optionD = "apostrophe",
                correctAnswerIndex = 2,
                explanation = "Peters personifies 'the panic of growing older' by giving it physical, bird-like attributes ('spreads fluttering wings') that chase human life.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_123",
                subject = "Literature in English",
                topic = "African Poetry: Authors",
                year = "2016",
                questionText = "The celebrated African poet Kofi Awoonor is from which West African nation?",
                optionA = "Cameroon",
                optionB = "Nigeria",
                optionC = "Ghana",
                optionD = "Kenya",
                correctAnswerIndex = 2,
                explanation = "Kofi Awoonor was a highly influential Ghanaian poet and diplomat whose work combines Ewe oral poetry traditions with modern themes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_124",
                subject = "Literature in English",
                topic = "African Poetry: Piano and Drums",
                year = "2016",
                questionText = "Gabriel Okara's poem 'Piano and Drums' symbolizes the:",
                optionA = "absolute superiority of the white man's civilization",
                optionB = "complex, clashing cultural identity of modern Africa",
                optionC = "simplicity of the European social framework",
                optionD = "complete decline of all Western values",
                correctAnswerIndex = 1,
                explanation = "The drums represent Africa's rich, primal, and natural past, while the piano represents the complex, confusing, and technical Western culture.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_125",
                subject = "Literature in English",
                topic = "Non-African Poetry: Crossing the Bar",
                year = "2016",
                questionText = "'But such a tide moving seems asleep... When that which drew from out the boundless deep / Turns again home.' The rhyme scheme of this stanza from Alfred Lord Tennyson's 'Crossing the Bar' is:",
                optionA = "abba",
                optionB = "abab",
                optionC = "abcd",
                optionD = "aabb",
                correctAnswerIndex = 1,
                explanation = "The rhyming pattern alternates: 'asleep' (a) rhymes with 'deep' (a), and 'foam' (b) rhymes with 'home' (b), establishing an abab scheme.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_126",
                subject = "Literature in English",
                topic = "Non-African Poetry: The Pulley",
                year = "2016",
                questionText = "'So strength first made a way; Then beauty flowed, then wisdom, honour...' These lines from George Herbert's 'The Pulley' are an example of:",
                optionA = "personification",
                optionB = "paradox",
                optionC = "metaphor",
                optionD = "antithesis",
                correctAnswerIndex = 0,
                explanation = "Herbert personifies abstract divine gifts (like Strength, Beauty, and Wisdom) as tangible physical liquids flowing out of God's glass.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_127",
                subject = "Literature in English",
                topic = "Non-African Poetry: The School Boy",
                year = "2016",
                questionText = "William Blake's poem 'The School Boy' can be best described as:",
                optionA = "dramatic",
                optionB = "instructive",
                optionC = "satiric",
                optionD = "expository",
                correctAnswerIndex = 2,
                explanation = "The poem is a gentle but sharp satire criticizing the rigid, unnatural, and oppressive formal education system of Blake's era.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_128",
                subject = "Literature in English",
                topic = "African Poetry: Vanity",
                year = "2016",
                questionText = "'If we cry roughly of our torments... What eyes will watch our large mouths / Shaped by the laughter of big children?' The language of Birago Diop's 'Vanity' is:",
                optionA = "inciting",
                optionB = "submissive",
                optionC = "imploring",
                optionD = "diplomatic",
                correctAnswerIndex = 2,
                explanation = "The persona adopts an imploring, deeply desperate tone, pleading with his people to respect ancestral wisdom rather than crying in vain.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_129",
                subject = "Literature in English",
                topic = "African Poetry: The Dining Table",
                year = "2016",
                questionText = "'Dinner tonight comes with / gun wounds, Our desert tongues lick the vegetable / blood-the pepper' In these lines from 'The Dining Table', the persona is:",
                optionA = "thirsty",
                optionB = "displeased",
                optionC = "hungry",
                optionD = "sick",
                correctAnswerIndex = 1,
                explanation = "The speaker expresses profound displeasure and horror at how their daily meals are constantly marred by civil war, violence, and bloodshed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_130",
                subject = "Literature in English",
                topic = "African Poetry: Ambush",
                year = "2016",
                questionText = "'blue Peter on empty ships all peters with petered out desires.' It can be deduced from these lines in Adeoti's 'Ambush' that the Peters are:",
                optionA = "highly disappointed and frustrated",
                optionB = "completely betrayed by their leaders",
                optionC = "naturally lazy and unmotivated",
                optionD = "extremely greedy for material wealth",
                correctAnswerIndex = 0,
                explanation = "The wordplay on 'petered out desires' represents the total loss of hope, frustration, and disappointment of the citizens under oppressive rule.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_131",
                subject = "Literature in English",
                topic = "Literary Genres: Drama",
                year = "2016",
                questionText = "An art form that is uniquely both literary in structure and theatrical in performance is:",
                optionA = "prosody",
                optionB = "prose",
                optionC = "drama",
                optionD = "poetry",
                correctAnswerIndex = 2,
                explanation = "Drama is unique because it exists both as written literature (the script) and as live theatrical performance (actors on stage).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_132",
                subject = "Literature in English",
                topic = "Dramatic Techniques: Soliloquy",
                year = "2016",
                questionText = "A speech delivered by a single character to themselves on stage, revealing their private thoughts, is a:",
                optionA = "epilogue",
                optionB = "monologue",
                optionC = "aside",
                optionD = "soliloquy",
                correctAnswerIndex = 3,
                explanation = "A soliloquy is a dramatic convention where a character delivers a solo speech on stage to share their internal conflicts directly with the audience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_133",
                subject = "Literature in English",
                topic = "Characterization: Round Characters",
                year = "2016",
                questionText = "In literary analysis, a 'round' character is typically associated with:",
                optionA = "internal change and psychological growth",
                optionB = "simplicity and absolute modesty",
                optionC = "stability and determination",
                optionD = "running down and mocking other characters",
                correctAnswerIndex = 0,
                explanation = "Round characters are multi-dimensional, complex, and undergo significant personal evolution and change in response to plot events.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_134",
                subject = "Literature in English",
                topic = "Poetic Genres: Narrative Poetry",
                year = "2016",
                questionText = "In a narrative poem, the poet primarily attempts to:",
                optionA = "summarize a complex story",
                optionB = "preach a moral sermon",
                optionC = "describe a beautiful place",
                optionD = "tell a complete story",
                correctAnswerIndex = 3,
                explanation = "Narrative poetry is designed specifically to recount a story, complete with characters, plot, setting, and conflict, using poetic form.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_135",
                subject = "Literature in English",
                topic = "Poetic Techniques: Enjambment",
                year = "2016",
                questionText = "The continuation of meaning without grammatical pause from one line of poetry to the next is:",
                optionA = "enjambment",
                optionB = "synecdoche",
                optionC = "alliteration",
                optionD = "melodrama",
                correctAnswerIndex = 0,
                explanation = "Enjambment is the running over of a sentence from one poetic line or stanza to the next without terminal punctuation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_136",
                subject = "Literature in English",
                topic = "Elements of Prose: Plot",
                year = "2016",
                questionText = "The plot of any narrative work generally refers to the:",
                optionA = "way in which the writer begins the story",
                optionB = "intrigue made by a character against the hero",
                optionC = "way the writer ends the story",
                optionD = "structured organization of events in the story",
                correctAnswerIndex = 3,
                explanation = "Plot is the deliberate, organized causal sequence of actions and events designed by the author to tell a story.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_137",
                subject = "Literature in English",
                topic = "Literary Genres: Didactic",
                year = "2016",
                questionText = "A didactic literary piece is one in which the writer primarily intends to:",
                optionA = "teach valuable human and moral lessons",
                optionB = "dictate commands directly to the reader",
                optionC = "condemn human technological progress",
                optionD = "discuss complex philosophical themes",
                correctAnswerIndex = 0,
                explanation = "Didactic literature (like fables, parables, and moral tales) is written with the primary purpose of instructing the reader in morality.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_138",
                subject = "Literature in English",
                topic = "Literary Theory: Literature Nature",
                year = "2016",
                questionText = "What fundamentally distinguishes literature from other academic disciplines?",
                optionA = "the direct communication of ideas",
                optionB = "the use of creative and artistic imagination",
                optionC = "the realistic portrayal of geographic places",
                optionD = "the logical exposition of human experience",
                correctAnswerIndex = 1,
                explanation = "While other fields rely on factual data, literature is uniquely characterized by the use of creative imagination to reshape human experience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_139",
                subject = "Literature in English",
                topic = "Literary Principles: Poetic Justice",
                year = "2016",
                questionText = "The concept where characters receive appropriate rewards or punishments according to their moral deeds is called:",
                optionA = "point of attack",
                optionB = "poetic justice",
                optionC = "popular outcry",
                optionD = "poetic license",
                correctAnswerIndex = 1,
                explanation = "Poetic justice is a literary device where virtue is ultimately rewarded and vice/wickedness is punished, satisfying the reader's sense of moral order.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_140",
                subject = "Literature in English",
                topic = "Elements of Style: Diction",
                year = "2016",
                questionText = "The specific, deliberate choice of words and language used by a writer to establish style is known as:",
                optionA = "figure of speech",
                optionB = "diction",
                optionC = "expression",
                optionD = "rhythm",
                correctAnswerIndex = 1,
                explanation = "Diction is the author's choice of vocabulary and style of expression, which shapes the tone, clarity, and impact of their writing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_141",
                subject = "Literature in English",
                topic = "Poetry Appreciation: Tone",
                year = "2016",
                questionText = "'Weep not child, weep not my darling, With these kisses, let me remove your tears...' The speaker's tone in these lines is:",
                optionA = "pessimistic",
                optionB = "optimistic",
                optionC = "helpless",
                optionD = "carefree",
                correctAnswerIndex = 1,
                explanation = "The speaker offers a deeply comforting, loving, and optimistic perspective, reassuring the child that their suffering will pass.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_142",
                subject = "Literature in English",
                topic = "Poetry Appreciation: The Motoka",
                year = "2016",
                questionText = "'You see that Benz at the rich's end? / That motoka is motoka, It belongs to the Minister for fairness...' This excerpt from Theo Luzuka's 'The Motoka' is best described as:",
                optionA = "sad",
                optionB = "humorous",
                optionC = "strange",
                optionD = "serious",
                correctAnswerIndex = 1,
                explanation = "Luzuka uses local dialect, witty syntax, and sharp irony to create a highly humorous but critical portrait of political corruption.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_143",
                subject = "Literature in English",
                topic = "Poetry Appreciation: Ulysses",
                year = "2016",
                questionText = "'... for my purpose holds To sail beyond the sunset and the baths / of all the western stars, until I die.' In this excerpt from Tennyson's 'Ulysses', the persona intends to:",
                optionA = "undertake dangerous adventures",
                optionB = "stop travelling and retire",
                optionC = "die in his palace",
                optionD = "travel only at night",
                correctAnswerIndex = 0,
                explanation = "Ulysses refuses to spend his old age in quiet retirement, declaring his firm resolve to sail into the unknown until the very end of his life.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_144",
                subject = "Literature in English",
                topic = "Poetry Appreciation: Loser of Everything",
                year = "2016",
                questionText = "'And my children left their peaceful nakedness for the uniform of iron and blood.' In these lines from David Diop's 'Loser of Everything', the imagery depicts:",
                optionA = "the displacement of village life by modern barrack life",
                optionB = "the absolute victory of nature over science",
                optionC = "the displacement of childhood innocence by colonial violence",
                optionD = "the triumph of artificial structures over the natural world",
                correctAnswerIndex = 2,
                explanation = "The transition from 'peaceful nakedness' to a 'uniform of iron and blood' symbolizes the violent, tragic conscription of African youth into colonial wars.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_145",
                subject = "Literature in English",
                topic = "Poetry Appreciation: Lest we should Be The Last",
                year = "2016",
                questionText = "'Now we have come to you, And are amazed to find Those you have loved and respected Mock you to your face.' These lines convey a feeling of deep:",
                optionA = "satisfaction",
                optionB = "hope",
                optionC = "disappointment",
                optionD = "fear",
                correctAnswerIndex = 2,
                explanation = "The speaker expresses profound shock and disappointment at the betrayal and mockery of respected community elders by those they loved.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_146",
                subject = "Literature in English",
                topic = "Drama Appreciation: The Lion and the Jewel",
                year = "2016",
                questionText = "'The time has come when I can fool myself no more. I am no man, Sadiku. My manhood ended near a week ago.' This confession reveals that the speaker:",
                optionA = "has become physically impotent",
                optionB = "deeply loves women",
                optionC = "is tired of traditional marriage",
                optionD = "is disgusted with daily life",
                correctAnswerIndex = 0,
                explanation = "In Wole Soyinka's 'The Lion and the Jewel', the aging chief Baroka deceptively tells Sadiku that he has lost his virile manhood to execute a cunning plan.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_147",
                subject = "Literature in English",
                topic = "Figures of Speech: Personification",
                year = "2016",
                questionText = "'In those days When civilization kicked us in the face When holy water slapped our cringing brows...' The dominant literary device in this excerpt from David Diop's 'The Vulture' is:",
                optionA = "metaphor",
                optionB = "pun",
                optionC = "simile",
                optionD = "personification",
                correctAnswerIndex = 3,
                explanation = "Diop personifies abstract historical concepts ('civilization kicked us', 'holy water slapped our brows') to highlight the brutality of colonial force.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_148",
                subject = "Literature in English",
                topic = "Poetry Appreciation: Poems in Four Parts",
                year = "2016",
                questionText = "'The leaves are withered Roses fold and shrink... Nuts wrinkle and crack.' The dominant image presented in these lines is that of:",
                optionA = "death and decay",
                optionB = "summer harvest",
                optionC = "extreme tiredness",
                optionD = "spent, declining life",
                correctAnswerIndex = 3,
                explanation = "The natural imagery of withered leaves, shrinking roses, and cracking nuts serves as a poignant metaphor for old age and spent human life.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_149",
                subject = "Literature in English",
                topic = "Poetry Appreciation: Life Stages",
                year = "2016",
                questionText = "'When I remember bygone days I think how evening follows morning...' This passage indicates that the speaker has arrived at the stage of:",
                optionA = "middle age",
                optionB = "adolescence",
                optionC = "old age",
                optionD = "early childhood",
                correctAnswerIndex = 2,
                explanation = "Reflecting on 'bygone days' and comparing life to 'evening following morning' shows the speaker is in the twilight of their life.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2016_150",
                subject = "Literature in English",
                topic = "Poetic Devices: Apostrophe",
                year = "2016",
                questionText = "'Behold her, single in the field / You solitary Highland lass! Reaping and singing...' These lines from Wordsworth's 'The Solitary Reaper' constitute an:",
                optionA = "apostrophe",
                optionB = "aside",
                optionC = "interior monologue",
                optionD = "soliloquy",
                correctAnswerIndex = 0,
                explanation = "The speaker directly addresses the reader/listener ('Behold her', 'O listen!'), drawing their attention to the distant singing girl.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2016 • Q50"
            )
        )

        // Questions 151 to 200 (2017 & Comprehensive Master Analysis)
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_151",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2017",
                questionText = "In Frank Ogodo Ogbeche's 'Harvest of Corruption', Aloho perceives her unexpected pregnancy as a form of:",
                optionA = "reward",
                optionB = "blessing",
                optionC = "punishment",
                optionD = "injustice",
                correctAnswerIndex = 2,
                explanation = "Aloho is devastated by her pregnancy outside of marriage, viewing it as a severe, shameful divine punishment for her moral lapses.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_152",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2017",
                questionText = "The play 'Harvest of Corruption' can be best classified as a:",
                optionA = "dramatic irony",
                optionB = "allegory",
                optionC = "fable",
                optionD = "satire",
                correctAnswerIndex = 3,
                explanation = "The play is a social and political satire, exposing and ridiculing the greed, corruption, and systemic decay within contemporary public offices.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_153",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2017",
                questionText = "According to Ochuole, a government job is primarily:",
                optionA = "a complete waste of time",
                optionB = "extremely time-consuming",
                optionC = "excellent for hardworking youths",
                optionD = "an avenue to personalize public funds",
                correctAnswerIndex = 3,
                explanation = "Ochuole represents the corrupt public servant who views her government position as an opportunity to secure personal wealth through embezzlement.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_154",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2017",
                questionText = "'En! En! En! You have come again... I am not always comfortable when you start dishing out this your born again stuff...' This statement is made by:",
                optionA = "Ochuole",
                optionB = "Aloho",
                optionC = "Ogeyi",
                optionD = "Chief",
                correctAnswerIndex = 0,
                explanation = "The cynical Ochuole says this to dismiss and mock her friend's moral warnings and religious conscience.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_155",
                subject = "Literature in English",
                topic = "African Drama: Harvest of Corruption",
                year = "2017",
                questionText = "Aloho is repeatedly warned by her close friend Ogeyi about associating with Ochuole because the latter is:",
                optionA = "too sophisticated and wealthy",
                optionB = "arrogant",
                optionC = "mischievous and corrupt",
                optionD = "born-again",
                correctAnswerIndex = 2,
                explanation = "Ogeyi recognizes Ochuole's lack of moral principles and warns Aloho that associating with her will lead to trouble.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_156",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2017",
                questionText = "'She is abused, stol'n from me and corrupted By spells and medicines bought of mountebanks...' These angry lines in 'Othello' refer to:",
                optionA = "Brabantio's suspicion and anger",
                optionB = "Desdemona's outstanding beauty",
                optionC = "Othello's suspicion of unfaithfulness",
                optionD = "Iago's plot against Cassio",
                correctAnswerIndex = 0,
                explanation = "Brabantio expresses his outrage to the Duke, claiming that Othello must have used witchcraft or drugs to seduce Desdemona.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_157",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2017",
                questionText = "Shakespeare's tragedy 'Othello' was historically first staged at:",
                optionA = "Liverpool Stadium",
                optionB = "Manchester Stadium",
                optionC = "Whitehall Palace, London",
                optionD = "The London Theatre",
                correctAnswerIndex = 2,
                explanation = "Historical records indicate that 'Othello' was first performed in November 1604 before King James I at Whitehall Palace in London.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_158",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2017",
                questionText = "'All's One-Good faith, how foolish are our minds! If I do die before thee, prithee, shroud me In one of those same sheets.' This plea is made by:",
                optionA = "Desdemona to Emilia",
                optionB = "Othello to Iago",
                optionC = "Iago to Emilia",
                optionD = "Cassio to Bianca",
                correctAnswerIndex = 0,
                explanation = "Fearing her husband's anger, Desdemona makes this request to her maid Emilia, foreshadowing her tragic death.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_159",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2017",
                questionText = "'Let him do his spite; My services which I have done the signiory Shall out-tongue his complaints...' This confident statement is made by:",
                optionA = "Brabantio",
                optionB = "Othello",
                optionC = "Cassio",
                optionD = "Iago",
                correctAnswerIndex = 1,
                explanation = "Othello calmly responds to Iago's warnings about Brabantio's anger, confident that his military record will protect him.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_160",
                subject = "Literature in English",
                topic = "Shakespearean Drama: Othello",
                year = "2017",
                questionText = "'O heaven; How got she out? O treason of the blood / Father, from hence trust not your daughters' minds...' This speech is delivered by:",
                optionA = "Brabantio",
                optionB = "Othello",
                optionC = "Gratiano",
                optionD = "Roderigo",
                correctAnswerIndex = 0,
                explanation = "The frantic Brabantio laments his daughter's secret escape to marry Othello, warning other fathers to be wary.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_161",
                subject = "Literature in English",
                topic = "African Prose: Faceless",
                year = "2017",
                questionText = "The term 'Sodom and Gomorrah' used in Amma Darko's 'Faceless' is an example of:",
                optionA = "mixed metaphor",
                optionB = "allusion",
                optionC = "synecdoche",
                optionD = "euphemism",
                correctAnswerIndex = 1,
                explanation = "Darko uses this biblical allusion to highlight the moral decay, danger, and lawlessness of Accra's urban slums.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_162",
                subject = "Literature in English",
                topic = "African Prose: Faceless",
                year = "2017",
                questionText = "The narrative focus of 'Faceless' centers on the plight of:",
                optionA = "stubborn children in rich schools",
                optionB = "negligent parents and street children",
                optionC = "greedy politicians in parliament",
                optionD = "peer group pressure in universities",
                correctAnswerIndex = 1,
                explanation = "The novel exposes the harsh reality of homeless children in Accra, highlighting how parental neglect contributes to the crisis.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_163",
                subject = "Literature in English",
                topic = "African Prose: Faceless",
                year = "2017",
                questionText = "In 'Faceless', Fofo chooses to spend the night sleeping in front of the provision store because:",
                optionA = "it is a Sunday and the store is closed",
                optionB = "she is too ill to walk further",
                optionC = "she does not want to risk losing her informal job",
                optionD = "she has nowhere else to go",
                correctAnswerIndex = 3,
                explanation = "As a homeless street child, Fofo has no safe shelter and is forced to sleep on open concrete shop verandas.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_164",
                subject = "Literature in English",
                topic = "African Prose: Lonely Days",
                year = "2017",
                questionText = "In Bayo Adebowale's 'Lonely Days', the term 'Labankada' signifies:",
                optionA = "wealth and peace",
                optionB = "wealth and life",
                optionC = "wealth and prosperity",
                optionD = "wealth and protection",
                correctAnswerIndex = 2,
                explanation = "In the novel, Labankada represents material success, wealth, and community prosperity within rural society.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_165",
                subject = "Literature in English",
                topic = "African Prose: Lonely Days",
                year = "2017",
                questionText = "The widows of Kufi in 'Lonely Days' are characterized as powerful:",
                optionA = "singers",
                optionB = "farmers",
                optionC = "traders",
                optionD = "survivors",
                correctAnswerIndex = 3,
                explanation = "Despite facing oppressive widowhood rites, the women demonstrate resilience, supporting each other to survive.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_166",
                subject = "Literature in English",
                topic = "African Prose: Lonely Days",
                year = "2017",
                questionText = "In 'Lonely Days', the widows in the community are united by their shared loss of:",
                optionA = "love",
                optionB = "family connections",
                optionC = "fame and wealth",
                optionD = "dignity and social status",
                correctAnswerIndex = 3,
                explanation = "Traditional customs strip widows of their rights and status, uniting them in their struggle to reclaim their dignity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_167",
                subject = "Literature in English",
                topic = "Non-African Prose: Native Son",
                year = "2017",
                questionText = "'Light flooded the room and revealed a black boy standing in a narrow space between two...' The style of these opening lines from 'Native Son' is:",
                optionA = "narrative",
                optionB = "dramatic",
                optionC = "descriptive",
                optionD = "expository",
                correctAnswerIndex = 2,
                explanation = "Wright uses descriptive language to establish the cramped, impoverished setting of the Thomas family's apartment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_168",
                subject = "Literature in English",
                topic = "Non-African Prose: Native Son",
                year = "2017",
                questionText = "Bigger Thomas kills Mary Dalton primarily due to:",
                optionA = "panic and fear of discovery",
                optionB = "jealousy",
                optionC = "deep-seated hatred",
                optionD = "distrust",
                correctAnswerIndex = 0,
                explanation = "Bigger suffocates Mary with a pillow to prevent her blind mother from discovering him in her bedroom.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_169",
                subject = "Literature in English",
                topic = "Non-African Prose: Native Son",
                year = "2017",
                questionText = "As a chauffeur for the Dalton family, Bigger is promised a weekly salary of:",
                optionA = "twenty dollars",
                optionB = "twenty-five dollars",
                optionC = "thirty dollars",
                optionD = "thirty-five dollars",
                correctAnswerIndex = 0,
                explanation = "Mr. Dalton offers Bigger a starting wage of twenty dollars a week, which represents a significant opportunity for him.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_170",
                subject = "Literature in English",
                topic = "Non-African Prose: Native Son",
                year = "2017",
                questionText = "Mr. Dalton holds the paternalistic view that black people are happiest when they are:",
                optionA = "living together in segregated neighborhoods",
                optionB = "employed as servants in white households",
                optionC = "highly educated in universities",
                optionD = "given equal civic respect",
                correctAnswerIndex = 1,
                explanation = "Despite his philanthropy, Mr. Dalton's views reflect the racial prejudices of his era, believing blacks are best suited for service roles.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_171",
                subject = "Literature in English",
                topic = "Non-African Poetry: The Proud King",
                year = "2017",
                questionText = "William Morris's poem 'The Proud King' is written as a:",
                optionA = "didactic tale",
                optionB = "pastoral poem",
                optionC = "traditional ballad",
                optionD = "lyrical song",
                correctAnswerIndex = 0,
                explanation = "The poem is a moral story designed to teach the importance of humility and the dangers of pride.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_172",
                subject = "Literature in English",
                topic = "African Poetry: Piano and Drums",
                year = "2017",
                questionText = "The phrase 'Mystic rhythm' in Gabriel Okara's 'Piano and Drums' is used to:",
                optionA = "express a specific emotional mood",
                optionB = "provide standard musical accompaniment",
                optionC = "carry a definite message from the ancestors",
                optionD = "encourage pleasurable dancing",
                correctAnswerIndex = 2,
                explanation = "The 'mystic rhythm' of the African drums connects the speaker to his ancestral roots and cultural heritage.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_173",
                subject = "Literature in English",
                topic = "Figures of Speech: Personification",
                year = "2017",
                questionText = "The line 'And my boots have suddenly become too reluctant to walk me' in 'The Dining Table' is an example of:",
                optionA = "pun",
                optionB = "personification",
                optionC = "metaphor",
                optionD = "simile",
                correctAnswerIndex = 1,
                explanation = "Attributing the human quality of 'reluctance' to boots is a clear use of personification.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_174",
                subject = "Literature in English",
                topic = "Non-African Poetry: Crossing the Bar",
                year = "2017",
                questionText = "The mood of the speaker in Alfred Lord Tennyson's 'Crossing the Bar' is one of calm:",
                optionA = "pain",
                optionB = "frustration",
                optionC = "hope",
                optionD = "love",
                correctAnswerIndex = 2,
                explanation = "The speaker faces death with hope and peace, wishing for a smooth transition into the afterlife.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q24"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_175",
                subject = "Literature in English",
                topic = "Figures of Speech: Metaphor",
                year = "2017",
                questionText = "'Having a glass of blessings standing by...' This line from George Herbert's 'The Pulley' is an example of a:",
                optionA = "metaphor",
                optionB = "personification",
                optionC = "hyperbole",
                optionD = "simile",
                correctAnswerIndex = 0,
                explanation = "The 'glass of blessings' is a metaphor for the abundance of gifts God bestows upon humanity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q25"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_176",
                subject = "Literature in English",
                topic = "African Poetry: The Panic of Growing Older",
                year = "2017",
                questionText = "Lenrie Peters' poem 'The Panic of Growing Older' is written from a perspective that is:",
                optionA = "metaphysical",
                optionB = "philosophical",
                optionC = "satirical",
                optionD = "metaphorical",
                correctAnswerIndex = 1,
                explanation = "The poem offers a philosophical reflection on aging and the gradual loss of youth and ambition.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_177",
                subject = "Literature in English",
                topic = "Poetic Devices: Rhetorical Questions",
                year = "2017",
                questionText = "A prominent literary device in William Blake's 'The School Boy' is the use of:",
                optionA = "oxymoron",
                optionB = "rhetorical questions",
                optionC = "ironic statements",
                optionD = "metaphors",
                correctAnswerIndex = 1,
                explanation = "The boy asks rhetorical questions ('How can the bird that is born for joy / Sit in a cage and sing?') to challenge the restrictions of formal schooling.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_178",
                subject = "Literature in English",
                topic = "African Poetry: Vanity",
                year = "2017",
                questionText = "The tone of Birago Diop's poem 'Vanity' is one of:",
                optionA = "anger",
                optionB = "pity",
                optionC = "joy",
                optionD = "scorn",
                correctAnswerIndex = 3,
                explanation = "The speaker expresses scorn for those who ignore the wisdom of their ancestors and then cry about their misfortunes.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_179",
                subject = "Literature in English",
                topic = "African Poetry: The Anvil and the Hammer",
                year = "2017",
                questionText = "Kofi Awoonor's 'The Anvil and the Hammer' presents a thematic clash between the:",
                optionA = "past and present",
                optionB = "past and future",
                optionC = "future and modern eras",
                optionD = "olden days and colonial days",
                correctAnswerIndex = 0,
                explanation = "The poem explores the challenge of reconciling traditional African heritage with the realities of modern Western influence.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_180",
                subject = "Literature in English",
                topic = "Literary Principles: Mood",
                year = "2017",
                questionText = "In literary analysis, the 'totality of effects' produced on a reader by a work of art defines its:",
                optionA = "tone",
                optionB = "mood",
                optionC = "plot",
                optionD = "diction",
                correctAnswerIndex = 1,
                explanation = "The mood is the overall emotional response or atmosphere created in the reader's mind by the text.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_181",
                subject = "Literature in English",
                topic = "Dramatic Genres: Opera",
                year = "2017",
                questionText = "An art form in which singers and musicians perform a dramatic work combining text and musical score is:",
                optionA = "concert",
                optionB = "opera",
                optionC = "theatre",
                optionD = "pantomime",
                correctAnswerIndex = 1,
                explanation = "Opera is a dramatic performance where the dialogue is sung to orchestral accompaniment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_182",
                subject = "Literature in English",
                topic = "Literary Techniques: Local Colour",
                year = "2017",
                questionText = "In literature, the technique of incorporating realistic regional details and customs is known as:",
                optionA = "universal color",
                optionB = "local colour",
                optionC = "English color",
                optionD = "American color",
                correctAnswerIndex = 1,
                explanation = "Local color writing focuses on the dialect, customs, and scenery of a specific region to enhance realism.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_183",
                subject = "Literature in English",
                topic = "Plot Devices: Foreshadowing",
                year = "2017",
                questionText = "A literary device that provides a clue or hint about events that will happen later in the story is:",
                optionA = "flashback",
                optionB = "foreshadowing",
                optionC = "premonition",
                optionD = "digression",
                correctAnswerIndex = 1,
                explanation = "Foreshadowing prepares the reader for future developments in the plot.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_184",
                subject = "Literature in English",
                topic = "Dramatic Genres: Farce",
                year = "2017",
                questionText = "A form of comedy characterized by exaggerated, improbable situations and physical humor is:",
                optionA = "farce",
                optionB = "comedy",
                optionC = "melodrama",
                optionD = "tragicomedy",
                correctAnswerIndex = 0,
                explanation = "A farce prioritizes physical humor and absurd situations over realistic plots.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_185",
                subject = "Literature in English",
                topic = "Poetry Appreciation: Song of Sorrow",
                year = "2017",
                questionText = "'I am on the world's extreme corner.' This line from Kofi Awoonor's 'Song of Sorrow' reveals that the speaker is:",
                optionA = "indifferent",
                optionB = "sad",
                optionC = "angry",
                optionD = "in pain",
                correctAnswerIndex = 1,
                explanation = "The speaker expresses profound grief and isolation, feeling pushed to the very edge of existence.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_186",
                subject = "Literature in English",
                topic = "Figures of Speech: Personification",
                year = "2017",
                questionText = "'For love to wake from her sickly slumber...' The dominant figure of speech in this line is:",
                optionA = "assonance",
                optionB = "personification",
                optionC = "metaphor",
                optionD = "oxymoron",
                correctAnswerIndex = 1,
                explanation = "Attributing the human capacity of sleep and awakening to 'love' is an example of personification.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_187",
                subject = "Literature in English",
                topic = "Poetic Appreciation: Tone",
                year = "2017",
                questionText = "'We have rain but hate to plant / We have the heat and the glory of the rainbow / But we kill our own suns...' The poet's tone is one of:",
                optionA = "disappointment",
                optionB = "indifference",
                optionC = "anxiety",
                optionD = "joy",
                correctAnswerIndex = 0,
                explanation = "The speaker laments the waste of natural resources and self-destructive behavior of his community.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_188",
                subject = "Literature in English",
                topic = "Poetic Appreciation: Life Stages",
                year = "2017",
                questionText = "The line 'When I remember bygone days I think how evening follow morning' indicates that the poet is in:",
                optionA = "middle age",
                optionB = "adolescence",
                optionC = "old age",
                optionD = "early childhood",
                correctAnswerIndex = 2,
                explanation = "The reflection on life's rapid progression indicates that the speaker has reached old age.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_189",
                subject = "Literature in English",
                topic = "Poetic Devices: Apostrophe",
                year = "2017",
                questionText = "'Behold her, single in the field / You solitary Highland Lass...' These lines from Wordsworth constitute:",
                optionA = "an apostrophe",
                optionB = "an aside",
                optionC = "an interior monologue",
                optionD = "soliloquy",
                correctAnswerIndex = 0,
                explanation = "The speaker directly addresses the reader or a passerby, drawing attention to the girl singing in the field.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q39"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_190",
                subject = "Literature in English",
                topic = "Dramatic Structure: Denouement",
                year = "2017",
                questionText = "The resolution of conflicts at the end of a dramatic work is known as the:",
                optionA = "climax",
                optionB = "exposition",
                optionC = "denouement",
                optionD = "rising action",
                correctAnswerIndex = 2,
                explanation = "The denouement is the final part of a play or narrative where the strands of the plot are drawn together and matters are explained.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_191",
                subject = "Literature in English",
                topic = "Figures of Speech: Synecdoche",
                year = "2017",
                questionText = "A literary device that uses a part of something to represent the whole is:",
                optionA = "synecdoche",
                optionB = "metonymy",
                optionC = "hyperbole",
                optionD = "litotes",
                correctAnswerIndex = 0,
                explanation = "Synecdoche is a figure of speech in which a part is made to represent the whole (e.g., 'all hands on deck').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_192",
                subject = "Literature in English",
                topic = "Figures of Speech: Euphemism",
                year = "2017",
                questionText = "The substitution of an offensive term with a milder, less offensive one is:",
                optionA = "hyperbole",
                optionB = "euphemism",
                optionC = "oxymoron",
                optionD = "paradox",
                correctAnswerIndex = 1,
                explanation = "Euphemism is used to make a harsh or unpleasant reality sound more polite or acceptable.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_193",
                subject = "Literature in English",
                topic = "Poetic Forms: Sonnet",
                year = "2017",
                questionText = "A poem of fourteen lines with a strict rhyme scheme is a:",
                optionA = "ballad",
                optionB = "sonnet",
                optionC = "lyric",
                optionD = "ode",
                correctAnswerIndex = 1,
                explanation = "A sonnet is a classic poetic form consisting of exactly fourteen lines, traditionally written in iambic pentameter.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_194",
                subject = "Literature in English",
                topic = "Poetic Forms: Ballad",
                year = "2017",
                questionText = "A narrative poem that tells a simple story, historically meant to be sung, is a:",
                optionA = "sonnet",
                optionB = "ballad",
                optionC = "lyric",
                optionD = "epic",
                correctAnswerIndex = 1,
                explanation = "Ballads are narrative poems with simple stanzas and refrains, originally passed down through oral song traditions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_195",
                subject = "Literature in English",
                topic = "Sound Devices: Assonance",
                year = "2017",
                questionText = "The use of identical vowel sounds in accented syllables of close words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 1,
                explanation = "Assonance is the repetition of vowel sounds within nearby words to create internal rhyming and musicality.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_196",
                subject = "Literature in English",
                topic = "Figures of Speech: Hyperbole",
                year = "2017",
                questionText = "A figure of speech that uses exaggeration to make a point is:",
                optionA = "hyperbole",
                optionB = "litotes",
                optionC = "euphemism",
                optionD = "irony",
                correctAnswerIndex = 0,
                explanation = "Hyperbole is an intentional, obvious exaggeration used for emphasis or dramatic effect.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_197",
                subject = "Literature in English",
                topic = "Character Roles: Antagonist",
                year = "2017",
                questionText = "The central character in a work of literature who opposes the protagonist is the:",
                optionA = "hero",
                optionB = "antagonist",
                optionC = "foil",
                optionD = "confidant",
                correctAnswerIndex = 1,
                explanation = "The antagonist is the character or force that creates conflict for the protagonist.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_198",
                subject = "Literature in English",
                topic = "Literary Devices: Allusion",
                year = "2017",
                questionText = "A reference to a well-known person, place, event, or literary work within a text is an:",
                optionA = "allusion",
                optionB = "illusion",
                optionC = "allegory",
                optionD = "analogy",
                correctAnswerIndex = 0,
                explanation = "An allusion relies on the reader's familiarity with the external reference to enrich the meaning of the text.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_199",
                subject = "Literature in English",
                topic = "Literary Genres: Allegory",
                year = "2017",
                questionText = "A story in which characters and events represent abstract qualities to teach a moral lesson is an:",
                optionA = "epic",
                optionB = "allegory",
                optionC = "anecdote",
                optionD = "essay",
                correctAnswerIndex = 1,
                explanation = "Allegories function on both a literal and a symbolic level to convey a deeper moral or political message.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol2_2017_200",
                subject = "Literature in English",
                topic = "Sound Devices: Onomatopoeia",
                year = "2017",
                questionText = "The use of words that imitate the natural sounds they describe is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 3,
                explanation = "Onomatopoeia (e.g., 'buzz', 'hiss', 'clatter') enhances sensory description by mimicking auditory experiences.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2017 • Q50"
            )
        )

        return list
    }
}
