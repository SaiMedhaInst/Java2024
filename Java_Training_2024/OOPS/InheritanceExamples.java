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


class Student {
    private static String college; 
    private String name;
    private String course;


    // instance block
    {
        System.out.println("am instance block..");
    }

    // static block
    static {
        // block 
        System.out.println("am static block..");
        college = "UCE OU";
    }

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public static String getCollege() {
        return college;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
    
}

class Parent {
    {
        System.out.println("Parent instance block...");
    }

    static {
        System.out.println("Parent static block...");
    }

    Parent() {
        System.out.println("Parent constructor....");
    }
}

class Child extends Parent {
    {
        System.out.println("Child instance block...");
    }

    static {
        System.out.println("Child static block...");
    }
    
    Child() {
        System.out.println("Child constructor... ");
    }
}
// Method Overriding , Method Hiding
class Super {
    public void hi() {
        System.out.println("hi from super class");
    }
    public static void greet(String name) {
        System.out.println("Hello Welcome: " + name + ", From SuperClass");
    }
}

class Sub extends Super {
    @Override
    public void hi() { // overriden method
        System.out.println("hi from sub class");
    }

    public static void greet(String name) { // method hiding
        System.out.println("Hello Welcome: " + name + ", From SubClass");
    }
}

class Person {
    private String name;
    private int age;
    private static int id;

    public Person() {
        this("Unknown", 0); // Calls the constructor with two parameters
        this.id = 1;
    }

    public Person(String name, int age) {
        this.name = name; // 'this.name' distinguishes the instance variable from the parameter
        this.age = age;   // 'this.age' distinguishes the instance variable from the parameter
    }

    public Person setName(String name) {
        this.name = name; // 'this.name' refers to the instance variable
        return this;      // Returns the current instance for method chaining
    }

    public Person setAge(int age) {
        this.age = age;   
        return this;     
    }

    public void printDetails(Printer printer) {
        printer.printPerson(this); // Passes the current instance to the Printer class
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

		
class Printer {
    public void printPerson(Person person) {
        System.out.println("Printing details from Printer:");
        System.out.println(person); // Uses the toString() method of Person class
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

        System.out.println("*******************");
        Student s = new Student("Kumar", "ECE");
        System.out.println(s.getCourse());
        System.out.println(s.getName());
        System.out.println(Student.getCollege());

        System.out.println("*********************");
        // Parent p = new Parent();
        Child c = new Child();

        System.out.println("***************************");
        Super su = new Sub(); // run time ploymorphsim
        su.hi();
        su.greet("lokesh"); // compile time 

        System.out.println("*******************");
        Person p1= new Person();
        Person p2 = new Person("surya", 23);
        System.out.println(p1);
        System.out.println(p2);

        Person p3 = p1.setName("Lokesh");
        System.out.println(p3);

        p2.printDetails(new Printer());

    }
}
