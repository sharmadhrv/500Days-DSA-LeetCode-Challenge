package arrays.sortcolor75;

public class SortColor {

    public void dutchAlgo(int[] nums)
    {
        int l=0,m=0,e=nums.length-1;

        while(m<=e)
        {
            if(nums[m]==0) {
                swap(nums, l, m);
                l++;
                m++;
            }
            else if(nums[m]==1)
            {
                m++;
            }
            else {
                swap(nums, m, e);
                m++;
                e--;
            }
        }
    }

    private void swap(int[] nums,int a ,int b)
    {
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

}
