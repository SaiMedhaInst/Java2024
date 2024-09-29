package OOPS;


interface PaymentProcess {}
interface NFCPaymentPaymentProcess {}

class Mobile {} // parent-1

class AndriodFeature {} // parent-2


class MI extends Mobile implements PaymentProcess {}

class Iphone extends Mobile implements NFCPaymentPaymentProcess, PaymentProcess{}

class Samsung extends Mobile {}


interface CarelessPayment extends PaymentProcess, NFCPaymentPaymentProcess {}  // an interface can extends multiple other interface


class Animal {
	   
    protected String name;

    public Animal(String name) {  // param
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}


class Dog extends Animal { // Subclass (Child class)


    public Dog(String name) {
        super(name); // Call the superclass constructor
    }
   
    @Override
    public void makeSound() {  // Method overriding
        System.out.println(name + " barks.");
    }

    public void fetch() {  // Additional method specific to Dog
        System.out.println(name + " is fetching a ball.");
    }
}


class Cat extends Animal {

    public Cat(String name) {
        super(name); 
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }

    public void scratch() {     // Additional method specific to Cat
        System.out.println(name + " is scratching.");
    }
}


public class InheritanceExamples {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rover");
        Cat myCat = new Cat("Whiskers");

        // Call methods on Dog instance
        myDog.eat();        // Inherited from Animal
        myDog.sleep();      // Inherited from Animal
        myDog.makeSound();  // Overridden in Dog
        myDog.fetch();      // Specific to Dog

        // Call methods on Cat instance
        myCat.eat();        // Inherited from Animal
        myCat.sleep();      // Inherited from Animal
        myCat.makeSound();  // Overridden in Cat
        myCat.scratch();    // Specific to Cat

        // Demonstrate polymorphism
        Animal myAnimal;

        myAnimal = new Dog("Buddy"); // Parent class reference holding Subclass object.
        myAnimal.makeSound();  // Calls Dog's makeSound() method

        myAnimal = new Cat("Luna");
        myAnimal.makeSound();  // Calls Cat's makeSound() method
    }
}
