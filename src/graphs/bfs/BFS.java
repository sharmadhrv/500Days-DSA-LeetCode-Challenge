package graphs.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public List<Integer> BfS(int count,int startNode, List<List<Integer>> adj)
    {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[count+1];
        List<Integer> result = new ArrayList<>();
        queue.offer(startNode);
        visited[startNode] = true;
        result.add(startNode);

        while(!queue.isEmpty())
        {
            List<Integer> neighbours = adj.get(queue.poll());
            for(int i: neighbours)
            {
                if(!visited[i])
                {
                    visited[i] = true;
                    queue.offer(i);
                    result.add(i);
                }
            }
        }
        return result;
    }
}
