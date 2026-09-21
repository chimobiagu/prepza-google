package com.example.data.repository

data class NovelChapterData(
    val chapterNumber: Int,
    val title: String,
    val summary: String,
    val keyQuotes: List<String>,
    val fullText: String
)

data class NovelCharacterData(
    val name: String,
    val role: String,
    val description: String,
    val keyTraits: String
)

data class NovelThemeData(
    val title: String,
    val description: String,
    val utmeSignificance: String
)

data class NovelQuizData(
    val id: Int,
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val explanation: String
)

object SecondClassCitizenBook {
    val title = "Second-Class Citizen"
    val author = "Buchi Emecheta"
    val genre = "Semi-Autobiographical Fiction / African Prose"
    val publicationYear = "1974 (Allison & Busby / George Braziller)"
    val dedication = "To my dear children: Florence, Sylvester, Jake, Christy and Alice, without whose sweet background noises this book would not have been written."
    val synopsis = """
        Second-Class Citizen tells the poignant story of Adah Ofili, an ambitious Nigerian Igbo woman determined to obtain an education and fulfill her dream of traveling to the United Kingdom. Born in colonial Lagos and facing gender discrimination from childhood, Adah navigates the loss of her father, forced servitude in her uncle's household, early marriage to Francis Obi, and motherhood. In London, she confronts the grim reality of racial prejudice, poverty, squalid living conditions, domestic violence, and a patriarchal husband who burns her first manuscript 'The Bride Price'. Through fierce resilience, Adah reclaims her autonomy, secures her children's future, and emerges as a writer.
    """.trimIndent()

    val characters = listOf(
        NovelCharacterData(
            name = "Adah Ofili (Obi)",
            role = "Protagonist & Narrator",
            description = "A resilient, brilliant, and determined Igbo girl from Ibuza born in Lagos. Overcomes societal subjugation, secures a scholarship, marries Francis, migrates to London, and battles racism and marital abuse to become a writer.",
            keyTraits = "Ambitious, resilient, intellectual, fierce maternal protector, observant"
        ),
        NovelCharacterData(
            name = "Francis Obi",
            role = "Adah's Husband / Antagonist",
            description = "An insecure, opportunistic, and abusive husband studying Cost and Works accountancy in London. He exploits Adah financially, weaponizes religion (Jehovah's Witness), batters her, and destroys her manuscript.",
            keyTraits = "Patriarchal, lazy, violent, dogmatic, insecure, deceitful"
        ),
        NovelCharacterData(
            name = "Pa (Adah's Father)",
            role = "Adah's Father",
            description = "A railway moulder in Lagos who held great reverence for the United Kingdom. He believed Adah was his reincarnated mother ('Nne nna') and supported her early desire for education before his untimely death.",
            keyTraits = "Affectionate, superstitious, reverent of the UK"
        ),
        NovelCharacterData(
            name = "Ma (Adah's Mother)",
            role = "Adah's Mother",
            description = "A seamstress with conservative gender expectations who prioritized Boy's education and punished Adah with watered gari when Adah ran away to school.",
            keyTraits = "Traditional, short-tempered, pragmatic"
        ),
        NovelCharacterData(
            name = "Boy",
            role = "Adah's Younger Brother",
            description = "Favored by the family for formal grammar school education. He later sends Adah his savings to encourage her to leave Francis.",
            keyTraits = "Loved brother, observant, loyal"
        ),
        NovelCharacterData(
            name = "Bill",
            role = "Colleague & Literary Mentor",
            description = "A Canadian librarian at Chalk Farm Library who introduces Adah to black literature (James Baldwin) and encourages her writing of 'The Bride Price'.",
            keyTraits = "Intellectual, encouraging, non-conformist, progressive"
        ),
        NovelCharacterData(
            name = "Pa Noble & Sue",
            role = "Landlord & Landlady in Willes Road",
            description = "Pa Noble, an elderly Nigerian former liftman disabled by an accident, and Sue, his white Birmingham wife, who rent two rooms to Adah and Francis.",
            keyTraits = "Eccentric, hospitable, scarred by racial realities"
        ),
        NovelCharacterData(
            name = "Trudy",
            role = "Negligent Daily-Minder",
            description = "A registered Camden child-minder who neglects Vicky and Titi in a filthy slum backyard, leading to Vicky contracting viral meningitis.",
            keyTraits = "Deceitful, careless, manipulative"
        ),
        NovelCharacterData(
            name = "Mr. Okpara",
            role = "Igbo Compatriot in London",
            description = "An educated Igbo gentleman who encounters Adah weeping in the park and tries to counsel Francis to take up employment and respect his family.",
            keyTraits = "Dignified, patriarchal yet responsible, communal"
        )
    )

    val themes = listOf(
        NovelThemeData(
            title = "Racial Prejudice and 'Second-Class' Status",
            description = "Examines the harsh discrimination faced by African and Caribbean immigrants in post-war Britain, from housing notices reading 'Sorry, No Coloureds' to employment and institutional bias.",
            utmeSignificance = "Central theme tested in UTME Literature regarding African diaspora experiences."
        ),
        NovelThemeData(
            title = "Gender Oppression, Patriarchy & Marriage",
            description = "Exposes the dual oppression of African women under traditional customs (dowry, wife-beating, subservience) and European colonial attitudes.",
            utmeSignificance = "Key essay focus: Adah's rebellion against patriarchal subservience."
        ),
        NovelThemeData(
            title = "The Power of Education & Literacy",
            description = "Education serves as Adah's liberating force from childhood through her professional career in British libraries and her awakening as an author.",
            utmeSignificance = "Explores how intellectual drive enables socio-economic mobility."
        ),
        NovelThemeData(
            title = "Motherhood and Maternal Sacrifice",
            description = "Adah's fierce devotion to Titi, Vicky, Bubu, and Dada drives every major decision, including divorcing Francis to protect them.",
            utmeSignificance = "Highlights maternal fortitude as an engine for female autonomy."
        )
    )

    val chapters = listOf(
        NovelChapterData(
            chapterNumber = 1,
            title = "Chapter 1: Childhood",
            summary = "Adah grows up in Lagos with a deep dream of visiting the United Kingdom. Despite gender bias that favors boys for schooling, Adah runs away to attend Methodist Primary School. Ma is forced to drink gari at the police station for child neglect. Pa gives Adah a light beating and calls her 'Nne nna'. The Ibuza women celebrate the return of Lawyer Nweze in their special 'Ezidiji ji de ogoli ome oba' uniforms.",
            keyQuotes = listOf(
                "It had all begun like a dream... until it became a reality, a Presence.",
                "Going to the United Kingdom must surely be like paying God a visit. The United Kingdom, then, must be like heaven."
            ),
            fullText = """
It had all begun like a dream. You know, that sort of dream which seems to have originated from nowhere, yet one was always aware of its existence. One could feel it, one could be directed by it; unconsciously at first, until it became a reality, a Presence.

Adah did not know for sure what gave birth to her dream, when it all started, but the earliest anchor she could pin down in this drift of nothingness was when she was about eight years old. She was not even quite sure that she was exactly eight, because, you see, she was a girl who had arrived when everyone was expecting a boy. So, since she was such a disappointment to her parents, nobody thought of recording her birth.

The Ibuza women who lived in Lagos were preparing for the arrival of the town's first lawyer from the United Kingdom. The title "United Kingdom" when pronounced by Adah's father sounded so heavy, like the type of noise one associated with bombs. Going to the United Kingdom must surely be like paying God a visit.

The women wore identical cotton uniforms called 'Ezidiji ji de ogoli, ome oba' ('When a good man holds a woman, she becomes like the queen').

One afternoon, Adah decided to go to school on her own. She slipped an old slate into her dress and ran to the Methodist School round the corner where Mr Cole, their Sierra Leonean neighbor, taught. When Mr Cole saw her standing behind him, he welcomed her warmly.

At home, Pa had been called from work and Ma was at the police station charged with child neglect. The police made Ma drink a big bowl of watered gari. Pa later caned Adah lightly for Ma's benefit and called her 'Nne nna' ('Father's mother'). Adah's secret dream of traveling to the United Kingdom took deep root.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 2,
            title = "Chapter 2: Escape into Elitism",
            summary = "Pa dies suddenly in hospital. The family money is allocated solely to Boy's education, while Adah is sent to live as an unpaid domestic servant in her maternal uncle's house. Despite waking at 4:30 AM to fetch water, Adah steals two shillings to register for the Common Entrance Examination. She endures 103 strokes of the koboko cane from Cousin Vincent, wins a full scholarship to Methodist Girls' High School, and later marries Francis Obi.",
            keyQuotes = listOf(
                "She had to go to the Methodist Girls' High School or die.",
                "After a hundred and three strokes, he told Adah that he would never talk to her again... Adah was, in fact, very happy. She had earned the two shillings."
            ),
            fullText = """
Pa died suddenly in hospital, shattering Adah's fragile security. Adah was sent to live with her mother's elder brother as an unpaid servant in a crowded ten-room house on Pike Street, while Ma was inherited by Pa's brother and family funds went to Boy's schooling.

Adah's day began at 4:30 AM, hauling water in endless trips from the public pump before attending school. As she grew older, suitors offered high bride-prices, but Adah refused to become a subservient wife to old bald men.

When the Common Entrance Examination list was announced, Adah needed two shillings. Given money to purchase steak at Sand Ground market, she hid the two shillings and claimed she had lost it. Cousin Vincent bought a horse whip (koboko) and administered 103 brutal strokes to force a confession. Adah remained resolute, enduring the agony for the sake of her future.

She passed the entrance exam and won a prestigious scholarship with full board at Methodist Girls' High School. Upon graduation, needing a quiet domestic sanctuary to study for higher qualifications, she married Francis Obi, a quiet young man studying accountancy. Adah secured a lucrative position as a librarian at the American Consulate Library earning sixty pounds a month. She financed Francis's passage to the United Kingdom while remaining in Lagos to support his family and save for her own journey.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 3,
            title = "Chapter 3: A Cold Welcome",
            summary = "Adah and her two children, Titi and Vicky, arrive in Liverpool in chilly March. Expecting a glorious metropolis, Adah is shocked by the dismal greyness of London and the cramped, single half-room in Ashdown Street. Francis informs her that in England, black people are second-class citizens and demands she accept inferior living standards.",
            keyQuotes = listOf(
                "England gave Adah a cold welcome... Liverpool was grey, smoky and looked uninhabited by humans.",
                "In Lagos you may be living like an élite, but the day you land in England, you are a second-class citizen."
            ),
            fullText = """
Adah and her children sailed on the Oriel to England, arriving at Liverpool in March. The cold air struck Adah like a physical blow. The city was smoky, grey, and bleak.

Francis met them at the port, kissing Adah publicly—an act that astonished her. When they reached London, Adah was horrified by the living conditions: a narrow, cold, single half-room at Ashdown Street with no kitchen or bathroom, and a shared outdoor toilet four flights down.

The house was shared with other tenants who resented Adah's middle-class demeanor and refusal to foster out her children. When Adah protested against the squalor, Francis rebuked her sharply: 'In Lagos you may be living like an élite, but the day you land in England, you are a second-class citizen. So you can't discriminate against your own people.'

Adah realized that Francis had accepted racial subservience as an excuse for apathy, whereas she resolved never to accept second-class status.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 4,
            title = "Chapter 4: The Daily Minders",
            summary = "Adah secures a prestigious position as senior library assistant at North Finchley Library under the kind Czech chief librarian, Mrs. Konrad. However, Francis refuses to mind their children. Under pressure from neighbors who foster their children to white foster-mothers, Adah entrusts Titi and Vicky to Trudy, a negligent daily-minder in Malden Road.",
            keyQuotes = listOf(
                "Working at the North Finchley Library was more of a 'Thank you, thank you' job than anything else.",
                "In England looking after babies was in itself a full-time job... so most Nigerian children born to students were condemned to be fostered away."
            ),
            fullText = """
Adah secured employment as a senior library assistant at the North Finchley Library, working under Mrs. Konrad, a warm and eccentric Czech chief librarian. While Adah enjoyed the intellectual dignity of her workplace, domestic pressures mounted at home.

Francis refused to look after the children while studying, insisting that African children in England should be fostered out. Neighbors like the Ojos and their landlord pressured Adah to conform to the widespread practice of handing black babies over to white daily-minders.

Through Mr. Babalola and Janet, Adah found Trudy in Malden Road, a registered daily-minder. However, Adah soon noticed that two-year-old Titi stopped speaking altogether. Paying a surprise visit on her half-day, Adah caught Trudy entertaining a man in her parlor while Vicky and Titi were abandoned in a filthy, garbage-strewn backyard, with Vicky digging through bins without a nappy and Titi drinking leaking toilet water.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 5,
            title = "Chapter 5: An Expensive Lesson",
            summary = "Vicky falls critically ill with virus meningitis after being neglected in Trudy's yard. He is rushed to the Royal Free Hospital. An enraged Adah attacks Trudy with a carpet sweeper. Miss Stirling, the children's officer, intervenes and secures nursery placements for the children. Trudy is stripped of her child-minding registration.",
            keyQuotes = listOf(
                "Among her people, she could have killed Trudy... She belonged to the nation of people who had introduced 'law and order'.",
                "Second-class citizens could keep their children with them, but just look at the price they had to pay!"
            ),
            fullText = """
Vicky's condition deteriorated rapidly with a high fever. At the Royal Free Hospital, doctors diagnosed him with viral meningitis contracted through ingesting contaminated matter.

Overcome with fury, Adah returned to Trudy's residence. Seeing the woman blame Nigerian drinking water for the infection, Adah lost control, grabbed a heavy carpet sweeper, and swung it at Trudy's head. Neighbors restrained her as she threatened to kill Trudy if Vicky did not survive.

Miss Stirling, the Camden children's officer, arrived on the scene. After hearing the full story, she removed Trudy from the council's approved child-minding register and allocated proper nursery school placements for both Titi and Vicky. Vicky slowly recovered, and Adah learned that rights in England could be secured through relentless courage.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 6,
            title = "Chapter 6: 'Sorry, No Coloureds'",
            summary = "The Ashdown Street landlord serves Adah and Francis an eviction notice. House hunting in London proves agonizing due to widespread racial discrimination, with signs proclaiming 'Sorry, no coloureds'. Adah disguises her Nigerian accent over the phone to secure a flat in Hawley Street, but the landlady rejects them on the doorstep upon seeing their black skin.",
            keyQuotes = listOf(
                "Nearly all the notices had 'Sorry, no coloureds' on them.",
                "Rejection by this shrunken piece of humanity... Just because they were blacks?"
            ),
            fullText = """
The landlord at Ashdown Street issued a solicitor's letter demanding that the Obis vacate their one-room apartment within a month.

Adah searched newspaper boards and shopfronts daily for accommodations, only to find notices everywhere marked with 'Sorry, No Coloureds'. Spotting a card on Queen's Crescent with no racial restriction, Adah telephoned the landlady, squeezing her nostrils to mask her African accent and speaking like an educated Londoner. The landlady enthusiastically agreed to let two rooms for four pounds a week.

When Adah and Francis arrived at Hawley Street that evening, the landlady opened the door, gasped in horror at their black faces, and falsely stammered that the rooms had just been let. The blatant racial rejection deeply traumatized Adah, while Francis descended further into bitter cynicism.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 7,
            title = "Chapter 7: The Ghetto",
            summary = "Traces the history of post-war Nigerian migrants in Britain and introduces Pa Noble in Willes Road, Kentish Town. Pa Noble, once an aspiring law student, was ruined by failed exams, became a lift operator, suffered a severe shoulder injury in a bet, and bought a dilapidated terrace house with two rent-controlled white tenants. Adah convinces Francis to rent two rooms from the Nobles.",
            keyQuotes = listOf(
                "The dream of becoming an aristocracy became a reality of being a black, a nobody, a second-class citizen.",
                "Mr. Noble had his shoulders to show as a proof, so there must be some truth in it."
            ),
            fullText = """
This chapter explores the socio-historical reality of Nigerian civil servants and students who migrated to post-war Britain expecting elite status, only to end up in menial jobs and ghettoized housing.

Among them was Pa Noble, a retired Nigerian who came to London to study law. After exhausting his pension funds and repeatedly failing examinations, he worked as a tube station lift operator. To amuse white colleagues, he engaged in clownish behavior, ultimately attempting to lift an elevator car on his shoulder for a pint of beer. The resulting accident permanently dislocated his shoulder.

Compensated by the railway authorities, Pa Noble bought an old house on Willes Road, Kentish Town, occupied by two elderly white rent-controlled sisters who refused to vacate or pay higher rent. After psychological warfare and a bitter winter led to their deaths, the house acquired a haunted reputation. Facing homelessness, Adah persuaded Francis to inspect Pa Noble's vacant rooms, and they were accepted as tenants by Pa Noble and his white wife, Sue.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 8,
            title = "Chapter 8: Role Acceptance",
            summary = "Heavily pregnant with her third child (Bubu), Adah goes into labor during a London railway strike. Francis refuses to help, delivering sermons on the 'virtuous woman' from the Bible and Watchtower tracts. Adah walks in agony to Dr. Hudson's surgery and is rushed to the hospital in an ambulance where she gives birth to a healthy baby boy via Caesarean section.",
            keyQuotes = listOf(
                "Fancy Francis preaching to her the sermon of diligence at half past ten in the morning, when he was still in his pyjamas.",
                "The only thing I get from this slavish marriage is the children."
            ),
            fullText = """
On December 2nd, heavily pregnant with her third child, Adah woke with labor contractions. Finding Kentish Town station closed due to a railway strike, she returned home in pain.

Instead of offering comfort, Francis accused her of malingering and subjected her to prolonged sermons about Proverbs 31 and the biblical 'virtuous woman' whose price is above rubies, waving Jehovah's Witness literature while remaining in his pyjamas.

Adah wobbled to Dr. Hudson's surgery at Queen's Crescent. The doctor immediately summoned an ambulance. At the hospital, Adah underwent an emergency Caesarean section for an obstructed transverse lie. She awoke to find a robust, hungry baby boy, whom the nurses nicknamed 'Mohammed Ali' and later named Bubu.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 9,
            title = "Chapter 9: Learning the Rules",
            summary = "Adah recovers in an open hospital ward at University College Hospital. Surrounded by diverse English, Greek, and immigrant mothers, she experiences kindness and learns hospital customs. Francis visits empty-handed with no flowers, cards, or nightdress, and reveals he will spend Adah's borough holiday allowance on an accountancy course for himself. Adah realizes she must become independent.",
            keyQuotes = listOf(
                "When in University College Hospital in Gower Street, do as they do in University College Hospital in Gower Street.",
                "I hate you now, Francis, and one day I shall leave you."
            ),
            fullText = """
In the maternity ward at University College Hospital, Adah observed the warmth and dignity enjoyed by other mothers whose husbands brought flowers, cards, and beautiful nightdresses.

Because Francis brought her no clothes, the nurses asked Adah to obtain a personal nightdress instead of the hospital gown. When Francis visited, he showed no affection but eagerly demanded her holiday pay from the Finchley Borough Council to purchase an expensive postal tuition course for himself.

Adah was overcome with grief at his emotional cruelty. She warned Francis in Igbo that she would eventually leave him, vowing that her children would never grow up under his patriarchal oppression. Returning home with baby Bubu in a taxi, she resolved to protect her children above all else.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 10,
            title = "Chapter 10: Applying the Rules",
            summary = "During a harsh winter, Francis works temporarily as a postman for Christmas, constantly complaining of the cold and dogs. Mrs. Konrad sends beautiful toys for Titi, Vicky, and Bubu. Vicky's ear swells alarmingly from a bedbug bite in Pa Noble's squalid house, causing panic. Francis calls the police to summon a doctor on Christmas Day. A Chinese doctor identifies the insect bite.",
            keyQuotes = listOf(
                "In England it was silent night, holy night. In Nigeria it was noisy night, the night of fireworks and bell-ringing.",
                "How were they supposed to know that Vicky was not dying, but only bitten by a bed-bug?"
            ),
            fullText = """
Winter arrived with biting frost and deep snow in Kentish Town. Francis took a two-week seasonal job with the Post Office, terrorized by the physical exertion, steep tenement stairs, and fears of English dogs.

For Christmas, Mrs. Konrad kindly dispatched a large box of gifts: a blinking doll for Titi, a toy guitar for Vicky, and a squeaking hedgehog for Bubu.

On Christmas Day, Adah noticed Vicky's right ear swelling to alarming proportions. Fearing a recurrence of meningitis, Francis ran to the telephone kiosk and contacted the police when their regular doctor refused a home visit. Two police officers arrived with a Chinese locum doctor, who examined Vicky and discovered that the swelling was simply caused by a severe bedbug bite from Pa Noble's dilapidated mattresses.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 11,
            title = "Chapter 11: Population Control",
            summary = "Determined to stop having children so she can complete her librarianship examinations, Adah secretly attends the Family Planning Clinic and forges Francis's signature to obtain a birth control diaphragm (cap). When Francis discovers the cap, he brutally beats Adah, exposes her to the tenants as a 'harlot', and writes to their families in Nigeria. Adah discovers she is pregnant again.",
            keyQuotes = listOf(
                "She forged the signature... She was not going to allow herself to get pregnant again. Never.",
                "Francis called all the other tenants to come and see and hear about this great issue - how the innocent Adah had become so clever."
            ),
            fullText = """
Recognizing that constant childbirth would destroy her career and health, Adah sought contraceptives at the Family Planning Clinic in Prince of Wales Road. Because clinic regulations required spousal consent, Adah forged Francis's signature and was fitted with a diaphragm (cap).

Francis noticed Adah walking awkwardly and discovered the contraceptive cap hidden in the room. He flew into a violent rage, accusing her of preparing to commit adultery. He battered Adah until her mouth bled, summoned Pa Noble and the other tenants into their room to humiliate her, and sent a scathing letter to his parents in Nigeria.

Pa Noble intervened to stop the physical assault. Weeks later, Francis failed his professional accountancy examinations yet again, while Adah passed part of her Library Association exams—and discovered to her despair that she was pregnant with her fourth child.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 12,
            title = "Chapter 12: The Collapse",
            summary = "Adah takes a new job at Chalk Farm Library, where she finds supportive intellectual friends: Peggy, Mr. Barking, Fay, and Bill the Canadian. Bill introduces her to James Baldwin and black consciousness. When abortive pills from her doctor fail, Adah accepts her pregnancy. She meets Mr. Okpara, a dignified Igbo student who counsels Francis to work and support his family.",
            keyQuotes = listOf(
                "It was through Bill that Adah knew of James Baldwin. She came to believe, through reading Baldwin, that black was beautiful.",
                "A home is where you quarrel in."
            ),
            fullText = """
At Chalk Farm Library, Adah found a warm intellectual community. Her Canadian colleague Bill introduced her to the works of James Baldwin, Black consciousness, and Marxist theory, teaching her that 'Black is Beautiful'.

Faced with an unwanted pregnancy, Adah obtained pills from her Indian doctor, but they failed to terminate the pregnancy. In despair, she wept in a park near Gospel Oak, where she met Mr. Okpara, an educated Nigerian civil servant.

Mr. Okpara accompanied Adah home and confronted Francis in their room, urging him to cease his domestic indolence and provide for his family like a dignified man. Francis lashed out defensively, but Okpara's intervention demonstrated that alternative, civilized models of African manhood existed.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 13,
            title = "Chapter 13: The Ditch Pull",
            summary = "Adah gives birth to Dada (Sunshine) and spends a peaceful summer writing her first novel, 'The Bride Price', in four exercise books. Bill and library colleagues praise the manuscript as a masterpiece. When Adah proudly shows the work to Francis, he burns the manuscript in the stove out of pure spite. Adah packs her four children and leaves Francis forever. In court, Francis burns all certificates and denies paternity, but Adah embraces full custody and freedom.",
            keyQuotes = listOf(
                "'Bill called that story my brainchild. Do you hate me so much, that you could kill my child?' - 'And so you burnt it?' - 'Can't you see that I have?'",
                "'Don't worry, sir. The children are mine, and that is enough. I shall never let them down as long as I am alive.'"
            ),
            fullText = """
Adah gave birth to her fourth child, a radiant daughter named Dada, nicknamed 'Sunshine'. Taking a five-month leave, Adah relished being a mother and bought four school exercise books from Woolworth's on Queen's Crescent to write her novel, 'The Bride Price'.

Her colleagues at Chalk Farm Library, especially Bill and Peggy, read the completed manuscript and declared it a brilliant brainchild worthy of publication.

When Adah asked Francis to read it, he mocked her, claiming black women could never be authors. The following Saturday, returning from market, Adah smelled burning paper: Francis was deliberately feeding the manuscript of 'The Bride Price' into the stove.

This monstrous destruction was the final straw. Adah secured a job at the British Museum Library, gathered her four children and a box of clothes, and left Francis.

When Francis tracked her down and assaulted her with a knife, neighbor Devlin broke down the door. In the Clerkenwell magistrates' court, Francis spitefully claimed they were never married, burned their marriage and birth certificates, and disowned the children. Adah proudly accepted sole custody of her four children, walking into freedom as an independent woman and author.
            """.trimIndent()
        )
    )

    val quizQuestions = listOf(
        NovelQuizData(
            id = 1,
            question = "What was the name of the uniform worn by Ibuza women to welcome Lawyer Nweze in Chapter 1?",
            options = listOf(
                "A) Nne nna Ibuza",
                "B) Ezidiji ji de ogoli, ome oba",
                "C) Odo gbim gbim",
                "D) Ladi-Lak Elegance"
            ),
            correctIndex = 1,
            explanation = "The women wore matching cotton cloth called 'Ezidiji ji de ogoli, ome oba' meaning 'When a good man holds a woman, she becomes like the queen'."
        ),
        NovelQuizData(
            id = 2,
            question = "How many strokes of the koboko cane did Cousin Vincent give Adah for hiding two shillings for her exam fees?",
            options = listOf(
                "A) 50 strokes",
                "B) 80 strokes",
                "C) 103 strokes",
                "D) 120 strokes"
            ),
            correctIndex = 2,
            explanation = "In Chapter 2, Cousin Vincent caned Adah wildly for 103 strokes with a koboko horse whip before giving up when Adah refused to plead for mercy."
        ),
        NovelQuizData(
            id = 3,
            question = "What life-threatening illness did Vicky contract while under Trudy's negligent care?",
            options = listOf(
                "A) Tuberculosis",
                "B) Viral Meningitis",
                "C) Cholera",
                "D) Kwashiorkor"
            ),
            correctIndex = 1,
            explanation = "Vicky was diagnosed with viral meningitis at the Royal Free Hospital after playing in Trudy's filthy rubbish-strewn backyard."
        ),
        NovelQuizData(
            id = 4,
            question = "Which Canadian colleague at Chalk Farm Library introduced Adah to James Baldwin and encouraged her writing?",
            options = listOf(
                "A) Mr Barking",
                "B) Bill",
                "C) Mr Devlin",
                "D) Mr Okpara"
            ),
            correctIndex = 1,
            explanation = "Bill, an intellectual Canadian librarian, shared books by James Baldwin with Adah, emphasized that 'Black is Beautiful', and praised her manuscript."
        ),
        NovelQuizData(
            id = 5,
            question = "What was the title of Adah's first manuscript which Francis burned in the stove?",
            options = listOf(
                "A) The Joys of Motherhood",
                "B) Second-Class Citizen",
                "C) The Bride Price",
                "D) Destination Biafra"
            ),
            correctIndex = 2,
            explanation = "Adah wrote 'The Bride Price' in four exercise books from Woolworth's, which Francis burned out of spite and misogyny in Chapter 13."
        )
    )
}
