    package graphs.shortestpathinundirectedgraph;

    import java.util.*;

    public class ShortestPath {

       public ArrayList<Integer> shortestPath(int[][] edge, int n, int m ,int src)
       {
           List<List<Integer>>adj = new ArrayList<>();

           for(int i =0;i<n;i++)
           {
               adj.add(new ArrayList<>());
           }

           for(int i =0;i<m;i++)
           {
               adj.get(edge[i][0]).add(edge[i][1]);
               adj.get(edge[i][1]).add(edge[i][0]);
           }

           boolean[] visited = new boolean[n];

           Queue<Integer> queue = new LinkedList<>();
           queue.offer(src);

           int[] dist = new int[n];
           Arrays.fill(dist, Integer.MAX_VALUE);
           dist[src] = 0;

           while(!queue.isEmpty())
           {
               int node = queue.poll();
               {
                   for(int neighbour : adj.get(node))
                   {
                       if(dist[neighbour]==Integer.MAX_VALUE) {
                           dist[neighbour] = dist[node] + 1;
                           queue.offer(neighbour);
                       }
                   }
               }
           }

           ArrayList<Integer> result = new ArrayList<>();
           for(int i : dist)
           {
               if(i != Integer.MAX_VALUE)
                   result.add(i);
               else result.add(-1);
           }
           return result;
       }
    }
