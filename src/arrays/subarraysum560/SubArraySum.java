package arrays.subarraysum560;

public class SubArraySum {

    public int sumEqualsK(int[] nums,int k)
    {
        int sum, count = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum = 0;
            for(int j = i;j<nums.length;j++)
            {
                sum = sum + nums[j];
                if(sum>k)
                    break;
                if(sum == k)
                    count++;
            }

        }

        return count;
    }


}
