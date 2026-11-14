package graphs.courseschedule2nd210;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CourscSchedule {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0; i<numCourses ; i++)
            adj.add(new ArrayList<>());

        for(int[] i : prerequisites)
            adj.get(i[1]).add(i[0]);

        boolean[] visited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numCourses; i++) {
            if (!visited[i])
                if (dfs(i, adj, visited, pathVisited, stack))
                    return new int[0];
        }

        int[] ans = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            ans[i] = stack.pop();
            i++;
        }

        return ans;
    }
    private boolean dfs(int node, List<List<Integer>> adj, boolean[] visited , boolean[] pathVisited
    , Stack<Integer> stack)
    {
        visited[node] = true;
        pathVisited[node] = true;

        for(int neighbour : adj.get(node))
        {
            if(!visited[neighbour]) {
                if (dfs(neighbour, adj, visited, pathVisited, stack))
                    return true;
            }
            else if(pathVisited[neighbour])
                return true;
        }
        stack.push(node);
        pathVisited[node] = false;

        return false;
    }
}
