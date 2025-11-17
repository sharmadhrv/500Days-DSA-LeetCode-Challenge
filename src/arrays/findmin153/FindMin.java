package arrays.findmin153;

public class FindMin {
    public int findMin(int[] nums ){
        int pivot = findPivot(nums);
        int answer = pivot+1;
        return nums[answer];
        }


    private int findPivot(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (mid<high && nums[mid]> nums[mid+1])
                return mid;
            if(mid>low && nums[mid] < nums[mid-1])
                return mid-1;
            if (nums[mid] >= nums[low])
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }
}

