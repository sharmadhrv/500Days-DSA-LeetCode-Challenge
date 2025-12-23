package linkedList.intersectionoftwolLL160;

import java.util.ArrayList;

public class Intersection {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        ListNode temp1 = headA;
        ListNode temp2 = headB;

       int listAsize = 0;
       int listBsize = 0;
       while(temp1!=null)
       {
           listAsize++;
           temp1 = temp1.next;
       }
       while(temp2!=null)
       {
           listBsize++;
           temp2 = temp2.next;
       }
       while(listAsize>listBsize)
       {
           listAsize--;
           headA = headA.next;
       }
       while(listBsize>listAsize){
           listBsize--;
           headB = headB.next;
       }

       while(headA!=headB)
       {
           headA = headA.next;
           headB = headB.next;
       }
       return headA;
    }
}
