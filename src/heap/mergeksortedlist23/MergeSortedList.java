package heap.mergeksortedlist23;


import java.util.List;
import java.util.PriorityQueue;

public class MergeSortedList {

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)->a.val-b.val);
        if(lists.length==0) return null;
        for(ListNode node : lists)
            if(node!=null)
                minHeap.add(node);

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy ;

        while(!minHeap.isEmpty())
        {
            ListNode smallest = minHeap.poll();
            cur.next = smallest;
            cur = cur.next;

            if(smallest.next!=null)
                minHeap.add(smallest.next);
        }
        return dummy.next;
    }
}
