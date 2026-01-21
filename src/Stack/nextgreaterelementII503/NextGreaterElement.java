package Stack.nextgreaterelementII503;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums= {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements2(nums)));
    }

    public static int[] nextGreaterElements(int[] nums) {

        if(nums.length == 1) return new int[]{-1};

        int[] answer = new int[nums.length];

       for(int i =0;i<nums.length;i++)
        {
            for(int j = i+1;j<(nums.length+i);j++)
            {
                if(nums[j%nums.length] > nums[i])
                {
                    answer[i] = nums[j%nums.length];
                    break;
                }
                else answer[i] = -1;
            }
        }
        return answer;
    }

    public static int[] nextGreaterElements2(int[] nums) {

        int[] answer = new int[nums.length];
        Stack<Integer> monotonicStack = new Stack<>();

        for(int i = 2*nums.length-1;i>=0;i--)
        {
            while(!monotonicStack.isEmpty() && monotonicStack.peek() <= nums[i% nums.length])
                monotonicStack.pop();
            if(i<nums.length) {
                if (monotonicStack.isEmpty())
                    answer[i % nums.length] = -1;
                else
                    answer[i % nums.length] = monotonicStack.peek();
            }
            monotonicStack.push(nums[i%nums.length]);
        }
        return answer;

    }
}
