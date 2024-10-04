package OOPS;

class Test {
    void display(int a, double b) {
        System.out.println("int, double");
    }

    void display(double a, int b) {
        System.out.println("double, int");
    }
    
    void sum(int a,long b){ 
        System.out.println("int long arg method invoked");
    }  

    void sum(long a,int b) {
        System.out.println("long int arg method invoked");
    }   
}


class Animal {
    public Number getAnimal() { // Method with return type of Animal
        return null;
    }
}

class Dog extends Animal {
    @Override
    public Integer getAnimal() { // Overriding method with return type of Dog (a subclass of Animal)
        return null;
    }
}


class SuperClass {
    static void staticMethod() {
        System.out.println("Static method in SuperClass");
    }
}

class SubClass extends SuperClass {
    static void staticMethod() {
        System.out.println("Static method in SubClass");
    }
}

public class PloymorphismExamples {
    public static void main(String[] args) {
        Test test = new Test();
        test.display(5, 10.5);   // Calls display(int, double)
        test.display(10.5, 5);   // Calls display(double, int)
        
        // test.display(5, 10);
        // test.sum(20,20);

        // SuperClass.staticMethod();
        // SubClass.staticMethod(); 

        SubClass obj = new SubClass();
        obj.staticMethod();
    }
}
