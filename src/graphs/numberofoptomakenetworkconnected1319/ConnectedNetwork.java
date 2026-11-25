package graphs.numberofoptomakenetworkconnected1319;

import java.util.ArrayList;
import java.util.List;

public class ConnectedNetwork {

    private class DisjointSet{
        List<Integer> size = new ArrayList<>();
        List<Integer> parent = new ArrayList<>();

        DisjointSet(int n)
        {
            for(int i=0;i<n;i++)
            {
                parent.add(i);
                size.add(1);
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

        public void unionBySize(int u, int v)
        {
            int ulpU = ultimateParent(u);
            int ulpV = ultimateParent(v);

            if(ulpV==ulpU) return ;

            if(size.get(ulpV)>size.get(ulpU))
            {
                parent.set(ulpU,ulpV);
                size.set(ulpV, size.get(ulpV) + size.get(ulpU));
            }
            else{
                parent.set(ulpV,ulpU);
                size.set(ulpU, size.get(ulpV) + size.get(ulpU));
            }
            return ;
        }
    }

    public int makeConnected(int n, int[][] connections) {

        if( connections.length < n-1) return -1;

        DisjointSet ds = new DisjointSet(n);

        int componentCount=n;

        for(int[] conn : connections)
        {
            int u = conn[0];
            int v = conn[1];

            int ulpU = ds.ultimateParent(u);
            int ulpV = ds.ultimateParent(v);

            if(ulpU!=ulpV)
            {
                ds.unionBySize(u,v);
                componentCount -= 1;
            }
        }
        return componentCount -1;

    }
}
