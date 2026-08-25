package graphs;

import graphs.floodfill733.FloodFill;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloodFill733Testing {

    FloodFill floodFill = new FloodFill();

    @Test
    public void test1(){
        int[][] grid = {{1,1,1},{1,1,0},{1,0,1}};

        int[][] expected = {{2,2,1},{2,2,0},{2,0,1}};
        assertEquals(expected,floodFill.floodFill(grid,1,1,2));
    }

    @Test
    public void test2(){
        int[][] grid = {{0,0,0},{0,0,0}};

        int[][] expected = {{0,0,0},{0,0,0}};
        assertEquals(expected,floodFill.floodFill(grid,0,0,0));
    }
}
