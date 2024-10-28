class MyThread extends Thread {
    public MyThread() {}
    
    public MyThread(String name) {
        super(name);
    }
    
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Is Executing Task: " + i);
        }
    }
}

class MasterThread extends Calculator implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i<=3; i++) {
            System.out.println(Thread.currentThread().getName() + " executing TASK-" + i);
        }
    }

}

public class Example2 {
    public static void main(String[] args) {
        // 1st way
        // MyThread mth1 = new MyThread("customT1"); // Thread()
        // mth1.start();

        // MyThread mth2 = new MyThread("customT2"); 
        // mth2.start();

        // 2nd way 
        MasterThread mt = new MasterThread();
        Thread masterThread = new Thread(mt);
        masterThread.start();

        System.out.println(mt.add(10, 20));
    }
}
