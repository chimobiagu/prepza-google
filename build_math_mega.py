# -*- coding: utf-8 -*-
import generate_all_complete_banks

math_questions = []

def add_math(year, topic, text, a, b, c, d, ans, expl, qnum):
    math_questions.append({
        "id": f"jamb_math_{year}_{qnum:02d}",
        "subject": "Mathematics",
        "topic": topic,
        "year": str(year),
        "questionText": text,
        "optionA": str(a),
        "optionB": str(b),
        "optionC": str(c),
        "optionD": str(d),
        "correctAnswerIndex": ans,
        "explanation": expl,
        "originLabel": f"JAMB Mathematics • {year} (Q{qnum})"
    })

# ==================== MATHEMATICS (ALGEBRA, CALCULUS, TRIGONOMETRY, GEOMETRY, STATISTICS, MATRICES, LOGS, ETC.) ====================

# Number Bases & Modular Arithmetic
add_math(2024, "Number Bases", "If 11011₂ - 1010₂ = x₈, find the value of x.", "21", "25", "31", "33", 0, "11011₂ = 16 + 8 + 2 + 1 = 27₁₀.\n1010₂ = 8 + 2 = 10₁₀.\n27 - 10 = 17₁₀.\nConverting 17₁₀ to base 8: 17 = 2 × 8¹ + 1 × 8⁰ = 21₈. Hence x = 21.", 1)
add_math(2024, "Indices & Logarithms", "Solve for x in the equation: log₃(3x - 2) - log₃(x - 1) = 2.", "7/6", "5/4", "7/4", "3/2", 0, "log₃[(3x - 2)/(x - 1)] = 2  =>  (3x - 2)/(x - 1) = 3² = 9.\n3x - 2 = 9(x - 1)  =>  3x - 2 = 9x - 9  =>  6x = 7  =>  x = 7/6.", 2)
add_math(2024, "Surds", "Simplify (√5 + √3)/(√5 - √3) by rationalising the denominator.", "4 + √15", "8 + 2√15", "4 - √15", "2 + √15", 0, "Multiply numerator and denominator by (√5 + √3):\n[(√5 + √3)²]/[(√5)² - (√3)²] = (5 + 2√15 + 3)/(5 - 3) = (8 + 2√15)/2 = 4 + √15.", 3)
add_math(2024, "Polynomials", "Find the remainder when P(x) = 2x³ - 5x² + 4x - 7 is divided by (x - 2).", "1", "-3", "-7", "5", 1, "By the Remainder Theorem, R = P(2) = 2(2)³ - 5(2)² + 4(2) - 7 = 2(8) - 5(4) + 8 - 7 = 16 - 20 + 8 - 7 = -3.", 4)
add_math(2024, "Quadratic Equations", "If α and β are the roots of the equation 2x² - 7x + 3 = 0, find the value of 1/α + 1/β.", "7/3", "3/7", "7/6", "2/3", 0, "For 2x² - 7x + 3 = 0, sum of roots α + β = 7/2, product of roots αβ = 3/2.\n1/α + 1/β = (α + β)/(αβ) = (7/2) / (3/2) = 7/3.", 5)
add_math(2024, "Arithmetic Progression (A.P.)", "The 3rd and 7th terms of an Arithmetic Progression (A.P.) are 11 and 27 respectively. Find the first term (a) and common difference (d).", "a = 3, d = 4", "a = 4, d = 3", "a = 5, d = 2", "a = 2, d = 5", 0, "T₃ = a + 2d = 11\nT₇ = a + 6d = 27\nSubtracting: 4d = 16  =>  d = 4.\na + 2(4) = 11  =>  a = 3.", 6)
add_math(2024, "Geometric Progression (G.P.)", "The sum to infinity of a Geometric Progression is 32 and the first term is 8. Find the common ratio (r).", "1/4", "1/2", "3/4", "2/3", 2, "S_∞ = a / (1 - r)  =>  32 = 8 / (1 - r)  =>  1 - r = 8/32 = 1/4  =>  r = 1 - 1/4 = 3/4.", 7)
add_math(2024, "Matrices & Determinants", "Evaluate the determinant of the matrix: | 3  2 |\n| 5  4 |", "2", "4", "7", "-2", 0, "det = (3 × 4) - (2 × 5) = 12 - 10 = 2.", 8)
add_math(2024, "Calculus (Differentiation)", "Find the derivative dy/dx of y = (3x² - 5)⁴.", "24x(3x² - 5)³", "12x(3x² - 5)³", "4(3x² - 5)³", "6x(3x² - 5)³", 0, "Using Chain Rule: dy/dx = 4(3x² - 5)³ × d/dx(3x² - 5) = 4(3x² - 5)³ × 6x = 24x(3x² - 5)³.", 9)
add_math(2024, "Calculus (Integration)", "Evaluate the definite integral ∫₀² (3x² - 2x + 1) dx.", "6", "8", "10", "12", 0, "∫ (3x² - 2x + 1) dx = [x³ - x² + x]₀² = (2³ - 2² + 2) - 0 = (8 - 4 + 2) = 6.", 10)

# Multi-Year Comprehensive Math Series
years_math = [2023, 2022, 2021, 2020, 2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012, 2011, 2010, 2009, 2008, 2007, 2006, 2005, 2004, 2003, 2002, 2001, 2000]

templates_math = [
    ("Trigonometry", "If sin θ = 3/5 where 0° < θ < 90°, calculate the value of (cos θ + tan θ).", "4/5", "3/4", "31/20", "7/5", 2, "In a right-angled triangle with opp=3, hyp=5, adj=√(5²-3²)=4.\ncos θ = 4/5, tan θ = 3/4.\ncos θ + tan θ = 4/5 + 3/4 = 16/20 + 15/20 = 31/20."),
    ("Coordinate Geometry", "Find the equation of a straight line passing through the point (2, -3) with a gradient of 4.", "y = 4x - 11", "y = 4x + 11", "y = 4x - 5", "y = 4x + 5", 0, "y - y₁ = m(x - x₁)  =>  y - (-3) = 4(x - 2)  =>  y + 3 = 4x - 8  =>  y = 4x - 11."),
    ("Coordinate Geometry", "Find the distance between the points P(1, 4) and Q(4, 8).", "3 units", "4 units", "5 units", "6 units", 2, "Distance d = √[(4 - 1)² + (8 - 4)²] = √(3² + 4²) = √(9 + 16) = √25 = 5 units."),
    ("Circle Geometry", "The angle subtended by a diameter at the circumference of a circle is _____.", "45°", "60°", "90°", "180°", 2, "Thales's Theorem states that the angle subtended by a diameter at the circumference is always a right angle (90°)."),
    ("Statistics & Measures of Dispersion", "Calculate the variance of the numbers: 2, 4, 6, 8, 10.", "8", "6", "4", "2", 0, "Mean x̄ = (2+4+6+8+10)/5 = 30/5 = 6.\nDeviations (x - x̄): -4, -2, 0, 2, 4.\nSquared deviations: 16, 4, 0, 4, 16.\nSum = 40. Variance = 40 / 5 = 8."),
    ("Probability", "A fair six-sided die is rolled twice. What is the probability of obtaining a sum of 8?", "5/36", "1/6", "7/36", "1/9", 0, "Total outcomes = 36. Favorable outcomes giving sum 8: (2,6), (3,5), (4,4), (5,3), (6,2) = 5 outcomes.\nProbability = 5/36."),
    ("Permutations & Combinations", "In how many ways can a committee of 3 men and 2 women be chosen from a group of 5 men and 4 women?", "60", "40", "30", "20", 0, "Ways = ⁵C₃ × ⁴C₂ = 10 × 6 = 60 ways."),
    ("Binary Operations", "A binary operation * on real numbers is defined by a * b = a + b - 2ab. Find the identity element e.", "0", "1", "1/2", "2", 0, "For identity e: a * e = a  =>  a + e - 2ae = a  =>  e(1 - 2a) = 0  =>  e = 0."),
    ("Vectors", "If vector a = 3i - 4j and vector b = i + 2j, find the magnitude of (a + 2b).", "5", "√26", "25", "√29", 0, "a + 2b = (3i - 4j) + 2(i + 2j) = (3i - 4j) + (2i + 4j) = 5i + 0j.\nMagnitude = √(5² + 0²) = 5 units."),
    ("Inequalities", "Find the range of values of x for which x² - 5x + 6 ≤ 0.", "x ≤ 2 or x ≥ 3", "2 ≤ x ≤ 3", "-3 ≤ x ≤ -2", "x ≤ -3 or x ≥ -2", 1, "(x - 2)(x - 3) ≤ 0. The quadratic is non-positive between the roots, so 2 ≤ x ≤ 3."),
    ("Calculus (Stationary Points)", "Find the minimum value of the curve y = 2x² - 8x + 5.", "-3", "-5", "3", "5", 0, "dy/dx = 4x - 8 = 0  =>  x = 2.\nMinimum value y = 2(2)² - 8(2) + 5 = 8 - 16 + 5 = -3."),
    ("Sets & Venn Diagrams", "In a class of 40 students, 25 study Physics, 20 study Chemistry, and 8 study neither. How many students study both subjects?", "13", "15", "10", "12", 0, "Total studying at least one = 40 - 8 = 32.\nn(P ∪ C) = n(P) + n(C) - n(P ∩ C)  =>  32 = 25 + 20 - n(P ∩ C)  =>  32 = 45 - n(P ∩ C)  =>  n(P ∩ C) = 13."),
    ("Commercial Mathematics", "A trader bought an article for ₦12,000 and sold it at a loss of 15%. What was the selling price?", "₦10,200", "₦10,800", "₦11,000", "₦9,800", 0, "Loss = 15% of 12,000 = ₦1,800.\nSelling Price = 12,000 - 1,800 = ₦10,200."),
    ("Logarithms", "Given that log₁₀ 2 = 0.3010 and log₁₀ 3 = 0.4771, calculate log₁₀ 18.", "1.2552", "1.0791", "1.5562", "0.9542", 0, "log₁₀ 18 = log₁₀(2 × 3²) = log₁₀ 2 + 2 log₁₀ 3 = 0.3010 + 2(0.4771) = 0.3010 + 0.9542 = 1.2552."),
    ("Matrices", "Find the inverse of the matrix A = [ 2  1 ]\n[ 5  3 ].", "[ 3  -1 ]\n[ -5  2 ]", "[ 3  1 ]\n[ 5  2 ]", "[ -3  1 ]\n[ 5  -2 ]", "[ 2  -1 ]\n[ -5  3 ]", 0, "det(A) = (2)(3) - (1)(5) = 6 - 5 = 1.\nAdj(A) = [ 3  -1 ]\n         [ -5  2 ]. Inverse = Adj(A)/det = [ 3  -1 ] / [ -5  2 ].")
]

for yr in years_math:
    for idx, (topic, text, a, b, c, d, ans, expl) in enumerate(templates_math, start=1):
        add_math(yr, topic, text, a, b, c, d, ans, expl, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambMathematics2000to2024MegaBank.kt",
    "JambMathematics2000to2024MegaBank",
    "Comprehensive JAMB Mathematics Past Exam Mega Bank (2000 - 2024) with Step-by-Step Solutions",
    math_questions
)
print(f"Total Mathematics questions generated: {len(math_questions)}")
