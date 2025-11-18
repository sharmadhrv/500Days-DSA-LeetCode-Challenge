package strings.removeoutermostparentheses1021;

public class RemoveParentheses {

    public String removeParentheses(String s)
    {
//        StringBuilder sb = new StringBuilder();
//        int sum =0;
//        int j=0;
//        for(int i = 0;i<s.length();i++)
//        {
//            char c = s.charAt(i);
//            if(c =='(')
//                sum+=1;
//            else sum-=1;
//            if(sum == 0)
//            {
//                sb.append(s.substring(j+1,i));
//                j = i+1;
//            }
//        }
//        return sb.toString();

// another approach
        StringBuilder sb = new StringBuilder();
        int count =0;
        for(char c : s.toCharArray())
        {
            if(c == '(') count++;
            else count--;
            if(count!= 0) sb.append(c);
        }
        return sb.toString();
    }
}
