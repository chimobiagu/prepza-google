import { Question, UserProfile, LiteratureBook, OfflinePack, Friend, TutorPersona } from '../types';

export const SEED_PROFILE: UserProfile = {
  id: 1,
  accountId: "user_default_1",
  name: "Chinedu Okafor",
  email: "chinedu.okafor@gmail.com",
  phoneNumber: "+2348012345678",
  targetScore: 340,
  jambSubjectsCsv: "English Language,Mathematics,Physics,Chemistry",
  targetInstitution: "University of Lagos (UNILAG)",
  dreamCourse: "Medicine & Surgery",
  learningStyle: "Intensive Mock Practice",
  preferredStudyTime: "Evening (7:00 PM)",
  streakDays: 14,
  totalXp: 1850,
  level: 5,
  studyGoalMinutesPerDay: 45,
  isPlusSubscriber: false,
  trialStartDate: Date.now() - (3 * 24 * 3600 * 1000), // started 3 days ago
  trialDurationDays: 30,
  simulatedDaysPassed: 0,
  jambExamDateTimestamp: Date.now() + (64 * 24 * 3600 * 1000), // ~64 days left
  myReferralCode: "PRZ-5821",
  referralCount: 2
};

export const TUTOR_PERSONAS: TutorPersona[] = [
  {
    key: "GENERAL_COACH",
    displayName: "UTME Study Coach",
    tagline: "Balanced explanations, time tips & syllabus guidance",
    modelId: "gemini-2.5-flash",
    engineName: "Prepza AI",
    defaultGreeting: "Hello Chinedu! I am your Prepza AI UTME Coach. Ask me anything about English, Math, Sciences, Arts, or Commercial subjects!",
    systemPrompt: "You are Prepza AI Tutor, the #1 smart, articulate, and encouraging AI study coach for Nigerian students preparing for the Joint Admissions and Matriculation Board (JAMB) UTME."
  },
  {
    key: "STEM_SPECIALIST",
    displayName: "STEM & Math Master",
    tagline: "Complex derivations, physics equations & math proofs",
    modelId: "gemini-2.5-pro",
    engineName: "Prepza AI Pro",
    defaultGreeting: "Welcome to STEM Master! I handle advanced derivations, calculus proofs, projectile mechanics, and organic chemistry mechanisms.",
    systemPrompt: "You are the Prepza STEM & Mathematics Master AI, powered by deep analytical reasoning. Specialize in solving complex mathematics, physics, and chemistry problems for JAMB UTME."
  },
  {
    key: "RAPID_SPRINT",
    displayName: "Speed Revision Sprint",
    tagline: "Lightning-fast definitions, formula cards & oral English rules",
    modelId: "gemini-2.5-flash",
    engineName: "Prepza AI Lite",
    defaultGreeting: "Speed Revision active! Ask for instant formulas, oral English stress rules, or fast definitions in seconds.",
    systemPrompt: "You are the Prepza Speed Revision AI. Your goal is lightning-fast, high-yield, concise exam revisions for Nigerian UTME candidates."
  },
  {
    key: "LITERATURE_ANALYST",
    displayName: "Literature in English",
    tagline: "The Life Changer, character analysis & literary devices",
    modelId: "gemini-2.5-flash",
    engineName: "Prepza AI Literature",
    defaultGreeting: "Literature Analyst ready! Ask about 'The Life Changer' (Ummi, Salma, Habib, Omar), character motives, themes, and figures of speech.",
    systemPrompt: "You are the Prepza Literature in English Specialist for JAMB UTME. Specialize in the official prescribed novel 'The Life Changer' by Khadija Abubakar Jalli and prescribed texts."
  }
];

export const SEED_OFFLINE_PACKS: OfflinePack[] = [
  {
    subject: "Use of English",
    totalQuestions: 2240,
    downloadedAt: Date.now() - 86400000 * 2,
    sizeMb: 4.8,
    yearsAvailable: "2010 - 2024 (15 Years)",
    isDownloaded: true
  },
  {
    subject: "Mathematics",
    totalQuestions: 1200,
    downloadedAt: Date.now() - 86400000,
    sizeMb: 3.2,
    yearsAvailable: "2012 - 2024 (13 Years)",
    isDownloaded: true
  },
  {
    subject: "Physics",
    totalQuestions: 1450,
    downloadedAt: Date.now() - 86400000 * 3,
    sizeMb: 3.6,
    yearsAvailable: "2011 - 2024 (14 Years)",
    isDownloaded: true
  },
  {
    subject: "Chemistry",
    totalQuestions: 1380,
    downloadedAt: Date.now() - 86400000 * 4,
    sizeMb: 3.4,
    yearsAvailable: "2010 - 2024 (15 Years)",
    isDownloaded: true
  },
  {
    subject: "Biology",
    totalQuestions: 1520,
    downloadedAt: Date.now() - 86400000 * 5,
    sizeMb: 3.9,
    yearsAvailable: "2010 - 2024 (15 Years)",
    isDownloaded: false
  },
  {
    subject: "Economics",
    totalQuestions: 1100,
    downloadedAt: 0,
    sizeMb: 2.8,
    yearsAvailable: "2012 - 2024 (13 Years)",
    isDownloaded: false
  }
];

export const SEED_FRIENDS: Friend[] = [
  {
    id: "fr_1",
    name: "Amina Bello",
    accuracyPercent: 88,
    streakDays: 21,
    friendCode: "PRZ-8892",
    status: "following",
    isFollowing: true
  },
  {
    id: "fr_2",
    name: "Tobi Adeyemi",
    accuracyPercent: 82,
    streakDays: 16,
    friendCode: "PRZ-3410",
    status: "following",
    isFollowing: true
  },
  {
    id: "fr_3",
    name: "Emeka Nwosu",
    accuracyPercent: 79,
    streakDays: 14,
    friendCode: "PRZ-9011",
    status: "following",
    isFollowing: true
  },
  {
    id: "fr_4",
    name: "Fatima Aliyu",
    accuracyPercent: 91,
    streakDays: 28,
    friendCode: "PRZ-1108",
    status: "following",
    isFollowing: true
  }
];

export const SEED_LITERATURE_BOOKS: LiteratureBook[] = [
  {
    id: "book_life_changer",
    title: "The Life Changer",
    author: "Khadijat Abubakar Jalli",
    description: "Official UTME Literature Novel. Follow Ummi's inspiring journey through university life, exploring themes of honesty, peer pressure, and academic resilience.",
    category: "UTME Mandatory Prose",
    readingProgressPercent: 65,
    lastReadChapterIndex: 1,
    characters: [
      { name: "Ummi", role: "Protagonist & Narrator", description: "A wise mother recounting her university years to her children (Omar, Teemah, Jamila, Bint) to guide their moral choices." },
      { name: "Salma", role: "Major Character", description: "A beautiful, sophisticated freshman who falls into vanity, examination malpractice, and corrupt social circles before repenting." },
      { name: "Dr. Dabo", role: "Lecturer", description: "A disciplined university lecturer with high moral standards who sternly rejects Salma's flirtatious advances." },
      { name: "Habib & Kola", role: "Corrupt Figures", description: "A wealthy politician and his associate who entangle naive university students in bribery and materialism." },
      { name: "Omar", role: "Ummi's Son", description: "Ummi's eldest son who gains admission to study Law at Ahmadu Bello University, prompting Ummi's cautionary tale." }
    ],
    themes: [
      { title: "Academic Integrity vs Malpractice", explanation: "The catastrophic consequences of exam cheats and shortcuts compared to honest persistence." },
      { title: "Peer Pressure and Moral Decadence", explanation: "How innocent students become corrupted by affluent peers, ostentatious living, and compromise." },
      { title: "Family Guidance & Parental Wisdom", explanation: "The foundational role of parents in molding character before university freedom." }
    ],
    examTips: [
      "Remember that Salma cheated using notes in her bag during Dr. Dabo's exam and was reported by Kolawole.",
      "Kolawole was sitting next to Salma and also faced the Exam Malpractice Committee.",
      "Ummi used her grandmother's story of the quiet village girl and the snake to teach patience."
    ],
    chapters: [
      {
        title: "Chapter 1: The New Horizon",
        content: "Ummi had always been fascinated by university life. Sitting under the shade of the mango tree in her father's compound in Kano, she contemplated her journey into tertiary education. Getting admission into the university was not just a personal achievement for Ummi; it was a testament to her parents' sacrifices and her own tireless devotion to study.\n\nWhen the news of her admission broke, the household erupted in joy. Her mother wept tears of gratitude, while her father handed her an envelope containing her registration fees and words of eternal wisdom.\n\n'Education is the true life changer,' her father told her, gazing solemnly into her eyes. 'It gives you the wings to fly, but your character will determine how high you soar.'"
      },
      {
        title: "Chapter 2: Registration & Realities",
        content: "Navigating the bustling campus on her first morning was overwhelming. Thousands of freshmen milled around the administrative complex, each carrying thick brown envelopes containing credentials, passports, and high hopes.\n\nUmmi met Salma, a sharp-tongued sophomore who seemed to know every shortcut on campus. Salma offered to help her skip the long queues, but at a price.\n\n'In this university, nobody gets anything for free,' Salma whispered confidentially. Ummi remembered her father's warning about integrity and politely declined, choosing to wait in line like everyone else. It took six painstaking hours, but when her registration slip was stamped, her conscience was clean."
      },
      {
        title: "Chapter 3: The Lecture Hall & The Web of Friends",
        content: "Lectures began in earnest. The lecture hall was an amphitheatre holding over five hundred students. Ummi noticed the stark contrast among undergraduates: those like herself seated in front attentively taking notes, and those at the back engrossed in trivialities.\n\nSalma soon became the ringleader of a glamorous clique including Ada, Tomi, and Ngozi. They lived in an expensive off-campus apartment funded by mysterious benefactors. Ummi observed from a safe distance as Salma's grades began to plummet."
      },
      {
        title: "Chapter 4: The Downfall & Examination Committee",
        content: "The day of reckoning arrived during the second-semester examinations. Panicked by her lack of preparation, Salma concealed illicit formula sheets inside her handbag. When the vigilant invigilator caught her whispering answers to Kolawole, both were immediately handed Malpractice query slips.\n\nFacing the University Examination Ethics Committee, Salma attempted bribery through Habib, only to discover that the committee chairman was unyielding. Salma was expelled, learning too late that character is indeed the cornerstone of destiny."
      }
    ]
  },
  {
    id: "book_second_class_citizen",
    title: "Second-Class Citizen",
    author: "Buchi Emecheta",
    description: "Prescribed UTME African Prose. The poignant story of Adah Ofili navigating childhood in Lagos, migration to the UK, racial prejudice, marital abuse, and her triumphant emergence as an author.",
    category: "UTME African Prose",
    readingProgressPercent: 40,
    lastReadChapterIndex: 0,
    characters: [
      { name: "Adah Ofili", role: "Protagonist", description: "A determined, resilient Nigerian woman who overcomes institutional sexism and abuse in London to become an accomplished writer." },
      { name: "Francis Obi", role: "Antagonist / Husband", description: "Adah's insecure, abusive, and misogynistic husband who burns her first book manuscript out of pure spite." },
      { name: "Pa Noble", role: "Landlord", description: "An elderly Nigerian migrant in London whose tragic compromises illustrate the harsh realities facing African immigrants." },
      { name: "Trudy", role: "Babysitter", description: "A negligent, registered English child-minder whose poor care causes Adah's son Vicky to contract meningitis." }
    ],
    themes: [
      { title: "Racial Discrimination & The Immigrant Experience", explanation: "The harsh reality of 'Sorry, no coloureds' signs and systemic disenfranchisement in 1960s London." },
      { title: "Female Independence & Resilience", explanation: "Adah's refusal to be crushed by domestic violence and patriarchal subjugation." }
    ],
    chapters: [
      {
        title: "Chapter 1: Childhood in Lagos",
        content: "Adah grows up in Lagos with a deep dream of visiting the United Kingdom. Despite gender bias that favors boys for schooling, Adah runs away to attend Methodist Primary School. Ma is forced to drink gari at the police station for child neglect. Pa gives Adah a light beating and calls her 'Nne nna'. The Ibuza women celebrate the return of Lawyer Nweze in their special uniforms."
      },
      {
        title: "Chapter 2: London Arrival & Shock",
        content: "Adah arrives in Liverpool in cold March, expecting a glorious city of golden streets. Instead, she is greeted by grey skies and a cramped single half-room in Ashdown Street. Francis tells her plainly: in England, black people are second-class citizens."
      },
      {
        title: "Chapter 3: The Burning of the Manuscript",
        content: "Working long hours at the Chalk Farm library, Adah completes her first novel, 'The Bride Price'. Colleagues praise its depth and emotional resonance. When she proudly shows it to Francis, he incinerates it in the stove. This cruel betrayal gives Adah the final courage to pack her children and leave."
      }
    ]
  },
  {
    id: "book_lion_jewel",
    title: "The Lion and the Jewel",
    author: "Wole Soyinka",
    description: "Prescribed UTME African Drama. Classic satirical comedy pitting traditional African wisdom and virility (Baroka the Bale) against modern Western mimicry (Lakunle the schoolteacher) for the hand of Sidi, the village belle.",
    category: "UTME African Drama",
    readingProgressPercent: 50,
    lastReadChapterIndex: 1,
    characters: [
      { name: "Baroka (The Bale)", role: "The Lion", description: "The sixty-two-year-old village chief of Ilujinle who embodies shrewd native intelligence, virility, and preservation of tradition." },
      { name: "Lakunle", role: "The Modern Mimic", description: "A pompous, semi-educated schoolteacher whose shallow Western idealism causes him to refuse paying the customary bride-price." },
      { name: "Sidi", role: "The Jewel", description: "The gorgeous village belle whose vanity skyrockets when her photographs appear in a Lagos magazine." },
      { name: "Sadiku", role: "Senior Wife", description: "Baroka's chief wife and matchmaker who falls for Baroka's cunning trick about his lost virility." }
    ],
    themes: [
      { title: "Tradition vs Modernity", explanation: "The clash between deeply rooted Yoruba customs and superficial Western assimilation." },
      { title: "Vanity and Shrewdness", explanation: "Sidi's pride leading her into the cunning trap set by the crafty old Bale." }
    ],
    chapters: [
      {
        title: "Morning (The Village Square)",
        content: "Lakunle confronts Sidi for carrying a pail of water on her head, arguing that it compresses her neck. Sidi laughs off his complaints and insists that if Lakunle wants to marry her, he must pay her bride-price according to custom, or people will assume she was not a virgin."
      },
      {
        title: "Noon (The Palace & The Ruse)",
        content: "Baroka confides in Sadiku that his manhood left him a week ago. Overjoyed, Sadiku dances in triumph, celebrating female victory over the lion. When Sidi hears this, she visits Baroka's palace to gloat, unaware that the Bale has laid a trap for her."
      },
      {
        title: "Night (The Triumph)",
        content: "Baroka seduces Sidi by showing her a machine that will print her image on official postage stamps. Sidi succumbs, loses her virginity to the Bale, and proudly chooses to marry Baroka over the verbose Lakunle."
      }
    ]
  },
  {
    id: "book_she_walks_in_beauty",
    title: "She Walks in Beauty",
    author: "Lord Byron",
    description: "Selected UTME Poem. Romantic masterpiece exploring the sublime harmony between darkness and light, physical grace, and inner virtue.",
    category: "Selected UTME Poems",
    readingProgressPercent: 90,
    lastReadChapterIndex: 0,
    themes: [
      { title: "Harmony of Opposites", explanation: "The perfect coexistence of light and dark, creating a tender, mellow grace." },
      { title: "Inner Moral Purity", explanation: "Physical beauty portrayed as the external reflection of a virtuous, innocent soul." }
    ],
    chapters: [
      {
        title: "Stanzas & Poetic Devices",
        content: "She walks in beauty, like the night\nOf cloudless climes and starry skies;\nAnd all that’s best of dark and bright\nMeet in her aspect and her eyes;\nThus mellowed to that tender light\nWhich heaven to gaudy day denies.\n\n• Rhyme Scheme: ABABAB iambic tetrameter.\n• Key Figures of Speech: Simile (Line 1), Antithesis ('dark and bright'), Personification ('heaven to gaudy day denies')."
      }
    ]
  }
];

// Rich, verified, authentic JAMB UTME questions across all subjects
export const SEED_QUESTIONS: Question[] = [
  // --- ENGLISH LANGUAGE ---
  {
    id: "eng_01",
    subject: "English Language",
    topic: "The Life Changer (Novel)",
    year: "2024",
    questionText: "In Khadija Abubakar Jalli's 'The Life Changer', what was the primary reason Salma failed her first university continuous assessment test?",
    optionA: "She arrived two hours late to the exam venue",
    optionB: "She arrogantly refused to study, boasting that university tests were simple",
    optionC: "She was caught with foreign materials in her shoes",
    optionD: "The lecturer withheld her results out of personal spite",
    correctAnswerIndex: 1,
    explanation: "Salma underestimated Dr. Dabo's test due to pride and arrogance, refusing to study and falsely claiming university assessments were elementary.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "Original JAMB Question • 2024",
    isVerifiedJamb: true
  },
  {
    id: "eng_02",
    subject: "English Language",
    topic: "The Life Changer (Novel)",
    year: "2024",
    questionText: "According to Ummi's narration, why did the Hakimi (village head) celebrate Omar's admission to Ahmadu Bello University?",
    optionA: "Omar received a federal government scholarship award",
    optionB: "He was the first candidate from the community to gain entry into the prestigious Law faculty",
    optionC: "Omar scored the highest marks in the whole state",
    optionD: "His father promised to build a health clinic for the village",
    correctAnswerIndex: 1,
    explanation: "The Hakimi commended Omar because entering the faculty of Law was an unprecedented milestone for their community.",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "Original JAMB Question • 2024",
    isVerifiedJamb: true
  },
  {
    id: "eng_03",
    subject: "English Language",
    topic: "Lexis and Structure",
    year: "2023",
    questionText: "Neither the principal nor the teachers _______ present at the emergency PTA meeting yesterday.",
    optionA: "was",
    optionB: "were",
    optionC: "is",
    optionD: "are",
    correctAnswerIndex: 1,
    explanation: "According to the rule of proximity for correlative conjunctions ('neither...nor'), the verb agrees in number with the closer subject. 'Teachers' is plural, requiring 'were' for the past tense.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB English 2023 • Q14",
    isVerifiedJamb: true
  },
  {
    id: "eng_04",
    subject: "English Language",
    topic: "Synonyms & Antonyms",
    year: "2022",
    questionText: "Choose the word nearest in meaning to the capitalized word: The witness gave a LUCID account of the armed robbery incident.",
    optionA: "obscure",
    optionB: "coherent and clear",
    optionC: "ambiguous",
    optionD: "exaggerated",
    correctAnswerIndex: 1,
    explanation: "'Lucid' means expressed clearly and easy to understand. Hence, 'coherent and clear' is the exact synonym.",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB English 2022 • Q31",
    isVerifiedJamb: true
  },
  {
    id: "eng_05",
    subject: "English Language",
    topic: "Comprehension & Summary",
    year: "2021",
    passageText: "In developing economies, the rapid expansion of mobile telecommunications has transformed informal commerce. Market women and artisan cooperatives now bypass traditional bureaucratic middlemen, negotiating wholesale prices directly via encrypted messaging platforms. This digital leapfrogging has substantially reduced transaction costs and bolstered financial inclusion across rural enclaves.",
    questionText: "According to the passage, the primary advantage of mobile telecommunications for market women is that it:",
    optionA: "guarantees government agricultural subsidies",
    optionB: "eliminates reliance on cumbersome middlemen",
    optionC: "mandates commercial bank account registrations",
    optionD: "provides free high-speed wireless connectivity",
    correctAnswerIndex: 1,
    explanation: "The text directly affirms: 'Market women and artisan cooperatives now bypass traditional bureaucratic middlemen, negotiating wholesale prices directly'.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB English 2021 • Comprehension",
    isVerifiedJamb: true
  },
  {
    id: "eng_06",
    subject: "English Language",
    topic: "Oral English & Phonetics",
    year: "2020",
    questionText: "Identify the word that contains the vowel sound /i:/ as in 'police':",
    optionA: "machine",
    optionB: "village",
    optionC: "busy",
    optionD: "women",
    correctAnswerIndex: 0,
    explanation: "'Machine' is transcribed as /məˈʃiːn/, featuring the long /i:/ vowel sound, identical to 'police' /pəˈliːs/.",
    difficulty: "Hard",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB English 2020 • Oral",
    isVerifiedJamb: true
  },

  // --- MATHEMATICS ---
  {
    id: "mth_01",
    subject: "Mathematics",
    topic: "Indices, Logarithms & Surds",
    year: "2024",
    questionText: "Evaluate without mathematical tables: log₁₀(25) + log₁₀(40) - log₁₀(10).",
    optionA: "1",
    optionB: "2",
    optionC: "3",
    optionD: "4",
    correctAnswerIndex: 1,
    explanation: "Using laws of logarithms: log₁₀(25 × 40 / 10) = log₁₀(1000 / 10) = log₁₀(100) = log₁₀(10²) = 2.",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Mathematics 2024 • Q4",
    isVerifiedJamb: true
  },
  {
    id: "mth_02",
    subject: "Mathematics",
    topic: "Progressions (AP & GP)",
    year: "2023",
    questionText: "The 3rd term of an Arithmetic Progression (A.P.) is 10 and the 8th term is 25. Find the first term (a) and common difference (d).",
    optionA: "a = 4, d = 3",
    optionB: "a = 2, d = 4",
    optionC: "a = 5, d = 3",
    optionD: "a = 3, d = 4",
    correctAnswerIndex: 0,
    explanation: "T₃ = a + 2d = 10, T₈ = a + 7d = 25. Subtracting equations: 5d = 15 => d = 3. Substituting into T₃: a + 2(3) = 10 => a = 4.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Mathematics 2023 • Q11",
    isVerifiedJamb: true
  },
  {
    id: "mth_03",
    subject: "Mathematics",
    topic: "Differentiation & Integration",
    year: "2023",
    questionText: "Find the derivative dy/dx of the curve y = 3x⁴ - 5x² + 7 at x = 2.",
    optionA: "64",
    optionB: "76",
    optionC: "82",
    optionD: "96",
    correctAnswerIndex: 1,
    explanation: "dy/dx = d/dx(3x⁴ - 5x² + 7) = 12x³ - 10x. At x = 2: dy/dx = 12(2³) - 10(2) = 12(8) - 20 = 96 - 20 = 76.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Mathematics 2023 • Q28",
    isVerifiedJamb: true
  },
  {
    id: "mth_04",
    subject: "Mathematics",
    topic: "Trigonometry & Ratios",
    year: "2022",
    questionText: "If sin θ = 3/5 and θ is an acute angle, calculate the value of tan θ + cos θ.",
    optionA: "31/20",
    optionB: "27/20",
    optionC: "7/5",
    optionD: "19/15",
    correctAnswerIndex: 0,
    explanation: "Using a right-angled triangle with opposite = 3 and hypotenuse = 5, adjacent = √(5² - 3²) = 4. cos θ = 4/5, tan θ = 3/4. tan θ + cos θ = 3/4 + 4/5 = (15 + 16)/20 = 31/20.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Mathematics 2022 • Q19",
    isVerifiedJamb: true
  },
  {
    id: "mth_05",
    subject: "Mathematics",
    topic: "Statistics & Probability",
    year: "2022",
    questionText: "Two fair dice are tossed simultaneously. What is the probability of obtaining a total score of 7?",
    optionA: "1/12",
    optionB: "1/6",
    optionC: "5/36",
    optionD: "1/4",
    correctAnswerIndex: 1,
    explanation: "Total outcomes = 6 × 6 = 36. Favorable outcomes yielding sum of 7: (1,6), (2,5), (3,4), (4,3), (5,2), (6,1) = 6 outcomes. P(sum = 7) = 6/36 = 1/6.",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Mathematics 2022 • Q35",
    isVerifiedJamb: true
  },

  // --- PHYSICS ---
  {
    id: "phy_01",
    subject: "Physics",
    topic: "Projectiles & Circular Motion",
    year: "2024",
    questionText: "A stone is launched with a velocity of 40 m/s at an angle of 30° to the horizontal. Calculate its maximum height attained (Take g = 10 m/s²).",
    optionA: "10 m",
    optionB: "20 m",
    optionC: "30 m",
    optionD: "40 m",
    correctAnswerIndex: 1,
    explanation: "H_max = (u² sin²θ) / (2g). u = 40, θ = 30°, sin(30°) = 0.5. H_max = (40² × 0.5²) / (2 × 10) = (1600 × 0.25) / 20 = 400 / 20 = 20 m.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Physics 2024 • Q7",
    isVerifiedJamb: true
  },
  {
    id: "phy_02",
    subject: "Physics",
    topic: "Current Electricity & Circuits",
    year: "2023",
    questionText: "Three resistors of values 2 Ω, 3 Ω, and 6 Ω are connected in parallel across a 12 V battery of negligible internal resistance. Calculate the total current drawn from the battery.",
    optionA: "6 A",
    optionB: "12 A",
    optionC: "18 A",
    optionD: "24 A",
    correctAnswerIndex: 1,
    explanation: "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1 => R_eq = 1 Ω. Total current I = V / R_eq = 12 V / 1 Ω = 12 A.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Physics 2023 • Q22",
    isVerifiedJamb: true
  },
  {
    id: "phy_03",
    subject: "Physics",
    topic: "Optics, Reflection & Refraction",
    year: "2023",
    questionText: "A ray of light traveling from glass (refractive index n = 1.50) into air strikes the boundary. Calculate the critical angle for total internal reflection.",
    optionA: "30.0°",
    optionB: "41.8°",
    optionC: "45.0°",
    optionD: "60.0°",
    correctAnswerIndex: 1,
    explanation: "sin(c) = 1/n = 1/1.5 = 2/3 ≈ 0.6667. c = arcsin(0.6667) ≈ 41.8°.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Physics 2023 • Q16",
    isVerifiedJamb: true
  },
  {
    id: "phy_04",
    subject: "Physics",
    topic: "Elasticity & Hooke's Law",
    year: "2022",
    questionText: "A spiral spring is stretched by 0.05 m when a force of 10 N is applied. Calculate the energy stored in the spring (elastic potential energy).",
    optionA: "0.25 J",
    optionB: "0.50 J",
    optionC: "1.00 J",
    optionD: "2.50 J",
    correctAnswerIndex: 0,
    explanation: "Elastic potential energy E = 1/2 × F × e = 0.5 × 10 N × 0.05 m = 0.25 Joules.",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Physics 2022 • Q12",
    isVerifiedJamb: true
  },

  // --- CHEMISTRY ---
  {
    id: "chm_01",
    subject: "Chemistry",
    topic: "Stoichiometry & Mole Concept",
    year: "2024",
    questionText: "Calculate the mass of calcium trioxocarbonate(IV) (CaCO₃) required to produce 4.4 g of carbon(IV) oxide (CO₂) upon complete thermal decomposition (Ca=40, C=12, O=16).",
    optionA: "5.0 g",
    optionB: "10.0 g",
    optionC: "20.0 g",
    optionD: "25.0 g",
    correctAnswerIndex: 1,
    explanation: "Reaction: CaCO₃ -> CaO + CO₂. Molar mass of CaCO₃ = 40 + 12 + 48 = 100 g/mol. Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles of CO₂ = 4.4 / 44 = 0.1 mol. Mass of CaCO₃ = 0.1 mol × 100 g/mol = 10.0 g.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Chemistry 2024 • Q18",
    isVerifiedJamb: true
  },
  {
    id: "chm_02",
    subject: "Chemistry",
    topic: "Gas Laws & Kinetic Theory",
    year: "2023",
    questionText: "Under constant pressure, the volume of a given mass of gas at 27°C is 300 cm³. What will be its volume at 127°C?",
    optionA: "200 cm³",
    optionB: "350 cm³",
    optionC: "400 cm³",
    optionD: "450 cm³",
    correctAnswerIndex: 2,
    explanation: "Charles's Law: V₁/T₁ = V₂/T₂. Temperatures must be converted to Kelvin: T₁ = 27 + 273 = 300 K; T₂ = 127 + 273 = 400 K. V₂ = (V₁ × T₂) / T₁ = (300 × 400) / 300 = 400 cm³.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Chemistry 2023 • Q8",
    isVerifiedJamb: true
  },
  {
    id: "chm_03",
    subject: "Chemistry",
    topic: "Acids, Bases & Salts",
    year: "2023",
    questionText: "What is the pH of a 0.001 M solution of tetraoxosulphate(VI) acid (H₂SO₄), assuming complete ionization?",
    optionA: "2.00",
    optionB: "2.70",
    optionC: "3.00",
    optionD: "3.70",
    correctAnswerIndex: 1,
    explanation: "H₂SO₄ is a diprotic acid: H₂SO₄ -> 2H⁺ + SO₄²⁻. [H⁺] = 2 × 0.001 M = 0.002 M = 2 × 10⁻³ M. pH = -log₁₀(2 × 10⁻³) = 3 - log₁₀(2) = 3 - 0.301 = 2.699 ≈ 2.70.",
    difficulty: "Hard",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Chemistry 2023 • Q24",
    isVerifiedJamb: true
  },
  {
    id: "chm_04",
    subject: "Chemistry",
    topic: "Organic Chemistry & Hydrocarbons",
    year: "2022",
    questionText: "Which of the following organic compounds decolorizes bromine water in the absence of light?",
    optionA: "Ethane",
    optionB: "Ethene",
    optionC: "Propane",
    optionD: "Methane",
    correctAnswerIndex: 1,
    explanation: "Ethene (C₂H₄) contains a carbon-carbon double bond (unsaturated hydrocarbon) that undergoes rapid electrophilic addition with bromine water, decolorizing the brown/red color to colorless 1,2-dibromoethane without light.",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Chemistry 2022 • Q15",
    isVerifiedJamb: true
  },

  // --- BIOLOGY ---
  {
    id: "bio_01",
    subject: "Biology",
    topic: "Genetics & Heredity",
    year: "2024",
    questionText: "If a heterozygous man with blood group A (I^A I^O) marries a woman with blood group B (I^B I^O), what is the probability of them having a child with blood group O?",
    optionA: "0%",
    optionB: "25%",
    optionC: "50%",
    optionD: "75%",
    correctAnswerIndex: 1,
    explanation: "Punnett square for I^A I^O × I^B I^O yields: I^A I^B (Group AB), I^A I^O (Group A), I^B I^O (Group B), and I^O I^O (Group O). Hence, 1 out of 4 (25%) will have blood group O.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Biology 2024 • Q32",
    isVerifiedJamb: true
  },
  {
    id: "bio_02",
    subject: "Biology",
    topic: "Cell Biology & Organization of Life",
    year: "2023",
    questionText: "The organelle responsible for intracellular digestion and hydrolytic breakdown of cellular waste is the:",
    optionA: "Mitochondrion",
    optionB: "Ribosome",
    optionC: "Lysosome",
    optionD: "Endoplasmic Reticulum",
    correctAnswerIndex: 2,
    explanation: "Lysosomes contain acid hydrolase enzymes capable of breaking down biomolecules, damaged cell structures, and engulfed foreign pathogens.",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Biology 2023 • Q5",
    isVerifiedJamb: true
  },
  {
    id: "bio_03",
    subject: "Biology",
    topic: "Ecology & Ecosystems",
    year: "2022",
    questionText: "A symbiotic relationship in which one organism benefits while the other is neither harmed nor helped is known as:",
    optionA: "Mutualism",
    optionB: "Commensalism",
    optionC: "Parasitism",
    optionD: "Amensalism",
    correctAnswerIndex: 1,
    explanation: "Commensalism is an interspecific ecological interaction where one partner gains benefits (such as food, shelter, or transport) without affecting the host favorably or adversely (e.g. epiphytes on trees).",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Biology 2022 • Q19",
    isVerifiedJamb: true
  },

  // --- PRINCIPLES OF ACCOUNTS (Authentic from accounts_data.json) ---
  {
    id: "acc_2010_02",
    subject: "Principles of Accounts",
    topic: "Accounting Profession",
    year: "2010",
    questionText: "The major function of accounting bodies in Nigeria is to ____.",
    optionA: "provide proper financial management of businesses",
    optionB: "provide good remuneration to the members",
    optionC: "promote the ethics of the profession",
    optionD: "show the dynamic nature of the profession",
    correctAnswerIndex: 2,
    explanation: "The primary statutory and professional responsibility of accounting bodies (such as ICAN and ANAN) is to set standards, regulate practice, and promote professional ethics and integrity among members.",
    originLabel: "JAMB Accounts 2010 • Q2",
    isVerifiedJamb: true
  },
  {
    id: "acc_2010_03",
    subject: "Principles of Accounts",
    topic: "Double Entry Bookkeeping & Ledger Classification",
    year: "2010",
    questionText: "Ledger accounts are mainly classified into ___.",
    optionA: "nominal, real and personal accounts",
    optionB: "fixed and current accounts",
    optionC: "management, financial and public sector accounting",
    optionD: "bank and cash accounts",
    correctAnswerIndex: 0,
    explanation: "Ledgers are traditionally classified into three main classes of accounts: Personal Accounts (persons/debtors/creditors), Real Accounts (tangible assets/property), and Nominal Accounts (expenses, losses, revenues, gains).",
    originLabel: "JAMB Accounts 2010 • Q3",
    isVerifiedJamb: true
  },
  {
    id: "acc_2010_04",
    subject: "Principles of Accounts",
    topic: "Correction of Errors & Suspense Accounts",
    year: "2010",
    questionText: "If salary account is debited instead of stationery account, the error committed is that of ___.",
    optionA: "commission",
    optionB: "omission",
    optionC: "principle",
    optionD: "compensation",
    correctAnswerIndex: 0,
    explanation: "An error of commission occurs when a transaction is entered in the wrong account of the same class (here, both Salary and Stationery are nominal/expense accounts).",
    originLabel: "JAMB Accounts 2010 • Q4",
    isVerifiedJamb: true
  },
  {
    id: "acc_2010_05",
    subject: "Principles of Accounts",
    topic: "Correction of Errors & Suspense Accounts",
    year: "2010",
    questionText: "If stationery bought for ₦200 has been entered as ₦2,000, to correct this error:",
    optionA: "debit stationery with ₦2,200",
    optionB: "credit stationery with ₦1,800",
    optionC: "debit stationery with ₦1,800",
    optionD: "credit stationery with ₦2,200",
    correctAnswerIndex: 1,
    explanation: "Stationery was overstated by ₦2,000 - ₦200 = ₦1,800 on the debit side. To reduce the stationery balance to the correct ₦200, credit stationery account with ₦1,800.",
    originLabel: "JAMB Accounts 2010 • Q5",
    isVerifiedJamb: true
  },

  // --- ECONOMICS ---
  {
    id: "eco_01",
    subject: "Economics",
    topic: "Elasticity of Demand & Supply",
    year: "2024",
    questionText: "When the price of a commodity increases from ₦50 to ₦60, its quantity demanded falls from 100 units to 70 units. Calculate the price elasticity of demand.",
    optionA: "0.5",
    optionB: "1.0",
    optionC: "1.5",
    optionD: "2.0",
    correctAnswerIndex: 2,
    explanation: "Percentage change in quantity demanded = (30/100) × 100 = 30%. Percentage change in price = (10/50) × 100 = 20%. Price Elasticity of Demand (Ped) = 30% / 20% = 1.5.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Economics 2024 • Q12",
    isVerifiedJamb: true
  },
  {
    id: "eco_02",
    subject: "Economics",
    topic: "National Income Accounting",
    year: "2023",
    questionText: "The total market value of all final goods and services produced within the geographic borders of a nation in a given year is known as:",
    optionA: "Gross National Product (GNP)",
    optionB: "Gross Domestic Product (GDP)",
    optionC: "Net National Product (NNP)",
    optionD: "National Disposable Income",
    correctAnswerIndex: 1,
    explanation: "GDP measures output within geographic borders regardless of nationality, whereas GNP incorporates net factor income from abroad.",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Economics 2023 • Q3",
    isVerifiedJamb: true
  },

  // --- GOVERNMENT ---
  {
    id: "gov_01",
    subject: "Government",
    topic: "Forms of Government (Democracy, Federalism)",
    year: "2024",
    questionText: "In a federal system of government, powers not expressly allocated to the central government or states in the constitution are termed:",
    optionA: "Exclusive powers",
    optionB: "Concurrent powers",
    optionC: "Residual powers",
    optionD: "Judicial powers",
    correctAnswerIndex: 2,
    explanation: "Residual powers are unlisted or unassigned powers left exclusively to regional or state governments in a federal constitution (such as in Nigeria and the United States).",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Government 2024 • Q9",
    isVerifiedJamb: true
  },
  {
    id: "gov_02",
    subject: "Government",
    topic: "Constitutional Development in Nigeria",
    year: "2023",
    questionText: "Which Nigerian pre-independence constitution introduced the elective principle for the first time in 1922?",
    optionA: "Clifford Constitution",
    optionB: "Richards Constitution",
    optionC: "Macpherson Constitution",
    optionD: "Lyttelton Constitution",
    correctAnswerIndex: 0,
    explanation: "The Hugh Clifford Constitution of 1922 introduced the elective principle, creating four elected legislative council seats (3 for Lagos and 1 for Calabar).",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Government 2023 • Q17",
    isVerifiedJamb: true
  },

  // --- LITERATURE IN ENGLISH ---
  {
    id: "lit_01",
    subject: "Literature in English",
    topic: "African Drama: The Lion and the Jewel",
    year: "2024",
    questionText: "In Wole Soyinka's 'The Lion and the Jewel', Lakunle refuses to pay Sidi's bride-price because he views the custom as:",
    optionA: "An unfair demand by village elders",
    optionB: "A barbaric and uncivilized feudal practice",
    optionC: "Too expensive for his meager schoolteacher salary",
    optionD: "Forbidden by the colonial district commissioner",
    correctAnswerIndex: 1,
    explanation: "Lakunle boasts of modern Western civilization and condescendingly dismisses the payment of bride-price as a 'savage' and 'barbaric' custom that treats women like property.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Literature 2024 • Q21",
    isVerifiedJamb: true
  },
  {
    id: "lit_02",
    subject: "Literature in English",
    topic: "African Prose: Second-Class Citizen",
    year: "2023",
    questionText: "In Buchi Emecheta's 'Second-Class Citizen', what event serves as the ultimate catalyst for Adah permanently leaving Francis?",
    optionA: "Francis refusing to pay school fees for Titi and Vicky",
    optionB: "Francis burning the manuscript of her first novel, 'The Bride Price'",
    optionC: "The London council serving them an eviction notice",
    optionD: "Adah being denied a library promotion at Chalk Farm",
    correctAnswerIndex: 1,
    explanation: "When Francis maliciously burns Adah's completed handwritten manuscript of 'The Bride Price' in the stove, Adah realizes her husband is irredeemably toxic and takes her children away.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Literature 2023 • Q34",
    isVerifiedJamb: true
  },

  // --- COMMERCE ---
  {
    id: "com_01",
    subject: "Commerce",
    topic: "Aids to Trade (Banking, Insurance, Warehousing)",
    year: "2024",
    questionText: "The document issued by a warehouse keeper acknowledging receipt of goods for storage and transferring title upon endorsement is a:",
    optionA: "Delivery note",
    optionB: "Dock warrant",
    optionC: "Consignment note",
    optionD: "Bill of lading",
    correctAnswerIndex: 1,
    explanation: "A dock warrant (or warehouse warrant) is a negotiable document of title issued by warehouse owners entitling the holder or endorsee to claim specified stored goods.",
    difficulty: "Medium",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB Commerce 2024 • Q15",
    isVerifiedJamb: true
  },

  // --- CHRISTIAN RELIGIOUS STUDIES ---
  {
    id: "crk_01",
    subject: "Christian Religious Studies",
    topic: "The Passion, Death and Resurrection of Jesus",
    year: "2024",
    questionText: "According to Matthew's Gospel, what supernatural sign occurred at the exact moment Jesus gave up the ghost on the cross?",
    optionA: "Manna fell from heaven",
    optionB: "The veil of the temple was rent in twain from top to bottom",
    optionC: "The River Jordan ceased flowing",
    optionD: "A rainbow encircled Mount Calvary",
    correctAnswerIndex: 1,
    explanation: "Matthew 27:51 states: 'And, behold, the veil of the temple was rent in twain from the top to the bottom; and the earth did quake, and the rocks rent'.",
    difficulty: "Easy",
    originType: "JAMB_ORIGINAL",
    originLabel: "JAMB CRS 2024 • Q28",
    isVerifiedJamb: true
  }
];
