package pack1;


import pack2.*;
//import pack2.SimpleCalculator;
//import pack2.B;

public class Pack1Demo {
  public static void main(String[] args) {
    
   //same package class
    API a = new API();
    a.deleteMethod();

    //other package class
    SimpleCalculator sc = new SimpleCalculator();
    System.out.println(sc.add(10,20));

    B b = new B();
    b.display();


  }
  
}
