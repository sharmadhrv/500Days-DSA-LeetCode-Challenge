package graphs.cyclelinundirectedgraph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class CycleDetectionDFS {

    public boolean cycleDetection(List<List<Integer>> adj)
    {
        boolean[] visited = new boolean[adj.size()+1];

        for(int i =1;i<adj.size();i++)
        {
            if(!visited[i]) {
                if (dfs(adj, i,-1, visited))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(List<List<Integer>> adj , int start,int source, boolean[] visited)
    {
        visited[start] = true;
        for(int neighbour : adj.get(start))
        {
            if(source==  neighbour)
                continue;

            else if(!visited[neighbour]) {
                if(dfs(adj,neighbour,start,visited))
                    return true;
            }

            else return true;
        }
        return false;
    }
}
