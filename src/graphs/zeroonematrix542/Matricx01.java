package graphs.zeroonematrix542;

import java.util.LinkedList;
import java.util.Queue;

public class Matricx01 {

    private class Node{
        int row;
        int col;
        int step;

        Node(int row, int col, int step) {
            this.row = row;
            this.col = col;
            this.step = step;
        }
    }

    public int[][] updateMatrix(int[][] mat) {

        int[][] visited = new int[mat.length][mat[0].length];
        int[][] answer = new int[mat.length][mat[0].length];
        Queue<Node> queue = new LinkedList<>();

        for(int i =0;i< mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j] == 0)
                {
                    visited[i][j] = 1;
                    queue.add(new Node(i,j,0));
                }
                else visited[i][j] = 0;
            }
        }

        int[] list1 = {-1,1,0,0};
        int[] list2 = {0,0,-1,1};
        while(!queue.isEmpty())
        {
            Node current = queue.poll();

            answer[current.row][current.col] = current.step;
            for(int i =0;i<list1.length;i++)
            {
                int nrow = current.row + list1[i];
                int ncol =current.col + list2[i];

                if(nrow>=0 && nrow<mat.length && ncol >=0 && ncol < mat[0].length
                && visited[nrow][ncol] ==0)
                {
                    visited[nrow][ncol] = 1;
                    queue.add(new Node(nrow, ncol, current.step +1));
                }

            }
        }
        return answer;
    }
}
