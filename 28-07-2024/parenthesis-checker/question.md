# Parenthesis Checker

Given an expression string `x`. Examine whether the pairs and the orders of `{}`, `()`, `[]` are correct in the expression.

For example, the function should return `true` for `exp = [()]{}{[()()]()}` and `false` for `exp = [(]`.

**Note:** The driver code prints "balanced" if the function returns `true`, otherwise it prints "not balanced".

## Examples

### Example 1

**Input:**  

```text
{([])}
```

**Output:**  

```text
true
```

**Explanation:**  
`{ ( [ ] ) }`. Same colored brackets can form balanced pairs, with 0 number of unbalanced bracket.

### Example 2

**Input:**  

```text
()
```

**Output:**  

```text
true
```

**Explanation:**  
`()`. Same bracket can form balanced pairs, and here only one type of bracket is present and in a balanced way.

### Example 3

**Input:**  

```text
([)]
```

**Output:**  

```text
false
```

**Explanation:**  
`([)]`. Here, the square bracket is balanced but the small bracket is not balanced and hence, the output will be unbalanced.

## Your Task

This is a function problem. You only need to complete the function `ispar()` that takes a string as a parameter and returns a boolean value `true` if brackets are balanced else returns `false`. The printing is done automatically by the driver code.

**Expected Time Complexity:** O(|x|)  
**Expected Auxiliary Space:** O(|x|)

## Constraints

- 1 ≤ |x| ≤ 32000
