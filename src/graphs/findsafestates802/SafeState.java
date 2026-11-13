package graphs.findsafestates802;

import java.util.ArrayList;
import java.util.List;

public class SafeState {

    public List<Integer> eventualSafeNodes(int[][] graph) {

        boolean[] visited = new boolean[graph.length];
        boolean[] pathVisited = new boolean[graph.length];
        boolean[] check = new boolean[graph.length];

        for(int i =0;i< graph.length;i++)
        {
           if(!visited[i])
               dfs(i,graph,visited,pathVisited,check);
        }

        List<Integer> ans = new ArrayList<>();
        for(int  i=0;i<check.length;i++)
        {
            if(check[i])
                ans.add(i);
        }

        return ans;
    }

    private boolean dfs(int node, int[][] graph, boolean[] visited , boolean[] pathVisited,
    boolean[] check){

        visited[node] = true;
        pathVisited[node] = true;
        check[node] = false;


        for(int neighbour: graph[node])
        {
            if(!visited[neighbour]) {
                if (dfs(neighbour, graph, visited, pathVisited, check))
                    return true;
            }
            else if(pathVisited[neighbour])
                return true;
        }
        check[node]= true;
        pathVisited[node] = false;
        return false;
    }
}
