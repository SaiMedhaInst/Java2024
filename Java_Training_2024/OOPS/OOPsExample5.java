package OOPS;

class HondaBike {  
    int speed;  
      
    HondaBike(){ 
        System.out.println("Bike Constructor invoked.");
        System.out.println("speed is "+speed);
    }     
   
    {
        System.out.println("instance initializer block invoked");
    } 

    {
        speed = 100; // instance block
        System.out.println("instance block: initialiazing speed");
    } 

    static {
        System.out.println("static block B invoked ");
    }

    static {
        System.out.println("static block A invoked ");
    }
 
   
      
}

public class OOPsExample5 {
    public static void main(String[] args) {
        HondaBike honda = new HondaBike();
        System.out.println(honda.speed);
    }
}
