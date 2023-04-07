class TestCallRun2 extends Thread{  
    public void run(){  
     for(int i=1;i<5;i++){  
       try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
       System.out.println(i);  
     }  
    }  
    public static void main(String args[]){  
     TestCallRun2 t1=new TestCallRun2();  
     TestCallRun2 t2=new TestCallRun2();  
      
     t1.run();  
     t2.run();  
    }  
   }