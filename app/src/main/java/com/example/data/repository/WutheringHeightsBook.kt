package com.example.data.repository

object WutheringHeightsBook {
    val title = "Wuthering Heights"
    val author = "Emily Brontë"
    val genre = "Gothic Novel / 19th Century English Prose"
    val publicationYear = "1847"
    val setting = "The Yorkshire Moors, England (Wuthering Heights and Thrushcross Grange)"
    val synopsis = """
        A monumental Victorian Gothic masterpiece tracing the tumultuous, destructive passion between Heathcliff, a mysterious foundling brought to Wuthering Heights, and Catherine Earnshaw. When social ambitions lead Catherine to marry the refined Edgar Linton of Thrushcross Grange, Heathcliff embarks on a ruthless, multi-generational campaign of revenge against both the Earnshaw and Linton families, culminating in an extraordinary exploration of love, haunting, class conflict, and eventual redemption.
    """.trimIndent()

    val characters = listOf(
        NovelCharacterData(
            name = "Heathcliff",
            role = "Protagonist / Anti-Hero",
            description = "An orphaned child brought from Liverpool by Mr. Earnshaw. Tormented by Hindley, his transcendent, demonic love for Catherine turns into a lifelong vendetta against his oppressors after Catherine marries Edgar Linton.",
            keyTraits = "Fierce, vengeful, passionate, brooding, relentless, haunted"
        ),
        NovelCharacterData(
            name = "Catherine Earnshaw (Linton)",
            role = "Heroine",
            description = "Daughter of Mr. Earnshaw. Wild, capricious, and deeply connected to nature and Heathcliff ('Whatever our souls are made of, his and mine are the same'). Her choice of Edgar Linton over Heathcliff causes tragic psychic splintering and premature death.",
            keyTraits = "Passionate, headstrong, volatile, torn between nature and society"
        ),
        NovelCharacterData(
            name = "Edgar Linton",
            role = "Master of Thrushcross Grange",
            description = "A gentle, aristocratic, and cultured gentleman who loves Catherine tenderly but lacks the elemental intensity needed to counter Heathcliff's presence.",
            keyTraits = "Refined, patient, civilized, devoted father, physically delicate"
        ),
        NovelCharacterData(
            name = "Ellen (Nelly) Dean",
            role = "Primary Narrator & Housekeeper",
            description = "The sensible, observant, and practical servant who raised Catherine, Hindley, Cathy, and Hareton, serving as the crucial narrative voice connecting all events.",
            keyTraits = "Pragmatic, observant, moralizing, loyal, opinionated"
        ),
        NovelCharacterData(
            name = "Mr. Lockwood",
            role = "Framing Narrator & Tenant",
            description = "A gentleman tenant who leases Thrushcross Grange in 1801, encounters the uncanny ghosts and hostility at Wuthering Heights, and listens to Nelly's tale.",
            keyTraits = "Sophisticated, vain, detached city dweller, inquisitive"
        ),
        NovelCharacterData(
            name = "Hindley Earnshaw",
            role = "Catherine's Brother",
            description = "Jealous of his father's affection for Heathcliff, Hindley degrades Heathcliff to a servant. After his wife Frances dies, Hindley descends into alcoholism and gambles away Wuthering Heights to Heathcliff.",
            keyTraits = "Tyrannical, jealous, self-destructive, bitter"
        ),
        NovelCharacterData(
            name = "Isabella Linton (Heathcliff)",
            role = "Edgar's Sister",
            description = "A naive, sheltered girl who elopes with Heathcliff under a romantic delusion, only to suffer brutal psychological abuse before fleeing to London to bear Linton.",
            keyTraits = "Infatuated, fragile, vindictive upon betrayal, courageous in escape"
        ),
        NovelCharacterData(
            name = "Cathy Linton (Heathcliff / Earnshaw)",
            role = "Second-Generation Heroine",
            description = "Catherine and Edgar's spirited daughter. Inherits her mother's dark eyes and beauty with her father's gentleness. Overcomes forced captivity and marries Hareton in love.",
            keyTraits = "Spirited, compassionate, proud, intellectually eager"
        ),
        NovelCharacterData(
            name = "Hareton Earnshaw",
            role = "Second-Generation Hero",
            description = "Hindley's son, degraded and left illiterate by Heathcliff as revenge against Hindley. Despite his rough exterior, he possesses inherent nobility and achieves redemption through Cathy's love and reading lessons.",
            keyTraits = "Rugged, loyal, resilient, humble, affectionate"
        ),
        NovelCharacterData(
            name = "Linton Heathcliff",
            role = "Pawn of Revenge",
            description = "Sickly, selfish son of Heathcliff and Isabella, forced into marrying young Cathy so Heathcliff can legally claim Thrushcross Grange.",
            keyTraits = "Peevish, fragile, manipulative, terrified of his father"
        ),
        NovelCharacterData(
            name = "Joseph",
            role = "Old Servant at Wuthering Heights",
            description = "A hypocritical, narrow-minded religious Pharisee who constantly quotes scripture and curses the household in broad Yorkshire dialect.",
            keyTraits = "Self-righteous, harsh, sanctimonious, superstitious"
        )
    )

    val themes = listOf(
        NovelThemeData(
            title = "Destructive Passion vs. Social Convention",
            description = "The unyielding, elemental love between Heathcliff and Catherine transcends conventional morality and earthly existence, clashing with the polite, class-bound world of Thrushcross Grange.",
            utmeSignificance = "Central theme analyzing Romantic individualism and tragic conflict in 19th-century prose."
        ),
        NovelThemeData(
            title = "Revenge, Retribution and Multi-Generational Trauma",
            description = "Heathcliff's systemic plan to dispossess the Earnshaw and Linton lineages illustrates how abuse cycles through generations until redeemed by forgiveness.",
            utmeSignificance = "Key syllabus focus regarding gothic revenge tragedy and dramatic resolution."
        ),
        NovelThemeData(
            title = "Nature (Wuthering Heights) vs. Culture (Thrushcross Grange)",
            description = "The stark contrast between the stormy, untamed heights and the sheltered, civilized valley mirrors the duality of human passion and social order.",
            utmeSignificance = "Crucial setting-as-character analysis in UTME Literature."
        ),
        NovelThemeData(
            title = "Redemption through Literacy and Love",
            description = "The final union between Cathy and Hareton, catalyzed by teaching him to read, reverses Heathcliff and Hindley's legacy of degradation.",
            utmeSignificance = "Key analysis of the novel's hopeful, restorative conclusion."
        )
    )

    val chapters = listOf(
        NovelChapterData(
            chapterNumber = 1,
            title = "Chapters I - III: Lockwood at Wuthering Heights",
            summary = "Mr. Lockwood visits his surly landlord, Heathcliff, at Wuthering Heights in 1801. Trapped by a fierce snowstorm on a return visit, Lockwood sleeps in the oak-panelled bed where he discovers Catherine Earnshaw's old diaries and experiences a terrifying nightmare of her ghost sobbing at the window: 'Let me in! I'm come home: I'd lost my way on the moor!'. Heathcliff reacts with uncontrollable weeping.",
            keyQuotes = listOf(
                "Wuthering Heights is the name of Mr. Heathcliff's dwelling. 'Wuthering' being a significant provincial adjective, descriptive of the atmospheric tumult to which its station is exposed in stormy weather.",
                "My fingers closed on the fingers of a little, ice-cold hand! A most melancholy voice sobbed, 'Let me in—let me in! ... Catherine Linton... I've been a waif for twenty years!'",
                "He got on to the bed, and wrenched open the lattice, bursting into an uncontrollable passion of tears: 'Come in! come in! Cathy, do come!'"
            ),
            fullText = """
1801: Mr. Lockwood, the new tenant of Thrushcross Grange, visits his solitary landlord, Mr. Heathcliff, at Wuthering Heights. He finds a bleak stone fortress, surrounded by snarling dogs and uncommunicative inmates: the fierce Heathcliff, a morose youth named Hareton Earnshaw, a sharp-tongued young lady (Mrs. Heathcliff / Cathy), and the sour servant Joseph.

During a second visit, a sudden snowstorm traps Lockwood at the Heights. Housekeeper Zillah lodges him in a forbidden chamber featuring an antique oak closet bed.

Inside, Lockwood reads old diaries scrawled by 'Catherine Earnshaw' detailing Hindley's tyranny and her bond with Heathcliff. Falling asleep, Lockwood dreams of the preacher Jabez Branderham, followed by a horrifying nightmare: a fir branch taps at the lattice, but when he reaches out, his hand clutches the icy fingers of a child's ghost crying: 'Let me in! I'm Catherine Linton... I've been a waif for twenty years!'

Lockwood's scream rouses Heathcliff, who violently wrenches open the window and weeps in desolate grief, begging Cathy to return. Lockwood returns to Thrushcross Grange, shaken to the core.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 2,
            title = "Chapters IV - IX: Childhood, Degradation & Catherine's Fatal Choice",
            summary = "Nelly Dean narrates the history: Old Mr. Earnshaw brings the orphaned Heathcliff to Wuthering Heights from Liverpool. After Earnshaw dies, Hindley degrades Heathcliff to a common laborer. Catherine and Heathcliff grow wild on the moors until Catherine stays at Thrushcross Grange with the Lintons. Catherine confesses to Nelly that she loves Heathcliff ('I am Heathcliff!'), but must marry Edgar for social standing. Heathcliff overhears that marrying him would 'degrade' her and runs away into the stormy night.",
            keyQuotes = listOf(
                "He took to Heathcliff strangely, believing all he said, and petting him up far above Cathy.",
                "My love for Linton is like the foliage in the woods: time will change it... My love for Heathcliff resembles the eternal rocks beneath... Nelly, I am Heathcliff!",
                "Whatever our souls are made of, his and mine are the same; and Linton's is as different as a moonbeam from lightning, or frost from fire."
            ),
            fullText = """
Nelly Dean recounts how old Mr. Earnshaw returned from Liverpool with a ragged, dark-skinned foundling named Heathcliff. While Earnshaw doted on the boy, his son Hindley hated him bitterly.

Following Mr. Earnshaw's death, Hindley marries Frances and reduces Heathcliff to an uneducated outdoor servant. Catherine and Heathcliff find refuge in each other, roaming the wild moors. One night, spying on the Linton children at Thrushcross Grange, Catherine is bitten by their bulldog, Skulker, and stays five weeks with the Lintons, returning transformed into a polished young lady.

Hindley's wife dies giving birth to Hareton, driving Hindley into drunken madness. When Edgar Linton proposes to Catherine, she confides in Nelly: while she loves Edgar for his wealth and elegance, her soul belongs irrevocably to Heathcliff ('Nelly, I am Heathcliff!').

Unbeknownst to Catherine, Heathcliff overhears her say it would 'degrade' her to marry him, and flees into a raging thunderstorm before hearing her profess her eternal love. Heathcliff vanishes without a trace, and Catherine falls into life-threatening fever.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 3,
            title = "Chapters X - XVI: Heathcliff's Return, Isabella's Ruin & Catherine's Death",
            summary = "Three years later, Catherine is happily married to Edgar at Thrushcross Grange when Heathcliff returns transformed into a wealthy, polished gentleman. Heathcliff resumes contact, creating bitter discord. Isabella Linton falls in love with Heathcliff; Heathcliff marries and abuses her as revenge against Edgar. Catherine falls critically ill from nervous delirium. Heathcliff secretly visits her for a passionate, agonized farewell before Catherine dies giving birth to young Cathy.",
            keyQuotes = listOf(
                "Now, fully revealed by the fire and candlelight, I was amazed at the transformation of Heathcliff. He had grown a tall, athletic, well-formed man.",
                "'You teach me now how cruel you've been—cruel and false. Why did you despise me? Why did you betray your own heart, Cathy? ... I forgive what you have done to me. I love my murderer—but yours! How can I?'",
                "'Catherine Earnshaw, may you not rest as long as I am living; you said I killed you—haunt me, then! ... I cannot live without my life! I cannot live without my soul!'"
            ),
            fullText = """
Three years later, Catherine and Edgar enjoy quiet marital bliss at Thrushcross Grange until Heathcliff reappears—now wealthy, educated, and dignified, but driven by dark vengeance.

Heathcliff lodges at Wuthering Heights, exploiting Hindley's gambling debts to gain control of the estate. When Edgar's sister Isabella becomes infatuated with Heathcliff, Catherine warns her of his brutality, but Heathcliff elopes with Isabella to torment Edgar.

A violent confrontation between Edgar and Heathcliff triggers Catherine's relapse into brain fever and delirium. Heathcliff forces Nelly to arrange a clandestine farewell visit. In Catherine's chamber, the two lovers exchange desperate, heart-wrenching recriminations and passionate embraces.

That midnight, Catherine dies giving birth to a daughter, young Cathy. Heathcliff, learning of her death under the ash trees, pounds his head against the trunk and utters his famous, immortal prayer: 'Catherine Earnshaw, may you not rest as long as I am living! Haunt me! Take any form—drive me mad! Only do not leave me in this abyss where I cannot find you! I cannot live without my life! I cannot live without my soul!'
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 4,
            title = "Chapters XVII - XXVIII: The Usurpation & Young Cathy's Imprisonment",
            summary = "Isabella escapes Heathcliff's brutality at Wuthering Heights and flees to London, giving birth to Linton. Hindley dies in debt, leaving Heathcliff master of Wuthering Heights and legal guardian of an illiterate Hareton. Twelve years later, Isabella dies; Heathcliff takes Linton and forces a marriage between Linton and young Cathy to claim Thrushcross Grange upon Edgar's death.",
            keyQuotes = listOf(
                "Now, my bonny lad, you are mine! And we'll see if one tree won't grow as crooked as another, with the same wind to twist it!",
                "Linton can play the little tyrant well... He'll undertake to torture any number of cats, if their teeth be drawn.",
                "He died blissfully, Mr. Lockwood: kissing her cheek, he murmured, 'I am going to her; and you, darling child, shall come to us!'"
            ),
            fullText = """
Isabella escapes Wuthering Heights after Hindley attempts to shoot Heathcliff, moving near London where she raises her sickly son, Linton. Hindley drinks himself to death six months after Catherine's demise; Heathcliff assumes ownership of Wuthering Heights and deliberately raises Hindley's son, Hareton, in complete savagery and illiteracy.

Young Cathy grows up sheltered at Thrushcross Grange by her doting father Edgar. When Isabella dies twelve years later, Heathcliff immediately claims his fragile son Linton as a pawn.

Luring Cathy to the Heights, Heathcliff imprisons her and Nelly for five days until Cathy agrees to marry the dying Linton. Edgar Linton dies peacefully at Thrushcross Grange, comforted by Cathy's brief escape to his deathbed.

Upon Edgar's death, lawyer Green (bribed by Heathcliff) delivers Thrushcross Grange to Heathcliff. Linton dies shortly thereafter, leaving Heathcliff master of both properties and holding Cathy penniless at Wuthering Heights.
            """.trimIndent()
        ),
        NovelChapterData(
            chapterNumber = 5,
            title = "Chapters XXIX - XXXIV: Heathcliff's Vision, Hareton's Redemption & Peace",
            summary = "Heathcliff reveals he opened Catherine's grave and dreams of dissolving with her in the earth. At Wuthering Heights, Cathy overcomes initial scorn and teaches Hareton to read, blossoming into mutual love. Heathcliff finds his desire for revenge evaporating as Hareton and Cathy's eyes constantly remind him of Catherine. Heathcliff ceases eating, communes with Catherine's spirit, and dies with a triumphant smile. Cathy and Hareton plan their marriage, and the moors are finally at peace.",
            keyQuotes = listOf(
                "I got the sexton to remove the earth off her coffin lid, and I opened it... I struck one side of the coffin loose... so that by the time Linton gets to us he'll not know which is which!",
                "I have lost the faculty of enjoying their destruction, and I am too idle to destroy for nothing.",
                "I watched the moths fluttering among the heath and harebells, listened to the soft wind breathing through the grass, and wondered how any one could ever imagine unquiet slumbers for the sleepers in that quiet earth."
            ),
            fullText = """
Returning to 1802, Lockwood learns the dramatic conclusion from Nelly Dean.

At Wuthering Heights, young Cathy repents her earlier mockery of Hareton's illiteracy. She gives him a book and lovingly teaches him to read, transforming their hostility into a tender, devoted romance.

Witnessing Cathy and Hareton's blossoming happiness and noting their striking resemblance to Catherine Earnshaw, Heathcliff's appetite for cruelty dissolves: 'I get levers and mattocks to demolish the two houses, and when everything is in my power, I find the will to lift a slate off either roof has vanished!'

Heathcliff experiences mystical visions of Catherine everywhere on the moors, in the clouds, and in the rooms. He refuses food for four days, consumed by spiritual ecstasy. Nelly finds him dead in the oak-paneled bed with his eyes wide open in fierce exultation and the rain washing over his face.

Heathcliff is buried beside Catherine with their coffin sides open to mingle in the earth. Cathy and Hareton prepare to marry on New Year's Day and move to Thrushcross Grange.

Lockwood visits the three peaceful graves on the heath (Catherine, Edgar, and Heathcliff), listening to the gentle breeze and contemplating the quiet earth.
            """.trimIndent()
        )
    )

    val quizQuestions = listOf(
        NovelQuizData(
            id = 1,
            question = "Where did old Mr. Earnshaw first find and adopt the orphaned Heathcliff?",
            options = listOf(
                "A) London",
                "B) Liverpool",
                "C) Gimmerton",
                "D) York"
            ),
            correctIndex = 1,
            explanation = "Old Mr. Earnshaw found the starving, homeless, dark-haired child wandering the streets of Liverpool and brought him home to Wuthering Heights."
        ),
        NovelQuizData(
            id = 2,
            question = "What profound words does Catherine use to describe her essential identity with Heathcliff?",
            options = listOf(
                "A) 'He is my master and lord'",
                "B) 'Nelly, I am Heathcliff!'",
                "C) 'We are like moonbeams in the dark'",
                "D) 'He is the father of my spirit'"
            ),
            correctIndex = 1,
            explanation = "In Chapter IX, Catherine famously declares: 'Nelly, I am Heathcliff! He's always, always in my mind... as my own being.'"
        ),
        NovelQuizData(
            id = 3,
            question = "How does Heathcliff arrange to be united with Catherine in death?",
            options = listOf(
                "A) By having their portraits burned together",
                "B) By bribing the sexton to strike the facing sides of their coffins loose so their dust will mingle",
                "C) By building a combined mausoleum on Penistone Crags",
                "D) By scattering their ashes over the moors"
            ),
            correctIndex = 1,
            explanation = "In Chapter XXIX, Heathcliff reveals he bribed the sexton to remove the side of Catherine's coffin and do the same to his when buried, so their remains would dissolve together."
        ),
        NovelQuizData(
            id = 4,
            question = "What symbolic act marks the beginning of love and reconciliation between young Cathy and Hareton?",
            options = listOf(
                "A) Cathy gives Hareton a horse",
                "B) Cathy wraps a book for Hareton and teaches him to read",
                "C) Hareton rescues Cathy from a snowstorm",
                "D) They plant a tree together"
            ),
            correctIndex = 1,
            explanation = "In Chapter XXXII, Cathy wraps a book in white paper, gives it to Hareton with a kiss of apology, and begins teaching him to read, transforming their relationship."
        ),
        NovelQuizData(
            id = 5,
            question = "Who are the two primary narrators that tell the story of Wuthering Heights?",
            options = listOf(
                "A) Heathcliff and Edgar Linton",
                "B) Mr. Lockwood and Ellen (Nelly) Dean",
                "C) Catherine and Isabella",
                "D) Joseph and Zillah"
            ),
            correctIndex = 1,
            explanation = "The novel uses a famous nested narrative structure framed by Mr. Lockwood's diary and Ellen (Nelly) Dean's detailed eyewitness chronicle."
        )
    )
}
