package arrays.countnumberofnicesubarrays1248;

public class NiceSubArrays {

    public int numberOfSubarrays(int[] nums, int k) {
      return helpingFunction(nums,k)-helpingFunction(nums,k-1);
}

private int helpingFunction(int[] nums,int goal) {

    int left = 0, right, sum = 0, count = 0;
    for (right = 0; right < nums.length; right++) {
        sum = sum + nums[right];
        while (sum > goal) {
            sum = sum - nums[left];
            left++;
        }
        count = count + (right - left + 1);
    }

    return count;
}
}
