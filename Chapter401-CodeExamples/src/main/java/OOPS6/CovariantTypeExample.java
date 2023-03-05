package OOPS6;

class A{
    A get(){return this;}

    public static void main(String[] args) {
        System.out.println("a class main method");
    }
}

class B1 extends A{
    @Override
    B1 get(){return this;}
    void message(){System.out.println("welcome to covariant return type");}
   /* @Override
    public static void main(String[] args) {
        System.out.println("b class main method");
    }*/
}
public class CovariantTypeExample {
    public static void main(String[] args) {
            new B1().get().message();
    }
}
