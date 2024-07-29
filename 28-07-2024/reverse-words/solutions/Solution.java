import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

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

    // optimized : debosmita
    String reverseWords(String S)
    {
        
        String words[]=S.split("\\.");
        
        int left=0,right=words.length-1;
        while(left<right){
            String temp = words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
            
        }
        return String.join(".",words);
    }

    // optimized : soumyadeep
    String reverseWords(String S)
    {
        // code here 
        String ans="",s="";
        char [] a=S.toCharArray();
        List<String> arr=new LinkedList<String>();
        for(char i: a)
        {   
           if(i!='.')
            s=s+i;
           else{
               s="."+s;
               arr.add(s);
               s="";
           }
        }
        arr.add(s);
        for(String i: arr)
        {   
            ans=i+ans;
        }
            
        return ans;
    }
}