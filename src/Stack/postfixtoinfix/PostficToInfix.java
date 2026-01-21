package Stack.postfixtoinfix;

import java.util.Stack;

public class PostficToInfix {

    public static void main(String[] args) {
        System.out.println(postfixToInfix("abc*+"));
    }

    public static String postfixToInfix(String s)
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
                stack.push(op1+c+op2);
            }
        }
        return stack.pop();
    }
}
