## INHERITANCE IN JAVA

>Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
- It is an important part of OOPs (Object Oriented programming system).
- Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
#### Why Inheritance?
- Code Reusability.
- Method Overriding (so runtime polymorphism can be achieved).
- Abstraction: The concept of abstract where we do not have to provide all details is achieved through inheritance. Abstraction only shows the functionality to the user.


#### Terms used in Inheritance

- **Class**: 
    - A class is a group of objects which have common properties. 
    - It is a template or blueprint from which objects are created.
- **Sub Class/Child Class**: 
    - Subclass is a class which inherits the other class. 
    - It is also called a derived class, extended class, or child class.
- **Super Class/Parent Class**:
    - Superclass is the class from where a subclass inherits the features. 
    - It is also called a base class or a parent class.
- **Reusability**:
    - reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class. 
    
    - We can use the same fields and methods already defined in the previous class.

### syntax 

```java
class SubclassNName extends SuperclassName  
{  
   //methods and fields  
}  
```

- The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.

- In the terminology of Java, a class which is inherited is called a parent or superclass, and the new class is called child or subclass.

### Try this?
- Can we extend more than one class at the same time?


![N|Solid](https://static.javatpoint.com/images/core/inheritance.jpg)

```java

class Employee{  
 float salary=40000;  
}  
class Programmer extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  

```

```java
// base class
class Bicycle {
	// the Bicycle class has two fields
	public int gear;
	public int speed;

	// the Bicycle class has one constructor
	public Bicycle(int gear, int speed){	
	    this.gear = gear; 
	    this.speed = speed;
	}

	// the Bicycle class has three methods
	public void applyBrake(int decrement){
		speed -= decrement;
	}
	public void speedUp(int increment)	{
		speed += increment;
	}

	// toString() method to print info of Bicycle
	public String toString(){
		return ("No of gears are " + gear + "\n"
				+ "speed of bicycle is " + speed);
	}
}

// derived class
class MountainBike extends Bicycle {

	// the MountainBike subclass adds one more field
	public int seatHeight;

	// the MountainBike subclass has one constructor
	public MountainBike(int gear, int speed,int startHeight){
		// invoking base-class(Bicycle) constructor
		super(gear, speed);
		seatHeight = startHeight;
	}

	// overriding toString() method
	// of Bicycle to print more info
	@Override public String toString(){
		return (super.toString() + "\nseat height is "
				+ seatHeight);
	}
}

// driver class
public class Test {
	public static void main(String args[]){
		MountainBike mb = new MountainBike(3, 100, 25);
		System.out.println(mb.toString());
	}
}

```


### TYPES OF INHERITANCE IN JAVA

- On the basis of class, there can be three types of inheritance in java: 
    - single
    - multilevel
    - hierarchical.
- In java programming, multiple and hybrid inheritance is supported through interface only

![N|Solid](https://prepinsta.com/wp-content/uploads/2020/11/java-inheritance.webp)

### SINGLE 
- When a class inherits another class, it is known as a single inheritance
- Inherited class will have only one parent.

```java

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class TestInheritance{  
public static void main(String args[]){  
Dog d=new Dog();  
d.bark();  
d.eat();  
}}

```

### Multilevel Inheritance

- In Multilevel Inheritance, a derived class will be inheriting a base class, and as well as the derived class also acts as the base class for other classes
- When there is a chain of inheritance, it is known as multilevel inheritance. 
- As we can see in the example given below, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.

```java

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  
class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}

```

### HIERARCHICAL INHERITANCE
- In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass
- When two or more classes inherits a single class, it is known as hierarchical inheritance. 

```java

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class TestInheritance3{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();  
//c.bark();//C.T.Error  
}}  

```

### Why multiple inheritance is not supported in java?

- To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

- Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. 
If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

- Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. 

```java

class A{  
void msg(){System.out.println("Hello");}  
}  
class B{  
void msg(){System.out.println("Welcome");}  
}  
class C extends A,B{//suppose if it were  
 public static void main(String args[]){  
   C obj=new C();  
   obj.msg();//Now which msg() method would be invoked?  
}  
}  

```


### THIS
- In java, super keyword is used to access methods of the parent class 
- while this is used to access methods of the current class.
- this keyword is a reserved keyword in java i.e, we can’t use it as an identifier. 
- It is used to refer current class’s instance as well as static members.
- It can be used in various contexts as given below:
    - to refer instance variable of current class
    - to invoke or initiate current class constructor
    - can be passed as an argument in the method call
    - can be passed as argument in the constructor call
    - can be used to return the current class instance

**NOTE** 
    - we can't use this in static context
```java

class A {
    int a = 10;   // instance variable
    static int b = 20;  // static variable
    void fun(){
        this.a = 100;  // referring current class(i.e, class A)  ,instance variable(i.e, a)
        this.b = 600;  // referring current class(i.e, class A) static variable(i.e, b)
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args){
        new A().fun(); //anonymous object creation
    }
}
```

### SUPER 
- super is a reserved keyword in java i.e, we can’t use it as an identifier.
- super is used to refer super-class’s instance as well as static members.
- super is also used to invoke super-class’s method or constructor.
super keyword in java programming language refers to the superclass of the class where the super keyword is currently being used.
- The most common use of super keyword is that it eliminates the confusion between the superclasses and subclasses that have methods with same name.
- super can be used in various contexts as given below:
    - it can be used to refer immediate parent class 
        - instance variable
        - class method
        - class constructor.

### Aggregation in Java

- If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship
-  Aggregation represents the relationship where one object contains other objects as a part of its state.

```java

class Employee{  
int id;  
String name;  
Address address;//Address is a class  
...  
} 

```
-  Consider a situation, Employee object contains many informations such as id, name, emailId etc. It contains one more object named address, which contains its own informations such as city, state, country, zipcode etc.
-  We use Aggregation For Code Reusability.

```java

class Operation{  
 int square(int n){  
  return n*n;  
 }  
}
class Circle{  
 Operation op;//aggregation  
 double pi=3.14;  
    
 double area(int radius){  
   op=new Operation();  
   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).  
   return pi*rsquare;  
 }  

public static void main(String args[]){  
   Circle c=new Circle();  
   double result=c.area(5);  
   System.out.println(result);  
 }  
}  

```


### COMPOSITION IN JAVA
- The Composition is a way to design or implement the "has-a" relationship. 

![N|Solid](https://static.javatpoint.com/core/images/composition-in-java.png)

- The Composition represents a part-of relationship.
- We create a class College that contains variables, i.e., name and address. 
    - We also create a class University that has a reference to refer to the list of colleges. 
    - A University can have more than one collages. 
    - So, if a university is permanently closed, then all colleges within that particular university will be closed because colleges cannot exist without a university. 
    - The relationship between the university and colleges is Composition.

### Benefits of using Composition:
- Composition allows us to reuse the code.
- The Composition provides better test-ability of a class.
- Composition allows us to easily replace the composed class implementation with a better and improved version.
- Composition allows us to dynamically change our program's behavior by changing the member objects at run time.