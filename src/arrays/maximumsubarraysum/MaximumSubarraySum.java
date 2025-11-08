package arrays.maximumsubarraysum;

public class MaximumSubarraySum {

    public int maxSubArrayBruteForce(int[] nums)
    {
        int size = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0;i<size;i++)
        {
            sum = 0;
            for(int j=i;j<size;j++)
            {
                sum += nums[j];
                if(sum > maxSum)
                    maxSum = sum;

            }
        }
        return maxSum;
    }

    public int maxSubArrayBetter(int[] nums)
    {
        int size = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0,arrayStart = 0,arrayEnd = 0;
        for(int i =0;i<size;i++)
        {
            if(sum == 0)
                start = i;
            sum+=nums[i];
            if(sum > maxSum) {
                maxSum = sum;
                arrayEnd = i;
                arrayStart = start;
            }
            if(sum < 0)
                sum = 0;
        }
        for(int i = arrayStart;i<=arrayEnd;i++)
        System.out.print(nums[i]+" ");
        return maxSum;

    }

}
