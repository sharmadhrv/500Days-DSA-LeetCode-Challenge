package greedy.validparenthesis678;

public class VaildParenthesis {

    public boolean checkValidString(String s) {

        int min = 0;
        int max = 0;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                min +=1;
                max +=1;
            }
            else if(c==')')
            {
                min -=1;
                max +=1;
            }
            else{
                min -=1;
                max +=1;
            }
            if(max<0) return false;
            if(min<0) min = 0;
        }
        return true;
    }

    public boolean checkValidString2(String s) {
        boolean answer = helper(s,0,0);
        return answer;

    }

    private boolean helper(String s , int index, int count )
    {
        if(count<0) return false;
        else if(index == s.length())
            return (count == 0);
        else{
            if(s.charAt(index) =='(')
                return helper(s,index+1,count+1);
            if(s.charAt(index)==')')
                return helper(s,index+1,count-1);

            return helper(s,index+1,count+1) ||
                    helper(s,index+1,count-1) ||
                    helper(s,index+1,count);
        }
    }
}
