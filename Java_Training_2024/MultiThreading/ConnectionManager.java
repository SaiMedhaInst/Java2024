
public class ConnectionManager {
    private static int activeConnections = 0;

    // Static synchronized method to safely increment the count
    public static synchronized void incrementConnections() {
        activeConnections++;
        System.out.println("Active connections: " + activeConnections);
    }

    public static void main(String[] args) {
        // Create multiple threads that increment the connection count
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                ConnectionManager.incrementConnections();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                ConnectionManager.incrementConnections();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final active connections: " + activeConnections);
    }
}