package graphs;

import graphs.courseschedule207.CourseSchedule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CourseSchedule207Testing {

    CourseSchedule courseSchedule = new CourseSchedule();

    @Test
    public void test1(){
        int[][]pre = {{0,1},{1,0}};
        assertEquals(false,courseSchedule.canFinish(2,pre));
    }

}
