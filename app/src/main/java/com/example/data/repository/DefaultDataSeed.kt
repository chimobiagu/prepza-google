package com.example.data.repository

import com.example.data.db.*

object DefaultDataSeed {

    fun getSeedAccount(): UserAccountEntity {
        return UserAccountEntity(
            id = "user_default_1",
            name = "Chinedu Okafor",
            email = "chinedu.okafor@gmail.com",
            phoneNumber = "+2348012345678",
            authProvider = "google",
            targetScore = 340,
            jambSubjectsCsv = "English Language,Mathematics,Physics,Chemistry",
            targetInstitution = "University of Lagos (UNILAG)",
            dreamCourse = "Medicine & Surgery",
            learningStyle = "Intensive Mock Practice",
            preferredStudyTime = "Evening (7:00 PM)",
            streakDays = 14,
            totalXp = 1850,
            level = 5,
            lastActiveDateString = "2026-08-13",
            studyGoalMinutesPerDay = 45,
            isLoggedIn = true,
            jambExamDateTimestamp = System.currentTimeMillis() + (64L * 24 * 3600 * 1000L)
        )
    }

    fun getSeedProfile(): UserProfileEntity {
        return UserProfileEntity(
            id = 1,
            accountId = "user_default_1",
            name = "Chinedu Okafor",
            email = "chinedu.okafor@gmail.com",
            phoneNumber = "+2348012345678",
            authProvider = "google",
            targetScore = 340,
            jambSubjectsCsv = "English Language,Mathematics,Physics,Chemistry",
            targetInstitution = "University of Lagos (UNILAG)",
            dreamCourse = "Medicine & Surgery",
            learningStyle = "Intensive Mock Practice",
            preferredStudyTime = "Evening (7:00 PM)",
            streakDays = 14,
            totalXp = 1850,
            level = 5,
            lastActiveDateString = "2026-08-13",
            studyGoalMinutesPerDay = 45,
            jambExamDateTimestamp = System.currentTimeMillis() + (64L * 24 * 3600 * 1000L)
        )
    }

    fun getSeedFriends(): List<FriendEntity> {
        return emptyList()
    }

    fun getSeedChatMessages(): List<FriendChatMessageEntity> {
        return emptyList()
    }

    fun getSeedLiteratureBooks(): List<LiteratureBookEntity> {
        val chapter1 = """
            Chapter 1: The New Horizon
            Ummi had always been fascinated by university life. Sitting under the shade of the mango tree in her father's compound in Kano, she contemplated her journey into tertiary education. Getting admission into the university was not just a personal achievement for Ummi; it was a testament to her parents' sacrifices and her own tireless devotion to study.
            
            When the news of her admission broke, the household erupted in joy. Her mother wept tears of gratitude, while her father handed her an envelope containing her registration fees and words of eternal wisdom.
            
            "Education is the true life changer," her father told her, gazing solemnly into her eyes. "It gives you the wings to fly, but your character will determine how high you soar."
        """.trimIndent()

        val chapter2 = """
            Chapter 2: Registration & Realities
            Navigating the bustling campus on her first morning was overwhelming. Thousands of freshmen milled around the administrative complex, each carrying thick brown envelopes containing credentials, passports, and high hopes.
            
            Ummi met Salma, a sharp-tongued sophomore who seemed to know every shortcut on campus. Salma offered to help her skip the long queues, but at a price.
            
            "In this university, nobody gets anything for free," Salma whispered confidentially. Ummi remembered her father's warning about integrity and politely declined, choosing to wait in line like everyone else. It took six painstaking hours, but when her registration slip was stamped, her conscience was clean.
        """.trimIndent()

        val chaptersJson = """
            [
              {"title": "Chapter 1: The New Horizon", "content": "$chapter1"},
              {"title": "Chapter 2: Registration & Realities", "content": "$chapter2"}
            ]
        """.trimIndent()

        return listOf(
            LiteratureBookEntity(
                id = "book_1",
                title = "The Life Changer",
                author = "Khadijat Abubakar Jalli",
                description = "Official UTME Literature Novel. Follow Ummi's inspiring journey through university life, exploring themes of honesty, peer pressure, and academic resilience.",
                category = "UTME Mandatory Prose",
                chaptersJson = chaptersJson,
                readingProgressPercent = 45,
                lastReadChapterIndex = 0
            ),
            LiteratureBookEntity(
                id = "book_second_class_citizen",
                title = "Second-Class Citizen",
                author = "Buchi Emecheta",
                description = "Prescribed UTME African Prose. The poignant story of Adah Ofili navigating childhood in Lagos, migration to the UK, racial prejudice, marital abuse, and her triumphant emergence as an author.",
                category = "UTME African Prose",
                chaptersJson = """
                    [
                      {"title": "Chapter 1: Childhood", "content": "Adah grows up in Lagos with a deep dream of visiting the United Kingdom. Despite gender bias that favors boys for schooling, Adah runs away to attend Methodist Primary School. Ma is forced to drink gari at the police station for child neglect. Pa gives Adah a light beating and calls her 'Nne nna'. The Ibuza women celebrate the return of Lawyer Nweze in their special 'Ezidiji ji de ogoli ome oba' uniforms."},
                      {"title": "Chapter 2: Escape into Elitism", "content": "Pa dies suddenly in hospital. The family money is allocated solely to Boy's education, while Adah is sent to live as an unpaid domestic servant in her maternal uncle's house. Despite waking at 4:30 AM to fetch water, Adah steals two shillings to register for the Common Entrance Examination. She endures 103 strokes of the koboko cane from Cousin Vincent, wins a full scholarship to Methodist Girls' High School, and later marries Francis Obi."},
                      {"title": "Chapter 3: A Cold Welcome", "content": "Adah and her two children, Titi and Vicky, arrive in Liverpool in chilly March. Expecting a glorious metropolis, Adah is shocked by the dismal greyness of London and the cramped, single half-room in Ashdown Street. Francis informs her that in England, black people are second-class citizens and demands she accept inferior living standards."},
                      {"title": "Chapter 4: The Daily Minders", "content": "Adah secures a prestigious position as senior library assistant at North Finchley Library under the kind Czech chief librarian, Mrs. Konrad. However, Francis refuses to mind their children. Under pressure from neighbors who foster their children to white foster-mothers, Adah entrusts Titi and Vicky to Trudy, a negligent daily-minder in Malden Road."},
                      {"title": "Chapter 5: An Expensive Lesson", "content": "Vicky falls critically ill with virus meningitis after being neglected in Trudy's yard. He is rushed to the Royal Free Hospital. An enraged Adah attacks Trudy with a carpet sweeper. Miss Stirling, the children's officer, intervenes and secures nursery placements for the children. Trudy is stripped of her child-minding registration."},
                      {"title": "Chapter 6: 'Sorry, No Coloureds'", "content": "The Ashdown Street landlord serves Adah and Francis an eviction notice. House hunting in London proves agonizing due to widespread racial discrimination, with signs proclaiming 'Sorry, no coloureds'. Adah disguises her Nigerian accent over the phone to secure a flat in Hawley Street, but the landlady rejects them on the doorstep upon seeing their black skin."},
                      {"title": "Chapter 7: The Ghetto", "content": "Traces the history of post-war Nigerian migrants in Britain and introduces Pa Noble in Willes Road, Kentish Town. Pa Noble, once an aspiring law student, was ruined by failed exams, became a lift operator, suffered a severe shoulder injury in a bet, and bought a dilapidated terrace house with two rent-controlled white tenants. Adah convinces Francis to rent two rooms from the Nobles."},
                      {"title": "Chapter 8: Role Acceptance", "content": "Heavily pregnant with her third child (Bubu), Adah goes into labor during a London railway strike. Francis refuses to help, delivering sermons on the 'virtuous woman' from the Bible and Watchtower tracts. Adah walks in agony to Dr. Hudson's surgery and is rushed to the hospital in an ambulance where she gives birth to a healthy baby boy via Caesarean section."},
                      {"title": "Chapter 9: Learning the Rules", "content": "Adah recovers in an open hospital ward at University College Hospital. Surrounded by diverse English, Greek, and immigrant mothers, she experiences kindness and learns hospital customs. Francis visits empty-handed with no flowers, cards, or nightdress, and reveals he will spend Adah's borough holiday allowance on an accountancy course for himself. Adah realizes she must become independent."},
                      {"title": "Chapter 10: Applying the Rules", "content": "During a harsh winter, Francis works temporarily as a postman for Christmas, constantly complaining of the cold and dogs. Mrs. Konrad sends beautiful toys for Titi, Vicky, and Bubu. Vicky's ear swells alarmingly from a bedbug bite in Pa Noble's squalid house, causing panic. Francis calls the police to summon a doctor on Christmas Day. A Chinese doctor identifies the insect bite."},
                      {"title": "Chapter 11: Population Control", "content": "Determined to stop having children so she can complete her librarianship examinations, Adah secretly attends the Family Planning Clinic and forges Francis's signature to obtain a birth control diaphragm (cap). When Francis discovers the cap, he brutally beats Adah, exposes her to the tenants as a 'harlot', and writes to their families in Nigeria. Adah discovers she is pregnant again."},
                      {"title": "Chapter 12: The Collapse", "content": "Adah takes a new job at Chalk Farm Library, where she finds supportive intellectual friends: Peggy, Mr. Barking, Fay, and Bill the Canadian. Bill introduces her to James Baldwin and black consciousness. When abortive pills from her doctor fail, Adah accepts her pregnancy. She meets Mr. Okpara, a dignified Igbo student who counsels Francis to work and support his family."},
                      {"title": "Chapter 13: The Ditch Pull", "content": "Adah gives birth to Dada (Sunshine) and spends a peaceful summer writing her first novel, 'The Bride Price', in four exercise books. Bill and library colleagues praise the manuscript as a masterpiece. When Adah proudly shows the work to Francis, he burns the manuscript in the stove out of pure spite. Adah packs her four children and leaves Francis forever. In court, Francis burns all certificates and denies paternity, but Adah embraces full custody and freedom."}
                    ]
                """.trimIndent(),
                readingProgressPercent = 30,
                lastReadChapterIndex = 0
            ),
            LiteratureBookEntity(
                id = "book_wuthering_heights",
                title = "Wuthering Heights",
                author = "Emily Brontë",
                description = "Prescribed UTME Non-African Prose. The timeless Gothic tragedy of passionate love, revenge, and redemption between Heathcliff and Catherine Earnshaw on the Yorkshire moors.",
                category = "UTME Non-African Prose",
                chaptersJson = """
                    [
                      {"title": "Chapters I - III: Lockwood at Wuthering Heights", "content": "Mr. Lockwood visits his surly landlord, Heathcliff, at Wuthering Heights in 1801. Trapped by a fierce snowstorm on a return visit, Lockwood sleeps in the oak-panelled bed where he discovers Catherine Earnshaw's old diaries and experiences a terrifying nightmare of her ghost sobbing at the window: 'Let me in! I'm come home: I'd lost my way on the moor!'. Heathcliff reacts with uncontrollable weeping."},
                      {"title": "Chapters IV - IX: Childhood, Degradation & Catherine's Fatal Choice", "content": "Nelly Dean narrates the history: Old Mr. Earnshaw brings the orphaned Heathcliff to Wuthering Heights from Liverpool. After Earnshaw dies, Hindley degrades Heathcliff to a common laborer. Catherine and Heathcliff grow wild on the moors until Catherine stays at Thrushcross Grange with the Lintons. Catherine confesses to Nelly that she loves Heathcliff ('I am Heathcliff!'), but must marry Edgar for social standing. Heathcliff overhears that marrying him would 'degrade' her and runs away into the stormy night."},
                      {"title": "Chapters X - XVI: Heathcliff's Return, Isabella's Ruin & Catherine's Death", "content": "Three years later, Catherine is happily married to Edgar at Thrushcross Grange when Heathcliff returns transformed into a wealthy, polished gentleman. Heathcliff resumes contact, creating bitter discord. Isabella Linton falls in love with Heathcliff; Heathcliff marries and abuses her as revenge against Edgar. Catherine falls critically ill from nervous delirium. Heathcliff secretly visits her for a passionate, agonized farewell before Catherine dies giving birth to young Cathy."},
                      {"title": "Chapters XVII - XXVIII: The Usurpation & Young Cathy's Imprisonment", "content": "Isabella escapes Heathcliff's brutality at Wuthering Heights and flees to London, giving birth to Linton. Hindley dies in debt, leaving Heathcliff master of Wuthering Heights and legal guardian of an illiterate Hareton. Twelve years later, Isabella dies; Heathcliff takes Linton and forces a marriage between Linton and young Cathy to claim Thrushcross Grange upon Edgar's death."},
                      {"title": "Chapters XXIX - XXXIV: Heathcliff's Vision, Hareton's Redemption & Peace", "content": "Heathcliff reveals he opened Catherine's grave and dreams of dissolving with her in the earth. At Wuthering Heights, Cathy overcomes initial scorn and teaches Hareton to read, blossoming into mutual love. Heathcliff finds his desire for revenge evaporating as Hareton and Cathy's eyes constantly remind him of Catherine. Heathcliff ceases eating, communes with Catherine's spirit, and dies with a triumphant smile. Cathy and Hareton plan their marriage, and the moors are finally at peace."}
                    ]
                """.trimIndent(),
                readingProgressPercent = 25,
                lastReadChapterIndex = 0
            ),
            LiteratureBookEntity(
                id = "book_look_back_in_anger",
                title = "Look Back in Anger",
                author = "John Osborne",
                description = "Prescribed UTME Non-African Drama. John Osborne's revolutionary 1956 play capturing the disillusionment and rage of the post-war 'Angry Young Man' Jimmy Porter against the British establishment.",
                category = "UTME Non-African Drama",
                chaptersJson = """
                    [
                      {"title": "Act I: A Sunday in the Midlands", "content": "Jimmy and Cliff lounge in armchairs reading newspapers while Alison irons. Jimmy launches blistering diatribes against the Establishment, bishops, the Church of England, and Alison's aristocratic family. During horseplay with Cliff, Jimmy knocks into the ironing board, burning Alison's arm. Alison confides in Cliff that she is pregnant but terrified to tell Jimmy. Helena Charles phones to announce she is arriving to stay."},
                      {"title": "Act II, Scene 1: Two Weeks Later", "content": "Alison explains to Helena how she first fell in love with Jimmy ('a knight in shining armour') and describes their private 'bears and squirrels' game. Jimmy enters and attacks Helena's religious hypocrisy when she invites Alison to church. Jimmy recounts the traumatic childhood experience of watching his father die slowly for twelve months after the Spanish Civil War. A telegram arrives announcing Mrs. Tanner (Hugh's mother) has suffered a stroke in London. Jimmy begs Alison to accompany him, but she chooses to leave for church with Helena."},
                      {"title": "Act II, Scene 2: The Following Evening", "content": "Colonel Redfern visits the flat to take Alison home. He reflects nostalgically on his thirty years in colonial India before 1947 ('the Edwardian Wilderness') and admits that both he and his wife were partly to blame for alienating Jimmy. Alison leaves a farewell letter for Jimmy. When Jimmy returns from London exhausted after Mrs. Tanner's funeral, Helena hands him the note and reveals Alison is pregnant. Jimmy scorns the news. Helena slaps him across the face, but their confrontation suddenly turns into a passionate embrace."},
                      {"title": "Act III, Scene 1: Several Months Later", "content": "The domestic cycle repeats with Helena in Alison's place. Cliff announces he is leaving the flat to start a life of his own. Jimmy and Cliff perform a comedic music-hall vaudeville routine. Suddenly, a pale, ill, and rain-soaked Alison appears in the doorway in a raincoat."},
                      {"title": "Act III, Scene 2: The Return & Reconciliation", "content": "Alison tells Helena she suffered a miscarriage and lost the baby. Helena's religious guilt returns; she realizes she cannot live in sin with Jimmy and decides to leave immediately. Alison, broken and stripped of her pride, grovels at Jimmy's feet, weeping that she is now in the mud and understands true suffering. Jimmy is moved, and they retreat into their fantasy world of 'bears and squirrels'."}
                    ]
                """.trimIndent(),
                readingProgressPercent = 20,
                lastReadChapterIndex = 0
            ),
            LiteratureBookEntity(
                id = "book_lion_jewel",
                title = "The Lion and the Jewel",
                author = "Wole Soyinka",
                description = "Prescribed UTME African Drama. Classic satirical comedy pitting traditional African wisdom and virility (Baroka the Bale) against modern Western mimicry (Lakunle the schoolteacher) for the hand of Sidi, the village belle.",
                category = "UTME African Drama",
                chaptersJson = """
                    [
                      {"title": "Part I: Morning (The Village Square)", "content": "Lakunle scolds Sidi for carrying water on her head and exposing her shoulders. Sidi insists she will marry him only if he pays the customary bride-price. Village girls rush in with a magazine containing glossy photos of Sidi, making her more famous than Baroka. The villagers perform the 'Dance of the Lost Traveller' with Lakunle playing the photographer. Baroka joins the dance."},
                      {"title": "Part II: Noon (The Market Road & Palace)", "content": "Sadiku brings Baroka's proposal to take Sidi as his newest wife. Sidi scathingly rejects the offer, comparing her youthful beauty to Baroka's aged, spent face. Lakunle narrates how Baroka foiled the colonial railway project by bribing the surveyor with money, hens, and a goat. In his bedroom, Baroka tricks Sadiku into believing that his virility ended a week ago."},
                      {"title": "Part III: Night (The Triumph & Wedding)", "content": "Sadiku performs a gloating victory dance, celebrating women's triumph over the 'scotched' Lion. Sidi goes to the palace to mock Baroka. Baroka engages her in conversation, reveals his secret machine to print postage stamps with Sidi's face, and seduces her. Sidi returns having lost her virginity, rejects Lakunle's offer to wed without bride-price, and celebrates her wedding to Baroka."}
                    ]
                """.trimIndent(),
                readingProgressPercent = 15,
                lastReadChapterIndex = 0
            ),
            LiteratureBookEntity(
                id = "book_she_walks_in_beauty",
                title = "She Walks in Beauty",
                author = "Lord Byron (George Gordon)",
                description = "Selected UTME Poem. Complete text, background summary, stanza-by-stanza breakdown, comprehensive poetic devices, central themes, and UTME practice questions.",
                category = "Selected UTME Poems",
                chaptersJson = """
                    [
                      {"title": "Full Poem & Stanzas", "content": "Stanza 1:\nShe walks in beauty, like the night\nOf cloudless climes and starry skies;\nAnd all that’s best of dark and bright\nMeet in her aspect and her eyes;\nThus mellowed to that tender light\nWhich heaven to gaudy day denies.\n\nStanza 2:\nOne shade the more, one ray the less,\nHad half impaired the nameless grace\nWhich waves in every raven tress,\nOr softly lightens o’er her face;\nWhere thoughts serenely sweet express,\nHow pure, how dear their dwelling-place.\n\nStanza 3:\nAnd on that cheek, and o’er that brow,\nSo soft, so calm, yet eloquent,\nThe smiles that win, the tints that glow,\nBut tell of days in goodness spent,\nA mind at peace with all below,\nA heart whose love is innocent!"},
                      {"title": "Background & Context", "content": "Poet: George Gordon Byron, 6th Baron Byron (1788–1824), leading Romantic poet.\n\nHistorical Context: Written in June 1814 after Lord Byron attended an evening party in London. He was struck by his cousin-by-marriage, Mrs. Anne Beatrix Wilmot, who appeared in a mourning gown made of black fabric with glittering silver spangles. Struck by the sublime contrast between the dark gown, her fair skin, and dark hair, Byron returned home and penned this masterpiece.\n\nPublication: Published in 1815 in 'Hebrew Melodies', set to traditional Jewish melodies arranged by Isaac Nathan.\n\nSignificance in JAMB UTME: Prescribed non-African poem testing figures of speech, rhyme scheme, Romanticism, and themes of harmony and moral purity."},
                      {"title": "Poetic Devices & Figures of Speech", "content": "1. Simile: 'She walks in beauty, like the night / Of cloudless climes and starry skies' (Lines 1–2). Compares her graceful aura to a clear, starry night.\n2. Antithesis / Contrast: 'dark and bright' (Line 3), 'One shade the more, one ray the less' (Line 7), comparing 'tender light' against 'gaudy day' (Lines 5–6).\n3. Alliteration: 'cloudless climes', 'starry skies', 'serenely sweet', 'days in goodness'.\n4. Metaphor & Imagery: 'raven tress' (glossy black hair), thoughts having a 'dwelling-place' (mind/temple of purity).\n5. Personification: 'Which heaven to gaudy day denies', 'smiles that win', 'tints that glow', thoughts that 'express'.\n6. Synecdoche: 'cheek', 'brow', 'smiles', 'heart' representing the whole woman.\n7. Rhyme Scheme: Regular ABABAB in every six-line stanza (sestet).\n8. Meter: Iambic Tetrameter (4 iambic feet / 8 syllables per line with unstressed/stressed cadence).\n9. Enjambment: Unbroken run-on lines in stanzas 1 and 2 creating fluid rhythmic movement."},
                      {"title": "Stanza-by-Stanza Analysis", "content": "• Stanza 1 (Cosmic Harmony): Introduces the lady's ethereal beauty by blending light and dark into a soothing, tender light that surpasses harsh daytime ('gaudy day').\n• Stanza 2 (Flawless Equilibrium & Pure Mind): Emphasizes that even the slightest alteration ('one shade the more, one ray the less') would ruin her nameless grace. Her black curls ('raven tress') frame a face whose serenity reveals an unblemished, pure mind.\n• Stanza 3 (Moral Beauty & Innocent Heart): Connects her radiant physical expressions (soft cheeks, calm brow, glowing smiles) to a life lived in goodness, a mind at peace, and a heart overflowing with innocent love."},
                      {"title": "Themes & Tone", "content": "• Themes:\n1. Harmony of Opposites (Darkness and Light in perfect balance)\n2. Physical Beauty as a Reflection of Inner Moral Purity\n3. Chaste and Innocent Love\n4. Serenity, Peace, and Tranquility\n\n• Tone: Reverent, admiring, awestruck, respectful, contemplative\n• Mood: Serene, tranquil, romantic, soothing"}
                    ]
                """.trimIndent(),
                readingProgressPercent = 80,
                lastReadChapterIndex = 0
            ),
            LiteratureBookEntity(
                id = "book_2",
                title = "Selected UTME Poems",
                author = "Various African & Non-African Poets",
                description = "Comprehensive guide and stanza-by-stanza analysis of the official prescribed poems for JAMB UTME Literature in English including African and Non-African selections.",
                category = "UTME Poetry Compendium",
                chaptersJson = """
                    [
                      {"title": "She Walks in Beauty - Lord Byron", "content": "Analysis of Lord Byron's Romantic masterpiece on harmony of dark and bright, inner virtue, and ABABAB iambic tetrameter."},
                      {"title": "The Leader and the Led - Niyi Osundare", "content": "Analysis of leadership styles in Africa portrayed through animal imagery: the lion's ferocity, the hyena's toughness, the elephant's weight, and the antelope's caution."},
                      {"title": "The Grieved Lands - Agostinho Neto", "content": "Poetic reflection on African struggles, resilience, imperialist oppression, and enduring hope during colonial subjugation."},
                      {"title": "Piano and Drums - Gabriel Okara", "content": "Exploration of cultural conflict between raw, primal African heritage (the drums) and complex, alien Western civilization (the piano)."},
                      {"title": "Song of the Women of My Land - Oumar Farouk Sesay", "content": "Tribute to the resilience, forgotten songs, and historic struggles of African women across generations."}
                    ]
                """.trimIndent(),
                readingProgressPercent = 35,
                lastReadChapterIndex = 0
            ),
            LiteratureBookEntity(
                id = "book_sweet_sixteen",
                title = "Sweet Sixteen",
                author = "Bolaji Abdullahi",
                description = "Aliya's journey into young adulthood, exploring self-identity, friendship, puberty, and moral choices through conversations with her father.",
                category = "UTME Compulsory Prose",
                chaptersJson = """
                    [
                      {"title": "Chapter 1: The Letter", "content": "On her sixteenth birthday, Aliya receives a 16-page letter from her father, addressing topics from body changes to emotional maturity."},
                      {"title": "Chapter 2: The Drive", "content": "Father and daughter discuss the significance of self-esteem and peer influence during their weekend drive."},
                      {"title": "Chapter 3: Work & Responsibility", "content": "Aliya learns the value of discipline, integrity, and focus amidst distractions of youth."}
                    ]
                """.trimIndent(),
                readingProgressPercent = 20,
                lastReadChapterIndex = 0
            )
        )
    }

    fun getSeedQuestions(): List<QuestionEntity> {
        return QuestionBankGenerator.getAllSeedQuestions()
    }

    fun getSeedOfflinePacks(): List<OfflinePackEntity> {
        return listOf(
            OfflinePackEntity(
                subject = "Use of English",
                totalQuestions = 2241,
                sizeMb = 4.8f,
                yearsAvailable = "2010 - 2024 (15 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Mathematics",
                totalQuestions = 1207,
                sizeMb = 3.2f,
                yearsAvailable = "2012 - 2024 (13 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Biology",
                totalQuestions = 1207,
                sizeMb = 3.4f,
                yearsAvailable = "2012 - 2024 (13 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Chemistry",
                totalQuestions = 1207,
                sizeMb = 3.1f,
                yearsAvailable = "2012 - 2024 (13 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Physics",
                totalQuestions = 1224,
                sizeMb = 3.3f,
                yearsAvailable = "2012 - 2024 (13 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Economics",
                totalQuestions = 1150,
                sizeMb = 2.8f,
                yearsAvailable = "2014 - 2024 (11 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Government",
                totalQuestions = 1200,
                sizeMb = 2.9f,
                yearsAvailable = "2014 - 2024 (11 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Literature in English",
                totalQuestions = 890,
                sizeMb = 2.5f,
                yearsAvailable = "2015 - 2024 (10 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Commerce",
                totalQuestions = 980,
                sizeMb = 2.4f,
                yearsAvailable = "2015 - 2024 (10 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "CRS",
                totalQuestions = 920,
                sizeMb = 2.2f,
                yearsAvailable = "2015 - 2024 (10 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Principles of Accounts",
                totalQuestions = 750,
                sizeMb = 2.1f,
                yearsAvailable = "2016 - 2024 (9 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Geography",
                totalQuestions = 810,
                sizeMb = 2.3f,
                yearsAvailable = "2015 - 2024 (10 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "History",
                totalQuestions = 650,
                sizeMb = 1.9f,
                yearsAvailable = "2012 - 2024 (13 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            ),
            OfflinePackEntity(
                subject = "Islamic Religious Studies (IRS)",
                totalQuestions = 720,
                sizeMb = 2.0f,
                yearsAvailable = "2011 - 2024 (14 Years)",
                isDownloaded = true,
                downloadProgressPercent = 100
            )
        )
    }

    fun getSeedMistakes(): List<MistakeEntity> {
        val now = System.currentTimeMillis()
        return listOf(
            MistakeEntity(
                questionId = "bio_1",
                userId = "user_default_1",
                subject = "Biology",
                topic = "Cell Biology",
                selectedWrongOptionIndex = 1, // Option B
                timestamp = now - 3600 * 1000 * 2,
                attemptCount = 2,
                isMastered = false,
                userNotes = "Remember: Mitochondria produces ATP via cellular respiration, ribosomes do protein synthesis."
            ),
            MistakeEntity(
                questionId = "phy_1",
                userId = "user_default_1",
                subject = "Physics",
                topic = "Mechanics & Motion",
                selectedWrongOptionIndex = 0,
                timestamp = now - 3600 * 1000 * 5,
                attemptCount = 1,
                isMastered = false,
                userNotes = "v² = u² + 2as. Watch out for negative acceleration during deceleration!"
            ),
            MistakeEntity(
                questionId = "chem_1",
                userId = "user_default_1",
                subject = "Chemistry",
                topic = "Stoichiometry & Gas Laws",
                selectedWrongOptionIndex = 2,
                timestamp = now - 3600 * 1000 * 24,
                attemptCount = 1,
                isMastered = false,
                userNotes = "At STP, 1 mole of any gas occupies exactly 22.4 dm³ (or 22,400 cm³)."
            )
        )
    }

    fun getSeedStudyTasks(): List<StudyTaskEntity> {
        return listOf(
            StudyTaskEntity(
                subject = "Biology",
                topic = "Cell Biology & Ecology",
                targetQuestions = 20,
                completedQuestions = 14,
                targetMinutes = 25,
                dateString = "2026-08-13",
                isDone = false
            ),
            StudyTaskEntity(
                subject = "Mathematics",
                topic = "Permutations & Quadratic Equations",
                targetQuestions = 15,
                completedQuestions = 15,
                targetMinutes = 20,
                dateString = "2026-08-13",
                isDone = true
            ),
            StudyTaskEntity(
                subject = "English Language",
                topic = "Lexis, Structure & Oral English",
                targetQuestions = 20,
                completedQuestions = 0,
                targetMinutes = 20,
                dateString = "2026-08-13",
                isDone = false
            )
        )
    }
}
