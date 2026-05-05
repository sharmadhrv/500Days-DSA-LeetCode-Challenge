package greedy.jobsequencingproblem;

import java.util.PriorityQueue;

public class JobSequencing {

    public static class Node{
        int id;
        int deadline;
        int profit;

        Node(int id,int deadline,int profit)
        {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public int[] jobSequencing(Node node)
    {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((a,b)->b.profit-a.profit);

    }
}
