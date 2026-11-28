package graphs.moststoneremoval947;

import java.util.ArrayList;
import java.util.List;

public class MostStonrremoval {

    private class DisjointSet{
        List<Integer> rank ;
        List<Integer> parent;

        DisjointSet(int n)
        {
            rank = new ArrayList<>(n);
            parent = new ArrayList<>(n);
            for(int i =0;i<n;i++)
            {
                rank.add(1);
                parent.add(i);
            }
        }

        public int ultimateParent(int node)
        {
            if(node == parent.get(node))
                return node;

            int ulp = ultimateParent(parent.get(node));
            parent.set(node,ulp);
            return ulp;
        }

        public void unionByRank(int u, int v)
        {
            int ulpU = ultimateParent(u);
            int ulpV = ultimateParent(v);

            if(rank.get(ulpU) > rank.get(ulpV))
                parent.set(ulpV,ulpU);

            else if(rank.get(ulpV) > rank.get(ulpU))
                parent.set(ulpU, ulpV);

            else
            {
                parent.set(ulpV,ulpU);
                int rankU = rank.get(ulpU);
                rank.set(ulpU, rankU+1);
            }
        }

    }

    public int removeStones(int[][] stones) {

        DisjointSet ds = new DisjointSet(stones.length);

        int components = stones.length;
        for(int i =0;i<stones.length;i++)
        {
            for(int index = i+1;index<stones.length;index++)
            {
                if(stones[i][0]== stones[index][0] || stones[i][1] == stones[index][1])
                {
                    int u = i;
                    int v = index;
                    int ulpU = ds.ultimateParent(u);
                    int ulpV = ds.ultimateParent(v);
                    if(ulpU!=ulpV) {
                        ds.unionByRank(u, v);
                        components--;
                    }
                }
            }
        }
    return  stones.length - components;
    }
}
