package strings.romantointeger13;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s)
    {
        char[] c = s.toCharArray();
        int size = s.length()-1;
        int count =0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i =size;i>=0;i--)
        {
            count+= map.get(c[i]);
            if(c[i] == 'V' || c[i] == 'X')
                map.put('I',-1);
            else if (c[i] == 'L' || c[i] == 'C')
                map.put('X',-10);
            else if(c[i] == 'M' || c[i] == 'D')
                map.put('C',-100);
        }
        return count;
    }
    public int romanToInt2(String s){

        int size = s.length();
        char[] c = s.toCharArray();
        int res =0;
        char next;

        for(int i=0;i<size;i++) {
            if (c[i] == 'I') {
                if (i < size - 1)
                {
                    next = c[i + 1];
                    if (next == 'V') {
                        res += 4;
                        i++;
                        continue;
                    } else if (next == 'X') {
                        res += 9;
                        i++;
                        continue;
                    }
                }
                res++;
            }
            else if (c[i] == 'X') {
                if (i < size - 1)
                {
                    next = c[i + 1];
                    if (next == 'L') {
                        res += 40;
                        i++;
                        continue;
                    } else if (next == 'C') {
                        res += 90;
                        i++;
                        continue;
                    }
                }
                res += 10;
            }
            else if (c[i] == 'C') {
                if (i < size - 1)
                {
                    next = c[i + 1];
                    if (next == 'D') {
                        res += 400;
                        i++;
                        continue;
                    } else if (next == 'M') {
                        res += 900;
                        i++;
                        continue;
                    }
                }
                res += 100;
            }
            else if(c[i] =='V')
                res+=5;
            else if (c[i] == 'L')
                res += 50;
            else if (c[i] == 'D')
                res += 500;
            else if (c[i] == 'M')
                res += 1000;
        }
        return res;
    }

}
