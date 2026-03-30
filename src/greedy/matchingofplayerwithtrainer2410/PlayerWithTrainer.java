package greedy.matchingofplayerwithtrainer2410;

import java.util.Arrays;

public class PlayerWithTrainer {

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);
        Arrays.sort(trainers);

        int player = 0,trainer = 0;
        while(player<players.length && trainer < trainers.length)
        {
            if(players[player] <= trainers[trainer])
                player+=1;

            trainer++;
        }
        return player;
    }
}
