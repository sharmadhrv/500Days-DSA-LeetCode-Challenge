package linkedList.reversenodeinevenlengthgroup2074;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        ReverseNodeEvenGroup reverseNodeEvenGroup = new ReverseNodeEvenGroup();
        int[] arr = {5,2,6,3,9,1,7,3,8,4};
        ListNode list = null;
        list= main.insertAtEnd(arr[0],null);
        for(int i=1;i<arr.length;i++)
            list = main.insertAtEnd(arr[i],list);
        ListNode node = reverseNodeEvenGroup.reverseEvenLengthGroups(list);
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
