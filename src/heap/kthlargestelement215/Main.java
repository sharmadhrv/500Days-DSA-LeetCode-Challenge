package heap.kthlargestelement215;

public class Main {

    public static void main(String[] args) {

        KthLargestElement kthLargestElement = new KthLargestElement();
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(kthLargestElement.findKthLargest(nums,4));
    }
}
