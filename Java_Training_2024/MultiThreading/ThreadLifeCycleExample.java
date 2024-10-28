public class ThreadLifeCycleExample {
	private static Object resource = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                // Waiting state
                synchronized (resource) {
                    System.out.println(Thread.currentThread() + " is going to WAIT state.");
                    resource.wait(); // Thread enters Waiting state
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });									

        System.out.println("State after creation: " + thread.getState()); // New
        thread.start(); // Moves to Runnable state
        System.out.println("State after start: " + thread.getState()); // Runnable
        
		// Simulate waiting for the thread to become blocked or waiting
        Thread.sleep(500);
        System.out.println("State while waiting: " + thread.getState()); // Waiting or Blocked

        synchronized (resource) {
            System.out.println(Thread.currentThread() + " is notifying");
            resource.notify(); // Notify the thread
        }

        thread.join(); // Wait for the thread to finish
        System.out.println("State after completion: " + thread.getState()); // Terminated
    }
}