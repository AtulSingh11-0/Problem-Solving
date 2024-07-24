# Minimize the Sum of Product

## Problem Statement

You are given two arrays `arr1` and `arr2`. The task is to find the minimum value of `arr1[0] * arr2[0] + arr1[1] * arr2[1] + ... + arr1[N-1] * arr2[N-1]`, where the shuffling of elements of arrays `arr1` and `arr2` is allowed.

## Examples

### Example 1

**Input:**

```text
arr1 = [3, 1, 1] 
arr2 = [6, 5, 4]
```

**Output:**

```text
23
```

**Explanation:**

- ($1\times6$) + ($1\times5$) + ($3\times4$) = 6 + 5 + 12 = 23 is the minimum sum.

### Example 2

**Input:**

```text
arr1 = [6, 1, 9, 5, 4] 
arr2 = [3, 4, 8, 2, 4]
```

**Output:**

```text
80
```

**Explanation:**

- ($2\times9$) + ($3\times6$) + ($4\times5$) + ($4\times4$) + ($8\times1$) = 18 + 18 + 20 + 16 + 8 = 80 is the minimum sum.

## Expected Time Complexity

- \( O(n \log n) \)

## Expected Auxiliary Space

- \( O(1) \)

## Constraints

- \( 1 \leq arr1.size() == arr2.size() \leq 10^5 \)
- \( 1 \leq arr1[i], arr2[i] \leq 10^6 \)
