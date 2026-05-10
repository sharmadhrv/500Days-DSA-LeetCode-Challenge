package greedy.insertinterval57;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] temp = new int[intervals.length+1][2];
        int n = intervals.length;

        int i =0,k=0;
        while(i<n && newInterval[0] > intervals[i][1])
        {
           temp[k] = intervals[i];
            i++;
            k++;
        }
        while(i<n && newInterval[1] >= intervals[i][0])
        {
           newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
           newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
           i++;
        }

        temp[k++] = newInterval;

        while(i<n)
        {
            temp[k] = intervals[i];
            i++;
            k++;
        }

        int[][] result = new int[k][2];
        int index = 0;

        for(index = 0;index<k;index++)
            result[index ] = temp[index];

        return result;
    }
}
