package Stack.sumofsubarraymin907;

import java.lang.reflect.Array;
import java.util.Stack;

public class SubArrayMIn {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }

    public static int sumSubarrayMins(int[] arr) {


        int[] nse = nextSmallerElement(arr);
        int[] psee = previousSmallerEqualElement(arr);
        long total = 0;
        int mod = (int)1e9 + 7;

        for(int i = -0;i<arr.length;i++)
        {
            int right = nse[i] - i;
            int left = i - psee[i];
            total = (total +((long)left*right*arr[i])%mod) % mod;
        }
        return (int)total;
    }
    public static int[] nextSmallerElement(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
                stack.pop();

            if(stack.isEmpty())
                ans[i] = arr.length;
            else
                ans[i] = stack.peek();
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
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i])
                stack.pop();

            if(stack.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stack.peek();
            stack.push(i);

        }
        return ans;
    }

}
