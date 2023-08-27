abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}


public class Simple extends Animal {

     public void animalSound() {
            System.out.println("animal sound method from Simple");
        }
    public static void main(String[] args) {
           Animal a = new Animal() {
            public void animalSound() {
            System.out.println("animal sound method");
        }
    };
    // a.animalSound();

    Simple s = new Simple();
    s.animalSound();
   

  
    }
    
}
