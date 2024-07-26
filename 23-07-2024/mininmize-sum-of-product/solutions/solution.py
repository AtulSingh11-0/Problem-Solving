class Solution:
    def minValue(self, arr1, arr2):
        arr1.sort()
        arr2.sort(reverse=True)
        
        sum_total = 0
        for i in range(len(arr1)):
            sum_total += (arr1[i] * arr2[i])
        return sum_total

