package graphs.wordladder127;

import java.util.*;

public class WordLadder {

    private class Pair{
        String word;
        int level;

        Pair(String w, int level)
        {
            this.word = w;
            this.level = level;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        Set<String> word = new HashSet<>();
        word.addAll(wordList);

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(beginWord,1));

        while(!queue.isEmpty() )
        {
            Pair p  = queue.poll();
            if(p.word.equals(endWord)) return p.level;

            for(int i = 0;i<p.word.length();i++)
            {
                for(char ch='a';ch<='z';ch++)
                {
                    char[] arr  = p.word.toCharArray();
                    arr[i] = ch;
                    String s = new String(arr);
                    if(word.contains(s))
                    {
                        queue.add(new Pair(s,p.level+1));
                        word.remove(s);
                    }
                }
            }
        }
       return 0;
    }
}
