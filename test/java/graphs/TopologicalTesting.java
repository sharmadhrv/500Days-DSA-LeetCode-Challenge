package graphs;

import graphs.topologicalsort.TopologicalSort;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopologicalTesting {

    TopologicalSort  topologicalSort  = new TopologicalSort();

    @Test
    public void test1(){

        int[][] graph = {{},{},{3},{1},{0,1},{0,2}};
        int[] expected = {5,4,2,3,1,0};
        assertEquals(expected, topologicalSort.topologicalSort(graph));
    }
}
