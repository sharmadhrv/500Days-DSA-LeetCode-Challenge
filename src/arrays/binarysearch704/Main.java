package arrays.binarysearch704;

public class Main {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {3,5,8,15,19};
        //System.out.println(binarySearch.search(nums,2));
        //System.out.println(binarySearch.lowerBoundSearch(nums,2));
        System.out.println(binarySearch.upperBoundSearch(nums,9));
    }
}
