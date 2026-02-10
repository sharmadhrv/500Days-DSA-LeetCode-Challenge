package strings.longestsubstringwithoutrepeating3;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {

        if(s.equals(" ")) return 1;
       Set<Character> set = new HashSet<>();
       int left = 0;
       int right = 0;
       int length = 0;
       while(right<s.length())
       {
           if(!set.contains(s.charAt(right)))
           {
               set.add(s.charAt(right));
               length = Math.max(length,right-left+1);
           }
           else{
               while(set.contains(s.charAt(right)))
               {
                   set.remove(s.charAt(left));
                   left++;
               }
               set.add(s.charAt(right));
           }
           right++;
       }
       return length;
    }
}
