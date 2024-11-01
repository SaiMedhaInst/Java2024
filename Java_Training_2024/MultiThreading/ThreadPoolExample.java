import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    private int taskId;

    public MyTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running in thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(250); // Simulate work with a sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        //ExecutorService executor = Executors.newFixedThreadPool(5);
        
        // ExecutorService executor = Executors.newSingleThreadExecutor();

        ExecutorService executor = Executors.newCachedThreadPool();

        // Submit 10 tasks to the thread pool
        for (int i = 1; i <= 50; i++) {
            Runnable task = new MyTask(i);
            executor.submit(task);
        }

        // Shutdown the thread pool once all tasks are completed
        executor.shutdown();
    }
}
