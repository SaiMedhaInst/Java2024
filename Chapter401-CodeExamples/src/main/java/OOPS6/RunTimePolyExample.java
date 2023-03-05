package OOPS6;

class Animal6 { }
class Horse extends Animal6 {
    static void method(Animal6 a) {
        if(a instanceof Horse){
            Horse d=(Horse)a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }
}
public class RunTimePolyExample {
    public static void main (String [] args) {
        Animal6 a  = new Horse();
        Animal6 a1 = new Animal6();
        Horse dog3 = new Horse();

        // Dog3 dog32 = (Dog3)new Animal();

        System.out.println(a instanceof Animal6);
        System.out.println(a instanceof Horse);
        System.out.println(a1 instanceof Animal6);
        System.out.println(a1 instanceof Horse);
        System.out.println(dog3 instanceof Horse);
        System.out.println(dog3 instanceof Animal6);

        Horse.method(a);
    }
}
