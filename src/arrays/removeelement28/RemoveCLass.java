package arrays.removeelement28;

import java.util.Arrays;

public class RemoveCLass {

    public int removeElement(int[] nums, int val) {

        int count = 0;
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
                count++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }
}
