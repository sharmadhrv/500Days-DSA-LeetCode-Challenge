package linkedList.insertgcd2807;

public class InsertGcd {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while(cur.next!=null)
        {
            ListNode next = cur.next;
            ListNode temp = new ListNode(gcd(cur.val,next.val));
            cur.next = temp;
            temp.next = next;
            cur = next;
        }
        return  head;
    }

    private int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }


}
