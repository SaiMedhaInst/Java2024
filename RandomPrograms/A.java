import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import javax.xml.transform.stax.StAXResult;

class Demo{

    public Demo()
    {
        System.out.println("Demo constructor");
    }
     static { // first called 
        System.out.println("static block...");
     }
  
}


class B extends Demo{

    public B() {
        super();
        System.out.println("B class construtor");
    }
} 
public class A {

    public static void main(String[] args) {

        B b = new B();


    }
}