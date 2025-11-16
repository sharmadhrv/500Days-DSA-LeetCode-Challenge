package arrays.elementposition34;

public class ElementPosition {

    public int[] searchPosition(int[] nums,int target)
    {
        int[] ans = new int[2];
        int start = binarySearch(nums,target,true);
        int end = binarySearch(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    private int binarySearch(int[] nums,int target, boolean startIndex)
    {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        int ans=-1;
        while(low<=high)
        {
            mid = (low+high)/2;

            if(target>nums[mid])
                low = mid+1;
            else if(target <nums[mid])
                high = mid-1;
            else {
                 ans = mid;
                if(startIndex)
                {
                    high = mid-1;
                }

                else
                    low = mid+1;
            }
        }
        return ans;    }


}
