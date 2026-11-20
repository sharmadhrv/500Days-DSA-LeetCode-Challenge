package graphs.shortestpathinbinarymatrix1091;

public class Main
{
    public static void main(String[] args) {

        ShortestPath shortestPath = new ShortestPath();
        int[][] grid = {{1,0,0},{1,1,0},{1,1,0}};
        System.out.println(shortestPath.shortestPathBinaryMatrix(grid));
    }
}

