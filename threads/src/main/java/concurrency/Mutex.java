package concurrency;

public class Mutex {
    public static void main(String[] args) {
        final StackImpl stack = new StackImpl(20); // (6) Shared by the threads.
        new Thread("Pusher") { // (7) Thread no. 1
            public void run() {
                for (; ; ) {
                    try {
                        System.out.println("Pushed: " + stack.push(2008));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
        }.start();
        new Thread("Popper") { // (8) Thread no. 2
            public void run() {
                for (; ; ) {
                    try {
                        System.out.println("Popped: " + stack.pop());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
        }.start();
        System.out.println("Exit from main().");
    }
}

class StackImpl { // (1)
    private Object[] stackArray;
    private int topOfStack;

    public StackImpl(int capacity) {
        stackArray = new Object[capacity];
        topOfStack = -1;
    }

    public boolean push(Object element) throws InterruptedException { // (2a) non-synchronized
//public synchronized boolean push(Object element) { // (2b) synchronized
        if (isFull()) return false;
        ++topOfStack;
        Thread.sleep(1000);  // (3) Sleep a little.
        stackArray[topOfStack] = element;
        return true;
    }

    public Object pop() throws InterruptedException { // (4a) non-synchronized
//public synchronized Object pop() { // (4b) synchronized
        if (isEmpty()) return null;
        Object obj = stackArray[topOfStack];
        stackArray[topOfStack] = null;
        Thread.sleep(1000);  // (5) Sleep a little.
        topOfStack--;
        return obj;
    }

    public boolean isEmpty() {
        return topOfStack < 0;
    }

    public boolean isFull() {
        return topOfStack >= stackArray.length - 1;
    }
}
