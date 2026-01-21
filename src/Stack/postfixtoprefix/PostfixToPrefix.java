package Stack.postfixtoprefix;

import java.util.Stack;

public class PostfixToPrefix {

    public static void main(String[] args) {
        System.out.println(postfixToPrefix("abc*+"));
    }

    public static String postfixToPrefix(String s)
    {
        Stack<String> stack = new Stack<>();
        String op1,op2;
        for(char c : s.toCharArray())
        {
            if((c>='A' && c<='Z')||
                    (c>='a' && c<='z')
                    || (c>='0' && c<='9'))
            {
                stack.push(c+"");
            }
            else{
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(c+op1+op2);
            }
        }
        return stack.pop();
    }
}
