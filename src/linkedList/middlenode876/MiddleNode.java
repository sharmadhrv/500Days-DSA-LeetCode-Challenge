package linkedList.middlenode876;


public class MiddleNode {

    public ListNode middleNode(ListNode head){

        ListNode temp = head;
        int size = 1;
        while(temp!=null)
        {
            temp = temp.next;
            size++;
        }
        temp = head;

        for(int i=0;i<size/2;i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    // or

    public ListNode middleNode2(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
