package heap.kthlargestelementinstream703;

import java.util.PriorityQueue;

public class KthLargest {
   PriorityQueue<Integer> minHeap ;
    int k ;
    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>();
        this.k=k;
        for(int i : nums)
            add(i);
    }
    public int add(int val) {
      minHeap.add(val);
      if(minHeap.size()>k)
          minHeap.poll();
      return minHeap.peek();
    }
}
