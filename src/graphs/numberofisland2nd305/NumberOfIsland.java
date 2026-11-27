package graphs.numberofisland2nd305;

import java.util.ArrayList;
import java.util.List;

public class NumberOfIsland {

    private class DisjointSet {
        List<Integer> rank = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();

        DisjointSet(int n) {
            for (int i = 0; i < n; i++) {
                parent.add(i);
                rank.add(0);
            }
        }

        private int ultimateParent(int node) {
            if (node == parent.get(node))
                return node;

            int ulp = ultimateParent(parent.get(node));
            parent.set(node, ulp);
            return ulp;
        }

        private void unionByRank(int u, int v) {
            int ulpU = ultimateParent(u);
            int ulpV = ultimateParent(v);

            if (ulpU == ulpV) return;

            if (rank.get(ulpU) > rank.get(ulpV)) {
                parent.set(ulpV, ulpU);
            } else if (rank.get(ulpU) < rank.get(ulpV)) {
                parent.set(ulpU, ulpV);
            } else {
                parent.set(ulpV, ulpU);
                int rankU = rank.get(ulpU);
                rank.set(ulpU, rankU + 1);
            }
        }
    }

        public List<Integer> numIslands2(int m, int n, int[][] positions) {

            List<Integer> ans = new ArrayList<>();
            DisjointSet ds = new DisjointSet(m*n);

            boolean[][] visited = new boolean[m][n];
            int[] rowList = {-1,1,0,0};
            int[] colList = {0,0,-1,1};
            int count = 0;

            for(int i = 0;i<positions.length;i++)
            {
                int row = positions[i][0];
                int col = positions[i][1];

                if(visited[row][col])
                {
                    ans.add(count);
                    continue;
                }

                visited[row][col] = true;
                count +=1;

                for(int j = 0;j<4;j++)
                {
                    int ro = row + rowList[j];
                    int co = col + colList[j];

                    if(ro>=0 && ro < m && co>=0 && co<n)
                    {
                        if(visited[ro][co])
                        {
                            int u = n*row + col ;
                            int v = n * ro + co;
                            if(ds.ultimateParent(u) != ds.ultimateParent(v))
                            {
                                ds.unionByRank(u,v);
                                count--;
                            }
                        }
                    }
                }
                ans.add(count);
            }
            return ans;
        }

}
