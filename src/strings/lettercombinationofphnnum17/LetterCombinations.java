package strings.lettercombinationofphnnum17;

import java.util.*;

public class LetterCombinations {

    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();
        String[] numberList = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        List<List<String>> answer = new ArrayList<>(2);
        char digit = digits.charAt(0);
        String digitAlphabet = numberList[digit-'0'];
        String[] digitArray = digitAlphabet.split("");
        List<String> innerArray = new ArrayList<>(Arrays.asList(digitArray));
        answer.add(new ArrayList<>(innerArray));
        for(int i =1;i<digits.length();i++)
        {
            digit = digits.charAt(i);
            innerArray.clear();
             digitAlphabet = numberList[digit-'0'];
             digitArray = digitAlphabet.split("");
             List<String> listArray = answer.getFirst();
             for(int j =0;j< listArray.size();j++)
             {
                 for(int k =0;k<digitArray.length;k++)
                 {
                     String str = listArray.get(j)+digitArray[k];
                     innerArray.add(str);
                 }
             }
            answer.add(new ArrayList<>(innerArray));
            answer.removeFirst();
        }

        return answer.getFirst();
    }
}
