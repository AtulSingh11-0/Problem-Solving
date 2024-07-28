class Solution 
{

    // brute force : atul
    String reverseWords(String S)
    {
        // code here 
        StringBuilder sb = new StringBuilder();
        String[] st = S.split("[.]");
        
        for ( int i = st.length - 1; i >= 0; i-- ) {
            if (i != 0) {
                sb.append(st[i]);
                sb.append(".");
            } else {
                sb.append(st[i]);
            }
        }
        
        return sb.toString();
    }

    //Function to reverse words in a given string.
    // optimized : atul
    String reverseWords(String S)
    {
        // code here 
        String[] arr = S.split("\\.");
        
        Collections.reverse(Arrays.asList(arr));
        
        return String.join(".", arr);
    }
}