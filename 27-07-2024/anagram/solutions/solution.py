class Solution:
    def isAnagram(self,a,b):
        if len(a) != len(b):
            return False
    
        freq = {}
        for char in a:
            freq[char] = freq.get(char, 0) + 1
        for char in b:
            freq[char] = freq.get(char, 0) - 1
            if freq[char] < 0:
                return False
        return True
