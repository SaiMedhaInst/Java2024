package MultiThreading;

class Multi extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }
}

public class MultiThreadTest {
        public static void main(String args[]) throws InterruptedException {
//            Multi t1=new Multi();
//            t1.start();

            Thread t= new Thread("My first thread");
            System.out.println(t.getState());
            // the start() method moves the thread to the active state
            t.start();
            System.out.println(t.getState());
            Thread.sleep(10);
            System.out.println(t.getState());
            // getting the thread name by invoking the getName() method
            String str = t.getName();
            System.out.println(str);

        }
}
