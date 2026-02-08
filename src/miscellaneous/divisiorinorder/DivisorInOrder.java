package miscellaneous.divisiorinorder;

import java.util.Arrays;

public class DivisorInOrder {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisors(36)));
    }

    public static  int[] divisors(int n) {

        int[] small = new int[n];
        int[] large = new int[n];
        int s=0,l=0;

        for(int i =1;i*i<n;i++)
        {
            if(n%i == 0)
            {
                small[s++] = i;
                large[l++] = n/i;
            }
        }
        int[] ans = new int[s+l];
        int index = 0;

        for(int i = 0; i<s; i++)
            ans[index++] = small[i];

        for(int i = l-1;i>=0;i--)
            ans[index++] = large[i];

        return ans;
    }
}
