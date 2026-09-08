package graphs;

import graphs.zeroonematrix542.Matricx01;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Matrix01Testing542 {

    Matricx01 matricx01 = new Matricx01();

    @Test
    public void test1()
    {
        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] expected = {{0,0,0},{0,1,0},{0,0,0}};

        assertEquals(expected,matricx01.updateMatrix(mat));
    }
}
