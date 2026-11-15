package graphs.shortestpathindag;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ShortestPath shortestPath = new ShortestPath();

        int[][] edges = {{0,1,2}, {0,4,1}, {4,5,4}, {4,2,2}, {1,2,3}, {2,3,6}, {5,3,1}};
        //int[][] edges = {{0,1,2},{0,2,1}};

        List<Integer> ans = shortestPath.shortestPath(6,edges);

        System.out.println(ans);

    }
}
