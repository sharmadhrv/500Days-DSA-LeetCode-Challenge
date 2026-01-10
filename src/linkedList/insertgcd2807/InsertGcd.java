package linkedList.insertgcd2807;

public class InsertGcd {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while(cur.next!=null)
        {
            ListNode node = cur.next;
            ListNode temp = new ListNode(gcd(cur.val,node.val));
            cur.next = temp;
            temp.next = node;
            cur = node;
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
