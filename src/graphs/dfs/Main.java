package graphs.dfs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DFS dfs = new DFS();

        List<List<Integer>> adj = new ArrayList<>();
        int count = 8 ;
        for(int  i = 0;i<=count;i++)
            adj.add(new ArrayList<>());

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(6);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(7);
        adj.get(4).add(3);
        adj.get(4).add(8);
        adj.get(5).add(2);
        adj.get(6).add(2);
        adj.get(7).add(3);
        adj.get(7).add(8);
        adj.get(8).add(4);
        adj.get(8).add(7);

        System.out.println(dfs.dfs(count,adj,4));

    }
}
