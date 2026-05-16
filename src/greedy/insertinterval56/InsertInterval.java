package greedy.insertinterval56;

import java.util.Arrays;

public class InsertInterval {

    public int[][] merge(int[][] intervals) {

        int[][] temp = new int[intervals.length][2];

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int[] newInterval =new int[2];
        newInterval[0] = intervals[0][0];
        newInterval[1] = intervals[0][1];

        int n= intervals.length;

        int k  =0;
       for(int i =1;i<n;i++)
       {
           if(newInterval[1]>=intervals[i][0])
           {
               newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
           }
           else{
               temp[k++] = newInterval;
               newInterval = intervals[i];
           }
       }
       temp[k++] = newInterval;
        int[][] result = new int[k][2];
        for(int index = 0;index<k;index++)
        {
            result[index]= temp[index];
        }
        return result;
    }
}
