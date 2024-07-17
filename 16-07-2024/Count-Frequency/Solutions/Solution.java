class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        Arrays.sort(arr);
        int[] ans=new int[N];
        int c=0;
            for(int j=0;j<N;j++)
                if(arr[j]<=N)
                    ans[arr[j]-1]++;
        
        for(int i=0;i<N;i++)
          arr[i]=ans[i];

    }
}