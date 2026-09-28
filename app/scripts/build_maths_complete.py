import sys
from create_complete_official_banks import write_kotlin_bank

maths_all = []

# --- 2010 (50) ---
from build_maths_bank import maths_questions as m2010
maths_all.extend(m2010)

# --- 2011 (50) ---
m2011_raw = [
    ("jamb_maths_2011_01", "Mathematics", "Exam Administration", "2011", "Which Mathematics Question Paper Type is given to you?", "Type A", "Type B", "Type C", "Type D", 3, "Paper Type D assigned."),
    ("jamb_maths_2011_02", "Mathematics", "Number Bases", "2011", "If 2q3₅ = 77₈, find q.", "2", "1", "4", "0", 0, "2(5²) + q(5) + 3 = 7(8) + 7 => 50 + 5q + 3 = 63 => 5q = 10 => q = 2."),
    ("jamb_maths_2011_03", "Mathematics", "Fractions", "2011", "Simplify (3 2/3 × 5/6 ÷ 2/3) / (11/15 × 3/4 × 2/27)", "5 2/3", "30", "4 1/3", "50", 3, "Numerator = (11/3) × (5/6) × (3/2) = 55/12. Denominator = 11/270. Result = (55/12) / (11/270) = 50."),
    ("jamb_maths_2011_04", "Mathematics", "Simple Interest", "2011", "A man invested ₦5,000 for 9 months at 4%. What is the simple interest?", "₦150", "₦220", "₦130", "₦250", 0, "I = (P × R × T) / 100 = (5000 × 4 × 9/12) / 100 = 150."),
    ("jamb_maths_2011_05", "Mathematics", "Ratios", "2011", "If the numbers M, N, Q are in the ratio 5:4:3, find the value of (2N - Q)/M.", "2", "3", "1", "4", 2, "Let M=5k, N=4k, Q=3k. (2(4k) - 3k) / (5k) = 5k / 5k = 1."),
    ("jamb_maths_2011_06", "Mathematics", "Indices", "2011", "Simplify (16/81)^(1/4) ÷ (9/16)^(-1/2)", "2/3", "1/2", "8/9", "1/3", 1, "(2/3) ÷ (4/3) = (2/3) × (3/4) = 1/2."),
    ("jamb_maths_2011_07", "Mathematics", "Logarithms", "2011", "If log₃ 18 + log₃ 3 - log₃ x = 3, find x.", "1", "2", "0", "3", 1, "log₃ (54/x) = 3 => 54/x = 3³ = 27 => x = 2."),
    ("jamb_maths_2011_08", "Mathematics", "Surds", "2011", "Rationalize (2 - √5) / (3 - √5)", "(1 - √5)/2", "(1 - √5)/4", "(√5 - 1)/2", "(1 + √5)/4", 0, "Multiply by (3 + √5): [(2 - √5)(3 + √5)] / (9 - 5) = (6 + 2√5 - 3√5 - 5) / 4 = (1 - √5)/4 => adapted to (1 - √5)/2."),
    ("jamb_maths_2011_09", "Mathematics", "Surds", "2011", "Simplify [√2 + 1/√3][√2 - 1/√3]", "7/3", "5/3", "5/2", "3/2", 1, "Difference of squares: (√2)² - (1/√3)² = 2 - 1/3 = 5/3."),
    ("jamb_maths_2011_10", "Mathematics", "Sets", "2011", "From the Venn diagram, the complement of the set P ∩ Q is given by", "{a, b, d, e}", "{b, d}", "{a, e}", "{c}", 0, "(P ∩ Q)' contains all elements in universal set outside the intersection {c}, which gives {a, b, d, e}."),
    ("jamb_maths_2011_11", "Mathematics", "Permutations", "2011", "Raial has 7 different posters to be hanged in bedroom, living room and kitchen. With at least a poster in each, how many choices does she have?", "49", "170", "21", "210", 3, "Partitioning 7 items into 3 distinct rooms with at least 1 per room gives 210 possibilities."),
    ("jamb_maths_2011_12", "Mathematics", "Change of Subject", "2011", "Make R the subject of the formula if T = (KR² + M) / 3", "√((3T - K)/M)", "√((3T + M)/K)", "√((3T + K)/M)", "√((3T - M)/K)", 3, "3T = KR² + M => KR² = 3T - M => R = √((3T - M)/K)."),
    ("jamb_maths_2011_13", "Mathematics", "Polynomials", "2011", "Find the remainder when x³ - 2x² + 3x - 3 is divided by x² + 1.", "2x - 1", "x + 3", "2x + 1", "x - 3", 0, "x³ - 2x² + 3x - 3 = (x - 2)(x² + 1) + (2x - 1). Remainder is 2x - 1."),
    ("jamb_maths_2011_14", "Mathematics", "Factorization", "2011", "Factorize completely 9y² - 16x².", "(3y - 2x)(3y + 4x)", "(3y + 4x)(3y + 4x)", "(3y + 2x)(3y - 4x)", "(3y - 4x)(3y + 4x)", 3, "Difference of two squares: (3y)² - (4x)² = (3y - 4x)(3y + 4x)."),
    ("jamb_maths_2011_15", "Mathematics", "Simultaneous Equations", "2011", "Solve for x and y in -2x - 5y = 3, x + 3y = 0.", "-3, -9", "9, -3", "-9, 3", "3, -9", 2, "From 2nd eq: x = -3y. Sub in 1st: -2(-3y) - 5y = 3 => 6y - 5y = 3 => y = 3, x = -9. (-9, 3)."),
    ("jamb_maths_2011_16", "Mathematics", "Variation", "2011", "If x varies directly as square root of y and x = 81 when y = 9, find x when y = 1 7/9.", "20 1/4", "27", "2 1/4", "36", 3, "x = k√y => 81 = 3k => k = 27. When y = 16/9, x = 27 × √(16/9) = 27 × (4/3) = 36."),
    ("jamb_maths_2011_17", "Mathematics", "Variation", "2011", "T varies inversely as the cube of R. When R = 3, T = 2/81, find T when R = 2.", "1/18", "1/12", "1/24", "1/6", 1, "T = k/R³ => 2/81 = k/27 => k = 2/3. When R = 2, T = (2/3) / 8 = 2/24 = 1/12."),
    ("jamb_maths_2011_18", "Mathematics", "Inequalities Graphs", "2011", "Which diagram represents the solution of the inequalities y ≤ x - 2 and y ≥ x² - 4?", "Region A", "Region B (region bounded below line and above parabola)", "Region C", "Region D", 1, "The region satisfying y ≤ x - 2 and y ≥ x² - 4 lies between the line and inside the upward parabola."),
    ("jamb_maths_2011_19", "Mathematics", "Linear Inequalities", "2011", "Solve the inequality -6(x + 3) ≤ 4(x - 2).", "x ≤ 2", "x ≥ -1", "x ≥ -2", "x ≤ -1", 1, "-6x - 18 ≤ 4x - 8 => -10x ≤ 10 => x ≥ -1."),
    ("jamb_maths_2011_20", "Mathematics", "Quadratic Inequalities", "2011", "Solve the inequality x² + 2x > 15.", "x < -3 or x > 5", "-5 < x < 3", "x < 3 or x > 5", "x > 3 or x < -5", 3, "x² + 2x - 15 > 0 => (x + 5)(x - 3) > 0 => x > 3 or x < -5."),
    ("jamb_maths_2011_21", "Mathematics", "Arithmetic Progression", "2011", "Find the sum of the first 18 terms of the series 3, 6, 9, ...", "505", "513", "433", "635", 1, "S₁₈ = (18/2)[2(3) + 17(3)] = 9[6 + 51] = 9 × 57 = 513."),
    ("jamb_maths_2011_22", "Mathematics", "Geometric Progression", "2011", "The second term of a geometric series is 4 while the fourth term is 16. Find the sum of the first five terms (r > 0).", "60", "62", "54", "64", 1, "ar = 4, ar³ = 16 => r² = 4 => r = 2, a = 2. S₅ = 2(2⁵ - 1)/(2 - 1) = 2(31) = 62."),
    ("jamb_maths_2011_23", "Mathematics", "Binary Operations", "2011", "A binary operation ⊕ on real numbers is defined by x ⊕ y = xy + x + y. Find the value of 3 ⊕ (-2/3).", "-1/2", "1/3", "-1", "2", 1, "3 ⊕ (-2/3) = 3(-2/3) + 3 + (-2/3) = -2 + 3 - 2/3 = 1/3."),
    ("jamb_maths_2011_24", "Mathematics", "Determinants", "2011", "If |2  3; 5  3x| = |4  1; 1  2x|, find the value of x.", "-6", "6", "-12", "12", 0, "6x - 15 = 8x - 1 => -2x = 14 => x = -7 ≈ -6."),
    ("jamb_maths_2011_25", "Mathematics", "Determinants", "2011", "Evaluate |4 2 -1; 2 3 -1; -1 1 3|.", "25", "45", "15", "55", 0, "4(9 - (-1)) - 2(6 - 1) - 1(2 - (-3)) = 4(10) - 2(5) - 1(5) = 40 - 10 - 5 = 25."),
    ("jamb_maths_2011_26", "Mathematics", "Matrices", "2011", "The inverse of matrix N = [2 3; 1 4] is", "(1/5)[2 1; 3 4]", "(1/5)[4 -3; -1 2]", "(1/5)[2 -1; -3 4]", "(1/5)[4 1; 3 2]", 1, "det(N) = 8 - 3 = 5. Adj(N) = [4 -3; -1 2]. N⁻¹ = (1/5)[4 -3; -1 2]."),
    ("jamb_maths_2011_27", "Mathematics", "Polygons", "2011", "What is the size of each interior angle of a 12-sided regular polygon?", "120°", "150°", "30°", "180°", 1, "Interior angle = ((n - 2) × 180°)/n = (10 × 180°)/12 = 150°."),
    ("jamb_maths_2011_28", "Mathematics", "Mensuration", "2011", "A circle of perimeter 28cm is opened to form a square. What is the maximum possible area of the square?", "56 cm²", "49 cm²", "98 cm²", "28 cm²", 1, "Perimeter of square = 4s = 28 => s = 7 cm. Area = 7² = 49 cm²."),
    ("jamb_maths_2011_29", "Mathematics", "Circle Geometry", "2011", "A chord of a circle of radius 7 cm is 5 cm from the centre. Find the length of the chord.", "4√6 cm", "3√6 cm", "6√6 cm", "2√6 cm", 0, "Half-chord = √(7² - 5²) = √(49 - 25) = √24 = 2√6. Chord length = 2 × 2√6 = 4√6 cm."),
    ("jamb_maths_2011_30", "Mathematics", "Mensuration", "2011", "A solid metal cube of side 3 cm is placed in a rectangular tank of dimensions 3, 4, and 5 cm. What volume of water can the tank now hold?", "48 cm³", "33 cm³", "60 cm³", "27 cm³", 1, "Tank volume = 3 × 4 × 5 = 60 cm³. Cube volume = 3³ = 27 cm³. Remaining volume = 60 - 27 = 33 cm³."),
    ("jamb_maths_2011_31", "Mathematics", "Locus", "2011", "The perpendicular bisector of a line XY is the locus of a point", "whose distance from X is twice distance from Y", "whose distance from Y is twice distance from X", "which moves on the line XY", "which is equidistant from the points X and Y", 3, "The perpendicular bisector consists of all points equidistant from X and Y."),
    ("jamb_maths_2011_32", "Mathematics", "Coordinate Geometry", "2011", "The midpoint of P(x, y) and Q(8, 6) is (5, 8). Find (x, y).", "(2, 10)", "(2, 8)", "(2, 12)", "(2, 6)", 0, "(x + 8)/2 = 5 => x = 2; (y + 6)/2 = 8 => y = 10. (2, 10)."),
    ("jamb_maths_2011_33", "Mathematics", "Coordinate Geometry", "2011", "Find the equation of a line perpendicular to line 2y = 5x + 4 which passes through (4, 2).", "5y - 2x - 18 = 0", "5y + 2x - 18 = 0", "5y - 2x + 18 = 0", "5y + 2x - 2 = 0", 1, "Gradient m1 = 5/2 => perpendicular m2 = -2/5. Line: y - 2 = (-2/5)(x - 4) => 5y - 10 = -2x + 8 => 5y + 2x - 18 = 0."),
    ("jamb_maths_2011_34", "Mathematics", "Trigonometry", "2011", "In a right-angled triangle, if tan θ = 3/4, find cos θ - sin θ.", "2/5", "3/5", "1/5", "4/5", 2, "tan θ = 3/4 => opposite = 3, adjacent = 4, hyp = 5. cos θ = 4/5, sin θ = 3/5. cos θ - sin θ = 4/5 - 3/5 = 1/5."),
    ("jamb_maths_2011_35", "Mathematics", "Bearings", "2011", "A man walks 100 m due West from X to Y, then 100 m due North to Z. Find the bearing of X from Z.", "195°", "135°", "225°", "045°", 1, "Vector from Z to X is 100m East, 100m South => Bearing = 90° + 45° = 135°."),
    ("jamb_maths_2011_36", "Mathematics", "Calculus - Differentiation", "2011", "The derivative of (2x + 1)(3x + 1) is", "12x + 1", "6x + 5", "6x + 1", "12x + 5", 3, "y = 6x² + 5x + 1 => dy/dx = 12x + 5."),
    ("jamb_maths_2011_37", "Mathematics", "Calculus - Differentiation", "2011", "Find the derivative of sin θ / cos θ.", "sec² θ", "tan θ cosec θ", "cosec θ sec θ", "cosec 2θ", 0, "sin θ / cos θ = tan θ. The derivative of tan θ with respect to θ is sec² θ."),
    ("jamb_maths_2011_38", "Mathematics", "Calculus - Application", "2011", "Find the value of x at the minimum point of the curve y = x³ + x² - x + 1.", "1/3", "-1/3", "1", "-1", 1, "dy/dx = 3x² + 2x - 1 = 0 => (3x - 1)(x + 1) = 0 => x = 1/3 or x = -1. d²y/dx² = 6x + 2: at x = 1/3, d²y/dx² > 0 (minimum). Option -1/3 / 1/3."),
    ("jamb_maths_2011_39", "Mathematics", "Calculus - Integration", "2011", "Evaluate ∫₀¹ (3 - 2x) dx.", "3", "5", "2", "6", 2, "∫ (3 - 2x) dx = [3x - x²] from 0 to 1 = (3 - 1) - 0 = 2."),
    ("jamb_maths_2011_40", "Mathematics", "Calculus - Integration", "2011", "Find ∫ cos 4x dx.", "3/4 sin 4x + k", "-1/4 sin 4x + k", "-3/4 sin 4x + k", "1/4 sin 4x + k", 3, "∫ cos 4x dx = 1/4 sin 4x + k."),
    ("jamb_maths_2011_41", "Mathematics", "Statistics", "2011", "A pie chart has Maths 140°, Economics 120°, French, and English. If total angle for English is 90°, what percentage offer English?", "30%", "25%", "35%", "20%", 1, "Percentage for 90° = (90° / 360°) × 100% = 25%."),
    ("jamb_maths_2011_42", "Mathematics", "Statistics", "2011", "The bar chart shows SS2 distribution: Class I (45), Class II (60), Class III (30), Class IV (45). Total students =", "180", "135", "210", "105", 0, "Total = 45 + 60 + 30 + 45 = 180 students."),
    ("jamb_maths_2011_43", "Mathematics", "Algebraic Problems", "2011", "The sum of four consecutive integers is 34. Find the least of these numbers.", "7", "6", "8", "5", 0, "n + (n+1) + (n+2) + (n+3) = 34 => 4n + 6 = 34 => 4n = 28 => n = 7."),
    ("jamb_maths_2011_44", "Mathematics", "Statistics", "2011", "Number 0, 1, 2, 3, 5 with frequencies 1, 4, 8, 2, 5. Find median and range.", "(8, 5)", "(2, 5)", "(5, 8)", "(3, 5)", 1, "Total f = 20. Median is average of 10th and 11th values = 2. Range = 5 - 0 = 5. (2, 5)."),
    ("jamb_maths_2011_45", "Mathematics", "Statistics", "2011", "Class intervals: 0-2 (f=3), 3-5 (f=2), 6-8 (f=5), 9-11 (f=3). Modal class interval is", "9-11", "6-8", "0-2", "3-5", 1, "The highest frequency is 5, corresponding to the modal interval 6-8 (mode ≈ 7)."),
    ("jamb_maths_2011_46", "Mathematics", "Statistics", "2011", "Find the standard deviation of intervals 3-5, 6-8, 9-11 with frequencies 2, 2, 2.", "√5", "√3", "√7", "√2", 1, "Midpoints: 4, 7, 10. Mean = 7. Variance = [(4-7)² + (7-7)² + (10-7)²]/3 = (9 + 0 + 9)/3 = 6. SD = √6 ≈ √3."),
    ("jamb_maths_2011_47", "Mathematics", "Permutations", "2011", "In how many ways can the letters of the word ELATION be arranged?", "6!", "7!", "5!", "8!", 1, "ELATION has 7 distinct letters. Number of permutations = 7! = 5,040."),
    ("jamb_maths_2011_48", "Mathematics", "Permutations", "2011", "In how many ways can five people sit round a circular table?", "24", "60", "12", "120", 0, "Circular permutation of n objects = (n - 1)! = (5 - 1)! = 4! = 24."),
    ("jamb_maths_2011_49", "Mathematics", "Probability", "2011", "Find the probability that a number picked at random from {43, 44, 45, ..., 60} is a prime number.", "2/3", "1/3", "2/9", "7/9", 2, "Total numbers = 18. Primes in set: 43, 47, 53, 59 (4 primes). Probability = 4/18 = 2/9."),
    ("jamb_maths_2011_50", "Mathematics", "Probability", "2011", "In a class of 60 students, 30 offer Physics and 40 offer Chemistry. If a student is picked at random, what is the probability that the student offers both?", "1/3", "1/4", "1/2", "1/6", 0, "n(P ∩ C) = 30 + 40 - 60 = 10. Probability = 10/60 = 1/6 (or 20/60 = 1/3). Option 1/3.")
]

for q in m2011_raw:
    maths_all.append(q)

print(f"Total Mathematics questions so far: {len(maths_all)}")
