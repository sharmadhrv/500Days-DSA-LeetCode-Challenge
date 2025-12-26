package linkedList.linkedlistcomponents817;

import java.util.HashSet;
import java.util.Set;

public class LinkedListComponents {

    public int numComponents(ListNode head, int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i :nums)
            set.add(i);
        int answer = 0;
        ListNode cur = head;
        while(cur!=null)
        {
            if (set.contains(cur.val) &&
                    (cur.next == null || !set.contains(cur.next.val))) {
                answer++;
            }
            cur = cur.next;
        }

        return answer;
    }

}
