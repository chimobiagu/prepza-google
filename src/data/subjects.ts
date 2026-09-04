export interface SubjectDefinition {
  id: string;
  displayName: string;
  code: string;
  category: 'General' | 'Sciences' | 'Commercial & Business' | 'Arts & Humanities';
  description: string;
  syllabusTopics: string[];
  isCoreCompulsory?: boolean;
  iconName: string;
  defaultQuestionCount: number;
}

export const SUBJECT_REGISTRY: SubjectDefinition[] = [
  {
    id: "english",
    displayName: "English Language",
    code: "ENG",
    category: "General",
    description: "Compulsory UTME subject testing Comprehension, Lexis, Structure, and Oral English.",
    syllabusTopics: [
      "The Life Changer (Novel)",
      "Comprehension & Summary",
      "Lexis and Structure",
      "Synonyms & Antonyms",
      "Sentence Completion",
      "Idioms & Figures of Speech",
      "Oral English & Phonetics",
      "UTME Prescribed Literature"
    ],
    isCoreCompulsory: true,
    iconName: "book-open",
    defaultQuestionCount: 60
  },
  {
    id: "mathematics",
    displayName: "Mathematics",
    code: "MTH",
    category: "Sciences",
    description: "Core quantitative subject testing Algebra, Geometry, Trigonometry, Calculus, and Statistics.",
    syllabusTopics: [
      "Number Bases & Modular Arithmetic",
      "Fractions, Decimals & Approximations",
      "Indices, Logarithms & Surds",
      "Sets, Relations & Functions",
      "Progressions (AP & GP)",
      "Quadratic & Polynomial Equations",
      "Simultaneous & Linear Equations",
      "Matrices & Determinants",
      "Trigonometry & Ratios",
      "Coordinate Geometry & Straight Lines",
      "Differentiation & Integration",
      "Statistics & Probability",
      "Permutations & Combinations"
    ],
    iconName: "calculator",
    defaultQuestionCount: 40
  },
  {
    id: "physics",
    displayName: "Physics",
    code: "PHY",
    category: "Sciences",
    description: "Fundamental principles of Mechanics, Thermal Physics, Waves, Optics, Electricity, and Modern Physics.",
    syllabusTopics: [
      "Units, Dimensions & Measurements",
      "Scalars & Vectors",
      "Motion, Speed & Acceleration",
      "Projectiles & Circular Motion",
      "Newton's Laws of Motion & Momentum",
      "Work, Energy & Power",
      "Machines & Mechanical Advantage",
      "Elasticity & Hooke's Law",
      "Fluid Statics, Pressure & Archimedes",
      "Thermal Physics, Heat & Gas Laws",
      "Waves & Sound Propagation",
      "Optics, Reflection & Refraction",
      "Electrostatics & Electric Fields",
      "Current Electricity & Circuits",
      "Magnetism & Electromagnetism",
      "Atomic & Modern Physics"
    ],
    iconName: "zap",
    defaultQuestionCount: 40
  },
  {
    id: "chemistry",
    displayName: "Chemistry",
    code: "CHM",
    category: "Sciences",
    description: "Physical, Organic, and Inorganic Chemistry principles and applications.",
    syllabusTopics: [
      "Separation of Mixtures & Purification",
      "Atomic Structure & Periodic Table",
      "Chemical Bonding & Shapes of Molecules",
      "Stoichiometry & Mole Concept",
      "Gas Laws & Kinetic Theory",
      "Acids, Bases & Salts",
      "Chemical Energetics & Thermodynamics",
      "Rates of Reaction & Equilibrium",
      "Redox Reactions & Electrochemistry",
      "Non-Metals & Their Compounds",
      "Metals & Extraction Metallurgy",
      "Organic Chemistry & Hydrocarbons",
      "Functional Groups & Polymers"
    ],
    iconName: "flask-conical",
    defaultQuestionCount: 40
  },
  {
    id: "biology",
    displayName: "Biology",
    code: "BIO",
    category: "Sciences",
    description: "Life sciences examining Cell Biology, Physiology, Genetics, Ecology, and Evolution.",
    syllabusTopics: [
      "Cell Biology & Organization of Life",
      "Plant & Animal Nutrition",
      "Transport Systems in Organisms",
      "Respiration & Gaseous Exchange",
      "Excretion & Osmoregulation",
      "Coordination & Nervous System",
      "Reproduction & Growth",
      "Genetics & Heredity",
      "Ecology & Ecosystems",
      "Evolution & Adaptation"
    ],
    iconName: "dna",
    defaultQuestionCount: 40
  },
  {
    id: "economics",
    displayName: "Economics",
    code: "ECO",
    category: "Commercial & Business",
    description: "Principles of Microeconomics, Macroeconomics, Public Finance, Money & Banking, and International Trade.",
    syllabusTopics: [
      "Basic Economic Concepts (Scarcity & Choice)",
      "Theory of Demand and Supply",
      "Elasticity of Demand & Supply",
      "Theory of Production & Cost",
      "Market Structures & Price Determination",
      "Business Organizations & Firms",
      "National Income Accounting",
      "Money and Banking Systems",
      "Inflation, Deflation & Monetary Policy",
      "Public Finance & Taxation",
      "International Trade & Balance of Payments",
      "Economic Development & Planning"
    ],
    iconName: "trending-up",
    defaultQuestionCount: 40
  },
  {
    id: "government",
    displayName: "Government",
    code: "GOV",
    category: "Arts & Humanities",
    description: "Political concepts, governance systems, constitutional developments, and Nigerian political history.",
    syllabusTopics: [
      "Basic Political Concepts & Ideologies",
      "Forms of Government (Democracy, Federalism)",
      "Arms of Government & Rule of Law",
      "Elections, Parties & Pressure Groups",
      "Public Administration & Civil Service",
      "Pre-Colonial Administration in Nigeria",
      "Colonial Rule & Indirect Rule System",
      "Constitutional Development in Nigeria",
      "Post-Independence Politics & Republics",
      "Military Rule in Nigerian History",
      "Nigerian Foreign Policy",
      "International Organizations (UN, AU, ECOWAS)"
    ],
    iconName: "landmark",
    defaultQuestionCount: 40
  },
  {
    id: "literature",
    displayName: "Literature in English",
    code: "LIT",
    category: "Arts & Humanities",
    description: "Prescribed African and Non-African Prose, Drama, Poetry, and Literary Principles.",
    syllabusTopics: [
      "Principles of Literary Appreciation",
      "Drama Devices & Dramatic Irony",
      "African Prose: Second-Class Citizen",
      "Non-African Prose: Wuthering Heights",
      "African Drama: The Lion and the Jewel",
      "Non-African Drama: Look Back in Anger",
      "Prescribed African Poetry",
      "Prescribed Non-African Poetry"
    ],
    iconName: "feather",
    defaultQuestionCount: 40
  },
  {
    id: "principles_of_accounts",
    displayName: "Principles of Accounts",
    code: "ACC",
    category: "Commercial & Business",
    description: "Double entry bookkeeping, ledger accounts, trial balances, final accounts, and partnership accounting.",
    syllabusTopics: [
      "Accounting Profession & Ethics",
      "Double Entry Bookkeeping & Ledger Classification",
      "Correction of Errors & Suspense Accounts",
      "Cash Book & Bank Reconciliation",
      "Final Accounts & Balance Sheet",
      "Partnership Accounts",
      "Company Accounts & Shares"
    ],
    iconName: "receipt",
    defaultQuestionCount: 40
  },
  {
    id: "commerce",
    displayName: "Commerce",
    code: "COM",
    category: "Commercial & Business",
    description: "Production, trade, aids to trade, banking, transportation, and consumer protection.",
    syllabusTopics: [
      "Introduction to Commerce & Production",
      "Home & Foreign Trade",
      "Aids to Trade (Banking, Insurance, Warehousing)",
      "Business Organizations",
      "Consumer Protection & Trade Associations"
    ],
    iconName: "shopping-bag",
    defaultQuestionCount: 40
  },
  {
    id: "crk",
    displayName: "Christian Religious Studies",
    code: "CRS",
    category: "Arts & Humanities",
    description: "Old and New Testament themes, Christian ethics, and contemporary social responsibility.",
    syllabusTopics: [
      "Sovereignty of God & Creation",
      "Leadership in Israel (Moses, Joshua, Judges)",
      "The Early Ministry of Jesus",
      "The Passion, Death and Resurrection of Jesus",
      "Fellowship in the Early Church & Epistles"
    ],
    iconName: "cross",
    defaultQuestionCount: 40
  }
];
