package graphs;

import graphs.dfs.DFS;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class DFSTesting {
    private List<List<Integer>> adj;
    DFS dfs = new DFS();

    @Before
    public void setUp() {
        adj = new ArrayList<>();

        int V = 8;

        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);

        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(6);

        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(7);

        adj.get(4).add(3);
        adj.get(4).add(8);

        adj.get(5).add(2);
        adj.get(6).add(2);

        adj.get(7).add(3);
        adj.get(7).add(8);

        adj.get(8).add(4);
        adj.get(8).add(7);
    }

    @Test
    public void diffStartNode() {

        List<Integer> expected =
                Arrays.asList(1, 2, 5, 6, 3, 4, 8, 7);

        List<Integer> actual =
                dfs.dfs(8, adj, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void diffStartNode2(){
        List<Integer> expected = Arrays.asList(3,1,2,5,6,4,8,7);
        List<Integer> actual = dfs.dfs(8,adj,3);

        assertEquals(expected,actual);
    }
}