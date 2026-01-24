package Stack.maximumrectangle85;

import java.util.Stack;

public class MaximumRectangle {

    public static void main(String[] args) {
        //char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'}
         //       ,{'1','0','0','1','0'}};
        char[][] matrix = {{'1'}};
        System.out.println(maximalRectangle(matrix));
    }

    public static  int maximalRectangle(char[][] matrix)
    {
        int n = matrix.length;
        int[][] prefixSum = new int[n][matrix[0].length];

        for(int j = 0;j<matrix[0].length;j++)
        {
            int sum = 0;
            for(int i = 0;i<matrix.length;i++)
            {
                sum +=1;
                if( matrix[i][j]=='0')
                    sum = 0;
                prefixSum[i][j] = sum;
            }
        }
        int area = 0;
        for(int i = 0;i<prefixSum.length;i++)
        {
            area = Math.max(area,largestRectangle(prefixSum[i]));
        }
        return area;
    }

    private static int largestRectangle(int[] prefixSum)
    {
        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for(int i = 0;i<prefixSum.length;i++)
        {
            while(!stack.isEmpty() && prefixSum[stack.peek()] > prefixSum[i])
            {
                int height =prefixSum[stack.pop()];
                int width = stack.isEmpty() ? i : i-stack.peek()-1;
                area = Math.max(area,height*width);
            }
            stack.push(i);
        }

        while(!stack.isEmpty())
        {
            int height = prefixSum[stack.pop()];
            int width = stack.isEmpty() ? prefixSum.length : prefixSum.length-stack.peek()-1;
            area = Math.max(area,height*width);
        }
        return area;
    }
}
