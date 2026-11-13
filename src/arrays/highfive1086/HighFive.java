package arrays.highfive1086;

import java.util.*;

public class HighFive {

    public int[][] highFive(int[][] score) {

        Map<Integer, List<Integer>> map = new HashMap<>();


        for(int i=0; i<score.length; i++)
        {
            map.computeIfAbsent(score[i][0],x->new ArrayList<>()).add(score[i][1]);
            }

        int[][] ans = new int[map.size()][2];
        int k = 0;
        for (int key : map.keySet()) {
            int sum = 0;
            List<Integer> temp = map.get(key);
            temp.sort(Collections.reverseOrder());

            for (int i = 0; i < 5; i++) {
                sum += temp.get(i);
            }
            ans[k++] = new int[]{key, sum / 5};
        }
        Arrays.sort(ans,Comparator.comparingInt(a->a[0]));
        return ans;
    }
}
