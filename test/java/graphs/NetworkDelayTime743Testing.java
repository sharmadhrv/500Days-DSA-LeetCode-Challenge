package graphs;

import graphs.networkdelaytime743.NetworkDelayTime;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkDelayTime743Testing {

    NetworkDelayTime networkDelayTime = new NetworkDelayTime();

    @Test
    public void test1()
    {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        assertEquals(2,networkDelayTime.networkDelayTime(times,4,2));
    }
}
