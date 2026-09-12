package graphs.wordladder127;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<>();
        for(String s : wordList)
            set.add(s);

        while(true)
        {
            String newWord = bfs(beginWord,set);
            if(newWord == null)
                return 0;
            beginWord = newWord;
        }
    }

    private String bfs(String word, HashSet<String> set)
    {
        StringBuffer sb = new StringBuffer(word);
        for(int i = 0;i<word.length();i++)
        {
            for(int j = 0;j<25;j++)
            {
                sb.replace()word.charAt(j);

            }
        }
    }

}
