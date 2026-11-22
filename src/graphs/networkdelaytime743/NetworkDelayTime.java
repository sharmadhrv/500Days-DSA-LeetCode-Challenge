package graphs.networkdelaytime743;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {

    private class Pair{
        int node;
         int weight;

         Pair(int node, int weight)
         {
             this.node = node;
             this.weight = weight;
         }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<Pair>> adj = new ArrayList<>();
        for(int i =0;i<=n;i++)
            adj.add(new ArrayList<>());

        for(int i =0;i<times.length;i++)
        {
            adj.get(times[i][0]).add(new Pair(times[i][1],times[i][2]));
        }

        PriorityQueue<Pair> queue = new PriorityQueue<>((a,b)->a.weight-b.weight);
        queue.offer(new Pair(k,0));

        int[] dist = new int[n+1];
        Arrays.fill(dist,(int)1e9);
        dist[k]= 0;

        while(!queue.isEmpty())
        {
            Pair p = queue.poll();

            if(p.weight> dist[p.node]) continue;

            for(Pair neighbour : adj.get(p.node))
            {
                if(dist[neighbour.node] > neighbour.weight + p.weight)
                {
                    dist[neighbour.node] = neighbour.weight + p.weight;
                    queue.offer(new Pair(neighbour.node, dist[neighbour.node]));
                }
            }
        }

        int totalTime = 0;
        for(int i=1;i<dist.length;i++)
        {
            if(dist[i] == (int)1e9)
                return -1;
            else
                totalTime = Math.max(totalTime,dist[i]);
        }
        return  totalTime;
    }
}
