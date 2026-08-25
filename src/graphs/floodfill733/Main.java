package graphs.floodfill733;

public class Main {

    public static void main(String[] args) {
        FloodFill floodFill = new FloodFill();

        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};

        floodFill.floodFill(image,1,1,2);

        for(int i =0;i< image.length;i++)
        {
            for(int j =0;j<image[0].length;j++)
                System.out.print(image[i][j] + " ");
            System.out.println();
        }
    }
}
