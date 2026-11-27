package graphs;

import graphs.numberofisland2nd305.NumberOfIsland;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumberOfIsland2nd305Testing {

    NumberOfIsland numberOfIsland = new NumberOfIsland();

    @Test
    public  void test1()
    {
        int[][] positions = {
                {0, 0},
                {0, 1},
                {1, 2},
                {2, 1}
        };

        List<Integer> expected =  new ArrayList<>(Arrays.asList(1,1,2,3));
        assertEquals(expected,numberOfIsland.numIslands2(3,3,positions));
    }
}
