package Stack.prefixToPostfix;

import java.util.Stack;

public class PrefixToPostfix {

    public static void main(String[] args) {
        System.out.println(prefixToPostfix("+a*bc"));
    }

    public static String prefixToPostfix(String s)
    {
        Stack<String> stack = new Stack<>();
        String op1, op2;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ||
                    (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                stack.push(s.charAt(i) + "");
            } else {
                op1 = stack.pop();
                op2 = stack.pop();
                stack.push(op1 + op2+s.charAt(i));
            }
        }
        return stack.pop();
    }
    }
