package graphs.numberofenclaves1020;

public class NumberOfEnclaves {

    public int numEnclaves(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
                if((i==0||i==n-1||j==0||j==m-1) && !visited[i][j] && grid[i][j]==1)
                    dfs(grid,i,j,visited);
        }

        int count=0;
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
                if(grid[i][j]==1 && !visited[i][j])
                    count++;
        }
        return count;
    }

    private void dfs(int[][] grid,int row,int col, boolean[][] visited)
    {
        if(row<0 || row>=grid.length || col <0 || col>=grid[0].length)
            return;
        if(!visited[row][col]&& grid[row][col]==1)
        {
            visited[row][col] = true;
            dfs(grid,row-1,col,visited);
            dfs(grid,row+1,col,visited);
            dfs(grid,row,col-1,visited);
            dfs(grid,row,col+1,visited);
        }
    }
}
