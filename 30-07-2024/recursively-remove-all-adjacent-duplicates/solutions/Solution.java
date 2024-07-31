class Solution{

  // optimized: soumyadeep
  String rremove(String s) {
      // code here
      String ans="";
      char []arr=s.toCharArray();
      int n=s.length();
      if(n==1)
          return s;
      for(int i=0;i<n;i++)
      {
          if(i==0)
          {
              if(arr[i]!=arr[i+1])
                  ans=ans+arr[i];
          }
          else if(i>0 && i<n-1)
          {
              if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
                  ans=ans+arr[i];
          }
          else if(i==n-1)
          {
              if(arr[i]!=arr[i-1])
                  ans=ans+arr[i];
          }
      }
      if(s.equals(ans))
          return s;
      return rremove(ans);
  }
}