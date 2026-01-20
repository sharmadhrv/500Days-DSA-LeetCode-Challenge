package Stack.arraystack;

public class ArrayStack {
    private int[] stack ;
    private int top ;
    private final int SIZE = 100;
    public ArrayStack() {
        top = -1;
        stack = new int[SIZE];
    }

    public void push(int x) {
        if(top == SIZE)
            throw new RuntimeException("Stack Over flow");
        stack[++top ] = x;
    }

    public int pop() {
        if(top == -1)
            throw new RuntimeException("Stack Underflow");
        return stack[top--];
    }

    public int top() {
        if(isEmpty())
            throw new RuntimeException("Stack is empty");
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
