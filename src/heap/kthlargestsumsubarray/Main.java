package heap.kthlargestsumsubarray;

public class Main {

    public static void main(String[] args) {

        LargestSumSubarray largestSumSubarray = new LargestSumSubarray();
        int[] nums = {10,-10,20,-40};
        System.out.println(largestSumSubarray.kthLargestSumSubArray(nums,6));
    }
}
