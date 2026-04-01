package heap.merge2binarymaxheap;

public class MergeMaxHeap {

    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {

        int[] mergedArray = new int[n+m];
        for(int i = 0;i<n;i++)
            mergedArray[i] = a[i];
        for(int i = 0;i<m;i++)
            mergedArray[n+i] = b[i];

        for(int i = (mergedArray.length/2)-1;i>=0;i--)
            heapify(mergedArray,mergedArray.length,i);
        return mergedArray;
    }
    private void  heapify(int[] heap , int size,int i  ){
        int largest = i;
        int leftIndex = 2*i+1;
        int rightIndex = 2*i+2;

        if(leftIndex<size && heap[leftIndex] > heap[largest])
            largest = leftIndex;
        if(rightIndex<size && heap[rightIndex]> heap[largest])
            largest = rightIndex;

        if(largest!=i)
        {
            int temp = heap[largest];
            heap[largest] = heap[i];
            heap[i] = temp;
            heapify(heap,size,largest);
        }
    }
}
