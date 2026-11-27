package graphs;

import graphs.makingalargeisland827.LargeIsland;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargeIsland827Testing {

    LargeIsland largeIsland = new LargeIsland();

    @Test
    public  void test1()
    {
        int[][] grid = {{1,0},{0,1}};
        assertEquals(3,largeIsland.largestIsland(grid));
    }
}
