package Stack.prefixtoinfix;

import java.util.Stack;

public class PrefixToInfix {

    public static void main(String[] args) {
        System.out.println(prefixToInfix("+a*bc"));
    }

    public static  String prefixToInfix(String s) {
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
                stack.push("("+op1 + s.charAt(i) + op2+")");
            }
        }
        return stack.pop();
    }

}
