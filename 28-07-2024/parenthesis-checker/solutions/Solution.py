class Solution:
    def ispar(self, x):
        stack = []
        n = len(x)
    
        for i in range(n):
            if x[i] in ['(', '{', '[']:
                stack.append(x[i])
            elif x[i] in [')', '}', ']']:
                if not stack or stack.pop() != self.matching_bracket(x[i]):
                    return False
    
        return len(stack) == 0
    
    def matching_bracket(self, char):
        if char == ')':
            return '('
        elif char == '}':
            return '{'
        else:
            return '['