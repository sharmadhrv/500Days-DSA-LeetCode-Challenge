package linkedList.linkedlistcycle2;

public class LLCycle2 {

    public ListNode detectCycle(ListNode head)
    {
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                isCycle = true;
                break;
            }
        }
        if(isCycle) {
            ListNode temp = head;
            while (temp != slow) {
                temp = temp.next;
                slow = slow.next;
            }
            return slow;
        }
        return null;
    }

}
