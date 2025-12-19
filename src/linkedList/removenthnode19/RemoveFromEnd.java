package linkedList.removenthnode19;

public class RemoveFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next==null)return null;
        int size = 0;
        ListNode temp = head;

         //{1,2}
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }

        int requiredNodeIndex = size-n;
        if(requiredNodeIndex ==0)
            head = head.next;
        int i=0;
        ListNode cur = head;
        ListNode prev = cur;

        while(i<requiredNodeIndex)
        {
            prev = cur;
            cur = cur.next;
            i++;
        }
        prev.next = cur.next;
        return head;
    }
}
