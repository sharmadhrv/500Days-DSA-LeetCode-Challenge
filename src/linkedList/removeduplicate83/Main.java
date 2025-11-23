package linkedList.removeduplicate83;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] arr = {1,1,3};
        ListNode head= main.insertAtEnd(arr[0],null);
        for(int i=1;i<arr.length;i++)
            main.insertAtEnd(arr[i],head);
        removeDuplicates.duplicateElements(head);
        main.display(head);

    }

    public ListNode  insertAtEnd(int data,ListNode head) {

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
        return head;
    }

    public void display(ListNode head){
        ListNode temp =head;
        while(temp!= null)
        {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
