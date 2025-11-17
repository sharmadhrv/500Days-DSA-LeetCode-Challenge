package strings.removeoutermostparentheses;

import java.util.ArrayList;

public class RemoveParentheses {

    public String removeParentheses(String s)
    {
        StringBuilder sb = new StringBuilder();
        int sum =0;
        int j=0;
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c =='(')
                sum+=1;
            else sum-=1;
            if(sum == 0)
            {
                list.add(s.substring(j,i+1));
                j = i+1;
            }
        }

        for(String str : list)
        {
            for(int i =1;i<str.length()-1;i++)
            {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}
