package arrays.binarysubarraywithsum930;

public class BinarySubArray {

    public int numSubarraysWithSum(int[] nums, int goal) {

        return helpingFunction(nums,goal)-helpingFunction(nums,goal-1);
    }

    private int helpingFunction(int[] nums,int goal)
    {
        if(goal<0) return 0;
        int left=0 ,right ,sum = 0,count =0;
        for(right = 0; right<nums.length;right++)
        {
            sum = sum + nums[right];
            while(sum>goal)
            {
                sum = sum - nums[left];
                left++;
            }
            count = count + (right-left+1);
        }
        return count;
    }


}
