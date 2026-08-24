package graphs;

import graphs.rottenoranges994.RottenOranges;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RottenOragnes994Testing {

   RottenOranges rottenOranges = new RottenOranges();
    @Test
    public void test1(){
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        assertEquals(4,rottenOranges.orangesRotting(grid));
    }

    @Test
    public void test2(){
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        assertEquals(-1,rottenOranges.orangesRotting(grid));
    }
}

