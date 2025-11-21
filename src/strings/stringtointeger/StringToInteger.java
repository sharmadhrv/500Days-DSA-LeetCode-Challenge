package strings.stringtointeger;

public class StringToInteger {

    public long myAtoi(String s) {
        if (s.isEmpty()) return 0;
        s= s.trim();
        if (s.isEmpty()) return 0;
        long res =0;
        int index =0;
        int sign=1;
        if(s.charAt(index)=='-') {
            index++;
            sign = -1;
        }
        else if(s.charAt(index)=='+')
            index++;
        for(int i = index;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!Character.isDigit(ch))
                break;
            int digit = ch-'0';
            if (res > Long.MAX_VALUE / 10 ||
                    (res == Long.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Long.MAX_VALUE : Long.MIN_VALUE;
            }
            res = res*10 + digit;
        }
            return sign*res;
    }
}
