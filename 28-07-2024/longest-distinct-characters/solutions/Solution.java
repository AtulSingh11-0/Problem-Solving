class Solution {

  // optimized : atul
  static int longestSubstrDistinctChars(String S){
    // code here
    Set<Character> set = new HashSet<>();
    
    int left, max;
    max = left = 0;
    for ( int i = 0; i < S.length(); i++ ) {
        char ch = S.charAt(i); 
        
        while ( set.contains(ch) ) {
            set.remove( S.charAt(left++) );
        }
        
        set.add(ch);
        max = Math.max(max, i - left + 1);
      }
    
      return max;
  }
}