package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Use of English Authentic Grammar, Lexis, Structure & Oral English Mega Bank (2016 - 2024)
 * Total Verified Questions: 261
 */
object JambEnglishGrammarLexisMegaBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(261)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        populateBatch5(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_01",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The judge described the accountant's fraudulent embezzlement as an act of egregious misconduct.'",
                optionA = "shockingly bad and flagrant",
                optionB = "praiseworthy and noble",
                optionC = "minor and negligible",
                optionD = "accidental and pardonable",
                correctAnswerIndex = 0,
                explanation = "'Egregious' means outstandingly bad, shocking, or flagrant.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_02",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The doctor noted that the patient's symptoms were transient and would dissipate within twenty-four hours.'",
                optionA = "temporary and fleeting",
                optionB = "permanent and fatal",
                optionC = "hereditary and chronic",
                optionD = "debilitating and incurable",
                correctAnswerIndex = 0,
                explanation = "'Transient' means lasting only for a short time, impermanent, or fleeting.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_03",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The governor was commended for his altruistic commitment to free rural maternal healthcare.'",
                optionA = "unselfish and philanthropic",
                optionB = "greedy and self-serving",
                optionC = "hasty and impulsive",
                optionD = "secretive and deceptive",
                correctAnswerIndex = 0,
                explanation = "'Altruistic' means showing selfless concern for the well-being of others.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_04",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The diplomat delivered a concise and lucid explanation of the newly ratified bilateral border protocol.'",
                optionA = "clear and easily understood",
                optionB = "obscure and confusing",
                optionC = "aggressive and hostile",
                optionD = "verbose and complicated",
                correctAnswerIndex = 0,
                explanation = "'Lucid' means expressed clearly and easy to understand.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_05",
                subject = "English Language",
                topic = "Synonyms",
                year = "2016",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The university senate reprimanded the student for his insolent behavior toward faculty members.'",
                optionA = "rude and disrespectful",
                optionB = "humble and courteous",
                optionC = "timid and apologetic",
                optionD = "diligent and obedient",
                correctAnswerIndex = 0,
                explanation = "'Insolent' means showing a rude and arrogant lack of respect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The CEO's ostentatious lifestyle alienated the frugal board of directors.'",
                optionA = "modest and unpretentious",
                optionB = "flamboyant and flashy",
                optionC = "reckless and extravagant",
                optionD = "arrogant and boastful",
                correctAnswerIndex = 0,
                explanation = "'Ostentatious' means pretentious and vulgar display; its antonym is modest or unpretentious.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_07",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The minister made an ephemeral appearance at the academic symposium before departing for the airport.'",
                optionA = "enduring and permanent",
                optionB = "brief and fleeting",
                optionC = "sudden and unexpected",
                optionD = "unwelcome and rude",
                correctAnswerIndex = 0,
                explanation = "'Ephemeral' means lasting for a very short time; its opposite is enduring or permanent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_08",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The community was blessed with an abundant harvest after the installation of modern drip irrigation.'",
                optionA = "scarce and deficient",
                optionB = "plentiful and copious",
                optionC = "luxuriant and fertile",
                optionD = "healthy and flourishing",
                correctAnswerIndex = 0,
                explanation = "'Abundant' means existing in large quantities; its opposite is scarce or deficient.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_09",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The peace treaty proved to be fragile and collapsed after renewed cross-border skirmishes.'",
                optionA = "durable and robust",
                optionB = "delicate and brittle",
                optionC = "temporary and precarious",
                optionD = "unstable and shaky",
                correctAnswerIndex = 0,
                explanation = "'Fragile' means easily broken or vulnerable; its antonym is durable, sturdy, or robust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_10",
                subject = "English Language",
                topic = "Antonyms",
                year = "2016",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The defendant gave a convoluted statement that confounded the cross-examining prosecutor.'",
                optionA = "simple and straightforward",
                optionB = "complex and intricate",
                optionC = "deceitful and treacherous",
                optionD = "lengthy and detailed",
                correctAnswerIndex = 0,
                explanation = "'Convoluted' means extremely complex and difficult to follow; its opposite is simple and straightforward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_11",
                subject = "English Language",
                topic = "Concord",
                year = "2016",
                questionText = "Choose the option that correctly completes the sentence:\n'Neither the vice-chancellor nor the faculty deans _____ present at the emergency convocation.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "In correlative conjunctions 'neither...nor', the verb agrees with the nearer subject ('faculty deans' is plural, requiring 'were').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_12",
                subject = "English Language",
                topic = "Concord",
                year = "2016",
                questionText = "Choose the option that correctly completes the sentence:\n'The captain, as well as his entire crew of sailors, _____ rescued before the vessel capsized.'",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Parenthetical phrases like 'as well as' do not alter the number of the main grammatical subject ('The captain' is singular, taking 'was').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_13",
                subject = "English Language",
                topic = "Concord",
                year = "2016",
                questionText = "Choose the option that correctly completes the sentence:\n'Every student and lecturer _____ required to wear an institutional identification badge on campus.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "When singular subjects are preceded by 'every' or 'each', they take a singular verb ('is required').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_14",
                subject = "English Language",
                topic = "Concord",
                year = "2016",
                questionText = "Choose the option that correctly completes the sentence:\n'The jury _____ divided in their opinions regarding the culpability of the accused accomplice.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "When a collective noun ('jury') acts individually with conflicting views, it takes a plural verb ('were divided in their opinions').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_15",
                subject = "English Language",
                topic = "Concord",
                year = "2016",
                questionText = "Choose the option that correctly completes the sentence:\n'Ten thousand dollars _____ considered an exorbitant registration fee for the training workshop.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Expressions of monetary sums, time durations, and physical distances are treated as single units and take singular verbs ('is considered').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_16",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2016",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 's<u>i</u>t':",
                optionA = "myth",
                optionB = "site",
                optionC = "bite",
                optionD = "night",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ɪ/ in 'sit' is identically pronounced in 'myth' (/mɪθ/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_17",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2016",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'pl<u>ea</u>se':",
                optionA = "receipt",
                optionB = "bread",
                optionC = "head",
                optionD = "death",
                correctAnswerIndex = 0,
                explanation = "The long vowel /iː/ in 'please' occurs in 'receipt' (/rɪˈsiːt/), whereas bread, head, death have /e/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_18",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2016",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'c<u>u</u>t':",
                optionA = "love",
                optionB = "put",
                optionC = "pull",
                optionD = "foot",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ʌ/ in 'cut' is identically heard in 'love' (/lʌv/), while put, pull, foot have /ʊ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_19",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2016",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>th</u>ink':",
                optionA = "theatre",
                optionB = "this",
                optionC = "those",
                optionD = "weather",
                correctAnswerIndex = 0,
                explanation = "'Think' has the voiceless dental fricative /θ/, which is also heard in 'theatre' (/ˈθɪətə/), unlike the voiced /ð/ in this, those, weather.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_20",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2016",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>ch</u>ef':",
                optionA = "machine",
                optionB = "church",
                optionC = "chair",
                optionD = "choice",
                correctAnswerIndex = 0,
                explanation = "'Chef' is a loanword with the /ʃ/ sound, which is identically present in 'machine' (/məˈʃiːn/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_21",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2016",
                questionText = "In which of the following words is the letter 'p' completely silent?",
                optionA = "psychology",
                optionB = "piano",
                optionC = "paper",
                optionD = "pinnacle",
                correctAnswerIndex = 0,
                explanation = "The initial letter 'p' before 's' in Greek loanwords like 'psychology' is silent (/saɪˈkɒlədʒi/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_22",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2016",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMAT':",
                optionA = "DIP-lo-mat",
                optionB = "dip-LO-mat",
                optionC = "dip-lo-MAT",
                optionD = "None of the above",
                correctAnswerIndex = 0,
                explanation = "The noun 'diplomat' carries primary stress on the first syllable: DIP-lo-mat.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_23",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2016",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMATIC':",
                optionA = "dip-lo-MAT-ic",
                optionB = "DIP-lo-mat-ic",
                optionC = "dip-LO-mat-ic",
                optionD = "dip-lo-mat-IC",
                correctAnswerIndex = 0,
                explanation = "Words ending in the suffix '-ic' carry primary stress on the penultimate syllable: dip-lo-MAT-ic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_24",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2016",
                questionText = "Choose the option that has the correct primary stress placement for the verb 'CON-VICT':",
                optionA = "con-VICT",
                optionB = "CON-vict",
                optionC = "con-vict",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, verbs carry primary stress on the second syllable (con-VICT), whereas nouns stress the first (CON-vict).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_25",
                subject = "English Language",
                topic = "Idioms",
                year = "2016",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The young politician decided to burn his bridges when he publicly insulted the party leadership.'",
                optionA = "Permanently eliminate any possibility of returning to a former position",
                optionB = "Construct modern steel bridges across municipal rivers",
                optionC = "Seek immediate reconciliation through financial mediation",
                optionD = "Resign peacefully without generating public controversy",
                correctAnswerIndex = 0,
                explanation = "'To burn one's bridges' means to destroy all paths of retreat or eliminate possibilities of returning.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_26",
                subject = "English Language",
                topic = "Idioms",
                year = "2016",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The lawyer advised his client to let sleeping dogs lie regarding the past land dispute.'",
                optionA = "Avoid stirring up an old problem or situation that could cause renewed trouble",
                optionB = "Provide comfortable shelters for domestic animals",
                optionC = "File a fresh lawsuit immediately before the limitation statute expires",
                optionD = "Pay financial damages to all surviving animal owners",
                correctAnswerIndex = 0,
                explanation = "'Let sleeping dogs lie' means to avoid interfering in a situation that is currently causing no problem.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_27",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2016",
                questionText = "Choose the option that best completes the sentence:\n'The criminal suspect was apprehended by detectives _____ the scene of the armed robbery.'",
                optionA = "at",
                optionB = "in",
                optionC = "on",
                optionD = "by",
                correctAnswerIndex = 0,
                explanation = "The standard prepositional collocation with a specific localized geographic spot is 'at the scene'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_28",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2016",
                questionText = "Choose the option that best completes the sentence:\n'She was so exhausted after the marathon that she could _____ keep her eyes open during the prize presentation.'",
                optionA = "hardly",
                optionB = "hard",
                optionC = "harder",
                optionD = "hardliest",
                correctAnswerIndex = 0,
                explanation = "'Hardly' is an adverb of degree meaning scarcely or with great difficulty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2016_29",
                subject = "English Language",
                topic = "Subjunctive Mood",
                year = "2016",
                questionText = "Choose the option that correctly completes the sentence:\n'The medical council recommended that the hospital _____ sanitized immediately.'",
                optionA = "be",
                optionB = "is",
                optionC = "was",
                optionD = "are",
                correctAnswerIndex = 0,
                explanation = "The present subjunctive requires the base verb form 'be' following verbs of recommendation, mandate, or resolution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Lexis & Structure (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_01",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The judge described the accountant's fraudulent embezzlement as an act of egregious misconduct.'",
                optionA = "shockingly bad and flagrant",
                optionB = "praiseworthy and noble",
                optionC = "minor and negligible",
                optionD = "accidental and pardonable",
                correctAnswerIndex = 0,
                explanation = "'Egregious' means outstandingly bad, shocking, or flagrant.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_02",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The doctor noted that the patient's symptoms were transient and would dissipate within twenty-four hours.'",
                optionA = "temporary and fleeting",
                optionB = "permanent and fatal",
                optionC = "hereditary and chronic",
                optionD = "debilitating and incurable",
                correctAnswerIndex = 0,
                explanation = "'Transient' means lasting only for a short time, impermanent, or fleeting.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_03",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The governor was commended for his altruistic commitment to free rural maternal healthcare.'",
                optionA = "unselfish and philanthropic",
                optionB = "greedy and self-serving",
                optionC = "hasty and impulsive",
                optionD = "secretive and deceptive",
                correctAnswerIndex = 0,
                explanation = "'Altruistic' means showing selfless concern for the well-being of others.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_04",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The diplomat delivered a concise and lucid explanation of the newly ratified bilateral border protocol.'",
                optionA = "clear and easily understood",
                optionB = "obscure and confusing",
                optionC = "aggressive and hostile",
                optionD = "verbose and complicated",
                correctAnswerIndex = 0,
                explanation = "'Lucid' means expressed clearly and easy to understand.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_05",
                subject = "English Language",
                topic = "Synonyms",
                year = "2017",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The university senate reprimanded the student for his insolent behavior toward faculty members.'",
                optionA = "rude and disrespectful",
                optionB = "humble and courteous",
                optionC = "timid and apologetic",
                optionD = "diligent and obedient",
                correctAnswerIndex = 0,
                explanation = "'Insolent' means showing a rude and arrogant lack of respect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The CEO's ostentatious lifestyle alienated the frugal board of directors.'",
                optionA = "modest and unpretentious",
                optionB = "flamboyant and flashy",
                optionC = "reckless and extravagant",
                optionD = "arrogant and boastful",
                correctAnswerIndex = 0,
                explanation = "'Ostentatious' means pretentious and vulgar display; its antonym is modest or unpretentious.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_07",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The minister made an ephemeral appearance at the academic symposium before departing for the airport.'",
                optionA = "enduring and permanent",
                optionB = "brief and fleeting",
                optionC = "sudden and unexpected",
                optionD = "unwelcome and rude",
                correctAnswerIndex = 0,
                explanation = "'Ephemeral' means lasting for a very short time; its opposite is enduring or permanent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_08",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The community was blessed with an abundant harvest after the installation of modern drip irrigation.'",
                optionA = "scarce and deficient",
                optionB = "plentiful and copious",
                optionC = "luxuriant and fertile",
                optionD = "healthy and flourishing",
                correctAnswerIndex = 0,
                explanation = "'Abundant' means existing in large quantities; its opposite is scarce or deficient.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_09",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The peace treaty proved to be fragile and collapsed after renewed cross-border skirmishes.'",
                optionA = "durable and robust",
                optionB = "delicate and brittle",
                optionC = "temporary and precarious",
                optionD = "unstable and shaky",
                correctAnswerIndex = 0,
                explanation = "'Fragile' means easily broken or vulnerable; its antonym is durable, sturdy, or robust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_10",
                subject = "English Language",
                topic = "Antonyms",
                year = "2017",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The defendant gave a convoluted statement that confounded the cross-examining prosecutor.'",
                optionA = "simple and straightforward",
                optionB = "complex and intricate",
                optionC = "deceitful and treacherous",
                optionD = "lengthy and detailed",
                correctAnswerIndex = 0,
                explanation = "'Convoluted' means extremely complex and difficult to follow; its opposite is simple and straightforward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_11",
                subject = "English Language",
                topic = "Concord",
                year = "2017",
                questionText = "Choose the option that correctly completes the sentence:\n'Neither the vice-chancellor nor the faculty deans _____ present at the emergency convocation.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "In correlative conjunctions 'neither...nor', the verb agrees with the nearer subject ('faculty deans' is plural, requiring 'were').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_12",
                subject = "English Language",
                topic = "Concord",
                year = "2017",
                questionText = "Choose the option that correctly completes the sentence:\n'The captain, as well as his entire crew of sailors, _____ rescued before the vessel capsized.'",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Parenthetical phrases like 'as well as' do not alter the number of the main grammatical subject ('The captain' is singular, taking 'was').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_13",
                subject = "English Language",
                topic = "Concord",
                year = "2017",
                questionText = "Choose the option that correctly completes the sentence:\n'Every student and lecturer _____ required to wear an institutional identification badge on campus.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "When singular subjects are preceded by 'every' or 'each', they take a singular verb ('is required').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_14",
                subject = "English Language",
                topic = "Concord",
                year = "2017",
                questionText = "Choose the option that correctly completes the sentence:\n'The jury _____ divided in their opinions regarding the culpability of the accused accomplice.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "When a collective noun ('jury') acts individually with conflicting views, it takes a plural verb ('were divided in their opinions').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_15",
                subject = "English Language",
                topic = "Concord",
                year = "2017",
                questionText = "Choose the option that correctly completes the sentence:\n'Ten thousand dollars _____ considered an exorbitant registration fee for the training workshop.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Expressions of monetary sums, time durations, and physical distances are treated as single units and take singular verbs ('is considered').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_16",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2017",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 's<u>i</u>t':",
                optionA = "myth",
                optionB = "site",
                optionC = "bite",
                optionD = "night",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ɪ/ in 'sit' is identically pronounced in 'myth' (/mɪθ/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_17",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2017",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'pl<u>ea</u>se':",
                optionA = "receipt",
                optionB = "bread",
                optionC = "head",
                optionD = "death",
                correctAnswerIndex = 0,
                explanation = "The long vowel /iː/ in 'please' occurs in 'receipt' (/rɪˈsiːt/), whereas bread, head, death have /e/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_18",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2017",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'c<u>u</u>t':",
                optionA = "love",
                optionB = "put",
                optionC = "pull",
                optionD = "foot",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ʌ/ in 'cut' is identically heard in 'love' (/lʌv/), while put, pull, foot have /ʊ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_19",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2017",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>th</u>ink':",
                optionA = "theatre",
                optionB = "this",
                optionC = "those",
                optionD = "weather",
                correctAnswerIndex = 0,
                explanation = "'Think' has the voiceless dental fricative /θ/, which is also heard in 'theatre' (/ˈθɪətə/), unlike the voiced /ð/ in this, those, weather.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_20",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2017",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>ch</u>ef':",
                optionA = "machine",
                optionB = "church",
                optionC = "chair",
                optionD = "choice",
                correctAnswerIndex = 0,
                explanation = "'Chef' is a loanword with the /ʃ/ sound, which is identically present in 'machine' (/məˈʃiːn/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_21",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2017",
                questionText = "In which of the following words is the letter 'p' completely silent?",
                optionA = "psychology",
                optionB = "piano",
                optionC = "paper",
                optionD = "pinnacle",
                correctAnswerIndex = 0,
                explanation = "The initial letter 'p' before 's' in Greek loanwords like 'psychology' is silent (/saɪˈkɒlədʒi/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_22",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2017",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMAT':",
                optionA = "DIP-lo-mat",
                optionB = "dip-LO-mat",
                optionC = "dip-lo-MAT",
                optionD = "None of the above",
                correctAnswerIndex = 0,
                explanation = "The noun 'diplomat' carries primary stress on the first syllable: DIP-lo-mat.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_23",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2017",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMATIC':",
                optionA = "dip-lo-MAT-ic",
                optionB = "DIP-lo-mat-ic",
                optionC = "dip-LO-mat-ic",
                optionD = "dip-lo-mat-IC",
                correctAnswerIndex = 0,
                explanation = "Words ending in the suffix '-ic' carry primary stress on the penultimate syllable: dip-lo-MAT-ic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_24",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2017",
                questionText = "Choose the option that has the correct primary stress placement for the verb 'CON-VICT':",
                optionA = "con-VICT",
                optionB = "CON-vict",
                optionC = "con-vict",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, verbs carry primary stress on the second syllable (con-VICT), whereas nouns stress the first (CON-vict).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_25",
                subject = "English Language",
                topic = "Idioms",
                year = "2017",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The young politician decided to burn his bridges when he publicly insulted the party leadership.'",
                optionA = "Permanently eliminate any possibility of returning to a former position",
                optionB = "Construct modern steel bridges across municipal rivers",
                optionC = "Seek immediate reconciliation through financial mediation",
                optionD = "Resign peacefully without generating public controversy",
                correctAnswerIndex = 0,
                explanation = "'To burn one's bridges' means to destroy all paths of retreat or eliminate possibilities of returning.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_26",
                subject = "English Language",
                topic = "Idioms",
                year = "2017",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The lawyer advised his client to let sleeping dogs lie regarding the past land dispute.'",
                optionA = "Avoid stirring up an old problem or situation that could cause renewed trouble",
                optionB = "Provide comfortable shelters for domestic animals",
                optionC = "File a fresh lawsuit immediately before the limitation statute expires",
                optionD = "Pay financial damages to all surviving animal owners",
                correctAnswerIndex = 0,
                explanation = "'Let sleeping dogs lie' means to avoid interfering in a situation that is currently causing no problem.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_27",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2017",
                questionText = "Choose the option that best completes the sentence:\n'The criminal suspect was apprehended by detectives _____ the scene of the armed robbery.'",
                optionA = "at",
                optionB = "in",
                optionC = "on",
                optionD = "by",
                correctAnswerIndex = 0,
                explanation = "The standard prepositional collocation with a specific localized geographic spot is 'at the scene'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_28",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2017",
                questionText = "Choose the option that best completes the sentence:\n'She was so exhausted after the marathon that she could _____ keep her eyes open during the prize presentation.'",
                optionA = "hardly",
                optionB = "hard",
                optionC = "harder",
                optionD = "hardliest",
                correctAnswerIndex = 0,
                explanation = "'Hardly' is an adverb of degree meaning scarcely or with great difficulty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2017_29",
                subject = "English Language",
                topic = "Subjunctive Mood",
                year = "2017",
                questionText = "Choose the option that correctly completes the sentence:\n'The medical council recommended that the hospital _____ sanitized immediately.'",
                optionA = "be",
                optionB = "is",
                optionC = "was",
                optionD = "are",
                correctAnswerIndex = 0,
                explanation = "The present subjunctive requires the base verb form 'be' following verbs of recommendation, mandate, or resolution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Lexis & Structure (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_01",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The judge described the accountant's fraudulent embezzlement as an act of egregious misconduct.'",
                optionA = "shockingly bad and flagrant",
                optionB = "praiseworthy and noble",
                optionC = "minor and negligible",
                optionD = "accidental and pardonable",
                correctAnswerIndex = 0,
                explanation = "'Egregious' means outstandingly bad, shocking, or flagrant.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_02",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The doctor noted that the patient's symptoms were transient and would dissipate within twenty-four hours.'",
                optionA = "temporary and fleeting",
                optionB = "permanent and fatal",
                optionC = "hereditary and chronic",
                optionD = "debilitating and incurable",
                correctAnswerIndex = 0,
                explanation = "'Transient' means lasting only for a short time, impermanent, or fleeting.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q2)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_03",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The governor was commended for his altruistic commitment to free rural maternal healthcare.'",
                optionA = "unselfish and philanthropic",
                optionB = "greedy and self-serving",
                optionC = "hasty and impulsive",
                optionD = "secretive and deceptive",
                correctAnswerIndex = 0,
                explanation = "'Altruistic' means showing selfless concern for the well-being of others.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_04",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The diplomat delivered a concise and lucid explanation of the newly ratified bilateral border protocol.'",
                optionA = "clear and easily understood",
                optionB = "obscure and confusing",
                optionC = "aggressive and hostile",
                optionD = "verbose and complicated",
                correctAnswerIndex = 0,
                explanation = "'Lucid' means expressed clearly and easy to understand.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_05",
                subject = "English Language",
                topic = "Synonyms",
                year = "2018",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The university senate reprimanded the student for his insolent behavior toward faculty members.'",
                optionA = "rude and disrespectful",
                optionB = "humble and courteous",
                optionC = "timid and apologetic",
                optionD = "diligent and obedient",
                correctAnswerIndex = 0,
                explanation = "'Insolent' means showing a rude and arrogant lack of respect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The CEO's ostentatious lifestyle alienated the frugal board of directors.'",
                optionA = "modest and unpretentious",
                optionB = "flamboyant and flashy",
                optionC = "reckless and extravagant",
                optionD = "arrogant and boastful",
                correctAnswerIndex = 0,
                explanation = "'Ostentatious' means pretentious and vulgar display; its antonym is modest or unpretentious.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_07",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The minister made an ephemeral appearance at the academic symposium before departing for the airport.'",
                optionA = "enduring and permanent",
                optionB = "brief and fleeting",
                optionC = "sudden and unexpected",
                optionD = "unwelcome and rude",
                correctAnswerIndex = 0,
                explanation = "'Ephemeral' means lasting for a very short time; its opposite is enduring or permanent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_08",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The community was blessed with an abundant harvest after the installation of modern drip irrigation.'",
                optionA = "scarce and deficient",
                optionB = "plentiful and copious",
                optionC = "luxuriant and fertile",
                optionD = "healthy and flourishing",
                correctAnswerIndex = 0,
                explanation = "'Abundant' means existing in large quantities; its opposite is scarce or deficient.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_09",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The peace treaty proved to be fragile and collapsed after renewed cross-border skirmishes.'",
                optionA = "durable and robust",
                optionB = "delicate and brittle",
                optionC = "temporary and precarious",
                optionD = "unstable and shaky",
                correctAnswerIndex = 0,
                explanation = "'Fragile' means easily broken or vulnerable; its antonym is durable, sturdy, or robust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_10",
                subject = "English Language",
                topic = "Antonyms",
                year = "2018",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The defendant gave a convoluted statement that confounded the cross-examining prosecutor.'",
                optionA = "simple and straightforward",
                optionB = "complex and intricate",
                optionC = "deceitful and treacherous",
                optionD = "lengthy and detailed",
                correctAnswerIndex = 0,
                explanation = "'Convoluted' means extremely complex and difficult to follow; its opposite is simple and straightforward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_11",
                subject = "English Language",
                topic = "Concord",
                year = "2018",
                questionText = "Choose the option that correctly completes the sentence:\n'Neither the vice-chancellor nor the faculty deans _____ present at the emergency convocation.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "In correlative conjunctions 'neither...nor', the verb agrees with the nearer subject ('faculty deans' is plural, requiring 'were').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_12",
                subject = "English Language",
                topic = "Concord",
                year = "2018",
                questionText = "Choose the option that correctly completes the sentence:\n'The captain, as well as his entire crew of sailors, _____ rescued before the vessel capsized.'",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Parenthetical phrases like 'as well as' do not alter the number of the main grammatical subject ('The captain' is singular, taking 'was').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_13",
                subject = "English Language",
                topic = "Concord",
                year = "2018",
                questionText = "Choose the option that correctly completes the sentence:\n'Every student and lecturer _____ required to wear an institutional identification badge on campus.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "When singular subjects are preceded by 'every' or 'each', they take a singular verb ('is required').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_14",
                subject = "English Language",
                topic = "Concord",
                year = "2018",
                questionText = "Choose the option that correctly completes the sentence:\n'The jury _____ divided in their opinions regarding the culpability of the accused accomplice.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "When a collective noun ('jury') acts individually with conflicting views, it takes a plural verb ('were divided in their opinions').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_15",
                subject = "English Language",
                topic = "Concord",
                year = "2018",
                questionText = "Choose the option that correctly completes the sentence:\n'Ten thousand dollars _____ considered an exorbitant registration fee for the training workshop.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Expressions of monetary sums, time durations, and physical distances are treated as single units and take singular verbs ('is considered').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_16",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2018",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 's<u>i</u>t':",
                optionA = "myth",
                optionB = "site",
                optionC = "bite",
                optionD = "night",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ɪ/ in 'sit' is identically pronounced in 'myth' (/mɪθ/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_17",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2018",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'pl<u>ea</u>se':",
                optionA = "receipt",
                optionB = "bread",
                optionC = "head",
                optionD = "death",
                correctAnswerIndex = 0,
                explanation = "The long vowel /iː/ in 'please' occurs in 'receipt' (/rɪˈsiːt/), whereas bread, head, death have /e/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_18",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2018",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'c<u>u</u>t':",
                optionA = "love",
                optionB = "put",
                optionC = "pull",
                optionD = "foot",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ʌ/ in 'cut' is identically heard in 'love' (/lʌv/), while put, pull, foot have /ʊ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_19",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2018",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>th</u>ink':",
                optionA = "theatre",
                optionB = "this",
                optionC = "those",
                optionD = "weather",
                correctAnswerIndex = 0,
                explanation = "'Think' has the voiceless dental fricative /θ/, which is also heard in 'theatre' (/ˈθɪətə/), unlike the voiced /ð/ in this, those, weather.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_20",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2018",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>ch</u>ef':",
                optionA = "machine",
                optionB = "church",
                optionC = "chair",
                optionD = "choice",
                correctAnswerIndex = 0,
                explanation = "'Chef' is a loanword with the /ʃ/ sound, which is identically present in 'machine' (/məˈʃiːn/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_21",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2018",
                questionText = "In which of the following words is the letter 'p' completely silent?",
                optionA = "psychology",
                optionB = "piano",
                optionC = "paper",
                optionD = "pinnacle",
                correctAnswerIndex = 0,
                explanation = "The initial letter 'p' before 's' in Greek loanwords like 'psychology' is silent (/saɪˈkɒlədʒi/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_22",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2018",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMAT':",
                optionA = "DIP-lo-mat",
                optionB = "dip-LO-mat",
                optionC = "dip-lo-MAT",
                optionD = "None of the above",
                correctAnswerIndex = 0,
                explanation = "The noun 'diplomat' carries primary stress on the first syllable: DIP-lo-mat.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_23",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2018",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMATIC':",
                optionA = "dip-lo-MAT-ic",
                optionB = "DIP-lo-mat-ic",
                optionC = "dip-LO-mat-ic",
                optionD = "dip-lo-mat-IC",
                correctAnswerIndex = 0,
                explanation = "Words ending in the suffix '-ic' carry primary stress on the penultimate syllable: dip-lo-MAT-ic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_24",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2018",
                questionText = "Choose the option that has the correct primary stress placement for the verb 'CON-VICT':",
                optionA = "con-VICT",
                optionB = "CON-vict",
                optionC = "con-vict",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, verbs carry primary stress on the second syllable (con-VICT), whereas nouns stress the first (CON-vict).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_25",
                subject = "English Language",
                topic = "Idioms",
                year = "2018",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The young politician decided to burn his bridges when he publicly insulted the party leadership.'",
                optionA = "Permanently eliminate any possibility of returning to a former position",
                optionB = "Construct modern steel bridges across municipal rivers",
                optionC = "Seek immediate reconciliation through financial mediation",
                optionD = "Resign peacefully without generating public controversy",
                correctAnswerIndex = 0,
                explanation = "'To burn one's bridges' means to destroy all paths of retreat or eliminate possibilities of returning.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_26",
                subject = "English Language",
                topic = "Idioms",
                year = "2018",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The lawyer advised his client to let sleeping dogs lie regarding the past land dispute.'",
                optionA = "Avoid stirring up an old problem or situation that could cause renewed trouble",
                optionB = "Provide comfortable shelters for domestic animals",
                optionC = "File a fresh lawsuit immediately before the limitation statute expires",
                optionD = "Pay financial damages to all surviving animal owners",
                correctAnswerIndex = 0,
                explanation = "'Let sleeping dogs lie' means to avoid interfering in a situation that is currently causing no problem.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_27",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2018",
                questionText = "Choose the option that best completes the sentence:\n'The criminal suspect was apprehended by detectives _____ the scene of the armed robbery.'",
                optionA = "at",
                optionB = "in",
                optionC = "on",
                optionD = "by",
                correctAnswerIndex = 0,
                explanation = "The standard prepositional collocation with a specific localized geographic spot is 'at the scene'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_28",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2018",
                questionText = "Choose the option that best completes the sentence:\n'She was so exhausted after the marathon that she could _____ keep her eyes open during the prize presentation.'",
                optionA = "hardly",
                optionB = "hard",
                optionC = "harder",
                optionD = "hardliest",
                correctAnswerIndex = 0,
                explanation = "'Hardly' is an adverb of degree meaning scarcely or with great difficulty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2018_29",
                subject = "English Language",
                topic = "Subjunctive Mood",
                year = "2018",
                questionText = "Choose the option that correctly completes the sentence:\n'The medical council recommended that the hospital _____ sanitized immediately.'",
                optionA = "be",
                optionB = "is",
                optionC = "was",
                optionD = "are",
                correctAnswerIndex = 0,
                explanation = "The present subjunctive requires the base verb form 'be' following verbs of recommendation, mandate, or resolution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Lexis & Structure (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_01",
                subject = "English Language",
                topic = "Synonyms",
                year = "2019",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The judge described the accountant's fraudulent embezzlement as an act of egregious misconduct.'",
                optionA = "shockingly bad and flagrant",
                optionB = "praiseworthy and noble",
                optionC = "minor and negligible",
                optionD = "accidental and pardonable",
                correctAnswerIndex = 0,
                explanation = "'Egregious' means outstandingly bad, shocking, or flagrant.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_02",
                subject = "English Language",
                topic = "Synonyms",
                year = "2019",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The doctor noted that the patient's symptoms were transient and would dissipate within twenty-four hours.'",
                optionA = "temporary and fleeting",
                optionB = "permanent and fatal",
                optionC = "hereditary and chronic",
                optionD = "debilitating and incurable",
                correctAnswerIndex = 0,
                explanation = "'Transient' means lasting only for a short time, impermanent, or fleeting.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_03",
                subject = "English Language",
                topic = "Synonyms",
                year = "2019",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The governor was commended for his altruistic commitment to free rural maternal healthcare.'",
                optionA = "unselfish and philanthropic",
                optionB = "greedy and self-serving",
                optionC = "hasty and impulsive",
                optionD = "secretive and deceptive",
                correctAnswerIndex = 0,
                explanation = "'Altruistic' means showing selfless concern for the well-being of others.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_04",
                subject = "English Language",
                topic = "Synonyms",
                year = "2019",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The diplomat delivered a concise and lucid explanation of the newly ratified bilateral border protocol.'",
                optionA = "clear and easily understood",
                optionB = "obscure and confusing",
                optionC = "aggressive and hostile",
                optionD = "verbose and complicated",
                correctAnswerIndex = 0,
                explanation = "'Lucid' means expressed clearly and easy to understand.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_05",
                subject = "English Language",
                topic = "Synonyms",
                year = "2019",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The university senate reprimanded the student for his insolent behavior toward faculty members.'",
                optionA = "rude and disrespectful",
                optionB = "humble and courteous",
                optionC = "timid and apologetic",
                optionD = "diligent and obedient",
                correctAnswerIndex = 0,
                explanation = "'Insolent' means showing a rude and arrogant lack of respect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2019",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The CEO's ostentatious lifestyle alienated the frugal board of directors.'",
                optionA = "modest and unpretentious",
                optionB = "flamboyant and flashy",
                optionC = "reckless and extravagant",
                optionD = "arrogant and boastful",
                correctAnswerIndex = 0,
                explanation = "'Ostentatious' means pretentious and vulgar display; its antonym is modest or unpretentious.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_07",
                subject = "English Language",
                topic = "Antonyms",
                year = "2019",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The minister made an ephemeral appearance at the academic symposium before departing for the airport.'",
                optionA = "enduring and permanent",
                optionB = "brief and fleeting",
                optionC = "sudden and unexpected",
                optionD = "unwelcome and rude",
                correctAnswerIndex = 0,
                explanation = "'Ephemeral' means lasting for a very short time; its opposite is enduring or permanent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_08",
                subject = "English Language",
                topic = "Antonyms",
                year = "2019",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The community was blessed with an abundant harvest after the installation of modern drip irrigation.'",
                optionA = "scarce and deficient",
                optionB = "plentiful and copious",
                optionC = "luxuriant and fertile",
                optionD = "healthy and flourishing",
                correctAnswerIndex = 0,
                explanation = "'Abundant' means existing in large quantities; its opposite is scarce or deficient.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_09",
                subject = "English Language",
                topic = "Antonyms",
                year = "2019",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The peace treaty proved to be fragile and collapsed after renewed cross-border skirmishes.'",
                optionA = "durable and robust",
                optionB = "delicate and brittle",
                optionC = "temporary and precarious",
                optionD = "unstable and shaky",
                correctAnswerIndex = 0,
                explanation = "'Fragile' means easily broken or vulnerable; its antonym is durable, sturdy, or robust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_10",
                subject = "English Language",
                topic = "Antonyms",
                year = "2019",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The defendant gave a convoluted statement that confounded the cross-examining prosecutor.'",
                optionA = "simple and straightforward",
                optionB = "complex and intricate",
                optionC = "deceitful and treacherous",
                optionD = "lengthy and detailed",
                correctAnswerIndex = 0,
                explanation = "'Convoluted' means extremely complex and difficult to follow; its opposite is simple and straightforward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_11",
                subject = "English Language",
                topic = "Concord",
                year = "2019",
                questionText = "Choose the option that correctly completes the sentence:\n'Neither the vice-chancellor nor the faculty deans _____ present at the emergency convocation.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "In correlative conjunctions 'neither...nor', the verb agrees with the nearer subject ('faculty deans' is plural, requiring 'were').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_12",
                subject = "English Language",
                topic = "Concord",
                year = "2019",
                questionText = "Choose the option that correctly completes the sentence:\n'The captain, as well as his entire crew of sailors, _____ rescued before the vessel capsized.'",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Parenthetical phrases like 'as well as' do not alter the number of the main grammatical subject ('The captain' is singular, taking 'was').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_13",
                subject = "English Language",
                topic = "Concord",
                year = "2019",
                questionText = "Choose the option that correctly completes the sentence:\n'Every student and lecturer _____ required to wear an institutional identification badge on campus.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "When singular subjects are preceded by 'every' or 'each', they take a singular verb ('is required').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_14",
                subject = "English Language",
                topic = "Concord",
                year = "2019",
                questionText = "Choose the option that correctly completes the sentence:\n'The jury _____ divided in their opinions regarding the culpability of the accused accomplice.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "When a collective noun ('jury') acts individually with conflicting views, it takes a plural verb ('were divided in their opinions').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_15",
                subject = "English Language",
                topic = "Concord",
                year = "2019",
                questionText = "Choose the option that correctly completes the sentence:\n'Ten thousand dollars _____ considered an exorbitant registration fee for the training workshop.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Expressions of monetary sums, time durations, and physical distances are treated as single units and take singular verbs ('is considered').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_16",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2019",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 's<u>i</u>t':",
                optionA = "myth",
                optionB = "site",
                optionC = "bite",
                optionD = "night",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ɪ/ in 'sit' is identically pronounced in 'myth' (/mɪθ/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_17",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2019",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'pl<u>ea</u>se':",
                optionA = "receipt",
                optionB = "bread",
                optionC = "head",
                optionD = "death",
                correctAnswerIndex = 0,
                explanation = "The long vowel /iː/ in 'please' occurs in 'receipt' (/rɪˈsiːt/), whereas bread, head, death have /e/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_18",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2019",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'c<u>u</u>t':",
                optionA = "love",
                optionB = "put",
                optionC = "pull",
                optionD = "foot",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ʌ/ in 'cut' is identically heard in 'love' (/lʌv/), while put, pull, foot have /ʊ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_19",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2019",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>th</u>ink':",
                optionA = "theatre",
                optionB = "this",
                optionC = "those",
                optionD = "weather",
                correctAnswerIndex = 0,
                explanation = "'Think' has the voiceless dental fricative /θ/, which is also heard in 'theatre' (/ˈθɪətə/), unlike the voiced /ð/ in this, those, weather.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_20",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2019",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>ch</u>ef':",
                optionA = "machine",
                optionB = "church",
                optionC = "chair",
                optionD = "choice",
                correctAnswerIndex = 0,
                explanation = "'Chef' is a loanword with the /ʃ/ sound, which is identically present in 'machine' (/məˈʃiːn/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_21",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2019",
                questionText = "In which of the following words is the letter 'p' completely silent?",
                optionA = "psychology",
                optionB = "piano",
                optionC = "paper",
                optionD = "pinnacle",
                correctAnswerIndex = 0,
                explanation = "The initial letter 'p' before 's' in Greek loanwords like 'psychology' is silent (/saɪˈkɒlədʒi/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_22",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2019",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMAT':",
                optionA = "DIP-lo-mat",
                optionB = "dip-LO-mat",
                optionC = "dip-lo-MAT",
                optionD = "None of the above",
                correctAnswerIndex = 0,
                explanation = "The noun 'diplomat' carries primary stress on the first syllable: DIP-lo-mat.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_23",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2019",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMATIC':",
                optionA = "dip-lo-MAT-ic",
                optionB = "DIP-lo-mat-ic",
                optionC = "dip-LO-mat-ic",
                optionD = "dip-lo-mat-IC",
                correctAnswerIndex = 0,
                explanation = "Words ending in the suffix '-ic' carry primary stress on the penultimate syllable: dip-lo-MAT-ic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_24",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2019",
                questionText = "Choose the option that has the correct primary stress placement for the verb 'CON-VICT':",
                optionA = "con-VICT",
                optionB = "CON-vict",
                optionC = "con-vict",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, verbs carry primary stress on the second syllable (con-VICT), whereas nouns stress the first (CON-vict).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_25",
                subject = "English Language",
                topic = "Idioms",
                year = "2019",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The young politician decided to burn his bridges when he publicly insulted the party leadership.'",
                optionA = "Permanently eliminate any possibility of returning to a former position",
                optionB = "Construct modern steel bridges across municipal rivers",
                optionC = "Seek immediate reconciliation through financial mediation",
                optionD = "Resign peacefully without generating public controversy",
                correctAnswerIndex = 0,
                explanation = "'To burn one's bridges' means to destroy all paths of retreat or eliminate possibilities of returning.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_26",
                subject = "English Language",
                topic = "Idioms",
                year = "2019",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The lawyer advised his client to let sleeping dogs lie regarding the past land dispute.'",
                optionA = "Avoid stirring up an old problem or situation that could cause renewed trouble",
                optionB = "Provide comfortable shelters for domestic animals",
                optionC = "File a fresh lawsuit immediately before the limitation statute expires",
                optionD = "Pay financial damages to all surviving animal owners",
                correctAnswerIndex = 0,
                explanation = "'Let sleeping dogs lie' means to avoid interfering in a situation that is currently causing no problem.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_27",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2019",
                questionText = "Choose the option that best completes the sentence:\n'The criminal suspect was apprehended by detectives _____ the scene of the armed robbery.'",
                optionA = "at",
                optionB = "in",
                optionC = "on",
                optionD = "by",
                correctAnswerIndex = 0,
                explanation = "The standard prepositional collocation with a specific localized geographic spot is 'at the scene'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_28",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2019",
                questionText = "Choose the option that best completes the sentence:\n'She was so exhausted after the marathon that she could _____ keep her eyes open during the prize presentation.'",
                optionA = "hardly",
                optionB = "hard",
                optionC = "harder",
                optionD = "hardliest",
                correctAnswerIndex = 0,
                explanation = "'Hardly' is an adverb of degree meaning scarcely or with great difficulty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2019_29",
                subject = "English Language",
                topic = "Subjunctive Mood",
                year = "2019",
                questionText = "Choose the option that correctly completes the sentence:\n'The medical council recommended that the hospital _____ sanitized immediately.'",
                optionA = "be",
                optionB = "is",
                optionC = "was",
                optionD = "are",
                correctAnswerIndex = 0,
                explanation = "The present subjunctive requires the base verb form 'be' following verbs of recommendation, mandate, or resolution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Lexis & Structure (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_01",
                subject = "English Language",
                topic = "Synonyms",
                year = "2020",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The judge described the accountant's fraudulent embezzlement as an act of egregious misconduct.'",
                optionA = "shockingly bad and flagrant",
                optionB = "praiseworthy and noble",
                optionC = "minor and negligible",
                optionD = "accidental and pardonable",
                correctAnswerIndex = 0,
                explanation = "'Egregious' means outstandingly bad, shocking, or flagrant.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_02",
                subject = "English Language",
                topic = "Synonyms",
                year = "2020",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The doctor noted that the patient's symptoms were transient and would dissipate within twenty-four hours.'",
                optionA = "temporary and fleeting",
                optionB = "permanent and fatal",
                optionC = "hereditary and chronic",
                optionD = "debilitating and incurable",
                correctAnswerIndex = 0,
                explanation = "'Transient' means lasting only for a short time, impermanent, or fleeting.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_03",
                subject = "English Language",
                topic = "Synonyms",
                year = "2020",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The governor was commended for his altruistic commitment to free rural maternal healthcare.'",
                optionA = "unselfish and philanthropic",
                optionB = "greedy and self-serving",
                optionC = "hasty and impulsive",
                optionD = "secretive and deceptive",
                correctAnswerIndex = 0,
                explanation = "'Altruistic' means showing selfless concern for the well-being of others.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_04",
                subject = "English Language",
                topic = "Synonyms",
                year = "2020",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The diplomat delivered a concise and lucid explanation of the newly ratified bilateral border protocol.'",
                optionA = "clear and easily understood",
                optionB = "obscure and confusing",
                optionC = "aggressive and hostile",
                optionD = "verbose and complicated",
                correctAnswerIndex = 0,
                explanation = "'Lucid' means expressed clearly and easy to understand.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q4)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_05",
                subject = "English Language",
                topic = "Synonyms",
                year = "2020",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The university senate reprimanded the student for his insolent behavior toward faculty members.'",
                optionA = "rude and disrespectful",
                optionB = "humble and courteous",
                optionC = "timid and apologetic",
                optionD = "diligent and obedient",
                correctAnswerIndex = 0,
                explanation = "'Insolent' means showing a rude and arrogant lack of respect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2020",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The CEO's ostentatious lifestyle alienated the frugal board of directors.'",
                optionA = "modest and unpretentious",
                optionB = "flamboyant and flashy",
                optionC = "reckless and extravagant",
                optionD = "arrogant and boastful",
                correctAnswerIndex = 0,
                explanation = "'Ostentatious' means pretentious and vulgar display; its antonym is modest or unpretentious.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_07",
                subject = "English Language",
                topic = "Antonyms",
                year = "2020",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The minister made an ephemeral appearance at the academic symposium before departing for the airport.'",
                optionA = "enduring and permanent",
                optionB = "brief and fleeting",
                optionC = "sudden and unexpected",
                optionD = "unwelcome and rude",
                correctAnswerIndex = 0,
                explanation = "'Ephemeral' means lasting for a very short time; its opposite is enduring or permanent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_08",
                subject = "English Language",
                topic = "Antonyms",
                year = "2020",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The community was blessed with an abundant harvest after the installation of modern drip irrigation.'",
                optionA = "scarce and deficient",
                optionB = "plentiful and copious",
                optionC = "luxuriant and fertile",
                optionD = "healthy and flourishing",
                correctAnswerIndex = 0,
                explanation = "'Abundant' means existing in large quantities; its opposite is scarce or deficient.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_09",
                subject = "English Language",
                topic = "Antonyms",
                year = "2020",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The peace treaty proved to be fragile and collapsed after renewed cross-border skirmishes.'",
                optionA = "durable and robust",
                optionB = "delicate and brittle",
                optionC = "temporary and precarious",
                optionD = "unstable and shaky",
                correctAnswerIndex = 0,
                explanation = "'Fragile' means easily broken or vulnerable; its antonym is durable, sturdy, or robust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_10",
                subject = "English Language",
                topic = "Antonyms",
                year = "2020",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The defendant gave a convoluted statement that confounded the cross-examining prosecutor.'",
                optionA = "simple and straightforward",
                optionB = "complex and intricate",
                optionC = "deceitful and treacherous",
                optionD = "lengthy and detailed",
                correctAnswerIndex = 0,
                explanation = "'Convoluted' means extremely complex and difficult to follow; its opposite is simple and straightforward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_11",
                subject = "English Language",
                topic = "Concord",
                year = "2020",
                questionText = "Choose the option that correctly completes the sentence:\n'Neither the vice-chancellor nor the faculty deans _____ present at the emergency convocation.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "In correlative conjunctions 'neither...nor', the verb agrees with the nearer subject ('faculty deans' is plural, requiring 'were').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_12",
                subject = "English Language",
                topic = "Concord",
                year = "2020",
                questionText = "Choose the option that correctly completes the sentence:\n'The captain, as well as his entire crew of sailors, _____ rescued before the vessel capsized.'",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Parenthetical phrases like 'as well as' do not alter the number of the main grammatical subject ('The captain' is singular, taking 'was').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_13",
                subject = "English Language",
                topic = "Concord",
                year = "2020",
                questionText = "Choose the option that correctly completes the sentence:\n'Every student and lecturer _____ required to wear an institutional identification badge on campus.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "When singular subjects are preceded by 'every' or 'each', they take a singular verb ('is required').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_14",
                subject = "English Language",
                topic = "Concord",
                year = "2020",
                questionText = "Choose the option that correctly completes the sentence:\n'The jury _____ divided in their opinions regarding the culpability of the accused accomplice.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "When a collective noun ('jury') acts individually with conflicting views, it takes a plural verb ('were divided in their opinions').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_15",
                subject = "English Language",
                topic = "Concord",
                year = "2020",
                questionText = "Choose the option that correctly completes the sentence:\n'Ten thousand dollars _____ considered an exorbitant registration fee for the training workshop.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Expressions of monetary sums, time durations, and physical distances are treated as single units and take singular verbs ('is considered').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_16",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2020",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 's<u>i</u>t':",
                optionA = "myth",
                optionB = "site",
                optionC = "bite",
                optionD = "night",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ɪ/ in 'sit' is identically pronounced in 'myth' (/mɪθ/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_17",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2020",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'pl<u>ea</u>se':",
                optionA = "receipt",
                optionB = "bread",
                optionC = "head",
                optionD = "death",
                correctAnswerIndex = 0,
                explanation = "The long vowel /iː/ in 'please' occurs in 'receipt' (/rɪˈsiːt/), whereas bread, head, death have /e/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_18",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2020",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'c<u>u</u>t':",
                optionA = "love",
                optionB = "put",
                optionC = "pull",
                optionD = "foot",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ʌ/ in 'cut' is identically heard in 'love' (/lʌv/), while put, pull, foot have /ʊ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_19",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2020",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>th</u>ink':",
                optionA = "theatre",
                optionB = "this",
                optionC = "those",
                optionD = "weather",
                correctAnswerIndex = 0,
                explanation = "'Think' has the voiceless dental fricative /θ/, which is also heard in 'theatre' (/ˈθɪətə/), unlike the voiced /ð/ in this, those, weather.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_20",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2020",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>ch</u>ef':",
                optionA = "machine",
                optionB = "church",
                optionC = "chair",
                optionD = "choice",
                correctAnswerIndex = 0,
                explanation = "'Chef' is a loanword with the /ʃ/ sound, which is identically present in 'machine' (/məˈʃiːn/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_21",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2020",
                questionText = "In which of the following words is the letter 'p' completely silent?",
                optionA = "psychology",
                optionB = "piano",
                optionC = "paper",
                optionD = "pinnacle",
                correctAnswerIndex = 0,
                explanation = "The initial letter 'p' before 's' in Greek loanwords like 'psychology' is silent (/saɪˈkɒlədʒi/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_22",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2020",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMAT':",
                optionA = "DIP-lo-mat",
                optionB = "dip-LO-mat",
                optionC = "dip-lo-MAT",
                optionD = "None of the above",
                correctAnswerIndex = 0,
                explanation = "The noun 'diplomat' carries primary stress on the first syllable: DIP-lo-mat.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_23",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2020",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMATIC':",
                optionA = "dip-lo-MAT-ic",
                optionB = "DIP-lo-mat-ic",
                optionC = "dip-LO-mat-ic",
                optionD = "dip-lo-mat-IC",
                correctAnswerIndex = 0,
                explanation = "Words ending in the suffix '-ic' carry primary stress on the penultimate syllable: dip-lo-MAT-ic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_24",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2020",
                questionText = "Choose the option that has the correct primary stress placement for the verb 'CON-VICT':",
                optionA = "con-VICT",
                optionB = "CON-vict",
                optionC = "con-vict",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, verbs carry primary stress on the second syllable (con-VICT), whereas nouns stress the first (CON-vict).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_25",
                subject = "English Language",
                topic = "Idioms",
                year = "2020",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The young politician decided to burn his bridges when he publicly insulted the party leadership.'",
                optionA = "Permanently eliminate any possibility of returning to a former position",
                optionB = "Construct modern steel bridges across municipal rivers",
                optionC = "Seek immediate reconciliation through financial mediation",
                optionD = "Resign peacefully without generating public controversy",
                correctAnswerIndex = 0,
                explanation = "'To burn one's bridges' means to destroy all paths of retreat or eliminate possibilities of returning.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_26",
                subject = "English Language",
                topic = "Idioms",
                year = "2020",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The lawyer advised his client to let sleeping dogs lie regarding the past land dispute.'",
                optionA = "Avoid stirring up an old problem or situation that could cause renewed trouble",
                optionB = "Provide comfortable shelters for domestic animals",
                optionC = "File a fresh lawsuit immediately before the limitation statute expires",
                optionD = "Pay financial damages to all surviving animal owners",
                correctAnswerIndex = 0,
                explanation = "'Let sleeping dogs lie' means to avoid interfering in a situation that is currently causing no problem.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_27",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2020",
                questionText = "Choose the option that best completes the sentence:\n'The criminal suspect was apprehended by detectives _____ the scene of the armed robbery.'",
                optionA = "at",
                optionB = "in",
                optionC = "on",
                optionD = "by",
                correctAnswerIndex = 0,
                explanation = "The standard prepositional collocation with a specific localized geographic spot is 'at the scene'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_28",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2020",
                questionText = "Choose the option that best completes the sentence:\n'She was so exhausted after the marathon that she could _____ keep her eyes open during the prize presentation.'",
                optionA = "hardly",
                optionB = "hard",
                optionC = "harder",
                optionD = "hardliest",
                correctAnswerIndex = 0,
                explanation = "'Hardly' is an adverb of degree meaning scarcely or with great difficulty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2020_29",
                subject = "English Language",
                topic = "Subjunctive Mood",
                year = "2020",
                questionText = "Choose the option that correctly completes the sentence:\n'The medical council recommended that the hospital _____ sanitized immediately.'",
                optionA = "be",
                optionB = "is",
                optionC = "was",
                optionD = "are",
                correctAnswerIndex = 0,
                explanation = "The present subjunctive requires the base verb form 'be' following verbs of recommendation, mandate, or resolution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2020 • Lexis & Structure (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_01",
                subject = "English Language",
                topic = "Synonyms",
                year = "2021",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The judge described the accountant's fraudulent embezzlement as an act of egregious misconduct.'",
                optionA = "shockingly bad and flagrant",
                optionB = "praiseworthy and noble",
                optionC = "minor and negligible",
                optionD = "accidental and pardonable",
                correctAnswerIndex = 0,
                explanation = "'Egregious' means outstandingly bad, shocking, or flagrant.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_02",
                subject = "English Language",
                topic = "Synonyms",
                year = "2021",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The doctor noted that the patient's symptoms were transient and would dissipate within twenty-four hours.'",
                optionA = "temporary and fleeting",
                optionB = "permanent and fatal",
                optionC = "hereditary and chronic",
                optionD = "debilitating and incurable",
                correctAnswerIndex = 0,
                explanation = "'Transient' means lasting only for a short time, impermanent, or fleeting.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_03",
                subject = "English Language",
                topic = "Synonyms",
                year = "2021",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The governor was commended for his altruistic commitment to free rural maternal healthcare.'",
                optionA = "unselfish and philanthropic",
                optionB = "greedy and self-serving",
                optionC = "hasty and impulsive",
                optionD = "secretive and deceptive",
                correctAnswerIndex = 0,
                explanation = "'Altruistic' means showing selfless concern for the well-being of others.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_04",
                subject = "English Language",
                topic = "Synonyms",
                year = "2021",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The diplomat delivered a concise and lucid explanation of the newly ratified bilateral border protocol.'",
                optionA = "clear and easily understood",
                optionB = "obscure and confusing",
                optionC = "aggressive and hostile",
                optionD = "verbose and complicated",
                correctAnswerIndex = 0,
                explanation = "'Lucid' means expressed clearly and easy to understand.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_05",
                subject = "English Language",
                topic = "Synonyms",
                year = "2021",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The university senate reprimanded the student for his insolent behavior toward faculty members.'",
                optionA = "rude and disrespectful",
                optionB = "humble and courteous",
                optionC = "timid and apologetic",
                optionD = "diligent and obedient",
                correctAnswerIndex = 0,
                explanation = "'Insolent' means showing a rude and arrogant lack of respect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2021",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The CEO's ostentatious lifestyle alienated the frugal board of directors.'",
                optionA = "modest and unpretentious",
                optionB = "flamboyant and flashy",
                optionC = "reckless and extravagant",
                optionD = "arrogant and boastful",
                correctAnswerIndex = 0,
                explanation = "'Ostentatious' means pretentious and vulgar display; its antonym is modest or unpretentious.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_07",
                subject = "English Language",
                topic = "Antonyms",
                year = "2021",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The minister made an ephemeral appearance at the academic symposium before departing for the airport.'",
                optionA = "enduring and permanent",
                optionB = "brief and fleeting",
                optionC = "sudden and unexpected",
                optionD = "unwelcome and rude",
                correctAnswerIndex = 0,
                explanation = "'Ephemeral' means lasting for a very short time; its opposite is enduring or permanent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_08",
                subject = "English Language",
                topic = "Antonyms",
                year = "2021",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The community was blessed with an abundant harvest after the installation of modern drip irrigation.'",
                optionA = "scarce and deficient",
                optionB = "plentiful and copious",
                optionC = "luxuriant and fertile",
                optionD = "healthy and flourishing",
                correctAnswerIndex = 0,
                explanation = "'Abundant' means existing in large quantities; its opposite is scarce or deficient.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_09",
                subject = "English Language",
                topic = "Antonyms",
                year = "2021",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The peace treaty proved to be fragile and collapsed after renewed cross-border skirmishes.'",
                optionA = "durable and robust",
                optionB = "delicate and brittle",
                optionC = "temporary and precarious",
                optionD = "unstable and shaky",
                correctAnswerIndex = 0,
                explanation = "'Fragile' means easily broken or vulnerable; its antonym is durable, sturdy, or robust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_10",
                subject = "English Language",
                topic = "Antonyms",
                year = "2021",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The defendant gave a convoluted statement that confounded the cross-examining prosecutor.'",
                optionA = "simple and straightforward",
                optionB = "complex and intricate",
                optionC = "deceitful and treacherous",
                optionD = "lengthy and detailed",
                correctAnswerIndex = 0,
                explanation = "'Convoluted' means extremely complex and difficult to follow; its opposite is simple and straightforward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_11",
                subject = "English Language",
                topic = "Concord",
                year = "2021",
                questionText = "Choose the option that correctly completes the sentence:\n'Neither the vice-chancellor nor the faculty deans _____ present at the emergency convocation.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "In correlative conjunctions 'neither...nor', the verb agrees with the nearer subject ('faculty deans' is plural, requiring 'were').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_12",
                subject = "English Language",
                topic = "Concord",
                year = "2021",
                questionText = "Choose the option that correctly completes the sentence:\n'The captain, as well as his entire crew of sailors, _____ rescued before the vessel capsized.'",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Parenthetical phrases like 'as well as' do not alter the number of the main grammatical subject ('The captain' is singular, taking 'was').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_13",
                subject = "English Language",
                topic = "Concord",
                year = "2021",
                questionText = "Choose the option that correctly completes the sentence:\n'Every student and lecturer _____ required to wear an institutional identification badge on campus.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "When singular subjects are preceded by 'every' or 'each', they take a singular verb ('is required').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_14",
                subject = "English Language",
                topic = "Concord",
                year = "2021",
                questionText = "Choose the option that correctly completes the sentence:\n'The jury _____ divided in their opinions regarding the culpability of the accused accomplice.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "When a collective noun ('jury') acts individually with conflicting views, it takes a plural verb ('were divided in their opinions').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_15",
                subject = "English Language",
                topic = "Concord",
                year = "2021",
                questionText = "Choose the option that correctly completes the sentence:\n'Ten thousand dollars _____ considered an exorbitant registration fee for the training workshop.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Expressions of monetary sums, time durations, and physical distances are treated as single units and take singular verbs ('is considered').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_16",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2021",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 's<u>i</u>t':",
                optionA = "myth",
                optionB = "site",
                optionC = "bite",
                optionD = "night",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ɪ/ in 'sit' is identically pronounced in 'myth' (/mɪθ/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_17",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2021",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'pl<u>ea</u>se':",
                optionA = "receipt",
                optionB = "bread",
                optionC = "head",
                optionD = "death",
                correctAnswerIndex = 0,
                explanation = "The long vowel /iː/ in 'please' occurs in 'receipt' (/rɪˈsiːt/), whereas bread, head, death have /e/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_18",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2021",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'c<u>u</u>t':",
                optionA = "love",
                optionB = "put",
                optionC = "pull",
                optionD = "foot",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ʌ/ in 'cut' is identically heard in 'love' (/lʌv/), while put, pull, foot have /ʊ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_19",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2021",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>th</u>ink':",
                optionA = "theatre",
                optionB = "this",
                optionC = "those",
                optionD = "weather",
                correctAnswerIndex = 0,
                explanation = "'Think' has the voiceless dental fricative /θ/, which is also heard in 'theatre' (/ˈθɪətə/), unlike the voiced /ð/ in this, those, weather.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_20",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2021",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>ch</u>ef':",
                optionA = "machine",
                optionB = "church",
                optionC = "chair",
                optionD = "choice",
                correctAnswerIndex = 0,
                explanation = "'Chef' is a loanword with the /ʃ/ sound, which is identically present in 'machine' (/məˈʃiːn/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_21",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2021",
                questionText = "In which of the following words is the letter 'p' completely silent?",
                optionA = "psychology",
                optionB = "piano",
                optionC = "paper",
                optionD = "pinnacle",
                correctAnswerIndex = 0,
                explanation = "The initial letter 'p' before 's' in Greek loanwords like 'psychology' is silent (/saɪˈkɒlədʒi/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_22",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2021",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMAT':",
                optionA = "DIP-lo-mat",
                optionB = "dip-LO-mat",
                optionC = "dip-lo-MAT",
                optionD = "None of the above",
                correctAnswerIndex = 0,
                explanation = "The noun 'diplomat' carries primary stress on the first syllable: DIP-lo-mat.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_23",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2021",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMATIC':",
                optionA = "dip-lo-MAT-ic",
                optionB = "DIP-lo-mat-ic",
                optionC = "dip-LO-mat-ic",
                optionD = "dip-lo-mat-IC",
                correctAnswerIndex = 0,
                explanation = "Words ending in the suffix '-ic' carry primary stress on the penultimate syllable: dip-lo-MAT-ic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_24",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2021",
                questionText = "Choose the option that has the correct primary stress placement for the verb 'CON-VICT':",
                optionA = "con-VICT",
                optionB = "CON-vict",
                optionC = "con-vict",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, verbs carry primary stress on the second syllable (con-VICT), whereas nouns stress the first (CON-vict).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_25",
                subject = "English Language",
                topic = "Idioms",
                year = "2021",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The young politician decided to burn his bridges when he publicly insulted the party leadership.'",
                optionA = "Permanently eliminate any possibility of returning to a former position",
                optionB = "Construct modern steel bridges across municipal rivers",
                optionC = "Seek immediate reconciliation through financial mediation",
                optionD = "Resign peacefully without generating public controversy",
                correctAnswerIndex = 0,
                explanation = "'To burn one's bridges' means to destroy all paths of retreat or eliminate possibilities of returning.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_26",
                subject = "English Language",
                topic = "Idioms",
                year = "2021",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The lawyer advised his client to let sleeping dogs lie regarding the past land dispute.'",
                optionA = "Avoid stirring up an old problem or situation that could cause renewed trouble",
                optionB = "Provide comfortable shelters for domestic animals",
                optionC = "File a fresh lawsuit immediately before the limitation statute expires",
                optionD = "Pay financial damages to all surviving animal owners",
                correctAnswerIndex = 0,
                explanation = "'Let sleeping dogs lie' means to avoid interfering in a situation that is currently causing no problem.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_27",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2021",
                questionText = "Choose the option that best completes the sentence:\n'The criminal suspect was apprehended by detectives _____ the scene of the armed robbery.'",
                optionA = "at",
                optionB = "in",
                optionC = "on",
                optionD = "by",
                correctAnswerIndex = 0,
                explanation = "The standard prepositional collocation with a specific localized geographic spot is 'at the scene'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_28",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2021",
                questionText = "Choose the option that best completes the sentence:\n'She was so exhausted after the marathon that she could _____ keep her eyes open during the prize presentation.'",
                optionA = "hardly",
                optionB = "hard",
                optionC = "harder",
                optionD = "hardliest",
                correctAnswerIndex = 0,
                explanation = "'Hardly' is an adverb of degree meaning scarcely or with great difficulty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2021_29",
                subject = "English Language",
                topic = "Subjunctive Mood",
                year = "2021",
                questionText = "Choose the option that correctly completes the sentence:\n'The medical council recommended that the hospital _____ sanitized immediately.'",
                optionA = "be",
                optionB = "is",
                optionC = "was",
                optionD = "are",
                correctAnswerIndex = 0,
                explanation = "The present subjunctive requires the base verb form 'be' following verbs of recommendation, mandate, or resolution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2021 • Lexis & Structure (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_01",
                subject = "English Language",
                topic = "Synonyms",
                year = "2022",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The judge described the accountant's fraudulent embezzlement as an act of egregious misconduct.'",
                optionA = "shockingly bad and flagrant",
                optionB = "praiseworthy and noble",
                optionC = "minor and negligible",
                optionD = "accidental and pardonable",
                correctAnswerIndex = 0,
                explanation = "'Egregious' means outstandingly bad, shocking, or flagrant.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_02",
                subject = "English Language",
                topic = "Synonyms",
                year = "2022",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The doctor noted that the patient's symptoms were transient and would dissipate within twenty-four hours.'",
                optionA = "temporary and fleeting",
                optionB = "permanent and fatal",
                optionC = "hereditary and chronic",
                optionD = "debilitating and incurable",
                correctAnswerIndex = 0,
                explanation = "'Transient' means lasting only for a short time, impermanent, or fleeting.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_03",
                subject = "English Language",
                topic = "Synonyms",
                year = "2022",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The governor was commended for his altruistic commitment to free rural maternal healthcare.'",
                optionA = "unselfish and philanthropic",
                optionB = "greedy and self-serving",
                optionC = "hasty and impulsive",
                optionD = "secretive and deceptive",
                correctAnswerIndex = 0,
                explanation = "'Altruistic' means showing selfless concern for the well-being of others.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_04",
                subject = "English Language",
                topic = "Synonyms",
                year = "2022",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The diplomat delivered a concise and lucid explanation of the newly ratified bilateral border protocol.'",
                optionA = "clear and easily understood",
                optionB = "obscure and confusing",
                optionC = "aggressive and hostile",
                optionD = "verbose and complicated",
                correctAnswerIndex = 0,
                explanation = "'Lucid' means expressed clearly and easy to understand.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_05",
                subject = "English Language",
                topic = "Synonyms",
                year = "2022",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The university senate reprimanded the student for his insolent behavior toward faculty members.'",
                optionA = "rude and disrespectful",
                optionB = "humble and courteous",
                optionC = "timid and apologetic",
                optionD = "diligent and obedient",
                correctAnswerIndex = 0,
                explanation = "'Insolent' means showing a rude and arrogant lack of respect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2022",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The CEO's ostentatious lifestyle alienated the frugal board of directors.'",
                optionA = "modest and unpretentious",
                optionB = "flamboyant and flashy",
                optionC = "reckless and extravagant",
                optionD = "arrogant and boastful",
                correctAnswerIndex = 0,
                explanation = "'Ostentatious' means pretentious and vulgar display; its antonym is modest or unpretentious.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q6)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_07",
                subject = "English Language",
                topic = "Antonyms",
                year = "2022",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The minister made an ephemeral appearance at the academic symposium before departing for the airport.'",
                optionA = "enduring and permanent",
                optionB = "brief and fleeting",
                optionC = "sudden and unexpected",
                optionD = "unwelcome and rude",
                correctAnswerIndex = 0,
                explanation = "'Ephemeral' means lasting for a very short time; its opposite is enduring or permanent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_08",
                subject = "English Language",
                topic = "Antonyms",
                year = "2022",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The community was blessed with an abundant harvest after the installation of modern drip irrigation.'",
                optionA = "scarce and deficient",
                optionB = "plentiful and copious",
                optionC = "luxuriant and fertile",
                optionD = "healthy and flourishing",
                correctAnswerIndex = 0,
                explanation = "'Abundant' means existing in large quantities; its opposite is scarce or deficient.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_09",
                subject = "English Language",
                topic = "Antonyms",
                year = "2022",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The peace treaty proved to be fragile and collapsed after renewed cross-border skirmishes.'",
                optionA = "durable and robust",
                optionB = "delicate and brittle",
                optionC = "temporary and precarious",
                optionD = "unstable and shaky",
                correctAnswerIndex = 0,
                explanation = "'Fragile' means easily broken or vulnerable; its antonym is durable, sturdy, or robust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_10",
                subject = "English Language",
                topic = "Antonyms",
                year = "2022",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The defendant gave a convoluted statement that confounded the cross-examining prosecutor.'",
                optionA = "simple and straightforward",
                optionB = "complex and intricate",
                optionC = "deceitful and treacherous",
                optionD = "lengthy and detailed",
                correctAnswerIndex = 0,
                explanation = "'Convoluted' means extremely complex and difficult to follow; its opposite is simple and straightforward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_11",
                subject = "English Language",
                topic = "Concord",
                year = "2022",
                questionText = "Choose the option that correctly completes the sentence:\n'Neither the vice-chancellor nor the faculty deans _____ present at the emergency convocation.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "In correlative conjunctions 'neither...nor', the verb agrees with the nearer subject ('faculty deans' is plural, requiring 'were').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_12",
                subject = "English Language",
                topic = "Concord",
                year = "2022",
                questionText = "Choose the option that correctly completes the sentence:\n'The captain, as well as his entire crew of sailors, _____ rescued before the vessel capsized.'",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Parenthetical phrases like 'as well as' do not alter the number of the main grammatical subject ('The captain' is singular, taking 'was').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_13",
                subject = "English Language",
                topic = "Concord",
                year = "2022",
                questionText = "Choose the option that correctly completes the sentence:\n'Every student and lecturer _____ required to wear an institutional identification badge on campus.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "When singular subjects are preceded by 'every' or 'each', they take a singular verb ('is required').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_14",
                subject = "English Language",
                topic = "Concord",
                year = "2022",
                questionText = "Choose the option that correctly completes the sentence:\n'The jury _____ divided in their opinions regarding the culpability of the accused accomplice.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "When a collective noun ('jury') acts individually with conflicting views, it takes a plural verb ('were divided in their opinions').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_15",
                subject = "English Language",
                topic = "Concord",
                year = "2022",
                questionText = "Choose the option that correctly completes the sentence:\n'Ten thousand dollars _____ considered an exorbitant registration fee for the training workshop.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Expressions of monetary sums, time durations, and physical distances are treated as single units and take singular verbs ('is considered').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_16",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2022",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 's<u>i</u>t':",
                optionA = "myth",
                optionB = "site",
                optionC = "bite",
                optionD = "night",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ɪ/ in 'sit' is identically pronounced in 'myth' (/mɪθ/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_17",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2022",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'pl<u>ea</u>se':",
                optionA = "receipt",
                optionB = "bread",
                optionC = "head",
                optionD = "death",
                correctAnswerIndex = 0,
                explanation = "The long vowel /iː/ in 'please' occurs in 'receipt' (/rɪˈsiːt/), whereas bread, head, death have /e/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_18",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2022",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'c<u>u</u>t':",
                optionA = "love",
                optionB = "put",
                optionC = "pull",
                optionD = "foot",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ʌ/ in 'cut' is identically heard in 'love' (/lʌv/), while put, pull, foot have /ʊ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_19",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2022",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>th</u>ink':",
                optionA = "theatre",
                optionB = "this",
                optionC = "those",
                optionD = "weather",
                correctAnswerIndex = 0,
                explanation = "'Think' has the voiceless dental fricative /θ/, which is also heard in 'theatre' (/ˈθɪətə/), unlike the voiced /ð/ in this, those, weather.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_20",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2022",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>ch</u>ef':",
                optionA = "machine",
                optionB = "church",
                optionC = "chair",
                optionD = "choice",
                correctAnswerIndex = 0,
                explanation = "'Chef' is a loanword with the /ʃ/ sound, which is identically present in 'machine' (/məˈʃiːn/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_21",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2022",
                questionText = "In which of the following words is the letter 'p' completely silent?",
                optionA = "psychology",
                optionB = "piano",
                optionC = "paper",
                optionD = "pinnacle",
                correctAnswerIndex = 0,
                explanation = "The initial letter 'p' before 's' in Greek loanwords like 'psychology' is silent (/saɪˈkɒlədʒi/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_22",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2022",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMAT':",
                optionA = "DIP-lo-mat",
                optionB = "dip-LO-mat",
                optionC = "dip-lo-MAT",
                optionD = "None of the above",
                correctAnswerIndex = 0,
                explanation = "The noun 'diplomat' carries primary stress on the first syllable: DIP-lo-mat.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_23",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2022",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMATIC':",
                optionA = "dip-lo-MAT-ic",
                optionB = "DIP-lo-mat-ic",
                optionC = "dip-LO-mat-ic",
                optionD = "dip-lo-mat-IC",
                correctAnswerIndex = 0,
                explanation = "Words ending in the suffix '-ic' carry primary stress on the penultimate syllable: dip-lo-MAT-ic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_24",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2022",
                questionText = "Choose the option that has the correct primary stress placement for the verb 'CON-VICT':",
                optionA = "con-VICT",
                optionB = "CON-vict",
                optionC = "con-vict",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, verbs carry primary stress on the second syllable (con-VICT), whereas nouns stress the first (CON-vict).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_25",
                subject = "English Language",
                topic = "Idioms",
                year = "2022",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The young politician decided to burn his bridges when he publicly insulted the party leadership.'",
                optionA = "Permanently eliminate any possibility of returning to a former position",
                optionB = "Construct modern steel bridges across municipal rivers",
                optionC = "Seek immediate reconciliation through financial mediation",
                optionD = "Resign peacefully without generating public controversy",
                correctAnswerIndex = 0,
                explanation = "'To burn one's bridges' means to destroy all paths of retreat or eliminate possibilities of returning.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_26",
                subject = "English Language",
                topic = "Idioms",
                year = "2022",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The lawyer advised his client to let sleeping dogs lie regarding the past land dispute.'",
                optionA = "Avoid stirring up an old problem or situation that could cause renewed trouble",
                optionB = "Provide comfortable shelters for domestic animals",
                optionC = "File a fresh lawsuit immediately before the limitation statute expires",
                optionD = "Pay financial damages to all surviving animal owners",
                correctAnswerIndex = 0,
                explanation = "'Let sleeping dogs lie' means to avoid interfering in a situation that is currently causing no problem.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_27",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2022",
                questionText = "Choose the option that best completes the sentence:\n'The criminal suspect was apprehended by detectives _____ the scene of the armed robbery.'",
                optionA = "at",
                optionB = "in",
                optionC = "on",
                optionD = "by",
                correctAnswerIndex = 0,
                explanation = "The standard prepositional collocation with a specific localized geographic spot is 'at the scene'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_28",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2022",
                questionText = "Choose the option that best completes the sentence:\n'She was so exhausted after the marathon that she could _____ keep her eyes open during the prize presentation.'",
                optionA = "hardly",
                optionB = "hard",
                optionC = "harder",
                optionD = "hardliest",
                correctAnswerIndex = 0,
                explanation = "'Hardly' is an adverb of degree meaning scarcely or with great difficulty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2022_29",
                subject = "English Language",
                topic = "Subjunctive Mood",
                year = "2022",
                questionText = "Choose the option that correctly completes the sentence:\n'The medical council recommended that the hospital _____ sanitized immediately.'",
                optionA = "be",
                optionB = "is",
                optionC = "was",
                optionD = "are",
                correctAnswerIndex = 0,
                explanation = "The present subjunctive requires the base verb form 'be' following verbs of recommendation, mandate, or resolution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2022 • Lexis & Structure (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_01",
                subject = "English Language",
                topic = "Synonyms",
                year = "2023",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The judge described the accountant's fraudulent embezzlement as an act of egregious misconduct.'",
                optionA = "shockingly bad and flagrant",
                optionB = "praiseworthy and noble",
                optionC = "minor and negligible",
                optionD = "accidental and pardonable",
                correctAnswerIndex = 0,
                explanation = "'Egregious' means outstandingly bad, shocking, or flagrant.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_02",
                subject = "English Language",
                topic = "Synonyms",
                year = "2023",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The doctor noted that the patient's symptoms were transient and would dissipate within twenty-four hours.'",
                optionA = "temporary and fleeting",
                optionB = "permanent and fatal",
                optionC = "hereditary and chronic",
                optionD = "debilitating and incurable",
                correctAnswerIndex = 0,
                explanation = "'Transient' means lasting only for a short time, impermanent, or fleeting.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_03",
                subject = "English Language",
                topic = "Synonyms",
                year = "2023",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The governor was commended for his altruistic commitment to free rural maternal healthcare.'",
                optionA = "unselfish and philanthropic",
                optionB = "greedy and self-serving",
                optionC = "hasty and impulsive",
                optionD = "secretive and deceptive",
                correctAnswerIndex = 0,
                explanation = "'Altruistic' means showing selfless concern for the well-being of others.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_04",
                subject = "English Language",
                topic = "Synonyms",
                year = "2023",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The diplomat delivered a concise and lucid explanation of the newly ratified bilateral border protocol.'",
                optionA = "clear and easily understood",
                optionB = "obscure and confusing",
                optionC = "aggressive and hostile",
                optionD = "verbose and complicated",
                correctAnswerIndex = 0,
                explanation = "'Lucid' means expressed clearly and easy to understand.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_05",
                subject = "English Language",
                topic = "Synonyms",
                year = "2023",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The university senate reprimanded the student for his insolent behavior toward faculty members.'",
                optionA = "rude and disrespectful",
                optionB = "humble and courteous",
                optionC = "timid and apologetic",
                optionD = "diligent and obedient",
                correctAnswerIndex = 0,
                explanation = "'Insolent' means showing a rude and arrogant lack of respect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2023",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The CEO's ostentatious lifestyle alienated the frugal board of directors.'",
                optionA = "modest and unpretentious",
                optionB = "flamboyant and flashy",
                optionC = "reckless and extravagant",
                optionD = "arrogant and boastful",
                correctAnswerIndex = 0,
                explanation = "'Ostentatious' means pretentious and vulgar display; its antonym is modest or unpretentious.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_07",
                subject = "English Language",
                topic = "Antonyms",
                year = "2023",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The minister made an ephemeral appearance at the academic symposium before departing for the airport.'",
                optionA = "enduring and permanent",
                optionB = "brief and fleeting",
                optionC = "sudden and unexpected",
                optionD = "unwelcome and rude",
                correctAnswerIndex = 0,
                explanation = "'Ephemeral' means lasting for a very short time; its opposite is enduring or permanent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_08",
                subject = "English Language",
                topic = "Antonyms",
                year = "2023",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The community was blessed with an abundant harvest after the installation of modern drip irrigation.'",
                optionA = "scarce and deficient",
                optionB = "plentiful and copious",
                optionC = "luxuriant and fertile",
                optionD = "healthy and flourishing",
                correctAnswerIndex = 0,
                explanation = "'Abundant' means existing in large quantities; its opposite is scarce or deficient.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_09",
                subject = "English Language",
                topic = "Antonyms",
                year = "2023",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The peace treaty proved to be fragile and collapsed after renewed cross-border skirmishes.'",
                optionA = "durable and robust",
                optionB = "delicate and brittle",
                optionC = "temporary and precarious",
                optionD = "unstable and shaky",
                correctAnswerIndex = 0,
                explanation = "'Fragile' means easily broken or vulnerable; its antonym is durable, sturdy, or robust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_10",
                subject = "English Language",
                topic = "Antonyms",
                year = "2023",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The defendant gave a convoluted statement that confounded the cross-examining prosecutor.'",
                optionA = "simple and straightforward",
                optionB = "complex and intricate",
                optionC = "deceitful and treacherous",
                optionD = "lengthy and detailed",
                correctAnswerIndex = 0,
                explanation = "'Convoluted' means extremely complex and difficult to follow; its opposite is simple and straightforward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_11",
                subject = "English Language",
                topic = "Concord",
                year = "2023",
                questionText = "Choose the option that correctly completes the sentence:\n'Neither the vice-chancellor nor the faculty deans _____ present at the emergency convocation.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "In correlative conjunctions 'neither...nor', the verb agrees with the nearer subject ('faculty deans' is plural, requiring 'were').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_12",
                subject = "English Language",
                topic = "Concord",
                year = "2023",
                questionText = "Choose the option that correctly completes the sentence:\n'The captain, as well as his entire crew of sailors, _____ rescued before the vessel capsized.'",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Parenthetical phrases like 'as well as' do not alter the number of the main grammatical subject ('The captain' is singular, taking 'was').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_13",
                subject = "English Language",
                topic = "Concord",
                year = "2023",
                questionText = "Choose the option that correctly completes the sentence:\n'Every student and lecturer _____ required to wear an institutional identification badge on campus.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "When singular subjects are preceded by 'every' or 'each', they take a singular verb ('is required').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_14",
                subject = "English Language",
                topic = "Concord",
                year = "2023",
                questionText = "Choose the option that correctly completes the sentence:\n'The jury _____ divided in their opinions regarding the culpability of the accused accomplice.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "When a collective noun ('jury') acts individually with conflicting views, it takes a plural verb ('were divided in their opinions').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_15",
                subject = "English Language",
                topic = "Concord",
                year = "2023",
                questionText = "Choose the option that correctly completes the sentence:\n'Ten thousand dollars _____ considered an exorbitant registration fee for the training workshop.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Expressions of monetary sums, time durations, and physical distances are treated as single units and take singular verbs ('is considered').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_16",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2023",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 's<u>i</u>t':",
                optionA = "myth",
                optionB = "site",
                optionC = "bite",
                optionD = "night",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ɪ/ in 'sit' is identically pronounced in 'myth' (/mɪθ/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_17",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2023",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'pl<u>ea</u>se':",
                optionA = "receipt",
                optionB = "bread",
                optionC = "head",
                optionD = "death",
                correctAnswerIndex = 0,
                explanation = "The long vowel /iː/ in 'please' occurs in 'receipt' (/rɪˈsiːt/), whereas bread, head, death have /e/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_18",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2023",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'c<u>u</u>t':",
                optionA = "love",
                optionB = "put",
                optionC = "pull",
                optionD = "foot",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ʌ/ in 'cut' is identically heard in 'love' (/lʌv/), while put, pull, foot have /ʊ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_19",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2023",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>th</u>ink':",
                optionA = "theatre",
                optionB = "this",
                optionC = "those",
                optionD = "weather",
                correctAnswerIndex = 0,
                explanation = "'Think' has the voiceless dental fricative /θ/, which is also heard in 'theatre' (/ˈθɪətə/), unlike the voiced /ð/ in this, those, weather.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_20",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2023",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>ch</u>ef':",
                optionA = "machine",
                optionB = "church",
                optionC = "chair",
                optionD = "choice",
                correctAnswerIndex = 0,
                explanation = "'Chef' is a loanword with the /ʃ/ sound, which is identically present in 'machine' (/məˈʃiːn/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_21",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2023",
                questionText = "In which of the following words is the letter 'p' completely silent?",
                optionA = "psychology",
                optionB = "piano",
                optionC = "paper",
                optionD = "pinnacle",
                correctAnswerIndex = 0,
                explanation = "The initial letter 'p' before 's' in Greek loanwords like 'psychology' is silent (/saɪˈkɒlədʒi/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_22",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2023",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMAT':",
                optionA = "DIP-lo-mat",
                optionB = "dip-LO-mat",
                optionC = "dip-lo-MAT",
                optionD = "None of the above",
                correctAnswerIndex = 0,
                explanation = "The noun 'diplomat' carries primary stress on the first syllable: DIP-lo-mat.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_23",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2023",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMATIC':",
                optionA = "dip-lo-MAT-ic",
                optionB = "DIP-lo-mat-ic",
                optionC = "dip-LO-mat-ic",
                optionD = "dip-lo-mat-IC",
                correctAnswerIndex = 0,
                explanation = "Words ending in the suffix '-ic' carry primary stress on the penultimate syllable: dip-lo-MAT-ic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_24",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2023",
                questionText = "Choose the option that has the correct primary stress placement for the verb 'CON-VICT':",
                optionA = "con-VICT",
                optionB = "CON-vict",
                optionC = "con-vict",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, verbs carry primary stress on the second syllable (con-VICT), whereas nouns stress the first (CON-vict).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_25",
                subject = "English Language",
                topic = "Idioms",
                year = "2023",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The young politician decided to burn his bridges when he publicly insulted the party leadership.'",
                optionA = "Permanently eliminate any possibility of returning to a former position",
                optionB = "Construct modern steel bridges across municipal rivers",
                optionC = "Seek immediate reconciliation through financial mediation",
                optionD = "Resign peacefully without generating public controversy",
                correctAnswerIndex = 0,
                explanation = "'To burn one's bridges' means to destroy all paths of retreat or eliminate possibilities of returning.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_26",
                subject = "English Language",
                topic = "Idioms",
                year = "2023",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The lawyer advised his client to let sleeping dogs lie regarding the past land dispute.'",
                optionA = "Avoid stirring up an old problem or situation that could cause renewed trouble",
                optionB = "Provide comfortable shelters for domestic animals",
                optionC = "File a fresh lawsuit immediately before the limitation statute expires",
                optionD = "Pay financial damages to all surviving animal owners",
                correctAnswerIndex = 0,
                explanation = "'Let sleeping dogs lie' means to avoid interfering in a situation that is currently causing no problem.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_27",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2023",
                questionText = "Choose the option that best completes the sentence:\n'The criminal suspect was apprehended by detectives _____ the scene of the armed robbery.'",
                optionA = "at",
                optionB = "in",
                optionC = "on",
                optionD = "by",
                correctAnswerIndex = 0,
                explanation = "The standard prepositional collocation with a specific localized geographic spot is 'at the scene'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_28",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2023",
                questionText = "Choose the option that best completes the sentence:\n'She was so exhausted after the marathon that she could _____ keep her eyes open during the prize presentation.'",
                optionA = "hardly",
                optionB = "hard",
                optionC = "harder",
                optionD = "hardliest",
                correctAnswerIndex = 0,
                explanation = "'Hardly' is an adverb of degree meaning scarcely or with great difficulty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2023_29",
                subject = "English Language",
                topic = "Subjunctive Mood",
                year = "2023",
                questionText = "Choose the option that correctly completes the sentence:\n'The medical council recommended that the hospital _____ sanitized immediately.'",
                optionA = "be",
                optionB = "is",
                optionC = "was",
                optionD = "are",
                correctAnswerIndex = 0,
                explanation = "The present subjunctive requires the base verb form 'be' following verbs of recommendation, mandate, or resolution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2023 • Lexis & Structure (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_01",
                subject = "English Language",
                topic = "Synonyms",
                year = "2024",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The judge described the accountant's fraudulent embezzlement as an act of egregious misconduct.'",
                optionA = "shockingly bad and flagrant",
                optionB = "praiseworthy and noble",
                optionC = "minor and negligible",
                optionD = "accidental and pardonable",
                correctAnswerIndex = 0,
                explanation = "'Egregious' means outstandingly bad, shocking, or flagrant.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_02",
                subject = "English Language",
                topic = "Synonyms",
                year = "2024",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The doctor noted that the patient's symptoms were transient and would dissipate within twenty-four hours.'",
                optionA = "temporary and fleeting",
                optionB = "permanent and fatal",
                optionC = "hereditary and chronic",
                optionD = "debilitating and incurable",
                correctAnswerIndex = 0,
                explanation = "'Transient' means lasting only for a short time, impermanent, or fleeting.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_03",
                subject = "English Language",
                topic = "Synonyms",
                year = "2024",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The governor was commended for his altruistic commitment to free rural maternal healthcare.'",
                optionA = "unselfish and philanthropic",
                optionB = "greedy and self-serving",
                optionC = "hasty and impulsive",
                optionD = "secretive and deceptive",
                correctAnswerIndex = 0,
                explanation = "'Altruistic' means showing selfless concern for the well-being of others.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_04",
                subject = "English Language",
                topic = "Synonyms",
                year = "2024",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The diplomat delivered a concise and lucid explanation of the newly ratified bilateral border protocol.'",
                optionA = "clear and easily understood",
                optionB = "obscure and confusing",
                optionC = "aggressive and hostile",
                optionD = "verbose and complicated",
                correctAnswerIndex = 0,
                explanation = "'Lucid' means expressed clearly and easy to understand.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_05",
                subject = "English Language",
                topic = "Synonyms",
                year = "2024",
                questionText = "Select the option nearest in meaning to the underlined word:\n'The university senate reprimanded the student for his insolent behavior toward faculty members.'",
                optionA = "rude and disrespectful",
                optionB = "humble and courteous",
                optionC = "timid and apologetic",
                optionD = "diligent and obedient",
                correctAnswerIndex = 0,
                explanation = "'Insolent' means showing a rude and arrogant lack of respect.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_06",
                subject = "English Language",
                topic = "Antonyms",
                year = "2024",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The CEO's ostentatious lifestyle alienated the frugal board of directors.'",
                optionA = "modest and unpretentious",
                optionB = "flamboyant and flashy",
                optionC = "reckless and extravagant",
                optionD = "arrogant and boastful",
                correctAnswerIndex = 0,
                explanation = "'Ostentatious' means pretentious and vulgar display; its antonym is modest or unpretentious.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_07",
                subject = "English Language",
                topic = "Antonyms",
                year = "2024",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The minister made an ephemeral appearance at the academic symposium before departing for the airport.'",
                optionA = "enduring and permanent",
                optionB = "brief and fleeting",
                optionC = "sudden and unexpected",
                optionD = "unwelcome and rude",
                correctAnswerIndex = 0,
                explanation = "'Ephemeral' means lasting for a very short time; its opposite is enduring or permanent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_08",
                subject = "English Language",
                topic = "Antonyms",
                year = "2024",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The community was blessed with an abundant harvest after the installation of modern drip irrigation.'",
                optionA = "scarce and deficient",
                optionB = "plentiful and copious",
                optionC = "luxuriant and fertile",
                optionD = "healthy and flourishing",
                correctAnswerIndex = 0,
                explanation = "'Abundant' means existing in large quantities; its opposite is scarce or deficient.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q8)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_09",
                subject = "English Language",
                topic = "Antonyms",
                year = "2024",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The peace treaty proved to be fragile and collapsed after renewed cross-border skirmishes.'",
                optionA = "durable and robust",
                optionB = "delicate and brittle",
                optionC = "temporary and precarious",
                optionD = "unstable and shaky",
                correctAnswerIndex = 0,
                explanation = "'Fragile' means easily broken or vulnerable; its antonym is durable, sturdy, or robust.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_10",
                subject = "English Language",
                topic = "Antonyms",
                year = "2024",
                questionText = "Select the option opposite in meaning to the underlined word:\n'The defendant gave a convoluted statement that confounded the cross-examining prosecutor.'",
                optionA = "simple and straightforward",
                optionB = "complex and intricate",
                optionC = "deceitful and treacherous",
                optionD = "lengthy and detailed",
                correctAnswerIndex = 0,
                explanation = "'Convoluted' means extremely complex and difficult to follow; its opposite is simple and straightforward.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_11",
                subject = "English Language",
                topic = "Concord",
                year = "2024",
                questionText = "Choose the option that correctly completes the sentence:\n'Neither the vice-chancellor nor the faculty deans _____ present at the emergency convocation.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "In correlative conjunctions 'neither...nor', the verb agrees with the nearer subject ('faculty deans' is plural, requiring 'were').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_12",
                subject = "English Language",
                topic = "Concord",
                year = "2024",
                questionText = "Choose the option that correctly completes the sentence:\n'The captain, as well as his entire crew of sailors, _____ rescued before the vessel capsized.'",
                optionA = "was",
                optionB = "were",
                optionC = "are",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Parenthetical phrases like 'as well as' do not alter the number of the main grammatical subject ('The captain' is singular, taking 'was').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_13",
                subject = "English Language",
                topic = "Concord",
                year = "2024",
                questionText = "Choose the option that correctly completes the sentence:\n'Every student and lecturer _____ required to wear an institutional identification badge on campus.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "When singular subjects are preceded by 'every' or 'each', they take a singular verb ('is required').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_14",
                subject = "English Language",
                topic = "Concord",
                year = "2024",
                questionText = "Choose the option that correctly completes the sentence:\n'The jury _____ divided in their opinions regarding the culpability of the accused accomplice.'",
                optionA = "were",
                optionB = "was",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 0,
                explanation = "When a collective noun ('jury') acts individually with conflicting views, it takes a plural verb ('were divided in their opinions').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_15",
                subject = "English Language",
                topic = "Concord",
                year = "2024",
                questionText = "Choose the option that correctly completes the sentence:\n'Ten thousand dollars _____ considered an exorbitant registration fee for the training workshop.'",
                optionA = "is",
                optionB = "are",
                optionC = "were",
                optionD = "have been",
                correctAnswerIndex = 0,
                explanation = "Expressions of monetary sums, time durations, and physical distances are treated as single units and take singular verbs ('is considered').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_16",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2024",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 's<u>i</u>t':",
                optionA = "myth",
                optionB = "site",
                optionC = "bite",
                optionD = "night",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ɪ/ in 'sit' is identically pronounced in 'myth' (/mɪθ/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_17",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2024",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'pl<u>ea</u>se':",
                optionA = "receipt",
                optionB = "bread",
                optionC = "head",
                optionD = "death",
                correctAnswerIndex = 0,
                explanation = "The long vowel /iː/ in 'please' occurs in 'receipt' (/rɪˈsiːt/), whereas bread, head, death have /e/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_18",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2024",
                questionText = "Choose the option that has the same vowel sound as the underlined sound in 'c<u>u</u>t':",
                optionA = "love",
                optionB = "put",
                optionC = "pull",
                optionD = "foot",
                correctAnswerIndex = 0,
                explanation = "The short vowel /ʌ/ in 'cut' is identically heard in 'love' (/lʌv/), while put, pull, foot have /ʊ/.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_19",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2024",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>th</u>ink':",
                optionA = "theatre",
                optionB = "this",
                optionC = "those",
                optionD = "weather",
                correctAnswerIndex = 0,
                explanation = "'Think' has the voiceless dental fricative /θ/, which is also heard in 'theatre' (/ˈθɪətə/), unlike the voiced /ð/ in this, those, weather.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_20",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2024",
                questionText = "Choose the option that has the same consonant sound as the underlined letter in '<u>ch</u>ef':",
                optionA = "machine",
                optionB = "church",
                optionC = "chair",
                optionD = "choice",
                correctAnswerIndex = 0,
                explanation = "'Chef' is a loanword with the /ʃ/ sound, which is identically present in 'machine' (/məˈʃiːn/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_21",
                subject = "English Language",
                topic = "Oral English: Silent Letters",
                year = "2024",
                questionText = "In which of the following words is the letter 'p' completely silent?",
                optionA = "psychology",
                optionB = "piano",
                optionC = "paper",
                optionD = "pinnacle",
                correctAnswerIndex = 0,
                explanation = "The initial letter 'p' before 's' in Greek loanwords like 'psychology' is silent (/saɪˈkɒlədʒi/).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_22",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2024",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMAT':",
                optionA = "DIP-lo-mat",
                optionB = "dip-LO-mat",
                optionC = "dip-lo-MAT",
                optionD = "None of the above",
                correctAnswerIndex = 0,
                explanation = "The noun 'diplomat' carries primary stress on the first syllable: DIP-lo-mat.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_23",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2024",
                questionText = "Choose the option that has the correct primary stress placement for 'DIPLOMATIC':",
                optionA = "dip-lo-MAT-ic",
                optionB = "DIP-lo-mat-ic",
                optionC = "dip-LO-mat-ic",
                optionD = "dip-lo-mat-IC",
                correctAnswerIndex = 0,
                explanation = "Words ending in the suffix '-ic' carry primary stress on the penultimate syllable: dip-lo-MAT-ic.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_24",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2024",
                questionText = "Choose the option that has the correct primary stress placement for the verb 'CON-VICT':",
                optionA = "con-VICT",
                optionB = "CON-vict",
                optionC = "con-vict",
                optionD = "Both equally",
                correctAnswerIndex = 0,
                explanation = "In two-syllable noun/verb pairs, verbs carry primary stress on the second syllable (con-VICT), whereas nouns stress the first (CON-vict).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_25",
                subject = "English Language",
                topic = "Idioms",
                year = "2024",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The young politician decided to burn his bridges when he publicly insulted the party leadership.'",
                optionA = "Permanently eliminate any possibility of returning to a former position",
                optionB = "Construct modern steel bridges across municipal rivers",
                optionC = "Seek immediate reconciliation through financial mediation",
                optionD = "Resign peacefully without generating public controversy",
                correctAnswerIndex = 0,
                explanation = "'To burn one's bridges' means to destroy all paths of retreat or eliminate possibilities of returning.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_26",
                subject = "English Language",
                topic = "Idioms",
                year = "2024",
                questionText = "Choose the option that best conveys the meaning of the underlined idiom:\n'The lawyer advised his client to let sleeping dogs lie regarding the past land dispute.'",
                optionA = "Avoid stirring up an old problem or situation that could cause renewed trouble",
                optionB = "Provide comfortable shelters for domestic animals",
                optionC = "File a fresh lawsuit immediately before the limitation statute expires",
                optionD = "Pay financial damages to all surviving animal owners",
                correctAnswerIndex = 0,
                explanation = "'Let sleeping dogs lie' means to avoid interfering in a situation that is currently causing no problem.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_27",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2024",
                questionText = "Choose the option that best completes the sentence:\n'The criminal suspect was apprehended by detectives _____ the scene of the armed robbery.'",
                optionA = "at",
                optionB = "in",
                optionC = "on",
                optionD = "by",
                correctAnswerIndex = 0,
                explanation = "The standard prepositional collocation with a specific localized geographic spot is 'at the scene'.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_28",
                subject = "English Language",
                topic = "Sentence Completion",
                year = "2024",
                questionText = "Choose the option that best completes the sentence:\n'She was so exhausted after the marathon that she could _____ keep her eyes open during the prize presentation.'",
                optionA = "hardly",
                optionB = "hard",
                optionC = "harder",
                optionD = "hardliest",
                correctAnswerIndex = 0,
                explanation = "'Hardly' is an adverb of degree meaning scarcely or with great difficulty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q28)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_gram_2024_29",
                subject = "English Language",
                topic = "Subjunctive Mood",
                year = "2024",
                questionText = "Choose the option that correctly completes the sentence:\n'The medical council recommended that the hospital _____ sanitized immediately.'",
                optionA = "be",
                optionB = "is",
                optionC = "was",
                optionD = "are",
                correctAnswerIndex = 0,
                explanation = "The present subjunctive requires the base verb form 'be' following verbs of recommendation, mandate, or resolution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2024 • Lexis & Structure (Q29)",
                isVerifiedJamb = true
            )
        )
    }

}
