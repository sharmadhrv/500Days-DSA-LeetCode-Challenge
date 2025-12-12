package strings.longestsubstringwithoutrepeating;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {

        if(s.equals(" ")) return 1;
        int length=0;
        Set<Character> set = new HashSet<>();
       int i =0;
       int j =0;
       int n = s.length();
       while(j<n)
       {
           char c = s.charAt(j);
           if(!set.contains(c))
           {
               set.add(c);
               length = Math.max(length,j-i+1);
           }
           else {
               while (set.contains(c)) {
                   set.remove(s.charAt(i));
                   i++;
               }
               set.add(c);
           }
           j++;
       }
    return length;
    }
}
