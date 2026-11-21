package graphs.cheapestflightwithkstop787;

import java.util.*;

public class CheapestFlight {

    private class Tuple {
        int node;
        int price;
        int stops;

        Tuple(int node, int price, int stops)
        {
            this.node = node;
            this.price = price;
            this.stops = stops;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        List<List<Tuple>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());

        for(int i =0;i<flights.length;i++)
        {
            adj.get(flights[i][0]).add(new Tuple(flights[i][1],flights[i][2],0));
        }

      Queue<Tuple> queue  = new LinkedList<>();

        queue.offer(new Tuple(src,0,0));

       int[] cumPrice = new int[n];
       Arrays.fill(cumPrice, Integer.MAX_VALUE);
       cumPrice[src] = 0;

       while(!queue.isEmpty())
       {
           Tuple p = queue.poll();
           if(p.stops>k+1) continue;

           for(Tuple neighbour : adj.get(p.node))
           {
               if(cumPrice[neighbour.node] > p.price + neighbour.price && p.stops<=k)
               {
                   cumPrice[neighbour.node] = p.price + neighbour.price;
                   queue.offer(new Tuple(neighbour.node,cumPrice[neighbour.node],p.stops+1 ));
               }
           }
       }
       if(cumPrice[dst] == Integer.MAX_VALUE) return -1;
       return cumPrice[dst];
    }
}
