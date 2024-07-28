class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String[] arr = S.split("\\.");
        
        Collections.reverse(Arrays.asList(arr));
        
        return String.join(".", arr);
    }
}