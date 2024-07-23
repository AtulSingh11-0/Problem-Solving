# Longest Common Prefix in Array of Strings

## Problem Statement

Given an array of strings, return the longest common prefix among all strings present in the array. If there's no prefix common in all the strings, return "-1".

## Examples

### Example 1

**Input:**

```text
arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
```

**Output:**

```text
gee
```

**Explanation:**

- "gee" is the longest common prefix in all the given strings.

### Example 2

**Input:**

```text
arr[] = ["hello", "world"]
```

**Output:**

```text
-1
```

**Explanation:**

- There's no common prefix in the given strings.

## Expected Time Complexity

- \( O(n * \min(|arr[i]|)) \)

## Expected Auxiliary Space

- \( O(\min(|arr[i]|)) \)

## Constraints

- \( 1 \leq arr.size() \leq 10^3 \)
- \( 1 \leq arr[i] \leq 10^3 \)
