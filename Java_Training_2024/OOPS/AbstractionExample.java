package OOPS;

abstract class Animal {
    protected abstract void makeSound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    @Override
    protected void makeSound() {
        System.out.println("Meow!");
    }
}

abstract class StudentAbstract{ 
    String collegeName; 
    public StudentAbstract() {
        this.collegeName = "SVU";
        System.out.println("invoked Abstract class constructor..");
    }

    public abstract void doWork(); 

    public void doStudy() {
        System.out.println("Studing....");
    }
}


class CollegeStudent extends StudentAbstract {

    public CollegeStudent() {
        //super();
        System.out.println("invoked CollegeStudent constructor...");
    }

    @Override
    public void doWork() {
        System.out.println("do working....");
    }
    
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Animal myDog = new Dog();
        // myDog.makeSound(); 
        // myDog.eat();       
        
        // Animal myCat = new Cat();
        // myCat.makeSound();  
        // myCat.eat(); 

        CollegeStudent cs = new CollegeStudent();
    }
}
