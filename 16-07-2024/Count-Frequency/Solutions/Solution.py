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