package linkedList.removeduplicate82;

public class RemoveDuplicate {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode answer = dummy;

        ListNode cur = head;
        while(cur!=null)
        {
            if(cur.next !=null && cur.val == cur.next.val)
            {
                int val = cur.val;
                while(cur!=null && cur.val == val)
                {
                    cur = cur.next;
                }
                dummy.next = cur;
            }
            else{
                dummy.next = cur;
                dummy = dummy.next;
                cur = cur.next;
            }

        }
        return answer.next;
    }
}
