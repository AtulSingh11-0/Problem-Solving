class Solution{

  // optimized: atul
  public static String longestPalin(String S){
    // code here
    
    if ( S == null || S.length() < 1 ) return "";
    
    int start, maxLength;
    start = maxLength = 0;
    
    for ( int i = 0; i < S.length(); i++ ) {
        int len1 = expandAroundCenter ( S, i, i );
        int len2 = expandAroundCenter ( S, i, i+1 );
        int len = Math.max(len1, len2);
        
        if ( len > maxLength ) {
            maxLength = len;
            start = i - (len - 1) / 2;
        }
    }
    
    return S.substring(start, start + maxLength);

  }

  public static int expandAroundCenter ( String S, int left, int right ) {
      while ( left >= 0 && right < S.length() && S.charAt(left) == S.charAt(right) ) {
          left--;
          right++;
      }
      
      return right - left - 1;
  }

}