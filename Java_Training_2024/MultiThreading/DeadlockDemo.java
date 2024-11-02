public class DeadlockDemo {

    private static final Object ResourceA = new Object();
    private static final Object ResourceB = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (ResourceA) {
                System.out.println("Thread 1: Holding Resource A...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for Resource B...");
                synchronized (ResourceB) {
                    System.out.println("Thread 1: Acquired Resource B!");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (ResourceB) {
                System.out.println("Thread 2: Holding Resource B...");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for Resource A...");
                synchronized (ResourceA) {
                    System.out.println("Thread 2: Acquired Resource A!");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}