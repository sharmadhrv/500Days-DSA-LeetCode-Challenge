package linkedList.spiralmatrix2326;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[] arr = {3,0,2,6,8,1,7,9,4,2,5,5,0};
        ListNode list = null;
        list= main.insertAtEnd(arr[0],null);
        for(int i=1;i<arr.length;i++)
            list = main.insertAtEnd(arr[i],list);
        int[][] a = spiralMatrix.spiralMatrix(3,5,list);
        for(int i = 0;i<3;i++)
        {
            for(int j =0;j<5;j++)
            {
                System.out.print(a[i][j]+" ");
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
