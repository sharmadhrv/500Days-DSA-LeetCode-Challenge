package Stack.gameof2stacks;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(17);
        List<Integer> b = new ArrayList<>(26);
        int[] arr1 = {7 ,15 ,12 ,0 ,5, 18, 17, 2 ,10, 15, 4 ,2, 9 ,15 ,13 ,12 ,16};
        int[] arr2 = {12 ,16, 6, 8, 16, 15 ,18, 3, 11, 0 ,17, 7, 6, 11, 14, 13, 15, 6 ,18, 6, 16, 12, 16, 11, 16, 11};
        for(int i : arr1)
        {
            a.add(i);
        }
        for(int i : arr2)
            b.add(i);

        TwoStacksGame stacksGame = new TwoStacksGame();
        System.out.println(stacksGame.twoStacks(62,a,b));
    }
}
