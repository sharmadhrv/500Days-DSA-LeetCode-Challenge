package heap.findkpairwithsmallestsum373;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.PriorityQueue;

public class SmallestSumKpair {

    public void kSmallestPairs(int[] nums1, int[] nums2, int k) {

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->(nums1[a[0]]+nums2[b[0]])-(nums1[a[1]]-nums2[b[1]]));

    }
}
