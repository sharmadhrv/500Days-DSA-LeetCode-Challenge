package greedy.fabonaccinumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FaboonacciNumber faboonacciNumber = new FaboonacciNumber();
        int n = 5;
        List<Integer> dp = new ArrayList<>(Collections.nCopies(n+1,-1));
        System.out.println(faboonacciNumber.fabonacciNumber(n,dp));
        System.out.println(faboonacciNumber.fabonacciNumber(n));
    }
}
