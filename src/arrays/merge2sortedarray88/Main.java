package arrays.merge2sortedarray88;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MergeSortedArray sortedArray = new MergeSortedArray();
        int[] nums1 =new int[8];
        int[] nums2 = {1,4,8,9};
        nums1[0] = 2;
        nums1[1] = 3;
        nums1[2] = 5;
        nums1[3] = 7;
        sortedArray.merge(nums1,4,nums2,4);
        System.out.println(Arrays.toString(nums1));





    }
}
