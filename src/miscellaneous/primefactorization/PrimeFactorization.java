package miscellaneous.primefactorization;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
    public static void main(String[] args) {

        int[] queries = {15,20};
        List<List<Integer>> ans = primeFactors(queries);
        for(List<Integer> temp : ans)
            System.out.println(temp);
    }

    public static List<List<Integer>> primeFactors(int[] queries) {

        List<List<Integer>> answer = new ArrayList<>();
        for(int i :queries)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j =2;j<=Math.sqrt(i);j++)
            {
                if(i%j == 0)
                {

                    while(i%j == 0) {
                        temp.add(j);
                        i = i / j;
                    }
                }
            }
            if(i!=1)
                temp.add(i);
            answer.add(temp);
    }
        return answer;
}
}
