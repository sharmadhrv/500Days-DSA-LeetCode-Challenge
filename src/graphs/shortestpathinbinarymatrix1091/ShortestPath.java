package graphs.shortestpathinbinarymatrix1091;

import java.security.PrivateKey;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ShortestPath {

    private static class Trio
    {
        int row;
        int col;
        int dist;

        Trio(int r,int c, int d)
        {
            this.row = r;
            this.col = c;
            this.dist = d;
        }

    }
    public int shortestPathBinaryMatrix(int[][] grid) {

        int row = grid.length-1;
        int col = grid[0].length-1;

        if(grid[0][0] == 1 || grid[row][col]==1) return -1;

        PriorityQueue<Trio> queue = new PriorityQueue<>((a,b)->a.dist-b.dist);

        int[][] dist = new int[grid.length][grid[0].length];
        for(int i =0;i<grid.length;i++)
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        dist[0][0] = 1;

        queue.offer(new Trio(0,0,1));

        int[] rowArray = {-1,1,0,0,-1,-1,1,1};
        int[] colArray = {0,0,-1,1,-1,1,-1,1};

        while(!queue.isEmpty())
        {
            Trio t = queue.poll();
            int r = t.row;
            int c = t.col;
            int d = t.dist;

            if(row ==r && col == c) return d;

            for(int i =0;i<8;i++)
            {
                int ro = r+rowArray[i];
                int co = c+colArray[i];
                if(ro>=0 && ro<=row
                && co>=0  && co<=col
            && grid[ro][co] == 0 &&
                        dist[ro][co]> d+1) {
                    dist[ro][co] =  d + 1;
                    queue.add(new Trio(ro, co, d + 1));
                }
            }
        }
        return -1;
    }
}
