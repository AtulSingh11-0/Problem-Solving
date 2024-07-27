public class solution {
  String removeDups(String str) {
    // code here

  String ans="";
  char [] arr1=str.toCharArray();
  boolean [] present=new boolean[26];
  for( char i:arr1)
    {
        int ind=i-'a';
        if(present[ind]==false){
            present[ind]=true;
            ans=ans+i;
        }      
    }
  return ans;
}
}
