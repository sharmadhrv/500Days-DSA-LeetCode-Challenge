package graphs.courseschedule2nd210;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CourscSchedule schedule = new CourscSchedule();

        int[][] pre = {{1,0},{2,0},{3,1},{3,2}};

        System.out.println(Arrays.toString(schedule.findOrder(4,pre)));
    }
}
