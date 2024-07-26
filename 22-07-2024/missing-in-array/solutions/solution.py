#User function Template for python3
class Solution:
    
    # Note that the size of the array is n-1
    def missingNumber(self, n, arr):
        
        # code here
        arr.sort()
        
        sum = 0
        for _ in arr:
            sum += _
        
        return (int)( n * (n + 1) / 2) - sum

# Alternate Solution
class Solution:
    def missingNumber(self, n, arr):
        # this is really a tempting solution, and to go for many codes as this is that comes to the mind first, but is not optimised
        # return ([x for x in range(1, n+1) if x not in arr][0])
        
        return int(((n)*(n+1))/2 - sum(arr))
