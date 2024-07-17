void frequencyCount(vector<int>& arr,int N, int P) { 
    // code here
    // Sort the array
    sort(arr.begin(), arr.end());
    
    // Initialize a vector to store the frequencies
    vector<int> ans(N, 0);
    
    // Count the frequencies of elements that are less than or equal to N
    for(int j = 0; j < N; j++) {
        if(arr[j] <= N) {
            ans[arr[j] - 1]++;
        }
    }
    
    // Copy the frequencies back to the original array
    for(int i = 0; i < N; i++) {
        arr[i] = ans[i];
    }
}