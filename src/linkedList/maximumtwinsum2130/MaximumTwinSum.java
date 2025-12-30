package linkedList.maximumtwinsum2130;

public class MaximumTwinSum {
    public int pairSum(ListNode head) {
        ListNode cur = head;
        ListNode slow = head;
        ListNode fast = head;
      while(fast!=null && fast.next !=null)
      {
          slow = slow.next;
          fast = fast.next.next;
      }
        ListNode newHead = reverse(slow);
        int answer = 0;
        while(cur!=null && newHead!=null)
        {
            int sum = cur.val + newHead.val;
            answer = Math.max(sum,answer);
            cur = cur.next;
            newHead = newHead.next;
        }
        return answer;

    }

    private ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null)
        {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
