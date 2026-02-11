package arrays.maxconsecutiveones1004;

public class MaxConsecutiveOnes {

    public int longestOnes(int[] nums, int k) {

        int length  = 0,maxLength = 0;
        for(int i = 0;i<nums.length;i++)
        {
            int numberOfZeros = k;
            length = 0;
            for(int j = i; j<nums.length;j++) {
                if (nums[j] == 1)
                    length++;
                else if (nums[j] == 0 && numberOfZeros >= 0) {
                    length++;
                    numberOfZeros--;
                } else if (nums[j] == 0 && numberOfZeros==0)break;


            }
            maxLength = Math.max(length,maxLength);
        }
return maxLength;
    }
}
