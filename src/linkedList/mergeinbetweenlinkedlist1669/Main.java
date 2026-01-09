package linkedList.mergeinbetweenlinkedlist1669;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        MergeBetween mergeBetween = new MergeBetween();
        int[] arr1 = {0,1,2,3,4,5,6};
        ListNode list1 = null;
        list1= main.insertAtEnd(arr1[0],null);
        for(int i=1;i<arr1.length;i++)
            list1 = main.insertAtEnd(arr1[i],list1);

        int[] arr2 = {1000000,1000001,1000002,1000003,1000004};
        ListNode list2 = null;
        list2= main.insertAtEnd(arr2[0],null);
        for(int i=1;i<arr2.length;i++)
            list2 = main.insertAtEnd(arr2[i],list2);

        ListNode node = mergeBetween.mergeInBetween(list1,2,5,list2);
        main.display(node);

    }

    private void display(ListNode head) {

        ListNode temp =head;
        while(temp!= null)
        {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private ListNode insertAtEnd(int data, ListNode head) {

        if(head == null)
        {
            ListNode node = new ListNode(data);
            head = node;
            head.next = null;
            return head;
        }
        ListNode node = new ListNode(data);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        return head;



    }
}
