package concurrency;

/**
 * WAH
 */
public class CounterVolatileWrong {


    public static void main(String[] args) {
        Counter count = new Counter();
        MyThread t1 = new MyThread(count);
        t1.setName("t1");
        MyThread t2 = new MyThread(count);
        t2.setName("t2");
        t1.start();
        t2.start();
    }


    static class Counter {
        private volatile int count;

        int getNext() {
            return ++count;
        }
    }

    static class MyThread extends Thread {

        private Counter counter;

        public MyThread(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 3; i++) {
                    // Code below helps to show data race
                    if (Thread.currentThread().getName().equals("t1"))
                        Thread.yield();
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + " i=" + counter.getNext());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



