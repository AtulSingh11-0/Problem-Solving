# Indexes of Subarray Sum

## Problem Statement

Given an unsorted array `arr` of size `n` that contains only non-negative integers, find a sub-array (continuous elements) that has a sum equal to `s`. You mainly need to return the left and right indexes (1-based indexing) of that sub-array.

In case of multiple sub-arrays, return the sub-array indexes which come first when moving from left to right. If no such sub-array exists, return an array consisting of the element `-1`.

## Examples

### Example 1

**Input:**

```text
arr[] = [1, 2, 3, 7, 5], n = 5, s = 12
```

**Output:**

```text
2 4
```

**Explanation:**

- The sum of elements from the 2nd to the 4th position is 12.

### Example 2

**Input:**

```text
arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], n = 10, s = 15
```

**Output:**

```text
1 5
```

**Explanation:**

- The sum of elements from the 1st to the 5th position is 15.

### Example 3

**Input:**

```text
arr[] = [7, 2, 1], n = 3, s = 2
```

**Output:**

```text
2 2
```

**Explanation:**

- The sum of elements from the 2nd to the 2nd position is 2.

### Example 4

**Input:**

```text
arr[] = [5, 3, 4], n = 3, s = 2
```

**Output:**

```text
-1
```

**Explanation:**

- There is no sub-array with sum 2.

## Expected Time Complexity

- \( O(n) \)

## Expected Auxiliary Space

- \( O(1) \)

## Constraints

- \( 0 \leq arr[i] \leq 10^9 \)
- \( 1 \leq n \leq 10^5 \)
- \( 0 \leq s \leq 10^9 \)
