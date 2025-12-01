package Stack.queueusingstacks232;

public class Main {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
        System.out.println(myQueue.peek());
        myQueue.push(23);
        myQueue.push(32);
        myQueue.push(45);
        myQueue.push(56);
        System.out.println(myQueue.peek());
        myQueue.push(67);
        myQueue.push(78);
        myQueue.push(89);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.empty());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());

    }
}
