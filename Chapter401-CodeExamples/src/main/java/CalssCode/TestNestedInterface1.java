package CalssCode;

import java.util.Arrays;

interface Demo{
    public void display();
    class A{
        String name;
        A(){
            this.name = "kumar";
            System.out.println("A called...");
        }
        public void fun(){
            System.out.println("fun method...");
        }
    }
}

public class TestNestedInterface1 extends Demo.A {
    public static void main(String[] args) {
//        Demo.A a = new Demo.A();
//        System.out.println(a.name);
//        a.fun();
        int data =0;
        try  {
            data = 50;
            int res=data/0; //may throw exception if exception occurs, the remaining statement will not exceute

        }
        // handling the exception
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("data is: "+ data);
        System.out.println("Addition is:  "+ (data+data));
    }
}
