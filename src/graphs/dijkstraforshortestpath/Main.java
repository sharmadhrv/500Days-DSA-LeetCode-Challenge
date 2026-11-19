package graphs.dijkstraforshortestpath;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
         Dijkstra dijkstra = new Dijkstra();

         int[][] edges = {{1,2,2},{2,5,5},{2,3,4},{1,4,1},{4,3,3},{3,5,1}};
        System.out.println(Arrays.toString(dijkstra.shortestPath(5,6,edges)));
    }
}
