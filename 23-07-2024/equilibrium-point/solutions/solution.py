class Solution:
    def equilibriumPoint(self,arr):
        left_sum = 0
        total_sum = sum(arr)
        
        for i in range(len(arr)):
            if (total_sum - left_sum - arr[i]) == left_sum:
                return i + 1
            else:
                left_sum += arr[i]
                
        return -1

