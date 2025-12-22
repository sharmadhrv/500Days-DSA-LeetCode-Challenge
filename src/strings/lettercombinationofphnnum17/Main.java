package strings.lettercombinationofphnnum17;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        LetterCombinations combinations = new LetterCombinations();
        String s = "223";
        List<String> answer = combinations.letterCombinations(s);
        for(String str : answer)
            System.out.print(str+" ");
        System.out.println(combinations.letterCombinationsRecurrsion(""));
    }
}
