# Star Pattern Practice

A structured drill set for building star pattern algorithms in Java. Every exercise ships as a
blank file with the expected output documented in a comment, so you write the logic yourself and
check against the target rather than copying code.

## How this repo is organized

Patterns are grouped into five tiers that build on each other. Tiers are ordered by the concepts
they introduce, not by visual similarity. Within a tier, files are numbered `_01_`, `_02_`, and so
on, which makes alphabetical order equal to the order you should attempt them.

The underscore prefix on class names is required by the Java language: an identifier cannot begin
with a digit, so `_01_Square` is legal where `01-Square` is not. The class name always matches its
filename, which is what `javac` expects.

```
practice/
├── Tier_1_Basics/       fixed size, no alignment
├── Tier_2_Aligned/      introduces leading gaps
├── Tier_3_Pyramids/     centered and mirrored shapes
├── Tier_4_Hollow/       conditionals inside the inner loop
├── Tier_5_Advanced/     two conditions per cell, recurrences
└── Test.java            scratch file, gitignored
```

## Running a pattern

Each file has its own `main` method and no dependencies. Compile and run one at a time from the
repo root:

```bash
javac Tier_1_Basics/_01_Square.java
java -cp Tier_1_Basics _01_Square
```

## Tier 1 — Basics

Fixed dimensions with no leading spaces. Learn to relate an inner loop's bound to the outer index.

| # | Pattern | Concept |
|---|---------|---------|
| 01 | [Square](Tier_1_Basics/_01_Square.java) | Two loops with constant bounds |
| 02 | [RightTriangle](Tier_1_Basics/_02_RightTriangle.java) | Inner bound grows with the row |
| 03 | [InvertedTriangle](Tier_1_Basics/_03_InvertedTriangle.java) | Inner bound shrinks with the row |

## Tier 2 — Aligned

Leading gaps place the shape against an edge. Gap count and star count now move in opposite
directions.

| # | Pattern | Concept |
|---|---------|---------|
| 01 | [RightAlignedTriangle](Tier_2_Aligned/_01_RightAlignedTriangle.java) | Descending gap loop, ascending stars |
| 02 | [RightAlignedInvertedTriangle](Tier_2_Aligned/_02_RightAlignedInvertedTriangle.java) | Ascending gap loop, descending stars |
| 03 | [StarGrid](Tier_2_Aligned/_03_StarGrid.java) | Constant gap between every cell |
| 04 | [PlusPattern](Tier_2_Aligned/_04_PlusPattern.java) | Two passes over the same bounds |
| 05 | [ZigZagPattern](Tier_2_Aligned/_05_ZigZagPattern.java) | Gap derived from row parity |

## Tier 3 — Pyramids

Centered shapes built by stepping the star count by two while the gap mirrors it.

| # | Pattern | Concept |
|---|---------|---------|
| 01 | [PyramidPattern](Tier_3_Pyramids/_01_PyramidPattern.java) | Step the outer loop by two |
| 02 | [InvertedPyramidPattern](Tier_3_Pyramids/_02_InvertedPyramidPattern.java) | Both loops descending |
| 03 | [CenterPyramid](Tier_3_Pyramids/_03_CenterPyramid.java) | Gap and stars move together |
| 04 | [InvertedCenterPyramid](Tier_3_Pyramids/_04_InvertedCenterPyramid.java) | Reverses tier 3 #03 |
| 05 | [NumberPyramid](Tier_3_Pyramids/_05_NumberPyramid.java) | Non-star output with nested loops |

## Tier 4 — Hollow

Stars appear only on the border, so the inner loop needs an `if`. The shape shrinks as a side
effect of placing fewer stars, which is the step that trips most people up.

| # | Pattern | Concept |
|---|---------|---------|
| 01 | [HollowSquarePattern](Tier_4_Hollow/_01_HollowSquarePattern.java) | Border test on row and column |
| 02 | [HollowRightTriangle](Tier_4_Hollow/_02_HollowRightTriangle.java) | Three-way border condition |
| 03 | [HollowPyramid](Tier_4_Hollow/_03_HollowPyramid.java) | Per-row star count |
| 04 | [HollowInvertedPyramid](Tier_4_Hollow/_04_HollowInvertedPyramid.java) | Mirror of tier 4 #03 |

## Tier 5 — Advanced

Combines earlier tiers, uses two conditions per cell, or computes values rather than printing them.

| # | Pattern | Concept |
|---|---------|---------|
| 01 | [Diamond](Tier_5_Advanced/_01_Diamond.java) | Two pyramid halves joined |
| 02 | [XPattern](Tier_5_Advanced/_02_XPattern.java) | Both diagonals in one loop |
| 03 | [HollowDiamond](Tier_5_Advanced/_03_HollowDiamond.java) | Tier 4 logic on tier 5 geometry |
| 04 | [ButterflyPattern](Tier_5_Advanced/_04_ButterflyPattern.java) | Mirrored halves meeting at center |
| 05 | [PascalsTriangle](Tier_5_Advanced/_05_PascalsTriangle.java) | Values computed from previous row |

## Suggested order

Work top to bottom and do not skip ahead. Each tier assumes the one before it.

1. Tier 1 in full — get the loop bounds instinctually.
2. Tier 2 in full — gap arithmetic becomes second nature.
3. Tier 3 in full — center alignment and stepping by two.
4. Tier 4 in full — conditional placement inside loops.
5. Tier 5 in full — combination and recursion of earlier ideas.

## Working on a file

Open the exercise, read the block comment at the top for the row and column counts plus the
target output, then fill in `main`. Compare your output against the comment when done. If a
pattern fights you, write the simplest version that compiles and produces *something* before
refining — tier 4 in particular rewards getting the loop structure right before worrying about
star placement.
