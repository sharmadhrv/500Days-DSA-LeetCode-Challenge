package graphs;

import graphs.shortestpathinundirectedgraph.ShortestPath;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShortestPathUndirectedTesting {

    ShortestPath shortestPath = new ShortestPath();

    @Test
    public void test1()
    {
        int n = 7;
        int m = 7;
        int src = 0;

        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 3},
                {3, 4},
                {5, 6},
                {4, 2}
        };
        ArrayList<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(0, 1, 1, 2, 2, -1, -1));
        assertEquals(expected,shortestPath.shortestPath(edges,n,m,src));
    }
}
