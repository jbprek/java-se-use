package concurrency;

import java.util.Date;

/**
 * Demonstrates how a deadlock can be produced by using synchronized blocks;
 * User: prekezes
 * Date: 7/11/2013
 * Time: 2:36 μμ
 * To change this template use File | Settings | File Templates.
 */
public class SimplestDeadlock {

    public Object resourceA = new Object();
    public Object resourceB = new Object();


    public static synchronized  void  log(String message){
        System.out.printf("%1$tM:%1$tS,%1$tL: Thread: %2$s  : %3$s\n", new Date(), Thread.currentThread().getName(), message ) ;
    }

    public void read() throws InterruptedException{
        log("Aquiring lock B!");
        synchronized(resourceB) {
            log("Aquired lock B!");
            Thread.sleep(10000);
            log("Aquiring lock A!");
            synchronized (resourceA){
                log("Aquired lock A!");
                Thread.sleep(10000);
            }
        }
    }

    public void write() throws InterruptedException {
        log("Aquiring lock A!");
        synchronized(resourceA) {
            log("Aquired lock A!");
            Thread.sleep(10000);
            log("Aquiring lock B!");
            synchronized (resourceB){
                log("Aquired lock B!");
                Thread.sleep(10000);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SimplestDeadlock.log("Program start!");
        SimplestDeadlock d = new SimplestDeadlock();

        Thread t = new Worker(d);
        t.start();
        d.write();
    }


    static class Worker extends Thread {
        SimplestDeadlock deadlock;

        Worker( SimplestDeadlock deadlock) {
            super("Worker");
            this.deadlock = deadlock;
        }

        public void run() {
            try {
                deadlock.read();
            } catch (InterruptedException e) {
                SimplestDeadlock.log(e.getMessage());
            }
        }
    }
}
