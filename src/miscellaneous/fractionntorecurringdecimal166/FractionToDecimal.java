package miscellaneous.fractionntorecurringdecimal166;

import java.util.HashMap;
import java.util.Map;

public class FractionToDecimal {

    public String fractionToDecimal(int numerator, int denominator) {

       if(numerator ==0) return "0";

       StringBuilder result = new StringBuilder();

       if((numerator<0)^(denominator<0))
           result.append("-");

       long num = Math.abs((long)numerator);
       long deno = Math.abs((long)denominator);

       long rem = num%deno;
       result.append(num/deno);

       if(rem == 0) return result.toString();
       result.append(".");

       Map<Long,Integer> map = new HashMap<>();

        while(rem!=0) {
            if (map.containsKey(rem)) {
                int index = map.get(rem);
                result.insert(index, '(');
                result.append(')');
                break;
            }
            map.put(rem,result.length());
            rem *= 10;
            result.append(rem/deno);
            rem = rem % deno;
        }
        return result.toString();
    }
}
