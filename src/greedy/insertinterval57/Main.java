package greedy.insertinterval57;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        InsertInterval insertInterval = new InsertInterval();

        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};

        System.out.println(Arrays.toString(insertInterval.insert(intervals,newInterval)));
    }
}
