# Longest Palindrome in a String

Given a string `str`, find the longest palindromic substring in `str`. A substring of string `str` is `str[i ... j]` where `0 ≤ i ≤ j < len(str)`. Return the longest palindromic substring of `str`.

**Palindrome string** A string that reads the same backward. More formally, `str` is a palindrome if `reverse(str) = str`. In case of conflict, return the substring which occurs first (with the least starting index).

## Examples

### Example 1

**Input**  

```text
str = "aaaabbaa"  
```

**Output**  

```text
aabbaa  
```

**Explanation** The longest Palindromic substring is "aabbaa".

### Example 2

**Input**  

```text
str = "abc"  
```

**Output**  

```text
a  
```

**Explanation** "a", "b", and "c" are the longest palindromes with the same length. The result is the one with the least starting index.

## Expected Time Complexity

O(|str|^2)

## Expected Auxiliary Space

O(1)

## Constraints

1 ≤ |str| ≤ 10^3
