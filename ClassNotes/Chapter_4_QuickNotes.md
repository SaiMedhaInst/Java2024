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


***In Java, Method Overloading is not possible by changing the return type of the method only due to ambiguity problem. *** 


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


