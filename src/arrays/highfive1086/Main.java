package arrays.highfive1086;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        HighFive highFive = new HighFive();

        int[][] score = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};

        int[][] ans = highFive.highFive(score);

        for(int[] i : ans){
            System.out.println(Arrays.toString(i));
        }

    }
}
