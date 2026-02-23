package arrays.intersectionof2array349;

import java.util.*;

public class IntersectionOfArray {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0, j = 0; i < nums2.length; i++, j++) {
            if (set.contains(nums2[i]))
                resultSet.add(nums2[i]);
        }
        int[] answer = new int[resultSet.size()];
        int i = 0;
        for (int element : resultSet) {
            answer[i++] = element;
        }
        return answer;
    }
}

