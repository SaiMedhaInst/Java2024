class SlaveThread extends Thread {
    public void run() {
        System.out.println("execution started by: " + Thread.currentThread().getName());
        for(int i=1; i<=5; i++) {
            System.out.println("Executing TASK-"+i + " by " + Thread.currentThread().getName());
            try {
                //Thread.sleep(1000, 999999);
                Thread.sleep(500);
            } catch(InterruptedException ex) {
                System.out.println("Handled Exception: " + ex.getMessage());
            }
        }
    }
}

public class Example3 {
    public static void main(String[] args) {
        SlaveThread st1 = new SlaveThread();
        st1.start();
        //st1.run();

        // System.out.println("current Executing Thread: " + Thread.currentThread().getName());
        // try {
        //     Thread.sleep(2000);
        // } catch(InterruptedException ex) {
        //     System.out.println("Exception Handled: " + ex.getMessage());
        // }

        SlaveThread st2 = new SlaveThread();
        st2.start();
        //st2.start(); // will raise IllegalThreadStateException

    }
}
