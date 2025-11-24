package linkedList.mergetwoll21;

public class Main {

    public static void main(String[] args) {

        Merge2LL merge2LL = new Merge2LL();
        Main main = new Main();

        int[] arr1 = {1,2,4};
        ListNode list1 = null;
         list1= main.insertAtEnd(arr1[0],null);
        for(int i=1;i<arr1.length;i++)
            list1 = main.insertAtEnd(arr1[i],list1);

        ListNode list2 = null;
        int[] arr2 = {1,3,4};
         list2 = main.insertAtEnd(arr2[0],null);
        for(int i=1;i<arr2.length;i++)
            list2 = main.insertAtEnd(arr2[i],list2);

        ListNode node = merge2LL.mergeTwoLists(list1,list2);
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
