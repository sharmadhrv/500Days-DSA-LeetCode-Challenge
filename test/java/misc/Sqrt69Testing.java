package misc;

import miscellaneous.sqrt69.Sqrt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sqrt69Testing {

    Sqrt sqrt = new Sqrt();

    @Test
    public void test1()
    {
        assertEquals(5,sqrt.mySqrt(25));
    }
}
