package arrays.maxconsecutiveones1004;

public class Main {

    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(maxConsecutiveOnes.longestOnes2(nums,2));
    }
}
