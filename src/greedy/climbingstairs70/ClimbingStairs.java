package greedy.climbingstairs70;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClimbingStairs {

    public int climbStairs(int n) {
        if(n<=1) return 1;
        int prev1 = 1;
        int prev2 =1;
        for(int i = 2;i<n;i++)
        {
            int temp = prev1 + prev2;
            prev1 = prev2;
            prev2 = temp;
        }
        return prev2;
    }


    public int climbStairs2(int n) {
        List<Integer> dp = new ArrayList<>(Collections.nCopies(n+1,-1));
        int answer = helper(n,dp);
        return answer;
    }
    private int helper(int n , List<Integer> dp)
    {
        if(n<=1)return 1;
        if(dp.get(n)!=-1)
            return dp.get(n);

        int value = helper(n-1,dp)+helper(n-2,dp);
        dp.set(n,value);
        return value;
    }

}
