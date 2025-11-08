package arrays.nextpermutation;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        NextPermutation nextPermutation = new NextPermutation();
        int[] nums = {2,3,4,1};
        System.out.println(Arrays.toString(nums));
        nextPermutation.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
