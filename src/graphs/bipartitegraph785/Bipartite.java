package graphs.bipartitegraph785;

import java.util.Arrays;

public class Bipartite {

    public boolean isBipartite(int[][] graph) {

        int[] color = new int[graph.length];

        Arrays.fill(color,-1);
        for(int i = 0;i<graph.length;i++)
        {
            if(color[i] == -1)
                if(!dfs(graph,i,color,0))
                    return false;
        }
        return true;
    }

    private boolean dfs(int[][] graph, int node, int[] color, int currentColor)
    {
        color[node] = currentColor;

        for(int neighbour: graph[node])
        {
            if(color[neighbour] == -1) {
                if (!dfs(graph, neighbour, color, 1 - currentColor))
                    return false;
            }
            else if(color[neighbour] == currentColor)
                return false;
        }
        return  true;
    }
    }
