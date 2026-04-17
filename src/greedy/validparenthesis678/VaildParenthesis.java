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
}
