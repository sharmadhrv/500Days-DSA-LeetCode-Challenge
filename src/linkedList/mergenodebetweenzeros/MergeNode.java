package linkedList.mergenodebetweenzeros;

public class MergeNode {

    public ListNode mergeNodes(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode answer = dummy;
        ListNode cur = head;
        while(cur!=null)
        {
            if(cur.val!=0)
            {
                ListNode temp = cur;
                int sum = 0;
                while(temp!=null && temp.val !=0)
                {
                    sum+=temp.val;
                    temp = temp.next;
                }
                dummy.next =new ListNode( sum);
                dummy = dummy.next;
                cur = temp;
            }
            else{
                cur = cur.next;
            }
        }
        return  answer.next;
    }
}
