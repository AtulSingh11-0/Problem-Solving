class Solution:
    def firstRepChar(self, s):
        visited = []
        s = list(s)
        
        for i in range(len(s)):
            if s[i] in visited:
                return s[i]
            else:
                visited.append(s[i])
        return -1
