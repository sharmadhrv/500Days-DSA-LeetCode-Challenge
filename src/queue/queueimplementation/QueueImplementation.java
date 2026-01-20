package queue.queueimplementation;

public class QueueImplementation {

    private int[] queue;
    private int front ;
    private int rear;

    public QueueImplementation(){
        queue = new int[100];
        rear = -1;
        front = 0;
    }

    public void enQueue(int x)
    {
        if(rear == -1)
        {
            queue[++rear] = x;
        }
        else{
            queue[++rear] = x;
    }
    }

    public int deQueue()
    {
        if(front == -1)
            throw new RuntimeException("queue underflow");
        int value = queue[front];
        front++;
        return value;
    }

    public boolean isEmpty()
    {
        return rear<front;
    }
}
