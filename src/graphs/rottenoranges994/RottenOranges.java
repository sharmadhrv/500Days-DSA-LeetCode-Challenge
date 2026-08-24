package graphs.rottenoranges994;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    private class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();

        int countRotten = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2)
                    queue.offer(new Pair(i, j));
                if (grid[i][j] == 1)
                    countRotten++;
            }
        }
        int[] list1 = {-1, 0, 0, 1};
        int[] list2 = {0, -1, 1, 0};

        int minutes = 0;
        while (!queue.isEmpty() && countRotten > 0) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Pair current = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int newRow = current.first + list1[j];
                    int newCol = current.second + list2[j];

                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m &&
                            grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        countRotten--;
                        queue.offer(new Pair(newRow,newCol));
                    }
                }
            }
            minutes++;
        }
        if(countRotten>0) return -1;
        return minutes;
    }
}



