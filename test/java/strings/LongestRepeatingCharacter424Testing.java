package strings;

import org.junit.Test;
import strings.longestrepeatedcharacterreplacement424.CharacterReplacement;

import static org.junit.Assert.assertEquals;

public class LongestRepeatingCharacter424Testing {

    CharacterReplacement characterReplacement  = new CharacterReplacement();

    @Test
    public void test1(){
        assertEquals(4,characterReplacement.characterReplacement("AABABBA",1));
    }


}
