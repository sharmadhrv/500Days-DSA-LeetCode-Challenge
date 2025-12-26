package linkedList.linkedlistcomponents817;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        LinkedListComponents linkedListComponents  = new LinkedListComponents();
        int[] arr = {1,2,3,4,5};
        ListNode list = null;
        list= main.insertAtEnd(arr[0],null);
        for(int i=1;i<arr.length;i++)
            list = main.insertAtEnd(arr[i],list);
        int[] nums={1,3,4,5};
        System.out.println(linkedListComponents.numComponents(list,nums));

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
