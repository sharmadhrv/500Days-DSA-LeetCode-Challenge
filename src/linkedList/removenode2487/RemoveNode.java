package linkedList.removenode2487;

import java.util.List;
import java.util.Stack;

public class RemoveNode {

    public ListNode removeNodes(ListNode head) {
        ListNode cur = reverse(head);
        int max = cur.val;
        ListNode dummy  = new ListNode(0);
        ListNode answer = dummy;
        while(cur!=null)
        {
            if(cur.val>=max)
            {
                dummy.next = cur;
                dummy = dummy.next;
                max = cur.val;
            }
            cur = cur.next;
        }
        dummy.next = null;
        ListNode answerNode = reverse(answer.next);
        return answerNode;

    }
    private ListNode reverse(ListNode cur)
    {
        if(cur == null || cur.next == null) return cur;
        ListNode prev = null;
        ListNode next = cur.next;
        while(cur!=null)
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
