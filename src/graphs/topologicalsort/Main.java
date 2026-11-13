package graphs.topologicalsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        TopologicalSort topologicalSort = new TopologicalSort();

        int[][] adj = {{},{},{3},{1},{0,1},{0,2}};

        System.out.println(Arrays.toString(topologicalSort.topologicalSort(adj)));
    }
}
