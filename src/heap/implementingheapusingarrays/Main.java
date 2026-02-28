package heap.implementingheapusingarrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HeapImplementation heapImplementation = new HeapImplementation(100);
//        heapImplementation.insertion(60);
//        heapImplementation.insertion(50);
//        heapImplementation.insertion(40);
//        heapImplementation.insertion(30);
//        heapImplementation.insertion(20);
//
//        heapImplementation.printHeap();
//
//        heapImplementation.insertion(55);
//        heapImplementation.printHeap();
//
//        heapImplementation.insertion(70);
//        heapImplementation.printHeap();
//
//        heapImplementation.insertion(43);
//        heapImplementation.printHeap();
//
//        heapImplementation.insertion(90);
//        heapImplementation.printHeap();
//
//        heapImplementation.deletion();
//        heapImplementation.printHeap();


        int[] arr = { -1,53,54,55,52,50};
        for(int i = arr.length/2;i>=1;i--)
            heapImplementation.heapify(arr,arr.length-1,i);

        System.out.println("After heapify:" +Arrays.toString(arr));

        heapImplementation.heapSort(arr,arr.length-1);
        System.out.println("after heap sort:"+Arrays.toString(arr));

        int[] arr2 = {-1,53,54,55,52,50};
        for(int i = arr.length/2;i>=1;i--)
            heapImplementation.heapifyDown(arr2,arr.length-1,i);

        System.out.println(Arrays.toString(arr2));

    }
}
