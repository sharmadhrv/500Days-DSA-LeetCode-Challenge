package graphs.aliendictionery269;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AlienDictionery {

        public String alienOrder(String[] words) {

            int[] visited = new int[256];
            int[] pathVisited = new int[256];

            boolean[] exists = new boolean[256];

            for(String word :words)
            {
                for(char c : word.toCharArray())
                {
                    exists[c] = true;
                }
            }


            List<List<Integer>> adj = new ArrayList<>();

            for(int i =0;i<256;i++)
                    adj.add(new ArrayList<>());

            for(int i =0;i< words.length-1;i++)
            {
                int j =0;
                int len = Math.min(words[i].length(), words[i+1].length());

                for(j =0;j<len;j++)
                {
                    if(words[i].charAt(j)!=words[i+1].charAt(j)){
                        adj.get(words[i].charAt(j)).add((int) words[i+1].charAt(j));
                        break;
                    }
                }
                if(j==len && words[i].length()>words[i+1].length())
                    return "";
            }

            Stack<Character> stack = new Stack<>();
            for(int i =0;i<256;i++)
            {
                if(exists[i] && visited[i]==0)
                    if(dfs(i,adj,visited,pathVisited,stack))
                        return "";
            }

            StringBuilder sb = new StringBuilder();

           while(!stack.isEmpty())
           {
               sb.append((char) stack.pop());
           }
           return sb.toString();
    }

    private boolean dfs(int node, List<List<Integer>> adj , int[] visited, int[] pathVisited, Stack<Character> stack) {
        visited[node] = 1;
        pathVisited[node] = 1;

        for (int neighbour : adj.get(node)) {
            if (visited[neighbour] == 0) {
                if (dfs(neighbour, adj, visited, pathVisited, stack))
                    return true;
            } else if (pathVisited[neighbour] == 1)
                return true;
        }

        stack.push((char)node);
        pathVisited[node] = 0;
        return  false;
    }
}
