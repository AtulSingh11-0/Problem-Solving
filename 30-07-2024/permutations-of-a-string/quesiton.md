# Permutations of a Given String

## Problem Statement

Given a string `S`, the task is to print all unique permutations of the given string that may contain duplicates in lexicographically sorted order.

## Examples

### Example 1

**Input:**

```text
S = "ABC"
```

**Output:**

```text
ABC ACB BAC BCA CAB CBA
```

**Explanation:**

Given string `ABC` has permutations in 6 forms as `ABC`, `ACB`, `BAC`, `BCA`, `CAB`, and `CBA`.

### Example 2

**Input:**

```text
S = "ABSG"
```

**Output:**

```text
ABGS ABSG AGBS AGSB ASBG ASGB 
BAGS BASG BGAS BGSA BSAG BSGA 
GABS GASB GBAS GBSA GSAB GSBA 
SABG SAGB SBAG SBGA SGAB SGBA
```

**Explanation:**

Given string `ABSG` has 24 permutations.

## Your Task

You don't need to read input or print anything. Your task is to complete the function `find_permutation()` which takes the string `S` as input parameter and returns a vector of strings in lexicographical order.

## Expected Time Complexity

- \( O(n! \times n) \)

## Expected Space Complexity

- \( O(n! \times n) \)

## Constraints

- \( 1 \leq \text{length of string} \leq 5 \)
