package heap.kthlargestsumsubarray;

import java.util.PriorityQueue;

public class LargestSumSubarray {

    public int kthLargestSumSubArray(int[] nums,int k )
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for(int i = 0;i<nums.length;i++)
        {
            int sum = 0;
            for(int j = i;j<nums.length;j++)
            {
                sum += nums[j];

                if(k > minHeap.size())
                    minHeap.add(sum);
                else if(sum> minHeap.peek())
                {
                    minHeap.poll();
                    minHeap.add(sum);
                }
            }
        }
return minHeap.peek();
    }
}