package com.example.data.repository

data class DramaActData(
    val actNumber: Int,
    val sceneNumber: Int,
    val title: String,
    val setting: String,
    val summary: String,
    val keyQuotes: List<String>,
    val fullText: String
)

object LookBackInAngerBook {
    val title = "Look Back in Anger"
    val author = "John Osborne"
    val genre = "Modern British Realist Drama / 'Kitchen Sink' Theatre"
    val premierDate = "8 May 1956, Royal Court Theatre, London"
    val director = "Tony Richardson"
    val originalCast = "Jimmy Porter (Kenneth Haigh), Alison Porter (Mary Ure), Cliff Lewis (Alan Bates), Helena Charles (Helena Hughes), Colonel Redfern (John Welsh)"
    val dedication = "For MY FATHER"

    val overview = """
        'Look Back in Anger' revolutionized 20th-century British theatre when it premiered in 1956, giving birth to the 'Angry Young Man' cultural movement. Set in a cramped, squalid one-room attic flat in the English Midlands, the play centers on Jimmy Porter, a disillusioned university graduate running a sweet-stall, who vents his blistering fury against British social stratification, the complacency of the upper-middle class, religious hypocrisy, and the absence of 'good, brave causes' in post-war Britain.
    """.trimIndent()

    val characters = listOf(
        NovelCharacterData(
            name = "Jimmy Porter",
            role = "Protagonist / The 'Angry Young Man'",
            description = "A 25-year-old university-educated working-class intellectual who runs a sweet-stall with Cliff. Eloquent, volatile, and deeply scarred by watching his father die after the Spanish Civil War, Jimmy lashes out at society's stagnation and his wife's aristocratic detachment.",
            keyTraits = "Fiery, articulate, cynical, emotionally demanding, vulnerable, traumatized"
        ),
        NovelCharacterData(
            name = "Alison Porter",
            role = "Jimmy's Wife",
            description = "Daughter of Colonel Redfern from an upper-middle-class military family. She endures Jimmy's ferocious tirades with stoic reservation and 'well-bred malaise', secretly becoming pregnant before suffering a devastating miscarriage.",
            keyTraits = "Reserved, aristocratic, resilient, suffering, compassionate"
        ),
        NovelCharacterData(
            name = "Cliff Lewis",
            role = "Friend & Flatmate",
            description = "A warm, easy-going working-class Welshman who lives in the attic flat and works the sweet-stall with Jimmy. He acts as the gentle mediator and emotional buffer between Jimmy and Alison.",
            keyTraits = "Loyal, peaceful, humorous, affectionate, unpretentious"
        ),
        NovelCharacterData(
            name = "Helena Charles",
            role = "Alison's Friend / Actress",
            description = "A stylish, conventional, and deeply religious upper-class actress. Initially appalled by Jimmy's brutality, she summons Colonel Redfern to rescue Alison, only to step into Alison's place as Jimmy's lover before her religious conscience compels her to leave.",
            keyTraits = "Authoritative, conventional, moralistic, passionate, guilt-ridden"
        ),
        NovelCharacterData(
            name = "Colonel Redfern",
            role = "Alison's Father",
            description = "A retired British Army officer who commanded troops in India until 1947. Nostalgic for the vanished Edwardian certainty and imperial peace, he exhibits unexpected sympathy and fairness toward Jimmy's anger.",
            keyTraits = "Gentlemanly, nostalgic, reflective, kind-hearted, bewildered by modern times"
        )
    )

    val themes = listOf(
        NovelThemeData(
            title = "The 'Angry Young Man' and Post-War Disillusionment",
            description = "Examines the frustration of educated working-class youth in 1950s Britain who found themselves shut out of real opportunity by the entrenched class system and lacking heroic ideals.",
            utmeSignificance = "Core UTME Drama theme examining socio-political rebellion and generational angst."
        ),
        NovelThemeData(
            title = "Class Warfare and Social Alienation",
            description = "The marital battlefield between Jimmy (working-class origins) and Alison (colonial military aristocracy) serves as a microcosm of British class conflict.",
            utmeSignificance = "Central dramatic conflict explored in character motivations and monologues."
        ),
        NovelThemeData(
            title = "The Bears and Squirrels Sanctuary",
            description = "Jimmy and Alison's private fantasy game of bears and squirrels represents an escape from societal cruelty into innocent, animalistic affection devoid of intellectual warfare.",
            utmeSignificance = "Key dramatic symbol representing fragile emotional intimacy."
        ),
        NovelThemeData(
            title = "Suffering, 'Muscle & Guts' and Human Vitality",
            description = "Jimmy believes that true living requires embracing emotional messiness, suffering, and raw vitality rather than hiding behind religious or bourgeois detachment.",
            utmeSignificance = "Crucial for understanding Jimmy's psychological drive and character."
        )
    )

    val acts = listOf(
        DramaActData(
            actNumber = 1,
            sceneNumber = 1,
            title = "Act I: A Sunday in the Midlands",
            setting = "A large attic room at the top of a Victorian house in the Midlands. A Sunday evening in April. Alison is ironing while Jimmy and Cliff read Sunday papers.",
            summary = "Jimmy and Cliff lounge in armchairs reading newspapers while Alison irons. Jimmy launches blistering diatribes against the Establishment, bishops, the Church of England, and Alison's aristocratic family. During horseplay with Cliff, Jimmy knocks into the ironing board, burning Alison's arm. Alison confides in Cliff that she is pregnant but terrified to tell Jimmy. Helena Charles phones to announce she is arriving to stay.",
            keyQuotes = listOf(
                "Why do I spend ninepence on that damned paper every week? Nobody reads it except me... Nobody can be bothered. No one can raise themselves out of their delicious sloth.",
                "Have you ever seen her brother? Brother Nigel? The straight-backed, chinless wonder from Sandhurst?",
                "If you could have a child, and it would die... Let it grow, let a recognizable human face emerge... I wonder if you might even become a recognizable human being yourself."
            ),
            fullText = """
ACT I: The Porters' one-room flat in a large Midland town. Early evening, April.

Jimmy Porter and Cliff Lewis are sprawled in two shabby armchairs reading Sunday newspapers while Alison Porter is busy ironing over an ironing board. Smoke fills the room from Jimmy's pipe.

Jimmy initiates his verbal barrage, scorning the Sunday book reviews, the Bishop of Bromley, and Alison's upper-class family: "God, how I hate Sundays! It's always so depressing, always the same. We never seem to get any further... Reading the papers, drinking tea, ironing. A few more hours, and another week gone. Our youth is slipping away."

Jimmy attacks Alison's brother Nigel, calling him "the straight-backed, chinless wonder from Sandhurst" who represents "The Platitude from Outer Space."

Cliff tries to diffuse the tension by engaging Jimmy in playful wrestling. In the struggle, Jimmy is shoved against the ironing board, knocking it over and causing the hot iron to burn Alison's arm. Jimmy tries to apologize, but Alison screams at him to get out.

While Jimmy is in the other room, Cliff gently applies soap and a bandage to Alison's burn. Alison breaks down and reveals her closely guarded secret: "Cliff—I'm pregnant. Few days ago. It was a bit of a shock... After three years of married life, I have to get caught out now."

Helena Charles, an old actress friend of Alison's, calls on the phone to announce she is in town for a repertory play and needs a place to stay. Jimmy returns, learns Helena is coming, and furiously predicts that Helena will bring disaster into their home.
            """.trimIndent()
        ),
        DramaActData(
            actNumber = 2,
            sceneNumber = 1,
            title = "Act II, Scene 1: Two Weeks Later",
            setting = "The attic flat, two weeks later. Evening. Alison and Helena are preparing supper while Jimmy plays his jazz trumpet off-stage.",
            summary = "Alison explains to Helena how she first fell in love with Jimmy ('a knight in shining armour') and describes their private 'bears and squirrels' game. Jimmy enters and attacks Helena's religious hypocrisy when she invites Alison to church. Jimmy recounts the traumatic childhood experience of watching his father die slowly for twelve months after the Spanish Civil War. A telegram arrives announcing Mrs. Tanner (Hugh's mother) has suffered a stroke in London. Jimmy begs Alison to accompany him, but she chooses to leave for church with Helena.",
            keyQuotes = listOf(
                "You see, I learnt at an early age what it was to be angry—angry and helpless. And I can never forget it. I knew more about love, betrayal, and death when I was ten years old than you will probably ever know all your life.",
                "Anyone who's never watched somebody die is suffering from a pretty bad case of virginity."
            ),
            fullText = """
ACT II, SCENE ONE: Two weeks later. Evening.

Alison is cooking supper with Helena while Jimmy plays loud jazz trumpet runs across the hall. Alison recounts her courtship with Jimmy, the gatecrashing raids on wealthy London parties with Jimmy and Hugh Tanner, and the comforting ritual of their 'bears and squirrels' fantasy game.

Helena warns Alison that Jimmy is destroying her and urges her to summon her father to take her home.

When Jimmy enters, he mocks Helena's conventional church-going. In one of the most powerful monologues in 20th-century theatre, Jimmy explains the root of his rage: as a ten-year-old boy, he spent twelve agonizing months sitting at the bedside of his dying father who had returned shattered from fighting in the Spanish Civil War, while his mother and family looked on with cold embarrassment.

A telephone message arrives: Mrs. Tanner, an impoverished working-class woman who bought Jimmy his sweet-stall, has suffered a severe stroke in London and is dying. Jimmy begs Alison to come with him to London. Alison, torn and exhausted, refuses and leaves for church with Helena. Jimmy collapses onto the bed in despair, feeling utterly betrayed.
            """.trimIndent()
        ),
        DramaActData(
            actNumber = 2,
            sceneNumber = 2,
            title = "Act II, Scene 2: The Following Evening",
            setting = "The attic flat, the following evening. Alison is packing her suitcase with her father, Colonel Redfern.",
            summary = "Colonel Redfern visits the flat to take Alison home. He reflects nostalgically on his thirty years in colonial India before 1947 ('the Edwardian Wilderness') and admits that both he and his wife were partly to blame for alienating Jimmy. Alison leaves a farewell letter for Jimmy. When Jimmy returns from London exhausted after Mrs. Tanner's funeral, Helena hands him the note and reveals Alison is pregnant. Jimmy scorns the news. Helena slaps him across the face, but their confrontation suddenly turns into a passionate embrace.",
            keyQuotes = listOf(
                "I was born as Jimmy says. I met him at a party... He looked so young and frail, in spite of the tired line of his mouth.",
                "Those long, cool evenings up in the hills, everything purple and golden... It seemed as though we had everything we could ever want.",
                "There's no good, brave causes left. If the big bang does come... it won't be in aid of the old-fashioned, grand design."
            ),
            fullText = """
ACT II, SCENE TWO: The following evening.

Colonel Redfern sits in the attic flat while Alison packs her suitcase. The Colonel expresses wistful nostalgia for pre-1947 British India, describing how he feels like "an old plant left over from the Edwardian Wilderness." He surprises Alison by acknowledging that her mother's heavy-handed detective investigations against Jimmy were wrong and that Jimmy possessed legitimate reasons for anger.

Alison leaves the toy squirrel out of her suitcase and writes a farewell letter to Jimmy before departing with her father.

Cliff says goodbye to Alison and departs. Helena remains behind to catch a train the following morning. Jimmy rushes in, enraged after nearly being run down in the street.

Helena hands him Alison's farewell letter. Jimmy reads it with disgust, scorning its polite phrases. When Helena tells him that Alison is pregnant, Jimmy refuses to soften, recalling the lonely agony of burying Mrs. Tanner without a single flower from Alison's family.

When Jimmy insults Helena as an 'evil-minded little virgin', Helena slaps him hard across the face. Jimmy breaks down in physical and emotional exhaustion. Helena suddenly bursts into tears and kisses him passionately, and they fall onto the bed together.
            """.trimIndent()
        ),
        DramaActData(
            actNumber = 3,
            sceneNumber = 1,
            title = "Act III, Scene 1: Several Months Later",
            setting = "The attic flat, several months later. A Sunday evening. Helena is at the ironing board, wearing Jimmy's shirt, recreating the opening scene.",
            summary = "The domestic cycle repeats with Helena in Alison's place. Cliff announces he is leaving the flat to start a life of his own. Jimmy and Cliff perform a comedic music-hall vaudeville routine. Suddenly, a pale, ill, and rain-soaked Alison appears in the doorway in a raincoat.",
            keyQuotes = listOf(
                "Mirth, mellerdy and madness! Bringing quips and strips for you!",
                "You've been loyal, generous and a good friend. But I'm quite prepared to see you wander off... All because of something I want from that girl downstairs, something I know in my heart she's incapable of giving."
            ),
            fullText = """
ACT III, SCENE ONE: Several months later. A Sunday evening.

In an ironic visual parallel to Act I, Helena is now standing at the ironing board wearing one of Jimmy's old shirts, while Jimmy and Cliff lounge with the Sunday newspapers.

Cliff decides it is time to move on, leave the flat, and find a girl of his own. Jimmy accepts Cliff's departure with genuine sadness, admitting that Cliff was his only true friend. Jimmy and Cliff break into a lively, satirical music-hall routine ('Flanagan and Allen' / 'T. S. Eliot and Pam').

Helena goes into the kitchen to prepare tea. As Jimmy heads out toward the landing, the door opens to reveal Alison standing in the doorway, soaked in rain, pale, emaciated, and looking desperately ill. Jimmy pauses in stunned silence, tells Helena 'Friend of yours to see you', and leaves the room.
            """.trimIndent()
        ),
        DramaActData(
            actNumber = 3,
            sceneNumber = 2,
            title = "Act III, Scene 2: The Return & Reconciliation",
            setting = "A few minutes later. Alison and Helena discuss what has happened.",
            summary = "Alison tells Helena she suffered a miscarriage and lost the baby. Helena's religious guilt returns; she realizes she cannot live in sin with Jimmy and decides to leave immediately. Alison, broken and stripped of her pride, grovels at Jimmy's feet, weeping that she is now in the mud and understands true suffering. Jimmy is moved, and they retreat into their fantasy world of 'bears and squirrels'.",
            keyQuotes = listOf(
                "I was wrong! I was wrong! I don't want to be neutral, I don't want to be a saint. I want to be a lost cause. I want to be corrupt and futile! Don't you see! I'm in the mud at last! I'm grovelling! I'm crawling!",
                "We'll be together in our bear's cave, and our squirrel's drey, and we'll live on honey, and nuts... Poor squirrels! - Poor bears!"
            ),
            fullText = """
ACT III, SCENE TWO: A few minutes later.

Alison explains to Helena that she lost her baby through a traumatic miscarriage. Overcome by moral guilt, Helena realizes that her Christian conscience will never allow her to remain with Jimmy at the expense of another woman's suffering. Helena packs her bags and leaves.

Alison breaks down completely before Jimmy, crying out: "I didn't know it could be like that! I was in pain, and all I could think of was you, and what I'd lost... This is what he's been longing for me to feel. This is what he wants to splash about in! I'm in the fire, and I'm burning... Don't you see! I'm in the mud at last! I'm grovelling! I'm crawling!"

Seeing Alison completely stripped of aristocratic pride and united with him in profound suffering, Jimmy's bitter defenses crumble. He catches her in his arms and comforts her softly.

The play concludes with them retreating into their private sanctuary of the 'bear and squirrel' ritual: "We'll be together in our bear's cave, and our squirrel's drey, and we'll live on honey, and nuts... Poor bears! Poor squirrels!"
            """.trimIndent()
        )
    )

    val quizQuestions = listOf(
        NovelQuizData(
            id = 1,
            question = "What musical instrument does Jimmy Porter play throughout the play to express his anguish?",
            options = listOf(
                "A) Saxophone",
                "B) Jazz Trumpet",
                "C) Banjo",
                "D) Clarinet"
            ),
            correctIndex = 1,
            explanation = "Jimmy Porter plays the jazz trumpet in the adjacent room, using its loud, piercing sounds as an outlet for his emotional frustration."
        ),
        NovelQuizData(
            id = 2,
            question = "What childhood trauma fundamentally shaped Jimmy Porter's rage and worldview?",
            options = listOf(
                "A) Being expelled from university",
                "B) Watching his father die slowly for a year after the Spanish Civil War",
                "C) Poverty in a Victorian orphanage",
                "D) The death of his mother during the Blitz"
            ),
            correctIndex = 1,
            explanation = "At age ten, Jimmy spent twelve months watching his father die from wounds sustained fighting in the Spanish Civil War while the rest of the family stood coldly by."
        ),
        NovelQuizData(
            id = 3,
            question = "What fantasy game do Jimmy and Alison play as an emotional shelter from the outside world?",
            options = listOf(
                "A) Lions and Tigers",
                "B) Bears and Squirrels",
                "C) Kings and Queens",
                "D) Foxes and Hares"
            ),
            correctIndex = 1,
            explanation = "The 'game of bears and squirrels' is their private ritual where they shed intellectual and social pretenses to share uncomplicated, animalistic warmth."
        ),
        NovelQuizData(
            id = 4,
            question = "Why does Helena Charles leave Jimmy Porter at the end of Act III?",
            options = listOf(
                "A) She runs out of money to support him",
                "B) She is offered a starring film role in America",
                "C) Her religious conscience forbids her from staying after Alison's tragic miscarriage",
                "D) Jimmy physically assaults her"
            ),
            correctIndex = 2,
            explanation = "When Alison returns broken from her miscarriage, Helena's moral and religious beliefs revive, and she realizes she cannot build happiness on another woman's ruin."
        ),
        NovelQuizData(
            id = 5,
            question = "What business do Jimmy Porter and Cliff Lewis operate in the Midlands town?",
            options = listOf(
                "A) A second-hand bookshop",
                "B) A sweet-stall in the market",
                "C) A bicycle repair shop",
                "D) A jazz music club"
            ),
            correctIndex = 1,
            explanation = "Despite his university degree, Jimmy runs a humble market sweet-stall with Cliff, bought for him by Hugh's mother, Mrs. Tanner."
        )
    )
}
