package arrays.majorityelement169;

public class MajorityElement {

    public int boyerMooreLaw(int[] nums) {
        int count = 0;
        int size = nums.length;
        int freq = size / 2;
        int candidate = nums[0];

        for(int i=0;i<size;i++)
        {
            if(count ==0)
                candidate = nums[i];

            if(candidate ==nums[i])
                count++;
            else
                count--;
        }

        if(count !=0)
        {
            count =0;
            for(int i=0;i<size;i++)
            {
                if(nums[i]== candidate)
                    count++;
            }
            if(count>freq)
                return candidate;
        }

        return -1;
    }
}
