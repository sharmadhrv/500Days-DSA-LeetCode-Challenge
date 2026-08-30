package graphs.cycleindirectedgraph;

import java.util.List;

public class CycleDetectionDFS {

    public boolean isCycle(List<List<Integer>> adj)
    {
        boolean[] visited = new boolean[adj.size()];
        boolean[] pathVisited = new boolean[adj.size()];
        for(int i =0;i<adj.size();i++)
        {
            if(!visited[i])
                if(dfs(adj,i,visited,pathVisited))
                    return true;
        }
        return false;
    }
    private boolean dfs(List<List<Integer>> adj, int node, boolean[]visited, boolean[] pathVisited)
    {
        visited[node] = true;
        pathVisited[node] = true;

        for(int neighbour : adj.get(node))
        {
            if(!visited[neighbour])
                if(dfs(adj,neighbour,visited,pathVisited))
                    return true;

            else if(pathVisited[neighbour]) return true;
        }
        pathVisited[node] = false;
        return false;
    }
}
