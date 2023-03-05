package OOPS6;


class Vehicle{
    void run(){System.out.println("Vehicle is running");}
    static int add(int a , int b){return a+b+2;}
}

class Bike2 extends Vehicle{
    @Override
    void run(){System.out.println("Bike is running safely");}

    /*@Override
    static int add(int a, int b){return a+b-2;};*/
}
public class OverriddingExample {
    public static void main(String[] args) {
        Bike2 obj = new Bike2();
        obj.run();
        System.out.println(Bike2.add(10,20));
    }
}
