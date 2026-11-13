package graphs.topologicalsort;

import java.util.Stack;

public class TopologicalSort {

    public int[] topologicalSort(int[][] adj)
    {
       boolean[] visited = new boolean[adj.length];
        Stack<Integer> stack = new Stack<>();

        for(int i =0;i<adj.length;i++)
        {
            if(!visited[i])
            {
                dfs(adj,i,visited,stack);
            }
        }
        int[] ans = new int[visited.length];
       for(int i=0;i<adj.length;i++)
       {
           ans[i] = stack.pop();
       }
       return ans;
    }

    private void dfs(int[][] adj, int node, boolean[] visited, Stack<Integer> stack)
    {
        visited[node] = true;
        for(int neighbour: adj[node])
        {
            if(!visited[neighbour])
                dfs(adj,neighbour,visited,stack);
        }
        stack.push(node);
    }
}
