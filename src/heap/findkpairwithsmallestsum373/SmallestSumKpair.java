package heap.findkpairwithsmallestsum373;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;

public class SmallestSumKpair {

    private static class Node {
        int n1;
        int n2;
        Node(int n1,int n2)
        {
            this.n1 = n1;
            this.n2 = n2;

        }
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<Node> maxHeap = new PriorityQueue<>((a,b)->(b.n1+b.n2)-(a.n1+a.n2));

        for(int i:nums1)
        {
            for(int j : nums2)
            {
                    maxHeap.add(new Node(i,j));
            }
            if(maxHeap.size()>k);
            maxHeap.poll();
        }
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0;i<k;i++)
        {
            List<Integer> pair = new ArrayList<>(2);
            Node node = maxHeap.poll();
            pair.add(node.n1);
            pair.add(node.n2);

            answer.add(pair);
        }
        return answer;
    }
}
