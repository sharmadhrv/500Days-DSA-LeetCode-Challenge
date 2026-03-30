package greedy.matchingofplayerwithtrainer2410;

public class Main {

    public static void main(String[] args) {

        PlayerWithTrainer player = new PlayerWithTrainer();
        int[] players = {4,7,9};
        int[] trainer = {8,2,8,5};
        System.out.println(player.matchPlayersAndTrainers(players,trainer));
    }
}
