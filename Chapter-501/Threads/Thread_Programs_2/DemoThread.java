class ThreadTest implements Runnable{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" ..."+ i);
        }
    }
}

public class DemoThread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        ThreadTest obj1 = new ThreadTest();
        ThreadTest obj2 = new ThreadTest();

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);
        // System.out.println(t1.getPriority() + " "+ t2.getPriority());
        // t1.start();
        // t2.start();
    }
}