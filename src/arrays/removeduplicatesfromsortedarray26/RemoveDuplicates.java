package arrays.removeduplicatesfromsortedarray26;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums)
    {
        int count =1;
       for(int i =0,j=0;j<nums.length;j++)
       {
           if(nums[j]!=nums[i]){
               nums[++i] = nums[j];
               count++;
           }
       }
        System.out.println(Arrays.toString(nums));
       return count;
    }

}
