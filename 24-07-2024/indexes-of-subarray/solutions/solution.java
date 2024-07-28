class Solution {

    // optimized : atul
  public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
      // code here
      
      ArrayList<Integer> list = new ArrayList<>();
      
      int i, j, sum;
      i = j = sum =0;
      
      for ( i = 0; i < n; i++ ) {
          sum += arr[i];
          
          while ( sum > s && j <= i ) {
              sum -= arr[j++];
          }
          
          if ( sum == s && j <= i) {
              list.add(++j);
              list.add(++i);
              return list;
          }
      }
      
      list.add(-1);
      
      return list;
  }

    // optimized : soumyadeep
  static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
     int start=0;
     int end=0;
     int ans=arr[0];
     ArrayList<Integer>sd= new ArrayList<>();
     if(ans==s){
     sd.add(start+1);
     sd.add(end+1);
         return sd;
     }
    
     while(end<n-1){
         if(ans+arr[end+1]<=s){
             ans=ans+arr[end+1];
             end++;
         }
         else{
             ans=ans-arr[start];
             start++;
         }
          if(ans==s&&start<=end){
     sd.add(start+1);
     sd.add(end+1);
         return sd;
     }
         
     }
        sd.add(-1);
       return sd;
    }
} 