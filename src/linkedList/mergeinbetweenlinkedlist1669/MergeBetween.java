package linkedList.mergeinbetweenlinkedlist1669;

public class MergeBetween {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
            ListNode aList1 = list1;
            int i =1;
            while(i<a && aList1 !=null)
            {
                i++;
                aList1 = aList1.next;
            }

            ListNode bList1 = list1;
            i =0;
            while(i<=b && bList1 !=null)
            {
                i++;
                bList1 = bList1.next;
            }
            ListNode endList2 = list2;
            while(endList2.next !=null)
            {
                endList2 = endList2.next;
            }
            if(aList1!=null) {
                aList1.next = list2;
            }

            endList2.next=bList1;
            return list1;
        }

}
