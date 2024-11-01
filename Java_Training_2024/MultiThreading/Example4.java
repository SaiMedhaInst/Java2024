class ThreadJoin extends Thread {
    public ThreadJoin() {}

    public ThreadJoin(String name) {
        super(name);
    }

    public void run() {
      for (int task = 1; task <= 5; task++) {
        try {
          Thread.sleep(500);
          System.out.println("Thread " + Thread.currentThread()+ ", executing TASK - " + task);
        } catch (InterruptedException e) {
          System.out.println("The exception has been caught: " + e);
        }
      }
    }
  }

public class Example4 {
  public static void main(String[] args) {
    ThreadJoin t1 = new ThreadJoin();  
    ThreadJoin t2 = new ThreadJoin();  
    ThreadJoin t3 = new ThreadJoin();
       
    t1.setName("A");
    t2.setName("B");
    t3.setName("C");
    
    t1.setPriority(1);
    t3.setPriority(10);

    t1.start();    
    try {
      System.out.println("Current Thread: " + Thread.currentThread().getName() + " calling join method");    
      t1.join(1500);    
    } catch(Exception e) { System.out.println(e); }    
    
    t2.start();    
    t3.start(); 
  }
}
