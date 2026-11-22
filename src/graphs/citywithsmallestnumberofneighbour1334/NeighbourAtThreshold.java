package graphs.citywithsmallestnumberofneighbour1334;

public class NeighbourAtThreshold {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int[][] cost = new int[n][n];
        for(int i =0;i<edges.length;i++)
        {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            cost[u][v] = wt;
            cost[v][u] = wt;
        }
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                    if(cost[i][j] == 0)
                        cost[i][j] = (int) 1e9;
            }
        }

        for(int via=0;via<n;via++)
        {
            for(int i =0;i<n;i++)
            {
                for(int j =0;j<n;j++)
                {
                    if(cost[i][via] != (int)1e9 && cost[via][j] != (int) 1e9)
                        cost[i][j] = Math.min(cost[i][j],cost[i][via]+cost[via][j]);
                }
            }
        }

        int[] cityCount = new int[n];

        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(i!=j)
                {
                    if(cost[i][j] <= distanceThreshold)
                        cityCount[i]++;
                }
            }
        }

        int index = -1;
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<n;i++)
        {
           if(cityCount[i]<=smallest)
           {
               index= i;
               smallest = cityCount[i];
           }
        }
        return index;
    }
}
