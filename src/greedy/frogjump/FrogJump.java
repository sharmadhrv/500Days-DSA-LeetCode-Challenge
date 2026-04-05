package greedy.frogjump;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrogJump {

    public int minCost(int[] height)
    {
        int n = height.length;
        List<Integer> dp = new ArrayList<>(Collections.nCopies(n+1,-1));
        int answer = helper(dp,height,height.length-1);
        return answer;
    }

    private int helper(List<Integer> dp, int[] height,int n)
    {
        if(n==0)
            return 0;
        if(dp.get(n)!=-1)
            return dp.get(n);
            int left = helper(dp, height, n - 1) + Math.abs(height[n] - height[n - 1]);
            int right = Integer.MAX_VALUE;
            if (n > 1)
                right = helper(dp, height, n - 2) + Math.abs(height[n] - height[n - 2]);

            int value = Math.min(left,right);
            dp.set(n,value);
            return value;
    }

    //tabulation
    public int minCost2(int[] height)
    {
        int n = height.length;
        List<Integer> dp = new ArrayList<>(Collections.nCopies(n,0));
        dp.set(0,0);

        for(int i = 1;i<n;i++) {
            int left = dp.get(i-1) + Math.abs(height[i]-height[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1)
                right = dp.get(i-2) + Math.abs(height[i]-height[i-2]);
            dp.set(i,Math.min(left,right));
        }
        return dp.get(n-1);
    }

    //space optimization

    public int minCost3(int[] height)
    {
        int n = height.length;
        int prev2 = 0,prev1 = 0;

        for(int i = 1;i<n;i++)
        {
            int left = prev1 + Math.abs(height[i]-height[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1)
                right = prev2 + Math.abs((height[i] - height[i-2]));
            int cur = Math.min(left,right);
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }
}
