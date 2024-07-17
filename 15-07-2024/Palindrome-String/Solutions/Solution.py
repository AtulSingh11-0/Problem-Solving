class Solution:
    def isPalindrome(self, s: str) -> bool:
        sb = []
        for char in s:
            if char.isalnum():
                if char.isupper():
                    sb.append(char.lower())
                else:
                    sb.append(char)
        
        i, j = 0, len(sb) - 1
        while i < j:
            if sb[i] == sb[j]:
                i += 1
                j -= 1
            else:
                return False
        return True
