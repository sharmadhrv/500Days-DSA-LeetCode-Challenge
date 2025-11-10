package arrays.longestconsecutivesequence128;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums)
    {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int count;
        int longest = 1;

        for(int num : nums)
        {
            set.add(num);
        }
        for(int num : set) {
            count = 1;

            if (!set.contains(num - 1)) {
                while (set.contains(num + count)) {
                    count++;
                }
            }
            longest = (longest > count) ? longest : count;
        }
        return longest;
    }

// Optimal Solution O(N LogN)
    public int longestConsecutive2(int[] nums){

        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest = 1;
        int count =0;
        int leastSmaller = Integer.MIN_VALUE;
        for(int num: nums)
        {
            if(num-1 == leastSmaller) {
                count++;
                leastSmaller = num;
            }
            else if(leastSmaller != num-1 && leastSmaller != num){
                count = 1;
                leastSmaller = num;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }


}
