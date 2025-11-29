package linkedList.rotatelist61;

public class RotateList {

    public ListNode rotateRight(ListNode head ,int k)
    {
        int length = length(head);
        ListNode temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head;
        k = k%length;
        ListNode temp1 = head;
        for(int i =0;temp1.next!=null && i<length-k-1;i++)
        {
            temp1 = temp1.next;
        }
        ListNode secondHead = temp1.next;
        temp1.next = null;
        return  secondHead;
    }

    private int length(ListNode head)
    {
        int length =0;
        while(head!=null)
        {
            head = head.next;
            length++;
        }
        return length;
    }
}
