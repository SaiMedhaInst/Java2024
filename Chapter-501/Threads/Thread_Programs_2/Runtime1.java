class A extends Thread{
    public void run(){
        System.out.println("Am thread.....");
    }
}
public class Runtime1 {
    public static void main(String args[]) throws Exception {
        // Runtime.getRuntime().exec("notepad"); //will open a new notepad  
        // Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");    // will shutdown system
        //  System.out.println(Runtime.getRuntime().availableProcessors());  
        //  System.out.println(Runtime.getRuntime().totalMemory());
        //  System.out.println(Runtime.getRuntime().freeMemory());

        //  A o = new A();
        //  A o1 = new A();
        //  System.out.println("After object creation.....");
        //  System.out.println(Runtime.getRuntime().totalMemory());
        //  System.out.println(Runtime.getRuntime().freeMemory());

        A a = new A();
        a.start();
        a.start();

    }
}