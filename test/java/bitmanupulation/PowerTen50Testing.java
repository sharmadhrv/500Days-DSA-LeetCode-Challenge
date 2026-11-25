package bitmanupulation;

import bitmanupulation.poweroften50.PowerTen;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowerTen50Testing {

    PowerTen powerTen = new PowerTen();

    @Test
    public void test1()
    {
        assertEquals(1024.0,powerTen.myPow(2.0,10),0.0001);
    }
}
