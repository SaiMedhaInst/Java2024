package OOPS2;



interface Message{
    void msg();
    class A{
        public A(){
            System.out.println("object created");
        }
    }
}

abstract  class Bank{
    abstract float rateOfInterest();

    public static void display(){
        System.out.println("display methodd....");
    }
}

class SBI extends  Bank{

    @Override
     float rateOfInterest() {
        return 7.5f;
    }
}

class ICIC extends Bank{

    @Override
    float rateOfInterest() {
        return 8.5f;
    }
}
public class Test {
    public static void main(String[] args) {
        Bank b1 ,b2;
        b1 = new SBI();
        b2 = new ICIC();

        System.out.println(b1.rateOfInterest());
        b1.display();
        // reference variable of Type abstract holding object of type SBI
        Message.A a = new Message.A();

    }
}