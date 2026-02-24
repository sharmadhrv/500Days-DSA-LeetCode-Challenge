package arrays.subarraywithkdifferentinteger992;

public class Main {

    public static void main(String[] args) {

        SubArrayOfKInteger subArrayOfKInteger = new SubArrayOfKInteger();
        int[] nums = {1,2,1,3,4};
        System.out.println(subArrayOfKInteger.subarraysWithKDistinct(nums,3));
    }
}
