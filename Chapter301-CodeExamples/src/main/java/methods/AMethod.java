package methods;


abstract class A{
    public abstract void display();
    public void greet(){
        System.out.println("hey am greet method");
    }
}
public class AMethod extends A {

    @Override
    public void display() {
        System.out.println("am display method..");
    }

    public static void main(String[] args) {

        A a = new AMethod();
        a.display();
        a.greet();


    }
}
