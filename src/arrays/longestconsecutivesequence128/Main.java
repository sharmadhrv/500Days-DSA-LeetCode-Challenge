package arrays.longestconsecutivesequence128;

public class Main {

    public static void main(String[] args) {

        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));
    }
}
