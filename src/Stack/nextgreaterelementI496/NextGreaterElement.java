package Stack.nextgreaterelementI496;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] num1 = {2,4};
        int[] num2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(num1,num2)));
    }

    public static  int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums2.length];
        Stack<Integer> monotonicStack = new Stack<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            while(!monotonicStack.isEmpty() && monotonicStack.peek()<nums2[i])
            {
                monotonicStack.pop();
            }
            if(monotonicStack.isEmpty())
                answer[i] = -1;
            else
                     answer[i] = monotonicStack.peek();
            monotonicStack.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums2.length;i++)
        {
            map.put(nums2[i],answer[i]);
        }
        for(int i = 0;i<nums1.length;i++)
        {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
