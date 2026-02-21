package linkedList.addtwonumbers445;

public class  Main {
    public static void main(String[] args) {

        Main main = new Main();
        AddTwoNumbers addTwoNUmbers = new AddTwoNumbers();

        int[] arr = {9,9,9};
        ListNode list = null;
        list= main.insertAtEnd(arr[0],null);
        for(int i=1;i<arr.length;i++)
            list = main.insertAtEnd(arr[i],list);

        int[] arr2 = {1};
        ListNode list2 = null;
        list2= main.insertAtEnd(arr2[0],null);
        for(int i=1;i<arr2.length;i++)
            list2 = main.insertAtEnd(arr2[i],list2);
        ListNode node = addTwoNUmbers.addTwoNumbers(list,list2);
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
