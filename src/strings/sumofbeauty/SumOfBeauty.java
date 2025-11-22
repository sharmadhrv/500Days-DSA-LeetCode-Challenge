package strings.sumofbeauty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfBeauty {

    public int beautySum(String s) {
        int size = s.length();
        int totalSum = 0;
        for (int i = 0; i < size; i++) {

            int[] frequency = new int[26];
            for (int j = i; j < size; j++) {
                char ch = s.charAt(j);
                frequency[ch - 'a']++;

                 if ( j - i + 1 >= 3) {
                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;

                for (int f : frequency) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }
                totalSum += (maxFreq - minFreq);
            }
        }
    }
        return totalSum;
    }
}
