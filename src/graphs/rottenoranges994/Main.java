package graphs.rottenoranges994;

public class Main {

    public static void main(String[] args) {

        RottenOranges rottenOranges = new RottenOranges();


        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(rottenOranges.orangesRotting(grid));    }
}
