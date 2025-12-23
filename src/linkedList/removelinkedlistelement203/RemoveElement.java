package linkedList.removelinkedlistelement203;

public class RemoveElement {

    public ListNode removeElements(ListNode head, int val) {

        ListNode cur = head;
        ListNode dummy = new ListNode(0);
        ListNode answer = dummy;
        while(cur!=null)
        {
            if( cur.val == val) {
                while (cur!=null && cur.val == val) {
                    cur = cur.next;
                }
              dummy.next = cur;
            }
            else {
                dummy.next = cur;
                dummy = dummy.next;
                cur = cur.next;
            }
        }
        return answer.next;

    }
}
