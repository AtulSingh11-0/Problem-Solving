class Solution {

  // arr: input array
  // Function to find the sum of contiguous subarray with maximum sum.
  // optimized : atul
  long maxSubarraySum(int[] arr) {

      // Your code here
      
      int ans = Integer.MIN_VALUE;
      int sum = 0;
      
      for ( int i = 0; i < arr.length; i++ ) {
          
          sum += arr[i];
          
          ans = Math.max( sum, ans );
          
          sum = Math.max( sum, 0);
      }
      return ans;
  }


  // optimized : debosmita
  long maxSubarraySum(int[] arr) {
      long sum = 0;
      long max = arr[0];
      for(int i=0;i<arr.length;i++){
          sum=sum+arr[i];
          max=Math.max(sum,max);
          if(sum<0)
          sum=0;
      }
      return max;
  }

  // optimized : soumyadeeps
  long maxSubarraySum(int[] arr) {

    // Your code here
    int lmax=arr[0], gmax=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        lmax=Math.max(arr[i],lmax+arr[i]); //calculate the maximum upto a particular element 
        gmax=Math.max(gmax,lmax);// calculate the max value of all lmax for all index
    }
    return gmax;
  }
}