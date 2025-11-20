package strings.isomorphicstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IsoMorphicString {

    public boolean isIsomorphic(String s,String t)
    {
//        if(s.length() != t.length())
//            return false;
//        Map<Character,Character> hash1 = new HashMap<>();
//        Map<Character,Character> hash2 = new HashMap<>();
//        for(int i =0;i<s.length();i++)
//        {
//            char c1 = s.charAt(i);
//            char c2 = t.charAt(i);
//             if(hash1.containsKey(c1))
//             {
//                 if(hash1.get(c1)!= c2)
//                     return false;
//             }
//             else
//                 hash1.put(c1,c2);
//
//             if(hash2.containsKey(c2))
//             {
//                 if(hash2.get(c2)!=c1)
//                     return false;
//             }
//             else
//                 hash2.put(c2,c1);
//        }
//        return true;



        int len1 = s.length();
        int len2 = t.length();
        if (len1 != len2) {
            return false;
        }

        int []stArr = new int[256];
        int []tsArr = new int[256];

        for (int i = 0; i < len1; i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(stArr[c1] != tsArr[c2]){
                return false;
            }
            stArr[c1] = i + 1;
            tsArr[c2] = i + 1;
        }
        return true;


    }
}
