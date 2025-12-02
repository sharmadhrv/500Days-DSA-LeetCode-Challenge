package Stack.validParenthesis;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {

    public boolean isValid(String s){
        int top =-1;
        char[] arr = new char[s.length()];
        for(char c : s.toCharArray())
        {
            if(c == '('||c =='{' || c =='[')
                arr[++top] = c;
            else if(top !=-1) {
                if(c == ')') {
                    if (arr[top] == '(')
                        top--;
                    else
                        return false;
                }
                else if(c == '}') {
                    if (arr[top] == '{')
                        top--;
                    else
                        return false;
                }
                else if(c == ']') {
                    if (arr[top] == '[')
                        top--;
                    else
                        return false;
                }
            }
            else return false;
        }
        return top == -1;
    }
}
