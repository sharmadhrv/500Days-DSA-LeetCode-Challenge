package heap.topkfrequentelement347;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        TopKFrequentElement topKFrequentElement = new TopKFrequentElement();
        int[] nums = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequentElement.topKFrequent(nums,2)));
    }
}
