class A{
    
    final float pi;
    final static int studentCount = 10;
    A() {
        pi = 2.2f;
    }

  
    Exception processException() {
        System.out.println("processing Exception.class");
        return new Exception();
    }
}

class B extends A{
    @Override
    NullPointerException processException() {
        System.out.println("processing NullPointerException.class");
        return new NullPointerException();
    }
}

public class OOPExample {
    public static void main(String[] args) {
       A a = new B();
       a.processException();
    }
}
