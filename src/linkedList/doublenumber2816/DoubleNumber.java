package linkedList.doublenumber2816;

public class DoubleNumber {

    public ListNode doubleIt(ListNode head) {
        if(head == null || head.val ==0) return head;
        ListNode cur = reverse(head);
        ListNode dummy = new ListNode(0);
        ListNode answer = dummy;
        int carry  = 0;
        while(cur!=null)
        {
            answer.next = new ListNode((cur.val*2 + carry)%10);
            answer = answer.next;
           carry = (cur.val*2 + carry)/10;
           cur = cur.next;
        }
        if(carry ==1)
            answer.next= new ListNode(1);
        ListNode a = reverse(dummy.next);
        return a;
    }

    private ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head.next;
        while(cur!=null)
        {
            cur.next = prev;
            prev = cur;
            cur = next;
            if(next!=null)
                next = next.next;
        }
        return  prev;
    }


}

