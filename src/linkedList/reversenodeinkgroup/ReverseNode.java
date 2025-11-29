package linkedList.reversenodeinkgroup;

public class ReverseNode {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode prev = null;
        ListNode cur = temp;

        while (true) {
            ListNode check = temp;
            for (int i = 0; i < k; i++) {
                if (check == null) {
                    return head;
                }
                check = check.next;
            }
            ListNode last = prev;
            ListNode start = cur;
            ListNode next = cur.next;
            for (int i = 0; cur != null && i < k; i++) {
                cur.next = prev;
                prev = cur;
                cur = next;
                if (next != null)
                    next = next.next;
            }
            if (last != null)
                last.next = prev;
            else head = prev;
            start.next = cur;
            if (cur == null)
                break;
            prev = start;
            temp = cur;
        }
        return head;
    }
}
