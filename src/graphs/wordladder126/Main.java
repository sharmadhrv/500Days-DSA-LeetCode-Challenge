package graphs.wordladder126;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        WordLadder wordLadder = new WordLadder();

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log"));

        List<List<String>> answer = wordLadder.findLadders("hit","cog",wordList);

        for(List<String> s : answer)
            System.out.println(s);


    }
}
