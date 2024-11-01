
class Task implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Daemon thread is running...");
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Example5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task());
        System.out.println(t1.isDaemon());

        t1.setDaemon(true); // Mark this thread as a daemon
        t1.start();

        // Main thread doing some work
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main thread is running, iteration " + i);
                Thread.sleep(500); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is done. Exiting the application.");
    } 
}
