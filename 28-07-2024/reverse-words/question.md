# Reverse Words

Given a String `S`, reverse the string without reversing its individual words. Words are separated by dots.

## Examples

### Example 1

**Input:**  

```text
S = i.like.this.program.very.much
```

**Output:**  

```text
much.very.program.this.like.i
```

**Explanation:**  
After reversing the whole string (not individual words), the input string becomes `much.very.program.this.like.i`.

### Example 2

**Input:**  

```text
S = pqr.mno
```

**Output:**  

```text
mno.pqr
```

**Explanation:**  
After reversing the whole string, the input string becomes `mno.pqr`.

## Your Task

You don't need to read input or print anything. Complete the function `reverseWords()` which takes string `S` as input parameter and returns a string containing the words in reversed order. Each word in the returning string should also be separated by '.'.

**Expected Time Complexity:** O(|S|)  
**Expected Auxiliary Space:** O(|S|)

## Constraints

- 1 ≤ |S| ≤ 10^5
