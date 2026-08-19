package graphs;

import graphs.bfs.BFS;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BFSTesting {

    private List<List<Integer>> adj;

    BFS bfs = new BFS();

    @Before
    public void setUp(){

        adj = new ArrayList<>();

        int V = 8;

        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(6);

        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(2).add(4);


        adj.get(4).add(2);
        adj.get(4).add(5);

        adj.get(5).add(4);
        adj.get(5).add(7);

        adj.get(6).add(1);
        adj.get(6).add(7);
        adj.get(6).add(8);

        adj.get(7).add(6);
        adj.get(7).add(5);

        adj.get(8).add(6);
    }

    @Test
    public void diffStartNode(){
        List<Integer> expected = Arrays.asList(1,2,6,3,4,7,8,5);
        List<Integer> actual = bfs.BfS(8,1,adj);
        assertEquals(expected,actual);
    }
}
