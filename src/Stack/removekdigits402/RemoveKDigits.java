package Stack.removekdigits402;

import java.util.Stack;

public class RemoveKDigits {

    public static void main(String[] args) {
        System.out.println(removeKdigits("10001",4));
    }

    public static String removeKdigits(String num, int k) {
        if(k==num.length())return "0";
        Stack<Character> stack = new Stack<>();
        for(char ch: num.toCharArray())
        {
            while(!stack.isEmpty() && stack.peek() > ch && k >0 )
            {
                stack.pop();
                k--;
            }
            if(stack.isEmpty() && ch == '0')
                continue;
            stack.push(ch);
        }
        while (!stack.isEmpty() && k>0)
        {
            stack.pop();
            k--;
        }

        if(stack.isEmpty()) return "0";
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
