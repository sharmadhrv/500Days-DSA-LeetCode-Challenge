package strings;

import org.junit.Test;
import strings.reversewordinstring151.ReverseString;

import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    ReverseString rs = new ReverseString();

    @Test
    public void testNormalSentence() {
        assertEquals("blue is sky the", rs.reverseString("the sky is blue"));
    }

    @Test
    public void testLeadingTrailingSpaces() {
        assertEquals("world hello", rs.reverseString("  hello world  "));
    }

    @Test
    public void testMultipleSpacesBetweenWords() {
        assertEquals("Java is this", rs.reverseString("this   is   Java"));
    }

    @Test
    public void testSingleWord() {
        assertEquals("hello", rs.reverseString("hello"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", rs.reverseString(""));
    }

    @Test
    public void testOnlySpaces() {
        assertEquals("", rs.reverseString("     "));
    }

    @Test
    public void testMixedCase() {
        assertEquals("FUN Is Java", rs.reverseString("Java Is FUN"));
    }
}