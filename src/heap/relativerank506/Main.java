package heap.relativerank506;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        RelativeRank relativeRank = new RelativeRank();
        int[] score = {5,4,3,2,1};
        System.out.println(Arrays.toString(relativeRank.findRelativeRanks(score)));
    }
}
