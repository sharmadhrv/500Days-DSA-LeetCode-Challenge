package Stack.largestrectanglleinhistogram84;

import java.util.Stack;

public class HistogramLargestRectangle {

    public static void main(String[] args) {
        int[] heights = {2, 4};
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                area = Math.max(area, height * width);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? heights.length : heights.length - stack.peek() - 1;
            area = Math.max(area, height * width);
        }
        return area;
    }
}

