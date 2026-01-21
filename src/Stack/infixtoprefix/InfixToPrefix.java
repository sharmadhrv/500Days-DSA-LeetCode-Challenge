package Stack.infixtoprefix;

import java.util.Stack;

public class InfixToPrefix {

    public static void main(String[] args) {
        System.out.println(infixToPrefix("a+b*c"));
    }

    public static  String infixToPrefix(String s) {
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        char c ;
        for(int i = s.length()-1;i>=0;i--) {
            if (s.charAt(i) == '(')
                c = ')';
            else if (s.charAt(i) == ')')
                c = '(';
            else
                c = s.charAt(i);

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                answer.append(c);
            }
            else if (c == '(')
                stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    answer.append(stack.pop());
                stack.pop();
            }
            else {
                while (!stack.isEmpty() &&
                        (priority(c) < priority(stack.peek())|| (priority(c)==priority(stack.peek()) && c !='^')))
                    answer.append(stack.pop());

                stack.push(c);
            }
        }
            while (!stack.isEmpty()) {
                answer.append(stack.pop());
            }
            return answer.reverse().toString();
    }

    private static  int priority(char c)
    {
        return switch (c) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }
}
