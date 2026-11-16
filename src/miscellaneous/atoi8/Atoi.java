package miscellaneous.atoi8;

public class Atoi {

    public int myAtoi(String s) {

        s = s.trim();
        int sign = 1;
        int index = 0;
        if(s.charAt(0)=='-')
        {
            index++;
            sign = -1;
        }
        else if(s.charAt(0)=='+')
            index++;

        int res = 0;
        for(int i = index;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(!Character.isDigit(c))
                break;

            int digit = c-'0';

            if(res > Integer.MAX_VALUE/10 || (res < Integer.MIN_VALUE/10 && digit > 7 ))
            {
                if(sign == -1) return Integer.MIN_VALUE;
                else return  Integer.MAX_VALUE;
            }
            res = res*10 + digit;
        }
        return res;
    }
}
