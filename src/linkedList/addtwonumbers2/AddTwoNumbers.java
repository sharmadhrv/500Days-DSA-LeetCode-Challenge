package linkedList.addtwonumbers2;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode answerNode = new ListNode(0);
        ListNode answer = answerNode;

        int sum;
        int carry = 0;
        while(temp1!=null && temp2!=null)
        {
            sum = temp1.val + temp2.val;
            answer.next = new ListNode((sum+carry)%10);
            carry = (sum+carry)/10;
            answer = answer.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        ListNode remNode = (temp1 == null && temp2!=null) ? temp2 : temp1;
        while(remNode!=null)
        {
            sum= remNode.val;
            answer.next = new ListNode((sum+carry)%10);
            carry = (sum+carry)/10;
            answer = answer.next;
            remNode = remNode.next;
        }
        if(carry!=0)
        {
            answer.next = new ListNode(1);
        }
        return answerNode.next;
    }
}
