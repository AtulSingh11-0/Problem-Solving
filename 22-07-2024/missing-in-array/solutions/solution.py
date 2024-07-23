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