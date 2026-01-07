package linkedList.addtwonumbers445;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNUmbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> answrList = new ArrayList<>();
        while(l1!=null||l2!=null)
        {
            if(l1!=null)
            {
                list1.add(l1.val);
                l1  = l1.next;
            }
            if(l2!=null)
            {
                list2.add(l2.val);
                l2 = l2.next;
            }
        }
        int sum ;
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode answer = dummy;
        while(!list1.isEmpty() || !list2.isEmpty() || carry!=0)
        {
             sum = carry;
             if(!list1.isEmpty())
             {
                 sum+=list1.removeLast();
             }
             if(!list2.isEmpty())
                 sum+=list2.removeLast();
             answrList.add(sum%10);
             carry = sum/10;
        }
        while(!answrList.isEmpty())
        {
            answer.next = new ListNode(answrList.removeLast());
            answer = answer.next;
        }
        return dummy.next;
    }
}
