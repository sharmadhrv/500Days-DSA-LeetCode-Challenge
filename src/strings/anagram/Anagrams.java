package strings.anagram;

import java.util.*;

public class Anagrams {

    public boolean isAnagram(String s,String t)
    {
        int[] arr = new int[26];
        for(char c: s.toCharArray())
        {
            arr[c-'a']++;
        }

        for(char c: t.toCharArray())
            arr[c-'a']--;

        for(int i : arr)
            if(i!=0)
                return false;

        return true;
    }
//2. Using HashMap
    public boolean isAnagram2(String s,String t)
    {
        if(s.length()!= t.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            if(map.containsKey(c)) {
                int key = map.get(c);
                map.put(c, ++key);
            }
            else
                map.put(c,1);
        }

        for(char c : t.toCharArray())
        {
            if(!map.containsKey(c))
                return false;
            int key = map.get(c);
            map.put(c, --key);

            if(map.get(c) <0)
                return false;
        }
        return true;
    }

}
