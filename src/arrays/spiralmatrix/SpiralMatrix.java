package arrays.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralMatrix(int[][] matrix){

        List<Integer> list = new ArrayList<>();
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int left =0, right =colSize-1;
        int top =0, btm =rowSize-1;

        while(left<=right && top <=btm) {
            for (int i = left; i <= right; i++)
                list.add(matrix[top][i]);

            top++;
            for (int i = top; i <= btm; i++)
                list.add(matrix[i][right]);

            right--;
            if(top<=btm)
                for (int i = right; i >= left; i--)
                    list.add(matrix[btm][i]);

            btm--;
            if(left<=right)
                for (int i = btm; i >= top; i--)
                    list.add(matrix[i][left]);

            left++;
        }
        return list;
    }

}
