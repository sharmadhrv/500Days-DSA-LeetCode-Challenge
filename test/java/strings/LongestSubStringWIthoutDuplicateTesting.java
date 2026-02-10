package strings;

import org.junit.Test;
import strings.longestsubstringwithoutrepeating3.LongestSubString;
import static org.junit.Assert.assertEquals;

public class LongestSubStringWIthoutDuplicateTesting {

    LongestSubString longestSubString = new LongestSubString();

    @Test
    public void emptyString(){assertEquals(1,longestSubString.lengthOfLongestSubstring(" "));}

    @Test
    public void normalString(){assertEquals(3,longestSubString.lengthOfLongestSubstring("abaabcbb"));}

    @Test
    public void repeatedString(){assertEquals(1,longestSubString.lengthOfLongestSubstring("bbbb"));
    }


}
