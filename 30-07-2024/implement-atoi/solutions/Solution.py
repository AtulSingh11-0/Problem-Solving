class Solution:
    def atoi(self,s):
        
        isNegative = False
        start = 0
        ans = 0
        
        if(s[0] == '-'):
            isNegative = True
            start = 1
        
        for i in range(start, len(s)):
            if not ('0' <= s[i] <= '9'):
                return -1
                
            digit = ord(s[i]) - ord('0')
            
            ans = 10 * ans + digit
            
        return -ans if isNegative else ans