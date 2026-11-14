package misc;

import miscellaneous.fractionntorecurringdecimal166.FractionToDecimal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionToDecimal166Testing {

    FractionToDecimal fractionToDecimal = new FractionToDecimal();

    @Test
    public void test1() {
        assertEquals("0.(142857)",fractionToDecimal.fractionToDecimal(1,7));
    }

    @Test
    public void test2(){
        assertEquals("0.(012)",fractionToDecimal.fractionToDecimal(4,333));
    }
}
