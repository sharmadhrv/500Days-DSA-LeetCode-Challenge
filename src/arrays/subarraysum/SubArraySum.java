package arrays.subarraysum;

public class SubArraySum {

    public int sumEqualsK(int[] nums,int k)
    {
        int size = nums.length;
        int sum =0;
        int count =0;
            for (int i = 0; i < size; i++) {
                sum += nums[i];
                if (sum == k) {
                    count++;
                    sum = 0;
                }
            }

        return count;
    }


}
