package linkedList.partitionlist86;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode smallList = new ListNode(0);
        ListNode largeList = new ListNode(0);
        ListNode large = largeList;
        ListNode small = smallList;

        ListNode cur = head;
        while(cur!=null) {

            if(cur.val<x)
            {
                small.next = cur;
                small = small.next;
                cur = cur.next;
            }
            else{
                large.next = cur;
                large = large.next;
                cur = cur.next;
            }

        }
        large.next = null;
        small.next = largeList.next;
    return smallList.next;
    }
}
