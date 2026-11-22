package graphs.bellmanfordalgo;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFord {

    public ArrayList<Integer> bellmanFord(int V, int[][] edges, int src) {
        int[] dist = new int[V];
        Arrays.fill(dist,(int)1e8);
        dist[src] = 0;

        for(int i =0;i<V;i++)
        {
           for(int[] edge : edges)
           {
               int u = edge[0];
               int v = edge[1];
               int wt = edge[2];
               if(dist[u] != (int) 1e8 && dist[u] + wt < dist[v])
               {
                   dist[v] = dist[u] + wt;
               }
           }
        }
        for(int[] edge : edges)
        {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];
                if(dist[u] != (int) 1e8 && dist[u] + wt < dist[v])
                {
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(-1);
                    return result;
                }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : dist)
        {
            result.add(i);
        }
        return result;
    }
}
