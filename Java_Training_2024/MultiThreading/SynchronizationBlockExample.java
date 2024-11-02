class Counter {
    private int count = 0;

    public void increment() {
        synchronized(this) { 
            count++; 
        }
    }

    public int getCount() {
        synchronized(this) { 
            return count;
        }
    }
}

public class SynchronizationBlockExample {
        public static void main(String[] args) {
            Counter counter = new Counter();

            // Create two threads that increment the counter
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            });

            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            });

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Print the final count
            System.out.println("Final count: " + counter.getCount());
    }
}
