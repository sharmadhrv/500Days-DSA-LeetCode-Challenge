package strings.largestoddnostring1903;

import java.util.Arrays;

public class LargestOddString {

    public String largestOddNumber(String num)
    {
        String answer = "";
        for(int i = num.length()-1;i>=0;i--)
        {
            if((num.charAt(i)-'0') % 2 !=0)
            {
                answer = num.substring(0,i+1);
                break;
            }
        }
        return answer;
    }

}
