package graphs.dijkstraalgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {


    private class Pair{
        int node;
        int weight;

        Pair(int n ,int w)
        {
            this.node = n ;
            this.weight = w;
        }
    }
    public int[] dijkstra(int[][] edges,int n,int src)
    {
        List<List<Pair>> adj= new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i =0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
        }

        PriorityQueue<Pair> queue = new PriorityQueue<>((a,b)->a.weight-b.weight);
        queue.offer(new Pair(src,0));

        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        List<List<Integer>> list = new ArrayList<>();
        for(int i =0;i<n;i++)
            list.add(new ArrayList<>());
        while(!queue.isEmpty())
        {
            int d = queue.peek().weight;
            int node = queue.peek().node;
            queue.poll();

            if(d>dist[node]) continue;
            for(Pair p : adj.get(node))
            {

                int edge = p.node;
                int edgeWeight = p.weight;

                if(d + edgeWeight <dist[edge]) {
                    dist[edge] = d + edgeWeight;
                    queue.add(new Pair(edge, dist[edge]));
                }
            }
        }
    return dist;
    }


}
