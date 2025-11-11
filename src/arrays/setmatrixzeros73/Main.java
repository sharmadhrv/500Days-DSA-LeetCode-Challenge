package arrays.setmatrixzeros73;

import java.util.Arrays;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        SetMatrix setMatrix = new SetMatrix();
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setMatrix.setZeroes(matrix);
        for(int i =0;i< matrix.length;i++)
        {
            for(int j =0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
