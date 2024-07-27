# Anagram

## Problem Statement

Given two strings `a` and `b` consisting of lowercase characters, the task is to check whether the two given strings are anagrams of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, `act` and `tac` are anagrams of each other. Strings `a` and `b` can only contain lowercase alphabets.

**Note:**

- If the strings are anagrams, you have to return `True`, otherwise return `False`.
- `|s|` represents the length of string `s`.

## Examples

### Example 1

**Input:**

```text
a = "geeksforgeeks", b = "forgeeksgeeks"
```

**Output:**

```text
YES
```

**Explanation:**

- Both strings have the same characters with the same frequency. So, both are anagrams.

### Example 2

**Input:**

```text
a = "allergy", b = "allergic"
```

**Output:**

```text
NO
```

**Explanation:**

- Characters in both strings are not the same, so they are not anagrams.

## Your Task

You don't need to read input or print anything. Your task is to complete the function `isAnagram()` which takes the string `a` and string `b` as input parameters and checks if the two strings are anagrams of each other. The function returns `true` if the strings are anagrams, else it returns `false`.

## Expected Time Complexity

- \( O(|a| + |b|) \)

## Expected Auxiliary Space

- \( O(\text{Number of distinct characters}) \)

## Constraints

- \( 1 \leq |a|, |b| \leq 10^5 \)
