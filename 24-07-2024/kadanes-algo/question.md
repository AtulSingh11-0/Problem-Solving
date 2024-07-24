# Kadane's Algorithm

## Problem Statement

Given an integer array `arr[]`, find the contiguous sub-array (containing at least one number) that has the maximum sum and return its sum.

## Examples

### Example 1

**Input:**

```text
arr[] = [1, 2, 3, -2, 5]
```

**Output:**

```text
9
```

**Explanation:**

- The maximum subarray sum is 9 for the elements (1, 2, 3, -2, 5), which form a contiguous subarray.

### Example 2

**Input:**

```text
arr[] = [-1, -2, -3, -4]
```

**Output:**

```text
-1
```

**Explanation:**

- The maximum subarray sum is -1 for the element (-1).

### Example 3

**Input:**

```text
arr[] = [5, 4, 7]
```

**Output:**

```text
16
```

**Explanation:**

- The maximum subarray sum is 16 for the elements (5, 4, 7), which form a contiguous subarray.

## Expected Time Complexity

- \( O(n) \)

## Expected Auxiliary Space

- \( O(1) \)

## Constraints

- \( -10^7 \leq arr[i] \leq 10^7 \)
- \( 1 \leq arr.length \leq 10^6 \)
