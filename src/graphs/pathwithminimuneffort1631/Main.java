package graphs.pathwithminimuneffort1631;

public class Main {

    public static void main(String[] args) {

        MinuimumEffort minuimumEffort = new MinuimumEffort();

        int[][] grid = {{1,2,2},{3,8,2},{5,3,5}};

        System.out.println(minuimumEffort.minimumEffortPath(grid));
    }
}
