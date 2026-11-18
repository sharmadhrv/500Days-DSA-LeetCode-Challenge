package graphs.dijkstraalgorithm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();


        int[][] edges = {
                {0, 1, 4},
                {0, 2, 8},

                {1, 0, 4},
                {1, 4, 6},
                {1, 2, 3},

                {2, 0, 8},
                {2, 3, 2},
                {2, 1, 3},

                {3, 2, 2},
                {3, 4, 10},

                {4, 1, 6},
                {4, 3, 10}
        };

        System.out.println(Arrays.toString(dijkstraAlgorithm.dijkstra(edges,5,0)));
    }
}
