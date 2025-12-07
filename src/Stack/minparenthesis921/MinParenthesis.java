package Stack.minparenthesis921;

public class MinParenthesis {

    public int minAddtoMakeValid(String s)
    {
        int length = s.length();
        char[] ch = new char[length];
       int  top =-1;
       int t =0;
        for(char c : s.toCharArray())
        {
            if(c =='(')
                ch[++top] = c;

            else if(top != -1 && c ==')'&& ch[top]=='(')
                top--;
            else t++;
        }
        return top+1+t;
    }

}
