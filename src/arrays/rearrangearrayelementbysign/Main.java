package arrays.rearrangearrayelementbysign;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        RearrangeBySign rearrangeBySign = new RearrangeBySign();
        int[]  nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeBySign.rearrangeArray(nums)));
        System.out.println(Arrays.toString(rearrangeBySign.rearrangeArray2(nums)));
    }
}
