package arrays.maximumsubarraysum;

public class Main {

    public static void main(String[] args) {

        MaximumSubarraySum  maximumSubarraySum = new MaximumSubarraySum();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maximumSubarraySum.maxSubArrayBruteForce(arr));
        System.out.println(maximumSubarraySum.maxSubArrayBetter(arr));
    }
}
