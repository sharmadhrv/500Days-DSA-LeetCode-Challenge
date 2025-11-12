package arrays.spiralmatrix;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> list =spiralMatrix.spiralMatrix(matrix);
        for(int num: list)
            System.out.print(num+" ");
    }
}
