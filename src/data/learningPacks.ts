import { LearningPack } from '../types';

export const SEED_LEARNING_PACKS: LearningPack[] = [
  {
    id: "pack_eng_life_changer",
    subject: "English Language",
    topicName: "The Life Changer (Novel)",
    groupName: "UTME Compulsory Prose",
    overview: "Master all characters, key plots, moral themes, and exam questions for Khadijat Abubakar Jalli's prescribed novel.",
    estimatedMinutes: 8,
    cards: [
      {
        id: "card_lc_1",
        cardType: "DEFINITION",
        title: "Novel Overview & Setting",
        content: "The Life Changer follows Ummi, a wise mother in Kano who narrates her tertiary education experiences to her children as Omar gains admission to study Law at Ahmadu Bello University (ABU).",
        bulletPoints: [
          "Author: Khadijat Abubakar Jalli",
          "Main Themes: Education as empowerment, examination malpractice, deceptive appearances, female perseverance",
          "Primary Setting: University campus and traditional Northern Nigerian community"
        ],
        keyTakeaway: "Education transforms lives, but individual moral integrity determines longevity and success.",
        examTip: "JAMB tests names of minor characters (e.g. Bint, Jamila, Teemah) and specific plot devices like the snake story."
      },
      {
        id: "card_lc_2",
        cardType: "COMPARISON",
        title: "Character Contrast: Ummi vs Salma",
        content: "Ummi represents patience, family values, and academic humility. Salma represents impatience, pride, peer pressure, and moral compromise.",
        bulletPoints: [
          "Ummi: Queues for 6 hours for official registration; respects Dr. Dabo",
          "Salma: Arrogantly tries to bribe lecturers; associates with Habib; engages in exam malpractice"
        ],
        keyTakeaway: "Salma's expulsion shows that shortcuts in academic environments result in catastrophic ruin."
      },
      {
        id: "card_lc_3",
        cardType: "EXAM_TIP",
        title: "High-Frequency UTME Traps",
        content: "Pay close attention to who betrayed Salma in the examination hall.",
        bulletPoints: [
          "Kolawole was sitting next to Salma and answered the question together.",
          "Dr. Dabo was the upright lecturer who was approached inappropriately by Salma.",
          "Hakimi was the community head who celebrated Omar's entry into Law faculty."
        ],
        examTip: "Do not confuse Salma's friends (Ada, Tomi, Ngozi) with Ummi's children."
      }
    ]
  },
  {
    id: "pack_mth_quadratics",
    subject: "Mathematics",
    topicName: "Quadratic & Polynomial Equations",
    groupName: "Algebra Core",
    overview: "Formulas, vertex analysis, nature of roots, sum and product of roots for JAMB Mathematics.",
    estimatedMinutes: 6,
    cards: [
      {
        id: "card_quad_1",
        cardType: "FORMULA",
        title: "Nature of Roots & Discriminant",
        content: "The nature of the roots of ax² + bx + c = 0 is determined by the discriminant Δ = b² - 4ac.",
        formula: "Δ = b² - 4ac",
        bulletPoints: [
          "If b² - 4ac > 0: Two real, distinct roots",
          "If b² - 4ac = 0: Two equal/repeated real roots (perfect square)",
          "If b² - 4ac < 0: No real roots (complex/imaginary roots)"
        ],
        keyTakeaway: "When a question says 'equal roots' or 'tangent to the x-axis', set b² - 4ac = 0 immediately."
      },
      {
        id: "card_quad_2",
        cardType: "FORMULA",
        title: "Sum and Product of Roots (Vieta's Formulas)",
        content: "For quadratic equation ax² + bx + c = 0 with roots α and β:",
        formula: "α + β = -b/a  |  αβ = c/a",
        bulletPoints: [
          "Equation with roots α and β is: x² - (α + β)x + αβ = 0",
          "α² + β² = (α + β)² - 2αβ",
          "1/α + 1/β = (α + β) / (αβ)"
        ],
        examTip: "JAMB frequently tests (α² + β²) without needing you to find individual root values!"
      }
    ]
  },
  {
    id: "pack_phy_projectiles",
    subject: "Physics",
    topicName: "Projectiles & Circular Motion",
    groupName: "Mechanics",
    overview: "Maximum height, time of flight, horizontal range, and trajectory equations under gravity.",
    estimatedMinutes: 7,
    cards: [
      {
        id: "card_proj_1",
        cardType: "FORMULA",
        title: "Governing Projectile Formulas",
        content: "For a projectile launched with initial velocity u at angle θ to horizontal under acceleration g:",
        bulletPoints: [
          "Time of Flight: T = (2u sin θ) / g",
          "Maximum Height: H = (u² sin² θ) / (2g)",
          "Horizontal Range: R = (u² sin 2θ) / g"
        ],
        keyTakeaway: "Range is maximum when launch angle θ = 45° (since sin 90° = 1).",
        examTip: "Complementary angles (e.g. 30° and 60°, or 20° and 70°) yield the exact same horizontal range R!"
      }
    ]
  },
  {
    id: "pack_chm_gas_laws",
    subject: "Chemistry",
    topicName: "Gas Laws & Kinetic Theory",
    groupName: "Physical Chemistry",
    overview: "Boyle's, Charles's, Gay-Lussac's, Avogadro's, and Graham's Law of Diffusion.",
    estimatedMinutes: 6,
    cards: [
      {
        id: "card_gas_1",
        cardType: "FORMULA",
        title: "Graham's Law of Diffusion",
        content: "Under identical conditions of temperature and pressure, the rate of diffusion (r) of a gas is inversely proportional to the square root of its density (d) or molar mass (M).",
        formula: "r₁ / r₂ = √(M₂ / M₁)",
        bulletPoints: [
          "Lighter gases diffuse faster than denser gases",
          "Example: H₂ (M=2) diffuses 4 times faster than O₂ (M=32)"
        ],
        examTip: "Always check molar masses carefully: NH₃ (17) diffuses faster than HCl (36.5)."
      }
    ]
  }
];
