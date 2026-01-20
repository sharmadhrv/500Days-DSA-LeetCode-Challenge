package Stack.stackusinglinkedlist;

public class LinkedListStack {

   private static class Node{
       int data;
       Node next;

       Node(int data){
           this.data = data;
           this.next = null;
       }
   }
   private Node head;
    public LinkedListStack() {
         head = null;
    }

    public void push(int x) {
      Node temp = new Node(x);
      temp.next = head;
      head = temp;
    }

    public int pop() {
        if(isEmpty())
        {
            throw new RuntimeException();
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    public int top() {
        if(isEmpty())
        {
            throw new RuntimeException();
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
