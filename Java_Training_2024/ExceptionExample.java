
public class ExceptionExample {

  public static void main(String[] args) {
		new Thread(() -> {
			for(int i=0; i<=10; i++) {
				if (i%2 == 0) {
					System.out.println("i = " + i);
				}
				try {
					Thread.sleep(1000);
				} catch(InterruptedException ex) {
					ex.printStackTrace();
				}
      }
		}).start();
		
		new Thread(() -> {
			for(int i=0; i<=10; i++) {
				if (i%2 == 1) {
					System.out.println("i = " + i);
				}
				try {
					Thread.sleep(1000);
				} catch(InterruptedException ex) {
					ex.printStackTrace();
				}
      }
		}).start();

  }
}
