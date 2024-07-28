public class solution {

  // brute force : soumyadeep
  public String longestCommonPrefix(String arr[]) {
    String ans="";
    int N=arr.length;
    if(N==0)
        return "-1";
    String s = arr[0];
    
    int minl = arr[0].length();
    for(int i = 0; i<N; i++){
        minl = Math.min(minl, arr[i].length());
    }
    
    for(int i = 0; i<N; i++){
        arr[i] = arr[i].substring(0,minl);
    }
    
    for(int i=0;i<minl;i++)
    {
        char c = arr[0].charAt(i);
        for(int j=1;j<N;j++)
        {
            if(arr[j].charAt(i)==c)
                  continue;
            else
            {
                if(ans.length()==0)
                    return "-1";
                else
                    return ans;
            }
        }
        ans=ans+c;
    }
    return ans;   
  }       
}