

public class MultiThreadingExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            int taskNumber = 0;
            while(true) {
                System.out.println("Executing... Task: " + ++taskNumber);
            }
        });
        t1.setDaemon(true);
        t1.start();
        System.out.println("current thread: " + Thread.currentThread());
    }   
}
