public class solution {

  // optimized : soumyadeep
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

    // optimized : atul
    String firstRepChar(String s) 
    { 
        // code here
        Set<Character> set = new HashSet<>();
        
        for ( int i = 0; i < s.length(); i++ ) {
            char ch = s.charAt(i);
            if (!set.add(ch)) {
                return String.valueOf(ch);
            }
        }
        
        return "-1";
    }

    // optimized : debosmita
    String firstRepChar(String s) 
    { 
          ArrayList<Character> list=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            
            if(list.isEmpty()||! list.contains(s.charAt(i))){
                list.add(s.charAt(i));
            }
            else{
               return Character.toString(s.charAt(i));
            }
        }
        return "-1";
    }
}
