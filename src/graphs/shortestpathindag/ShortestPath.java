package graphs.shortestpathindag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ShortestPath {

    private class Pair{

        public  int node;
        public int weight;

        Pair(int node, int weight)
        {
            this.node = node;
            this.weight = weight;
        }
    }

    public ArrayList<Integer> shortestPath(int v, int[][] edges)
    {
        List<List<Pair>> adj = new ArrayList<>();

        for(int i =0;i<v;i++)
            adj.add(new ArrayList<>());

        for(int i =0;i< edges.length;i++)
        {
           adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
        }

        boolean[] visited = new boolean[v];

        Stack<Integer> stack = new Stack<>();

        for(int i =0;i<v;i++)
        {
            if(!visited[i])
            {
                dfs(i,adj,visited,stack);
            }
        }

        int[] distance = new int[v];

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;
        while(!stack.isEmpty()) {
            int node = stack.pop();
            if (distance[node] != Integer.MAX_VALUE) {
                for (Pair p : adj.get(node)) {
                    distance[p.node] = Math.min(distance[p.node], p.weight + distance[node]);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i : distance) {
            if (i != Integer.MAX_VALUE)
                ans.add(i);
            else ans.add(-1);
        }
        return ans;
    }

    private boolean dfs(int node, List<List<Pair>> adj, boolean[] visited,
     Stack<Integer> stack){

        visited[node] = true;

        for(Pair neighbour : adj.get(node)) {
            if (!visited[neighbour.node]){
                if (dfs(neighbour.node, adj, visited, stack))
                    return true;
            }
        }
        stack.push(node);
        return false;
    }
}
