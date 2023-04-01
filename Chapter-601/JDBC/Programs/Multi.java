class Multi3 implements Runnable{  
    public void run(){  
        System.out.println("thread is running... using runnable interface..");  
    }  
      
    public static void main(String args[]){  
        Runnable m1=new Multi3();  
        Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
        t1.start();  
     }  
    }

// class Multi extends Thread{ 
    
//     public Multi(String name){
//         super(name);
//     }
//     public void run(){  

//     for(int i=0;i<5;i++){
//     System.out.println(Thread.currentThread().getName()+": thread is running..."+" "+ i);  
//     }  
// }
//     public static void main(String args[]){  
//     Multi t1=new Multi("T1");  
//     Multi t2=new Multi("T2");
//     Multi t3=new Multi("T3");

//     t1.start();  
//     t2.start();

//     t3.start();
//      }  
//     }