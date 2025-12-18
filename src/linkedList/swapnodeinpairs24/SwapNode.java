package linkedList.swapnodeinpairs24;

import java.util.List;

public class SwapNode {

    public ListNode swapPairs(ListNode head) {

        if(head == null|| head.next == null) return head;
        ListNode cur = head;
//       cur.next = next.next;
//       next.next = cur;
       ListNode newHead = head.next;
       ListNode prev = null;
       while(cur!= null && cur.next!=null)
       {
           ListNode next =cur.next;
           cur.next = next.next;
           next.next = cur;
           if(prev!= null)
               prev.next = next;
           prev = cur;
           cur = cur.next;

       }
        return  newHead;
    }
}
