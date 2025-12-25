package linkedList.splitlinkedlist725;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        SplitLinkedList splitLinkedList = new SplitLinkedList();
        int[] arr = {1,2,3};
        ListNode list = null;
        list= main.insertAtEnd(arr[0],null);
        for(int i=1;i<arr.length;i++)
            list = main.insertAtEnd(arr[i],list);
        ListNode[]  node = splitLinkedList.splitListToParts(list,5);
        for(int i =0;i<node.length;i++)
        {
            ListNode head = node[i];
            while(head!=null)
            {
                System.out.print(head.val+" ");
                head = head.next;
            }
            System.out.println();
        }

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
