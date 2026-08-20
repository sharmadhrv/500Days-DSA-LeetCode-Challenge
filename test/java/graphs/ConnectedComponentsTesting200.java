package graphs;

import graphs.connectedcomponents200.ConnectedComponents;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConnectedComponentsTesting200 {

    ConnectedComponents connectedComponents  = new ConnectedComponents();

    @Test
    public void test1(){

        char[][] grid = {{'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        assertEquals(1,connectedComponents.numIsland(grid));
    }
}
