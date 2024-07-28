class Solution {
    
    // Note that the size of the array is n-1
    // optimized : atul
    int missingNumber(int n, int arr[]) {
        int sum = Arrays.stream(arr).sum();
        return Math.abs(sum - ( (n * (n + 1)) / 2) );
    }

    // optimized : soumyadeep
    int missingNumber (int n, int arr[]) {
        Arrays.sort(arr);
        int ans=0,c=0;
        for(int i=0;i<n-1;i++) {

            if(arr[i]!=(i+1))
            {
                ans=i+1;
                c=1;
                break;
            }
            if(c==0)
            ans=n;
        }
        return ans;
    }
}