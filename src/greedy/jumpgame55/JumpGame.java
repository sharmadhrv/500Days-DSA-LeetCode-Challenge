package greedy.jumpgame55;

public class JumpGame {

    public boolean canJump(int[] nums) {

        int maxIndex = 0;
        for(int i = 0;i<nums.length-1;i++)
        {
            if(i>maxIndex) return true;
            maxIndex = Math.max(maxIndex,i+nums[i]);
            if(maxIndex >= nums.length-1)
                return  true;
        }
        return maxIndex >= nums.length-1;
    }
}
