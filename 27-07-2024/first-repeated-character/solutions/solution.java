public class solution {
  String firstRepChar(String s) 
    { 
        // code here
        String ans="";
        char [] arr1=s.toCharArray();
        boolean [] present=new boolean[26];
        for( char i:arr1)
          {
              int ind=i-'a';
              if(present[ind]==true){
                  return ans+i;
              }
              present[ind]=true;
              
          }
        return "-1";
    }
}
