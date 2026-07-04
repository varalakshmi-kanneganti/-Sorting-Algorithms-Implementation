# Sorting Algorithms in Java

This repo has my Java implementations of 5 common sorting algorithms.
I built these to get a solid understanding of how each one actually
works step by step, and to practice writing clean, working code for
each approach.

## What's inside

**Bubble Sort** - The simplest one. It repeatedly compares adjacent
elements and swaps them if they're in the wrong order. Keeps looping
through the array until nothing needs swapping anymore. Not efficient
for large inputs, but easy to understand.

**Selection Sort** - Finds the smallest element in the unsorted part
of the array and swaps it to the front. Repeats this for every
position until the whole array is sorted.

**Insertion Sort** - Builds the sorted array one element at a time by
picking each element and inserting it into its correct position among
the already-sorted elements before it. Works kind of like how you'd
sort playing cards in your hand.

**Merge Sort** - Uses recursion and the divide-and-conquer approach.
Splits the array into halves, sorts each half recursively, then merges
the two sorted halves back together. Much faster than the above three
for bigger arrays.

**Quick Sort** - Also recursive and divide-and-conquer based. Picks a
pivot element, rearranges the array so smaller elements are on the
left of the pivot and larger ones on the right, then recursively sorts
both sides.

## Time Complexity

- Bubble Sort, Selection Sort, Insertion Sort: O(n²)
- Merge Sort, Quick Sort: O(n log n)

## How to run

Each file works on its own:
```bash
javac MergeSort.java
java MergeSort
```

## Why I made this

Wanted to actually implement these from scratch instead of just reading
about them, to properly understand the logic behind each approach and
get comfortable with recursion along the way.
