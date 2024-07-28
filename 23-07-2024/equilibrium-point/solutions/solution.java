class Solution {
  // arr: input array
  // Function to find equilibrium point in the array.

// optimized : atul
  public static int equilibriumPoint(long arr[]) {
      // Your code here
      int n = arr.length;
      if ( n == 1)
          return 1;
      
      long arrSum = sum (arr);
      long lSum = 0;
      
      for ( int i = 0; i < n; i++ ) {
          
          arrSum -= arr[i];
          
          if ( arrSum == lSum )
              return i+1;
          
          lSum += arr[i];
      }
      
      return -1;
  }
  
  public static long sum (long[] arr) {
      long sum = 0;
      for (long i : arr)
          sum += i;
          
      return sum;
  }


    // optimized : soumyadeep
    public static int equilibriumPoint(long arr[]) {
        // Your code here
        if(arr.length==1)
        return 1;
        long fsum=0,lsum=0;
        for(int i=0;i<arr.length;i++)
        {
            lsum=lsum+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            lsum=lsum-arr[i];
            if(lsum==fsum)
                return i+1;
            fsum=fsum+arr[i];
            
        }
        return -1;
        
    }
}