package Stack.nextsmallerelement;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {

    public static void main(String[] args) {
        int[] arr = {10,9,8,7};
        System.out.println(Arrays.toString(nextSmallerElements(arr)));
    }

    public static int[] nextSmallerElements(int[] arr) {

        Stack<Integer> monotonicStack = new Stack<>();
        int[] answer = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--)
        {
            while(!monotonicStack.isEmpty() && monotonicStack.peek()>arr[i])
                monotonicStack.pop();

            if(monotonicStack.isEmpty())
                answer[i] = -1;
            else answer[i] = monotonicStack.peek();
            monotonicStack.push(arr[i]);
        }
        return answer;
    }
}
