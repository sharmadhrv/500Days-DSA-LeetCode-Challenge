package greedy.coinchange322;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        Arrays.sort(coins);
        int count=0;
        for(int i = coins.length-1;i>=0;i--)
        {
            while(coins[i]<=amount && (amount-coins[i]>=0))
            {
                amount = amount-coins[i];
                count++;
            }
        }
        if(amount==0)
            return count;
        return -1;
    }
}
