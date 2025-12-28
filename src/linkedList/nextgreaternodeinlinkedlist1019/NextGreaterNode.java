package linkedList.nextgreaternodeinlinkedlist1019;

public class NextGreaterNode {
    public int[] nextLargerNodes(ListNode head) {

        int size = 0;
        ListNode cur = head;
        while(cur!=null)
        {
            size++;
            cur = cur.next;
        }
        int[] answer = new int[size];
        cur = head;
        int i =0;
        while(cur!=null)
        {
            ListNode temp = cur;
            int tempVal = cur.val;
            while(temp!=null)
            {
                if(temp.val>tempVal) {
                    tempVal = temp.val;
                    break;
                }
                temp = temp.next;
            }
            if(tempVal== cur.val)
                answer[i++] = 0;
            else
                answer[i++] = tempVal;
            cur = cur.next;
        }
        return answer;
    }
}
