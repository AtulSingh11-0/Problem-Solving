class Solution {
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
}