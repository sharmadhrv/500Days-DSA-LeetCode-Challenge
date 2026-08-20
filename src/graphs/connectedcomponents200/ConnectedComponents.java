package graphs.connectedcomponents200;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectedComponents {

    private class Pair{
        int first;
        int second;

        Pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }

    public int numIsland(char[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        int count = 0;
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if(visited[i][j]==0 && grid[i][j] == '1')
                {
                    visited[i][j] = 1;
                    bfs2(i,j,visited,grid);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfs(int row,int col, int[][] visited , char[][] grid)
    {
        visited[row][col] = 1;
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;

        while(!queue.isEmpty())
        {
            int ro = queue.peek().first;
            int co = queue.peek().second;
            queue.remove();

            for(int delrow = -1;delrow<=1;delrow++)
            {
                for(int delcol = -1;delcol<=1;delcol++)
                {
                    int newRow = delrow + ro;
                    int newCol = delcol + co;

                    if(newRow>=0 && newRow<n && newCol>=0 &&  newCol<m
                        && grid[newRow][newCol] =='1' && visited[newRow][newCol] ==0)
                    {
                        visited[newRow][newCol] = 1;
                        queue.offer(new Pair(newRow,newCol));
                    }
                }
            }
        }
    }

    // for leetcode 200

    private void bfs2(int row, int col, int[][] visited, char[][] grid)
    {
        visited[row][col] = 1;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row,col));
        int n = grid.length;
        int m = grid[0].length;

        while(!queue.isEmpty())
        {
            Pair current = queue.poll();
            int ro = current.first;
            int co = current.second;

            int[] list1 = {-1,0,0,1};
            int[] list2 = {0,-1,1,0};

            for(int i =0;i<4;i++)
            {
                int newRow = ro + list1[i];
                int newCol = co + list2[i];

                if(newRow>=0 && newRow<n && newCol>=0 && newCol<m
                && visited[newRow][newCol] ==0 && grid[newRow][newCol] =='1')
                {
                    visited[newRow][newCol] = 1;
                    queue.offer(new Pair(newRow,newCol));
                }
            }
        }
    }
}
