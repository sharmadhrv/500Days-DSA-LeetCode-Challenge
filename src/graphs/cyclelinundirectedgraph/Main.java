package graphs.cyclelinundirectedgraph;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CycleDetectionbfs cycleDetection = new CycleDetectionbfs();
        CycleDetectionDFS cycleDetectionDFS = new CycleDetectionDFS();

        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<8;i++)
        {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(6);
        adj.get(4).add(3);
        adj.get(5).add(2);
        adj.get(5).add(7);
        adj.get(6).add(3);
        //adj.get(6).add(7);
        adj.get(7).add(5);
        //adj.get(7).add(6);

        //System.out.println(cycleDetection.isCycle(adj,1));
        System.out.println(cycleDetectionDFS.cycleDetection(adj));








    }
}
