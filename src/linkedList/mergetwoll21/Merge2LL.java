package linkedList.mergetwoll;

public class Merge2LL {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode node = new ListNode(0);
        ListNode dummy = node;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                node.next = temp1;
                temp1 = temp1.next;
                node = node.next;
            } else {
                node.next = temp2;
                temp2 = temp2.next;
                node = node.next;
            }
        }
        if (temp1 == null) {
            while (temp2!= null) {
                node.next = temp2;
                temp2 = temp2.next;
                node = node.next;
            }
        }
        else {
            while (temp1!= null) {
                node.next = temp1;
                temp1 = temp1.next;
                node = node.next;
            }
        }
    return dummy.next;
    }

}
