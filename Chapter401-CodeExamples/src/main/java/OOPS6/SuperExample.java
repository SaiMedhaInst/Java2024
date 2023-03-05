package OOPS6;

class Animal{

    String name = "Animal";
    void eat(){System.out.println("eating...");}

    Animal(){
        System.out.println("Animal constructor invoked..");
    }
}
class Dog extends Animal{
    String name = "Dog";
    Dog(){
        super();//call parent class constructor
        System.out.println("Dog constructor invoked..");
    }
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat();
        eat();
        bark();
        System.out.println(name);
        System.out.println(super.name);
    }
}

public class SuperExample {
    public static void main(String args[]){
        Dog d=new Dog();
        d.work();
    }
}

