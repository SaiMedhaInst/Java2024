class Sender {
    public void SenderMsg(String msg) {
        System.out.println("\nSending a Message: " + msg);
        try {
            Thread.sleep(800);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}
 
class SenderWThreads extends Thread {
    private String msg;
    Sender sd;

    SenderWThreads(String m, Sender obj) {
        msg = m;
        sd = obj;
    }

    public void run() {
        synchronized(sd) { 
            sd.SenderMsg(msg);
        }
    }
}
  
public class ShynchronizedMultithreading {
    public static void main(String args[]) {
        Sender sender = new Sender();
        SenderWThreads sender1 = new SenderWThreads("Hi ", sender);
        SenderWThreads sender2 = new SenderWThreads("Welcome to Java Concepts", sender);

     
        sender1.start();
        sender2.start();

    
        try {
            sender1.join();
            sender2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }
  

  }
}

