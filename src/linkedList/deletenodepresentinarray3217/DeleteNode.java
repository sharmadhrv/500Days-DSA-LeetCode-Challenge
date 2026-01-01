package linkedList.deletenodepresentinarray3217;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DeleteNode {

    public ListNode modifiedList(int[] nums, ListNode head) {

        Set<Integer> arraySet = new HashSet<>();
        ListNode dummy = new ListNode(0);
        ListNode answer = dummy;
        for(int i : nums)
            arraySet.add(i);
        ListNode cur = head;
        while(cur!=null)
        {
            if(arraySet.contains(cur.val)){
                cur = cur.next;
            }
            else {
                answer.next = cur;
                answer = answer.next;
                cur = cur.next;
            }
        }
        answer.next = null;
        return  dummy.next;
    }
}
