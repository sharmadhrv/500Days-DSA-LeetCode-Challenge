package graphs;

import graphs.surroundedregions130.Surroundedregion;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class SurroundedRegion130Testing {

    Surroundedregion surroundedregion = new Surroundedregion();

    @Test
    public void test1(){
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        char[][] expected = {{'X','X','X','X'},{'X','X','X','X'},{'X','X','X','X'},{'X','O','X','X'}};

        surroundedregion.solve(board);
            assertArrayEquals(expected, board);
    }
}
