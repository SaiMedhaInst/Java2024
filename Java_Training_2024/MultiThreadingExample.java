class MyThread extends Thread {
		
    // Step 2: Override the run() method
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Is Executing Task: " + i);
        }
    }
}

class ThreadJoin extends Thread {
    public void run() {
      for (int task = 1; task <= 2; task++) {
        try {
          Thread.sleep(500);
          System.out.println("Thread " + Thread.currentThread().getName() + ", executing TASK - " + task);
        } catch (InterruptedException e) {
          System.out.println("The exception has been caught: " + e);
        }
      }
    }
  }


public class MultiThreadingExample {

    private static Object resource = new Object();
    public static void main(String[] args) throws InterruptedException {
        // Thread thread = new Thread(() -> {
        //     try {
        //         // Waiting state
        //         synchronized (resource) {
        //             System.out.println(Thread.currentThread() + " is going to WAIT state.");
        //             resource.wait(); // Thread enters Waiting state
        //         }
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // });									

        // System.out.println("State after creation: " + thread.getState()); // New

        // thread.start(); // Moves to Runnable state
        // System.out.println("State after start: " + thread.getState()); // Runnable
    

        // // Simulate waiting for the thread to become blocked or waiting
        // Thread.sleep(500);
        // System.out.println("State while waiting: " + thread.getState() + " " + thread.getName()); // Waiting or Blocked

        // synchronized (resource) {
        //     System.out.println(Thread.currentThread() + " is notifying");
        //     resource.notify(); // Notify the thread
        // }

        // thread.join(); // Wait for the thread to finish
        // System.out.println("State after completion: " + thread.getState()); // Terminated


        // MyThread cthread = new MyThread(); // 3. Create a new thread
        // cthread.start(); // Start the thread
        // cthread.start();

        ThreadJoin t1 = new ThreadJoin();  
        ThreadJoin t2 = new ThreadJoin();  
        ThreadJoin t3 = new ThreadJoin(); 
         
        t1.start();  
        try {  
              System.out.println("The current thread: "+ Thread.currentThread().getName());
              t1.join();  
        } catch(Exception e) {  
          e.printStackTrace(); 
        }  
     
        t2.start();
        try {  
              System.out.println("The current thread: " + Thread.currentThread().getName());  
              t2.join();  
          } catch(Exception e) { 
            e.printStackTrace();
          } 

        t3.start(); 
    }
}
