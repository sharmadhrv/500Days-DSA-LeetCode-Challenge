package strings.largestoddnostring1903;

import java.util.Arrays;

public class LargestOddString {

    public String largestOddNumber(String num)
    {
        //String[] arr = num.split("");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(num);
        while(n>0)
        {
            if(n%2!=0)
                return String.valueOf(n);
            n=n/10;
        }
        return "";
    }

}
