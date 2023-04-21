class Table {
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n",n,i,n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {}
        }
    }
}

public class TestSynchronization4 {
    public static void main(String t[]) {
        Thread t1 = new Thread(){
             public void run() {
                Table.printTable(5);
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                Table.printTable(10);
            }
        };
        Thread t3 = new Thread(){
            public void run() {
                Table.printTable(15);
            }
        };
        Thread t4 = new Thread(){
            public void run() {
                Table.printTable(20);
            }
        };
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

