package linkedList.palindrome234;

import java.util.List;

public class Palindrome {

    public boolean isPalindrome(ListNode head)
    {
        if(head == null || head.next == null) return true;
        ListNode mid = getMid(head);
       // ListNode newNode = mid.next;
        ListNode secondHead = mid.next;
        mid.next = null;
        secondHead = reverse(secondHead);
        ListNode newLL = secondHead;
        while(head!=null && newLL != null)
        {
            if(head.val != newLL.val ) {
                mid.next =reverse(secondHead);
                return false;
            }
            head = head.next;
            newLL = newLL.next;
        }
        mid.next = reverse(secondHead);
        return true;
    }

    private ListNode getMid(ListNode head)
    {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = cur.next;
        while(cur!=null)
        {
            cur.next = prev;
            prev = cur;
            cur = next;
            if(next!=null)
                next = next.next;
        }
        return prev;
    }
}
