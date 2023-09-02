class MyThread extends Thread {
   public void run() {
      for (int i = 0; i < 5; ++i) {
         Thread.yield(); // By calling this method, MyThread stop its execution and giving a chance to a main thread
         System.out.println("Thread started:" + Thread.currentThread().getName());
      }
      System.out.println("Thread ended:" + Thread.currentThread().getName());
   }
}
public class Example {
    public static void main(String[] args){

        MyThread thread = new MyThread();
        thread.start();

      
        
    }

}