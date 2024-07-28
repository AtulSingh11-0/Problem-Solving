class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    // optimized : atul
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

    // optimized : soumyadeep
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        char [] arr1=a.toCharArray();
        char [] arr2=b.toCharArray();
        int [] frequency1=new int [26];
        int [] frequency2=new int [26];
        for( char i:arr1)
        {
            int ind=i-'a';
            frequency1[ind]++;
        }
        for( char i:arr2)
        {
            int ind=i-'a';
            frequency2[ind]++;
        }
        for(int i=0;i<26;i++)
        {
            if(frequency2[i]!=frequency1[i])
                return false;
                
        }
        return true;
        
        
    }

    // optimized : debosmita
    public static boolean isAnagram(String a,String b)
    {
        
    if (a.length() != b.length()) {
            return false;
        }
        
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();
        
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);
        
        return Arrays.equals(charArrayA, charArrayB);
    }
}