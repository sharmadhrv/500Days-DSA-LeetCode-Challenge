package heap.implementingheapusingarrays;

import java.util.Arrays;
import java.util.List;

public class HeapImplementation {

    private int[] heap;
    private  int size;
    private  int capacity ;

    public HeapImplementation(int capacity)
    {
        this.heap = new int[capacity+1];
        this.size = 0;
        this.capacity = capacity;
    }

    public void insertion( int value)
    {
        if(size == capacity)
        {
            System.out.println("heap is full");
            return;
        }
        int current = ++size;
        heap[current] = value;
        while(current >1)
        {
            int parent = current/2;
            if(heap[current]>heap[parent]) {
                swap(current, parent);
                current = parent;
            }
            else return;
        }
    }

    public void deletion()
    {
        if(size == 0)
        {
            System.out.println("heap is empty");
            return;
        }

        heap[1] = heap[size];
        size--;
        int i = 1;
        while(2*i<=size)
        {
            int leftIndex = 2*i;
            int rightIndex = 2*i+1;

            if(leftIndex<=size && heap[leftIndex]>heap[i])
            {
                swap(leftIndex,i);
                i = leftIndex;
            }
            if(rightIndex<=size && heap[rightIndex] > heap[i])
            {
                swap(rightIndex, i);
                i = rightIndex;
            }
            else return;
        }
    }

    public void heapify(int[] heap,int size, int i)
    {
        int largest = i;
        int leftIndex = 2*i;
        int rightIndex = 2*i+1;

        if(leftIndex<=size && heap[leftIndex] > heap[largest])
            largest = leftIndex;
        if(rightIndex<=size && heap[rightIndex]> heap[largest])
            largest = rightIndex;

        if(largest!=i)
        {
            int temp = heap[largest];
            heap[largest] = heap[i];
            heap[i] = temp;
            heapify(heap,size,largest);
        }
    }


    public void heapifyDown(int[] heap , int size , int i )
    {
        int smallest = i;
        int leftIndex = 2*i;
        int rightIndex = 2*i+1;

        if(leftIndex <= size && heap[leftIndex] < heap[smallest])
            smallest = leftIndex;
        if(rightIndex <=size && heap[rightIndex] < heap[smallest])
            smallest = rightIndex;
        if(smallest !=i){
            int temp = heap[smallest];
            heap[smallest] = heap[i];
            heap[i] = temp;
            heapifyDown(heap,size,smallest);
        }
    }

    public void heapSort(int[] heap,int size)
    {
        while(size>1)
        {
            swap(heap,1,size);
            size--;
            heapify(heap,size,1);
        }
    }


    private void swap(int a , int b)
    {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    private void swap(int[] heap, int a , int b)
    {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void printHeap()

    {
        if(size == 0) {
            System.out.println("heap is empty");
            return;
        }
        for(int i = 1;i<=size;i++)
            System.out.print(heap[i]+" ");
        System.out.println();
    }

}
