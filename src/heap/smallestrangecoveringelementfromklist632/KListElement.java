package heap.smallestrangecoveringelementfromklist632;

import java.util.List;
import java.util.PriorityQueue;

public class KListElement {

    public static class Node{
        int value;
        int listIndex;
        int elementIndex;

        Node(int val,int listIndex, int elementIndex)
        {
            this.value = val;
            this.listIndex = listIndex;
            this.elementIndex = elementIndex;
        }

    }

    public int[] smallestRange(List<List<Integer>> nums) {

       PriorityQueue<Node> minHeap = new PriorityQueue<>((a,b)->a.value-b.value);
       int min = 0;
       int max = Integer.MIN_VALUE;
       int rangeStart = 0;
       int rangeEnd = Integer.MAX_VALUE;

       for(int i = 0;i<nums.size();i++)
        {
               int value = nums.get(i).getFirst();
               max = Math.max(max,value);
               minHeap.add(new Node(value, i,0));
        }

       while(minHeap.size() == nums.size())
       {
           Node node = minHeap.poll();
           min = node.value;

           if((max-min) < (rangeEnd-rangeStart))
           {
               rangeEnd= max;
               rangeStart = min;
           }

           if(node.elementIndex+1< nums.get(node.listIndex).size())
           {
               int nextValue = nums.get(node.listIndex).get(node.elementIndex+1);
               minHeap.add(new Node(nextValue, node.listIndex, node.elementIndex+1));
               max = Math.max(max,nextValue);
           }
       }
            return new int[] {rangeStart,rangeEnd};
    }
}
