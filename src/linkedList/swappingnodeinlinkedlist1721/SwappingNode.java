package linkedList.swappingnodeinlinkedlist1721;

import java.sql.SQLOutput;

public class SwappingNode {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode first = head;
        for(int i =1;i<k;i++)
            first = first.next;

        ListNode second = head;
        ListNode temp = first;
        while(temp.next!=null)
        {
            second = second.next;
            temp = temp.next;
        }
        int swap = first.val;
        first.val = second.val;
        second.val = swap;

    return head;
    }
}
