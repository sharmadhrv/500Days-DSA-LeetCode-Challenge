package Stack.stackusingqueue225;

public class StackUsingQueue {

    private int[] q1;
    private int[] q2;
    private int front1,rear1,front2,rear2 ;
    private final int SIZE = 100;

    public StackUsingQueue() {
        q1 = new int[SIZE];
        q2 = new int[SIZE];
        front1 = 0;
        rear1 = -1;
        front2 = 0;
        rear2 = -1;
    }

    public void push(int x) {
            q2[++rear2] = x;
        while(!empty())
        {
            q2[++rear2] = q1[front1++];
        }
        int[] temp = q1;
        q1 = q2;
        q2 = temp;

        front1 = 0;
        rear1 = rear2;
        front2 = rear2 = -1;
    }

    public int pop() {
        if(empty())
            throw new RuntimeException("Stack is empty");
        return q1[front1++];
    }

    public int top() {
        if(empty())
            throw new RuntimeException("Stack underflow");
        return q1[front1];
    }

    public boolean empty() {
        return (front1 == -1 || rear1<front1);
    }
}
