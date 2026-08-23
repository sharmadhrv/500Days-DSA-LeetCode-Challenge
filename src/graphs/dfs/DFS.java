package graphs.dfs;

import java.util.ArrayList;
import java.util.List;

public class DFS {

    public List<Integer> dfs(int count, List<List<Integer>> adj,int startNode)
    {
        boolean[] visited= new boolean[count+1];

        List<Integer> result = new ArrayList<>();

        helper(startNode,visited,adj,result);
       return result;
    }
    private void helper(int node, boolean[] visited,
                        List<List<Integer>> adj, List<Integer> result)
    {
        visited[node]= true;
        result.add(node);

        for(int neighbour : adj.get(node))
        {
            if(!visited[neighbour])
                helper(neighbour,visited,adj,result);
        }
    }

}
