package arrays.maxconsecutiveones1004;

public class MaxConsecutiveOnes {

    public int longestOnes(int[] nums, int k) {

        int left = 0,right = 0;
        int maxLength = 0;
        int zerosCount = 0;
        for(right = 0;right<nums.length;right++)
        {
            if(nums[right] == 0)
                zerosCount++;
                while(zerosCount>k)
                {
                    if(nums[left]==0)
                        zerosCount--;
                    left++;
                }
                maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }

    public int longestOnes2(int[] nums, int k) {

        int left = 0, right = 0,length = 0, maxLength = 0;
        int zerosCount = 0;

        for(right = 0;right<nums.length;right++)
        {
            if(nums[right] == 0)
                zerosCount++;
            if(zerosCount>k)
            {
                if(nums[left]==0)
                    zerosCount--;
                left++;
            }
            if(zerosCount<=k)
            {
                length = right-left+1;
                maxLength = Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}
