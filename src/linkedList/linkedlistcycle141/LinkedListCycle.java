package linkedList.linkedlistcycle141;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head)
    {
        if(head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    //length of cycle;

    public int cycleLength(ListNode head)
    {
        if(head == null || head.next == null) return 0;
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;

        while(fast!= null && fast.next!= null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                isCycle = true;
                break;
            }
        }
        if(isCycle)
        {
            int length =1;
            ListNode node  = slow.next;
            while(node  != slow)
            {
                length++;
                node = node.next;
            }
            return length;
        }
        return 0;
    }
}
