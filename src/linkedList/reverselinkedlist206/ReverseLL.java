package linkedList.reverselinkedlist206;

public class ReverseLL {

    public ListNode reverseList(ListNode head)
    {
        if(head == null || head.next == null) return head;
        ListNode before = null;
        ListNode cur = head;
        ListNode after = head.next;
        while(cur!= null){
            cur.next = before;
            before = cur;
            cur = after;
            if(after!=null)
                after = after.next;
        }
        return before;
    }


}
