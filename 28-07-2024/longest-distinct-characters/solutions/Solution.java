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

  // optimized : soumyadeep
  static int longestSubstrDistinctChars(String S){
    // code here
    HashMap<Character,Integer>map = new HashMap<>();
    char []arr=S.toCharArray();
    int c=0,max=0;
    for(int i=0;i<arr.length;i++)
    {
         if(map.containsKey(arr[i]))
        {
              
            c=0;
            i=map.get(arr[i]);
            map.clear();
            
        }
        else
        {
            map.put(arr[i],i);
            c++;
            max=Math.max(max,c);
        }
    }
    
    
    return max;
}
}