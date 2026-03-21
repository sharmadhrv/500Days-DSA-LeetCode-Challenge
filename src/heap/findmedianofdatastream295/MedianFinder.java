package heap.findmedianofdatastream295;

import java.util.PriorityQueue;

public class MedianFinder {

    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a,b)->b-a);

    }

    public void addNum(int num) {

        maxHeap.add(num);
        minHeap.add(maxHeap.poll());

        if(minHeap.size()>maxHeap.size())
            maxHeap.add(minHeap.poll());
    }

    public double findMedian() {
      if(maxHeap.size()==minHeap.size())
          return (maxHeap.peek()+minHeap.peek())/2.0;
      return maxHeap.peek();
    }

}
