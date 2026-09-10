package graphs.surroundedregions130;

public class Main {

    public static void main(String[] args) {

        Surroundedregion surroundedregion = new Surroundedregion();

        char[][] board = {{'X','X','X','X'},{'O','O','O','X'},{'X','O','X','X'},{'X','X','O','X'}};

        surroundedregion.solve(board);

        for(int i =0;i<board.length;i++)
        {
            for(int j =0;j<board[0].length;j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
