### INTERFACE IN JAVA
- An interface in Java is a blueprint of a class. 
- It has static constants and abstract methods
- The interface in Java is a mechanism to achieve abstraction. 
- There can be only abstract methods in the Java interface, not method body. 
- It is used to achieve abstraction and multiple inheritance in Java.
- Java Interface also represents the IS-A relationship.
- It cannot be instantiated just like the abstract class.
- Since Java 8, we can have default and static methods in an interface.
- Since Java 9, we can have private methods in an interface.

#### Why use Java interface?
There are mainly three reasons to use interface. 
- It is used to achieve abstraction.
- By interface, we can support the functionality of multiple inheritance.
- It can be used to achieve loose coupling.

### Syntax:

- An interface is declared by using the interface keyword. 
- It provides total abstraction; means all the methods in an interface are declared with the empty body, and all the fields are public, static and final by default.
- A class that implements an interface must implement all the methods declared in the interface.
```java

interface <interface_name>{  
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
}  
```

**Note** 
> The Java compiler adds **public and abstrac**t keywords before the interface method. Moreover, it adds **public, static and final** keywords before data members.

![N|Solid](https://i.imgur.com/TO2rBKR.png)

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
- If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.

![N|Solid](https://i.imgur.com/g7wzruv.png)

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

//As you can see in the above example, Printable and Showable interface have same methods 
//but its implementation is provided by class TestTnterface1, so there is no ambiguity.
```

*multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class*


#### Interface inheritance
- A class implements an interface, but one interface extends another interface.

```java

interface Printable{  
    void print();  
}  
interface Showable extends Printable{  
    void show();  
}  
class TestInterface4 implements Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
    TestInterface4 obj = new TestInterface4();  
    obj.print();  
    obj.show();  
 }  
}
```

### Java 8 Default Method in Interface
Since Java 8, we can have method body in interface. But we need to make it default method
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
- Since Java 8, we can have static method in interface.

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

- An interface which has no member is known as a marker or tagged interface, 
- for example, Serializable, Cloneable, Remote, etc. 
- They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
```java
public interface Serializable{  
}  

```

## Java Nested Interface
- An interface, i.e., declared within another interface or class, is known as a nested interface. - The nested interfaces are used to group related interfaces so that they can be easy to maintain. T
- The nested interface must be referred to by the outer interface or class. It can't be accessed directly.
- The nested interface must be public if it is declared inside the interface, but it can have any access modifier if declared within the class.

### Syntax
```java

interface interface_name{  
 ...  
 interface nested_interface_name{  
  ...  
 }  
}  
class class_name{  
 ...  
 interface nested_interface_name{  
  ...  
 }  
}   
```
##### nested interface which is declared within the interface

```java
interface Showable{  
  void show();  
  interface Message{  
   void msg();  
  }  
}  
class TestNestedInterface1 implements Showable.Message{  
 public void msg(){System.out.println("Hello nested interface");}  
  
 public static void main(String args[]){  
  Showable.Message message=new TestNestedInterface1();//upcasting here  
  message.msg();  
 }  
}  
```

##### nested interface which is declared within the class.

```java
class A{  
  interface Message{  
   void msg();  
  }  
}  
  
class TestNestedInterface2 implements A.Message{  
 public void msg(){System.out.println("Hello nested interface");}  
  
 public static void main(String args[]){  
  A.Message message=new TestNestedInterface2();//upcasting here  
  message.msg();  
 }  
} 
```

### Try this?
Can we define a class inside the interface?