package greedy.mincoinchange322;

public class Main {

    public static void main(String[] args) {

        MinCoinChange minCoinChange = new MinCoinChange();
        int [] coins = {1};
        System.out.println(minCoinChange.coinChange(coins,0));
    }
}
