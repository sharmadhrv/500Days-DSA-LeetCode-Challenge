package arrays.maxprofit121;

public class MaxProfit {

    public int maxProfit(int[] prices)
    {
        int profit =0;
        int size = prices.length;
        int min = prices[0];
        int maxProfit = 0;
        for(int i =1; i<size;i++)
        {
            profit = prices[i] - min;
            maxProfit = Math.max(maxProfit,profit);
            min = Math.min(min,prices[i]);
        }
        return maxProfit;
    }
    }

