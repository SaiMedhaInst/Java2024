## Abstract Classes and Methods
- Data abstraction is the process of hiding certain details and showing only essential information to the user.
- The abstract keyword is a non-access modifier, used for classes and methods

 **Abstract class**: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

**Abstract method**: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

- An abstract class can have both abstract and regular methods.
- To achieve security - hide certain details and only show the important details of an object.

##### 2Ways to achieve Abstraction
There are two ways to achieve abstraction in java
- Abstract class (0 to 100%)
- Interface (100%)

### Abstract class 
- A class which is declared as abstract is known as an abstract class. 
- It can have abstract and non-abstract methods. 
- It needs to be extended and its method implemented. 
- It cannot be instantiated.
**Points to Remember**
- An abstract class must be declared with an abstract keyword.
- It can have abstract and non-abstract methods.
- It cannot be instantiated.
- It can have constructors and static methods also.
- It can have final methods which will force the subclass not to change the body of the method.
- An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.
- 
```java

abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

Animal myObj = new Animal(); // will generate an error
```

```java

 abstract class Bike{  
   Bike(){System.out.println("bike is created");}  
   abstract void run();  
   void changeGear(){System.out.println("gear changed");}  
 }  

 class Honda extends Bike{  
 void run(){System.out.println("running safely..");}  
 }  

 class TestAbstraction2{  
 public static void main(String args[]){  
  Bike obj = new Honda();  
  obj.run();  
  obj.changeGear();  
 }  
}
```

##### NOTE
- If there is an abstract method in a class, that class must be abstract.
- If you are extending an abstract class that has an abstract method, you must either provide the implementation of the method or make this class abstract.



-- __The abstract class can also be used to provide some implementation of the interface. In such case, the end user may not be forced to override all the methods of the interface.__

```java

interface A{  
void a();  
void b();  
void c();  
void d();  
}  
  
abstract class B implements A{  
public void c(){System.out.println("I am c");}  
}  
  
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
class Test5{  
public static void main(String args[]){  
A a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}}

```

####  ABSTRACT CLASS VS  INTERFACE.
- Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods.
- Abstract class and interface both can't be instantiated.

![N|Solid](https://i.imgur.com/roOFjUl.png)
    