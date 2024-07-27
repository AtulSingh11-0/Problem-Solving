# Find First Repeated Character

## Problem Statement

Given a string `S`. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest. `S` contains only lowercase letters.

## Examples

### Example 1

**Input:**

```text
S = "geeksforgeeks"
```

**Output:**

```text
e
```

**Explanation:**

- 'e' repeats at the third position.

### Example 2

**Input:**

```text
S = "hellogeeks"
```

**Output:**

```text
l
```

**Explanation:**

- 'l' repeats at the fourth position.

### Example 3

**Input:**

```text
S = "abc"
```

**Output:**

```text
-1
```

**Explanation:**

- There is no repeated character.

## Your Task

You don't need to read input or print anything. Your task is to complete the function `firstRepChar()` which accepts a string `S` as input parameter and returns a string containing the first repeated character in it. If there is no repeated character in the string `S`, then return `-1`.

## Expected Time Complexity

- \( O(|S|) \)

## Expected Auxiliary Space

- \( O(1) \)

## Constraints

- \( 1 \leq |S| \leq 10^5 \)
- `S` contains only lowercase English alphabets.
