import java.lang.Thread;  
import java.io.*;  
  

 class TestThreadTwice1 extends Thread{  
  public void run(){  
    for(int i=1;i<5;i++){  
      try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
      System.out.println(i);  
    }  
   }
}
public class TestSleepMethod2 {  
    public static void main(String argvs[]){  
        
    //   try {  
    //     for (int j = 0; j < 5; j++){
    //     Thread.sleep(-1000);  
    //     System.out.println(j);
    //     }
    // }
    // catch (Exception expn) { 
    // System.out.println(expn);  
    // }  


    TestThreadTwice1 t1 = new TestThreadTwice1();
    TestThreadTwice1 t2 = new TestThreadTwice1();
    t1.run();
    t2.run();
}  
}