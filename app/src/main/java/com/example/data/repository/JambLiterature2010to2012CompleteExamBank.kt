package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Literature-in-English 2010, 2011, and 2012 UTME Official Exams.
 * Contains authentic questions across Drama, Prose, Poetry and Literary Appreciation.
 */
object JambLiterature2010to2012CompleteExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2010 LITERATURE IN ENGLISH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_2010_02",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters (De Graft)",
                year = "2010",
                questionText = "'I simply don't understand what's the matter with everybody today. Everybody let me down...' The speaker above is referring to:",
                optionA = "Fosuwa and Maidservant",
                optionB = "Hannah and George",
                optionC = "Aaron and Maanan",
                optionD = "Lawyer B and Mrs. B",
                correctAnswerIndex = 0,
                explanation = "In J.C. De Graft's Sons and Daughters, James Ofosu expresses frustration when his household members, particularly Fosuwa and the maidservant, fail his expectations.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_03",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters (De Graft)",
                year = "2010",
                questionText = "Maanan expresses intense dislike for Lawyer B because of:",
                optionA = "his condemnation of her choice of career",
                optionB = "his recent unsolicited advances towards her",
                optionC = "the betrayal of her father's trust",
                optionD = "the betrayal of his wife's trust",
                correctAnswerIndex = 1,
                explanation = "Maanan rejects Lawyer B because he makes improper, predatory romantic advances toward her.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_04",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters (De Graft)",
                year = "2010",
                questionText = "The traditional conservative order in 'Sons and Daughters' is represented by:",
                optionA = "Mrs. B",
                optionB = "Hannah",
                optionC = "Maanan",
                optionD = "Aunt Fosuwa",
                correctAnswerIndex = 3,
                explanation = "Aunt Fosuwa staunchly embodies old-fashioned Akan traditional values and resists modern Western individualism.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_05",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters (De Graft)",
                year = "2010",
                questionText = "The dramatic action of 'Sons and Daughters' takes place entirely in:",
                optionA = "On the street",
                optionB = "In George's clinic",
                optionC = "In Aunt's house",
                optionD = "In James Ofosu's house",
                correctAnswerIndex = 3,
                explanation = "The play maintains the classical unity of place, set inside James Ofosu's living room.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_06",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (Shakespeare)",
                year = "2010",
                questionText = "'O deadly sin! O rude unthankfulness! Thy fault our law calls death, but the kind Prince... hath turned that black word to banishment.' In this excerpt, 'deadly sin' refers to:",
                optionA = "the suicide of Juliet",
                optionB = "the suicide of Romeo",
                optionC = "the murder of Paris",
                optionD = "the slaying of Tybalt",
                correctAnswerIndex = 3,
                explanation = "Friar Laurence reproaches Romeo for weeping after killing Tybalt, reminding him that the Prince commuted his death sentence to exile.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_07",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (Shakespeare)",
                year = "2010",
                questionText = "Shakespeare's 'Romeo and Juliet' is primarily written in:",
                optionA = "blank verse (unrhymed iambic pentameter)",
                optionB = "free verse",
                optionC = "ballad metre",
                optionD = "dactylic hexameter",
                correctAnswerIndex = 0,
                explanation = "Shakespearean tragic dialogue is fundamentally structured in blank verse (unrhymed iambic pentameter).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_08",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (Shakespeare)",
                year = "2010",
                questionText = "'O serpent heart, hid with a flowering face!' This oxymoronic lament by Juliet refers to:",
                optionA = "Juliet herself",
                optionB = "Romeo (after killing Tybalt)",
                optionC = "Tybalt",
                optionD = "Benvolio",
                correctAnswerIndex = 1,
                explanation = "When Juliet first hears that Romeo killed her cousin Tybalt, she laments how such an attractive exterior could hide violence.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_09",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (Shakespeare)",
                year = "2010",
                questionText = "The main spatial setting of Shakespeare's 'Romeo and Juliet' is:",
                optionA = "Athens",
                optionB = "Verona",
                optionC = "Padua",
                optionD = "Venice",
                correctAnswerIndex = 1,
                explanation = "The play is set in the northern Italian city of Verona (with brief exile scenes in Mantua).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_10",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (Shakespeare)",
                year = "2010",
                questionText = "Romeo is banished from Verona to Mantua because he:",
                optionA = "kills Tybalt in a street duel after Mercutio's death",
                optionB = "marries Juliet without parental consent",
                optionC = "attends Capulet's feast uninvited",
                optionD = "attempts to assassinate Paris",
                correctAnswerIndex = 0,
                explanation = "Prince Escalus banishes Romeo for retaliating against Tybalt and killing him in public street violence.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_11",
                subject = "Literature in English",
                topic = "Prose: The Joys of Motherhood (Buchi Emecheta)",
                year = "2010",
                questionText = "In Buchi Emecheta's 'The Joys of Motherhood', traditional Ibuza society places supreme value on:",
                optionA = "egalitarianism",
                optionB = "Western education",
                optionC = "procreation and male offspring",
                optionD = "gender equity",
                correctAnswerIndex = 2,
                explanation = "A woman's entire social worth and dignity in Ibuza culture is determined by her fertility and bearing male children.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q11"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_12",
                subject = "Literature in English",
                topic = "Prose: The Joys of Motherhood (Buchi Emecheta)",
                year = "2010",
                questionText = "The medicine man links the lump discovered on Nnu Ego's head at birth to:",
                optionA = "an extraordinary blessing of beauty",
                optionB = "the violent wound inflicted on the slave woman buried with Agbadi's senior wife",
                optionC = "the reincarnation of Agunwa",
                optionD = "a physical defect from childhood sickness",
                correctAnswerIndex = 1,
                explanation = "Nnu Ego is identified as the reincarnation of the abused slave woman sacrificed at Agbadi's senior wife's funeral.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_13",
                subject = "Literature in English",
                topic = "Prose: The Joys of Motherhood (Buchi Emecheta)",
                year = "2010",
                questionText = "In colonial Lagos, the constant unyielding companions of Nnaife's household are:",
                optionA = "togetherness and joy",
                optionB = "abject poverty and chronic hunger",
                optionC = "wealth and influence",
                optionD = "communal peace and stability",
                correctAnswerIndex = 1,
                explanation = "Despite bearing many children, Nnaife and Nnu Ego endure unending destitution, inflation, and hunger in urban Lagos.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q13"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_17",
                subject = "Literature in English",
                topic = "Prose: Nineteen Eighty-Four (George Orwell)",
                year = "2010",
                questionText = "In Oceania's government, the Ministry of Peace (Minipax) is paradoxically concerned with:",
                optionA = "instruments of music",
                optionB = "diplomacy and treaty making",
                optionC = "waging continuous wars",
                optionD = "civil reconciliation",
                correctAnswerIndex = 2,
                explanation = "In Orwellian Doublethink, the Ministry of Peace conducts perpetual military conflict.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_18",
                subject = "Literature in English",
                topic = "Prose: Nineteen Eighty-Four (George Orwell)",
                year = "2010",
                questionText = "The overarching thematic subject matter of Orwell's 'Nineteen Eighty-Four' is:",
                optionA = "religious extremism",
                optionB = "totalitarian dictatorship and surveillance",
                optionC = "retributive justice",
                optionD = "racial segregation",
                correctAnswerIndex = 1,
                explanation = "The novel warns against dystopian totalitarian regimes, psychological surveillance, and systematic eradication of truth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q18"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_19",
                subject = "Literature in English",
                topic = "Prose: Nineteen Eighty-Four (George Orwell)",
                year = "2010",
                questionText = "Winston Smith initiates his rebellious thoughtcrime against Big Brother by:",
                optionA = "purchasing and writing in a contraband private diary",
                optionB = "attempting to bomb the Ministry of Truth",
                optionC = "assassinating an Inner Party member",
                optionD = "broadcasting illicit radio speeches",
                correctAnswerIndex = 0,
                explanation = "Winston begins his defiance by secretly writing 'DOWN WITH BIG BROTHER' in a blank diary.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q19"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2010_20",
                subject = "Literature in English",
                topic = "Prose: Nineteen Eighty-Four (George Orwell)",
                year = "2010",
                questionText = "According to O'Brien, the Party seeks absolute power solely for:",
                optionA = "the welfare of the nation",
                optionB = "power's own sake",
                optionC = "the elevation of the working class",
                optionD = "economic superiority",
                correctAnswerIndex = 1,
                explanation = "O'Brien explicitly clarifies: 'The Party seeks power entirely for its own sake. We are not interested in the good of others; we are interested solely in power.'",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2010 • Q20"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2011 LITERATURE IN ENGLISH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_2011_02",
                subject = "Literature in English",
                topic = "Drama: Sons and Daughters (De Graft)",
                year = "2011",
                questionText = "From its resolution of domestic conflicts and reconciliation, 'Sons and Daughters' can be classified as a:",
                optionA = "classical tragedy",
                optionB = "comedy / domestic comedy",
                optionC = "farce",
                optionD = "melodrama",
                correctAnswerIndex = 1,
                explanation = "The play resolves its misunderstandings happily with parental acceptance of the children's career choices.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_08",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (Shakespeare)",
                year = "2011",
                questionText = "In Shakespeare's 'Romeo and Juliet', the tragic news of Juliet's apparent death is delivered to Romeo in Mantua by:",
                optionA = "Balthasar",
                optionB = "Friar Laurence",
                optionC = "Friar John",
                optionD = "Benvolio",
                correctAnswerIndex = 0,
                explanation = "Romeo's dedicated servant Balthasar witnesses Juliet's burial in the Capulet monument and rides to Mantua to break the news.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2011_19",
                subject = "Literature in English",
                topic = "Prose: Nineteen Eighty-Four (George Orwell)",
                year = "2011",
                questionText = "In 'Nineteen Eighty-Four', Room 101 in the Ministry of Love represents the ultimate chamber of:",
                optionA = "physical and psychological torture using one's worst individual nightmare",
                optionB = "leisure and ideological reward",
                optionC = "peaceful negotiation",
                optionD = "trial and legal defence",
                correctAnswerIndex = 0,
                explanation = "Room 101 breaks a prisoner by confronting them with their specific, intolerable personal terror (for Winston, carnivorous rats).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2011 • Q19"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2012 LITERATURE IN ENGLISH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "lit_2012_06",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (Shakespeare)",
                year = "2012",
                questionText = "'From forth the fatal loins of these two foes A pair of star-crossed lovers take their life...' These prologue lines indicate that the tragedy in the play is:",
                optionA = "entirely accidental",
                optionB = "predestined by cruel fate",
                optionC = "caused purely by financial greed",
                optionD = "preventable by the civil guards",
                correctAnswerIndex = 1,
                explanation = "'Star-crossed' signifies ill-fated, destined to doom by cosmological alignment and ancient blood feud.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_2012_07",
                subject = "Literature in English",
                topic = "Drama: Romeo and Juliet (Shakespeare)",
                year = "2012",
                questionText = "'O she doth teach the torches to burn bright! It seems she hangs upon the cheek of night A rich jewel in an Ethiop's ear.' Juliet's beauty is portrayed through:",
                optionA = "high-contrast visual imagery comparing radiance to dark night",
                optionB = "auditory resonance",
                optionC = "tactile softness",
                optionD = "ironic exaggeration",
                correctAnswerIndex = 0,
                explanation = "Romeo uses chiaroscuro (light versus darkness) to celebrate Juliet's luminous appearance against the background of the dark ball.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature 2012 • Q7"
            )
        )

        return list
    }
}
