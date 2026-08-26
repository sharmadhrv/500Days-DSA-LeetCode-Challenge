package graphs.cyclelinundirectedgraph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleDetectionbfs {

    private class Pair{
        int node;
        int source;

        Pair(int node,int source)
        {
            this.node = node;
            this.source = source;
        }
    }

    public boolean isCycle(List<List<Integer>> adj, int start) {
        boolean[] visited = new boolean[adj.size() + 1];

        for (int i = 1; i <= adj.size(); i++) {
            if (!visited[i])
                if (bfs(adj, i, visited))
                    return true;
        }
        return false;
    }

    private boolean bfs(List<List<Integer>> adj, int start, boolean[] visited){

        Queue<Pair > queue = new LinkedList<>();
        visited[start] = true;

        queue.add(new Pair(start,-1));

        while(!queue.isEmpty())
        {
            Pair current = queue.poll();
            for(int neighbour: adj.get(current.node))
            {
                if(neighbour == current.source) continue;
                else if(!visited[neighbour])
                {
                    visited[neighbour] = true;
                    queue.add(new Pair(neighbour,current.node));
                }
                else  return true;
            }
        }
return false;
    }
}
