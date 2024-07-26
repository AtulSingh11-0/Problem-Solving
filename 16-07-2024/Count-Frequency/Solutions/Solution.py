def frequencyCount(self, arr, N, P):
    # code here
    # Sort the array
    arr.sort()
    
    # Initialize a list to store the frequencies
    ans = [0] * N
    
    # Count the frequencies of elements that are less than or equal to N
    for j in range(N):
        if arr[j] <= N:
            ans[arr[j] - 1] += 1
    
    # Copy the frequencies back to the original array
    for i in range(N):
        arr[i] = ans[i]


# Alternate Solution

class Solution:
    def frequencyCount(self, arr, N, P):
        hash_map = {}
        for num in arr:
            if num in hash_map:
                hash_map[num] +=1
            else:
                hash_map[num] = 1
        
        for i in range(1, N+1):
            if i in hash_map:
                arr[i-1] = hash_map[i]
            else:
                arr[i-1] = 0
