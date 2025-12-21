package linkedList.swapnodeinpairs24;

import arrays.plusone66.PlusOne;

import java.util.List;

public class SwapNode {

    public ListNode swapPairs(ListNode head) {

        if(head == null|| head.next == null) return head;
        ListNode newHead = head.next;
        ListNode cur = head;
        ListNode prev = null;
        ListNode next;
        while(cur.next!=null)
        {
            next  = cur.next;
            cur.next = next.next;
            next.next = cur;
            if(prev!=null)
                prev.next=next;
            prev=cur;
            if(cur.next!=null)
                cur = cur.next;

        }
        return newHead;
    }
}
