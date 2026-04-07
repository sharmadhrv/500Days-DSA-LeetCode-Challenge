package greedy.mincoinchange322;

import linkedList.insertgcd2807.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinCoinChange {

    public int coinChange(int[] coins, int amount) {

        int[][] dp = new int[coins.length][amount+1];
        for(int[] rows : dp)
            Arrays.fill(rows,-1);

        int answer = helper(coins.length-1,amount,dp,coins);
        if(answer == Integer.MAX_VALUE) return -1;
        return answer;
    }

    private int helper(int index, int target, int[][] dp , int[] coins)
    {
        if(index == 0)
        {
            if(target % coins[index] == 0)
                return target/coins[index];

            else return Integer.MAX_VALUE;
        }

        if(dp[index][target] !=-1)
            return dp[index][target];
        int notTake = helper(index-1,target,dp,coins);
        int take = Integer.MAX_VALUE;

        if (target >= coins[index]) {
            int res = helper(index,target-coins[index],dp,coins);
            if(res!=Integer.MAX_VALUE)
                take = 1+res;
        }
        return dp[index][target] = Math.min(take,notTake);
    }
}
