package arrays.subarraywithkdifferentinteger992;

import java.util.HashMap;
import java.util.Map;

public class SubArrayOfKInteger {

    public int subarraysWithKDistinct(int[] nums, int k) {

        return helpingFunction(nums, k) - helpingFunction(nums, k - 1);
    }

    private int helpingFunction(int[] nums, int k){

        int left= 0, right, count = 0;
        int value;
        Map<Integer,Integer> map = new HashMap<>();

        for(right = 0 ; right<nums.length;right++)
        {
            if(map.containsKey(nums[right]))
            {
                value = map.get(nums[right]);
                map.put(nums[right],value+1);
            }
            else map.put(nums[right],1);
            while(map.size()>k)
            {
                value = map.get(nums[left]);
                map.put(nums[left],value-1);
                if(map.get(nums[left])==0)
                    map.remove(nums[left]);
                left++;
            }
            count=count+(right-left+1);
        }
        return count;
    }
}
