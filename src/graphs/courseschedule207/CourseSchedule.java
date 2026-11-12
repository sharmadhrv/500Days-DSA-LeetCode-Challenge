package graphs.courseschedule207;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>(2));

        for(int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];

        for(int i =0;i<numCourses;i++)
        {
            if(!visited[i])
                if(dfs(adj,i,visited,pathVisited))
                    return false;
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> adj, int node, boolean[] visited, boolean[] pathVisited)
    {
        visited[node] = true;
        pathVisited[node] = true;

        for(int neighbour : adj.get(node))
        {
            if(!visited[neighbour]) {
                if (dfs(adj, neighbour, visited, pathVisited))
                    return true;
            }

            else if (pathVisited[neighbour] ) return true;
        }
        pathVisited[node] = false;
        return false;
    }

}
