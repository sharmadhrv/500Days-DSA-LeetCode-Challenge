package graphs;

import graphs.numberofenclaves1020.NumberOfEnclaves;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfEnclaves1020Testing {

    NumberOfEnclaves numberOfEnclaves = new NumberOfEnclaves();

    @Test
    public void test1()
    {
        int[][] grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};

        assertEquals(3,numberOfEnclaves.numEnclaves(grid));
    }
}
