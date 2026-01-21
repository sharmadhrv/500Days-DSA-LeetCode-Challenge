package Stack.infixtopostfix;

public class InfixToPostFix {

    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b*c^d+9"));
    }

      public static  String infixToPostfix(String s) {
        StringBuilder sb = new StringBuilder();
        char[] stack = new char[s.length()];
        int top = -1;
        for(char c : s.toCharArray())
        {
            if((c>='A' && c<='Z')||
                    (c>='a' && c<='z')||
                    (c>='0' && c<='9'))
            {
                sb.append(c);
            }
            else if(c == ')')
            {
                while(top !=-1 && stack[top] !='(')
                {
                    sb.append(stack[top--]);
                }
                top--;
            } else if (c == '(') {
                stack[++top] = c;
                
            } else {
                if (top == -1)
                    stack[++top] = c;
                else {
                    while (top !=-1 &&
                            (priority(c) < priority(stack[top]) || (priority(c) == priority(stack[top])
                            &&  c!='^' ))) {
                        sb.append(stack[top--]);
                    }
                    stack[++top] = c;
                }
            }
        }
        while(top !=-1)
            sb.append(stack[top--]);
        return sb.toString();
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
