package arrays.rotatematrix48;

public class Main {

    public static void main(String[] args) {

        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateImage.rotateImage(matrix);
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
