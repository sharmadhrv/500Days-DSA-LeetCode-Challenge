package graphs.findsafestates802;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        SafeState safeState = new SafeState();

        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};

        List<Integer> ans = safeState.eventualSafeNodes(graph);

        for(int i :ans)
            System.out.print(i+ " , ");
    }
}
