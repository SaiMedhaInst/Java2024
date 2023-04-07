class Table {
      synchronized void printTable(int n) { //method not synchronized  
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n",n,i,n*i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}



class TestSynchronization1 {
    public static void main(String args[]) {
        Table obj = new Table(); //only one object  
       Thread t1 = new Thread(){
        public void run(){
            obj.printTable(10);
        }
       };


       Thread t2 = new Thread(){
        public void run(){
            obj.printTable(50);
        }
       };

        t1.start();
        t2.start();
    }
}