package misc;

import miscellaneous.atoi8.Atoi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyAtoi8Testing {

    Atoi atoi = new Atoi();
    @Test
    public  void test1 ()
    {
       assertEquals(42, atoi.myAtoi("-042"));
    }

    @Test
    public  void test2 ()
    {
        assertEquals(Integer.MAX_VALUE, atoi.myAtoi("3147483649"));
    }

    @Test
    public  void test3 ()
    {
        assertEquals(1337, atoi.myAtoi("1337c0d3"));
    }
}
