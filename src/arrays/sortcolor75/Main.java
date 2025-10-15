package arrays.sortcolor75;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SortColor sortColor = new SortColor();
        int[] arr = {2,0,2,1,1,0};
        //sortColor.quicksort(arr,0,arr.length-1);
       // System.out.println(Arrays.toString(arr));
        sortColor.dutchAlgo(arr);
        System.out.println(Arrays.toString(arr));

    }
}
