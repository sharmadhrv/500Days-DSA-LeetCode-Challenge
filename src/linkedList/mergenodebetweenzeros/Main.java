package linkedList.mergenodebetweenzeros;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        MergeNode mergeNode = new MergeNode();
        int[] arr = {0,1,0,3,0,2,2,0};
        ListNode list = null;
        list= main.insertAtEnd(arr[0],null);
        for(int i=1;i<arr.length;i++)
            list = main.insertAtEnd(arr[i],list);
        ListNode node = mergeNode.mergeNodes(list);
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
