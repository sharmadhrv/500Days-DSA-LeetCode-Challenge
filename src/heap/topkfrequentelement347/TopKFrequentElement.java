package heap.topkfrequentelement347;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElement {

    private  class Node {
        int value;
        int freq;

        Node(int value,int freq)
        {
            this.value = value;
            this.freq = freq;
        }
    }


    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> frequency = new HashMap<>();

        for(int i : nums)
        {
            if(!frequency.containsKey(i))
                frequency.put(i,1);
            else{
                frequency.compute(i, (key, freq) -> freq + 1);
            }
        }
        PriorityQueue<Node> maxHeap = new PriorityQueue<>((a,b)->a.freq-b.freq);

        frequency.forEach((key, value) -> maxHeap.add(new Node(key,value)));

        int [] answer = new int[k];
        for(int i  = 0;i<k;i++)
        {
            Node node = maxHeap.poll();
            answer[i] = node.value;
        }
        return answer;
    }

}
