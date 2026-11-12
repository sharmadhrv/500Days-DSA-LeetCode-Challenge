package graphs.bipartitegraph785;

public class Main {

    public static void main(String[] args) {

        Bipartite bipartite = new Bipartite();

        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};

        System.out.println(bipartite.isBipartite(graph));
    }
}
