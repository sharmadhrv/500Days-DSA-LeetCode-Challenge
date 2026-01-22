package Stack.previoussmallerelement;

import java.util.Arrays;
import java.util.Stack;

public class PreviousSmallerElement {

    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        System.out.println(Arrays.toString(previousSmallerElement(arr)));
    }

    public static int[] previousSmallerElement(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            while(!stack.isEmpty() && stack.peek() > arr[i])
                stack.pop();
            if(stack.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }

}
