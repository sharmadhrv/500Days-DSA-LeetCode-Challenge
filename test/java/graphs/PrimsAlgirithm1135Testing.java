package graphs;

import graphs.primsalgorithm1135.ConnectingCities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimsAlgirithm1135Testing {

    ConnectingCities connectingCities = new ConnectingCities();

    @Test
    public void test1(){
        int[][] connections = { {1, 2, 2},
                {1, 3, 1},
                {2, 3, 1},
                {2, 4, 3},
                {3, 4, 2},
                {3, 5, 4},
                {4, 5, 1}};
        assertEquals(5,connectingCities.minimumCost(5,connections));
    }

    public void test2(){
        int[][] connections = { {1, 2, 2},
                {1, 3, 1},
                {2, 3, 1},
                {2, 4, 3},
                {3, 4, 2},
                {3, 5, 4},
                {4, 5, 1}};
        assertEquals(5,connectingCities.minimumCostByKruskal(5,connections));
    }

}
