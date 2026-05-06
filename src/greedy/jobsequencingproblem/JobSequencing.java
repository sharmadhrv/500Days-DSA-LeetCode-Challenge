package greedy.jobsequencingproblem;

import java.util.Arrays;
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
    public int[] jobSequencing(Node[] jobs)
    {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((a,b)->b.profit-a.profit);

        for(Node job : jobs)
            priorityQueue.add(job);

        int count = 0, profit = 0, deadline = 0;
       for(Node job : priorityQueue)
        {
            deadline = Math.max(deadline,job.deadline);
        }
       int[] hash = new int[deadline+1];

        Arrays.fill(hash,-1);

      while(!priorityQueue.isEmpty())
       {
           Node item = priorityQueue.poll();
           for(int j = item.deadline;j>=0;j--)
           {
               if(hash[j]==-1)
               {
                  count++;
                  profit+=item.profit;
                  hash[j] = item.id;
                  break;
               }
           }
       }
      return new int[] {count,profit};
    }
}
