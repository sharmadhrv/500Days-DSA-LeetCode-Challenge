package Stack.sumofsubarraymin907;

import java.lang.reflect.Array;
import java.util.Stack;

public class SubArrayMIn {

    public static int sumSubarrayMins(int[] arr) {


        int[] nse = nextSmallerElement(arr);
        int[] psee = previousSmallerEqualElement(arr);
        int numOfSubArray ;
        int total ;
        int mod = (int)Math.pow(10,9) + 7;

        for(int i = -0;i<arr.length;i++)
        {
            int right = Array.nse[i];
        }
    }
    public static int[] nextSmallerElement(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--)
        {
            while(stack.isEmpty() && stack.peek()<arr[i])
                stack.pop();

            if(stack.isEmpty())
                ans[i] = -1;
            else
                ans[i] = i;
            stack.push(i);

        }
        return ans;
    }

    public static int[] previousSmallerEqualElement(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = 0;i<arr.length;i++)
        {
            while(stack.isEmpty() && stack.peek()>=arr[i])
                stack.pop();

            if(stack.isEmpty())
                ans[i] = -1;
            else
                ans[i] = ;
            stack.push(i);

        }
        return ans;
    }

}
