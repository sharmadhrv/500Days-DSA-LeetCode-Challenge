package miscellaneous.singlenumber;

import java.util.Arrays;

public class SingleNumber {

    /**
     * Given an array nums of length n, every integer in the array appears twice except for two integers.
     * Identify and return the two integers that appear only once in the array.
     * Return the two numbers in ascending order.
     * For example, if nums = [1, 2, 1, 3, 5, 2], the correct answer is [3, 5], not [5, 3].
     * Example 1
     * Input : nums = [1, 2, 1, 3, 5, 2]
     * Output : [3, 5]
     * Explanation : The integers 3 and 5 have appeared only once.
     */

    public static void main(String[] args) {
        int[] nums = {3,3,4,5,2,5,7,2};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
    public static int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums)
            xor = xor ^ i;
        int rightmost = (xor & (xor-1)) ^ xor;
        int b1=0,b2 = 0;
        for(int i : nums)
        {
            if((i & rightmost)==0 )
                b2 = b2^i;
            else
                b1 = b1^i;
        }
        return new int[]{b1,b2};
    }
}
