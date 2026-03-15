package heap.relativerank506;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RelativeRank {

    public static class Node{
        int val;
        int index;

        Node(int val,int index){
            this.val = val;
            this.index = index;
        }
    }
    public String[] findRelativeRanks(int[] score) {

        PriorityQueue<Node> maxHeap = new PriorityQueue<>(score.length,(a,b)->b.val-a.val);
        for(int i=0 ;i<score.length;i++) {
            maxHeap.add(new Node(score[i], i));
        }
            String[] answer = new String[score.length];
            for(int i = 1;i<=score.length;i++) {

                Node node = maxHeap.poll();
                if(i==1)
                    answer[node.index]=  "Gold Medal";
                else if(i==2)
                    answer[node.index]=  "Silver Medal";
                else if(i==3)
                    answer[node.index]=  "Bronze Medal";
                else
                    answer[node.index]= i+"";

            }
        return answer;
    }
}