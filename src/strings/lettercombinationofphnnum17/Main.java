package strings.lettercombinationofphnnum17;

import java.sql.SQLOutput;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LetterCombinations combinations = new LetterCombinations();
        String s = "223";
        List<String> answer = combinations.letterCombinations(s);
        System.out.println(answer);
        System.out.println(combinations.letterCombinationsRecurrsion("223"));
        System.out.println(combinations.countCombinations("223"));
    }
}
