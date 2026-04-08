package greedy.fractionalknapsack;

import java.util.PriorityQueue;

public class FractionalKnapsack {

    public double fractionalKnapsack(int[] value,int[] weight,int capacity)
    {
        PriorityQueue<int[]> dp = new PriorityQueue<>((a,b)->b[0]/b[1]-a[0]/a[1]);
        int[] temp = new int[2];
        for(int i=0;i<value.length;i++)
        {
            dp.add(new int[] {value[i],weight[i]});
        }
        double totalValue = 0;

        for(int i = 0;i<value.length;i++)
        {
            int[] heap = dp.poll();
            if(capacity>=heap[1])
            {
                capacity -= heap[1];
                totalValue += heap[0];
            }
            else{
                totalValue = totalValue + (double) (heap[0]/heap[1] * capacity);
                break;
            }
        }
        return totalValue;
    }
}
