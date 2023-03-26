import java.lang.*;

class ThreadNew extends Thread {
 
    ThreadNew(String tName, ThreadGroup tgrp) {
        super(tgrp, tName);
        start();
    }

    public void run() {

        for (int j = 0; j < 1000; j++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("The exception has been encountered " + e);
            }
        }
    }
}

public class ActiveCountExample {
  
    public static void main(String argvs[]) throws SecurityException, InterruptedException{
      
        ThreadGroup tg = new ThreadGroup("The parent group of threads");

        
        ThreadGroup tg1 = new ThreadGroup(tg,"the child group"); 


        ThreadNew th1 = new ThreadNew("first", tg);
        System.out.println("Starting the first");

        ThreadNew th2 = new ThreadNew("second", tg);
        System.out.println("Starting the second");

        ThreadNew th3 = new ThreadNew("third",tg1);
		System.out.println("Starting the third");

        System.out.println("The total number of active threads are: " + tg.activeCount());
        System.out.println("The total number of active thread groups are: " + tg.activeGroupCount()); 

        // th1.join();
        // th2.join();
        // th3.join();


        //destroy method 

        // // destroying the child thread group  
        // tg1.destroy();  
        // System.out.println(tg1.getName() + " is destroyed.");  
        
        // // destroying the parent thread group  
        // tg.destroy();  
        // System.out.println(tg.getName() + " is destroyed.");  


        //enumerate method

        // Thread[] grp = new Thread[tg.activeCount()];  
        // int cnt = tg.enumerate(grp);  
        // for (int j = 0; j < cnt; j++)   
        // {  
        // System.out.println("Thread " + grp[j].getName() + " is found.");  
        // }  

        //getMaxPriority

        // int priority = tg.getMaxPriority();  
        // System.out.println("The maximum priority of the parent ThreadGroup: " + priority);  

        //getParent()

        // System.out.println("The ParentThreadGroup for " + tg.getName() + " is " + tg.getParent().getName());  
        // System.out.println("The ParentThreadGroup for " + tg1.getName() + " is " + tg1.getParent().getName()); 


        //isDaemon() 
        th1.setDaemon(true);
        if (tg.isDaemon() == true)  
        {  
        System.out.println("The group is a daemon group.");  
        }  
        else  
        {  
        System.out.println("The group is not a daemon group.");  
        }  

    }
}