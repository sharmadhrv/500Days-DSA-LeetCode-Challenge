package graphs.pathwithminimuneffort1631;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinuimumEffort {

    private class Trio{
        int row;
        int col;
        int effort;

        Trio(int r, int c ,int h)
        {
            this.row = r;
            this.col = c;
            this.effort = h;
        }
    }

    public int minimumEffortPath(int[][] heights) {

        int row = heights.length-1;
        int col = heights[0].length-1;

        int[][] dist = new int[row+1][col+1];
        for(int i =0;i<=row;i++)
            Arrays.fill(dist[i],Integer.MAX_VALUE);

        dist[0][0] = 0;

        PriorityQueue<Trio> queue = new PriorityQueue<>((a,b)->a.effort-b.effort);
        queue.offer(new Trio(0,0,0));

        int[] rowArray = {-1,1,0,0};
        int[] colArray = {0,0,-1,1};

        while(!queue.isEmpty())
        {
            Trio t = queue.poll();

            if(dist[t.row][t.col] <t.effort) continue;
            for(int i =0;i<4;i++)
            {
                int ro = t.row + rowArray[i];
                int co = t.col + colArray[i];
                if(ro>=0 && ro<=row
                && co>=0 && co<=col) {
                    int newEffort = Math.max(t.effort, Math.abs(heights[ro][co] - heights[t.row][t.col]));
                    if(newEffort < dist[ro][co]) {
                        dist[ro][co] = newEffort;
                        queue.offer(new Trio(ro, co, dist[ro][co]));
                    }
                }
            }
        }
         return dist[row][col];
    }
}
