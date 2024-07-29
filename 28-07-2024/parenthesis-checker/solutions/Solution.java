import java.util.Stack;

class Solution
{
    //Function to check if brackets are balanced or not.
    // optimized : atul
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

    // optimized : soumyadeep
    static boolean ispar(String x)
    {
        // add your code here
        char []arr=x.toCharArray();
        if(x.length()==1)
            return false;
        Stack<Character> stk = new Stack<Character>();
        for(char i:arr)
        {
            if(i=='['||i=='('||i=='{')
                stk.push(i);
            else if(!stk.isEmpty()&&stk.peek()=='('&& i==')')
                stk.pop();
            else if(!stk.isEmpty()&&stk.peek()=='{'&& i=='}')
                stk.pop();
                
            else if(!stk.isEmpty()&&stk.peek()=='['&& i==']')
                stk.pop();
            else
                return false;
                
        }
        if(stk.isEmpty())
            return true;
        else
            return false;
    }
}