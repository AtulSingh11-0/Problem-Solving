# Missing Element in Array

## Problem Statement

Given an array of size \( n-1 \) such that it only contains distinct integers in the range of 1 to \( n \). Return the missing element.

## Examples

### Example 1

**Input:**

```text
n = 5, arr[] = [1, 2, 3, 5]
```

**Output:**

```text
4
```

**Explanation:**

- All the numbers from 1 to 5 are present except 4.

### Example 2

**Input:**

```text
n = 2, arr[] = [1]
```

**Output:**

```text
2
```

**Explanation:**

- All the numbers from 1 to 2 are present except 2.

## Expected Time Complexity

- \( O(n) \)

## Expected Auxiliary Space

- \( O(1) \)

## Constraints

- \( 1 \leq n \leq 10^6 \)
- \( 1 \leq arr[i] \leq 10^6 \)
