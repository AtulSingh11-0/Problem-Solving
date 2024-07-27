class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        // Your code here
        if ( a.length() != b.length() ) 
            return false;
        
        int[] count = new int[26];
        
        char[] array = a.toCharArray();
        
        for ( char ch : array ) {
            count [ ch - 'a' ]++;
        }
        
        array = b.toCharArray();
        
        for ( char ch : array ) {
            count [ ch - 'a' ]--;
        }
        
        for ( int i = 0; i < 26; i++) {
            if ( count[i] != 0 )
                return false;
        }
        return true;
    }
}