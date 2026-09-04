package com.example.data.repository

object TheLionAndTheJewelBook {
    val title = "The Lion and the Jewel"
    val author = "Wole Soyinka"
    val genre = "African Comic Drama / Satirical Comedy"
    val publicationYear = "1963 (Oxford University Press)"
    val setting = "The Yoruba village of Ilujinle, Nigeria"
    val synopsis = """
        A sparkling satirical comedy by Nobel Laureate Wole Soyinka exploring the clash between Western modernity and African tradition. The plot revolves around Sidi, the beautiful 'Jewel' of Ilujinle, who is courted by Lakunle, a pretentious young schoolteacher who refuses to pay the traditional bride-price, and Baroka, the 62-year-old Bale ('Lion') of Ilujinle, who uses psychological cunning and a fake confession of impotence to win Sidi as his wife.
    """.trimIndent()

    val characters = listOf(
        NovelCharacterData(
            name = "Sidi",
            role = "The 'Jewel' of Ilujinle / Village Belle",
            description = "A stunning, spirited young village beauty. Initially sought by Lakunle, her vanity explodes when a Lagos magazine publishes glossy photographs of her beauty. She falls into Baroka's cunning trap when she tries to mock him, and ultimately chooses the virility and cultural authenticity of the Bale.",
            keyTraits = "Beautiful, proud, spirited, vain, resilient, vibrant"
        ),
        NovelCharacterData(
            name = "Baroka (The Bale)",
            role = "The 'Lion' of Ilujinle / Traditional Ruler",
            description = "The 62-year-old Bale of Ilujinle. Resourceful, cunning ('The Fox of the Undergrowth'), and sexually vigorous, Baroka embodies ancient Yoruba wisdom and defends traditional culture against disruptive Westernization.",
            keyTraits = "Cunning, authoritative, eloquent, virile, pragmatic, patient"
        ),
        NovelCharacterData(
            name = "Lakunle",
            role = "The Village Schoolteacher",
            description = "A 23-year-old modernizer full of big English words and half-baked Western ideas. He refuses to pay Sidi's bride-price, branding it 'barbaric' and 'savage', but his superficial modernization makes him a figure of ridicule in the village.",
            keyTraits = "Pretentious, verbose, dogmatic, comic, superficial, cowardly"
        ),
        NovelCharacterData(
            name = "Sadiku",
            role = "The Bale's Head Wife",
            description = "The elderly, faithful head of Baroka's harem for forty-one years. Serves as Baroka's matchmaker, but gloats prematurely when Baroka feigns impotence, unwittingly helping him trap Sidi.",
            keyTraits = "Traditional, gossipy, energetic dancer, gullible to the Bale's trickery"
        ),
        NovelCharacterData(
            name = "The Stranger / Photographer",
            role = "The Lagos Journalist",
            description = "The man from the capital whose magazine photographs make Sidi an overnight sensation and ignite the drama's central conflict.",
            keyTraits = "Modern, wandering, appreciative of feminine beauty"
        )
    )

    val themes = listOf(
        NovelThemeData(
            title = "Tradition vs. Modernity",
            description = "The central dialectic between Baroka's grounded, pragmatic preservation of Yoruba customs and Lakunle's superficial, mimicry-laden Western modernization.",
            utmeSignificance = "Core syllabus focus: examining the synthesis of old and new in African society."
        ),
        NovelThemeData(
            title = "The Bride-Price and Womanhood",
            description = "Sidi insists on the bride-price as the traditional validation of her virginity and social worth, rejecting Lakunle's attempt to avoid payment under the guise of modern romance.",
            utmeSignificance = "Crucial cultural question regarding African marital values."
        ),
        NovelThemeData(
            title = "Pride, Vanity and Cunning",
            description = "Sidi's hubris after seeing her magazine photos leads her to underestimate Baroka, allowing the 'Fox' to outwit her with his fabricated confession of lost manhood.",
            utmeSignificance = "Dramatic structure analysis regarding dramatic irony and reversal."
        )
    )

    val sections = listOf(
        DramaActData(
            actNumber = 1,
            sceneNumber = 1,
            title = "Part I: Morning (The Village Square)",
            setting = "The village centre under an immense Odan tree, outside the bush school.",
            summary = "Lakunle scolds Sidi for carrying water on her head and exposing her shoulders. Sidi insists she will marry him only if he pays the customary bride-price. Village girls rush in with a magazine containing glossy photos of Sidi, making her more famous than Baroka. The villagers perform the 'Dance of the Lost Traveller' with Lakunle playing the photographer. Baroka joins the dance.",
            keyQuotes = listOf(
                "A savage custom, barbaric, out-dated, rejected, denounced, accursed... SIDI, I do not seek a wife to fetch and carry, to cook and scrub.",
                "If that is true, then I am more esteemed than Bale Baroka, the Lion of Ilujinle. This means that I am greater than the Fox of the Undergrowth!",
                "Without these things you call nonsense, a Bale's life would be pretty dull."
            ),
            fullText = """
MORNING: The village centre of Ilujinle, dominated by an immense Odan tree.

Sidi enters carrying a pail of water on her head. Lakunle, the 23-year-old schoolteacher in threadbare English suit and tennis shoes, leaps from the school window to stop her.

Lakunle criticizes Sidi for carrying loads on her head ('shortening her neck like a spider') and exposing her shoulders. When he professes his love and demands she marry him like 'civilized Lagos couples' who foxtrot and kiss, Sidi rejects his advances, demanding the payment of the lawful bride-price. Lakunle denounces the bride-price with long dictionary words as 'barbaric, archaic, and ignoble'.

Village girls rush in excitedly: the Lagos photographer has returned with the printed magazine! Sidi's portraits appear on the front cover and across the centerfold in dazzling beauty, while Baroka's small photo is relegated to a corner next to a village latrine.

Sidi rejoices that she is now greater than the Bale. The youth enact the 'Dance of the Lost Traveller' mime, forcing a protesting Lakunle to play the drunken stranger whose car broke down in the jungle. Baroka emerges from behind the tree, joins the mime, and secretly admires Sidi's photograph.
            """.trimIndent()
        ),
        DramaActData(
            actNumber = 1,
            sceneNumber = 2,
            title = "Part II: Noon (The Market Road & Palace)",
            setting = "A road by the market, then moving into Baroka's bedroom.",
            summary = "Sadiku brings Baroka's proposal to take Sidi as his newest wife. Sidi scathingly rejects the offer, comparing her youthful beauty to Baroka's aged, spent face. Lakunle narrates how Baroka foiled the colonial railway project by bribing the surveyor with money, hens, and a goat. In his bedroom, Baroka tricks Sadiku into believing that his virility ended a week ago.",
            keyQuotes = listOf(
                "See how the water glistens on my face like the dew-moistened leaves on a Harmattan morning. But he—his face is like a leather piece torn rudely from the saddle of his horse!",
                "I am withered and unsapped, the joy of ballad-mongers, the aged butt of youth's ribaldry... My veins of life run dry, my manhood gone!"
            ),
            fullText = """
NOON: A road by the market.

Sadiku approaches Sidi with Baroka's proposal to make her his latest wife and promised senior wife of the future Bale. Sidi mocks the proposal, running her fingers over her magazine photo and declaring that Baroka is old, spent, and withered.

Lakunle recounts how the wily Baroka thwarted modern progress by bribing a white Public Works surveyor with pound notes, kola nuts, a coop of hens, and a goat to declare the soil unfit for a railway line through Ilujinle.

Meanwhile, in his bedroom, Baroka is attended by his Favourite who plucks armpit hairs. When Sadiku brings Sidi's refusal, Baroka feigns profound sadness and reveals a fabricated secret: his manhood has ended and his strength has failed. He swears Sadiku to absolute secrecy, knowing her gossiping nature will guarantee she spreads the news immediately to Sidi.
            """.trimIndent()
        ),
        DramaActData(
            actNumber = 1,
            sceneNumber = 3,
            title = "Part III: Night (The Triumph & Wedding)",
            setting = "The village square at evening, moving into Baroka's bedroom, then back to the market.",
            summary = "Sadiku performs a gloating victory dance, celebrating women's triumph over the 'scotched' Lion. Sidi goes to the palace to mock Baroka. Baroka engages her in conversation, reveals his secret machine to print postage stamps with Sidi's face, and seduces her. Sidi returns having lost her virginity, rejects Lakunle's offer to wed without bride-price, and celebrates her wedding to Baroka.",
            keyQuotes = listOf(
                "Take warning, my masters, we'll scotch you in the end!",
                "The old must flow into the new, Sidi, not blind itself or stand foolishly apart. A girl like you must inherit miracles which age alone reveals.",
                "Did you really think that after him, I could endure the touch of another man? I who have felt the strength, the perpetual youthful zest of the panther of the trees?"
            ),
            fullText = """
NIGHT: The village centre at dusk.

Sadiku performs a wild victory dance around a carved wooden figure of Baroka, chanting that women have 'scotched' the Lion. When Sidi learns of Baroka's supposed impotence, she insists on attending his dinner to taunt the defeated ruler.

At the palace, Sidi finds Baroka wrestling with his companion. Baroka speaks with profound philosophical charm, arguing that tradition and progress must merge like old wine in new bottles. He presents his secret invention—a stamp-printing machine—and promises that tens of thousands of stamps bearing Sidi's exquisite face will travel the world. Dazzled by this vision, Sidi rests her head on his shoulder and is seduced.

Back at the market, Lakunle and Sadiku wait anxiously. Sidi bursts in weeping, revealing that Baroka's impotence was a cunning ruse. Lakunle offers to marry her without bride-price since she is no longer a maid.

Sidi shoves Lakunle aside, declaring that she could never marry a 'book-nourished shrimp' after experiencing the vigor of the Lion. Radiant and adorned in bridal beads, Sidi asks Sadiku for a mother's blessing and leads the village in a joyous wedding dance as Baroka's bride.
            """.trimIndent()
        )
    )

    val quizQuestions = listOf(
        NovelQuizData(
            id = 1,
            question = "Why does Lakunle refuse to pay the bride-price for Sidi in Part I (Morning)?",
            options = listOf(
                "A) He is completely broke and has no job",
                "B) He views the bride-price as a barbaric, uncivilized custom that reduces women to cattle",
                "C) Baroka forbade him from marrying Sidi",
                "D) Sidi's father demanded an exorbitant sum in British pounds"
            ),
            correctIndex = 1,
            explanation = "Lakunle considers the bride-price 'barbaric, outdated, and ignoble', believing that paying it would equate to buying a heifer off the market stall."
        ),
        NovelQuizData(
            id = 2,
            question = "How did Baroka successfully halt the construction of the railway through Ilujinle?",
            options = listOf(
                "A) By waging armed war against the colonial authorities",
                "B) By bribing the white surveyor with pound notes, kola nuts, hens, and a goat",
                "C) By having the village gods strike the workers with illness",
                "D) By petitioning the Governor in Lagos"
            ),
            correctIndex = 1,
            explanation = "As narrated by Lakunle in Part II, Baroka bribed the surveyor with money, kola nuts, hens, and a goat to falsely report the soil as unsuitable for railway tracks."
        ),
        NovelQuizData(
            id = 3,
            question = "What psychological trick does Baroka play on Sadiku to lure Sidi to his palace?",
            options = listOf(
                "A) He pretends he is dying of a venomous snakebite",
                "B) He claims he has lost his virility / manhood",
                "C) He threatens to banish her from Ilujinle",
                "D) He offers her all his royal gold"
            ),
            correctIndex = 1,
            explanation = "Baroka feigns impotence to Sadiku, knowing her inability to keep a secret will lead Sidi to visit the palace to mock him, falling straight into his trap."
        ),
        NovelQuizData(
            id = 4,
            question = "What machine does Baroka show Sidi in his bedroom to win her admiration?",
            options = listOf(
                "A) A motor-bike engine",
                "B) A stamp-printing machine crafted by palace blacksmiths",
                "C) A sewing machine from Lagos",
                "D) A modern camera"
            ),
            correctIndex = 1,
            explanation = "Baroka unveils a stamp-printing machine made in secret by palace blacksmiths, promising that Sidi's portrait will appear on official postage stamps."
        ),
        NovelQuizData(
            id = 5,
            question = "Why does Sidi choose to marry Baroka rather than Lakunle at the conclusion of the play?",
            options = listOf(
                "A) Baroka has more money and palace servants",
                "B) She respects Baroka's genuine masculine strength and vitality over Lakunle's empty rhetoric",
                "C) Sadiku forces her into the marriage",
                "D) The Lagos photographer refused to marry her"
            ),
            correctIndex = 1,
            explanation = "Sidi realizes Baroka embodies authentic strength, passion, and tradition, dismissing Lakunle as a 'book-nourished shrimp' and 'watered-down man'."
        )
    )
}
