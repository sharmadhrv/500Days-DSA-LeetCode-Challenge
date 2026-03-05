package arrays.medianofsortedarray4;

public class SortedArrayMedian {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median1=0,median2=0;
        if(nums1.length!=0) {
            if (nums1.length % 2 == 0) {
                median1 = (double) (nums1[(nums1.length ) / 2] + nums1[(nums1.length ) / 2 + 1]) / 2;

            } else
                median1 = nums1[(nums1.length ) / 2];
        }
        if(nums2.length!=0) {

            if (nums2.length % 2 == 0) {
                median2 = (double) (nums2[(nums2.length ) / 2] + nums2[(nums2.length ) / 2 + 1]) / 2;

            } else
                median2 = nums2[(nums2.length ) / 2];
        }
        return (median1 + median2)/2;
    }
}
