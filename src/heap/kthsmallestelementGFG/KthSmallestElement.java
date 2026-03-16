package heap.kthsmallestelementGFG;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public int kthSmallestElement(int[] arr, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(arr.length, Collections.reverseOrder());

        int i ;
        for(i = 0;i<k;i++)
            priorityQueue.add(arr[i]);

        while(i<arr.length)
        {
            if(!priorityQueue.isEmpty() && arr[i] < priorityQueue.peek())
            {
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
            i++;
        }
        return priorityQueue.peek();
    }
}
