class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
            
        Stack<Character> stack = new Stack<>();
        
        for ( int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            
            switch (ch) {
                case '{':
                case '(':
                case '[':
                    stack.push(ch);
                    break;
                
                case '}':
                    if ( stack.isEmpty() || stack.pop() != '{' ) {
                        return false;
                    }
                    break;

                case ')':
                    if ( stack.isEmpty() || stack.pop() != '(' ) {
                        return false;
                    }
                    break;
                    
                case ']':
                    if ( stack.isEmpty() || stack.pop() != '[' ) {
                        return false;
                    }
                    break;
            }
        }
        
        return stack.isEmpty();
    }
}