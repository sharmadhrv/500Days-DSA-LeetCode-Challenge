package Stack.slidingwindowmaximum239;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums,3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {

            int[] answer = new int[nums.length-k+1];
            int j = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(!deque.isEmpty() && deque.getFirst()<=i-k)
            {
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i])
            {
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i>=k-1 )
                answer[j++] = nums[deque.getFirst()];
        }
            return answer;
        }
}
