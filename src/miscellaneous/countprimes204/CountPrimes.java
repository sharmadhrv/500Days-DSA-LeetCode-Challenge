package miscellaneous.countprimes204;

import java.util.Arrays;

public class CountPrimes {

    public static void main(String[] args) {
        System.out.println(countPrimes(50000));
    }
    public static int countPrimes(int n) {

        int[] blackBox = new int[n+1];
        Arrays.fill(blackBox, 1);
        for(int i=2;i*i<n;i++)
        {
            for(int j = i*i;j<n;j+=i)
                    blackBox[j] =0;
        }
        int count = 0;
        for(int i =2;i<n;i++)
        {
            if(blackBox[i] == 1) {
                count++;
            }
        }
        return count;
    }
}
