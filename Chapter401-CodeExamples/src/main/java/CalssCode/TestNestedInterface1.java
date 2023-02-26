package CalssCode;

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
        Demo.A a = new Demo.A();
        System.out.println(a.name);
        a.fun();
    }
}
