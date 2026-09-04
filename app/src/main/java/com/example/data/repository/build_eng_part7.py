import sys
from parse_eng_helper import write_bank_file

questions = [
    # 1980 Passage A: Ezekiel
    {
        "id": "eng_1980_comp_01",
        "topic": "Comprehension: Ezekiel's Ministry",
        "year": "1980",
        "text": "Based on the passage on Ezekiel's prophetic ministry:\n'Ezekiel was a great herald of things to come because _____.'",
        "opts": [
            "He was a prophet",
            "He preached about events which were to characterize the period after the Exile",
            "God showed him what was going to happen after exile",
            "He ran a prophetic ministry"
        ],
        "ans": 1,
        "exp": "The passage explains that Ezekiel foreshadowed and preached about the religious developments that characterized the age after the Exile.",
        "passage": "The great herald of things to come was Ezekiel, not only in the sense that he predicted the future, but also because in the manner and content of his prophetic ministry, he foreshadowed many of the important religious developments which were characteristics of the age after the Exile.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1980 • Passage A Q1"
    },
    {
        "id": "eng_1980_comp_02",
        "topic": "Comprehension: Ezekiel",
        "year": "1980",
        "text": "Based on the passage on Ezekiel's prophetic ministry:\n'In his work, Ezekiel _____.'",
        "opts": [
            "Was friendly with Ezra",
            "Founded Judaism in conjunction with Ezra",
            "Forged a link between the past and the future",
            "Had a large religious following"
        ],
        "ans": 2,
        "exp": "The text states: 'He not only pointed forward; but as we shall see, he represented some of the great elements in Israel\\'s religious past.'",
        "passage": "He, rather than Ezra, was the founder of Judaism. He not only pointed forward; but as we shall see, he represented some of the great elements in Israel's religious past.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1980 • Passage A Q2"
    },
    # 1981 Passage A: Robbery at the Post Office
    {
        "id": "eng_1981_comp_01",
        "topic": "Comprehension: Post Office Robbery",
        "year": "1981",
        "text": "Based on the narrative of the Sunday post office incident:\n'The brothers thought it was odd for the post office to be open because _____.'",
        "opts": [
            "Nobody works on Sundays normally",
            "People should be in church",
            "Post offices should open only five days in the week",
            "That was probably the second time they had seen it open on a Sunday"
        ],
        "ans": 0,
        "exp": "In the passage, the narrator's brother points out the oddity of the post office being opened on a Sunday afternoon.",
        "passage": "It was a Sunday afternoon that I saw the lorry standing in front of the post office. I had seen it long before my brother saw it, but it was he who said to me 'Don't you think it odd that the post office should be open this afternoon?'",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1981 • Passage A Q1"
    },
    {
        "id": "eng_1981_comp_04",
        "topic": "Comprehension: Post Office Robbery",
        "year": "1981",
        "text": "Based on the narrative:\n'The robbers could not escape because _____.'",
        "opts": [
            "The safe was too heavy",
            "The engine of their lorry failed",
            "They were not smart enough",
            "Nemesis wanted to catch up with them"
        ],
        "ans": 1,
        "exp": "The passage states: 'the man who had shouted got into the driver\\'s seat, but the lorry would not start. Just then my brother came back with three policemen.'",
        "passage": "When they had done this, the man who had shouted got into the driver's seat, but the lorry would not start. Just then my brother came back with three policemen.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1981 • Passage A Q4"
    },
    {
        "id": "eng_1981_comp_05",
        "topic": "Comprehension: Post Office Robbery",
        "year": "1981",
        "text": "Based on the narrative:\n'The leader of the robbers was angry because _____.'",
        "opts": [
            "His gang was arrested",
            "The stolen safe was empty",
            "They were all going to prison",
            "Spending their loot would be impossible"
        ],
        "ans": 1,
        "exp": "The author notes that the leader's face was 'contorted with rage when he learned that the safe they had managed to steal was empty, and all the money was in the bank.'",
        "passage": "The men went to prison, of course, in the end, but you should have seen the face of the leader - it was contorted with rage - when he learned that the safe they had managed to steal was empty, and all the money was in the bank.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1981 • Passage A Q5"
    },
    # 1991 Passage I: Noise & Hearing
    {
        "id": "eng_1991_comp_01",
        "topic": "Comprehension: Noise-Induced Hearing Loss",
        "year": "1991",
        "text": "According to the passage on hearing specialists:\n'The young are not listening to their elders because _____.'",
        "opts": [
            "They never have",
            "Their parents nag constantly",
            "They are permanently deaf",
            "They appear to be going deaf from blasting their eardrums with amplified music"
        ],
        "ans": 3,
        "exp": "Otologists report that youngsters are going deaf as a result of blasting their eardrums with electronically amplified music.",
        "passage": "The young are not listening to their elders, and perhaps they never have. But now it happens that, with many of them, the reason may be medical. The young aren't listening because they can't hear. Just as nagging parents have long suspected, otologists (hearing specialists) now report that youngsters are going deaf as a result of blasting their eardrums with electronically amplified rock 'n' roll.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 1991 • Passage I Q1"
    },
    {
        "id": "eng_1991_comp_05",
        "topic": "Comprehension: Military Band vs Amplified Music",
        "year": "1991",
        "text": "According to the passage on acoustic health:\n'What is the difference between an old-fashioned military band and discotheque joints?'",
        "opts": [
            "One is old-fashioned while the other is modern",
            "One produces sounds for marching, the other for disco",
            "One produces amplified sounds, the other does not",
            "One has drums, the other has guitars"
        ],
        "ans": 2,
        "exp": "The passage emphasizes that the acoustic difference lies in electronic amplifiers; military bands generate sound dissipated in open air without amplification.",
        "passage": "In discotheques and rock 'n' roll joints, the trouble is not so much in the instruments themselves, or the close quarters. The blame goes to the electronic amplifiers. An old-fashioned military band, playing a march in Ramat Park, generated as much sound. But the sound was not amplified and was dissipated in the open air.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 1991 • Passage I Q5"
    },
    # 2003 Passage II: World Cup Korea/Japan 2002
    {
        "id": "eng_2003_comp_06",
        "topic": "Comprehension: 2002 FIFA World Cup",
        "year": "2003",
        "text": "Based on the passage on the 2002 World Cup:\n'Which of the following captures the writer\\'s suggestion on how the Super Eagles could improve their performance in subsequent matches?'",
        "opts": [
            "Better goalkeeping, a better attack and a stronger midfield",
            "Replacement of injured/unfit players, stronger attackers and a rugged defence",
            "Good coaching, more strikers and more defenders",
            "Fair officiating, good goalkeeping and fast players"
        ],
        "ans": 1,
        "exp": "The writer recommends strengthening the defense, improving striking precision, and creative use of fit reserves rather than gambling with unfit players.",
        "passage": "First, the defence needed to be strengthened to prevent the opponents from incessantly terrorizing the goalkeeper. Then the strikers also needed to improve on their lacklustre performance against Argentina... Lastly, rather than gamble with unfit players, a more creative use of the reserves would be necessary.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2003 • Passage II Q6"
    },
    {
        "id": "eng_2003_comp_09",
        "topic": "Vocabulary: Debutants",
        "year": "2003",
        "text": "Based on the sports passage:\n'The word \"debutants\", as used in the passage, means _____.'",
        "opts": ["Under-dogs", "First-timers / newcomers to the competition", "Giant killers", "Veteran teams"],
        "ans": 1,
        "exp": "A 'debutant' in sports is a person or team appearing or competing in a tournament for the first time.",
        "passage": "If World Cup debutants, Senegal, could nurse the hope of playing in the knock-out stages of the tournament, then the Eagles should soar instead of being intimidated by big names, for no team is invincible.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2003 • Passage II Q9"
    },
    # 2006 Passage I: Rural-Urban Migration & Cottage Industries
    {
        "id": "eng_2006_comp_01",
        "topic": "Comprehension: Capital and Work",
        "year": "2006",
        "text": "Based on the socio-economic passage:\n'The expression \"As capital is the product of human work\" seems to support the argument that _____.'",
        "opts": [
            "Rural dwellers who move to urban cities often overcome poverty",
            "Urban areas will continue to experience overcrowding as long as workplaces are concentrated there",
            "Urban productivity is affected by mass migration",
            "Rural people are poor because they lack work opportunities to create capital and fight back poverty"
        ],
        "ans": 3,
        "exp": "Because capital is produced through work opportunities, lack of rural work opportunities directly traps dwellers in poverty.",
        "passage": "The root of problem which bedevil rural dwellers in Nigeria can be traced to the sad fact that work opportunities are so restricted that they cannot work their way out of poverty and misery... As capital is the product of human work, rural dwellers who are desperate enough to overcome poverty often leave the villages in search of some kind of existence in the big cities.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2006 • Passage I Q1"
    },
    {
        "id": "eng_2006_comp_03",
        "topic": "Comprehension: Cottage Industry Requirements",
        "year": "2006",
        "text": "Based on the passage on national rural development:\n'The writer describes the key features of a \"cottage industry\" as _____.'",
        "opts": [
            "Affordable energy source, manpower, cheap products and easy marketing",
            "Availability of capital, high productivity, low capital demand and simplicity of operations",
            "Rural location, simplicity of production, local sourcing of raw materials and affordable workplace setup",
            "Urban relocation and mechanized factory production"
        ],
        "ans": 2,
        "exp": "The author outlines four pillars: rural location, relatively simple production methods, using local materials for local use, and cheap workplaces that can be multiplied.",
        "passage": "First, the work opportunities should be created in the rural areas where the majority of the people live... Second, the production method employed must be relatively simple... Third, production should be mainly from local materials and for local use. Lastly, rural workplaces should be cheap enough so that they can be created in large numbers. These four requirements together meet the description of what is usually called 'cottage industry'.",
        "diff": "Medium",
        "originLabel": "JAMB Use of English 2006 • Passage I Q3"
    },
    # 2012 Passage I: Traditional Religion in Nigeria
    {
        "id": "eng_2012_comp_02",
        "topic": "Comprehension: Cosmology in Nigerian Religion",
        "year": "2012",
        "text": "According to the passage on indigenous beliefs:\n'According to the first paragraph, Nigerians believe that _____.'",
        "opts": [
            "The supernatural and natural worlds co-exist and interact",
            "The natural and supernatural worlds are antagonistic",
            "The supernatural world exploits the natural world",
            "Supernatural beings have no interest in humans"
        ],
        "ans": 0,
        "exp": "The passage states that Nigerians believe in an unseen supernatural world apart from the natural world, with spiritual beings watching and interacting with humans.",
        "passage": "Nigerian people are very religious; most of them believe that there is an unseen supernatural world, apart from the natural world we see around us. This other world is inhabited by beings who are the source of our knowledge of good and evil. They watch and judge us, and if we offend them they may have to be appeased with prayers and sacrifices.",
        "diff": "Easy",
        "originLabel": "JAMB Use of English 2012 • Passage I Q2"
    }
]

write_bank_file("JambEnglishMegaBankSeriesPart7", questions)
print("Part 7 built successfully")
