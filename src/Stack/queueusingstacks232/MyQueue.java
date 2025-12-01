package Stack.queueusingstacks232;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public MyQueue(){

    }

    public void push(int x)
    {
        stack1.push(x);
    }

    public int pop()
    {
      if(empty())
          return -1;
      shift();
      return stack2.pop();
    }

    public int peek()
    {
        if(empty())
            return -1;

        shift();
        return stack2.peek();
    }

    public boolean empty()
    {
        return stack2.isEmpty() && stack1.isEmpty();
    }

    private void shift()
    {
        if(stack2.isEmpty())
            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

}
