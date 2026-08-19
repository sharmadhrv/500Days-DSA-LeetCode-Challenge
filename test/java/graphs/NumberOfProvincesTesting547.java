package graphs;

import graphs.numberofprovinces547.ProvincesNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfProvincesTesting547 {

    ProvincesNumber provincesNumber = new ProvincesNumber();

    @Test
    public void test1(){
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        int expected = 2;
        int actual = provincesNumber.findCircleNum(isConnected);
        assertEquals(expected,actual);
    }

    @Test
    public void test2(){
        int[][] isConnected = {{1,0,0},{0,1,0},{0,0,1}};
        int expected = 3;
        int actual = provincesNumber.findCircleNum(isConnected);
        assertEquals(expected,actual);
    }
}
