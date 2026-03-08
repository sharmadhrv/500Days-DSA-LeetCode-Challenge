package heap.minropecost;

import java.util.PriorityQueue;

public class MinRopeCost {

    public int minCost(int[] arr) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(arr.length);
        for (int i : arr)
            minHeap.add(i);

        int n1, n2, sum, endSum = 0;
        while (minHeap.size() > 1) {
            n1 = minHeap.poll();
            n2 = minHeap.poll();
            sum = n1 + n2;
            endSum += sum;
            minHeap.add(sum);
        }
        return endSum;
    }
}