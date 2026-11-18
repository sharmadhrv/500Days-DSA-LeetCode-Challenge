package graphs.wordladder126;

import java.util.*;

public class WordLadder {

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

        Set<String> set = new HashSet<>();
        set.addAll(wordList);

        List<List<String>> ans = new ArrayList<>();

        if(!set.contains(endWord)) return ans;

        Queue<List<String>> queue = new LinkedList<>();

        List<String > start = new ArrayList<>();
        start.add(beginWord);
        queue.offer(start);


        while(!queue.isEmpty())
        {
            int size = queue.size();
            Set<String> usedWord = new HashSet<>();

            for(int j =0;j<size;j++) {

                List<String> temp = queue.poll();
                String word = temp.getLast();

                if (word.equals(endWord)) {
                    ans.add(temp);
                    continue;
                }
                    for (int i = 0; i < word.length(); i++) {
                        char[] arr = word.toCharArray();
                        for (char c = 'a'; c <= 'z'; c++) {
                            arr[i] = c;
                            String newWord = new String(arr);

                            if (set.contains(newWord)) {
                                List<String> newPath = new ArrayList<>(temp);
                                newPath.add(newWord);
                                queue.offer(newPath);
                                usedWord.add(newWord);
                            }
                        }
                }
            }
            set.removeAll(usedWord);
            if(!ans.isEmpty())
                break;
        }
        return ans;
    }
}
