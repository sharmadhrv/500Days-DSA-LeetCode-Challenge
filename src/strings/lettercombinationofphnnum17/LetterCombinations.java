package strings.lettercombinationofphnnum17;

import java.util.*;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<List<String>> answer = new ArrayList<>(2);
        char firstDigit = digits.charAt(0);
        String firstDigitAlphabet = map.get(firstDigit);
        String[] firstDigitArray = firstDigitAlphabet.split("");
        List<String> innerArray = new ArrayList<>(Arrays.asList(firstDigitArray));
        answer.add(new ArrayList<>(innerArray));
        for(int i =1;i<digits.length();i++)
        {
            char digit = digits.charAt(i);
            innerArray.clear();
             firstDigitAlphabet = map.get(digit);
             firstDigitArray = firstDigitAlphabet.split("");
             List<String> listArray = answer.getFirst();
             for(int j =0;j< listArray.size();j++)
             {
                 for(int k =0;k<firstDigitArray.length;k++)
                 {
                     String str = listArray.get(j)+firstDigitArray[k];
                     innerArray.add(str);
                 }
             }
            answer.add(new ArrayList<>(innerArray));
            answer.removeFirst();
        }

        return answer.getFirst();
    }
}
