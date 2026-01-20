package Stack.minstack155;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack ;
    private Stack<Integer> minStack;
    private int top ;
   public MinStack()
    {
        stack = new Stack<>();
        minStack = new Stack<>();
        top = -1;
    }

    public void push(int x)
    {
        if(stack.isEmpty())
            throw new RuntimeException("Stack is underflow");
        stack.push(x);
        top++;
        if(minStack.isEmpty())
            minStack.push(x);
        else
            minStack.push(Math.min(x,minStack.get(top-1)));
    }

    public int pop()
    {
        if(stack.isEmpty())
            throw new RuntimeException("Stack is underflow");
        top--;
        minStack.pop();
        return stack.pop();
    }

    public int top()
    {
        if(stack.isEmpty())
            throw new RuntimeException("Stack is underflow");
       return stack.peek();
    }

    public int getMin()
    {
        if(minStack.isEmpty())
            throw new RuntimeException("Stack is underflow");
        return minStack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
