package graphs.dijkstraforshortestpath;

import graphs.courseschedule2nd210.CourscSchedule;

import java.lang.reflect.Array;
import java.util.*;

public class Dijkstra {

    private class Pair{
        int node;
        int weight;

        Pair(int n, int w)
        {
            this.node = n;
            this.weight = w;
        }
    }

    public int[] shortestPath(int n, int m,int[][] edges)
    {
        List<List<Pair>> adj  = new ArrayList<>();
        for(int i =0;i<=n;i++)
            adj.add(new ArrayList<>());

        for(int i =0;i<m;i++)
        {
            adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
            adj.get(edges[i][1]).add(new Pair(edges[i][0],edges[i][2]));
        }

        PriorityQueue<Pair> queue = new PriorityQueue<>((a,b)->a.weight-b.weight);
        queue.add(new Pair(1,0));

        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[1] = 0;

        int[] parent = new int[n+1];
        for(int i = 1; i <= n; i++)
            parent[i] = i;

        while(!queue.isEmpty())
        {
            Pair p = queue.poll();
            int node = p.node;
            int d = p.weight;

            for(Pair neighbour : adj.get(node))
            {
                int edge = neighbour.node;
                int weight = neighbour.weight;
                if(dist[edge]>d + weight)
                {
                    dist[edge ] = d + weight;
                    queue.offer(new Pair(edge,dist[edge]));
                    parent[edge] = node;
                }
            }
        }
        if(dist[n] == Integer.MAX_VALUE)
            return new int[] {-1};

        List<Integer>temp = new ArrayList<>();
        while(parent[n]!=n)
        {
            temp.add(n);
            n = parent[n];
        }
        temp.add(1);

        Collections.reverse(temp);

        int[] ans = new int[temp.size()];

        for(int i =0;i<temp.size();i++)
        {
            ans[i] = temp.get(i);
        }
        return ans;
    }
}
