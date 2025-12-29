package linkedList.reversenodeinevenlengthgroup2074;

public class ReverseNodeEvenGroup {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;
        ListNode cur = head;
        int groupSize = 1;

        while (cur != null) {
            // 1. Count actual nodes in this group
            int count = 0;
            ListNode temp = cur;
            while (temp != null && count < groupSize) {
                temp = temp.next;
                count++;
            }

            // 2. If count is even → reverse
            if (count % 2 == 0) {
                ListNode prev = null;
                ListNode node = cur;

                for (int i = 0; i < count; i++) {
                    ListNode next = node.next;
                    node.next = prev;
                    prev = node;
                    node = next;
                }

                // 3. Reconnect
                prevGroupEnd.next = prev;
                cur.next = node;

                prevGroupEnd = cur;
                cur = node;
            }
            else {
                for (int i = 0; i < count; i++) {
                    prevGroupEnd = cur;
                    cur = cur.next;
                }
            }

            groupSize++;
        }

        return dummy.next;
    }
}
