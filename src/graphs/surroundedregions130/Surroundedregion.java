package graphs.surroundedregions130;

public class Surroundedregion {
    public void solve(char[][] board) {

        int n = board.length, m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
               if((i==0||i==n-1||j==0||j==m-1) && !visited[i][j] && board[i][j]=='O')
                   dfs(board,i,j,visited);
        }

        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
                if(board[i][j]=='O' && !visited[i][j])
                    board[i][j] ='X';
        }
    }

    private void dfs(char[][] board,int row,int col, boolean[][] visited)
    {
        if(row<0 || row>=board.length || col <0 || col>=board[0].length)
            return;
        if(!visited[row][col]&& board[row][col]=='O')
        {
            visited[row][col] = true;
            dfs(board,row-1,col,visited);
            dfs(board,row+1,col,visited);
            dfs(board,row,col-1,visited);
            dfs(board,row,col+1,visited);
        }
    }
}
