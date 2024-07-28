class Solution {

  // optimized : atul
  public long minValue(List<Integer> arr1, List<Integer> arr2) {
      // code here
      Collections.sort(arr1);
      Collections.sort(arr2);
      
      int n = arr1.size();
      int l = 0, h = n-1;
      long sum = 0;
      while ( l != n && h != -1 ) {
          sum += arr1.get(l++) * arr2.get(h--);            
      }
      
      return sum;
  }

  // optimized : soumyadeep
  public long minValue(List<Integer> arr1, List<Integer> arr2) {
    // code here
    Collections.sort(arr1);
    Collections.sort(arr2);
    long sum=0;
    for(int i=0;i<arr1.size();i++)
    {
        sum=sum+(arr1.get(i)*arr2.get((arr1.size()-1)-i));
    }
    return sum;
  }
}
