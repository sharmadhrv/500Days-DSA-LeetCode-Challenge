package graphs.floodfill733;


public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if(image[sr][sc] == color) return image;

        dfs(image,sr,sc,color,image[sr][sc]);
        return image;
    }

    private void dfs(int[][] image, int row, int col, int color,int originalColor){

       if(row<0 || row>=image.length
       || col<0 || col>=image[0].length)
           return ;

       if(image[row][col]!=originalColor) return;

       image[row][col] = color;

       dfs(image,row-1,col,color,originalColor);
       dfs(image,row+1,col,color,originalColor);
       dfs(image,row,col-1,color,originalColor);
       dfs(image,row,col+1, color,originalColor);

    }
}
