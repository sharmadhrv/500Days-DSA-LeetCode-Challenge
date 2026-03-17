package heap.kthlargestelement215;

import java.util.PriorityQueue;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int i =0;
        for(i =0;i<k;i++)
        {
            minHeap.add(nums[i]);
        }
        while(i<nums.length)
        {
            if(!minHeap.isEmpty() && nums[i]>minHeap.peek())
            {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
            i++;
        }
        return minHeap.peek();
    }
}
