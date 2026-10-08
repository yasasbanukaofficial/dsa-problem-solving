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
├── star patterns/
│   ├── Tier_1_Basics/       fixed size, no alignment
│   ├── Tier_2_Aligned/      introduces leading gaps
│   ├── Tier_3_Pyramids/     centered and mirrored shapes
│   ├── Tier_4_Hollow/       conditionals inside the inner loop
│   └── Tier_5_Advanced/     two conditions per cell, recurrences
├── dsa/
│   ├── learning/           notes and concept write-ups
│   └── problems/           solved DSA exercises
├── score.md                tier 4 grading report
└── Test.java               scratch file, gitignored
```

## Progress

| Tier | Files | Solved | Open |
|------|------:|-------:|-----:|
| 1 — Basics | 4 | 4 | 0 |
| 2 — Aligned | 6 | 5 | 1 |
| 3 — Pyramids | 12 | 12 | 0 |
| 4 — Hollow | 5 | 5 | 0 |
| 5 — Advanced | 9 | 2 | 7 |
| **Total** | **36** | **28** | **8** |

Done so far:

- Tiers 1, 3 and 4 fully implemented; tier 2 solved except `_05_ZigZagPattern`.
- Tier 5 solved so far: `_01_Diamond`, `_04_ButterflyPattern`.
- Every file in the repo compiles clean under `javac -Xlint:all` — zero errors, zero warnings.
- Tier 4 was graded in [score.md](score.md) at **90 / 100**; the two reported logic defects in
  `_02_HollowRightTriangle` (row-parity hack, wrong row count) are fixed, and `_05`'s missing
  table row from that report is now added. `_05`'s `N = 1` cell is still open.
- Repo restructured: all tiers moved under `star patterns/`, and `dsa/` added with `learning/`
  and `problems/` placeholders.

## Running a pattern

Each file has its own `main` method and no dependencies. Compile and run one at a time from the
repo root:

```bash
javac "star patterns/Tier_1_Basics/_01_Square.java"
java -cp "star patterns/Tier_1_Basics" _01_Square
```

## Tier 1 — Basics

Fixed dimensions with no leading spaces. Learn to relate an inner loop's bound to the outer index.

| # | Pattern | Concept | Status |
|---|---------|---------|--------|
| 01 | [Square](star%20patterns/Tier_1_Basics/_01_Square.java) | Two loops with constant bounds | solved |
| 02 | [RightTriangle](star%20patterns/Tier_1_Basics/_02_RightTriangle.java) | Inner bound grows with the row | solved |
| 03 | [InvertedTriangle](star%20patterns/Tier_1_Basics/_03_InvertedTriangle.java) | Inner bound shrinks with the row | solved |
| 04 | [SquareFillPattern](star%20patterns/Tier_1_Basics/_04_SquareFillPattern.java) | Separator emitted only between cells | solved |

## Tier 2 — Aligned

Leading gaps place the shape against an edge. Gap count and star count now move in opposite
directions.

| # | Pattern | Concept | Status |
|---|---------|---------|--------|
| 01 | [RightAlignedTriangle](star%20patterns/Tier_2_Aligned/_01_RightAlignedTriangle.java) | Descending gap loop, ascending stars | solved |
| 02 | [RightAlignedInvertedTriangle](star%20patterns/Tier_2_Aligned/_02_RightAlignedInvertedTriangle.java) | Ascending gap loop, descending stars | solved |
| 03 | [StarGrid](star%20patterns/Tier_2_Aligned/_03_StarGrid.java) | Constant gap between every cell | solved |
| 04 | [PlusPattern](star%20patterns/Tier_2_Aligned/_04_PlusPattern.java) | Two passes over the same bounds | solved |
| 05 | [ZigZagPattern](star%20patterns/Tier_2_Aligned/_05_ZigZagPattern.java) | Gap derived from row parity | open |
| 06 | [RhombusPattern](star%20patterns/Tier_2_Aligned/_06_RhombusPattern.java) | Right-aligned block under a shrinking margin | solved |

## Tier 3 — Pyramids

Centered shapes built by stepping the star count by two while the gap mirrors it. The number
patterns swap the star for a digit and add a counter.

| # | Pattern | Concept | Status |
|---|---------|---------|--------|
| 01 | [PyramidPattern](star%20patterns/Tier_3_Pyramids/_01_PyramidPattern.java) | Step the outer loop by two | solved |
| 02 | [InvertedPyramidPattern](star%20patterns/Tier_3_Pyramids/_02_InvertedPyramidPattern.java) | Both loops descending | solved |
| 03 | [CenterPyramid](star%20patterns/Tier_3_Pyramids/_03_CenterPyramid.java) | Gap and stars move together | solved |
| 04 | [InvertedCenterPyramid](star%20patterns/Tier_3_Pyramids/_04_InvertedCenterPyramid.java) | Reverses tier 3 #03 | solved |
| 05 | [NumberPyramid](star%20patterns/Tier_3_Pyramids/_05_NumberPyramid.java) | Non-star output with nested loops | solved |
| 06 | [NumberTriangular](star%20patterns/Tier_3_Pyramids/_06_NumberTriangular.java) | Row index repeated, centered | solved |
| 07 | [NumberIncreasingPyramid](star%20patterns/Tier_3_Pyramids/_07_NumberIncreasingPyramid.java) | Count up within each row, flush left | solved |
| 08 | [NumberIncreasingReversePyramid](star%20patterns/Tier_3_Pyramids/_08_NumberIncreasingReversePyramid.java) | Count up, rows truncated from the top | solved |
| 09 | [NumberChangingPyramid](star%20patterns/Tier_3_Pyramids/_09_NumberChangingPyramid.java) | One running counter across the triangle | solved |
| 10 | [ZeroOneTriangle](star%20patterns/Tier_3_Pyramids/_10_ZeroOneTriangle.java) | Row/column parity picks the digit | solved |
| 11 | [PalindromeTriangular](star%20patterns/Tier_3_Pyramids/_11_PalindromeTriangular.java) | Count up to the row, then back down | solved |
| 12 | [ReverseNumberTrianglePattern](star%20patterns/Tier_3_Pyramids/_12_ReverseNumberTrianglePattern.java) | Row index to N, right-shifted each row | solved |

## Tier 4 — Hollow

Stars appear only on the border, so the inner loop needs an `if`. The shape shrinks as a side
effect of placing fewer stars, which is the step that trips most people up.

| # | Pattern | Concept | Status |
|---|---------|---------|--------|
| 01 | [HollowSquarePattern](star%20patterns/Tier_4_Hollow/_01_HollowSquarePattern.java) | Border test on row and column | solved |
| 02 | [HollowRightTriangle](star%20patterns/Tier_4_Hollow/_02_HollowRightTriangle.java) | Three-way border condition | solved |
| 03 | [HollowPyramid](star%20patterns/Tier_4_Hollow/_03_HollowPyramid.java) | Per-row star count | solved |
| 04 | [HollowInvertedPyramid](star%20patterns/Tier_4_Hollow/_04_HollowInvertedPyramid.java) | Mirror of tier 4 #03 | solved |
| 05 | [SquareHollowPattern](star%20patterns/Tier_4_Hollow/_05_SquareHollowPattern.java) | Border cells spaced apart, distinct from #01 | solved |

Graded in [score.md](score.md): 100, 100, 100, 95 for 01, 03, 04, 05 and 55 for 02 at the time of
review. `_02`'s two logic defects are fixed since; `_05` still prints `* *` instead of `*` at
`N = 1`.

## Tier 5 — Advanced

Combines earlier tiers, uses two conditions per cell, or computes values rather than printing them.

| # | Pattern | Concept | Status |
|---|---------|---------|--------|
| 01 | [Diamond](star%20patterns/Tier_5_Advanced/_01_Diamond.java) | Two pyramid halves joined | solved |
| 02 | [XPattern](star%20patterns/Tier_5_Advanced/_02_XPattern.java) | Both diagonals in one loop | open |
| 03 | [HollowDiamond](star%20patterns/Tier_5_Advanced/_03_HollowDiamond.java) | Tier 4 logic on tier 5 geometry | open |
| 04 | [ButterflyPattern](star%20patterns/Tier_5_Advanced/_04_ButterflyPattern.java) | Mirrored halves meeting at center | solved |
| 05 | [PascalsTriangle](star%20patterns/Tier_5_Advanced/_05_PascalsTriangle.java) | Values computed from previous row | open |
| 06 | [HollowHourglassPattern](star%20patterns/Tier_5_Advanced/_06_HollowHourglassPattern.java) | Inverted hollow pyramid meeting its mirror | open |
| 07 | [RightPascalsTriangle](star%20patterns/Tier_5_Advanced/_07_RightPascalsTriangle.java) | Fixed left edge, width steps up then down | open |
| 08 | [MirrorImageTrianglePattern](star%20patterns/Tier_5_Advanced/_08_MirrorImageTrianglePattern.java) | Tier 3 #12 reflected across the middle row | open |
| 09 | [KPattern](star%20patterns/Tier_5_Advanced/_09_KPattern.java) | Two mirrored halves sharing one edge | open |

## Suggested order

Work top to bottom and do not skip ahead. Each tier assumes the one before it.

1. Tier 1 in full — get the loop bounds instinctually.
2. Tier 2 in full — gap arithmetic becomes second nature.
3. Tier 3 in full — center alignment and stepping by two.
4. Tier 4 in full — conditional placement inside loops.
5. Tier 5 in full — combination and recursion of earlier ideas.

## DSA track

`dsa/` runs alongside the pattern drills and is still empty.

| Path | Purpose |
|------|---------|
| `dsa/learning/` | Notes and concept write-ups as topics are studied |
| `dsa/problems/` | Solutions to DSA exercises, one file per problem |

Both directories carry a `.gitkeep` so git tracks them until real content lands.

## Working on a file

Open the exercise, read the block comment at the top for the row and column counts plus the
target output, then fill in `main`. Compare your output against the comment when done. If a
pattern fights you, write the simplest version that compiles and produces *something* before
refining — tier 4 in particular rewards getting the loop structure right before worrying about
star placement.

An exercise counts as `solved` once `main` holds real logic and the output matches the comment;
`open` files still contain the `// Write your code` placeholder or an empty `main`.
