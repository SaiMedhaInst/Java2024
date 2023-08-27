## OOPS 

**The programming paradigm where everything is represented as an object is known as a truly object-oriented programming language.**

- The main aim of object-oriented programming is to implement real-world entities, 
- for example, object, classes, abstraction, inheritance, polymorphism, etc.
-  **Simula is considered the first object-oriented programming** language.
-   **Smalltalk is considered the first truly object-oriented programming language.**
-   The popular object-oriented languages are Java, C#, PHP, Python, C++, etc.

### WHY OOPs?
1.  OOP provides a clear modular structure for programs ,  makes it easy to maintain and modify existing code
2.  OOP provides a good framework for code libraries & projects 
3. Code Re-Usability 

### Class 
-   Class is a **user-defined data type which defines its properties and its functions.**
-   Class is the only logical representation of the data & Collection of objects is called class.
-   Class is considered as **blueprint of object** , it defines **specification of object.**
-   The class does not occupy any memory space **till the time an object is instantiated**.
-   To Declare a class in JAVA we use **class** keyword
-  A class in Java can contain:
	-   **Fields**/variables
	-   Methods
	-   Constructors
	-   Blocks
	-   Nested class and interface

🔥Always ClassNames should be **singular and Pascal Case.**

```java
class Student{
	String studentName;
	int studentRollNo;
	}
```

=> **allowed access modifiers**

- **public** : accessible any where in the project structure.
- **default**: accessible in same package

- **final** - : Can't be used for inheritance
- **abstract** - must contain abstract methods, object creation not possible
- **static** :  used to declared inner class/nested classes, shouldn't used for outer class declaration

=> ****not allowed**  access modifiers**
- **private** 
- **protected**


### Object
----------------------------------------------
-   **A real-world entity** such as a pen, chair, table, computer, watch, etc.
-   It is an instance of the class and  run-time entity.
-   An object can represent a person, place or any other item.
-   An object can operate on both **data members and member functions.**
- Objects will have **state and behavior.**
	- **state** is defined by data **members/variables/fields**
	- **behavior** is defined by **member functions / methods**
	- **Identity:** An object identity is typically implemented via a unique ID

-   Object is **created/instantiated using new operator with class-name**

```java
Student s = new Student(); // here s is refernce variable which stores address of a object.
new Student(); // anonymous object creation.
```



🔥 When an object is created using a new keyword, **then space is allocated for the variable in a heap**, and the **starting address is stored in the stack memory.**

🔥 3 Ways to initialize a object
	- **By reference variable**
	- **By method**
	- **By constructor**



-------------------------------

###  CONSTRUCTORS
- Used to construct some thing(object's data)
- It is a special method used to initialize objects.
- Constructor is **called automatically when a object is created or instantiated .**
- Every time an object is created using the new() keyword, at least one constructor is called.

🔴IMPORTANT❗🔴

By default **JVM will invoke default constructor**( which has empty body) when **class doesn't have any constructors declared.**



### How Constructors are Different From Methods in Java?
|  *Constructor* | *Methods* |
|--|--|
|  Same name has class Name | Will have different names |
|  No Return Type | Will have return type |
|  Called at Object creation | Can be called any no of times |
|  used to initialize object attributes | Used to perform specific task/job|
| **static,final,abstract is not allowed** | static,final, abstract is allowed|


🔥**allowed access modifiers**🔥
- private : object can't be created outside the class
- default
- protected
- public 

🔥**not allowed  access modifiers**🔥
- final 
- abstract
- static
- synchronized

```java
class Student{
    String name;
    private Student() {
        this.name = "Kumar";
    }

    static void objectCreation() {
        Student s = new Student();
        System.out.println(s.name);
    }
}

public class A {
    public static void main(String[] args) {
      Student.objectCreation();
       
    }
}
```


### Types of Constructors in Java

#### No-argument constructor
- A constructor that has no parameter is known as the No-argument or Zero argument constructor.

```java
class Student{
    String name;
    public Student() {
        this.name = "Kmar";
    }
}
```

#### Parameterized Constructor
- A constructor that **has parameters is known as parameterized constructor.**

```java
class Student{
    String name;
    Integer rollNo;
    public Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
```

#### Default Constructor
- A constructor that has **no parameters and no body is known as default the constructor.**
- A default constructor is invisible.
- if we write a constructor with **arguments or no arguments then the compiler does not create a default constructor**

```java
public class Student {
  java.lang.String name;
  java.lang.Integer rollNo;
  public Student();
}
```

#### CONSTRUCTOR OVERLOADING
-   Constructor overloading refers to the use of more than one constructor in an instance class.
-   Each overloaded constructor must have different signatures
```java
public class Student {
    String name;
    int rollNo;
 
    public Student() {
        System.out.println("no args");
    }
    public Student(String name) { // with 1 param
        this.name = name;
    }
    public Student(int rollNo, String name) { // with 2 params
        this.rollNo = rollNo;
        this.name = name;
    }
    public Student(String name, int rollNo) { // with 2 params 
        this.name = name;
        this.rollNo = rollNo;
    }
}
```

🔴IMPORTANT❗🔴

- In order to over load a methods, methods must different in signature 
	- either **no of parameters**
	- **type of parameters**
- Only changing **return type of method**, will not make it overloaded.



-------------------------


## INHERITANCE IN JAVA

- Inheritance in Java is a mechanism in **which one object acquires all the properties and behaviors of a parent object.**
- Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

#### Why Inheritance?

-   Code Reusability.
-   Method Overriding (so runtime polymorphism can be achieved).
-   Abstraction: 

#### Terms used in Inheritance
- **class** 
- **Sub Class/Child Class/Derived class**:
- **Super Class/Parent Class/Base class**:

- In the terminology of Java, **a class which is inherited is called a parent or superclass**, and the new class(**which is being inherited)** is called child or subclass.

**Syntax**
```java
class SubClassNName extends SuperClassName  
{  
   //methods and fields 
}
```

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

### TYPES OF INHERITANCE IN JAVA

![enter image description here](https://camo.githubusercontent.com/4516f79a02f602b903e8f01cf96ec2ee2504e2c2ec0caed997b308d4eb5ecf81/68747470733a2f2f70726570696e7374612e636f6d2f77702d636f6e74656e742f75706c6f6164732f323032302f31312f6a6176612d696e6865726974616e63652e77656270)

### SINGLE

-   When a class inherits another class, it is known as a single inheritance
-   Inherited class will have only one parent.

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
	}
}

```

### Multilevel Inheritance
-   In Multilevel Inheritance, a derived class will be inheriting a base class, **and as well as the derived class also acts as the base class for other classes**
-   When there is a chain of inheritance, it is known as multilevel inheritance
- We can have up to n levels of chaining.

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
	}
}
```


### HIERARCHICAL INHERITANCE

-   In Hierarchical Inheritance, **one class serves as a superclass (base class) for more than one subclass**
-   When two or more classes inherits a single class, it is known as hierarchical inheritance.

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
	}
}  

```


### Why multiple inheritance is not supported in java?

-   To reduce the complexity and simplify the language, multiple inheritance is not supported in java.
    
` Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.`
  - This will raise to ambiguity  problem also know as **diamond problem** 
-   Since compile-time errors are better than runtime errors, **Java renders compile-time error if you inherit 2 classes.**

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

🔴IMPORTANT❗🔴
- In Java a class cannot extends **two classes at a time in declaration .**
- But a class can **implement more than one interface at a time.**

**class -- extends -- class
class -- implements -- interface
interface -- extends -- interface** 

--------------------------------------------------------

### THIS

-   **this is used to access methods of the current class.**
-   this keyword is a reserved keyword in java i.e, we can’t use it as an identifier.
-   It is used to refer **current class’s instance as well as static members.**
-   It can be used in various contexts as given below:
    -   to **refer instance variable** of current class
    -   to **invoke or initiate current class constructor**
    -   can be passed as an **argument in the method call**
    -   can be passed as **argument in the constructor call**
    -   can be used to **return the current class instance**

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

```java

class Student{
    String name;
    public Student() {
        this.name = "Kumar";
    }

    public Student getInstance() {
        return this; // return current instance
    }
}

public class A {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = s.getInstance();     
    }
}
```


🔥GUESS THE OUTPUT🔥

```java

class Student{
    public String name;
    public static int studentCount; 
    public Student(String name) {
        this.name = name;
        this.studentCount++;
    }

    public static int studentCount() {
        return this.studentCount;
    }

}

public class A {
    public static void main(String[] args) {
        
        Student students[] = new Student[5];

        for(int i=0;i<5;i++) {
            students[i] = new Student("Student-"+i);
        }
       
        System.out.println(Student.studentCount());
    }
}
```

--------------------------------------

### SUPER

-   **super is a reserved keyword** in java i.e, we can’t use it as an identifier.
-   super is used to refer **super-class’s instance as well as static members.**
-   super is also used to invoke super-class’s method or constructor. 
-   The most common use of super keyword is that it eliminates the confusion between **the superclasses and subclasses that have methods with same name.**
-   super can be used in various contexts as given below:
    -   it can be used to refer immediate parent class
        -   **instance variable**
        -   **class method**
        -   **class constructor.**



----------------------


🔴IMPORTANT❗🔴

- Inheritance is a **IS-A relationship**
- Aggregation represents **HAS-A relationship**
- Composition represents a **part-of relationship.**



------------------------------

## Method Overloading in Java
- If a class has **multiple methods having same name but different in parameters**, it is known as Method Overloading.

-   Method overloading increases the readability of the program.
- There are two ways to overload the method in java
- Also know as **static/compile polymorphism**
	
	-   By changing number of arguments
	-   By changing the data type
	- By changing order of arguments in signature

```java
class Addition{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}  
static double add(double a, double b){return a+b;}  
}  
class Test{  
public static void main(String[] args){  
System.out.println(Addition.add(11,11));  
System.out.println(Addition.add(11,11,11));  
}} 

```


***In Java, Method Overloading is not possible by changing the return type of the method only due to ambiguity problem.*** 


```java

class Adder{  
static int add(int a,int b){return a+b;}  
static double add(int a,int b){return a+b;}  
}  
class TestOverloading3{  
public static void main(String[] args){  
System.out.println(Adder.add(11,11));//ambiguity  
}}  

//Compile Time Error: method add(int,int) is already defined in class Adder``` 
```

**Is it possible**

```java

class TestOverloading4{  
public static void main(String[] args){System.out.println("main with String[]");}  
public static void main(String args){System.out.println("main with String");}  
public static void main(){System.out.println("main without args");}  
} 

```

### Type Promotion
- During method overloading One type is promoted to another implicitly if no matching datatype is found

**One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.**


![enter image description here](https://camo.githubusercontent.com/cf9b25196c6fb492a219ad42674aa4431c7bb1f2173ddb881a11ae40c9b15ee1/68747470733a2f2f692e696d6775722e636f6d2f743735524732362e706e67)

**Examples | Guess output**

```java
class OverloadingCalculation1{  
  void sum(int a,long b){System.out.println(a+b);}  
  void sum(int a,int b,int c){System.out.println(a+b+c);}  
  
  public static void main(String args[]){  
  OverloadingCalculation1 obj=new OverloadingCalculation1();  
  obj.sum(20,20);
  obj.sum(20,20,20);  
  
  }  
}
```
```java
class OverloadingCalculation2{  
  void sum(int a,int b){System.out.println("int arg method invoked");}  
  void sum(long a,long b){System.out.println("long arg method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation2 obj=new OverloadingCalculation2();  
  obj.sum(20,20);
  }  
}
```


```java
class OverloadingCalculation3{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation3 obj=new OverloadingCalculation3();  
  obj.sum(20,20);
  }  
}
```



## Method  Overriding
- Method Overriding happens in Parent-SubClass relationship
- -   If **subclass (child class) has the same method as declared in the parent class,** it is known as method overriding in Java.
-   Have a ability that **subclass provides the specific implementation.**
- Also know as **Dynamic/Runtime  polymorphism**

#### Rules
-   The method ***must have the same name*** as in the parent class
-   The method **must have the same parameter** as in the parent class.
-   There must be an IS-A relationship (inheritance).
-   **Overridden methods always must have greater or equal scope access modifier**.(never assign weaker access modifier)
- Possible access modifiers combination 
	- public - public 
	- default - default 
	- protected - protected
	- default - protected 
	- default - public 
	- protected - public 

```java
class Bank{  
int getRateOfInterest(){return 0;}  
}  
 
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  

class Test2{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}
```

🔴**Try these** 🔴

-   Can we override static method?
-   Can we override java main method?


**Guess Output**
- **code-1** 
```java
class Car{
    static void displayName() {
        System.out.println("Car Name : X Model");
    }
}

class I20 extends Car{
    static void displayName() {
        System.out.println("Car Name : I20 Model");
    }
}

public class OOPExample {
    public static void main(String[] args) {
        I20 i20 = new I20();
        i20.displayName();
    }
}
```
- **code-2**
```java
abstract class Mobile{
    abstract String  process();
}

class Iphone extends Mobile{
    public String process() {
        return "processing 128bits of information";
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Mobile mobile = new Iphone();
        System.out.println(mobile.process());
    }
}
```
- **code-3**
```java
class Mobile{
    protected void displayRam() {
        System.out.println("Default Ram size: 6GB");
    }
    void displayProcessor() {
        System.out.println("Default Processor : A13 Bionic Chip");
    }
}

class Iphone12 extends Mobile{

    void displayRam() {
        System.out.println("Iphone 12 Ram Size : 4GB");
    }

    void displayProcessor() {
        System.out.println("Iphone 12 Processor A12 chip");
    }
}

public class OOPExample {
    public static void main(String[] args) {
        Mobile mobile = new Iphone12();
        mobile.displayRam();
    }
}
```

- **code-4**

```java
class A{
    
    Exception processException() {
        System.out.println("processing Exception.class");
        return new Exception();
    }
}

class B extends A{
    @Override
    NullPointerException processException() {
        System.out.println("processing NullPointerException.class");
        return new NullPointerException();
    }
}

public class OOPExample {
    public static void main(String[] args) {
       A a = new B();
       a.processException();
    }
}
```



## Super Keyword in Java

- The super keyword in **Java is a reference variable which is used to refer immediate parent class object.** 
 > Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

- **super() is added in each class constructor automatically by compiler if there is no super() or this().**

**usage**
-   super can be used to refer immediate parent class instance variable.
-   super can be used to invoke immediate parent class method.
-   super() can be used to invoke immediate parent class constructor.


**Guess the output**
```java
class Animal{  
	Animal(){
	System.out.println("animal is created");
	}  
}  
class Dog extends Animal{  
	Dog(){   
	System.out.println("dog is created");  
	}  
}  
class TestSuper3{  
	public static void main(String args[]){  
	Dog d=new Dog();  
	}
}
```


## Instance initializer block

- Instance Initializer block is used to initialize the instance data member. 
- It runs each time **when object of the class is created**

```java
class Bike{  
    int speed;       
    Bike(){System.out.println("constructor is invoked");}
      
	  { System.out.println("instance initializer block invoked"); }  
       
    public static void main(String args[]){  
    Bike b1=new Bike();  
    Bike b2=new Bike();  
    }      
}
```

🔥 The java compiler copies the code of instance initializer block in every constructor.

#### Rules
-   The instance initializer block is **created when instance of the class is created.**
-   The instance initializer block is **invoked after the parent class constructor is invoked** (i.e. after super() constructor call).
-   The instance initializer block comes in the order in which they appear.

```java
class A{  
	A(){  
		System.out.println("parent class constructor invoked");  
	}  
}  
  
class B3 extends A{  
	B3(){    
		System.out.println("child class constructor invoked");  
	}  
  
	B3(int a){  
		super();  
		System.out.println("child class constructor invoked "+a);  
	}  
  
	{System.out.println("instance initializer block is invoked");}  
  
	public static void main(String args[]){  
		B3 b1=new B3();  
		B3 b2=new B3(10);  
	}  
} 
```

-----------------------------------------------------
## Final Keyword 
- The final keyword in java is used to restrict the user.
- It is non access modifier 
The java final keyword can be used in many context. Final can be:
	-   variable : **makes constant , value cannot be changed.**
	-   method: **makes method to not override** 
	-   class: **makes class to not be inherited** 


**Final Variables** 
	-   static final variable
	-   instance final variable.

🔥  **static final variables** , declaration and initialization must happen in a single line or at a time.


🔥 **instance final variables**, declaration and initialization can be different lines
	- initialization will be in **class constructor.**
	



🔴 **Try these**🔴

-   Is final method can be inherited?
-   Can we initialize blank final variable?
-   Can we declare a constructor final?
-   Can we have static blank final variable?


------------------------------------------



## Abstraction

- Data abstraction is the process of **hiding certain details and showing only essential information to the user.**

🔴 abstract keyword is a non-access modifier, used for classes and methods

**Abstract class**: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
	- An abstract class can have both abstract and regular methods.
**Abstract method**: can only be used in an abstract class, and it does not have a body. 
	- The body is provided by the subclass (inherited from).

#### 2Ways to achieve Abstraction

There are two ways to achieve abstraction in java

-   Abstract class **(0 to 100%)**
-   Interface (**100%)** (till Java8 only)

### Abstract Class

-   A class which is declared with  abstract is known as an abstract class.
-   It needs to be extended and its method implemented.
-   It cannot be instantiated. 

**Points to Remember**
-   **It can have abstract and non-abstract methods.**
-   It can have abstract and non-abstract methods.
-   It cannot be instantiated.
-   It can **have constructors and static methods** also.
-   It can have final methods which will force the subclass not to change the body of the method.


```java
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

Animal myObj = new Animal(); // will generate an error
```

### Interfaces

-   An interface in Java **is a blueprint of a class.**  mechanism to achieve abstraction.
>  It has static constants and abstract methods (methods without body)
-   It is used to achieve multiple inheritance in Java.
-   Java Interface also represents the IS-A relationship.
**-   It cannot be instantiated just like the abstract class.**
-   Since Java 8, we can have **default and static methods i**n an interface.
-   Since Java 9, we can have **private methods** in an interface.

**Why use Java interface?**

There are mainly three reasons to use interface.

-   It is used to **achieve abstraction.**
-   By interface, we can support the functionality of multiple inheritance.
-   It can be used to **achieve loose coupling.**


**Syntax**
```java
interface <interface_name>{  
    // declare constant fields 
    // declare methods that abstract  
}
```

🔴 A class that implements an interface **must implement all the methods declared in the interface.**


🔴 The Java compiler adds 
	
- **public and abstract keywords**  adds before the interface methods..
 -  **public, static and final**  adds keywords before data members.

![enter image description here](https://camo.githubusercontent.com/5041bbbdac766c5dbaa3de3923209f6030a09c27f51a6a35cff4da189f999584/68747470733a2f2f692e696d6775722e636f6d2f544f3272424b522e706e67)


```java
interface Bank{  
	float rateOfInterest();  
}  
class SBI implements Bank{  
	public float rateOfInterest(){return 9.15f;}  
}  
class PNB implements Bank{  
	public float rateOfInterest(){return 9.7f;}  
}  
class TestInterface2{  
public static void main(String[] args){  
	Bank b=new SBI();  
	System.out.println("ROI: "+b.rateOfInterest());  
}}
```


### MULTIPLE INHERITANCE IN JAVA BY INTERFACE
If a **class implements multiple interfaces**, or an **interface extends multiple interfaces,** it is known as **multiple inheritance.**

![enter image description here](https://camo.githubusercontent.com/75c885a0a780976ed5fe0c7fe47adab8bd72a44d1dac55a1f1b27a5e133e078e/68747470733a2f2f692e696d6775722e636f6d2f6737777a7275762e706e67)
```java
interface Printable{  
	void print();  
}  
interface Showable{  
	void print();  
}  
  
class TestInterface3 implements Printable, Showable{  
	public void print(){System.out.println("Hello");}  
	public static void main(String args[]){  
	TestInterface3 obj = new TestInterface3();  
	obj.print();  
 }  
}
```

```java
interface GPI {
	default void show()
	{

		// Print statement
		System.out.println("Default GPI");
	}
}

interface PI1 extends GPI {
}

interface PI2 extends GPI {
}

class TestClass implements PI1, PI2 {

	public static void main(String args[])
	{
		TestClass d = new TestClass();
		d.show();
	}
}
```
---------------------------

### Java 8 Default Method in Interface

- Since Java 8, **we can have method body in interface. But we need to make it default method**

```java
interface Drawable{  
    void draw();  
    default void msg(){System.out.println("default method");}  
}  
class Rectangle implements Drawable{  
    public void draw(){System.out.println("drawing rectangle");}  
}  
class TestInterfaceDefault{  
    public static void main(String args[]){  
    Drawable d=new Rectangle();  
    d.draw();  
    d.msg();  
}}
```

### Java 8 Static Method in Interface
```java
interface Drawable{  
	void draw();  
	static int cube(int x){return x*x*x;}  
	}  
class Rectangle implements Drawable{  
	public void draw(){System.out.println("drawing rectangle");}  
}  
  
class TestInterfaceStatic{  
public static void main(String args[]){  
	Drawable d=new Rectangle();  
	d.draw();  
	System.out.println(Drawable.cube(3));  
}}
```

### marker or tagged interface

-   **An interface which has no member(variable/method)** is known as a marker or tagged interface,
-   for example, Serializable, Cloneable, Remote, etc.
-   They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
- JVM will provide methods based on requirement

```java
public interface Serializable{  
}
```
----------------

## Polymorphism in Java

- Polymorphism in Java is a concept by which we can perform **a single action in different ways.**
-   Polymorphism is derived from 2 Greek words: poly and morphs.
	-   "poly" means many
	- "morphs" means forms.

-   There are two types of polymorphism in Java:
    
    -   **compile-time polymorphism**
    -   **runtime polymorphism.**
    -   We can perform polymorphism in java by method overloading and method overriding.



#### Runtime Polymorphism in Java.

- Runtime polymorphism or Dynamic Method Dispatch is a **process in which a call to an overridden method is resolved at runtime rather than compile-time.**

- An overridden method is called through the reference variable of a superclass. The determination of the method to be called is based on the object **being referred to by the reference variable.**


**UpCasting**

- **If the reference variable of parent class refers to the object of child class**
- For up-casting, we can use the reference variable of **class type or an interface type**.

```java
class A{}  
class B extends A{}  

A a=new B();//upcasting 

interface I{}  
class A{}  
class B extends A implements I{}  

I i = new B()
```

```java
class Bike{  
  void run(){System.out.println("running");}  
}  
class Splendor extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new Splendor();//upcasting 
    b.run();  
  }  
}
```


**Guess the output**
```java
class Bike{  
 int speedlimit=90;  
}  
class Honda3 extends Bike{  
 int speedlimit=150;  
  
 public static void main(String args[]){  
  Bike obj=new Honda3();  
  System.out.println(obj.speedlimit);
}
```


```java
class Animal{  
	void eat(){System.out.println("eating");}  
}  
class Dog extends Animal{  
	void eat(){System.out.println("eating fruits");}  
}  
class BabyDog extends Dog{  
	void eat(){System.out.println("drinking milk");}  
	public static void main(String args[]){  
		Animal a1,a2,a3;  
		a1=new Animal();  
		a2=new Dog();  
		a3=new BabyDog();  
		a1.eat();  
		a2.eat();  
		a3.eat();  
}  
}
```
 
 🔥Runtime polymorphism can't be achieved by data members.
 
-------------------------------
## Binding

- Connecting a method call to the method body is known as binding.
- There are two types of binding
	-   Static Binding (also known as **Early Binding**). - type of **object is determined at compile time**
	-   Dynamic Binding (also known as *Late Binding*). - type of ***object is determined at run-time***


#### static binding

-   When type of the object is determined at compiled time(by the compiler), it is known as static binding.
-   If there is ***any private, final or static method in a class, there is static binding.***

```java
class Dog{  
 private void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Dog d1=new Dog();  
  d1.eat();  
 }  
} 
```

#### dynamic binding

-   When type of the object is determined at run-time, it is known as dynamic binding.

```java
class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog extends Animal{  
 void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal a=new Dog();  
  a.eat();  
 }  
}
```


**Guess Output**

```java
class Simple{  
 public static void main(String args[]){  
 Simple s=new Simple();  
 System.out.println(s instanceof Simple);
 }  
}
```

```java
class Animal{}  
class Dog extends Animal{//Dog inherits Animal 
  
 public static void main(String args[]){  
 Dog d=new Dog();  
 System.out.println(d instanceof Animal);
 }  
} 

class Dog2{  
 public static void main(String args[]){  
  Dog2 d=null;  
  System.out.println(d instanceof Dog2);
 }  
}
```



