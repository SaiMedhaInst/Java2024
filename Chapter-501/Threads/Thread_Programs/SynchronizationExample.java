public class SynchronizationExample {
  
    * int cnt = 0;

    synchronized static void update(){
        ++cnt;
    }

    public static void main(String[] args) {
        
        Thread t1 = new Thread(){
            public void run(){
                for(int i=0; i<10000;i++){
                    update();
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for(int i=0; i<10000;i++){
                    update();
                }
            }
        };

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch(Exception e){System.out.println("exception..... handled...");}
    
        System.out.println("count value is : "+ cnt);
    }
}
