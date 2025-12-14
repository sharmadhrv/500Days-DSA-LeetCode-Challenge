package strings.lettercombinationofphnnum17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>() ;
        Map<Character,String> map  = new HashMap<>();
            map.put('2',"abc");
            map.put('3',"def");
            map.put('4',"ghi");
            map.put('5',"jkl");
            map.put('6',"mno");
            map.put('7',"pqrs");
            map.put('8',"tuv");
            map.put('9',"wxyz");

            char[] digitsArray = digits.toCharArray();
            List<char[]> alphabetList = new ArrayList<>();
            for(char c :digits.toCharArray())
        {
            alphabetList.add(map.get(c).toCharArray());
        }
            List<String> answer = new ArrayList<>();
        if(alphabetList.size() ==1)
        {
            for(char c : alphabetList.getFirst())
            {
                answer.add(String.valueOf(c));
            }
        }
        if(alphabetList.size()==2)
        {
            for(char c1 : alphabetList.get(0))
            {
                for(char c2 : alphabetList.get(1))
                    answer.add(c1 +String.valueOf(c2));
            }
        }
        return answer;
    }
}
