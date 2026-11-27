package graphs.makingalargeisland827;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargeIsland {

    private class DisjointSet{
        List<Integer> size = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();

        DisjointSet(int n)
        {
            for(int i =0;i<n;i++)
            {
                size.add(1);
                parent.add(i);
            }
        }

        private int ultimateParent(int node)
        {
        if(node == parent.get(node))
            return node;
        int ulp = ultimateParent(parent.get(node));
        parent.set(node,ulp);
        return ulp;
        }

        private void unionBySize(int u , int v)
        {
            int ulpU = ultimateParent(u);
             int ulpV = ultimateParent(v);

            if(ulpU == ulpV) return;

            if(size.get(ulpU) > size.get(ulpV))
            {
                parent.set(ulpV, ulpU);
                size.set(ulpU, size.get(ulpU) + size.get(ulpV));
            }
            else {
                parent.set(ulpU, ulpV);
                size.set(ulpV, size.get(ulpU) + size.get(ulpV));
            }
        }

    }

    public int largestIsland(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int componentCount  = 0;

        for(int i =0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) componentCount++;
            }
        }

        if(componentCount == row*col)
            return componentCount;

        int size = 0;

        DisjointSet ds = new DisjointSet(row*col);

        int[] rowList = {-1,1,0,0};
        int[] colList = {0,0,-1,1};

        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    for(int adj = 0;adj<4;adj++)
                    {
                        int ro = i + rowList[adj];
                        int co = j + colList[adj];
                        if(ro>=0 && ro< row && co>=0 && co<col
                        && grid[ro][co] == 1) {

                            int u = i * col + j;
                            int v = ro * col + co;

                            if (ds.ultimateParent(u) != ds.ultimateParent(v)) {
                                ds.unionBySize(u, v);
                            }
                        }
                    }
                }
            }
        }

        for(int i =0;i<grid.length;i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    int totalSize = 0;
                    Set<Integer> component = new HashSet<>();
                    for (int adj = 0; adj < 4; adj++) {
                        int ro = i + rowList[adj];
                        int co = j + colList[adj];
                        if (ro >= 0 && ro < row && co >= 0 && co < col
                                && grid[ro][co] == 1) {
                            int neighbour = ro * col + co ;
                            int ulp = ds.ultimateParent(neighbour);
                            component.add(ulp);
                        }
                    }
                    for(int s : component)
                        totalSize += ds.size.get(s);
                    size = Math.max(size,totalSize+1);
                }
            }
        }
        return size;
    }
}
