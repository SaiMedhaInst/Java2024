class DemoThread extends Thread{

  public DemoThread(String name){
    super(name);
  }
  public void run(){  
    for(int i=0;i<5;i++){
      System.out.println(i +" "+ Thread.currentThread());  
      }
    } 
}


class TestSleepMethod extends Thread{    
  public void run(){    
   for(int i=1;i<5;i++){   
   // the thread will sleep for the 500 milli seconds   
     try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e);}    
     System.out.println(i);    
   }    
  }

}

class RThread implements Runnable{
  public void run(){
    System.out.println("inside run methoddd....");
  }
}
public class ThreadTest{
  public static void main(String[] args) {
    
    // DemoThread d = new DemoThread("TA");
    // DemoThread d2 = new DemoThread("TB");
    // d.start();
    // d2.start();

    // RThread r = new RThread();
    // Thread t = new Thread(r,"ECET");
    // t.start();
    // System.out.println(t.getName());

    // Thread t= new Thread("My first thread");  

    // t.start();  
     
    // String str = t.getName();  
    // System.out.println(str); 

    TestSleepMethod t1 = new TestSleepMethod();
    TestSleepMethod t2 = new TestSleepMethod();

    t1.start();
    t2.start();


  }
}