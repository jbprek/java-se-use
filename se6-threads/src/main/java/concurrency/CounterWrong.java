package concurrency;

/**
 * @author prekezes.
 */
public class CounterWrong {


    public static void main(String[] args) {
        Counter count = new Counter();
        MyThread t1 = new MyThread(count);
        t1.setName("t1");
        MyThread t2 = new MyThread(count);
        t2.setName("t2");
        t1.start();
        t2.start();
    }

}


class Counter {
    private int count;

    int getNext() {
        return ++count;
    }

}


class MyThread extends Thread {

    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            // Code below helps to show data race
            if (Thread.currentThread().getName().equals("t1"))
                Thread.yield();
            System.out.println(Thread.currentThread().getName() + " i=" + counter.getNext());
        }
    }
}
