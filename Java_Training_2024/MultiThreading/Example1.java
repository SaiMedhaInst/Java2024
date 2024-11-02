public class Example1 {
    public static void main(String[] args) {
        Runnable run = () -> System.out.println("Run Method Body...");

        Thread t1 = new Thread(run); //NEW | new Thread(Runnable target)
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());

        // regulary
        AdditionI cal = ( a, b) -> a * b; // lambda 
        System.out.println(cal.add(10, 20));

    
        Thread t2 = new Thread(() -> {
            System.out.println("starting the thread");
            for(int i=1; i<=5; i++) {
                System.out.println(Thread.currentThread().getName() + " executing TASK: " + i);
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException ex) {
                    System.out.println("Thread is interrupted...: " + ex.getMessage());
                }
            }
        }, "userThread"); // Thread(Runnable target, String name)
        t2.start();

    }
}