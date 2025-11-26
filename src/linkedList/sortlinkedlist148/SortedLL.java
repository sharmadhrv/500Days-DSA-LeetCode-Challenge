package linkedList.sortlinkedlist148;

public class SortedLL {

    public ListNode sortedList(ListNode head)
    {
        if(head == null || head.next == null) return null;
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode left = sortedList(head);
        ListNode right = sortedList(mid);

        return mergeList(left,right);
    }

    private ListNode getMid(ListNode head)
    {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head.next;//catch here
        while(fast!= null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode mergeList(ListNode list1 , ListNode list2)
    {
        ListNode node = new ListNode(0);
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode dummy = node;
        while(list1!=null && list2!= null)
        {
            if(list1.val< list2.val) {
                node.next = list1;
                node = node.next;
                list1 = list1.next;
            }
            else {
                node.next = list2;
                node = node.next;
                list2 = list2.next;
            }
        }
        if(list1== null)
            node.next = list2;
        else
            node.next = list1;

        return dummy.next;
    }
}
