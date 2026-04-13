package greedy.fractionalknapsack;

import greedy.fabonaccinumber.FaboonacciNumber;

public class Main {
    public static void main(String[] args) {

        FractionalKnapsack fractionalKnapsack = new FractionalKnapsack();

        int[] value = {100,60,100,200};
        int[] weight = {20,10,50,50};
        int capacity = 90;
        System.out.println(fractionalKnapsack.fractionalKnapsack(value,weight,capacity));
    }
}
