package arrays.binarysubarraywithsum930;

public class Main {

    public static void main(String[] args) {

        BinarySubArray binarySubArray = new BinarySubArray();
        int[] nums= {1,0,1,0,1};
        System.out.println(binarySubArray.numSubarraysWithSum(nums,2));
    }
}
