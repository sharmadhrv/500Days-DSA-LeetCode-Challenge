package graphs;

import graphs.bipartitegraph785.Bipartite;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Bipartite785Testing {

    Bipartite bipartite = new Bipartite();

    @Test
    public void test1()
    {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        assertEquals(false, bipartite.isBipartite(graph));

    }
}
