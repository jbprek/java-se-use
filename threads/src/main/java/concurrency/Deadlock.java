package concurrency;

import java.text.Format;
import java.text.SimpleDateFormat;

/**
 * Created with IntelliJ IDEA.
 * User: prekezes
 * Date: 7/11/2013
 * Time: 1:43 μμ
 * To change this template use File | Settings | File Templates.
 */
public class Deadlock {
    // This is the main thread


    public static void main(String[] args) throws InterruptedException{
        log("Application Start!");
        CommonThread t = new CommonThread();
        t.start();
        t.set(5);

    }



    public static synchronized  void  log(String message){
        System.out.printf("%1$tM:%1$tS,%1$tL:MSL Thread: %2$s  : %3$", Thread.currentThread().getName(), message ) ;

    }




    public static final class CommonThread  extends Thread {
        int value;


        public synchronized int get() throws InterruptedException {
            Thread.sleep(5000);
            return this.value;
        }


        public synchronized void set(int v)  throws InterruptedException  {
            this.value = v;
        }

        public void run() {
            Deadlock.log("CommonThread running, will run for 20 secs!");
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            Deadlock.log("CommonThread done!");

        }

    }

    public static final class Competitor  extends Thread {
        int value;


        public synchronized int get() {
            return this.value;
        }


        public synchronized void set(int v) {
            this.value = v;
        }
    }


}
