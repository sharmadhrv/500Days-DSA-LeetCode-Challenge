package graphs.wordladder127;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        WordLadder wordLadder = new WordLadder();

        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));


        System.out.println(wordLadder.ladderLength("hit","cog",wordList));
    }
}
