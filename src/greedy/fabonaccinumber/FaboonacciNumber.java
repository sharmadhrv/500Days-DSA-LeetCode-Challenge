package greedy.fabonaccinumber;

import java.util.List;

public class FaboonacciNumber {
    public int fabonacciNumber(int n, List<Integer> dp) {
        if (n <= 1)
            return n;
        if (dp.get(n) != -1)
            return dp.get(n);
        int value = fabonacciNumber(n - 1, dp) + fabonacciNumber(n - 2, dp);
        dp.set(n, value);
        return value;
    }

    public int fabonacciNumber(int n) {
        int prev1 = 1;
        int prev2 = 0;
        if(n == 0)
            return prev2;
        if(n==1) return prev1;

        for(int i =2;i<=n;i++)
        {
            int temp = prev1+prev2;
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }
}
