package graphs.swiminrisingwater778;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SwimInWater {

    private class Tuple {
        int row;
        int col;
        int level;

        Tuple(int r, int c, int l) {
            this.row = r;
            this.col = c;
            this.level = l;
        }
    }

    public int swimInWater(int[][] grid) {

        PriorityQueue<Tuple> queue = new PriorityQueue<>((a, b) -> a.level - b.level);

        int[][] dist = new int[grid.length][grid.length];
        for (int i = 0; i < grid.length; i++)
            Arrays.fill(dist[i], (int) 1e9);
        dist[0][0] = grid[0][0];

        queue.offer(new Tuple(0, 0, dist[0][0]));

        int[] rowList = {-1, 1, 0, 0};
        int[] colList = {0, 0, -1, 1};
        while (!queue.isEmpty()) {
            Tuple t = queue.poll();
            if (dist[t.row][t.col] < t.level) continue;

            if (t.row == grid.length - 1 && t.col == grid.length - 1) return t.level;

            for (int i = 0; i < 4; i++) {
                int ro = t.row + rowList[i];
                int co = t.col + colList[i];


                if (ro >= 0 && ro < grid.length && co >= 0 && co < grid.length) {
                    int newEffort = Math.max(t.level, grid[ro][co]);
                    if (newEffort < dist[ro][co]) {
                        dist[ro][co] = newEffort;
                        queue.offer(new Tuple(ro, co, newEffort));
                    }
                }
            }
        }

        return -1;

    }
}
