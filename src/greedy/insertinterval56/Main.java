package greedy.insertinterval56;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        InsertInterval insertInterval = new InsertInterval();

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] answer = insertInterval.merge(intervals);

        for(int[] i : answer)
        {
            System.out.println(Arrays.toString(i));
        }

    }
}
