package linkedList.designlist707;

import java.util.List;

public class MyLinkedList {
    int data;
    MyLinkedList next;
    MyLinkedList head;
    public MyLinkedList() {
        head = null;
    }
    public MyLinkedList(int data){
        this.data = data;
        this.next = null;
    }


    public int get(int index) {
        int i =0;
        MyLinkedList cur = head;
        while(cur!=null)
        {
            if(i==index)
                return cur.data;
            cur = cur.next;
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        MyLinkedList cur = new MyLinkedList(val);
        cur.next = head;
        head = cur;
    }

    public void addAtTail(int val) {
        MyLinkedList cur = new MyLinkedList(val);
        if(head == null) {
            head = cur;
            return;
        }
        MyLinkedList temp  = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = cur;
    }

    public void addAtIndex(int index, int val) {
        MyLinkedList cur = new MyLinkedList(val);
        if(index == 0)
        {
            cur.next = head;
            head = cur;
            return;
        }
        if(head == null)return;
        MyLinkedList temp = head;
        int i =0;
        while(temp.next!=null && i !=index-1)
        {
            temp = temp.next;
            i++;
        }
        cur.next = temp.next;
        temp.next = cur;
    }

    public void deleteAtIndex(int index) {
        if(index == 0)
        {
            head = head.next;
            return;
        }
        if(head == null)return;
        MyLinkedList temp = head;
        int i =0;
        while(temp.next!=null && i !=index-1)
        {
            temp = temp.next;
            i++;
        }
        if(temp.next ==null) return;
        temp.next = temp.next.next;
    }
}
