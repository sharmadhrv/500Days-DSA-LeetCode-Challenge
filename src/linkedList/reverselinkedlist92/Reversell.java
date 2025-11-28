package linkedList.reverselinkedlist92;

import java.util.List;

public class Reversell {

    public ListNode reverseBetween(ListNode head, int left,int right){

        if(head == null || head.next == null) return head;

        ListNode  cur = head;
        ListNode before = null;

       for(int i=0;cur!=null && i<left-1;i++)
        {
            before = cur;
            cur = cur.next;
        }
        ListNode start = cur;
        ListNode last = before;
        ListNode after = start.next;
        for(int i =0;cur!=null && i<right-left+1;i++) {
            cur.next = before;
            before = cur;
            cur = after;
            if (after != null)
                after = after.next;
        }
        if(last!=null)
            last.next = before;
        else {
            head = before;
        }
        start.next = cur;
        return head;
    }
}
