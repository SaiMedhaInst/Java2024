class Table {
    synchronized void printTable(int n) { //method not synchronized  
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, (n*i));
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
  }

public class Example6 {
    public static void main(String[] args) {
        final Table table = new Table(); //only one object  
        Thread t1 = new Thread(() -> {
          table.printTable(5);
        }); 

        Thread t2 = new Thread(() -> {
          table.printTable(10);
        }); 

        Thread t3 = new Thread(() -> {
            table.printTable(9);
          }); 

        t1.start();
        t3.start();
        t2.start();

      }
}
