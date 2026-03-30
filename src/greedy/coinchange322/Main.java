package greedy.coinchange322;

public class Main {

    public static void main(String[] args) {

        CoinChange coinChange = new CoinChange();
        int[] coins = {186,419,83,408};
        System.out.println(coinChange.coinChange(coins,6249));
    }
}
