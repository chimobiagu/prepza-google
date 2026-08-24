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
                author = "Khadija Abubakar Jalli",
                description = "Official UTME Literature Novel. Follow Ummi's inspiring journey through university life, exploring themes of honesty, peer pressure, and academic resilience.",
                category = "UTME Mandatory Prose",
                chaptersJson = chaptersJson,
                readingProgressPercent = 45,
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
                category = "UTME Prose",
                chaptersJson = """
                    [
                      {"title": "Chapter 1: The Letter", "content": "On her sixteenth birthday, Aliya receives a 16-page letter from her father, addressing topics from body changes to emotional maturity."},
                      {"title": "Chapter 2: The Drive", "content": "Father and daughter discuss the significance of self-esteem and peer influence during their weekend drive."}
                    ]
                """.trimIndent(),
                readingProgressPercent = 20,
                lastReadChapterIndex = 0
            ),
            LiteratureBookEntity(
                id = "book_lion_jewel",
                title = "The Lion and the Jewel",
                author = "Wole Soyinka",
                description = "Classic UTME drama pitting traditional African culture represented by Baroka the Bale against modern Western arrogance represented by Lakunle.",
                category = "UTME Drama",
                chaptersJson = """
                    [
                      {"title": "Morning: The Village Square", "content": "Lakunle, the school teacher, attempts to modernize Sidi, the village belle, by refusing to pay the customary bride price."},
                      {"title": "Noon: The Palace", "content": "Baroka plots to win Sidi through cunning and psychological mastery."},
                      {"title": "Night: The Triumph", "content": "Sidi discovers the strength of tradition and marries the Bale, celebrating communal joy."}
                    ]
                """.trimIndent(),
                readingProgressPercent = 10,
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
