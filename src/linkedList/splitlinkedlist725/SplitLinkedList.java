package linkedList.splitlinkedlist725;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SplitLinkedList {


    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] answer = new ListNode[k];
        ListNode cur = head;
        int size=0;
        while(cur!=null)
        {
            size++;
            cur = cur.next;
        }
        int i =0;
        int index = 0;
                cur = head;
        while(cur!=null && i <size){
            ListNode curHead = cur;
            answer[i] = curHead;
            if(index < size%k)
            {
                for(int j =0;j<(size/k);j++)
                {
                    cur = cur.next;
                }
                ListNode temp = cur;
                cur = cur.next;
                temp.next = null;
                index++;
                i++;
            }
            else{
                for(int j =0;j<(size/k)-1;j++)
                {
                    cur = cur.next;
                }
                i++;
                index++;
                ListNode temp = cur;
                cur = cur.next;
                temp.next = null;
            }
        }

        while(index<k)
        {
            answer[index] = null;
            index++;
        }
        return answer;
    }
}
