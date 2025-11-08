package arrays.rearrangearrayelementbysign;

public class RearrangeBySign {

    public int[] rearrangeArray(int[] nums)
    {
        int size = nums.length;
        int sizePos = size/2;
        int sizeNeg = size/2;

        int[] positiveArray = new int[sizePos];
        int[] negativeArrray = new int[sizeNeg];
        int i=0,j=0;
        for(int num : nums)
        {
            if(num>0) {
                positiveArray[i] = num;
                i++;
            }
            else {
                negativeArrray[j] = num;
                j++;
            }
        }
        i =0;
        j=0;
        for(int k = 0 ;k<size;k++)
        {
            if(k%2==0) {
                nums[k] = positiveArray[i];
                i++;
            }
            else {
                nums[k] = negativeArrray[j];
                j++;
            }
        }
        return nums;
    }

    public int[] rearrangeArray2(int[] nums){
        int[] resultArray = new int[nums.length];
        int posInd = 0;
        int negInd = 1;

        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                resultArray[posInd] = nums[i];
                posInd+=2;
            }
            else {
                resultArray[negInd] = nums[i];
                negInd+=2;
            }
        }
        return resultArray;
    }



}
