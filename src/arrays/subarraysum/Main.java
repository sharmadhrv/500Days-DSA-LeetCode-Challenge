package arrays.subarraysum;

public class Main {

    public static void main(String[] args) {

        SubArraySum subArraySum = new SubArraySum();
        int[] nums = {1,1,1};
        int key =2;
        System.out.println(subArraySum.sumEqualsK(nums,key));
    }
}
