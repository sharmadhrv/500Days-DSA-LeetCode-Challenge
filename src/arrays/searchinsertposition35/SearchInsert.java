package arrays.searchinsertposition35;

public class SearchInsert {

    public int searchInsert(int[] nums,int target)
    {
        int low = 0;
        int high = nums.length - 1;
        int mid=0;
        int ans = mid;
        if(target<nums[0])
            return 0;
        while (low <= high) {
            mid = (low + high) / 2;


            if (nums[mid] > target) {
                high = mid - 1;
                ans = mid;
            }
            else
                low = mid + 1;
        }
        return ans;
    }

}
