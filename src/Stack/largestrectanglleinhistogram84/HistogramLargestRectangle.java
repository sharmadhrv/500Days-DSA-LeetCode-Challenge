package Stack.largestrectanglleinhistogram84;

import java.util.Stack;

public class HistogramLargestRectangle {

    public static void main(String[] args) {
        int[] heights = {1,1};
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
        int[] nse = nextSmallerElement(heights);
        int[] pse = previousSmallerElement(heights);
        int finalArea= 0;
        for(int i = 0;i<heights.length;i++)
        {
            int right = nse[i]  ;
            int left = pse[i];
            int area = (right-left-1)*heights[i];
            finalArea = Math.max(finalArea,area);
        }
        return finalArea;
    }

    private static int[] nextSmallerElement(int[] height)
    {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[height.length];
        for(int i = height.length-1;i>=0;i--)
        {
            while (!stack.isEmpty() && height[stack.peek()]>height[i])
                stack.pop();
            if(stack.isEmpty())
                ans[i] = height.length;
            else ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private static int[] previousSmallerElement(int[] height)
    {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[height.length];
        for(int i = 0;i<height.length;i++)
        {
            while (!stack.isEmpty() && height[stack.peek()]>height[i])
                stack.pop();
            if(stack.isEmpty())
                ans[i] = -1;
            else ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
