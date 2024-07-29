class Solution:

    def longestSubstrDistinctChars(self, S):
        n = len(S)
        char_index = {}
        left = 0
        ans = 0
        
        for right in range(n):
            char = S[right]
            if char in char_index:
                left = max(left, char_index[char]+1)
            char_index[char] = right
            ans = max(ans, right-left+1)
        return ans