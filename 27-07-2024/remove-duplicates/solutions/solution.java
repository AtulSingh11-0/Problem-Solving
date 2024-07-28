public class solution {

  // optimized : soumyadeep
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

  // optimized : debosmita
  String removeDups(String str) {
    String S="";
    for(int i=0;i<str.length();i++){
        String s="";
        s+=str.charAt(i);
        
        if(!S.contains(s)){
        S+=str.charAt(i);
        }
    }
    return S;
  }

  // optimized : atul
  String removeDups(String str) {
    // code here
    
    StringBuilder sb = new StringBuilder();
    HashSet<Character> set = new HashSet<>();
    
    for ( int i = 0; i < str.length(); i++ ) {
        char ch = str.charAt(i);
        
        if ( set.add(ch) ) {
            sb.append(ch);
        }
    }
    
    return sb.toString();
    
  }
}
