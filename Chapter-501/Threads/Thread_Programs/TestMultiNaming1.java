class ThreadName extends Thread{  
	ThreadName(String threadName){ 
		super(threadName);  
	}  
 
	public void run(){  
		System.out.println(" The thread is executing....");  
	}  
}  
class TestMultiNaming1 extends Thread{  
    public void run(){  

        System.out.println("current Thread is : "+Thread.currentThread().getName());
     System.out.println("running...");  
    }  
   public static void main(String args[]){  

    System.out.println(Thread.currentThread().getName());
    TestMultiNaming1 t1=new TestMultiNaming1();  
    TestMultiNaming1 t2=new TestMultiNaming1();  
    System.out.println("Name of t1:"+t1.getName());  
    System.out.println("Name of t2:"+t2.getName());
    
    ThreadName th3 = new ThreadName("SaiMedha ECET");  
	ThreadName th4 = new ThreadName("SaiMedha GATE");
     
    t1.start();  
    t2.start();  
    
    t1.setName("Sai Medha..");  
    System.out.println("After changing name of t1:"+t1.getName());  

    System.out.println(th3.getName());
    System.out.println(th4.getName());
   }  
  }