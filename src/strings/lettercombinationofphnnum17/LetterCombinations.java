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


    public List<String> letterCombinationsRecurrsion(String digits) {

        String[] numberList = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if(digits.isEmpty()) return new ArrayList<>();
        List<String> answer = help("",digits,numberList);
        return answer;
    }

    private static List<String>  help(String p,String u,String[] numberList)
    {
        if(u.isEmpty())
        {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> answer = new ArrayList<>();
        int ch = u.charAt(0)-'0';
        char[] charArray = numberList[ch].toCharArray();
        for(int i =0;i<charArray.length;i++)
        {
            List<String> temp = help(p+charArray[i],u.substring(1),numberList);
            answer.addAll(temp);
        }
        return answer;
    }


    public int countCombinations(String digits)
    {
        String[] numberList = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if(digits.isEmpty()) return 0;
        int answer = helpCount("",digits,numberList);
        return answer;
    }

    private static int helpCount(String p,String u,String[] numberList)
    {
        if(u.isEmpty())
        {
            return 1;
        }
        int  answer = 0;
        int ch = u.charAt(0)-'0';
        char[] charArray = numberList[ch].toCharArray();
        for(int i =0;i<charArray.length;i++)
        {
            int  temp = helpCount(p+charArray[i],u.substring(1),numberList);
            answer+=temp;
        }
        return answer;
    }


}

