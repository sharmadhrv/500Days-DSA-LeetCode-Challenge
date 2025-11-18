package strings;

import org.junit.Test;
import strings.largestoddnostring1903.LargestOddString;

import static org.junit.Assert.assertEquals;

public class LongestOddNumberStringTesting {

    LargestOddString largestOddString = new LargestOddString();

    @Test
    public void emptyString()
    {
        assertEquals("",largestOddString.largestOddNumber(""));
    }

    @Test
    public void subString()
    {
        assertEquals("45270",largestOddString.largestOddNumber("4527"));
    }

    @Test
    public void fullString()
    {
        assertEquals("45207",largestOddString.largestOddNumber("45207"));
    }

    @Test
    public void longString()
    {
        assertEquals("246987654322456798765",largestOddString.largestOddNumber("2469876543224567987654"));
    }
}
