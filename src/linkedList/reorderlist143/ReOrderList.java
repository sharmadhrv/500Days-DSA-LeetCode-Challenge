package linkedList.reorderlist143;

public class ReOrderList {

    public ListNode reorderList(ListNode head) {

        if (head == null || head.next == null) return head;
        ListNode forward = head;
        ListNode mid = getMid(head);
        ListNode backward = mid.next;
        mid.next = null;
        backward = reverse(backward);

        ListNode temp = head;
        while(forward!=null && backward !=null) {

            ListNode fnext = forward.next;
            ListNode bnext = backward.next;
            forward.next = backward;
            backward.next = fnext;

            temp = fnext;
            forward = fnext;
            backward = bnext;
        }
        return head;
    }

    private ListNode getMid(ListNode head)
    {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
         ListNode fast =  head.next;
         while(fast!=null && fast.next!=null)
         {
             slow = slow.next;
             fast = fast.next.next;
         }
         return slow;
    }


    private ListNode reverse(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = cur.next;
        while(cur!= null)
        {
            cur.next = prev;
            prev = cur;
            cur = next;
            if(next!=null)
                next = next.next;
        }
        return prev;
    }
}
