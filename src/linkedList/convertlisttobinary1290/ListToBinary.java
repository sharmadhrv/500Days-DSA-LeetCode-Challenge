package linkedList.convertlisttobinary1290;

public class ListToBinary {

    public int getDecimalValue(ListNode head) {

        int number =0;
        ListNode cur = head;
        while(cur!=null)
        {
            number = number*2 +cur.val;
            cur = cur.next;
        }

        return number;
    }
}
